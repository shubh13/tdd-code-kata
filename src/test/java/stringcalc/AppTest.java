package stringcalc;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    /*@Test
    public void shouldAnswerWithTrue()
    {
        assertTrue(true);
    }*/

    @Test
    public void testStringCalcNull(){
        try { 
            assertEquals(0, App.add(""));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testStringCalcUsual(){
        try{
            assertEquals(6, App.add("123"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testStringCalcDelim1(){
        try{
            assertEquals(6, App.add("1,2,3"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testStringCalcDelim2(){
        try{
            assertEquals(6, App.add("[1, 2, 3]"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testStringCalcDelim3(){
        try{
            assertEquals(6, App.add("[1, \n2, 3]"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testStringCalc1000(){
        try{
            assertEquals(2, App.add("[2, 1001]"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testStringCalcLongDelim(){
        try{
            assertEquals(6, App.add("[[1******\n\n\n\n\n\n\n2****\n\n\n\n***3]]"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testStringCalcMod(){
        try{
            assertEquals(246, App.add("[243, 243]"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
