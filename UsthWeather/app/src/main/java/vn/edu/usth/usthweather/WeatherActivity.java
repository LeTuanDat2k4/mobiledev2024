package vn.edu.usth.usthweather;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.be_alright);
        mediaPlayer.start();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        Log.i("WeatherActivity", "onCreate: ");
//
//        WeatherFragment wf = new WeatherFragment();
//        ForecastFragment fcf = new ForecastFragment();
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.add(R.id.fragment_container1,wf);
//        fragmentTransaction.add(R.id.fragment_container2,fcf);
//        fragmentTransaction.commit();

        ViewPager2 viewPager = findViewById(R.id.view_pager);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        WeatherPagerAdapter adapter = new WeatherPagerAdapter(this);
        viewPager.setAdapter(adapter);


        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setText(getString(R.string.Hanoi_1));
                            break;
                        case 1:
                            tab.setText(getString(R.string.Paris_2));
                            break;
                        case 2:
                            tab.setText(getString(R.string.London_3));
                            break;
                    }
                }).attach();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.weather_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        Toolbar toolbar = findViewById(R.id.toolbar);
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;


        switch (id) {
            case R.id.action_refresh:
                Toast toast = Toast.makeText(this, text, duration);
                toast.show();
                return true;

            case R.id.action_settings:
                Intent intent = new Intent(this, PrefActivity.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    //    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.i("WeatherActivity","onStart");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.i("WeatherActivity","onResume");
//    }
//
//    public WeatherActivity() {
//        super();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.i("WeatherActivity","OnStop");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.i("WeatherActivity","onDestroy");
//    }

}