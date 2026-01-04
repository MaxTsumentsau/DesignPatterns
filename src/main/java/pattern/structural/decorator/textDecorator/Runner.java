package pattern.structural.decorator.textDecorator;

import pattern.structural.decorator.textDecorator.commonInterface.Text;
import pattern.structural.decorator.textDecorator.component.PlainText;
import pattern.structural.decorator.textDecorator.concreteDecorator.BoldDecorator;
import pattern.structural.decorator.textDecorator.concreteDecorator.ItalicDecorator;

public class Runner {
    public static void main(String[] args) {
        Text text = new PlainText("Hello world");
        Text bold = new BoldDecorator(text);
        Text italic = new ItalicDecorator(text);
        Text boldItalic = new BoldDecorator(new ItalicDecorator(text));

        System.out.println(text.render());
        System.out.println(bold.render());
        System.out.println(italic.render());
        System.out.println(boldItalic.render());
    }
}
