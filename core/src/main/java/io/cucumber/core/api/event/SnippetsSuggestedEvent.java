package io.cucumber.core.api.event;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

import gherkin.pickles.PickleLocation;

public class SnippetsSuggestedEvent extends TimeStampedEvent {
    public final String uri;
    public final List<PickleLocation> stepLocations;
    public final List<String> snippets;

    public SnippetsSuggestedEvent(Duration duration, String uri, List<PickleLocation> stepLocations, List<String> snippets) {
        super(duration);
        this.uri = uri;
        this.stepLocations = stepLocations;
        this.snippets = Collections.unmodifiableList(snippets);
    }

}
