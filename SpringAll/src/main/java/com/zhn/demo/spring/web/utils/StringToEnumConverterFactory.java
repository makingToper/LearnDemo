package com.zhn.demo.spring.web.utils;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

public class StringToEnumConverterFactory implements ConverterFactory<String,Enum>{

    @Override
    public <T extends Enum> Converter<String, T> getConverter(Class<T> targetType) {
        return new StringToEnum<>(targetType);
    }

    private class StringToEnum<T extends Enum> implements Converter<String,T>{

        private final Class<T> enumType;

        public StringToEnum(Class<T> enumType) {
            this.enumType = enumType;
        }

        @Override
        public T convert(String source) {
            if (source.length() == 0)
            return null;
            return (T) Enum.valueOf(this.enumType,source.trim());
        }
    }

}
