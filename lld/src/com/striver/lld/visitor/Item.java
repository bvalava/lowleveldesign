package com.striver.lld.visitor;

public interface Item {

    void accept(ItemVisitor visitor);
}
