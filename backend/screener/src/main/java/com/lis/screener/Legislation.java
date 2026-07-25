package com.lis.screener;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Legislation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String legTitle;
    @Column(nullable = false)
    private String legText;
    private List<String> sponsors;

    public Long getId() {return id;}
    public String getLegTitle() {return legTitle;}
    public String getLegText() {return legText;}
    public List<String> getSponsors() {return sponsors;}

    public void setLegTitle(String legTitle) {this.legTitle = legTitle;}
    public void setLetText(String legText) {this.legText = legText;}
    public void setSponsors(List<String> sponsors) {this.sponsors = sponsors;}

}
