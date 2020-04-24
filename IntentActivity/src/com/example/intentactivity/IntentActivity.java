package com.example.intentactivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IntentActivity extends Activity {
	TextView msg;
	EditText et1,et2;
	Button submit;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        et1=(EditText) findViewById(R.id.editText1);
        et2=(EditText) findViewById(R.id.editText2);
        submit=(Button) findViewById(R.id.button1);
        submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String s1,s2;
				s1=et1.getText().toString();
				s2=et2.getText().toString();
				Intent i=new Intent(IntentActivity.this,TwoActivity.class);
				i.putExtra("fnm", s1);
				i.putExtra("snm", s2);
				startActivity(i);
			}
		});
     }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.intent, menu);
        return true;
    }
    
}
