package com.seven.wonders.pojo.entity.wonder;

/**
 * Created by Pavel Ruban on 02.04.2017.
 * Abstract entity for Wonder
 */
public abstract class AbstractWonder {

    // FIELDS
    private Long id;

    private String code;

    private String name;

    private String imagePath;

    //CONSTRUCTORS

    //GETTERS AND SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
