package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BunTest {
private final String expectedName;
private final float expectedPrice;

public BunTest (String expectedName,float expectedPrice){
    this.expectedName = expectedName;
    this.expectedPrice =expectedPrice;
    }
@Parameterized.Parameters
public static Object [][] getBunData(){
    return new Object[][]{
            {"Краторная булка N-200i", Float.MAX_VALUE},
            {"crater bun N-200i", Float.MIN_VALUE},
            {"",100.5f},
            {"!@#$%^&*()_+{}[]:",456f},
            {"Флюоресцентная булка R2-D3",0f},
    };
}


    @Test
    public void getName() {
    Bun bun = new Bun(expectedName,expectedPrice);
        Assert.assertEquals(expectedName,bun.getName());
    }

    @Test
    public void getPrice() {
        Bun bun = new Bun(expectedName,expectedPrice);
        Assert.assertEquals(expectedPrice,bun.getPrice(),0);
    }
}