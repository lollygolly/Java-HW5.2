import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.CountService;

public class CountServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Count.csv")

    public void testIfMoneyIsTight(int expected, int threshold, int income, int expenses) {
        CountService service = new CountService();
        int actual = service.calculate(threshold, income, expenses);
        Assertions.assertEquals(expected, actual);
    }
}

