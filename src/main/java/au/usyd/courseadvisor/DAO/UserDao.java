package au.usyd.courseadvisor.DAO;

import au.usyd.courseadvisor.Model.User;
import au.usyd.courseadvisor.Model.Login;

public interface UserDao {

  void register(User user);

  User validateUser(Login login);

}