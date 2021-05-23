package Business.abstracts;

import Entities.concretes.User;

import javax.jws.soap.SOAPBinding;

public interface UserService {
    void register(User user);
    void login(User user);
    void confirm(User user);
    void registerWithAccout(User user);
    void loginWithAccount(User user);
}
