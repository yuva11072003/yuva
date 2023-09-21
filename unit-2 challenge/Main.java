class CricketPlayers
{
    public static void main(String arg[])
    {
        Player players[] = new Player[11];
        
        players[0] = new Batsmen("Sachin", 250, 11324, 100, 125);
        players[1] = new WicketKeeper("Dhoni", 153, 6021, 120, 67);
        players[2] = new Batsmen("Shewag", 110, 4341, 22, 40);
        players[3] = new Batsmen("Yuvraj", 105, 6533, 15, 46);
        players[4] = new Batsmen("Kohli", 75, 4003, 25, 60);
        players[5] = new Batsmen("Raina", 34, 2600, 12, 19);
        players[6] = new Batsmen("Rohit", 25, 1500, 5, 9);
        players[7] = new Bowler("Harbhajan", 189, 1500, 320, 4);
        players[8] = new Bowler("Zaheer", 150, 900, 220, 4);
        players[9] = new Bowler("Umesh", 25, 150, 105, 2);
        players[10] = new Bowler("Aswin", 15, 200, 60, 2);
        
        for(Player player : players)
        {
            player.print();
            System.out.println();
            System.out.println("---------------------");