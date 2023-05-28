package factories;

import buttons.Button;
import buttons.WIndowsButton;
import checkboxes.Checkbox;
import checkboxes.WIndowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WIndowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WIndowsCheckbox();
    }
}
