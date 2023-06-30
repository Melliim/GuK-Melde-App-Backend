package QuickChange.GuKMelde.App.Service;

import QuickChange.GuKMelde.App.Entities.FileInfo;
import QuickChange.GuKMelde.App.Repos.FileInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;

@Service
public class FileStorageService {

    private final FileInfoRepository fileInfoRepository;

    @Autowired
    public FileStorageService(FileInfoRepository fileInfoRepository) {
        this.fileInfoRepository = fileInfoRepository;
    }

    public FileInfo storeFile(MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        String fileUrl = "http://localhost:7001/files/" + fileName;

        FileInfo fileInfo = new FileInfo(fileName, fileUrl);
        return fileInfoRepository.save(fileInfo);
    }

    public List<FileInfo> getAllFiles() {
        return fileInfoRepository.findAll();
    }
}

