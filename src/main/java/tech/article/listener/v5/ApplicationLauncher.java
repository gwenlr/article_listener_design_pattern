package tech.article.listener.v5;

import tech.article.listener.common.Configuration;

public class ApplicationLauncher {

    private final Network network = new Network();
    private final StatusBar statusBar = new StatusBar();
    private final Supervision supervision = new Supervision();

    private final ConfigurationManager configurationManager = new ConfigurationManager();

    public void initialize() {
        configurationManager.addConfigurationListener(network);
        configurationManager.addConfigurationListener(statusBar);
        configurationManager.addConfigurationListener(supervision);
    }

    public void startup() {
        // Implementation...
        Configuration configuration = configurationManager.getConfiguration();
        network.startup(configuration);
        statusBar.displayHostname(configuration.getHostname());
        // Implementation...
    }

}