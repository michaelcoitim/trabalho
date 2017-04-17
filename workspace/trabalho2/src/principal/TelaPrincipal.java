package principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JSplitPane;
import java.awt.GridBagConstraints;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JDesktopPane;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JToggleButton;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	public JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setForeground(Color.WHITE);
		GridBagConstraints gbc_splitPane = new GridBagConstraints();
		gbc_splitPane.insets = new Insets(0, 0, 5, 0);
		gbc_splitPane.gridheight = 4;
		gbc_splitPane.fill = GridBagConstraints.BOTH;
		gbc_splitPane.gridx = 0;
		gbc_splitPane.gridy = 0;
		contentPane.add(splitPane, gbc_splitPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		splitPane.setRightComponent(tabbedPane);
		
		JPanel abaconeção = new JPanel();
		tabbedPane.addTab("conec\u00E7\u00E3o", null, abaconeção, null);
		GridBagLayout gbl_abaconeção = new GridBagLayout();
		gbl_abaconeção.columnWidths = new int[]{20, 195, 24, 0, 0, 0};
		gbl_abaconeção.rowHeights = new int[]{20, 0, 0, 0, 0};
		gbl_abaconeção.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_abaconeção.rowWeights = new double[]{1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		abaconeção.setLayout(gbl_abaconeção);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Funcionamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 5;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		abaconeção.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JRadioButton radioButton = new JRadioButton("Servidor e Cliente");
		radioButton.setSelected(true);
		GridBagConstraints gbc_radioButton = new GridBagConstraints();
		gbc_radioButton.insets = new Insets(0, 0, 0, 5);
		gbc_radioButton.gridx = 0;
		gbc_radioButton.gridy = 0;
		panel.add(radioButton, gbc_radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Apenas Cliente");
		GridBagConstraints gbc_radioButton_1 = new GridBagConstraints();
		gbc_radioButton_1.anchor = GridBagConstraints.WEST;
		gbc_radioButton_1.gridx = 1;
		gbc_radioButton_1.gridy = 0;
		panel.add(radioButton_1, gbc_radioButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Par\u00E2metros", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 5;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		abaconeção.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel label = new JLabel("Nome");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		panel_1.add(label, gbc_label);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridwidth = 3;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 0;
		panel_1.add(textField_2, gbc_textField_2);
		
		JLabel lblEndereo = new JLabel("endere\u00E7o");
		GridBagConstraints gbc_lblEndereo = new GridBagConstraints();
		gbc_lblEndereo.anchor = GridBagConstraints.EAST;
		gbc_lblEndereo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndereo.gridx = 0;
		gbc_lblEndereo.gridy = 1;
		panel_1.add(lblEndereo, gbc_lblEndereo);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 1;
		panel_1.add(textField_3, gbc_textField_3);
		
		JLabel label_2 = new JLabel("Porta");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 2;
		gbc_label_2.gridy = 1;
		panel_1.add(label_2, gbc_label_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.gridx = 3;
		gbc_textField_4.gridy = 1;
		panel_1.add(textField_4, gbc_textField_4);
		
		JLabel label_3 = new JLabel("Pasta");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.EAST;
		gbc_label_3.insets = new Insets(0, 0, 0, 5);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 2;
		panel_1.add(label_3, gbc_label_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridwidth = 3;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 2;
		panel_1.add(textField_5, gbc_textField_5);
		
		JButton btnNewButton_2 = new JButton("conectar");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 2;
		abaconeção.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JPanel ababusca = new JPanel();
		tabbedPane.addTab("busca", null, ababusca, null);
		GridBagLayout gbl_ababusca = new GridBagLayout();
		gbl_ababusca.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_ababusca.rowHeights = new int[]{0, 0, 0, 0};
		gbl_ababusca.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_ababusca.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		ababusca.setLayout(gbl_ababusca);
		
		JLabel lblNomeDoArquivo = new JLabel("nome do arquivo");
		GridBagConstraints gbc_lblNomeDoArquivo = new GridBagConstraints();
		gbc_lblNomeDoArquivo.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDoArquivo.anchor = GridBagConstraints.EAST;
		gbc_lblNomeDoArquivo.gridx = 0;
		gbc_lblNomeDoArquivo.gridy = 0;
		ababusca.add(lblNomeDoArquivo, gbc_lblNomeDoArquivo);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		ababusca.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 0;
		ababusca.add(btnNewButton, gbc_btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("nome");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 0;
		gbc_chckbxNewCheckBox.gridy = 1;
		ababusca.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Tamanho Min");
		GridBagConstraints gbc_chckbxNewCheckBox_1 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_1.gridx = 2;
		gbc_chckbxNewCheckBox_1.gridy = 1;
		ababusca.add(chckbxNewCheckBox_1, gbc_chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Tamnah Max");
		GridBagConstraints gbc_chckbxNewCheckBox_2 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_2.gridx = 3;
		gbc_chckbxNewCheckBox_2.gridy = 1;
		ababusca.add(chckbxNewCheckBox_2, gbc_chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Exten\u00E7\u00E3o");
		GridBagConstraints gbc_chckbxNewCheckBox_3 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_3.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_3.gridx = 4;
		gbc_chckbxNewCheckBox_3.gridy = 1;
		ababusca.add(chckbxNewCheckBox_3, gbc_chckbxNewCheckBox_3);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		ababusca.add(scrollPane, gbc_scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnNewButton_1 = new JButton("organizar");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1.gridx = 4;
		gbc_btnNewButton_1.gridy = 2;
		ababusca.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JPanel abatransferência = new JPanel();
		abatransferência.setToolTipText("");
		tabbedPane.addTab("transferencia", null, abatransferência, null);
		GridBagLayout gbl_abatransferência = new GridBagLayout();
		gbl_abatransferência.columnWidths = new int[]{0, 0, 0, 0};
		gbl_abatransferência.rowHeights = new int[]{0, 0};
		gbl_abatransferência.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_abatransferência.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		abatransferência.setLayout(gbl_abatransferência);
		
		JLabel lblArquivo = new JLabel("arquivo");
		GridBagConstraints gbc_lblArquivo = new GridBagConstraints();
		gbc_lblArquivo.insets = new Insets(0, 0, 0, 5);
		gbc_lblArquivo.anchor = GridBagConstraints.EAST;
		gbc_lblArquivo.gridx = 0;
		gbc_lblArquivo.gridy = 0;
		abatransferência.add(lblArquivo, gbc_lblArquivo);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 0, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 0;
		abatransferência.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JButton btnCaregar = new JButton("caregar");
		GridBagConstraints gbc_btnCaregar = new GridBagConstraints();
		gbc_btnCaregar.gridx = 2;
		gbc_btnCaregar.gridy = 0;
		abatransferência.add(btnCaregar, gbc_btnCaregar);
		
		JTextArea txtrStatus = new JTextArea();
		txtrStatus.setSize(new Dimension(50, 50));
		splitPane.setLeftComponent(txtrStatus);
		splitPane.setDividerLocation(150);
	}
}
