package mcframe.serverMSBC.MSBCL1070;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverMSBC.MSBCL1070.Query.*;
import static mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_MfgInstPrSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_MfgInstPrSrch_MC extends MSBCL_MfgInstPrSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 指図、工程、出来高の粒度で進捗を照会する。<br>
	 */
	public class Srch01 extends MSBCL_MfgInstPrSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			editUp();
			MCQueryPlan sql = null;

			// ヘッダ
			if (isSame(up0().disp_unit1(), "HDR")) {
				// 指図
				if (isSame(up0().disp_unit2(), "INST")) {
					sql = MSBCL1070_MST_MFG_INST_S01();
				}
				// 実績
				else {
					sql = MSBCL1070_MST_MFG_ACT_S01();
				}
			}
			// 工程
			else if(isSame(up0().disp_unit1(), "OPER")) {
				// 指図
				if (isSame(up0().disp_unit2(), "INST")) {
					sql = MSBCL1070_MST_OPER_INST_S01();
				}
				// 実績
				else {
					sql = MSBCL1070_MST_OPER_ACT_S01();
				}
			}
			// 出来高
			else {
				// 指図
				if (isSame(up0().disp_unit2(), "INST")) {
					sql = MSBCL1070_MST_YIELD_SCHD_S01();
				}
				// 実績
				else {
					sql = MSBCL1070_MST_YIELD_ACT_S01();
				}
			}
			searchForDL(sql, up0(), down0());
		}
		
		protected void editUp() {
			if (up0().tmp_sts_sav_flg()) {
				up0().addStringColumn("tmp_sts_sav_str", MSC_MFG_STS_TYP.SAV.value());
			}
			if (up0().tmp_sts_ord_flg()) {
				up0().addStringColumn("tmp_sts_ord_str", MSC_MFG_STS_TYP.ORD.value());
			}
			if (up0().tmp_sts_stt_flg()) {
				up0().addStringColumn("tmp_sts_stt_str", MSC_MFG_STS_TYP.STT.value());
			}
			if (up0().tmp_sts_cmpl_flg()) {
				up0().addStringColumn("tmp_sts_cmpl_str", MSC_MFG_STS_TYP.CMPL.value());
			}
			if (!up0().abort_flg()) {
				up0().addStringColumn("tmp_abort_flg_str", toFalseStr(false));
			}
			if (up0().inc_yield_oper_flg()) {
				up0().addStringColumn("tmp_yield_oper_flg_str", toTrueStr(true));
			}
			if (up0().unschd_act_flg() && !up0().not_unschd_act_flg()) {
				up0().addStringColumn("tmp_unschd_act_flg_str", toTrueStr(true));
			} else if (!up0().unschd_act_flg() && up0().not_unschd_act_flg()) {
				up0().addStringColumn("tmp_unschd_act_flg_str", toFalseStr(false));
			}
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_RsltR r : down0()) {
				// 外注FLG
				if (MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ())) {
					r.outsrc_flg(true);
				}
				// 指図かつ工程、または指図かつ出来高の場合
				if(isSame(up0().disp_unit2(), "INST") && isSame(up0().disp_unit1(), "OPER")) {
					// 工程単位指図数の計算
					calcOperNum(r);
				}
			}
		}
		
		protected void calcOperNum(Srch01_RsltR r) {
			// 工程単位数量
			if (!isNull(r.getNumber("oper_base_unit_qty"))) {
				MCNumber operUnitQty = convQtyBaseToOper(r.getNumber("oper_base_unit_qty"),
						r.oper_conv_qty(), r.oper_std_qty(), r.oper_unit_dec_place(),
						r.oper_unit_conv_rnd_typ());
				r.oper_unit_qty(operUnitQty);
			}
			
			// 工程単位予定数量
			if (!isNull(r.base_unit_ord_qty())) {
				MCNumber operUnitSchdQty = convQtyBaseToOper(r.base_unit_ord_qty(),
						r.oper_conv_qty(), r.oper_std_qty(), r.oper_unit_dec_place(),
						r.oper_unit_conv_rnd_typ());
				r.oper_unit_schd_qty(operUnitSchdQty);
			}
			
			// 工程単位残数量
			if (!isNull(r.getNumber("oper_base_unit_rem_qty"))) {
				MCNumber operUnitRemQty = convQtyBaseToOper(r.getNumber("oper_base_unit_rem_qty"),
						r.oper_conv_qty(), r.oper_std_qty(), r.oper_unit_dec_place(),
						r.oper_unit_conv_rnd_typ());
				r.oper_unit_rem_qty(operUnitRemQty);
			}
		}
	}

	//FMCB CUSTOM END
}