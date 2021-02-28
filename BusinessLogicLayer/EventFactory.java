import Project.DataAccessLayer.*;
public class EventFactory {
    // use getEvent method to get object of type Plan
    public Ievent getEvent(Ievent event){
        if (event.type == null) {
            return null;
        }
        if (event.type.equalsIgnoreCase("WEDDING")) {
            return new Wedding();
        } else if (event.type.equalsIgnoreCase("BIRTHDAY")) {
            return new Birthday();
        } else if (event.type.equalsIgnoreCase("ANNIVERSARY")) {
            return new Anniversary();
        }
        return null;
    }
    public void setEvent(Ievent eventObject){

    }
}
