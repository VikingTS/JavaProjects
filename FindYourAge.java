import java.time.Period;
import java.time.LocalDate;
import java.time.Period;

public class FindYourAge {
    public static void main(String[] args) {
        
        LocalDate dob = LocalDate.of(1998, 8, 11);
        LocalDate current = LocalDate.now();

        int a = Period.between(dob, current).getYears();
        System.out.println(a);
    }
}
