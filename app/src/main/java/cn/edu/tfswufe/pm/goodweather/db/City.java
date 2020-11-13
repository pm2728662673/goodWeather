package cn.edu.tfswufe.pm.goodweather.db;

import org.litepal.crud.DataSupport;

/**
 * 市对象类
 * @Author pangmin
 * @Date 2020/11/13 16:47
 **/
public class City extends DataSupport {

    //市id
    private int id;

    //市名
    private String cityName;

    //市代码
    private int cityCode;

    //所属省id
    private int provinceId;

    public City() {

    }

    public City(int id, String cityName, int cityCode, int provinceId) {
        this.id = id;
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.provinceId = provinceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", cityCode=" + cityCode +
                ", provinceId=" + provinceId +
                '}';
    }
}
