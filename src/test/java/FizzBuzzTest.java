
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
      String word = fizzBuzz.fizzBuzzGame(number);

      //Then
      assertThat(word, is("1"));
    }

    @Test
    public void should_return_fizz_when_fizzbuzz_given_3(){
      //Give
      int number = 3;
      FizzBuzz fizzBuss = new FizzBuzz();

      //When
      String word = fizzBuss.fizzBuzzGame(number);

      //Then
      assertThat(word, is("Fizz"));
    }

    @Test
    public void should_return_fizz_when_fizzbuzz_given_5(){
      //Give
      int number = 5;
      FizzBuzz fizzBuss = new FizzBuzz();

      //When
      String word = fizzBuss.fizzBuzzGame(number);

      //Then
      assertThat(word, is("Buzz"));
    }
}
