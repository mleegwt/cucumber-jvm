package io.cucumber.core.api.event;

import java.time.Duration;

abstract class TimeStampedEvent implements Event {
    private final Duration duration;

    TimeStampedEvent(Duration duration) {
        this.duration = duration;
    }

    @Override
    public Duration getDuration() {
        return duration;
    }
}
