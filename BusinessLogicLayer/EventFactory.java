public class EventFactory {
    // use getPlan method to get object of type Plan
    public Ievent getPlan(String eventType) {
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
}
