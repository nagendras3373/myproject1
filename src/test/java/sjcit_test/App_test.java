package sjcit_test;
import org.testng.Assert;
import org.testng.annotations.Test;

import sjcit.App;
 class App_test {
     public void testlogin1()
    {
     	App myapp=new App();
     	Assert.assertEquals (0,myapp.userLogin("abc","abc123"));
    }
    @Test 
    
     public void testlogin2()
	{
      App myapp=new App();
      Assert.assertEquals(1,myapp.userLogin("sjcit","sjcit123"));
	}
}