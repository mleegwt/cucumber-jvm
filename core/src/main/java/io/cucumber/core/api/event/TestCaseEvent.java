package io.cucumber.core.api.event;

import java.time.Duration;

public abstract class TestCaseEvent extends TimeStampedEvent {

    final TestCase testCase;

    TestCaseEvent(Duration duration, TestCase testCase) {
        super(duration);
        this.testCase = testCase;
    }

    public TestCase getTestCase() {
        return testCase;
    }
}
