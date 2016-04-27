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
    	//1.����fragment����
    	Fragment01 fragment1 = new Fragment01();
    	//2.��ȡfragment������
    	FragmentManager fm =getFragmentManager();
    	//3.��������
    	FragmentTransaction ft = fm.beginTransaction();
    	//4.��ʾ����
    	ft.replace(R.id.fl, fragment1);
    	//5.�ύ
    	ft.commit();
    }
    public void click2(View v){
    	//1.����fragment����
    	Fragment02 fragment2 = new Fragment02();
    	//2.��ȡfragment������
    	FragmentManager fm = getFragmentManager();
    	//3.��������
    	FragmentTransaction ft = fm.beginTransaction();
    	//4.��ʾ����
    	ft.replace(R.id.fl, fragment2);
    	//5.�ύ
    	ft.commit();
    }
    public void click3(View v){
    	//1.����fragment����
    	Fragment03 fragment3 = new Fragment03();
    	//2.��ȡfragment������
    	FragmentManager fm = getFragmentManager();
    	//3.��������
    	FragmentTransaction ft = fm.beginTransaction();
    	//4.��ʾ����
    	ft.replace(R.id.fl, fragment3);
    	//5.�ύ
    	ft.commit();
    }
}
