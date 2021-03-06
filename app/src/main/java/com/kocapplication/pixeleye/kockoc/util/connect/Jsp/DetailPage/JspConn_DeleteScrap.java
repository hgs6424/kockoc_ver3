package com.kocapplication.pixeleye.kockoc.util.connect.Jsp.DetailPage;

import com.kocapplication.pixeleye.kockoc.util.connect.BasicValue;
import com.kocapplication.pixeleye.kockoc.util.connect.JspConn;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pixeleye02 on 2016-10-05.
 */

public class JspConn_DeleteScrap extends JspConn {
    static public boolean deleteScrap(int boardNo) {   //read first = boardNo = -1
        String result = "";
        try {
            passiveMethod();
            HttpClient client = new DefaultHttpClient();
            String postURL = BasicValue.getInstance().getUrlHead() + "Scrap/DeleteScrap.jsp";
            HttpPost post = new HttpPost(postURL);
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("userNo", "" + BasicValue.getInstance().getUserNo()));
            params.add(new BasicNameValuePair("boardNo", "" + boardNo));
            UrlEncodedFormEntity ent = new UrlEncodedFormEntity(params, HTTP.UTF_8);
            post.setEntity(ent);
            HttpResponse response = client.execute(post);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), HTTP.UTF_8));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
