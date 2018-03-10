package ro.andonescu.playground.di.dagger.service;

import ro.andonescu.playground.di.dagger.auth.Auth;
import ro.andonescu.playground.di.dagger.config.Config;

import javax.inject.Inject;

public class ServiceImpl implements Service {

    private Config config;

    private Auth auth;

    @Inject
    public ServiceImpl(Auth auth, Config config) {
        this.config = config;
        this.auth = auth;
    }

    @Override
    public void doOperation() {
        config.configBy("UNKNOWN_STRING")
                .map(v -> auth.userAuthorized());
    }
}
