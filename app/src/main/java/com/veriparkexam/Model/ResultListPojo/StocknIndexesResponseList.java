package com.veriparkexam.Model.ResultListPojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class StocknIndexesResponseList implements Serializable{

    @SerializedName("StockandIndex")
    public List<StockandIndex> StockandIndex;

    public List<StockandIndex> getStockandIndex() {
        return StockandIndex;
    }

    public void setStockandIndex(List<StockandIndex> stockandIndex) {
        StockandIndex = stockandIndex;
    }
}