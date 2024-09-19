package com.hw.houserent.view;
import com.hw.houserent.domain.House;
import com.hw.houserent.service.HouseService;
import com.hw.houserent.utils.Utility;

public class HouseView {
//    显示主菜单
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(10);

    public void listHouse(){
        System.out.println("========房屋列表=========");
        System.out.println("编号\t房主\t电话\t地址\t月租\t状态（未出租/出租）");
        House[] houses = houseService.list();
        for(int i = 0 ;i<houses.length;i++){
            if(houses[i]==null){
                break;
            }
            System.out.println(houses[i]);
        }
    }

    public void addHouse(){
        System.out.println("-------------------添加房屋--------------------");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String tel = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态（未出租/出租）：");
        String state = Utility.readString(3);
        House newHouse =new House(0,name,tel,address,rent,state);
        if (houseService.add(newHouse)){
            System.out.println("-------------------添加房屋成功--------------------");
        }else {
            System.out.println("-------------------添加房屋失败--------------------");
        }
    }


    public void mainMenu(){
        do {
            System.out.println("-------------房屋出租系统-------------");
            System.out.println("\t\t1 新 增 房 源");
            System.out.println("\t\t2 查 找 房 屋");
            System.out.println("\t\t3 删 除 房 屋");
            System.out.println("\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t5 房 屋 列 表");
            System.out.println("\t\t6 退       出");
            System.out.println("请输入你的选择（1-6）");
            key = Utility.readChar();
            switch(key){
                case  '1':
                    addHouse();
                    break;
                case  '2':
                    System.out.println("查找");
                    break;
                case  '3':
                    System.out.println("删除");
                    break;
                case  '4':
                    System.out.println("修改");
                    break;
                case  '5':
                    listHouse();
                    break;
                case  '6':
                    System.out.println("退出");
                    loop = false;
                    break;

            }
        }while(loop);

     }
}
