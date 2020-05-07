package net.teaho.blog.server.util.checker.impl;

import net.teaho.blog.server.util.checker.Checker;
import net.teaho.blog.server.util.valueObject.GenericFormat;

import java.util.List;

/**
 * will return true when one item is true
 */
public class OrLogicChecker implements Checker {
    private final List<Checker> checkers;

    public OrLogicChecker(List<Checker> checkers) {
        this.checkers = checkers;
    }

    @Override
    public boolean isValid(GenericFormat valueObject) {
        for (Checker checker : checkers) {
            if (checker.isValid(valueObject)) {
                return true;
            }
        }
        return false;
    }
}
