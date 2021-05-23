package Core;

import AppleAuth.AppleAuthManager;
import Entities.concretes.User;

public class AppleAutManagerAdapter implements AuthService{
    AppleAuthManager appleAuthManager;

    public AppleAutManagerAdapter(AppleAuthManager appleAuthManager) {
        this.appleAuthManager = appleAuthManager;
    }

    @Override
    public void register(User user) {
        this.appleAuthManager.register(user);
    }

    @Override
    public void login(User user) {
     this.appleAuthManager.login(user);
    }
}
