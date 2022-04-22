package xyz.blapco.bl.mcrb.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "publication")
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "publication_body")
    private String pubBody;
    @Column(name = "publication_date")
    private LocalDateTime date;

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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
