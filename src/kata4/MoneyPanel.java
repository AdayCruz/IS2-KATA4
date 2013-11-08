package kata4;

import java.awt.LayoutManager;
import java.awt.TextField;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MoneyPanel extends JPanel{

    public MoneyPanel(LayoutManager layout, boolean isDoubleBuffered) {
        this.add(createTextField());
        this.add(new CurrencyPanel());
    }

    private JTextField createTextField() {
        JTextField textField = new JTextField (10);
        return textField;
    }
    
}
