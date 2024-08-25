package com.lotteinnovate.aurora_spring.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PegawaiMapper {
    Map<String, Object> getPegawaiById(int id);
    List<Map<String,Object>> getAllPegawai();
    void insertDataPegawai(Map<String, Object> data);
    void updateDataPegawai(Map<String, Object> data);
    void deleteDataPegawai(int id);
}
