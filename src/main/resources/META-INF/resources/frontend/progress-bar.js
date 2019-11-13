import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class ProgressBar extends PolymerElement {

    static get template() {
        return html`
`;
    }

    static get is() {
        return 'progress-bar';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(ProgressBar.is, ProgressBar);
