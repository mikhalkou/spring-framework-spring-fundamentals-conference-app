import com.mikhalkou.learn.sprint1.conference.model.Speaker;
import com.mikhalkou.learn.sprint1.conference.service.SpeakerService;
import com.mikhalkou.learn.sprint1.conference.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService service = context.getBean("speakerService", SpeakerService.class);

        Speaker speaker = service.findAll().get(0);
        System.out.println(speaker.getFirstName() + " " + speaker.getLastName());
    }
}
