package com.example.administrator.dateseletordemo;

import android.content.DialogInterface;
import android.icu.util.Calendar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.administrator.dateseletordemo.R.id.end_date;

public class MainActivity extends AppCompatActivity {
private TextView start_date,end_date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start_date= (TextView) findViewById(R.id.start_date);
        end_date= (TextView) findViewById(R.id.end_date);
        Button btn= (Button) findViewById(R.id.confirm);
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                final DatePicker datePicker = (DatePicker) findViewById(R.id.start_picker);
                final DatePicker end_datePicker = (DatePicker) findViewById(R.id.end_picker);
                //设置日期简略显示 否则详细显示 包括:星期\周
                datePicker.setCalendarViewShown(false);
                end_datePicker.setCalendarViewShown(false);
                //日期格式
                String start_date_str="";
                String end_date_str="";
                start_date_str= String.valueOf(datePicker.getYear()+"年"+datePicker.getMonth()+"月"+datePicker.getDayOfMonth()+"日");
                end_date_str= String.valueOf(end_datePicker.getYear()+"年"+end_datePicker.getMonth()+"月"+end_datePicker.getDayOfMonth()+"日");
                start_date.setText(start_date_str);
                end_date.setText(end_date_str);;
            }
        });
    }
}
