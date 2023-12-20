package com.cgvsu.cg_task03_02_objwriter;

import com.cgvsu.cg_task03_02_objwriter.model.Model;
import com.cgvsu.cg_task03_02_objwriter.objreader.ObjReader;
import com.cgvsu.cg_task03_02_objwriter.objwriter.ObjWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileContent = Files.readString(Path.of("3DModels/Faceform/WrapUpperTeeth.obj"));
        Model model = ObjReader.read(fileContent);
        String file = "New file.obj";
        ObjWriter.writeModelToObjFile(file, model);
    }
}