package com.featuretoggle;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.spi.InitialContextFactory;
import java.util.Hashtable;

public class TestContextFactory implements InitialContextFactory {
    @Override
    public Context getInitialContext(Hashtable<?, ?> environment) throws NamingException {
        return new TestContext();
    }
}
