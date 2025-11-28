class Player {
    private State state = new StoppedState();
    public void setState(State s){ this.state = s; }
    public void clickPlay(){ state.clickPlay(this); }
}