package mcframe.serverMSBE.MSBEL0080;

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
import static mcframe.serverMSBE.MSBEL0080.Query.*;
import mcframe.commonCore.util.MCCollectionUtil;
import java.util.ArrayList;
import java.util.List;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_IoActSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_IoActSrch_MC extends MSBEL_IoActSrch_MC_A{
	//FMCB CUSTOM START

	/** 操作種別 */

	protected String _ope_srch_nrml = "1";
	protected String _ope_srch_cut = "2";
	protected String _ope_srch_all = "3";

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 指定された期間の各種実績を受払実績として照会する<br>
	 */
	public class Srch01 extends MSBEL_IoActSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
			beforeSearchForBizDatDLCmn();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			setUpTmpCol();
			MCQueryPlan sql = MSBEL0080_MST_IO_ACT_S01();
			String[] cols = getOrderByCols(up0());
			sql.addDynamicSQLInfo(getOrderByClause(up0()));
			searchForDL(replaceSql(sql), up0(), down0(), cols);
		}

		protected MCQueryPlan replaceSql(MCQueryPlan sql) {
			List<MCDynamicSQLInfo> l = new ArrayList<MCDynamicSQLInfo>();
			MST_IO_ACT_R S0T1 = MST_IO_ACT_R.create("T1");
			MAVM_RD_LOC_R S0M99 = MAVM_RD_LOC_R.create("M99");
			MAVM_RD_DPT_R S0M100 = MAVM_RD_DPT_R.create("M100");
			MAVM_RD_DPT_R S0M101 = MAVM_RD_DPT_R.create("M101");
			MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
			MCDynamicSQLID REP2 = createDynamicSQLID("REP2");
			
			if (isSame(up0().ope(), _ope_srch_all)) {
				l.add(when(null).predicate(REP1, p -> p.and(exists(subQuery().select(value(1))
						.from(S0M99).where(S0T1.loc_cd.eq(S0M99.loc_cd)))
								.or(exists(subQuery().select(value(1)).from(S0M101)
										.where(S0T1.loc_cd.isNull()
												.and(S0T1.purc_dpt_cd.eq(S0M101.dpt_cd)))))
								.or(exists(subQuery().select(value(1)).from(S0M100)
										.where(S0T1.loc_cd.isNull()
												.and(S0T1.bd_dpt_cd.eq(S0M100.dpt_cd)))))
								)));
			}
			else {
				l.add(when(null)
						.view(REP2,
								v -> v.innerJoin(S0M99).on(S0T1.loc_cd.eq(S0M99.loc_cd)))
						.predicate(REP2,
								p -> p.and(S0T1.io_typ.in(value(MSC_IO_TYP.GI.value()),
										value(MSC_IO_TYP.GR.value())))));
			}

			return sql.addDynamicSQLInfo(l.toArray(new MCDynamicSQLInfo[0]));
		}

		protected void setUpTmpCol() {
			// 金額確定
			if (up0().amt_fix_flg() && up0().un_fix_flg()){
				up0().addStringColumn("amt_fix_true", null);
				up0().addStringColumn("un_fix_true", null);
			}
			else{
				up0().addStringColumn("amt_fix_true", toTrueStr(up0().amt_fix_flg()));
				up0().addStringColumn("un_fix_true", toTrueStr(up0().un_fix_flg()));
			}

			// 国内国外
			if (up0().domestic_flg() && up0().foreign_flg()){
				up0().addStringColumn("domestic_true", null);
				up0().addStringColumn("foreign_true", null);
			}
			else{
				up0().addStringColumn("domestic_true", toTrueStr(up0().domestic_flg()));
				up0().addStringColumn("foreign_true", toTrueStr(up0().foreign_flg()));
			}

			// 都度精算
			if (up0().spot_flg() && up0().not_spot_flg()){
				up0().addStringColumn("spot_true", null);
				up0().addStringColumn("not_spot_true", null);
			}
			else{
				up0().addStringColumn("spot_true", toTrueStr(up0().spot_flg()));
				up0().addStringColumn("not_spot_true", toTrueStr(up0().not_spot_flg()));
			}

			// 暫定買掛
			if (up0().temp_ap_flg() && up0().not_temp_ap_flg()){
				up0().addStringColumn("temp_ap_true", null);
				up0().addStringColumn("not_temp_ap_true", null);
			}
			else{
				up0().addStringColumn("temp_ap_true", toTrueStr(up0().temp_ap_flg()));
				up0().addStringColumn("not_temp_ap_true", toTrueStr(up0().not_temp_ap_flg()));
			}

			// 買戻義務
			if (up0().repurc_obli_flg() && up0().not_repurc_obli_flg()){
				up0().addStringColumn("repurc_obli_true", null);
				up0().addStringColumn("not_repurc_obli_true", null);
			}
			else{
				up0().addStringColumn("repurc_obli_true", toTrueStr(up0().repurc_obli_flg()));
				up0().addStringColumn("not_repurc_obli_true", toTrueStr(up0().not_repurc_obli_flg()));
			}

			//補完を除く
			up0().addStringColumn("ex_slip_cmpl_true", toTrueStr(up0().slip_cmpl_flg()));

			//送信対象のみ
			up0().addStringColumn("only_send_true", toTrueStr(up0().send_flg()));

			// 原価取込
			if (up0().c_imp_flg() && up0().c_not_imp_flg()){
				up0().addStringColumn("c_imp_true", null);
				up0().addStringColumn("c_not_imp_true", null);
			}
			else{
				up0().addStringColumn("c_imp_true", toTrueStr(up0().c_imp_flg()));
				up0().addStringColumn("c_not_imp_true", toTrueStr(up0().c_not_imp_flg()));
			}

			// 会計ＩＦ取込
			if (up0().a_imp_flg() && up0().a_not_imp_flg()){
				up0().addStringColumn("a_imp_true", null);
				up0().addStringColumn("a_not_imp_true", null);
			}
			else{
				up0().addStringColumn("a_imp_true", toTrueStr(up0().a_imp_flg()));
				up0().addStringColumn("a_not_imp_true", toTrueStr(up0().a_not_imp_flg()));
			}

			// 手配ＮＯ管理区分：管理する（任意：在庫対象外）の場合は検索条件を使用しない
			if (!isNull(up0().itm_cd()) && !isNullAnd(up0().sno1(), up0().sno2(), up0().sno3(), up0().sno4())) {
				MAM_ITM_R itm = MAM_ITM_R.create();
				MAM_ITM_R t = MAM_ITM_R.create("T");
				MCQueryApiBuilder itm_bldr = MCQueryApiBuilder.create(t);
				itm_bldr.setSelect(t.sno1_mng_typ, t.sno2_mng_typ, t.sno3_mng_typ, t.sno4_mng_typ);
				itm_bldr.setWhere(t.itm_cd.eq(bind("itm_cd"))
						.and(t.itm_sub1.eq(bind("itm_sub1")))
						.and(t.itm_sub2.eq(bind("itm_sub2")))
						.and(t.itm_sub3.eq(bind("itm_sub3"))));
				dbSelect("MSBEL0080_MAM_ITM_S01", itm, itm_bldr, up0());
				if (!isNull(up0().sno1()) && MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno1_mng_typ())) {
					up0().sno1(MAC_STR.NULL_VAL.value());
				}
				if (!isNull(up0().sno2()) && MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno2_mng_typ())) {
					up0().sno2(MAC_STR.NULL_VAL.value());
				}
				if (!isNull(up0().sno3()) && MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno3_mng_typ())) {
					up0().sno3(MAC_STR.NULL_VAL.value());
				}
				if (!isNull(up0().sno4()) && MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno4_mng_typ())) {
					up0().sno4(MAC_STR.NULL_VAL.value());
				}
			}
		}

		protected void beforeSearchForBizDatDLCmn() {

			// 納品先分類
			up0().dlv_grp_flg1(true);
			up0().dlv_grp_flg2(true);
			up0().dlv_grp_flg3(true);
			up0().dlv_grp_flg4(true);
			up0().dlv_grp_flg5(true);
			up0().dlv_grp_flg6(true);
			up0().dlv_grp_flg7(true);
			up0().dlv_grp_flg8(true);
			up0().dlv_grp_flg9(true);
			up0().dlv_grp_flg10(true);

			// 得意先分類
			up0().cst_grp_flg1(true);
			up0().cst_grp_flg2(true);
			up0().cst_grp_flg3(true);
			up0().cst_grp_flg4(true);
			up0().cst_grp_flg5(true);
			up0().cst_grp_flg6(true);
			up0().cst_grp_flg7(true);
			up0().cst_grp_flg8(true);
			up0().cst_grp_flg9(true);
			up0().cst_grp_flg10(true);

			// 発注先分類
			up0().sppl_grp_flg1(true);
			up0().sppl_grp_flg2(true);
			up0().sppl_grp_flg3(true);
			up0().sppl_grp_flg4(true);
			up0().sppl_grp_flg5(true);
			up0().sppl_grp_flg6(true);
			up0().sppl_grp_flg7(true);
			up0().sppl_grp_flg8(true);
			up0().sppl_grp_flg9(true);
			up0().sppl_grp_flg10(true);

			// 品目分類
			up0().itm_grp_flg1(true);
			up0().itm_grp_flg2(true);
			up0().itm_grp_flg3(true);
			up0().itm_grp_flg4(true);
			up0().itm_grp_flg5(true);
			up0().itm_grp_flg6(true);
			up0().itm_grp_flg7(true);
			up0().itm_grp_flg8(true);
			up0().itm_grp_flg9(true);
			up0().itm_grp_flg10(true);

		}

		@Override
		protected void editListMain() {
			super.editListMain();

			//集計処理
			MCList<Srch01_RsltR> downL = getTotalList();
			down0().setAll(downL);

			//ソート処理
			down0().sort(getOrderByCols(up0()));
		}

		/**
		 * ORDER BY句の文字列を返す 
		 */
		protected MCDynamicSQLInfo[] getOrderByClause(Srch01_CndR cndR) {
			List<MCDynamicSQLInfo> l = new ArrayList<MCDynamicSQLInfo>();
			MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");
			
			if (cndR.slip_no_flg() == true) {
				l.add(when(null).orderBy(ORDERBY, pr(Srch01_CndR.$slip_no).asc()));
			}
			if (cndR.slip_seq_no_flg() == true) {
				l.add(when(null).orderBy(ORDERBY, pr(Srch01_CndR.$slip_seq_no).asc()));
			}
			if (cndR.loc_flg() == true) {
				l.add(when(null).orderBy(ORDERBY, pr(Srch01_CndR.$loc_cd).asc()));
			}
			if (cndR.str_ln_flg() == true) {
				l.add(when(null).orderBy(ORDERBY, pr(Srch01_CndR.$str_ln_cd).asc()));
			}
			l.add(when(null).orderBy(ORDERBY,
					pr(Srch01_CndR.$itm_cd).asc(),
					pr(Srch01_CndR.$itm_sub1).asc(),
					pr(Srch01_CndR.$itm_sub2).asc(),
					pr(Srch01_CndR.$itm_sub3).asc()));
			
			return l.toArray(new MCDynamicSQLInfo[0]);
		}

		/**
		 * SQLのORDER BYに使う項目
		 */
		protected String[] getOrderByCols(Srch01_CndR cndR) {
			List<String> cols = new ArrayList<String>();

			if (cndR.slip_no_flg() == true) {
				cols.add("SLIP_NO");
			}
			if (cndR.slip_seq_no_flg() == true) {
				cols.add("SLIP_SEQ_NO");
			}
			if (cndR.loc_flg() == true) {
				cols.add("LOC_CD");
			}
			if (cndR.str_ln_flg() == true) {
				cols.add("STR_LN_CD");
			}

			cols.add("ITM_CD");
			cols.add("ITM_SUB1");
			cols.add("ITM_SUB2");
			cols.add("ITM_SUB3");

			return cols.toArray(new String[cols.size()]);
		}

		protected MCList<Srch01_RsltR> getTotalList() {

			if (down0().isEmpty()) {
				return down0();
			}

			List<String> removeArray = new ArrayList<String>();
			setRemoveArray(removeArray);

			MCList<Srch01_RsltR> retL = MCList.create(Srch01_RsltR.class);
			retL.addAll(down0());

			String[] sumCols = getSumCols();
			//サマリ対象のカラムをグループ化対象から除く
			String[] grpCols = MCCollectionUtil.remove(down0().getColumnPathArray(), new String[0], sumCols);
			//集計関連カラムをグループ化対象から除く
			grpCols = MCCollectionUtil.remove(grpCols, new String[0], removeArray.toArray(new String[0]));

			MCGroupByPolicy policy = new MCGroupByPolicy(grpCols);
			policy.sum(sumCols);
			retL.setAll(retL.groupBy(policy));

			return retL;
		}

		protected String[] getSumCols() {
			return new String[] {
					Srch01_RsltR.$base_unit_gr_qty
					, Srch01_RsltR.$base_unit_gi_qty
					, Srch01_RsltR.$pack_unit_gr_qty
					, Srch01_RsltR.$pack_unit_gi_qty
					, Srch01_RsltR.$trd_unit_gr_qty
					, Srch01_RsltR.$trd_unit_gi_qty

			};
		}

		protected void setRemoveArray(List<String> removeArray) {
			setRemoveArraySlipNo(removeArray);
			setRemoveArraySlipSeqNo(removeArray);
			setRemoveArrayAcDt(removeArray);
			setRemoveArrayLoc(removeArray);
			setRemoveArrayStrLn(removeArray);
			setRemoveArrayStkArrvBp(removeArray);
			setRemoveArraySite(removeArray);
			setRemoveArrayGrWg(removeArray);
			setRemoveArrayGiWg(removeArray);
			setRemoveArrayLgGrp(removeArray);
			setRemoveArrayAllocGrp(removeArray);
			setRemoveArrayLocGrp(removeArray);
			setRemoveArrayLot(removeArray);
			setRemoveArraySublot(removeArray);
			setRemoveArrayLotInfo(removeArray);
			setRemoveArrayPackUnit(removeArray);
			setRemoveArraySno1(removeArray);
			setRemoveArraySno2(removeArray);
			setRemoveArraySno3(removeArray);
			setRemoveArraySno4(removeArray);
			setRemoveArrayFixNoTyp(removeArray);
			setRemoveArrayFixNo(removeArray);
			setRemoveArrayGd(removeArray);
			setRemoveArrayRsn(removeArray);
			setRemoveArrayActDpt(removeArray);
			setRemoveArrayGrDpt(removeArray);
			setRemoveArrayGiDpt(removeArray);
			setRemoveArrayBdDpt(removeArray);
			setRemoveArrayActUsr(removeArray);
			setRemoveArraySlsUsr(removeArray);
			setRemoveArrayMfgUsr(removeArray);
			setRemoveArrayPurcUsr(removeArray);
			setRemoveArraySloNo(removeArray);
			setRemoveArrayPoNo(removeArray);
			setRemoveArrayIvNo(removeArray);
			setRemoveArrayRcptIvNo(removeArray);
			setRemoveArrayDlv(removeArray);
			setRemoveArrayTdlv(removeArray);
			setRemoveArrayCst(removeArray);
			setRemoveArraySppl(removeArray);
			setRemoveArrayCstItm(removeArray);
			setRemoveArrayCstItmNm(removeArray);
			setRemoveArraySpplItm(removeArray);
			setRemoveArraySpplItmNm(removeArray);
			setRemoveArrayParBdInfo(removeArray);
			setRemoveArrayDefCols(removeArray);
		}

		protected void setRemoveArraySlipNo(List<String> removeArray) {
			if (!up0().slip_no_flg()) {
				removeArray.add(Srch01_RsltR.$slip_no);
			}
		}

		protected void setRemoveArraySlipSeqNo(List<String> removeArray) {
			if (!up0().slip_seq_no_flg()) {
				removeArray.add(Srch01_RsltR.$slip_seq_no);
			}
		}

		protected void setRemoveArrayAcDt(List<String> removeArray) {
			if (!up0().ac_dt_flg()) {
				removeArray.add(Srch01_RsltR.$ac_dt);
			}
		}

		protected void setRemoveArrayLoc(List<String> removeArray) {
			if (!up0().loc_flg()) {
				removeArray.add(Srch01_RsltR.$loc_cd);
				removeArray.add(Srch01_RsltR.$loc_nm);
				removeArray.add(Srch01_RsltR.$loc_sppl_cd);
			}
		}

		protected void setRemoveArrayStrLn(List<String> removeArray) {
			if (!up0().str_ln_flg()) {
				removeArray.add(Srch01_RsltR.$str_ln_cd);
				removeArray.add(Srch01_RsltR.$str_ln_nm);
				removeArray.add(Srch01_RsltR.$str_ln_cd_none_flg);
			}
		}

		protected void setRemoveArrayStkArrvBp(List<String> removeArray) {
			if (!up0().stk_arrv_bp_flg()) {
				removeArray.add(Srch01_RsltR.$stk_arrv_bp_cd);
				removeArray.add(Srch01_RsltR.$stk_arrv_bp_nm);
			}
		}

		protected void setRemoveArraySite(List<String> removeArray) {
			if (!up0().site_flg()) {
				removeArray.add(Srch01_RsltR.$site_cd);
				removeArray.add(Srch01_RsltR.$site_nm);
			}
		}

		protected void setRemoveArrayGrWg(List<String> removeArray) {
			if (!up0().gr_wg_flg()) {
				removeArray.add(Srch01_RsltR.$gr_wg_cd);
				removeArray.add(Srch01_RsltR.$gr_wg_nm);
			}
		}

		protected void setRemoveArrayGiWg(List<String> removeArray) {
			if (!up0().gi_wg_flg()) {
				removeArray.add(Srch01_RsltR.$gi_wg_cd);
				removeArray.add(Srch01_RsltR.$gi_wg_nm);
			}
		}

		protected void setRemoveArrayLgGrp(List<String> removeArray) {
			if (!up0().lg_grp_flg()) {
				removeArray.add(Srch01_RsltR.$lg_grp_cd);
				removeArray.add(Srch01_RsltR.$lg_grp_nm);
			}
		}

		protected void setRemoveArrayAllocGrp(List<String> removeArray) {
			if (!up0().alloc_grp_flg()) {
				removeArray.add(Srch01_RsltR.$alloc_grp_cd);
				removeArray.add(Srch01_RsltR.$alloc_grp_nm);
			}
		}

		protected void setRemoveArrayLocGrp(List<String> removeArray) {
			if (!up0().loc_grp_flg()) {
				removeArray.add(Srch01_RsltR.$loc_grp_cd);
				removeArray.add(Srch01_RsltR.$loc_grp_nm);
			}
		}

		protected void setRemoveArrayLot(List<String> removeArray) {
			if (!up0().lot_flg()) {
				removeArray.add(Srch01_RsltR.$lot_no);
			}
		}

		protected void setRemoveArraySublot(List<String> removeArray) {
			if (!up0().sublot_flg()) {
				removeArray.add(Srch01_RsltR.$sublot_no);
			}
		}

		protected void setRemoveArrayLotInfo(List<String> removeArray) {
			if (!(up0().lot_flg() && up0().sublot_flg())) {
				removeArray.add(Srch01_RsltR.$ver_no);
			}
		}

		protected void setRemoveArrayPackUnit(List<String> removeArray) {
			if (!up0().pack_unit_flg()) {
				removeArray.add(Srch01_RsltR.$pack_unit_cd);
				removeArray.add(Srch01_RsltR.$pack_unit_nm);
				removeArray.add(Srch01_RsltR.$pack_unit_gr_qty);
				removeArray.add(Srch01_RsltR.$pack_unit_gi_qty);
				removeArray.add(Srch01_RsltR.$pack_unit_dec_place);
			}
		}

		protected void setRemoveArraySno1(List<String> removeArray) {
			if (!up0().sno1_flg()) {
				removeArray.add(Srch01_RsltR.$sno1);
				removeArray.add(Srch01_RsltR.$wrk_no);
				removeArray.add(Srch01_RsltR.$wrk_nm);
			}
		}

		protected void setRemoveArraySno2(List<String> removeArray) {
			if (!up0().sno2_flg()) {
				removeArray.add(Srch01_RsltR.$sno2);
			}
		}

		protected void setRemoveArraySno3(List<String> removeArray) {
			if (!up0().sno3_flg()) {
				removeArray.add(Srch01_RsltR.$sno3);
			}
		}

		protected void setRemoveArraySno4(List<String> removeArray) {
			if (!up0().sno4_flg()) {
				removeArray.add(Srch01_RsltR.$sno4);
			}
		}

		protected void setRemoveArrayFixNoTyp(List<String> removeArray) {
			if (!up0().fix_no_typ_flg()) {
				removeArray.add(Srch01_RsltR.$fix_no_typ);
				removeArray.add(Srch01_RsltR.$fix_no_typ_nm);
			}
		}

		protected void setRemoveArrayFixNo(List<String> removeArray) {
			if (!up0().fix_no_flg()) {
				removeArray.add(Srch01_RsltR.$fix_no);
			}
		}

		protected void setRemoveArrayGd(List<String> removeArray) {
			if (!up0().gd_flg()) {
				removeArray.add(Srch01_RsltR.$gd_cd);
				removeArray.add(Srch01_RsltR.$gd_nm);
			}
		}

		protected void setRemoveArrayRsn(List<String> removeArray) {
			if (!up0().rsn_flg()) {
				removeArray.add(Srch01_RsltR.$rsn_cd);
				removeArray.add(Srch01_RsltR.$rsn_nm);
			}
		}

		protected void setRemoveArrayActDpt(List<String> removeArray) {
			if (!up0().act_dpt_flg()) {
				removeArray.add(Srch01_RsltR.$act_dpt_cd);
				removeArray.add(Srch01_RsltR.$act_dpt_nm);
			}
		}

		protected void setRemoveArrayGrDpt(List<String> removeArray) {
			if (!up0().gr_dpt_flg()) {
				removeArray.add(Srch01_RsltR.$gr_dpt_cd);
				removeArray.add(Srch01_RsltR.$gr_dpt_nm);
			}
		}
		protected void setRemoveArrayGiDpt(List<String> removeArray) {
			if (!up0().gi_dpt_flg()) {
				removeArray.add(Srch01_RsltR.$gi_dpt_cd);
				removeArray.add(Srch01_RsltR.$gi_dpt_nm);
			}
		}

		protected void setRemoveArrayBdDpt(List<String> removeArray) {
			if (!up0().bd_dpt_flg()) {
				removeArray.add(Srch01_RsltR.$bd_dpt_cd);
				removeArray.add(Srch01_RsltR.$bd_dpt_nm);
			}
		}

		protected void setRemoveArrayActUsr(List<String> removeArray) {
			if (!up0().act_usr_flg()) {
				removeArray.add(Srch01_RsltR.$act_usr_cd);
				removeArray.add(Srch01_RsltR.$act_usr_nm);
			}
		}

		protected void setRemoveArraySlsUsr(List<String> removeArray) {
			if (!up0().sls_usr_flg()) {
				removeArray.add(Srch01_RsltR.$sls_usr_cd);
				removeArray.add(Srch01_RsltR.$sls_usr_nm);
			}
		}

		protected void setRemoveArrayMfgUsr(List<String> removeArray) {
			if (!up0().mfg_usr_flg()) {
				removeArray.add(Srch01_RsltR.$mfg_usr_cd);
				removeArray.add(Srch01_RsltR.$mfg_usr_nm);
			}
		}

		protected void setRemoveArrayPurcUsr(List<String> removeArray) {
			if (!up0().purc_usr_flg()) {
				removeArray.add(Srch01_RsltR.$purc_usr_cd);
				removeArray.add(Srch01_RsltR.$purc_usr_nm);
			}
		}

		protected void setRemoveArraySloNo(List<String> removeArray) {
			if (!up0().slo_no_flg()) {
				removeArray.add(Srch01_RsltR.$slo_no);
			}
		}

		protected void setRemoveArrayPoNo(List<String> removeArray) {
			if (!up0().po_no_flg()) {
				removeArray.add(Srch01_RsltR.$po_no);
			}
		}

		protected void setRemoveArrayIvNo(List<String> removeArray) {
			if (!up0().iv_no_flg()) {
				removeArray.add(Srch01_RsltR.$iv_no);
			}
		}

		protected void setRemoveArrayRcptIvNo(List<String> removeArray) {
			if (!up0().rcpt_iv_no_flg()) {
				removeArray.add(Srch01_RsltR.$rcpt_iv_no);
			}
		}

		protected void setRemoveArrayDlv(List<String> removeArray) {
			if (!up0().dlv_flg()) {
				removeArray.add(Srch01_RsltR.$dlv_cd);
				removeArray.add(Srch01_RsltR.$dlv_nm);
			}
		}

		protected void setRemoveArrayTdlv(List<String> removeArray) {
			if (!up0().tdlv_flg()) {
				removeArray.add(Srch01_RsltR.$tdlv_cd);
				removeArray.add(Srch01_RsltR.$tdlv_nm);
			}
		}

		protected void setRemoveArrayCst(List<String> removeArray) {
			if (!up0().cst_flg()) {
				removeArray.add(Srch01_RsltR.$cst_cd);
				removeArray.add(Srch01_RsltR.$cst_nm);
			}
		}

		protected void setRemoveArraySppl(List<String> removeArray) {
			if (!up0().sppl_flg()) {
				removeArray.add(Srch01_RsltR.$sppl_cd);
				removeArray.add(Srch01_RsltR.$sppl_nm);
			}
		}

		protected void setRemoveArrayCstItm(List<String> removeArray) {
			if (!up0().cst_itm_flg()) {
				removeArray.add(Srch01_RsltR.$cst_itm_cd);
			}
		}
		protected void setRemoveArrayCstItmNm(List<String> removeArray) {
			if (!up0().cst_itm_nm_flg()) {
				removeArray.add(Srch01_RsltR.$cst_itm_nm);
			}
		}

		protected void setRemoveArraySpplItm(List<String> removeArray) {
			if (!up0().sppl_itm_flg()) {
				removeArray.add(Srch01_RsltR.$sppl_itm_cd);
			}
		}

		protected void setRemoveArraySpplItmNm(List<String> removeArray) {
			if (!up0().sppl_itm_nm_flg()) {
				removeArray.add(Srch01_RsltR.$sppl_itm_nm);
			}
		}

		protected void setRemoveArrayParBdInfo(List<String> removeArray) {
			if (!up0().par_bd_info_flg()) {

				removeArray.add(Srch01_RsltR.$bd_ctg_cd);
				removeArray.add(Srch01_RsltR.$bd_ctg_nm);
				removeArray.add(Srch01_RsltR.$bd_bp_cd);
				removeArray.add(Srch01_RsltR.$bd_bp_nm);
				removeArray.add(Srch01_RsltR.$bd_oper_cd);
				removeArray.add(Srch01_RsltR.$bd_oper_nm);
				removeArray.add(Srch01_RsltR.$bd_loc_cd);
				removeArray.add(Srch01_RsltR.$bd_loc_nm);
				removeArray.add(Srch01_RsltR.$bd_slo_no);
				removeArray.add(Srch01_RsltR.$bd_po_no);
				removeArray.add(Srch01_RsltR.$bd_iv_no);
				removeArray.add(Srch01_RsltR.$bd_wg_cd);
				removeArray.add(Srch01_RsltR.$bd_wg_nm);
				removeArray.add(Srch01_RsltR.$par_itm_cd);
				removeArray.add(Srch01_RsltR.$par_itm_sub1);
				removeArray.add(Srch01_RsltR.$par_itm_sub2);
				removeArray.add(Srch01_RsltR.$par_itm_sub3);
				removeArray.add(Srch01_RsltR.$par_itm_nm);
				removeArray.add(Srch01_RsltR.$par_lot_no);
				removeArray.add(Srch01_RsltR.$par_sublot_no);
				removeArray.add(Srch01_RsltR.$par_sno1);
				removeArray.add(Srch01_RsltR.$par_sno2);
				removeArray.add(Srch01_RsltR.$par_sno3);
				removeArray.add(Srch01_RsltR.$par_sno4);
			}
		}

		protected void setRemoveArrayDefCols(List<String> removeArray) {
			//ひとつでも集計されたら非表示にする項目
			if (!(up0().slip_no_flg()
					&& up0().slip_seq_no_flg()
					&& up0().ac_dt_flg()
					&& up0().loc_flg()
					&& up0().str_ln_flg()
					&& up0().stk_arrv_bp_flg()
					&& up0().site_flg()
					&& up0().gr_wg_flg()
					&& up0().gi_wg_flg()
					&& up0().lg_grp_flg()
					&& up0().alloc_grp_flg()
					&& up0().loc_grp_flg()
					&& up0().lot_flg()
					&& up0().sublot_flg()
					&& up0().sno1_flg()
					&& up0().sno2_flg()
					&& up0().sno3_flg()
					&& up0().sno4_flg()
					&& up0().fix_no_typ_flg()
					&& up0().fix_no_flg()
					&& up0().pack_unit_flg()
					&& up0().gd_flg()
					&& up0().rsn_flg()
					&& up0().act_dpt_flg()
					&& up0().gr_dpt_flg()
					&& up0().gi_dpt_flg()
					&& up0().bd_dpt_flg()
					&& up0().act_usr_flg()
					&& up0().sls_usr_flg()
					&& up0().mfg_usr_flg()
					&& up0().purc_usr_flg()
					&& up0().slo_no_flg()
					&& up0().po_no_flg()
					&& up0().iv_no_flg()
					&& up0().rcpt_iv_no_flg()
					&& up0().dlv_flg()
					&& up0().tdlv_flg()
					&& up0().cst_flg()
					&& up0().sppl_flg()
					&& up0().cst_itm_flg()
					&& up0().cst_itm_nm_flg()
					&& up0().sppl_itm_flg()
					&& up0().sppl_itm_nm_flg()
					&& up0().par_bd_info_flg())) {

				removeArray.add(Srch01_RsltR.$act_dt);
				removeArray.add(Srch01_RsltR.$act_hm);
				removeArray.add(Srch01_RsltR.$stktk_base_dt);
				removeArray.add(Srch01_RsltR.$trd_rmrks);
				removeArray.add(Srch01_RsltR.$trd_d_rmrks);
				removeArray.add(Srch01_RsltR.$slip_rev_no);
				removeArray.add(Srch01_RsltR.$act_no);
				removeArray.add(Srch01_RsltR.$act_seq);
				removeArray.add(Srch01_RsltR.$act_rev_no);
				removeArray.add(Srch01_RsltR.$act_d_no);
				removeArray.add(Srch01_RsltR.$act_d_seq);
				removeArray.add(Srch01_RsltR.$act_io_no);
				removeArray.add(Srch01_RsltR.$act_io_seq);
				removeArray.add(Srch01_RsltR.$slip_sts_typ);
				removeArray.add(Srch01_RsltR.$slip_sts_typ_nm);
				removeArray.add(Srch01_RsltR.$trd_cd);
				removeArray.add(Srch01_RsltR.$trd_nm);
				removeArray.add(Srch01_RsltR.$trd_ptn_typ);
				removeArray.add(Srch01_RsltR.$trd_ptn_typ_nm);
				removeArray.add(Srch01_RsltR.$trn_typ);
				removeArray.add(Srch01_RsltR.$trn_typ_nm);
				removeArray.add(Srch01_RsltR.$par_slip_no);
				removeArray.add(Srch01_RsltR.$par_slip_seq_no);
				removeArray.add(Srch01_RsltR.$slip_cmpl_flg);

				removeArray.add(Srch01_RsltR.$sub_char1);
				removeArray.add(Srch01_RsltR.$sub_char2);
				removeArray.add(Srch01_RsltR.$sub_char3);
				removeArray.add(Srch01_RsltR.$sub_char4);
				removeArray.add(Srch01_RsltR.$sub_char5);
				removeArray.add(Srch01_RsltR.$sub_char6);
				removeArray.add(Srch01_RsltR.$sub_char7);
				removeArray.add(Srch01_RsltR.$sub_char8);
				removeArray.add(Srch01_RsltR.$sub_char9);
				removeArray.add(Srch01_RsltR.$sub_char10);
				removeArray.add(Srch01_RsltR.$sub_num1);
				removeArray.add(Srch01_RsltR.$sub_num2);
				removeArray.add(Srch01_RsltR.$sub_num3);
				removeArray.add(Srch01_RsltR.$sub_dt1);
				removeArray.add(Srch01_RsltR.$sub_dt2);
				removeArray.add(Srch01_RsltR.$sub_dt3);

				removeArray.add(Srch01_RsltR.$ins_usr_id);
				removeArray.add(Srch01_RsltR.$ins_usr_nm);
				removeArray.add(Srch01_RsltR.$ins_func_id);
				removeArray.add(Srch01_RsltR.$ins_func_nm);
				removeArray.add(Srch01_RsltR.$ins_ts);
				removeArray.add(Srch01_RsltR.$upd_usr_id);
				removeArray.add(Srch01_RsltR.$upd_usr_nm);
				removeArray.add(Srch01_RsltR.$upd_func_id);
				removeArray.add(Srch01_RsltR.$upd_func_nm);
				removeArray.add(Srch01_RsltR.$upd_ts);
				removeArray.add(Srch01_RsltR.$upd_srv_req_no);

				//検索、検索（まとめ）モードで非表示になる項目
				removeArray.add(Srch01_RsltR.$trd_unit_cd);
				removeArray.add(Srch01_RsltR.$trd_unit_nm);
				removeArray.add(Srch01_RsltR.$trd_unit_dec_place);
				removeArray.add(Srch01_RsltR.$ac_slip_typ);
				removeArray.add(Srch01_RsltR.$ac_slip_typ_nm);
				removeArray.add(Srch01_RsltR.$ac_rsn_cd);
				removeArray.add(Srch01_RsltR.$ac_rsn_nm);
				removeArray.add(Srch01_RsltR.$ac_itm_grp_cd);
				removeArray.add(Srch01_RsltR.$ac_itm_grp_nm);
				removeArray.add(Srch01_RsltR.$itm_jnl_cd);
				removeArray.add(Srch01_RsltR.$itm_jnl_nm);
				removeArray.add(Srch01_RsltR.$purc_dpt_cd);
				removeArray.add(Srch01_RsltR.$purc_dpt_nm);
				removeArray.add(Srch01_RsltR.$ap_dpt_cd);
				removeArray.add(Srch01_RsltR.$ap_dpt_nm);
				removeArray.add(Srch01_RsltR.$sls_dpt_cd);
				removeArray.add(Srch01_RsltR.$sls_dpt_nm);
				removeArray.add(Srch01_RsltR.$ar_dpt_cd);
				removeArray.add(Srch01_RsltR.$ar_dpt_nm);
				removeArray.add(Srch01_RsltR.$sub_dpt_cd1);
				removeArray.add(Srch01_RsltR.$sub_dpt_nm1);
				removeArray.add(Srch01_RsltR.$sub_dpt_cd2);
				removeArray.add(Srch01_RsltR.$sub_dpt_nm2);
				removeArray.add(Srch01_RsltR.$sub_dpt_cd3);
				removeArray.add(Srch01_RsltR.$sub_dpt_nm3);
				removeArray.add(Srch01_RsltR.$un_fix_flg);
				removeArray.add(Srch01_RsltR.$trd_cur_cd);
				removeArray.add(Srch01_RsltR.$trd_cur_nm);
				removeArray.add(Srch01_RsltR.$trd_cur_amt_dec_place);
				removeArray.add(Srch01_RsltR.$trd_cur_upri_dec_place);
				removeArray.add(Srch01_RsltR.$trd_cur_amt);
				removeArray.add(Srch01_RsltR.$trd_cur_tax_amt);
				removeArray.add(Srch01_RsltR.$repurc_obli_flg);
				removeArray.add(Srch01_RsltR.$trd_cur_proc_amt);
				removeArray.add(Srch01_RsltR.$trd_cur_onr_prov_amt);
				removeArray.add(Srch01_RsltR.$base_cur_cd);
				removeArray.add(Srch01_RsltR.$base_cur_nm);
				removeArray.add(Srch01_RsltR.$base_cur_amt_dec_place);
				removeArray.add(Srch01_RsltR.$base_cur_upri_dec_place);
				removeArray.add(Srch01_RsltR.$base_cur_amt);
				removeArray.add(Srch01_RsltR.$base_cur_tax_amt);
				removeArray.add(Srch01_RsltR.$base_cur_proc_amt);
				removeArray.add(Srch01_RsltR.$base_cur_onr_prov_amt);
				removeArray.add(Srch01_RsltR.$ptax_cur_cd);
				removeArray.add(Srch01_RsltR.$ptax_cur_nm);
				removeArray.add(Srch01_RsltR.$ptax_cur_amt_dec_place);
				removeArray.add(Srch01_RsltR.$ptax_cur_upri_dec_place);
				removeArray.add(Srch01_RsltR.$ptax_cur_amt);
				removeArray.add(Srch01_RsltR.$ptax_cur_tax_amt);
				removeArray.add(Srch01_RsltR.$ptax_cur_proc_amt);
				removeArray.add(Srch01_RsltR.$ptax_cur_onr_prov_amt);
				removeArray.add(Srch01_RsltR.$wtax_rate);
				removeArray.add(Srch01_RsltR.$wtax_amt);
				removeArray.add(Srch01_RsltR.$tax_cd);
				removeArray.add(Srch01_RsltR.$tax_nm);
				removeArray.add(Srch01_RsltR.$foreign_flg);
				removeArray.add(Srch01_RsltR.$xrate_cd);
				removeArray.add(Srch01_RsltR.$xrate_nm);
				removeArray.add(Srch01_RsltR.$xrate);
				removeArray.add(Srch01_RsltR.$ptax_xrate_cd);
				removeArray.add(Srch01_RsltR.$ptax_xrate_nm);
				removeArray.add(Srch01_RsltR.$ptax_xrate);
				removeArray.add(Srch01_RsltR.$rcst_cd);
				removeArray.add(Srch01_RsltR.$rcst_nm);
				removeArray.add(Srch01_RsltR.$bcst_cd);
				removeArray.add(Srch01_RsltR.$bcst_nm);
				removeArray.add(Srch01_RsltR.$acst_cd);
				removeArray.add(Srch01_RsltR.$acst_nm);
				removeArray.add(Srch01_RsltR.$dest_cd1);
				removeArray.add(Srch01_RsltR.$dest_nm1);
				removeArray.add(Srch01_RsltR.$dest_cd2);
				removeArray.add(Srch01_RsltR.$dest_nm2);
				removeArray.add(Srch01_RsltR.$dest_cd3);
				removeArray.add(Srch01_RsltR.$dest_nm3);
				removeArray.add(Srch01_RsltR.$psppl_cd);
				removeArray.add(Srch01_RsltR.$psppl_nm);
				removeArray.add(Srch01_RsltR.$bsppl_cd);
				removeArray.add(Srch01_RsltR.$bsppl_nm);
				removeArray.add(Srch01_RsltR.$asppl_cd);
				removeArray.add(Srch01_RsltR.$asppl_nm);
				removeArray.add(Srch01_RsltR.$cred_cd);
				removeArray.add(Srch01_RsltR.$cred_nm);
				removeArray.add(Srch01_RsltR.$spot_flg);
				removeArray.add(Srch01_RsltR.$sttl_schd_dt);
				removeArray.add(Srch01_RsltR.$sttl_cd);
				removeArray.add(Srch01_RsltR.$sttl_nm);
				removeArray.add(Srch01_RsltR.$purc_typ);
				removeArray.add(Srch01_RsltR.$purc_typ_nm);
				removeArray.add(Srch01_RsltR.$area_cd);
				removeArray.add(Srch01_RsltR.$area_nm);
				removeArray.add(Srch01_RsltR.$cntry_cd);
				removeArray.add(Srch01_RsltR.$cntry_nm);
				removeArray.add(Srch01_RsltR.$par_ac_itm_grp_cd);
				removeArray.add(Srch01_RsltR.$par_ac_itm_grp_nm);
				removeArray.add(Srch01_RsltR.$par_itm_jnl_cd);
				removeArray.add(Srch01_RsltR.$par_itm_jnl_nm);
				removeArray.add(Srch01_RsltR.$mfg_inst_unit_typ);
				removeArray.add(Srch01_RsltR.$mfg_inst_unit_typ_nm);
				removeArray.add(Srch01_RsltR.$itm_mfg_inst_no);
				removeArray.add(Srch01_RsltR.$itm_inst_qty);
				removeArray.add(Srch01_RsltR.$mfg_inst_no);
				removeArray.add(Srch01_RsltR.$mfg_act_no);
				removeArray.add(Srch01_RsltR.$mfg_st_qty);
				removeArray.add(Srch01_RsltR.$oper_act_no);
				removeArray.add(Srch01_RsltR.$yield_rate);
				removeArray.add(Srch01_RsltR.$disp_seq);
				removeArray.add(Srch01_RsltR.$oper_cd);
				removeArray.add(Srch01_RsltR.$oper_nm);
				removeArray.add(Srch01_RsltR.$inpt_loc_cd);
				removeArray.add(Srch01_RsltR.$inpt_loc_nm);
				removeArray.add(Srch01_RsltR.$inpt_str_ln_cd);
				removeArray.add(Srch01_RsltR.$inpt_str_ln_nm);
				removeArray.add(Srch01_RsltR.$inpt_str_ln_cd_none_flg);
				removeArray.add(Srch01_RsltR.$outsrc_mfg_loc_cd);
				removeArray.add(Srch01_RsltR.$outsrc_mfg_loc_nm);
				removeArray.add(Srch01_RsltR.$outsrc_mfg_loc_dpt_cd);
				removeArray.add(Srch01_RsltR.$outsrc_mfg_loc_dpt_nm);
				removeArray.add(Srch01_RsltR.$outsrc_mfg_loc_wg_cd);
				removeArray.add(Srch01_RsltR.$outsrc_mfg_loc_wg_nm);
				removeArray.add(Srch01_RsltR.$strg_loc_cd);
				removeArray.add(Srch01_RsltR.$strg_loc_nm);
				removeArray.add(Srch01_RsltR.$strg_str_ln_cd);
				removeArray.add(Srch01_RsltR.$strg_str_ln_nm);
				removeArray.add(Srch01_RsltR.$strg_str_ln_cd_none_flg);
				removeArray.add(Srch01_RsltR.$send_flg);
				removeArray.add(Srch01_RsltR.$c_imp_flg);
				removeArray.add(Srch01_RsltR.$a_imp_flg);
				removeArray.add(Srch01_RsltR.$temp_ap_flg);

				if (isSame(up0().ope(), _ope_srch_cut)) {
					removeArray.add(Srch01_RsltR.$stk_insp_typ);
					removeArray.add(Srch01_RsltR.$stk_insp_typ_nm);
				}

				removeArray.add(Srch01_RsltR.$trd_cur_upri);
				removeArray.add(Srch01_RsltR.$base_cur_upri);
				removeArray.add(Srch01_RsltR.$ptax_cur_upri);
			}
		}
	}

	//FMCB CUSTOM END
}