package com.classicgroup1400.taghvimfarsi.entity;

/**
 * PersianCalendarEvent
 *
 * @author ebraminio
 */
abstract public class AbstractEvent {
    protected String title;
    protected boolean holiday;

    public String getTitle() {
        return title;
    }

    public boolean isHoliday() {
        return holiday;
    }
}