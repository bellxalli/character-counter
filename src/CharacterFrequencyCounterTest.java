import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
    @Test
    public void testLAppearsThreeTimesInHelloWorld()
    {
        //arrange: set up test
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello world");
        
        //act: making something happen calling a method usually
        int actualCount = counter.getFrequency('l');

        //assert: get results and check that they match expected results
        assertEquals(3, actualCount);

    }

    @Test
    public void testNoneOccurringCharacterPercentageIsZero()
    {
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hi there");

        double actualPercentage = counter.getRelativePercentage('z');

        assertEquals(0.0, actualPercentage, 0.001);
    }
}