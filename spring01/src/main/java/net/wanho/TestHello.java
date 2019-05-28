package net.wanho;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHello {

    private static Logger logger = Logger.getLogger(TestHello.class);


    public static void main(String[] args) throws SQLException {
//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.setName("zhangsan");
//        helloWorld.hello();

//       创建spring的IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
//       从容器中获取helloworld的实例
       /* HelloWorld hw = (HelloWorld) ctx.getBean("hw2");

        HelloWorld hw1 = ctx.getBean(HelloWorld.class);


        hw1.hello();*/

       /* logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");*/


       /* Student stu = (Student) ctx.getBean("stu");
        System.out.println("属性注入:"+stu);
*/


       /* Student stu2 = (Student) ctx.getBean("stu21");
        System.out.println("构造方法注入:"+stu2); */



       /* Student stu3 = (Student) ctx.getBean("stu3");
        System.out.println("字面值ref:"+stu3);*/


       /* Student stu4 = (Student) ctx.getBean("stu4");
        System.out.println("list:"+stu4);*/


        /*Student stu5 = (Student) ctx.getBean("stu5");
        System.out.println("set:" + stu5);*/


//        Student stu6 = (Student) ctx.getBean("stu6");
//        System.out.println("map:" + stu6);


      /*  Student stu7 = (Student) ctx.getBean("stu7");
        System.out.println("properties:" + stu7);
*/
/*
        Student stu8 = (Student) ctx.getBean("stu8");
        System.out.println("util命名空间:" + stu8);*/

      /*  Student stu11 = (Student) ctx.getBean("stu11");
        System.out.println("p命名空间:" + stu11);*/


      /*  Student stu12 = (Student) ctx.getBean("stu12");
        Student stu122 = (Student) ctx.getBean("stu12");
        System.out.println(stu12==stu122);*/



//        System.out.println("自动装配:" + stu12);

        DataSource dataSource = ctx.getBean(DruidDataSource.class);

        Connection connection = dataSource.getConnection();
        System.out.println(connection);


    }

}
