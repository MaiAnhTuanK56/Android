package com.example.internalstorage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MaiAnhTuan_MainActivity extends Activity {

	Button read;
	EditText editdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mai_anh_tuan__main);
        read = (Button) findViewById(R.id.btnreaddata);
        editdata = (EditText) findViewById(R.id.editdata);
        read.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				readData();
			}
		});
    }
    
    public void readData(){    	
    	String data;
    	InputStream in = getResources().openRawResource(R.drawable.myfile);
    	InputStreamReader inreader = new InputStreamReader(in);
    	BufferedReader bufreader = new BufferedReader(inreader);
    	StringBuilder builder = new StringBuilder();
    	if(in!=null){
    		try{
    			while((data=bufreader.readLine())!=null){
    				builder.append(data);
    				builder.append("\n");
    			}
    			in.close();
    			editdata.setText(builder.toString());
    		}
    		catch(IOException ex){
    			Log.e("ERROR", ex.getMessage());
    		}
    	}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mai_anh_tuan__main, menu);
        return true;
    }
    
}
