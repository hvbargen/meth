/*
 * generated by Xtext 2.26.0
 */
package hvbargen.meth;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class MethStandaloneSetup extends MethStandaloneSetupGenerated {

	public static void doSetup() {
		new MethStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
