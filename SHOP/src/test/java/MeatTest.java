import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MeatTest {
    Meat meat;

    @BeforeEach
    public void setUp(){
        meat = new Meat("Ribs", 30, 1000, 3510, false);
    }

    @Test
    public void canBeBoughtByVegan(){
        assertThat(meat.isVegan()).isEqualTo(false);
    }


}
