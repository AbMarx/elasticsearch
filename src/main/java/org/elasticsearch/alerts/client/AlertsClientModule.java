/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.alerts.client;

import org.elasticsearch.common.inject.AbstractModule;

/**
 *
 */
public class AlertsClientModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(AlertsClient.class).asEagerSingleton();
    }
}
