package recipeProject.service;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public interface ImageService {
    void saveImageFile(Long recipeId, MultipartFile file);
}
