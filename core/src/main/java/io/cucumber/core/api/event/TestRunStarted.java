package io.cucumber.core.api.event;

import java.time.Duration;

public final class TestRunStarted extends TimeStampedEvent {

    public TestRunStarted(Duration duration) {
        super(duration);
    }
}
