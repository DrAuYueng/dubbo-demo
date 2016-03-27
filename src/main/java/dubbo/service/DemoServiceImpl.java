package dubbo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("demoServiceImpl")
public class DemoServiceImpl implements DemoService {
    
    @Value("${foo}")
    private int foo;

    public void sayHelle() {
        System.out.println("hello world!");

    }

}
