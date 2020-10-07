package SQL;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.quanlysach.TheLoai;

import java.util.ArrayList;
import java.util.List;

import Moder.Sach;
import Moder.TheLoaiClass;

public class TheLoaiDao {
    MySQL mySQL;

    public TheLoaiDao(MySQL mySQL) {
        this.mySQL = mySQL;
    }

    public void addTheLoai(TheLoaiClass theLoaiClass){
        ContentValues contentValues=new ContentValues();
        SQLiteDatabase sqLiteDatabase=mySQL.getWritableDatabase();
        contentValues.put("maTL",theLoaiClass.getMaTl());
        contentValues.put("tenTL",theLoaiClass.getTenTl());
        contentValues.put("vitri",theLoaiClass.getVitru());
        sqLiteDatabase.insert("Type",null,contentValues);
    }

    public List<TheLoaiClass> getAll(){
        List<TheLoaiClass> theLoaiClassList=new ArrayList<>();
        SQLiteDatabase sqLiteDatabase=mySQL.getWritableDatabase();
        String get_all="Select*from Type";
        Cursor cursor=sqLiteDatabase.rawQuery(get_all,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            String maTL,tenTL,vitri;
            maTL=cursor.getString(0);
            tenTL=cursor.getString(1);
            vitri=cursor.getString(2);
            cursor.moveToNext();
            TheLoaiClass theLoaiClass=new TheLoaiClass(maTL,tenTL,vitri);
            theLoaiClassList.add(theLoaiClass);
        }
        cursor.close();
        return theLoaiClassList;
    }

    public void updateTheLoai(TheLoaiClass theLoaiClass){
        ContentValues contentValues=new ContentValues();
        SQLiteDatabase sqLiteDatabase=mySQL.getWritableDatabase();
        contentValues.put("maTL",theLoaiClass.getMaTl());
        contentValues.put("tenTL",theLoaiClass.getTenTl());
        sqLiteDatabase.update("Type",contentValues,"maTL=?",new String[]{theLoaiClass.getMaTl()});
  }
  public  void  deleteTheLoai(String maTL){
      SQLiteDatabase sqLiteDatabase=mySQL.getWritableDatabase();
      sqLiteDatabase.delete("Type","maTL=?",new String[]{maTL});

  }
}
