package cn.edu.tfswufe.pm.goodweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * http工具类
 * @Author pangmin
 * @Date 2020/11/13 17:37
 **/
public class HttpUtil {

    /**
     * 发起http请求
     * @param address 请求地址
     * @param callback 回调函数
     */
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
