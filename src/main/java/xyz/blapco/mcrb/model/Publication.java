package xyz.blapco.mcrb.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "publication")
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "publication_body")
    @NotNull
    private String pubBody;
    @Column(name = "publication_date")
    @NotNull
    private String pubDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPubBody() {
        return pubBody;
    }

    public void setPubBody(String pubBody) {
        this.pubBody = pubBody;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }
}
