package view;

import javax.swing.*;

public class CreateTextField {
	JTextField idText;
	JPanel idPan;

	public void create() {
		idText = new JTextField();
		idPan = new JPanel();
		idPan.add(idText);
	}
}
