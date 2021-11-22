/**
 * <pre>
 * Implementation v4:
 *
 *  Configuration consumers:
 *      - network, consumes full configuration object
 *      - statusBar, consumes the configuration hostname
 *      - supervision, consumes the configuration hostname & login
 *
 *  Configuration is loaded at startup.
 *      - Configuration is sent to the network.
 *      - Configuration hostname is sent to the statusBar
 *      - Configuration hostname & login are sent to the supervision
 *
 *  Configuration is loaded repeatedly
 *      - Configuration is sent to the network
 *      - Configuration hostname is sent to the statusBar
 *      - Configuration hostname & login are sent to the supervision
 * </pre>
 */
package tech.article.listener.v4;