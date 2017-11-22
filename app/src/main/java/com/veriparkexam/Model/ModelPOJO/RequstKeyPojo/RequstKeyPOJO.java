package com.veriparkexam.Model.ModelPOJO.RequstKeyPojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class RequstKeyPOJO implements Serializable{

    @SerializedName("soap:Envelope")
    public SoapEnvelope soapEnvelope;

    public SoapEnvelope getSoapEnvelope() {
        return soapEnvelope;
    }

    public void setSoapEnvelope(SoapEnvelope soapEnvelope) {
        this.soapEnvelope = soapEnvelope;
    }
}