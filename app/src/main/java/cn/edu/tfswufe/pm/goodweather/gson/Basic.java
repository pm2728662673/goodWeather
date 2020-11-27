package cn.edu.tfswufe.pm.goodweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @Author pangmin
 * @Date 2020/11/20 17:18
 **/
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
