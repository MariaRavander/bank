package se.kth.id1212.appserv.bank.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Contains properties from application.properities, starting with 'se.kth
 * .id1212.server'.
 */
@Configuration
@ConfigurationProperties(prefix = "se.kth.id1212.server")
public class ServerProperties {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            ServerProperties.class);
    private String contextRoot;

    /**
     * @return The context root of the web site.
     */
    public String getContextRoot() {
        LOGGER.trace("Reading context root {}.", contextRoot);
        return contextRoot;
    }

    /**
     * @param contextRoot The new context root of the web site.
     */
    public void setContextRoot(String contextRoot) {
        this.contextRoot = contextRoot;
    }
}
