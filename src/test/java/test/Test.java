package test;

import java.lang.reflect.Proxy;

/**
 * @author LXF
 * @date 2018/1/20 0:04
 */
public class Test {
    public static void main(String[] args) {
        //IUserDao userDao = new UserDaoImpl();

//        IUserDao userDao = (IUserDao) Proxy.newProxyInstance(IUserDao.class.getClassLoader(),
////                new Class[]{IUserDao.class}, new InvocationHandler() {
////                    @Override
////                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
////                        System.out.println("开始输出日志");
////                        Object result = method.invoke(new UserDaoImpl(), args);
////                        System.out.println("日志输出结束s");
////                        return result;
////
////                    }
////                });
        IUserDao userDao = (IUserDao) Proxy.newProxyInstance(IUserDao.class.getClassLoader(), new Class[]{IUserDao.class}, new UserMapper());
//        IUserDao userDao = (IUserDao) Proxy.newProxyInstance(IUserDao.class.getClassLoader(),
//                new Class[]{IUserDao.class}, (proxy, method, arg) -> {
//                    System.out.println("开始输出日志");
//                    Object result = method.invoke(new UserDaoImpl(), arg);
//                    System.out.println("日志输出结束66");
//                    return result;
//                });
        //userService.setUserDao(userDao);

        //IUserDao userDao

        System.out.println("1");

        System.out.println(userDao.getNumber());

        System.out.println(userDao.upNumber());
    }
}
