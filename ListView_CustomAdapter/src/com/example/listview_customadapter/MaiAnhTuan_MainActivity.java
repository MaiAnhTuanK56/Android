package com.example.listview_customadapter;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class MaiAnhTuan_MainActivity extends Activity {

	ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mai_anh_tuan__main);
        lv = (ListView) findViewById(R.id.listViewSinhVien);
        ArrayList<SinhVien> mangsinhvien = new ArrayList<SinhVien>();
        mangsinhvien.add(new SinhVien("Nguyen Van Tuan" , 1996));
        mangsinhvien.add(new SinhVien("Nguyen Van Hoc" , 1995));
        mangsinhvien.add(new SinhVien("Nguyen Van Tung" , 1991));
        mangsinhvien.add(new SinhVien("Nguyen Van Viet" , 2989));
        mangsinhvien.add(new SinhVien("Nguyen Van Luan" , 2000));
        mangsinhvien.add(new SinhVien("Nguyen Van Quang" , 2009));
        mangsinhvien.add(new SinhVien("Nguyen Van Phap" , 2003));
        
        ListAdapter adapter = new ListAdapter(
        		MaiAnhTuan_MainActivity.this,
        		R.layout.activity_dong_sinh_vien,
        		mangsinhvien
        		);
       lv.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mai_anh_tuan__main, menu);
        return true;
    }
    
}
