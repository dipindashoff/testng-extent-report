
package testng.files;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DependsOnClassTest2 {

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {1, 1},
                {2, 2}
        };
    }

    public String method1(int a, int b) {
        if (a == 1) {
            Assert.fail("method1 assertion fails");
            return "Apple";
        } else {
//0            Assert.fail("method1 assertion fails");
            return "Ball";
        }

    }

    @Test(dataProvider = "getData")
    public void method2(int a, int b) {
        String str = method1(a, b);
        System.out.println(str);
    }

}
