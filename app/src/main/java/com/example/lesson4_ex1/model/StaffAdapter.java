package com.example.lesson4_ex1.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.lesson4_ex1.R;

import java.util.List;

public class StaffAdapter extends ArrayAdapter<Staff> {

    private Context context;
    private List listItem;

    public StaffAdapter(@NonNull Context context, List<Staff> listItem) {
        super(context, R.layout.nhanvien, listItem);
        this.context = context;
        this.listItem = listItem;
    }

    @NonNull
    @Override
    public View getView (int position, @Nullable View convertView, @Nullable ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.nhanvien, null, true);

        ImageView img = view.findViewById(R.id.avatar);
        TextView staffInfo = view.findViewById(R.id.textInfo);
        CheckBox checkBox = view.findViewById(R.id.checkBox);

        Staff st = (Staff) listItem.get(position);
        img.setImageResource(st.getSex().equalsIgnoreCase("Nam") ? R.drawable.male : R.drawable.female );
        staffInfo.setText(st.getMaNv() + " - " + st.getTenNv());
        return view;
    }
}
