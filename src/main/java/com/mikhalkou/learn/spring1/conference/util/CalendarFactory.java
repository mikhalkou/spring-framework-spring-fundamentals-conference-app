package com.mikhalkou.learn.spring1.conference.util;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;

public class CalendarFactory implements FactoryBean<Calendar> {
    private Calendar instCalendar = Calendar.getInstance();

    @Override
    public Calendar getObject() throws Exception {
        return instCalendar;
    }

    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }

    public void addDays(int days){
        instCalendar.add(Calendar.DAY_OF_YEAR, days);
    }
}
