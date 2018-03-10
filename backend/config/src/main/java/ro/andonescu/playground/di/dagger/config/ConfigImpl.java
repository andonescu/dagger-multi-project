package ro.andonescu.playground.di.dagger.config;

import java.util.Optional;

public class ConfigImpl implements Config {
    @Override
    public Optional<String> configBy(String key) {
        throw new UnsupportedOperationException();
    }
}
