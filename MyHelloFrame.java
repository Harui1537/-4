import javax.swing.*;
/**
 * 프래임을 만드는 클래스
 * 
 * @author (2017315013 이권효, 2018315023 야기시타 토시유키) 
 * @version (2020.11.23)
 */
public class MyHelloFrame extends JFrame
{
    public MyHelloFrame(){
        this.setTitle("실습#4(2020.11.23)");
        this.setSize(500,500);
        
        JPanel mp = new MyHelloPanelListener();
        this.add(mp);
        mp.setFocusable(true);
        mp.requestFocus();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

