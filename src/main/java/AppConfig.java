import com.mikhalkou.learn.sprint1.conference.repository.DummySpeakerRepository;
import com.mikhalkou.learn.sprint1.conference.repository.SpeakerRepository;
import com.mikhalkou.learn.sprint1.conference.service.SpeakerService;
import com.mikhalkou.learn.sprint1.conference.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.beans.beancontext.BeanContext;

@Configuration
public class AppConfig {

    @Bean(name="speakerRepository")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerRepository speakerRepository(){
        return new DummySpeakerRepository();
    }

    @Bean(name="speakerService")
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService speakerService(){
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl(speakerRepository());
        //speakerService.setRepository(speakerRepository());
        speakerRepository();
        return speakerService;
    }

}
