interface OnClickListener {
		void onClick();
}
class Button{
		static void setClickAction(OnclickListener listener){
				listener.onClick();
		}
}

class Main{
		public static void main(String[] args){
				// 무명 클래스 선언
				Button.setClickAction(new OnclickListener(){
						// 메서드오버라이딩(재정의)
						@Override
						public void onClick(){
								System.out.println("사용자가 버튼을 클릭했습니다");
						}
				}
		}
}
