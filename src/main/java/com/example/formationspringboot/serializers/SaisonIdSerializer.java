package com.example.formationspringboot.serializers;

import com.example.formationspringboot.entities.MultimediaContent;
import com.example.formationspringboot.entities.Saison;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class SaisonIdSerializer extends JsonSerializer<MultimediaContent> {
    @Override
    public void serialize(MultimediaContent value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value != null) {
            // Commencer l'objet JSON
            gen.writeStartObject();
            // Écrire le champ 'id' dans le JSON avec l'ID de la saison
            gen.writeObjectField("id", value.getId());
            // Écrire le champ 'titre' dans le JSON avec le titre de la saison
            gen.writeObjectField("titre", value.getTitre());
            // Finir l'objet JSON
            gen.writeEndObject();
        } else {
            gen.writeNull();
        }
    }



}
