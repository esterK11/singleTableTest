package com.example.formationspringboot.serializers;

import com.example.formationspringboot.entities.MultimediaContent;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class SerieIdSerializer extends JsonSerializer<MultimediaContent> {
    @Override
    public void serialize(MultimediaContent value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value != null) {
            gen.writeStartObject();
            gen.writeObjectField("id", value.getId());
            gen.writeObjectField("titre", value.getTitre());
            gen.writeObjectField("description", value.getTitre());
            gen.writeEndObject();
        } else {
            gen.writeNull();
        }
    }
}