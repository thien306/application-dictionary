package com.codegym.repository;

import com.codegym.model.Dictionary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DictionaryRepository implements IDictionaryRepository {

    private static List<Dictionary> dictionaryList;

    static {
        dictionaryList = new ArrayList<>();
        dictionaryList.add(new Dictionary("xin chào ", "hello"));
        dictionaryList.add(new Dictionary("tạm biệt  ", "Goodbye"));
        dictionaryList.add(new Dictionary("chào buổi sáng", "Good morning"));
        dictionaryList.add(new Dictionary("sáng", "bright"));
        dictionaryList.add(new Dictionary("quả táo", "apple"));

    }

    @Override
    public List<Dictionary> displayAll() {
        return dictionaryList;
    }

    @Override
    public List<Dictionary> findByWord(String keyword, String lang) {

        List<Dictionary> dictionaries = new ArrayList<>();

        if (lang.equals("vie")) {
            for (Dictionary dictionary : dictionaryList) {
                if (dictionary.getEnglish().toLowerCase().contains(keyword)) {
                    dictionaries.add(dictionary);
                }
            }
        } else if (lang.equals("eng")) {
            for (Dictionary dictionary : dictionaryList) {
                if (dictionary.getVietnamese().toLowerCase().contains(keyword)) {
                    dictionaries.add(dictionary);
                }
            }
        }
        return dictionaries;
    }
}
