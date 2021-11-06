package tech.article.listener.v6;

import org.jetbrains.annotations.NotNull;
import org.springframework.scheduling.annotation.Scheduled;
import tech.article.listener.common.Configuration;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationManager {

    private Configuration configuration = new Configuration();

    private final List<ConfigurationListener> listeners = new ArrayList<>();

    public void addConfigurationListener(ConfigurationListener listener) {
        synchronized (listeners) {
            if (!listeners.contains(listener))
                listeners.add(listener);
        }
    }

    public void removeConfigurationListener(ConfigurationListener listener) {
        synchronized (listeners) {
            listeners.remove(listener);
        }
    }


    @NotNull
    public Configuration getConfiguration() {
        return configuration;
    }


    /**
     * Scan the configuration source regularly to check if
     */
    @Scheduled(fixedDelay = 30 * 1000)
    public void scanConfiguration() {
        if (configurationHasChanged()) {
            loadConfiguration();
            fireConfigurationChange();
        }
    }

    private void fireConfigurationChange() {
        for (ConfigurationListener listener : cloneListeners()) {
            listener.onConfigurationChanged(configuration);
        }
    }

    private List<ConfigurationListener> cloneListeners() {
        synchronized (listeners) {
            return new ArrayList<>(listeners);
        }
    }

    private boolean configurationHasChanged() {
        // Fake implementation that simulates the detection of a configuration change
        return true;
    }

    private void loadConfiguration() {
        // Fake implementation that simulates the loading of the configuration from an external source, such as file
        Configuration newConfiguration = new Configuration();
        newConfiguration.setHostname("127.0.0.1");
        newConfiguration.setPort(4500);
        newConfiguration.setLogin("John");
        newConfiguration.setPassword("Doe");

        this.configuration = newConfiguration;
    }
}
