package QuickChange.GuKMelde.App.Controller;

import QuickChange.GuKMelde.App.Entities.FileInfo;
import QuickChange.GuKMelde.App.Service.FileStorageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api")
public class FileController {

    private final FileStorageService fileStorageService;

    @Autowired
    public FileController(FileStorageService fileStorageService) {
        this.fileStorageService = fileStorageService;
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("No file uploaded");
        }

        FileInfo fileInfo = fileStorageService.storeFile(file);
        return ResponseEntity.ok("File uploaded successfully with ID: " + fileInfo.getId());
    }

    @GetMapping("/files")
    public ResponseEntity<List<FileInfo>> getFiles() {
        List<FileInfo> fileInfos = fileStorageService.getAllFiles();
        return ResponseEntity.ok(fileInfos);
    }
}
