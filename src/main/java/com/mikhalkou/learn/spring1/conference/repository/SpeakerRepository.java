package com.mikhalkou.learn.spring1.conference.repository;

import com.mikhalkou.learn.spring1.conference.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
