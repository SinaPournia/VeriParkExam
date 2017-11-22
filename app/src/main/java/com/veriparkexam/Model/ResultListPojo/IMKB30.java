package com.veriparkexam.Model.ResultListPojo;

import com.google.gson.annotations.SerializedName;
import com.veriparkexam.View.RecyclerViewUtils.LowerIMKBS.LowerIMKBitem;

import java.io.Serializable;


public class IMKB30 extends LowerIMKBitem implements Serializable{

    @SerializedName("Symbol")
    public String Symbol;

    @SerializedName("Name")
    public String Name;

    @SerializedName("Gain")
    public String Gain;

    @SerializedName("Fund")
    public String Fund;

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGain() {
        return Gain;
    }

    public void setGain(String gain) {
        Gain = gain;
    }

    public String getFund() {
        return Fund;
    }

    public void setFund(String fund) {
        Fund = fund;
    }
}