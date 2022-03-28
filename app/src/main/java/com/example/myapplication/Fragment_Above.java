package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_Above extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View aboveView = inflater.inflate(R.layout.fragment_above, container, false);

        EditText edtMaGG = aboveView.findViewById(R.id.edtMaGiamGia);
        Button btnAD = aboveView.findViewById(R.id.btnApDung);

        btnAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String maGG = edtMaGG.getText().toString().trim();
                if(maGG.equals("giamgiasoc")){
                    TextView txtGia = getActivity().findViewById(R.id.txtGia);
                    String giaHT = txtGia.getText().toString().trim();
                    double giaGiam = (Double.parseDouble(giaHT.substring(0, giaHT.length()-1).trim()))*1000
                         - (Double.parseDouble(giaHT.substring(0, giaHT.length()-1).trim()) * 20/100)*1000;
                    StringBuilder kq = new StringBuilder();
                    kq.append(giaGiam/1000);
                    kq.append("0 d");
                    txtGia.setText(kq.toString());
                }

            }
        });

        return aboveView;
    }
}
