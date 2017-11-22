package com.veriparkexam.Presenters;

import com.veriparkexam.Model.Model;
import com.veriparkexam.Model.ResultListPojo.StockandIndex;
import com.veriparkexam.Model.SearchObject;

import java.util.ArrayList;

/**
 * Created by Sina on 11/14/2017.
 */

public class IMKBFallingPresenter extends IMKBContractAndPresenter implements IMKBContractAndPresenter.HighSearch{

    IMKBPresenter.IMKBViewContract IMKBview;
    public IMKBFallingPresenter(ViewContract view, IMKBPresenter.IMKBViewContract IMKBview) {
        super(view);
        this.IMKBview=IMKBview;
    }

    @Override
    public void keyIsReady(String Key) {
        new Model(this).startIMKBFalling(Key,"Month");
    }


    @Override
    public void dataIsReady(ArrayList<?> IMKBobject) {

        IMKBview.deliverData((ArrayList<StockandIndex>) IMKBobject);
        IMKBview.fillRecyclerArraylist((ArrayList<StockandIndex>) IMKBobject);
        hideLoading();


    }

    @Override
    public void SearchDataisReady(ArrayList<?> searchResult) {
        IMKBview.fillRecyclerArraylist((ArrayList<StockandIndex>) searchResult);
    }
    @Override
    public void Search(SearchObject.HigherSearchItem searchItem) {
        new Model(this).HigherSearch(searchItem);
    }

    public interface IMKBFallingViewContract extends IMKBContractAndPresenter.ViewContract{
        public void deliverData(ArrayList<StockandIndex> StockandIndex );
        public void fillRecyclerArraylist(ArrayList<StockandIndex> StockandIndex );
    }


}

