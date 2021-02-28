package Project.BusinessLogicLayer;

public abstract class BaseEvent implements Ievent{
    private String type ="";
    private Date date = new Date();
    private String venueAddress = "";
    private int totalKids = 0;
    private int totalAdults = 0;
    private bool decorations = false;
    private bool eventStatus = false; 


    /**
     * @return Date return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return String return the venueAddress
     */
    public String getVenueAddress() {
        return venueAddress;
    }

    /**
     * @param venueAddress the venueAddress to set
     */
    public void setVenueAddress(String venueAddress) {
        this.venueAddress = venueAddress;
    }

    /**
     * @return int return the totalKids
     */
    public int getTotalKids() {
        return totalKids;
    }

    /**
     * @param totalKids the totalKids to set
     */
    public void setTotalKids(int totalKids) {
        this.totalKids = totalKids;
    }

    /**
     * @return int return the totalAdults
     */
    public int getTotalAdults() {
        return totalAdults;
    }

    /**
     * @param totalAdults the totalAdults to set
     */
    public void setTotalAdults(int totalAdults) {
        this.totalAdults = totalAdults;
    }

    /**
     * @return bool return the decorations
     */
    public bool getDecorations() {
        return decorations;
    }

    /**
     * @param decorations the decorations to set
     */
    public void setDecorations(bool decorations) {
        this.decorations = decorations;
    }

    /**
     * @return bool return the eventStatus
     */
    public bool getEventStatus() {
        return eventStatus;
    }

    /**
     * @param eventStatus the eventStatus to set
     */
    public void setEventStatus(bool eventStatus) {
        this.eventStatus = eventStatus;
    }

}