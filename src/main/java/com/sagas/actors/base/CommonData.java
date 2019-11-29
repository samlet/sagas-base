package com.sagas.actors.base;

import java.util.Map;
import java.util.Set;

public class CommonData {

    public static interface MeasureReading {}

    public static final class Measure implements MeasureReading {
        public final double value;

        public Measure(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Measure that = (Measure) o;

            return Double.compare(that.value, value) == 0;
        }

        @Override
        public int hashCode() {
            long temp = Double.doubleToLongBits(value);
            return (int) (temp ^ (temp >>> 32));
        }

        @Override
        public String toString() {
            return "Measure{" + "value=" + value + '}';
        }
    }

    public enum MeasureNotAvailable implements MeasureReading {
        INSTANCE
    }

    public enum ObjectNotAvailable implements MeasureReading {
        INSTANCE
    }

    public enum ObjectTimedOut implements MeasureReading {
        INSTANCE
    }

    public static final class RequestTrackObject {
        public final String groupId;
        public final String objectId;

        public RequestTrackObject(String groupId, String objectId) {
            this.groupId = groupId;
            this.objectId = objectId;
        }
    }


    public static final class RequestObjectList {
        final long requestId;

        public RequestObjectList(long requestId) {
            this.requestId = requestId;
        }
    }

    public static final class ReplyObjectList {
        final long requestId;
        final Set<String> ids;

        public ReplyObjectList(long requestId, Set<String> ids) {
            this.requestId = requestId;
            this.ids = ids;
        }
    }

    // #query-protocol
    public static final class RequestAllMeasures {
        final long requestId;

        public RequestAllMeasures(long requestId) {
            this.requestId = requestId;
        }
    }

    public static final class RespondAllMeasures {
        final long requestId;
        final Map<String, MeasureReading> measures;

        public RespondAllMeasures(long requestId, Map<String, MeasureReading> measures) {
            this.requestId = requestId;
            this.measures = measures;
        }
    }

    public static final class ObjectRegistered {}
}

