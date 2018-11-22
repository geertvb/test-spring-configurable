package test.configurable.services;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    public String sayHi() {
        return "Hi. It Works!!!";
    }

}
