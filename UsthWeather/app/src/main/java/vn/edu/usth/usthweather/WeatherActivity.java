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
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

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

        ViewPager2 viewPager = findViewById(R.id.view_pager);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        WeatherPagerAdapter adapter = new WeatherPagerAdapter(this);
        viewPager.setAdapter(adapter);


        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setText("Ha Noi");
                            break;
                        case 1:
                            tab.setText("Paris");
                            break;
                        case 2:
                            tab.setText("London");
                            break;
                    }
                }).attach();

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