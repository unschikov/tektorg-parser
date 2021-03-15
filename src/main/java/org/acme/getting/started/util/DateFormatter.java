package org.acme.getting.started.util;


import java.time.OffsetDateTime;
import java.time.ZonedDateTime;


public class DateFormatter {
    public static ZonedDateTime formatToZoneDateTime(String date) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(date);
        return offsetDateTime.toZonedDateTime();
    }
}