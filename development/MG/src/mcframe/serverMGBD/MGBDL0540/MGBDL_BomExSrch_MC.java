package mcframe.serverMGBD.MGBDL0540;

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
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import mcframe.serverMG.dbc.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.HashMap;
import java.util.Map;
import static mcframe.serverMGBD.MGBDL0540.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_BomExSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_BomExSrch_MC extends MGBDL_BomExSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価ＢＯＭ情報の検索を行います。<br>
	 */
	public class Srch01 extends MGBDL_BomExSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			batch();
			srch();
		}

		protected void batch() {
			// 正展開
			if (isSame(up0().ope(), "1")) {
				String procId = "MGPA_BOM_EX$P_BOM_EX1";
				execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null, ":calc_grp_cd, :wg_cd, :term, :itm_cd, :itm_sub1, :itm_sub2, :itm_sub3, :bom_ptn, :bom_ptn_flg, :max_hrrchy");
			}
			// 逆展開
			else {
				String procId = "MGPA_BOM_EX$P_BOM_EX2";
				execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null, ":calc_grp_cd, :wg_cd, :term, :itm_cd, :itm_sub1, :itm_sub2, :itm_sub3, :bom_ptn, :bom_ptn_flg, :max_hrrchy");
			}
		}

		protected void srch() {
			executeQuery(down0(), MGBDL0540_MGW_BOM_EX_S01(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			setExtno();
		}

		protected void setExtno() {
			Map<MCNumber, MCNumber> ext_map = new HashMap<>();
			MCNumber num = MCNumber.ONE;

			for (Srch01_RsltR r : down0()) {
				MCNumber curr_lvl = r.hrrchy();

				//ひとつ上のLEVELのext_noをpar_extnoに設定
				r.par_extno(ext_map.get(curr_lvl.subtract(1)));
				r.extno(num);
				ext_map.put(curr_lvl, num);
				num = num.add(1);
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 原価ＢＯＭ情報の詳細検索を行います。<br>
	 */
	public class Srch02 extends MGBDL_BomExSrch_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			batch();
			srch();
		}

		protected void batch() {
			String procId = "MGPA_BOM_EX$P_SET_OPER_WK";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null, ":calc_grp_cd, :wg_cd, :term, :itm_cd, :itm_sub1, :itm_sub2, :itm_sub3");
		}

		protected void srch() {
			executeQuery(down0(), MGBDL0540_MGT_ITM_S01(), up0());
			executeQuery(down1(), MGBDL0540_MGT_ITM_DTL_S01(), up0());
			executeQuery(down2(), MGBDL0540_MGT_ITM_OPER_S01(), up0());
			executeQuery(down3(), MGBDL0540_MGT_ITM_WK_S01(), up0());
			executeQuery(down4(), MGBDL0540_MGT_ITM_PURC_S01(), up0());
			executeQuery(down5(), MGBDL0540_MGT_ITM_PROC_S01(), up0());
			executeQuery(down6(), MGBDL0540_MGT_ITM_PROV_S01(), up0());
			executeQuery(down7(), MGBDL0540_MGT_ITM_SLS_S01(), up0());
			executeQuery(down8(), MGBDL0540_MGT_ITM_FIX_S01(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			editDown();
		}

		protected void editDown() {
			if (down8().isEmpty()) {
				return ;
			}

			
			for (Srch02_ItmFixR r : down8()) {
				r.cur_cd(getBaseCur().cur_cd());
				r.cur_nm(getBaseCur().cur_nm());
				r.std_upri_dec_place(getBaseCur().upri_dec_place());
			}
		}
	}

	//FMCB CUSTOM END
}