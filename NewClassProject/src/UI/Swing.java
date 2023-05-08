package src.UI;

import javax.swing.*;
import java.awt.*;

public class Swing extends JFrame {
    public void MembershipForm() {
        // Create the frame
        setTitle("Membership Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Create the panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        // Create the buttons
        JButton newMembershipBtn = new JButton("New Membership");
        JButton newCollectionBtn = new JButton("New Collection");
        JButton removeMembershipBtn = new JButton("Remove Membership");
        JButton removeItemBtn = new JButton("Remove Item From Collection");

        // Add the buttons to the panel
        panel.add(newMembershipBtn);
        panel.add(newCollectionBtn);
        panel.add(removeMembershipBtn);
        panel.add(removeItemBtn);

        // Add the panel to the frame
        add(panel);

        // Display the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        MembershipForm form = new MembershipForm();
    }
}

