package tech.article.listener.v4;

import org.jetbrains.annotations.NotNull;
import org.springframework.scheduling.annotation.Scheduled;
import tech.article.listener.common.Configuration;

public class ConfigurationManager {

    private Configuration configuration = new Configuration();
    private Network network;
    private StatusBar statusBar;
    private Supervision supervision;

    public void setNetwork(Network network) {
        this.network = network;
    }

    public void setNotificationBar(StatusBar statusBar) {
        this.statusBar = statusBar;
    }

    public void setSupervision(Supervision supervision) {
        this.supervision = supervision;
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
        if (statusBar != null)
            statusBar.displayHostname(configuration.getHostname());
        if( supervision != null) {
            supervision.hostChanged(configuration.getHostname());
            supervision.loginChanged(configuration.getLogin());
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
