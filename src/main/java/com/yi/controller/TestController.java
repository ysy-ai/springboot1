package com.yi.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yisy
 * @date 2020-03-12
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {
    private static final Log log = LogFactory.getLog(TestController.class);

    @RequestMapping(value = "/getJson" , method = RequestMethod.POST)
    @ResponseBody
    public Map getJson() {
        String response = "{\n" +
                "    \"age\": 18,\n" +
                "    \"courses\": [\n" +
                "        {\n" +
                "            \"math\": \"数学0\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"math\": \"数学1\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"math\": \"数学2\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"hobby\": [\n" +
                "        \"篮球\",\n" +
                "        \"足球\"\n" +
                "    ],\n" +
                "    \"name\": \"xxx\"\n" +
                "}";
        Map hsahmap = null;
        try {
            hsahmap = new HashMap();
            JSONObject responseObject = JSONObject.parseObject(response);
            String age = responseObject.getString("age");
            hsahmap.put("age",age);
            JSONArray list = responseObject.getJSONArray("courses");
            for (Object course : list) {
                Map map = (Map) course;
                String math = (String) map.get("math");
                hsahmap.put(math,math);
            }
            JSONArray hobby = responseObject.getJSONArray("hobby");
            for (int i = 0; i < hobby.size(); i++) {
                String h = (String) hobby.get(i);
                hsahmap.put("h",h);
            }
        }catch (Exception e) {
            log.info(e);
        }
        return hsahmap;
    }

}
