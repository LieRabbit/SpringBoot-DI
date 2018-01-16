package lierabbit.di;

import org.springframework.stereotype.Controller;

@Controller//用于标注控制层组件
public class MyController
{
    public void hi(String name)
    {
        System.out.println("hi " + name + ",I am MyController");
    }
}
