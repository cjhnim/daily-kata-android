package com.frank.loginkata3;

import androidx.databinding.ObservableField;

public class MainViewModel
{
    private final MyAuthenticator authenticator;
    public ObservableField<String> username = new ObservableField<>("");
    public ObservableField<String> password = new ObservableField<>("");
    public ObservableField<String> error_message = new ObservableField<>();

    public MainViewModel() {
        this.authenticator = new MyAuthenticator();
    }
    public MainViewModel(MyAuthenticator authenticator) {

        this.authenticator = authenticator;
    }

    public void loginClick() {
        if(username.get().isEmpty() && password.get().isEmpty())
            error_message.set("username & password are empty.");
        else if(username.get().isEmpty() && !password.get().isEmpty())
            error_message.set("username is empty.");
        else if(!username.get().isEmpty() && password.get().isEmpty())
            error_message.set("password is empty.");
        else {
            if(!authenticator.login(username.get(), password.get()))
                error_message.set("password is invalid.");
            else
                error_message.set("login succeed.");
        }
    }
}
