import javax.swing.*;
import java.util.Random;
import java.awt.event.*;
import java.awt.*;
class Fram {
    JFrame tictacFram;
    JButton Board[]=new JButton[9],clearBoard,closeGame;
    JTextField playerNam,playerscor,pcscor;TextArea instructions;
    Font buttonFont = new Font("Arial", Font.PLAIN, 13);
    JLabel lblEnterFirstPlayerName, lblFirstPlayerScore, pcScore,instruction;
    static int roundComplete=0;
    static int width = 600;
    static int length = 400;
    static int firstPlayerScore = 0;
    static int secondPlayerScore = 0;
    private int WinningPosition[][] = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 0, 3, 6 },
            { 1, 4, 7 }, { 2, 5, 8 }, { 0, 4, 8 }, { 2, 4, 6 } };
    Random random=new Random();
    public void reset(){
        for (int i=0; i<9; i++) {
            Board[i].setText(String.valueOf(i+1));
            Board[i].setForeground(Color.BLACK);
            Board[i].setEnabled(true);
            tictacFram.add(Board[i]);
        }
    }
    public Fram(){
        tictacFram=new JFrame("Tic Tac ^ _ ^");
        for (int i=0;i<9;i++)
            Board[i]=new JButton();
        tictacFram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tictacFram.setLayout(null);
        reset();

        Board[0].setFont(buttonFont);
        Board[0].setAlignmentY(JButton.CENTER_ALIGNMENT);
        Board[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Board[0].setText("X");
                Board[0].setEnabled(false);
                Board[0].setForeground(Color.RED);
                if (checkEmpty())
                    pcTurn();
                announcement();
            }
        });
        Board[0].setBounds(10,10,100,50);


        Board[1].setFont(buttonFont);
        Board[1].setAlignmentY(JButton.CENTER_ALIGNMENT);
        Board[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Board[1].setText("X");
                Board[1].setForeground(Color.RED);
                Board[1].setEnabled(false);
                if (checkEmpty())
                    pcTurn();
                announcement();
            }
        });
        Board[1].setBounds(112,10,100,50);

        Board[2].setFont(buttonFont);
        Board[2].setAlignmentY(JButton.CENTER_ALIGNMENT);
        Board[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Board[2].setText("X");
                Board[2].setForeground(Color.RED);
                Board[2].setEnabled(false);
                if (checkEmpty())
                    pcTurn();
                announcement();
            }
        });

        Board[2].setBounds(214,10,100,50);

        Board[3].setFont(buttonFont);
        Board[3].setAlignmentY(JButton.CENTER_ALIGNMENT);
        Board[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Board[3].setText("X");
                Board[3].setForeground(Color.RED);
                Board[3].setEnabled(false);
                if (checkEmpty())
                    pcTurn();
                announcement();
            }
        });
        Board[3].setBounds(10,62,100,50);

        Board[4].setFont(buttonFont);
        Board[4].setAlignmentY(JButton.CENTER_ALIGNMENT);
        Board[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Board[4].setText("X");
                Board[4].setForeground(Color.RED);
                Board[4].setEnabled(false);
                if (checkEmpty())
                    pcTurn();
                announcement();
            }
        });
        Board[4].setBounds(112,62,100,50);

        Board[5].setFont(buttonFont);
        Board[5].setAlignmentY(JButton.CENTER_ALIGNMENT);
        Board[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Board[5].setText("X");
                Board[5].setForeground(Color.RED);
                Board[5].setEnabled(false);
                if (checkEmpty())
                    pcTurn();
                announcement();
            }
        });
        Board[5].setBounds(214,62,100,50);

        Board[6].setFont(buttonFont);
        Board[6].setAlignmentY(JButton.CENTER_ALIGNMENT);
        Board[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Board[6].setText("X");
                Board[6].setForeground(Color.RED);
                Board[6].setEnabled(false);
                if (checkEmpty())
                    pcTurn();
                announcement();
            }
        });
        Board[6].setBounds(10,114,100,50);

        Board[7].setFont(buttonFont);
        Board[7].setAlignmentY(JButton.CENTER_ALIGNMENT);
        Board[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Board[7].setText("X");
                Board[7].setForeground(Color.RED);
                Board[7].setEnabled(false);
                if (checkEmpty())
                    pcTurn();
                announcement();
            }
        });
        Board[7].setBounds(112,114,100,50);

        Board[8].setFont(buttonFont);
        Board[8].setAlignmentY(JButton.CENTER_ALIGNMENT);
        Board[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Board[8].setText("X");
                Board[8].setForeground(Color.RED);
                Board[8].setEnabled(false);
                if (checkEmpty())
                    pcTurn();
                announcement();
            }
        });
        Board[8].setBounds(214,114,100,50);
        lblEnterFirstPlayerName = new JLabel("Enter Player's Name");
        tictacFram.add(lblEnterFirstPlayerName);
        lblEnterFirstPlayerName.setBounds(330,7,200,30);
        playerNam=new JTextField("");
        playerNam.setBounds(330,40,200,30);
        tictacFram.add(playerNam);

        lblFirstPlayerScore = new JLabel(" Player Score ");
        tictacFram.add(lblFirstPlayerScore);
        lblFirstPlayerScore.setBounds(330,75,200,30);

        playerscor=new JTextField("");
        playerscor.setEditable(false);
        tictacFram.add(playerscor);
        playerscor.setBounds(330,110,200,30);
        pcScore = new JLabel(" PC Score ");
        tictacFram.add(pcScore);
        pcScore.setBounds(330,150,200,30);

        pcscor=new JTextField("");
        pcscor.setEditable(false);
        tictacFram.add(pcscor);
        pcscor.setBounds(330,180,200,30);

        clearBoard=new JButton("Clear Board");
        clearBoard.setFont(buttonFont);
        clearBoard.setAlignmentY(JButton.CENTER_ALIGNMENT);
        clearBoard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });
        tictacFram.add(clearBoard);
        clearBoard.setBounds(170,170,110,35);

        closeGame=new JButton("Close Game");
        closeGame.setFont(buttonFont);
        closeGame.setAlignmentY(JButton.CENTER_ALIGNMENT);
        closeGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        tictacFram.add(closeGame);
        closeGame.setBounds(50,170,110,35);

        instruction=new JLabel("Instructionsn : ");
        instruction.setBounds(10,200,100,30);
        tictacFram.add(instruction);

        instructions=new TextArea("1.The game is played on a grid \nthat's 3 squares by 3 squares.\n" +
                "2. You are X, your friend (or the computer\n in this case) is O. " +
                "\n3. Players take turns putting their marks in\n empty squares" +
                "The first player to get 3 of \nhis/her marks in a row " +
                "(up, down, across, or diagonally)\n is the winner.\n");
        instructions.setEditable(false);
        instructions.setBounds(10,230,300,100);
        tictacFram.add(instructions);
        tictacFram.setVisible(true);
        tictacFram.pack();
        tictacFram.setSize(width,length);
    }
    boolean checkEmpty(){
        int count =0;
        for (int i=0;i<9;i++){
            if (Board[i].isEnabled()==false)
                count++;
        }
        if (count==9)
            return false;
        return true;
    }
    public int convertion(String a){
        int b=Integer.parseInt(a);
        return b;
    }
    public void pcTurn(){
        int move;
        do {
            move=random.nextInt(9);
        }while (Board[move].isEnabled()==false);
        int first,second,third;
        for (int i=0;i<8;i++){
            first=WinningPosition[i][0];second=WinningPosition[i][1];third=WinningPosition[i][2];
            if ((Board[first].isEnabled()==false)&&(Board[first].getText()==Board[second].getText())&&(Board[third].isEnabled()!=false)){
                move=third;
                if (Board[first].getText().equals("O")){
                    Board[move].setText("O");
                    break;
                }
            }
            if ((Board[second].isEnabled()==false)&&(Board[third].getText()==Board[second].getText())&&(Board[first].isEnabled()!=false)){
                move=first;
                if (Board[first].getText().equals("O")){
                    Board[move].setText("O");
                    break;
                }
            }
            if ((Board[first].isEnabled()==false)&&(Board[first].getText()==Board[third].getText())&&(Board[second].isEnabled()!=false)){
                move=second;
                if (Board[first].getText().equals("O")){
                    Board[move].setText("O");
                    break;
                }
            }
        }
        if (move==0){
            Board[0].setForeground(Color.BLACK);
            Board[0].setText("O");
            Board[0].setEnabled(false);
        }
        if (move==1){
            Board[1].setForeground(Color.BLACK);
            Board[1].setText("O");
            Board[1].setEnabled(false);
        }
        if (move==2){
            Board[2].setForeground(Color.BLACK);
            Board[2].setText("O");
            Board[2].setEnabled(false);
        }
        if (move==3){
            Board[3].setForeground(Color.BLACK);
            Board[3].setText("O");
            Board[3].setEnabled(false);
        }
        if (move==4){
            Board[4].setForeground(Color.BLACK);
            Board[4].setText("O");
            Board[4].setEnabled(false);
        }
        if (move==5){
            Board[5].setForeground(Color.BLACK);
            Board[5].setText("O");
            Board[5].setEnabled(false);
        }
        if (move==6){
            Board[6].setForeground(Color.BLACK);
            Board[6].setText("O");
            Board[6].setEnabled(false);
        }
        if (move==7){
            Board[7].setForeground(Color.BLACK);
            Board[7].setText("O");
            Board[7].setEnabled(false);
        }
        if (move==8){
            Board[8].setForeground(Color.BLACK);
            Board[8].setText("O");
            Board[8].setEnabled(false);
        }
    }
    void announcement(){
        String fromWinner=checkWinner();
        if (fromWinner!=" "){
            if (fromWinner == "X") {
                firstPlayerScore+=1;
                playerscor.setText(String.valueOf(firstPlayerScore));
                JOptionPane.showMessageDialog(null,
                        "You Won the Game...");
            } else if (fromWinner == "O") {
                secondPlayerScore+=1;
                pcscor.setText(String.valueOf(secondPlayerScore));
                JOptionPane.showMessageDialog(null,
                        "i Won the Game bcx i'm Pc...");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Draw the Game-U play very well...",
                        "Inane error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public String checkWinner(){
        for (int i=0;i<8;i++){
            if ((Board[WinningPosition[i][0]].getText().equals("X")||Board[WinningPosition[i][0]].getText().equals("O"))&&(
                    (Board[WinningPosition[i][0]].getText()==Board[WinningPosition[i][1]].getText())&&
                    (Board[WinningPosition[i][0]].getText()==Board[WinningPosition[i][2]].getText()))){
                return Board[WinningPosition[i][0]].getText();
            }
        }
        int count=0;
        for (int i=0;i<9;i++){
            if (Board[i].getText().equals("X")||Board[i].getText().equals("O"))count++;
        }
        if (count==9)return "D";

        return " ";
    }
}
public class Main {
    public static void main(String[] args) {
        Fram obj= new Fram();
    }
}