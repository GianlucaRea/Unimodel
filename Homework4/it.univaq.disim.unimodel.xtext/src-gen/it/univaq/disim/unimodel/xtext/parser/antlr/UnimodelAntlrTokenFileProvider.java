/*
 * generated by Xtext 2.25.0
 */
package it.univaq.disim.unimodel.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class UnimodelAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("it/univaq/disim/unimodel/xtext/parser/antlr/internal/InternalUnimodel.tokens");
	}
}