package org.codehaus.modello.generator.xml.xpp3;

import java.util.Properties;

import org.codehaus.modello.AbstractModelloJavaGeneratorTest;
import org.codehaus.modello.core.ModelloCore;
import org.codehaus.modello.model.Model;

public class BooleanTypeXpp3GeneratorTest
    extends AbstractModelloJavaGeneratorTest
{
    public BooleanTypeXpp3GeneratorTest()
    {
        super( "testBooleanType" );
    }

    public void testBooleanType()
        throws Throwable
    {
        ModelloCore modello = (ModelloCore) lookup( ModelloCore.ROLE );

        Model model = modello.loadModel( getXmlResourceReader( "/boolean.mdo" ) );

        Properties parameters = getModelloParameters( "1.0.0" );

        modello.generate( model, "java", parameters );
        modello.generate( model, "xpp3-reader", parameters );

        compileGeneratedSources();
    }
}
