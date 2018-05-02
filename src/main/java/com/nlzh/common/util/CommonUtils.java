package com.nlzh.common.util;

public class CommonUtils {

	private static double rad(double d) { 
         return d * Math.PI / 180.00; //角度转换成弧度
    }
	
	/**
	 * 获取两个经纬度之间的距离
	 * @param longitude1
	 * @param latitude1
	 * @param longitude2
	 * @param latitude2
	 * @return
	 */
	public static double getDistance (String longitudeOne, String latitudeOne, String longitudeTwo, String latitudeTwo) {
		double longitude1 = Double.parseDouble(longitudeOne);
		double latitude1 = Double.parseDouble(latitudeOne);
		double longitude2 = Double.parseDouble(longitudeTwo);
		double latitude2 = Double.parseDouble(latitudeTwo);
		
        double Lat1 = rad(latitude1); // 纬度
        double Lat2 = rad(latitude2); 
        double a = Lat1 - Lat2;//两点纬度之差
        double b = rad(longitude1) - rad(longitude2); //经度之差
        double s = 2 * Math.asin(Math
                      .sqrt(Math.pow(Math.sin(a / 2), 2) + Math.cos(Lat1) * Math.cos(Lat2) * Math.pow(Math.sin(b / 2), 2)));//计算两点距离的公式
        s = s * 6378137.0;//弧长乘地球半径（半径为米）
        s = Math.round(s * 10000d) / 10000d;//精确距离的数值
        return s;
   }
	
	
}
