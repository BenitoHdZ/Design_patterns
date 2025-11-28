class StoppedState implements State {
    public void clickPlay(Player player){
        System.out.println("Reproduciendo...");
        player.setState(new PlayingState());
    }
}