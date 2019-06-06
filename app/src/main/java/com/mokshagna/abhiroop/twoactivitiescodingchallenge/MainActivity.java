package com.mokshagna.abhiroop.twoactivitiescodingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.mokshagna.abhiroop.TwoActivitiesCodingChallenge.MainActivity.EXTRA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        switch(view.getId()){
            case R.id.button_one:
                intent.putExtra(EXTRA_MESSAGE,"one");
                startActivity(intent);
                break;
            case R.id.button_two:
                intent.putExtra(EXTRA_MESSAGE,"two");
                startActivity(intent);
                break;
            case R.id.button_three:
                intent.putExtra(EXTRA_MESSAGE,"three");
                startActivity(intent);
                break;
        }
    }
}
