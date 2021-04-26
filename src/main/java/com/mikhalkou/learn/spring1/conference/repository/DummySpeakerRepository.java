package com.mikhalkou.learn.spring1.conference.repository;

import com.mikhalkou.learn.spring1.conference.model.Speaker;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class DummySpeakerRepository implements SpeakerRepository {

    public DummySpeakerRepository() {
        System.out.println(this.getClass().getName() + " created");
    }

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Bryan");
        speaker.setLastName("Hansen");

        speakers.add(speaker);

        return speakers;
    }

}
