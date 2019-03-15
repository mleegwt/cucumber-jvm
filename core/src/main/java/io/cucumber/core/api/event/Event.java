package io.cucumber.core.api.event;

import java.time.Duration;
import java.util.Comparator;

/**
 * An event is an something that happens during test case execution.
 */
public interface Event {
    /**
     * When pickles are executed in parallel events can be
     * produced with a partial ordering.
     * <p>
     * The canonical order is the order in which these events
     * would have been generated had cucumber executed these
     * pickles in a serial fashion.
     * <p>
     * In canonical order events are first ordered by type:
     * <ol>
     * <li>TestRunStarted
     * <li>TestSourceRead
     * <li>SnippetsSuggestedEvent
     * <li>TestCaseEvent
     * <li>TestRunFinished
     * </ol>
     * <p>
     * Then TestCaseEvents are ordered by
     * <ol>
     * <li>uri
     * <li>line
     * <li>timestamp
     * </ol>
     */
    Comparator<Event> CANONICAL_ORDER = new CanonicalEventOrder();

    /**
     * @deprecated Replaced by Duration based variant.
     * @return The timestamp in nanos since start.
     */
    @Deprecated
    default Long getTimeStamp() {
        return getDuration() == null ? null : getDuration().toNanos(); 
    }
    
    /**
     * @return The event duration.
     */
    Duration getDuration();
}
