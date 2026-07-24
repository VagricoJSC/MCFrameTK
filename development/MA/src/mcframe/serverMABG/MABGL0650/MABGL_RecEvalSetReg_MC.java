package mcframe.serverMABG.MABGL0650;

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
import mcframe.serverMABG.MABGL0650.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_RecEvalSetReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_RecEvalSetReg_MC extends MABGL_RecEvalSetReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * RecEvalSet_UpdChk01オペレーション.<p>
	 *
	 * 個別評価設定マスタの登録前のチェックを行います。<br>
	 */
	public class RecEvalSet_UpdChk01 extends MABGL_RecEvalSetReg_MC_A.RecEvalSet_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			for (RecEvalSet_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}
				
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				if (MAC_AMT_SET_TYP.isAVE(r.amt_set_typ()) || MAC_AMT_SET_TYP.isAVE_STD(r.amt_set_typ())) {
					msgList.addAll(check(r, RecEvalSet_UpdChk01_DtlR.$calc_grp_cd, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (!(MAC_AMT_SET_TYP.isAVE(r.amt_set_typ()) || MAC_AMT_SET_TYP.isAVE_STD(r.amt_set_typ()))) {
					if (!isNull(r.calc_grp_cd())) {
						msgList.add(new MCMessage(r, RecEvalSet_UpdChk01_DtlR.$calc_grp_cd, MABGL0018, toDispGUIIndex(r)));
					}
				}
				if (!(MAC_AC_SLIP_TYP.is_eval_typ(r.ac_slip_typ()))) {
					msgList.add(new MCMessage(r, RecEvalSet_UpdChk01_DtlR.$ac_slip_typ,  MABGL0112, toDispGUIIndex(r)));
				}
			}
			return msgList;
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(up0(),RecEvalSet_UpdChk01_DtlR.$wg_cd));
			return msgLst;
		}
	}
	/**
	 * RecEvalSet_Upd01オペレーション.<p>
	 *
	 * 個別評価設定マスタの登録を行います。<br>
	 */
	public class RecEvalSet_Upd01 extends MABGL_RecEvalSetReg_MC_A.RecEvalSet_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RecEvalSet_DelChk01オペレーション.<p>
	 *
	 * 個別評価設定マスタの削除前のチェックを行います。<br>
	 */
	public class RecEvalSet_DelChk01 extends MABGL_RecEvalSetReg_MC_A.RecEvalSet_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(up0(), RecEvalSet_DelChk01_DtlR.$wg_cd));
			return msgLst;
		}
		
	}
	/**
	 * RecEvalSet_Del01オペレーション.<p>
	 *
	 * 個別評価設定マスタの削除を行います。<br>
	 */
	public class RecEvalSet_Del01 extends MABGL_RecEvalSetReg_MC_A.RecEvalSet_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 個別評価設定マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_RecEvalSetReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_REC_EVAL_SET_R) {
				dbcCustomizeSub(builder);
			}
		}
		
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			
			MAVM_RD_WG_R S1WG2 = MAVM_RD_WG_R.create("WG2");
			MAM_REC_EVAL_SET_R t = MAM_REC_EVAL_SET_R.create(builder.getBaseDbcAlias());

			builder.addWhereWithAnd(exists( subQuery() .select(S1WG2.prAll()) .from(S1WG2)
					.where( value(0).eq(value(0))
							.and(t.wg_cd.eq(S1WG2.wg_cd)) )));
			
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 個別評価設定マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABGL_RecEvalSetReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 個別評価設定マスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_RecEvalSetReg_MC_A.Del01 {
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
	public class Sprt01 extends MABGL_RecEvalSetReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}