package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 500, message = "Please enter a more detailed description, up to 500 characters")
    public String description;

    public Skill(){}

    public @Size(max = 500, message = "Please enter a more detailed description, up to 500 characters") String getDescription() {
        return description;
    }

    public void setDescription(@Size(max = 500, message = "Please enter a more detailed description, up to 500 characters") String description) {
        this.description = description;
    }
}
