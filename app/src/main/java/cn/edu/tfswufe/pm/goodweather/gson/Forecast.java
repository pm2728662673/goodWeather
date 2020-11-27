package cn.edu.tfswufe.pm.goodweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @Author pangmin
 * @Date 2020/11/27 14:40
 **/
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;
    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }
}
