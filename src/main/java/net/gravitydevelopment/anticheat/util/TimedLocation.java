package net.gravitydevelopment.anticheat.util;

import org.bukkit.Location;

/**
 * @author dmulloy2
 */

public class TimedLocation {
    private final Location location;
    private final long timestamp;

    public TimedLocation(Location location, long timestamp) {
        this.location = location;
        this.timestamp = timestamp;
    }

    public Location getLocation() {
        return location;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public long getDeltaFromNow() {
        return System.currentTimeMillis() - timestamp;
    }

    public double getDistanceXFrom(Location loc) {
        return Util.getXDelta(location, loc);
    }

    public double getDistanceZFrom(Location loc) {
        return Util.getZDelta(location, loc);
    }

}
