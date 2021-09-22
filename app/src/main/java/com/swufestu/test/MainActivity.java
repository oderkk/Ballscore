package com.swufestu.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public boolean isDouble(String s) {
        Pattern pattern = Pattern.compile("^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){0,2})?$"); // 判断小数点后2位的数字的正则表达
        Matcher match = pattern.matcher(s);
        boolean bo = match.matches();
        boolean bo1 = bo;
        return bo1;
    }
    public void myclick(View v){
        EditText high =findViewById(R.id.high);
        EditText weight = findViewById(R.id.weight);
        TextView showout = findViewById(R.id.Show);
        Button btn = findViewById(R.id.button5);

        Log.i("show", "weight=" + high.getText().toString());
        Log.i("show", "height=" + weight.getText().toString());
        String t1 = (String) weight.getText().toString();
        String t2 = (String) high.getText().toString();

        if (isDouble(t1) & isDouble(t2)) {
            double t3 = Double.parseDouble(t1) / (Double.parseDouble(t2) * Double.parseDouble(t2));
            if (t3 < 15) {
                showout.setText("您的BMI为：" + String.format("%.2f", t3) + "属于饥饿");
            } else if (t3 < 18.4 & t3 > 15) {
                showout.setText("您的BMI为：" + String.format("%.2f", t3) + "属于轻");
            } else if (t3 < 24.9 & t3 > 18.4) {
                showout.setText("您的BMI为：" + String.format("%.2f", t3) + "属于理想");
            } else {
                showout.setText("您的BMI为：" + String.format("%.2f", t3) + "属于胖");
            }
        }
        else{
            showout.setText("请输入正确的数字！");
        }




    }
}