package com.example.zebatabassum.cs125finalproject;

import android.os.AsyncTask;

import org.json.*;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class getQuestion extends AsyncTask<Void,Void,Void>{
    String data = "";
    String dataParsed = "";
    String singleParsed = "";
    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url = new URL("https://opentdb.com/api.php?amount=10&category=18&type=boolean");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while(line != null) {
                line = bufferedReader.readLine();
                data = data + line;
            }

            JSONObject arr = new JSONObject(data);
            //JSONArray results = (JSONArray) (arr.get("results"));
            String qq ="";
            JSONArray jsonarray = (JSONArray) (arr.get("results"));
            for (int i = 0; i < jsonarray.length(); i++) {
                JSONObject jsonobject = jsonarray.getJSONObject(i);
                 qq= jsonobject.getString("question");
                //String url = jsonobject.getString("url");
            }
            //singleParsed =  results.get(4);
            //JSONObject tst = new JSONObject(results);
            Log.d("TAG", qq);
            dataParsed = qq;
//            for(int i = 0; i <arr.length(); i++) {
//                JSONObject obj = (JSONObject) arr.get(i);
//                singleParsed = "Category: " + obj.get("results").get("question");
//                dataParsed = dataParsed + singleParsed + "\n";
//            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        CompSci.data.setText(this.dataParsed);
    }
}
