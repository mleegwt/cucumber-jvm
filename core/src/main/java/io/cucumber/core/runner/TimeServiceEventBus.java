package io.cucumber.core.runner;

import java.time.Duration;

import io.cucumber.core.event.AbstractEventBus;

public final class TimeServiceEventBus extends AbstractEventBus {
    private final TimeService stopWatch;

    public TimeServiceEventBus(TimeService stopWatch) {
        this.stopWatch = stopWatch;
    }

    @Override
    public Duration getDuration() {
        return stopWatch.time();
    }
}
