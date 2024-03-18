class formula
    {
   	double w;
    	double h;
        void formula1(double w, double h)
        {
		w=w*0.453592;
		h=h*0.0254;
         	this.w=w;
         	this.h=h;
        	double c = w/(h*h);
        	System.out.println("BMI :"+ c );
        }
    }
class fun
{
public static void main(String []args)
{
    formula f =new formula();
    f.formula1(102.0,65.0);
    }
}