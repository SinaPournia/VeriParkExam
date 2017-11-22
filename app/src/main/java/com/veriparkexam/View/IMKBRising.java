package com.veriparkexam.View;

import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.ProgressBar;

import com.veriparkexam.BaseActivity;
import com.veriparkexam.Model.ResultListPojo.StockandIndex;
import com.veriparkexam.Model.SearchObject;
import com.veriparkexam.Presenters.IMKBContractAndPresenter;
import com.veriparkexam.Presenters.IMKBRisingPresenter;
import com.veriparkexam.R;
import com.veriparkexam.View.RecyclerViewUtils.IMKB.IMKBAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class IMKBRising extends BaseActivity implements IMKBContractAndPresenter.ViewContract,IMKBRisingPresenter.IMKBRisingViewContract {
    @BindView(R.id.PRGS) ProgressBar progressBar;
    @BindView(R.id.recycler_viewIMKBRising) RecyclerView mRecyclerView;
    @BindView(R.id.SearchView) SearchView searchView;
    private ArrayList<StockandIndex> data ;
    private ArrayList<StockandIndex> feedsList;
    private IMKBAdapter adapter;
    LinearLayoutManager linearLayoutManager;
    IMKBRisingPresenter stockAndIndexPresenterRising;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imkbrising);
        ButterKnife.bind(this);
        linearLayoutManager=  new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        stockAndIndexPresenterRising= new IMKBRisingPresenter(this,this);
        stockAndIndexPresenterRising.GetData();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                stockAndIndexPresenterRising.Search( new SearchObject.HigherSearchItem(data,newText.toUpperCase()));

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
    public void deliverData(ArrayList<StockandIndex> StockandIndex) {
        this.data=StockandIndex;
    }
    @Override
    public void fillRecyclerArraylist(ArrayList<StockandIndex> StockandIndex) {
        this.feedsList=StockandIndex;

        adapter= new IMKBAdapter(StockandIndex,this);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mRecyclerView.setAdapter(adapter);
                DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(mRecyclerView.getContext(),
                        linearLayoutManager.getOrientation());
                mRecyclerView.addItemDecoration(dividerItemDecoration);
                adapter.notifyDataSetChanged();
            }
        });
    }
}
