package it.dibek.bitandpieces;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import org.junit.Test;

import java.util.Random;

/**
 * Created by giuseppe.dibella on 10/02/2017.
 */
public class MaxDivideConquerTest {

    @Test
    public void maxElementWithRandomValues() {
        //given
        int[] randomInts = new int[21];
        Random random = new Random();

        for (int i  = 0; i <20; i++){
            randomInts[i] = random.nextInt(100);
        }
        randomInts[7] = 1000;
        assertThat("Verify 1000 can be found", MaxDivideConquer.maxElement(randomInts), equalTo(1000));
    }
}
