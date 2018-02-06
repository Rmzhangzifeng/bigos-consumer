package com.baidu.controller;

import com.baidu.pojo.Edits;
import com.baidu.service.EditsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/edit")
public class EditsController {
    @Autowired
    private EditsService editsService;
    @RequestMapping("/queryedits")
    @ResponseBody
    public Object queryedits(){
        List<Edits> list=editsService.queryedits(0);
        return list;
    }
}
