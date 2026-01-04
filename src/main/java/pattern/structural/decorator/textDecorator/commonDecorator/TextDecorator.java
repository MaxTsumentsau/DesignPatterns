package pattern.structural.decorator.textDecorator.commonDecorator;

import pattern.structural.decorator.textDecorator.commonInterface.Text;

public abstract class TextDecorator implements Text {
    protected Text inner;

    public TextDecorator(Text inner) {
        this.inner = inner;
    }

    @Override
    public String render() {
        return inner.render();
    }
}
