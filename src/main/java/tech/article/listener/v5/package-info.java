/**
 * <pre>
 * Implementation v5:
 *
 *  Configuration consumers:
 *      - a list of ConfigurationListener
 *
 *  Configuration is loaded at startup.
 *      - Configuration is sent to all registered ConfigurationListener
 *
 *  Configuration is loaded repeatedly
 *      - Configuration is sent to all registered ConfigurationListener
 * </pre>
 */
package tech.article.listener.v5;