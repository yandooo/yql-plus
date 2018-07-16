/*
 * Copyright (c) 2016 Yahoo Inc.
 * Licensed under the terms of the Apache version 2.0 license.
 * See LICENSE file for terms.
 */

package com.yahoo.sample;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.Map;

public interface EngineContainerInterface {
    Map<String, JsonNode> run(String script, Object... bindings) throws Exception;
}
