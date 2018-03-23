//------------------------------------------------------------------------------
// Copyright (c) 2018 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.validation;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

public class ValidateThis {

    @NotBlank(message="Please provide a name.")
    @Length(min=10, message="Please enter at least 10 characters")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
