import Project.DataAccessLayer.*;
public class EventFactory {
    // use getEvent method to get object of type Plan
    public Ievent setEvent(String eventType) {
        if (eventType == null) {
            return null;
        }
        if (eventType.equalsIgnoreCase("WEDDING")) {
            return new Wedding();
        } else if (eventType.equalsIgnoreCase("BIRTHDAY")) {
            return new Birthday();
        } else if (eventType.equalsIgnoreCase("ANNIVERSARY")) {
            return new Anniversary();
        }
        return null;
    }
    public void setEvent(Ievent eventObject){

    }
}
