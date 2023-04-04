import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShopTest {

        Shop shop;

        @BeforeEach
        public void setUp() {
            shop = new Shop("Phy's Shop", 500, "Milk");
        }

        @Test
        public void canSellFood() {
            assertThat(shop.canSellFood()).isEqualTo("Lunch meal deal");
        }

        @Test
        public void canBuyLotteryTicket() {
            assertThat(shop.canBuyLotteryTicket()).isEqualTo(false);
        }

    @Test
    public void canStockTake(){
        assertThat(shop.stock_take()).isEqualTo(0);
    }

    }


