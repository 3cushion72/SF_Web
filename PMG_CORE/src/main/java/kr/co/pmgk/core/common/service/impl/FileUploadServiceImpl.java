package kr.co.pmgk.core.common.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import kr.co.pmgk.base.service.TServiceImpl;
import kr.co.pmgk.core.common.exception.CoreBizException;
import kr.co.pmgk.core.common.service.FileUploadService;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service("fileUploadService")
public class FileUploadServiceImpl extends TServiceImpl implements FileUploadService {

	public static final int BUFF_SIZE = 1024;

	/**
	 * 첨부파일을 서버에 저장한다.
	 * 
	 * @param file
	 * @param newName
	 * @param stordFilePath
	 * @throws Exception
	 */
	public void writeUploadedFile(MultipartFile file, String newName, String stordFilePath) throws Exception {
		InputStream inputStream = null;
		OutputStream ouputStream = null;
		String stordFilePathReal = (stordFilePath == null ? "" : stordFilePath).replaceAll("..", "");
		try {
			inputStream = file.getInputStream();
			File cFile = new File(stordFilePathReal);

			if (!cFile.isDirectory()) {
				boolean _flag = cFile.mkdir();
				if (!_flag) {
					throw new IOException("Directory creation Failed ");
				}
			}

			ouputStream = new FileOutputStream(stordFilePathReal + File.separator + newName);

			int bytesRead = 0;
			byte[] buffer = new byte[BUFF_SIZE];

			while ((bytesRead = inputStream.read(buffer, 0, BUFF_SIZE)) != -1) {
				ouputStream.write(buffer, 0, bytesRead);
			}
		} catch (FileNotFoundException fnfe) {
			throw new CoreBizException(messageSource, "ERROR.FILE.NOTFOUND", new String[]{file.getName()});
			//LOG.debug("fnfe:" + fnfe);// fnfe.printStackTrace();
		} catch (IOException ioe) {
			throw new CoreBizException("IOException");
			//LOG.debug("ioe:" + ioe);// ioe.printStackTrace();
		} catch (Exception e) {
			throw new CoreBizException("Exception");
			//LOG.debug("e:" + e);
			//e.printStackTrace();
		} finally {
			if (ouputStream != null) {
				try {
					ouputStream.close();
				} catch (Exception ignore) {
					//LOG.debug("IGNORED: " + ignore.getMessage());
				}
			}
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (Exception ignore) {
					//LOG.debug("IGNORED: " + ignore.getMessage());
				}
			}
		}
	}

}
