package com.veriparkexam.View;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.ProgressBar;

import com.veriparkexam.BaseActivity;
import com.veriparkexam.Model.SearchObject;
import com.veriparkexam.Presenters.IMKB30Presenter;
import com.veriparkexam.Presenters.IMKBContractAndPresenter;
import com.veriparkexam.R;
import com.veriparkexam.View.RecyclerViewUtils.LowerIMKBS.Adapter;
import com.veriparkexam.View.RecyclerViewUtils.LowerIMKBS.LowerIMKBitem;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class IMKB30Activity extends BaseActivity implements IMKBContractAndPresenter.ViewContract,IMKB30Presenter.IMKB30ViewContract {
    @BindView(R.id.PRGS) ProgressBar progressBar;
    @BindView(R.id.recycler_viewIMKB30) RecyclerView mRecyclerView;
    @BindView(R.id.SearchView) SearchView searchView;
    private ArrayList<LowerIMKBitem> data ;
    private ArrayList<LowerIMKBitem> feedsList;
    private Adapter adapter;
    IMKB30Presenter imkb30Presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imkb30);
        ButterKnife.bind(this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        imkb30Presenter= new IMKB30Presenter(this,this);
        imkb30Presenter.GetData();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                imkb30Presenter.Search( new SearchObject.LowerSearchItem(data,newText.toUpperCase()));

                return true;
            }
        });

    }

    @Override
    public void showLoading() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                progressBar.setVisibility(View.VISIBLE);
                searchView.setVisibility(View.GONE);
            }
        });


    }

    @Override
    public void hideLoading() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                progressBar.setVisibility(View.GONE);
                searchView.setVisibility(View.VISIBLE);
            }
        });


    }

    @Override
    public void deliverData(ArrayList<LowerIMKBitem> ArrayLowerIMKBitem) {
        this.data=ArrayLowerIMKBitem;
    }
    @Override
    public void fillRecyclerArraylist(ArrayList<LowerIMKBitem> ArrayLowerIMKB30) {
        this.feedsList=ArrayLowerIMKB30;
        adapter= new Adapter(feedsList,this);

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mRecyclerView.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }
        });



    }
}
