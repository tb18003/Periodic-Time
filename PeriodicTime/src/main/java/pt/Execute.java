/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pt;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tonicraft
 */
public class Execute extends javax.swing.JFrame {

    Info info = new Info();
    final float version = 1.2f;
    boolean dark = false;
    
    
    public Execute() throws IOException, URISyntaxException {
        if(info.no_act(version)){
            javax.swing.JOptionPane.showMessageDialog(null, "Su versión de Periodic Time está desactualizada."
                    + "\nSerá redirigido a la web oficial para actualizarlo", "Su software está desactualizado", javax.swing.JOptionPane.ERROR_MESSAGE);
            java.net.URL uwu = new java.net.URL("https://tonicraft18.github.io/Periodic-Time/webkit/download/");
            Desktop.getDesktop().browse(uwu.toURI());
            System.exit(0);
        }
        initComponents();
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }

    private void UIColor(int dr, int dg, int db, int wr, int wg, int wb){
        Panel.setBackground(new java.awt.Color(dr,dg,db));
        github.setBackground(new java.awt.Color(dr,dg,db));
        github.setForeground(new java.awt.Color(wr,wg,wb));
        title.setForeground(new java.awt.Color(wr,wg,wb));
        edition.setForeground(new java.awt.Color(wr,wg,wb));
        name_label.setForeground(new java.awt.Color(wr,wg,wb));
        name_var.setForeground(new java.awt.Color(wr,wg,wb));
        nox_label.setForeground(new java.awt.Color(wr,wg,wb));
        nox_var.setForeground(new java.awt.Color(wr,wg,wb));
        ma_label.setForeground(new java.awt.Color(wr,wg,wb));
        ma_var.setForeground(new java.awt.Color(wr,wg,wb));
        jLabel1.setForeground(new java.awt.Color(wr,wg,wb));
        darkmode.setForeground(new java.awt.Color(wr,wg,wb));
    }
    
