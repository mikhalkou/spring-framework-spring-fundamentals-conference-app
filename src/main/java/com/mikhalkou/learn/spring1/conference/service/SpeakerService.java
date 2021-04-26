package com.mikhalkou.learn.spring1.conference.service;

import com.mikhalkou.learn.spring1.conference.model.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}
