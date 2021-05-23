package AppleAuth;

import Entities.concretes.User;

public class AppleAuthManager {
    public void register(User user){
        System.out.println("Sayın "+user.getName()+" "+user.getSurname()+ "Apple hesabınız ile üye oldunuz.");
    }
    public void login(User user){
        System.out.println("Sayın "+user.getName()+" "+user.getSurname()+ "Apple hesabınız ile giriş yaptınız.");
    }
}
