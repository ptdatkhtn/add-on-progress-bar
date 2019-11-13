package org.vaadin.dat;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.listbox.ListBox;

@Tag("paper-slider")
@JsModule("@polymer/paper-slider/paper-slider.js")
@NpmPackage(value = "@polymer/paper-slider", version = "^3.0.1")
/*
 If you wish to include your own JS modules in the add-on jar, add the module
 files to './src/main/resources/META-INF/resources/frontend' and insert an
 annotation @JsModule("./my-module.js") here.
*/
public class PaperSlider extends Component {

    public PaperSlider() {

        ListBox<String> listBox = new ListBox<>();
        listBox.setItems("Bread", "Butter", "Milk");

        NativeButton button = new NativeButton("Select Milk",
                event -> listBox.setValue("Milk"));
    }

}
