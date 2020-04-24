package com.example.intentactivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class TwoActivity extends Activity {
	TextView tv;
	String data,f,s;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two);
		f=getIntent().getStringExtra("fnm");
		s=getIntent().getStringExtra("snm");
		data="Welcome "+f+" "+s;
		tv=(TextView) findViewById(R.id.textView2);
		tv.setText(data);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.two, menu);
		return true;
	}

}
