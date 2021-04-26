import com.mikhalkou.learn.sprint1.conference.repository.DummySpeakerRepository;
import com.mikhalkou.learn.sprint1.conference.repository.SpeakerRepository;
import com.mikhalkou.learn.sprint1.conference.service.SpeakerService;
import com.mikhalkou.learn.sprint1.conference.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="speakerRepository")
    public SpeakerRepository speakerRepository(){
        return new DummySpeakerRepository();
    }

    @Bean(name="speakerService")
    public SpeakerService speakerService(){
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl(speakerRepository());
        //speakerService.setRepository(speakerRepository());
        speakerRepository();
        return speakerService;
    }

}
