package services;


import org.springframework.stereotype.Service;

@Service
public class HelloService {
//    public void hello(String name){
//        System.out.println("Hello " + name + "!");
//        throw new RuntimeException("Booo");
//    }
    public String hello(String name){
        String message = "Hello, " + name + "!";
        System.out.println(message);
        return message;
    }
}
