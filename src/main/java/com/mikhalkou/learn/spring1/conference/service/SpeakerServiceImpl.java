package com.mikhalkou.learn.spring1.conference.service;

import com.mikhalkou.learn.spring1.conference.model.Speaker;
import com.mikhalkou.learn.spring1.conference.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Service("speakerService")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("no args constructor");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        this.repository = speakerRepository;
    }

    @PostConstruct
    private void init() {
        System.out.println("Post Construct for " + this.getClass());
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Pre Destroy for " + this.getClass());
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        System.out.println("repo setter");
        this.repository = repository;
    }
}
