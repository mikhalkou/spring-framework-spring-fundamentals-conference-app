import com.mikhalkou.learn.spring1.conference.repository.DummySpeakerRepository;
import com.mikhalkou.learn.spring1.conference.repository.SpeakerRepository;
import com.mikhalkou.learn.spring1.conference.service.SpeakerService;
import com.mikhalkou.learn.spring1.conference.service.SpeakerServiceImpl;
import com.mikhalkou.learn.spring1.conference.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.mikhalkou.learn.spring1"})
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calFactory(){
        CalendarFactory calendarFactory = new CalendarFactory();
        calendarFactory.addDays(2);
        return calendarFactory;
    }

    @Bean
    public Calendar cal() throws Exception {
        return calFactory().getObject();
    }

/*    @Bean(name="speakerRepository")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerRepository speakerRepository(){
        return new DummySpeakerRepository();
    }*/

/*  @Bean(name="speakerService")
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService speakerService(){
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
        return speakerService;
    }*/

}
