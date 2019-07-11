package com.example.android.alc_challenge_1;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_welcome_alc)
    TextView tvWelcomeAlc;
    @BindView(R.id.btn_about_alc)
    Button btnAboutAlc;
    @BindView(R.id.btn_my_profile)
    Button btnMyProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // Adjusting fonts
        tvWelcomeAlc.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/black_melody.otf"));
        btnAboutAlc.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/quamaine.otf"));
        btnMyProfile.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/quamaine.otf"));

    }

    @OnClick({R.id.btn_about_alc, R.id.btn_my_profile})
    public void onViewClicked(View view) {
        Intent intent;

        switch (view.getId()) {
            // Andela ALC webpage
            case R.id.btn_about_alc:
                intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                break;
            // My Profile
            case R.id.btn_my_profile:
                intent = new Intent(this, ProfileActivity.class);
                startActivity(intent);
                break;
        }
    }
}
