package com.veriparkexam.Model.ModelPOJO.RequstKeyPojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class SoapBody implements Serializable{

@SerializedName("EncryptResponse")
public EncryptResponse EncryptResponse;

    public EncryptResponse getEncryptResponse() {
        return EncryptResponse;
    }

    public void setEncryptResponse(EncryptResponse encryptResponse) {
        EncryptResponse = encryptResponse;
    }
}