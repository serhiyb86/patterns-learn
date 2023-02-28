package behavioral.visitor.element;

import behavioral.visitor.visitor.Visitor;

public interface Element {

    public void accept(Visitor visitor);
}
