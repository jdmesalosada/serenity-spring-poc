package com.example.e2e.folder1.subfolder1;

import com.example.e2e.BaseConf;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.Test;
import org.junit.runner.RunWith;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(SerenityRunner.class)
@Narrative(text = {"As a Julian Mesa, I want to develop a game!", "Well, glad that you ask. I imagine a multiplayer online game where two people choose actions in distinct rounds.", "When every player has picked an action, one is declared winner based on certain rules."})

public class DatabaseConnectionTest3 extends BaseConf {

    private final Actor admin = new Actor("Admin");

    @Test
    public void connectUpdated() {

        admin.can(CallAnApi.at("http://www.google.com"));
        admin.should(
                seeThat(a -> true, equalTo(false)));

    }

    @Test
    public void connectUpdated2() {
        admin.can(CallAnApi.at("http://www.google.com"));
        admin.should(
                seeThat(a -> true, equalTo(false)));
    }
}
