import java.io.Console;
public class Example8_21 {
    public static void main(String args[]){
        boolean success = false;
        int count = 0;

        char[] passwd;
        Console cons = System.console();
        while(true){
            System.out.println("��������");
            passwd = cons.readPassword();
            count++;
            String password = new String(passwd);
            if(password.equals("I love this game")){
                success = true;
                System.out.println("��"+ count + "��������ȷ" );
            }
            else{
                System.out.println("��" + count + "������" + password +"����ȷ");
            }
            if(count == 3){
                System.out.println("��" + count + "�����붼����ȷ");
                System.exit(0);
            }
        }
    }
}
