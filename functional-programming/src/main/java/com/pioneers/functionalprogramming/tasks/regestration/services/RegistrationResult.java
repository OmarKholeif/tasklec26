package com.pioneers.functionalprogramming.tasks.regestration.services;

import java.util.function.Consumer;

@FunctionalInterface
public interface RegistrationResult {

    void execute(Consumer<String> successAction, Consumer<String> failAction);

    record Success(String message) implements RegistrationResult {

        @Override
        public void execute(Consumer<String> successAction, Consumer<String> failAction) {
            successAction.accept(message);
        }
    }

    record Failure(String message) implements RegistrationResult {

        @Override
        public void execute(Consumer<String> successAction, Consumer<String> failAction) {
            failAction.accept(message);
        }
    }
}
