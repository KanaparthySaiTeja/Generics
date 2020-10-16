import org.junit.Assert;
import org.junit.Test;

public class GenericsTest {
Generics genObj=new Generics();
@Test
    public void firstTest(){
    String maximum=genObj.findMax("mango","banana","apple");
        Assert.assertEquals("mango",maximum);

}
    @Test
    public void secondTest(){
        String maximum=genObj.findMax("banana","mango","apple");
            Assert.assertEquals("mango",maximum);

    }
    @Test
    public void thirdTest(){
        String maximum=genObj.findMax("apple","banana","mango");
            Assert.assertEquals("mango",maximum);

    }
}
