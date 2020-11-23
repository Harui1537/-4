import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * 마우스와 키보드를 이용하여 좌표를 나타내는 클래스
 * 
 * @author (2017315013 이권효, 2018315023 야기시타 토시유키) 
 * @version (2020.11.23)
 */
class MyHelloPanelListener extends JPanel implements MouseListener, KeyListener
{
    JLabel la;
    public MyHelloPanelListener(){
        la = new JLabel("HELLO");
        this.setLayout(null);
        la.setLocation(50, 50);
        la.setSize(100, 20);
        this.add(la);
        this.addMouseListener(this);
        this.addKeyListener(this);
    }
    public void keyPressed(KeyEvent e){
        int keyCode = e.getKeyCode();
        
        switch(keyCode){
            case KeyEvent.VK_UP:
                la.setLocation(la.getX(), la.getY() - 10);
                la.setText("(" + la.getX() + "," + la.getY() + ")");
                break;
            case KeyEvent.VK_DOWN:
                la.setLocation(la.getX(), la.getY() + 10);
                la.setText("(" + la.getX() + "," + la.getY() + ")");
                break;
            case KeyEvent.VK_LEFT:
                la.setLocation(la.getX() - 10, la.getY());
                la.setText("(" + la.getX() + "," + la.getY() + ")");
                break;
            case KeyEvent.VK_RIGHT:
                la.setLocation(la.getX() + 10, la.getY());
                la.setText("(" + la.getX() + "," + la.getY() + ")");
                break;
        }
    }
    public void keyReleased(KeyEvent e){
    }
    public void keyTyped(KeyEvent e){
    }
    
    public void mouseClicked(MouseEvent e){
        la.setLocation(e.getX(), e.getY());
        la.setText("(" + e.getX() + "," + e.getY() + ")");
    }
    public void mouseEntered(MouseEvent e){
        la.setText("START");
        this.setBackground(Color.YELLOW);
    }
    public void mouseExited(MouseEvent e){
        la.setText("END");
        this.setBackground(Color.GRAY);
    }
    public void mousePressed(MouseEvent e){
    }
    public void mouseReleased(MouseEvent e){
    }
}
