package io.cucumber.core.api.event;

import java.time.Duration;

public final class TestRunFinished extends TimeStampedEvent {

    public TestRunFinished(Duration duration) {
        super(duration);
    }
}
