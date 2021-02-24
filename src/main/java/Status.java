import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {

    private final boolean verified;
    private final int sentCount;
    private final String feedback;

    public Status(@JsonProperty("verified") boolean verified,
                  @JsonProperty("sentCount") int sentCount,
                  @JsonProperty("feedback") String feedback) {
        this.verified = verified;
        this.sentCount = sentCount;
        this.feedback = feedback;
    }

    public boolean isVerified() {
        return verified;
    }

    public int getSentCount() {
        return sentCount;
    }

    public String getFeedback() {
        return feedback;
    }

    @Override
    public String toString() {
        return "Status{" +
                "verified=" + verified +
                ", sentCount=" + sentCount +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
