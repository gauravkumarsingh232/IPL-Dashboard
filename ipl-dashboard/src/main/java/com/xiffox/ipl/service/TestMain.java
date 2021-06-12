package com.xiffox.ipl.service;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;
import java.util.Set;

@RestController
public class TestMain {

    RestTemplate restTemplate;

    @RequestMapping(value = "/Upload", method = RequestMethod.POST, consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public String upload(@RequestParam Map<String, Object> input, @RequestParam Map<String, MultipartFile> files){

        System.out.println("testing Upload: " + input);
        System.out.println("testing Upload: " + files);

        for(Map.Entry<String, MultipartFile> entry: files.entrySet()) {
            System.out.println(entry.getKey() + "=" +entry.getValue().getOriginalFilename());

        }

        restTemplate.getUriTemplateHandler();

        return "Ended";
    }
}
