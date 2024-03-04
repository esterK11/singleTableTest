package com.example.formationspringboot.entities.enums;

public enum StatusVisionnage {
    AVOIR,
    ENCOURS,
    VU
}

//Additionally, even though this data representation is far more readable compared to the @Enumerated(EnumType.ORDINAL) option, it also consumes a lot more space than necessary. This might turn out to be a significant issue when we need to deal with a high volume of data.