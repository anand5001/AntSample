package com.example.antsample.test;
import android.test.ActivityInstrumentationTestCase2;

import com.example.antsample.MainActivity;
 
public class MyAppActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
 
    public MyAppActivityTest() {
        super("com.example.antsample", MainActivity.class);
    }
 
    public void testSanity() {
        assertEquals(2, 1 + 1);
    }
}