public class PaymentSession implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Завершаем платёжную сессию");
        throw new RuntimeException("Ошибка при закрытии платёжной сессии");
    }
}
