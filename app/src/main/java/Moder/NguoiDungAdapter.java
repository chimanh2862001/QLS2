package Moder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.quanlysach.R;

import java.util.List;

import SQL.MySQL;
import SQL.NguoiDungDao;

public class NguoiDungAdapter extends BaseAdapter {
    List<NguoiDung> nguoiDungList;

    public NguoiDungAdapter(List<NguoiDung> nguoiDungList) {
        this.nguoiDungList = nguoiDungList;
    }

    @Override
    public int getCount() {
        return nguoiDungList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, View view, final ViewGroup viewGroup) {
        view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user,viewGroup,false);
        final NguoiDung nguoiDung=nguoiDungList.get(i);
        TextView tvTen=view.findViewById(R.id.tvTen);
        ImageView img3=view.findViewById(R.id.img3);
        TextView tvSDT=view.findViewById(R.id.tvSDT);
        tvTen.setText(nguoiDung.getHoten());
        tvSDT.setText(String.valueOf(nguoiDung.getPhone()));

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NguoiDungDao nguoiDungDao=new NguoiDungDao(new MySQL(viewGroup.getContext()));
                String us=nguoiDungList.get(i).getHoten();
                nguoiDungDao.deleteNd(us);
                nguoiDungList.remove(i);
                notifyDataSetChanged();
            }
        });
        return view;
    }
}
