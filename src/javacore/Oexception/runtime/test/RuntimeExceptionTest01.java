package javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // CHECKED E UNCHECKED

        int[] nums = {1, 2};
        System.out.println(nums[2]);

        Object object = null;
        System.out.println(object.toString());
    }
}
