package com.veriparkexam.Model.ResultListPojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class StockandIndex implements Serializable{

    @SerializedName("Symbol")
    public String Symbol;

    @SerializedName("Price")
    public String Price;

    @SerializedName("Difference")
    public String Difference;

    @SerializedName("Volume")
    public String Volume;

    @SerializedName("Buying")
    public String Buying;

    @SerializedName("Selling")
    public String Selling;

    @SerializedName("Hour")
    public String Hour;

    @SerializedName("DayPeakPrice")
    public String DayPeakPrice;

    @SerializedName("DayLowestPrice")
    public String DayLowestPrice;

    @SerializedName("Total")
    public String Total;

    @SerializedName("IsIndex")
    public String IsIndex;

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDifference() {
        return Difference;
    }

    public void setDifference(String difference) {
        Difference = difference;
    }

    public String getVolume() {
        return Volume;
    }

    public void setVolume(String volume) {
        Volume = volume;
    }

    public String getBuying() {
        return Buying;
    }

    public void setBuying(String buying) {
        Buying = buying;
    }

    public String getSelling() {
        return Selling;
    }

    public void setSelling(String selling) {
        Selling = selling;
    }

    public String getHour() {
        return Hour;
    }

    public void setHour(String hour) {
        Hour = hour;
    }

    public String getDayPeakPrice() {
        return DayPeakPrice;
    }

    public void setDayPeakPrice(String dayPeakPrice) {
        DayPeakPrice = dayPeakPrice;
    }

    public String getDayLowestPrice() {
        return DayLowestPrice;
    }

    public void setDayLowestPrice(String dayLowestPrice) {
        DayLowestPrice = dayLowestPrice;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }

    public String getIsIndex() {
        return IsIndex;
    }

    public void setIsIndex(String isIndex) {
        IsIndex = isIndex;
    }
}