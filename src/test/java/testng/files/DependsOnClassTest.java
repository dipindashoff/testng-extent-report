package testng.files;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DependsOnClassTest {
    int z;

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {1, 1},
                {2, 2}
        };
    }

    @Test(dataProvider = "getData")
    public void method1(int a, int b){
        int i = a;
        z = i;
        System.out.println(z);
    }

    @Test(dataProvider = "getData", dependsOnMethods = "method1")
    public void method2(int x, int y){
        System.out.println(z + ", " +y);
    }
}
