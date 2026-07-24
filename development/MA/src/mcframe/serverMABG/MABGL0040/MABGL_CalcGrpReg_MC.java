package mcframe.serverMABG.MABGL0040;

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
import mcframe.serverMABG.MABGL0040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater; 
import mcframe.serverFXUC.FXUCL0170.IfValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_CalcGrpReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_CalcGrpReg_MC extends MABGL_CalcGrpReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * CalcGrp_UpdChk01オペレーション.<p>
	 *
	 * 計算グループマスタを登録する前のチェック処理を行います。<br>
	 */
	public class CalcGrp_UpdChk01 extends MABGL_CalcGrpReg_MC_A.CalcGrp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();
			for (CalcGrp_UpdChk01_DtlR r : up0()) {
				if (isNotCd(r.calc_grp_cd())){
					msgList.add(new MCMessage(r, CalcGrp_UpdChk01_DtlR.$calc_grp_cd, MABCL0306, 
									getLabel(r, CalcGrp_UpdChk01_DtlR.$calc_grp_cd), r.calc_grp_cd(), toDispGUIIndex(r)));
					continue;
				}
				if (r.del_flg()) {
					continue ;
				}
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				if (MAC_COST_CALC_TYP.isCALC_STK(r.cost_calc_typ())) {
					msgList.addAll(check(r, CalcGrp_UpdChk01_DtlR.$eval_typ, new FXUCL_RequiredValidater()));
				}
				if (!isNull(r.calc_seq_grp())) {
					msgList.addAll(check(r, CalcGrp_UpdChk01_DtlR.$calc_seq, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (!MAC_COST_CALC_TYP.isCALC_STK(r.cost_calc_typ())) {
					if (!isNull(r.eval_typ())) {
						msgList.add(new MCMessage(r, null, MABGL0100, toDispGUIIndex(r)));
					}
				}
				if (isNull(r.calc_seq_grp())) {
					if (!isNull(r.calc_seq())) {
						msgList.add(new MCMessage(r, null, MABGL0101, toDispGUIIndex(r)));
					}
				}
				if (!MAC_COST_CALC_TYP.isCALC_STK(r.cost_calc_typ())
				 || !MAC_EXP_CALC_TYP.isRQMT(r.exp_calc_typ()) && !MAC_EXP_CALC_TYP.isMFG(r.exp_calc_typ())) {
					if (r.xfr_calc_flg()) {
						msgList.add(new MCMessage(r, null, MABGL0122, toDispGUIIndex(r)));
					}
				}
			}
			return msgList;
		}
	}
	/**
	 * CalcGrp_Upd01オペレーション.<p>
	 *
	 * 計算グループマスタの登録処理を行います。<br>
	 */
	public class CalcGrp_Upd01 extends MABGL_CalcGrpReg_MC_A.CalcGrp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CalcGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 計算グループマスタ(ロケール別情報)を登録する前のチェック処理を行います。<br>
	 */
	public class CalcGrpLcl_UpdChk01 extends MABGL_CalcGrpReg_MC_A.CalcGrpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CalcGrpLcl_Upd01オペレーション.<p>
	 *
	 * 計算グループマスタ(ロケール別情報)の登録処理を行います。<br>
	 */
	public class CalcGrpLcl_Upd01 extends MABGL_CalcGrpReg_MC_A.CalcGrpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CalcGrp_DelChk01オペレーション.<p>
	 *
	 * 計算グループマスタ、計算グループマスタ(ロケール別情報)の削除前のチェックを行います。<br>
	 */
	public class CalcGrp_DelChk01 extends MABGL_CalcGrpReg_MC_A.CalcGrp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CalcGrp_Del01オペレーション.<p>
	 *
	 * 計算グループマスタ、計算グループマスタ(ロケール別情報)の削除を行います。<br>
	 */
	public class CalcGrp_Del01 extends MABGL_CalcGrpReg_MC_A.CalcGrp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 計算グループマスタ、計算グループマスタ(ロケール別情報)の登録を行います。<br>
	 */
	public class Upd01 extends MABGL_CalcGrpReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 計算グループマスタ、計算グループマスタ(ロケール別情報)の削除を行います。<br>
	 */
	public class Del01 extends MABGL_CalcGrpReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 計算グループマスタ、計算グループマスタ(ロケール別情報)の検索を行います。<br>
	 */
	public class Srch01 extends MABGL_CalcGrpReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}