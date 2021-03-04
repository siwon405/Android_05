package com.on.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CustomToast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast);
    }
    public void showNewToast(View view) {
        NewToast.makeText(this,"마가린에 갓 구운 새 토스트 ", Toast.LENGTH_SHORT).show();
    }
}