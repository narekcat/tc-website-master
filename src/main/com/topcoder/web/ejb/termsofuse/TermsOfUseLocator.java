/*
 * Copyright (C) 2004 - 2009 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.web.ejb.termsofuse;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.naming.NamingException;

import com.topcoder.shared.ejb.ServiceLocatorSupport;
import com.topcoder.shared.util.ApplicationServer;

/**
 * <p>A simple locator for the Terms of Use EJB</p>
 *
 * @author pulky
 * @version 1.0 (Configurable Contest Terms Release Assembly v1.0)
 */
public class TermsOfUseLocator {

    /**
     *  A <code>ServiceLocatorSupport</code> containing the created locator.
     */
    private static final ServiceLocatorSupport locator =
        new ServiceLocatorSupport(TermsOfUse.class,
                TermsOfUseHome.class,
                TermsOfUseHome.EJB_REF_NAME,
                ApplicationServer.TERMS_OF_USE_HOST_URL);

    /**
     * Returns the service instance.
     *
     * @return a <code>TermsOfUse</code> with the service instance
     *
     * @throws NamingException if any errors occur during lookup
     * @throws RemoteException if any errors occur during remote invocation
     * @throws CreateException if any errors occur during creation
     */
    public static TermsOfUse getService() throws NamingException, RemoteException, CreateException {
        return (TermsOfUse) locator.getService();
    }
}
