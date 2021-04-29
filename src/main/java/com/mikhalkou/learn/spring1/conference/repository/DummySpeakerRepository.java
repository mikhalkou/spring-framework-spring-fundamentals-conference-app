package com.mikhalkou.learn.spring1.conference.repository;

import com.mikhalkou.learn.spring1.conference.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
@Profile("dev")
public class DummySpeakerRepository implements SpeakerRepository {
    @Autowired
    private Calendar cal;
    @Value("#{T(Math).random() * 100}")
    private double seed;

    public DummySpeakerRepository() {
        System.out.println(this.getClass().getName() + " created");
    }

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Bryan");
        speaker.setLastName("Hansen");
        speaker.setSeedValidTo(cal.getTime());
        speaker.setSeed(seed);

        speakers.add(speaker);

        return speakers;
    }

}
