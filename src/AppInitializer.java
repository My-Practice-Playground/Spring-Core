import bean.SpringBeanOne;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

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


       /* Map<String, String> getenv = System.getenv();
        getenv.keySet().forEach((e) -> System.out.println(e + " : " + getenv.get(e)));*/

//      ------------------------------------------------------------------------------------
/*
        Properties properties = System.getProperties();
        properties.keySet().forEach(e -> System.out.println(e + " : " + properties.getProperty((String) e)));*/
    }
}