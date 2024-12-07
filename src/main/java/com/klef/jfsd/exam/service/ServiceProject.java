package com.klef.jfsd.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ServiceProject {

    private RestTemplate restTemplate;

    @Autowired
    public ServiceProject(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Object> getallstuds(){
        String url = "https://jsonplaceholder.typicode.com/posts";
        return Arrays.asList(restTemplate.getForObject(url, Object[].class));
    }

}
