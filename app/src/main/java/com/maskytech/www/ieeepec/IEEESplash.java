package com.maskytech.www.ieeepec;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class IEEESplash extends AppCompatActivity {
    private ImageView imageView;
    private int SLEEP_TIMER=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.ieee_splash);
        imageView=(ImageView)findViewById(R.id.imageView);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.transition);
        imageView.startAnimation(myanim);
        getSupportActionBar().hide();
        LogoLauncher logoLauncher=new LogoLauncher();
        logoLauncher.start();

    }

    private class LogoLauncher extends Thread{
        public void run(){
            try {
                sleep(1000 * SLEEP_TIMER);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }

            Intent intent=new Intent(IEEESplash.this,MainActivity.class);
            startActivity(intent);
            IEEESplash.this.finish();
        }
    }

}
