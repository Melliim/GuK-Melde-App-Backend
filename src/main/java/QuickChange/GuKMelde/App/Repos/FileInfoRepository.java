package QuickChange.GuKMelde.App.Repos;


import QuickChange.GuKMelde.App.Entities.FileInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileInfoRepository extends JpaRepository<FileInfo, Long> {
}

