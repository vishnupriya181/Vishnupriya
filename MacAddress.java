

	import java.net.InetAddress;
	import java.net.NetworkInterface;
	import java.net.SocketException;
	import java.net.UnknownHostException;
	 
	public class MacAddress {
	 
	   public static void main(String[] args){
	 
		try {
	 
			InetAddress localhost = InetAddress.getLocalHost();
	 
			System.out.println("IP address : " + localhost.getHostAddress());
	 
			NetworkInterface network = NetworkInterface.getByInetAddress(localhost);
	 
			byte[] mac = network.getHardwareAddress();
	 
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < mac.length; i++) {
			sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
			}
			System.out.println("MAC address : "+sb.toString());
	 
		} catch (UnknownHostException e) {
	 
			e.printStackTrace();
	 
		} catch (SocketException e){
	 
			e.printStackTrace();
		}
	   } 
	

}
