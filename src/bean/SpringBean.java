package bean;

import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SpringBean implements BeanNameAware {
    public SpringBean() {
        System.out.println("Spring bean Object created!");
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name aware!");
    }
}
