package com.sgildea.gamedeals.converters;

import com.sgildea.gamedeals.model.Platform;
import com.sgildea.gamedeals.repository.PlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToPlatformConverter implements Converter<String, Platform> {

    @Autowired
    PlatformRepository platformRepository;

    @Override
    public Platform convert(String id) {
        try {
            Long platformId = Long.valueOf(id);
            return platformRepository.getOne(platformId);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
