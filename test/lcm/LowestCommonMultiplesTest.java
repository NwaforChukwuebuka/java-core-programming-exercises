package lcm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowestCommonMultiplesTest {

    @Test
    @DisplayName("Lcm of 50 is 50 ")
    public void LcmOf_50_is_50(){
        LowestCommonMultiples lcm = new LowestCommonMultiples();
        assertEquals(50, lcm.getLcm(50));
        
    }

    @Test
    @DisplayName("Lcm of 50 is 50 ")
    public void LcmOf_50_and_20_is_50(){
        LowestCommonMultiples lcm = new LowestCommonMultiples();
        assertEquals(100, lcm.getLcm(50,20));

    }

    @Test
    @DisplayName("Lcm of 50 is 50 ")
    public void LcmOf_50_20_30_is_50(){
        LowestCommonMultiples lcm = new LowestCommonMultiples();
        assertEquals(300, lcm.getLcm(50,20,30));

    }

    @Test
    @DisplayName("Lcm of 50 is 50 ")
    public void LcmOfArrayOfInteger(){
        LowestCommonMultiples lcm = new LowestCommonMultiples();
        int[] numArray = {10,20,30,50};
        assertEquals(300, lcm.getLcm(numArray));

    }

}
