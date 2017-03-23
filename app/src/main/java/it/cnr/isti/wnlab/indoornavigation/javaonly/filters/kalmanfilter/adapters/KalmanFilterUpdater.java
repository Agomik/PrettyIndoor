package it.cnr.isti.wnlab.indoornavigation.javaonly.filters.kalmanfilter.adapters;

import it.cnr.isti.wnlab.indoornavigation.javaonly.filters.kalmanfilter.KalmanFilter;

public abstract class KalmanFilterUpdater {
    protected KalmanFilter filter;

    protected KalmanFilterUpdater(KalmanFilter filter) {
        this.filter = filter;
    }
}