package com.goit.gojavaonline.module3_1;

public abstract class File {
    private String name;
    private String path;
    private int size;

    public File (String name){
        setName(name);
    }

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

    public abstract void write(Object object);

    public abstract Object read();
}
