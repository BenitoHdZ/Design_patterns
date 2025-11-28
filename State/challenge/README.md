# Challenge - State

## Código
```java
class Player {
    String state = "stopped";
    void clickPlay(){
        if(state.equals("stopped")) { state = "playing"; System.out.println("Reproduciendo..."); }
        else if(state.equals("playing")) { state = "paused"; System.out.println("Pausado..."); }
        else if(state.equals("paused")) { state = "playing"; System.out.println("Reanudado..."); }
    }
}

Instrucciones

Reemplaza los condicionales por clases de estado.

Implementa State con clases concretas (PlayingState, PausedState, StoppedState).

Tips

¿Qué principio elimina estos condicionales?