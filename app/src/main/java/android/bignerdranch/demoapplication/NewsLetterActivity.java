package android.bignerdranch.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NewsLetterActivity extends AppCompatActivity {
   public TextView text_1;
   public TextView text_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_letter);
        text_1=findViewById(R.id.traffic);
        text_2=findViewById(R.id.word);
    }
}