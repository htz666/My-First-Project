package com.htz.samplefragment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.htz.samplefragment.fragments.CameraImportFragment;
import com.htz.samplefragment.fragments.GalleryFragment;
import com.htz.samplefragment.fragments.ShareFragment;
import com.htz.samplefragment.fragments.SlideShowFragment;
import com.htz.samplefragment.fragments.ToolsFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

//        ImageView simpleImageView = (ImageView) R.findViewbyId(R.id.gallery_img)
//                ;
//        simpleImageView.setImageResource(R.drawable.gallery);



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {

            CameraImportFragment cameraImportFragment = new CameraImportFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_frame,cameraImportFragment)
                    .addToBackStack(null)
                    .commit();

            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
            GalleryFragment galleryFragment = new GalleryFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_frame, galleryFragment)
                    .addToBackStack(null)
                    .commit();

        } else if (id == R.id.nav_slideshow) {
            SlideShowFragment slideShowFragment = new SlideShowFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_frame, slideShowFragment)
                    .addToBackStack(null)
                    .commit();

        } else if (id == R.id.nav_manage) {
            ToolsFragment toolsFragment = new ToolsFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_frame, toolsFragment)
                    .addToBackStack(null)
                    .commit();

        } else if (id == R.id.nav_share) {
            ShareFragment shareFragment = new ShareFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_frame, shareFragment)
                    .addToBackStack(null)
                    .commit();


        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
