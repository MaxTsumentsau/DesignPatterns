package pattern.structural.decorator.textDecorator.concreteDecorator;

import pattern.structural.decorator.textDecorator.commonDecorator.TextDecorator;
import pattern.structural.decorator.textDecorator.commonInterface.Text;

public class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(Text inner) {
        super(inner);
    }

    @Override
    public String render() {
        return "<i>" + super.render() + "</i>";
    }
}
