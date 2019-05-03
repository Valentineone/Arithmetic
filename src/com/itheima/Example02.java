package com.itheima;
import javax.swing.*;
public class Example02 {
    private static void createAndShowGUI() {
        // 创建并设置JFrame容器窗口
        JFrame frame = new JFrame("JFrameTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 150);
        frame.setVisible(true);
        // 在JFrame容器窗口基础上创建并设置JDialog容器窗口
        JDialog dialog = new JDialog(frame, "JDialog对话框",true);
        dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        dialog.setSize(200, 100);
        dialog.setVisible(true);
    }
    public static void main(String[] args) {
    	// 使用SwingUtilities工具类调用createAndShowGUI()方法执行并显示GUI程序
        SwingUtilities.invokeLater(Example02::createAndShowGUI);
    }
}

