package RevisaoProva.ProjetoClima;

public class Sensor {
    private TipoClima climaAtual;
    private double temperatura;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public TipoClima getClimaAtual() {
        return climaAtual;
    }

    public void setClimaAtual(TipoClima climaAtual) {
        this.climaAtual = climaAtual;
    }

    public void ajustarTemperatura(double d){
        if(!(d >= -50 && d <= 50)){
            System.out.println("a temperatura precisa ser maior que -50° e menor que +50°");
        }

        this.temperatura = d;
    }

}
