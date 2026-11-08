import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String source = "input-file.bin";
        String destinationWithoutBuffer = "result-without-buffer.bin";
        String destinationWithBuffer = "result-with-buffer.bin";

        long start = System.nanoTime();
        FileCopy.copyWithoutBuffer(source, destinationWithoutBuffer);
        long end = System.nanoTime();
        System.out.println("Без буферизации: " + (end - start) / 1000000 + " мс");

        start = System.nanoTime();
        FileCopy.copyWithBuffer(source, destinationWithBuffer);
        end = System.nanoTime();
        System.out.println("С буферизацией: " + (end - start) / 1000000 + " мс");
    }
}