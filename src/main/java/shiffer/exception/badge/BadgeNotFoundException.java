package shiffer.exception.badge;

public class BadgeNotFoundException extends RuntimeException{
    public BadgeNotFoundException(String massage) {
        super(massage);
    }
}
