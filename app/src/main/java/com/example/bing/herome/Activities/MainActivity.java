package com.example.bing.herome.Activities;


import android.app.Fragment;
import android.app.FragmentManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.example.bing.herome.Fragments.MainFragment;
import com.example.bing.herome.R;

public class MainActivity extends AppCompatActivity implements MainFragment.MainFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);

        if(fragment == null){
            fragment = new MainFragment();
            fragmentManager.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }

    @Override
    public void onMainFragmentInteraction(Uri uri) {

    }
}
