import mindustry.content.Blocks;
import mindustry.mod.*;
import mindustry.world.meta.BuildVisibility;

public class Main extends Mod{

    public Main(){}

    @Override
    public void loadContent(){
        Blocks.itemSource.buildVisibility = BuildVisibility.shown;
        Blocks.liquidSource.buildVisibility = BuildVisibility.shown;
        Blocks.powerSource.buildVisibility = BuildVisibility.shown;
    }
}
