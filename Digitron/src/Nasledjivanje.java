public  class Nasledjivanje implements Interfejs{
    private String x;

    public Nasledjivanje(String x){this.x=x;}
    @Override
    public String Cao(){return  "Seen"+this.x; }

}
