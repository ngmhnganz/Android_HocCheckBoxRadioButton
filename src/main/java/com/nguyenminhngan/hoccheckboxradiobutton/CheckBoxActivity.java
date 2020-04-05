package com.nguyenminhngan.hoccheckboxradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import com.nguyenminhngan.hoccheckboxradiobutton.databinding.ActivityCheckBoxBinding;

public class CheckBoxActivity extends AppCompatActivity {
    ActivityCheckBoxBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckBoxBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        addEvents();
    }

    private void addEvents() {
    binding.btnXacThuc.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            xuLyXacThuc();
        }
    });
    binding.switchXao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            binding.btnXacThuc.setVisibility(isChecked==true?View.INVISIBLE:View.INVISIBLE);
        }
    });
    }

    private void xuLyXacThuc() {
        String thongKe="";
        if (binding.chkHocLapTrinh.isChecked()) thongKe=binding.chkHocLapTrinh.getText().toString()+"\n";
        if (binding.chkHocTiengAnh.isChecked()) thongKe= thongKe+binding.chkHocTiengAnh.getText().toString()+"\n";
        if (binding.chkLamDuAn.isChecked()) thongKe=thongKe+ binding.chkLamDuAn.getText().toString();
        binding.txtKetQua.setText(thongKe);
    }
}
