package com.yunji.oms.admin.exception;


import java.io.File;
import java.io.IOException;
import java.util.List;

import commons.io.IOService;
import commons.io.IOServiceImpl;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

public class TestIOService {

    @Test
    public void test() throws IOException {
        IOService ioService = new IOServiceImpl();
        ioService.simpleRWString();
    }

//    @Test
//    public void test() throws IOException {
//        List<String> list = FileUtils.readLines(new File("d://baimingdan.txt"));
//        for (String sku : list) {
//            System.out.println("ZADD oms:sku_is_not_split_order 100 \"\\\"" + sku.trim() + "\\\"\"");
//        }
//    }
//
//    @Test
//    public void test1() throws IOException {
//        List<String> list = FileUtils.readLines(new File("d://自动拆单白名单删除.txt"));
//        for (String sku : list) {
//            System.out.println("ZREM oms:sku_is_not_split_order  \"\\\"" + sku.trim() + "\\\"\"");
//        }
//    }
}
