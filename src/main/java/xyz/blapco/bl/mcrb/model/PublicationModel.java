package xyz.blapco.bl.mcrb.model;

public class PublicationModel {
    // @@@ TODO (Biel Polastrini): Add ID and get date at publish time instead of letting the user choose the date on the date picker. It makes no sense.
    private String pubBody;
    private String date;

    public String getPubBody() {
        return pubBody;
    }

    public void setPubBody(String pubBody) {
        this.pubBody = pubBody;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
