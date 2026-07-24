package mcframe.serverMAUC.MAUCL5010;

import mcframe.commonMA.constant.*;

public class MAUCL_PushNtcMgr_MC {

	protected static Class<MAUCL_PushNtcMgr> CLAZZ = MAUCL_PushNtcMgr.class;

	protected int pegNo = 0;

	protected MAUCL_PushNtcRegService.PushNtc_Upd01 ope =
			MAUCL_PushNtcRegService.crtPushNtc_Upd01();

	public static MAUCL_PushNtcMgr create() {
		return new MAUCL_PushNtcMgr();
	}

	public MAUCL_PushNtcInfo createInfo(MAC_PUSH_NTC_TYP typ) {
		MAUCL_PushNtcInfo caller = new MAUCL_PushNtcInfo();
		caller.setPegNo(++pegNo);
		caller.setOpe(ope);
		caller.crtHdr(typ);
		return caller;
	}

	public void exec() {
		// プッシュ対象であることを設定
		mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBeforeAfter.setPushTar(true);
		ope.exec();
	}

}
