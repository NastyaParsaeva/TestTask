
public class Ip {

    String stringIp;
    long numberIp;

    public Ip(String stringIp, long numberIp) {
        this.stringIp = stringIp;
        this.numberIp = numberIp;
    }

    public Ip(String stringIp) {
        //записываем строковое представление ip-адреса, полученное в качестве аргумента
        this.stringIp = stringIp;

        //разделяем строковое ппредставление ip-адреса на массив октетов
        String[] octets = stringIp.split("\\.");
        long result = 0;
        //Для каждого октета получаем его численное представление, а затем увеличиваем результативную переменную
        for (int i = 0; i < octets.length; i++) {
            int power = 3 - i;
            int ip = Integer.parseInt(octets[i]);
            result += ip * Math.pow(256, power);
        }
        //Записываем численное представление ip-адреса в поле объекта
        this.numberIp = result;
    }

    public Ip(long numberIp) {
        //Записываем численное представление ip-адреса в поле объкта
        this.numberIp = numberIp;

        StringBuilder result = new StringBuilder(15);

        //В цикле вычисляем последний октет, а затем выполняем побитовый сдвиг вправо исходного числа на 8 битов
        for (int i=0; i<4; i++) {
            result.insert(0, Long.toString(numberIp & 0xff));
            if (i<3) {
                result.insert(0, '.');
            }
            numberIp = numberIp >> 8;
        }
        //Записываем строковое представление ip-адреса в поле объекта
        this.stringIp = result.toString();
    }

    public String getStringIp() {
        return stringIp;
    }

    public long getNumberIp() {
        return numberIp;
    }
}
