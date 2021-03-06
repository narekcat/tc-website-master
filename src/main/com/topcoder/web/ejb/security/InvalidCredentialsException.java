package com.topcoder.web.ejb.security;

import com.topcoder.shared.util.TCException;

/**
 * Thrown if the username and password do not match an account.
 *
 * @author dok
 * @version $Id$
 *          Create Date: Feb 21, 2008
 */
public class InvalidCredentialsException extends TCException {

    public InvalidCredentialsException() {
        super();
    }

    public InvalidCredentialsException(String message) {
        super(message);
    }

    public InvalidCredentialsException(Throwable nestedException) {
        super(nestedException);
    }

    public InvalidCredentialsException(String message, Throwable nestedException) {
        super(message, nestedException);
    }
}
