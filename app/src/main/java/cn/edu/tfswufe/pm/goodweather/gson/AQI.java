package cn.edu.tfswufe.pm.goodweather.gson;

/**
 * @Author pangmin
 * @Date 2020/11/27 14:34
 **/
public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
