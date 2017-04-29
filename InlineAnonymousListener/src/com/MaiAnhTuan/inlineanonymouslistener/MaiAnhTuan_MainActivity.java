package com.MaiAnhTuan.inlineanonymouslistener;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MaiAnhTuan_MainActivity extends Activity {
	EditText ed1;
	Button bt1;
	TextView tv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mai_anh_tuan__main);		
		ed1 = (EditText) findViewById(R.id.ednam);
		bt1 = (Button) findViewById(R.id.btnCD);
		tv1 = (TextView) findViewById(R.id.textView4);
		bt1.setOnClickListener(new OnClickListener() {					
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				try{
					int nam = Integer.parseInt(ed1.getText()+"");
					int can, chi;
					can = nam%10;
					chi = nam%12;
					String StrCan ="", StrChi="", amlich="";		
					
							switch(can){
							case 0: StrCan="Canh";	break;	
							case 1: StrCan="Tân";	break;
							case 2: StrCan="Nhâm";	break;
							case 3: StrCan="Quý";	break;
							case 4: StrCan="Giáp";	break;
							case 5: StrCan="Ất";	break;
							case 6: StrCan="Bính";	break;
							case 7: StrCan="Đinh";	break;
							case 8: StrCan="Mậu";	break;
							case 9: StrCan="Kỳ";	break;	
							}
							switch(chi){
							case 0: StrChi="Thân";	break;
							case 1: StrChi="Dậu";	break;
							case 2: StrChi="Tuất";	break;
							case 3: StrChi="Hợi";	break;
							case 4: StrChi="Tý";	break;
							case 5: StrChi="Sửu";	break;
							case 6: StrChi="Dần";	break;
							case 7: StrChi="Mẹo";	break;
							case 8: StrChi="Thìn";	break;
							case 9: StrChi="Tỵ";	break;
							case 10: StrChi="Ngọ";	break;
							case 11: StrChi="Mùi";	break;
							}
					amlich=StrCan+" "+StrChi;
					tv1.setText(amlich);				
				}
			
			catch(Exception e)
			{
				tv1.setText("Lỗi đầu vào");
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
