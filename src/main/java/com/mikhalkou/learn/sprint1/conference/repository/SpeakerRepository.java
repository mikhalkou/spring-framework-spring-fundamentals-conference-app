package com.mikhalkou.learn.sprint1.conference.repository;

import com.mikhalkou.learn.sprint1.conference.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
