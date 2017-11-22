package com.veriparkexam.View.RecyclerViewUtils.LowerIMKBS;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.veriparkexam.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by Sina on 11/10/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>  {
    private ArrayList<LowerIMKBitem> feedItemList;
    private Context mContext;

    public Adapter(ArrayList<LowerIMKBitem> feedItemList, Context mContext) {
        this.feedItemList = feedItemList;
        this.mContext = mContext;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lower_imkbs_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.symbol.setText(feedItemList.get(position).getSymbol());
        holder.name.setText(feedItemList.get(position).getName());
        holder.gain.setText(feedItemList.get(position).getGain());
        holder.fund.setText(feedItemList.get(position).getFund());
    }

    @Override
    public int getItemCount() {
        return feedItemList.size() ;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
    
        @BindView(R.id.symbol) TextView symbol;
        @BindView(R.id.name) TextView name;
        @BindView(R.id.gain) TextView gain;
        @BindView(R.id.fund) TextView fund;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}

