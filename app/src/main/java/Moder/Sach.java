package Moder;

public class Sach {
    public String ten,NXB,theloai;
    public int gia;
    public String maSach;
    public int soluong;
    String tacGia;

    public Sach(String tenSach, String nxb, int gia, String maSach, int soLuong, String tacGia, String theloai) {
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public Sach(String ten, String NXB, String theloai, int gia, String maSach, int soluong, String tacGia) {
        this.ten = ten;
        this.NXB = NXB;
        this.theloai = theloai;
        this.gia = gia;
        this.maSach = maSach;
        this.soluong = soluong;
        this.tacGia = tacGia;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
