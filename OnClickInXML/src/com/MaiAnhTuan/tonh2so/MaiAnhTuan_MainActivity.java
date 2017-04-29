package com.MaiAnhTuan.tonh2so;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MaiAnhTuan_MainActivity extends Activity {

	EditText eda, edb;
	Button btnKQ;
	TextView tvkq;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mai_anh_tuan__main);       
    } 
    public void btn_tong2so(View v)
    {
    	try{    		    	
	    	eda = (EditText)findViewById(R.id.txtA);
	    	edb = (EditText)findViewById(R.id.txtB);
	    	tvkq = (TextView)findViewById(R.id.txtKQ);
	    	int soa = Integer.parseInt(eda.getText().toString());    	
	    	int sob = Integer.parseInt(edb.getText().toString());
	    	tvkq.setText((soa+sob)+"");    
    	}
    	catch(Exception e){
    		tvkq.setText("Error Input");
    	}
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mai_anh_tuan__main, menu);
        return true;
    }
    
}
