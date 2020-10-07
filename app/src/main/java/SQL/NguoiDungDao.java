package SQL;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import Moder.NguoiDung;

public class NguoiDungDao {
    MySQL mySQL;

    public NguoiDungDao(MySQL mySQL) {
        this.mySQL = mySQL;
    }

    public  void addND(NguoiDung nguoiDung){
        SQLiteDatabase sqLiteDatabasem=mySQL.getReadableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("username",nguoiDung.getTaiKhoan());
        contentValues.put("hoten",nguoiDung.getHoten());
        contentValues.put("SDT",nguoiDung.getPhone());
        contentValues.put("password",nguoiDung.getPassword());

        sqLiteDatabasem.insert("User",null,contentValues);

    }
    public List<NguoiDung> getAll(){
        List<NguoiDung> nguoiDungList=new ArrayList<>();

        String get_all="Select*from User";
        Cursor cursor=mySQL.getReadableDatabase().rawQuery(get_all,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            String taikhoan,pass,hoten;
            int phone;
            taikhoan=cursor.getString(0);
            pass=cursor.getString(1);
            hoten=cursor.getString(2);
            phone=cursor.getInt(3);
            cursor.moveToNext();
            NguoiDung nguoiDung=new NguoiDung(taikhoan,pass,hoten,phone);
            nguoiDungList.add(nguoiDung);

        }
         cursor.close();
        return nguoiDungList;

    }
    public void updateND(NguoiDung nguoiDung){
        SQLiteDatabase sqLiteDatabase=mySQL.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("username",nguoiDung.getTaiKhoan());
        contentValues.put("hoten",nguoiDung.getHoten());
        contentValues.put("SDT",nguoiDung.getPhone());
        contentValues.put("password",nguoiDung.getPassword());
        sqLiteDatabase.update("User",contentValues,"userNane=?",new String[]{nguoiDung.getTaiKhoan()});


    }
    public void deleteNd(String user){
        SQLiteDatabase sqLiteDatabase=mySQL.getWritableDatabase();
        sqLiteDatabase.delete("User","user=?",new String[]{user});

    }
}
