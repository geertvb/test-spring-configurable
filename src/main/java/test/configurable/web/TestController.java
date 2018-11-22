package test.configurable.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.configurable.configurables.MyConfigurable;

import java.lang.reflect.Constructor;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/tests")
public class TestController {

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public String getTests() throws Exception {

        Class myClass = Class.forName("test.configurable.configurables.MyConfigurable");
        Constructor myConstructor = myClass.getDeclaredConstructor();
        Object myObject = myConstructor.newInstance();
        if (myObject instanceof MyConfigurable) {
            MyConfigurable myComponent = (MyConfigurable) myObject;
            return myComponent.sayHello();
        } else {
            return "Cry";
        }
    }

}
