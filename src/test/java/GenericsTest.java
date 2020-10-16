import org.junit.Assert;
import org.junit.Test;

public class GenericsTest {
Generics genObj=new Generics();
@Test
    public void firstTest(){
    Integer maximum=genObj.findMax(12,4,8);
        Assert.assertSame(12,maximum);

}
    @Test
    public void secondTest(){
        Integer maximum=genObj.findMax(4,12,8);
            Assert.assertSame(12,maximum);

    }
    @Test
    public void thirdTest(){
        Integer maximum=genObj.findMax(4,8,12);
            Assert.assertSame(12,maximum);

    }
}
