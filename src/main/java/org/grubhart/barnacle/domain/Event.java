package org.grubhart.barnacle.domain;

import java.util.ArrayList;
import java.util.List;

public class Event {

    private List<Assistant> audience;

    public Event() {

        audience = new ArrayList<>();

    }

    public void add(Assistant assinstant) {
        audience.add(assinstant);
    }

    public int getAttendance() {

        return audience.size();
    }
}
