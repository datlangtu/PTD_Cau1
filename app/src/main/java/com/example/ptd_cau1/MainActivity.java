package com.example.ptd_cau1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt_taikhoan , edt_matkhau;
    CheckBox cb ;
    Button btn_dangnhap;
    TextView tv_thongbao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_taikhoan = findViewById(R.id.edt_taikhoan);
        edt_matkhau = findViewById(R.id.edt_matkhau);
        cb = findViewById(R.id.cb);
        btn_dangnhap = findViewById(R.id.btn_dangnhap);

        tv_thongbao = findViewById(R.id.tv_thongbao);
        btn_dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cb.isChecked()){
                    tv_thongbao.setText("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu");
                }else{
                    tv_thongbao.setText("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu");
                }
            }
        });

    }
}
