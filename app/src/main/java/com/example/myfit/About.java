package com.example.myfit;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
           String aboutUsContent = "Introduction:
MYFIT App is based on a fitness app. This app is based on fitness and exercises and how to maintain and keep the body fit for daily routine."+
" These App consist of workout timer where they set timer for their exercises, profile creation by creating a database in Firebase Authentication, 
a calorie calculator based on weight and height of a person, a calorie tracker where a user can track there day to day meal routine by adding measuring calorie how much intake they take in a day and a training split where different training exercise are allotted based Day 2, 3,4,5,6 days workout and each having different workout split to follow. The working of the Apps
 starts with the login screen after entering comes a user profile creation where user stores the data then comes the navigation view where different function are there which I have mentioned earlier to click those button and land towards the particular page.";

        aboutUsText.setText(aboutUsContent);
    }
}
