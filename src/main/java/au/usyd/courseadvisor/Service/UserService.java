package au.usyd.courseadvisor.Service;


import org.springframework.stereotype.Service;

import au.usyd.courseadvisor.Model.Login;
import au.usyd.courseadvisor.Model.User;

@Service
public interface UserService {

	  void register(User user);

	  User validateUser(Login login);
}