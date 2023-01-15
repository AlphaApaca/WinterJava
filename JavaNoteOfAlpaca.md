# Java

## 0. pta题带知识点

### 0.1 ToFootInch

```java
import java.util.Scanner;

public class ToFootInch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cent = sc.nextInt();
        change(cent);
    }
    public static void change(int cent){
        double fd = cent/(30.48);
        int f = (int) Math.floor(fd);
        int d = (int) Math.floor((fd - f) * 12);
        System.out.println(f + " " + d);
    }
}
```

#### 0.1.1 Java取整

```java
Math.ceil() //向上取整
Math.floor()//向下取整
Math.rint() //接近取整，中间值时取偶数
Math.round()//四舍五入（正数）；先+0.5再向下取整（负数）
```

