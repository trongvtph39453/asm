package com.example.asm_adroi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
    public static String KEY_USERNAME="user_name";
    public static  String KEY_PASSWORD="password";
    EditText edtusenname;
    EditText edtpassword;
    EditText edtnlpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button btndangnhapdk=findViewById(R.id.btndangnhapdk);
        Button btntrovedk=findViewById(R.id.btntrovedk);
        edtusenname=findViewById(R.id.edtuserdk);
        edtpassword=findViewById(R.id.edtpassworđk);
        edtnlpassword=findViewById(R.id.edtnlpassworđk);
        btndangnhapdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ten=edtusenname.getText().toString();
                String mk=edtpassword.getText().toString();
                String nlmk=edtnlpassword.getText().toString();
                if(ten==null||ten.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"cần nhập user",Toast.LENGTH_SHORT).show();
                } else if(mk==null||mk.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"cần nhập mk",Toast.LENGTH_SHORT).show();
                } else if(nlmk==null||nlmk.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"cần nhập lại mk",Toast.LENGTH_SHORT).show();
                } else if (!nlmk.equals(mk)) {
                    Toast.makeText(getApplicationContext(),"mk không giống nhau",Toast.LENGTH_SHORT).show();
                } else {
                    Intent chuyendn=new Intent(getApplicationContext(),loggin.class);
                    chuyendn.putExtra(KEY_USERNAME,ten);
                    chuyendn.putExtra(KEY_PASSWORD,mk);
                    startActivity(chuyendn);
                }
            }
        });

    }
}