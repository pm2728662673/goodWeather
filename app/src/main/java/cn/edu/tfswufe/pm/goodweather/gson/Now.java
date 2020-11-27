package cn.edu.tfswufe.pm.goodweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @Author pangmin
 * @Date 2020/11/27 14:36
 **/
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
