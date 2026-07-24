package mcframe.serverMSBC.MSBCL0100;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBC.MSBCL0100.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.serverMSBC.MSBCL0100.Query.*;
import static mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil.*;
import mcframe.serverMSBC.MSBCL5010.*;
import java.util.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_OperOrdSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_OperOrdSrch_MC extends MSBCL_OperOrdSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 工程オーダを検索する。<br>
	 */
	public class Srch01 extends MSBCL_OperOrdSrch_MC_A.Srch01 {
		static final String EXPANDED_ORDER_ITM_ORD_NO_KEY = "itm_ord_no";

		static final String EXPANDED_ORDER_IO_SCHD_NO_KEY = "io_schd_no";

		static final String EXPANDED_ORDER_IO_SCHD_PR_NO_KEY = "io_schd_pr_no";

		static final String EXPANDED_ORDER_IO_SCHD_TYP_KEY = "io_schd_typ";

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			setUpOperOrdStsTyp();
			setUpPlnIfTgt();
			MCQueryPlan sql = MSBCL0100_MST_OPER_ORDER_S01();
			searchForDL(sql, up0(), down0());
		}

		protected void setUpOperOrdStsTyp() {
			if (up0().opn_flg()) up0().addStringColumn("wk_opn", MSC_OPER_ORD_STS_TYP.OPN.value());
			if (up0().sav_flg()) up0().addStringColumn("wk_save", MSC_OPER_ORD_STS_TYP.SAV.value());
			if (up0().fix_flg()) up0().addStringColumn("wk_fix", MSC_OPER_ORD_STS_TYP.FIX.value());
			if (up0().inst_flg()) up0().addStringColumn("wk_inst", MSC_OPER_ORD_STS_TYP.INST.value());
			if (up0().part_inst_flg()) up0().addStringColumn("wk_part_inst", MSC_OPER_ORD_STS_TYP.PART_INST.value());
			if (up0().cmpl_flg()) up0().addStringColumn("wk_cmpl", MSC_OPER_ORD_STS_TYP.CMPL.value());
		}

		protected void setUpPlnIfTgt() {
			if (up0().ord_rcv_tgt_flg() && !up0().not_ord_rcv_tgt_flg()) {
				up0().addStringColumn("wk_ord_rcv_tgt_flg", toTrueStr(true));
			}
			else if (!up0().ord_rcv_tgt_flg() && up0().not_ord_rcv_tgt_flg()) {
				up0().addStringColumn("wk_ord_rcv_tgt_flg", toFalseStr(false));
			}
			if (up0().ord_snd_tgt_flg() && !up0().not_ord_snd_tgt_flg()) {
				up0().addStringColumn("wk_ord_snd_tgt_flg", toTrueStr(true));
			}
			else if (!up0().ord_snd_tgt_flg() && up0().not_ord_snd_tgt_flg()) {
				up0().addStringColumn("wk_ord_snd_tgt_flg", toFalseStr(false));
			}
		}
		@Override
		protected void editListMain() {
			down0().forEach(r -> {
				setDownOperUnitSchdQty(r);
				setDownOperInstSchdQty(r);
				setDownOperUnitCd(r);
			});
			if (up0().gi_schd_flg()) {
				setDownGiSchdTm();
				MCList<Srch01_RsltR> res = MCList.create(Srch01_RsltR.class);
				for (Srch01_RsltR row : down0()) {
					if (isNull(row.gi_schd_dt())) {
						res.add(row);
						continue;
					}
					MCDate from = up0().gi_schd_hm_fr();
					MCDate to = up0().gi_schd_hm_to();
					MCDate giSchdHm = row.gi_schd_hm();
					if (!isNull(from) && giSchdHm.lt(from)) continue;
					if (!isNull(to) && giSchdHm.gt(to)) continue;
					res.add(row);
				}
				down0().setAll(res);
			}
		}

		protected void setDownOperUnitSchdQty(Srch01_RsltR row) {
			if (isSame(row.oper_unit_cd(), row.base_unit_cd())) row.oper_unit_schd_qty(row.oper_schd_qty());
			else row.oper_unit_schd_qty(convQtyBaseToOper(row.oper_schd_qty(), row.oper_conv_qty(), row.oper_std_qty(), row.dec_place(), row.unit_conv_rnd_typ()));
		}

		protected void setDownOperInstSchdQty(Srch01_RsltR row) {
			if (isNull(row.oper_unit_cd())) return;
			if (isNull(row.oper_inst_schd_qty())) return;
			row.oper_inst_schd_qty(convQtyBaseToOper(row.oper_inst_schd_qty(), row.oper_inst_conv_qty(), row.oper_inst_std_qty(), row.oper_unit_dec_place(), row.oper_unit_conv_rnd_typ()));
		}

		protected void setDownOperUnitCd(Srch01_RsltR row) {
			if (!isNull(row.oper_unit_cd())) return;
			row.oper_unit_cd(row.base_unit_cd());
			row.oper_unit_nm(row.base_unit_nm());
		}

		protected MCList<MCRow> _makeDeployContainer() {
			MCList<MCRow> l = MCList.create(MCRow.class);
			l.addStringColumn(EXPANDED_ORDER_ITM_ORD_NO_KEY);
			l.addStringColumn(EXPANDED_ORDER_IO_SCHD_NO_KEY);
			l.addStringColumn(EXPANDED_ORDER_IO_SCHD_PR_NO_KEY);
			l.addStringColumn(EXPANDED_ORDER_IO_SCHD_TYP_KEY);
			return l;
		}

		protected void setDownGiSchdTm() {
			for (MCList<Srch01_RsltR> itmOperOrds : down0().groupList(Srch01_RsltR.$itm_ord_no)) {

				Srch01_RsltR itmOperOrd = itmOperOrds.get(0);
				itmOperOrd.addNumberColumn("max_hrrchy", null);
				String procId = "MSPA_INS_HRRCHY$P_INS_ITM_ORD_R_HRRCHY_O";
				execProc(createSqlId(LOGIC_ID, procId, "01"),
						procId, itmOperOrd, null, ":itm_ord_no, :max_hrrchy");
				MCList<MCRow> hierarchy = _makeDeployContainer();
				executeQuery(hierarchy, MSBCL0100_MSW_ITM_ORD_R_HRRCHY_S01());
				if (hierarchy.isEmpty()) continue;

				MCList<MST_ITM_ORDER_R> dbcL = MCList.create(MST_ITM_ORDER_R.class);
				for (MCRow order : hierarchy.groupBy(EXPANDED_ORDER_ITM_ORD_NO_KEY)) {
					MST_ITM_ORDER_R dbc = MST_ITM_ORDER_R.create();
					dbc.itm_ord_no(order.getString(EXPANDED_ORDER_ITM_ORD_NO_KEY));
					dbcL.add(dbc);
				}

				MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_ITM_ORDER_R.create("T"));
				dbWkDelete("MSBCL0100_MSW_ITM_ORDER_D01", dbcL_bldr.getBaseDbc());
				dbWkInsert("MSBCL0100_MSW_ITM_ORDER_I01", dbcL, dbcL_bldr.getBaseDbc());
				MCList<MCRow> expandedOrders = _makeDeployContainer();
				executeQuery(expandedOrders, MSBCL0100_MST_ITM_ORDER_S01());

				MCIndexKey idxkey = expandedOrders.createIndex(EXPANDED_ORDER_ITM_ORD_NO_KEY, "WK_SORT_NUM");
				MCDate minDlvRqstTm = null;
				for (MCRow order : hierarchy) {
					MCRow rsltOrd = expandedOrders.getFirst(idxkey, order.getString(EXPANDED_ORDER_ITM_ORD_NO_KEY));
					if (isNull(rsltOrd) || isNull(rsltOrd.getString(EXPANDED_ORDER_IO_SCHD_NO_KEY)) || isNull(order.getString(EXPANDED_ORDER_IO_SCHD_PR_NO_KEY))) continue;
					order.setString(EXPANDED_ORDER_IO_SCHD_NO_KEY, rsltOrd.getString(EXPANDED_ORDER_IO_SCHD_NO_KEY));

					String ioSchdTyp = order.getString(EXPANDED_ORDER_IO_SCHD_TYP_KEY);
					MCList<MST_IO_SCHD_R> ioSchdL = MCList.create(MST_IO_SCHD_R.class);
					MST_IO_SCHD_R t1 = MST_IO_SCHD_R.create("T");
					MCQueryApiBuilder ioSchdL_bldr = MCQueryApiBuilder.create(t1);
					MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
					if (MSC_IO_SCHD_TYP.isSLS(ioSchdTyp)|| MSC_IO_SCHD_TYP.isSHIP_OUT(ioSchdTyp)) {
						ioSchdL_bldr.setSelect(t1.io_schd_no);
						ioSchdL_bldr.addSelect(t1.io_schd_pr_no);
						ioSchdL_bldr.addSelect(t1.io_schd_sub_no3);
						ioSchdL_bldr.addSelect(t2.ship_schd_no);
						ioSchdL_bldr.addSelect(t2.pd_inst_dlv_tm);
						ioSchdL_bldr.addInnerJoin(t2,bracket(t2.ship_schd_no.eq(t1.io_schd_sub_no3)));
						ioSchdL_bldr.setWhere(t1.io_schd_no.eq(bind("1")),order.getString(EXPANDED_ORDER_IO_SCHD_NO_KEY));
						ioSchdL_bldr.addWhereWithAnd(t1.io_schd_pr_no.eq(bind("1")),order.getString(EXPANDED_ORDER_IO_SCHD_PR_NO_KEY));
						dbSelect("MSBCL0100_MST_IO_SCHD_S01", ioSchdL, ioSchdL_bldr);
						if (!ioSchdL.isEmpty()) {
							MST_IO_SCHD_R ioSchdR = ioSchdL.get(0);
							if (isNull(minDlvRqstTm)) minDlvRqstTm = ioSchdR.getDate(MST_SHIP_SCHD_R.$pd_inst_dlv_tm);
							else {
								MCDate dlvRqstTm = ioSchdR.getDate(MST_SHIP_SCHD_R.$pd_inst_dlv_tm);
								if (minDlvRqstTm.gt(dlvRqstTm)) minDlvRqstTm = dlvRqstTm;
							}
						}
					}
					else if (MSC_IO_SCHD_TYP.isXFR_GI(ioSchdTyp)) {
						MST_WG_RQST_R st2 = MST_WG_RQST_R.create("T2"); 
						ioSchdL_bldr.setSelect(t1.io_schd_no);
						ioSchdL_bldr.addSelect(t1.io_schd_pr_no);
						ioSchdL_bldr.addSelect(t1.io_schd_sub_no2);
						ioSchdL_bldr.addSelect(st2.wg_rqst_no);
						ioSchdL_bldr.addSelect(st2.gi_rqst_tm);
						ioSchdL_bldr.addInnerJoin(st2, bracket( st2.wg_rqst_no.eq(t1.io_schd_sub_no2)));
						ioSchdL_bldr.setWhere(t1.io_schd_no.eq(bind("1")), order.getString(EXPANDED_ORDER_IO_SCHD_NO_KEY));
						ioSchdL_bldr.addWhereWithAnd(t1.io_schd_pr_no.eq(bind("1")), order.getString(EXPANDED_ORDER_IO_SCHD_PR_NO_KEY));
						ioSchdL_bldr.addWhereWithAnd(t1.io_schd_typ.eq(value(MSC_IO_SCHD_TYP.XFR_GI.value())));
						dbSelect("MSBCL0100_MST_IO_SCHD_S02", ioSchdL, ioSchdL_bldr);
						if (!ioSchdL.isEmpty()) {
							MST_IO_SCHD_R ioSchdR = ioSchdL.get(0);
							if (isNull(minDlvRqstTm)) minDlvRqstTm = ioSchdR.getDate(MST_WG_RQST_R.$gi_rqst_tm);
							else {
								MCDate dlvRqstTm = ioSchdR.getDate(MST_WG_RQST_R.$gi_rqst_tm);
								if (minDlvRqstTm.gt(dlvRqstTm)) minDlvRqstTm = dlvRqstTm;
							}
						}
					}
					if (!isSame(rsltOrd.getNumberNE("wk_sort_num"), MCNumber.valueOf(1))) {
						order.setString(EXPANDED_ORDER_ITM_ORD_NO_KEY, null);
					}
				}
				itmOperOrds.setDate(Srch01_RsltR.$gi_schd_dt, minDlvRqstTm);
				itmOperOrds.setDate(Srch01_RsltR.$gi_schd_hm, minDlvRqstTm);
			}
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 工程オーダを更新する。<br>
	 */
	public class Upd01 extends MSBCL_OperOrdSrch_MC_A.Upd01 {
		protected MCList<Chk01_DtlR> _addOperOrderL = MCList.create(Chk01_DtlR.class);
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			preProc();
			editUp();
			callThisChk();
			callUpdSv();
		}
		/**
		 * 前処理
		 */
		protected void preProc() {
			if (isFileImport()) {
				return;
			}

			// 品目オーダＮＯをキーに上り電文に存在しない工程オーダを取得
			_addOperOrderL = getOperOrder(up0());
			if (!_addOperOrderL.isEmpty()) {
				up0().addAll(_addOperOrderL);
			}
		}
		protected MCList<Chk01_DtlR> getOperOrder(MCList<Chk01_DtlR> up0){
			MCQueryApiBuilder itmOrderWkBldr = MCQueryApiBuilder.create(MST_ITM_ORDER_R.create("ITM_ORDER_KEY"));
			dbWkDelete("MSBCL0100_MSW_ITM_ORDER_D01", itmOrderWkBldr.getBaseDbc());
			dbWkInsert("MSBCL0100_MSW_ITM_ORDER_I01", up0.groupBy(Chk01_DtlR.$itm_ord_no), itmOrderWkBldr.getBaseDbc());
			MCQueryApiBuilder operOrderWkBldr = MCQueryApiBuilder.create(MST_OPER_ORDER_R.create("OPER_ORDER_KEY"));
			dbWkDelete("MSBCL0100_MSW_OPER_ORDER_D01", operOrderWkBldr.getBaseDbc());
			dbWkInsert("MSBCL0100_MSW_OPER_ORDER_I01", up0, operOrderWkBldr.getBaseDbc());

			MCList<Chk01_DtlR> operOrderL = MCList.create(Chk01_DtlR.class);
			MST_OPER_ORDER_R operOrder = MST_OPER_ORDER_R.create("OPER_ORDER");
			MSW_OPER_ORDER_KEY_R operOrderKey = MSW_OPER_ORDER_KEY_R.create("OPER_ORDER_KEY");
			MST_ITM_ORDER_R itmOrder = MST_ITM_ORDER_R.create("ITM_ORDER");
			MSW_ITM_ORDER_KEY_R itmOrderKey = MSW_ITM_ORDER_KEY_R.create("ITM_ORDER_KEY");
			MCQueryApiBuilder operOrderL_bldr = MCQueryApiBuilder.create(operOrder);
			// 上り電文の項目に合わせて取得
			operOrderL_bldr.setSelect(operOrder.oper_ord_no);
			operOrderL_bldr.addSelect(operOrder.itm_ord_no);
			operOrderL_bldr.addSelect(operOrder.oper_ord_sts_typ);
			operOrderL_bldr.addSelect(operOrder.oper_ptn);
			operOrderL_bldr.addSelect(operOrder.oper_cd);
			operOrderL_bldr.addSelect(operOrder.oper_seq);
			operOrderL_bldr.addSelect(operOrder.st_schd_tm);
			operOrderL_bldr.addSelect(operOrder.end_schd_tm);
			operOrderL_bldr.addSelect(operOrder.loc_cd);
			operOrderL_bldr.addSelect(itmOrder.itm_cd);
			operOrderL_bldr.addSelect(itmOrder.itm_sub1);
			operOrderL_bldr.addSelect(itmOrder.itm_sub2);
			operOrderL_bldr.addSelect(itmOrder.itm_sub3);
			operOrderL_bldr.addSelect(operOrder.oper_schd_qty);
			operOrderL_bldr.addSelect(operOrder.oper_rsrc);
			operOrderL_bldr.addSelect(operOrder.intr_rmrks);
			operOrderL_bldr.addSelect(operOrder.sub_char1);
			operOrderL_bldr.addSelect(operOrder.sub_char2);
			operOrderL_bldr.addSelect(operOrder.sub_char3);
			operOrderL_bldr.addSelect(itmOrder.ord_rcv_flg);
			operOrderL_bldr.addSelect(itmOrder.ord_snd_flg);
			operOrderL_bldr.addSelect(itmOrder.ext_sys_cd);
			operOrderL_bldr.addSelect(itmOrder.ext_itm_ord_no);
			operOrderL_bldr.addSelect(itmOrder.for_scheduler_frozen_flg);
			operOrderL_bldr.addSelect(operOrder.ext_oper_ord_no);
			operOrderL_bldr.addSelect(operOrder.scheduler_frozen_flg);
			operOrderL_bldr.addSelect((itmOrder.upd_cntr).as("itm_order_upd_cntr"));
			operOrderL_bldr.addInnerJoin(itmOrderKey, operOrder.itm_ord_no.eq(itmOrderKey.itm_ord_no));
			operOrderL_bldr.addInnerJoin(itmOrder, operOrder.itm_ord_no.eq(itmOrder.itm_ord_no));
			operOrderL_bldr.addWhereWithAnd(notExists(
					subQuery()
						.select(value("X"))
						.from(operOrderKey)
						.where(value(0).eq(value(0))
						.and(operOrder.oper_ord_no.eq(operOrderKey.oper_ord_no)))));
			dbSelect("MSBCL0100_OPER_ORDER_S01", operOrderL, operOrderL_bldr);

			return operOrderL;
		}

		protected void editUp() {
			int pegNoD = 0;
			for (Chk01_DtlR row : up0()) {
				row.peg_no_d(pegNoD++);
			}
		}

		protected void callThisChk() {
			MSBCL_OperOrdSrch.Chk01 chk = MSBCL_OperOrdSrch.crtChk01();
			chk.up0().setAll(up0());
			chk.exec();
			up0().setAll(chk.down0());
		}

		protected void callUpdSv() {
			MCList<Chk01_DtlR> noErrL = up0().subList(r -> !r.err_flg());
			MSBCL_OrdRegService.Ord_Upd01 sv = MSBCL_OrdRegService.crtOrd_Upd01();
			for (MCList<Chk01_DtlR> itmOperOrds : noErrL.groupList(Chk01_DtlR.$itm_ord_no)) {
				MCList<Chk01_DtlR> firstOrder = MCList.create(Chk01_DtlR.class);
				firstOrder.add(itmOperOrds.get(0));
				addAll(sv.up0(), firstOrder, createMap_Ord_Upd01_Dtl1R_Chk01_DtlR());
				addAll(sv.up1(), itmOperOrds, createMap_Ord_Upd01_Dtl2R_Chk01_DtlR());
			}
			sv.exec();
			for (Chk01_DtlR itmOperOrd : noErrL) {
				itmOperOrd.rtn_sts_typ(itmOperOrd.err_flg() ? MAC_RTN_STS_TYP.ERR.value() : MAC_RTN_STS_TYP.OK.value());
			}
			down0().setAll(up0());
		}
		
		protected boolean isFileImport() {
			return isNull(up0().get(0).oper_ord_no());
		}
		
		@Override
		protected void doEditDown() {
			super.doEditDown();

			if (!_addOperOrderL.isEmpty()) {
				// 追加した工程オーダを下り電文から取り除く
				down0().removeAll(_addOperOrderL);
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 工程オーダを更新ためにチェックを行う。<br>
	 */
	public class Chk01 extends MSBCL_OperOrdSrch_MC_A.Chk01 {
		protected MCList<MST_ITM_ORDER_R> _itmOrdL = MCList.create(MST_ITM_ORDER_R.class);

		protected MCList<MAM_ITM_OPER_R> _itmOperL = MCList.create(MAM_ITM_OPER_R.class);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			editUp();
			callChkSv();
		}

		protected void editUp() {
			up0().forEach(r -> {
				r.setStatus(MCRow.MODIFY);
				r.mrp_typ(MSC_MRP_TYP.MRP.value());
				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				r.oper_ord_pr_flg(false);
				r.io_schd_pr_flg(true);
				r.oord().itm_ord_no(r.ord().itm_ord_no());
				r.oord().oper_ptn(r.ord().oper_ptn());
			});
		}

		protected void callChkSv() {
			MCList<Chk01_DtlR> noErrL = up0().subList(r -> !r.err_flg());
			MSBCL_OrdRegService.Ord_Chk01 ope = MSBCL_OrdRegService.crtOrd_Chk01();
			for (MCList<Chk01_DtlR> itmOperOrds : noErrL.groupList(Chk01_DtlR.$itm_ord_no)) {
				MCList<Chk01_DtlR> firstOrder = MCList.create(Chk01_DtlR.class);
				firstOrder.add(itmOperOrds.get(0));
				addAll(ope.up0(), firstOrder, createMap_Ord_Upd01_Dtl1R_Chk01_DtlR());
				addAll(ope.up1(), itmOperOrds, createMap_Ord_Upd01_Dtl2R_Chk01_DtlR());
			}
			ope.exec();
			MCIndexKey idxkey = ope.down0().createIndex(Ord_Upd01_Dtl1R.$peg_no);
			for (MCList<Chk01_DtlR> itmOperOrds : noErrL.groupList(Chk01_DtlR.$itm_ord_no)) {
				Ord_Upd01_Dtl1R downR = ope.down0().getFirst(idxkey, itmOperOrds.get(0).peg_no());
				itmOperOrds.setBoolean(Chk01_DtlR.$err_flg, downR.err_flg());
				itmOperOrds.setString(Chk01_DtlR.$unit_cd, downR.unit_cd());
				itmOperOrds.setString(Chk01_DtlR.$lot_mng_typ, downR.lot_mng_typ());
				itmOperOrds.setString(Chk01_DtlR.$sublot_mng_typ, downR.sublot_mng_typ());
			}
			down0().setAll(up0());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			MCList<Chk01_DtlR> noErrL = getChkList(up0());

			MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
			MCQueryApiBuilder itmOrdL_bldr = MCQueryApiBuilder.create(t);

			itmOrdL_bldr.setSelect(t.itm_ord_no, t.itm_ord_typ, t.ord_gnrt_typ, t.itm_cd,
					t.itm_sub1, t.itm_sub2, t.itm_sub3, t.ver_no, t.strg_loc_cd,
					t.mfg_loc_cd, t.mst_mfg_loc_cd, t.sppl_cd, t.maker_cd, t.rqst_loc_cd,
					t.rqst_wg_cd, t.bom_ptn, t.oper_ptn, t.inst_qty, t.yield_schd_qty,
					t.nmr_qty, t.dnm_qty, t.fxd_yield_qty, t.itm_ord_sts_typ, t.fix_dt,
					t.po_schd_dt, t.mrp_po_schd_dt, t.mrp_purc_lt, t.purc_lt,
					t.mfg_st_schd_dt, t.mrp_mfg_st_schd_dt, t.mfg_end_schd_dt,
					t.mrp_mfg_end_schd_dt, t.mrp_mfg_lt, t.mfg_lt, t.gi_schd_dt,
					t.mrp_gi_schd_dt, t.strg_schd_dt, t.mrp_strg_schd_dt, t.xfr_lt,
					t.accpt_schd_dt, t.mrp_accpt_schd_dt, t.accpt_insp_lt,
					t.insp_st_schd_dt, t.mrp_insp_st_schd_dt, t.insp_end_schd_dt,
					t.mrp_insp_end_schd_dt, t.insp_lt, t.insp_offst, t.avl_schd_dt,
					t.mrp_avl_schd_dt, t.master_dt, t.sno1, t.sno_typ1, t.sno2,
					t.sno_typ2, t.sno3, t.sno_typ3, t.sno4, t.sno_typ4, t.lmt_dt, t.wg_cd,
					t.not_fix_flg, t.ord_fix_pd, t.rqmt_no, t.inst_po_cnt_rmrks,
					t.sim_mrp_no, t.io_schd_pr_no, t.upd_cntr, t.for_scheduler_frozen_flg);
			dbSelectKeyForUpdate("MSBCL0100_MST_ITM_ORDER_S01", _itmOrdL, itmOrdL_bldr, up0());
			MCIndexKey itmOrdIdxkey = _itmOrdL.createIndex(MST_ITM_ORDER_R.$itm_ord_no);

			int pegNo = 0;
			for (MCList<Chk01_DtlR> itmOperOrds : noErrL.groupList(Chk01_DtlR.$itm_ord_no)) {
				Chk01_DtlR itmOperOrd = itmOperOrds.get(0);
				MST_ITM_ORDER_R itmOrdR = _itmOrdL.getFirst(itmOrdIdxkey, itmOperOrd.itm_ord_no());
				if (!MSC_ITM_ORD_STS_TYP.isOPN(itmOrdR.itm_ord_sts_typ()) && !MSC_ITM_ORD_STS_TYP.isSAV(itmOrdR.itm_ord_sts_typ())) {
					itmOperOrds.setBoolean(Chk01_DtlR.$err_flg, true);
					continue;
				}
				if (itmOrdR.for_scheduler_frozen_flg()) {
					itmOperOrds.setBoolean(Chk01_DtlR.$err_flg, true);
					MCMessageList scheFrozenMsg = new MCMessageList();
					scheFrozenMsg.add(new MCMessage(itmOperOrd, null, MSBCL1401, itmOrdR.itm_ord_no()));
					msgL.addAll(scheFrozenMsg);
				}
				MCMessageList updCntrErrMsgL = checkUpdCntrNE(itmOperOrd, Chk01_DtlR.$itm_order_upd_cntr, itmOrdR);
				if (!updCntrErrMsgL.isEmpty()) {
					itmOperOrds.setBoolean(Chk01_DtlR.$err_flg, true);
					msgL.addAll(updCntrErrMsgL);
				}
				MCMessageList dacErrMsgL = checkWritableLocCdDac(itmOrdR, MST_ITM_ORDER_R.$strg_loc_cd);
				if (!dacErrMsgL.isEmpty()) {
					itmOperOrds.setBoolean(Chk01_DtlR.$err_flg, true);
					msgL.addAll(dacErrMsgL);
				}

				itmOperOrds.setNumber(Chk01_DtlR.$peg_no, pegNo++);
				itmOperOrds.setString(Chk01_DtlR.$itm_ord_typ, itmOrdR.itm_ord_typ());
				itmOperOrds.setString(Chk01_DtlR.$ord_gnrt_typ, itmOrdR.ord_gnrt_typ());
				itmOperOrds.setString(Chk01_DtlR.$itm_cd, itmOrdR.itm_cd());
				itmOperOrds.setString(Chk01_DtlR.$itm_sub1, itmOrdR.itm_sub1());
				itmOperOrds.setString(Chk01_DtlR.$itm_sub2, itmOrdR.itm_sub2());
				itmOperOrds.setString(Chk01_DtlR.$itm_sub3, itmOrdR.itm_sub3());
				itmOperOrds.setString(Chk01_DtlR.$ver_no, itmOrdR.ver_no());
				itmOperOrds.setString(Chk01_DtlR.$strg_loc_cd, itmOrdR.strg_loc_cd());
				itmOperOrds.setString(Chk01_DtlR.$mfg_loc_cd, itmOrdR.mfg_loc_cd());
				itmOperOrds.setString(Chk01_DtlR.$mst_mfg_loc_cd, itmOrdR.mst_mfg_loc_cd());
				itmOperOrds.setString(Chk01_DtlR.$sppl_cd, itmOrdR.sppl_cd());
				itmOperOrds.setString(Chk01_DtlR.$maker_cd, itmOrdR.maker_cd());
				itmOperOrds.setString(Chk01_DtlR.$rqst_loc_cd, itmOrdR.rqst_loc_cd());
				itmOperOrds.setString(Chk01_DtlR.$rqst_wg_cd, itmOrdR.rqst_wg_cd());
				itmOperOrds.setString(Chk01_DtlR.$bom_ptn, itmOrdR.bom_ptn());
				itmOperOrds.setString(Chk01_DtlR.$oper_ptn, itmOrdR.oper_ptn());
				itmOperOrds.setNumber(Chk01_DtlR.$inst_qty, itmOrdR.inst_qty());
				itmOperOrds.setNumber(Chk01_DtlR.$yield_schd_qty, itmOrdR.yield_schd_qty());
				itmOperOrds.setNumber(Chk01_DtlR.$nmr_qty, itmOrdR.nmr_qty());
				itmOperOrds.setNumber(Chk01_DtlR.$dnm_qty, itmOrdR.dnm_qty());
				itmOperOrds.setNumber(Chk01_DtlR.$fxd_yield_qty, itmOrdR.fxd_yield_qty());
				itmOperOrds.setString(Chk01_DtlR.$itm_ord_sts_typ, itmOrdR.itm_ord_sts_typ());
				itmOperOrds.setDate(Chk01_DtlR.$fix_dt, itmOrdR.fix_dt());
				itmOperOrds.setDate(Chk01_DtlR.$po_schd_dt, itmOrdR.po_schd_dt());
				itmOperOrds.setDate(Chk01_DtlR.$mrp_po_schd_dt, itmOrdR.mrp_po_schd_dt());
				itmOperOrds.setNumber(Chk01_DtlR.$mrp_purc_lt, itmOrdR.mrp_purc_lt());
				itmOperOrds.setNumber(Chk01_DtlR.$purc_lt, itmOrdR.purc_lt());
				itmOperOrds.setDate(Chk01_DtlR.$mfg_st_schd_dt, itmOrdR.mfg_st_schd_dt());
				itmOperOrds.setDate(Chk01_DtlR.$mrp_mfg_st_schd_dt, itmOrdR.mrp_mfg_st_schd_dt());
				itmOperOrds.setDate(Chk01_DtlR.$mfg_end_schd_dt, itmOrdR.mfg_end_schd_dt());
				itmOperOrds.setDate(Chk01_DtlR.$mrp_mfg_end_schd_dt, itmOrdR.mrp_mfg_end_schd_dt());
				itmOperOrds.setNumber(Chk01_DtlR.$mrp_mfg_lt, itmOrdR.mrp_mfg_lt());
				itmOperOrds.setNumber(Chk01_DtlR.$mfg_lt, itmOrdR.mfg_lt());
				itmOperOrds.setDate(Chk01_DtlR.$gi_schd_dt, itmOrdR.gi_schd_dt());
				itmOperOrds.setDate(Chk01_DtlR.$mrp_gi_schd_dt, itmOrdR.mrp_gi_schd_dt());
				itmOperOrds.setDate(Chk01_DtlR.$strg_schd_dt, itmOrdR.strg_schd_dt());
				itmOperOrds.setDate(Chk01_DtlR.$mrp_strg_schd_dt, itmOrdR.mrp_strg_schd_dt());
				itmOperOrds.setNumber(Chk01_DtlR.$xfr_lt, itmOrdR.xfr_lt());
				itmOperOrds.setDate(Chk01_DtlR.$accpt_schd_dt, itmOrdR.accpt_schd_dt());
				itmOperOrds.setDate(Chk01_DtlR.$mrp_accpt_schd_dt, itmOrdR.mrp_accpt_schd_dt());
				itmOperOrds.setNumber(Chk01_DtlR.$accpt_insp_lt, itmOrdR.accpt_insp_lt());
				itmOperOrds.setDate(Chk01_DtlR.$insp_st_schd_dt, itmOrdR.insp_st_schd_dt());
				itmOperOrds.setDate(Chk01_DtlR.$mrp_insp_st_schd_dt, itmOrdR.mrp_insp_st_schd_dt());
				itmOperOrds.setDate(Chk01_DtlR.$insp_end_schd_dt, itmOrdR.insp_end_schd_dt());
				itmOperOrds.setDate(Chk01_DtlR.$mrp_insp_end_schd_dt, itmOrdR.mrp_insp_end_schd_dt());
				itmOperOrds.setNumber(Chk01_DtlR.$insp_lt, itmOrdR.insp_lt());
				itmOperOrds.setNumber(Chk01_DtlR.$insp_offst, itmOrdR.insp_offst());
				itmOperOrds.setDate(Chk01_DtlR.$avl_schd_dt, itmOrdR.avl_schd_dt());
				itmOperOrds.setDate(Chk01_DtlR.$mrp_avl_schd_dt, itmOrdR.mrp_avl_schd_dt());
				itmOperOrds.setDate(Chk01_DtlR.$master_dt, itmOrdR.master_dt());
				itmOperOrds.setString(Chk01_DtlR.$sno1, itmOrdR.sno1());
				itmOperOrds.setString(Chk01_DtlR.$sno_typ1, itmOrdR.sno_typ1());
				itmOperOrds.setString(Chk01_DtlR.$sno2, itmOrdR.sno2());
				itmOperOrds.setString(Chk01_DtlR.$sno_typ2, itmOrdR.sno_typ2());
				itmOperOrds.setString(Chk01_DtlR.$sno3, itmOrdR.sno3());
				itmOperOrds.setString(Chk01_DtlR.$sno_typ3, itmOrdR.sno_typ3());
				itmOperOrds.setString(Chk01_DtlR.$sno4, itmOrdR.sno4());
				itmOperOrds.setString(Chk01_DtlR.$sno_typ4, itmOrdR.sno_typ4());
				itmOperOrds.setDate(Chk01_DtlR.$lmt_dt, itmOrdR.lmt_dt());
				itmOperOrds.setString(Chk01_DtlR.$wg_cd, itmOrdR.wg_cd());
				itmOperOrds.setBoolean(Chk01_DtlR.$not_fix_flg, itmOrdR.not_fix_flg());
				itmOperOrds.setNumber(Chk01_DtlR.$ord_fix_pd, itmOrdR.ord_fix_pd());
				itmOperOrds.setString(Chk01_DtlR.$rqmt_no, itmOrdR.rqmt_no());
				itmOperOrds.setString(Chk01_DtlR.$inst_po_cnt_rmrks, itmOrdR.inst_po_cnt_rmrks());
				itmOperOrds.setString(Chk01_DtlR.$sim_mrp_no, itmOrdR.sim_mrp_no());
				itmOperOrds.setString(Chk01_DtlR.$io_schd_pr_no, itmOrdR.io_schd_pr_no());
			}

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MAM_LOC_R loc = MAM_LOC_R.create("LOC");
			MAM_ITM_OPER_R t = MAM_ITM_OPER_R.create("T");
			MCQueryApiBuilder itmOperL_bldr = MCQueryApiBuilder.create(t);

			MCList<Chk01_DtlR> noErrL = getChkList(up0());

			_itmOperL.addStringColumn("wg_cd");
			itmOperL_bldr.addSelect(loc.wg_cd);
			itmOperL_bldr.addLeftOuterJoin(loc, bracket(t.loc_cd.eq(loc.loc_cd)));
			itmOperL_bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
			itmOperL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			itmOperL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			itmOperL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			itmOperL_bldr.addWhereWithAnd(t.oper_ptn.eq(bind("oper_ptn")));
			itmOperL_bldr.addWhereWithAnd(t.oper_cd.eq(bind("oper_cd")));
			itmOperL_bldr.addWhereWithAnd(t.oper_seq.eq(bind("oper_seq")));
			itmOperL_bldr.addWhereWithAnd(bind("master_dt").between(t.st_dt, t.end_dt));
			dbSelect("MSBCL0100_MAM_ITM_OPER_S01", _itmOperL, itmOperL_bldr, up0());
			MCIndexKey itmOperIdx = _itmOperL.createIndex(MAM_ITM_OPER_R.$itm_cd, MAM_ITM_OPER_R.$itm_sub1,
					MAM_ITM_OPER_R.$itm_sub2, MAM_ITM_OPER_R.$itm_sub3,
					MAM_ITM_OPER_R.$oper_ptn, MAM_ITM_OPER_R.$oper_cd,
					MAM_ITM_OPER_R.$oper_seq);

			for (MCList<Chk01_DtlR> itmOperOrds : noErrL.groupList(Chk01_DtlR.$itm_ord_no)) {
				for (Chk01_DtlR itmOperOrd : itmOperOrds) {
					MST_OPER_ORDER_R operOrd = itmOperOrd.oord();
					MCList<MAM_ITM_OPER_R> dateMatchedItmOper = _itmOperL.subList(itmOperIdx, itmOperOrd.itm_cd(), itmOperOrd.itm_sub1(),
							itmOperOrd.itm_sub2(), itmOperOrd.itm_sub3(), itmOperOrd.oper_ptn(), itmOperOrd.oper_cd(), itmOperOrd.oper_seq())
							.subList(r -> r.st_dt().lteDate(itmOperOrd.master_dt()) && r.end_dt().gteDate(itmOperOrd.master_dt()));
					MCList<MAM_ITM_OPER_R> locationMatchedItmOper = dateMatchedItmOper.subList(r -> isSame(itmOperOrd.mfg_loc_cd(), r.loc_cd()));
					MCList<MAM_ITM_OPER_R> matchedItmOper = isNull(locationMatchedItmOper) ? locationMatchedItmOper.subList(r -> MAC_STR.isNULL_VAL(r.loc_cd())) : locationMatchedItmOper;
					if (isNull(matchedItmOper)) {
						msgL.addAll(getRecordNotFoundMsg("MA", "MAM_ITM_OPER", new String[] {
								MAM_ITM_OPER_R.$itm_cd, MAM_ITM_OPER_R.$itm_sub1, MAM_ITM_OPER_R.$itm_sub2,
								MAM_ITM_OPER_R.$itm_sub3, MAM_ITM_OPER_R.$loc_cd, MAM_ITM_OPER_R.$oper_ptn,
								MAM_ITM_OPER_R.$oper_cd, MAM_ITM_OPER_R.$oper_seq
						}, new Comparable<?>[] {
								itmOperOrd.itm_cd(), itmOperOrd.itm_sub1(), itmOperOrd.itm_sub2(),
								itmOperOrd.itm_sub3(), operOrd.loc_cd(), operOrd.oper_ptn(),
								operOrd.oper_cd(), operOrd.oper_seq()
						}, itmOperOrd));
						itmOperOrds.setBoolean(Chk01_DtlR.$err_flg, true);
						continue;
					}
					MAM_ITM_OPER_R itmOperR = matchedItmOper.get(0);
					operOrd.disp_seq(itmOperR.disp_seq());
					operOrd.yield_oper_flg(itmOperR.yield_oper_flg());
					operOrd.oper_lt(itmOperR.oper_lt());
					operOrd.oper_offst_typ(itmOperR.oper_offst_typ());
					operOrd.oper_offst(itmOperR.oper_offst());
					operOrd.wg_cd(itmOperOrd.wg_cd());
				}
				setYieldOper(itmOperOrds);
			}

			return msgL;
		}
	}
	
	/**
	 * 品目オーダに対応する工程オーダの出来高工程が１件も存在しない場合
	 * 表示順、工程コード、工程連番のソート順で最後の工程オーダを出来高工程とする
	 */
	protected void setYieldOper(MCList<Chk01_DtlR> itmOperOrds) {
		MCSortPolicy sortOper = new MCSortPolicy();
		sortOper.add(SortType.DESC, Chk01_DtlR.$disp_seq);
		sortOper.add(SortType.DESC, Chk01_DtlR.$oper_cd);
		sortOper.add(SortType.DESC, Chk01_DtlR.$oper_seq);

		for (MCList<Chk01_DtlR> operL : itmOperOrds.groupList(Chk01_DtlR.$itm_ord_no)) {
			if (isNull(operL.getFirst(Chk01_DtlR.$yield_oper_flg, true))) {
				operL.sort(sortOper);
				operL.get(0).yield_oper_flg(true);
			}
		}
	}

//	mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl1R
//	mcframe.serverMSBC.MSBCL0100.Chk01_DtlR
	protected Map_Ord_Upd01_Dtl1R_Chk01_DtlR<Ord_Upd01_Dtl1R, Chk01_DtlR> createMap_Ord_Upd01_Dtl1R_Chk01_DtlR() {
		return new Map_Ord_Upd01_Dtl1R_Chk01_DtlR<Ord_Upd01_Dtl1R, Chk01_DtlR>();
	}

	public class Map_Ord_Upd01_Dtl1R_Chk01_DtlR<D extends Ord_Upd01_Dtl1R, S extends Chk01_DtlR> extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(Ord_Upd01_Dtl1R.$mrp_typ, Chk01_DtlR.$mrp_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$ord, Chk01_DtlR.$ord);
			addColumnPathMap(Ord_Upd01_Dtl1R.$unit_cd, Chk01_DtlR.$unit_cd);
			addColumnPathMap(Ord_Upd01_Dtl1R.$oper_ord_pr_flg, Chk01_DtlR.$oper_ord_pr_flg);
			addColumnPathMap(Ord_Upd01_Dtl1R.$io_schd_pr_flg, Chk01_DtlR.$io_schd_pr_flg);
			addColumnPathMap(Ord_Upd01_Dtl1R.$err_flg, Chk01_DtlR.$err_flg);
			addColumnPathMap(Ord_Upd01_Dtl1R.$lot_mng_typ, Chk01_DtlR.$lot_mng_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$sublot_mng_typ, Chk01_DtlR.$sublot_mng_typ);
			addColumnPathMap(Ord_Upd01_Dtl1R.$oper_ord_sts_typ, Chk01_DtlR.$oper_ord_sts_typ);

		}
	}

