package no.ntnu.tdt4250.recipe

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import java.io.FileWriter
import no.ntnu.tdt4250.recipe.Page
import no.ntnu.tdt4250.recipe.RecipeLayoutGenerator
import org.eclipse.emf.ecore.EPackage
import no.ntnu.tdt4250.recipe.impl.RecipePackageImpl

class GeneratorRunner {
    
    	def static void main(String[] args) {
	
		// We could also assume that the model the first argument of the java program, 
		// and that the output folder is the second
		// Parameters can be configured in the run configuration for Java
		//
		// val model = args.get(0)
		// val folder = args.get(1)
	
		// We hardcode them here, but you can uncomment the code above otherwise
		val model = "Standard.recipe"
		val folder = "src/generated"
	
		registerMetamodel
		registerResourceFactory
	
		val page = loadModel(model)
		val layoutGenerator = new RecipeLayoutGenerator()
		val fragmentGenerator = new RecipeFragmentGenerator()
		
		writeText(
			layoutGenerator.generateLayout(page).toString,
			'''«folder»/fragment_detailed_result_generated.xml'''			
		)
		
		writeText(
			fragmentGenerator.generateFragment(page).toString,
			'''«folder»/DetailedResultFragmentGenerated.kt'''			
		)
			
	}
	
	def static writeText(String text, String filePath) {
		println("> Writing: " + filePath)
		
		val file = new FileWriter(filePath, false)
		file.write(text)
		file.close		
		
		println("> Done.")
	}
	
	def static loadModel(String filePath) {
        val ResourceSet resSet = new ResourceSetImpl();

        // Load a resource (replace the path with the correct one)
        // Relative paths are relative to the project root folder.
        val uri = URI.createFileURI(filePath);
        
        println("> Loading: " + uri);
        val resource = resSet.getResource(uri, true);
        println("> Loaded.")
        
        // .head gets the first element of an array or list.
        // "as StateMachine" is the Xtend way of doing cast
        resource.contents.head as Page
	}
	
	def static void registerMetamodel() {
		val myPackage = RecipePackageImpl.eINSTANCE;
		
		// Adding the metamodel to the EMF metamodel registry
		// (the pair "namespace/package instance" is added to a map)
		EPackage.Registry.INSTANCE.put(myPackage.getNsURI(), myPackage);
	}
	
	def static registerResourceFactory() {
		// Registration of the XMI resource factory
		// Defines that models (files) with extension ".sm" should be de-serialized as XMI
		// Potentially, different implementation of resource factory can be used or created
		// Here the pair "extension/instance of resource factory" is also added to a map
        val reg = Resource.Factory.Registry.INSTANCE;
        val m = reg.getExtensionToFactoryMap();
        m.put("recipe", new XMIResourceFactoryImpl());
	}
}