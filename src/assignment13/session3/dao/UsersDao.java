package assignment13.session3.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import assignment13.session3.bean.Users;

public class UsersDao extends JdbcDaoSupport{
	 
    
    public void insertBatch(List<Users> users) {
         
        String query = "insert into users values (?,?,?,?)";
        List<Object[]> inputList = new ArrayList<Object[]>();
        for(Users user:users){
            Object[] tmp = {user.getUserId(),user.getUserName(),user.getAddress(),user.getPassword()};
            inputList.add(tmp);
        }
        getJdbcTemplate().batchUpdate(query, inputList); 
    }
}