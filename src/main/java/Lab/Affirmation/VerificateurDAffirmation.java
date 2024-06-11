package Lab.Affirmation;

import java.util.List;

public class VerificateurDAffirmation {

    public static String uneAffirmation(Affirmation affirmation, List<Affirmation> affirmations) {
        if (et(affirmations).equals("Vrai")) {
            return "Vrai";
        }
        return "Je ne sais pas";
    }

    public static String et(List<Affirmation> affirmations) {
        for (Affirmation affirmation : affirmations) {
            if (affirmation instanceof Mensonge) {
                return "Faux";
            }
        }
        return "Vrai";
    }

    public static String ou(List<Affirmation> affirmations) {
        for (Affirmation affirmation : affirmations) {
            if (affirmation instanceof Verite) {
                return "Vrai";
            }
        }
        return "Faux";
    }

    public static String donc(List<Affirmation> affirmations) {
        boolean firstIsTruth = affirmations.size() > 0 && affirmations.get(0) instanceof Verite;
        boolean containsLieAfterFirstTruth = affirmations.stream()
                .skip(1)
                .anyMatch(affirmation -> affirmation instanceof Mensonge);
        return firstIsTruth && !containsLieAfterFirstTruth ? "Vrai" : "Faux";
    }
}
