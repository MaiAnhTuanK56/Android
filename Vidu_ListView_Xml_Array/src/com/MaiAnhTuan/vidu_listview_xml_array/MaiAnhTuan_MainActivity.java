package com.MaiAnhTuan.vidu_listview_xml_array;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MaiAnhTuan_MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mai_anh_tuan__main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mai_anh_tuan__main, menu);
        return true;
    }
    
}
