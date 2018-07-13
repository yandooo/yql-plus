/*
 * Copyright (c) 2016 Yahoo Inc.
 * Licensed under the terms of the Apache version 2.0 license.
 * See LICENSE file for terms.
 */

package com.yahoo.yqlplus.engine.guice;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;
import com.yahoo.yqlplus.engine.ModuleType;
import com.yahoo.yqlplus.engine.internal.plan.ast.ConditionalsBuiltinsModule;
import com.yahoo.yqlplus.engine.internal.plan.ast.RecordsBuiltinsModule;
import com.yahoo.yqlplus.engine.internal.plan.ast.SequenceBuiltinsModule;

public class PhysicalOperatorBuiltinsModule extends AbstractModule {
    @Override
    protected void configure() {
        MapBinder<String, ModuleType> prefixModuleBindings = MapBinder.newMapBinder(binder(), String.class, ModuleType.class);
        prefixModuleBindings.addBinding("yql.sequences").to(SequenceBuiltinsModule.class);
        prefixModuleBindings.addBinding("yql.conditionals").to(ConditionalsBuiltinsModule.class);
        prefixModuleBindings.addBinding("yql.records").to(RecordsBuiltinsModule.class);
    }
}
