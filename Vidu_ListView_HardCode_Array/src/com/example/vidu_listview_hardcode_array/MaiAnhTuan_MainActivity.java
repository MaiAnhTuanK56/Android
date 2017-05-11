package com.example.vidu_listview_hardcode_array;

	import android.os.Bundle;
	import android.app.Activity;
	import android.view.View;
	import android.widget.AdapterView;
	import android.widget.ArrayAdapter;
	import android.widget.ListView;
	import android.widget.TextView;

	public class MaiAnhTuan_MainActivity extends Activity {

		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_mai_anh_tuan__main);
			final String arr[]={"Teo","Ty","Bin","Bo","Hu","Sky"};
			ListView lv=(ListView) findViewById(R.id.lvperson);
			ArrayAdapter<String>adapter=new ArrayAdapter<String>
				(this, android.R.layout.simple_list_item_1, arr);
			lv.setAdapter(adapter);
			final TextView txt=(TextView) findViewById(R.id.txtselection);
			lv.setOnItemClickListener(
					new AdapterView.OnItemClickListener() {
						public void onItemClick(AdapterView<?> arg0,
								View arg1, 
								int arg2,
								long arg3) {
							txt.setText("position :"+arg2+" ; value ="+arr[arg2]);
						}
					});
		}
	}

