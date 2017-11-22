package com.veriparkexam.Model;

import android.os.AsyncTask;
import android.util.Log;

import com.veriparkexam.Model.ResultListPojo.IMKB100;
import com.veriparkexam.Model.ResultListPojo.IMKB30;
import com.veriparkexam.Model.ResultListPojo.IMKB50;
import com.veriparkexam.Model.ResultListPojo.RequstList;
import com.veriparkexam.Model.ResultListPojo.StockandIndex;
import com.veriparkexam.Model.XmlToJsonUtils.Utils;
import com.veriparkexam.Presenters.IMKBContractAndPresenter;
import com.veriparkexam.View.RecyclerViewUtils.LowerIMKBS.LowerIMKBitem;

import org.json.JSONObject;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;

/**
 * Created by Sina on 11/8/2017.
 */

public class DataRequestAsyncTask extends Model {


    private static final String METHOD_NAME = "GetForexStocksandIndexesInfo";
    private static final String NAMESPACE = "http://tempuri.org/";
    private static final String SOAP_ACTION = "http://tempuri.org/GetForexStocksandIndexesInfo";
    private static final String URL = "http://mobileexam.veripark.com/mobileforeks/service.asmx";
    SoapSerializationEnvelope envelope;
    org.ksoap2.transport.HttpTransportSE HttpTransportSE;
    SoapObject response;
    SoapObject GetForexStocksandIndexesInfo = new SoapObject(NAMESPACE, METHOD_NAME);
    SoapObject request = new SoapObject(NAMESPACE, "request");
    public DataRequestAsyncTask(IMKBContractAndPresenter presenter) {
        super(presenter);
    }
    public void setup(String RequestKey,String Period){
        request.addProperty("IsIPAD", true);
        request.addProperty("DeviceID", "test");
        request.addProperty("DeviceType", "ipad");
        request.addProperty("RequestKey", RequestKey);
        request.addProperty("Period", Period);
        GetForexStocksandIndexesInfo.addSoapObject(request);
        envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = true;
        envelope.setOutputSoapObject(GetForexStocksandIndexesInfo);

        envelope.implicitTypes = true;
        HttpTransportSE = new HttpTransportSE(URL);
        HttpTransportSE.debug = true;
       // new LongOperation().execute();

    }

    public void getIMKB30(){
        new IMKB30Async().execute();
    }
    public void getIMKB50(){
        new IMKB50Async().execute();
    }
    public void getIMKB100(){
        new IMKB100Async().execute();
    }
    public void getIMKB(){
        new IMKBAsync().execute();
    }
    public void getIMKBRising(){
        new IMKBAsyncRising().execute();
    }
    public void getIMKBFaliing(){
        new IMKBAsyncFalling().execute();
    }
    public void higherSearch(SearchObject.HigherSearchItem searchItem){

        new SearchInHigherArraylist().execute(searchItem);
    }
    public void lowerSearch(SearchObject.LowerSearchItem searchItem){

        new SearchInLowerArraylist().execute(searchItem);
    }


    private class IMKB30Async extends AsyncTask<Void, Void, String> {

        @Override
        protected String doInBackground(Void... params) {
            try {

                HttpTransportSE.call(SOAP_ACTION, envelope);
                Log.e("HttpTransportSE",HttpTransportSE.requestDump.toString());
                response = (SoapObject) envelope.getResponse();
                return  HttpTransportSE.responseDump;

            } catch (Exception e) {
                return e.toString();
            }
        }

        @Override
        protected void onPostExecute(final String result) {
            Thread timer = new Thread() {
                public void run() {
                    RequstList r;
                    JSONObject jsonObj = Utils.XmlToJsonObject(result);

                    r= Utils.fillPOJO(jsonObj.toString(),RequstList.class);
                    ArrayList<IMKB30> IMKB30 = new ArrayList<>();
                    for(int i=0 ; r.getSoap_Envelope().getSoap_Body().GetForexStocksandIndexesInfoResponse.getGetForexStocksandIndexesInfoResult().getIMKB30List().getIMKB30().size()>i;i++) {
                        IMKB30.add(r.getSoap_Envelope().getSoap_Body().GetForexStocksandIndexesInfoResponse.getGetForexStocksandIndexesInfoResult().getIMKB30List().getIMKB30().get(i));
                        Log.e("getSoap_Envelope","getSoap_Envelope");
                    }
                    presenter.getModel().setIMKB30(IMKB30);



                }
            };
            timer.start();

        }

    }
    private class IMKB50Async extends AsyncTask<Void, Void, String> {

