package com.github.member.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MemberController {

    @RequestMapping("/member/getUserList")
    public List<Map<String,String>> getUserList(){
        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        map.put("张三","18");
        Map<String,String> map2 = new HashMap<>();
        map2.put("李四","20");
        list.add(map);
        list.add(map2);
        return list;
    }

}
