package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
//        Log.i("WeatherActivity", "onCreate: ");
//
//        WeatherFragment wf = new WeatherFragment();
//        ForecastFragment fcf = new ForecastFragment();
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.add(R.id.fragment_container1,wf);
//        fragmentTransaction.add(R.id.fragment_container2,fcf);
//        fragmentTransaction.commit();

        ViewPager viewPager = findViewById(R.id.view_pager);
        WeatherPagerAdapter adapter = new WeatherPagerAdapter(getSupportFragmentManager());
        viewPager.setOffscreenPageLimit(3);
        viewPager.setAdapter(adapter);

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