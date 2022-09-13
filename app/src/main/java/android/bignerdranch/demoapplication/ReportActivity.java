package android.bignerdranch.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ReportActivity extends AppCompatActivity {
    public TextView text1;
    public TextView text2;
    public TextView text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        text1=findViewById(R.id.text_1);
        text2=findViewById(R.id.textView8);
        text3=findViewById(R.id.textView9);
    }
}