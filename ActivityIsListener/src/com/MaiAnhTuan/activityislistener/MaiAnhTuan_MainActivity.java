package com.MaiAnhTuan.activityislistener;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MaiAnhTuan_MainActivity extends Activity implements OnClickListener {

	EditText Ten, Cao, Nang, BMI, ChanDoan;
	Button tinhBMI;			
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mai_anh_tuan__main);
        Ten = (EditText) findViewById(R.id.editTen);
        Cao = (EditText) findViewById(R.id.editCao);
        Nang = (EditText) findViewById(R.id.editNang);
        BMI = (EditText) findViewById(R.id.editBMI);
        ChanDoan = (EditText) findViewById(R.id.editCD);
        tinhBMI = (Button) findViewById(R.id.btnBMI);
        tinhBMI.setOnClickListener(this);
    }
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mai_anh_tuan__main, menu);
        return true;
    }


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		try{
		double Caoo = Double.parseDouble(Cao.getText()+"");
		double Nangg = Double.parseDouble(Nang.getText()+"");
		double BMIi=Nangg/Math.pow(Caoo, 2);
		String chandoan="";
		if(BMIi>35) {
     	   chandoan="Người béo phì độ III";
        }
        else if(BMIi>=30) {
     	   chandoan="Người béo phì độ II";
        }
        else if(BMIi>=25) {
     	   chandoan="Người béo phì độ I";
        }
        else if(BMIi>=18) {
     	   chandoan="Người bình thường";
        }else{
     	   chandoan="Người gầy";
        }
		DecimalFormat dcf = new DecimalFormat("#.0");
     	BMI.setText(dcf.format(BMIi)+"");
     	ChanDoan.setText(chandoan);
     }  
	
	  catch(Exception e)  
      {  
      	BMI.setText("Lỗi đầu vào");
   	   ChanDoan.setText("Lỗi đầu vào");
      } 
	}    
	}
