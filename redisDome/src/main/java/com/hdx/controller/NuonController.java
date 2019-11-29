package com.hdx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("nuon")
public class NuonController {

    @RequestMapping("/addNuon")
    @ResponseBody
    public String addNuon(HttpServletRequest request, HttpServletResponse response){


        return null;
    }

}
