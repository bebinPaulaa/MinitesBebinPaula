package com.if3a.minitesbebinpaula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnKlik;
    TextView tvNama;
    EditText etNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKlik = findViewById(R.id.btn_klik);
        tvNama = findViewById(R.id.tv_nama);
        etNama = findViewById(R.id.et_nama);

        btnKlik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nama = etNama.getText().toString();

                if (Nama.trim().equals("")) {
                    etNama.setError("Wajib DI Isi");
                }
                else {
                    tvNama.setText(Nama);
                }
            }
        });
    }
}