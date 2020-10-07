package SQL;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import Moder.HoaDonChitietClass;

public class HDCTDao {
    MySQL mySQL;

    public HDCTDao(MySQL mySQL) {
        this.mySQL = mySQL;
    }


    public void addHDCT(HoaDonChitietClass hoaDonChitietClass){
        ContentValues contentValues=new ContentValues();
        SQLiteDatabase sqLiteDatabase=mySQL.getWritableDatabase();
        contentValues.put("maSach",hoaDonChitietClass.getMaSach());
        contentValues.put("maHoadon",hoaDonChitietClass.getMaHoaDon());
        contentValues.put("maHDCT",hoaDonChitietClass.getMaHoaDon());
        contentValues.put("soluong",hoaDonChitietClass.getSoluongMua());
        contentValues.put("tongTien",hoaDonChitietClass.getTongTien());
        sqLiteDatabase.insert("HoaDonChiTiet",null,contentValues);

    }

    public  List<HoaDonChitietClass> getAll(){
        List<HoaDonChitietClass> hoaDonChitietClassList =new ArrayList<>();
        SQLiteDatabase sqLiteDatabase=mySQL.getWritableDatabase();
        String get_all="Select*from HoaDonChiTiet";
        Cursor cursor=sqLiteDatabase.rawQuery(get_all,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            String maSach,maHoadon,maHDCT;
            int soluong,tongTien;
            maSach=cursor.getString(0);
            maHoadon=cursor.getString(1);
            maHDCT=cursor.getString(2);
            soluong=cursor.getInt(3);
            tongTien=cursor.getInt(4);
            cursor.moveToNext();
            HoaDonChitietClass hoaDonChitietClass=new HoaDonChitietClass(maHDCT,maHoadon,maSach,soluong,tongTien);
            hoaDonChitietClassList.add(hoaDonChitietClass);
        }
        cursor.close();
        return hoaDonChitietClassList;
    }

    public void updateHDCT(HoaDonChitietClass hoaDonChitietClass){
        ContentValues contentValues=new ContentValues();
        SQLiteDatabase sqLiteDatabase=mySQL.getWritableDatabase();
        contentValues.put("maSach",hoaDonChitietClass.getMaSach());
        contentValues.put("maHoadon",hoaDonChitietClass.getMaHoaDon());
        contentValues.put("maHDCT",hoaDonChitietClass.getMaHoaDon());
        contentValues.put("soluong",hoaDonChitietClass.getSoluongMua());
        contentValues.put("tongTien",hoaDonChitietClass.getTongTien());
        sqLiteDatabase.update("HoaDonChiTiet",contentValues,"maHDCT=?",new String[]{hoaDonChitietClass.getMaHDCT()});
    }

    public void delte(String maHDCT){
        ContentValues contentValues=new ContentValues();
        SQLiteDatabase sqLiteDatabase=mySQL.getWritableDatabase();
        sqLiteDatabase.delete("HoaDonChiTiet","maHDCT=?",new String[]{maHDCT});
    }
}
