package com.example.asm_adroi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class trangChu extends AppCompatActivity {
Button btnphongBan;
Button btnnhavien;
Button btnthoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);
        btnphongBan=findViewById(R.id.btnphongBan);
        btnnhavien=findViewById(R.id.btnnhanVien);
        btnthoat=findViewById(R.id.btnThoat);
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent out=new Intent(trangChu.this,phongBan.class);
                finish();
            }
        });
        btnnhavien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chuyennv=new Intent(trangChu.this,nhanVien.class);
                startActivity(chuyennv);
            }
        });
        btnphongBan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chuyenphb=new Intent(trangChu.this,phongBan.class);
                startActivity(chuyenphb);
            }
        });
    }
}