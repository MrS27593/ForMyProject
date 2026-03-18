package KlasowoObiektowo.SlowaKluczowe.PublicDone;

public class Main {
    public static void main(String[] args) {

    }
}

class UserService{
    public User register (String email){
        return new User(email);
    }
    private void validate(String email){

    }
}

class User{
    String email;
    User(String email){
         this.email=email;
     }
}
