package com.veriparkexam.Model;

import com.veriparkexam.Model.ResultListPojo.IMKB100;
import com.veriparkexam.Model.ResultListPojo.IMKB30;
import com.veriparkexam.Model.ResultListPojo.IMKB50;
import com.veriparkexam.Model.ResultListPojo.StockandIndex;
import com.veriparkexam.Presenters.IMKBContractAndPresenter;

import java.util.ArrayList;

/**
 * Created by Sina on 11/7/2017.
 */

public class Model implements ModelConract {
    IMKBContractAndPresenter presenter;
    public Model(IMKBContractAndPresenter presenter) {
        this.presenter= presenter;
    }

    @Override
    public void startRequstKey() {

     new RequestKeyAsyncTask(presenter).getkey();
    }

    @Override
    public void startIMKB30(String key, String period) {

        DataRequestAsyncTask Data=new DataRequestAsyncTask(presenter);
        Data.setup(key,period);
        Data.getIMKB30();
    }

    @Override
    public void startIMKB50(String key, String period) {

        DataRequestAsyncTask Data=new DataRequestAsyncTask(presenter);
        Data.setup(key,period);
        Data.getIMKB50();
    }

    @Override
    public void startIMKB100(String key, String period) {

        DataRequestAsyncTask Data=new DataRequestAsyncTask(presenter);
        Data.setup(key,period);
        Data.getIMKB100();
    }

    @Override
    public void startIMKB(String key, String period) {

        DataRequestAsyncTask Data=new DataRequestAsyncTask(presenter);
        Data.setup(key,period);
        Data.getIMKB();
    }

    @Override
    public void startIMKBRising(String key, String period) {

        DataRequestAsyncTask Data=new DataRequestAsyncTask(presenter);
        Data.setup(key,period);
        Data.getIMKBRising();
    }

    @Override
    public void startIMKBFalling(String key, String period) {

        DataRequestAsyncTask Data=new DataRequestAsyncTask(presenter);
        Data.setup(key,period);
        Data.getIMKBFaliing();
    }

    @Override
    public void setRequstKey(String key) {
        presenter.keyIsReady(key);

    }

    @Override
    public void setIMKB30(ArrayList<IMKB30> IMKB30) {

        presenter.dataIsReady(IMKB30);

    }

    @Override
    public void setIMKB50(ArrayList<IMKB50> IMKB50) {
        presenter.dataIsReady(IMKB50);

    }

    @Override
    public void setIMKB100(ArrayList<IMKB100> IMKB100) {
        presenter.dataIsReady(IMKB100);

    }

    @Override
    public void setIMKB(ArrayList<StockandIndex> IMKB) {
        presenter.dataIsReady(IMKB);

    }



    @Override
    public void LowerSearch(SearchObject.LowerSearchItem search) {

        new DataRequestAsyncTask(presenter).lowerSearch(search);
    }

    @Override
    public void HigherSearch(SearchObject.HigherSearchItem search) {
        new DataRequestAsyncTask(presenter).higherSearch(search);
    }




}
