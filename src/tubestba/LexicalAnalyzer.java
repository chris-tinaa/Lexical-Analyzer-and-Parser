package tubestba;
import java.util.Stack;
public class LexicalAnalyzer {
    private String sLexic;
    private Stack token;
    
    public LexicalAnalyzer(){
        token = new Stack();
    }
    
    public void setString(String sLexic){
        this.sLexic = sLexic;
        token.clear();
    }
    
    public Stack getToken(){
        return token;
    }
    
    public void generateToken(){
        int i = 0;
        token.push(null);
        while (i < sLexic.length() && token.lastElement() != "error"){
            switch (sLexic.charAt(i)){
                case 'p':
                    if ((i+1) < sLexic.length() && !(sLexic.charAt(i+1) == ' ' || sLexic.charAt(i+1) == ')')){
                        token.push("error");
                        break;
                    }
                    token.push(1);
                    i++;
                    break;
                case 'q':
                    if ((i+1) < sLexic.length() && !(sLexic.charAt(i+1) == ' ' || sLexic.charAt(i+1) == ')' || sLexic.charAt(i+1) == '(')){
                        token.push("error");
                        break;
                    }
                    token.push(1);
                    i++;
                    break;
                case 'r':
                    if ((i+1) < sLexic.length() && !(sLexic.charAt(i+1) == ' ' || sLexic.charAt(i+1) == ')')){
                        token.push("error");
                        break;
                    }
                    token.push(1);
                    i++;
                    break;
                case 's':
                    if ((i+1) < sLexic.length() && !(sLexic.charAt(i+1) == ' ' || sLexic.charAt(i+1) == ')')){
                        token.push("error");
                        break;
                    }
                    token.push(1);
                    i++;
                    break;
                case 'n':
                    i++;
                    if (i < sLexic.length() && sLexic.charAt(i) == 'o'){
                        i++;
                        if (i < sLexic.length() && sLexic.charAt(i) == 't'){
                            if ((i+1) < sLexic.length() && sLexic.charAt(i+1) != ' ' && sLexic.charAt(i+1) != '(' && sLexic.charAt(i+1) != ')' ){
                                token.push("error");
                                break;
                            } 
                            
                            token.push(2);
                            
                            if (i < sLexic.length() && ( sLexic.charAt(i) == '(' || sLexic.charAt(i) == ')' )){
                                if (sLexic.charAt(i) == '('){
                                    token.push(9);
                                } else if (sLexic.charAt(i) == ')'){
                                    token.push(10);
                                }
                            }
                            i++;
                        }else{
                            token.push("error");
                            break;
                        }
                    }else{
                        token.push("error");
                        break;
                    }
                    break;
                case 'a':
                    i++;
                    if (i < sLexic.length() && sLexic.charAt(i) == 'n'){
                        i++;
                        if (i < sLexic.length() && sLexic.charAt(i) == 'd'){
                            if ((i+1) < sLexic.length() && sLexic.charAt(i+1) != ' ' && sLexic.charAt(i+1) != '(' && sLexic.charAt(i+1) != ')'){
                                token.push("error");
                                break;
                            }
                            token.push(3);
                            
                            if (i < sLexic.length() && ( sLexic.charAt(i) == '(' || sLexic.charAt(i) == ')' )){
                                if (sLexic.charAt(i) == '('){
                                    token.push(9);
                                } else if (sLexic.charAt(i) == ')'){
                                    token.push(10);
                                }
                            }
                            
                            i++;
                        }else{
                            token.push("error");
                            break;
                        }
                    }else{
                        token.push("error");
                        break;
                    }
                    break;
                case 'o':
                    i++;
                    if (i < sLexic.length() && sLexic.charAt(i) == 'r'){
                        if ((i+1) < sLexic.length() && sLexic.charAt(i+1) != ' ' && sLexic.charAt(i+1) != '(' && sLexic.charAt(i+1) != ')'){
                            token.push("error");
                            break;
                        }
                        
                        token.push(4);
                        
                        if (i < sLexic.length() && ( sLexic.charAt(i) == '(' || sLexic.charAt(i) == ')' )){
                            if (sLexic.charAt(i) == '('){
                                token.push(9);
                            } else if (sLexic.charAt(i) == ')'){
                                token.push(10);
                            }
                        }
                        
                        i++;
                    }else{
                        token.push("error");
                        break;
                    }
                    break;
                case 'x':
                    i++;
                    if (i < sLexic.length() && sLexic.charAt(i) == 'o'){
                        i++;
                        if (i < sLexic.length() && sLexic.charAt(i) == 'r'){
                            if ((i+1) < sLexic.length() && sLexic.charAt(i+1) != ' ' && sLexic.charAt(i+1) != '(' && sLexic.charAt(i+1) != ')'){
                                token.push("error");
                                break;
                            }
                            token.push(5);
                            
                            if (i < sLexic.length() && ( sLexic.charAt(i) == '(' || sLexic.charAt(i) == ')' )){
                                if (sLexic.charAt(i) == '('){
                                    token.push(9);
                                } else if (sLexic.charAt(i) == ')'){
                                    token.push(10);
                                }
                            }
                            i++;
                        }else{
                            token.push("error");
                            break;
                        }
                    }else{
                        token.push("error");
                        break;
                    }
                    break;
                case 'i':
                    i++;
                    if (i < sLexic.length() && sLexic.charAt(i) == 'f'){
                        i++;
                        if (i == sLexic.length() || (i < sLexic.length() && (sLexic.charAt(i) == ' ' || sLexic.charAt(i) == '(' || sLexic.charAt(i) == ')' ))){
                            token.push(6);
                            if (i < sLexic.length() && ( sLexic.charAt(i) == '(' || sLexic.charAt(i) == ')' )){
                                if (sLexic.charAt(i) == '('){
                                    token.push(9);
                                } else if (sLexic.charAt(i) == ')'){
                                    token.push(10);
                                }
                            }
                            i++;
                        }else if(i < sLexic.length() && sLexic.charAt(i) == 'f'){
                            if ((i+1) < sLexic.length() && sLexic.charAt(i+1) != ' ' && sLexic.charAt(i+1) != '(' && sLexic.charAt(i+1) != ')'){
                                token.push("error");
                                break;
                            }
                            token.push(8);
                            i++;
                        }else{
                            token.push("error");
                            break;
                        }
                    }else{
                        token.push("error");
                        break;
                    }
                    break;
                case 't':
                    i++;
                    if (i < sLexic.length() && sLexic.charAt(i) == 'h'){
                        i++;
                        if (i < sLexic.length() && sLexic.charAt(i) == 'e'){
                            i++;
                            if (i < sLexic.length() && sLexic.charAt(i) == 'n'){
                                if ((i+1) < sLexic.length() && sLexic.charAt(i+1) != ' '  && sLexic.charAt(i+1) != '(' && sLexic.charAt(i+1) != ')'){
                                    token.push("error");
                                    break;
                                }
                                token.push(7);
                                
                                if (i < sLexic.length() && ( sLexic.charAt(i) == '(' || sLexic.charAt(i) == ')' )){
                                    if (sLexic.charAt(i) == '('){
                                        token.push(9);
                                    } else if (sLexic.charAt(i) == ')'){
                                        token.push(10);
                                    }
                                }
                                i++;
                            }else{
                                token.push("error");
                                break;
                            }
                        }else{
                            token.push("error");
                            break;
                        }
                    }else{
                        token.push("error");
                        break;
                    }
                    break;
                case '(':
                    token.push(9);
                    i++;
                    break;
                case ')':
                    token.push(10);
                    i++;
                    break;
                default:
                    if (i == 0 && sLexic.length() == 1){
                        token.push("error");
                        break;
                    }
                    i++;
                    break;
            }
        }
        token.remove(0);
    }
   
}