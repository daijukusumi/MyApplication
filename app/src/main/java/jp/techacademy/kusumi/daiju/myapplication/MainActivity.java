package jp.techacademy.kusumi.daiju.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("ボブ", 24,"サッカー");     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        human.say();
        human.think();
    }

}
