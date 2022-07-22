package br.com.acrani.SpringJpaDIO.services.exceptions;

public class DataBaseException extends RuntimeException{

    public DataBaseException(String message) {
        super(message);
    }
}
