package com.example.tp1_xml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        Intent intent = getIntent();

        String telNum = intent.getStringExtra("mTel");

        TextView callNum = (TextView)findViewById(R.id.callNum);
        callNum.setText(telNum);

        Button callButton = (Button)findViewById(R.id.callButton);
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", telNum, null));
                startActivity(call);
            }
        });
    }
}