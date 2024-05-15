package com.codegym.repository;

import com.codegym.model.Dictionary;

import java.util.List;

public interface IDictionaryRepository {

    List<Dictionary> displayAll();

    List<Dictionary> findByWord(String keyword, String lang);
}
