package com.lotteinnovate.aurora_spring.controller;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lotteinnovate.aurora_spring.service.PegawaiService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


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

    @ResponseBody
    @PostMapping("/api/data")
    public Map<String, String> createData(@RequestBody Map<String, Object> requestData) {
        pegawaiService.createDataPegawai(requestData);
        Map<String, String> response = new HashMap<>();
        response.put("message","Data created Successfully!");
        return response;
    }

    @ResponseBody
    @PutMapping("/api/data/{id}")
    public Map<String, String> updateData(@PathVariable("id") int id, @RequestBody Map<String, Object> requestData){
        requestData.put("id",id);
        pegawaiService.updateDataPegawai(requestData);
        Map<String, String> response = new HashMap<>();
        response.put("message","Data Update successfully!");
        return response;
    }

    @ResponseBody
    @DeleteMapping("/api/data/{id}")
    public Map<String, String> deleteData(@PathVariable("id") int id){
        pegawaiService.deleteDataPegawai(id);
        Map<String, String> response = new HashMap<>();
        response.put("message","Data deleted successfully!");
        return response;
    }
    
}
