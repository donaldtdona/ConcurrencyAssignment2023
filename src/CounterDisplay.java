//package clubSimulation;

import java.awt.Color;

import javax.swing.JLabel;

// Simple Thread class to update the display of a PeopleCounter object

public class CounterDisplay  implements Runnable {
	
	private PeopleCounter score;
	JLabel waiting;
	JLabel inside;
	JLabel left;
	int noClubgoers;
		
	CounterDisplay(JLabel w, JLabel i, JLabel l, PeopleCounter score,int noClubgoers) {
        this.waiting=w;
        this.inside = i;
        this.left = l;
        this.score=score;
		this.noClubgoers = noClubgoers;
    }
	
	public void run() { //this thread just updates the display of the counters
        while (true) {
        	//test changes colour when at limit and over limit of people inside
        	if (score.getMax()<score.getInside()) {
        		inside.setForeground(Color.RED);
        	}
        	else if (score.getMax()==score.getInside()) {
        		inside.setForeground(Color.ORANGE);
        	}
        	else inside.setForeground(Color.BLACK);
        	inside.setText("Inside: " + score.getInside() + "    "); 
            waiting.setText("Waiting:" +  (noClubgoers-score.getInside()-score.getLeft())+ "    " );
            left.setText("Left:" + score.getLeft()+ "    " ); 
        }
    }
}
