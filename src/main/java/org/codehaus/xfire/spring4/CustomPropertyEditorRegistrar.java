package org.codehaus.xfire.spring4;

import java.beans.PropertyEditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

public final class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar  {

    private final PropertyEditor propertyEditor;
    
    /**
     *@Override 
     */
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        registry.registerCustomEditor(org.codehaus.xfire.service.ServiceFactory.class, propertyEditor);
        
    }

    public CustomPropertyEditorRegistrar(PropertyEditor propertyEditor) {
        super();
        this.propertyEditor = propertyEditor;
    }

}
