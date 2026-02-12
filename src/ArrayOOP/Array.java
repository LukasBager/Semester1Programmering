package ArrayOOP;

public class Array {

    private String[] names;

    public Array(int length) {
        names = new String[length];
    }

    public void setItemInArray(int index, String value) {
        names[index] = value;
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < names.length; i++) {
            if (i + 1 != names.length) {
                output += names[i] + ", ";
            } else {
                output += names[i];
            }
        }
        return output;
    }

}
