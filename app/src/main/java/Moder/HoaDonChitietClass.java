package Moder;

public class HoaDonChitietClass {
      String maHDCT;
      String maHoaDon;
      String maSach;
      int soluongMua;
      int tongTien;

    public int getTongTien() {
        return tongTien;
    }

    public HoaDonChitietClass(String maHDCT, String maHoaDon, String maSach, int soluongMua, int tongTien) {
        this.maHDCT = maHDCT;
        this.maHoaDon = maHoaDon;
        this.maSach = maSach;
        this.soluongMua = soluongMua;
        this.tongTien = tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public String getMaHDCT() {
        return maHDCT;
    }

    public void setMaHDCT(String maHDCT) {
        this.maHDCT = maHDCT;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public int getSoluongMua() {
        return soluongMua;
    }

    public void setSoluongMua(int soluongMua) {
        this.soluongMua = soluongMua;
    }
}
