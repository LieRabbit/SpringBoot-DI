package lierabbit.di;

import org.springframework.stereotype.Component;

@Component//泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注。
public class MyComponent
{
    public void hi(String name)
    {
        System.out.println("hi " + name + ",I am MyComponent");
    }
}
