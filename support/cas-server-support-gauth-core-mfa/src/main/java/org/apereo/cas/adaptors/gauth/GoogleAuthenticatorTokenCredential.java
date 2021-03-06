package org.apereo.cas.adaptors.gauth;

import lombok.extern.slf4j.Slf4j;
import org.apereo.cas.otp.authentication.OneTimeTokenCredential;

/**
 * This is {@link GoogleAuthenticatorTokenCredential}.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */
@Slf4j
public class GoogleAuthenticatorTokenCredential extends OneTimeTokenCredential {
    private static final long serialVersionUID = -7570600701132111037L;

    public GoogleAuthenticatorTokenCredential() {
    }

    public GoogleAuthenticatorTokenCredential(final String token) {
        super(token);
    }
}
