package mcframe.serverMABG.MABGL0360;

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
import mcframe.serverMABG.MABGL0360.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.commonCore.container.MCRow.Status;
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_CostIoConfigReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_CostIoConfigReg_MC extends MABGL_CostIoConfigReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * CostIoConfig_UpdChk01オペレーション.<p>
	 *
	 * 原価個別受払表構成マスタの登録前のチェックを行います。<br>
	 */
	public class CostIoConfig_UpdChk01 extends MABGL_CostIoConfigReg_MC_A.CostIoConfig_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(CostIoConfig_UpdChk01_DtlR r : up0()){
				if (isNotCd(r.io_col_cd())){
					msgList.add(new MCMessage(r, CostIoConfig_UpdChk01_DtlR.$io_col_cd, MABCL0306, 
									getLabel(r, CostIoConfig_UpdChk01_DtlR.$io_col_cd), r.io_col_cd(), toDispGUIIndex(r)));
					continue;
				}
				if (r.del_flg()) {
					continue ;
				}
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 個別チェック
				if (!MAC_IO_TGT_TYP.is_slip(r.io_tgt_typ())) {
					if (!MAC_IO_SML_TYP.isIO_TGT(r.io_sml_typ())) {
						msgList.add(new MCMessage(r, null, MABGL0124,
								r.cost_io_id(),
								r.io_col_cd(),
								r.io_tgt_typ(),
								toDispGUIIndex(r)));
					}
				}
				if(MAC_IO_TGT_TYP.isAVE(r.io_tgt_typ())){
					if (!MAC_BAL_CALC_TYP.isNON(r.bal_calc_typ())) {
						msgList.add(new MCMessage(r, null, MABGL0125,
								r.cost_io_id(),
								r.io_col_cd(),
								toDispGUIIndex(r)));
					}
				}
			}
			return msgList;
		}
	}
	/**
	 * CostIoConfig_Upd01オペレーション.<p>
	 *
	 * 原価個別受払表構成マスタの登録を行います。<br>
	 */
	public class CostIoConfig_Upd01 extends MABGL_CostIoConfigReg_MC_A.CostIoConfig_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostIoConfigLcl_UpdChk01オペレーション.<p>
	 *
	 * 原価個別受払表構成名称マスタの登録前のチェックを行います。<br>
	 */
	public class CostIoConfigLcl_UpdChk01 extends MABGL_CostIoConfigReg_MC_A.CostIoConfigLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostIoConfigLcl_Upd01オペレーション.<p>
	 *
	 * 原価個別受払表構成名称マスタの登録を行います。<br>
	 */
	public class CostIoConfigLcl_Upd01 extends MABGL_CostIoConfigReg_MC_A.CostIoConfigLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostIoConfig_DelChk01オペレーション.<p>
	 *
	 * 原価個別受払表構成マスタ、原価個別受払表構成名称マスタの削除前のチェックを行います。<br>
	 */
	public class CostIoConfig_DelChk01 extends MABGL_CostIoConfigReg_MC_A.CostIoConfig_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostIoConfig_Del01オペレーション.<p>
	 *
	 * 原価個別受払表構成マスタ、原価個別受払表構成名称マスタの削除を行います。<br>
	 */
	public class CostIoConfig_Del01 extends MABGL_CostIoConfigReg_MC_A.CostIoConfig_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価個別受払表構成マスタ、原価個別受払表構成名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_CostIoConfigReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価個別受払表構成マスタ、原価個別受払表構成名称マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABGL_CostIoConfigReg_MC_A.Upd01 {
		@Override
		protected void call() {
			beforCall(up0());
			super.call();
		}

		/**
		 * 登録データの加工
		 */
		private void beforCall(MCList<CostIoConfig_UpdChk01_DtlR> up0) {
			for(CostIoConfig_UpdChk01_DtlR dtl : up0) {
				if (dtl.isStatusNone()) {
					// 表示順の変更だけのデータは、ステータスがNONEなので、MODIFYと見なす
					dtl.setStatus(Status.MODIFY);
				}
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価個別受払表構成マスタ、原価個別受払表構成名称マスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_CostIoConfigReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}