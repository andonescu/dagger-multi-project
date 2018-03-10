package ro.andonescu.playground.di.dagger.auth;

import ro.andonescu.playground.di.dagger.config.Config;

import javax.inject.Inject;

public class AuthImpl implements Auth {

    private Config config;

    @Inject
    public AuthImpl(Config config) {
        this.config = config;
    }

    @Override
    public Boolean userAuthorized() {
        throw new UnsupportedOperationException();
    }
}
