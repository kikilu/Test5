public class Test5 {
    public static void main(String[] args){
        String str1 = "";
        StringBuffer sb = new StringBuffer(str1);
        long time = System.currentTimeMillis();
        for (int i = 0;i < 10000;i++)
            str1 += randomStr(10);
        time = System.currentTimeMillis() - time;
        System.out.println("使用字符串连接+的方式，连接10000次，耗时"
                + time + "毫秒");
        time = System.currentTimeMillis();
        for (int i = 0;i < 10000;i++)
            sb.append(randomStr(10));
        time = System.currentTimeMillis() - time;
        System.out.println("使用StringBuffer的方式，连接10000次，耗时"
                + time + "毫秒");
    }

    //在范围[a,b)内生成随机整数
    private static int randomInt(int a, int b){
        return (int)(a + (b - a) * Math.random());
    }

    //生成长度为length的随机字符串
    private static String randomStr(int length){
        char[] randChar = new char[length];
        int i = 0;

        while(i < length){
            int c = randomInt('0','z' + 1);
            //将非数字和字母的字符剔除
            if (c <= '9' || (c >= 'A' && c <= 'Z') || c >= 'a'){
                randChar[i] = (char)c;
                i++;
            }
        }
        return new String(randChar);
    }
}
