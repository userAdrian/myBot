package org.telegramlibs.types;

public class Location implements java.io.Serializable {
    private Float longitude;
    private Float latitude;
    private Float horizontal_accurancy;
    private Integer live_period;
    private Integer heading;
    private Integer proximity_alert_radius;

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getHorizontal_accurancy() {
        return horizontal_accurancy;
    }

    public void setHorizontal_accurancy(Float horizontal_accurancy) {
        this.horizontal_accurancy = horizontal_accurancy;
    }

    public Integer getLive_period() {
        return live_period;
    }

    public void setLive_period(Integer live_period) {
        this.live_period = live_period;
    }

    public Integer getHeading() {
        return heading;
    }

    public void setHeading(Integer heading) {
        this.heading = heading;
    }

    public Integer getProximity_alert_radius() {
        return proximity_alert_radius;
    }

    public void setProximity_alert_radius(Integer proximity_alert_radius) {
        this.proximity_alert_radius = proximity_alert_radius;
    }
}
