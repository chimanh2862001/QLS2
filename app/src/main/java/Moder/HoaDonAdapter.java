package Moder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.quanlysach.R;

import java.util.List;

public class HoaDonAdapter extends BaseAdapter {
    List<HoaDonclass> hoaDonclassList;

    public HoaDonAdapter(List<HoaDonclass> hoaDonclassList) {
        this.hoaDonclassList = hoaDonclassList;
    }

    @Override
    public int getCount() {
        return hoaDonclassList.size();
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
        convertView= LayoutInflater.from(parent.getContext()).inflate(R.layout.view_hoadon,parent,false);
        HoaDonclass hoaDonclass=hoaDonclassList.get(position);
        TextView tvMaHD=convertView.findViewById(R.id.tvMaHD);
        TextView tvDate=convertView.findViewById(R.id.tvDate);
        tvMaHD.setText(hoaDonclass.getMaHoaDon());
        tvDate.setText(hoaDonclass.getDate());
        return convertView;
    }
}
