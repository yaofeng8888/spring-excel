package com.yf.springexcel.controller;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.yf.springexcel.service.ExcelService;
import com.yf.springexcel.utils.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.ArrayList;
import java.util.UUID;

/**
 * @author yaofeng
 * @date 2019/9/11 9:48
 */
@Controller
public class ExcelController {


    @Autowired
    private ExcelService excelService;

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("getExcel")
    public void getExcel(MultipartFile file)throws Exception{
//        // 获取文件名
//        String fileName = file.getOriginalFilename();
//        // 获取文件后缀
//        String prefix=fileName.substring(fileName.lastIndexOf("."));
//        // 用uuid作为文件名，防止生成的临时文件重复
//        final File excelFile = File.createTempFile(UUID.randomUUID().toString(), prefix);
//        // MultipartFile to File
//        file.transferTo(excelFile);
        //你的业务逻辑
        File newFile = excelService.dealExecl(file);
        //程序结束时，删除临时文件
//        deleteFile(excelFile);
    }

    private void deleteFile(File...files){
        for (File file : files) {
            if (file.exists()) {
                file.delete();
            }
        }
    }
}
