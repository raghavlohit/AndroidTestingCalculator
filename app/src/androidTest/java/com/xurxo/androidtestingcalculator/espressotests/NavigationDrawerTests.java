package com.xurxo.androidtestingcalculator.espressotests;


import android.support.test.runner.AndroidJUnit4;

import com.xurxo.androidtestingcalculator.espressotests.ScreenObjects.CalculatorScreen;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class NavigationDrawerTests {

    @Test
    public void openAndCloseDrawer_ShouldWork() {
        CalculatorScreen calculatorScreen = new CalculatorScreen();

        calculatorScreen
                .start()
                .navigation()
                .verifyIsClosed()
                .open()
                .verifyIsOpen()
                .close()
                .verifyIsClosed();
    }

    @Test
    public void navigateToAbout_TitleShouldBeAbout() {
        CalculatorScreen calculatorScreen = new CalculatorScreen();

        calculatorScreen
                .start()
                .navigateToAbout()
                .verifyTextTitle("About");
    }

    @Test
    public void navigateToAbout_ContentShouldBeOfAbout() {
        CalculatorScreen calculatorScreen = new CalculatorScreen();

        calculatorScreen
                .start()
                .navigateToAbout()
                .verifyNameAndVersionIsDisplayed()
                .verifyDescriptionIsDisplayed();
    }

}
