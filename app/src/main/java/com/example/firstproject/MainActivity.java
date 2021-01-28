package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public ImageView img1;
    public int jumlah = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtHW = findViewById(R.id.tv_hw);
        TextView txtNama = findViewById(R.id.tv_nama);
        TextView txtAlamat = findViewById(R.id.tv_alamat);
        Button btnMove = findViewById(R.id.btn_pindah);

        txtHW.setText("Selamat Datang");
        txtNama.setText("Ujang");
        txtAlamat.setText("Bandung");

        txtNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Anda menekan tulisan "+txtNama.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        txtAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Anda menekan tulisan alamat", Toast.LENGTH_SHORT).show();
            }
        });

        txtHW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jumlah++;
                Toast.makeText(getApplicationContext(), "Anda Klik Gambar "+jumlah+" Kali ", Toast.LENGTH_SHORT).show();
            }
        });

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(MainActivity.this,ActivityKedua.class);
                Intent.putExtra("nama_key",txtNama.getText());
                Intent.putExtra("alamat_key",txtAlamat.getText());

                startActivity(Intent);
            }
        });
    }
}