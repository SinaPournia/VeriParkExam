package com.veriparkexam.Model.ResultListPojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Sina on 10/31/2017.
 */

public class Soap_Envelope  implements Serializable {

    @SerializedName("-xmlns:soap")
    public String xmlns_soap;

    @SerializedName("-xmlns:xsi")
    public String xmlns_xsi;

    @SerializedName("-xmlns:xsd")
    public String xmlns_xsd;

    @SerializedName("soap:Body")
    public Soap_Body soap_Body;

    public String getXmlns_soap() {
        return xmlns_soap;
    }

    public void setXmlns_soap(String xmlns_soap) {
        this.xmlns_soap = xmlns_soap;
    }

    public String getXmlns_xsi() {
        return xmlns_xsi;
    }

    public void setXmlns_xsi(String xmlns_xsi) {
        this.xmlns_xsi = xmlns_xsi;
    }

    public String getXmlns_xsd() {
        return xmlns_xsd;
    }

    public void setXmlns_xsd(String xmlns_xsd) {
        this.xmlns_xsd = xmlns_xsd;
    }

    public Soap_Body getSoap_Body() {
        return soap_Body;
    }

    public void setSoap_Body(Soap_Body soap_Body) {
        this.soap_Body = soap_Body;
    }
}