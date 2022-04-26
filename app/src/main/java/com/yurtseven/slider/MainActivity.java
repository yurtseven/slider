package com.yurtseven.slider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    public CardView first_news, second_news, third_news;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewFlipper viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(getApplicationContext(),R.anim.left_to_right);
        //viewFlipper.setOutAnimation(getApplicationContext(),R.anim.right_to_left);

        first_news = findViewById(R.id.news1);
        second_news = findViewById(R.id.news2);
        third_news = findViewById(R.id.news3);

        first_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),NewsActivity.class);
                intent.putExtra("newsId",1);
                startActivity(intent);
            }
        });


        second_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NewsActivity.class);
                intent.putExtra("newsId",2);
                startActivity(intent);
            }
        });

        third_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NewsActivity.class);
                intent.putExtra("newsId",3);
                startActivity(intent);
            }
        });


    }
}