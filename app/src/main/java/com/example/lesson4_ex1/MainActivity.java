package com.example.lesson4_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lesson4_ex1.model.Staff;
import com.example.lesson4_ex1.model.StaffAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Staff> staffList = new ArrayList<>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        staffList.add(new Staff("1", "Nguyen Van Hau", "Nam"));
        staffList.add(new Staff("2", "Leo Asher", "Nữ"));
        initGUI();
    }


    private void initGUI() {
        StaffAdapter adapter = new StaffAdapter(this, staffList);
        listView.setAdapter(adapter);
    }

    public void handleAdd(View view) {
        EditText maNv = findViewById(R.id.maNvInput);
        EditText tenNv = findViewById(R.id.tenNvInput);
        String ma = maNv.getText().toString();
        String ten = tenNv.getText().toString();

        RadioGroup radioGroup = findViewById(R.id.gioGroupiTinh);
        int selectedId = radioGroup.getCheckedRadioButtonId();

        if (ma.trim().isEmpty() || ma.trim().isEmpty() || selectedId == -1) {
            Toast.makeText(this, "Vui lòng điền đầy đủ thông tin", Toast.LENGTH_SHORT).show();
        } else {
            RadioButton gioiTinhRadio = findViewById(selectedId);
            String gioiTinh = gioiTinhRadio.getText().toString();

            Staff st = new Staff(ma, ten, gioiTinh);
            staffList.add(st);
            initGUI();
            maNv.setText("");
            tenNv.setText("");
            radioGroup.check(-1);
        }
    }
}