package com.topcoder.web.tc.controller.request;

import com.topcoder.shared.util.DBMS;
import com.topcoder.web.common.StringUtils;
import com.topcoder.web.ejb.termsofuse.TermsOfUse;
import com.topcoder.web.ejb.termsofuse.TermsOfUseLocal;
import com.topcoder.web.common.PermissionException;
import com.topcoder.shared.security.ClassResource;
import com.topcoder.web.tc.Constants;

/**
 * @author  dok
 * @version  $Revision$ $Date$
 * Create Date: Jul 24, 2005
 */
public class Terms extends Base {

    protected void businessProcessing() throws Exception {
        // Don't allow anonymous access.
        if (this.getSessionInfo().isAnonymous()) {
            throw new PermissionException(getLoggedInUser(), new ClassResource(this.getClass()));
        }

        long termsId = Long.parseLong(StringUtils.checkNull(getRequest().getParameter(Constants.TERMS_OF_USE_ID)));
        TermsOfUseLocal terms = (TermsOfUseLocal) createLocalEJB(getInitialContext(), TermsOfUse.class);
        getResponse().setStatus(200);
        getResponse().setContentType("text/html");
        getResponse().getWriter().print(terms.getText(termsId, DBMS.OLTP_DATASOURCE_NAME));
        getResponse().flushBuffer();
    }
}
