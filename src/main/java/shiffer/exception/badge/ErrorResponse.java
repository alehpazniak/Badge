package shiffer.exception.badge;

public class ErrorResponse {
    private String massage;

    public ErrorResponse(String massage) {
        this.massage = massage;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}
