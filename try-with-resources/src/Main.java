public class Main {
    public static void main(String[] args) {
        try (
                DatabaseConnection connection = new DatabaseConnection();
                OrderFile orderFile = new OrderFile();
                PaymentSession paymentSession = new PaymentSession()
        ) {
            System.out.println("Обрабатываем заказ...");
            throw new RuntimeException("Ошибка при обработке заказа");
        } catch (RuntimeException e) {
            System.out.println("Основное исключение: " + e.getMessage());

            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println("Suppressed исключение: " + suppressed.getMessage());
            }
        }
    }
}