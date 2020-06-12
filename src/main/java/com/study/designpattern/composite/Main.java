package com.study.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Main
 * @Description TODO
 * @Author zy
 * @Date 2020/6/11 下午4:13
 */
//组合模式Composite：处理树状结构
public class Main {

    public static void main(String[] args) {
        BranchNode rootNode = new BranchNode("root");
        LeafeNode node1 = new LeafeNode("leaf1");
        LeafeNode node2 = new LeafeNode("lea2");
        rootNode.addNode(node1);
        rootNode.addNode(node2);

        BranchNode childRoot = new BranchNode("childRoot");
        LeafeNode node3 = new LeafeNode("childleaf1");
        LeafeNode node4 = new LeafeNode("childlea2");
        childRoot.addNode(node3);
        childRoot.addNode(node4);
        rootNode.addNode(childRoot);

        tree(rootNode,0);
    }

    public static void tree(Node node, int depth){
        for(int i=0;i<depth;i++) {
            System.out.print("--");
        }
        node.print();
        if(node instanceof BranchNode){
            for(Node node1:((BranchNode)node).nodes){
                tree(node1,depth+1);
            }
        }

    }

}

abstract class Node{
    abstract void print();
}

class BranchNode extends Node{
    String name;
    List<Node> nodes = new ArrayList<>();

    public BranchNode(String name) {
        this.name = name;
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    @Override
    void print() {
        System.out.println(name);
    }
}

class LeafeNode extends Node{
    String name;

    public LeafeNode(String name) {
        this.name = name;
    }

    @Override
    void print() {
        System.out.println(name);
    }
}