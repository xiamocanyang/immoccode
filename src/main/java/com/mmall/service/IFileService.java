package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by zrx on 2019/7/29.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
