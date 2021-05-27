package fr.paris.lutece.plugins.pluginwizard.web.formbean;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;

import java.io.Serializable;

/**
 * ServiceClass formbean
 */
public class ServiceClassFormBean implements Serializable {
    private int _nIdServiceClass;
    @NotEmpty( message = "pluginwizard.error.serviceClass.class.notEmpty" )
    @Pattern( regexp = "[A-Z][a-zA-Z]*", message = "pluginwizard.error.serviceClass.class.pattern" )
    private String _strServiceClass;
    @Pattern( regexp = "[A-Z][a-zA-Z]*", message = "pluginwizard.error.serviceClass.class.pattern" )
    private String _strCustomServiceException;
    @Pattern( regexp = "[A-Z][a-zA-Z]*", message = "pluginwizard.error.serviceClass.class.pattern" )
    private String _strBusinessClass;

    /**
     * Returns the Associated business class
     *
     * @return Associated business class
     */
    public String getBusinessClass() {
        return _strBusinessClass;
    }

    /**
     * Sets the Associated business class
     *
     * @param _strBusinessClass: business class
     */
    public void setBusinessClass(String _strBusinessClass) {
        this._strBusinessClass = _strBusinessClass;
    }

    /**
     * Returns the ServiceId
     *
     * @return ServiceId
     */
    public int getId( )
    {
        return _nIdServiceClass;
    }

    /**
     * Sets the ServiceId
     * @param _nIdServiceClass
     */
    public void setId(int _nIdServiceClass)
    {
        this._nIdServiceClass = _nIdServiceClass;
    }

    /**
     * Returns the ServiceClass
     *
     * @return ServiceClass
     */
    public String getServiceClass( )
    {
        return _strServiceClass;
    }

    /**
     * Sets the ServiceClass
     *
     * @param _strServiceClass
     */
    public void setServiceClass( String _strServiceClass )
    {
        this._strServiceClass = _strServiceClass;
    }

    /**
     * Returns the CustomServiceException name
     *
     * @return
     */
    public String getCustomServiceException( )
    {
        return _strCustomServiceException;
    }

    /**
     * Sets the CustomServiceException name
     *
     * @param _strCustomServiceException
     */
    public void setCustomServiceException( String _strCustomServiceException )
    {
        this._strCustomServiceException = _strCustomServiceException;
    }
}
