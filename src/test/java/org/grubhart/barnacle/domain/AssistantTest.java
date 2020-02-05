package org.grubhart.barnacle.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AssistantTest {

    @Test
    public void testAddAssistant(){

        Event event = new Event();
        Assistant assinstant = new Assistant();

        event.add(assinstant);

        assertEquals(1,event.getAttendance());

    }
}
