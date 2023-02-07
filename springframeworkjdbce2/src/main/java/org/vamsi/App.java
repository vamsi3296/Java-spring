package org.vamsi;

import config.ProjectConfig;
import demo.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try ( var c = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            Person p = c.getBean(Person.class);
            p.sayHello("Bill");
        }
    }
}
