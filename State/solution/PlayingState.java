class PlayingState implements State {
    public void clickPlay(Player player){
        System.out.println("Pausando...");
        player.setState(new PausedState());
    }
}