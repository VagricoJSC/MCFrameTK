package mcframe.clientMAUC.MAUCP0030;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientCore.sys.MCSys;
import mcframe.commonCore.param.*;
import mcframe.commonCore.login.MCAuth;
import mcframe.clientMAUD.MAUDP0010.MAUDP_CallerNoPanel;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUCP_Dac"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUCP_Dac_MC extends MAUCP_Dac_MC_A implements MCLogoutListener, MCLoginListener {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUCP_Dac_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
	protected static MAUCP_Dac _me;

	/**
	 * @depricated 共通親クラスのみで使用することを想定
	 */
	protected static MAUCP_Dac me() {
		if (_me == null) {
			_me = new MAUCP_Dac();
		}
		return _me;
	}

	/**
	 * 一括してDAC情報を再取得し、キャッシュする
	 */
	public static void initAllDacInfo() {
		me()._initAllDacInfo();
	}

	/**
	 * 一括してDAC情報を再取得し、キャッシュする
	 */
	protected void _initAllDacInfo() {
		// 部門
		MCList<DptDacR> dptRd = MCList.create(DptDacR.class);
		MCList<DptDacR> dptWr = MCList.create(DptDacR.class);

		// 物流グループ
		MCList<LgGrpDacR> lgGrpRd = MCList.create(LgGrpDacR.class);
		MCList<LgGrpDacR> lgGrpWr = MCList.create(LgGrpDacR.class);

		// 場所
		MCList<LocDacR> locRd = MCList.create(LocDacR.class);
		MCList<LocDacR> locWr = MCList.create(LocDacR.class);

		// ＷＧ
		MCList<WgDacR> wgRd = MCList.create(WgDacR.class);
		MCList<WgDacR> wgWr = MCList.create(WgDacR.class);

		// 総量引当場所グループ
		MCList<AlcGrpDacR> alcGrpRd = MCList.create(AlcGrpDacR.class);
		MCList<AlcGrpDacR> alcGrpWr = MCList.create(AlcGrpDacR.class);
		
		String loginUsr = MCSys.user.ID();

		if (!MCAuth.isAdminUser(loginUsr)) {
			LoginInfoR info = LoginInfoR.create();
			info.usr_cd(MCSys.user.ID());
			info.srch_only_flg(false);

			MCParam p = new MCParam(PDef.MA_MAUCL0030_Srch09_INFO);
			p.addUpBlock(info);
			p.addDownBlock(dptRd);
			p.addDownBlock(dptWr);
			p.addDownBlock(lgGrpRd);
			p.addDownBlock(lgGrpWr);
			p.addDownBlock(locRd);
			p.addDownBlock(locWr);
			p.addDownBlock(wgRd);
			p.addDownBlock(wgWr);
			p.addDownBlock(alcGrpRd);
			p.addDownBlock(alcGrpWr);
			
			_createCaller(p, null).exec();
		}
	}

	/**
	 * サーバ通信用のCallerを返します。
	 *
	 * @param p MCParam
	 * @param panel パネル
	 * @return Caller
	 */
	protected mcframe.clientCore.requester.MCCaller _createCaller(MCParam p,
			MCRootPanel panel) {

		return new MAUDP_CallerNoPanel(p);
	}

	// ログインリスナ（ここから）
	@Override
	public void doNLIEvent(MCAuthEvent event) {
		MAUCP_Dac.initAllDacInfo();
	}

	// ログインリスナ（ここまで）

	// ログアウトリスナ（ここから）
	@Override
	public void doNLOEvent(MCAuthEvent event) {
		MCParam p = new MCParam(PDef.MA_MAUCL0030_Del09_INFO);
		_createCaller(p, null).exec();
	}
	@Override
	public boolean doVLOEvent(MCAuthEvent event) {
		return true;
	}
	// ログアウトリスナ（ここまで）

}