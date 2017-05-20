package com.example.listview_customadapter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DongSinhVien extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dong_sinh_vien);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dong_sinh_vien, menu);
		return true;
	}

}
