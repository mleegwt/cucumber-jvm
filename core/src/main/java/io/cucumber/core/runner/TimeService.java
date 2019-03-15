package io.cucumber.core.runner;

import java.time.Duration;

public interface TimeService {
    Duration time();

    TimeService SYSTEM = new TimeService() {
        @Override
        public Duration time() {
            return Duration.ofNanos(System.nanoTime());
        }
    };

}
