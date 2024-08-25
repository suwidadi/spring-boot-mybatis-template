package com.lotteinnovate.aurora_spring.service;

import java.util.Map;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotteinnovate.aurora_spring.mapper.PegawaiMapper;

@Service
public class PegawaiService {

    @Autowired
    private PegawaiMapper pegawaiMapper;

    public Map<String, Object> getPegawaiById(int id){
        return pegawaiMapper.getPegawaiById(id);
    }

    public List<Map<String, Object>> getAllPegawai(){
        return pegawaiMapper.getAllPegawai();
    }

    public void createDataPegawai(Map<String, Object> data) {
        pegawaiMapper.insertDataPegawai(data);
    }

    public void updateDataPegawai(Map<String, Object> data) {
        pegawaiMapper.updateDataPegawai(data);
    }

    public void deleteDataPegawai(int id) {
        pegawaiMapper.deleteDataPegawai(id);
    }
}
