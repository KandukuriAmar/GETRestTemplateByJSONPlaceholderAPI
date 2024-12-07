package com.klef.jfsd.exam.controller;

import com.klef.jfsd.exam.service.ServiceProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ControllerProject {

    @Autowired
    private ServiceProject sp;

    @GetMapping("/")
    @ResponseBody
    public String land(){
        return "hello";
    }

    @GetMapping("/getallstudents")
    @ResponseBody
    public List<Object> getStuds(){
        return List.of(sp.getallstuds());
    }

}
