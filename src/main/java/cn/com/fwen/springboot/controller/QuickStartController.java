package cn.com.fwen.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickStartController {

    @RequestMapping("/quick")
    public @ResponseBody String quick(){
        return "springboot 访问成功!";
    }
}
