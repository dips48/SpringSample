package com.dips.intent;

public class ActionFactory {
	public static Action getAction(int type){
		if(type==1){
			return new UpperAction();
		}else{
			return new LowerAction();
		}
	}

}
