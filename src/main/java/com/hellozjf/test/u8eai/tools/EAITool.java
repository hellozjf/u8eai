package com.hellozjf.test.u8eai.tools;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class EAITool {
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
