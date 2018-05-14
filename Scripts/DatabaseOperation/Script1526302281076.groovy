import com.module.database.DatabaseOperation


DatabaseOperation database = new DatabaseOperation()

database.connectDB('localhost', 'katalon_demo', '3306', 'root', '123456')

def data = database.executeQuery("select * from account")

//while (data.next()) {
//println data.getString(1);
//}

while(data.next()){//遍历结果集

	username=data.getString(1);  //索引从1开始，索引或者列名取值。

	password=data.getString("password")

	println(username +"\t"+password+"\t");
}

database.closeDatabaseConnection()



/**
 * while (rs.next()) {
String deptno=rs.getString("deptno");
String dname=rs.getString("dname");
String loc=rs.getString("loc");

下列三行语句与上面三行语句作用相同，仅需一个就行

String deptno=rs.getString(1);
String dname=rs.getString(2);
String loc=rs.getString(3);
System.out.println("deptno:"+deptno+",dname:"+dname+",loc:"+loc);
}
 
 */


