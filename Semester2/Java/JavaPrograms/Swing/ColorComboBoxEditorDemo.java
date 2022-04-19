package Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.event.EventListenerList;

class ColorComboBoxEditor implements ComboBoxEditor {
  final protected JButton editor;

  protected EventListenerList listenerList = new EventListenerList();

  public ColorComboBoxEditor(Color initialColor) {
    editor = new JButton("");
    editor.setBackground(initialColor);
    ActionListener actionListener = new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color currentBackground = editor.getBackground();
        Color color = JColorChooser.showDialog(editor, "Color Chooser", currentBackground);
        if ((color != null) && (currentBackground != color)) {
          editor.setBackground(color);
          fireActionEvent(color);
        }
      }
    };
    editor.addActionListener(actionListener);
  }

  public void addActionListener(ActionListener l) {
    listenerList.add(ActionListener.class, l);
  }

  public Component getEditorComponent() {
    return editor;
  }

  public Object getItem() {
    return editor.getBackground();
  }

  public void removeActionListener(ActionListener l) {
    listenerList.remove(ActionListener.class, l);
  }

  public void selectAll() {
    // Ignore
  }

  public void setItem(Object newValue) {
    if (newValue instanceof Color) {
      Color color = (Color) newValue;
      editor.setBackground(color);
    } else {
      try {
        Color color = Color.decode(newValue.toString());
        editor.setBackground(color);
      } catch (NumberFormatException e) {
      }
    }
  }

  protected void fireActionEvent(Color color) {
    Object listeners[] = listenerList.getListenerList();
    for (int i = listeners.length - 2; i >= 0; i -= 2) {
      if (listeners[i] == ActionListener.class) {
        ActionEvent actionEvent = new ActionEvent(editor, ActionEvent.ACTION_PERFORMED, color
            .toString());
        ((ActionListener) listeners[i + 1]).actionPerformed(actionEvent);
      }
    }
  }
}

public class ColorComboBoxEditorDemo {
  public static void main(String args[]) {
    Color colors[] = { Color.RED, Color.BLUE, Color.BLACK, Color.WHITE };
    JFrame frame = new JFrame("Editable JComboBox");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    final JComboBox comboBox = new JComboBox(colors);
    comboBox.setEditable(true);
    comboBox.setEditor(new ColorComboBoxEditor(Color.RED));
    frame.add(comboBox, BorderLayout.NORTH);

    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}

