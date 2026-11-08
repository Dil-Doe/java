import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Money usdFirst = new Money(new BigDecimal("100.0"), "USD");
        Money usdSecond = new Money(new BigDecimal("100.00"), "USD");
        Money eurFirst = new Money(new BigDecimal("100.00"), "EUR");

        Set<Money> moneySet = new HashSet<>();
        moneySet.add(usdFirst);
        moneySet.add(usdSecond);
        moneySet.add(eurFirst);

        System.out.println(usdFirst.equals(usdSecond));
        System.out.println(usdFirst.hashCode() == usdSecond.hashCode());
        System.out.println(usdFirst.equals(eurFirst));
        System.out.println(moneySet.size());
    }
}