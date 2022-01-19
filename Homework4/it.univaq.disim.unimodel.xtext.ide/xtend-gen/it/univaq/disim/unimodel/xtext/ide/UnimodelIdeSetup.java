/**
 * generated by Xtext 2.25.0
 */
package it.univaq.disim.unimodel.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import it.univaq.disim.unimodel.xtext.UnimodelRuntimeModule;
import it.univaq.disim.unimodel.xtext.UnimodelStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class UnimodelIdeSetup extends UnimodelStandaloneSetup {
  @Override
  public Injector createInjector() {
    UnimodelRuntimeModule _unimodelRuntimeModule = new UnimodelRuntimeModule();
    UnimodelIdeModule _unimodelIdeModule = new UnimodelIdeModule();
    return Guice.createInjector(Modules2.mixin(_unimodelRuntimeModule, _unimodelIdeModule));
  }
}