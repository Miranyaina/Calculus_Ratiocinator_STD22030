package Affirmation;

import Lab.Affirmation.BasicAffirmation;
import Lab.Affirmation.Mensonge;
import Lab.Affirmation.VerificateurDAffirmation;
import Lab.Affirmation.Verite;

public class TestVerificateurDAffirmation {
    public static void main(String[] args) {
        BasicAffirmation affirmation1 = new BasicAffirmation(1, "Lou est genereux");
        Verite verite1 = new Verite(2, "Lou est beau");
        Mensonge mensonge1 = new Mensonge(3, "Lou est pauvre");

       System.out.println("Test 1: " + test1(affirmation1));
        System.out.println("Test 2: " + test2(verite1));
        System.out.println("Test 3: " + test3(mensonge1));
        System.out.println("Test 4: " + test4(affirmation1, verite1));
        System.out.println("Test 5: " + test5(affirmation1, mensonge1));
    }

    public static String test1(BasicAffirmation affirmation) {
        return VerificateurDAffirmation.uneAffirmation(affirmation);
    }

    public static String test2(Verite verite) {
        return VerificateurDAffirmation.uneAffirmation(verite);
    }

    public static String test3(Mensonge mensonge) {
        return VerificateurDAffirmation.uneAffirmation(mensonge);
    }

    public static String test4(BasicAffirmation affirmation, Verite verite) {
        return VerificateurDAffirmation.uneAffirmation(affirmation, verite);
    }

    public static String test5(BasicAffirmation affirmation, Mensonge mensonge) {
        return VerificateurDAffirmation.uneAffirmation(affirmation, mensonge);
    }
}
