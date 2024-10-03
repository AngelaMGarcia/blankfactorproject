package co.com.screenplay.project.stepdefinitions;

import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

public class ParameterDefinitions {

    @ParameterType("Angela|Alex|she|he|they|him|her")
    public Actor actor(String actor) {
        return OnStage.theActorCalled(actor);
    }
}
