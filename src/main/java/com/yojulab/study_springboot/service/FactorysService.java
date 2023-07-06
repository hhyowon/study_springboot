package com.yojulab.study_springboot.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yojulab.study_springboot.dao.SharedDao;

@Service
@Transactional
public class FactorysService {
    @Autowired
    SharedDao sharedDao;

    // 검색 (조건 : YEAR, CAR_NAME)
    public Object selectSearch(String search, String words) {
        // Object getOne(String sqlMapId, Object dataMap)
        String sqlMapId = "CarInfors.selectSearch";
        HashMap dataMap = new HashMap<>();
        dataMap.put("search", search);
        dataMap.put("words", words);

        Object result = sharedDao.getList(sqlMapId, dataMap);
        return result;
    }

    public Object insert(Map dataMap) {
        String sqlMapId = "factorys.insert";
        Object result = sharedDao.insert(sqlMapId, dataMap);
        return result;
    }

    public Object update(Map dataMap) {
        String sqlMapId = "factorys.update";
        Object result = sharedDao.update(sqlMapId, dataMap);
        return result;
    }

    public Object delete(String CAR_INFOR_ID) {
        String sqlMapId = "factorys.delete";
        HashMap dataMap = new HashMap<>();
        //dataMap.put("COMPANY_ID", COMPANY_ID);

        Object result = sharedDao.delete(sqlMapId, dataMap);
        return result;
    }
}
