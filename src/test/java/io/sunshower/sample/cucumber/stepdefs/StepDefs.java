package io.sunshower.sample.cucumber.stepdefs;

import io.sunshower.sample.Angular4App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Angular4App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
