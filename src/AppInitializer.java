import bean.SpringBeanOne;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        /*Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                ctx.close();
            }
        }));*/
        ctx.registerShutdownHook();
        ctx.register(AppConfig.class);
        ctx.refresh();

        SpringBeanOne springBeanOne = ctx.getBean(SpringBeanOne.class);

    }
}
