package com.nguyenminhngan.hoccheckboxradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.nguyenminhngan.hoccheckboxradiobutton.databinding.ActivityRadioButtonBinding;

public class RadioButtonActivity extends AppCompatActivity {

    ActivityRadioButtonBinding binding;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRadioButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        addEvents();
    }

    private void addEvents() {
        binding.btnBinhChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyBinhChon();
            }
        });
    }

    private void xuLyBinhChon() {
        CharSequence sequence="";
        if (binding.radTot.isChecked()) sequence=binding.radTot.getText();
        else if (binding.radKhongTot.isChecked()) sequence=binding.radKhongTot.getText();
        else if (binding.radTamDuoc.isChecked()) sequence=binding.radTamDuoc.getText();
        binding.txtKetQua.setText(sequence);
    }
}
