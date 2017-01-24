
public class Ip {
    String stringIp;
    long numberIp;

    public Ip(String stringIp) {
        this.stringIp = stringIp;
        char[] charArray= stringIp.toCharArray();
        int count = 3;
        long NumberIp = 0;
        StringBuilder builder = new StringBuilder(3);
        for (int i=0; i<charArray.length; i++) {

            if (charArray[i] != '.') {
                builder.append(charArray[i]);
            } else {
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
        this.numberIp = NumberIp;
    }

    public Ip(long numberIp) {
        this.numberIp = numberIp;
        StringBuilder builder = new StringBuilder();
        for (int i = 3; i > 0; i--) {
            int octet = (int)(numberIp/(Math.pow(256, i)));
            numberIp -= (long)(octet * Math.pow(256, i));
            builder.append(octet);
            builder.append('.');
        }
        builder.append(numberIp);
        this.stringIp = builder.toString();
    }

    public String getStringIp() {
        return stringIp;
    }

    public long getNumberIp() {
        return numberIp;
    }
}
