/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.observer;

/**
 *
 * @author Elix
 */
public class Color {
    private String name;
    private String path= "files/pics/";

    public Color(String name) {
        this.name = name;
        this.path+=name;
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

    @Override
    public String toString() {
        return "Color{" + "name=" + name + ", path=" + path + '}';
    }
   
    
}
