package lierabbit.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DiApplicationTests
{
    @Autowired//自动注入
    private MyController myController;
    @Autowired//自动注入
    private MyRepository myRepository;
    @Autowired//自动注入
    private MyComponent myComponent;
    @Autowired//自动注入实现了该接口的bean
    private MyService myService;

    @Test
    public void contextLoads()
    {
        myController.hi("lierabbit");
        myRepository.hi("lierabbit");
        myComponent.hi("lierabbit");
        myService.doSomeThing();
    }

}
