package com.offcn.controller;

import com.offcn.dao.UserDao;
import com.offcn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lijun
 * @date 2019/11/5 13:52
 */
@Controller
public class PageController {
    @Autowired
    private UserDao userDao;
    @Value("${page.rows}")
    private Integer rows;
    @RequestMapping("/page/user/list")
    public String showUserList(Model model){
        List<User> userList = userDao.findAll();
        model.addAttribute("userList",userList);
        return "user";
    }
    @RequestMapping("/page/rows")
    @ResponseBody
    public Map showRows(){
        Map map = new HashMap();
        map.put("rows",rows);
        return map;
    }
}
