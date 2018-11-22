package test.configurable.configurables;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import test.configurable.services.MyServiceImpl;

@Configurable
public class MyConfigurable {

    @Autowired
    protected MyServiceImpl myService;

    public String sayHello() {
        return myService.sayHi();
    }

}
