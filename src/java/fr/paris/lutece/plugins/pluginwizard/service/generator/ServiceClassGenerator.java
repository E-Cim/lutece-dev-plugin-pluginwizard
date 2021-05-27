package fr.paris.lutece.plugins.pluginwizard.service.generator;

import fr.paris.lutece.plugins.pluginwizard.business.model.PluginModel;
import fr.paris.lutece.plugins.pluginwizard.business.model.ServiceClass;

import java.util.*;

/**
 *
 * The business classes representing the service layer of the plugin is generated
 *
 */
public class ServiceClassGenerator extends AbstractGenerator{
    private static final String PATH = "SOURCE/java/fr/paris/lutece/plugins/";
    private static final String PATH_SUFFIX = "/business/";
    private ServiceFileConfig _fileConfig;

    /**
     * Set the file config
     *
     * @param fileConfig
     *            The list of files
     */
    public void setFile( ServiceFileConfig fileConfig )
    {
        if ( fileConfig != null )
        {
            _fileConfig = fileConfig;
        }
        else
        {
            _fileConfig = null;
        }
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public Map<String, String> generate( PluginModel pm, String generationSchemeName )
    {
        HashMap<String, String> map = new HashMap<>( );
        Collection<ServiceClass> serviceClasses = pm.getServiceClasses( );

        String strPluginName = pm.getPluginNameAsPackage( );
        String strRadicalPackage = pm.getPluginNameAsRadicalPackage( );
        String strRadicalPath = pm.getPluginNameAsRadicalPath( );

        for ( ServiceClass serviceClass : serviceClasses )
        {
            String strClassName = _fileConfig.getPrefix( ) + serviceClass.getBusinessClass( ) + _fileConfig.getSuffix( );
            String strFilename = strClassName + ".java";
            String strSourceCode = getSourceCode( strPluginName, serviceClass, _fileConfig.getTemplate( ), strRadicalPackage, pm.getPluginName( ) );
            strSourceCode = strSourceCode.replace( "&lt;", "<" );
            strSourceCode = strSourceCode.replace( "&gt;", ">" );
            strSourceCode = strSourceCode.replace( "@i18n", "#i18n" );

            String strPath = PATH.replace( "SOURCE", _fileConfig.getSourcePath( ) ) + strRadicalPath + PATH_SUFFIX;

            map.put( getFilePath( pm, strPath, strFilename ), strSourceCode );
        }

        return map;
    }

    /**
     * Returns the source code of a business object
     *
     * @param strPluginName
     *            The plugin name
     * @param serviceClass
     *            The business class
     * @param strTemplate
     *            The type of generation(DAO,Home,etc)
     * @return The java source code of the business object
     */
    private String getSourceCode( String strPluginName, ServiceClass serviceClass, String strTemplate, String strRadicalPackage, String strBeanName )
    {
        Map<String, Object> model = new HashMap<>( );
        model.put( Markers.MARK_SERVICE_CLASS, serviceClass );
        model.put( Markers.MARK_PLUGIN_NAME, strPluginName );
        model.put( Markers.MARK_RADICAL_PACKAGE, strRadicalPackage );
        model.put( Markers.MARK_BEAN_NAME, strBeanName );

        return build( strTemplate, model );
    }
}
