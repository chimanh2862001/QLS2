package Moder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.quanlysach.R;

import org.w3c.dom.Text;

import java.util.List;

public class SachAdapter extends BaseAdapter {
    List<Sach> sachList;

    public SachAdapter(List<Sach> sachList) {
        this.sachList = sachList;
    }

    @Override
    public int getCount() {
        return sachList.size();
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
        convertView= LayoutInflater.from(parent.getContext()).inflate(R.layout.view_sach,parent,false);
        Sach sach=sachList.get(position);
        TextView tvmaSach=convertView.findViewById(R.id.tvmaSach);
        TextView tvTensach=convertView.findViewById(R.id.tvTensach);
        TextView tvNXB=convertView.findViewById(R.id.tvNXB);
        TextView tvSoluong=convertView.findViewById(R.id.tvSoluong);
        TextView tvTacGia=convertView.findViewById(R.id.tvTacgia);
        TextView tvGia=convertView.findViewById(R.id.tvGia);
        TextView tvTl=convertView.findViewById(R.id.tvTL);
        ///
        tvmaSach.setText(sach.getMaSach());
        tvGia.setText(sach.getGia());
        tvNXB.setText(sach.getNXB());
        tvSoluong.setText(sach.getSoluong());
        tvTensach.setText(sach.getTen());
        tvTacGia.setText(sach.getTacGia());
        tvTl.setText(sach.getTheloai());
        return convertView;
    }
}
