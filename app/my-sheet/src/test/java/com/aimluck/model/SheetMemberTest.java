package com.aimluck.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class SheetMemberTest extends AppEngineTestCase {

    private SheetMember model = new SheetMember();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
