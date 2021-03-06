/*
 * Copyright (c) 2016 Yahoo Inc.
 * Licensed under the terms of the Apache version 2.0 license.
 * See LICENSE file for terms.
 */

package com.yahoo.yqlplus.language.operator;

public interface OperatorVisitor {
    <T extends Operator> boolean enter(OperatorNode<T> node);

    <T extends Operator> void exit(OperatorNode<T> node);
}
