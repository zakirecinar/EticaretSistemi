package GoogleAuth;

import Entities.concretes.User;

import javax.jws.soap.SOAPBinding;

public class GoogleAuthManager {
  public void register(User user){
      System.out.println("Sayın "+user.getName()+" "+user.getSurname()+ "Google hesabınız ile üye oldunuz.");
  }
  public void login(User user){
      System.out.println("Sayın "+user.getName()+" "+user.getSurname()+ "Google hesabınız ile giriş yaptınız.");
  }
}
