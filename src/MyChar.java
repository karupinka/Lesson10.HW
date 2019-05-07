public class MyChar implements CharSequence {

    private char[] text;

    private MyChar(){}

    MyChar(char[] text){
        this.text = new char[(text.length)];

        for(int i = 0; i < text.length; i++){
            this.text[i] = text[i];
        }
    }

    MyChar(String text){
        this.text = new char[(text.length())];

        for(int i = 0; i < text.length(); i++){
            this.text[i] = text.charAt(i);
        }
    }

    MyChar(char[] text, int start, int end){
        int tempLength = end - start;

        if (tempLength<0){
            throw new StringIndexOutOfBoundsException(tempLength);
        }
        this.text = new char[tempLength];

        for(int i = 0, j = start; i < tempLength; i++, j++){
            this.text[i] = text[j];
        }
    }

    @Override
    public char charAt(int index) {
        if (index < text.length && index >= 0)
            return text[index];
        else
            throw new StringIndexOutOfBoundsException(index);
    }

    @Override
    public int length() {
        return text.length;
    }


    @Override
    public CharSequence subSequence(int start, int end) {

        if (start < 0)
            throw new StringIndexOutOfBoundsException(start);
        if (end > text.length)
            throw new StringIndexOutOfBoundsException(end);

        return (start == 0) && (end == text.length) ? this : new MyChar(text, start, end);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(char i : text)
            stringBuilder.append(i);

       String string = stringBuilder.toString();
       return string;
    }
}
