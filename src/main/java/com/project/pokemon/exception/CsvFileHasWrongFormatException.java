package com.project.pokemon.exception;

public class CsvFileHasWrongFormatException extends RuntimeException{
    private static final long serialVersionUID = -7872735426629925871L;

    public CsvFileHasWrongFormatException() {
        super("csv has issues");
    }

}
