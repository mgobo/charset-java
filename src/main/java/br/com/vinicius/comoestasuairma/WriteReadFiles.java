/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vinicius.comoestasuairma;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author mateusgobo
 */
public class WriteReadFiles {
 
    private final File file = new File("/<<seu_path>>/teste.txt");
    
    public void writeFiles() throws IOException{
        FileUtils.write(file, "Bifi, como vai sua irmã? Aquela vagaunda....! Que char é esse ÿ, kkkkk....", Charset.forName("ISO-8859-1"));
    }
    
    public void readFiles() throws IOException {
        List<String> lines = FileUtils.readLines(file, Charset.forName("ISO-8859-1"));        
        lines.forEach(System.out::print);                
    }
    
    public static void main(String[] args) throws IOException {
        WriteReadFiles wr = new WriteReadFiles();
        wr.writeFiles();
        wr.readFiles();
    }
}
