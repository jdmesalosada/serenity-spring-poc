package com.example.e2e;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
@Narrative(text = {"Connect to database."})
@WithTags({
        @WithTag("database test")
})

//todo Finish this blog: https://javabydeveloper.com/spring-boot-h2-in-memory-database-example/
public class DatabaseConnectionTest extends BaseConf {

    @Test
    public void connect(){

    }
}
