package com.keithschwarz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class AliasMethodTest {

    @Test
    public void testDistribution() {

        Integer[] sizes = new Integer[]{256, 128, 64, 32, 16, 8, 4, 2};
        Double[] distribution = new Double[] {0.05d, 0.1d, 0.15d, 0.2d, 0.2d, 0.15d, 0.1d, 0.05d};

        AliasMethod aliasMethod = new AliasMethod(Arrays.asList(distribution));

        int totalSamples = 1000000;
        int[] result = new int[distribution.length];

        for (int i=0; i<totalSamples; i++) {
            int j = aliasMethod.next();
            result[j] += 1;
        }

        for (int i=0; i<result.length; i++) {
            System.out.println(String.format("%d = %.2f = %d/%d", i, result[i] / (double) totalSamples, result[i], totalSamples));
//            Assert.assertEquals();
        }

    }
}
