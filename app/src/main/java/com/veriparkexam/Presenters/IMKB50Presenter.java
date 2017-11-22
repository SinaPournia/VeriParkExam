package com.veriparkexam.Presenters;

import com.veriparkexam.Model.Model;
import com.veriparkexam.Model.SearchObject;
import com.veriparkexam.View.RecyclerViewUtils.LowerIMKBS.LowerIMKBitem;

import java.util.ArrayList;

/**
 * Created by Sina on 11/9/2017.
 */

public class IMKB50Presenter  extends IMKBContractAndPresenter implements IMKBContractAndPresenter.LowSearch {

    IMKB50ViewContract imkb50ViewContract;
    public IMKB50Presenter(ViewContract view,IMKB50ViewContract imkb50ViewContract) {
        super(view);
        this.imkb50ViewContract=imkb50ViewContract;
    }

    @Override
    public void keyIsReady(String Key) {
        new Model(this).startIMKB50(Key,"Month");
    }


    @Override
    public void dataIsReady(ArrayList<?> IMKBobject) {
        imkb50ViewContract.deliverData((ArrayList<LowerIMKBitem>) IMKBobject);
        imkb50ViewContract.fillRecyclerArraylist((ArrayList<LowerIMKBitem>) IMKBobject);
        hideLoading();


    }
    @Override
    public void Search(SearchObject.LowerSearchItem searchItem) {

        new Model(this).LowerSearch(searchItem);
    }
    @Override
    public void SearchDataisReady(ArrayList<?> searchResult) {
        imkb50ViewContract.fillRecyclerArraylist((ArrayList<LowerIMKBitem>) searchResult);
    }


    public interface IMKB50ViewContract extends IMKBContractAndPresenter.ViewContract{
        public void deliverData(ArrayList<LowerIMKBitem> ArrayLowerIMKB50 );
        public void fillRecyclerArraylist(ArrayList<LowerIMKBitem> ArrayLowerIMKB50 );
    }

}
