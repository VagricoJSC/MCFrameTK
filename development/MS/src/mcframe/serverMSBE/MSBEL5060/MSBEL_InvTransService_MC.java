package mcframe.serverMSBE.MSBEL5060;

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
import mcframe.serverMSBE.MSBEL5060.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMAUC.MAUCL0140.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL5060.Query.*;
import java.util.ArrayList;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_InvTransService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_InvTransService_MC extends MSBEL_InvTransService_MC_A{
	//FMCB CUSTOM START

	/**
	 * InvTrans_Srch01オペレーション.<p>
	 *
	 * 在庫発生基準で検索する<br>
	 */
	public class InvTrans_Srch01 extends MSBEL_InvTransService_MC_A.InvTrans_Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
			beforeSearchForBizDatDLCmn(up0());
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editCnd(up0());
			crtBomWk(up0());
			crtWk(up0(), MSC_IO_SCHD_TGT_TYP.ACCRUAL.value());
			getCache(up0());
			searchForDL(getQuery(up0()), up0(), down1(), getGrpCols(up0()).toArray(new String[0]));
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			if (down1().isEmpty()) return;
			extSS(up0(), down1());
			if (down1().isEmpty()) return;
			sortDown(up0(), down1());
			setKeyGrpNo(up0(), down1());
			if (up0().srch_flg()) {
				sumDown(up0(), down1());
				sortDown(up0(), down1());
			}
			else {
				calcStkQty(up0(), down1());
				calcAmt(up0(), down1());
				sumDown(up0(), down1());
				sortDown(up0(), down1());
				setDown(up0(), down0(), down1());
			}
		}
	}
	/**
	 * InvTrans_Srch02オペレーション.<p>
	 *
	 * 資産発生基準で検索する<br>
	 */
	public class InvTrans_Srch02 extends MSBEL_InvTransService_MC_A.InvTrans_Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
			beforeSearchForBizDatDLCmn(up0());
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editCnd(up0());
			crtBomWk(up0());
			crtWk(up0(), MSC_IO_SCHD_TGT_TYP.ACCPT.value());
			getCache(up0());
			searchForDL(getQuery(up0()), up0(), down1(), getGrpCols(up0()).toArray(new String[0]));
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			if (down1().isEmpty()) return;
			extSS(up0(), down1());
			if (down1().isEmpty()) return;
			sortDown(up0(), down1());
			setKeyGrpNo(up0(), down1());
			if (up0().srch_flg()) {
				sumDown(up0(), down1());
				sortDown(up0(), down1());
			}
			else {
				calcStkQty(up0(), down1());
				calcAmt(up0(), down1());
				sumDown(up0(), down1());
				sortDown(up0(), down1());
				setDown(up0(), down0(), down1());
			}
		}
	}
	/**
	 * InvTrans_Srch03オペレーション.<p>
	 *
	 * 使用可能日基準で検索する<br>
	 */
	public class InvTrans_Srch03 extends MSBEL_InvTransService_MC_A.InvTrans_Srch03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
			beforeSearchForBizDatDLCmn(up0());
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editCnd(up0());
			crtBomWk(up0());
			crtWk(up0(), MSC_IO_SCHD_TGT_TYP.AVL.value());
			getCache(up0());
			searchForDL(getQuery(up0()), up0(), down1(), getGrpCols(up0()).toArray(new String[0]));
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			if (down1().isEmpty()) return;
			extSS(up0(), down1());
			if (down1().isEmpty()) return;
			sortDown(up0(), down1());
			setKeyGrpNo(up0(), down1());
			if (up0().srch_flg()) {
				sumDown(up0(), down1());
				sortDown(up0(), down1());
			}
			else {
				calcStkQty(up0(), down1());
				calcAmt(up0(), down1());
				sumDown(up0(), down1());
				sortDown(up0(), down1());
				setDown(up0(), down0(), down1());
			}
		}
	}
	/**
	 * InvTrans_Srch04オペレーション.<p>
	 *
	 * 在庫発生基準で検索する（シミュレーション用）<br>
	 */
	public class InvTrans_Srch04 extends MSBEL_InvTransService_MC_A.InvTrans_Srch04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
			beforeSearchForBizDatDLCmn(up0());
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editCnd(up0());
			crtBomWk(up0());
			crtWk(up0(), MSC_IO_SCHD_TGT_TYP.ACCRUAL.value());
			crtSimWk(up0(), MSC_IO_SCHD_TGT_TYP.ACCRUAL.value());
			getCache(up0());
			searchForDL(getQuery(up0()), up0(), down1(), getGrpCols(up0()).toArray(new String[0]));
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			if (down1().isEmpty()) return;
			extSS(up0(), down1());
			if (down1().isEmpty()) return;
			sortDown(up0(), down1());
			setKeyGrpNo(up0(), down1());
			if (up0().srch_flg()) {
				sumDown(up0(), down1());
				sortDown(up0(), down1());
			}
			else {
				calcStkQty(up0(), down1());
				calcAmt(up0(), down1());
				sumDown(up0(), down1());
				sortDown(up0(), down1());
				setDown(up0(), down0(), down1());
			}
		}
	}
	/**
	 * InvTrans_Srch05オペレーション.<p>
	 *
	 * 資産発生基準で検索する（シミュレーション用）<br>
	 */
	public class InvTrans_Srch05 extends MSBEL_InvTransService_MC_A.InvTrans_Srch05 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
			beforeSearchForBizDatDLCmn(up0());
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editCnd(up0());
			crtBomWk(up0());
			crtWk(up0(), MSC_IO_SCHD_TGT_TYP.ACCPT.value());
			crtSimWk(up0(), MSC_IO_SCHD_TGT_TYP.ACCPT.value());
			getCache(up0());
			searchForDL(getQuery(up0()), up0(), down1(), getGrpCols(up0()).toArray(new String[0]));
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			if (down1().isEmpty()) return;
			extSS(up0(), down1());
			if (down1().isEmpty()) return;
			sortDown(up0(), down1());
			setKeyGrpNo(up0(), down1());
			if (up0().srch_flg()) {
				sumDown(up0(), down1());
				sortDown(up0(), down1());
			}
			else {
				calcStkQty(up0(), down1());
				calcAmt(up0(), down1());
				sumDown(up0(), down1());
				sortDown(up0(), down1());
				setDown(up0(), down0(), down1());
			}
		}
	}
	/**
	 * InvTrans_Srch06オペレーション.<p>
	 *
	 * 使用可能日基準で検索する（シミュレーション用）<br>
	 */
	public class InvTrans_Srch06 extends MSBEL_InvTransService_MC_A.InvTrans_Srch06 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
			beforeSearchForBizDatDLCmn(up0());
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editCnd(up0());
			crtBomWk(up0());
			crtWk(up0(), MSC_IO_SCHD_TGT_TYP.AVL.value());
			crtSimWk(up0(), MSC_IO_SCHD_TGT_TYP.AVL.value());
			getCache(up0());
			searchForDL(getQuery(up0()), up0(), down1(), getGrpCols(up0()).toArray(new String[0]));
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			if (down1().isEmpty()) return;
			extSS(up0(), down1());
			if (down1().isEmpty()) return;
			sortDown(up0(), down1());
			setKeyGrpNo(up0(), down1());
			if (up0().srch_flg()) {
				sumDown(up0(), down1());
				sortDown(up0(), down1());
			}
			else {
				calcStkQty(up0(), down1());
				calcAmt(up0(), down1());
				sumDown(up0(), down1());
				sortDown(up0(), down1());
				setDown(up0(), down0(), down1());
			}
		}
	}

	protected void beforeSearchForBizDatDLCmn(CndR up0) {
		up0.gr_prcd_flg(true);
		up0.gr_sts_opn_grp_flg(true);
		up0.gr_sts_ordsav_grp_flg(true);
		up0.gr_sts_fix_grp_flg(true);
		up0.gr_sts_schd_grp_flg(true);
		up0.gr_sts_ord_grp_flg(true);
		up0.gr_act_flg(false);
		up0.gi_prcd_flg(true);
		up0.gi_sts_opn_grp_flg(true);
		up0.gi_sts_ordsav_grp_flg(true);
		up0.gi_sts_fix_grp_flg(true);
		up0.gi_sts_schd_grp_flg(true);
		up0.gi_sts_ord_grp_flg(true);
		up0.gi_act_flg(false);
//		up0.dt_fr();
//		up0.dt_to();
		up0.missing_flg(false);
//		up0.sim_mrp_no();
		up0.sim_flg(false);
//		up0.purc_dt_fr();
//		up0.purc_dt_to();
		up0.tgt_ver_flg(true);
		up0.non_ver_flg(true);
		up0.non_cmpl_ver_flg(false);
		up0.alloc_gi_flg(false);
		up0.itm_grp_flg1(true);
		up0.itm_grp_flg2(true);
		up0.itm_grp_flg3(true);
		up0.itm_grp_flg4(true);
		up0.itm_grp_flg5(true);
		up0.itm_grp_flg6(true);
		up0.itm_grp_flg7(true);
		up0.itm_grp_flg8(true);
		up0.itm_grp_flg9(true);
		up0.itm_grp_flg10(true);
//		up0.sum_unit_typ();
		up0.sno1_flg(true);
		up0.sno2_flg(true);
		up0.sno3_flg(true);
		up0.sno4_flg(true);
		up0.dtl_flg(true);
		up0.srch_flg(false);
		up0.amt_flg(false);
	}

	protected void editCnd(CndR up0) {
		up0.addDateColumn("tmp_dt_to", up0.dt_to());

		MCDate ac_ym = nvl(getCloseInfo(up0), minDate());
		up0.ac_ym(ac_ym);
		up0.ac_dt(MAUCL_DateUtil.getYmEndDt(ac_ym));
		up0.st_dt(up0.dt_fr().addDay(-1));

		if (up0.gr_act_flg() || up0.gi_act_flg()) {
			up0.srch_dt_to(up0.dt_to());
		}
		else {
			up0.srch_dt_to(up0.st_dt());
		}

		if (up0.non_cmpl_ver_flg()) {
			if (isNull(up0.purc_dt_fr())) {
				up0.purc_dt_fr(minDate());
			}
			if (isNull(up0.purc_dt_to())) {
				up0.purc_dt_to(maxDate());
			}
			up0.addStringColumn("cmpl_flg_str", "0");
		}
		else {
			if (!isNullAnd(up0.purc_dt_fr(), up0.purc_dt_to())) {
				up0.addStringColumn("cmpl_flg_str", "1");
			}
			if (!isNull(up0.purc_dt_fr()) && isNull(up0.purc_dt_to())) {
				up0.purc_dt_to(maxDate());
			}
			if (isNull(up0.purc_dt_fr()) && !isNull(up0.purc_dt_to())) {
				up0.purc_dt_fr(minDate());
			}
		}

		up0.addStringColumn("ver_flg", booleanToString(up0.tgt_ver_flg(), up0.non_ver_flg()));

		// 手配ＮＯ管理区分：管理する（任意：在庫対象外）の場合は検索条件を使用しない
		if (!isNull(up0.itm_cd()) && !isNullAnd(up0.sno1(), up0.sno2(), up0.sno3(), up0.sno4())) {
			MAM_ITM_R itm = MAM_ITM_R.create();
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itm_bldr = MCQueryApiBuilder.create(t);
			itm_bldr.setSelect(t.sno1_mng_typ, t.sno2_mng_typ, t.sno3_mng_typ, t.sno4_mng_typ);
			itm_bldr.setWhere(t.itm_cd.eq(bind("itm_cd"))
					.and(t.itm_sub1.eq(bind("itm_sub1")))
					.and(t.itm_sub2.eq(bind("itm_sub2")))
					.and(t.itm_sub3.eq(bind("itm_sub3"))));
			dbSelect("MSBEL5060_MAM_ITM_S01", itm, itm_bldr, up0);
			if (!isNull(up0.sno1()) && MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno1_mng_typ())) {
				up0.sno1(MAC_STR.NULL_VAL.value());
			}
			if (!isNull(up0.sno2()) && MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno2_mng_typ())) {
				up0.sno2(MAC_STR.NULL_VAL.value());
			}
			if (!isNull(up0.sno3()) && MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno3_mng_typ())) {
				up0.sno3(MAC_STR.NULL_VAL.value());
			}
			if (!isNull(up0.sno4()) && MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno4_mng_typ())) {
				up0.sno4(MAC_STR.NULL_VAL.value());
			}
		}
		up0.addStringColumn("quality_typ1");
		up0.addStringColumn("quality_typ2");
		if (MAC_QUALITY_TYP.isGOOD(up0.quality_typ())) {
			up0.setStringNE("quality_typ1", up0.quality_typ());
		}
		else {
			up0.setStringNE("quality_typ2", up0.quality_typ());
		}
	}

	protected MCDate getCloseInfo(CndR up0) {

		MST_CLOSE_R dbc = MST_CLOSE_R.create();
		MST_CLOSE_R t = MST_CLOSE_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.addMax(t.ym, "ym");
		dbc_bldr.addWhereWithAnd(t.stk_cl_flg.eq(value(true)));
		dbc_bldr.addWhereWithAnd(MAPA_DT$F_GET_YM_END_DT_NE2(t.ym, bind("cl_day"), bind("cl_mon_base")).lt(bind("dt_fr")));
		up0.addNumberColumn("cl_day", getCo().ac_cl_day());
		up0.addNumberColumn("cl_mon_base", getCo().ac_cl_mon_base());
		dbSelect("MSBEL5060_MST_CLOSE_S01", dbc, dbc_bldr, up0);

		return dbc.ym();
	}

	protected MCDate maxDate() {
		return MCDate.valueOf("29991231235959","yyyyMMddHHmmss");
	}

	protected MCDate minDate() {
		return MCDate.valueOf("19000101000000","yyyyMMddHHmmss");
	}

	/**
	* 引数のboolean値の内容によりＤＢのＦＬＧを返す.<br>
	* 
	* @param flg0 比較対象値
	* @param flg1 比較対象値
	* @return flg0=true/flg1=falseの場合'0'、flg0=false/flg1=trueの場合'1'。以外、null
	*/
	protected String booleanToString(boolean flg0, boolean flg1) {
		if (flg0 && !flg1) {
			return MCBooleanUtil.booleanToDBString(true);
		}
		else if (!flg0 && flg1) {
			return MCBooleanUtil.booleanToDBString(false);
		}
		else {
			return null;
		}
	}

	protected void crtBomWk(CndR up0) {
		if (isBomSrch(up0)) {
			// MAW_BOM_EXを作成する
			up0.addBooleanColumn("ph_ex_flg", true);
			up0.addBooleanColumn("bom_ptn_flg", false);
			MAW_BOM_EX_R S0 = MAW_BOM_EX_R.create();
			execDbWkDelete("MSBEL5060_MAW_BOM_EX_D01", S0);
			String procId = "MAPA_BOM$P_INS_BOM_EX";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0, null, ":par_itm_cd, :par_itm_sub1, :par_itm_sub2, :par_itm_sub3, :bom_ptn, :wg_cd, :master_dt, :ph_ex_flg, :bom_ptn_flg");
		}
	}

	protected boolean isBomSrch(CndR up0) {
		return !isNullOr(up0.par_itm_cd(), up0.par_itm_sub1(), up0.par_itm_sub2(), up0.par_itm_sub3(), up0.wg_cd(), up0.bom_ptn());
	}

	protected void crtWk(CndR up0, String tgtTyp) {
		MSW_INV_TRANS_R S0 = MSW_INV_TRANS_R.create();
		execDbWkDelete("MSBEL5060_MSW_INV_TRANS_D01", S0);

		// 在庫情報取得
		crtStkWk(up0, tgtTyp);

		// 受払予定の取得
		crtSchdWk(up0, tgtTyp);

		// 受払実績の取得
		crtActWk(up0, tgtTyp);
	}

	protected void crtStkWk(CndR up0, String tgtTyp) {
		if (MSC_IO_SCHD_TGT_TYP.isDTL(tgtTyp)) {
			up0.addStringColumn("io_act_typ", MSC_IO_ACT_TYP.END_STK.value());
		}
		executeUpdate(MSBEL5060_MST_STK_I01(tgtTyp), up0);
	}

	protected void crtSchdWk(CndR up0, String tgtTyp) {

		// 先行手配
		crtSchdWk_prcd(up0, tgtTyp);

		// 未確定
		crtSchdWk_opn(up0, tgtTyp);

		// オーダ保存
		crtSchdWk_ordsav(up0, tgtTyp);

		// 受払予定の取得
		crtSchdWk_io_schd(up0, tgtTyp);
	}

	/**
	 * 先行手配のＷＫデータを作成
	 * @param up0
	 * @param tgtTyp
	 */
	protected void crtSchdWk_prcd(CndR up0, String tgtTyp) {
		if (up0.alloc_gi_flg()) {
			return;
		}
		if (!up0.gr_prcd_flg() && !up0.gi_prcd_flg()) {
			return;
		}

		up0.addBooleanColumn("tmp_prcd_flg", true);
		up0.addBooleanColumn("tmp_sim_flg", false);

		executeUpdate(MSBEL5060_MST_PRCD_IO_SCHD_I01(up0, tgtTyp), up0);
	}

	/**
	 * 未確定のＷＫデータを作成
	 * @param up0
	 * @param tgtTyp
	 */
	protected void crtSchdWk_opn(CndR up0, String tgtTyp) {
		if (up0.alloc_gi_flg()) {
			return;
		}
		// オーダ状況区分が「保存」のオーダの出庫予定は、MST_ORD_IO_SCHDに格納されている（MST_SAVORD_IO_SCHDではない）
		// ※MRPの前処理で削除するため
		// よって、出庫で保存ステータスのデータを検索する場合は、MST_ORD_IO_SCHDからデータを取得する必要がある
		if (!up0.gr_sts_opn_grp_flg() && !up0.gi_sts_opn_grp_flg() && !up0.gi_sts_ordsav_grp_flg()) {
			return;
		}

		up0.addBooleanColumn("tmp_prcd_flg", false);
		up0.addBooleanColumn("tmp_sim_flg", false);

		executeUpdate(MSBEL5060_MST_ORD_IO_SCHD_I01(up0, tgtTyp), up0);
	}

	/**
	 * オーダ保存のＷＫデータを作成
	 * @param up0
	 * @param tgtTyp
	 */
	protected void crtSchdWk_ordsav(CndR up0, String tgtTyp) {
		if (up0.alloc_gi_flg()) {
			return;
		}
		if (!up0.gr_sts_ordsav_grp_flg() && !up0.gi_sts_ordsav_grp_flg()) {
			return;
		}

		up0.addBooleanColumn("tmp_prcd_flg", false);
		up0.addBooleanColumn("tmp_sim_flg", false);

		executeUpdate(MSBEL5060_MST_SAVORD_IO_SCHD_I01(up0, tgtTyp), up0);
	}

	/**
	 * 受払予定のＷＫデータを作成
	 * @param up0
	 * @param tgtTyp
	 */
	protected void crtSchdWk_io_schd(CndR up0, String tgtTyp) {
		if (!up0.gr_sts_fix_grp_flg() && !up0.gr_sts_schd_grp_flg() && !up0.gr_sts_ord_grp_flg()
				&& !up0.gi_sts_fix_grp_flg() && !up0.gi_sts_schd_grp_flg() && !up0.gi_sts_ord_grp_flg()) {
			return;
		}

		up0.addBooleanColumn("tmp_prcd_flg", false);
		up0.addBooleanColumn("tmp_sim_flg", false);

		String fromTable = getIoSchdTable(up0, tgtTyp);
		if (up0.alloc_gi_flg()) {
			executeUpdate(MSBEL5060_MST_IO_SCHD_I01(up0, fromTable, tgtTyp, 1), up0);
			executeUpdate(MSBEL5060_MST_IO_SCHD_I01(up0, fromTable, tgtTyp, 2), up0);
			executeUpdate(MSBEL5060_MST_IO_SCHD_I01(up0, fromTable, tgtTyp, 3), up0);
			executeUpdate(MSBEL5060_MST_IO_SCHD_I01(up0, fromTable, tgtTyp, 4), up0);
			executeUpdate(MSBEL5060_MST_IO_SCHD_I01(up0, fromTable, tgtTyp, 5), up0);
		}
		else {
			executeUpdate(MSBEL5060_MST_IO_SCHD_I01(up0, fromTable, tgtTyp, 0), up0);
		}
	}


	protected String getIoSchdTable(CndR up0, String tgtTyp) {
		if (MSC_IO_SCHD_TGT_TYP.isACCRUAL(tgtTyp)) {
			return "MSVT_ACCRUAL_IO_SCHD";
		}
		else if (MSC_IO_SCHD_TGT_TYP.isACCPT(tgtTyp)) {
			return "MSVT_ACCPT_IO_SCHD";
		}
		else if (MSC_IO_SCHD_TGT_TYP.isAVL(tgtTyp)) {
			return "MSVT_AVL_IO_SCHD";
		}
		else if (MSC_IO_SCHD_TGT_TYP.isDTL(tgtTyp)) {
			return "MST_IO_SCHD";
		}
		return "MST_IO_SCHD";
	}

	protected void crtActWk(CndR up0, String tgtTyp) {
		if (!up0.gr_act_flg() && !up0.gi_act_flg()) {
			return;
		}

		executeUpdate(MSBEL5060_MST_IO_ACT_I01(up0, tgtTyp), up0);
	}

	protected void crtSimWk(CndR up0, String tgtTyp) {
		if (isNull(up0.sim_mrp_no())) {
			return;
		}

		up0.addBooleanColumn("tmp_prcd_flg", false);
		up0.addBooleanColumn("tmp_sim_flg", true);
		
		executeUpdate(MSBEL5060_MST_SIM_IO_SCHD_I01(up0, tgtTyp), up0);

	}

	protected MCQueryPlan getQuery(CndR up0) {
		MCQueryPlan sql = null;
		if (up0.dtl_flg()) {
			sql = MSBEL5060_MSW_INV_TRANS_S01(up0);
		}
		else {
			sql = MSBEL5060_MSW_INV_TRANS_S02(up0);
		}
		
		if (isBomSrch(up0)) {
			MCMainQuery main = sql.getQuery();
			MCQueryPlan bom = MSBEL5060_MAW_BOM_EX_S01(up0);
			sql.setQuery(main.unionAll(bom.toSubQuery())).addDynamicSQLInfo(bom.getDynamicSQLInfo());
		}
		
		return sql;
	}

	protected ArrayList<String> getGrpCols(CndR up0) {
		ArrayList<String> grpCols = new ArrayList<String>();
		grpCols.add(RsltR.$itm_cd);
		grpCols.add(RsltR.$itm_sub1);
		grpCols.add(RsltR.$itm_sub2);
		grpCols.add(RsltR.$itm_sub3);
		grpCols.add(RsltR.$itm_nm);
		if (MSC_SUM_UNIT_TYP.isLOC(up0.sum_unit_typ())) {
			grpCols.add(RsltR.$loc_cd);
		}
		else if (MSC_SUM_UNIT_TYP.isSITE(up0.sum_unit_typ())) {
			grpCols.add(RsltR.$site_cd);
		}
		else if (MSC_SUM_UNIT_TYP.isWG(up0.sum_unit_typ())) {
			grpCols.add(RsltR.$wg_cd);
		}
		else if (MSC_SUM_UNIT_TYP.isLG_GRP(up0.sum_unit_typ())) {
			grpCols.add(RsltR.$lg_grp_cd);
		}
		else if (MSC_SUM_UNIT_TYP.isALLOC_GRP(up0.sum_unit_typ())) {
			grpCols.add(RsltR.$alloc_grp_cd);
		}
		else if (MSC_SUM_UNIT_TYP.isLOC_GRP(up0.sum_unit_typ())) {
			grpCols.add(RsltR.$loc_grp_cd);
		}

		return grpCols;
	}

	protected void getCache(CndR up0) {
		getProvUpriCache(up0);
		getItmCache(up0);
		getTermCache(up0);
	}

	protected MCList<MAM_PROV_UPRI_R> _pu = MCList.create(MAM_PROV_UPRI_R.class);
	protected MAM_PROV_UPRI_R _pu_t = MAM_PROV_UPRI_R.create("T");
	protected MCQueryApiBuilder _pu_bldr = MCQueryApiBuilder.create(_pu_t);
	protected MCIndexKey _puIdx;
	protected void getProvUpriCache(CndR up0) {
		MAM_BP_R m = MAM_BP_R.create("M");
		MSW_INV_TRANS_R S1W = MSW_INV_TRANS_R.create("W");

		// 自給か判定するために支給品単価マスタを取得する
		_pu_bldr.addLeftOuterJoin(m,
				bracket(_pu_t.prsppl_cd.eq(m.bp_cd)
						.and(_pu_t.cur_cd.eq(m.cur_cd))));
		_pu_bldr.addWhereWithAnd(_pu_t.prov_typ.eq(value(MAC_PROV_TYP.SS.value())));
		_pu_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1W)
				.where(value(0).eq(value(0))
						.and(S1W.itm_cd.eq(_pu_t.itm_cd))
						.and(S1W.itm_sub1.eq(_pu_t.itm_sub1))
						.and(S1W.itm_sub2.eq(_pu_t.itm_sub2))
						.and(S1W.itm_sub3.eq(_pu_t.itm_sub3))
						.and(S1W.io_schd_typ.in(value(MSC_IO_SCHD_TYP.INPT_PLN.value()),
								value(MSC_IO_SCHD_TYP.INPT.value())))
						.and(S1W.io_schd_sts_typ.in(
								value(MSC_IO_SCHD_STS_TYP.OPN.value()),
								value(MSC_IO_SCHD_STS_TYP.ORD_SAV.value()))))));
		dbSelect("MSBEL5060_MAM_PROV_UPRI_S01", _pu, _pu_bldr);
		_puIdx = _pu.createIndex(MAM_PROV_UPRI_R.$wg_cd, MAM_PROV_UPRI_R.$itm_cd,
				MAM_PROV_UPRI_R.$itm_sub1, MAM_PROV_UPRI_R.$itm_sub2,
				MAM_PROV_UPRI_R.$itm_sub3, MAM_PROV_UPRI_R.$prsppl_cd);
	}

	protected MCList<MAM_ITM_R> _itm = MCList.create(MAM_ITM_R.class);
	protected MAM_ITM_R _itm_t = MAM_ITM_R.create("T");
	protected MCQueryApiBuilder _itm_bldr = MCQueryApiBuilder.create(_itm_t);
	protected MCIndexKey _itmIdx;
	protected void getItmCache(CndR up0) {
		MAM_ITM_TYP_D_R m2 = MAM_ITM_TYP_D_R.create("M2");
		MAM_ITM_GRP_R mm1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R mm2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R mm3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R mm4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R mm5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R mm6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R mm7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R mm8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R mm9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R mm10 = MAM_ITM_GRP_R.create("MM10");
		MSW_INV_TRANS_R S1W = MSW_INV_TRANS_R.create("W");
		
		if (!up0.dtl_flg()) {
			return;
		}

		_itm_bldr.setSelect(_itm_t.itm_cd, _itm_t.itm_sub1, _itm_t.itm_sub2,
				_itm_t.itm_sub3, _itm_t.itm_typ, _itm_t.itm_typ_d_cd);
		_itm_bldr.addSelect(m2.itm_typ_d_nm);
		_itm_bldr.addLeftOuterJoin(m2, bracket(_itm_t.itm_typ.eq(m2.itm_typ)
				.and(_itm_t.itm_typ_d_cd.eq(m2.itm_typ_d_cd))));

		if (up0.itm_grp_flg1()) {
			_itm_bldr.addSelect(_itm_t.itm_grp_cd1, mm1.itm_grp_nm.as("itm_grp_nm1"));
			_itm_bldr.addLeftOuterJoin(mm1, bracket(mm1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))
					.and(mm1.itm_grp_cd.eq(_itm_t.itm_grp_cd1))));
		}
		if (up0.itm_grp_flg2()) {
			_itm_bldr.addSelect(_itm_t.itm_grp_cd2, mm2.itm_grp_nm.as("itm_grp_nm2"));
			_itm_bldr.addLeftOuterJoin(mm2, bracket(mm2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))
					.and(mm2.itm_grp_cd.eq(_itm_t.itm_grp_cd2))));
		}
		if (up0.itm_grp_flg3()) {
			_itm_bldr.addSelect(_itm_t.itm_grp_cd3, mm3.itm_grp_nm.as("itm_grp_nm3"));
			_itm_bldr.addLeftOuterJoin(mm3, bracket(mm3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))
					.and(mm3.itm_grp_cd.eq(_itm_t.itm_grp_cd3))));
		}
		if (up0.itm_grp_flg4()) {
			_itm_bldr.addSelect(_itm_t.itm_grp_cd4, mm4.itm_grp_nm.as("itm_grp_nm4"));
			_itm_bldr.addLeftOuterJoin(mm4, bracket(mm4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))
					.and(mm4.itm_grp_cd.eq(_itm_t.itm_grp_cd4))));
		}
		if (up0.itm_grp_flg5()) {
			_itm_bldr.addSelect(_itm_t.itm_grp_cd5, mm5.itm_grp_nm.as("itm_grp_nm5"));
			_itm_bldr.addLeftOuterJoin(mm5, bracket(mm5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))
					.and(mm5.itm_grp_cd.eq(_itm_t.itm_grp_cd5))));
		}
		if (up0.itm_grp_flg6()) {
			_itm_bldr.addSelect(_itm_t.itm_grp_cd6, mm6.itm_grp_nm.as("itm_grp_nm6"));
			_itm_bldr.addLeftOuterJoin(mm6, bracket(mm6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))
					.and(mm6.itm_grp_cd.eq(_itm_t.itm_grp_cd6))));
		}
		if (up0.itm_grp_flg7()) {
			_itm_bldr.addSelect(_itm_t.itm_grp_cd7, mm7.itm_grp_nm.as("itm_grp_nm7"));
			_itm_bldr.addLeftOuterJoin(mm7, bracket(mm7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))
					.and(mm7.itm_grp_cd.eq(_itm_t.itm_grp_cd7))));
		}
		if (up0.itm_grp_flg8()) {
			_itm_bldr.addSelect(_itm_t.itm_grp_cd8, mm8.itm_grp_nm.as("itm_grp_nm8"));
			_itm_bldr.addLeftOuterJoin(mm8, bracket(mm8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))
					.and(mm8.itm_grp_cd.eq(_itm_t.itm_grp_cd8))));
		}
		if (up0.itm_grp_flg9()) {
			_itm_bldr.addSelect(_itm_t.itm_grp_cd9, mm9.itm_grp_nm.as("itm_grp_nm9"));
			_itm_bldr.addLeftOuterJoin(mm9, bracket(mm9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))
					.and(mm9.itm_grp_cd.eq(_itm_t.itm_grp_cd9))));
		}
		if (up0.itm_grp_flg10()) {
			_itm_bldr.addSelect(_itm_t.itm_grp_cd10, mm10.itm_grp_nm.as("itm_grp_nm10"));
			_itm_bldr.addLeftOuterJoin(mm10, bracket(mm10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))
					.and(mm10.itm_grp_cd.eq(_itm_t.itm_grp_cd10))));
		}
		_itm_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1W)
				.where(value(0).eq(value(0))
						.and(S1W.itm_cd.eq(_itm_t.itm_cd))
						.and(S1W.itm_sub1.eq(_itm_t.itm_sub1))
						.and(S1W.itm_sub2.eq(_itm_t.itm_sub2))
						.and(S1W.itm_sub3.eq(_itm_t.itm_sub3)))));
		dbSelect("MSBEL5060_MAM_ITM_S02", _itm, _itm_bldr);
		_itmIdx = _itm.createIndex(MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1,
				MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
	}

	protected MCList<MAM_TERM_R> _term = MCList.create(MAM_TERM_R.class);
	protected MAM_TERM_R _term_t = MAM_TERM_R.create("T");
	protected MCQueryApiBuilder _term_bldr = MCQueryApiBuilder.create(_term_t);
	protected void getTermCache(CndR up0) {
		if (!up0.amt_flg()) {
			return;
		}
		_term_bldr.setSelect(_term_t.term, _term_t.term_end_ym);
		_term_bldr.setWhere(_term_t.term.lte(bind("dt_to"))
				.and(_term_t.term_end_ym.gt(bind("ac_dt"))), up0);
		_term_bldr.setOrderByAsc(_term_t.term);
		dbSelect("MSBEL5060_MAM_TERM_S01", _term, _term_bldr);
	}

	protected MCDate getDtOfTerm(MCDate dt) {
		for (MAM_TERM_R r : _term) {
			if (!isNull(dt) && dt.gteDate(r.term()) && dt.ltDate(r.term_end_ym())) {
				return r.term();
			}
		}
		return dt;
	}
	protected void extSS(CndR up0, MCList<RsltR> down) {

		MCList<RsltR> list = MCList.create(RsltR.class);
		for (RsltR r :down) {
			// 自給の投入は下り電文から除く
			if (MSC_IO_SCHD_TYP.isINPT_PLN(r.io_schd_typ()) || MSC_IO_SCHD_TYP.isINPT(r.io_schd_typ())) {
				// オーダ以外は自給の投入の受払予定が作成されないのでチェックしない
				if (MSC_IO_SCHD_STS_TYP.isOPN(r.io_schd_sts_typ()) || MSC_IO_SCHD_STS_TYP.isORD_SAV(r.io_schd_sts_typ())) {
					if (!isSS(r)) {
						list.add(r);
					}
				}
				else {
					list.add(r);
				}
			}
			else {
				list.add(r);
			}
		}
		down.setAll(list);
	}

	protected boolean isSS(RsltR downR) {
		for (MAM_PROV_UPRI_R r :_pu.subList(_puIdx, downR.toArray(RsltR.$mfg_wg_cd,
				RsltR.$itm_cd, RsltR.$itm_sub1, RsltR.$itm_sub2, RsltR.$itm_sub3, RsltR.$prsppl_cd))) {
			if (r.st_dt().lte(downR.par_dt_fr()) && r.end_dt().gte(downR.par_dt_fr())) {
				return MAC_PROV_TYP.isSS(r.prov_typ());
			}
		}
		return false;
	}

	protected void sumDown(CndR up0, MCList<RsltR> down) {
		// calcStkQtyで明細ごとに在庫数量を計算しているので、まったく同じ予定・実績が複数レコードあった場合に在庫数が重複してカウントされてしまう
		// そのため、同じ予定・実績では最後の行の在庫数のみ有効とし、残りの行は0に編集する。
		ArrayList<String> keyCols = new ArrayList<String>();
		keyCols.add(RsltR.$key_grp_no);
		keyCols.add(RsltR.$dt);
		RsltR downR = RsltR.create();
		if (up0.dtl_flg()) {
			// dtl_flgがオンの場合は明細項目全てで比較する。ただし、締日、起点となる日付は1行にまとめるためキー項目のみで比較する。
			ArrayList<String> dtlKeyCols = new ArrayList<String>();
			dtlKeyCols.addAll(keyCols);
			dtlKeyCols.addAll(getDtlKey(up0));
			for (int i = down.size() - 2; i >= 0; i--) {
				downR = down.get(i);
				if (isNull(downR.dt()) || isSame(downR.dt(), up0.st_dt())) {
					if (downR.equalColumns(down.get(i + 1), keyCols.toArray(new String[0]))) {
						downR.stk_qty(MCNumber.ZERO);
						downR.stk_amt(MCNumber.ZERO);
					}
				}
				else {
					if (downR.equalColumns(down.get(i + 1), dtlKeyCols.toArray(new String[0]))) {
						downR.stk_qty(MCNumber.ZERO);
						downR.stk_amt(MCNumber.ZERO);
					}
				}
			}
		}
		else {
			for (int i = down.size() - 2; i >= 0; i--) {
				downR = down.get(i);
				if (downR.equalColumns(down.get(i + 1), keyCols.toArray(new String[0]))) {
					downR.stk_qty(MCNumber.ZERO);
					downR.stk_amt(MCNumber.ZERO);
				}
			}
		}
		MCGroupByPolicy gp = new MCGroupByPolicy();
		gp.addKey(getKeyCols(up0).toArray(new String[0]));
		gp.addKey(getAddCols(up0).toArray(new String[0]));
		gp.sum(RsltR.$gr_schd_qty);
		gp.sum(RsltR.$gi_schd_qty);
		gp.sum(RsltR.$gr_act_qty);
		gp.sum(RsltR.$gi_act_qty);
		gp.sum(RsltR.$stk_qty);
		gp.sum(RsltR.$stk_amt);

		if (up0.dtl_flg()) {
			MCList<RsltR> downTmp = down.clone();
			// 締日、起点となる日付は1行にまとめる
			if (up0.srch_flg()) {
				gp.addKey(RsltR.$str_ln_cd);
				gp.addKey(RsltR.$str_ln_nm);
				gp.addKey(RsltR.$str_ln_cd_none_flg);
			}
			down.setAll(downTmp.subList(r -> isNull(r.dt()) || isSame(r.dt(), up0.st_dt())).groupBy(gp));
			// その他の日付は明細ごとに保持する
			gp.addKey(getDtlKey(up0).toArray(new String[0]));
			down.addAll(downTmp.subList(r -> !isNull(r.dt()) && r.dt().gt(up0.st_dt())).groupBy(gp));
		}
		else {
			gp.max(RsltR.$stk_flg);
			gp.max(RsltR.$prcd_flg);
			gp.max(RsltR.$sim_flg);
			down.setAll(down.groupBy(gp));
		}
	}

	protected ArrayList<String> getDtlKey(CndR up0) {
		ArrayList<String> sumKey = new ArrayList<String>();

		sumKey.add(RsltR.$io_schd_typ); sumKey.add(RsltR.$io_schd_sts_typ);
		sumKey.add(RsltR.$trd_cd); sumKey.add(RsltR.$trd_nm); sumKey.add(RsltR.$trd_ptn_typ); sumKey.add(RsltR.$trn_typ); sumKey.add(RsltR.$io_act_typ);
		sumKey.add(RsltR.$io_typ);
		sumKey.add(RsltR.$slo_no); sumKey.add(RsltR.$slo_d_no); sumKey.add(RsltR.$po_no); sumKey.add(RsltR.$po_d_no);
		sumKey.add(RsltR.$mfg_inst_no); sumKey.add(RsltR.$oper_inst_no);
		sumKey.add(RsltR.$par_itm_cd); sumKey.add(RsltR.$par_itm_sub1); sumKey.add(RsltR.$par_itm_sub2); sumKey.add(RsltR.$par_itm_sub3); sumKey.add(RsltR.$par_itm_nm);
		sumKey.add(RsltR.$par_lot_no); sumKey.add(RsltR.$par_sublot_no);
		if (up0.sno1_flg()) sumKey.add(RsltR.$par_sno1);
		if (up0.sno2_flg()) sumKey.add(RsltR.$par_sno2);
		if (up0.sno3_flg()) sumKey.add(RsltR.$par_sno3);
		if (up0.sno4_flg()) sumKey.add(RsltR.$par_sno4);
		sumKey.add(RsltR.$par_itm_ord_no); sumKey.add(RsltR.$par_oper_ord_no); sumKey.add(RsltR.$par_dt_fr); sumKey.add(RsltR.$bom_ptn);
		sumKey.add(RsltR.$mfg_act_no); sumKey.add(RsltR.$oper_act_no);
		if(MSC_SUM_UNIT_TYP.isLOC(up0.sum_unit_typ())) {
			sumKey.add(RsltR.$str_ln_cd); sumKey.add(RsltR.$str_ln_nm); sumKey.add(RsltR.$str_ln_cd_none_flg);
		}
		sumKey.add(RsltR.$stk_flg); sumKey.add(RsltR.$prcd_flg); sumKey.add(RsltR.$sim_flg);
//		sumKey.add(RsltR.$itm_typ); sumKey.add(RsltR.$itm_typ_d_cd); sumKey.add(RsltR.$itm_typ_d_nm);
		if (up0.itm_grp_flg1()) {sumKey.add(RsltR.$itm_grp_cd1); sumKey.add(RsltR.$itm_grp_nm1);}
		if (up0.itm_grp_flg2()) {sumKey.add(RsltR.$itm_grp_cd2); sumKey.add(RsltR.$itm_grp_nm2);}
		if (up0.itm_grp_flg3()) {sumKey.add(RsltR.$itm_grp_cd3); sumKey.add(RsltR.$itm_grp_nm3);}
		if (up0.itm_grp_flg4()) {sumKey.add(RsltR.$itm_grp_cd4); sumKey.add(RsltR.$itm_grp_nm4);}
		if (up0.itm_grp_flg5()) {sumKey.add(RsltR.$itm_grp_cd5); sumKey.add(RsltR.$itm_grp_nm5);}
		if (up0.itm_grp_flg6()) {sumKey.add(RsltR.$itm_grp_cd6); sumKey.add(RsltR.$itm_grp_nm6);}
		if (up0.itm_grp_flg7()) {sumKey.add(RsltR.$itm_grp_cd7); sumKey.add(RsltR.$itm_grp_nm7);}
		if (up0.itm_grp_flg8()) {sumKey.add(RsltR.$itm_grp_cd8); sumKey.add(RsltR.$itm_grp_nm8);}
		if (up0.itm_grp_flg9()) {sumKey.add(RsltR.$itm_grp_cd9); sumKey.add(RsltR.$itm_grp_nm9);}
		if (up0.itm_grp_flg10()) {sumKey.add(RsltR.$itm_grp_cd10); sumKey.add(RsltR.$itm_grp_nm10);}
		// prsppl_cd と mfg_wg_cd は extSS で使用した後は不要なので add しない

		return sumKey;
	}

	protected ArrayList<String> getKeyCols(CndR up0) {
		ArrayList<String> keyCols = new ArrayList<String>();
		keyCols.add(RsltR.$itm_cd);
		keyCols.add(RsltR.$itm_sub1);
		keyCols.add(RsltR.$itm_sub2);
		keyCols.add(RsltR.$itm_sub3);
		keyCols.add(RsltR.$itm_nm);
		if (MSC_SUM_UNIT_TYP.isLOC(up0.sum_unit_typ())) {
			keyCols.add(RsltR.$loc_cd);
		}
		else if (MSC_SUM_UNIT_TYP.isSITE(up0.sum_unit_typ())) {
			keyCols.add(RsltR.$site_cd);
		}
		else if (MSC_SUM_UNIT_TYP.isWG(up0.sum_unit_typ())) {
			keyCols.add(RsltR.$wg_cd);
		}
		else if (MSC_SUM_UNIT_TYP.isLG_GRP(up0.sum_unit_typ())) {
			keyCols.add(RsltR.$lg_grp_cd);
		}
		else if (MSC_SUM_UNIT_TYP.isALLOC_GRP(up0.sum_unit_typ())) {
			keyCols.add(RsltR.$alloc_grp_cd);
		}
		else if (MSC_SUM_UNIT_TYP.isLOC_GRP(up0.sum_unit_typ())) {
			keyCols.add(RsltR.$loc_grp_cd);
		}
		keyCols.add(RsltR.$ver_no);
		if (up0.sno1_flg()) keyCols.add(RsltR.$sno1);
		if (up0.sno2_flg()) keyCols.add(RsltR.$sno2);
		if (up0.sno3_flg()) keyCols.add(RsltR.$sno3);
		if (up0.sno4_flg()) keyCols.add(RsltR.$sno4);

		return keyCols;
	}

	protected ArrayList<String> getAddCols(CndR up0) {
		ArrayList<String> addCols = new ArrayList<String>();
		addCols.add(RsltR.$dt);
		addCols.add(RsltR.$ver_flg);
		addCols.add(RsltR.$loc_nm);
		addCols.add(RsltR.$site_nm);
		addCols.add(RsltR.$wg_nm);
		addCols.add(RsltR.$lg_grp_nm);
		addCols.add(RsltR.$alloc_grp_nm);
		addCols.add(RsltR.$loc_grp_nm);
		addCols.add(RsltR.$base_unit_cd);
		addCols.add(RsltR.$base_unit_nm);
		addCols.add(RsltR.$base_unit_dec_place);
		addCols.add(RsltR.$key_grp_no);

		return addCols;
	}

	protected void setKeyGrpNo(CndR up0, MCList<RsltR> down) {
		if (isNull(down)) {
			return;
		}
		int no = 0;
		for (MCList<RsltR> l : down.groupList(getKeyCols(up0).toArray(new String[0]))) {
			no++;
			l.setNumber(RsltR.$key_grp_no, no);
		}
		
	}
	
	protected void sortDown(CndR up0, MCList<RsltR> down) {
		MCSortPolicy p = new MCSortPolicy();
		for (String r :getKeyCols(up0)) {
			p.add(SortType.ASC, r);
		}
		p.add(SortType.ASC_NULL_AHEAD, RsltR.$dt);
		p.add(SortType.DESC, RsltR.$stk_flg);
		p.add(SortType.ASC, RsltR.$io_typ);
		p.add(SortType.ASC, RsltR.$io_act_typ);
		p.add(SortType.ASC, RsltR.$io_schd_typ);
		p.add(SortType.ASC, RsltR.$prcd_flg);
		p.add(SortType.ASC, RsltR.$sim_flg);
		if (up0.dtl_flg()) {
			for (String r :getDtlKey(up0)) {
				p.add(SortType.ASC, r);
			}
		}
		down.sort(p);
	}

	protected void calcStkQty(CndR up0, MCList<RsltR> down) {
		ArrayList<String> copyCols = getKeyCols(up0);
		copyCols.addAll(getAddCols(up0));
		if (!copyCols.contains(RsltR.$wg_cd)) {
			copyCols.add(RsltR.$wg_cd);
		}

		MCList<RsltR> cloneDown = down.clone();
		down.clear();

		MCList<RsltR> keyGrpDown = MCList.create(RsltR.class);
		boolean missingFlg = false;
		boolean simFlg = false;
		boolean sortFlg = false;

		// 前日の在庫数
		MCNumber qty = MCNumber.ZERO;

		// 検索時にキー項目が同じレコードは同一の値が設定されている
		MCNumber keyGrpNo = null;

		if (up0.dtl_flg()) {
			for (RsltR r :cloneDown) {
				// キー項目が切り替わった場合
				if (!isSame(keyGrpNo, r.key_grp_no())) {

					// keyGrpDownをdownに追加する
					addKeyGrpDown(up0, down, keyGrpDown, missingFlg, simFlg);
					missingFlg = false;
					simFlg = false;
					keyGrpNo = r.key_grp_no();
					qty = MCNumber.ZERO;

					// 締日にレコードがない場合はレコードを作成する
					if (!isNull(r.dt())) {
						sortFlg = true;

						RsltR addDown = RsltR.create();
						copyRow(addDown, r, copyCols);
						addDown.dt(null);
						keyGrpDown.add(addDown);
					}
					else {
						qty = r.stk_qty();
					}
				}
				else {
					if (isNull(r.dt())) {
						qty = qty.add(r.stk_qty());
					}
				}
				r.stk_qty(qty.add(r.gr_schd_qty()));
				r.stk_qty(r.stk_qty().add(r.gr_act_qty()));
				r.stk_qty(r.stk_qty().subtract(r.gi_schd_qty()));
				r.stk_qty(r.stk_qty().subtract(r.gi_act_qty()));

				qty = r.stk_qty();
				if (qty.isNegative()) missingFlg = true;
				if (r.sim_flg()) simFlg = true;
				keyGrpDown.add(r);
			}
			// keyGrpDownをdownに追加する
			addKeyGrpDown(up0, down, keyGrpDown, missingFlg, simFlg);
		}
		else {
			RsltR tmpDown = RsltR.create();
			// 一週目は「期間ＴＯまでレコードを作成する」をスキップするための設定
			MCDate date = up0.dt_to().addDay(1);

			for (RsltR r :cloneDown) {
				// キー項目が切り替わった場合
				if (!isSame(keyGrpNo, r.key_grp_no())) {
					// 期間ＴＯまでレコードを作成する
					MCDate dt = date;
					while (dt.lte(up0.dt_to())) {
						RsltR addDown = tmpDown.clone();
						addDown.dt(dt);
						addDown.stk_qty(qty);
						keyGrpDown.add(addDown);
						dt = dt.addDay(1);
					}
					if (date.lte(up0.dt_to())) sortFlg = true;

					// keyGrpDownをdownに追加する
					addKeyGrpDown(up0, down, keyGrpDown, missingFlg, simFlg);
					missingFlg = false;
					simFlg = false;
					keyGrpNo = r.key_grp_no();
					qty = MCNumber.ZERO;
					date = up0.st_dt();

					// 新しいキー情報を保持しておく
					tmpDown.clear();
					copyRow(tmpDown, r, copyCols);

					// 締日にレコードがない場合はレコードを作成する
					if (!isNull(r.dt())) {
						sortFlg = true;

						RsltR addDown = RsltR.create();
						copyRow(addDown, r, copyCols);
						addDown.dt(null);
						keyGrpDown.add(addDown);
					}
					else {
						qty = r.stk_qty();
					}
				}
				else {
					if (isNull(r.dt())) {
						qty = qty.add(r.stk_qty());
					}
				}
				// レコードが存在しない日付はレコードを作成する
				MCDate dt = date;
				while (dt.lt(r.dt())) {
					RsltR addDown = tmpDown.clone();
					addDown.dt(dt);
					addDown.stk_qty(qty);
					keyGrpDown.add(addDown);
					dt = dt.addDay(1);
				}
				if (date.lt(up0.dt_to())) sortFlg = true;

				r.stk_qty(qty.add(r.gr_schd_qty()));
				r.stk_qty(r.stk_qty().add(r.gr_act_qty()));
				r.stk_qty(r.stk_qty().subtract(r.gi_schd_qty()));
				r.stk_qty(r.stk_qty().subtract(r.gi_act_qty()));

				qty = r.stk_qty();
				if (qty.isNegative()) missingFlg = true;
				if (r.sim_flg()) simFlg = true;
				keyGrpDown.add(r);

				if (isNull(r.dt())) {
					date = up0.st_dt();
				}
				else {
					date = r.dt().addDay(1);
				}
			}
			// 期間ＴＯまでレコードを作成する
			MCDate dt = date;
			while (dt.lte(up0.dt_to())) {
				RsltR addDown = tmpDown.clone();
				addDown.dt(dt);
				addDown.stk_qty(qty);
				keyGrpDown.add(addDown);
				dt = dt.addDay(1);
			}
			if (date.lte(up0.dt_to())) sortFlg = true;

			// keyGrpDownをdownに追加する
			addKeyGrpDown(up0, down, keyGrpDown, missingFlg, simFlg);
		}
	}

	protected void copyRow(RsltR dest, RsltR src, ArrayList<String> keyCols) {
		for (String key :keyCols) {
			dest.setValue(key, src.getValue(key));
		}
		dest.gr_schd_qty(MCNumber.ZERO);
		dest.gi_schd_qty(MCNumber.ZERO);
		dest.gr_act_qty(MCNumber.ZERO);
		dest.gi_act_qty(MCNumber.ZERO);
		dest.stk_qty(MCNumber.ZERO);
		dest.stk_amt(MCNumber.ZERO);
	}

	protected void addKeyGrpDown(CndR up0, MCList<RsltR> down, MCList<RsltR> keyGrpDown, boolean missingFlg, boolean simFlg) {
		if (up0.missing_flg() && up0.sim_flg()) {
			if (missingFlg && simFlg) {
				down.addAll(keyGrpDown);
			}
		}
		else if (up0.missing_flg() && !up0.sim_flg()) {
			if (missingFlg) {
				down.addAll(keyGrpDown);
			}
		}
		else if (!up0.missing_flg() && up0.sim_flg()) {
			if (simFlg) {
				down.addAll(keyGrpDown);
			}
		}
		else {
			down.addAll(keyGrpDown);
		}
		keyGrpDown.clear();
	}

	protected void calcAmt(CndR up0, MCList<RsltR> down) {
		if (!up0.amt_flg()) {
			return;
		}

		String stdUpriDt = "std_upri_dt";
		String stdUpriSelTyp = "std_upri_sel_typ";
		for (RsltR r : down) {
			MCDate dt;
			if (r.stk_flg()) {
				dt = up0.ac_dt();
			}
			else if (!isNull(r.dt()) && r.dt().lteDate(up0.st_dt())) {
				dt = up0.st_dt();
			}
			else {
				dt = r.dt();
			}
			r.addDateColumn(stdUpriDt, getDtOfTerm(dt));
		}
		down.addStringColumn(stdUpriSelTyp, getCo().stk_std_upri_typ());
		execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_STD_COST$F_GET_STD_UPRI", "01"),
				MABCFunction.getFunctionExecuter("MAPA_STD_COST$F_GET_STD_UPRI"),
				RsltR.$std_upri, down, RsltR.$itm_cd, RsltR.$itm_sub1, RsltR.$itm_sub2,
				RsltR.$itm_sub3, stdUpriDt, RsltR.$wg_cd, stdUpriSelTyp);
		for (RsltR r :down) {
			r.stk_amt(r.stk_qty().multiply(r.std_upri(),
					getCo().stk_amt_dec_place().intValue(),
					MAC_RND_TYP.toMC(getCo().stk_amt_rnd_typ())));
		}
	}

	protected void setDown(CndR up0, CndR down0, MCList<RsltR> down1) {
		down0.ac_dt(up0.ac_dt());

		if (!up0.dtl_flg()) {
			return;
		}
		for (RsltR r :down1) {
			MAM_ITM_R itm = _itm.getFirst(_itmIdx, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			if (!isNull(itm)) {
				r.itm_typ(itm.itm_typ());
				r.itm_typ_d_cd(itm.itm_typ_d_cd());
				r.itm_typ_d_nm(itm.getString(MAM_ITM_TYP_D_R.$itm_typ_d_nm));
				if (!up0.dtl_flg()) continue;
				if (up0.itm_grp_flg1()) {r.itm_grp_cd1(itm.itm_grp_cd1()); r.itm_grp_nm1(itm.getString("ITM_GRP_NM1"));}
				if (up0.itm_grp_flg2()) {r.itm_grp_cd2(itm.itm_grp_cd2()); r.itm_grp_nm2(itm.getString("ITM_GRP_NM2"));}
				if (up0.itm_grp_flg3()) {r.itm_grp_cd3(itm.itm_grp_cd3()); r.itm_grp_nm3(itm.getString("ITM_GRP_NM3"));}
				if (up0.itm_grp_flg4()) {r.itm_grp_cd4(itm.itm_grp_cd4()); r.itm_grp_nm4(itm.getString("ITM_GRP_NM4"));}
				if (up0.itm_grp_flg5()) {r.itm_grp_cd5(itm.itm_grp_cd5()); r.itm_grp_nm5(itm.getString("ITM_GRP_NM5"));}
				if (up0.itm_grp_flg6()) {r.itm_grp_cd6(itm.itm_grp_cd6()); r.itm_grp_nm6(itm.getString("ITM_GRP_NM6"));}
				if (up0.itm_grp_flg7()) {r.itm_grp_cd7(itm.itm_grp_cd7()); r.itm_grp_nm7(itm.getString("ITM_GRP_NM7"));}
				if (up0.itm_grp_flg8()) {r.itm_grp_cd8(itm.itm_grp_cd8()); r.itm_grp_nm8(itm.getString("ITM_GRP_NM8"));}
				if (up0.itm_grp_flg9()) {r.itm_grp_cd9(itm.itm_grp_cd9()); r.itm_grp_nm9(itm.getString("ITM_GRP_NM9"));}
				if (up0.itm_grp_flg10()) {r.itm_grp_cd10(itm.itm_grp_cd10()); r.itm_grp_nm10(itm.getString("ITM_GRP_NM10"));}
			}
		}
	}

	//FMCB CUSTOM END
}