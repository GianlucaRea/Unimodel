/*
 * generated by Xtext 2.25.0
 */
package it.univaq.disim.unimodel.xtext.ide

import com.google.inject.Guice
import it.univaq.disim.unimodel.xtext.UnimodelRuntimeModule
import it.univaq.disim.unimodel.xtext.UnimodelStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class UnimodelIdeSetup extends UnimodelStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new UnimodelRuntimeModule, new UnimodelIdeModule))
	}
	
}
