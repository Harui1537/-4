import javax.swing.*;
/**
 * 여기에 MyHelloFrame 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyHelloFrame extends JFrame
{
    public MyHelloFrame(){
        this.setTitle("실습#4(2020.11.23)");
        this.setSize(500,500);
        
        JPanel mp = new MyHelloPanelListener();
        this.add(mp);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
