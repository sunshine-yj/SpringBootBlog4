package me.kyj.springbootdeveloper.service;

import me.kyj.springbootdeveloper.dto.UploadResponse;

public interface FileStorageService {
    UploadResponse store(byte[] bytes, String filename);
}
