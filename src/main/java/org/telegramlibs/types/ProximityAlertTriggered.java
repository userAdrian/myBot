package org.telegramlibs.types;

public class ProximityAlertTriggered implements java.io.Serializable {
    public User getTraveler() {
        return traveler;
    }

    public void setTraveler(User traveler) {
        this.traveler = traveler;
    }

    public User getWatcher() {
        return watcher;
    }

    public void setWatcher(User watcher) {
        this.watcher = watcher;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    private User traveler;
    private User watcher;
    private Integer distance;
}
