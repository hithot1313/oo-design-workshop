import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void helloKaran () {
        //Arrange
        HelloWorld helloWorld = new HelloWorld();

        //Act
        String actualResult = helloWorld.greeting("Karan");

        //Assert
        assertEquals("Hello Karan", actualResult);
    }
}
