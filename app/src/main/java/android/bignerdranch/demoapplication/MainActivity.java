package android.bignerdranch.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
   public FloatingActionButton mFloatingActionButton;
   public FloatingActionButton nFloatingActionButton;
    public TextView text1;
    public TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.textView3);
        text2=findViewById(R.id.textView4);


        mFloatingActionButton = findViewById(R.id.a1);

        mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ReportActivity.class);
                startActivity(intent);
            }
        });
        nFloatingActionButton = findViewById(R.id.a2);

        nFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NewsLetterActivity.class);
                startActivity(intent);
            }
        });
    }
}