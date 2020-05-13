class Leaderboard {
    class Player{
        int playerId;
        int score;
        Player(int id, int score){
            this.playerId = id;
            this.score = score;
        }
    }
    List<Player> list;
    Map<Integer,Player> map;
    public Leaderboard() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }
    
    public void addScore(int playerId, int score) {
        if(!map.containsKey(playerId)){
            Player p = new Player(playerId,score);
            map.put(playerId, p);
            list.add(p);
        }else{
            map.get(playerId).score += score;
        }
        
    }
    
    public int top(int K) {
        
        int sum = 0;
        Collections.sort(list,(a,b)->b.score-a.score);
        /*System.out.println(K);
        for(Player p:list){
            System.out.println(p.playerId+" "+p.score);
        }*/
        for(int i=0; i<K; i++){
            sum += list.get(i).score;
        }
        return sum;
    }
    
    public void reset(int playerId) {
        map.get(playerId).score = 0;
    }
}

/**
 * Your Leaderboard object will be instantiated and called as such:
 * Leaderboard obj = new Leaderboard();
 * obj.addScore(playerId,score);
 * int param_2 = obj.top(K);
 * obj.reset(playerId);
 */