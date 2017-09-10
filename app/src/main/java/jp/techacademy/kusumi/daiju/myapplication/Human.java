package jp.techacademy.kusumi.daiju.myapplication;

import android.util.Log;

/**
 * Created by USER on 2017/09/11.
 */

public class Human extends Animal implements Thinkable {

    //変数
    String name;
    int age;
    String hobby;

    public Human(){
        name = "";
        age = 0;
        hobby = "";
    }

    public Human(String name, int age, String hobby)  {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    @Override
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。" + "年は" + this.age + "です。" );
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える");
    }
}
