package com.veriparkexam.Presenters;

import android.util.Log;

import com.veriparkexam.Model.Model;
import com.veriparkexam.Model.ResultListPojo.StockandIndex;
import com.veriparkexam.Model.SearchObject;
import com.veriparkexam.View.RecyclerViewUtils.LowerIMKBS.LowerIMKBitem;

import java.util.ArrayList;

/**
 * Created by Sina on 11/9/2017.
 */

public abstract class IMKBContractAndPresenter {
    ViewContract view;
    Model model;

    public IMKBContractAndPresenter(ViewContract view) {
        this.view = view;
        this.model = new Model(this);
    }

    public ViewContract getView() {
        return view;
    }

    public void setView(ViewContract view) {
        this.view = view;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void GetData(){
        showLoading();
        model.startRequstKey();
    }

    public abstract void keyIsReady(String Key);

    public abstract void dataIsReady( ArrayList<?> IMKBobject);

    public abstract void SearchDataisReady(ArrayList<?> searchResult);



    public static interface HighSearch {
        public abstract void Search(SearchObject.HigherSearchItem searchItem);


    }
    public static interface LowSearch {
        public abstract void Search(SearchObject.LowerSearchItem searchItem);



    }
    public void showLoading(){
        view.showLoading();
    }

    public void hideLoading(){
        Log.e("hideLoading","hideLoading");
        view.hideLoading();
    }
    /**
     * Created by Sina on 11/9/2017.
     */

    public static interface ViewContract {
             void showLoading();

             void hideLoading();

    }
}
