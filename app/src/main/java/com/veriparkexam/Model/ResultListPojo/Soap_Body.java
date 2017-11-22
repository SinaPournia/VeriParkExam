package com.veriparkexam.Model.ResultListPojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Sina on 10/31/2017.
 */

public class Soap_Body implements Serializable {

    @SerializedName("GetForexStocksandIndexesInfoResponse")
    public GetForexStocksandIndexesInfoResponse GetForexStocksandIndexesInfoResponse;

    public GetForexStocksandIndexesInfoResponse getGetForexStocksandIndexesInfoResponse() {
        return GetForexStocksandIndexesInfoResponse;
    }

    public void setGetForexStocksandIndexesInfoResponse(GetForexStocksandIndexesInfoResponse getForexStocksandIndexesInfoResponse) {
        GetForexStocksandIndexesInfoResponse = getForexStocksandIndexesInfoResponse;
    }
}
