public class DatabaseConnection implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Закрываем соединение с базой данных");
    }
}
