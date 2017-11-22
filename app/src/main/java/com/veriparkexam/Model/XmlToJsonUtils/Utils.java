package com.veriparkexam.Model.XmlToJsonUtils;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

/**
 * Created by Sina on 11/1/2017.
 */

public class Utils {
    public static JSONObject XmlToJsonObject(String XmlString){

        try {
            JSONObject jsonObj = null;
            jsonObj = XML.toJSONObject(XmlString);
            return jsonObj;

        } catch (JSONException e) {
            Log.e("JSON exception", e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    public static <T> T fillPOJO(String json, Class<T> classOfT){
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(json,classOfT);
    }

}
