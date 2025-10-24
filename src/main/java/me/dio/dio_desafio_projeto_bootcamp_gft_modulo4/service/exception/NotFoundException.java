package me.dio.dio_desafio_projeto_bootcamp_gft_modulo4.service.exception;

public class NotFoundException extends BusinessException {

    private static final long serialVersionUID = 1L;

    public NotFoundException() {
        super("Resource not found.");
    }

}