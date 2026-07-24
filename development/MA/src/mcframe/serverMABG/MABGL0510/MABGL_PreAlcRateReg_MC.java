package mcframe.serverMABG.MABGL0510;

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
import mcframe.serverMABG.MABGL0510.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_PreAlcRateReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_PreAlcRateReg_MC extends MABGL_PreAlcRateReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * PreAlcRate_UpdChk01オペレーション.<p>
	 *
	 * 一次配賦基準マスタの登録前のチェックを行います。<br>
	 */
	public class PreAlcRate_UpdChk01 extends MABGL_PreAlcRateReg_MC_A.PreAlcRate_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for (PreAlcRate_UpdChk01_DtlR row : up0()) {
				if (isNotCd(row.pre_alc_rate_cd())){
					msgList.add(new MCMessage(row, PreAlcRate_UpdChk01_DtlR.$pre_alc_rate_cd, MABCL0306, 
									getLabel(row, PreAlcRate_UpdChk01_DtlR.$pre_alc_rate_cd), row.pre_alc_rate_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}

				if (isPlnRuleFlgDisable(row) && row.pln_rule_flg()) {
					msgList.add(new MCMessage(row, PreAlcRate_UpdChk01_DtlR.$pln_rule_flg, MABGL0001 ,toDispGUIIndex(row)));
				}
				if (isPreAlcSetTypDisable(row) && !isNull(row.pre_alc_set_typ())) {
					msgList.add(new MCMessage(row, PreAlcRate_UpdChk01_DtlR.$pre_alc_set_typ, MABGL0002, toDispGUIIndex(row)));
				}
			}
			return msgList;
		}
		
		/**
		 * 基準計画が設定不可かどうか
		 * @param row
		 */
		protected boolean isPlnRuleFlgDisable(PreAlcRate_UpdChk01_DtlR row) {
			return !row.pln_mly_flg() || row.act_mly_flg();
		}
		
		/**
		 * 比率設定区分が設定不可かどうか
		 * @param row
		 */
		protected boolean isPreAlcSetTypDisable(PreAlcRate_UpdChk01_DtlR row) {
			return !row.pln_mly_flg() && !row.act_mly_flg();
		}
		
	}
	/**
	 * PreAlcRate_Upd01オペレーション.<p>
	 *
	 * 一次配賦基準マスタの登録を行います。<br>
	 */
	public class PreAlcRate_Upd01 extends MABGL_PreAlcRateReg_MC_A.PreAlcRate_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * PreAlcRateLcl_UpdChk01オペレーション.<p>
	 *
	 * 一次配賦基準名称マスタの登録前のチェックを行います。<br>
	 */
	public class PreAlcRateLcl_UpdChk01 extends MABGL_PreAlcRateReg_MC_A.PreAlcRateLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * PreAlcRateLcl_Upd01オペレーション.<p>
	 *
	 * 一次配賦基準名称マスタの登録を行います。<br>
	 */
	public class PreAlcRateLcl_Upd01 extends MABGL_PreAlcRateReg_MC_A.PreAlcRateLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * PreAlcRate_DelChk01オペレーション.<p>
	 *
	 * 一次配賦基準マスタ、一次配賦基準名称マスタの削除前のチェックを行います。<br>
	 */
	public class PreAlcRate_DelChk01 extends MABGL_PreAlcRateReg_MC_A.PreAlcRate_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * PreAlcRate_Del01オペレーション.<p>
	 *
	 * 一次配賦基準マスタ、一次配賦基準名称マスタの削除を行います。<br>
	 */
	public class PreAlcRate_Del01 extends MABGL_PreAlcRateReg_MC_A.PreAlcRate_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 一次配賦基準マスタ、一次配賦基準名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_PreAlcRateReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 一次配賦基準マスタ、一次配賦基準名称マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABGL_PreAlcRateReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 一次配賦基準マスタ、一次配賦基準名称マスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_PreAlcRateReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}