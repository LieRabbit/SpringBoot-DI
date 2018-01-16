package lierabbit.di;

import org.springframework.stereotype.Service;

@Service//用于标注业务层组件
public class MyServiceImpl implements MyService
{

    @Override
    public void doSomeThing()
    {
        System.out.println("i am MyServiceImpl");
    }
}
