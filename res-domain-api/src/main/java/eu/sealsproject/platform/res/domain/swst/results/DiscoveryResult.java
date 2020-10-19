package eu.sealsproject.platform.res.domain.swst.results;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class DiscoveryResult
        implements Serializable {

    private static final long serialVersionUID = 1L;
    private URI goalURI;
    private List<Match> results;

    public static enum MatchDegree {
        NONE("NONE"),
        PLUGIN("PLUGIN"),
        EXACT("EXACT"),
        SUBSUMPTION("SUBSUMPTION");

        private final String value;

        private MatchDegree(String value) {
            this.value = value;
        }

        public static String printMatchDegree(MatchDegree v) {
            return v.value;
        }

        public static MatchDegree parseMatchDegree(String v) {
            for (MatchDegree c : MatchDegree.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }
    }

    public DiscoveryResult() {
        this.goalURI = null;
        this.results = new ArrayList();
    }

    public DiscoveryResult(URI goalDescriptionURI) {
        this.goalURI = goalDescriptionURI;
        this.results = new ArrayList();
    }

    public DiscoveryResult(URI goalDescriptionURI, List<Match> matches) {
        if (matches == null) {
            throw new IllegalArgumentException("List of matches must not be null");
        }

        this.goalURI = goalDescriptionURI;
        this.results = matches;
    }

    public URI getGoalURI() {
        return this.goalURI;
    }

    public void setGoalURI(URI goalURI) {
        this.goalURI = goalURI;
    }

    public void add(Match theServiceDescriptionMatch) {
        this.results.add(theServiceDescriptionMatch);
    }

    public void remove(Match theServiceDescriptionMatch) {
        this.results.remove(theServiceDescriptionMatch);
    }

    public List<Match> getResults() {
        return new ArrayList(this.results);
    }

    public void clear() {
        this.results.clear();
    }

    public boolean equals(Object object) {
        if ((object == null) || (!(object instanceof DiscoveryResult))) {
            return false;
        }

        DiscoveryResult thatDiscoveryResult = (DiscoveryResult) object;

        return this.results.equals(thatDiscoveryResult.getResults());
    }

    public int hashCode() {
        return this.results.hashCode();
    }
}
