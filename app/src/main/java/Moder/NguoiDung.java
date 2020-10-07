package Moder;

public class NguoiDung {
         String taiKhoan,password;
         String hoten;
          int phone;

    public NguoiDung(String taiKhoan, String password, String hoten, int phone) {
        this.taiKhoan = taiKhoan;
        this.password = password;
        this.hoten = hoten;
        this.phone = phone;
    }

    public NguoiDung() {
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
