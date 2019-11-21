package DatabaseGui;

import javax.swing.*;
import java.util.List;

public class PlaceGUI extends JFrame {
    private JList list1;
    private JPanel panel1;
    private JTextField PlaceNameText;
    private JTextField eLevationText;
    private JList Placelist;
    private JButton addbutton;
    private JPanel mainPanel;
    private JButton deleteButton;

    private Controller controller;
    private DefaultListModel<Place> allPlacesListModel;

    public JList getList1() {
        return list1;
    }

    public void setList1(JList list1) {
        this.list1 = list1;
    }

    PlaceGUI(Controller controller) {
        this.controller = controller;
        allPlacesListModel = new DefaultListModel<>();
        Placelist.setModel(allPlacesListModel);
        addListeners();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
        setVisible(true);
    }


    private void addListeners() {

    }

    void selListData(List<Place> data) {
        allPlacesListModel.clear();
        if (data != null) {
            for (Place place : data) {
                allPlacesListModel.addElement(place);
            }
        }
    }
}