package nl.hr.cmtprg037.week8lesvoorbeeldtesten;

import android.content.Context;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule
            = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void checkCalculator() {
        // Type text and then press the button.

        // 5
        onView(withId(R.id.editTextNumber_a))
                .perform(typeText("5"), closeSoftKeyboard());
        // 6
        onView(withId(R.id.editTextNumber_b))
                .perform(typeText("6"), closeSoftKeyboard());

        onView(withId(R.id.button_add)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.textView_c))
                .check(matches(withText("11")));
    }


}