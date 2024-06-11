package Affirmation;

import Lab.Affirmation.Affirmation;
import Lab.Affirmation.Mensonge;
import Lab.Affirmation.Verite;
import Lab.Affirmation.VerificateurDAffirmation;

import java.util.ArrayList;
import java.util.List;

public class TestVerificateurDAffirmation {

    public static void main(String[] args) {
        Verite verite_1 = new Verite(1, "Lou est beau");
        Mensonge mensonge_1 = new Mensonge(2, "Lou est pauvre");

        List<Affirmation> affirmations = new ArrayList<>();
        affirmations.add(verite_1);
        affirmations.add(mensonge_1);

        // Test des méthodes
        System.out.println("Test 1: " + test1(verite_1));
        System.out.println("Test 2: " + test2(mensonge_1));
        System.out.println("Test 3: " + test3(affirmations));
        System.out.println("Test 4: " + test4(affirmations));
        System.out.println("Test 5: " + test5(affirmations));
    }

    public static String test1(Verite verite) {
        List<Affirmation> affirmations = new ArrayList<>();
        affirmations.add(verite);
        return VerificateurDAffirmation.ou(affirmations); // Utiliser la méthode ou pour évaluer une vérité
    }

    public static String test2(Mensonge mensonge) {
        List<Affirmation> affirmations = new ArrayList<>();
        affirmations.add(mensonge);
        return VerificateurDAffirmation.et(affirmations); // Utiliser la méthode et pour évaluer un mensonge
    }

    public static String test3(List<Affirmation> affirmations) {
        return VerificateurDAffirmation.et(affirmations);
    }

    public static String test4(List<Affirmation> affirmations) {
        return VerificateurDAffirmation.ou(affirmations);
    }

    public static String test5(List<Affirmation> affirmations) {
        return VerificateurDAffirmation.donc(affirmations);
    }
}
