package real.life.example;

interface Button {
    void render();
}

interface CheckBox{
    void render();
}

class WindowsButton implements Button{
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}

class WindowsCheckBox implements CheckBox{
    public void render() {
        System.out.println("Rendering Windows CheckBox");
    }
}


interface GUIFactory{
    Button createButton();
    CheckBox createCheckBox();
}


class WindowsFactory implements GUIFactory{
    public Button createButton() {
        return new WindowsButton();
    }

    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}

class FactoryProducer {
    static GUIFactory getFactory(String osType){
        if(osType.equalsIgnoreCase("Windows")){
            return new WindowsFactory();
        }
        return null;
    }
}




public class AbstractFactoryPattern {
    public static void main(String[] args) {
        GUIFactory factory = FactoryProducer.getFactory("Windows");
        Button button = factory.createButton();
        CheckBox checkbox = factory.createCheckBox();
        button.render();
        checkbox.render();
    }

}