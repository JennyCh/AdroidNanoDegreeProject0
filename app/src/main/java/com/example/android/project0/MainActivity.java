package com.example.android.project0;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    public void callSpotifyStreamer(View view) {
        Toast.makeText(this, "Hello I am Spotify Streamer", Toast.LENGTH_LONG).show();
    }

    public void callScoresApp(View view) {
        Toast.makeText(this, "Hello I am Scores App", Toast.LENGTH_LONG).show();
    }
    public void callLibraryApp(View view) {
        Toast.makeText(this, "Hello I am Library App", Toast.LENGTH_LONG).show();
    }
    public void callBuildItBigger(View view) {
        Toast.makeText(this, "Hello I am Build It Bigger", Toast.LENGTH_LONG).show();
    }
    public void callXyzReader(View view) {
        Toast.makeText(this, "Hello I am XYZ Reader", Toast.LENGTH_LONG).show();
    }
    public void callCapstoneMyOwnApp(View view) {
        Toast.makeText(this, "Hello I am Capstone: My Own App", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}
