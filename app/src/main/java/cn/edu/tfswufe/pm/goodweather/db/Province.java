package cn.edu.tfswufe.pm.goodweather.db;

import org.litepal.crud.DataSupport;

/**
 * 对象类
 * @Author pangmin
 * @Date 2020/11/13 16:42
 **/
public class Province extends DataSupport {

    //省id
    private int id;

    //省名
    private String provinceName;

    //省代码
    private int provinceCode;

    public Province() {

    }

    public Province(int id, String provinceName, int provinceCode) {
        this.id = id;
        this.provinceName = provinceName;
        this.provinceCode = provinceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", provinceName='" + provinceName + '\'' +
                ", provinceCode=" + provinceCode +
                '}';
    }
}
