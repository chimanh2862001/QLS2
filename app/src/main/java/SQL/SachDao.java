package SQL;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import Moder.HoaDonclass;
import Moder.Sach;

public class SachDao {
    MySQL mySQL;

    public SachDao(MySQL mySQL) {
        this.mySQL = mySQL;
    }

    public void addSach(Sach sach){
        ContentValues contentValues=new ContentValues();
        SQLiteDatabase sqLiteDatabase=mySQL.getWritableDatabase();
        contentValues.put("maSach",sach.getMaSach());
        contentValues.put("soLuong",sach.getSoluong());
        contentValues.put("giaSach",sach.getGia());
        contentValues.put("NXB",sach.getNXB());
        contentValues.put("tenSach",sach.getTen());
        contentValues.put("tacgia",sach.getTacGia());
        sqLiteDatabase.insert("Book",null,contentValues);
    }

    public List<Sach> getAll(){
        List<Sach> sachList=new ArrayList<>();
        SQLiteDatabase sqLiteDatabase=mySQL.getWritableDatabase();
        String get_all="Select*from Book";
        Cursor cursor=sqLiteDatabase.rawQuery(get_all,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            String maSach,tenSach,NXB,tacGia,theloai;
            int soLuong,gia;

            maSach=cursor.getString(0);
            tenSach=cursor.getString(1);
            tacGia=cursor.getString(2);
            NXB=cursor.getString(3);
            soLuong=cursor.getInt(4);
            gia=cursor.getInt(5);
            theloai=cursor.getString(6);
            cursor.moveToNext();
            Sach sach=new Sach(tenSach,NXB,theloai,gia,maSach,soLuong,tacGia);
            sachList.add(sach);
        }
        cursor.close();
        return  sachList;
    }
    public void updateSach(Sach sach){
        ContentValues contentValues=new ContentValues();
        SQLiteDatabase sqLiteDatabase=mySQL.getWritableDatabase();
        contentValues.put("maSach",sach.getMaSach());
        contentValues.put("soLuong",sach.getSoluong());
        contentValues.put("giaSach",sach.getGia());
        contentValues.put("NXB",sach.getNXB());
        contentValues.put("tenSach",sach.getTen());
        contentValues.put("tacgia",sach.getTacGia());
        sqLiteDatabase.update("Book",contentValues,"maSach=?",new String[]{sach.getMaSach()});
    }

    public void  deleteSAch(String maSach){
        SQLiteDatabase sqLiteDatabase=mySQL.getWritableDatabase();
        sqLiteDatabase.delete("Book","maSach=?",new String[]{maSach});

    }
}
