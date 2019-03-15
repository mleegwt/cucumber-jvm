package io.cucumber.core.event;

import java.time.Duration;

import io.cucumber.core.api.event.Event;
import io.cucumber.core.api.event.EventPublisher;

public interface EventBus extends EventPublisher {

    /**
     * @deprecated Replaced by typesafe variant.
     * @return The timestamp in nanos since start.
     */
    @Deprecated
    default Long getTime() {
        return getDuration().toNanos();
    }
    
    Duration getDuration();

    void send(Event event);

    void sendAll(Iterable<Event> queue);

}
