package com.veriparkexam.Model.ResultListPojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class IMKB100List implements Serializable{

    @SerializedName("IMKB100")
    public List<IMKB100> IMKB100;

    public List<IMKB100> getIMKB100() {
        return IMKB100;
    }

    public void setIMKB100(List<IMKB100> IMKB100) {
        this.IMKB100 = IMKB100;
    }
}