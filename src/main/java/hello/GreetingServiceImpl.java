package hello;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.stereotype.Service;

@SpringBootConfiguration
@Service
public class GreetingServiceImpl implements GreetingService
{
    @Override
    public String getGreeting(String name)
    {
        return "Hello, " + name + "!";
    }
}
