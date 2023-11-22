import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.CountService;

public class CountServiceTest {

    @Test
    public void testIfMoneyIsTight() {
        CountService service = new CountService();
        int expected = 3;
        int actual = service.calculate(20_000, 10_000, 3_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIfIsMuchMoney() {
        CountService service = new CountService();
        int expected = 2;
        int actual = service.calculate(150_000, 100_000, 60_000);
        Assertions.assertEquals(expected, actual);
    }
}
