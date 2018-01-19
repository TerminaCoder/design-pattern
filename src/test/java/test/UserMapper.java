package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author LXF
 * @date 2018/1/20 1:58
 */
public class UserMapper implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始输出日志");
        Object result = method.invoke(new UserDaoImpl(), args);
        System.out.println("日志输出结束s");
        return result;
    }
}
