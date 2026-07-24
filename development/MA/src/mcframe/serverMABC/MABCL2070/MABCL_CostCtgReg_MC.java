package mcframe.serverMABC.MABCL2070;

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
import mcframe.serverMABC.MABCL2070.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_CostCtgReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_CostCtgReg_MC extends MABCL_CostCtgReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * CostCtg_UpdChk01オペレーション.<p>
	 *
	 * 原価品群マスタの登録前のチェックを行います。<br>
	 */
	public class CostCtg_UpdChk01 extends MABCL_CostCtgReg_MC_A.CostCtg_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override		
		protected void putListLogicCheckBind() {		
			super.putListLogicCheckBind();	
			// 条件付リストロジックチェックの処理	
			ListLogicBind actDptBind = getListLogicBind(up0(), CostCtg_UpdChk01_DtlR.$itm_grp_cd);	
			actDptBind.putBind(mcframe.commonMAUA.MAUAC0010.MAUAC_List.ItmGrpCols.$i_itm_grp_typ, CostCtg_UpdChk01_DtlR.$itm_grp_typ);	
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			for(CostCtg_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.ctg_cd())){
					msgL.add(new MCMessage(row, CostCtg_UpdChk01_DtlR.$ctg_cd, MABCL0306, 
									getLabel(row, CostCtg_UpdChk01_DtlR.$ctg_cd), row.ctg_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				if (MAC_CTG_CONFIG_TYP.isITM_JNL(row.ctg_config_typ())) {
					msgL.addAll(check(row, CostCtg_UpdChk01_DtlR.$itm_jnl_cd, new FXUCL_RequiredValidater()));
				}
				if (!isNull(row.itm_grp_typ())) {
					msgL.addAll(check(row, CostCtg_UpdChk01_DtlR.$itm_grp_cd, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (!MAC_CTG_CONFIG_TYP.isITM_JNL(row.ctg_config_typ())) {
					if (!isNull(row.itm_jnl_cd())) {
						msgL.add(new MCMessage(row, CostCtg_UpdChk01_DtlR.$itm_jnl_cd, MABCL0138, toDispGUIIndex(row)));
					}
				}
				if (!MAC_CTG_CONFIG_TYP.isITM_GRP1(row.ctg_config_typ())
					&& !MAC_CTG_CONFIG_TYP.isITM_GRP2(row.ctg_config_typ())
					&& !MAC_CTG_CONFIG_TYP.isITM_GRP3(row.ctg_config_typ())
					&& !MAC_CTG_CONFIG_TYP.isITM_GRP4(row.ctg_config_typ())
					&& !MAC_CTG_CONFIG_TYP.isITM_GRP5(row.ctg_config_typ())
					&& !MAC_CTG_CONFIG_TYP.isITM_GRP6(row.ctg_config_typ())
					&& !MAC_CTG_CONFIG_TYP.isITM_GRP7(row.ctg_config_typ())
					&& !MAC_CTG_CONFIG_TYP.isITM_GRP8(row.ctg_config_typ())
					&& !MAC_CTG_CONFIG_TYP.isITM_GRP9(row.ctg_config_typ())
					&& !MAC_CTG_CONFIG_TYP.isITM_GRP10(row.ctg_config_typ())) {
					if (!isNull(row.itm_grp_cd())) {
						msgL.add(new MCMessage(row, CostCtg_UpdChk01_DtlR.$itm_grp_cd, MABCL0140, toDispGUIIndex(row)));
					}
				}
			}
			return msgL;
		}
	}
		
	/**
	 * CostCtg_Upd01オペレーション.<p>
	 *
	 * 原価品群マスタの登録を行います。<br>
	 */
	public class CostCtg_Upd01 extends MABCL_CostCtgReg_MC_A.CostCtg_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostCtgLcl_UpdChk01オペレーション.<p>
	 *
	 * 原価品群名称マスタの登録前のチェックを行います。<br>
	 */
	public class CostCtgLcl_UpdChk01 extends MABCL_CostCtgReg_MC_A.CostCtgLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostCtgLcl_Upd01オペレーション.<p>
	 *
	 * 原価品群名称マスタの登録を行います。<br>
	 */
	public class CostCtgLcl_Upd01 extends MABCL_CostCtgReg_MC_A.CostCtgLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostCtg_DelChk01オペレーション.<p>
	 *
	 * 原価品群マスタ、原価品群名称マスタの削除前のチェックを行います。<br>
	 */
	public class CostCtg_DelChk01 extends MABCL_CostCtgReg_MC_A.CostCtg_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostCtg_Del01オペレーション.<p>
	 *
	 * 原価品群マスタ、原価品群名称マスタの削除を行います。<br>
	 */
	public class CostCtg_Del01 extends MABCL_CostCtgReg_MC_A.CostCtg_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価品群マスタ、原価品群名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_CostCtgReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価品群マスタ、原価品群名称マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_CostCtgReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価品群マスタ、原価品群名称マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_CostCtgReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}