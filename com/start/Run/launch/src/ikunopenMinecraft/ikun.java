package ikunopenMinecraft;

import javax.swing.*;
import java.awt.event.*;

public class

ikun extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField a2589TextField;
    private JButton 用户名Button;
    private JTextField toprTextField;
    private JButton 后台运行Button;
    private JButton 密码Button;
    private JTree tree1;
    private JScrollBar scrollBar1;
    private JCheckBox 停用服务CheckBox;
    private JFormattedTextField a125698045FormattedTextField;
    private JCheckBox masterBOXCheckBox;
    private JTextField a5428TextField;

    public static void uf(String[] args){
        System.out.println("master接容Start  已对接Big Bear Co., Ltd服务器,编号:125.698.0.45:5428");
    }
    public ikun() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // 点击 X 时调用 onCancel()
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // 遇到 ESCAPE 时调用 onCancel()
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // 在此处添加您的代码
        dispose();
    }

    private void onCancel() {
        // 必要时在此处添加您的代码
        dispose();
    }

    public static void main(String[] args) {
        ikun dialog = new ikun();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    //TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
    // 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
    public static class Main {
        public static void main(String[] args) {
            //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
            // 查看 IntelliJ IDEA 建议如何修正。
            System.out.printf("Hello and welcome!");

            for (int i = 1; i <= 5; i++) {
                //TIP 按 <shortcut actionId="Debug"/> 开始调试代码。我们已经设置了一个 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 断点
                // 但您始终可以通过按 <shortcut actionId="ToggleLineBreakpoint"/> 添加更多断点。
                System.out.println("i = " + i);
            }
        }
        public static void uio(String[] args){
            for(int i = 0;i <= 18;i++){
                System.out.println(i);
            }
        }
    }
}
