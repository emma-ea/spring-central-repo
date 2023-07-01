package com.emma_ea.fileupload.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/upload")
public class UploadController {

    private final Map<String, Object> result = new HashMap<>();

    @PostMapping
    public Map<String, Object> upload(@RequestParam("attach")MultipartFile file) throws IOException {
        if (file == null || file.isEmpty()) {
            result.clear();
            result.put("error", "upload file not found");
            return result;
        }
        // file info
        System.out.printf("file name: %s \n", file.getOriginalFilename());
        System.out.printf("file type: %s \n", file.getContentType());

        // save to disk
        String filePath = System.getProperty("user.home");
        File uploadedFile = new File(filePath, file.getOriginalFilename());
        if (uploadedFile.exists()) {
            result.clear();
            result.put("error", "file already exists");
            return result;
        }
        file.transferTo(uploadedFile);
        result.clear();
        result.put("Success", "true");
        return result;
    }

}
