package com.controller;

import com.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping(value="/1", produces = "application/xml;charset=UTF-8")
@RequestMapping(value="/1")
public class TestController {

    @Autowired(required = false)
    private TestDao testDao;

    @RequestMapping(value="/1/{method}", method = RequestMethod.GET)
    @ResponseBody
    public String op(@PathVariable(value = "method", required = false) String method) {
        int count = testDao.sysInfoCount();
        System.out.println("==================================");
        System.out.println(3333);
        return String.format("%s", count);
    }

}
