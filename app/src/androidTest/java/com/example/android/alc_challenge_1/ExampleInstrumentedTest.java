package com.example.android.alc_challenge_1;

import android.content.Context;

import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented blue_wave, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under blue_wave.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.android.alc_challenge_1", appContext.getPackageName());
    }
}
