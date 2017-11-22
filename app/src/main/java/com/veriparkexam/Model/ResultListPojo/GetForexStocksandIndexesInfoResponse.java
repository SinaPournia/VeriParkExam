package com.veriparkexam.Model.ResultListPojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class GetForexStocksandIndexesInfoResponse implements Serializable{

    @SerializedName("-xmlns")
    public String xmlns;

    public GetForexStocksandIndexesInfoResult getGetForexStocksandIndexesInfoResult() {
        return GetForexStocksandIndexesInfoResult;
    }

    public void setGetForexStocksandIndexesInfoResult(GetForexStocksandIndexesInfoResult getForexStocksandIndexesInfoResult) {
        GetForexStocksandIndexesInfoResult = getForexStocksandIndexesInfoResult;
    }

    @SerializedName("GetForexStocksandIndexesInfoResult")
    public GetForexStocksandIndexesInfoResult GetForexStocksandIndexesInfoResult;


}