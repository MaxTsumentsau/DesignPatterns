package pattern.structural.decorator.textDecorator.concreteDecorator;

import pattern.structural.decorator.textDecorator.commonDecorator.TextDecorator;
import pattern.structural.decorator.textDecorator.commonInterface.Text;

public class BoldDecorator extends TextDecorator {
    public BoldDecorator(Text inner) {
        super(inner);
    }

    @Override
    public String render() {
        return "<b>" + inner.render() + "</b>";
    }
}
