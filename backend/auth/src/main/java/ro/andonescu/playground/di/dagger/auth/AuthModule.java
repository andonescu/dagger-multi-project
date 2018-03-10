package ro.andonescu.playground.di.dagger.auth;

import dagger.Module;
import dagger.Provides;
import ro.andonescu.playground.di.dagger.config.Config;

import javax.inject.Inject;
import javax.inject.Singleton;

@Module
public class AuthModule {

    @Provides
    @Singleton
    @Inject
    Auth auth(Config config) {
        return new AuthImpl(config);
    }
}
