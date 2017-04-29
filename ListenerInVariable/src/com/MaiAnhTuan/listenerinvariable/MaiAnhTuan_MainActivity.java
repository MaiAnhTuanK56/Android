package com.MaiAnhTuan.listenerinvariable;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

public class MaiAnhTuan_MainActivity extends Activity {

	EditText F, C;
	Button bF, bC, bCl;	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mai_anh_tuan__main);
        F = (EditText) findViewById(R.id.editF);
        C = (EditText) findViewById(R.id.editC);
        bF = (Button) findViewById(R.id.btnF);
        bC = (Button) findViewById(R.id.btnC);
        bCl = (Button) findViewById(R.id.btnCl);
        bF.setOnClickListener(OCL);
        bC.setOnClickListener(OCL);
        bCl.setOnClickListener(OCL);
    }
    private OnClickListener OCL = new OnClickListener(){
    	@Override
    	public void onClick(View v) {    		    		
    		if(v == bF){	
    			try{    				
    				double doC = Double.parseDouble(C.getText()+"");
    				F.setText((doC*9/5)+32+"");  			
    			}
    			catch(Exception e){
    				F.setText("Lỗi đầu vào");
    			}
    		}
    		if(v == bC){
	    			try{
	    				double doF = Double.parseDouble(F.getText()+"");
	    				C.setText((doF-32)*5/9+"");	    			
	    			}
	    			catch(Exception e){
	    				C.setText("Lỗi đầu vào");
	    			}
    			}
    		if(v == bCl){
    				F.setText("");
    				C.setText("");
    				F.requestFocus();
    			}    				    			
    		}   			    	
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mai_anh_tuan__main, menu);
        return true;
    }
}   

