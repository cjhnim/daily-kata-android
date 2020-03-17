package com.frank.loginkata3;

import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainActivityInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void testUsernameBinding() {

        onView(withId(R.id.username))
                .perform(typeText("Francis"));

        assertThat(mActivityRule.getActivity().getBinding().getViewModel().username.get(), is("Francis"));


    }

    @Test
    public void testPasswordBinding() {

        onView(withId(R.id.password))
                .perform(typeText("1234"));

        assertThat(mActivityRule.getActivity().getBinding().getViewModel().password.get(), is("1234"));
    }

//    @Test
//    public void testErrorMessageBinding() {
//
//        mActivityRule.getActivity().getBinding().getViewModel().error_message.set("Error");
//        mActivityRule.getActivity().getBinding().getViewModel().error_message.notifyChange();
//
//        onView(withId(R.id.error_message))
//                .check(matches(withText("Error")));
//    }
}
