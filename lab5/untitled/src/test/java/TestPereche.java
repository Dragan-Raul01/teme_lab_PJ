
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import testPackage.PerecheNumere;

import static org.junit.jupiter.api.Assertions.*;

public class TestPereche {
    @Test
    void test1_suma() {
        PerecheNumere c=new PerecheNumere(4,5);
        assertEquals(false, c.suntConsecutiveInFibonacci());
    }
    @Test
    void test2_suma(){
        PerecheNumere c=new PerecheNumere(7,8);
        assertTrue(c.suntConsecutiveInFibonacci()==false);
    }

    @Test
    void test3_suma(){
        PerecheNumere c= new PerecheNumere(12,51);

    }
}
