package eu.sealsproject.platform.res.domain.swst.results;

import java.io.Serializable;
import java.net.URI;

public class Match
        implements Serializable {

    private static final long serialVersionUID = 1L;
    private URI serviceDescriptionURI;
    private double confidenceValue;
    private DiscoveryResult.MatchDegree matchDegree;
    private int order;

    public Match(URI serviceDescriptionURI, double confidenceValue, DiscoveryResult.MatchDegree matchDegree, int order) {
        this.serviceDescriptionURI = serviceDescriptionURI;
        this.confidenceValue = confidenceValue;
        this.matchDegree = matchDegree;
        this.order = order;
    }

    public void setServiceDescriptionURI(URI serviceDescriptionURI) {
        this.serviceDescriptionURI = serviceDescriptionURI;
    }

    public URI getServiceDescriptionURI() {
        return this.serviceDescriptionURI;
    }

    public void setConfidenceValue(double confidenceValue) {
        this.confidenceValue = confidenceValue;
    }

    public double getConfidenceValue() {
        return this.confidenceValue;
    }

    public void setMatchDegree(DiscoveryResult.MatchDegree matchDegree) {
        this.matchDegree = matchDegree;
    }

    public DiscoveryResult.MatchDegree getMatchDegree() {
        return this.matchDegree;
    }

    public int getOrder() {
        return this.order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean equals(Object object) {
        if ((object == null) || (!(object instanceof Match))) {
            return false;
        }

        Match thatMatch = (Match) object;

        if (!getServiceDescriptionURI().equals(thatMatch.getServiceDescriptionURI())) {
            return false;
        }

        if (Double.doubleToLongBits(getConfidenceValue()) != Double.doubleToLongBits(thatMatch.getConfidenceValue())) {
            return false;
        }

        if (!getMatchDegree().equals(thatMatch.getMatchDegree())) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int hash = 31 + getServiceDescriptionURI().hashCode();
        hash = 31 * hash + (int) Double.doubleToLongBits(getConfidenceValue());
        hash = 31 * hash + getMatchDegree().hashCode();

        return hash;
    }
}
