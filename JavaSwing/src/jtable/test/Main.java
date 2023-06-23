package jtable.test;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Main implements MouseListener {
	private JFrame frame;
	private JTable table;

	public Main() {
		frame = new JFrame("JTable...");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String[] columnNames = { "이름", "나이", "국가" };
		Object[][] data = { { "홍길동", 25, "한국" }, { "왕서방", 30, "중국" }, { "나까무라", 28, "일본" } };

		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		table = new JTable(model);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.addMouseListener(this);

		JScrollPane scrollPane = new JScrollPane(table);

		frame.add(scrollPane);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(table.getSelectedRow() + ":" + table.getSelectedColumn());
		System.out.println(table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()));

		Object[] addo = new Object[3];
		for (int i = 0; i < addo.length; i++) {
			addo[i] = table.getValueAt(table.getSelectedRow(), i);
		}
		((DefaultTableModel) table.getModel()).addRow(addo);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
