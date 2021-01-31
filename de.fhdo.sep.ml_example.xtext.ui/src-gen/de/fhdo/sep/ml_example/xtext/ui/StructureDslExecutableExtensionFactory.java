/*
 * generated by Xtext 2.21.0
 */
package de.fhdo.sep.ml_example.xtext.ui;

import com.google.inject.Injector;
import de.fhdo.sep.ml_example.xtext.ui.internal.XtextActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass.
 */
public class StructureDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(XtextActivator.PLUGIN_ID);
	}

	@Override
	protected Injector getInjector() {
		XtextActivator activator = XtextActivator.getInstance();
		return activator != null ? activator.getInjector(XtextActivator.DE_FHDO_sep_ML_EXAMPLE_XTEXT_STRUCTUREDSL) : null;
	}

}
