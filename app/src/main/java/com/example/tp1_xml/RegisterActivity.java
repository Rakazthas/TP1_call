package com.example.tp1_xml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    TextView vName, vSurname, vAge, vSkill, vTel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Intent intent = getIntent();

        String valName = intent.getStringExtra("valName");
        String valSurname = intent.getStringExtra("valSurname");
        String valAge = intent.getStringExtra("valAge");
        String valSkill = intent.getStringExtra("valSkill");
        String valTel = intent.getStringExtra("valTel");

        vName = (TextView)findViewById(R.id.validateName);
        vSurname = (TextView)findViewById(R.id.validateSurname);
        vAge = (TextView)findViewById(R.id.validateAge);
        vSkill = (TextView)findViewById(R.id.validateSkill);
        vTel = (TextView)findViewById(R.id.validateTel);

        vName.setText(valName);
        vSurname.setText(valSurname);
        vAge.setText(valAge);
        vSkill.setText(valSkill);
        vTel.setText(valTel);

    }

    public void call(View v){
        Intent intent = new Intent(this, CallActivity.class);

        TextView telNum = (TextView) findViewById(R.id.validateTel);
        String mTel = telNum.getText().toString();
        intent.putExtra("mTel", mTel);

        startActivity(intent);
    }

    public void cancel(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}