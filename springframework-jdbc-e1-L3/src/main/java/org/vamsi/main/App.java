package org.vamsi.main;

import config.ProjectConfig;
import model.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.ProductRepository;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try( var c = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            ProductRepository productRepository = c.getBean(ProductRepository.class);

//            Product p = new Product();
//            p.setName("Beer");
//            p.setPrice(10.0);
//
//            productRepository.addProduct(p);

            List<Product> products = productRepository.getProducts();
            products.forEach(System.out::println);
        }
    }
}
