package mcframe.serverMABC.MABCL0150;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMABC.MABCL0150.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_PushNtcReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_PushNtcReg_MC extends MABCL_PushNtcReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * PushNtc_UpdChk01オペレーション.<p>
	 *
	 * プッシュ通知制御マスタの登録前のチェックを行います。<br>
	 */
	public class PushNtc_UpdChk01 extends MABCL_PushNtcReg_MC_A.PushNtc_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			for (PushNtc_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}
				// 必須チェック
				if (MAC_PUSH_NTC_TYP.is_wg(r.push_ntc_typ())){
					msgList.addAll(check(r, PushNtc_UpdChk01_DtlR.$ntc_wg_cd, new FXUCL_RequiredValidater()));
				}
				else {
					if (!isNull(r.ntc_wg_cd())) {
						msgList.add(new MCMessage(r, PushNtc_UpdChk01_DtlR.$ntc_wg_cd, MABCL0288, toDispGUIIndex(r)));
					}
				}
				if (MAC_PUSH_NTC_TYP.is_dpt(r.push_ntc_typ())){
					msgList.addAll(check(r, PushNtc_UpdChk01_DtlR.$ntc_dpt_cd, new FXUCL_RequiredValidater()));
				}
				else {
					if (!isNull(r.ntc_dpt_cd())) {
						msgList.add(new MCMessage(r, PushNtc_UpdChk01_DtlR.$ntc_dpt_cd, MABCL0289, toDispGUIIndex(r)));
					}
				}
				if (!MAC_PUSH_NTC_TYP.is_aprv_role(r.push_ntc_typ())){
					if (!isNull(r.ntc_aprv_role_cd())) {
						msgList.add(new MCMessage(r, PushNtc_UpdChk01_DtlR.$ntc_aprv_role_cd, MABCL0290, toDispGUIIndex(r)));
					}
				}
				msgList.addAll(check(r, PushNtc_UpdChk01_DtlR.$msg_imp_typ, new FXUCL_RequiredValidater()));
				msgList.addAll(check(r, PushNtc_UpdChk01_DtlR.$push_typ, new FXUCL_RequiredValidater()));
			}
			return msgList;
		}
	}
	/**
	 * PushNtc_Upd01オペレーション.<p>
	 *
	 * プッシュ通知制御マスタの登録を行います。<br>
	 */
	public class PushNtc_Upd01 extends MABCL_PushNtcReg_MC_A.PushNtc_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * PushNtc_DelChk01オペレーション.<p>
	 *
	 * プッシュ通知制御マスタの削除前のチェックを行います。<br>
	 */
	public class PushNtc_DelChk01 extends MABCL_PushNtcReg_MC_A.PushNtc_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * PushNtc_Del01オペレーション.<p>
	 *
	 * プッシュ通知制御マスタの削除前のチェックを行います。<br>
	 */
	public class PushNtc_Del01 extends MABCL_PushNtcReg_MC_A.PushNtc_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * プッシュ通知制御マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_PushNtcReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 登録対象の補正を行います。<br>
	 */
	public class Sprt01 extends MABCL_PushNtcReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * プッシュ通知制御マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABCL_PushNtcReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * プッシュ通知制御マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_PushNtcReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}