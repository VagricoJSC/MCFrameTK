package mcframe.serverMSBB.MSBBL4020;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMSBB.MSBBL4020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SloRsnReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SloRsnReg_MC extends MSBBL_SloRsnReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * SloRsn_DelChk01オペレーション.<p>
	 *
	 * 見積受注理由の削除前チェック<br>
	 */
	public class SloRsn_DelChk01 extends MSBBL_SloRsnReg_MC_A.SloRsn_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SloRsn_Del01オペレーション.<p>
	 *
	 * 見積受注理由を削除する<br>
	 */
	public class SloRsn_Del01 extends MSBBL_SloRsnReg_MC_A.SloRsn_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 見積受注理由を検索する<br>
	 */
	public class Srch01 extends MSBBL_SloRsnReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);

			MST_SLO_RSN_R t = MST_SLO_RSN_R.create(builder.getBaseDbcAlias());

			builder.addWhereWithCutOffAnd(t.qtn_term_flg.eq(bind("qtn_term_flg")));
			builder.addWhereWithCutOffAnd(t.qtn_rslt_flg.eq(bind("qtn_rslt_flg")));
			builder.addWhereWithCutOffAnd(t.slo_can_flg.eq(bind("slo_can_flg")));
		}

		@Override
		protected void condCustomize(MCRow cond) {
			super.condCustomize(cond);
			cond.setStringNE(MST_SLO_RSN_R.$qtn_term_flg, getQtnTermFlagStr(cond));
			cond.setStringNE(MST_SLO_RSN_R.$qtn_rslt_flg, getQtnRsltFlagStr(cond));
			cond.setStringNE(MST_SLO_RSN_R.$slo_can_flg, getSloCanFlagStr(cond));
		}

		/**
		 * 見積条件ＦＬＧの検索条件の指定
		 * 
		 * @return 検索条件の値（true or false)
		 */
		protected String getQtnTermFlagStr(MCRow r) {
			boolean onFlg = r.getBoolean(Srch01_CndR.$on_qtn_term_flg);
			boolean offFlg = r.getBoolean(Srch01_CndR.$off_qtn_term_flg);

			if (onFlg == offFlg) {
				return null;
			}
			else {
				return MCBooleanUtil.booleanToDBString(onFlg);				
			}
		}

		/**
		 * 見積結果ＦＬＧの検索条件の指定
		 * 
		 * @return 検索条件の値（true or false)
		 */
		protected String getQtnRsltFlagStr(MCRow r) {
			boolean onFlg = r.getBoolean(Srch01_CndR.$on_qtn_rslt_flg);
			boolean offFlg = r.getBoolean(Srch01_CndR.$off_qtn_rslt_flg);

			if (onFlg == offFlg) {
				return null;
			}
			else if (onFlg) {
				return MCBooleanUtil.booleanToDBString(true);				
			}
			else {
				return MCBooleanUtil.booleanToDBString(false);
			}
		}

		/**
		 * 受注取消ＦＬＧの検索条件の指定
		 * 
		 * @return 検索条件の値（true or false)
		 */
		protected String getSloCanFlagStr(MCRow r) {
			boolean onFlg = r.getBoolean(Srch01_CndR.$on_slo_can_flg);
			boolean offFlg = r.getBoolean(Srch01_CndR.$off_slo_can_flg);

			if (onFlg == offFlg) {
				return null;
			}
			else if (onFlg) {
				return MCBooleanUtil.booleanToDBString(true);				
			}
			else {
				return MCBooleanUtil.booleanToDBString(false);
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 見積受注理由を削除する<br>
	 */
	public class Del01 extends MSBBL_SloRsnReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SloRsn_UpdChk01オペレーション.<p>
	 *
	 * 見積受注理由の更新前チェック<br>
	 */
	public class SloRsn_UpdChk01 extends MSBBL_SloRsnReg_MC_A.SloRsn_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			// 条件付必須チェックの処理
			for(SloRsn_UpdChk01_DtlR r : up0()) {
				if(r.qtn_term_flg()) {
					msgL.addAll(check(r, SloRsn_UpdChk01_DtlR.$qtn_term_sort_seq, new FXUCL_RequiredValidater()));
				}
				if(r.qtn_rslt_flg()) {
					msgL.addAll(check(r, SloRsn_UpdChk01_DtlR.$qtn_rslt_sort_seq, new FXUCL_RequiredValidater()));
				}
				if(r.slo_can_flg()) {
					msgL.addAll(check(r, SloRsn_UpdChk01_DtlR.$slo_can_sort_seq, new FXUCL_RequiredValidater()));
				}
			}
			return msgL;
		}

	}
	/**
	 * SloRsn_Upd01オペレーション.<p>
	 *
	 * 見積受注理由を更新する<br>
	 */
	public class SloRsn_Upd01 extends MSBBL_SloRsnReg_MC_A.SloRsn_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 見積受注理由を更新する<br>
	 */
	public class Upd01 extends MSBBL_SloRsnReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}