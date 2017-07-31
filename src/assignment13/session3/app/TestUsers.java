package assignment13.session3.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import assignment13.session3.bean.Users;
import assignment13.session3.dao.UsersDao;

public class TestUsers {
	private static ApplicationContext ctx;

	public static void main( String[] args ){
    	ctx = new ClassPathXmlApplicationContext("spring.xml");

        UsersDao usersdao = (UsersDao) ctx.getBean("usersDao");
        Users user1 = new Users("101","Amit","abc","Noida");
        Users user2 = new Users("102","Sumit","jkl","Gurgaon");
        Users user3 = new Users("103","Vijay","xyz","Delhi");

        List<Users>users = new ArrayList<Users>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        usersdao.insertBatch(users);

    }
}
