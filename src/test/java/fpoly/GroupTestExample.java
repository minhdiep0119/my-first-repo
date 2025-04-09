package fpoly;

import org.testng.annotations.Test;

public class GroupTestExample {
    @Test(groups = { "group1" })
    public void test1() {
        System.out.println("testGroup - Test 1");
    }

    @Test(groups = { "group1" })
    public void test2() {
    	System.out.println("testGroup - Test 2");
    }

    @Test(groups = { "group2" })
    public void test3() {
    	System.out.println("testGroup - Test 3");
    }

    @Test(groups = { "group1" })
    public void test4() {
    	System.out.println("testGroup - Test 4");
    }
}
