package com.kotenkov.crawler.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileSystemUtil {

    public static void createFolder(String folderPath) throws IOException {
        File folder = new File(folderPath);
        if (!folder.exists()) {
            Files.createDirectory(folder.toPath());
        }
    }
}
