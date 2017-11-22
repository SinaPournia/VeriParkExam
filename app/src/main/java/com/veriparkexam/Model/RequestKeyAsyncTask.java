package com.veriparkexam.Model;

import android.os.AsyncTask;
import android.util.Log;

import com.veriparkexam.Model.ModelPOJO.RequstKeyPojo.RequstKeyPOJO;
import com.veriparkexam.Model.XmlToJsonUtils.Utils;
import com.veriparkexam.Presenters.IMKBContractAndPresenter;

import org.json.JSONObject;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Sina on 11/7/2017.
 */

public class RequestKeyAsyncTask extends Model {
    private static final String METHOD_NAME = "Encrypt";
    private static final String NAMESPACE = "http://tempuri.org/";
    private static final String SOAP_ACTION = "http://tempuri.org/Encrypt";
    private static final String URL = "http://mobileexam.veripark.com/mobileforeks/service.asmx";
    SoapSerializationEnvelope envelope;
    org.ksoap2.transport.HttpTransportSE HttpTransportSE;
    SoapObject Encrypt ;

    public RequestKeyAsyncTask(IMKBContractAndPresenter presenter) {
        super(presenter);
    }


    public void  getkey(){
        String currentTimeString = new SimpleDateFormat("dd:MM:yyyy HH:mm").format(new Date());
        String requestKey = "RequestIsValid" + currentTimeString;
        Log.e("RequestIsValid",requestKey);
        Encrypt = new SoapObject(NAMESPACE, METHOD_NAME);
        Encrypt.addProperty("request",requestKey);
        // Log.e("HttpTransportSE",HttpTransportSE.requestDump.toString());
        envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = true;
        envelope.setOutputSoapObject(Encrypt);

        envelope.implicitTypes = true;
        HttpTransportSE = new org.ksoap2.transport.HttpTransportSE(URL);
        HttpTransportSE.debug = true;
        new LonngOperation().execute();

    }

    private class LonngOperation extends AsyncTask<Void, Void, String> {

        @Override
        protected String doInBackground(Void... params) {
            try {

                HttpTransportSE.call(SOAP_ACTION, envelope);
                Log.e("HttpTransportSE",HttpTransportSE.requestDump.toString());
                return  HttpTransportSE.responseDump;

            } catch (Exception e) {

                return e.toString();
            }
        }

        @Override
        protected void onPostExecute(String result) {
            RequstKeyPOJO r;
            JSONObject jsonObj = Utils.XmlToJsonObject(result);

            r= Utils.fillPOJO(jsonObj.toString(),RequstKeyPOJO.class);
            Log.e("r", String.valueOf(r.getSoapEnvelope()));
         if(r.getSoapEnvelope()!=null){
             presenter.getModel().setRequstKey(String.valueOf(r.getSoapEnvelope().getSoapBody().getEncryptResponse().getEncryptResult()));
         }

        }

        @Override
        protected void onPreExecute() {}

        @Override
        protected void onProgressUpdate(Void... values) {}
    }
}
