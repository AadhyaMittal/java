//to define a static initializer block using try and catch


    
public static int B ,H; 
public static boolean flag;
static 
{
    Scanner scan = new Scanner(System.in);
    B = scan.nextInt();
    H = scan.nextInt();
    try
    {
        if(B <= 0 || H <= 0) 
        {
            throw new Exception("Breadth and height must be positive");
        }   
        flag = true;
    }
    catch(Exception e) 
    {
        System.out.println(e);
        flag = false;
    }
    
}

