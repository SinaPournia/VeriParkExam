package com.veriparkexam.Model.ResultListPojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class GetForexStocksandIndexesInfoResult implements Serializable{

    @SerializedName("RequestResult")
    public RequestResult RequestResult;

    @SerializedName("StocknIndexesResponseList")
    public StocknIndexesResponseList StocknIndexesResponseList;

    @SerializedName("IMKB100List")
    public IMKB100List IMKB100List;

    @SerializedName("IMKB50List")
    public IMKB50List IMKB50List;

    @SerializedName("IMKB30List")
    public IMKB30List IMKB30List;

    public RequestResult getRequestResult() {
        return RequestResult;
    }

    public void setRequestResult(RequestResult requestResult) {
        RequestResult = requestResult;
    }

    public StocknIndexesResponseList getStocknIndexesResponseList() {
        return StocknIndexesResponseList;
    }

    public void setStocknIndexesResponseList(StocknIndexesResponseList stocknIndexesResponseList) {
        StocknIndexesResponseList = stocknIndexesResponseList;
    }

    public IMKB100List getIMKB100List() {
        return IMKB100List;
    }

    public void setIMKB100List(IMKB100List IMKB100List) {
        this.IMKB100List = IMKB100List;
    }

    public IMKB50List getIMKB50List() {
        return IMKB50List;
    }

    public void setIMKB50List(IMKB50List IMKB50List) {
        this.IMKB50List = IMKB50List;
    }

    public IMKB30List getIMKB30List() {
        return IMKB30List;
    }

    public void setIMKB30List(IMKB30List IMKB30List) {
        this.IMKB30List = IMKB30List;
    }
}