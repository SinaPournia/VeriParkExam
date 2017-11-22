package com.veriparkexam.Model.ModelPOJO.RequstKeyPojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class EncryptResponse implements Serializable{

    @SerializedName("-xmlns")
    public String xmlns;

    @SerializedName("EncryptResult")
    public String EncryptResult;

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public String getEncryptResult() {
        return EncryptResult;
    }

    public void setEncryptResult(String encryptResult) {
        EncryptResult = encryptResult;
    }
}