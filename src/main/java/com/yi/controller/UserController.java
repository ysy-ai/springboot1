package com.yi.controller;

import com.yi.po.User;
import com.yi.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yisy
 * @date 2020-03-11
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    private static final Log log = LogFactory.getLog(UserController.class);
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/test")
    public @ResponseBody
    String test(){
        try {
            log.info(URLEncoder.encode("https://docs.qq.com/doc/DTkRzUWtJamNITUdj","utf-8"));
            log.info(URLDecoder.decode("https://docs.qq.com/doc/DTkRzUWtJamNITUdj","utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "测试成功！！！";
    }
    @RequestMapping(value = "/selectUserMessage")
    @ResponseBody
    public List<User> selectUserMessage(){
        List<User> list = null;
        try {
            list = userService.selectUserMessage();
            Map map = new HashMap(1);
            map.put("list",list);
            log.info(list);
        }catch (Exception e) {
            log.info(e);
        }
        return list;
    }
}
