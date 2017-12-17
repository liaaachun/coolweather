package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Shinelon on 2017/12/16.
 */

public class Province extends DataSupport{
    private int id;
    private String provinceNAME;
    private  int provinceCode;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getProvinceCode() {
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceNAME() {
        return provinceNAME;
    }

    public void setProvinceNAME(String provinceNAME) {
        this.provinceNAME = provinceNAME;
    }
}
