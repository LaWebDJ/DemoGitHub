package com.lawebdj.demogithub;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView mTigo;
    private ImageView mViva;
    private ImageView mEntel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        mTigo = (ImageView) findViewById(R.id.imageTigo);
        mViva = (ImageView)findViewById(R.id.imageViva);
        mEntel =(ImageView)findViewById(R.id.imageEntel);
        mTigo.setOnClickListener(this);
        mViva.setOnClickListener(this);
        mEntel.setOnClickListener(this);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageTigo:
                mTigo.setImageResource(R.mipmap.ic_tigo);
                mViva.setImageResource(R.mipmap.ic_vivagris);
                mEntel.setImageResource(R.mipmap.ic_entelgris);
                break;
            case R.id.imageViva:
                mViva.setImageResource(R.mipmap.ic_viva);
                mTigo.setImageResource(R.mipmap.ic_tigogris);
                mEntel.setImageResource(R.mipmap.ic_entelgris);
                break;
            case R.id.imageEntel:
                mEntel.setImageResource(R.mipmap.ic_entel);
                mTigo.setImageResource(R.mipmap.ic_tigogris);
                mViva.setImageResource(R.mipmap.ic_vivagris);
        }
    }
}
