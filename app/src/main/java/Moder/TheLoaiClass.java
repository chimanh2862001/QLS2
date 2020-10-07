package Moder;

public class TheLoaiClass {
    String maTl;
    String tenTl;
    String vitru;

    public TheLoaiClass(String maTl, String tenTl) {
        this.maTl = maTl;
        this.tenTl = tenTl;
    }

    public TheLoaiClass(String maTl, String tenTl, String vitru) {
        this.maTl = maTl;
        this.tenTl = tenTl;
        this.vitru = vitru;
    }

    public String getVitru() {
        return vitru;
    }

    public void setVitru(String vitru) {
        this.vitru = vitru;
    }

    public String getMaTl() {
        return maTl;
    }

    public void setMaTl(String maTl) {
        this.maTl = maTl;
    }

    public String getTenTl() {
        return tenTl;
    }

    public void setTenTl(String tenTl) {
        this.tenTl = tenTl;
    }
}
