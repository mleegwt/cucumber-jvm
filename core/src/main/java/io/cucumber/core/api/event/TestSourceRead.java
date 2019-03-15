package io.cucumber.core.api.event;

import java.time.Duration;

public final class TestSourceRead extends TimeStampedEvent {
    public final String uri;
    public final String source;

    public TestSourceRead(Duration duration, String uri, String source) {
        super(duration);
        this.uri = uri;
        this.source = source;
    }

}
