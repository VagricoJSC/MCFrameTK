package mcframe.serverMSBD.MSBDL0230;

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
import mcframe.serverMSBD.MSBDL0230.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil;
import mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch01_DtlR;
import mcframe.serverMSBD.MSBDL5120.*;
import mcframe.serverMSBD.MSBDL5200.*;
import static mcframe.serverMSBD.MSBDL0230.Query.*;
import mcframe.commonCore.param.MCParam;
import java.util.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_DlvInstListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_DlvInstListReg_MC extends MSBDL_DlvInstListReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 入荷予定を検索する<br>
	 */
	public class Srch01 extends MSBDL_DlvInstListReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			setUpTmpCol(up0());
			MCQueryPlan sql = MSBDL0230_MST_ARR_SCHD_S01();
			searchForDL(sql, up0(), down0(), Srch01_RsltR.$po_d_no);
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			
			initRcptIvD(down0());
			setRcptIv();
			setQty();
		}
		
		@Override
		protected void doEditDown() {
			super.doEditDown();
			
			sort();
		}
		
		protected void setRcptIv() {
			MCList<Srch01_RsltR> delL = MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR r : down0()) {
				Boolean isSrchArrSchd = !up0().dlv_inst_rcpt_flg() || isNull(r.dlv_inst_rcpt_no());
				MCList<MST_RCPT_IV_D_R> rcptIvDL = MCList.create(MST_RCPT_IV_D_R.class);
				if (isSrchArrSchd) {
					// 入荷予定検索の場合、入荷予定に紐づく受領インボイスを取得
					// 入荷予定：受領インボイス＝１：Ｎの場合、受領インボイス数量を合計して設定
					rcptIvDL = getRcptIvDByPurcSchdNo(r.purc_schd_no());
				}
				else {
					// 納入指示受領検索の場合、発注明細に紐づく受領インボイスを取得
					// 発注明細：入荷予定＝１：Ｎの場合、受領インボイス登録完了している入荷予定も表示
					rcptIvDL = getRcptIvDByPoDNo(r.po_d_no());
				}
				
				if (isNull(rcptIvDL)) {
					r.rcpt_iv_qty(MCNumber.ZERO);
					continue;
				}
				if (rcptIvDL.size() == 1) {
					MST_RCPT_IV_D_R rcptIvDR = rcptIvDL.get(0);
					r.rcpt_iv_qty(rcptIvDR.base_unit_qty());
					r.rcpt_iv_no(rcptIvDR.getString("rcpt_iv_no"));
					if (isSrchArrSchd && isSame(r.base_unit_qty(), rcptIvDR.base_unit_qty())) {
						r.rcpt_iv_cmpl_flg(true);
					}
				}
				else if (rcptIvDL.size() > 1) {
					MCNumber sumQty = rcptIvDL.sum(MST_RCPT_IV_D_R.$base_unit_qty);
					r.rcpt_iv_qty(sumQty);
					r.rcpt_iv_no(null);
					if (isSrchArrSchd && isSame(r.base_unit_qty(), sumQty)) {
						r.rcpt_iv_cmpl_flg(true);
					}
				}
				
				if (isSrchArrSchd && r.rcpt_iv_cmpl_flg()) {
					delL.add(r);
				}
			}
			down0().removeAll(delL);
		}
		
		/**
		 * 数量を設定する
		 */
		protected void setQty() {
			for (Srch01_RsltR r : down0()) {
				// 納入指示受領検索の場合、設定しない
				if (up0().dlv_inst_rcpt_flg() && !isNull(r.dlv_inst_rcpt_no())) {
					continue;
				}
				
				// 入荷不要、仕入対象外を考慮し、予定数量の大きいほうを取得
				MCNumber baseUnitSchdQty = MCNumber.max(r.base_unit_qty(), r.base_unit_purc_schd_qty());
				
				if(!isNull(r.trd_unit_qty()) && !isNull(r.base_unit_qty())) {
					// 残数分の基準単位数量の設定
					MCNumber arrQty = MCNumber.max(r.arr_qty(), r.rcpt_iv_qty());
					if ((arrQty.add(r.act_abort_qty())).gt(r.purc_act_qty().add(r.accpt_dfct_qty()).add(r.purc_abort_qty()))) {
						if (baseUnitSchdQty.lte(arrQty.add(r.act_abort_qty()))) {
							continue;
						}
						else {
							r.base_unit_qty(baseUnitSchdQty.subtract(arrQty.add(r.act_abort_qty())));
						}
					}
					else {
						if (baseUnitSchdQty.lte(r.purc_act_qty().add(r.accpt_dfct_qty()).add(r.purc_abort_qty()))) {
							continue;
						}
						else {
							r.base_unit_qty(baseUnitSchdQty.subtract(r.purc_act_qty()).subtract(r.accpt_dfct_qty()).subtract(r.purc_abort_qty()));
						}
					}
					
					// 取引単位数量の設定
					if (isSame(r.trd_unit_cd(), r.base_unit_cd())) {
						r.trd_unit_qty(r.base_unit_qty());
					}
					else {
						r.trd_unit_qty(rvrsBaseUnitConv(r.base_unit_qty(),
								r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
								r.trd_unit_dec_place(), r.trd_unit_rnd_typ()));
					}
				}
			}
		}
		
		protected void sort() {
			MCSortPolicy sortPolicy = new MCSortPolicy();
			sortPolicy.add(SortType.ASC, Srch01_RsltR.$po_no);
			sortPolicy.add(SortType.ASC, Srch01_RsltR.$po_d_no);
			down0().sort(sortPolicy);
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 納入指示を検索する<br>
	 */
	public class Srch02 extends MSBDL_DlvInstListReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			setUpTmpCol(up0());
			MCQueryPlan sql = MSBDL0230_MST_DLV_INST_D_S01();
			searchForDL(sql, up0(), down0(), Srch01_RsltR.$dlv_inst_d_no);
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			
			initRcptIvD(down0());
			setRcptIv();
		}
		
		@Override
		protected void doEditDown() {
			super.doEditDown();
			
			sort();
		}
		
		protected void setRcptIv() {
			for (Srch01_RsltR r : down0()) {
				MCList<MST_RCPT_IV_D_R> rcptIvDL = getRcptIvDByPurcSchdNo(r.purc_schd_no());
				if (isNull(rcptIvDL)) {
					r.rcpt_iv_qty(MCNumber.ZERO);
					continue;
				}
				if (rcptIvDL.size() == 1) {
					MST_RCPT_IV_D_R rcptIvDR = rcptIvDL.get(0);
					r.rcpt_iv_qty(rcptIvDR.base_unit_qty());
					r.rcpt_iv_no(rcptIvDR.getString("rcpt_iv_no"));
					if (isSame(r.base_unit_qty(), rcptIvDR.base_unit_qty())) {
						r.rcpt_iv_cmpl_flg(true);
					}
				}
				else if (rcptIvDL.size() > 1) {
					MCNumber sumQty = rcptIvDL.sum(MST_RCPT_IV_D_R.$base_unit_qty);
					r.rcpt_iv_qty(sumQty);
					r.rcpt_iv_no(null);
					if (isSame(r.base_unit_qty(), sumQty)) {
						r.rcpt_iv_cmpl_flg(true);
					}
				}
			}
		}
		
		protected void sort() {
			MCSortPolicy sortPolicy = new MCSortPolicy();
			sortPolicy.add(SortType.ASC, Srch01_RsltR.$po_no);
			sortPolicy.add(SortType.ASC, Srch01_RsltR.$po_d_no);
			sortPolicy.add(SortType.ASC, Srch01_RsltR.$dlv_inst_no);
			sortPolicy.add(SortType.ASC, Srch01_RsltR.$dlv_inst_d_no);
			down0().sort(sortPolicy);
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 納入指示を登録・訂正可能かチェックする<br>
	 */
	public class Chk01 extends MSBDL_DlvInstListReg_MC_A.Chk01 {
		//----------------------------------
		// Cache
		//----------------------------------
		/** 納入指示明細 */
		protected MCList<MST_DLV_INST_D_R> _dlvInstDCache = MCList.create(MST_DLV_INST_D_R.class);
		//----------------------------------
		// IndexKey
		//----------------------------------
		/** 納入指示明細 */
		protected MCIndexKey _idxDlvInstDL = null;
				
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			setHdrErr();
			callPurcDlvDtAdjstRegSrvdlvInstChk01();
			setHdrErr();
			setDown();
		}
		
		/**
		 * ヘッダ単位でエラー制御を行う。ヘッダに含まれる明細にエラーがある場合はヘッダ単位でエラーとする。
		 * err_flgを参照するので、他のチェックでerr_flgがセットされた後で実行する必要がある。
		 */
		protected void setHdrErr() {
			MCList<Chk01_DtlR>[] upGroupList = up0().groupList("hdr_peg_no");
			for (MCList<Chk01_DtlR> tmpL : upGroupList) {
				MCList<Chk01_DtlR> errL = tmpL.subList(Chk01_DtlR.$err_flg, true);
				MCList<Chk01_DtlR> okL = tmpL.subList(Chk01_DtlR.$err_flg, false);
				if (!errL.isEmpty()) {
					for (Chk01_DtlR r : okL) {
						MCMessagePool.add(new MCMessage(r, null, MSBDL0134, toDispGUIIndex(r)));
						r.err_flg(true);
						r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
					}
				}
				errL.setStringNE(Chk01_DtlR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value());
			}
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			if (up1().file_imp_flg()) {
				msgL.addAll(chkImp());
			}
			createCache();
			editPegNo();
			msgL.addAll(chkArrPr());
			return msgL;
		}
		
		/**
		 * ファイル入力用のチェック、補完
		 */
		protected MCMessageList chkImp() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(chkReq());
			msgL.addAll(complPoD());
			msgL.addAll(chkReqSub());
			setFixedValue();
			setEdiFlg();
			setWgCd();
			setSchdDt();
			setSyncFlg();
			return msgL;
		}
		
		/**
		 * 必須チェック
		 * @return メッセージリスト
		 */
		protected MCMessageList chkReq() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			msgL.addAll(check(notErrL, Chk01_DtlR.$po_no, new FXUCL_RequiredValidater()));
			msgL.addAll(check(notErrL, Chk01_DtlR.$po_d_no, new FXUCL_RequiredValidater()));
			setErrFlg(msgL);
			return msgL;
		}

		/**
		 * 発注情報の補完
		 * @return メッセージリスト
		 */
		protected MCMessageList complPoD() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_PO_D_R> poDL = getPoDL(notErrL);
			MCIndexKey poDKey = poDL.createIndex(MST_PO_D_R.$po_no, MST_PO_D_R.$po_d_no);
			
			for (Chk01_DtlR r : notErrL) {
				MST_PO_D_R poDR = poDL.getFirst(poDKey, r.po_no(), r.po_d_no());
				if (isNull(poDR)) {
					msgL.add(msgNotExistInTable(poDL.createRow(), r, MST_PO_D_R.$po_no, MST_PO_D_R.$po_d_no));
					r.err_flg(true);
					continue;
				}
				
				r.purc_sts_typ(poDR.getStringNE(MST_ARR_PR_R.$purc_sts_typ));
				r.po_dt(poDR.getDateNE(MST_PO_R.$po_dt));
				r.sppl_cd(poDR.getStringNE(MST_PO_R.$sppl_cd));
				r.purc_dpt_cd(poDR.getStringNE(MST_PO_R.$purc_dpt_cd));
				r.itm_cd(poDR.itm_cd());
				r.itm_sub1(poDR.itm_sub1());
				r.itm_sub2(poDR.itm_sub2());
				r.itm_sub3(poDR.itm_sub3());
				r.cst_itm_cd(poDR.getStringNE("cst_itm_cd"));
				r.cst_itm_nm(poDR.getStringNE("cst_itm_nm"));
				r.src_trd_unit_qty(poDR.trd_unit_qty());
				r.src_trd_unit_cd(poDR.trd_unit_cd());
				r.arr_schd_dt(poDR.getDateNE("arr_schd_dt"));
				r.arr_schd_hm(poDR.getDateNE("arr_schd_hm"));
				r.dlv_inst_dt(poDR.getDateNE("dlv_inst_dt"));
				r.arr_pr_no(poDR.getStringNE(MST_ARR_PR_R.$arr_pr_no));
				r.arr_pr_upd_cntr(poDR.getNumberNE("arr_pr_upd_cntr"));
				r.dlv_cd(poDR.dlv_cd());
				r.purc_id_typ(poDR.purc_id_typ());
				r.purc_basis_typ(poDR.purc_basis_typ());
				r.mfg_loc_cd(poDR.mfg_loc_cd());
				r.bom_ptn(poDR.bom_ptn());
				r.maker_cd(poDR.maker_cd());
				r.dlv_cal_cd(poDR.getStringNE("dlv_cal_cd"));
				r.outsrc_flg(poDR.outsrc_flg());
				r.arr_skip_flg(poDR.getBooleanNE("arr_skip_flg"));
				r.subcon_flg(poDR.getBooleanNE("subcon_flg"));
				r.sppl_cal_cd(poDR.getStringNE("sppl_cal_cd"));
				r.dlv_inst_dlv_slip_flg(poDR.getBooleanNE("dlv_inst_dlv_slip_flg"));
				r.purc_ddlv_flg(poDR.getBooleanNE("purc_ddlv_flg"));
			}
			return msgL;
		}
		
		/**
		 * 発注の取得
		 */
		protected MCList<MST_PO_D_R> getPoDL(MCList<Chk01_DtlR> dtlL) {
			MCList<MST_PO_D_R> poDL = MCList.create(MST_PO_D_R.class);
			MST_PO_D_R poD = MST_PO_D_R.create("T");
			MCQueryApiBuilder poDL_bldr = MCQueryApiBuilder.create(poD);
			MST_PO_R po = MST_PO_R.create("PO");
			MST_ARR_PR_R arrPr = MST_ARR_PR_R.create("ARRPR");
			MST_ARR_SCHD_R arrSchd = MST_ARR_SCHD_R.create("ARRSCHD");
			MST_SLO_D_R sloD = MST_SLO_D_R.create("SLOD");
			MAM_BP_R bp = MAM_BP_R.create("BP");
			MAM_BP_R sppl = MAM_BP_R.create("SPPL");
			MST_SLO_R slo = MST_SLO_R.create("SLO");

			poDL.addDateColumn("po_dt");
			poDL.addStringColumn("sppl_cd");
			poDL.addStringColumn("purc_dpt_cd");
			poDL.addStringColumn("arr_pr_no");
			poDL.addNumberColumn("arr_pr_upd_cntr");
			poDL.addStringColumn("purc_sts_typ");
			poDL.addDateColumn("arr_schd_dt");
			poDL.addDateColumn("arr_schd_hm");
			poDL.addDateColumn("arr_pr_dlv_rqst_dt");
			poDL.addDateColumn("arr_pr_dlv_rqst_hm");
			poDL.addDateColumn("dlv_inst_dt");
			poDL.addBooleanColumn("arr_skip_flg");
			poDL.addStringColumn("cst_itm_cd");
			poDL.addStringColumn("cst_itm_nm");
			poDL.addStringColumn("dlv_cal_cd");
			poDL.addStringColumn("sppl_cal_cd");
			poDL.addBooleanColumn("subcon_flg");
			poDL.addBooleanColumn("dlv_inst_dlv_slip_flg");
			poDL.addBooleanColumn("purc_ddlv_flg");
			poDL.addDateColumn("slo_dt");
			
			poDL_bldr.addSelect(po.po_dt);
			poDL_bldr.addSelect(po.sppl_cd);
			poDL_bldr.addSelect(po.purc_dpt_cd);
			poDL_bldr.addSelect(arrPr.arr_pr_no);
			poDL_bldr.addSelect(arrPr.upd_cntr.as("arr_pr_upd_cntr"));
			poDL_bldr.addSelect(arrPr.purc_sts_typ);
			poDL_bldr.addSelect(trunc(arrSchd.arr_schd_tm, MCDateFmt.DD).as("arr_schd_dt"));
			poDL_bldr.addSelect(arrSchd.arr_schd_tm.as("arr_schd_hm"));
			poDL_bldr.addSelect(trunc(arrPr.dlv_rqst_tm, MCDateFmt.DD).as("arr_pr_dlv_rqst_dt"));
			poDL_bldr.addSelect(arrPr.dlv_rqst_tm.as("arr_pr_dlv_rqst_hm"));
			poDL_bldr.addSelect(arrPr.dlv_inst_dt);
			poDL_bldr.addSelect(arrSchd.arr_skip_flg);
			poDL_bldr.addSelect(cases()
									.when(poD.dlv_cd.isNotNull())
										.then(sloD.cst_itm_cd)
									.otherwise(nullValue())
								.as("cst_itm_cd"));
			poDL_bldr.addSelect(cases()
									.when(poD.dlv_cd.isNotNull())
										.then(sloD.cst_itm_nm)
									.otherwise(nullValue())
								.as("cst_itm_nm"));
			poDL_bldr.addSelect(bp.dlv_cal_cd);
			poDL_bldr.addSelect(sppl.sppl_cal_cd);
			poDL_bldr.addSelect(sppl.subcon_flg);
			poDL_bldr.addSelect(slo.slo_dt);
			poDL_bldr.addSelect(decode(sloD.proc_typ, value(MAC_SLO_PROC_TYP.PURC_DDLV.value()), value(true), value(false)).as("purc_ddlv_flg"));
			poDL_bldr.addSelect(sppl.dlv_inst_dlv_slip_flg);
			poDL_bldr.addInnerJoin(po, bracket(poD.po_no.eq(po.po_no)));
			poDL_bldr.addInnerJoin(arrPr, bracket(poD.po_d_no.eq(arrPr.po_d_no)));
			poDL_bldr.addInnerJoin(arrSchd, bracket(arrPr.arr_pr_no.eq(arrSchd.arr_pr_no)));
			poDL_bldr.addLeftOuterJoin(sloD, bracket(poD.slo_d_no.eq(sloD.slo_d_no)));
			poDL_bldr.addLeftOuterJoin(slo, bracket(sloD.slo_no.eq(slo.slo_no)));
			poDL_bldr.addLeftOuterJoin(bp, bracket(poD.dlv_cd.eq(bp.bp_cd)));
			poDL_bldr.addLeftOuterJoin(sppl, bracket(po.sppl_cd.eq(sppl.bp_cd)));
			poDL_bldr.addWhereWithAnd(poD.po_no.eq(bind("po_no")));
			poDL_bldr.addWhereWithAnd(poD.po_d_no.eq(bind("po_d_no")));
			poDL_bldr.addWhereWithAnd(poD.can_flg.eq(value(false)));
			dbSelect("MSBDL0230_MST_PO_D_S01", poDL, poDL_bldr, dtlL);
			return poDL;
		}
		
		/**
		 * 固定値の設定
		 */
		protected void setFixedValue() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			for (Chk01_DtlR r : notErrL) {
				if (isNull(r.dlv_inst_dt())) {
					r.dlv_inst_dt(getToday());
				}
			}
		}
		
		/**
		 * ワーキングコードの設定
		 */
		protected void setWgCd() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			
			MCList<MAM_LOC_R> locL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
			locL_bldr.addWhereWithAnd(t.loc_cd.eq(bind("dlv_rqst_loc_cd")));
			locL_bldr.addWhereWithAnd(t.del_flg.eq(value(false)));
			dbSelect("MSBDL0230_MAM_LOC_S01", locL, locL_bldr, notErrL.groupBy(Chk01_DtlR.$dlv_rqst_loc_cd));
			MCIndexKey locKey = locL.createIndex(MAM_LOC_R.$loc_cd);
			
			for (Chk01_DtlR r : notErrL) {
				MAM_LOC_R locR = locL.getFirst(locKey, r.dlv_rqst_loc_cd());
				if (!isNull(locR)) {
					r.in_to_loc_wg_cd(locR.wg_cd());
				}
			}
		}
		
		/**
		 * 予定日の設定
		 */
		protected void setSchdDt() {
			MCList<Chk01_DtlR> tgtL = MCList.create(Chk01_DtlR.class);
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			
			for (Chk01_DtlR r : notErrL) {
				if (isNull(r.purc_schd_dt())) {
					// 仕入直送でない、下請対象の発注先でない、VMI、無償受給以外、入荷基準でない場合のみ日付計算
					if (!r.purc_ddlv_flg()
							&& !r.subcon_flg()
							&& !MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())
							&& !MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())
							&& !MAC_PURC_BASIS_TYP.isARR_BASIS(r.purc_basis_typ())) {
						tgtL.add(r);
					}
					else {
						if (!MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())
								&& !MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())) {
							r.purc_schd_dt(r.dlv_rqst_tm());
						}
					}
				}
			}
			
			MSBDL_PurcUtil.PurcUtil_Srch01 purcUtilSrch01 = MSBDL_PurcUtil.crtPurcUtil_Srch01();
			addAll(purcUtilSrch01.up0(), tgtL, createMap_PurcUtil_Srch01_DtlR_Chk01_DtlR());
			purcUtilSrch01.exec();
			
			MCIndexKey idxkey = purcUtilSrch01.down0().createIndex(PurcUtil_Srch01_DtlR.$peg_no);
			for (Chk01_DtlR r : tgtL) {
				PurcUtil_Srch01_DtlR downR = purcUtilSrch01.down0().getFirst(idxkey, r.peg_no());
				if (!isNull(downR)) {
					r.purc_schd_dt((MCDate)complInputFileValue(Chk01_DtlR.$purc_schd_dt, r.purc_schd_dt(), downR.purc_schd_dt()));
				}
			}
		}
		
		/**
		 * 	条件付き必須チェック
		 * @return メッセージリスト
		 */
		protected MCMessageList chkReqSub() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			for (Chk01_DtlR r : notErrL) {
				// サービス側でも外注品の必須チェックがあるが、2か所で同じチェックをしており、
				// メッセージが2件表示されてしまうためここで止める
				if (r.outsrc_flg()) {
					msgL.addAll(check(r, DlvInst_Chk01_DtlR.$mfg_inst_no, new FXUCL_RequiredValidater()));
				}
			}
			setErrFlg(msgL);
			return msgL;
		}
		
		/**
		 * ＥＤＩフラグの設定
		 */
		protected void setEdiFlg() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			
			MCList<MAM_EDI_IF_CTL_R> ediIfL = MCList.create(MAM_EDI_IF_CTL_R.class);
			MAM_EDI_IF_CTL_R t = MAM_EDI_IF_CTL_R.create("T");
			MCQueryApiBuilder ediIfL_bldr = MCQueryApiBuilder.create(t);
			ediIfL_bldr.addWhereWithAnd(t.bp_cd.eq(bind("sppl_cd")));
			ediIfL_bldr.addWhereWithAnd(t.if_proc_typ.eq(value(MAC_IF_PROC_TYP.DLV_INST_SEND.value())));
			ediIfL_bldr.addWhereWithAnd(t.del_flg.eq(value(false)));
			dbSelect("MSBDL0230_MAM_EDI_IF_CTL_S01", ediIfL, ediIfL_bldr, notErrL.groupBy(Chk01_DtlR.$sppl_cd));
			MCIndexKey ediIfKey = ediIfL.createIndex(MAM_EDI_IF_CTL_R.$bp_cd);
			
			for (Chk01_DtlR r : notErrL) {
				MAM_EDI_IF_CTL_R ediIfR = ediIfL.getFirst(ediIfKey, r.sppl_cd());
				if (!isNull(ediIfR)) {
					r.edi_tgt_flg(true);
				}
				r.edi_flg(false);
			}
		}
		
		/**
		 * 同時計上の設定
		 */
		protected void setSyncFlg() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			for (Chk01_DtlR r : notErrL) {
				if (isNullOr(r.dlv_rqst_tm(), r.purc_schd_dt())) {
					r.sync_flg(false);
				}
				else if (!r.purc_ddlv_flg() && r.arr_skip_flg()) {
					r.sync_flg(false);
				}
				else if (MAC_PURC_BASIS_TYP.isARR_BASIS(r.purc_basis_typ())) {
					r.sync_flg(true);
				}
				else if (MAC_PURC_BASIS_TYP.isIN_BASIS(r.purc_basis_typ())) {
					r.sync_flg(false);
				}
				else if (r.dlv_rqst_tm().eqDate(r.purc_schd_dt())) {
					r.sync_flg(true);
				}
				else {
					r.sync_flg(false);
				}
			}
		}
		
		protected void editPegNo() {
			// ヘッダ単位の紐付ＮＯ
			up0().addNumberColumn("hdr_peg_no");
			// ヘッダ単位のデータ更新区分
			up0().addStringColumn("hdr_data_crud_typ");
			
			// １伝票単位のリスト
			MCList<Chk01_DtlR>[] upGroupList = makeGroupList(up0());
			for (MCList<Chk01_DtlR> list : upGroupList) {
				// ヘッダ単位の紐付けＮＯを発番
				list.setNumberNE("hdr_peg_no", list.get(0).peg_no());
			}
		}
		
		/**
		 * 入荷進捗のロック、更新カウンタチェック
		 * @return メッセージリスト
		 */
		protected MCMessageList chkArrPr() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_ARR_PR_R> arrPrL = getArrPrL(notErrL);
			MCIndexKey idxkey = arrPrL.createIndex(MST_ARR_PR_R.$arr_pr_no);
			
			for (Chk01_DtlR r : notErrL) {
				MST_ARR_PR_R arrPrR = arrPrL.getFirst(idxkey, r.arr_pr_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$arr_pr_upd_cntr, arrPrR));
			}
			setErrFlg(msgL);
			
			return msgL;
		}
		
		/**
		 * 入荷進捗の取得
		 */
		protected MCList<MST_ARR_PR_R> getArrPrL(MCList<Chk01_DtlR> dtlL) {
			MCList<MST_ARR_PR_R> arrPrL = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
			MCQueryApiBuilder arrPrL_bldr = MCQueryApiBuilder.create(t);
			arrPrL_bldr.setWhere(t.arr_pr_no.eq(bind("arr_pr_no")));
			arrPrL_bldr.setOrderByAsc(t.arr_pr_no);
			MCList<Chk01_DtlR> bindL = dtlL.clone();
			bindL.sort(Chk01_DtlR.$arr_pr_no);
			
			dbSelectForUpdateNoWait("MSBDL0230_MST_ARR_PR_S01", arrPrL, arrPrL_bldr, bindL);
			return arrPrL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			msgL.addAll(chkItm());
			for(Chk01_DtlR r : up0()) {
				setBaseUnitQty(r);
			}
			setBpInfo();
			msgL.addAll(chkDecPlace());
			msgL.addAll(chkMfgInst());
			msgL.addAll(chkPurcActD());
			return msgL;
		}
		
		protected void setBpInfo() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			MCList<MST_PO_D_R> poDL = getPoDL(notErrL);
			MCIndexKey poDKey = poDL.createIndex(MST_PO_D_R.$po_no, MST_PO_D_R.$po_d_no);

			for (Chk01_DtlR r : notErrL) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				
				MST_PO_D_R poDR = poDL.getFirst(poDKey, r.po_no(), r.po_d_no());
				if (!isNull(poDR)) {
					if (!r.dlv_sundry_flg()) {
						MAM_BP_R dlv = getCacheBp(r.inst_dlv_cd());
						MAM_BP_SUB_R bpSubDlv = getCacheBpSub(poDR.getDateNE("slo_dt"), r.inst_dlv_cd());
						if (!isNull(bpSubDlv.bp_cd())) {
							r.dlv_zip_cd(bpSubDlv.zip_cd());
							r.dlv_addr1(bpSubDlv.addr1());
							r.dlv_addr2(bpSubDlv.addr2());
							r.dlv_addr3(bpSubDlv.addr3());
							r.dlv_addr4(bpSubDlv.addr4());
							r.dlv_tel(bpSubDlv.tel());
							r.dlv_fax(bpSubDlv.fax());
							r.dlv_cntct_dpt(bpSubDlv.dlv_cntct_dpt());
							r.dlv_cntct_psn(bpSubDlv.dlv_cntct_psn());
						}
						else {
							r.dlv_zip_cd(dlv.zip_cd());
							r.dlv_addr1(dlv.addr1());
							r.dlv_addr2(dlv.addr2());
							r.dlv_addr3(dlv.addr3());
							r.dlv_addr4(dlv.addr4());
							r.dlv_tel(dlv.tel());
							r.dlv_fax(dlv.fax());
							r.dlv_cntct_dpt(dlv.dlv_cntct_dpt());
							r.dlv_cntct_psn(dlv.dlv_cntct_psn());
						}
					}
					
					if (!r.tdlv_sundry_flg()) {
						MAM_BP_R tdlv = getCacheBp(r.tdlv_cd());
						MAM_BP_SUB_R bpSubTdlv = getCacheBpSub(poDR.getDateNE("slo_dt"), r.tdlv_cd());
						if (!isNull(bpSubTdlv.bp_cd())) {
							r.tdlv_zip_cd(bpSubTdlv.zip_cd());
							r.tdlv_addr1(bpSubTdlv.addr1());
							r.tdlv_addr2(bpSubTdlv.addr2());
							r.tdlv_addr3(bpSubTdlv.addr3());
							r.tdlv_addr4(bpSubTdlv.addr4());
							r.tdlv_tel(bpSubTdlv.tel());
							r.tdlv_fax(bpSubTdlv.fax());
							r.tdlv_cntct_dpt(bpSubTdlv.dlv_cntct_dpt());
							r.tdlv_cntct_psn(bpSubTdlv.dlv_cntct_psn());
						}
						else {
							r.tdlv_zip_cd(tdlv.zip_cd());
							r.tdlv_addr1(tdlv.addr1());
							r.tdlv_addr2(tdlv.addr2());
							r.tdlv_addr3(tdlv.addr3());
							r.tdlv_addr4(tdlv.addr4());
							r.tdlv_tel(tdlv.tel());
							r.tdlv_fax(tdlv.fax());
							r.tdlv_cntct_dpt(tdlv.dlv_cntct_dpt());
							r.tdlv_cntct_psn(tdlv.dlv_cntct_psn());
						}
					}
				}
			}
		}
		
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
		protected FXUCL_MCDbcCacheStEnd<MAM_BP_SUB_R> _cacheBpSub;
		protected void createCacheBp() {
			MCList<MAM_BP_R> bindBpL = MCList.create(MAM_BP_R.class);
			for (Chk01_DtlR r : up0()) {
				if (!isNull(r.dlv_cd())) {
					MAM_BP_R bpR = MAM_BP_R.create();
					bpR.bp_cd(r.dlv_cd());
					bindBpL.add(bpR);
				}
				if (!isNull(r.tdlv_cd())) {
					MAM_BP_R bpR = MAM_BP_R.create();
					bpR.bp_cd(r.tdlv_cd());
					bindBpL.add(bpR);
				}
			}
			
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(
					MCQueryApiBuilder.create(MAM_BP_R.create("T")),
					bindBpL.groupBy(MAM_BP_R.$bp_cd), MAM_BP_R.$bp_cd);
			_cacheBpSub = new FXUCL_MCDbcCacheStEnd<MAM_BP_SUB_R>(
					MCQueryApiBuilder.create(MAM_BP_SUB_R.create("T")),
					bindBpL.groupBy(MAM_BP_R.$bp_cd), MAM_BP_R.$bp_cd);
		}
		protected MAM_BP_R getCacheBp(String bpCd) {
			return _cacheBp.get(bpCd);
		}
		protected MAM_BP_SUB_R getCacheBpSub(MCDate sloDt, String bpCd) {
			return _cacheBpSub.get(sloDt, bpCd);
		}
		
		/**
		 * 削除時品目マスタの存在チェック
		 * @return メッセージリスト
		 */
		protected MCMessageList chkItm() {
			// 新規・更新時はリストロジックチェックでエラーになるが
			// 削除時はスルーされ、サーバ実行エラーになるためチェックする
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MAM_ITM_R> itmL = getItmL(notErrL);
			MCIndexKey idxItmL = itmL.createIndex(MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
			
			for (Chk01_DtlR r : notErrL) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					MAM_ITM_R itmR = itmL.getFirst(idxItmL, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
					if (isNull(itmR) || itmR.isEmpty()) {
						msgL.add(new MCMessage(r, null, MAUAL0189
								, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())
								, toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 品目の取得
		 */
		protected MCList<MAM_ITM_R> getItmL(MCList<Chk01_DtlR> dtlL) {
			MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
			itmL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			itmL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			itmL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			itmL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			MCList<Chk01_DtlR> bindL = dtlL.clone();
			bindL.sort(Chk01_DtlR.$itm_cd, Chk01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub3);
			dbSelect("MSBDL0230_MAM_ITM_S01", itmL, itmL_bldr, bindL);
			return itmL;
		}
		

		/**
		 * キャッシュを作成します
		 */
		protected void createCache() {
			createCacheDlvInstD();
			createCacheBp();
		}
		
		/**
		 * キャッシュ作成（納入指示明細）
		 */
		protected void createCacheDlvInstD() {
			_dlvInstDCache = MCList.create(MST_DLV_INST_D_R.class);
			MST_DLV_INST_D_R t = MST_DLV_INST_D_R.create("T");
			MCQueryApiBuilder _dlvInstDL_bldr = MCQueryApiBuilder.create(t);
			_dlvInstDL_bldr.setWhere(t.dlv_inst_no.eq(bind("dlv_inst_no")));
			_dlvInstDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBDL0230_MST_DLV_INST_D_S01", _dlvInstDCache, _dlvInstDL_bldr,
					up0().groupBy(MST_DLV_INST_D_R.$dlv_inst_no));
			_idxDlvInstDL = _dlvInstDCache.createIndex(MST_DLV_INST_D_R.$dlv_inst_no);
		}
		
		/**
		 * 基準単位数量を設定する
		 * @param dtlR
		 */
		protected void setBaseUnitQty(Chk01_DtlR dtlR) {
			if (isSame(dtlR.trd_unit_cd(), dtlR.base_unit_cd())) {
				dtlR.base_unit_qty(dtlR.trd_unit_qty());
			}
			else {
				dtlR.base_unit_qty(convToBaseUnit(dtlR.trd_unit_qty(),
						dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
						dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
			}
		}
		
		/**
		 * 数量の小数有効桁数チェック
		 * @return メッセージリスト
		 */
		protected MCMessageList chkDecPlace() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			
			// 小数有効桁数チェック
			for (Chk01_DtlR upR : notErrL){
				msgL.addAll(checkDecPlace(upR, Chk01_DtlR.$trd_unit_dec_place, Chk01_DtlR.$trd_unit_qty));
				msgL.addAll(checkDecPlace(upR, Chk01_DtlR.$base_unit_dec_place, Chk01_DtlR.$base_unit_qty));
			}
			setErrFlg(msgL);
			return msgL;
		}

		/**
		 * 製造指図の存在チェック
		 * @return メッセージリスト
		 */
		protected MCMessageList chkMfgInst() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_MFG_INST_R> mfgInstL = getMfgInstL(notErrL);
			MCIndexKey idxkey = mfgInstL.createIndex(MST_MFG_INST_R.$po_d_no, MST_MFG_INST_R.$mfg_inst_no);
			
			for (Chk01_DtlR r : notErrL) {
				if(isNull(r.mfg_inst_no()) ||  MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				MST_MFG_INST_R mfgInstR = mfgInstL.getFirst(idxkey, r.po_d_no(), r.mfg_inst_no());
				if(isNull(mfgInstR)) {
					msgL.add(msgNotExistInTable(mfgInstL.createRow(), r, MST_MFG_INST_R.$mfg_inst_no, MST_MFG_INST_R.$po_d_no));
					r.err_flg(true);
				}
			}
			return msgL;
		}
		
		/**
		 * 製造指図の取得
		 */
		protected MCList<MST_MFG_INST_R> getMfgInstL(MCList<Chk01_DtlR> dtlL) {
			MCList<MST_MFG_INST_R> mfgInstL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder mfgInstL_bldr = MCQueryApiBuilder.create(t);
			mfgInstL_bldr.setWhere(t.po_d_no.eq(bind("po_d_no")));
			mfgInstL_bldr.addWhereWithAnd(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			mfgInstL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			mfgInstL_bldr.addWhereWithAnd(t.abort_flg.eq(value(false)));
			mfgInstL_bldr.setOrderByAsc(t.po_d_no);
			MCList<Chk01_DtlR> bindL = dtlL.clone();
			bindL.sort(Chk01_DtlR.$po_d_no);
			dbSelect("MSBDL0230_MST_MFG_INST_S01", mfgInstL, mfgInstL_bldr, bindL);
			return mfgInstL;
		}
		
		/**
		 * 仕入実績明細の存在チェック
		 * @return メッセージリスト
		 */
		protected MCMessageList chkPurcActD() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_PURC_ACT_D_R> purcActDL = getPurcActDL(notErrL);
			MCIndexKey idxkey = purcActDL.createIndex(MST_PURC_ACT_D_R.$purc_act_d_no);
			
			for (Chk01_DtlR r : notErrL) {
				if(isNull(r.purc_act_d_no()) || MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				MST_PURC_ACT_D_R purcActDR = purcActDL.getFirst(idxkey, r.purc_act_d_no());
				if(isNull(purcActDR)) {
					msgL.add(msgNotExistInTable(purcActDL.createRow(), r, MST_PURC_ACT_D_R.$purc_act_d_no));
					r.err_flg(true);
				}
			}
			return msgL;
		}
		
		/**
		 * 仕入実績明細の取得
		 */
		protected MCList<MST_PURC_ACT_D_R> getPurcActDL(MCList<Chk01_DtlR> dtlL) {
			MCList<MST_PURC_ACT_D_R> purcActDL = MCList.create(MST_PURC_ACT_D_R.class);
			MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
			MCQueryApiBuilder purcActDL_bldr = MCQueryApiBuilder.create(t);
			MST_PURC_SCHD_R purcSchd = MST_PURC_SCHD_R.create("PURCSCHD");
			MST_ARR_PR_R arrPr = MST_ARR_PR_R.create("ARRPR");
			MST_PURC_ACT_R purcAct = MST_PURC_ACT_R.create("PURCACT");
			purcActDL_bldr.setWhere(t.purc_act_d_no.eq(bind("purc_act_d_no")));
			purcActDL_bldr.addWhereWithAnd(t.re_arr_flg.eq(value(true)));
			purcActDL_bldr.addWhereWithAnd(arrPr.po_d_no.eq(bind("po_d_no")));
			purcActDL_bldr.addWhereWithAnd(purcAct.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			purcActDL_bldr.addInnerJoin(purcSchd, bracket(purcSchd.purc_schd_no.eq(t.purc_schd_no)));
			purcActDL_bldr.addInnerJoin(arrPr, bracket(arrPr.arr_pr_no.eq(purcSchd.arr_pr_no)));
			purcActDL_bldr.addInnerJoin(purcAct, bracket(purcAct.purc_act_no.eq(t.purc_act_no)
					.and(purcAct.purc_act_seq.eq(t.purc_act_seq))));
			purcActDL_bldr.setOrderByAsc(t.purc_act_d_no);
			MCList<Chk01_DtlR> bindL = dtlL.clone();
			bindL.sort(Chk01_DtlR.$purc_act_d_no);
			dbSelect("MSBDL0230_MST_PURC_ACT_D_S01", purcActDL, purcActDL_bldr, bindL);
			return purcActDL;
		}
		
		/**
		 * 購買納期調整登録サービスの納入指示更新前チェックを実行
		 */
		protected void callPurcDlvDtAdjstRegSrvdlvInstChk01() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			getExtSysTyp(notErrL);
			
			MSBDL_PurcDlvDtAdjstRegService.DlvInst_Chk01 ope = MSBDL_PurcDlvDtAdjstRegService.crtDlvInst_Chk01();
			MCList<Chk01_DtlR>[] upGroupList = notErrL.groupList("hdr_peg_no");
			for (MCList<Chk01_DtlR> list : upGroupList) {
				setDataCrudTyp(list);
				
				// ヘッダ
				Chk01_DtlR hdrR = list.get(0);
				DlvInst_Chk01_HdrR dlvInstChk01HdrR = DlvInst_Chk01_HdrR.create();
				copy(dlvInstChk01HdrR, hdrR, createMap_DlvInst_Chk01_HdrR_Chk01_DtlR());
				ope.up0().add(dlvInstChk01HdrR);
				
				// 明細
				for (Chk01_DtlR r : list) {
					DlvInst_Chk01_DtlR dlvInstChk01DtlR = DlvInst_Chk01_DtlR.create();
					copy(dlvInstChk01DtlR, r, createMap_DlvInst_Chk01_DtlR_Chk01_DtlR());
					ope.up1().add(dlvInstChk01DtlR);
				}
			}
			ope.exec();
			copyErrFlg(up0(), ope.down0());
			copyErrFlg(up0(), ope.down1().subList(Prms_Chk01_HdrR.$err_flg, true));
		}
		
		/**
		 * 外部システム区分を取得
		 */
		protected void getExtSysTyp(MCList<Chk01_DtlR> tgtL) {
			MCList<MST_PO_R> bindL = MCList.create(MST_PO_R.class);
			for (Chk01_DtlR tgtR : tgtL) {
				MST_PO_R poR = MST_PO_R.create();
				poR.po_no(tgtR.po_no());
				bindL.add(poR);
			}
			
			MCList<MST_PO_R> rsltL = MCList.create(MST_PO_R.class);
			rsltL.addStringColumn(MAM_EXT_SYS_R.$ext_sys_typ);
			executeQuery(rsltL, MSBDL0230_MST_PO_S01(), bindL);
			
			if (!isNull(rsltL)) {
				MCIndexKey iKey = rsltL.createIndex(MST_PO_R.$po_no);
				for (Chk01_DtlR tgtR : tgtL) {
					MST_PO_R poR = rsltL.getFirst(iKey, tgtR.po_no());
					if (!isNull(poR)) {
						tgtR.addStringColumn(MAM_EXT_SYS_R.$ext_sys_typ, poR.getStringNE(MAM_EXT_SYS_R.$ext_sys_typ));
					}
				}
			}
		}
		
		/**
		 * データ更新区分を設定
		 */
		protected void setDataCrudTyp(MCList<Chk01_DtlR> list) {
			Chk01_DtlR hdrR = list.get(0);
			String hdrDataCrudTyp = hdrR.data_crud_typ();
			
			if (isNull(hdrR.dlv_inst_no())) {
				// 新規時
				hdrDataCrudTyp = MAC_DATA_CRUD_TYP.CRT.value();
				for (Chk01_DtlR r : list) {
					r.data_crud_typ(hdrDataCrudTyp);
				}
			}
			else {
				// 更新時
				MCList<Chk01_DtlR> crtL = list.subList(Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
				MCList<Chk01_DtlR> delL = list.subList(Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
				MCList<MST_DLV_INST_D_R> dlvInstDL = getDlvInstDCacheByDlvInstNo(hdrR.dlv_inst_no());
				if (crtL.size() == 0 && delL.size() == dlvInstDL.size()) {
					// ヘッダ削除
					hdrDataCrudTyp = MAC_DATA_CRUD_TYP.DEL.value();
				}
				else {
					// ヘッダ更新
					hdrDataCrudTyp = MAC_DATA_CRUD_TYP.UPD.value();
				}
			}
			
			for (Chk01_DtlR r : list) {
				r.setStringNE("hdr_data_crud_typ", hdrDataCrudTyp);
			}
		}
		
		protected MCList<MST_DLV_INST_D_R> getDlvInstDCacheByDlvInstNo(String DlvInstNo) {
			return _dlvInstDCache.subList(_idxDlvInstDL, DlvInstNo);
		}
		
		/**
		 * 下り電文を設定します
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		protected Map_PurcUtil_Srch01_DtlR_Chk01_DtlR<PurcUtil_Srch01_DtlR,Chk01_DtlR> createMap_PurcUtil_Srch01_DtlR_Chk01_DtlR() {
			return new Map_PurcUtil_Srch01_DtlR_Chk01_DtlR<PurcUtil_Srch01_DtlR, Chk01_DtlR>();
		}

		public class Map_PurcUtil_Srch01_DtlR_Chk01_DtlR<D extends PurcUtil_Srch01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$dlv_rqst_dt, Chk01_DtlR.$dlv_rqst_tm);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$sppl_cd, Chk01_DtlR.$sppl_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$mfg_loc_cd, Chk01_DtlR.$mfg_loc_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$maker_cd, Chk01_DtlR.$maker_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$bom_ptn, Chk01_DtlR.$bom_ptn);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$in_to_loc_cd, Chk01_DtlR.$dlv_rqst_loc_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$site_cd, Chk01_DtlR.$site_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$sppl_cal_cd, Chk01_DtlR.$sppl_cal_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$in_to_loc_cal_cd, Chk01_DtlR.$in_to_loc_cal_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$lg_grp_cd, Chk01_DtlR.$lg_grp_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$wg_cd, Chk01_DtlR.$in_to_loc_wg_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// 仕入予定日を計算するため、不要項目はクリア
				dest.rqst_dlv_rqst_dt(null);
			}
		}
	}
	/**
	 * Imp01オペレーション.<p>
	 *
	 * 納入指示情報をファイル入力する。<br>
	 */
	public class Imp01 extends MSBDL_DlvInstListReg_MC_A.Imp01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			callThisChk01(up0(), true);
			setDown();
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>)ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
		protected void editUp() {
			setPegNo(up0());
		}
		
		/**
		 * 下り電文を設定します
		 */
		protected void setDown() {
			down0().setAll(up0());
			down0().forEach(r -> {
				r.dlv_rqst_dt(r.dlv_rqst_tm());
				r.dlv_rqst_hm(r.dlv_rqst_tm());
			});
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 納入指示を登録・訂正する<br>
	 */
	public class Upd01 extends MSBDL_DlvInstListReg_MC_A.Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				down0().setAll(up0());
			}
		}
		
		@Override
		protected void doIt() {
			MCList<Chk01_DtlR> dtlL = up0();
			editUp(dtlL);
			callThisChk01(dtlL, false);
			MCList<Chk01_DtlR> list =getChkList(dtlL);
			
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			
			callPurcDlvDtAdjstRegSrvDlvInstUpd01(list, up1());
			
			msgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			MCMessagePool.addAll(msgL);
			
			setDown();
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>)ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
		protected void handleSuccess(MCList<Chk01_DtlR> l) {
			dbTran().commit();
			for (Chk01_DtlR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}
		
		protected void handleEx(Exception e, MCList<Chk01_DtlR> l) {
			dbTran().rollback();
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException) e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk01_DtlR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
		
		/**
		 * 上り電文設定
		 */
		protected void editUp(MCList<Chk01_DtlR> dtlL) {
			setPegNo(dtlL);
			
			for (Chk01_DtlR r : dtlL) {
				if (r.isStatusCreate()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (r.isStatusModify()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else if (r.isStatusDelete()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
			}
		}
		
		/**
		 * 下り電文を設定します
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 納入指示を取り消す<br>
	 */
	public class Del01 extends MSBDL_DlvInstListReg_MC_A.Del01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				down0().setAll(up0());
			}
		}
		
		@Override
		protected void doIt() {
			MCList<Chk01_DtlR> dtlL = up0();
			editUp(dtlL);
			callThisChk01(dtlL, false);
			MCList<Chk01_DtlR> list =getChkList(dtlL);
			
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			
			callPurcDlvDtAdjstRegSrvDlvInstUpd01(list, up1());
			
			msgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			MCMessagePool.addAll(msgL);
			
			setDown();
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>)ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
		protected void handleSuccess(MCList<Chk01_DtlR> l) {
			dbTran().commit();
			for (Chk01_DtlR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}
		
		protected void handleEx(Exception e, MCList<Chk01_DtlR> l) {
			dbTran().rollback();
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException) e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk01_DtlR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
		
		/**
		 * 上り電文設定
		 */
		protected void editUp(MCList<Chk01_DtlR> dtlL) {
			setPegNo(dtlL);
			dtlL.setStringNE(Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
		}
		
		/**
		 * 下り電文を設定します
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 納入指示書、納品書を発行する<br>
	 */
	public class Prnt01 extends MSBDL_DlvInstListReg_MC_A.Prnt01 {
		
		protected MCList<Prnt01_DtlR> _dlvInstL;
		protected MCList<Prnt01_DtlR> _dlvSlipL;
		protected MCList<Prnt01_DtlR> _purcDlvSlipL;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			preProc();
			createPrintTgtList();
			callPurcPrntSrvPrnt01();
		}
		
		protected void preProc() {
			_dlvInstL = MCList.create(Prnt01_DtlR.class);
			_dlvSlipL = MCList.create(Prnt01_DtlR.class);
			_purcDlvSlipL = MCList.create(Prnt01_DtlR.class);
		}

		protected void createPrintTgtList() {
			
			MCList<Prnt01_DtlR> tempDlvInstL= MCList.create(Prnt01_DtlR.class);
			MCList<Prnt01_DtlR> tempDlvSlipL= MCList.create(Prnt01_DtlR.class);
			MCList<Prnt01_DtlR> tempPurcDlvSlipL= MCList.create(Prnt01_DtlR.class);
			
			for(Prnt01_DtlR upR : up0()) {
				if(upR.dlv_inst_print_flg()) {
					tempDlvInstL.add(upR);
				}
				if(upR.dlv_slip_print_flg()) {
					tempDlvSlipL.add(upR);
				}
				if(upR.purc_ddlv_dlv_slip_print_flg()) {
					tempPurcDlvSlipL.add(upR);
				}
			}

			_dlvInstL.setAll(tempDlvInstL.groupBy(new MCGroupByPolicy(getDlvInstGBKey())));
			_dlvSlipL.setAll(tempDlvSlipL.groupBy(new MCGroupByPolicy(getDlvSlipGBKey())));
			_purcDlvSlipL.setAll(tempPurcDlvSlipL.groupBy(new MCGroupByPolicy(getPurcDlvSlipGBKey())));
		}
		
		protected String[] getDlvInstGBKey() {
			
			return new String[] {
					Prnt01_DtlR.$po_no,
					Prnt01_DtlR.$po_d_no,
					Prnt01_DtlR.$dlv_inst_no,
					Prnt01_DtlR.$dlv_inst_rev};
		}

		protected String[] getDlvSlipGBKey() {

			return new String[] {
					Prnt01_DtlR.$po_no,
					Prnt01_DtlR.$dlv_slip_mng_no,
					Prnt01_DtlR.$dlv_slip_mng_seq};
		}

		protected String[] getPurcDlvSlipGBKey() {

			return new String[] {
					Prnt01_DtlR.$po_no, 
					Prnt01_DtlR.$purc_ddlv_dlv_slip_no,
					Prnt01_DtlR.$purc_ddlv_dlv_slip_seq,
			};
		}



		protected void callPurcPrntSrvPrnt01() {
			
			MSBDL_PurcPrntService.PurcPrnt_Prnt01 ope = MSBDL_PurcPrntService.crtPurcPrnt_Prnt01();

			setPurcPrntSrvPrnt01Up(ope);
			ope.exec();
		}

		protected void setPurcPrntSrvPrnt01Up(MSBDL_PurcPrntService.PurcPrnt_Prnt01 ope) {
			
			setPegNo(_dlvInstL);
			setPegNo(_dlvSlipL);
			setPegNo(_purcDlvSlipL);

			addAll(ope.up1(), _dlvInstL, createMap_PurcPrnt_Prnt01_DlvInst());
			addAll(ope.up2(), _dlvSlipL, createMap_PurcPrnt_Prnt01_DlvSlip());
			ope.up3().indiv_prnt_flg(up1().indiv_prnt_flg());
			addAll(ope.up4(), _purcDlvSlipL, createMap_PurcPrnt_Prnt01_PurcDDlvDlvSlip());
		}
		
		
		protected Map_PurcPrnt_Prnt01_DlvInst<PurcPrnt_Prnt01_DlvInstR, Prnt01_DtlR> createMap_PurcPrnt_Prnt01_DlvInst() {
			return new Map_PurcPrnt_Prnt01_DlvInst<PurcPrnt_Prnt01_DlvInstR, Prnt01_DtlR>();
		}

		public class Map_PurcPrnt_Prnt01_DlvInst<D extends PurcPrnt_Prnt01_DlvInstR, S extends Prnt01_DtlR>
				extends MCRowMapper<D, S> {
					
			@Override
			protected void setupColumnPathMap() {
				
				addColumnPathMap(PurcPrnt_Prnt01_DlvInstR.$peg_no, Prnt01_DtlR.$peg_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvInstR.$po_d_no, Prnt01_DtlR.$po_d_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvInstR.$po_no, Prnt01_DtlR.$po_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvInstR.$dlv_inst_no, Prnt01_DtlR.$dlv_inst_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvInstR.$dlv_inst_rev, Prnt01_DtlR.$dlv_inst_rev);

			}
		}

		protected Map_PurcPrnt_Prnt01_DlvSlip<PurcPrnt_Prnt01_DlvSlipR, Prnt01_DtlR> createMap_PurcPrnt_Prnt01_DlvSlip() {
			return new Map_PurcPrnt_Prnt01_DlvSlip<PurcPrnt_Prnt01_DlvSlipR, Prnt01_DtlR>();
		}

		public class Map_PurcPrnt_Prnt01_DlvSlip<D extends PurcPrnt_Prnt01_DlvSlipR, S extends Prnt01_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$peg_no, Prnt01_DtlR.$peg_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$po_no, Prnt01_DtlR.$po_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$po_d_no, Prnt01_DtlR.$po_d_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$dlv_slip_mng_no, Prnt01_DtlR.$dlv_slip_mng_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$dlv_slip_mng_seq, Prnt01_DtlR.$dlv_slip_mng_seq);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.bp_srch_flg(true);
			}

		}

		protected Map_PurcPrnt_Prnt01_PurcDDlvDlvSlip<PurcPrnt_Prnt01_DlvSlipR, Prnt01_DtlR> createMap_PurcPrnt_Prnt01_PurcDDlvDlvSlip() {
			return new Map_PurcPrnt_Prnt01_PurcDDlvDlvSlip<PurcPrnt_Prnt01_DlvSlipR, Prnt01_DtlR>();
		}

		public class Map_PurcPrnt_Prnt01_PurcDDlvDlvSlip<D extends PurcPrnt_Prnt01_DlvSlipR, S extends Prnt01_DtlR>
				extends MCRowMapper<D, S> {
					
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$peg_no, Prnt01_DtlR.$peg_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$po_no, Prnt01_DtlR.$po_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$purc_ddlv_dlv_slip_no, Prnt01_DtlR.$purc_ddlv_dlv_slip_no);
				addColumnPathMap(PurcPrnt_Prnt01_DlvSlipR.$purc_ddlv_dlv_slip_seq, Prnt01_DtlR.$purc_ddlv_dlv_slip_seq);
			}

		}
		

		/**
		 * 発注の最新改訂を取得
		 */
		protected MCList<MST_PO_R> getPoL(MCList<Prnt01_DtlR> dtlL) {
			MCList<MST_PO_R> poL = MCList.create(MST_PO_R.class);
			MST_PO_R t = MST_PO_R.create("T");
			MCQueryApiBuilder poL_bldr = MCQueryApiBuilder.create(t);
			MST_PO_D_R poD = MST_PO_D_R.create("POD");
			poL_bldr.addSelect(poD.dlv_cd);
			poL_bldr.setWhere(t.po_no.eq(bind("po_no")));
			poL_bldr.addInnerJoin(poD, bracket(t.po_no.eq(poD.po_no)));
			dbSelect("MSBDL0230_MST_PO_S01", poL, poL_bldr, dtlL);
			return poL;
		}
		
		/**
		 * 購買納品伝票ヘッダを取得
		 */
		protected MCList<MST_PURC_DLV_SLIP_R> getPrntDlvSlipL(Prnt01_DtlR dtlR) {
			MCList<MST_PURC_DLV_SLIP_R> purcDlvSlipL = MCList.create(MST_PURC_DLV_SLIP_R.class);
			MST_PURC_DLV_SLIP_R t = MST_PURC_DLV_SLIP_R.create("T");
			MCQueryApiBuilder purcDlvSlipL_bldr = MCQueryApiBuilder.create(t);
			purcDlvSlipL_bldr.setWhere(t.po_no.eq(bind("po_no")));
			purcDlvSlipL_bldr.addWhereWithAnd(t.po_rev.eq(bind("po_rev")));
			purcDlvSlipL_bldr.addWhereWithAnd(t.dlv_inst_grp_no.eq(bind("dlv_inst_grp_no")));
			purcDlvSlipL_bldr.addWhereWithAnd(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			purcDlvSlipL_bldr.setOrderByAsc(t.dlv_slip_mng_no);
			dbSelect("MSBDL0230_MST_PURC_DLV_SLIP_S01", purcDlvSlipL, purcDlvSlipL_bldr, dtlR);
			return purcDlvSlipL;
		}
	}
	
	protected MCList<MST_RCPT_IV_D_R> _cacheRcptIvD;
	protected MCIndexKey _cacheRcptIvDKeyByPurcSchdNo;
	protected MCIndexKey _cacheRcptIvDKeyByPoDNo;
	protected void initRcptIvD(MCList<Srch01_RsltR> down) {
		// 検索条件を発注明細主キーワークに登録
		MCList<MST_PO_D_R> wkL = MCList.create(MST_PO_D_R.class);
		for (MCRow r : down) {
			if (isNull(r.getStringNE("po_d_no"))) {
				continue;
			}
			MST_PO_D_R wkR = MST_PO_D_R.create();
			wkR.po_d_no(r.getStringNE("po_d_no"));
			wkL.add(wkR);
		}
		MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_PO_D_R.create("T"));
		dbWkDelete("MSBDL0230_MSW_PO_D_D01", wkL_bldr.getBaseDbc());
		dbWkInsert("MSBDL0230_MSW_PO_D_I01", wkL, wkL_bldr.getBaseDbc());
		
		// 発注明細主キーワークをから受領インボイス情報を取得
		_cacheRcptIvD = MCList.create(MST_RCPT_IV_D_R.class);
		MSW_PO_D_KEY_R w1 = MSW_PO_D_KEY_R.create("W1");
		MST_RCPT_IV_R rcptIv = MST_RCPT_IV_R.create("RCPTIV");
		MST_RCPT_IV_D_R rcptIvD_t = MST_RCPT_IV_D_R.create("T");
		MCQueryApiBuilder rcptIvD_bldr = MCQueryApiBuilder.create(rcptIvD_t);
		rcptIvD_bldr.addSelect(rcptIv.rcpt_iv_no);
		rcptIvD_bldr.addInnerJoin(w1, bracket(w1.po_d_no.eq(rcptIvD_t.po_d_no)));
		rcptIvD_bldr.addInnerJoin(rcptIv, bracket(rcptIv.rcpt_iv_mng_no.eq(rcptIvD_t.rcpt_iv_mng_no)));
		dbSelect("MSBDL0230_MST_RCPT_IV_D_S01", _cacheRcptIvD, rcptIvD_bldr);
		
		_cacheRcptIvDKeyByPurcSchdNo = _cacheRcptIvD.createIndex("purc_schd_no");
		_cacheRcptIvDKeyByPoDNo = _cacheRcptIvD.createIndex("po_d_no");
	}
	protected MCList<MST_RCPT_IV_D_R> getRcptIvDByPurcSchdNo(String purcSchdNo) {
		return _cacheRcptIvD.subList(_cacheRcptIvDKeyByPurcSchdNo, purcSchdNo);
	}
	protected MCList<MST_RCPT_IV_D_R> getRcptIvDByPoDNo(String poDNo) {
		return _cacheRcptIvD.subList(_cacheRcptIvDKeyByPoDNo, poDNo);
	}
	
	/**
	 * 検索条件を編集
	 */
	protected void setUpTmpCol(Srch01_CndR cndR) {
		// マスタ取得基準日
		cndR.addDateColumn("today", getToday());
		if (!isSame(cndR.not_edi_flg(), cndR.edi_flg())) {
			
			cndR.addStringColumn("edi_flg_str", MCBooleanUtil.booleanToDBString(cndR.edi_flg()));
		}
		if (isSame(cndR.screen_ope(), "1") || isSame(cndR.screen_ope(), "2")) {
			cndR.addStringColumn("trnst_flg_str", MCBooleanUtil.booleanToDBString(true));
		}
		else {
			cndR.addStringColumn("trnst_flg_str", MCBooleanUtil.booleanToDBString(false));
		}
	}
	
	/**
	 * チェック処理を実行する
	 */
	protected void callThisChk01(MCList<Chk01_DtlR> dtlL, boolean fileImpFlg) {
		MSBDL_DlvInstListReg.Chk01 chk01 = MSBDL_DlvInstListReg.crtChk01();
		chk01.up0().setAll(dtlL);
		chk01.up1().file_imp_flg(fileImpFlg);
		chk01.exec();
		dtlL.setAll(chk01.down0());
	}
	
	protected List<MCList<Chk01_DtlR>> splitUp(MCList<Chk01_DtlR> list, int max) {
		List<MCList<Chk01_DtlR>> ret = new ArrayList<>();
		MCList<Chk01_DtlR>[] grpL = list.groupList(getSplitColumn());
		MCList<Chk01_DtlR> tmp = MCList.create(Chk01_DtlR.class);
		for (MCList<Chk01_DtlR> grp : grpL) {
			if (tmp.size() >= max) {
				ret.add(tmp);
				tmp = MCList.create(Chk01_DtlR.class);
			}
			tmp.addAll(grp);
		}
		if (!tmp.isEmpty()) {
			ret.add(tmp);
		}
		return ret;
	}
	
	protected String[] getSplitColumn() {
		return new String[]{Chk01_DtlR.$sppl_cd};
	}
	
	/**
	 * 購買納期調整登録サービスの納入指示更新処理を実行する
	 */
	protected void callPurcDlvDtAdjstRegSrvDlvInstUpd01(MCList<Chk01_DtlR> dtlL, Upd01_CtrlR ctrlR) {
		MSBDL_PurcDlvDtAdjstRegService.DlvInst_Upd01 ope = MSBDL_PurcDlvDtAdjstRegService.crtDlvInst_Upd01();
		MCList<Chk01_DtlR>[] upGroupList = makeGroupList(dtlL);
		
		Map_DlvInst_Chk01_HdrR_Chk01_DtlR<DlvInst_Chk01_HdrR, Chk01_DtlR, Upd01_CtrlR> up0Mpr = createMap_DlvInst_Chk01_HdrR_Chk01_DtlR();
		up0Mpr.setWith(ctrlR);
		
		for (MCList<Chk01_DtlR> list : upGroupList) {
			// ヘッダ
			Chk01_DtlR hdrR = list.get(0);
			DlvInst_Chk01_HdrR dlvInstChk01HdrR = DlvInst_Chk01_HdrR.create();
			copy(dlvInstChk01HdrR, hdrR, up0Mpr);
			ope.up0().add(dlvInstChk01HdrR);
			
			// 明細
			setDispSeq(list);
			addAll(ope.up1(), list, createMap_DlvInst_Chk01_DtlR_Chk01_DtlR());
		}
		
		if(!ope.up0().isEmpty()) {
			ope.exec();
			
			// ヘッダ
			String[] destCols = new String[] {Chk01_DtlR.$dlv_inst_no, Chk01_DtlR.$dlv_inst_rev};
			String[] srcCols = new String[] {DlvInst_Chk01_HdrR.$dlv_inst_no, DlvInst_Chk01_HdrR.$dlv_inst_rev};
			copyByPegNo(dtlL, ope.down0(), "hdr_peg_no", destCols, Prms_Chk01_HdrR.$peg_no, srcCols);
			
			// 明細
			String[] dtlDestCols = {Chk01_DtlR.$dlv_inst_no, Chk01_DtlR.$dlv_inst_d_no, Chk01_DtlR.$dlv_slip_no, Chk01_DtlR.$dlv_slip_seq, Chk01_DtlR.$dlv_slip_rev,Chk01_DtlR.$dlv_slip_d_no,
					Chk01_DtlR.$purc_ddlv_dlv_slip_no, Chk01_DtlR.$purc_ddlv_dlv_slip_rev, Chk01_DtlR.$purc_ddlv_dlv_slip_d_no};
			String[] dtlSrcCols = {DlvInst_Chk01_DtlR.$dlv_inst_no, DlvInst_Chk01_DtlR.$dlv_inst_d_no, DlvInst_Chk01_DtlR.$dlv_slip_no, DlvInst_Chk01_DtlR.$dlv_slip_seq, DlvInst_Chk01_DtlR.$dlv_slip_rev,DlvInst_Chk01_DtlR.$dlv_slip_d_no,
					DlvInst_Chk01_DtlR.$purc_ddlv_dlv_slip_no, DlvInst_Chk01_DtlR.$purc_ddlv_dlv_slip_rev, DlvInst_Chk01_DtlR.$purc_ddlv_dlv_slip_d_no};
			copyByPegNo(dtlL, ope.down1(), "peg_no", dtlDestCols, Prms_Chk01_DtlR.$peg_no, dtlSrcCols);
		}
	}
	
	/**
	 * ヘッダ項目が同一の明細は、同一伝票にまとめます
	 * @param dtlL
	 * @return
	 */
	protected MCList<Chk01_DtlR>[] makeGroupList(MCList<Chk01_DtlR> dtlL) {
		MCList<Chk01_DtlR>[] upGroupList = dtlL.groupList(getHdrColumn());
		return upGroupList;
	}
	
	protected String[] getHdrColumn(){
		return new String[]{ 
				Chk01_DtlR.$dlv_inst_no
				,Chk01_DtlR.$dlv_inst_rev
				,Chk01_DtlR.$po_d_no
				,Chk01_DtlR.$dlv_inst_dt
				,Chk01_DtlR.$dlv_inst_print_rmrks
				,Chk01_DtlR.$dlv_inst_print_dt
				,Chk01_DtlR.$intr_rmrks
				,Chk01_DtlR.$sub_char1
				,Chk01_DtlR.$sub_char2
				,Chk01_DtlR.$sub_char3};
	}
	
	protected Map_DlvInst_Chk01_HdrR_Chk01_DtlR<DlvInst_Chk01_HdrR, Chk01_DtlR, Upd01_CtrlR> createMap_DlvInst_Chk01_HdrR_Chk01_DtlR() {
		return new Map_DlvInst_Chk01_HdrR_Chk01_DtlR<DlvInst_Chk01_HdrR, Chk01_DtlR, Upd01_CtrlR>();
	}

	public class Map_DlvInst_Chk01_HdrR_Chk01_DtlR<D extends DlvInst_Chk01_HdrR, S extends Chk01_DtlR, W extends Upd01_CtrlR>
			extends mcframe.commonFXUC.FXUCC0090.FXUCC_RowMapperWith<D, S, W> {
		protected W _ctrlR;

		@Override
		public void setWith(W ctrlR) {
			this._ctrlR = ctrlR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DlvInst_Chk01_HdrR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(DlvInst_Chk01_HdrR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(DlvInst_Chk01_HdrR.$err_flg, Chk01_DtlR.$err_flg);
			addColumnPathMap(DlvInst_Chk01_HdrR.$po_d_no, Chk01_DtlR.$po_d_no);
			addColumnPathMap(DlvInst_Chk01_HdrR.$dlv_inst_no, Chk01_DtlR.$dlv_inst_no);
			addColumnPathMap(DlvInst_Chk01_HdrR.$dlv_inst_rev, Chk01_DtlR.$dlv_inst_rev);
			addColumnPathMap(DlvInst_Chk01_HdrR.$dlv_inst_dt, Chk01_DtlR.$dlv_inst_dt);
			addColumnPathMap(DlvInst_Chk01_HdrR.$dlv_inst_prnt_rmrks , Chk01_DtlR.$dlv_inst_print_rmrks);
			addColumnPathMap(DlvInst_Chk01_HdrR.$intr_rmrks, Chk01_DtlR.$intr_rmrks);
			addColumnPathMap(DlvInst_Chk01_HdrR.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(DlvInst_Chk01_HdrR.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(DlvInst_Chk01_HdrR.$sub_char3, Chk01_DtlR.$sub_char3);
			addColumnPathMap(DlvInst_Chk01_HdrR.$dlv_inst_grp_no, Chk01_DtlR.$dlv_inst_grp_no);
			addColumnPathMap(DlvInst_Chk01_HdrR.$edi_flg, Chk01_DtlR.$edi_flg);
			addColumnPathMap(DlvInst_Chk01_HdrR.$dlv_slip_print_flg, Chk01_DtlR.$dlv_slip_print_flg);
			addColumnPathMap(DlvInst_Chk01_HdrR.$purc_ddlv_dlv_slip_print_flg, Chk01_DtlR.$purc_ddlv_dlv_slip_print_flg);
			addColumnPathMap(DlvInst_Chk01_HdrR.$crnt_edi_dlv_inst_flg, Chk01_DtlR.$edi_flg);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			
			super.valueCopy(dest, src);
			dest.data_crud_typ(src.getStringNE("hdr_data_crud_typ"));
			dest.ext_sys_typ(src.getStringNE(MAM_EXT_SYS_R.$ext_sys_typ));
			
			if (!isNull(_ctrlR)) {
				dest.indiv_prnt_flg(_ctrlR.indiv_prnt_flg());
			}
			
			if (!src.edi_flg()) {
				dest.dlv_inst_print_flg(src.dlv_inst_print_flg());
			}

		}
	}

	protected Map_DlvInst_Chk01_DtlR_Chk01_DtlR<DlvInst_Chk01_DtlR,Chk01_DtlR> createMap_DlvInst_Chk01_DtlR_Chk01_DtlR() {
		return new Map_DlvInst_Chk01_DtlR_Chk01_DtlR<DlvInst_Chk01_DtlR, Chk01_DtlR>();
	}

	public class Map_DlvInst_Chk01_DtlR_Chk01_DtlR<D extends DlvInst_Chk01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DlvInst_Chk01_DtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(DlvInst_Chk01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(DlvInst_Chk01_DtlR.$err_flg, Chk01_DtlR.$err_flg);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_inst_no, Chk01_DtlR.$dlv_inst_no);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_inst_d_no, Chk01_DtlR.$dlv_inst_d_no);
			addColumnPathMap(DlvInst_Chk01_DtlR.$purc_act_d_no, Chk01_DtlR.$purc_act_d_no);
			addColumnPathMap(DlvInst_Chk01_DtlR.$mfg_inst_no, Chk01_DtlR.$mfg_inst_no);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_rqst_tm, Chk01_DtlR.$dlv_rqst_tm);
			addColumnPathMap(DlvInst_Chk01_DtlR.$purc_schd_dt, Chk01_DtlR.$purc_schd_dt);
			addColumnPathMap(DlvInst_Chk01_DtlR.$sync_flg, Chk01_DtlR.$sync_flg);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_rqst_loc_cd, Chk01_DtlR.$dlv_rqst_loc_cd);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_rqst_str_ln_cd, Chk01_DtlR.$dlv_rqst_str_ln_cd);
			addColumnPathMap(DlvInst_Chk01_DtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(DlvInst_Chk01_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(DlvInst_Chk01_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(DlvInst_Chk01_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_inst_print_d_rmrks, Chk01_DtlR.$dlv_inst_print_d_rmrks);
			addColumnPathMap(DlvInst_Chk01_DtlR.$intr_rmrks, Chk01_DtlR.$intr_rmrks);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_slip_d_rmrks, Chk01_DtlR.$dlv_slip_d_rmrks);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_cd, Chk01_DtlR.$inst_dlv_cd);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_sundry_flg, Chk01_DtlR.$dlv_sundry_flg);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_nm, Chk01_DtlR.$dlv_nm);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_cntct_dpt, Chk01_DtlR.$dlv_cntct_dpt);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_cntct_psn, Chk01_DtlR.$dlv_cntct_psn);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_zip_cd, Chk01_DtlR.$dlv_zip_cd);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_addr1, Chk01_DtlR.$dlv_addr1);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_addr2, Chk01_DtlR.$dlv_addr2);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_addr3, Chk01_DtlR.$dlv_addr3);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_addr4, Chk01_DtlR.$dlv_addr4);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_tel, Chk01_DtlR.$dlv_tel);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_fax, Chk01_DtlR.$dlv_fax);
			addColumnPathMap(DlvInst_Chk01_DtlR.$dlv_lg_grp_cd, Chk01_DtlR.$dlv_lg_grp_cd);
			addColumnPathMap(DlvInst_Chk01_DtlR.$pri_prnt_flg, Chk01_DtlR.$pri_prnt_flg);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_cd, Chk01_DtlR.$tdlv_cd);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_sundry_flg, Chk01_DtlR.$tdlv_sundry_flg);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_nm, Chk01_DtlR.$tdlv_nm);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_cntct_dpt, Chk01_DtlR.$tdlv_cntct_dpt);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_cntct_psn, Chk01_DtlR.$tdlv_cntct_psn);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_zip_cd, Chk01_DtlR.$tdlv_zip_cd);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_addr1, Chk01_DtlR.$tdlv_addr1);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_addr2, Chk01_DtlR.$tdlv_addr2);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_addr3, Chk01_DtlR.$tdlv_addr3);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_addr4, Chk01_DtlR.$tdlv_addr4);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_tel, Chk01_DtlR.$tdlv_tel);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_fax, Chk01_DtlR.$tdlv_fax);
			addColumnPathMap(DlvInst_Chk01_DtlR.$tdlv_lg_grp_cd, Chk01_DtlR.$tdlv_lg_grp_cd);
			addColumnPathMap(DlvInst_Chk01_DtlR.$sub_char1, Chk01_DtlR.$dtl_sub_char1);
			addColumnPathMap(DlvInst_Chk01_DtlR.$sub_char2, Chk01_DtlR.$dtl_sub_char2);
			addColumnPathMap(DlvInst_Chk01_DtlR.$sub_char3, Chk01_DtlR.$dtl_sub_char3);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.hdr_peg_no(src.getNumberNE("hdr_peg_no"));
		}
	}

	//FMCB CUSTOM END
}