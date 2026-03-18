package Projekty.GUI.Wyklady.W11.ex03;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public
    class MyColorRenderer
    extends JPanel
    implements TableCellRenderer {

    private JPanel colorPreview;

    public MyColorRenderer() {
        this.colorPreview = new JPanel();
        this.colorPreview.setPreferredSize(
            new Dimension( 30, 30)
        );

        this.colorPreview.setBackground(Color.RED);

        this.add(this.colorPreview);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        this.colorPreview.setBackground((Color) value);
        return this;
    }
}
