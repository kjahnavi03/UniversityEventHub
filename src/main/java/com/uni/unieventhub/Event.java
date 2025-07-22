
package com.uni.unieventhub;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;           // Changed from 'title'
    private String description;
    private String location;

    //private LocalDateTime dateTime;
    
    private String organizer;
    private LocalDate date;  // Use java.time.LocalDate for date field
    //private int fees;
    //private int maxParticipants;


    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

//    public LocalDateTime getDateTime() { return dateTime; }
  //  public void setDateTime(LocalDateTime dateTime) { this.dateTime = dateTime; }
    public String getOrganizer() { return organizer; }
    public void setOrganizer(String organizer) { this.organizer = organizer; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
    
    /*
    public int getFees() { return fees; }
    public void setFees(int fees) { this.fees = fees; }

    public int getMaxParticipants() { return maxParticipants; }
    public void setMaxParticipants(int maxParticipants) { this.maxParticipants = maxParticipants; }
    */
}
