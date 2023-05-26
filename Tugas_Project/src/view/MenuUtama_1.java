package  view;
import java.io.File;
import javax.swing.*;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import config.KoneksiDB;
import config.UserSession;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class MenuUtama extends javax.swing.JFrame {
    
    Connection co = KoneksiDB.getConnection();
    ResultSet rs;
    DefaultTableModel model;
    
    String id = UserSession.get_id();
    String username = UserSession.get_username();
    String nama = UserSession.get_nama();
    String level = UserSession.get_level();
    String nisn = UserSession.get_nisn();
    String nama_siswa = UserSession.get_nama_siswa();
    
    public MenuUtama() {
        initComponents();
    }
    
    public void dashAdmin() {
        tableSpp();
        tabelTrans();
        jumlahDataMaster();
    }
    
    public void dashPetugas() {
        tabelSpp();
        tabelTrans();
        jumlahDataMaster();
        
    
        
       // siswa
    
        
        
               
        
        
    }
    
    
    
}




    

package tugas_project;

/**
 *
 * @author HP
 */
public class MenuUtama {
    
}
