package com.MaiAnhTuan.phep_tinh;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MaiAnhTuan_MainActivity extends Activity {

	EditText A, B, KQ;
	RadioButton cong, tru, nhan, chia;
	Button thuchien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mai_anh_tuan__main);
        A = (EditText) findViewById(R.id.editText1);
        B = (EditText) findViewById(R.id.editText2);
        KQ = (EditText) findViewById(R.id.editText3);
        cong = (RadioButton) findViewById(R.id.radio0);
        tru = (RadioButton) findViewById(R.id.radio1);
        nhan = (RadioButton) findViewById(R.id.radio2);
        chia = (RadioButton) findViewById(R.id.radio3);
        thuchien = (Button) findViewById(R.id.button1);
        thuchien.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View e) {
				// TODO Auto-generated method stub
		  		double a = Double.parseDouble(A.getText()+"");
	    		double b = Double.parseDouble(B.getText()+"");
				if(cong.isChecked())
				{
					KQ.setText((a+b)+"");
				}
				if(tru.isChecked())
				{
					KQ.setText((a-b)+"");
				}
				if(nhan.isChecked())
				{
					KQ.setText((a*b)+"");
				}
				if(chia.isChecked())
				{
					if(b == 0)
						KQ.setText("Nhập b khác 0");												
					else					
						KQ.setText((a/b)+"");			
				}
			}
		});
    }    
 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mai_anh_tuan__main, menu);
        return true;
    }
    
}
