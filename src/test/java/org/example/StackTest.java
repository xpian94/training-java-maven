package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StackTest {
    @Test
    void nothing() {
        var stack = new Stack();

        assertTrue(stack.isEmpty());
    }
}
