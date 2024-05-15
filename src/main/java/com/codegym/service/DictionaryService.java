package com.codegym.service;

import com.codegym.model.Dictionary;
import com.codegym.repository.IDictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DictionaryService implements IDictionaryService{

    @Autowired
    private IDictionaryRepository dictionaryRepository;

    @Override
    public List<Dictionary> displayAll() {
        return dictionaryRepository.displayAll();
    }

    @Override
    public List<Dictionary> findByWord(String keyword, String lang) {
        return dictionaryRepository.findByWord(keyword, lang);
    }
}
