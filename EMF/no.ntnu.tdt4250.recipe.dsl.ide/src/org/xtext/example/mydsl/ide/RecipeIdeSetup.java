/*
 * generated by Xtext 2.36.0
 */
package org.xtext.example.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl.RecipeRuntimeModule;
import org.xtext.example.mydsl.RecipeStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class RecipeIdeSetup extends RecipeStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new RecipeRuntimeModule(), new RecipeIdeModule()));
	}
	
}
