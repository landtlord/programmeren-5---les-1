package be.hogent.service.mappers;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractMapper<T,U> {
    abstract U toDTO(T t);

    abstract T toEntity(U u);

    public List<U> toDTO (List<T> t){
        return t.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public List<T> toEntity(List<U> u){
        return u.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
