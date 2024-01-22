package Getapcs_Avision.Getapcs_Avision1;

import com.Getapcs.Avision.BASECLASS.FG_DynamicValue;
import com.Getapcs.Avision.BASECLASS.PP_DynamicValue1;
import com.Getapcs.Avision.BASECLASS.PP_DynamicValue2;
import com.Getapcs.Avision.BASECLASS.PP_DynamicValue3;
import com.Getapcs.Avision.BASECLASS.PP_DynamicValue4;
import com.Getapcs.Avision.BASECLASS.PP_DynamicValue5;
import com.Getapcs.Avision.BASECLASS.PP_DynamicValue6;
import com.Getapcs.Avision.BASECLASS.SA_DynamicValue1;
import com.Getapcs.Avision.BASECLASS.SA_DynamicValue2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
      String fg [] =  {FG_DynamicValue.generateDynamicValue(),SA_DynamicValue1.generateDynamicValue(),SA_DynamicValue2.generateDynamicValue(),PP_DynamicValue1.generateDynamicValue(),PP_DynamicValue2.generateDynamicValue(),PP_DynamicValue3.generateDynamicValue(),PP_DynamicValue4.generateDynamicValue(),PP_DynamicValue5.generateDynamicValue(),PP_DynamicValue6.generateDynamicValue()};
      
      
      
      System.out.println(fg.length);
      
//      for(String a:fg) {
//    	  
//    	  System.out.println(a+"\n");
//    	  
//      }
      
//      System.out.println(s);
    }
}
