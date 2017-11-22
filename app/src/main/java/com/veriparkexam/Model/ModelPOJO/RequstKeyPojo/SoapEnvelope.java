package com.veriparkexam.Model.ModelPOJO.RequstKeyPojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class SoapEnvelope implements Serializable{

@SerializedName("-xmlns:soap")
public String xmlnsSoap;

@SerializedName("-xmlns:xsi")
public String xmlnsXsi;

@SerializedName("-xmlns:xsd")
public String xmlnsXsd;

@SerializedName("soap:Body")
public SoapBody soapBody;

    public String getXmlnsSoap() {
        return xmlnsSoap;
    }

    public void setXmlnsSoap(String xmlnsSoap) {
        this.xmlnsSoap = xmlnsSoap;
    }

    public String getXmlnsXsi() {
        return xmlnsXsi;
    }

    public void setXmlnsXsi(String xmlnsXsi) {
        this.xmlnsXsi = xmlnsXsi;
    }

    public String getXmlnsXsd() {
        return xmlnsXsd;
    }

    public void setXmlnsXsd(String xmlnsXsd) {
        this.xmlnsXsd = xmlnsXsd;
    }

    public SoapBody getSoapBody() {
        return soapBody;
    }

    public void setSoapBody(SoapBody soapBody) {
        this.soapBody = soapBody;
    }
}