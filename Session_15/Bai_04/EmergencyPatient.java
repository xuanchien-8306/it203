package Session_15.Bai_04;

public class EmergencyPatient {
    private String id;
    private String name;
    private int priority;
    private long sequence;

    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public long getSequence() {
        return sequence;
    }

    public void setSequence(long sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        String level = (priority == 1) ? "CẤP CỨU" : "THƯỜNG";
        return "ID: " + id + " | Name: " + name + " | Level: " + level;
    }
}