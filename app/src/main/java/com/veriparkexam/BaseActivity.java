package com.veriparkexam;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.ProgressBar;
import android.widget.Toast;

import butterknife.ButterKnife;

/**
 * Created by Sina on 11/7/2017.
 */

public abstract class BaseActivity extends AppCompatActivity implements BaseActivityContract{

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
     if(!checkInternetConnection()){
            Toast.makeText(BaseActivity.this, "No Internet Connection!",
                    Toast.LENGTH_LONG).show();
        }

    }


    @Override
    public Boolean checkInternetConnection() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
