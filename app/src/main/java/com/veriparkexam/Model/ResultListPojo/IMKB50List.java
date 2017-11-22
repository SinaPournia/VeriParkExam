package com.veriparkexam.Model.ResultListPojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class IMKB50List implements Serializable{

    @SerializedName("IMKB50")
    public List<IMKB50> IMKB50;

    public List<IMKB50> getIMKB50() {
        return IMKB50;
    }

    public void setIMKB50(List<IMKB50> IMKB50) {
        this.IMKB50 = IMKB50;
    }
}