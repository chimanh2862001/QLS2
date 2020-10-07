package Moder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.quanlysach.R;

import java.util.List;

public class HoaDonChiTietAdap extends BaseAdapter {
    List<HoaDonChitietClass> hoaDonChitietClassList;

    public HoaDonChiTietAdap(List<HoaDonChitietClass> hoaDonChitietClassList) {
        this.hoaDonChitietClassList = hoaDonChitietClassList;
    }

    @Override
    public int getCount() {
        return hoaDonChitietClassList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(parent.getContext()).inflate(R.layout.view_hoadonchitiet,parent,false);
        HoaDonChitietClass hoaDonChitietClass=hoaDonChitietClassList.get(position);
        TextView tvMaHDCT=convertView.findViewById(R.id.tvMaHDCT);
        TextView tvMaHD=convertView.findViewById(R.id.tvMaHD);
        TextView tvSoluong=convertView.findViewById(R.id.tvSoluong);
        TextView tvMasach=convertView.findViewById(R.id.tvMaSach);
        TextView tvTong=convertView.findViewById(R.id.tvTongtien);

        tvMaHDCT.setText(hoaDonChitietClass.getMaHDCT());
        tvMaHD.setText(hoaDonChitietClass.getMaHoaDon());
        tvMasach.setText(hoaDonChitietClass.getMaSach());
        tvSoluong.setText(hoaDonChitietClass.getSoluongMua());
        tvTong.setText(hoaDonChitietClass.getTongTien());

        return convertView;
    }
}
