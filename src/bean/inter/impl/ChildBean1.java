package bean.inter.impl;

import bean.inter.BeanInter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ChildBean1 implements BeanInter {
}