        @Override
        protected String doInBackground(Void... params) {
            try {
                Log.e("here","HEREEEE");
                HttpTransportSE.call(SOAP_ACTION, envelope);
                Log.e("HttpTransportSE",HttpTransportSE.requestDump.toString());
                response = (SoapObject) envelope.getResponse();
                return  HttpTransportSE.responseDump;

            } catch (Exception e) {
                return e.toString();
            }
        }

        @Override
        protected void onPostExecute(final String result) {
            Thread timer = new Thread() {
                public void run() {
                    RequstList r;
                    JSONObject jsonObj = Utils.XmlToJsonObject(result);

                    r= Utils.fillPOJO(jsonObj.toString(),RequstList.class);
                    ArrayList<IMKB50> IMKB50 = new ArrayList<>();

                    for(int i=0 ; r.getSoap_Envelope().getSoap_Body().GetForexStocksandIndexesInfoResponse.getGetForexStocksandIndexesInfoResult().getIMKB50List().getIMKB50().size()>i;i++) {
                        IMKB50.add(r.getSoap_Envelope().getSoap_Body().GetForexStocksandIndexesInfoResponse.getGetForexStocksandIndexesInfoResult().getIMKB50List().getIMKB50().get(i));

                    }
                    presenter.getModel().setIMKB50(IMKB50);

                }
            };
            timer.start();

        }

    }
    private class IMKB100Async extends AsyncTask<Void, Void, String> {

        @Override
        protected String doInBackground(Void... params) {
            try {

                HttpTransportSE.call(SOAP_ACTION, envelope);
                Log.e("HttpTransportSE",HttpTransportSE.requestDump.toString());
                response = (SoapObject) envelope.getResponse();
                return  HttpTransportSE.responseDump;

            } catch (Exception e) {
                return e.toString();
            }
        }

        @Override
        protected void onPostExecute(final String result) {
            Thread timer = new Thread() {
                public void run() {

                    RequstList r;
                    JSONObject jsonObj = Utils.XmlToJsonObject(result);

                    r= Utils.fillPOJO(jsonObj.toString(),RequstList.class);
                    ArrayList<IMKB100> IMKB100 = new ArrayList<>();
                    for(int i=0 ; r.getSoap_Envelope().getSoap_Body().GetForexStocksandIndexesInfoResponse.getGetForexStocksandIndexesInfoResult().getIMKB100List().getIMKB100().size()>i;i++) {
                        IMKB100.add(r.getSoap_Envelope().getSoap_Body().GetForexStocksandIndexesInfoResponse.getGetForexStocksandIndexesInfoResult().getIMKB100List().getIMKB100().get(i));

                    }
                    presenter.getModel().setIMKB100(IMKB100);
                }
            };
            timer.start();

        }


    }
    private class IMKBAsync extends AsyncTask<Void, Void, String> {

        @Override
        protected String doInBackground(Void... params) {
            try {

                HttpTransportSE.call(SOAP_ACTION, envelope);
                Log.e("HttpTransportSE",HttpTransportSE.requestDump.toString());
                response = (SoapObject) envelope.getResponse();
                return  HttpTransportSE.responseDump;

            } catch (Exception e) {
                return e.toString();
            }
        }

        @Override
        protected void onPostExecute(final String result) {
            Thread timer = new Thread() {
                public void run() {
                    RequstList r;
                    JSONObject jsonObj = Utils.XmlToJsonObject(result);

                    r= Utils.fillPOJO(jsonObj.toString(),RequstList.class);
                    ArrayList<StockandIndex> StockandIndex = new ArrayList<>();
                    for(int i=0 ; r.getSoap_Envelope().getSoap_Body().GetForexStocksandIndexesInfoResponse.getGetForexStocksandIndexesInfoResult().getStocknIndexesResponseList().getStockandIndex().size()>i;i++) {
                        StockandIndex.add(r.getSoap_Envelope().getSoap_Body().GetForexStocksandIndexesInfoResponse.getGetForexStocksandIndexesInfoResult().getStocknIndexesResponseList().getStockandIndex().get(i));

                    }
                    presenter.getModel().setIMKB(StockandIndex);

                }
            };
            timer.start();

        }


    }
    private class IMKBAsyncRising extends AsyncTask<Void, Void, String> {

        @Override
        protected String doInBackground(Void... params) {
            try {

                HttpTransportSE.call(SOAP_ACTION, envelope);
                Log.e("HttpTransportSE",HttpTransportSE.requestDump.toString());
                response = (SoapObject) envelope.getResponse();
                return  HttpTransportSE.responseDump;

            } catch (Exception e) {
                return e.toString();
            }
        }

