package bean.inter.impl;

import bean.inter.BeanInter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("q1")
public class ChildBeanImpl1 implements BeanInter {
    public ChildBeanImpl1() {
        System.out.println("ChildBean1");
    }
}
