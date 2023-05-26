package view;

import config.KoneksiDB;
import config.UserSession;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.text.html.HTML.Tag.SELECT;

public class login extends javax.swing.JFrame {
    Connection con = KoneksiDB.getConnection();;
    ResultSet rs;
    
    public login() {
        initComponents();
        setLocationRelativeTO(this);
    }
    
    @SuppressWarnings("unchecked")
    private void usernameActionPerformed(java.awt.event.ActionEvent ect) {
    }
    private void passActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void nisnActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
        String user =username.getText();
        String pass = pass1.getText();
        
        try {
            Statement st = con.createStatement();
            String sql = SELECT * FROM petugas where username='"+user+"' and password='"+pass+"'";
            rs = st.executeQuery(sql);
            
            if (rs.next()) {
                String id = rs.getString("id_petugas");
                String username = rs.getString("username");
                String nama = rs.getString("nama_petugas");
                String level = rs.getString("level");
                
                UserSession.set_id(id);
                UserSession.set_username(username);
                UserSession.set_nama(nama);
                UserSession.set_level(level);
                
                switch (level) {
                    case "admin":
                    {
                        JOptionPane.showMessageDialog(null, "Selamat datang "+ nama +" !");
                        MenuUtama dsb = new MenuUtama();
                        dsb.dashPetugas();
                        dsb.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        dsb.setVisible(true);
                        dispose();
                        break;
                    }
                    default:
                    break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Username atau password salah");
            }
        }catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private void buttonLoginSiswaActionPerformed(java.ewt.event.ActionEvent evt) throws SQLException {
        String Get_nisn = nisn.getText();
        
        try {
            String sql = "SELECT * FROM siswa where nisn='"+Get_nisn+"'";
            rs = con.createStatement().executeQuery(sql);
            
            if (rs.next()) {
                String nisn = rs.getString("nisn");
                String nama_siswa = rs.getString("nama");
                
                UserSession.set_nisn(nisn);
                UserSession.set_nama_siswa(nama_siswa);
                
                JOptionPane.showMessegeDialog(null, "Selamat datang "+ nama_siswa +" !");
                MenuUtama dsb = new MenuUtama();
                dsb.dashSiswa();
                dsb.setExtendedState(JFrame.MAXIMIZED_BOTH);
                dsb.setVisible(true);
                dispose();
            } else {
                JOptinoPane.showMessageDialog(null, "NISN tidak ditemukan");
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void main(String args()) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    
    private javax.swing.JButton Login;
    private javax.swing.JButton buttonLoginSiswa;
    private javax.swing.JCheckBox jCheckBoxl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabedPane1;
    private javax.swing.JTextField nisn;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JTextField username;
}  
    
     
     
    
    
      
      
    
    
                
            
            
    
                
                
                
            
        
        
        
                        
                    }
                }
                
                
                
                
                
                
                
                
                
                
            }
            
            
              
                       
        
    }
    
        
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setLocationRelativeTO(login aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
        
        
    
    
    
    
  
}




package config;

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setLocationRelativeTO(login aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


public class login {
    
}
