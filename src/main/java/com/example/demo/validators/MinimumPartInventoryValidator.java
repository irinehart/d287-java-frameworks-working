package com.example.demo.validators;

import com.example.demo.domain.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MinimumPartInventoryValidator implements ConstraintValidator < ValidMinimumPartInventory, Part > {

    @Autowired
    private ApplicationContext applicationContext;

    public static ApplicationContext localApplicationContext;

    @Override
    public void initialize(ValidMinimumPartInventory constraintAnnotation) {

        ConstraintValidator.super.initialize(constraintAnnotation);

    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {

        return part.getInv() >= part.getMinimumInventory();

    }

}
