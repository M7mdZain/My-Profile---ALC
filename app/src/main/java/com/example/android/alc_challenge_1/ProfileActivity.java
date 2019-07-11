package com.example.android.alc_challenge_1;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProfileActivity extends AppCompatActivity {

    @BindView(R.id.my_photo)
    ImageView myPhoto;
    @BindView(R.id.tv_name)
    TextView tvName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);

        // Displaying ActionBar home button as a back button
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        // Setting my photo as a circle
        Glide.with(this)
                .load(R.drawable.mohamed_zain)
                .apply(RequestOptions.circleCropTransform())
                .into(myPhoto);

        // Adjusting font of profile name
        tvName.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/weather_sunny.otf"));

    }
}
