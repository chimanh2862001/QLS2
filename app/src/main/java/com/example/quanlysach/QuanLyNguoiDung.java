package com.example.quanlysach;

import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

import Moder.NguoiDung;
import Moder.NguoiDungAdapter;
import SQL.MySQL;
import SQL.NguoiDungDao;

public class QuanLyNguoiDung extends AppCompatActivity {
      ListView Lv;
      MySQL mySQL;
 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quan_ly_nguoi_dung);
        Lv=findViewById(R.id.Lv);
        mySQL=new MySQL(this);
        setTitle("Quản Lý Người Dùng");
        NguoiDungDao nguoiDungDao=new NguoiDungDao(mySQL);
        List<NguoiDung>    nguoiDungList=nguoiDungDao.getAll();
        NguoiDungAdapter nguoiDungAdapter=new NguoiDungAdapter(nguoiDungList);
        Lv.setAdapter(nguoiDungAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu1,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
              if (item.getItemId()==R.id.them){
                  final AlertDialog.Builder builder=new AlertDialog.Builder(this);
                  View view= LayoutInflater.from(this).inflate(R.layout.adduser,null);
                  builder.setView(view);
                  final EditText edtHoten=view.findViewById(R.id.edtHoten);
                  final EditText edtTaikhoan=view.findViewById(R.id.edtTaiKhoan);
                  final EditText edtPass=view.findViewById(R.id.edtPass);
                  final EditText edtSDT=view.findViewById(R.id.edtSDT);
//                  edtSDT.getText().toString();
//                  int a=Integer.parseInt(   edtSDT.getText().toString();)
                  Button button5=view.findViewById(R.id.button5);
                  final AlertDialog alertDialog=builder.show();

                  button5.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          NguoiDung nguoiDung=new NguoiDung();
                          nguoiDung.setHoten(edtHoten.getText().toString().trim());
                          nguoiDung.setTaiKhoan(edtTaikhoan.getText().toString().trim());
                          nguoiDung.setPassword(edtPass.getText().toString().trim());
                          nguoiDung.setPhone(Integer.parseInt(edtSDT.getText().toString().trim()));

                          NguoiDungDao nguoiDungDao=new NguoiDungDao(mySQL);
                           nguoiDungDao.addND(nguoiDung);
                          List<NguoiDung>    nguoiDungList=nguoiDungDao.getAll();
                          NguoiDungAdapter nguoiDungAdapter=new NguoiDungAdapter(nguoiDungList);
                          Lv.setAdapter(nguoiDungAdapter);
                          Log.e("ND","Thanh Cong");

                            alertDialog.dismiss();


                      }
                  });

              }else if (item.getItemId()==R.id.doimatkhau){

              }else if(item.getItemId()==R.id.dangxuat){

        }
        return super.onOptionsItemSelected(item);
    }
    public  void checkIsemty(String data,EditText edt){
         if (data.isEmpty()){
                  edt.setError("Mời Bạn Nhập Dữ Liệu");
                  return;
         }

    }
}