package behavioral.visitor.visitor;

import behavioral.visitor.element.HtmlElement;
import behavioral.visitor.element.HtmlParentElement;

public interface Visitor {
    public void visit(HtmlElement element);

    public void visit(HtmlParentElement parentElement);
}
