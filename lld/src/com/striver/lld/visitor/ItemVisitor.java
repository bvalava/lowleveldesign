package com.striver.lld.visitor;

public interface ItemVisitor {

    void visit(PhysicalProduct item);
    void visit(DigitalProduct item);
    void visit(GiftCard item);
}
