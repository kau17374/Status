package status;

public class StatusUser {
    public void statusDetail(StatusCode statusCode) {
        switch (statusCode) {
            case REJECTED:
                System.out.println("User Status: REJECTED");
                break;
            case PENDING:
                System.out.println("User Status: PENDING");
                break;
            case PROCESSING:
                System.out.println("User Status: PROCESSING");
                break;
            case APPROVED:
                System.out.println("User Status: APPROVED");
                break;
        }
    }
}
