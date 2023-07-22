package creational_design_pattern.builder.Example1;

public class Robot {
    private String head;
    private String body;
    private String arms;
    private String legs;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getArms() {
        return arms;
    }

    public void setArms(String arms) {
        this.arms = arms;
    }

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Robot: [Head: " + head + ", Body: " + body + ", Arms: " + arms + ", Legs: " + legs + "]";
    }
}
