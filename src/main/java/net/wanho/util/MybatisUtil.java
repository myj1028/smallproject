package net.wanho.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by Administrator on 2019/7/25.
 */
public class MybatisUtil {
    private static SqlSessionFactory sf;
    private static ThreadLocal<SqlSession> threadLocal;

    static {

        threadLocal=new ThreadLocal<SqlSession>();
        InputStream inputStream = MybatisUtil.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        sf=new SqlSessionFactoryBuilder().build(inputStream);

    }

    public static SqlSession getSession(){
        //先从本地线程中取
        SqlSession session = threadLocal.get();
        //如果没有，从工厂中获取新的连接
        if(session==null){
            session=sf.openSession();
            threadLocal.set(session);
        }

        return session;

    }

    /*关闭session*/
    public static void closeSession(){
        SqlSession session=threadLocal.get();
        if(session!=null){
            session.close();
            threadLocal.remove();
        }

    }





}
