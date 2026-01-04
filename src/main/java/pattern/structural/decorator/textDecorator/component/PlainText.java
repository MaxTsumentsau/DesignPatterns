package pattern.structural.decorator.textDecorator.component;

import pattern.structural.decorator.textDecorator.commonInterface.Text;

public class PlainText implements Text {
    private String content;

    public PlainText(String content) {
        this.content = content;
    }

    @Override
    public String render() {
        return content;
    }
}
