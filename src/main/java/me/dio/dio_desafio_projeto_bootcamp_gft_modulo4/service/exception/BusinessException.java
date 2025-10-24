package me.dio.dio_desafio_projeto_bootcamp_gft_modulo4.service.exception;

public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public BusinessException(String message) {
        super(message);
    }
}
