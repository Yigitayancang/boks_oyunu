   public class fight {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    fight(String name, int damage , int health , int weight ,int dodge ){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }
    int hit (fight foe){
        System.out.println(this.name + " == " + foe.name + " ===  "+ this.damage + " HASAR VURDU " );
        
        if(foe.isdodge()){
            System.out.println(foe.name + " hasarı blokladı" );
            return foe.health;
        }
        if( foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;
    }
    boolean isdodge(){
        double randnumber = Math.random() * 100;
        return randnumber <= dodge;
    }
}
