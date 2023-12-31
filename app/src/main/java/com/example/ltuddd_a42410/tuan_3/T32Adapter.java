package com.example.ltuddd_a42410.tuan_3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ltuddd_a42410.R;

import java.util.ArrayList;

public class T32Adapter extends BaseAdapter {

    private ArrayList<T32Contact> ls;
    private Context context;

    public T32Adapter(ArrayList<T32Contact> ls, Context context) {
        this.ls = ls;
        this.context = context;
    }

    @Override
    public int getCount() {
        return ls.size();
    }

    @Override
    public Object getItem(int i) {
        return ls.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewAX vax;
        if (view == null) {
            vax = new ViewAX();
            view = LayoutInflater.from(context).inflate(R.layout.tuan32_listview_item, null);
            vax.img_hinh = view.findViewById(R.id.t32ItemHinh);
            vax.tv_ten = view.findViewById(R.id.t32ItemTen);
            vax.tv_tuoi = view.findViewById(R.id.t32ItemTuoi);

            view.setTag(vax);
        } else {
            vax = (ViewAX) view.getTag();
        }
        vax.img_hinh.setImageResource(ls.get(i).getHinh());
        vax.tv_ten.setText(ls.get(i).getTen());
        vax.tv_tuoi.setText(ls.get(i).getTuoi());
        return view;
    }

    class ViewAX {
        ImageView img_hinh;

        TextView tv_ten, tv_tuoi;
    }
}
