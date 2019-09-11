package com.yf.springexcel.service;

import com.yf.springexcel.utils.ExcelUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.ArrayList;

/**
 * @author yaofeng
 * @date 2019/9/11 11:17
 */
@Service
public class ExcelService {
    public File dealExecl(MultipartFile file) {
        ArrayList<ArrayList<Object>> arrayLists = ExcelUtil.readExcel2007(file);
        for (ArrayList<Object> o:arrayLists) {
            System.out.println(o);
        }
        return null;
    }
}
