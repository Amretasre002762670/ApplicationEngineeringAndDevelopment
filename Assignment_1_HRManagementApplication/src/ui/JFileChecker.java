/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author amretasrerengarajan
 */
public class JFileChecker extends FileFilter implements java.io.FileFilter
 {
 public boolean accept(File f)
   {
   if (f.getName().toLowerCase().endsWith(".jpeg")) return true;
   if (f.getName().toLowerCase().endsWith(".jpg")) return true;
   if(f.isDirectory())return true;
   return false;
  }
 public String getDescription()
   {
   return "JPEG files";
   }

} 
