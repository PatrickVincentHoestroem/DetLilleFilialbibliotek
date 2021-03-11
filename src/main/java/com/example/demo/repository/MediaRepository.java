package com.example.demo.repository;

import com.example.demo.model.Book;
import com.example.demo.model.Media;

import java.util.ArrayList;

public class MediaRepository {

    private ArrayList<Media> list;

    public MediaRepository(ArrayList<Media> list) {
        this.list = list;
    }

    public Media getMediaByName(String name) {
        for (Media m:list) {
            if (m.getName().equals(name)) {
                return m;
            }
        }
        return null;
    }

    public Media getBookByIsbn(String codeNo) {
        for (Media m:list) {
            if (m.getcodeNo().equals(codeNo)) {
                return m;
            }
        }
        return null;
    }
}
