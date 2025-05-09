//package GUI.Panel;
//
//import java.awt.*;
//import javax.swing.*;
//import GUI.Component.PanelShadow;
//import com.formdev.flatlaf.FlatIntelliJLaf;
//
//public class TrangChu extends JPanel {
//
//    JPanel top, center, bar1, bar2;
//    PanelShadow content[];
//    JPanel info[];
//    JLabel title, subTit, infoDetail[], objDetail[], objDetail1[], infoIcon[];
//        String[][] getSt = {
//        {"Tính chính xác", "tinhchinhxac_128px.svg", "<html>Mã IMEI là một số duy nhất được <br>gán cho từng thiết bị điện thoại,<br> do đó hệ thống quản lý điện thoại<br> theo mã IMEI sẽ đảm bảo tính <br>chính xác và độ tin cậy cao.</html>"},
//        {"Tính bảo mật", "tinhbaomat_128px.svg", "<html>Ngăn chặn việc sử dụng các thiết bị<br> điện thoại giả mạo hoặc bị đánh cắp.<br> Điều này giúp tăng tính bảo mật cho <br>các hoạt động quản lý điện thoại.</html>"},
//    };
//    Color MainColor = new Color(255, 255, 255);
//    Color FontColor = new Color(96, 125, 139);
//    Color BackgroundColor = new Color(240, 247, 250);
//    Color HowerFontColor = new Color(225, 230, 232);
//
//    private void initComponent() {
//        this.setBackground(new Color(24, 24, 24));
//        this.setBounds(0, 200, 300, 1200);
//        this.setLayout(new BorderLayout(0, 0));
//        this.setOpaque(true);
//
//        top = new JPanel();
//        top.setBackground(MainColor);
//        top.setPreferredSize(new Dimension(1100, 200));
//        top.setLayout(new FlowLayout(1, 0, 10));
//
//        JLabel slogan = new JLabel();
//        slogan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/slogan1.png")));
//        top.add(slogan);
//
//        this.add(top, BorderLayout.NORTH);
//
//        center = new JPanel();
//        center.setBackground(BackgroundColor);
//        center.setPreferredSize(new Dimension(1100, 800));
//        center.setLayout(new FlowLayout(1, 50, 50));
//
//        content = new PanelShadow[getSt.length];
//        info = new JPanel[3];
//        infoDetail = new JLabel[3];
//        objDetail = new JLabel[3];
//        objDetail1 = new JLabel[3];
//
//        infoIcon = new JLabel[3];
//
//        for (int i = 0; i < getSt.length; i++) {
//              
//              content[i] = new PanelShadow(getSt[i][1], getSt[i][0], getSt[i][2]);
//              center.add(content[i]);
//
//        }
//
//        this.add(center, BorderLayout.CENTER);
//
//    }
//
//    public TrangChu() {
//        initComponent();
//        FlatIntelliJLaf.registerCustomDefaultsSource("style");
//        FlatIntelliJLaf.setup();
//    }
//}
