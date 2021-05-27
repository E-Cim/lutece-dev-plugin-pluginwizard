package fr.paris.lutece.plugins.pluginwizard.service.generator;

/**
 * ServiceFileConfig
 */
public class ServiceFileConfig {

    // Variables declarations
    private String _strPrefix = "";
    private String _strSuffix = "";
    private String _strPath = "src";
    private String _strTemplate;

    /**
     * Returns the Prefix
     *
     * @return The Prefix
     */
    public String getPrefix( )
    {
        return _strPrefix;
    }

    /**
     * Sets the Prefix
     *
     * @param strPrefix
     *            The Prefix
     */
    public void setPrefix( String strPrefix )
    {
        _strPrefix = strPrefix;
    }

    /**
     * Returns the Suffix
     *
     * @return The Suffix
     */
    public String getSuffix( )
    {
        return _strSuffix;
    }

    /**
     * Sets the Suffix
     *
     * @param strSuffix
     *            The Suffix
     */
    public void setSuffix( String strSuffix )
    {
        _strSuffix = strSuffix;
    }

    /**
     * Returns the Path
     *
     * @return The Path
     */
    public String getSourcePath( )
    {
        return _strPath;
    }

    /**
     * Sets the Path
     *
     * @param strPath
     *            The Path
     */
    public void setSourcePath( String strPath )
    {
        _strPath = strPath;
    }

    /**
     * Returns the Template
     *
     * @return The Template
     */
    public String getTemplate( )
    {
        return _strTemplate;
    }

    /**
     * Sets the Template
     *
     * @param strTemplate
     *            The Template
     */
    public void setTemplate( String strTemplate )
    {
        _strTemplate = strTemplate;
    }
}
