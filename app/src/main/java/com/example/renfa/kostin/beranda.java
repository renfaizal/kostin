package com.example.renfa.kostin;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
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
import android.widget.Button;

public class beranda extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener{
    Button btnRoom, btnInvoice, btnProfile, btnSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setLogo(R.drawable.logo_kostin);
        toolbar.setNavigationIcon(R.drawable.ic_nav_back);


        btnRoom = (Button) findViewById(R.id.btnRoom);
        btnInvoice = (Button) findViewById(R.id.btnInvoice);
        btnProfile = (Button) findViewById(R.id.btnProfile);
        btnSetting = (Button) findViewById(R.id.btnSetting);

        btnRoom.setOnClickListener(this);
        btnInvoice.setOnClickListener(this);
        btnProfile.setOnClickListener(this);
        btnSetting.setOnClickListener(this);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
        getMenuInflater().inflate(R.menu.beranda, menu);
        return true;
    }
    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.btnRoom : i = new Intent(this,kamar.class); startActivity(i); break;
            case R.id.btnInvoice : i = new Intent(this,tagihan.class); startActivity(i); break;
            case R.id.btnProfile : i = new Intent(this,profile.class); startActivity(i); break;
            case R.id.btnSetting : i = new Intent(this,setting.class); startActivity(i); break;
            default:break;
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_beranda) {
            Intent openMenu = new Intent(beranda.this,beranda.class);
            startActivity(openMenu);
        } else if (id == R.id.nav_profil) {
            Intent openMenu = new Intent(beranda.this,profile.class);
            startActivity(openMenu);
        } else if (id == R.id.nav_tagihan) {
            Intent openMenu = new Intent(beranda.this,tagihan.class);
            startActivity(openMenu);
        } else if (id == R.id.nav_contact_us) {
            Intent openMenu = new Intent(beranda.this,contact_us.class);
            startActivity(openMenu);
        } else if (id == R.id.nav_send) {
            Intent openMenu = new Intent(beranda.this,profile.class);
            startActivity(openMenu);
        } else if (id == R.id.nav_exit) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
