package com.frank.loginkata3;

import org.junit.Before;
import org.junit.Test;

import androidx.core.widget.TextViewCompat;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.AdditionalMatchers.not;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/*
 TODO:
 [ ] remove duplicated string.
*/

public class MainViewModelTest {

    @Test
    public void shouldBeErrorWhenUsernamePasswordAllEmpty() {
        MainViewModel viewModel = new MainViewModel();

        viewModel.loginClick();

        assertThat(viewModel.error_message.get(), is("username & password are empty."));
    }

    @Test
    public void shouldBeErrorWhenUsernameIsEmpty() {
        MainViewModel viewModel = new MainViewModel();

        viewModel.username.set("");
        viewModel.password.set("1234");

        viewModel.loginClick();

        assertThat(viewModel.error_message.get(), is("username is empty."));
    }

    @Test
    public void shouldBeErrorWhenPasswordIsEmpty() {
        MainViewModel viewModel = new MainViewModel();

        viewModel.username.set("francis");
        viewModel.password.set("");

        viewModel.loginClick();

        assertThat(viewModel.error_message.get(), is("password is empty."));
    }

    @Test
    public void shouldShowLoginErrorWhenPasswordIsInvalid() {

        MyAuthenticator mockAuthenticator = mock(MyAuthenticator.class);
        MainViewModel viewModel = new MainViewModel(mockAuthenticator);
        when(mockAuthenticator.login("francis", "123456")).thenReturn(true);

        viewModel.username.set("francis");
        viewModel.password.set("1234");

        viewModel.loginClick();

        assertThat(viewModel.error_message.get(), is("password is invalid."));
    }

    @Test
    public void shouldShowLoginSucceedWhenUsernamePasswordAreValid() {

        MyAuthenticator mockAuthenticator = mock(MyAuthenticator.class);
        MainViewModel viewModel = new MainViewModel(mockAuthenticator);
        when(mockAuthenticator.login("francis", "123456")).thenReturn(true);

        viewModel.username.set("francis");
        viewModel.password.set("123456");

        viewModel.loginClick();

        assertThat(viewModel.error_message.get(), is("login succeed."));
    }
}
