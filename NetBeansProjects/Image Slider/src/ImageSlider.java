
import AppPackage.AnimationClass;
import javax.swing.JOptionPane;





public class ImageSlider extends javax.swing.JFrame {

    AnimationClass  Ac = new AnimationClass();
    public void run(){
        int s = 0;
        Thread th;
        try{
            for(int i = 1; i<=200; i++){
                s = s+1;
                int m = jProgressBar2.getMaximum();
                int v = jProgressBar2.getValue();
                if(v<m){
                    jProgressBar2.setValue(jProgressBar2.getValue()+1);
                }
                else{
                    i = 20;
                    setVisible(false);
                    SimpleBank obj = new SimpleBank();
                    obj.setVisible(true);
                    Thread.sleep(5);
                    
                    
                }
            }
           
          
                    }
          catch(Exception e){
              JOptionPane.showMessageDialog(null, e);
                    
            
        }
    }
    public ImageSlider() {
        initComponents();
        slideShow();
    }
 
    public void slideShow(){
        new Thread(){
            int count;
            
            public void run(){
                try{
                    while(true){
                        switch(count){
                            case 0:
                                Thread.sleep(3000);
                            Ac.jLabelXLeft(0, -710, 10, 7, Slider1);
                            Ac.jLabelXLeft(710, 0, 10, 7, Slider2);
                            count = 1;
                            break;
                                 
                            
                        }
                        
                    }
                }catch(Exception e){
                    
                }
                 
            }
            
        }.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        Slider1 = new javax.swing.JLabel();
        Slider2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(540, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        Slider1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Slider1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Slider1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Custom.png"))); // NOI18N
        getContentPane().add(Slider1);
        Slider1.setBounds(0, 10, 540, 270);

        Slider2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Slider2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Custom.png"))); // NOI18N
        getContentPane().add(Slider2);
        Slider2.setBounds(0, 0, 540, 280);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Loading");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 4, 160, 30);

        jProgressBar2.setBackground(new java.awt.Color(204, 204, 204));
        jProgressBar2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jProgressBar2.setForeground(new java.awt.Color(255, 0, 102));
        getContentPane().add(jProgressBar2);
        jProgressBar2.setBounds(190, 284, 220, 40);

        setSize(new java.awt.Dimension(558, 390));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        public static void main(String args[]) {
       
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ImageSlider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageSlider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageSlider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageSlider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageSlider().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Slider1;
    private javax.swing.JLabel Slider2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    // End of variables declaration//GEN-END:variables
}
