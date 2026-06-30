import java.util.Scanner;


/*public class cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter operator: ");
        String operator = sc.next();
        
        if (operator.equals("+")) {
            System.out.println(num1 + num2);
        } else if (operator.equals("-")) {
            System.out.println(num1 - num2);
        } else if (operator.equals("*")) {
            System.out.println(num1 * num2);
        } else if (operator.equals("/")) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Invalid operator");  //stsc platform
        }
    }*/
    

    class car{
        String brand;
        int speed;
        void display(){
            System.out.println("Brand: " + brand);
            System.out.println("Speed: " + speed);
        }


    }
    class sportcar extends car{
        String color;
        void display(){
            System.out.println("Brand: " + brand);
            System.out.println("Speed: " + speed);
            System.out.println("Color: " + color);
        }
    }
    public class Main {
    public static void main(String[] args) {
       
       sportcar mycar = new sportcar();
       mycar.brand = "BMW";
       mycar.speed =200;
       mycar.color = "Red";
       mycar.display();
       
       
    }

    
}

   

