package mcframe.serverMABG.MABGL0760;

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
import mcframe.serverMABG.MABGL0760.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_StkEvalReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_StkEvalReg_MC extends MABGL_StkEvalReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * StkEval_UpdChk01オペレーション.<p>
	 *
	 * 在庫評価マスタの登録前のチェックを行います。<br>
	 */
	public class StkEval_UpdChk01 extends MABGL_StkEvalReg_MC_A.StkEval_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for (StkEval_UpdChk01_DtlR r :up0()){
				if (isNotCd(r.stk_eval_cd())){
					msgList.add(new MCMessage(r, StkEval_UpdChk01_DtlR.$stk_eval_cd, MABCL0306, 
									getLabel(r, StkEval_UpdChk01_DtlR.$stk_eval_cd), r.stk_eval_cd(), toDispGUIIndex(r)));
					continue;
				}
				if (r.del_flg()) {
					continue ;
				}
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				if (!r.cut_flg() && !isNull(r.expns_cd())) {
					msgList.add(new MCMessage(r, StkEval_UpdChk01_DtlR.$expns_cd, MABGL0114, toDispGUIIndex(r)));
				}
				if (!r.lump_rate_flg() && !isNull(r.eval_rate())) {
					msgList.add(new MCMessage(r, StkEval_UpdChk01_DtlR.$eval_rate, MABGL0115, toDispGUIIndex(r)));
				}
				if (r.lump_rate_flg() && !isNull(r.upri_set_typ())) {
					msgList.add(new MCMessage(r, StkEval_UpdChk01_DtlR.$upri_set_typ, MABGL0116, toDispGUIIndex(r)));
				}
			}
			return msgList;
		}	
	}
	/**
	 * StkEval_Upd01オペレーション.<p>
	 *
	 * 在庫評価マスタの登録を行います。<br>
	 */
	public class StkEval_Upd01 extends MABGL_StkEvalReg_MC_A.StkEval_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * StkEvalLcl_UpdChk01オペレーション.<p>
	 *
	 * 在庫評価名称マスタの登録前のチェックを行います。<br>
	 */
	public class StkEvalLcl_UpdChk01 extends MABGL_StkEvalReg_MC_A.StkEvalLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * StkEvalLcl_Upd01オペレーション.<p>
	 *
	 * 在庫評価名称マスタの登録を行います。<br>
	 */
	public class StkEvalLcl_Upd01 extends MABGL_StkEvalReg_MC_A.StkEvalLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * StkEval_DelChk01オペレーション.<p>
	 *
	 * 在庫評価マスタ、在庫評価名称マスタの削除前のチェックを行います。<br>
	 */
	public class StkEval_DelChk01 extends MABGL_StkEvalReg_MC_A.StkEval_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * StkEval_Del01オペレーション.<p>
	 *
	 * 在庫評価マスタ、一次配賦基準名称マスタの削除を行います。<br>
	 */
	public class StkEval_Del01 extends MABGL_StkEvalReg_MC_A.StkEval_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 在庫評価マスタ、在庫評価名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_StkEvalReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 在庫評価マスタ、在庫評価名称マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABGL_StkEvalReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 在庫評価マスタ、在庫評価名称マスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_StkEvalReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}