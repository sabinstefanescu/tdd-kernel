import domain.services.PresentsService;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PresentsServiceTest {

    private PresentsService presentService = new PresentsService();

    @Test
    public void testPresentServiceGetFirstPresent(){

        String present = presentService.getPresent(1);

        Assertions.assertThat(present).isEqualTo("partridge in a pear tree");
    }

    @Test
    public void testPresentServiceGetFourthPresent(){

        String present = presentService.getPresent(4);

        Assertions.assertThat(present).isEqualTo("calling birds");
    }

}
