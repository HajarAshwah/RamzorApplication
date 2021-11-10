package hajar.ashwah.hajartaskmanager;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
         //Thread : 1
        Thread th=new Thread(){
            //Thread : 2
            @Override
            public void run() {
                // المقطع الذي سيعمل بالتزامن مع مقاطع اخرى
                //Thread : 3
                int ms=3*1000;//milliseconds
                try {
                    sleep(ms);
                   startActivity(new Intent(getApplicationContext(),MainActivity.class));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };


    }
}