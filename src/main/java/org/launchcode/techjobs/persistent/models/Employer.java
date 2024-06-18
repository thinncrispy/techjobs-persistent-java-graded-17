package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    @Size(min = 3, max = 50, message = "Must be between 3 and 50 characters!")
    public String location;

    @OneToMany
    @JoinColumn(name = "employer_id")
    private final List<Job> jobs = new ArrayList<>();
    public Employer(){}

    public Employer(String location) {
        this.location = location;
    }


    public @NotNull @Size(min = 3, max = 50, message = "Must be between 3 and 50 characters!") String getLocation() {
        return location;
    }

    public void setLocation(@NotNull @Size(min = 3, max = 50, message = "Must be between 3 and 50 characters!") String location) {
        this.location = location;
    }
}
