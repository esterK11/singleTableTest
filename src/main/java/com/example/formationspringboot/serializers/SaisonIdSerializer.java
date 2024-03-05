package com.example.formationspringboot.serializers;

import com.example.formationspringboot.entities.MultimediaContent;
import com.example.formationspringboot.entities.Saison;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class SaisonIdSerializer extends JsonSerializer<Saison> {
    @Override
    public void serialize(Saison saison, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        // Commencer l'objet JSON
        gen.writeStartObject();
        // Écrire le champ 'id' dans le JSON avec l'ID de la saison
        gen.writeObjectField("id", saison.getId());
        // Écrire le champ 'titre' dans le JSON avec le titre de la saison
        gen.writeObjectField("titre", saison.getTitre());
        // Finir l'objet JSON
        gen.writeEndObject();
    }



}
