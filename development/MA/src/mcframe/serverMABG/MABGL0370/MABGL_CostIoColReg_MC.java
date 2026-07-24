package mcframe.serverMABG.MABGL0370;

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
import mcframe.serverMABG.MABGL0370.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_CostIoColReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_CostIoColReg_MC extends MABGL_CostIoColReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * CostIoCol_DelChk01オペレーション.<p>
	 *
	 * 原価個別受払表項目マスタの削除前のチェックを行います。<br>
	 */
	public class CostIoCol_DelChk01 extends MABGL_CostIoColReg_MC_A.CostIoCol_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostIoCol_Del01オペレーション.<p>
	 *
	 * 原価個別受払表項目マスタの削除を行います。<br>
	 */
	public class CostIoCol_Del01 extends MABGL_CostIoColReg_MC_A.CostIoCol_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価個別受払表項目マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_CostIoColReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			MAM_COST_IO_CONF_R cost_io_conf1 = MAM_COST_IO_CONF_R.create(MAM_COST_IO_COL_R.$COST_IO_CONF1);
			builder.addSelect(cost_io_conf1.io_sml_typ);
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価個別受払表項目マスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_CostIoColReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostIoCol_UpdChk01オペレーション.<p>
	 *
	 * 原価個別受払表項目マスタの登録前のチェックを行います。<br>
	 */
	public class CostIoCol_UpdChk01 extends MABGL_CostIoColReg_MC_A.CostIoCol_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();
			MCList<CostIoCol_UpdChk01_DtlR> notErrL = getChkList(up0());
			for (CostIoCol_UpdChk01_DtlR r : notErrL) {
				if (r.del_flg()) {
					continue ;
				}

				// 条件付必須チェック
				if (MAC_IO_SML_TYP.isAC_RSN(r.io_sml_typ())) {
					msgList.addAll(check(r, CostIoCol_UpdChk01_DtlR.$ac_rsn_cd, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (!MAC_IO_SML_TYP.isAC_RSN(r.io_sml_typ())) {
					if (!isNull(r.ac_rsn_cd())) {
						msgList.add(new MCMessage(r, null, MABGL0123,
								r.cost_io_id(),
								r.io_col_cd(), toDispGUIIndex(r)));
					}
				}
			}
			return msgList;
		}
	}
	/**
	 * CostIoCol_Upd01オペレーション.<p>
	 *
	 * 原価個別受払表項目マスタの登録を行います。<br>
	 */
	public class CostIoCol_Upd01 extends MABGL_CostIoColReg_MC_A.CostIoCol_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価個別受払表項目マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABGL_CostIoColReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}