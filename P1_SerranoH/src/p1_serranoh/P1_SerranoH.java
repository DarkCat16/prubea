/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_serranoh;

import java.util.Scanner;

/**
 *
 * @author Mario Serrano Herrera
 */
public class P1_SerranoH {
      //CONSTANTS
        
        //MIN_MAX_ID
        public static final int ID_MIN=21,ID_MAX=499;
        //GENERES
        private static final String GENERE_DONA="Dona";
        private static final String GENERE_HOME="Home";
        private static final String GENERE_NO="Prefereixo no contestar";
        //MIN_MAX_NIVELL
        public static final int MIN_NIVELL=0,MAX_NIVELL=2;
        //NIVELLS
        private static final String NIVELL_1="Primària";
        private static final String NIVELL_2="Secundària";
        private static final String NIVELL_3="Superior";
        //MIN_MAX_AREA
        public static final int MIN_AREA=0,MAX_AREA_PRIM=4,MAX_AREA_SEC=6;
        //AREAS(ASSIGNATURES)
        private static final String AREA_MATES="Matemàtiques";
        private static final String AREA_LECTURA="Lectura";
        private static final String AREA_CASTELLA="Castellà";
        private static final String AREA_CATALA="Català";
        private static final String AREA_ANGLES="Anglès";
        private static final String AREA_CIENCIA="Ciència";
        private static final String AREA_PREFERIDA="Música";
        private static final String AREA_TOTES="Totes";
        //MIX_MAX_EXPERIÈNCIA
        public static final int MIN_EXP=0,MAX_EXP=90;

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      
        
        
        int id=0,genere=0,nivell=0,area=0,anysExp=0;
        String genere_str="";
        String nivell_str="";
        String area_str="";
        
        
        System.out.println("Benvingut al gestionador de voluntariat del projecte d'estudis de Barcelona.\nSiusplau respon les següents preguntes amb el número de la resposta corresponent: ");
        
        System.out.println("Id: ");
        System.out.print("Resposta: ");
        id=entrada.nextInt();
        //CONTROL ERRORS ID
        if (id>=ID_MIN && id<=ID_MAX) {
            System.out.println("Gènere: \n1."+GENERE_DONA+"(1)\n2."+GENERE_HOME+"(2)\n3."+GENERE_NO+"(3)");
        System.out.print("Resposta: ");
        genere=entrada.nextInt();
            if (genere==1) {
                genere_str=GENERE_DONA;
                
            }else{
                if (genere==2) {
                    genere_str=GENERE_HOME;
                    
                }else{
                    genere_str=GENERE_NO;
                }
            }
        
           
            
        //CONTROL ERRORS GENERE
        if (genere>=1 && genere<=3) {
             System.out.println("Nivell: \n1."+NIVELL_1+"(0)\n2."+NIVELL_2+"(1)\n3."+NIVELL_3+"(2)");
        System.out.print("Resposta: ");
        nivell=entrada.nextInt();
            if (nivell==0) {
                nivell_str=NIVELL_1;
                
            }else{
                if (nivell==1) {
                    nivell_str=NIVELL_2;
                    
                }else{
                    nivell_str=NIVELL_3;
                }
            }
            if (nivell>=MIN_NIVELL && nivell<=MAX_NIVELL) {
                  switch(nivell){
            //PRIMARIA
            case 0:
                System.out.println("Àrea en la que pots donar suport?\n1."+AREA_MATES+"(1)\n2."+AREA_LECTURA+"(2)\n3."+AREA_CASTELLA+"(3)\n4."+AREA_CATALA+"(4)\n5."+AREA_TOTES+"(0)");
                 System.out.print("Resposta: ");
                 area=entrada.nextInt();
                 if (area==1) {
                     area_str=AREA_MATES;
                    
                }else{
                     if (area==2) {
                         area_str=AREA_LECTURA;
                         
                     }else{
                         if (area==3) {
                             area_str=AREA_CASTELLA;
                             
                         }else{
                             if (area==4) {
                                 area_str=AREA_CATALA;
                                 
                             }else{
                                 area_str=AREA_TOTES;
                             }
                         }
                     }
                 }
                 if (area>=MIN_AREA && area<=MAX_AREA_PRIM) {
                     System.out.print("Experiència (anys) : ");
                  anysExp=entrada.nextInt();
                     if (anysExp>=MIN_EXP && anysExp<=MAX_EXP ) {
                          System.out.println("______RESULTATS______");
                  
                  System.out.println("Id           Genere          Nivell          Àrea          Experiència");
                  System.out.println(id+"            "+genere_str+"           "+nivell_str+"          "+area_str+"                "+anysExp);
                         
                     }
                  
                 
                     
                    
                }
                 break;
            //SECUNDARIA
                case 1:
                    System.out.println("Àrea en la que pots donar suport?\n1."+AREA_MATES+"(1)\n2."+AREA_ANGLES+"(2)\n3."+AREA_CASTELLA+"(3)\n4."+AREA_CATALA+"(4)\n5."+AREA_CIENCIA+"(5)\n6."+AREA_PREFERIDA+"(6)\n7."+AREA_TOTES+"(0)");
                     System.out.print("Resposta: ");
                     area=entrada.nextInt();
                     if (area==1) {
                     area_str=AREA_MATES;
                    
                }else{
                     if (area==2) {
                         area_str=AREA_ANGLES;
                         
                     }else{
                         if (area==3) {
                             area_str=AREA_CASTELLA;
                             
                         }else{
                             if (area==4) {
                                 area_str=AREA_CATALA;
                                 
                             }else{
                                 if (area==5) {
                                     area_str=AREA_CIENCIA;
                                     
                                 }else{
                                     if (area==6) {
                                         area_str=AREA_PREFERIDA;
                                         
                                     }else{
                                         area_str=AREA_TOTES;
                                     }
                                 }
                             }
                         }
                     }
                 }
                     if (area>=MIN_AREA && area<=MAX_AREA_SEC) {
                         
                         
                        
                }
                     break;
            //SUPERIOR
                    case 2: 
                        System.out.println("Àrea en la que pots donar suport?\n1."+AREA_TOTES+"(0)");
                        area=entrada.nextInt();
                     if (area==0) {
                         System.out.println("Materia seleccionada");
                     }
                     break;
                
        }
                  
                  
                  
            
                
            }else{
                System.out.println("Has introduït un número de nivell no vàlid.");
            }
            
        
      
            
        }else{                              
            System.out.println("Has introduït un número de genere no vàlid.");
        }
            
        }else{
            System.out.println("Has introduït un número  d'ID no vàlid");
        }
        
        
       
        
        
    }
    
}
