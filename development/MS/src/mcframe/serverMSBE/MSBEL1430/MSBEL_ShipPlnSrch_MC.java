package mcframe.serverMSBE.MSBEL1430;

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
import static mcframe.serverMSBE.MSBEL1430.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ShipPlnSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ShipPlnSrch_MC extends MSBEL_ShipPlnSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 出荷計画を検索する。<br>
	 */
	public class Srch01 extends MSBEL_ShipPlnSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editCnd();

			MCList<Srch01_RsltR> rsltL = MCList.create(Srch01_RsltR.class);
			executeQuery(rsltL, MSBEL1430_MST_SHIP_SCHD_S01(), up0());

			if (!rsltL.isEmpty()) {
				for (MCList<Srch01_RsltR> l : rsltL.groupList(
						Srch01_RsltR.$lg_grp_cd,
						Srch01_RsltR.$lg_grp_nm,
						Srch01_RsltR.$ship_schd_dt,
						Srch01_RsltR.$ship_schd_hm,
						Srch01_RsltR.$dlv_schd_dt,
						Srch01_RsltR.$dlv_schd_hm,
						Srch01_RsltR.$ship_wk_cd,
						Srch01_RsltR.$ship_wk_nm)) {
					Srch01_RsltR newR = l.get(0).clone();
					for (Srch01_RsltR r : l) {
						if (isSame(r.pr_sts_typ(),"1")) {
							newR.not_inst_ship_to_cnt(r.cnt());
							newR.not_inst_d_cnt(r.d_cnt());
							newR.not_inst_wt(r.wt());
							newR.not_inst_dim(r.dim());
						}
						else {
							newR.inst_ship_to_cnt(r.cnt());
							newR.inst_d_cnt(r.d_cnt());
							newR.inst_wt(r.wt());
							newR.inst_dim(r.dim());
						}
					}
					down0().add(newR);
				}
			}
		}
		
		protected void editCnd() {
			// 出荷可能のみの条件編集
			if (up0().ship_abl_only_flg()) {
				up0().addStringColumn("ship_abl_only_flg_str", toTrueStr(up0().ship_abl_only_flg()));
			}
			// 引当状況に関する条件編集
			if (up0().not_alloc_flg() && up0().part_alloc_flg() && up0().all_alloc_flg() && up0().alloc_invalid_flg()) {
			}
			else {
				up0().addStringColumn("not_alloc_flg_str", MCBooleanUtil.booleanToDBString(up0().not_alloc_flg()));
				up0().addStringColumn("part_alloc_flg_str", MCBooleanUtil.booleanToDBString(up0().part_alloc_flg()));
				up0().addStringColumn("all_alloc_flg_str", MCBooleanUtil.booleanToDBString(up0().all_alloc_flg()));
				up0().addStringColumn("alloc_invalid_flg_str", MCBooleanUtil.booleanToDBString(up0().alloc_invalid_flg()));
			}
		}
	}

	//FMCB CUSTOM END
}