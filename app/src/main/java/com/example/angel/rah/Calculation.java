package com.example.angel.rah;

public class Calculation {
    public double l,b,h,y,z;


    public void getData(double L, double B, double H, double Y, double Z) {
        l=L;
        b=B;
        h=H;
        y=Y;
        z=Z;
    }

    public double answer(double ply) {
        double ans=0;

        if(ply == 3)
        {
            ans=((b+h)*((b+l)*2+2)*((140*1)+(y*1)+z))/1550;

        }

        else if(ply == 5 )
        {
            ans=((b+h)*((b+l)*2+2)*((140*2)+(y*2)+z))/1550;
        }

        else if(ply == 7)
        {
            ans=((b+h)*((b+l)*2+2)*((140*3)+(y*3)+z))/1550;
        }
        else if(ply==9)
        {
            ans=((b+h)*((b+l)*2+2)*((140*4)+(y*4)+z))/1550;

        }

        return ans;
    }

    public double finalAnswer(double price , double preAns) {

        double ans;
        ans = (price*preAns)/1000;
        return ans;
    }

    public double decal(){

        return b+h;
    }

    public double tLength(){

        return ((l+b)*2)+2;
    }
}



