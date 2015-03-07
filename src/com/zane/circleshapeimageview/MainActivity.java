package com.zane.circleshapeimageview;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import com.zane.circleshapeimageview.view.CircleImageView;


public class MainActivity extends Activity {

	private CircleImageView circleImageView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        circleImageView = (CircleImageView) findViewById(R.id.circleImageView);
    }

    public void doClick(View view){
    	Drawable background = getResources().getDrawable(R.drawable.ic_launcher);
		circleImageView.setImageDrawable(background);
		
    }
    
}
