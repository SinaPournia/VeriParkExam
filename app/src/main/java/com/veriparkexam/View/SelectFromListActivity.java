package com.veriparkexam.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.veriparkexam.BaseActivity;
import com.veriparkexam.Presenters.IMKBContractAndPresenter;
import com.veriparkexam.R;

import butterknife.BindView;

public class SelectFromListActivity extends BaseActivity implements IMKBContractAndPresenter.ViewContract,View.OnClickListener {
    Button IMKB;
    Button IMKBRising;
    Button IMKBFalling;
    Button IMKB100;
    Button IMKB50;
    Button IMKB30;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_from_list);
        Log.e("Check",checkInternetConnection().toString());
        IMKB=(Button) findViewById(R.id.IMKB);
        IMKBRising=(Button) findViewById(R.id.IMKBRising);
        IMKBFalling=(Button) findViewById(R.id.IMKBFalling);
        IMKB100=(Button) findViewById(R.id.IMKB100);
        IMKB50=(Button) findViewById(R.id.IMKB50);
        IMKB30=(Button) findViewById(R.id.IMKB30);
        IMKB.setOnClickListener(this);
        IMKBRising.setOnClickListener(this);
        IMKBFalling.setOnClickListener(this);
        IMKB100.setOnClickListener(this);
        IMKB50.setOnClickListener(this);
        IMKB30.setOnClickListener(this);





            }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.IMKB :{
                Intent IMKBActivity = new Intent(this, IMKBActivity.class);
                startActivity(IMKBActivity);
                break;
            }
            case R.id.IMKBRising :{
                Intent IMKBRising = new Intent(this, IMKBRising.class);
                startActivity(IMKBRising);
                break;
            }
            case R.id.IMKBFalling :{
                Intent IMKBFalling = new Intent(this, IMKBFalling.class);
                startActivity(IMKBFalling);
                break;
            }
            case R.id.IMKB100 :{
                Intent IMKB100Activity = new Intent(this, IMKB100Activity.class);
                startActivity(IMKB100Activity);
                break;
            }
            case R.id.IMKB50 :{
                Intent IMKB50Activity = new Intent(this, IMKB50Activity.class);
                startActivity(IMKB50Activity);
                break;
            }
            case R.id.IMKB30 :{
                Intent IMKB30Activity = new Intent(this, IMKB30Activity.class);
                startActivity(IMKB30Activity);
                break;
            }

        }

    }
}


