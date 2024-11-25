package no.ntnu.tdt4250.recipe.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import java.io.FileWriter
import no.ntnu.tdt4250.recipe.Page
import org.eclipse.emf.ecore.EPackage
import no.ntnu.tdt4250.recipe.impl.RecipePackageImpl
import com.google.inject.Injector
import no.ntnu.tdt4250.recipe.dsl.RecipeDSLStandaloneSetup
import org.eclipse.xtext.resource.IResourceFactory

class GeneratorRunner {
    
    	def static void main(String[] args) {
	
		val Injector injector = new RecipeDSLStandaloneSetup().createInjectorAndDoEMFRegistration()
		// We could also assume that the model the first argument of the java program, 
		// and that the output folder is the second
		// Parameters can be configured in the run configuration for Java
		//
		// val model = args.get(0)
		// val folder = args.get(1)
	
		// We hardcode them here, but you can uncomment the code above otherwise
		val model = "standard.recipedsl"
		val folder = "src/generated"
	
		registerMetamodel
		registerResourceFactory(injector)
	
		val page = loadModel(model, injector)
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
	
	def static loadModel(String filePath, Injector injector) {
        val ResourceSet resSet = injector.getInstance(ResourceSet)
        val uri = URI.createFileURI(filePath)
        
        println("> Loading: " + uri)
        val resource = resSet.getResource(uri, true)
        println("> Loaded.")
        
        resource.contents.head as Page
    }
	
	def static void registerMetamodel() {
        val myPackage = RecipePackageImpl.eINSTANCE
        EPackage.Registry.INSTANCE.put(myPackage.getNsURI(), myPackage)
    }
	
	def static registerResourceFactory(Injector injector) {
        val reg = Resource.Factory.Registry.INSTANCE
        val m = reg.getExtensionToFactoryMap()
        m.put("recipe", new XMIResourceFactoryImpl())
        m.put("recipedsl", injector.getInstance(org.eclipse.xtext.resource.IResourceFactory))
    }
}
