package com.striver.lld.flyweight;

public class Tree {

    private int x;
    private int y;

    // Attributes that remain constant
    private TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw() {
        treeType.draw(x, y);
    }
}
