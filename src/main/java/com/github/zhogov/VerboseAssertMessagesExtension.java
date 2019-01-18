package com.github.zhogov;

public class VerboseAssertMessagesExtension {
    /**
     * Extension method for String: <p> assert "Condition should be true" | a==b
     * @param self message itself
     * @param condition condition to check
     * @return initial condition value
     */
    public static Boolean or(String self, Boolean condition) {
        return condition;
    }
}