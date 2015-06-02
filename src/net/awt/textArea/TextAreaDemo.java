package net.awt.textArea;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.Toolkit;

public class TextAreaDemo {
	public static void main(String[] args) {
		/*
		 * [1] 컴포넌트의 생성
		 * */
		Frame frame = new Frame("메모장");
		frame.setSize(500,300);
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 
		// toolkit 객체 생성.. new 가 아닌 메소드 리턴방식으로 객체를 생성시킴
		Dimension dim = toolkit.getScreenSize(); // 화면크기
		
		TextArea area = new TextArea("글자입력란..", 5, 50);
		area.selectAll(); // 입력한 글자 전체 선택
		/*
		 * [2] 컴포넌트 결합
		 * */
		frame.setLayout(new FlowLayout());
		frame.add(area);
		
		
		
		/*
		 * [3] 컴포넌트의 구체화
		 * */
		frame.setLocation(dim.width/6, dim.height/10);
		// 전체화면에서 절반, 절반의 위치에 두겠다.
		// 특정 사이즈를 정하는 것보다 위에처럼 dim을 사용하면
		// 보여지는 화면에 따라 동적으로 무조건 화면이 크든 작든
		// 중앙 부근에 위치하게 됨.
		frame.setVisible(true);
	}
}
