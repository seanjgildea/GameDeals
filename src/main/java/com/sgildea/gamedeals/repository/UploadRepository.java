package com.sgildea.gamedeals.repository;

import com.sgildea.gamedeals.model.Upload;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UploadRepository extends JpaRepository<Upload, Long> {
}
