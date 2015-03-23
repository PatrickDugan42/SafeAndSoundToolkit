package dugano.assess;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.os.Handler;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by dell on 3/20/2015.
 */
public class SplashScreen extends Activity {

    private final static int splashLength = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(getBaseContext(),MainToolkit.class);
                startActivity(mainIntent);
                finish();
            }
        }, splashLength);
    }
}
