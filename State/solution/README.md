
### `solution/README.md`
```md
# Solución - State

## Código
```java
interface State {
    void clickPlay(Player player);
}

class PlayingState implements State {
    public void clickPlay(Player player){
        System.out.println("Pausando...");
        player.setState(new PausedState());
    }
}

class PausedState implements State {
    public void clickPlay(Player player){
        System.out.println("Reanudando...");
        player.setState(new PlayingState());
    }
}

class StoppedState implements State {
    public void clickPlay(Player player){
        System.out.println("Reproduciendo...");
        player.setState(new PlayingState());
    }
}

class Player {
    private State state = new StoppedState();
    public void setState(State s){ this.state = s; }
    public void clickPlay(){ state.clickPlay(this); }
}

public class Main {
    public static void main(String[] args){
        Player p = new Player();
        p.clickPlay();
        p.clickPlay();
        p.clickPlay();
    }
}

Salida esperada:
Reproduciendo...
Pausando...
Reanudando...
