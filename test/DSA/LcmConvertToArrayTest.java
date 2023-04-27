package DSA;

import dsa.LcmConvertToArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LcmConvertToArrayTest {
 @Test
 public void LcmConvertToArrayTest(){
     assertEquals("[2, 2, 5, 5]",Arrays.toString(LcmConvertToArray.convertToArray(100)));
 }
}