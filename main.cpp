#include <stdio.h>
#define CLEAR "\033[2J"
enum colors{BLACK,RED,GREEN,BROWN,BLUE,MAGENTA,CYAN,LIGHTGREY};
enum {NONE,BOLD,DARK};
enum {UNDERLINE=4,BLINK};
enum {REVERSE=7,CONCEALED,STRIKE};
void display(bool isClear,int vpos,int hpos,int background,int text,int special,int height,int width,char* message,bool isBox);
int main()
{
     char welcome[]={"Welcome to a semi-graphical program!\n"};
     char newline[]={"\n"};
     char exit1[]={"1) "};
     char exit2[]={"E"};
     char exit3[]={"xit"};
     display(1,0,0,GREEN,RED,REVERSE,1,50,welcome,0);
     display(0,1,0,GREEN,RED,NONE,1,50,newline,0);
     display(0,2,0,BLUE,GREEN,NONE,1,50,exit1,0);
     display(0,2,3,BLUE,GREEN,UNDERLINE,1,50,exit2,0);
     display(0,2,4,BLUE,GREEN,NONE,1,50,exit3,0);
     return 0;
}
void display(bool isClear,int vpos,int hpos,int background,int text,int special,int height,int width,char* message,bool isBox)
{
     if(isClear)
     {
          printf(CLEAR "\033[0;0H");
          printf("\033[7;4%im\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n",background);
     }
     printf("\033[%i;%iH",vpos,hpos);
     if(!isBox)
     {
          printf("\033[%i;4%i;3%im%s",special,background,text,message);
          printf("\033[B");
          printf("\033[50D");
     }
}