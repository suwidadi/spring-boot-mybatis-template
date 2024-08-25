package com.lotteinnovate.aurora_spring.controller;

import java.util.Map;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lotteinnovate.aurora_spring.service.PegawaiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
@RequestMapping("/")
public class PegawaiController {

    @Autowired
    private PegawaiService pegawaiService;

    @GetMapping
    public String showHomePage(){
        System.out.println("start index");
        return "index";
    }

    @GetMapping("/{id}")
    public Map<String, Object> getPegawaiById(@PathVariable int id){
        return pegawaiService.getPegawaiById(id);
    }

    @ResponseBody
    @RequestMapping("/api/data")
    public List<Map<String,Object>> getAllPegawai(){
        return pegawaiService.getAllPegawai();
    }
    
}
