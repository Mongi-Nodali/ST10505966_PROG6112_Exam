/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class SalesReport {

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          
         
          
          String[] companies = {"Cozy Nights", "Restonic Barbados", "Sealy Phuket"};
          String[] months = {"month 1", "month 2", "month 3"};
          int[][] salesData = {{25,18,20},{15,10,12},{18,15,20}};
          
          //1d arrays for totals and averages
          int[] totalSold =new int[companies.length];
          double[] averageSold = new double[companies.length];
          int maxSold = 0;
          String topProduct = "";
         
          
          
          for(int i = 0; i < companies.length; i++) {
              int sum = 0;
              for(int j =0; j < salesData[i].length; j++) {
                  sum += salesData[i][j];
                  
              }
              totalSold[i] = sum;
              averageSold[i] = (double) sum / salesData[i].length;
              
              if (totalSold[i] > maxSold){
                  maxSold = totalSold[i];
                  topProduct = companies[i];
              }
          }
         
          System.out.println("----------------------------------");
          System.out.println("Total Product Sales: " + totalSold);
          System.out.println("Average Product Sales: " + averageSold);
          System.out.println("Most Popular Product: " + maxSold);
          
    }
}
