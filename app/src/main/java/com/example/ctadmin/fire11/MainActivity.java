package com.example.ctadmin.fire11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.twitter.sdk.android.core.TwitterCore;
import io.fabric.sdk.android;
import com.digits.sdk.android.Digits;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterCore;
import io.fabric.sdk.android.Fabric;
import com.digits.sdk.android.Digits;
import com.twitter.sdk.android.core.TwitterAuthConfig;

public class MainActivity extends AppCompatActivity {
    TwitterAuthConfig authConfig=new TwitterAuthConfig(TWITTER_KEY,TWITTER_SECRET);
    Fabric.with(this,new TwitterCore(authConfig),new Digits.Builder().build());.Fabric;
    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "PwmYeulnZM6D52Pg3CsPHYMaH";
    private static final String TWITTER_SECRET = "koCUbYwiDjgzHFKAa9NsEl2zX7Yxf6CdrW5shjByvmdBqXPcOh";
    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY="PwmYeulnZM6D52Pg3CsPHYMaH";
    private static final String TWITTER_SECRET="koCUbYwiDjgzHFKAa9NsEl2zX7Yxf6CdrW5shjByvmdBqXPcOh";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new TwitterCore(authConfig), new Digits.Builder().build());
        setContentView(R.layout.activity_main);
    }
}
