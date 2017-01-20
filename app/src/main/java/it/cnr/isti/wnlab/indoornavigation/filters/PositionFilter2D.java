package it.cnr.isti.wnlab.indoornavigation.filters;

import it.cnr.isti.wnlab.indoornavigation.IndoorPosition;
import it.cnr.isti.wnlab.indoornavigation.XYPosition;

/**
 * Filter that operates with x,y coordinates.
 */
public interface PositionFilter2D extends Filter {
    /**
     * @param floor Floor is not retrieved through Kalman Filter.
     * @param timestamp Timestamp is not stored by default in filter instance.
     * @return Up-to-date IndoorPosition object.
     */
    IndoorPosition getPosition(int floor, long timestamp);
    XYPosition get2DPosition();
}