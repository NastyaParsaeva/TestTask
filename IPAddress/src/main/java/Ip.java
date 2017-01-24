
public class Ip {

    String stringIp;
    long numberIp;

    public Ip(String stringIp) {
        //записываем строковое представление ip-адреса, полученное в качестве аргумента, а затем начинаем вычисление его численного представление
        this.stringIp = stringIp;

        //Переводим строковое представление в массив символов
        char[] charArray= stringIp.toCharArray();
        int count = 3;
        long NumberIp = 0;
        StringBuilder builder = new StringBuilder(3);

        for (int i=0; i<charArray.length; i++) {

            //В цикле для каждого символа проверяем, является ли он точкой. Если нет, то добавляем этот символ в StringBuilder.
            if (charArray[i] != '.') {
                builder.append(charArray[i]);
            } else {

                //Если же символ является точкой, то значение в StringBuilder приводим сначала к строке, а затем к Integer
                //И умножаем на необходимое число для получение более удобного для рассчетов численного представления
                String octet = builder.toString();
                builder.delete(0, 3);
                Integer integer = Integer.valueOf(octet);
                NumberIp += (integer * Math.pow(256, count));
                count--;
            }
        }
        String octet = builder.toString();
        Integer integer = Integer.valueOf(octet);
        NumberIp += (integer * Math.pow(256, count));

        //Записываем численное представление ip-адреса в поле объекта
        this.numberIp = NumberIp;
    }

    public Ip(long numberIp) {
        //Записываем численное представление ip-адреса в поле объкта
        this.numberIp = numberIp;
        StringBuilder builder = new StringBuilder();

        //В цикле вычисляем октеты, и добавляем их в builder
        for (int i = 3; i > 0; i--) {
            int octet = (int)(numberIp/(Math.pow(256, i)));
            numberIp -= (long)(octet * Math.pow(256, i));
            builder.append(octet);
            builder.append('.');
        }
        builder.append(numberIp);

        //Записываем полученное строковое представление ip-адреса в поле объекта
        this.stringIp = builder.toString();
    }

    public String getStringIp() {
        return stringIp;
    }

    public long getNumberIp() {
        return numberIp;
    }
}
