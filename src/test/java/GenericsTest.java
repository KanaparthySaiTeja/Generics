import org.junit.Assert;
import org.junit.Test;

public class GenericsTest {
Generics genObj=new Generics();

@Test
    public void  firstTest(){
    Integer maximumint=genObj.findMax(12,4,8);
    Assert.assertSame(12,maximumint);
    Float maximumfloat=genObj.findMax(12.5f,4.6f,8.3f);
    Assert.assertEquals(12.5f,maximumfloat,0.0000);

    String maximum=genObj.findMax("mango","banana","apple");
        Assert.assertEquals("mango",maximum);

}
    @Test
    public void secondTest(){
        Integer maximumint=genObj.findMax(4,12,8);
        Assert.assertSame(12,maximumint);
        String maximumfloat=genObj.findMax("banana","mango","apple");
            Assert.assertEquals("mango",maximumfloat);
        Float maximum=genObj.findMax(4.6f,12.5f,8.3f);
        Assert.assertEquals(12.5f,maximum,0.0000);

    }
    @Test
    public void thirdTest(){
        Integer maximumint=genObj.findMax(4,8,12);
        Assert.assertSame(12,maximumint);
        String maximumfloat=genObj.findMax("apple","banana","mango");
            Assert.assertEquals("mango",maximumfloat);
        Float maximum=genObj.findMax(4.6f,8.3f,12.5f);
        Assert.assertEquals(12.5f,maximum,0.000);


    }
}
