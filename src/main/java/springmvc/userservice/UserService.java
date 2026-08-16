package springmvc.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.modal.User;


@Service
public class UserService {
	
	@Autowired
	private UserDao userdao;
	public  int createUser(User user) {
		return this.userdao.saveUser(user);
		
	}

}
