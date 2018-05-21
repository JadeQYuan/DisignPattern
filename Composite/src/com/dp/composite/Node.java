package com.dp.composite;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private String id;
    private String name;
    private String parentId;
    private List<Node> children = new ArrayList<>();

    public Node(String id, String name, String parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public void add(Node node){
        List<Node> nodeList = this.getChildren();
        nodeList.add(node);
        this.setChildren(nodeList);
    }

    public void print(){
        System.out.println("node:" + getName());
        for(Node node : children){
            node.print();
        }
    }
}
