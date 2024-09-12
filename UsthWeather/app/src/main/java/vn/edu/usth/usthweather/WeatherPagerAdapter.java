package vn.edu.usth.usthweather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class WeatherPagerAdapter extends FragmentStateAdapter {
    private final int PAGE_COUNT =3;

    public WeatherPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return new WeatherAndForecastFragment();
    }

    @Override
    public int getItemCount() {
        return PAGE_COUNT;
    }
}
