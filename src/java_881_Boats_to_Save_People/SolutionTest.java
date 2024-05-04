package java_881_Boats_to_Save_People;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    @Test
    void numRescueBoats() {
        assertEquals(1, solution.numRescueBoats(new int[]{1,2}, 3));
        assertEquals(3, solution.numRescueBoats(new int[]{3,2,2,1}, 3));
        assertEquals(4, solution.numRescueBoats(new int[]{3,5,3,4}, 5));
    }
}