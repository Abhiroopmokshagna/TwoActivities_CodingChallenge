package com.mokshagna.abhiroop.twoactivitiescodingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView article_heading;
    private TextView article_content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        article_heading = findViewById(R.id.article_heading);
        article_content = findViewById(R.id.article_content);
        Intent intent = getIntent();
        String choice = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        switch(choice){
            case "one":
                article_heading.setText(R.string.article_one_heading);
                article_content.setText(R.string.article_one_content);
                break;
            case "two":
                article_heading.setText(R.string.article_two_heading);
                article_content.setText(R.string.article_two_content);
                break;
            case "three":
                article_heading.setText(R.string.article_three_heading);
                article_content.setText(R.string.article_three_content);
                break;
        }
    }
}
