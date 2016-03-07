package com.goit.gojavaonline.module3_1;

public class File {
    private String name;
    private String path;
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void write(Object object){

    }

    public Object read(){
        Object object = new Object();
        return object;
    }
}
