package org.apereo.cas.configuration.model.support.ldap.serviceregistry;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apereo.cas.configuration.model.support.ldap.AbstractLdapSearchProperties;
import org.apereo.cas.configuration.support.RequiresModule;

/**
 * This is {@link LdapServiceRegistryProperties}.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */
@RequiresModule(name = "cas-server-support-ldap-service-registry")
@Slf4j
@Getter
@Setter
public class LdapServiceRegistryProperties extends AbstractLdapSearchProperties {

    private static final long serialVersionUID = 2372867394066286022L;

    /**
     * Object class used for the registered service entry in LDAP.
     */
    private String objectClass = "casRegisteredService";

    /**
     * ID attribute used for the registered service entry in LDAP
     * to keep track of the service numeric identifier.
     */
    private String idAttribute = "uid";

    /**
     * Service definintion attribute used for the registered service entry in LDAP
     * to keep a representation of the service body.
     */
    private String serviceDefinitionAttribute = "description";

    /**
     * The load filter used to load entries by the {@link #objectClass}.
     * This is typically used to load all definitions that might be mapped to a service definition.
     * The search filter used to load entries by the {@link #idAttribute}.
     * This is typically used to load a specific service definition by its id during search operations.
     */
    private String loadFilter = "(objectClass=%s)";

    public LdapServiceRegistryProperties() {
        setSearchFilter("(%s={0})");
    }
}
