//------------------------------------------------------------------------------
// Copyright (c) 2015 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.experiments;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test for classname thing.
 */
public class ClassyNameTest {

    @Test
    public void testGetMyName() throws Exception {
        assertThat(ClassyName.getMyName(Object.class), is("java.lang.Object"));
    }

    @Test
    public void testGetMyCanonicalName() throws Exception {
        assertThat(ClassyName.getMyCanonicalName(Object.class), is("java.lang.Object"));
    }

    @Test
    public void testGetMySimpleName() throws Exception {
        assertThat(ClassyName.getMySimpleName(Object.class), is("Object"));
    }
}
