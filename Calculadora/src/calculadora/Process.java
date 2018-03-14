/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author oscar Hinojosa
 */
public class Process {
    private static float op1,op2;
    void Process ()
    {
        op1 = 0 ;
        op2 = 0 ;
    }
    
    static boolean Convert2numberTheOperand(String string, boolean data2convert)
    {
        boolean data2return = false;
        if( data2convert ) /*op1*/
        {
           System.out.print("String de entrada: " + string + "Salida: ");
           op1 = Float.parseFloat(string);
            data2return = true;
            System.out.println(String.valueOf(op1));
        }
        else /*op2*/
        {
            op2 = Float.parseFloat(string);
            System.out.println(String.valueOf(op2));
            data2return = true;
        }
        return data2return;
    }
    
   static String makeoperation(char operator) {
        String data2return;
        float res;
        data2return = "";
        switch (operator) {
            case '/':
                res = op1/op2;
                break;
            case '*':
                res = op1 * op2 ;
                break;
            case '+':
                res = op1 + op2;
                break;
            case '-':
                res = op1 - op2;
                break;
            case '^':
                res = (float) Math.pow((double)op1,(double) op2);
                break;
            default:
                res = 0;
                data2return = "";
                break;
        }
        op1=0;
        op2=0;
        data2return= String.valueOf(res);
       System.out.println("resultado de operar"+ String.valueOf(op1) + " y " + String.valueOf(op2) + " es: " + data2return);
       return data2return ;
    }
    
}
