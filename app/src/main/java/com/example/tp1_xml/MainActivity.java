package com.example.tp1_xml;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRegister = (Button)findViewById(R.id.registerButton);
        /**Pour TP1 exo 5*/
        /*buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder validate = new AlertDialog.Builder(MainActivity.this);
                validate.setTitle(R.string.dialog_text);

                validate.setPositiveButton(R.string.dialog_ok, null);

                validate.setNegativeButton(R.string.dialog_no, null);

                AlertDialog valDialog = validate.create();
                valDialog.show();


            }
        });*/
    }

    public void sendMessage (View v){
        Intent intent = new Intent(this, RegisterActivity.class);
        EditText name, surname, age, skill, tel;
        name = (EditText) findViewById(R.id.editName);
        surname = (EditText) findViewById(R.id.editSurname);
        age = (EditText) findViewById(R.id.editAge);
        skill = (EditText) findViewById(R.id.editSkill);
        tel = (EditText) findViewById(R.id.editPhone);

        String messageName = name.getText().toString();
        String messageSurname = surname.getText().toString();
        String messageAge = age.getText().toString();
        String messageSkill = skill.getText().toString();
        String messageTel = tel.getText().toString();

        intent.putExtra("valName", messageName);
        intent.putExtra("valSurname", messageSurname);
        intent.putExtra("valAge", messageAge);
        intent.putExtra("valSkill", messageSkill);
        intent.putExtra("valTel", messageTel);

        startActivity(intent);
    }
}