package US6_Furkan;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Test;

public class US6 extends BaseDriver {

@Test
    public void Test1() {

    driver.get("https://demowebshop.tricentis.com/");
    MyFunction.Wait(2);

}
}
