package net.dfzj.jvm_test.class_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2020-09-03 11:01
 */
public class TestFile1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, List<Integer>> integralFlowMap = new LinkedHashMap<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            if(i % 2==0){
                list.add(i);
                integralFlowMap.put(1,list);
            }
        }
        System.out.println(integralFlowMap);
        for (int j = 0; j < 5; j++) {
            if(j % 2 !=0){
                list2.add(j);
                integralFlowMap.put(2,list2);
            }
        }
        System.out.println(integralFlowMap);
    }
}