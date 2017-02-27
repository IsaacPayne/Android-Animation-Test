package test.test.com.stackoverflow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView staticSvg = (ImageView) findViewById(R.id.static_svg);
        staticSvg.startAnimation(
                AnimationUtils.loadAnimation(this, R.anim.rotate) );
    }
}