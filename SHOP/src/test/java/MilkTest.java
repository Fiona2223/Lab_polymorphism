import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MilkTest{
    Milk milk;

    @BeforeEach
    public void setUp(){
        milk = new Milk ("Almond", 2, 500, 26);
    }

    @Test
    public void canMaxPurchase(){
        assertThat(milk.setMaxPurchase(3)).isEqualTo("Maximum purchase is 3");
    }

    @Test
    public void canCheckForExpiration(){
        assertThat(milk.setExpirationDate(2025)).isEqualTo("Best by 2025");
    }
}
