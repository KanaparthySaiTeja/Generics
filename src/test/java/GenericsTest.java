import org.junit.Assert;
import org.junit.Test;

public class GenericsTest {
Generics genObj=new Generics();
@Test
    public void firstTest(){
    Float maximum=genObj.findMax(12.5f,4.6f,8.3f);
        Assert.assertEquals(12.5f,maximum,0.0000);

}
    @Test
    public void secondTest(){
        Float maximum=genObj.findMax(4.6f,12.5f,8.3f);
            Assert.assertEquals(12.5f,maximum,0.0000);

    }
    @Test
    public void thirdTest(){
        Float maximum=genObj.findMax(4.6f,8.3f,12.5f);
            Assert.assertEquals(12.5f,maximum,0.000);

    }
}
