package com.tea.frame.checker.impl;

import com.tea.frame.checker.Checker;
import com.tea.frame.valueObject.GenericFormat;

import java.util.List;

/**
 * will return true when all the items are true
 */
public class AndLogicChecker implements Checker {
    private final List<Checker> checkers;

    public AndLogicChecker(List<Checker> checkers) {
        this.checkers = checkers;
    }

    @Override
    public boolean isValid(GenericFormat valueObject) {
        for (Checker checker : checkers) {
            if (!checker.isValid(valueObject)) {
                return false;
            }
        }
        return true;
    }
}
