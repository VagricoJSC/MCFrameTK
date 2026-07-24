package mcframe.serverMABG.MABGL0450;

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
import mcframe.serverMABG.MABGL0450.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_RptPtnCompReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_RptPtnCompReg_MC extends MABGL_RptPtnCompReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * RptPtnComp_UpdChk01オペレーション.<p>
	 *
	 * 原価レポート比較マスタの登録前のチェックを行います。<br>
	 */
	public class RptPtnComp_UpdChk01 extends MABGL_RptPtnCompReg_MC_A.RptPtnComp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(RptPtnComp_UpdChk01_DtlR r : up0()){
				if (isNotCd(r.cmp_ptn_cd())){
					msgList.add(new MCMessage(r, RptPtnComp_UpdChk01_DtlR.$cmp_ptn_cd, MABCL0306, 
									getLabel(r, RptPtnComp_UpdChk01_DtlR.$cmp_ptn_cd), r.cmp_ptn_cd(), toDispGUIIndex(r)));
					continue;
				}
				if (r.del_flg()) {
					continue ;
				}
				if (r.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * RptPtnComp_Upd01オペレーション.<p>
	 *
	 * 原価レポート比較マスタの登録を行います。<br>
	 */
	public class RptPtnComp_Upd01 extends MABGL_RptPtnCompReg_MC_A.RptPtnComp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptPtnCompLcl_UpdChk01オペレーション.<p>
	 *
	 * 原価レポート比較名称マスタの登録前のチェックを行います。<br>
	 */
	public class RptPtnCompLcl_UpdChk01 extends MABGL_RptPtnCompReg_MC_A.RptPtnCompLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptPtnCompLcl_Upd01オペレーション.<p>
	 *
	 * 原価レポート比較名称マスタの登録を行います。<br>
	 */
	public class RptPtnCompLcl_Upd01 extends MABGL_RptPtnCompReg_MC_A.RptPtnCompLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptPtnComp_DelChk01オペレーション.<p>
	 *
	 * 原価レポート比較マスタ、原価レポート比較名称マスタの削除前のチェックを行います。<br>
	 */
	public class RptPtnComp_DelChk01 extends MABGL_RptPtnCompReg_MC_A.RptPtnComp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptPtnComp_Del01オペレーション.<p>
	 *
	 * 原価レポート比較マスタ、原価レポート比較名称マスタの削除を行います。<br>
	 */
	public class RptPtnComp_Del01 extends MABGL_RptPtnCompReg_MC_A.RptPtnComp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価レポート比較マスタ、原価レポート比較名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_RptPtnCompReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価レポート比較マスタ、原価レポート比較名称マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABGL_RptPtnCompReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価レポート比較マスタ、原価レポート比較名称マスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_RptPtnCompReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}