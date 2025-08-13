package io.github.idevantonio.imageliteapi.application.images;

import io.github.idevantonio.imageliteapi.domain.entity.Image;
import io.github.idevantonio.imageliteapi.domain.service.ImageService;
import io.github.idevantonio.imageliteapi.infra.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {

    private final ImageRepository repository;

    @Override
    @Transactional
    public Image save(Image image){
        return repository.save(image);
    }
}
