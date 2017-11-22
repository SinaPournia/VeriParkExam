package com.veriparkexam.Presenters;

import com.veriparkexam.Model.Model;
import com.veriparkexam.Model.SearchObject;
import com.veriparkexam.View.RecyclerViewUtils.LowerIMKBS.LowerIMKBitem;

import java.util.ArrayList;

/**
 * Created by Sina on 11/8/2017.
 */

public class IMKB30Presenter extends IMKBContractAndPresenter implements IMKBContractAndPresenter.LowSearch {
    IMKB30ViewContract imkb30ViewContract;

    public IMKB30Presenter(ViewContract view,IMKB30ViewContract imkb30ViewContract) {
        super(view);
        this.imkb30ViewContract =imkb30ViewContract;
    }

    @Override
    public void keyIsReady(String Key) {
        new Model(this).startIMKB30(Key,"Month");
    }


    @Override
    public void dataIsReady(ArrayList<?> IMKBobject) {
        imkb30ViewContract.deliverData((ArrayList<LowerIMKBitem>) IMKBobject);

        imkb30ViewContract.fillRecyclerArraylist((ArrayList<LowerIMKBitem>) IMKBobject);
        hideLoading();



    }
    @Override
    public void Search(SearchObject.LowerSearchItem searchItem) {
        new Model(this).LowerSearch(searchItem);
    }
    @Override
    public void SearchDataisReady(ArrayList<?> searchResult) {
        imkb30ViewContract.fillRecyclerArraylist((ArrayList<LowerIMKBitem>) searchResult);
    }


    public interface IMKB30ViewContract extends IMKBContractAndPresenter.ViewContract{

        public void fillRecyclerArraylist(ArrayList<LowerIMKBitem> ArrayLowerIMKB30 );
        public void deliverData(ArrayList<LowerIMKBitem> ArrayLowerIMKB30 );
    }

}
