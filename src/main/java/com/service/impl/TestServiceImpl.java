package com.service.impl;

import com.dao.TestDao;
import com.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; // 事务

import java.util.List;
import java.util.Map;

@Service("TestServiceImpl")
public class TestServiceImpl implements TestService {

    @Autowired(required = false)
    private TestDao testDao;

    public TestServiceImpl() {
        System.out.println("TestServiceImpl init ...");
    }

    @Override
    public void test() {
        testDao.sysInfo();
        int count = testDao.sysInfoCount();
        testDao.bas_doctor();
        List<Map<String, Object>> list =  testDao.bas_doctor2();

        for (Map<String, Object> m: list) {
//            System.out.println(m);
        }

        System.out.println(count);
    }
}
