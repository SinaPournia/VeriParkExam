package com.veriparkexam.View.RecyclerViewUtils.IMKB;

import android.content.Context;
import android.graphics.PorterDuff;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.veriparkexam.Model.ResultListPojo.StockandIndex;
import com.veriparkexam.R;
import com.veriparkexam.View.RecyclerViewUtils.LowerIMKBS.Adapter;
import com.veriparkexam.View.RecyclerViewUtils.LowerIMKBS.LowerIMKBitem;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;

/**
 * Created by Sina on 11/10/2017.
 */

public class IMKBAdapter extends RecyclerView.Adapter<IMKBAdapter.ViewHolder>  {
    private ArrayList<StockandIndex> feedItemList;
    private Context mContext;

    public IMKBAdapter(ArrayList<StockandIndex> feedItemList, Context mContext) {
        this.feedItemList = feedItemList;
        this.mContext = mContext;
    }


    @Override
    public IMKBAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.imkb_item, parent, false);
        IMKBAdapter.ViewHolder viewHolder = new IMKBAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(IMKBAdapter.ViewHolder holder, int position) {

        holder.Symbol.setText(feedItemList.get(position).getSymbol());
        holder.Difference.setText(feedItemList.get(position).getDifference());
        holder.Price.setText(feedItemList.get(position).getPrice());
        holder.Volume.setText(feedItemList.get(position).getVolume());
        holder.Buying.setText(feedItemList.get(position).getBuying());
        holder.Selling.setText(feedItemList.get(position).getSelling());
        holder.Hour.setText(feedItemList.get(position).getHour());
        holder.DayPeakPrice.setText(feedItemList.get(position).getDayPeakPrice());
        holder.DayLowestPrice.setText(feedItemList.get(position).getDayLowestPrice());
        holder.Total.setText(feedItemList.get(position).getTotal());
        Log.e("IMKBimage",feedItemList.get(position).getDifference());

         if(feedItemList.get(position).getDifference().charAt(0)=='-') {
            holder.IMKBimage.setBackgroundResource(R.drawable.ic_vertical_align_bottom_white_48dp);
            return;
         } else if(feedItemList.get(position).getDifference().equals("0")){
            holder.IMKBimage.setBackgroundResource(R.drawable.ic_vertical_align_center_white_48dp);
            return;
            }
          else{
            holder.IMKBimage.setBackgroundResource(R.drawable.ic_vertical_align_top_white_48dp);
            return;
          }

    }

    @Override
    public int getItemCount() {
        return feedItemList.size() ;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.IMKBimage) ImageView IMKBimage;
        @BindView(R.id.symbol) TextView Symbol;
        @BindView(R.id.Difference) TextView Difference;
        @BindView(R.id.Price) TextView Price;
        @BindView(R.id.Volume) TextView Volume;
        @BindView(R.id.Buying) TextView Buying;
        @BindView(R.id.Selling) TextView Selling;
        @BindView(R.id.Hour) TextView Hour;
        @BindView(R.id.DayPeakPrice) TextView DayPeakPrice;
        @BindView(R.id.DayLowestPrice) TextView DayLowestPrice;
        @BindView(R.id.Total) TextView Total;

        public ViewHolder(View view) {

            super(view);
            ButterKnife.bind(this, view);


        }
    }
}