        @Override
        protected void onPostExecute(final String result) {
            Thread timer = new Thread() {
                public void run() {

                    RequstList r;
                    JSONObject jsonObj = Utils.XmlToJsonObject(result);

                    r= Utils.fillPOJO(jsonObj.toString(),RequstList.class);
                    ArrayList<StockandIndex> StockandIndex = new ArrayList<>();
                    for(int i=0 ; r.getSoap_Envelope().getSoap_Body().GetForexStocksandIndexesInfoResponse.getGetForexStocksandIndexesInfoResult().getStocknIndexesResponseList().getStockandIndex().size()>i;i++) {
                        if(!(r.getSoap_Envelope().getSoap_Body().GetForexStocksandIndexesInfoResponse.getGetForexStocksandIndexesInfoResult().getStocknIndexesResponseList().getStockandIndex().get(i).getDifference().charAt(0) =='-')){
                            if(Double.parseDouble(r.getSoap_Envelope().getSoap_Body().GetForexStocksandIndexesInfoResponse.getGetForexStocksandIndexesInfoResult().getStocknIndexesResponseList().getStockandIndex().get(i).getDifference())>0){
                                StockandIndex.add(r.getSoap_Envelope().getSoap_Body().GetForexStocksandIndexesInfoResponse.getGetForexStocksandIndexesInfoResult().getStocknIndexesResponseList().getStockandIndex().get(i));
                                //        Log.e("StockandIndex",StockandIndex.get(i).getDifference());
                            }

                        }


                    }
                    presenter.getModel().setIMKB(StockandIndex);
                }
            };
            timer.start();

        }


    }
    private class IMKBAsyncFalling extends AsyncTask<Void, Void, String> {

        @Override
        protected String doInBackground(Void... params) {
            try {

                HttpTransportSE.call(SOAP_ACTION, envelope);
                Log.e("HttpTransportSE",HttpTransportSE.requestDump.toString());
                response = (SoapObject) envelope.getResponse();
                return  HttpTransportSE.responseDump;

            } catch (Exception e) {
                return e.toString();
            }
        }

        @Override
        protected void onPostExecute(final String result) {
            Thread timer = new Thread() {
                public void run() {
                    RequstList r;
                    JSONObject jsonObj = Utils.XmlToJsonObject(result);

                    r= Utils.fillPOJO(jsonObj.toString(),RequstList.class);
                    ArrayList<StockandIndex> StockandIndex = new ArrayList<>();
                    for(int i=0 ; r.getSoap_Envelope().getSoap_Body().GetForexStocksandIndexesInfoResponse.getGetForexStocksandIndexesInfoResult().getStocknIndexesResponseList().getStockandIndex().size()>i;i++) {
                        if(r.getSoap_Envelope().getSoap_Body().GetForexStocksandIndexesInfoResponse.getGetForexStocksandIndexesInfoResult().getStocknIndexesResponseList().getStockandIndex().get(i).getDifference().charAt(0)=='-'){
                            StockandIndex.add(r.getSoap_Envelope().getSoap_Body().GetForexStocksandIndexesInfoResponse.getGetForexStocksandIndexesInfoResult().getStocknIndexesResponseList().getStockandIndex().get(i));
                        }


                    }

                    presenter.getModel().setIMKB(StockandIndex);

                }
            };
            timer.start();

        }

    }

    private class SearchInHigherArraylist extends AsyncTask<SearchObject.HigherSearchItem, Void, ArrayList<StockandIndex>> {


        @Override
        protected ArrayList<StockandIndex> doInBackground(SearchObject.HigherSearchItem... params) {


               ArrayList<StockandIndex> stockandIndices=new ArrayList<>();
            for(StockandIndex d : params[0].getSearchArray()){
                if(d.getSymbol() != null && d.getSymbol().contains( params[0].getSearchString())){
                    stockandIndices.add(d);
                    Log.e("search",d.getSymbol());
                }

            }
            return stockandIndices;
        }

        @Override
        protected void onPostExecute(ArrayList<StockandIndex> objects) {
            presenter.SearchDataisReady(objects);
        }
    }
    private class SearchInLowerArraylist extends AsyncTask<SearchObject.LowerSearchItem, Void, ArrayList<LowerIMKBitem>> {


        @Override
        protected ArrayList<LowerIMKBitem> doInBackground(SearchObject.LowerSearchItem... params) {

            ArrayList<LowerIMKBitem> lowerIMKBitems=new ArrayList<>();
            for(LowerIMKBitem d : params[0].getSearchArray()){
                Log.e(d.getSymbol(),params[0].getSearchString());
                if(d.getSymbol() != null && d.getSymbol().contains( params[0].getSearchString())){
                    lowerIMKBitems.add(d);
                    Log.e("search",d.getSymbol());
                }

            }


            return lowerIMKBitems;
        }

        @Override
        protected void onPostExecute(ArrayList<LowerIMKBitem> objects) {

            presenter.SearchDataisReady(objects);
        }
    }



}

