package factories;

import buttons.Button;
import buttons.WindowsButton;
import checkboxes.Checkbox;
import checkboxes.WIndowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WIndowsCheckbox();
    }
}
