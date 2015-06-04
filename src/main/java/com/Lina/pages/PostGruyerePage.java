package com.Lina.pages;

import java.io.*;
import java.net.*;
import java.util.*;

import net.thucydides.core.pages.PageObject;

class PostGruyerePage extends PageObject{
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://webpentesting.com/message/send10.php");
        Map<String,Object> params = new LinkedHashMap<>();
        params.put("name", "Razvan");
        params.put("website", "gameofclones");
        params.put("skype", "georgel110");
        params.put("email","razvanratiu@yahoo.com");
        params.put("message", "Nu stiam ca e site-ul tau");
        params.put("checkboxes", "agree"); 
       

        StringBuilder postData = new StringBuilder();
        for (Map.Entry<String,Object> param : params.entrySet()) {
            if (postData.length() != 0) postData.append('&');
            postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
            postData.append('=');
            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
        }
        byte[] postDataBytes = postData.toString().getBytes("UTF-8");

        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
        conn.setDoOutput(true);
        conn.getOutputStream().write(postDataBytes);

        Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        for ( int c = in.read(); c != -1; c = in.read() )
            System.out.print((char)c);
    }
}