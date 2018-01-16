package lierabbit.di;

import org.springframework.stereotype.Repository;

@Repository//用于标注数据访问组件，即DAO组件
public class MyRepository
{
    public void hi(String name)
    {
        System.out.println("hi " + name + ",I am MyRepository");
    }
}
