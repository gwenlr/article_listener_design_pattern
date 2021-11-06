package tech.article.listener.v6;

import tech.article.listener.common.Configuration;

public class Supervision implements ConfigurationListener {

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        hostChanged(configuration.getHostname());
        loginChanged(configuration.getLogin());
    }

    public void hostChanged(String hostname) {
        // Implementation...
    }

    public void loginChanged(String login) {
        // Implementation...
    }
}
