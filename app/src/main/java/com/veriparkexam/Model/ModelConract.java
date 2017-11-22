package com.veriparkexam.Model;

import com.veriparkexam.Model.ResultListPojo.IMKB100;
import com.veriparkexam.Model.ResultListPojo.IMKB30;
import com.veriparkexam.Model.ResultListPojo.IMKB50;
import com.veriparkexam.Model.ResultListPojo.StockandIndex;
import com.veriparkexam.View.RecyclerViewUtils.LowerIMKBS.LowerIMKBitem;

import java.util.ArrayList;

/**
 * Created by Sina on 11/7/2017.
 */

public interface ModelConract {
    public void startRequstKey();

    public void startIMKB30(String key, String period);

    public void startIMKB50(String key, String period);

    public void startIMKB100(String key, String period);

    public void startIMKB(String key, String period);

    public void startIMKBRising(String key, String period);

    public void startIMKBFalling(String key, String period);

    public void setRequstKey(String key);

    public void setIMKB30(ArrayList<IMKB30> IMKB30);

    public void setIMKB50(ArrayList<IMKB50>  IMKB50);

    public void setIMKB100(ArrayList<IMKB100> IMKB100);

    public void setIMKB(ArrayList<StockandIndex> IMKB);



    public void LowerSearch(SearchObject.LowerSearchItem search );

    public void HigherSearch(SearchObject.HigherSearchItem search);

}
