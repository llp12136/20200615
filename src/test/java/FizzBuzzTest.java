
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

  public class FizzBuzzTest {
    @Test
    public void should_return_1_when_fizzbuzz_given_1(){
      //Give
      int number = 1;
      FizzBuzz fizzBuzz = new FizzBuzz();

      //When
      int word = fizzBuzz.fizzBuzzGame(number);

      //Then
      assertThat(word, is("1"));
    }
}
