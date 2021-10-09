package com.guoliang.test.controller;

import com.alibaba.fastjson.JSON;
import net.sf.json.JSONObject;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Url {
    public static Object requestGetUrl(String url) throws Exception {
        InputStream is = null;
        String body = null;
        StringBuilder res = new StringBuilder();
        HttpGet get = new HttpGet(url);
        CloseableHttpClient client = HttpClients.createDefault();
        CloseableHttpResponse response = client.execute(get);
        RequestConfig config = RequestConfig.custom().setConnectTimeout(5000).build();
        get.setConfig(config);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            is = entity.getContent();
            //转换为字节输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(is, Consts.UTF_8));
            while ((body = br.readLine()) != null) {
                res.append(body);
            }
        }
        Object jsonMap = JSON.parse(res.toString());
        return jsonMap;
    }

    public static Object requestPostUrl(String url) throws Exception {
        InputStream is = null;
        String body = null;
        StringBuilder res = new StringBuilder();
        HttpPost post = new HttpPost(url);
        CloseableHttpClient client = HttpClients.createDefault();
        CloseableHttpResponse response = client.execute(post);
        RequestConfig config = RequestConfig.custom().setConnectTimeout(5000).build();
        post.setConfig(config);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            is = entity.getContent();
            //转换为字节输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(is, Consts.UTF_8));
            while ((body = br.readLine()) != null) {
                res.append(body);
            }
        }
        Object jsonMap = JSON.parse(res.toString());
        return jsonMap;
    }

    public static String get() throws IOException {
        //从配置文件中读取路径  可以写死     "http://。。。。。。。"
        String serverURL = "http://10.3.105.41:8081/bam-register/test";
        StringBuffer sbf = new StringBuffer();
        String strRead = null;
        URL url = new URL(serverURL);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("POST");//请求post方式
        connection.setDoInput(true);
        connection.setDoOutput(true);
        //header内的的参数在这里set。||connection.setRequestProperty("健, "值");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Authorization", "Bearer 59e0-9fcc-c3faea0e2a6c");
        connection.connect();
        OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream(),"UTF-8");
        //body参数在这里put到JSONObject中
        JSONObject parm = new JSONObject();
        parm.put("str1", "1");
        parm.put("str2", "2");
        writer.write(parm.toString());
        writer.flush();
        InputStream is = connection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        while ((strRead = reader.readLine()) != null) {
            sbf.append(strRead);
            //sbf.append("\r\n");
        }
        reader.close();
        connection.disconnect();
        return sbf.toString();
    }
}
