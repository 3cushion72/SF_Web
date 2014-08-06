package kr.co.pmgk.core.common.service;

import org.springframework.web.multipart.MultipartFile;


public interface FileUploadService {
	public  void writeUploadedFile(MultipartFile file, String newName, String stordFilePath) throws Exception;
}
