package au.usyd.courseadvisor.Service;

import org.springframework.beans.factory.annotation.Autowired;

import au.usyd.courseadvisor.DAO.UserDao;
import au.usyd.courseadvisor.Model.Login;
import au.usyd.courseadvisor.Model.User;

public class UserServiceImpl implements UserService {

	  @Autowired
	  public UserDao userDao;

	  public void register(User user) {
	    userDao.register(user);
	  }

	  public User validateUser(Login login) {
	    return userDao.validateUser(login);
	  }
}