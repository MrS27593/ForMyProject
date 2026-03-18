package KlasowoObiektowo.Interfejsy.Predicate141Done;

import java.util.List;
import java.util.function.Predicate;

public class MyPredicateInterfaceExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = a -> a%2==0;
        System.out.println(isEven.test(2));
        System.out.println(isEven.test(5));

        List<Integer> list = List.of(1,2,3,4,5,6,7);
        list.stream().filter(x->x>3).forEach(System.out::println);
        Predicate<Integer> gt3 = a -> a>3;
        Predicate<Integer> even  = a -> a%2==0;
        Predicate<Integer> both = gt3.and(even);
        System.out.println(both.test(4));
        System.out.println(both.test(5));

        Predicate<Integer> gt4 = a->a>4;
        Predicate<Integer> even2 = a->a%2==0;
        Predicate<Integer> either = gt4.or(even2);
        System.out.println(either.test(3));

        Predicate<Integer> odd = even.negate();

        Predicate<String>  isHello = Predicate.isEqual("hello");
        System.out.println(isHello.test("hello"));
        System.out.println(isHello.test("hi"));

        list.removeIf(x->x<3);
        boolean exist = list.stream().anyMatch(x->x>10);
        System.out.println(exist);

        Predicate<String> notNUll = s->s!=null;
        Predicate<String> notEmpty = s->!s.isEmpty();
        Predicate<String> valid = notEmpty.and(notNUll);
        System.out.println(valid.test(""));
    }
}
