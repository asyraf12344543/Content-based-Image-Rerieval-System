package cbir;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bassam
 */
public class AppGUI extends javax.swing.JFrame {

    JFileChooser jFileChooserQueryImage, jFileChooserRootFolder, jFileChooserAddImage;

    File queryImage;

    public AppGUI() {
        initComponents();
        setTitle("CBIR");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        queryImageButton = new javax.swing.JButton();
        rootFolderButton = new javax.swing.JButton();
        jButtonNearest5 = new javax.swing.JButton();
        rootLabel = new javax.swing.JLabel();
        queryLabel = new javax.swing.JLabel();
        myLabel = new javax.swing.JLabel();
        jRadioButtonMinkowski = new javax.swing.JRadioButton();
        jRadioButtonRD = new javax.swing.JRadioButton();
        jRadioButtonHI = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jRadioButtonIndex = new javax.swing.JRadioButton();
        myLabelRT5 = new javax.swing.JLabel();
        jLabelRT1 = new javax.swing.JLabel();
        myLabelRT2 = new javax.swing.JLabel();
        myLabelRT3 = new javax.swing.JLabel();
        myLabelRT4 = new javax.swing.JLabel();
        myLabelRT6 = new javax.swing.JLabel();
        myLabelRT7 = new javax.swing.JLabel();
        myLabelRT8 = new javax.swing.JLabel();
        myLabelRT9 = new javax.swing.JLabel();
        myLabelRT10 = new javax.swing.JLabel();
        addImage = new javax.swing.JButton();
        IndexedNumber = new javax.swing.JLabel();
        queryAddLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));

        queryImageButton.setText("Select Query Image");
        queryImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryImageButtonActionPerformed(evt);
            }
        });

        rootFolderButton.setText("Select Root Folder & Copy");
        rootFolderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootFolderButtonActionPerformed(evt);
            }
        });

        jButtonNearest5.setText("Nearest 10");
        jButtonNearest5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNearest5ActionPerformed(evt);
            }
        });

        rootLabel.setBackground(new java.awt.Color(255, 255, 255));

        queryLabel.setBackground(new java.awt.Color(255, 255, 255));

        jRadioButtonMinkowski.setText("Minkowski's Distance ");

        jRadioButtonRD.setText("Relative Deviation");

        jRadioButtonHI.setText("Histogram Intersection");

        jButton1.setText("Index Images");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButtonIndex.setText("Multi-Threading");

        addImage.setText("Add Image");
        addImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelRT1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myLabelRT2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myLabelRT3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myLabelRT4, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myLabelRT5, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myLabelRT6, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myLabelRT7, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myLabelRT8, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myLabelRT9, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myLabelRT10, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(queryImageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(queryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(myLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonIndex)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(IndexedNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rootFolderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(rootLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(162, 162, 162)
                                        .addComponent(addImage, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(queryAddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jButtonNearest5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonMinkowski)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonRD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonHI)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rootFolderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addComponent(queryImageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rootLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(queryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(queryAddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IndexedNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonIndex)
                        .addGap(210, 210, 210))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(myLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addComponent(jButtonNearest5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonMinkowski)
                    .addComponent(jRadioButtonRD)
                    .addComponent(jRadioButtonHI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(myLabelRT5, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addComponent(jLabelRT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myLabelRT2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myLabelRT3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myLabelRT4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myLabelRT5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myLabelRT6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myLabelRT7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myLabelRT8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myLabelRT9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myLabelRT10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        JScrollPane scrollPane;
        
        // Create a JScrollPane and add the content pane to it
        scrollPane = new JScrollPane(getContentPane());

        // Set the horizontal scrollbar policy to always show
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        // Set the scroll pane as the content pane of the JFrame
        setContentPane(scrollPane);
        
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void queryImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryImageButtonActionPerformed
        // TODO add your handling code here:

        jFileChooserQueryImage = new JFileChooser();
        String choosertitle = "Select Root Folder to begin Image Search";
        jFileChooserQueryImage.setDialogTitle(choosertitle);
        jFileChooserQueryImage.setCurrentDirectory(new java.io.File("."));

    // disable the "All files" option.
        //
        jFileChooserQueryImage.setAcceptAllFileFilterUsed(false);
        //    
        if (jFileChooserQueryImage.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            queryLabel.setText(jFileChooserQueryImage.getSelectedFile().getName());
            queryLabel.setBackground(Color.white);
        }
        queryImage = jFileChooserQueryImage.getSelectedFile();
        // myLabel.setIcon(new ImageIcon(queryImage.getAbsolutePath()));
        resizeToFitJlabel(queryImage, myLabel);


    }//GEN-LAST:event_queryImageButtonActionPerformed

    private void rootFolderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootFolderButtonActionPerformed
        // TODO add your handling code here:
        jFileChooserRootFolder = new JFileChooser();
        String choosertitle = "Select Root Folder to begin Image Search";
        jFileChooserRootFolder.setDialogTitle(choosertitle);
        jFileChooserRootFolder.setCurrentDirectory(new java.io.File("."));
        jFileChooserRootFolder.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    //
        // disable the "All files" option.
        //
        jFileChooserRootFolder.setAcceptAllFileFilterUsed(false);

        if (jFileChooserRootFolder.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            rootLabel.setText(jFileChooserRootFolder.getSelectedFile().toString());
            rootLabel.setBackground(Color.white);
        }
        int status = 0;
        File dest = new File("./ImageDatabase/");

        if (!dest.exists()) {
            dest.mkdir();
            infoBox("Image Database Folder has been created !", "Message ");
            dest.setExecutable(true);
            dest.setReadable(true);
            dest.setWritable(true);
        } else if (dest.exists()) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "The ImageDatabase Folder Already Exist ! Do you want to overwrite it ? ", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                try {
                    File hashFile = new File("hashmap.ser");
                    if (hashFile.exists()) {
                        hashFile.delete();
                    }

                    status = FolderWalk.searchForImagesAndMove(jFileChooserRootFolder.getSelectedFile(), dest);
                } catch (IOException ex) {
                    Logger.getLogger(AppGUI.class.getName()).log(Level.SEVERE, null, ex);
                    return;
                } catch (InterruptedException ex) {
                    Logger.getLogger(AppGUI.class.getName()).log(Level.SEVERE, null, ex);
                    return;
                }
            } else {
                return;
            }
        }

        if (status == 1) {
            infoBox("All Images have been copied into the local Image Database ", "Image Database");
        }

      // IndexedNumber.setText("Total Number of Images added to the DB ::"+hasobj1.getNoOfFiles());

    }//GEN-LAST:event_rootFolderButtonActionPerformed

    private void jButtonNearest5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNearest5ActionPerformed
        // TODO add your handling code here:
        String[] retrievedImagesMink, retrievedImagesRD, retrievedImagesHI;

        if (queryImage == null) {
            infoBox("Please Select a Image to Query First !", "Error !");
            return;
        }
        File compareImage = queryImage;

        HashMapIndexing hashmapobj = new HashMapIndexing();
    // IconDemoApp myIconDemo = new IconDemoApp();

        ButtonGroup bG = new ButtonGroup();
        bG.add(jRadioButtonMinkowski);
        bG.add(jRadioButtonHI);
        bG.add(jRadioButtonRD);

        if (jRadioButtonMinkowski.isSelected()) {
            try {
                retrievedImagesMink = hashmapobj.returnNearest5(compareImage, "Minkowski");
                // print(retrievedImagesMink);
                displayResults(retrievedImagesMink);
                infoBox("Matching Images Retrieved based on Minkowskis Distance", "Complete!");
            } catch (IOException ex) {
                Logger.getLogger(AppGUI.class.getName()).log(Level.SEVERE, null, ex);
                return;
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(AppGUI.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }
        }

        if (jRadioButtonHI.isSelected()) {
            try {
                retrievedImagesHI = hashmapobj.returnNearest5(compareImage, "HistogramIntersection");
                displayResults(retrievedImagesHI);
                infoBox("Matching Images Retrieved based on Histogram Intersection", "Complete!");
            } catch (IOException ex) {
                Logger.getLogger(AppGUI.class.getName()).log(Level.SEVERE, null, ex);
                return;
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(AppGUI.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }
        }
        if (jRadioButtonRD.isSelected()) {
            try {
                retrievedImagesRD = hashmapobj.returnNearest5(compareImage, "RelativeDeviation");
                displayResults(retrievedImagesRD);
                infoBox("Matching Images Retrieved based on Relative Deviation", "Complete!");
            } catch (IOException ex) {
                Logger.getLogger(AppGUI.class.getName()).log(Level.SEVERE, null, ex);
                return;
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(AppGUI.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }
        }


    }//GEN-LAST:event_jButtonNearest5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        HashMapIndexing hashMapObj = new HashMapIndexing();
        if (jRadioButtonIndex.isSelected()) {
            try {
                int stat = hashMapObj.createMapMultiThreaded();
                if (stat == 0) {
                    infoBox("Images have been Indexed Now !", "Indexed");
                }
            } catch (IOException ex) {
                Logger.getLogger(AppGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(AppGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(AppGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                hashMapObj.createMap();

            } catch (IOException ex) {
                Logger.getLogger(AppGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(AppGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        IndexedNumber.setText("Total Number of Images added to the DB ::" + hashMapObj.getNoOfFiles());
        IndexedNumber.setBackground(Color.white);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addImageActionPerformed
        // TODO add your handling code here:

        jFileChooserAddImage = new JFileChooser();
        String choosertitle = "Select Root Folder to begin Image Search";
        jFileChooserAddImage.setDialogTitle(choosertitle);
        jFileChooserAddImage.setCurrentDirectory(new java.io.File("."));

    // disable the "All files" option.
        //
        jFileChooserAddImage.setAcceptAllFileFilterUsed(false);
        //    
        if (jFileChooserAddImage.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            queryAddLabel.setText(jFileChooserAddImage.getSelectedFile().getName());
            queryAddLabel.setBackground(Color.white);
        }

        HashMapIndexing hasObj = new HashMapIndexing();
        try {
            hasObj.addImageToHashMap(jFileChooserAddImage.getSelectedFile());
        } catch (IOException ex) {
            Logger.getLogger(AppGUI.class.getName()).log(Level.SEVERE, null, ex);
            return;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(AppGUI.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }


    }//GEN-LAST:event_addImageActionPerformed

    private void resizeToFitJlabel(File imageFile, JLabel jLabel) {
        try {
            // Load the image
            Image image = ImageIO.read(imageFile);
            System.out.println(imageFile);
            // Get the dimensions of the label
            int labelWidth = jLabel.getWidth();
            int labelHeight = jLabel.getHeight();
            System.out.println(labelWidth + " " + labelHeight);
            
            // Check if the label dimensions are non-zero
            if (labelWidth != 0 && labelHeight != 0) {
                // Resize the image to fit the label while preserving its aspect ratio
                Image scaledImage = image.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);

                // Set the scaled image to the label
                jLabel.setIcon(new ImageIcon(scaledImage));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String[] returnFileNameFromPaths(String[] imagePaths) {
        String[] imageNames = null;
        for (int i = 0; i < imagePaths.length - 1; i++) {
            File f = new File(imagePaths[i]);
            // Path p = Paths.get(imagePaths[i]);
            imageNames[i] = f.getName();
        }
        return imageNames;
    }

    public static void print(String[] imagePaths) {
        for (int i = 0; i < imagePaths.length; i++) {
            System.out.println(imagePaths[i]);
        }

    }

    public void displayResults(String[] imagePaths) {

        File f0 = new File(imagePaths[0]);
        resizeToFitJlabel(f0, jLabelRT1);
        File f1 = new File(imagePaths[1]);
        resizeToFitJlabel(f1, myLabelRT2);
        File f2 = new File(imagePaths[2]);
        resizeToFitJlabel(f2, myLabelRT3);
        File f3 = new File(imagePaths[3]);
        resizeToFitJlabel(f3, myLabelRT4);
        File f4 = new File(imagePaths[4]);
        resizeToFitJlabel(f4, myLabelRT5);
        File f5 = new File(imagePaths[5]);
        resizeToFitJlabel(f5, myLabelRT6);
        File f6 = new File(imagePaths[6]);
        resizeToFitJlabel(f6, myLabelRT7);
        File f7 = new File(imagePaths[7]);
        resizeToFitJlabel(f7, myLabelRT8);
        File f8 = new File(imagePaths[8]);
        resizeToFitJlabel(f8, myLabelRT9);
        File f9 = new File(imagePaths[9]);
        resizeToFitJlabel(f9, myLabelRT10);
        

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppGUI().setVisible(true);
            }
        });
    }

    public static void infoBox(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IndexedNumber;
    private javax.swing.JButton addImage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonNearest5;
    private javax.swing.JLabel jLabelRT1;
    private javax.swing.JRadioButton jRadioButtonHI;
    private javax.swing.JRadioButton jRadioButtonIndex;
    private javax.swing.JRadioButton jRadioButtonMinkowski;
    private javax.swing.JRadioButton jRadioButtonRD;
    private javax.swing.JLabel myLabel;
    private javax.swing.JLabel myLabelRT2;
    private javax.swing.JLabel myLabelRT3;
    private javax.swing.JLabel myLabelRT4;
    private javax.swing.JLabel myLabelRT5;
    private javax.swing.JLabel myLabelRT6;
    private javax.swing.JLabel myLabelRT7;
    private javax.swing.JLabel myLabelRT8;
    private javax.swing.JLabel myLabelRT9;
    private javax.swing.JLabel myLabelRT10;
    private javax.swing.JLabel queryAddLabel;
    private javax.swing.JButton queryImageButton;
    private javax.swing.JLabel queryLabel;
    private javax.swing.JButton rootFolderButton;
    private javax.swing.JLabel rootLabel;
    // End of variables declaration//GEN-END:variables

}
