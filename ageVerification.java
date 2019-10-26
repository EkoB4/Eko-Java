//JrEkin
public class Animal {
    
    static void checkAge(int age){ //age değikenini tanımladık ve bun age değişkenin karşılığının int olduğunu tanımladık.
     if (age < 18){ // 18 ageden büyükmü?
         throw new ArithmeticException("Access denied - You must be at least 18 years old.");
     }else {
         System.out.println("Access granted - You are old enough!");
     }   
    }
        public static void main(String[] args){
            checkAge(15);//yaşı kontrol ettik 18 den küçükse almadık 
        }
    
}
//Jrekin
