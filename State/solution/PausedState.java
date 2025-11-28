class PausedState implements State {
    public void clickPlay(Player player){
        System.out.println("Reanudando...");
        player.setState(new PlayingState());
    }
}