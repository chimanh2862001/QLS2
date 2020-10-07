package SQL;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class MySQL extends SQLiteOpenHelper {
    public MySQL(@Nullable Context context) {
        super(context, "MyData", null, 1);
    }
 ///////////tao bang
    @Override
    public void onCreate(SQLiteDatabase db) {
     String table_user="Create table User("+"username varchar(20) Primary Key,"+"password varchar(20)," +
             ""+" hoten nvarchar(30),"+"SDT int )";

     String table_book="Create table Book("+"Masach varchar(15) primary key ,"+"maTheLoai varchar(15),"+"TacGia nvarchar(30)," +
             ""+"NXB nvarchar(50),"+"GiaBan INTEGER,"+"SoLuong int,"+"TheLoai text)";

     String table_theLoai="Create table Type("+"maTheLoai varchar(15)  primary key,"+"TentheLoai text,"+"Vitri text)";

     String talbe_hoadon="Create table HoaDon("+"maHoadon varchar(15) primary key,"+"NgayMua date )";

     String table_Hoadonchitiet="Create table HoaDonChiTiet("+"maHonDonChiTiet varchar(15) primary key,"+"maHodon varchar(15),"+"maSach varchar(15),"+"soLuongMua int,"+" tongTien int)";

        db.execSQL(table_user);
        db.execSQL(table_book);
        db.execSQL(table_Hoadonchitiet);
        db.execSQL(table_theLoai);
        db.execSQL(talbe_hoadon);
//        db.execSQL(table_Hoadonchitiet);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
