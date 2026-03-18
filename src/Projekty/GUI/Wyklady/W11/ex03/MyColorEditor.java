package Projekty.GUI.Wyklady.W11.ex03;

import javax.swing.*;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.ArrayList;
import java.util.EventObject;

public
    class MyColorEditor
    extends JPanel
    implements TableCellEditor {

    private JLabel lRed;
    private JLabel lGre;
    private JLabel lBlu;

    private JSlider sRed;
    private JSlider sGre;
    private JSlider sBlu;

    private JPanel preview;

    public MyColorEditor() {
        lRed = new JLabel("Red:");
        lGre = new JLabel("Green:");
        lBlu = new JLabel("Blue:");

        sRed = new JSlider( 0, 255);
        sGre = new JSlider( 0, 255);
        sBlu = new JSlider( 0, 255);

        preview = new JPanel();

        this.setLayout(new GridLayout( 4, 2));

        this.add(lRed);
        this.add(sRed);
        this.add(lGre);
        this.add(sGre);
        this.add(lBlu);
        this.add(sBlu);

        this.add(preview);

        sRed.addChangeListener(MyColorEditor.this::setPreview);
        sGre.addChangeListener(MyColorEditor.this::setPreview);
        sBlu.addChangeListener(MyColorEditor.this::setPreview);

        this.addKeyListener(
            new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    fireStopCellEditing();
                }
            }
        );
    }

    private void setPreview(ChangeEvent e){
        this.preview.setBackground(
            new Color(sRed.getValue(), sGre.getValue(), sBlu.getValue())
        );
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        Color color = (Color) value;
        sRed.setValue(color.getRed());
        sGre.setValue(color.getGreen());
        sBlu.setValue(color.getBlue());
        return this;
    }

    @Override
    public Object getCellEditorValue() {
        return this.preview.getBackground();
    }

    @Override
    public boolean isCellEditable(EventObject anEvent) {
        return true;
    }

    @Override
    public boolean shouldSelectCell(EventObject anEvent) {
        return false;
    }

    @Override
    public boolean stopCellEditing() {
        return false;
    }

    @Override
    public void cancelCellEditing() {
        System.out.println("canceled");
    }

    private List<CellEditorListener> listeners = new ArrayList<>();

    @Override
    public void addCellEditorListener(CellEditorListener l) {
        listeners.add(l);
    }

    @Override
    public void removeCellEditorListener(CellEditorListener l) {
        listeners.remove(l);
    }

    protected void fireStopCellEditing(){
        List<CellEditorListener> tmpListeners = new ArrayList<>(listeners);
        for(CellEditorListener l : tmpListeners)
            l.editingStopped(new ChangeEvent(this));
    }
}
