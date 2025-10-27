package kadai_018;

abstract public class Kato_Chapter18 {
	//姓フィールド
		public String familyName = "加藤";
		//名フィールド
		public String givenName;
		//住所フィールド
		public String address = "東京都中野区〇×";
		
		//共通の紹介メソッド
		public void commonIntroduce() {
			System.out.println("名前は"+ familyName + givenName +"です");
			System.out.println("住所は" + address +"です");
		}
		
		//個別の紹介メソッド
		abstract void eachIntroduce();
		/*多分　オーバーライドしたら解消されるのでは？
		 するときは継承も記載してね*/
		
		//紹介実行メソッド
		public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		
		/*ちょっと保留*/}
}
