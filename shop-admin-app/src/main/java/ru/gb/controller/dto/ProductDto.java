package ru.geekbrains.service.dto;

import ru.gb.controller.dto.CategoryDto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;

public class ProductDto {

    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @PositiveOrZero
    private BigDecimal price;

    private CategoryDto category;

    public ProductDto() {
    }

    public ProductDto(Long id, String name, String description, BigDecimal price, CategoryDto category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public CategoryDto getCategory() {
        return category;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }
}
