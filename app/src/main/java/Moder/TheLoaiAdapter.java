package Moder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.quanlysach.R;
import com.example.quanlysach.TheLoai;

import java.util.List;

public class TheLoaiAdapter extends BaseAdapter {
    List<TheLoaiClass> theLoaiClassList;

    public TheLoaiAdapter(List<TheLoaiClass> theLoaiClassList) {
        this.theLoaiClassList = theLoaiClassList;
    }

    @Override
    public int getCount() {
        return theLoaiClassList.size();
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
        convertView= LayoutInflater.from(parent.getContext()).inflate(R.layout.view_theloai,parent,false);
       TheLoaiClass theLoai =theLoaiClassList.get(position);
        TextView tvMaTL=convertView.findViewById(R.id.tvMaTL);
        TextView tvTenTL=convertView.findViewById(R.id.tvMaTL);
        TextView tvVitri=convertView.findViewById(R.id.tvVitri);
        ///
        tvMaTL.setText(theLoai.getMaTl());
        tvTenTL.setText(theLoai.getTenTl());
        tvVitri.setText(theLoai.getVitru());

        return convertView;
    }
}
