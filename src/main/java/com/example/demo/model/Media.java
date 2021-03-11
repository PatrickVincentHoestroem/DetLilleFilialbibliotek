package com.example.demo.model;

public class Media {

    private String name;
    private String mediaType;
    private long codeNo;
    private double size;

    public Media(String name, String mediaType, long codeNo, double size) {
        this.name = name;
        this.mediaType = mediaType;
        this.codeNo = codeNo;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public long getCodeNo() {
        return codeNo;
    }

    public void setCodeNo(long codeNo) {
        this.codeNo = codeNo;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Media{" +
                "name='" + name + '\'' +
                ", mediaType='" + mediaType + '\'' +
                ", codeNo=" + codeNo +
                ", size=" + size +
                '}';
    }
}
