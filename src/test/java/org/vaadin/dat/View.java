package org.vaadin.dat;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.listbox.ListBox;
import com.vaadin.flow.router.Route;

@Route("")
public class View extends Div {

    public View() {
//        PaperSlider paperSlider = new PaperSlider();
//        add(paperSlider);

        ProgressBar progressBar = new ProgressBar(1000,5, 15, 180);
        add(progressBar);

    }
}
