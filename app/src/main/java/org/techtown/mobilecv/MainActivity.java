package org.techtown.mobilecv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MainFragment mainFragment;
    SummaryFragment summaryFragment;
    ProfileFragment profileFragment;
    SkillFragment skillFragment;
    InterestFragment interestFragment;
    EducationFragment educationFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainFragment = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.mainFragment);
        summaryFragment = new SummaryFragment();
        profileFragment = new ProfileFragment();
        skillFragment = new SkillFragment();
        interestFragment = new InterestFragment();
        educationFragment = new EducationFragment();
    }

    public void onFragmentChanged(int index) {
        if (index == 0) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, summaryFragment).commit();
        }
        else if (index == 1) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, profileFragment).commit();
        }
        else if (index == 2) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, skillFragment).commit();
        }
        else if (index == 3) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, interestFragment).commit();
        }
        else if (index == 4) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, educationFragment).commit();
        }
    }
}