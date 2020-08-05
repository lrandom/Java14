/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4.bai3;

/**
 *
 * @author Lrandom
 */
public class NhanVienDal {
      public void timKiemNV(NhanVien[] nvs){
          for (int i = 0; i < nvs.length; i++) {
              if(nvs[i].getAge()>24){
                  System.out.println("ID"+nvs[i].getId());
                  System.out.println("Name"+nvs[i].getName());
                  System.out.println("Age"+nvs[i].getAge());
                  System.out.println("Chuc vu"+nvs[i].getChucVu());
                  System.out.println("Luong"+nvs[i].getLuong());
                  System.out.println("----------------------------");
              }
          }
      }
      
      public void sapxep(NhanVien[] nvs, boolean isDesc){

          for (int i = 0; i < nvs.length-1; i++) {
              for(int j=i+1; j< nvs.length;j++){
                  NhanVien tmp = nvs[i]; 
                  if(isDesc){
                  //sap xep giam dan
                    if(nvs[j].getLuong()>nvs[i].getLuong()){
                       nvs[i] = nvs[j];
                       nvs[j] = tmp;
                    }
                  }else{
                  //sap xep tang dan
                    if(nvs[j].getLuong()<nvs[i].getLuong()){
                       nvs[i]= nvs[j];
                       nvs[j]= tmp;
                    }
                  }
              }//end for
          }
          
          if(isDesc){
              System.out.println("NV theo so luong giam dan la");
              
          }else{
              System.out.println("NV theo so luong tang dan la");
          }
          
          for (NhanVien nv : nvs) {
              System.out.println(nv.getId());
              System.out.println(nv.getName());
              System.out.println(nv.getLuong());
              System.out.println("-----------------");
          }
      }
}
