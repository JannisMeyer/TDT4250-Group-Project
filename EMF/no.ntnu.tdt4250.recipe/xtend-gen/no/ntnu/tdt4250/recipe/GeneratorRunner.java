package no.ntnu.tdt4250.recipe;

import java.io.FileWriter;
import java.util.Map;
import no.ntnu.tdt4250.recipe.impl.RecipePackageImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class GeneratorRunner {
  public static void main(final String[] args) {
    final String model = "WithoutImage.recipe";
    final String folder = "src/generated";
    GeneratorRunner.registerMetamodel();
    GeneratorRunner.registerResourceFactory();
    final Page page = GeneratorRunner.loadModel(model);
    final RecipeLayoutGenerator generator = new RecipeLayoutGenerator();
    String _string = generator.generateLayout(page).toString();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(folder);
    _builder.append("/fragment_detailed_result.xml");
    GeneratorRunner.writeText(_string, _builder.toString());
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

  public static Page loadModel(final String filePath) {
    Page _xblockexpression = null;
    {
      final ResourceSet resSet = new ResourceSetImpl();
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

  public static Object registerResourceFactory() {
    Object _xblockexpression = null;
    {
      final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
      final Map<String, Object> m = reg.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _xblockexpression = m.put("recipe", _xMIResourceFactoryImpl);
    }
    return _xblockexpression;
  }
}
