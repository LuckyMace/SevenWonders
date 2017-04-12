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

    private int allWinPoints;

    private int conflictWinPoints;

    private int conflictPower;

    private int freeBuildByEpoch;

    private int freeBuildEnd;

    private String imagePathA;

    private String imagePathB;

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

    public int getAllWinPoints() {
        return allWinPoints;
    }

    public void setAllWinPoints(int allWinPoints) {
        this.allWinPoints = allWinPoints;
    }

    public int getConflictWinPoints() {
        return conflictWinPoints;
    }

    public void setConflictWinPoints(int conflictWinPoints) {
        this.conflictWinPoints = conflictWinPoints;
    }

    public int getConflictPower() {
        return conflictPower;
    }

    public void setConflictPower(int conflictPower) {
        this.conflictPower = conflictPower;
    }

    public int getFreeBuildByEpoch() {
        return freeBuildByEpoch;
    }

    public void setFreeBuildByEpoch(int freeBuildByEpoch) {
        this.freeBuildByEpoch = freeBuildByEpoch;
    }

    public int getFreeBuildEnd() {
        return freeBuildEnd;
    }

    public void setFreeBuildEnd(int freeBuildEnd) {
        this.freeBuildEnd = freeBuildEnd;
    }

    public String getImagePathA() {
        return imagePathA;
    }

    public void setImagePathA(String imagePathA) {
        this.imagePathA = imagePathA;
    }

    public String getImagePathB() {
        return imagePathB;
    }

    public void setImagePathB(String imagePathB) {
        this.imagePathB = imagePathB;
    }

}
