package com.example.asm_adroi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class loggin extends AppCompatActivity {

EditText edtname;
EditText edtmk;
Button btndangnhap;
Button btndangki;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loggin);
    edtname=findViewById(R.id.edtuser);
    edtmk=findViewById(R.id.edtpass);
    String name=getIntent().getStringExtra(register.KEY_USERNAME);
    String mk=getIntent().getStringExtra(register.KEY_PASSWORD);
    edtname.setText(name);
    edtmk.setText(mk);
    btndangnhap=findViewById(R.id.btndangNhap);
    btndangki=findViewById(R.id.btndangKi);
    btndangki.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent chuyendk=new Intent(loggin.this,register.class);
            startActivity(chuyendk);
        }
    });
    btndangnhap.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent chuyentc=new Intent(loggin.this,trangChu.class);
            startActivity(chuyentc);

        }
    });


    }
}