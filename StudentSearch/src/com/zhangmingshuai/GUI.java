/*
 * GUI.java
 *
 * Created on __DATE__, __TIME__
 */

package com.zhangmingshuai;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  __USER__
 */
public class GUI extends javax.swing.JFrame {

	/** Creates new form GUI */
	public GUI() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jScrollPane2 = new javax.swing.JScrollPane();
		statement = new javax.swing.JTextArea();
		number = new javax.swing.JTextField();
		numberCheck = new javax.swing.JCheckBox();
		nameCheck = new javax.swing.JCheckBox();
		name = new javax.swing.JTextField();
		ageCheck = new javax.swing.JCheckBox();
		age_begin = new javax.swing.JTextField();
		sexCheck = new javax.swing.JCheckBox();
		sex = new javax.swing.JTextField();
		departmentCheck = new javax.swing.JCheckBox();
		department = new javax.swing.JTextField();
		clasCheck = new javax.swing.JCheckBox();
		clas = new javax.swing.JTextField();
		addressCheck = new javax.swing.JCheckBox();
		address = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		age_end = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("StudentInfo Search designed by ZhangMingshuai");

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "Sid", "Sname", "Sage", "Ssex", "Sclass",
						"Sdept", "Saddr" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false,
					false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(jTable1);

		statement.setColumns(20);
		statement.setLineWrap(true);
		statement.setRows(3);
		statement.setWrapStyleWord(true);
		jScrollPane2.setViewportView(statement);

		numberCheck.setText("\u5b66\u53f7");

		nameCheck.setText("\u59d3\u540d");

		ageCheck.setText("\u5e74\u9f84");

		sexCheck.setText("\u6027\u522b");

		departmentCheck.setText("\u7cfb\u522b");

		clasCheck.setText("\u73ed\u7ea7");

		addressCheck.setText("\u5730\u5740");

		jLabel1.setText("\u5230");

		jButton1.setFont(new java.awt.Font("楷体", 0, 36));
		jButton1.setText("\u67e5\u8be2");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel2.setText("\u5bf9\u5e94SQL\u8bed\u53e5\uff1a");

		jLabel3.setText("\u67e5\u8be2\u7ed3\u679c\uff1a");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																621,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																621,
																Short.MAX_VALUE)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				numberCheck)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				number,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				190,
																																				Short.MAX_VALUE))
																														.addGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																layout
																																		.createSequentialGroup()
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				nameCheck)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				name,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				190,
																																				Short.MAX_VALUE))
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				ageCheck)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				age_begin,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				74,
																																				Short.MAX_VALUE)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jLabel1,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				25,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				age_end,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				81,
																																				Short.MAX_VALUE)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																										.addGap(
																												37,
																												37,
																												37))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel2,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												131,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												sexCheck,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												54,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED))
																						.addComponent(
																								clasCheck)
																						.addComponent(
																								departmentCheck)
																						.addComponent(
																								addressCheck))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								address,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								140,
																								Short.MAX_VALUE)
																						.addComponent(
																								department,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								140,
																								Short.MAX_VALUE)
																						.addComponent(
																								sex,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								140,
																								Short.MAX_VALUE)
																						.addComponent(
																								clas,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								140,
																								Short.MAX_VALUE))
																		.addGap(
																				34,
																				34,
																				34)
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				111,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																jLabel3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																131,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				103,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				30,
																				30,
																				30))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGap(
																												4,
																												4,
																												4)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																numberCheck)
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addGap(
																																				2,
																																				2,
																																				2)
																																		.addComponent(
																																				number,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				24,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																nameCheck)
																														.addComponent(
																																name,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																23,
																																javax.swing.GroupLayout.PREFERRED_SIZE))
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.BASELINE)
																																						.addComponent(
																																								age_begin,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								ageCheck)))
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.BASELINE)
																																						.addComponent(
																																								age_end,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								jLabel1,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								18,
																																								javax.swing.GroupLayout.PREFERRED_SIZE))))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												jLabel2))
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																sex,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																sexCheck))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																clas,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																clasCheck))
																										.addGap(
																												8,
																												8,
																												8)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																department,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																22,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																departmentCheck))
																										.addGap(
																												7,
																												7,
																												7)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(
																																address,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																addressCheck))))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jScrollPane2,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				75,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel3)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												134, Short.MAX_VALUE)
										.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
		tModel.setRowCount(0);
		statement.setText(""); //initialize each area
		StudentBean st = new StudentBean();
		if (nameCheck.isSelected()) {
			st.setName(name.getText());
			st.setNameCheck(true);
		}
		if (sexCheck.isSelected()) {
			st.setSex(sex.getText());
			st.setSexCheck(true);
		}
		if (numberCheck.isSelected()) {
			st.setNumber(number.getText());
			st.setNumberCheck(true);
		}
		if (ageCheck.isSelected()) {
			st.setAge_begin(age_begin.getText());
			st.setAge_end(age_end.getText());
			st.setAgeCheck(true);
		}
		if (clasCheck.isSelected()) {
			st.setClassString(clas.getText());
			st.setClassCheck(true);
		}
		if (departmentCheck.isSelected()) {
			st.setDepartment(department.getText());
			st.setDeptCheck(true);
		}
		if (addressCheck.isSelected()) {
			st.setAddrCheck(true);
			st.setAddress(address.getText());
		}
		Search mySearch = new Search(tModel, st);
		statement.setText(mySearch.getResult());
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GUI().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JTextField address;
	private javax.swing.JCheckBox addressCheck;
	private javax.swing.JCheckBox ageCheck;
	private javax.swing.JTextField age_begin;
	private javax.swing.JTextField age_end;
	private javax.swing.JTextField clas;
	private javax.swing.JCheckBox clasCheck;
	private javax.swing.JTextField department;
	private javax.swing.JCheckBox departmentCheck;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField name;
	private javax.swing.JCheckBox nameCheck;
	private javax.swing.JTextField number;
	private javax.swing.JCheckBox numberCheck;
	private javax.swing.JTextField sex;
	private javax.swing.JCheckBox sexCheck;
	private javax.swing.JTextArea statement;
	// End of variables declaration//GEN-END:variables

}