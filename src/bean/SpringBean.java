package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SpringBean implements BeanNameAware,BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBean() {
        System.out.println("Spring bean Object created!");
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context register");
    }
    @PostConstruct
    public void method1(){
        System.out.println("Post-Construct");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After properties set");
    }

    @PreDestroy
    public void method2(){
        System.out.println("Pre-distroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Distroyed !");
    }
}