//	mcframe.serverMSBC.MSBCL5010.Ord_Upd01_Dtl2R
//	mcframe.serverMSBC.MSBCL0100.Chk01_DtlR
	protected Map_Ord_Upd01_Dtl2R_Chk01_DtlR<Ord_Upd01_Dtl2R, Chk01_DtlR> createMap_Ord_Upd01_Dtl2R_Chk01_DtlR() {
		return new Map_Ord_Upd01_Dtl2R_Chk01_DtlR<Ord_Upd01_Dtl2R, Chk01_DtlR>();
	}

	public class Map_Ord_Upd01_Dtl2R_Chk01_DtlR<D extends Ord_Upd01_Dtl2R, S extends Chk01_DtlR> extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Upd01_Dtl2R.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(Ord_Upd01_Dtl2R.$peg_no_d, Chk01_DtlR.$peg_no_d);
			addColumnPathMap(Ord_Upd01_Dtl2R.$oord, Chk01_DtlR.$oord);
			addColumnPathMap(Ord_Upd01_Dtl2R.$mst_mfg_loc_cd, Chk01_DtlR.$mst_mfg_loc_cd);

		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * ファイルから工程オーダを取り込むために、チェックを行う。<br>
	 */
	public class Chk02 extends MSBCL_OperOrdSrch_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCList<Chk02_DtlR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				callOrdRegImpSrv(notErrL);
			}
			setErrToRtnStsTyp();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			MCList<Chk02_DtlR> noErrL = getChkList(up0());
			for (MCList<Chk02_DtlR> itmOperOrds : noErrL.groupList(Chk02_DtlR.$itm_ord_no)) {
				MST_ITM_ORDER_R itmOrd = itmOperOrds.get(0).ord();

				MCList<MST_OPER_ORDER_R> operOrderL = MCList.create(MST_OPER_ORDER_R.class);
				MST_OPER_ORDER_R t = MST_OPER_ORDER_R.create("T");
				MCQueryApiBuilder operOrderL_bldr = MCQueryApiBuilder.create(t);
				operOrderL_bldr.setWhere(t.itm_ord_no.eq(bind("1")),itmOrd.getString(MST_ITM_ORDER_R.$itm_ord_no));
				dbSelect("MSBCL0100_MST_OPER_ORDER_S01", operOrderL, operOrderL_bldr);
				if (operOrderL.isEmpty()) continue;
				
				MCList<MST_ITM_ORDER_R> itmOrderL = MCList.create(MST_ITM_ORDER_R.class);
				MST_ITM_ORDER_R t1 = MST_ITM_ORDER_R.create("T");
				MCQueryApiBuilder itmOrderL_bldr = MCQueryApiBuilder.create(t1);
				itmOrderL_bldr.setWhere(t1.itm_ord_no.eq(bind("1")),itmOrd.getString(MST_ITM_ORDER_R.$itm_ord_no));
				dbSelect("MSBCL0100_MST_ITM_ORDER_S02", itmOrderL, itmOrderL_bldr);
				if (itmOrderL.isEmpty()) continue;
				
				for (Chk02_DtlR itmOperR : itmOperOrds) {
					MCList<MST_OPER_ORDER_R> tmpOperOrderL = MCList.create(MST_OPER_ORDER_R.class);
					tmpOperOrderL = operOrderL.subList(r -> isSame(r.oper_cd(), itmOperR.oper_cd()) && isSame(r.oper_seq(), itmOperR.oper_seq()));
					if (!tmpOperOrderL.isEmpty()) {
						itmOperR.loc_cd(tmpOperOrderL.get(0).loc_cd());
					}
					
					MCList<MST_ITM_ORDER_R> tmpItmOrderL = MCList.create(MST_ITM_ORDER_R.class);
					tmpItmOrderL = itmOrderL.subList(r -> isSame(r.itm_ord_no(), itmOperR.itm_ord_no()));
					if (!tmpItmOrderL.isEmpty()) {
						itmOperR.mfg_loc_cd(tmpItmOrderL.get(0).mfg_loc_cd());
					}
				}
				
				int tranOperCount = operOrderL.groupBy(MST_OPER_ORDER_R.$oper_cd, MST_OPER_ORDER_R.$oper_seq).size();
				int upOperCount = itmOperOrds.groupBy(Chk02_DtlR.$oper_cd, Chk02_DtlR.$oper_seq).size();
				if (upOperCount < tranOperCount) {
					for (Chk02_DtlR itmOperOrd : itmOperOrds) {
						MCMessagePool.add(new MCMessage(itmOperOrd, null, MSBCL1308, itmOperOrd.itm_cd(), itmOperOrd.oper_ptn(), itmOperOrd.mfg_loc_cd()));
					}
					itmOperOrds.setBoolean(Chk02_DtlR.$err_flg, true);
				}
				else if (upOperCount > tranOperCount) {
					for (Chk02_DtlR itmOperOrd : itmOperOrds) {
						MCMessagePool.add(new MCMessage(itmOperOrd, null, MSBCL1309, itmOperOrd.itm_cd(), itmOperOrd.oper_ptn(), itmOperOrd.mfg_loc_cd()));
					}
					itmOperOrds.setBoolean(Chk02_DtlR.$err_flg, true);
				}
				
				if (itmOrderL.get(0).for_scheduler_frozen_flg()) {
					MCMessagePool.add(new MCMessage(itmOrd, null, MSBCL1402, itmOrderL.get(0).itm_ord_no()));
					itmOperOrds.setBoolean(Chk02_DtlR.$err_flg, true);
				}
			}
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk02_DtlR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				msgL.addAll(checkSub(notErrL));
			}
			return msgL;
		}

		protected MCMessageList checkSub(MCList<Chk02_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();
			for (Chk02_DtlR r : notErrL) {
				msgL.addAll(checkWritableLocCdDac(r, Chk02_DtlR.$loc_cd));
			}
			return msgL;
		}

		/**
		 * 工程オーダ取込チェックサービス
		 */
		protected void callOrdRegImpSrv(MCList<Chk02_DtlR> notErrL) {
			MSBCL_OrdRegService.Ord_Imp02 ope = MSBCL_OrdRegService.crtOrd_Imp02();
			addAll(ope.up0(), notErrL, createMap_Ord_Imp02_DtlR_Chk02_DtlR());
			ope.exec();

			copyErrFlg(notErrL, ope.down0());
			MCJoinKey<MCList<Ord_Imp02_DtlR>> jk = notErrL.join(Chk02_DtlR.$peg_no, ope.down0(), Ord_Imp02_DtlR.$peg_no);
			join(notErrL, jk, createMap_Chk02_DtlR_Ord_Imp02_DtlR());
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		protected Map_Ord_Imp02_DtlR_Chk02_DtlR<Ord_Imp02_DtlR, Chk02_DtlR> createMap_Ord_Imp02_DtlR_Chk02_DtlR() {
			return new Map_Ord_Imp02_DtlR_Chk02_DtlR<Ord_Imp02_DtlR, Chk02_DtlR>();
		}

		public class Map_Ord_Imp02_DtlR_Chk02_DtlR<D extends Ord_Imp02_DtlR, S extends Chk02_DtlR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Imp02_DtlR.$peg_no, Chk02_DtlR.$peg_no);
				addColumnPathMap(Ord_Imp02_DtlR.$itm_ord_no, Chk02_DtlR.$itm_ord_no);
				addColumnPathMap(Ord_Imp02_DtlR.$itm_cd, Chk02_DtlR.$itm_cd);
				addColumnPathMap(Ord_Imp02_DtlR.$itm_sub1, Chk02_DtlR.$itm_sub1);
				addColumnPathMap(Ord_Imp02_DtlR.$itm_sub2, Chk02_DtlR.$itm_sub2);
				addColumnPathMap(Ord_Imp02_DtlR.$itm_sub3, Chk02_DtlR.$itm_sub3);
				addColumnPathMap(Ord_Imp02_DtlR.$oper_ptn, Chk02_DtlR.$oper_ptn);
				addColumnPathMap(Ord_Imp02_DtlR.$oord, Chk02_DtlR.$oord);
			}
		}

		protected Map_Chk02_DtlR_Ord_Imp02_DtlR<Chk02_DtlR, Ord_Imp02_DtlR> createMap_Chk02_DtlR_Ord_Imp02_DtlR() {
			return new Map_Chk02_DtlR_Ord_Imp02_DtlR<Chk02_DtlR, Ord_Imp02_DtlR>();
		}

		public class Map_Chk02_DtlR_Ord_Imp02_DtlR<D extends Chk02_DtlR, S extends Ord_Imp02_DtlR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_DtlR.$itm_ord_typ, Ord_Imp02_DtlR.$itm_ord_typ);
				addColumnPathMap(Chk02_DtlR.$rqst_wg_cd, Ord_Imp02_DtlR.$rqst_wg_cd);
				addColumnPathMap(Chk02_DtlR.$bom_ptn, Ord_Imp02_DtlR.$bom_ptn);
				addColumnPathMap(Chk02_DtlR.$oper_ptn, Ord_Imp02_DtlR.$oper_ptn);
				addColumnPathMap(Chk02_DtlR.$inst_qty, Ord_Imp02_DtlR.$inst_qty);
				addColumnPathMap(Chk02_DtlR.$yield_schd_qty, Ord_Imp02_DtlR.$yield_schd_qty);
				addColumnPathMap(Chk02_DtlR.$nmr_qty, Ord_Imp02_DtlR.$nmr_qty);
				addColumnPathMap(Chk02_DtlR.$dnm_qty, Ord_Imp02_DtlR.$dnm_qty);
				addColumnPathMap(Chk02_DtlR.$fxd_yield_qty, Ord_Imp02_DtlR.$fxd_yield_qty);
				addColumnPathMap(Chk02_DtlR.$po_schd_dt, Ord_Imp02_DtlR.$po_schd_dt);
				addColumnPathMap(Chk02_DtlR.$purc_lt, Ord_Imp02_DtlR.$purc_lt);
				addColumnPathMap(Chk02_DtlR.$mfg_st_schd_dt, Ord_Imp02_DtlR.$mfg_st_schd_dt);
				addColumnPathMap(Chk02_DtlR.$mfg_end_schd_dt, Ord_Imp02_DtlR.$mfg_end_schd_dt);
				addColumnPathMap(Chk02_DtlR.$mfg_lt, Ord_Imp02_DtlR.$mfg_lt);
				addColumnPathMap(Chk02_DtlR.$gi_schd_dt, Ord_Imp02_DtlR.$gi_schd_dt);
				addColumnPathMap(Chk02_DtlR.$strg_schd_dt, Ord_Imp02_DtlR.$strg_schd_dt);
				addColumnPathMap(Chk02_DtlR.$xfr_lt, Ord_Imp02_DtlR.$xfr_lt);
				addColumnPathMap(Chk02_DtlR.$accpt_schd_dt, Ord_Imp02_DtlR.$accpt_schd_dt);
				addColumnPathMap(Chk02_DtlR.$accpt_insp_lt, Ord_Imp02_DtlR.$accpt_insp_lt);
				addColumnPathMap(Chk02_DtlR.$insp_st_schd_dt, Ord_Imp02_DtlR.$insp_st_schd_dt);
				addColumnPathMap(Chk02_DtlR.$insp_end_schd_dt, Ord_Imp02_DtlR.$insp_end_schd_dt);
				addColumnPathMap(Chk02_DtlR.$insp_lt, Ord_Imp02_DtlR.$insp_lt);
				addColumnPathMap(Chk02_DtlR.$insp_offst, Ord_Imp02_DtlR.$insp_offst);
				addColumnPathMap(Chk02_DtlR.$avl_schd_dt, Ord_Imp02_DtlR.$avl_schd_dt);
				addColumnPathMap(Chk02_DtlR.$wg_cd, Ord_Imp02_DtlR.$wg_cd);
				addColumnPathMap(Chk02_DtlR.$not_fix_flg, Ord_Imp02_DtlR.$not_fix_flg);
				addColumnPathMap(Chk02_DtlR.$itm_nm, Ord_Imp02_DtlR.$itm_nm);
				addColumnPathMap(Chk02_DtlR.$unit_cd, Ord_Imp02_DtlR.$unit_cd);
				addColumnPathMap(Chk02_DtlR.$unit_nm, Ord_Imp02_DtlR.$unit_nm);
				addColumnPathMap(Chk02_DtlR.$mfg_site_cd, Ord_Imp02_DtlR.$mfg_site_cd);
				addColumnPathMap(Chk02_DtlR.$mfg_site_nm, Ord_Imp02_DtlR.$mfg_site_nm);
				addColumnPathMap(Chk02_DtlR.$mfg_loc_grp_cd, Ord_Imp02_DtlR.$mfg_loc_grp_cd);
				addColumnPathMap(Chk02_DtlR.$mfg_loc_grp_nm, Ord_Imp02_DtlR.$mfg_loc_grp_nm);
				addColumnPathMap(Chk02_DtlR.$mfg_loc_cd, Ord_Imp02_DtlR.$mfg_loc_cd);
				addColumnPathMap(Chk02_DtlR.$mfg_loc_nm, Ord_Imp02_DtlR.$mfg_loc_nm);
				addColumnPathMap(Chk02_DtlR.$itm_typ, Ord_Imp02_DtlR.$itm_typ);
				addColumnPathMap(Chk02_DtlR.$itm_typ_d_cd, Ord_Imp02_DtlR.$itm_typ_d_cd);
				addColumnPathMap(Chk02_DtlR.$itm_typ_d_nm, Ord_Imp02_DtlR.$itm_typ_d_nm);
				addColumnPathMap(Chk02_DtlR.$wrk_no, Ord_Imp02_DtlR.$wrk_no);
				addColumnPathMap(Chk02_DtlR.$wrk_nm, Ord_Imp02_DtlR.$wrk_nm);
				addColumnPathMap(Chk02_DtlR.$wg_nm, Ord_Imp02_DtlR.$wg_nm);
				addColumnPathMap(Chk02_DtlR.$ver_no, Ord_Imp02_DtlR.$ver_no);
				addColumnPathMap(Chk02_DtlR.$itm_order_upd_cntr, Ord_Imp02_DtlR.$itm_order_upd_cntr);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				dest.ord().for_scheduler_frozen_flg(false);
				dest.oord().scheduler_frozen_flg(false);
			}
		}
	}

	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイルから取り込んだ工程オーダのチェック処理を行う。<br>
	 */
	public class Imp01 extends MSBCL_OperOrdSrch_MC_A.Imp01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk02();
			setDown();
		}

		protected void editUp() {
			setPegNo(Chk02_DtlR.$peg_no, up0());
		}

		protected void callThisChk02() {
			MSBCL_OperOrdSrch.Chk02 ope = MSBCL_OperOrdSrch.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void setDown() {
			down0().setAll(up0());
		}
	}

	//FMCB CUSTOM END
}