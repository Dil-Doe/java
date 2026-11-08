public class OrderFile implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Закрываем файл заказа");
    }
}
