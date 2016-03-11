package dubbo.service;

import org.springframework.stereotype.Service;

@Service("demoServiceImpl")
public class DemoServiceImpl implements DemoService {

    public void sayHelle() {
        System.out.println("hello world!");

    }

}
