package org.vaadin.dat;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("progress-bar")
//@JsModule("./progress-bar.js")
public class ProgressBar extends Component implements HasComponents {

    public ProgressBar(int progressBarWidth, int firstQuantity, int secondQuantity, int thirdQuantity) {
        int total = firstQuantity + secondQuantity + thirdQuantity;
        Div wrapper = new Div();
        wrapper.getStyle().set("display", "flex").set("width", "100%");

        Div firstPart = new Div();
        Div secondPart = new Div();
        Div thirdPart = new Div();

        if(total <= 0) {
            firstQuantity = 1;
            secondQuantity = 1;
            thirdQuantity = 1;
            firstPart.setText(String.valueOf(0));
            secondPart.setText(String.valueOf(0));
            thirdPart.setText(String.valueOf(0));
            total = firstQuantity + secondQuantity + thirdQuantity;
        } else {
            firstPart.setText(String.valueOf(firstQuantity));
            secondPart.setText(String.valueOf(secondQuantity));
            thirdPart.setText(String.valueOf(thirdQuantity));
        }

        firstPart.getStyle().set("background-color", "#4e4e58")
                .set("color", "#fff")
                .set("padding", "0 4px 0 8px")
                .set("border-top-left-radius", "20px")
                .set("border-bottom-left-radius", "20px")
                .set("min-width", "28px").set("width", firstQuantity * progressBarWidth / total + "px");

        secondPart.getStyle().set("background-color", "#8e8e96")
                .set("color", "#fff")
                .set("padding", "0 4px")
                .set("min-width", "28px").set("width", secondQuantity * progressBarWidth / total + "px");

        thirdPart.getStyle().set("background-color", "#cbcbd2")
                .set("padding", "0 4px 0 8px")
                .set("border-top-right-radius", "20px")
                .set("border-bottom-right-radius", "20px")
                .set("min-width", "28px").set("width", thirdQuantity * progressBarWidth / total + "px");;

        wrapper.add(firstPart);
        wrapper.add(secondPart);
        wrapper.add(thirdPart);

        add(wrapper);
    }

}
