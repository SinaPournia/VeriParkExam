package com.veriparkexam.Model;

import com.veriparkexam.Model.ResultListPojo.StockandIndex;
import com.veriparkexam.View.RecyclerViewUtils.LowerIMKBS.LowerIMKBitem;

import java.util.ArrayList;

/**
 * Created by Sina on 11/15/2017.
 */

public  class SearchObject {







    public static class LowerSearchItem {
        ArrayList<LowerIMKBitem> searchArray;
        String searchString;
        public LowerSearchItem(ArrayList<?> searchArray, String searchString) {
             this.searchArray = (ArrayList<LowerIMKBitem>) searchArray;
            this.searchString = searchString;

        }

        public ArrayList<LowerIMKBitem> getSearchArray() {
            return searchArray;
        }

        public void setSearchArray(ArrayList<LowerIMKBitem> searchArray) {
            this.searchArray = searchArray;
        }

        public String getSearchString() {
            return searchString;
        }

        public void setSearchString(String searchString) {
            this.searchString = searchString;
        }


    }
    public static class HigherSearchItem {
        ArrayList<StockandIndex> searchArray;
        String searchString;
        public HigherSearchItem(ArrayList<?> searchArray,String searchString) {
            this.searchArray = (ArrayList<StockandIndex>) searchArray;
            this.searchString = searchString;
        }

        public ArrayList<StockandIndex> getSearchArray() {
            return searchArray;
        }

        public void setSearchArray(ArrayList<StockandIndex> searchArray) {
            this.searchArray = searchArray;
        }

        public String getSearchString() {
            return searchString;
        }

        public void setSearchString(String searchString) {
            this.searchString = searchString;
        }



    }



}
