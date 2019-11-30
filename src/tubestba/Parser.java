package tubestba;

import java.util.Iterator;
import java.util.Stack;

public class Parser {
    private Stack token;
    private boolean valid;
    
    public void setToken(Stack token){
        this.token = token;
        this.valid = true;
    }
    
    public boolean isValid(){
        return valid;
    }
    
    public void validate(){
        Iterator tokenValue = token.iterator(); 
        int neededBracket = 0;
        boolean containError;
        String currentToken = tokenValue.next().toString();

        if (token.search("error") != -1){
            //System.out.println("ketemu token error");

            valid = false;
            return;
        }
        
        if (token.size() == 1 && !currentToken.equals("1")){
            //System.out.println("size 1 dan bukan pqr");
            valid = false;
            return;
        }
        
        
        while (tokenValue.hasNext()) { 
            
            switch (currentToken){
                case "1" :
                    currentToken = tokenValue.next().toString();

                    if ( "6".equals(currentToken) || "9".equals(currentToken)){
                        //System.out.println("di 1");
                        valid = false;
                        break;
                    }
                    break;
                case "2" :
                    
                    currentToken = tokenValue.next().toString();

                    if ( !"1".equals(currentToken) && !"9".equals(currentToken) ){
                        //System.out.println("di 2");
                        valid = false;
                        break;
                    }
                    break;
                case "3" :
                    currentToken = tokenValue.next().toString();

                    if (!"1".equals(currentToken) && !"9".equals(currentToken) && !"2".equals(currentToken)){
                        //System.out.println("di 3");
                        valid = false;
                        break;
                    }
                    break;
                case "4" :
                    currentToken = tokenValue.next().toString();
                    if (!"1".equals(currentToken) && !"9".equals(currentToken) && !"2".equals(currentToken)){
                        //System.out.println("di 4");
                        valid = false;
                        break;
                    }
                    break;
                case "5" :
                    currentToken = tokenValue.next().toString();
                    if (!"1".equals(currentToken) && !"9".equals(currentToken) && !"2".equals(currentToken)){
                        //System.out.println("di 5");
                        valid = false;
                        break;
                    }
                    break;
                case "6" :
                    currentToken = tokenValue.next().toString();
                    if (!"1".equals(currentToken) && !"9".equals(currentToken)){
                        //System.out.println("di 6");
                        valid = false;
                        break;
                    }
                    break;
                case "7" :
                    currentToken = tokenValue.next().toString();
                    if (!"1".equals(currentToken) && !("9".equals(currentToken))){
                        //System.out.println("di 7");
                        valid = false;
                        break;
                    }
                    break;
                case "8" :
                    currentToken = tokenValue.next().toString();
                    if (!"1".equals(currentToken) && !"9".equals(currentToken)){
                       // System.out.println("di 8");
                        valid = false;
                        break;
                    }
                    break;
                case "9" :
                    currentToken = tokenValue.next().toString();
                    neededBracket++;
                    
                    if (!"1".equals(currentToken) && !"9".equals(currentToken) && !"2".equals(currentToken) ){
                        //System.out.println("di 9");
                        valid = false;
                        break;
                    }
                    break;
                case "10" :
                    
                    if (neededBracket == 0){
                        //System.out.println("di 10");
                        valid = false;
                        break;
                    }
                    
                    currentToken = tokenValue.next().toString();
                    neededBracket--;
                    
                    if ("2".equals(currentToken) || "6".equals(currentToken)){
                        //System.out.println("di 10 juga");
                        valid = false;
                        break;
                    }
                    
                    break;
                default :
                    //System.out.println("di def");
                    break;
                
            }
            
        } 
        
        if (currentToken.equals("10")){
            neededBracket--;
        }
        
        if (neededBracket != 0){
            //System.out.println("bracket salah");
            valid = false;
        }
        
        
    }
    
    
}
