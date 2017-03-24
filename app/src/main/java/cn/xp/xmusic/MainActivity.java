package cn.xp.xmusic;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;

import com.jude.beam.bijection.BeamAppCompatActivity;
import com.jude.beam.bijection.RequiresPresenter;

@RequiresPresenter(MainPresenter.class)
public class MainActivity extends BeamAppCompatActivity {

    private DrawerLayout mDrawerLayout;
    boolean drawerOpened = false;
    private Toolbar mToolBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);


        mToolBar = (Toolbar) findViewById(R.id.toolbar);
        if (mToolBar != null) {
            mToolBar.setTitle("");
        }
        setSupportActionBar(mToolBar);
    }


    private DrawerLayout.DrawerListener mDrawerListener = new DrawerLayout.DrawerListener() {

        @Override
        public void onDrawerClosed(View arg0) {
            drawerOpened = false;

        }

        @Override
        public void onDrawerOpened(View view) {

        }

        @Override
        public void onDrawerSlide(View arg0, float arg1) {

        }

        @Override
        public void onDrawerStateChanged(int arg0) {

        }

    };
}
