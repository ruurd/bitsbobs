//------------------------------------------------------------------------------
// Copyright (c) 2018 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.validation;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidateThisTest {

    private static Validator validator;

    @BeforeClass
    public static void beforeClass() {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
    }

    @Test
    public void testNameNotBlank() {
        ValidateThis subject = new ValidateThis();
        subject.setName("");
        Set<ConstraintViolation<ValidateThis>> violations = validator.validate(subject);

        assertThat("Should have cv", violations.size(), is(2));
        for (ConstraintViolation<ValidateThis> v: violations) {
            System.out.println(v.getMessage());
        }
    }

    @Test
    public void testNameTooShort() {
        ValidateThis subject = new ValidateThis();
        subject.setName("");
        Set<ConstraintViolation<ValidateThis>> violations = validator.validate(subject);

        subject.setName("short");
        assertThat("Should have cv", violations.size(), is(2));
        for (ConstraintViolation<ValidateThis> v: violations) {
            System.out.println(v.getMessage());
        }
    }

    @Test
    public void testNameBeforeUsing() {
        Set<ConstraintViolation<ValidateThis>> violations = validator.validateValue(ValidateThis.class, "name", "xyzzy");
        assertThat("Should have cv", violations.size(), is(1));
        for (ConstraintViolation<ValidateThis> v: violations) {
            System.out.println(v.getMessage());
        }
    }
}