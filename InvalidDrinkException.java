class InvalidDrinkException extends Exception {
    public InvalidDrinkException(String message) {
        super("Erreur, veuillez entrer un choix valide : (C)afé, (T)hé, (H)C hocolat chaud: ");
    }
}
