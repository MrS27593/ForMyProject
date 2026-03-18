package KlasowoObiektowo.Exceptions.NullPointerExceptions132Done;
import java.util.Objects;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

    }
}
class User{
    Optional<User> user;

    public void main(String[] args) {

//        user.ifPresent(u -> System.out.println(u.getName()));
        this.user = Objects.requireNonNull(user, "user nie może być null");
    }

}
