import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GroceryTest {


    Grocery item1;
    Grocery item2;
    Grocery item3;

    @BeforeEach
    public void setUp() {
        item1 = new Milk("Almond", 2, 500, 26);
        item2 = new Milk("Raw", 1, 100, 70);
        item3 = new Milk("Rice", 3, 250, 40);
    }
    @Test
    public void canGetItemInformation(){
        assertThat(item1.getItemInformation(item1) == (item1.ItemInformation));
        assertThat(item2.getItemInformation(item2) == (item2.ItemInformation));
        assertThat(item3.getItemInformation(item3) == (item3.ItemInformation));
    }


}
