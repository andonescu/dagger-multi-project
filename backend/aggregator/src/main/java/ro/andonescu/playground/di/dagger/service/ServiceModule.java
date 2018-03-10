package ro.andonescu.playground.di.dagger.service;

import dagger.Module;
import dagger.Provides;
import ro.andonescu.playground.di.dagger.auth.Auth;
import ro.andonescu.playground.di.dagger.auth.AuthModule;
import ro.andonescu.playground.di.dagger.config.Config;
import ro.andonescu.playground.di.dagger.config.ConfigModule;

import javax.inject.Inject;
import javax.inject.Singleton;

@Module(includes = {ConfigModule.class, AuthModule.class})
public class ServiceModule {

    @Provides
    @Singleton
    @Inject
    Service service(Auth auth, Config config) {
        return new ServiceImpl(auth, config);
    }
}
