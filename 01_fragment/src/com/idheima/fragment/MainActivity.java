package com.idheima.fragment;

import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }

    
    public void click1(View v){
    	//1.创建fragment对象
    	Fragment01 fragment1 = new Fragment01();
    	//2.获取fragment管理器
    	FragmentManager fm =getFragmentManager();
    	//3.开启事务
    	FragmentTransaction ft = fm.beginTransaction();
    	//4.显示内容
    	ft.replace(R.id.fl, fragment1);
    	//5.提交
    	ft.commit();
    }
    public void click2(View v){
    	//1.创建fragment对象
    	Fragment02 fragment2 = new Fragment02();
    	//2.获取fragment管理器
    	FragmentManager fm = getFragmentManager();
    	//3.开启事务
    	FragmentTransaction ft = fm.beginTransaction();
    	//4.显示内容
    	ft.replace(R.id.fl, fragment2);
    	//5.提交
    	ft.commit();
    }
    public void click3(View v){
    	//1.创建fragment对象
    	Fragment03 fragment3 = new Fragment03();
    	//2.获取fragment管理器
    	FragmentManager fm = getFragmentManager();
    	//3.开启事务
    	FragmentTransaction ft = fm.beginTransaction();
    	//4.显示内容
    	ft.replace(R.id.fl, fragment3);
    	//5.提交
    	ft.commit();
    }
}
