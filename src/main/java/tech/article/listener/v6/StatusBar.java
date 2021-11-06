package tech.article.listener.v6;

import tech.article.listener.common.Configuration;

public class StatusBar implements ConfigurationListener {

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        displayHostname(configuration.getHostname());
    }

    public void displayHostname(String hostname) {
        // Implementation...
    }
}