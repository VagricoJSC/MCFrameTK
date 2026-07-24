package mcframe.serverMABG.MABGL0390;

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
import mcframe.serverMABG.MABGL0390.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_RptKeyReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_RptKeyReg_MC extends MABGL_RptKeyReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * RptKey_UpdChk01オペレーション.<p>
	 *
	 * 原価レポートキーマスタの登録前のチェックを行います。<br>
	 */
	public class RptKey_UpdChk01 extends MABGL_RptKeyReg_MC_A.RptKey_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(RptKey_UpdChk01_DtlR r : up0()){
				if (isNotCd(r.rpt_key_cd())){
					msgList.add(new MCMessage(r, RptKey_UpdChk01_DtlR.$rpt_key_cd, MABCL0306, 
									getLabel(r, RptKey_UpdChk01_DtlR.$rpt_key_cd), r.rpt_key_cd(), toDispGUIIndex(r)));
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
	 * RptKey_Upd01オペレーション.<p>
	 *
	 * 原価レポートキーマスタの登録を行います。<br>
	 */
	public class RptKey_Upd01 extends MABGL_RptKeyReg_MC_A.RptKey_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptKeyLcl_UpdChk01オペレーション.<p>
	 *
	 * 原価レポートキー名称マスタの登録前のチェックを行います。<br>
	 */
	public class RptKeyLcl_UpdChk01 extends MABGL_RptKeyReg_MC_A.RptKeyLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptKeyLcl_Upd01オペレーション.<p>
	 *
	 * 原価レポートキー名称マスタの登録を行います。<br>
	 */
	public class RptKeyLcl_Upd01 extends MABGL_RptKeyReg_MC_A.RptKeyLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptKey_DelChk01オペレーション.<p>
	 *
	 * 原価レポートキーマスタ、原価レポートキー名称マスタの削除前のチェックを行います。<br>
	 */
	public class RptKey_DelChk01 extends MABGL_RptKeyReg_MC_A.RptKey_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptKey_Del01オペレーション.<p>
	 *
	 * 原価レポートキーマスタ、原価レポートキー名称マスタの削除を行います。<br>
	 */
	public class RptKey_Del01 extends MABGL_RptKeyReg_MC_A.RptKey_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価レポートキーマスタ、原価レポートキー名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_RptKeyReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価レポートキーマスタ、原価レポートキー名称マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABGL_RptKeyReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価レポートキーマスタ、原価レポートキー名称マスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_RptKeyReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}