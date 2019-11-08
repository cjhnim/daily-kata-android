package com.frank.mvvm_exam;

import org.junit.Test;

import androidx.databinding.ObservableField;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void observableFieldTest() {
        final ObservableField<String> winner = new ObservableField<>();
        winner.set("hello");

        assertThat(winner.get(), is("hello"));
    }
}