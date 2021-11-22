/**
 * <pre>
 * Implementation v3:
 *
 *  Configuration consumers:
 *      - network, consumes full configuration object
 *      - statusBar, consumes the configuration hostname
 *
 *  Configuration is loaded at startup.
 *      - Configuration is sent to the network.
 *      - Configuration hostname is sent to the statusBar
 *
 *  Configuration is loaded repeatedly
 *      - Configuration is sent to the network
 *      - Configuration hostname is sent to the statusBar
 * </pre>
 */
package tech.article.listener.v3;