    private void ButtonColor(int fr,int fg, int fb){
        actinio.setForeground(new java.awt.Color(fr,fg,fb));
        aluminio.setForeground(new java.awt.Color(fr,fg,fb));
        antinovio.setForeground(new java.awt.Color(fr,fg,fb));
        argon.setForeground(new java.awt.Color(fr,fg,fb));
        arsenico.setForeground(new java.awt.Color(fr,fg,fb));
        astato.setForeground(new java.awt.Color(fr,fg,fb));
        azufre.setForeground(new java.awt.Color(fr,fg,fb));
        bario.setForeground(new java.awt.Color(fr,fg,fb));
        berilio.setForeground(new java.awt.Color(fr,fg,fb));
        bismuto.setForeground(new java.awt.Color(fr,fg,fb));
        boro.setForeground(new java.awt.Color(fr,fg,fb));
        bromo.setForeground(new java.awt.Color(fr,fg,fb));
        cadmio.setForeground(new java.awt.Color(fr,fg,fb));
        calcio.setForeground(new java.awt.Color(fr,fg,fb));
        carbono.setForeground(new java.awt.Color(fr,fg,fb));
        cesio.setForeground(new java.awt.Color(fr,fg,fb));
        cinc.setForeground(new java.awt.Color(fr,fg,fb));
        circonio.setForeground(new java.awt.Color(fr,fg,fb));
        cloro.setForeground(new java.awt.Color(fr,fg,fb));
        cobalto.setForeground(new java.awt.Color(fr,fg,fb));
        cobre.setForeground(new java.awt.Color(fr,fg,fb));
        cripton.setForeground(new java.awt.Color(fr,fg,fb));
        cromo.setForeground(new java.awt.Color(fr,fg,fb));
        escandio.setForeground(new java.awt.Color(fr,fg,fb));
        estano.setForeground(new java.awt.Color(fr,fg,fb));
        estroncio.setForeground(new java.awt.Color(fr,fg,fb));
        fluor.setForeground(new java.awt.Color(fr,fg,fb));
        fosforo.setForeground(new java.awt.Color(fr,fg,fb));
        francio.setForeground(new java.awt.Color(fr,fg,fb));
        freddie.setForeground(new java.awt.Color(fr,fg,fb));
        galio.setForeground(new java.awt.Color(fr,fg,fb));
        germano.setForeground(new java.awt.Color(fr,fg,fb));
        hafnio.setForeground(new java.awt.Color(fr,fg,fb));
        helio.setForeground(new java.awt.Color(fr,fg,fb));
        hidroxen.setForeground(new java.awt.Color(fr,fg,fb));
        hierro.setForeground(new java.awt.Color(fr,fg,fb));
        indio.setForeground(new java.awt.Color(fr,fg,fb));
        iridio.setForeground(new java.awt.Color(fr,fg,fb));
        itrio.setForeground(new java.awt.Color(fr,fg,fb));
        lantano.setForeground(new java.awt.Color(fr,fg,fb));
        lithium.setForeground(new java.awt.Color(fr,fg,fb));
        magnes.setForeground(new java.awt.Color(fr,fg,fb));
        manganeso.setForeground(new java.awt.Color(fr,fg,fb));
        molibdeno.setForeground(new java.awt.Color(fr,fg,fb));
        neon.setForeground(new java.awt.Color(fr,fg,fb));
        niobio.setForeground(new java.awt.Color(fr,fg,fb));
        niquel.setForeground(new java.awt.Color(fr,fg,fb));
        nitrogen.setForeground(new java.awt.Color(fr,fg,fb));
        oro.setForeground(new java.awt.Color(fr,fg,fb));
        osmio.setForeground(new java.awt.Color(fr,fg,fb));
        oxigeno.setForeground(new java.awt.Color(fr,fg,fb));
        paladio.setForeground(new java.awt.Color(fr,fg,fb));
        plata.setForeground(new java.awt.Color(fr,fg,fb));
        platino.setForeground(new java.awt.Color(fr,fg,fb));
        plomo.setForeground(new java.awt.Color(fr,fg,fb));
        polonio.setForeground(new java.awt.Color(fr,fg,fb));
        potasio.setForeground(new java.awt.Color(fr,fg,fb));
        radio.setForeground(new java.awt.Color(fr,fg,fb));
        radon.setForeground(new java.awt.Color(fr,fg,fb));
        renio.setForeground(new java.awt.Color(fr,fg,fb));
        rodio.setForeground(new java.awt.Color(fr,fg,fb));
        rubidio.setForeground(new java.awt.Color(fr,fg,fb));
        rutenio.setForeground(new java.awt.Color(fr,fg,fb));
        ruther.setForeground(new java.awt.Color(fr,fg,fb));
        selenio.setForeground(new java.awt.Color(fr,fg,fb));
        silicio.setForeground(new java.awt.Color(fr,fg,fb));
        sodio.setForeground(new java.awt.Color(fr,fg,fb));
        talio.setForeground(new java.awt.Color(fr,fg,fb));
        tantalo.setForeground(new java.awt.Color(fr,fg,fb));
        tecnecio.setForeground(new java.awt.Color(fr,fg,fb));
        teluro.setForeground(new java.awt.Color(fr,fg,fb));
        titanio.setForeground(new java.awt.Color(fr,fg,fb));
        vanadio.setForeground(new java.awt.Color(fr,fg,fb));
        volfra.setForeground(new java.awt.Color(fr,fg,fb));
        xenon.setForeground(new java.awt.Color(fr,fg,fb));
        yodo.setForeground(new java.awt.Color(fr,fg,fb));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        edition = new javax.swing.JLabel();
        darkmode = new javax.swing.JCheckBox();
        hidroxen = new javax.swing.JButton();
        lithium = new javax.swing.JButton();
        potasio = new javax.swing.JButton();
        sodio = new javax.swing.JButton();
        rubidio = new javax.swing.JButton();
        cesio = new javax.swing.JButton();
        francio = new javax.swing.JButton();
        berilio = new javax.swing.JButton();
        magnes = new javax.swing.JButton();
        calcio = new javax.swing.JButton();
        estroncio = new javax.swing.JButton();
        bario = new javax.swing.JButton();
        radio = new javax.swing.JButton();
        escandio = new javax.swing.JButton();
        itrio = new javax.swing.JButton();
        lantano = new javax.swing.JButton();
        actinio = new javax.swing.JButton();
        titanio = new javax.swing.JButton();
        circonio = new javax.swing.JButton();
        hafnio = new javax.swing.JButton();
        ruther = new javax.swing.JButton();
        vanadio = new javax.swing.JButton();
        niobio = new javax.swing.JButton();
        tantalo = new javax.swing.JButton();
        cromo = new javax.swing.JButton();
        molibdeno = new javax.swing.JButton();
        volfra = new javax.swing.JButton();
        tecnecio = new javax.swing.JButton();
        renio = new javax.swing.JButton();
        manganeso = new javax.swing.JButton();
        hierro = new javax.swing.JButton();
        rutenio = new javax.swing.JButton();
        osmio = new javax.swing.JButton();
        cobalto = new javax.swing.JButton();
        rodio = new javax.swing.JButton();
        iridio = new javax.swing.JButton();
        niquel = new javax.swing.JButton();
        paladio = new javax.swing.JButton();
        platino = new javax.swing.JButton();
        cobre = new javax.swing.JButton();
        plata = new javax.swing.JButton();
        oro = new javax.swing.JButton();
        cinc = new javax.swing.JButton();
        cadmio = new javax.swing.JButton();
        freddie = new javax.swing.JButton();
        boro = new javax.swing.JButton();
        aluminio = new javax.swing.JButton();
        galio = new javax.swing.JButton();
        indio = new javax.swing.JButton();
        talio = new javax.swing.JButton();
        carbono = new javax.swing.JButton();
        silicio = new javax.swing.JButton();
        germano = new javax.swing.JButton();
        estano = new javax.swing.JButton();
        plomo = new javax.swing.JButton();
        nitrogen = new javax.swing.JButton();
        fosforo = new javax.swing.JButton();
        arsenico = new javax.swing.JButton();
        antinovio = new javax.swing.JButton();
        bismuto = new javax.swing.JButton();
        oxigeno = new javax.swing.JButton();
        azufre = new javax.swing.JButton();
        selenio = new javax.swing.JButton();
        teluro = new javax.swing.JButton();
        polonio = new javax.swing.JButton();
        fluor = new javax.swing.JButton();
        cloro = new javax.swing.JButton();
        bromo = new javax.swing.JButton();
        yodo = new javax.swing.JButton();
        astato = new javax.swing.JButton();
        helio = new javax.swing.JButton();
        neon = new javax.swing.JButton();
        argon = new javax.swing.JButton();
        cripton = new javax.swing.JButton();
        xenon = new javax.swing.JButton();
        radon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        name_label = new javax.swing.JLabel();
        nox_label = new javax.swing.JLabel();
        ma_label = new javax.swing.JLabel();
        ma_var = new javax.swing.JLabel();
        name_var = new javax.swing.JLabel();
        nox_var = new javax.swing.JLabel();
        github = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Periodic Time - TC Test");
        setResizable(false);
        setSize(new java.awt.Dimension(1242, 626));

        title.setFont(new java.awt.Font("Bahnschrift", 0, 80)); // NOI18N
        title.setText("Periodic Time+");

        edition.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        edition.setText("Alcachofa EDITION");

        darkmode.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        darkmode.setText("Modo Oscuro");
        darkmode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                darkmodeItemStateChanged(evt);
            }
        });
        darkmode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                darkmodeMouseClicked(evt);
            }
        });

        hidroxen.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        hidroxen.setText("H");
        hidroxen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        hidroxen.setContentAreaFilled(false);
        hidroxen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hidroxen.setEnabled(false);
        hidroxen.setFocusPainted(false);
        hidroxen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        hidroxen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        hidroxen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hidroxenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hidroxenMouseExited(evt);
            }
        });

        lithium.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lithium.setText("Li");
        lithium.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        lithium.setContentAreaFilled(false);
        lithium.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lithium.setEnabled(false);
        lithium.setFocusPainted(false);
        lithium.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lithium.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lithium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lithiumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lithiumMouseExited(evt);
            }
        });

        potasio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        potasio.setText("K");
        potasio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        potasio.setContentAreaFilled(false);
        potasio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        potasio.setEnabled(false);
        potasio.setFocusPainted(false);
        potasio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        potasio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        potasio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                potasioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                potasioMouseExited(evt);
            }
        });

        sodio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        sodio.setText("Na");
        sodio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        sodio.setContentAreaFilled(false);
        sodio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sodio.setEnabled(false);
        sodio.setFocusPainted(false);
        sodio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sodio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sodio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sodioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sodioMouseExited(evt);
            }
        });

        rubidio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        rubidio.setText("Rb");
        rubidio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        rubidio.setContentAreaFilled(false);
        rubidio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rubidio.setEnabled(false);
        rubidio.setFocusPainted(false);
        rubidio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rubidio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rubidio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rubidioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rubidioMouseExited(evt);
            }
        });

        cesio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cesio.setText("Cs");
        cesio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        cesio.setContentAreaFilled(false);
        cesio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cesio.setEnabled(false);
        cesio.setFocusPainted(false);
        cesio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cesio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cesio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cesioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cesioMouseExited(evt);
            }
        });

        francio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        francio.setText("Fr");
        francio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        francio.setContentAreaFilled(false);
        francio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        francio.setEnabled(false);
        francio.setFocusPainted(false);
        francio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        francio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        francio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                francioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                francioMouseExited(evt);
            }
        });

        berilio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        berilio.setText("Be");
        berilio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        berilio.setContentAreaFilled(false);
        berilio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        berilio.setEnabled(false);
        berilio.setFocusPainted(false);
        berilio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        berilio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                berilioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                berilioMouseExited(evt);
            }
        });

        magnes.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        magnes.setText("Mg");
        magnes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        magnes.setContentAreaFilled(false);
        magnes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        magnes.setEnabled(false);
        magnes.setFocusPainted(false);
        magnes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        magnes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        magnes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                magnesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                magnesMouseExited(evt);
            }
        });

        calcio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        calcio.setText("Ca");
        calcio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        calcio.setContentAreaFilled(false);
        calcio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        calcio.setEnabled(false);
        calcio.setFocusPainted(false);
        calcio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calcio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcioMouseExited(evt);
            }
        });

        estroncio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        estroncio.setText("Sr");
        estroncio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        estroncio.setContentAreaFilled(false);
        estroncio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        estroncio.setEnabled(false);
        estroncio.setFocusPainted(false);
        estroncio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        estroncio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        estroncio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                estroncioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                estroncioMouseExited(evt);
            }
        });

        bario.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        bario.setText("Ba");
        bario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        bario.setContentAreaFilled(false);
        bario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bario.setEnabled(false);
        bario.setFocusPainted(false);
        bario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                barioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                barioMouseExited(evt);
            }
        });

        radio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        radio.setText("Ra");
        radio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        radio.setContentAreaFilled(false);
        radio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        radio.setEnabled(false);
        radio.setFocusPainted(false);
        radio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        radio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        radio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                radioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                radioMouseExited(evt);
            }
        });

        escandio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        escandio.setText("Sc");
        escandio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        escandio.setContentAreaFilled(false);
        escandio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        escandio.setEnabled(false);
        escandio.setFocusPainted(false);
        escandio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        escandio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        escandio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                escandioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                escandioMouseExited(evt);
            }
        });

        itrio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        itrio.setText("Y");
        itrio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        itrio.setContentAreaFilled(false);
        itrio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itrio.setEnabled(false);
        itrio.setFocusPainted(false);
        itrio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        itrio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        itrio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itrioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                itrioMouseExited(evt);
            }
        });

        lantano.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lantano.setText("Ac");
        lantano.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        lantano.setContentAreaFilled(false);
        lantano.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lantano.setEnabled(false);
        lantano.setFocusPainted(false);
        lantano.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lantano.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lantano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lantanoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lantanoMouseExited(evt);
            }
        });

        actinio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        actinio.setText("La");
        actinio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        actinio.setContentAreaFilled(false);
        actinio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        actinio.setEnabled(false);
        actinio.setFocusPainted(false);
        actinio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        actinio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        actinio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actinioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actinioMouseExited(evt);
            }
        });

        titanio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        titanio.setText("Ti");
        titanio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        titanio.setContentAreaFilled(false);
        titanio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titanio.setEnabled(false);
        titanio.setFocusPainted(false);
        titanio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titanio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        titanio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                titanioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                titanioMouseExited(evt);
            }
        });

        circonio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        circonio.setText("Zr");
        circonio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        circonio.setContentAreaFilled(false);
        circonio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        circonio.setEnabled(false);
        circonio.setFocusPainted(false);
        circonio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        circonio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        circonio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                circonioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                circonioMouseExited(evt);
            }
        });

        hafnio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        hafnio.setText("Hf");
        hafnio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        hafnio.setContentAreaFilled(false);
        hafnio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hafnio.setEnabled(false);
        hafnio.setFocusPainted(false);
        hafnio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        hafnio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        hafnio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hafnioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hafnioMouseExited(evt);
            }
        });

        ruther.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        ruther.setText("Rf");
        ruther.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        ruther.setContentAreaFilled(false);
        ruther.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ruther.setEnabled(false);
        ruther.setFocusPainted(false);
        ruther.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ruther.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ruther.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rutherMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rutherMouseExited(evt);
            }
        });

        vanadio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        vanadio.setText("V");
        vanadio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        vanadio.setContentAreaFilled(false);
        vanadio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        vanadio.setEnabled(false);
        vanadio.setFocusPainted(false);
        vanadio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        vanadio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        vanadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vanadioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vanadioMouseExited(evt);
            }
        });

        niobio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        niobio.setText("Nb");
        niobio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        niobio.setContentAreaFilled(false);
        niobio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        niobio.setEnabled(false);
        niobio.setFocusPainted(false);
        niobio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        niobio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        niobio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                niobioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                niobioMouseExited(evt);
            }
        });

        tantalo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        tantalo.setText("Ta");
        tantalo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        tantalo.setContentAreaFilled(false);
        tantalo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tantalo.setEnabled(false);
        tantalo.setFocusPainted(false);
        tantalo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tantalo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tantalo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tantaloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tantaloMouseExited(evt);
            }
        });

        cromo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cromo.setText("Cr");
        cromo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        cromo.setContentAreaFilled(false);
        cromo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cromo.setEnabled(false);
        cromo.setFocusPainted(false);
        cromo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cromo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cromo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cromoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cromoMouseExited(evt);
            }
        });

        molibdeno.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        molibdeno.setText("Mo");
        molibdeno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        molibdeno.setContentAreaFilled(false);
        molibdeno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        molibdeno.setEnabled(false);
        molibdeno.setFocusPainted(false);
        molibdeno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        molibdeno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        molibdeno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                molibdenoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                molibdenoMouseExited(evt);
            }
        });

        volfra.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        volfra.setText("W");
        volfra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        volfra.setContentAreaFilled(false);
        volfra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        volfra.setEnabled(false);
        volfra.setFocusPainted(false);
        volfra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        volfra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        volfra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volfraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volfraMouseExited(evt);
            }
        });

        tecnecio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        tecnecio.setText("Tc");
        tecnecio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        tecnecio.setContentAreaFilled(false);
        tecnecio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tecnecio.setEnabled(false);
        tecnecio.setFocusPainted(false);
        tecnecio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tecnecio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tecnecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tecnecioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tecnecioMouseExited(evt);
            }
        });

        renio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        renio.setText("Re");
        renio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        renio.setContentAreaFilled(false);
        renio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        renio.setEnabled(false);
        renio.setFocusPainted(false);
        renio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        renio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        renio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                renioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                renioMouseExited(evt);
            }
        });

        manganeso.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        manganeso.setText("Mn");
        manganeso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        manganeso.setContentAreaFilled(false);
        manganeso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        manganeso.setEnabled(false);
        manganeso.setFocusPainted(false);
        manganeso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        manganeso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        manganeso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manganesoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manganesoMouseExited(evt);
            }
        });

        hierro.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        hierro.setText("Fe");
        hierro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        hierro.setContentAreaFilled(false);
        hierro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hierro.setEnabled(false);
        hierro.setFocusPainted(false);
        hierro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        hierro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        hierro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hierroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hierroMouseExited(evt);
            }
        });

        rutenio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        rutenio.setText("Ru");
        rutenio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        rutenio.setContentAreaFilled(false);
        rutenio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rutenio.setEnabled(false);
        rutenio.setFocusPainted(false);
        rutenio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rutenio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rutenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rutenioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rutenioMouseExited(evt);
            }
        });

        osmio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        osmio.setText("Os");
        osmio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        osmio.setContentAreaFilled(false);
        osmio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        osmio.setEnabled(false);
        osmio.setFocusPainted(false);
        osmio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        osmio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        osmio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                osmioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                osmioMouseExited(evt);
            }
        });

        cobalto.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cobalto.setText("Co");
        cobalto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        cobalto.setContentAreaFilled(false);
        cobalto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cobalto.setEnabled(false);
        cobalto.setFocusPainted(false);
        cobalto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cobalto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cobalto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cobaltoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cobaltoMouseExited(evt);
            }
        });

        rodio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        rodio.setText("Rh");
        rodio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        rodio.setContentAreaFilled(false);
        rodio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rodio.setEnabled(false);
        rodio.setFocusPainted(false);
        rodio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rodio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rodio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rodioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rodioMouseExited(evt);
            }
        });

        iridio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        iridio.setText("Ir");
        iridio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        iridio.setContentAreaFilled(false);
        iridio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iridio.setEnabled(false);
        iridio.setFocusPainted(false);
        iridio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iridio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        iridio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iridioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iridioMouseExited(evt);
            }
        });

        niquel.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        niquel.setText("Ni");
        niquel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        niquel.setContentAreaFilled(false);
        niquel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        niquel.setEnabled(false);
        niquel.setFocusPainted(false);
        niquel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        niquel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        niquel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                niquelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                niquelMouseExited(evt);
            }
        });

        paladio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        paladio.setText("Pd");
        paladio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        paladio.setContentAreaFilled(false);
        paladio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        paladio.setEnabled(false);
        paladio.setFocusPainted(false);
        paladio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        paladio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        paladio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paladioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paladioMouseExited(evt);
            }
        });

        platino.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        platino.setText("Pt");
        platino.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        platino.setContentAreaFilled(false);
        platino.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        platino.setEnabled(false);
        platino.setFocusPainted(false);
        platino.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        platino.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        platino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                platinoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                platinoMouseExited(evt);
            }
        });

        cobre.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cobre.setText("Cu");
        cobre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        cobre.setContentAreaFilled(false);
        cobre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cobre.setEnabled(false);
        cobre.setFocusPainted(false);
        cobre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cobre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cobreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cobreMouseExited(evt);
            }
        });

        plata.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        plata.setText("Ag");
        plata.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        plata.setContentAreaFilled(false);
        plata.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        plata.setEnabled(false);
        plata.setFocusPainted(false);
        plata.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plata.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        plata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plataMouseExited(evt);
            }
        });

        oro.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        oro.setText("Au");
        oro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        oro.setContentAreaFilled(false);
        oro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        oro.setEnabled(false);
        oro.setFocusPainted(false);
        oro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        oro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        oro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                oroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                oroMouseExited(evt);
            }
        });

        cinc.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cinc.setText("Zn");
        cinc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        cinc.setContentAreaFilled(false);
        cinc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cinc.setEnabled(false);
        cinc.setFocusPainted(false);
        cinc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cinc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cinc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cincMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cincMouseExited(evt);
            }
        });

        cadmio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cadmio.setText("Cd");
        cadmio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        cadmio.setContentAreaFilled(false);
        cadmio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cadmio.setEnabled(false);
        cadmio.setFocusPainted(false);
        cadmio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cadmio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cadmio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadmioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cadmioMouseExited(evt);
            }
        });

        freddie.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        freddie.setText("Hg");
        freddie.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        freddie.setContentAreaFilled(false);
        freddie.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        freddie.setEnabled(false);
        freddie.setFocusPainted(false);
        freddie.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        freddie.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        freddie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                freddieMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                freddieMouseExited(evt);
            }
        });

        boro.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        boro.setText("B");
        boro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        boro.setContentAreaFilled(false);
        boro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        boro.setEnabled(false);
        boro.setFocusPainted(false);
        boro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        boro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boroMouseExited(evt);
            }
        });

        aluminio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        aluminio.setText("Al");
        aluminio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        aluminio.setContentAreaFilled(false);
        aluminio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        aluminio.setEnabled(false);
        aluminio.setFocusPainted(false);
        aluminio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        aluminio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        aluminio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aluminioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aluminioMouseExited(evt);
            }
        });

        galio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        galio.setText("Ga");
        galio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        galio.setContentAreaFilled(false);
        galio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        galio.setEnabled(false);
        galio.setFocusPainted(false);
        galio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        galio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        galio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                galioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                galioMouseExited(evt);
            }
        });

        indio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        indio.setText("In");
        indio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        indio.setContentAreaFilled(false);
        indio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        indio.setEnabled(false);
        indio.setFocusPainted(false);
        indio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        indio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        indio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                indioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                indioMouseExited(evt);
            }
        });

        talio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        talio.setText("Tl");
        talio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        talio.setContentAreaFilled(false);
        talio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        talio.setEnabled(false);
        talio.setFocusPainted(false);
        talio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        talio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        talio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                talioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                talioMouseExited(evt);
            }
        });

        carbono.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        carbono.setText("C");
        carbono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        carbono.setContentAreaFilled(false);
        carbono.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        carbono.setEnabled(false);
        carbono.setFocusPainted(false);
        carbono.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carbono.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        carbono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                carbonoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carbonoMouseExited(evt);
            }
        });

        silicio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        silicio.setText("Si");
        silicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        silicio.setContentAreaFilled(false);
        silicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        silicio.setEnabled(false);
        silicio.setFocusPainted(false);
        silicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        silicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        silicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                silicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                silicioMouseExited(evt);
            }
        });

        germano.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        germano.setText("Ge");
        germano.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        germano.setContentAreaFilled(false);
        germano.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        germano.setEnabled(false);
        germano.setFocusPainted(false);
        germano.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        germano.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        germano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                germanoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                germanoMouseExited(evt);
            }
        });

        estano.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        estano.setText("Sn");
        estano.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        estano.setContentAreaFilled(false);
        estano.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        estano.setEnabled(false);
        estano.setFocusPainted(false);
        estano.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        estano.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        estano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                estanoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                estanoMouseExited(evt);
            }
        });

        plomo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        plomo.setText("Pb");
        plomo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        plomo.setContentAreaFilled(false);
        plomo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        plomo.setEnabled(false);
        plomo.setFocusPainted(false);
        plomo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plomo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        plomo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plomoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plomoMouseExited(evt);
            }
        });

        nitrogen.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        nitrogen.setText("N");
        nitrogen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        nitrogen.setContentAreaFilled(false);
        nitrogen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nitrogen.setEnabled(false);
        nitrogen.setFocusPainted(false);
        nitrogen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nitrogen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        nitrogen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nitrogenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nitrogenMouseExited(evt);
            }
        });

        fosforo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        fosforo.setText("P");
        fosforo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        fosforo.setContentAreaFilled(false);
        fosforo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fosforo.setEnabled(false);
        fosforo.setFocusPainted(false);
        fosforo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fosforo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        fosforo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fosforoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fosforoMouseExited(evt);
            }
        });

        arsenico.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        arsenico.setText("As");
        arsenico.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        arsenico.setContentAreaFilled(false);
        arsenico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        arsenico.setEnabled(false);
        arsenico.setFocusPainted(false);
        arsenico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        arsenico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        arsenico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                arsenicoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arsenicoMouseExited(evt);
            }
        });

        antinovio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        antinovio.setText("Sb");
        antinovio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        antinovio.setContentAreaFilled(false);
        antinovio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        antinovio.setEnabled(false);
        antinovio.setFocusPainted(false);
        antinovio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        antinovio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        antinovio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                antinovioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                antinovioMouseExited(evt);
            }
        });

        bismuto.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        bismuto.setText("Bi");
        bismuto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        bismuto.setContentAreaFilled(false);
        bismuto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bismuto.setEnabled(false);
        bismuto.setFocusPainted(false);
        bismuto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bismuto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bismuto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bismutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bismutoMouseExited(evt);
            }
        });

        oxigeno.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        oxigeno.setText("O");
        oxigeno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        oxigeno.setContentAreaFilled(false);
        oxigeno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        oxigeno.setEnabled(false);
        oxigeno.setFocusPainted(false);
        oxigeno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        oxigeno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        oxigeno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                oxigenoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                oxigenoMouseExited(evt);
            }
        });

        azufre.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        azufre.setText("S");
        azufre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        azufre.setContentAreaFilled(false);
        azufre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        azufre.setEnabled(false);
        azufre.setFocusPainted(false);
        azufre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        azufre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        azufre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                azufreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                azufreMouseExited(evt);
            }
        });

        selenio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        selenio.setText("Se");
        selenio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        selenio.setContentAreaFilled(false);
        selenio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        selenio.setEnabled(false);
        selenio.setFocusPainted(false);
        selenio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        selenio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        selenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selenioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selenioMouseExited(evt);
            }
        });

        teluro.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        teluro.setText("Te");
        teluro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        teluro.setContentAreaFilled(false);
        teluro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        teluro.setEnabled(false);
        teluro.setFocusPainted(false);
        teluro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        teluro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        teluro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                teluroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                teluroMouseExited(evt);
            }
        });

        polonio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        polonio.setText("Po");
        polonio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        polonio.setContentAreaFilled(false);
        polonio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        polonio.setEnabled(false);
        polonio.setFocusPainted(false);
        polonio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        polonio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        polonio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                polonioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                polonioMouseExited(evt);
            }
        });

        fluor.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        fluor.setText("F");
        fluor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        fluor.setContentAreaFilled(false);
        fluor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fluor.setEnabled(false);
        fluor.setFocusPainted(false);
        fluor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fluor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        fluor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fluorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fluorMouseExited(evt);
            }
        });

        cloro.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cloro.setText("Cl");
        cloro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        cloro.setContentAreaFilled(false);
        cloro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cloro.setEnabled(false);
        cloro.setFocusPainted(false);
        cloro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cloro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cloro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cloroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cloroMouseExited(evt);
            }
        });

        bromo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        bromo.setText("Br");
        bromo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        bromo.setContentAreaFilled(false);
        bromo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bromo.setEnabled(false);
        bromo.setFocusPainted(false);
        bromo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bromo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bromo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bromoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bromoMouseExited(evt);
            }
        });

        yodo.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        yodo.setText("I");
        yodo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        yodo.setContentAreaFilled(false);
        yodo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        yodo.setEnabled(false);
        yodo.setFocusPainted(false);
        yodo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        yodo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        yodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yodoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                yodoMouseExited(evt);
            }
        });

        astato.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        astato.setText("At");
        astato.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        astato.setContentAreaFilled(false);
        astato.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        astato.setEnabled(false);
        astato.setFocusPainted(false);
        astato.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        astato.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        astato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                astatoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                astatoMouseExited(evt);
            }
        });

        helio.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        helio.setText("He");
        helio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        helio.setContentAreaFilled(false);
        helio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        helio.setEnabled(false);
        helio.setFocusPainted(false);
        helio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        helio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        helio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                helioMouseExited(evt);
            }
        });

        neon.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        neon.setText("Ne");
        neon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        neon.setContentAreaFilled(false);
        neon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        neon.setEnabled(false);
        neon.setFocusPainted(false);
        neon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        neon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        neon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                neonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                neonMouseExited(evt);
            }
        });

        argon.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        argon.setText("Ar");
        argon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        argon.setContentAreaFilled(false);
        argon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        argon.setEnabled(false);
        argon.setFocusPainted(false);
        argon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        argon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        argon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                argonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                argonMouseExited(evt);
            }
        });

        cripton.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        cripton.setText("Kr");
        cripton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        cripton.setContentAreaFilled(false);
        cripton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cripton.setEnabled(false);
        cripton.setFocusPainted(false);
        cripton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cripton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cripton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                criptonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                criptonMouseExited(evt);
            }
        });

        xenon.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        xenon.setText("Xe");
        xenon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        xenon.setContentAreaFilled(false);
        xenon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        xenon.setEnabled(false);
        xenon.setFocusPainted(false);
        xenon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        xenon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        xenon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xenonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xenonMouseExited(evt);
            }
        });

        radon.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        radon.setText("Ra");
        radon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        radon.setContentAreaFilled(false);
        radon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        radon.setEnabled(false);
        radon.setFocusPainted(false);
        radon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        radon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        radon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                radonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                radonMouseExited(evt);
            }
        });

        jLabel1.setText("<html>\nEsta aplicación no ha sido diseñada con fines comerciales, asi que, <b>just feel and rate it :D</b>\n</html>");

        jPanel1.setDoubleBuffered(false);
        jPanel1.setFocusable(false);
        jPanel1.setOpaque(false);

        name_label.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        name_label.setText("Nombre - ");

        nox_label.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        nox_label.setText("Número de Oxidación - ");

        ma_label.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        ma_label.setText("Masa Atómica - ");

        ma_var.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        ma_var.setText("example");

        name_var.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        name_var.setText("example");

        nox_var.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        nox_var.setText("example");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nox_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nox_var, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ma_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ma_var, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(name_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name_var, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_label)
                    .addComponent(name_var))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nox_label)
                    .addComponent(nox_var))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ma_label)
                    .addComponent(ma_var))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        github.setText("Fork me on GitHub!");
        github.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                githubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hidroxen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lithium, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sodio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(berilio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(magnes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aluminio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carbono, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(silicio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nitrogen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fosforo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oxigeno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(azufre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fluor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cloro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(neon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(argon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(helio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(potasio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(calcio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(escandio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(titanio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(vanadio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cromo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(manganeso, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(hierro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cobalto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(niquel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cobre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cinc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(galio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(germano, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(arsenico, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(selenio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(bromo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cripton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(rubidio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(estroncio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(itrio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(circonio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(niobio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(molibdeno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(tecnecio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rutenio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rodio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(paladio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(plata, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cadmio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(indio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(estano, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(antinovio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(teluro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(yodo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(xenon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(cesio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(bario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(actinio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(hafnio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(tantalo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(volfra, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(renio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(osmio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(iridio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(platino, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(oro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(freddie, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(talio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(plomo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(bismuto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(polonio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(astato, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(radon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(francio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(radio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lantano, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(ruther, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edition, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(darkmode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(github))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(darkmode)
                    .addComponent(github))
                .addGap(0, 0, 0)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(title)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(hidroxen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(lithium, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(sodio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(berilio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(magnes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(edition)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(helio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(nitrogen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(fosforo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(carbono, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(silicio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(oxigeno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(azufre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(fluor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(cloro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(neon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(argon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(boro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(aluminio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(potasio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escandio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titanio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vanadio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cromo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manganeso, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hierro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cobalto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(niquel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cobre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(galio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(germano, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsenico, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selenio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bromo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cripton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rubidio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estroncio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itrio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(circonio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(niobio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(molibdeno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tecnecio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rutenio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rodio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paladio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plata, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadmio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estano, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(antinovio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teluro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yodo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xenon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cesio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actinio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hafnio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tantalo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volfra, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(renio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(osmio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iridio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(platino, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(freddie, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(talio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plomo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bismuto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(polonio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(astato, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(francio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lantano, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ruther, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radonMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_radonMouseExited

    private void radonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radonMouseEntered
        name_var.setText(info.getName(75));
        nox_var.setText(info.getNox(75));
        ma_var.setText(String.valueOf(info.getMa(75)));
    }//GEN-LAST:event_radonMouseEntered

    private void xenonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xenonMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_xenonMouseExited

    private void xenonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xenonMouseEntered
        name_var.setText(info.getName(74));
        nox_var.setText(info.getNox(74));
        ma_var.setText(String.valueOf(info.getMa(74)));
    }//GEN-LAST:event_xenonMouseEntered

    private void criptonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_criptonMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_criptonMouseExited

    private void criptonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_criptonMouseEntered
        name_var.setText(info.getName(73));
        nox_var.setText(info.getNox(73));
        ma_var.setText(String.valueOf(info.getMa(73)));
    }//GEN-LAST:event_criptonMouseEntered

    private void argonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_argonMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_argonMouseExited

    private void argonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_argonMouseEntered
        name_var.setText(info.getName(72));
        nox_var.setText(info.getNox(72));
        ma_var.setText(String.valueOf(info.getMa(72)));
    }//GEN-LAST:event_argonMouseEntered

    private void neonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_neonMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_neonMouseExited

    private void neonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_neonMouseEntered
        name_var.setText(info.getName(71));
        nox_var.setText(info.getNox(71));
        ma_var.setText(String.valueOf(info.getMa(71)));
    }//GEN-LAST:event_neonMouseEntered

    private void helioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_helioMouseExited

    private void helioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helioMouseEntered
        name_var.setText(info.getName(70));
        nox_var.setText(info.getNox(70));
        ma_var.setText(String.valueOf(info.getMa(70)));
    }//GEN-LAST:event_helioMouseEntered

    private void astatoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_astatoMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_astatoMouseExited

    private void astatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_astatoMouseEntered
        name_var.setText(info.getName(69));
        nox_var.setText(info.getNox(69));
        ma_var.setText(String.valueOf(info.getMa(69)));
    }//GEN-LAST:event_astatoMouseEntered

    private void yodoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yodoMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_yodoMouseExited

    private void yodoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yodoMouseEntered
        name_var.setText(info.getName(68));
        nox_var.setText(info.getNox(68));
        ma_var.setText(String.valueOf(info.getMa(68)));
    }//GEN-LAST:event_yodoMouseEntered

    private void bromoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bromoMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_bromoMouseExited

    private void bromoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bromoMouseEntered
        name_var.setText(info.getName(67));
        nox_var.setText(info.getNox(67));
        ma_var.setText(String.valueOf(info.getMa(67)));
    }//GEN-LAST:event_bromoMouseEntered

    private void cloroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cloroMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_cloroMouseExited

    private void cloroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cloroMouseEntered
        name_var.setText(info.getName(66));
        nox_var.setText(info.getNox(66));
        ma_var.setText(String.valueOf(info.getMa(66)));
    }//GEN-LAST:event_cloroMouseEntered

    private void fluorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fluorMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_fluorMouseExited

    private void fluorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fluorMouseEntered
        name_var.setText(info.getName(65));
        nox_var.setText(info.getNox(65));
        ma_var.setText(String.valueOf(info.getMa(65)));
    }//GEN-LAST:event_fluorMouseEntered

    private void polonioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_polonioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_polonioMouseExited

    private void polonioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_polonioMouseEntered
        name_var.setText(info.getName(64));
        nox_var.setText(info.getNox(64));
        ma_var.setText(String.valueOf(info.getMa(64)));
    }//GEN-LAST:event_polonioMouseEntered

    private void teluroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teluroMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_teluroMouseExited

    private void teluroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teluroMouseEntered
        name_var.setText(info.getName(63));
        nox_var.setText(info.getNox(63));
        ma_var.setText(String.valueOf(info.getMa(63)));
    }//GEN-LAST:event_teluroMouseEntered

    private void selenioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selenioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_selenioMouseExited

    private void selenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selenioMouseEntered
        name_var.setText(info.getName(62));
        nox_var.setText(info.getNox(62));
        ma_var.setText(String.valueOf(info.getMa(62)));
    }//GEN-LAST:event_selenioMouseEntered

    private void azufreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_azufreMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_azufreMouseExited

    private void azufreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_azufreMouseEntered
        name_var.setText(info.getName(61));
        nox_var.setText(info.getNox(61));
        ma_var.setText(String.valueOf(info.getMa(61)));
    }//GEN-LAST:event_azufreMouseEntered

    private void oxigenoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oxigenoMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_oxigenoMouseExited

    private void oxigenoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oxigenoMouseEntered
        name_var.setText(info.getName(60));
        nox_var.setText(info.getNox(60));
        ma_var.setText(String.valueOf(info.getMa(60)));
    }//GEN-LAST:event_oxigenoMouseEntered

    private void bismutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bismutoMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_bismutoMouseExited

    private void bismutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bismutoMouseEntered
        name_var.setText(info.getName(59));
        nox_var.setText(info.getNox(59));
        ma_var.setText(String.valueOf(info.getMa(59)));
    }//GEN-LAST:event_bismutoMouseEntered

    private void antinovioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_antinovioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_antinovioMouseExited

    private void antinovioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_antinovioMouseEntered
        name_var.setText(info.getName(58));
        nox_var.setText(info.getNox(58));
        ma_var.setText(String.valueOf(info.getMa(58)));
    }//GEN-LAST:event_antinovioMouseEntered

    private void arsenicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arsenicoMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_arsenicoMouseExited

    private void arsenicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arsenicoMouseEntered
        name_var.setText(info.getName(57));
        nox_var.setText(info.getNox(57));
        ma_var.setText(String.valueOf(info.getMa(57)));
    }//GEN-LAST:event_arsenicoMouseEntered

    private void fosforoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fosforoMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_fosforoMouseExited

    private void fosforoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fosforoMouseEntered
        name_var.setText(info.getName(56));
        nox_var.setText(info.getNox(56));
        ma_var.setText(String.valueOf(info.getMa(56)));
    }//GEN-LAST:event_fosforoMouseEntered

    private void nitrogenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nitrogenMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_nitrogenMouseExited

    private void nitrogenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nitrogenMouseEntered
        name_var.setText(info.getName(55));
        nox_var.setText(info.getNox(55));
        ma_var.setText(String.valueOf(info.getMa(55)));
    }//GEN-LAST:event_nitrogenMouseEntered

    private void plomoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plomoMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_plomoMouseExited

    private void plomoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plomoMouseEntered
        name_var.setText(info.getName(54));
        nox_var.setText(info.getNox(54));
        ma_var.setText(String.valueOf(info.getMa(54)));
    }//GEN-LAST:event_plomoMouseEntered

    private void estanoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estanoMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_estanoMouseExited

    private void estanoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estanoMouseEntered
        name_var.setText(info.getName(53));
        nox_var.setText(info.getNox(53));
        ma_var.setText(String.valueOf(info.getMa(53)));
    }//GEN-LAST:event_estanoMouseEntered

    private void germanoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_germanoMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_germanoMouseExited

    private void germanoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_germanoMouseEntered
        name_var.setText(info.getName(52));
        nox_var.setText(info.getNox(52));
        ma_var.setText(String.valueOf(info.getMa(52)));
    }//GEN-LAST:event_germanoMouseEntered

    private void silicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_silicioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_silicioMouseExited

    private void silicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_silicioMouseEntered
        name_var.setText(info.getName(51));
        nox_var.setText(info.getNox(51));
        ma_var.setText(String.valueOf(info.getMa(51)));
    }//GEN-LAST:event_silicioMouseEntered

    private void carbonoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carbonoMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_carbonoMouseExited

    private void carbonoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carbonoMouseEntered
        name_var.setText(info.getName(50));
        nox_var.setText(info.getNox(50));
        ma_var.setText(String.valueOf(info.getMa(50)));
    }//GEN-LAST:event_carbonoMouseEntered

    private void talioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_talioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_talioMouseExited

    private void talioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_talioMouseEntered
        name_var.setText(info.getName(49));
        nox_var.setText(info.getNox(49));
        ma_var.setText(String.valueOf(info.getMa(49)));
    }//GEN-LAST:event_talioMouseEntered

    private void indioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_indioMouseExited

    private void indioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indioMouseEntered
        name_var.setText(info.getName(48));
        nox_var.setText(info.getNox(48));
        ma_var.setText(String.valueOf(info.getMa(48)));
    }//GEN-LAST:event_indioMouseEntered

    private void galioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_galioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_galioMouseExited

    private void galioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_galioMouseEntered
        name_var.setText(info.getName(47));
        nox_var.setText(info.getNox(47));
        ma_var.setText(String.valueOf(info.getMa(47)));
    }//GEN-LAST:event_galioMouseEntered

    private void aluminioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aluminioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_aluminioMouseExited

    private void aluminioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aluminioMouseEntered
        name_var.setText(info.getName(46));
        nox_var.setText(info.getNox(46));
        ma_var.setText(String.valueOf(info.getMa(46)));
    }//GEN-LAST:event_aluminioMouseEntered

    private void boroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boroMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_boroMouseExited

    private void boroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boroMouseEntered
        name_var.setText(info.getName(45));
        nox_var.setText(info.getNox(45));
        ma_var.setText(String.valueOf(info.getMa(45)));
    }//GEN-LAST:event_boroMouseEntered

    private void freddieMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_freddieMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_freddieMouseExited

    private void freddieMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_freddieMouseEntered
        name_var.setText(info.getName(44));
        nox_var.setText(info.getNox(44));
        ma_var.setText(String.valueOf(info.getMa(44)));
    }//GEN-LAST:event_freddieMouseEntered

    private void cadmioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadmioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_cadmioMouseExited

    private void cadmioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadmioMouseEntered
        name_var.setText(info.getName(43));
        nox_var.setText(info.getNox(43));
        ma_var.setText(String.valueOf(info.getMa(43)));
    }//GEN-LAST:event_cadmioMouseEntered

    private void cincMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cincMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_cincMouseExited

    private void cincMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cincMouseEntered
        name_var.setText(info.getName(42));
        nox_var.setText(info.getNox(42));
        ma_var.setText(String.valueOf(info.getMa(42)));
    }//GEN-LAST:event_cincMouseEntered

    private void oroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oroMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_oroMouseExited

    private void oroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oroMouseEntered
        name_var.setText(info.getName(41));
        nox_var.setText(info.getNox(41));
        ma_var.setText(String.valueOf(info.getMa(41)));
    }//GEN-LAST:event_oroMouseEntered

    private void plataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plataMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_plataMouseExited

    private void plataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plataMouseEntered
        name_var.setText(info.getName(40));
        nox_var.setText(info.getNox(40));
        ma_var.setText(String.valueOf(info.getMa(40)));
    }//GEN-LAST:event_plataMouseEntered

    private void cobreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cobreMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_cobreMouseExited

    private void cobreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cobreMouseEntered
        name_var.setText(info.getName(39));
        nox_var.setText(info.getNox(39));
        ma_var.setText(String.valueOf(info.getMa(39)));
    }//GEN-LAST:event_cobreMouseEntered

    private void platinoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_platinoMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_platinoMouseExited

    private void platinoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_platinoMouseEntered
        name_var.setText(info.getName(38));
        nox_var.setText(info.getNox(38));
        ma_var.setText(String.valueOf(info.getMa(38)));
    }//GEN-LAST:event_platinoMouseEntered

    private void paladioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paladioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_paladioMouseExited

    private void paladioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paladioMouseEntered
        name_var.setText(info.getName(37));
        nox_var.setText(info.getNox(37));
        ma_var.setText(String.valueOf(info.getMa(37)));
    }//GEN-LAST:event_paladioMouseEntered

    private void niquelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_niquelMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_niquelMouseExited

    private void niquelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_niquelMouseEntered
        name_var.setText(info.getName(36));
        nox_var.setText(info.getNox(36));
        ma_var.setText(String.valueOf(info.getMa(36)));
    }//GEN-LAST:event_niquelMouseEntered

    private void iridioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iridioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_iridioMouseExited

    private void iridioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iridioMouseEntered
        name_var.setText(info.getName(35));
        nox_var.setText(info.getNox(35));
        ma_var.setText(String.valueOf(info.getMa(35)));
    }//GEN-LAST:event_iridioMouseEntered

    private void rodioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rodioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_rodioMouseExited

    private void rodioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rodioMouseEntered
        name_var.setText(info.getName(34));
        nox_var.setText(info.getNox(34));
        ma_var.setText(String.valueOf(info.getMa(34)));
    }//GEN-LAST:event_rodioMouseEntered

    private void cobaltoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cobaltoMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_cobaltoMouseExited

    private void cobaltoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cobaltoMouseEntered
        name_var.setText(info.getName(33));
        nox_var.setText(info.getNox(33));
        ma_var.setText(String.valueOf(info.getMa(33)));
    }//GEN-LAST:event_cobaltoMouseEntered

    private void osmioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_osmioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_osmioMouseExited

    private void osmioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_osmioMouseEntered
        name_var.setText(info.getName(32));
        nox_var.setText(info.getNox(32));
        ma_var.setText(String.valueOf(info.getMa(32)));
    }//GEN-LAST:event_osmioMouseEntered

    private void rutenioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rutenioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_rutenioMouseExited

    private void rutenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rutenioMouseEntered
        name_var.setText(info.getName(31));
        nox_var.setText(info.getNox(31));
        ma_var.setText(String.valueOf(info.getMa(31)));
    }//GEN-LAST:event_rutenioMouseEntered

    private void hierroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hierroMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_hierroMouseExited

    private void hierroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hierroMouseEntered
        name_var.setText(info.getName(30));
        nox_var.setText(info.getNox(30));
        ma_var.setText(String.valueOf(info.getMa(30)));
    }//GEN-LAST:event_hierroMouseEntered

    private void manganesoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manganesoMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_manganesoMouseExited

    private void manganesoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manganesoMouseEntered
        name_var.setText(info.getName(27));
        nox_var.setText(info.getNox(27));
        ma_var.setText(String.valueOf(info.getMa(27)));
    }//GEN-LAST:event_manganesoMouseEntered

    private void renioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_renioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_renioMouseExited

    private void renioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_renioMouseEntered
        name_var.setText(info.getName(29));
        nox_var.setText(info.getNox(29));
        ma_var.setText(String.valueOf(info.getMa(29)));
    }//GEN-LAST:event_renioMouseEntered

    private void tecnecioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tecnecioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_tecnecioMouseExited

    private void tecnecioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tecnecioMouseEntered
        name_var.setText(info.getName(28));
        nox_var.setText(info.getNox(28));
        ma_var.setText(String.valueOf(info.getMa(28)));
    }//GEN-LAST:event_tecnecioMouseEntered

    private void volfraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volfraMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_volfraMouseExited

    private void volfraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volfraMouseEntered
        name_var.setText(info.getName(26));
        nox_var.setText(info.getNox(26));
        ma_var.setText(String.valueOf(info.getMa(26)));
    }//GEN-LAST:event_volfraMouseEntered

    private void molibdenoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_molibdenoMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_molibdenoMouseExited

    private void molibdenoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_molibdenoMouseEntered
        name_var.setText(info.getName(25));
        nox_var.setText(info.getNox(25));
        ma_var.setText(String.valueOf(info.getMa(25)));
    }//GEN-LAST:event_molibdenoMouseEntered

    private void cromoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cromoMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_cromoMouseExited

    private void cromoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cromoMouseEntered
        name_var.setText(info.getName(24));
        nox_var.setText(info.getNox(24));
        ma_var.setText(String.valueOf(info.getMa(24)));
    }//GEN-LAST:event_cromoMouseEntered

    private void tantaloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tantaloMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_tantaloMouseExited

    private void tantaloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tantaloMouseEntered
        name_var.setText(info.getName(23));
        nox_var.setText(info.getNox(23));
        ma_var.setText(String.valueOf(info.getMa(23)));
    }//GEN-LAST:event_tantaloMouseEntered

    private void niobioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_niobioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_niobioMouseExited

    private void niobioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_niobioMouseEntered
        name_var.setText(info.getName(22));
        nox_var.setText(info.getNox(22));
        ma_var.setText(String.valueOf(info.getMa(22)));
    }//GEN-LAST:event_niobioMouseEntered

    private void vanadioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vanadioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_vanadioMouseExited

    private void vanadioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vanadioMouseEntered
        name_var.setText(info.getName(21));
        nox_var.setText(info.getNox(21));
        ma_var.setText(String.valueOf(info.getMa(21)));
    }//GEN-LAST:event_vanadioMouseEntered

    private void rutherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rutherMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_rutherMouseExited

    private void rutherMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rutherMouseEntered
        name_var.setText(info.getName(20));
        nox_var.setText(info.getNox(20));
        ma_var.setText(String.valueOf(info.getMa(20)));
    }//GEN-LAST:event_rutherMouseEntered

    private void hafnioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hafnioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_hafnioMouseExited

    private void hafnioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hafnioMouseEntered
        name_var.setText(info.getName(19));
        nox_var.setText(info.getNox(19));
        ma_var.setText(String.valueOf(info.getMa(19)));
    }//GEN-LAST:event_hafnioMouseEntered

    private void circonioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_circonioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_circonioMouseExited

    private void circonioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_circonioMouseEntered
        name_var.setText(info.getName(18));
        nox_var.setText(info.getNox(18));
        ma_var.setText(String.valueOf(info.getMa(18)));
    }//GEN-LAST:event_circonioMouseEntered

    private void titanioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titanioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_titanioMouseExited

    private void titanioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titanioMouseEntered
        name_var.setText(info.getName(17));
        nox_var.setText(info.getNox(17));
        ma_var.setText(String.valueOf(info.getMa(17)));
    }//GEN-LAST:event_titanioMouseEntered

    private void actinioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actinioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_actinioMouseExited

    private void actinioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actinioMouseEntered
        name_var.setText(info.getName(15));
        nox_var.setText(info.getNox(15));
        ma_var.setText(String.valueOf(info.getMa(15)));
    }//GEN-LAST:event_actinioMouseEntered

    private void lantanoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lantanoMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_lantanoMouseExited

    private void lantanoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lantanoMouseEntered
        name_var.setText(info.getName(16));
        nox_var.setText(info.getNox(16));
        ma_var.setText(String.valueOf(info.getMa(16)));
    }//GEN-LAST:event_lantanoMouseEntered

    private void itrioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itrioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_itrioMouseExited

    private void itrioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itrioMouseEntered
        name_var.setText(info.getName(14));
        nox_var.setText(info.getNox(14));
        ma_var.setText(String.valueOf(info.getMa(14)));
    }//GEN-LAST:event_itrioMouseEntered

    private void escandioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escandioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_escandioMouseExited

    private void escandioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escandioMouseEntered
        name_var.setText(info.getName(13));
        nox_var.setText(info.getNox(13));
        ma_var.setText(String.valueOf(info.getMa(13)));
    }//GEN-LAST:event_escandioMouseEntered

    private void radioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_radioMouseExited

    private void radioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioMouseEntered
        name_var.setText(info.getName(12));
        nox_var.setText(info.getNox(12));
        ma_var.setText(String.valueOf(info.getMa(12)));
    }//GEN-LAST:event_radioMouseEntered

    private void barioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_barioMouseExited

    private void barioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barioMouseEntered
        name_var.setText(info.getName(11));
        nox_var.setText(info.getNox(11));
        ma_var.setText(String.valueOf(info.getMa(11)));
    }//GEN-LAST:event_barioMouseEntered

    private void estroncioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estroncioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_estroncioMouseExited

    private void estroncioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estroncioMouseEntered
        name_var.setText(info.getName(10));
        nox_var.setText(info.getNox(10));
        ma_var.setText(String.valueOf(info.getMa(10)));
    }//GEN-LAST:event_estroncioMouseEntered

    private void calcioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_calcioMouseExited

    private void calcioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcioMouseEntered
        name_var.setText(info.getName(9));
        nox_var.setText(info.getNox(9));
        ma_var.setText(String.valueOf(info.getMa(9)));
    }//GEN-LAST:event_calcioMouseEntered

    private void magnesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_magnesMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_magnesMouseExited

    private void magnesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_magnesMouseEntered
        name_var.setText(info.getName(8));
        nox_var.setText(info.getNox(8));
        ma_var.setText(String.valueOf(info.getMa(8)));
    }//GEN-LAST:event_magnesMouseEntered

    private void berilioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_berilioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_berilioMouseExited

    private void berilioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_berilioMouseEntered
        name_var.setText(info.getName(7));
        nox_var.setText(info.getNox(7));
        ma_var.setText(String.valueOf(info.getMa(7)));
    }//GEN-LAST:event_berilioMouseEntered

    private void francioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_francioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_francioMouseExited

    private void francioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_francioMouseEntered
        name_var.setText(info.getName(6));
        nox_var.setText(info.getNox(6));
        ma_var.setText(String.valueOf(info.getMa(6)));
    }//GEN-LAST:event_francioMouseEntered

    private void cesioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cesioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_cesioMouseExited

    private void cesioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cesioMouseEntered
        name_var.setText(info.getName(5));
        nox_var.setText(info.getNox(5));
        ma_var.setText(String.valueOf(info.getMa(5)));
    }//GEN-LAST:event_cesioMouseEntered

    private void rubidioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rubidioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_rubidioMouseExited

    private void rubidioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rubidioMouseEntered
        name_var.setText(info.getName(4));
        nox_var.setText(info.getNox(4));
        ma_var.setText(String.valueOf(info.getMa(4)));
    }//GEN-LAST:event_rubidioMouseEntered

    private void sodioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sodioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_sodioMouseExited

    private void sodioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sodioMouseEntered
        name_var.setText(info.getName(2));
        nox_var.setText(info.getNox(2));
        ma_var.setText(String.valueOf(info.getMa(2)));
    }//GEN-LAST:event_sodioMouseEntered

    private void potasioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_potasioMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_potasioMouseExited

    private void potasioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_potasioMouseEntered
        name_var.setText(info.getName(3));
        nox_var.setText(info.getNox(3));
        ma_var.setText(String.valueOf(info.getMa(3)));
    }//GEN-LAST:event_potasioMouseEntered

    private void lithiumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lithiumMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_lithiumMouseExited

    private void lithiumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lithiumMouseEntered
        name_var.setText(info.getName(1));
        nox_var.setText(info.getNox(1));
        ma_var.setText(String.valueOf(info.getMa(1)));
    }//GEN-LAST:event_lithiumMouseEntered

    private void hidroxenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidroxenMouseExited
        name_var.setText("");
        nox_var.setText("");
        ma_var.setText("");
    }//GEN-LAST:event_hidroxenMouseExited

    private void hidroxenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidroxenMouseEntered
        name_var.setText(info.getName(0));
        nox_var.setText(info.getNox(0));
        ma_var.setText(String.valueOf(info.getMa(0)));
    }//GEN-LAST:event_hidroxenMouseEntered

    private void darkmodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_darkmodeMouseClicked
        //javax.swing.JOptionPane.showMessageDialog(null, "Función aún no disponible :(", "Modo Oscuro", 0);
    }//GEN-LAST:event_darkmodeMouseClicked

    private void darkmodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_darkmodeItemStateChanged
        if(dark == false){
            System.out.println("Dark Mode ON");
            UIColor(60,63,65,187,187,187);
            ButtonColor(187,187,187);

            dark = true;
        }else{
            System.out.println("Dark Mode OFF");
            UIColor(214,217,223,0,0,0);
            ButtonColor(0,0,0);
            dark = false;
        }
    }//GEN-LAST:event_darkmodeItemStateChanged

    private void githubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_githubActionPerformed
        java.net.URL uwu;
        try {
            uwu = new java.net.URL("https://www.github.com/tonicraft18/Periodic-Time");
            Desktop.getDesktop().browse(uwu.toURI());
        } catch (MalformedURLException ex) {
            Logger.getLogger(Execute.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Execute.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Execute.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_githubActionPerformed

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
            java.util.logging.Logger.getLogger(Execute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Execute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Execute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Execute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Execute().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Execute.class.getName()).log(Level.SEVERE, null, ex);
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Execute.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton actinio;
    private javax.swing.JButton aluminio;
    private javax.swing.JButton antinovio;
    private javax.swing.JButton argon;
    private javax.swing.JButton arsenico;
    private javax.swing.JButton astato;
    private javax.swing.JButton azufre;
    private javax.swing.JButton bario;
    private javax.swing.JButton berilio;
    private javax.swing.JButton bismuto;
    private javax.swing.JButton boro;
    private javax.swing.JButton bromo;
    private javax.swing.JButton cadmio;
    private javax.swing.JButton calcio;
    private javax.swing.JButton carbono;
    private javax.swing.JButton cesio;
    private javax.swing.JButton cinc;
    private javax.swing.JButton circonio;
    private javax.swing.JButton cloro;
    private javax.swing.JButton cobalto;
    private javax.swing.JButton cobre;
    private javax.swing.JButton cripton;
    private javax.swing.JButton cromo;
    private javax.swing.JCheckBox darkmode;
    private javax.swing.JLabel edition;
    private javax.swing.JButton escandio;
    private javax.swing.JButton estano;
    private javax.swing.JButton estroncio;
    private javax.swing.JButton fluor;
    private javax.swing.JButton fosforo;
    private javax.swing.JButton francio;
    private javax.swing.JButton freddie;
    private javax.swing.JButton galio;
    private javax.swing.JButton germano;
    private javax.swing.JButton github;
    private javax.swing.JButton hafnio;
    private javax.swing.JButton helio;
    private javax.swing.JButton hidroxen;
    private javax.swing.JButton hierro;
    private javax.swing.JButton indio;
    private javax.swing.JButton iridio;
    private javax.swing.JButton itrio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lantano;
    private javax.swing.JButton lithium;
    private javax.swing.JLabel ma_label;
    private javax.swing.JLabel ma_var;
    private javax.swing.JButton magnes;
    private javax.swing.JButton manganeso;
    private javax.swing.JButton molibdeno;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel name_var;
    private javax.swing.JButton neon;
    private javax.swing.JButton niobio;
    private javax.swing.JButton niquel;
    private javax.swing.JButton nitrogen;
    private javax.swing.JLabel nox_label;
    private javax.swing.JLabel nox_var;
    private javax.swing.JButton oro;
    private javax.swing.JButton osmio;
    private javax.swing.JButton oxigeno;
    private javax.swing.JButton paladio;
    private javax.swing.JButton plata;
    private javax.swing.JButton platino;
    private javax.swing.JButton plomo;
    private javax.swing.JButton polonio;
    private javax.swing.JButton potasio;
    private javax.swing.JButton radio;
    private javax.swing.JButton radon;
    private javax.swing.JButton renio;
    private javax.swing.JButton rodio;
    private javax.swing.JButton rubidio;
    private javax.swing.JButton rutenio;
    private javax.swing.JButton ruther;
    private javax.swing.JButton selenio;
    private javax.swing.JButton silicio;
    private javax.swing.JButton sodio;
    private javax.swing.JButton talio;
    private javax.swing.JButton tantalo;
    private javax.swing.JButton tecnecio;
    private javax.swing.JButton teluro;
    private javax.swing.JButton titanio;
    private javax.swing.JLabel title;
    private javax.swing.JButton vanadio;
    private javax.swing.JButton volfra;
    private javax.swing.JButton xenon;
    private javax.swing.JButton yodo;
    // End of variables declaration//GEN-END:variables

}
