package com.hellozjf.test.u8eai.domain;

public class ReceiveSendType {

    private String code;
    private String name;
    private String sort;
    private String rsflag;
    private String end_flag;
    private String oppsubject_code;
    private String bRetail;
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSort() {
        return sort;
    }
    public void setSort(String sort) {
        this.sort = sort;
    }
    public String getRsflag() {
        return rsflag;
    }
    public void setRsflag(String rsflag) {
        this.rsflag = rsflag;
    }
    public String getEnd_flag() {
        return end_flag;
    }
    public void setEnd_flag(String end_flag) {
        this.end_flag = end_flag;
    }
    public String getOppsubject_code() {
        return oppsubject_code;
    }
    public void setOppsubject_code(String oppsubject_code) {
        this.oppsubject_code = oppsubject_code;
    }
    public String getbRetail() {
        return bRetail;
    }
    public void setbRetail(String bRetail) {
        this.bRetail = bRetail;
    }
    @Override
    public String toString() {
        return "ReceiveSendType [code=" + code + ", name=" + name + ", sort=" + sort + ", rsflag=" + rsflag + ", end_flag=" + end_flag + ", oppsubject_code=" + oppsubject_code + ", bRetail=" + bRetail + "]";
    }
}
