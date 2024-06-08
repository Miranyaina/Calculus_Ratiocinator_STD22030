package Lab.Affirmation;

public class VerificateurDAffirmation {
    // Méthode pour une affirmation sans contexte de vérité ou de mensonge
    public static String uneAffirmation(Affirmation affirmation) {
        return "Je ne sais pas";
    }

    // Méthode pour une affirmation avec contexte de vérité
    public static String uneAffirmation(Affirmation affirmation, Verite verite) {
        if (affirmation.getAffirmationInput().equals(verite.getAffirmationInput())) {
            return "Vrai";
        }
        return "Je ne sais pas";
    }

    // Méthode pour une affirmation avec contexte de mensonge
    public static String uneAffirmation(Affirmation affirmation, Mensonge mensonge) {
        if (affirmation.getAffirmationInput().equals(mensonge.getAffirmationInput())) {
            return "Faux";
        }
        return "Je ne sais pas";
    }

}
