package com.veriparkexam.Model.ResultListPojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class RequstList implements Serializable{

    @SerializedName("soap:Envelope")
    public Soap_Envelope soap_Envelope;

    public Soap_Envelope getSoap_Envelope() {
        return soap_Envelope;
    }

    public void setSoap_Envelope(Soap_Envelope soap_Envelope) {
        this.soap_Envelope = soap_Envelope;
    }
}