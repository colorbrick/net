package net.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LottoUI extends JFrame implements ActionListener {
	
	
	Lotto lotto;
	JButton btn;
	JPanel pan_nth, pan_sth; // �г� �߿��� ����, ����
	ImageIcon icon;
	List<JButton>btns;
	
	public LottoUI() {
		init();  // ������ �Ҽ��� �Ϻη� ������, �޼ҵ�� ó���ؼ�
		// ����� ��ġ�� ������� ȣ��ν� ����� �����ϵ��� �ϴ� ��
		// �ڹٽ�ũ��Ʈ�� ȣ�̽�Ʈ ���� ����.
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(btns.size()==0){
			makeBtns();
		}
		lotto.setLotto();
		showLotto();
		
	}
	
	private void showLotto() {
	    int[] arr = lotto.getLotto();
	    for (int i = 0; i < arr.length; i++) {
			btns.get(i).setIcon(getIcon(arr[i]));
		}
	    
		
	}
	
	private Icon getIcon(int i){
		String imgPath = "src/images/" + Integer.toString(i)+".gif";
		return new ImageIcon(imgPath);
	}
	

	private void makeBtns() {
		JButton tmp = null;
		for(int i = 0 ; i <= 6 ; i++){
			tmp = new JButton();
			btns.add(tmp);
			pan_sth.add(tmp);
		}
		
	}

	private void init(){
		setTitle("�ζ� ������");
		lotto = new Lotto(); // ������ ����ϴ� Ŭ������ Lotto�� �����ڿ� �ٿ���.
		btns = new ArrayList<JButton>();
		
		pan_nth = new JPanel();
		pan_sth = new JPanel();
		btn = new JButton("�ζ� ����");
		/*
		 * this �� LottoUI�� �ؾ��ϴ�
		 * ActionListener �� �޼ҵ� ��
		 * actionPerformed(ActionEvent e) ��
		 * ��ư���� �ο��ϴ� ���̴�.
		 * */
		btn.addActionListener(this);
		pan_nth.add(btn);
		add(pan_nth, BorderLayout.NORTH);
		add(pan_sth, BorderLayout.SOUTH);
		setBounds(300,400,1200,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // ������â �ݱ� �̺�Ʈ
		setVisible(true);
		

		

/*
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //Toolkit ��ü ����
		Dimension dim = toolkit.getScreenSize(); // ȭ��ũ��
		
		
		
		JPanel panel = new JPanel();
		JPanel pan_nth = new JPanel();
		JPanel pan_sth = new JPanel();
		
		
		
		;
		JButton button1 = new JButton("??");
		JButton button2 = new JButton("??");
		JButton button3 = new JButton("??");
		JButton button4 = new JButton("??");
		JButton button5 = new JButton("??");
		JButton button6 = new JButton("??");
		
		btns.addActionListener(this);
		
		
		pan_nth.add(btns);
		pan_sth.add(button1);
		pan_sth.add(button2);
		pan_sth.add(button3);
		pan_sth.add(button4);
		pan_sth.add(button5);
		pan_sth.add(button6);
		
		add(panel);
		panel.add(pan_nth);
		panel.add(pan_sth);
		
		
		setLocation(dim.width/2, dim.height/2);
*/
		
		/*
		 * �����г�, �����г� �����ϼż� ������ ���̽ð�..
		 * ��ư���� �̺�Ʈ�� �Ҵ��ϴµ�
		 * btn.addActionListener(this);
		 * �����гο� ��ư�� ���̼���.
		 * �����гο� BorderLayout ����  ���ʿ� ��ġ�ϵ��� �Ͻð�,
		 * �����г��� ���ʿ� ��ġ�ϼ���.
		 * ������ ������� 1200, 300 �ȼ��̰�,
		 * x, y ��ǥ���� 300, 400 �Դϴ�.
		 * �������� ������� Ȯ��Ұ��� �ٲ� �� ���� �ϼ��� (���۸� �ʿ�)
		 * */
		
	}

}
