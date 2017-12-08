package com.exxeta.referenzplattform.cucumber.stepdefs;

import com.exxeta.referenzplattform.ReferenzplattformApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ReferenzplattformApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
