package java_881_Boats_to_Save_People;

import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int ans =0;
        Arrays.sort(people);
        for (int i=0, j = people.length-1; i<=j; ) {
            int rem = limit - people[j];

            if (rem >= people[i])
                i++;

            j--;
            ans++;

        }
        return ans;
    }
}