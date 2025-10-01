/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Kaiden
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int added2 = add(5, 7);
        System.out.println(added2);

        int added4 = add(5, 7, 6, 6);
        System.out.println(added4);

        String morning = morningGreeting("Toby Fox");
        System.out.println(morning);

        String afternoon = afternoonGreeting("Mac Miller");
        System.out.println(afternoon);

        String repeat = triple("oohbaby");
        System.out.println(repeat);

        double divide = half(19);
        System.out.println(divide);

        double roundPos = roundPositiveValueToNearestInteger(8.5);
        System.out.println(roundPos);

        double roundNeg = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(roundNeg);
    }

    // 1. add
    static int add(int a, int b) {
        return a + b;
    }

    // 2. add
    static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // 3. morningGreeting
    static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    // 5. triple
    static String triple(String word) {
        return word + word + word;
    }

    // 6. half
    static double half(double n) {
        return n / 2;
    }

    // 7. roundPositiveValueToNearestInteger
    static double roundPositiveValueToNearestInteger(double n) {
        n = Math.round (n);
        return n;
    }

    // 8. roundNegativeValueToNearestInteger
    static double roundNegativeValueToNearestInteger(double n) {
        n = n * -1;
        n = Math.round (n);
        return n * -1;
    }
    }

