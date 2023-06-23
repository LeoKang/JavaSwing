package jtable.test;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("JTable...");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String[] columnNames = { "이름", "나이", "국가" };
		Object[][] data = { { "홍길동", 25, "한국" }, { "왕서방", 30, "중국" }, { "나까무라", 28, "일본" } };

		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		JTable table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);

		frame.add(scrollPane);
		frame.pack();
		frame.setVisible(true);
	}

}
