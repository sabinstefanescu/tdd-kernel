import domain.services.NumberService;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class NumberServiceTest {

    private NumberService numberService = new NumberService();

    @Test
    public void testGetCardinalOne(){
        String numeralOne = numberService.getCardinal(1);

        Assertions.assertThat(numeralOne).isEqualTo("a");
    }

    @Test
    public void testGetCardinalTwo(){
        String numeralOne = numberService.getCardinal(2);

        Assertions.assertThat(numeralOne).isEqualTo("two");
    }

    @Test
    public void testGetCardinalEleven(){
        String numeralOne = numberService.getCardinal(11);

        Assertions.assertThat(numeralOne).isEqualTo("eleven");
    }

    @Test
    public void testGetOrdinalTwelve(){
        String numeralOne = numberService.getOrdinal(12);

        Assertions.assertThat(numeralOne).isEqualTo("twelfth");
    }


}
