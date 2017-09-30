package com.hellozjf.test.u8eai.tools;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class EAITool {
    public static final String DEFAULT_URL = "http://192.168.3.165/u8eai/import.asp";
    
    // 以下字段的含义，详见《U8开发之EAI接口.docx》中EAI接口规范->数据交换格式->请求消息格式
    public static final String SENDER = "001";          // 发送者
    public static final String RECEIVER = "u8";         // 接收者
    public static final String PROC_ADD = "add";        // 处理——添加
    public static final String PROC_DEL = "delete";     // 处理——删除
    public static final String PROC_EDIT = "edit";      // 处理——编辑
    public static final String PROC_LIST = "query";     // 处理——查询所有
    public static final String CODEEXCHANGED = "N";     // 导入的代码未进行转码
    public static final String EXPORTNEEDEXCH = "N";    // 导出的代码不需要转码
    public static final String VERSION = "2.0";         // 版本
    
    public static String sendXML(String urlString, String xmlString) throws Exception {
        // 发送xml
        URL url = new URL(urlString);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setConnectTimeout(3000000);
        con.setReadTimeout(3000000);
        con.setDoInput(true);
        con.setDoOutput(true);
        con.setAllowUserInteraction(false);
        con.setUseCaches(false);
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
        // 发送Request消息
        OutputStream out = con.getOutputStream();
        DataOutputStream dos = new DataOutputStream(out);
        dos.write(xmlString.getBytes("utf-8"));

        // 获取Response消息
        InputStream in = con.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringBuilder sb = new StringBuilder();
        String s = null;
        while ((s = br.readLine()) != null) {
            sb.append(s);
        }
        String responseXml = sb.toString();
        return responseXml;
    }
}
