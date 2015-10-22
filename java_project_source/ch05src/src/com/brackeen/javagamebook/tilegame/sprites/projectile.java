package com.brackeen.javagamebook.tilegame.sprites;

//import java.lang.reflect.Constructor;
import com.brackeen.javagamebook.graphics.*;

public class projectile extends Sprite {

    private Animation shootL;
    private Animation shootR;
    
    
    public projectile(Animation shootL, Animation shootR) {
        super(shootL);
        this.shootR = shootR;
        this.shootL = shootL;
        
    }
    
    //public void collideHorizontal() {
    //   setVelocityX(0);
    //}
    
    public float getMaxSpeed() {
        return 0.75f;
    }
}
