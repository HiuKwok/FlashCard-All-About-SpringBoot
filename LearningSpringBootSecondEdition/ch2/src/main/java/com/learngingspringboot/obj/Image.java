package com.learngingspringboot.obj;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.soap.Detail;


/*
* Current version of lombok and Jackson dun work together, temp solve is put all member
* to public and add a dummy constructor.
* */
@Data
@NoArgsConstructor()
public class Image {

    public String id;
    public String name;

    public Image(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Image(int i, String name) {
        this.id = String.valueOf(i);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
