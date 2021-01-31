package com.example.e2e.folder1.subfolder1;

import com.example.e2e.BaseConf;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)

@WithTags({
        @WithTag("database")
})

public class DatabaseConnectionTest extends BaseConf {
    @Test
    public void connect(){

    }

    @Test
    public void connect2(){

    }
}
