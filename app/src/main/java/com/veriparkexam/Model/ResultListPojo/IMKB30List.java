package com.veriparkexam.Model.ResultListPojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class IMKB30List implements Serializable{

    @SerializedName("IMKB30")
    public List<IMKB30> IMKB30;

    public List<IMKB30> getIMKB30() {
        return IMKB30;
    }

    public void setIMKB30(List<IMKB30> IMKB30) {
        this.IMKB30 = IMKB30;
    }
}