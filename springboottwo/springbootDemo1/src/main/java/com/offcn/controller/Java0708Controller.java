package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lijun
 * @date 2019/11/5 9:53
 */
@RestController
public class Java0708Controller {
    @RequestMapping("/hello")
    public Map sayHello(){
        Map map = new HashMap();
        map.put("0708java","我爱英语");
        return map;
    }
}
