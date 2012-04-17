import java.net.URLDecoder;


public class StringTools {

	public static void main(String[] args) {
		System.out.println(URLDecoder.decode("%7B%22sdfcccsadfid%22%3A1212%2C%22icon%22%3A%22%2Fmoduleresources%2Fcore.web%2Fresources%2Fimages%2Fb-list-icon-1.png%22%2C%22time%22%3A%222012-12-12+15%3A23%22%2C%22out%22%3A%22%E5%8C%97%E4%BA%AC%E9%A4%90%E5%8E%85%22%2C%22enter%22%3A%22%E4%B8%8A%E6%B5%B7%E9%A4%90%E5%8E%85%22%2C%22state%22%3A0%2C%22list%22%3A%5B%7B%22id%22%3A1%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A2%7D%2C+%7B%22id%22%3A2%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A3%7D%2C+%7B%22id%22%3A3%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A4%7D%2C+%7B%22id%22%3A4%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A5%7D%5D%7D"));
		System.out.println(Math.floor(53.1)+"aaacccabb");
		System.out.println(Math.floor(51.1));
		System.out.println(URLDecoder.decode("%7B%22sdfcccsadfid%asdfa22%3A1212%2C%22icon%22%3A%22%2Fmoduleresources%2Fcore.web%2Fresources%2Fimages%2Fb-list-icon-1.png%22%2C%22time%22%3A%222012-12-12+15%3A23%22%2C%22out%22%3A%22%E5%8C%97%E4%BA%AC%E9%A4%90%E5%8E%85%22%2C%22enter%22%3A%22%E4%B8%8A%E6%B5%B7%E9%A4%90%E5%8E%85%22%2C%22state%22%3A0%2C%22list%22%3A%5B%7B%22id%22%3A1%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A2%7D%2C+%7B%22id%22%3A2%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A3%7D%2C+%7B%22id%22%3A3%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A4%7D%2C+%7B%22id%22%3A4%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A5%7D%5D%7D"));
		System.out.println(Math.floor(31.1)+"accccaaabsdfsab");
		System.out.println(URLDecoder.decode("%7B%22sdfsadfid%22%3A1212%2C%22icon%22%3A%22%2Fmoduleresources%2Fcore.web%2Fresources%2Fimages%2Fb-list-icon-1.png%22%2C%22time%22%3A%222012-12-12+15%3A23%22%2C%22out%22%3A%22%E5%8C%97%E4%BA%AC%E9%A4%90%E5%8E%85%22%2C%22enter%22%3A%22%E4%B8%8A%E6%B5%B7%E9%A4%90%E5%8E%85%22%2C%22state%22%3A0%2C%22list%22%3A%5B%7B%22id%22%3A1%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A2%7D%2C+%7B%22id%22%3A2%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A3%7D%2C+%7B%22id%22%3A3%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A4%7D%2C+%7B%22id%22%3A4%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A5%7D%5D%7D"));
		System.out.println(Math.floor(143.1)+"aaaabb");
		System.out.println(Math.floor(321.1));
		System.out.println(URLDecoder.decode("%7B%22sdfsadfid%asdfa22%3A1212%2C%22icon%22%3A%22%2Fmoduleresources%2Fcore.web%2Fresources%2Fimages%2Fb-list-icon-1.png%22%2C%22time%22%3A%222012-12-12+15%3A23%22%2C%22out%22%3A%22%E5%8C%97%E4%BA%AC%E9%A4%90%E5%8E%85%22%2C%22enter%22%3A%22%E4%B8%8A%E6%B5%B7%E9%A4%90%E5%8E%85%22%2C%22state%22%3A0%2C%22list%22%3A%5B%7B%22id%22%3A1%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A2%7D%2C+%7B%22id%22%3A2%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A3%7D%2C+%7B%22id%22%3A3%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A4%7D%2C+%7B%22id%22%3A4%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A5%7D%5D%7D"));
		System.out.println(Math.floor(231.1)+"aaaabsdfsab");
		System.out.println(Math.floor(21.1)+"aaaabsdfsab");
		

		System.out.println(URLDecoder.decode("%7B%22sdfsadfid%22%3A1212%2C%22icon%22%3A%22%2Fmoduleresources%2Fcore.web%2Fresources%2Fimages%2Fb-list-icon-1.png%22%2C%22time%22%3A%222012-12-12+15%3A23%22%2C%22out%22%3A%22%E5%8C%97%E4%BA%AC%E9%A4%90%E5%8E%85%22%2C%22enter%22%3A%22%E4%B8%8A%E6%B5%B7%E9%A4%90%E5%8E%85%22%2C%22state%22%3A0%2C%22list%22%3A%5B%7B%22id%22%3A1%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A2%7D%2C+%7B%22id%22%3A2%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A3%7D%2C+%7B%22id%22%3A3%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A4%7D%2C+%7B%22id%22%3A4%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A5%7D%5D%7D"));
		System.out.println(Math.floor(143.1)+"aaaabb");
		System.out.println(Math.floor(321.1));
		System.out.println(URLDecoder.decode("%7B%22sdfsadfid%asdfa22%3A1212%2C%22icon%22%3A%22%2Fmoduleresources%2Fcore.web%2Fresources%2Fimages%2Fb-list-icon-1.png%22%2C%22time%22%3A%222012-12-12+15%3A23%22%2C%22out%22%3A%22%E5%8C%97%E4%BA%AC%E9%A4%90%E5%8E%85%22%2C%22enter%22%3A%22%E4%B8%8A%E6%B5%B7%E9%A4%90%E5%8E%85%22%2C%22state%22%3A0%2C%22list%22%3A%5B%7B%22id%22%3A1%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A2%7D%2C+%7B%22id%22%3A2%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A3%7D%2C+%7B%22id%22%3A3%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A4%7D%2C+%7B%22id%22%3A4%2C%22name%22%3A%22%E4%B9%9D%E5%9D%97%E9%B8%A1%22%2C%22unit%22%3A%22%E7%AE%B1%22%2C%22reality%22%3A5%7D%5D%7D"));
		System.out.println(Math.floor(231.1)+"aaaabsdfsab");
		System.out.println(Math.floor(21.1)+"aaaabsdfsab");
		

 
	}
	
}
