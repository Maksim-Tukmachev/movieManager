import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.maven.MovieManager;

public class MovieManagerTest {
    @Test
    public void test() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLast() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IIII");
        manager.addMovie("Film IIIII");
        manager.addMovie("Film IIIIII");

        String[] expected = {"Film IIIIII", "Film IIIII", "Film IIII", "Film III"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}