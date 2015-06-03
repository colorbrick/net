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
	JPanel pan_nth, pan_sth; // 패널 중에서 북쪽, 남쪽
	ImageIcon icon;
	List<JButton>btns;
	
	public LottoUI() {
		init();  // 복잡한 소수를 하부로 보내고, 메소드로 처리해서
		// 선언된 위치에 관계없이 호출로써 기능을 수행하도록 하는 것
		// 자바스크립트의 호이스트 같은 개념.
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
		setTitle("로또 생성기");
		lotto = new Lotto(); // 로직을 담당하는 클래스인 Lotto를 생성자에 붙였다.
		btns = new ArrayList<JButton>();
		
		pan_nth = new JPanel();
		pan_sth = new JPanel();
		btn = new JButton("로또 생성");
		/*
		 * this 는 LottoUI가 해야하는
		 * ActionListener 의 메소드 중
		 * actionPerformed(ActionEvent e) 를
		 * 버튼에서 부여하는 것이다.
		 * */
		btn.addActionListener(this);
		pan_nth.add(btn);
		add(pan_nth, BorderLayout.NORTH);
		add(pan_sth, BorderLayout.SOUTH);
		setBounds(300,400,1200,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 윈도우창 닫기 이벤트
		setVisible(true);
		

		

/*
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //Toolkit 객체 생성
		Dimension dim = toolkit.getScreenSize(); // 화면크기
		
		
		
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
		 * 북쪽패널, 남쪽패널 생성하셔서 프레임 붙이시고..
		 * 버튼에는 이벤트를 할당하는데
		 * btn.addActionListener(this);
		 * 북쪽패널에 버튼을 붙이세요.
		 * 북쪽패널에 BorderLayout 에서  북쪽에 배치하도록 하시고,
		 * 남쪽패널은 남쪽에 배치하세요.
		 * 프레임 사이즈는 1200, 300 픽셀이고,
		 * x, y 좌표값은 300, 400 입니다.
		 * 프레임의 사이즈는 확장불가로 바꿀 수 없게 하세요 (구글링 필요)
		 * */
		
	}

}
