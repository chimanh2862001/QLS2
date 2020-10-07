package SQL;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import Moder.HoaDonclass;

public class HoaDonDao {
    MySQL mySQL;

    public HoaDonDao(MySQL mySQL){
        this.mySQL=mySQL;
    }

    public  void addHoaDonDao(HoaDonclass hoaDonclass){
        ContentValues contentValues=new ContentValues();
        SQLiteDatabase sqLiteDatabase=mySQL.getWritableDatabase();
        contentValues.put("maHoaDon",hoaDonclass.getMaHoaDon());
        contentValues.put("date",hoaDonclass.getDate());
        sqLiteDatabase.insert("HoaDon",null,contentValues);
    }

    public List<HoaDonclass> getAll(){
        List<HoaDonclass> hoaDonclassList=new ArrayList<>();
        SQLiteDatabase sqLiteDatabase=mySQL.getWritableDatabase();
        String getall="Select*from HoaDon";
        Cursor cursor=sqLiteDatabase.rawQuery(getall,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            String maHoadon,date;
            maHoadon=cursor.getString(0);
            date=cursor.getString(1);
            cursor.moveToNext();
            HoaDonclass hoaDonclass=new HoaDonclass(maHoadon,date);
            hoaDonclassList.add(hoaDonclass);
        }
        cursor.close();
        return  hoaDonclassList;
    }
    public void updateHoaDon(HoaDonclass hoaDonclass){
        ContentValues contentValues=new ContentValues();
        SQLiteDatabase sqLiteDatabase=mySQL.getWritableDatabase();
        contentValues.put("maHoaDon",hoaDonclass.getMaHoaDon());
        contentValues.put("date",hoaDonclass.getDate());
        sqLiteDatabase.update("HoaDon",contentValues,"maHoaDon=?",new String[]{hoaDonclass.getMaHoaDon()});
    }

    public void  delteHoaDon(String maHoaDon){

        SQLiteDatabase sqLiteDatabase=mySQL.getWritableDatabase();
        sqLiteDatabase.delete("HoaDon","maHoaDon=?",new String[]{maHoaDon});
    }
}
