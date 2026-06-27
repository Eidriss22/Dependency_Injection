package net.idriss.pres;

import net.idriss.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringAnnotations {
    static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("net.idriss");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("Res = " + metier.calcul());
    }
}
