package no.ntnu.tdt4250.recipe.generator;

import com.google.inject.Injector;
import java.io.FileWriter;
import java.util.Map;
import no.ntnu.tdt4250.recipe.Page;
import no.ntnu.tdt4250.recipe.RecipePackage;
import no.ntnu.tdt4250.recipe.impl.RecipePackageImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class GeneratorRunner {
  public static void main(final String[] args) {
    throw new Error("Unresolved compilation problems:"
      + "\nRecipeDSLStandaloneSetup cannot be resolved."
      + "\ncreateInjectorAndDoEMFRegistration cannot be resolved");
  }

  public static String writeText(final String text, final String filePath) {
    try {
      String _xblockexpression = null;
      {
        InputOutput.<String>println(("> Writing: " + filePath));
        final FileWriter file = new FileWriter(filePath, false);
        file.write(text);
        file.close();
        _xblockexpression = InputOutput.<String>println("> Done.");
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public static Page loadModel(final String filePath, final Injector injector) {
    Page _xblockexpression = null;
    {
      final ResourceSet resSet = injector.<ResourceSet>getInstance(ResourceSet.class);
      final URI uri = URI.createFileURI(filePath);
      InputOutput.<String>println(("> Loading: " + uri));
      final Resource resource = resSet.getResource(uri, true);
      InputOutput.<String>println("> Loaded.");
      EObject _head = IterableExtensions.<EObject>head(resource.getContents());
      _xblockexpression = ((Page) _head);
    }
    return _xblockexpression;
  }

  public static void registerMetamodel() {
    final RecipePackage myPackage = RecipePackageImpl.eINSTANCE;
    EPackage.Registry.INSTANCE.put(myPackage.getNsURI(), myPackage);
  }

  public static Object registerResourceFactory(final Injector injector) {
    Object _xblockexpression = null;
    {
      final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
      final Map<String, Object> m = reg.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      m.put("recipe", _xMIResourceFactoryImpl);
      _xblockexpression = m.put("recipedsl", injector.<IResourceFactory>getInstance(IResourceFactory.class));
    }
    return _xblockexpression;
  }
}
