public class match {
    fight f1;
    fight f2;
    int minWg ;
    int maxWg;

    match(fight f1 , fight f2 , int maxWG , int minWG){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWg = maxWG;
        this.minWg = minWG;
    }
    void run (){
        if(ischeck()){

            while(this.f1.health > 0 && this.f2.health > 0){
                System.out.println("========== YENİ ROUND ==========");
                this.f2.health = this.f1.hit(this.f2);
                if(iswin()){
                    break;
                }

                this.f1.health = this.f2.hit(this.f1);
                if(iswin()){
                    break;
                }
                System.out.println( this.f1.name + " "+ this.f1.health +  " kalan canı ");
                System.out.println( this.f2.name + " "+ this.f2.health +  " kalan canı ");       
            }
        }
        else{
            System.out.println("SİKLET UYUMSUZ");
        }
    }

    boolean ischeck(){
        return (this.f1.weight >= minWg && this.f1.weight <= maxWg ) && (this.f2.weight >= minWg && this.f2.weight <= maxWg);
    }
    boolean iswin(){
        if(this.f1.health ==0){
            System.out.println(f2.name + " = " +" KAZANDI .. ");
             return true;
        }

        if(this.f2.health == 0){
            System.out.println(f1.name + " = " + " KAZANDI..");
            return true;
        }
        return false;
    }
}
