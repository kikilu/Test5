public interface IStringBuffer {
    void append(String str);         //追加字符串
    void append(char c);             //追加字符
    void insert(int pos,char b);     //指定位置插入字符
    void insert(int pos,String b);   //指定位置插入字符串
    void delete(int start);          //从开始位置删除剩下的字符
    void delete(int start,int end);  //删除开始位置和结束位置之间的字符
    void reverse();                  //反转字符串
    int length();                    //返回字符串长度
}
