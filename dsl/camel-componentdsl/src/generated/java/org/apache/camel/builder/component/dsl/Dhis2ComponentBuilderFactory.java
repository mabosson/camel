/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.dhis2.Dhis2Component;

/**
 * Leverages the DHIS2 Java SDK to integrate Apache Camel with the DHIS2 Web
 * API.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Dhis2ComponentBuilderFactory {

    /**
     * DHIS2 (camel-dhis2)
     * Leverages the DHIS2 Java SDK to integrate Apache Camel with the DHIS2 Web
     * API.
     * 
     * Category: api
     * Since: 4.0
     * Maven coordinates: org.apache.camel:camel-dhis2
     * 
     * @return the dsl builder
     */
    static Dhis2ComponentBuilder dhis2() {
        return new Dhis2ComponentBuilderImpl();
    }

    /**
     * Builder for the DHIS2 component.
     */
    interface Dhis2ComponentBuilder extends ComponentBuilder<Dhis2Component> {
        /**
         * DHIS2 server base API URL (e.g.,
         * https://play.dhis2.org/2.39.1.1/api).
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param baseApiUrl the value to set
         * @return the dsl builder
         */
        default Dhis2ComponentBuilder baseApiUrl(java.lang.String baseApiUrl) {
            doSetProperty("baseApiUrl", baseApiUrl);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default Dhis2ComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default Dhis2ComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default Dhis2ComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * References a user-defined
         * org.hisp.dhis.integration.sdk.api.Dhis2Client.
         * 
         * The option is a:
         * &lt;code&gt;org.hisp.dhis.integration.sdk.api.Dhis2Client&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param client the value to set
         * @return the dsl builder
         */
        default Dhis2ComponentBuilder client(
                org.hisp.dhis.integration.sdk.api.Dhis2Client client) {
            doSetProperty("client", client);
            return this;
        }
        /**
         * To use the shared configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.dhis2.Dhis2Configuration&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default Dhis2ComponentBuilder configuration(
                org.apache.camel.component.dhis2.Dhis2Configuration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * DHIS2 account password for accessing the DHIS2 API.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default Dhis2ComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * DHIS2 account username for accessing the DHIS2 API.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param username the value to set
         * @return the dsl builder
         */
        default Dhis2ComponentBuilder username(java.lang.String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    class Dhis2ComponentBuilderImpl
            extends
                AbstractComponentBuilder<Dhis2Component>
            implements
                Dhis2ComponentBuilder {
        @Override
        protected Dhis2Component buildConcreteComponent() {
            return new Dhis2Component();
        }
        private org.apache.camel.component.dhis2.Dhis2Configuration getOrCreateConfiguration(
                org.apache.camel.component.dhis2.Dhis2Component component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.dhis2.Dhis2Configuration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "baseApiUrl": getOrCreateConfiguration((Dhis2Component) component).setBaseApiUrl((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((Dhis2Component) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((Dhis2Component) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((Dhis2Component) component).setAutowiredEnabled((boolean) value); return true;
            case "client": getOrCreateConfiguration((Dhis2Component) component).setClient((org.hisp.dhis.integration.sdk.api.Dhis2Client) value); return true;
            case "configuration": ((Dhis2Component) component).setConfiguration((org.apache.camel.component.dhis2.Dhis2Configuration) value); return true;
            case "password": getOrCreateConfiguration((Dhis2Component) component).setPassword((java.lang.String) value); return true;
            case "username": getOrCreateConfiguration((Dhis2Component) component).setUsername((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}