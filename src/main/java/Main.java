import ru.netology.services.CountService;

public class Main {
    public static void main(String[] args) {
        CountService service = new CountService();
        int money = 0; // Начальное количество денег на счету
        int count = service.calculate(20_000, 10_000, 3_000);
        System.out.println(count);
    }
}



