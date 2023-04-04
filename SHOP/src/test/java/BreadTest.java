import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BreadTest {

    Bread bread;

    @BeforeEach
    public void setUp(){
        bread = new Bread("Brown bread", 1, 800, 500);
    }

    @Test
    public void isWholemealBread(){
        assertThat(bread.isWholemeal()).isEqualTo(true);
    }

    @Test
    public void makeAllergyKnow(){
        assertThat(bread.setAllergyWarning()).isEqualTo("Caution Contains Gluten.");
    }

}
