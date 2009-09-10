/**
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
package org.apache.camel.spi;

import java.util.EventObject;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.Route;

/**
 * Factory to create {@link java.util.EventObject} events} that are emitted when such an event occur.
 * <p/>
 * For example when an {@link Exchange} is being created and then later when its done.
 *
 * @version $Revision$
 */
public interface EventFactory {

    /**
     * Creates an {@link EventObject} for Camel is starting.
     *
     * @param context camel context
     * @return the created event
     */
    EventObject createCamelContextStartingEvent(CamelContext context);

    /**
     * Creates an {@link EventObject} for Camel has been started successfully.
     *
     * @param context camel context
     * @return the created event
     */
    EventObject createCamelContextStartedEvent(CamelContext context);

    /**
     * Creates an {@link EventObject} for Camel failing to start
     *
     * @param context camel context
     * @param cause the cause exception
     * @return the created event
     */
    EventObject createCamelContextStartupFailureEvent(CamelContext context, Exception cause);

    /**
     * Creates an {@link EventObject} for Camel failing to stop cleanly
     *
     * @param context camel context
     * @param cause the cause exception
     * @return the created event
     */
    EventObject createCamelContextStopFailureEvent(CamelContext context, Exception cause);

    /**
     * Creates an {@link EventObject} for Camel is stopping.
     *
     * @param context camel context
     * @return the created event
     */
    EventObject createCamelContextStoppingEvent(CamelContext context);

    /**
     * Creates an {@link EventObject} for Camel has been stopped successfully.
     *
     * @param context camel context
     * @return the created event
     */
    EventObject createCamelContextStoppedEvent(CamelContext context);

    /**
     * Creates an {@link EventObject} for a Service failed to start cleanly
     *
     * @param context camel context
     * @param service the service
     * @param cause the cause exception
     * @return the created event
     */
    EventObject createServiceStartupFailureEvent(CamelContext context, Object service, Exception cause);

    /**
     * Creates an {@link EventObject} for a Service failed to stop cleanly
     *
     * @param context camel context
     * @param service the service
     * @param cause the cause exception
     * @return the created event
     */
    EventObject createServiceStopFailureEvent(CamelContext context, Object service, Exception cause);

    /**
     * Creates an {@link EventObject} for {@link Route} has been started successfully.
     *
     * @param route the route
     * @return the created event
     */
    EventObject createRouteStartedEvent(Route route);

    /**
     * Creates an {@link EventObject} for {@link Route} has been stopped successfully.
     *
     * @param route the route
     * @return the created event
     */
    EventObject createRouteStoppedEvent(Route route);

    /**
     * Creates an {@link EventObject} when an {@link org.apache.camel.Exchange} has been created
     *
     * @param exchange the exchange
     * @return the created event
     */
    EventObject createExchangeCreatedEvent(Exchange exchange);

    /**
     * Creates an {@link EventObject} when an {@link org.apache.camel.Exchange} has been completed successfully
     *
     * @param exchange the exchange
     * @return the created event
     */
    EventObject createExchangeCompletedEvent(Exchange exchange);

    /**
     * Creates an {@link EventObject} when an {@link org.apache.camel.Exchange} has failed
     *
     * @param exchange the exchange
     * @return the created event
     */
    EventObject createExchangeFailedEvent(Exchange exchange);

    /**
     * Creates an {@link EventObject} when an {@link org.apache.camel.Exchange} has failed
     * but was handled by the Camel error handlers such as an dead letter channel.
     *
     * @param exchange the exchange
     * @param failureHandler the failure handler such as moving the message to a dead letter queue
     * @param deadLetterChannel whether it was a dead letter channel or not handling the failure
     * @return the created event
     */
    EventObject createExchangeFailureHandledEvent(Exchange exchange, Processor failureHandler, boolean deadLetterChannel);

}
