package com.veriparkexam.Presenters;

import com.veriparkexam.Model.Model;
import com.veriparkexam.Model.SearchObject;
import com.veriparkexam.View.RecyclerViewUtils.LowerIMKBS.LowerIMKBitem;

import java.util.ArrayList;

/**
 * Created by Sina on 11/9/2017.
 */

public class IMKB100Presenter extends IMKBContractAndPresenter implements IMKBContractAndPresenter.LowSearch {

    IMKB100ViewContract IMKBview;
    public IMKB100Presenter(ViewContract view,IMKB100ViewContract IMKBview) {
        super(view);
        this.IMKBview=IMKBview;
    }

    @Override
    public void keyIsReady(String Key) {
        new Model(this).startIMKB100(Key,"Month");
    }


    @Override
    public void dataIsReady(ArrayList<?> IMKBobject) {
        IMKBview.deliverData((ArrayList<LowerIMKBitem>) IMKBobject);
        IMKBview.fillRecyclerArraylist((ArrayList<LowerIMKBitem>) IMKBobject);
        hideLoading();


    }

    @Override
    public void Search(SearchObject.LowerSearchItem searchItem) {
        new Model(this).LowerSearch(searchItem);
    }

    @Override
    public void SearchDataisReady(ArrayList<?> searchResult) {
        IMKBview.fillRecyclerArraylist((ArrayList<LowerIMKBitem>) searchResult);
    }


    public interface IMKB100ViewContract extends IMKBContractAndPresenter.ViewContract{
        public void deliverData(ArrayList<LowerIMKBitem> ArrayLowerIMKBitem );
        public void fillRecyclerArraylist(ArrayList<LowerIMKBitem> ArrayLowerIMKBitem );
    }


}
