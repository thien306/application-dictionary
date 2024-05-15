package com.codegym.service;

import com.codegym.model.Dictionary;

import java.util.List;

public interface IDictionaryService {

    List<com.codegym.model.Dictionary> displayAll();

    List<Dictionary> findByWord(String keyword, String lang);
}
