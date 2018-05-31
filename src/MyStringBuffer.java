public class MyStringBuffer implements IStringBuffer {

    int capacity = 15;  //初始容量
    int length = 0;     //字符串有效长度
    char[] value;       //字符串值

    //无参构造函数
    public MyStringBuffer(){
        value = new char[capacity];
    }
    //有参构造函数
    public MyStringBuffer(String str){
        if (str != null)
            value = str.toCharArray();
        length  = value.length;
        if (capacity < value.length)
            capacity = value.length * 2;
    }

    @Override
    //追加字符串
    public void append(String str) {

    }

    @Override
    //追加字符
    public void append(char c) {

    }

    @Override
    //在指定位置插入字符
    public void insert(int pos, char b) {

    }

    @Override
    //在指定位置插入字符串
    public void insert(int pos, String b) {

    }

    @Override
    //从开始位置删除字符
    public void delete(int start) {

    }

    @Override
    //删除开始到结束位置之间的字符
    public void delete(int start, int end) {

    }

    @Override
    //反转
    public void reverse() {
        for (int i = 0;i < length / 2;i++){
            char temp = value[i];
            value[i] = value[length - 1 - i];
            value[length - 1 - i] = temp;
        }
    }

    @Override
    //返回长度
    public int length() {
        return value.length;
    }

    @Override
    public String toString(){
        return new String(value);
    }
}
