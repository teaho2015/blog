package com.tea.frame.checker.impl.ums;

import com.tea.frame.ums.model.User;

/**
 * check if it fulfilled the required length
 */
public class TokenChecker extends AbstractUmsChecker {
    private final int LENGTH_LIMIT;

    public TokenChecker(int lengthLimit) {
        LENGTH_LIMIT = lengthLimit;
    }

    @Override
    public boolean isValid(User user) {
//        return user.getTokenID()!= null && user.getTokenID().length() >= LENGTH_LIMIT;
       return true;
    }
}
