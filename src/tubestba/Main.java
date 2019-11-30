package tubestba;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) throws IOException, InterruptedException {
        
        String choice, input = "";
        Stack token;
        
        Scanner sc = new Scanner(System.in);
        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer();
        Parser parser = new Parser();
        
        System.out.println("Masukkan string formula untuk menghasilkan token lexic and memeriksa kevalidan.");
        System.out.println("(Masukkan 0 untuk berhenti.)");
        System.out.println("");
                    
        while (!input.equals("0")){
            System.out.print("Masukan : ");
            input = sc.nextLine();
                        
            if (input.equals("0")){
                System.exit(0);
            }
                        
            lexicalAnalyzer.setString(input);
            lexicalAnalyzer.generateToken();
            token = lexicalAnalyzer.getToken();
            parser.setToken(token);
            parser.validate();
            boolean valid = parser.isValid();
            Iterator tokenValue = token.iterator();
            
            System.out.print("Hasil lexical analyzer : ");
            while (tokenValue.hasNext()){
                System.out.print(tokenValue.next() + " ");
            }
            
            System.out.println("");
                        
            System.out.print("Hasil validasi parser: ");
            if (valid){
                System.out.println("Valid");
            }else{
                System.out.println("Tidak Valid");
            }
            
            System.out.println("");
        }
                    
//     
//        while (true) {
//            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//            System.out.println("Pilih salah satu [1/2]");
//            System.out.println("1. Generate token");
//            System.out.println("2. Validate");
//            System.out.println("3. Exit");
//            System.out.print("Masukan : ");
//            choice = sc.nextLine();
//            
//            switch (choice){
//                case "1":
//                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//                    System.out.println("Masukkan string formula untuk menghasilkan token lexic.");
//                    System.out.println("(Masukkan 0 untuk berhenti melakukan generate token.)");
//                    System.out.println("");
//                    
//                    while (!input.equals("0")){
//                        System.out.print("Masukan : ");
//                        input = sc.nextLine();
//                        lexicalAnalyzer.setString(input);
//                        lexicalAnalyzer.generateToken();
//                        token = lexicalAnalyzer.getToken();
//                        Iterator tokenValue = token.iterator();
//                        
//                        System.out.print("Hasil : ");
//                        while (tokenValue.hasNext()){
//                            System.out.print(tokenValue.next() + " ");
//                        }
//                        System.out.println("");
//                    }
//                    input = "";
//                    break;
//                case "2":
//                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//                    System.out.println("Masukkan string formula untuk menghasilkan token lexic.");
//                    System.out.println("(Masukkan 0 untuk berhenti melakukan generate token.)");
//                    System.out.println("");
//                    
//                    while (!input.equals("0")){
//                        System.out.print("Masukan : ");
//                        input = sc.nextLine();
//                        lexicalAnalyzer.setString(input);
//                        lexicalAnalyzer.generateToken();
//                        token = lexicalAnalyzer.getToken();
//                        parser.setToken(token);
//                        parser.validate();
//                        boolean valid = parser.isValid();
//                        Iterator tokenValue = token.iterator();
//                        
//                        System.out.print("Hasil : ");
//                        if (valid){
//                            System.out.println("Valid");
//                        }else{
//                            System.out.println("Tidak Valid");
//                        }
//                        System.out.println("");
//                    }
//                    input = "";
//                    
//                    break;
//                case "3" :
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Salah input");
//                    break;
//            }
//        }

    }
}
