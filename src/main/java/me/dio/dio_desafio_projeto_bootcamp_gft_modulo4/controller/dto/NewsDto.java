package me.dio.dio_desafio_projeto_bootcamp_gft_modulo4.controller.dto;

import me.dio.dio_desafio_projeto_bootcamp_gft_modulo4.domain.model.News;

public record NewsDto(Long id, String icon, String description) {

    public NewsDto(News model) {
        this(model.getId(), model.getIcon(), model.getDescription());
    }

    public News toModel() {
        News model = new News();
        model.setId(this.id);
        model.setIcon(this.icon);
        model.setDescription(this.description);
        return model;
    }
}