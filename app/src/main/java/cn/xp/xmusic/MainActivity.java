package cn.xp.xmusic;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;

import com.jude.beam.bijection.BeamAppCompatActivity;

public class MainActivity extends BeamAppCompatActivity {
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

    }
}
