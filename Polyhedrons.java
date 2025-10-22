import java.util.Scanner;
public class Polyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int faces=0;
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            String s = sc.next();
            if(s.equals("Tetrahedron")){
                faces+=4;
            }
             if(s.equals("Cube")){
                faces+=6;
            }
             if(s.equals("Octahedron")){
                faces+=8;
            }
             if(s.equals("Dodecahedron")){
                faces+=12;
            }
             if(s.equals("Icosahedron")){
                faces+=20;
            }
        }
        System.out.println(faces);
        sc.close();
    }
}
