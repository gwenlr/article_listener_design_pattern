package tech.article.listener.v2;

import org.jetbrains.annotations.NotNull;
import org.springframework.scheduling.annotation.Scheduled;
import tech.article.listener.common.Configuration;

public class ConfigurationManager {

    private final Configuration configuration = new Configuration();
    private Network network;

    public void setNetwork(Network network) {
        this.network = network;
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
        if (network != null) {
            network.disconnect();
            network.connect(configuration);
        }
    }

    private boolean configurationHasChanged() {
        // Fake implementation that simulates the detection of a configuration change
        return true;
    }

    private void loadConfiguration() {
        // Fake implementation that simulates the loading of the configuration from an external source, such as file
        configuration.setHostname("127.0.0.1");
        configuration.setPort(4500);
        configuration.setLogin("John");
        configuration.setPassword("Doe");
    }


}
