package mcframe.serverMABC.MABCL0850;

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
import mcframe.serverMABC.MABCL0850.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMABC.MABCL0850.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_SlsItmGrpReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_SlsItmGrpReg_MC extends MABCL_SlsItmGrpReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * SlsItmGrp_UpdChk01オペレーション.<p>
	 *
	 * 販売品目体系マスタの登録前のチェックを行います。<br>
	 */
	public class SlsItmGrp_UpdChk01 extends MABCL_SlsItmGrpReg_MC_A.SlsItmGrp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(SlsItmGrp_UpdChk01_DtlR r : up0()){
				if (isNotCd(r.sls_itm_grp_cd())){
					msgList.add(new MCMessage(r, SlsItmGrp_UpdChk01_DtlR.$sls_itm_grp_cd, MABCL0306, 
									getLabel(r, SlsItmGrp_UpdChk01_DtlR.$sls_itm_grp_cd), r.sls_itm_grp_cd(), toDispGUIIndex(r)));
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
	 * SlsItmGrp_Upd01オペレーション.<p>
	 *
	 * 販売品目体系マスタの登録を行います。<br>
	 */
	public class SlsItmGrp_Upd01 extends MABCL_SlsItmGrpReg_MC_A.SlsItmGrp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SlsItmGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 販売品目体系名称マスタの登録前のチェックを行います。<br>
	 */
	public class SlsItmGrpLcl_UpdChk01 extends MABCL_SlsItmGrpReg_MC_A.SlsItmGrpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SlsItmGrpLcl_Upd01オペレーション.<p>
	 *
	 * 販売品目体系名称マスタの登録を行います。<br>
	 */
	public class SlsItmGrpLcl_Upd01 extends MABCL_SlsItmGrpReg_MC_A.SlsItmGrpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 販売品目体系マスタ、販売品目体系名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_SlsItmGrpReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();

			dbTran().statement().executeQuery("MABCL0850_MAM_SLS_ITM_GRP_Query_S01",
					MABCL0850_MAM_SLS_ITM_GRP_S01(), up0(), null, null, down0());
			
			// メインの検索結果がなければ、名称マスタは検索しない
			if (down0().isEmpty()) {
				return;
			}

			dbTran().statement().executeQuery("MABCL0850_MAM_SLS_ITM_GRP_LCL_Query_S01",
					MABCL0850_MAM_SLS_ITM_GRP_LCL_S01(), up0(), null, null, down1());
		}

		protected void editUp() {
			up0().setStringNE("del_flg_false", toFalseStr(up0().del_flg()));
		}

		@Override
		protected void down() {
			// 何もしない
			setFuncNm(down0());
			setFuncNm(down1());
			
			// ロケールの名称設定
			for (Srch01_Rslt2R r : down1()) {
				putNameNE(r, "lcl_cd", "lcl_nm");
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 販売品目体系マスタ、販売品目体系名称マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_SlsItmGrpReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SlsItmGrp_DelChk01オペレーション.<p>
	 *
	 * 販売品目体系マスタ、販売品目体系マスタ(ロケール別情報)を削除する前のチェックを行う<br>
	 */
	public class SlsItmGrp_DelChk01 extends MABCL_SlsItmGrpReg_MC_A.SlsItmGrp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SlsItmGrp_Del01オペレーション.<p>
	 *
	 * 販売品目体系マスタ、販売品目体系マスタ(ロケール別情報)を削除する<br>
	 */
	public class SlsItmGrp_Del01 extends MABCL_SlsItmGrpReg_MC_A.SlsItmGrp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理を行う<br>
	 */
	public class Del01 extends MABCL_SlsItmGrpReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}