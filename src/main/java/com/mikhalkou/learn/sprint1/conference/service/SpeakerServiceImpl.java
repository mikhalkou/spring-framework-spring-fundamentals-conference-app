package com.mikhalkou.learn.sprint1.conference.service;

import com.mikhalkou.learn.sprint1.conference.model.Speaker;
import com.mikhalkou.learn.sprint1.conference.repository.DummySpeakerRepository;
import com.mikhalkou.learn.sprint1.conference.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        this.repository = speakerRepository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
