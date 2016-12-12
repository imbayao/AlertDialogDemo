package com.ypf.alertdialogdemo;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.bt1);
        button.setOnClickListener(this);
    }

    private void showDialog(){
        AlertDialog dialog = new AlertDialog.Builder(this).create();        //创建一个对象
        View view = getLayoutInflater().inflate(R.layout.mydialog, null);   //自定义布局
        dialog.setView(view, 0, 0, 0, 0);                                   //将自定义布局添加到AlertDialog中
        Button button1 = (Button) view.findViewById(R.id.button1);
        button1.setOnClickListener(this);
        dialog.show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt1:
                showDialog();
                break;
            case R.id.button1:
                Toast.makeText(MainActivity.this, "你点击了button", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
