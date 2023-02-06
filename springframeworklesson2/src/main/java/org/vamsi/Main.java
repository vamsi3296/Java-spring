package org.vamsi;

import beans.Owner;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        try ( var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Owner o = c.getBean(Owner.class);
            System.out.println(o);
        }
    }
}
