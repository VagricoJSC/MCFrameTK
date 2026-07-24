package mcframe.serverMSBE.MSBEL5900;

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
import mcframe.serverMSBE.MSBEL5900.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.execCalDaysBatch;
import mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil;
import mcframe.serverMSBA.MSBAL5100.*;
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverMSBC.MSBCL6120.*;
import mcframe.serverMSBD.MSBDL5030.*;
import mcframe.serverMSBD.MSBDL5040.*;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBE.MSBEL5260.*;
import mcframe.serverMSBF.MSBFL5010.*;
import mcframe.serverMSBF.MSBFL5110.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSUC.MSUCL0090.*;
import mcframe.serverMSLA.MSLAL6030.*;
import mcframe.serverCore.cache.MCJoinerList;
import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ArrSchdService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ArrSchdService_MC extends MSBEL_ArrSchdService_MC_A{
	//FMCB CUSTOM START

	protected final String UP1_PEG_NO_COL = ArrSchd_DtlR.$peg_d_no;
	protected final String IS_NOT_STK_COL = "_is_not_stk";
	protected final String ASST_TYP_COL = "_asst_typ";
	protected final String INSP_PTN_CD_COL = "_insp_ptn_cd";
	protected final String INSP_END_DT_COL = "_insp_end_dt";
	protected final String PO_D_NO_COL = "_po_d_no";
	protected final String DLV_SLIP_D_NO_COL = "_dlv_slip_d_no";
	protected final String IV_D_NO_COL = "_iv_d_no";
	protected final String IS_ABORT_FLG_COL = "_is_abort_flg";
	protected final String ORG_ARR_QTY = "_org_arr_qty";
	protected final String ORG_LOC_CD = "_org_loc_cd";
	protected final String ORG_LOT_NO = "_org_lot_no";
	protected final String ORG_SUBLOT_NO = "_org_sublot_no";
	protected final String TRD_UNIT_QTY = "_trd_unit_qty";
	protected final String BASE_UNIT_QTY = "_base_unit_qty";
	protected final String ORG_ABORT_FLG = "_org_abort_flg";
	protected final String ORG_PR_STS_TYP = "_org_pr_sts_typ";
	
	/**
	 * ArrSchd_Upd01オペレーション.<p>
	 *
	 * 更新（入荷進捗・予定）を行います。<br>
	 */
	public class ArrSchd_Upd01 extends MSBEL_ArrSchdService_MC_A.ArrSchd_Upd01 {
		
		MCList<ArrSchd_DtlR> _inspL;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			doCache();
			editUp();
			callArrSchdSendIf(true);	// 入荷予定が削除される前に処理する
			callOutSrcInst();
			callIoSchdForDel();
			// ArrSchd_Upd01は入荷進捗を新規登録するため、入荷進捗更新後、入荷予定に入荷進捗ＮＯを設定し入荷予定を更新する。
			// さらに入荷予定、仕入予定更新後、入荷予定データをもとに入荷進捗の数量データを再度更新する。（呼び出し順に制約あり）
			updArrPr();		//呼び出し順１
			updArrSchd();	//呼び出し順２
			callPurcSchd();	//呼び出し順３
			updArrPrQty();	//呼び出し順４
			callProvSchd();
			callIoSchd();
			callInspSchd();
			callMrktJudg();
			updArrPr2();
			callSloSts();
			callOrdReg();
			callWgRqst();
			callArrSchdSendIf(false);
			callLotDel01();
			setDown();
		}

		protected void doCache() {
			initArrPrCache(up0());
			initBizRsnCache(up0());
			initPoDCache(up0());
			initIvDCache(up0());
			initItmCache(up1());
			initLocCache(up1());
			initArrSchdCacheByArrPrNo(up1());
		}

		protected void setDown() {
			MCIndexKey idxkey = up1().createIndex(ArrSchd_DtlR.$data_crud_typ);
			MCList<ArrSchd_DtlR> downL = up1().subList(idxkey, MAC_DATA_CRUD_TYP.CRT.value());
			down0().setAll(downL);
		}

		MCIndexKey _idx0;
		MCIndexKey _idx1;
		protected final String IS_PR_ABORT_FLG = "_is_pr_abort_flg";
		protected final String IS_ARR_SKIP_NOT_STK_COL = "_is_arr_skip_not_stk";

		protected void editUp() {

			_idx0 = up0().createIndex(ArrSchd_DtlR.$peg_no);
			_idx1 = up1().createIndex(ArrSchd_DtlR.$peg_no);

			// 入荷不要ＦＬＧの編集を先にやる必要があるためup1から
			// 「peg_d_no」未設定なら採番
			if (!up1().isEmpty() && isNull(up1().get(0).peg_d_no())) {
				setPegNo(UP1_PEG_NO_COL, up1());
			}

			up1().addStringColumn(ASST_TYP_COL);
			up1().addStringColumn(INSP_PTN_CD_COL);

			// 打切り＆打切り解除判定用一時カラム
			up1().addBooleanColumn(IS_ABORT_FLG_COL);
			up1().addBooleanColumn(IS_PR_ABORT_FLG);

			for (ArrSchd_DtlR r : up1()) {
				ArrPr_DtlR up0R = up0().getFirst(_idx0, r.peg_no());
				MST_ARR_PR_R apR = getArrPrR(up0R.arr_pr_no());
				setUp0ForAbort(up0R, apR, up0R.abort_flg());
				
				r.addStringColumn("sppl_cd", up0R.sppl_cd());

				r.trd_ptn_typ(up0R.trd_ptn_typ());
				
				if (up0R.abort_flg()) {
					r.abort_flg(true);
					if (MAC_TRD_PTN_TYP.isSLS_RTN(up0R.trd_ptn_typ())) {
						r.sls_ret_schd_abort_flg(true);
					}
					r.setBoolean(IS_PR_ABORT_FLG, true);
				}
				else if (!isNull(r.arr_pr_no()) && apR.abort_flg()) {
					r.abort_flg(false);
					if (MAC_TRD_PTN_TYP.isSLS_RTN(up0R.trd_ptn_typ())) {
						r.sls_ret_schd_abort_flg(false);
					}
					r.setBoolean(IS_PR_ABORT_FLG, true);
				}
				
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				setUp1ForAbort(r, asR, r.abort_flg(), r.sls_ret_schd_abort_flg());

				r.addStringColumn(ORG_LOC_CD, asR.arr_loc_cd());
				r.addStringColumn(ORG_LOT_NO, asR.lot_no());
				r.addStringColumn(ORG_SUBLOT_NO, asR.sublot_no());
				r.addBooleanColumn(ORG_ABORT_FLG, asR.abort_flg());
				r.addStringColumn(ORG_PR_STS_TYP, asR.pr_sts_typ());

				MAM_ITM_R itmR = getItmR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				MAM_BIZ_RSN_R rsnR = getBizRsnR(up0R.rsn_cd());
				r.addBooleanColumn(IS_NOT_STK_COL, isNotStk(itmR, r.trd_ptn_typ(), rsnR));
				r.addBooleanColumn(IS_ARR_SKIP_NOT_STK_COL, false);
				r.addStringColumn(PO_D_NO_COL, up0R.po_d_no());
				r.addStringColumn(DLV_SLIP_D_NO_COL, up0R.dlv_slip_d_no());
				r.addStringColumn(IV_D_NO_COL, up0R.iv_d_no());
				r.addNumberColumn(TRD_UNIT_QTY, r.trd_unit_qty()); 
				r.addNumberColumn(BASE_UNIT_QTY, r.base_unit_qty()); 

				// 入荷不要ＦＬＧ
				MST_ARR_SCHD_R asRByArrPrNo = getArrSchdRByArrPrNo(r.arr_pr_no());
				if (isNull(asRByArrPrNo) || isNull(asRByArrPrNo.arr_schd_no())) {
					if (up0R.purc_ddlv_flg()) {
						r.arr_skip_flg(true);
					}
					else if (r.getBoolean(IS_NOT_STK_COL) && itmR.arr_skip_flg()) {
						r.arr_skip_flg(true);
					}
					else {
						r.arr_skip_flg(false);
					}
				}
				else {
					r.arr_skip_flg(asRByArrPrNo.arr_skip_flg());
				}

				// 仕入直送以外で入荷不要の品目、かつ仕入、経費購買のいずれか場合、入荷実績を作成しないので常に入荷完了として扱う
				if (!up0R.purc_ddlv_flg() && r.arr_skip_flg()) {
					if (MAC_TRD_PTN_TYP.isPURC(up0R.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(up0R.trd_ptn_typ())) {
						r.setBoolean(IS_ARR_SKIP_NOT_STK_COL, true);
					}
				}

				// 打ち切り
				if (r.abort_flg()) {
					// 分割発生時など、新規作成されたレコードに対する即時打切の場合は入力電文の数量を基準とする
					if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || asR.isEmpty()) {
						r.abort_qty(r.base_unit_qty().subtract(r.arr_qty()));
					} else {
						r.abort_qty(asR.base_unit_qty().subtract(asR.arr_qty()));
					}
					r.cmpl_flg(true);
				}
				// 売上返品予定打ち切り
				if (r.sls_ret_schd_abort_flg()) {
					r.sls_ret_schd_abort_qty(asR.base_unit_qty().subtract(asR.sls_ret_qty()));
					r.sls_ret_schd_cmpl_flg(true);
				}
				// 打ち切り解除
				if (!r.abort_flg() && asR != null && asR.abort_flg()) {
					r.abort_qty(0);
					// 入荷不要、かつ数量がゼロの場合は、完了のまま
					if (!r.getBoolean(IS_ARR_SKIP_NOT_STK_COL)
							&& !r.base_unit_qty().subtract(r.arr_qty()).isZero()) {
						r.cmpl_flg(false);
					}
				}
				// 売上返品予定打ち切り解除
				if (!r.sls_ret_schd_abort_flg() && asR != null && asR.sls_ret_schd_abort_flg()) {
					r.sls_ret_schd_abort_qty(0);
					// 入荷不要の場合は、完了のまま
					if (!r.getBoolean(IS_ARR_SKIP_NOT_STK_COL)) {
						r.sls_ret_schd_cmpl_flg(false);
					}
				}
				
				// 資産区分
				if (!MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
					if (!isNull(r.arr_loc_cd())) {
						MAM_LOC_R locR = getLocR(r.arr_loc_cd());
						if (!isNull(locR) && MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())
								&& locR.getBooleanNE("repurc_obli_flg")) {
							r.setValue(ASST_TYP_COL, MAC_ASST_TYP.CO_PROD.value());
						}
						else {
							r.setValue(ASST_TYP_COL, MAC_ASST_TYP.OTH.value());
						}
					}
					else {
						r.setValue(ASST_TYP_COL, MAC_ASST_TYP.OTH.value());
					}
				}
				else {
					MAM_LOC_R locR = getLocR(r.arr_loc_cd());
					if (MAC_LOC_MNG_TYP.isSLS(locR.loc_mng_typ())) {
						r.setValue(ASST_TYP_COL, MAC_ASST_TYP.CO_SLS.value());
					}
					else if (MAC_LOC_MNG_TYP.isPRD(locR.loc_mng_typ())) {
						r.setValue(ASST_TYP_COL, MAC_ASST_TYP.CO_PROD.value());
					}
				}
				
				if (r.abort_flg()
						|| r.sls_ret_schd_abort_flg()
						|| (asR != null && (asR.abort_flg() || asR
								.sls_ret_schd_abort_flg()))) {
					r.setBoolean(IS_ABORT_FLG_COL, true);
					// 打ち切り系の設定はここまで
					continue;
				}

				// 入荷パタン区分
				if (isNull(r.arr_ptn_typ())) {
					r.arr_ptn_typ(MSC_ARR_PTN_TYP.NRML.value());
				}
				// 在庫検査区分
				r.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				if (!isNull(asR.arr_schd_no())) {
					r.arr_qty(asR.arr_qty());
					r.purc_qty(asR.purc_qty());
					r.sls_ret_qty(asR.sls_ret_qty());
					r.pre_mfg_act_no(asR.pre_mfg_act_no());
				}
				else {
					r.arr_qty(0);
					r.purc_qty(0);
					r.sls_ret_qty(0);
					r.pre_mfg_act_no(null);
				}
				r.abort_qty(0);
				r.sls_ret_schd_abort_qty(0);
				r.sls_ret_schd_cmpl_flg(false);

				// 取引単位数量・基準単位数量
				if (r.getBoolean(IS_ARR_SKIP_NOT_STK_COL)) {
					r.trd_unit_qty(0);
					r.base_unit_qty(0);
				}
				if (r.getBoolean(IS_ARR_SKIP_NOT_STK_COL)
					|| r.arr_qty().isPositive() && r.arr_qty().gte(r.base_unit_qty())) {
					r.cmpl_flg(true);
				}
				else {
					r.cmpl_flg(false);
				}
				// 進捗状況区分
				if (r.arr_qty().isPositive() && r.arr_qty().gte(r.base_unit_qty())) {
					r.pr_sts_typ(MSC_PR_STS_TYP.ARR.value());
				}
				else if (r.arr_qty().isPositive()) {
					r.pr_sts_typ(MSC_PR_STS_TYP.PART_ARR.value());
				}
				else {
					r.pr_sts_typ(MSC_PR_STS_TYP.NOT_ARR.value());
				}

				if (isNull(r.sno1())) {
					r.sno1(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.sno2())) {
					r.sno2(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.sno3())) {
					r.sno3(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.sno4())) {
					r.sno4(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.stk_arrv_bp_cd())) {
					r.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.stk_bp_cd())) {
					r.stk_bp_cd(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.str_ln_cd())) {
					r.str_ln_cd(MAC_STR.NULL_VAL.value());
				}
				if (MAC_TRD_PTN_TYP.isSHIP_RTN(up0R.trd_ptn_typ()) && isNull(up0R.dlv_slip_d_no())) {
					if (isNull(r.ret_str_ln_cd())) {
						r.ret_str_ln_cd(MAC_STR.NULL_VAL.value());
					}
				}
			}
			initScmIfCtrl(up1());
			for (ArrSchd_DtlR r : up1()) {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				if (MSC_PR_STS_TYP.isNOT_ARR(r.pr_sts_typ())) {
					r.arr_schd().wms_flg(isWms(r));
					r.arr_schd().lg_grp_cd(getLocR(r.arr_loc_cd()).lg_grp_cd());
				}
				else if (!asR.isEmpty()) {
					r.arr_schd().wms_flg(asR.wms_flg());
					r.arr_schd().lg_grp_cd(asR.lg_grp_cd());
				}
			}

			for (ArrPr_DtlR r : up0()) {
				MST_ARR_PR_R apR = getArrPrR(r.arr_pr_no());
				// 打ち切り
				if (r.abort_flg()) {
					r.arr_cmpl_flg(true);
					if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
						r.purc_cmpl_flg(true);
					}
					else if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())) {
						r.sls_ret_cmpl_flg(true);
					}
					continue;
				}
				// 打ち切り解除
				if (!isNull(r.arr_pr_no()) && apR.abort_flg()) {
					r.arr_cmpl_flg(false);
					if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
						r.purc_cmpl_flg(false);
					}
					else if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())) {
						r.sls_ret_cmpl_flg(false);
					}
					continue;
				}

				MCList<ArrSchd_DtlR> up1L = up1().subList(_idx1, r.peg_no());
				r.arr_schd_tm((MCDate) up1L.max(ArrSchd_DtlR.$arr_schd_tm));

				// 標準納入ＬＴ
				MST_PO_D_R podR = getPoDR(r.po_d_no());
				r.std_purc_lt(podR.purc_lt());

				if (!isNull(r.arr_pr_no())) {
					r.arr_tm(apR.arr_tm());
					r.purc_dt(apR.purc_dt());
					r.arr_qty(apR.arr_qty());
					r.purc_qty(apR.purc_qty());
					r.sls_ret_qty(apR.sls_ret_qty());
				}
				else {
					r.arr_tm(null);
					r.purc_dt(null);
					r.arr_qty(0);
					r.purc_qty(0);
					r.sls_ret_qty(0);
					r.arr_schd_abort_qty(0);
					r.purc_schd_abort_qty(0);
					r.sls_ret_schd_abort_qty(0);
				}
				r.prms_dlv_dt_overdue_flg(false);
				r.dlv_rqst_dt_overdue_flg(false);
				r.purc_cmpl_flg(false);
				r.sls_ret_cmpl_flg(false);
				if (isNull(r.rcpt_iv_qty())) {
					r.rcpt_iv_qty(0);
				}
				if (isNull(r.prms_rcpt_qty())) {
					r.prms_rcpt_qty(0);
				}
				if (isNull(r.prms_refl_qty())) {
					r.prms_refl_qty(0);
				}
				if (isNull(r.dlv_inst_qty())) {
					r.dlv_inst_qty(0);
				}
				if (isNull(r.dlv_inst_prms_rcpt_qty())) {
					r.dlv_inst_prms_rcpt_qty(0);
				}
				if (isNull(r.dlv_inst_prms_refl_qty())) {
					r.dlv_inst_prms_refl_qty(0);
				}
				if (isNull(r.arr_pr().accpt_dfct_qty())) {
					r.arr_pr().accpt_dfct_qty(0);
				}
				if (up1L.size() > 0 && up1L.get(0).getBoolean(IS_ARR_SKIP_NOT_STK_COL)) {
					r.arr_cmpl_flg(true);
				}
				else {
					r.arr_cmpl_flg(false);
				}

				if (up1L.subList(rr -> !MAC_DATA_CRUD_TYP.isDEL(rr.data_crud_typ())).size() > 1) {
					r.arr_schd_split_flg(true);
				}
				else {
					r.arr_schd_split_flg(false);
				}

				// 基準単位、荷姿単位
				if (up1L.size() > 0) {
					ArrSchd_DtlR up1R = up1L.get(0);
					// 取引単位＝基準単位
					if (isSame(r.trd_unit_cd(), up1R.base_unit_cd())) {
						r.arr_pr().base_unit_cd(r.trd_unit_cd());
						r.arr_pr().base_unit_qty(r.trd_unit_qty());
						r.arr_pr().pack_unit_cd(r.trd_unit_cd());
						r.arr_pr().pack_unit_qty(r.trd_unit_qty());
					}
					else {
						MAVM_ITM_UNIT_R trdR = getItmUnitR(up1R.itm_cd(), up1R.itm_sub1(), up1R.itm_sub2(), up1R.itm_sub3(), r.trd_unit_cd());
						MAVM_ITM_UNIT_R baseR = getItmUnitR(up1R.itm_cd(), up1R.itm_sub1(), up1R.itm_sub2(), up1R.itm_sub3(), up1R.base_unit_cd());

						MCNumber baseQty = convToBaseUnit(r.trd_unit_qty(), trdR.conv_base_qty(), trdR.conv_qty(), baseR.dec_place(), baseR.rnd_typ());

						r.arr_pr().base_unit_cd(up1R.base_unit_cd());
						r.arr_pr().base_unit_qty(baseQty);

						// 取引単位ＣＤが荷姿単位
						if (trdR.pack_flg()) {
							r.arr_pr().pack_unit_cd(r.trd_unit_cd());
							r.arr_pr().pack_unit_qty(r.trd_unit_qty());
						}
						else {
							r.arr_pr().pack_unit_cd(up1R.base_unit_cd());
							r.arr_pr().pack_unit_qty(baseQty);
						}
					}
				}

				up1L = up1L.subList(ArrSchd_DtlR.$re_arr_schd_flg, true);
				MCNumber reArrSchdQty = nvl(r.re_arr_schd_qty(),MCNumber.ZERO);
				for (ArrSchd_DtlR asR : up1L) {
					if (MAC_DATA_CRUD_TYP.isDEL(asR.data_crud_typ())) {
						reArrSchdQty= reArrSchdQty.subtract(asR.base_unit_qty());
					}
					else {
						if (MAC_DATA_CRUD_TYP.isUPD(asR.data_crud_typ())) {
							MST_ARR_SCHD_R preR = getArrSchdR(asR.arr_schd_no());
							if (!isNull(preR.arr_schd_no())) {
								reArrSchdQty= reArrSchdQty.subtract(preR.base_unit_qty());
							}
						}
						reArrSchdQty= reArrSchdQty.add(asR.base_unit_qty());
					}
				}
				r.re_arr_schd_qty(reArrSchdQty);
			}

			_inspL = up1().subList(new TrdPtnTypMatcher(MAC_TRD_PTN_TYP.PURC, MAC_TRD_PTN_TYP.PURC_XPNS));

			// 検査予定サービス.品管関連マスタ取得（up1、仕入・経費購買のみ）
			callInspSchdSrch01(_inspL);
		}
		
		protected void setUp0ForAbort(ArrPr_DtlR dest, MST_ARR_PR_R src, boolean abortFlg) {
			if (src == null) {
				return;
			}
			if (MAC_DATA_CRUD_TYP.isDEL(dest.data_crud_typ()) || abortFlg
					|| src.abort_flg()) {
				dest.arr_pr(src);
				if (!MAC_DATA_CRUD_TYP.isDEL(dest.data_crud_typ())) {
					dest.abort_flg(abortFlg);
				}
			}
		}
		
		protected void setUp1ForAbort(ArrSchd_DtlR dest, MST_ARR_SCHD_R src,
				boolean abortFlg, boolean slsAbortFlg) {
			if (src.isEmpty()) {
				return;
			}
			if (MAC_DATA_CRUD_TYP.isDEL(dest.data_crud_typ()) || abortFlg || slsAbortFlg
					|| src.abort_flg() || src.sls_ret_schd_abort_flg()) {
				if (!dest.is_src_rcptivreg_srv_flg()) {
					dest.arr_schd(src);
					dest.purc_schd_no(src.getString("purc_schd_no"));
					dest.accpt_schd_dt(src.getDate("purc_schd_dt"));
				}

				if (!MAC_DATA_CRUD_TYP.isDEL(dest.data_crud_typ())) {
					dest.abort_flg(abortFlg);
					dest.sls_ret_schd_abort_flg(slsAbortFlg);
				}
			}
		}
		
		/**
		 * 外注製造指図登録サービス呼び出し
		 */
		protected void callOutSrcInst() {
			MCList<ArrSchd_DtlR> upd02L = MCList.create(ArrSchd_DtlR.class);
			MCList<ArrSchd_DtlR> upd03L = MCList.create(ArrSchd_DtlR.class);
			MCList<ArrSchd_DtlR> upd04L = MCList.create(ArrSchd_DtlR.class);

			for (ArrSchd_DtlR r : up1()) {
				if (r.outsrc_flg()) {
					MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
					if (asR == null) {
						continue ;
					}
					if (asR.abort_flg() && !r.abort_flg()) {
						upd04L.add(r);
					}
					else if (r.abort_flg()) {
						upd03L.add(r);
					}
					else if (r.re_arr_schd_flg() && r.is_src_purcact_srv_flg()) {
						upd02L.add(r);
					}
				}
			}
			
			callOutSrcInstUpd02(upd02L);
			callOutSrcInstUpd03(upd03L);
			callOutSrcInstUpd04(upd04L);
		}
		
		/**
		 * 外注製造指図登録サービス.更新（再入荷予定）
		 */
		protected void callOutSrcInstUpd02(MCList<ArrSchd_DtlR> l) {
			if (l.isEmpty()) return ;
			MSBCL_OutSrcInstService.OutSrcInst_Upd02 o = MSBCL_OutSrcInstService.crtOutSrcInst_Upd02();
			setAll(o.up0(), l, createMap_OutSrcInst_Chk02_ReArrR_ArrSchd_DtlR());
			o.exec();
			// ロットＮＯ、サブロットＮＯ、製造指図ＮＯ、外注実績先行ＦＬＧ設定
			String[] destCols = new String[] {
					ArrSchd_DtlR.$lot_no, ArrSchd_DtlR.$sublot_no,
					ArrSchd_DtlR.$mfg_inst_no, ArrSchd_DtlR.$pre_outsrc_act_flg
			};
			String[] srcCols = new String[] {
					OutSrcInst_Chk02_ReArrR.$lot_no, OutSrcInst_Chk02_ReArrR.$sublot_no,
					OutSrcInst_Chk02_ReArrR.$re_arr_mfg_inst_no,
					OutSrcInst_Chk02_ReArrR.$pre_outsrc_act_flg
			};
			copyByPegNo(l, o.down0(), UP1_PEG_NO_COL, destCols, "peg_no", srcCols);
		}
		protected Map_OutSrcInst_Chk02_ReArrR_ArrSchd_DtlR<OutSrcInst_Chk02_ReArrR,ArrSchd_DtlR> createMap_OutSrcInst_Chk02_ReArrR_ArrSchd_DtlR() {
			return new Map_OutSrcInst_Chk02_ReArrR_ArrSchd_DtlR<OutSrcInst_Chk02_ReArrR, ArrSchd_DtlR>();
		}
		public class Map_OutSrcInst_Chk02_ReArrR_ArrSchd_DtlR<D extends OutSrcInst_Chk02_ReArrR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(OutSrcInst_Chk02_ReArrR.$peg_no, UP1_PEG_NO_COL);
				addColumnPathMap(OutSrcInst_Chk02_ReArrR.$data_crud_typ, ArrSchd_DtlR.$data_crud_typ);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
					dest.org_mfg_inst_no(src.mfg_inst_no());
					dest.base_unit_qty(src.base_unit_qty());
					dest.dlv_rqst_tm(src.arr_schd_tm());
				}
				else {
					MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
					if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
						dest.re_arr_mfg_inst_no(asR.mfg_inst_no());
					}
					else {
						dest.org_mfg_inst_no(src.mfg_inst_no());
						dest.re_arr_mfg_inst_no(asR.mfg_inst_no());
						dest.base_unit_qty(src.base_unit_qty());
						dest.dlv_rqst_tm(src.arr_schd_tm());
					}
				}
			}
		}
		
		/**
		 * 外注製造指図登録サービス.打切（入荷予定）
		 */
		protected void callOutSrcInstUpd03(MCList<ArrSchd_DtlR> l) {
			if (l.isEmpty()) return ;
			MSBCL_OutSrcInstService.OutSrcInst_Upd03 o = MSBCL_OutSrcInstService.crtOutSrcInst_Upd03();
			setAll(o.up0(), l, createMap_OutSrcInst_Upd03_ArrAbortR_ArrSchd_DtlR());
			o.exec();
		}
		protected Map_OutSrcInst_Upd03_ArrAbortR_ArrSchd_DtlR<OutSrcInst_Upd03_ArrAbortR,ArrSchd_DtlR> createMap_OutSrcInst_Upd03_ArrAbortR_ArrSchd_DtlR() {
			return new Map_OutSrcInst_Upd03_ArrAbortR_ArrSchd_DtlR<OutSrcInst_Upd03_ArrAbortR, ArrSchd_DtlR>();
		}
		public class Map_OutSrcInst_Upd03_ArrAbortR_ArrSchd_DtlR<D extends OutSrcInst_Upd03_ArrAbortR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(OutSrcInst_Upd03_ArrAbortR.$mfg_inst_no, ArrSchd_DtlR.$mfg_inst_no);
			}
		}

		/**
		 * 外注製造指図登録サービス.打切取消（入荷予定）
		 */
		protected void callOutSrcInstUpd04(MCList<ArrSchd_DtlR> l) {
			if (l.isEmpty()) return ;
			MSBCL_OutSrcInstService.OutSrcInst_Upd04 o = MSBCL_OutSrcInstService.crtOutSrcInst_Upd04();
			setAll(o.up0(), l, createMap_OutSrcInst_Upd04_ArrAbortR_ArrSchd_DtlR());
			o.exec();
		}
		protected Map_OutSrcInst_Upd04_ArrAbortR_ArrSchd_DtlR<OutSrcInst_Upd04_ArrAbortR,ArrSchd_DtlR> createMap_OutSrcInst_Upd04_ArrAbortR_ArrSchd_DtlR() {
			return new Map_OutSrcInst_Upd04_ArrAbortR_ArrSchd_DtlR<OutSrcInst_Upd04_ArrAbortR, ArrSchd_DtlR>();
		}
		public class Map_OutSrcInst_Upd04_ArrAbortR_ArrSchd_DtlR<D extends OutSrcInst_Upd04_ArrAbortR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(OutSrcInst_Upd04_ArrAbortR.$mfg_inst_no, ArrSchd_DtlR.$mfg_inst_no);
			}
		}
		
		/**
		 * 入荷進捗登録
		 */
		protected void updArrPr() {
			MCList<MST_ARR_PR_R>
				insL = MCList.create(MST_ARR_PR_R.class),
				updL = MCList.create(MST_ARR_PR_R.class),
				abtL = MCList.create(MST_ARR_PR_R.class),
				delL = MCList.create(MST_ARR_PR_R.class);

			doSeqCache(MSC_NUM_SYS_TYP.ARRPRNO
					, up0().subList(ArrPr_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value()).size());
			
			for(ArrPr_DtlR r : up0()) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					delL.add(r.arr_pr());
					continue;
				}
				// 数量情報は後で更新するため、初期値を設定
				r.arr_pr().arr_schd_abort_qty(0);
				r.arr_pr().arr_qty(0);
				r.arr_pr().purc_schd_abort_qty(0);
				r.arr_pr().purc_qty(0);
				r.arr_pr().accpt_dfct_qty(0);
				r.arr_pr().sls_ret_schd_abort_qty(0);
				r.arr_pr().sls_ret_qty(0);
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					// 発番
					r.arr_pr_no(getArrPrNo());
					
					insL.add(r.arr_pr());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					MST_ARR_PR_R apR = getArrPrR(r.arr_pr_no());
					if (r.abort_flg() || (!r.abort_flg() && apR != null && apR.abort_flg())) {
						abtL.add(r.arr_pr());
					}
					else {
						updL.add(r.arr_pr());
					}
				}
			}
			if (!delL.isEmpty()) {
				dbDeleteKey("MSBEL5900_MST_ARR_PR_D01", delL, MCQueryApiBuilder.create(MST_ARR_PR_R.create("T")));
			}
			if (!insL.isEmpty()) {
				dbInsert("MSBEL5900_MST_ARR_PR_I01", insL, MCQueryApiBuilder.create(MST_ARR_PR_R.create("T")));
			}
			if (!updL.isEmpty()) {
				dbUpdateKey("MSBEL5900_MST_ARR_PR_U01", updL, MCQueryApiBuilder.create(MST_ARR_PR_R.create("T")));
			}
			if (!abtL.isEmpty()) {
				MST_ARR_PR_R abtL_t = MST_ARR_PR_R.create("T");
				MCQueryApiBuilder abtL_bldr = MCQueryApiBuilder.create(abtL_t);
				abtL_bldr.setSet(
						abtL_t.abort_flg,
						abtL_t.arr_schd_abort_qty,
						abtL_t.purc_schd_abort_qty,
						abtL_t.sls_ret_schd_abort_qty,
						abtL_t.arr_cmpl_flg,
						abtL_t.purc_cmpl_flg,
						abtL_t.sls_ret_cmpl_flg);
				dbUpdateKey("MSBEL590_MST_ARR_PR_U02", abtL, abtL_bldr);
			}

			// キャッシュを取り直す
			initArrPrCache(up0());
		}
		
		/**
		 * 入荷進捗の数量などを入荷予定を元に更新
		 */
		protected void updArrPrQty() {
			MCList<MST_ARR_PR_R> prL = MCList.create(MST_ARR_PR_R.class);
			MCQueryApiBuilder prL_bldr = MCQueryApiBuilder.create(MST_ARR_PR_R.create("T"));

			for(ArrPr_DtlR r : up0()) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				prL.add(r.arr_pr());
			}
			setArrPr(prL);
			if (!prL.isEmpty()) {
				dbUpdateKey("MSBEL5900_MST_ARR_PR_U02", prL, prL_bldr);
			}

			// キャッシュを取り直す
			initArrPrCache(up0());
		}

		protected String getArrPrNo() {
			return getStrSeq(MSC_NUM_SYS_TYP.ARRPRNO);
		}

		/**
		 * 入荷進捗更新
		 */
		protected void updArrPr2() {
			MCList<MST_ARR_PR_R>
				updL = MCList.create(MST_ARR_PR_R.class);

			for(ArrPr_DtlR r : up0()) {
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					updL.add(r.arr_pr());
				}
			}

			// KPI関連項目を更新
			updArrPrForKPI(updL);
		}

		/**
		 * 入荷予定登録
		 */
		protected void updArrSchd() {
			MCList<MST_ARR_SCHD_R>
				insL = MCList.create(MST_ARR_SCHD_R.class),
				updL = MCList.create(MST_ARR_SCHD_R.class),
				abtL = MCList.create(MST_ARR_SCHD_R.class),
				delL = MCList.create(MST_ARR_SCHD_R.class);

			MCIndexKey idx0 = up0().createIndex(ArrSchd_DtlR.$peg_no);
			
			doSeqCache(MSC_NUM_SYS_TYP.ARRSCHD
					, up1().subList(ArrPr_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value()).size());
				
			for(ArrSchd_DtlR r : up1()) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					delL.add(r.arr_schd());
				}
				else if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					ArrPr_DtlR up0R = up0().getFirst(idx0, r.peg_no());
					if (up0R != null) {
						r.arr_pr_no(up0R.arr_pr_no());
					}
					// 発番
					r.arr_schd_no(getArrSchdNo());
					insL.add(r.arr_schd());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
					
					if (r.abort_flg() || (!r.abort_flg() && asR != null && asR.abort_flg())
							|| r.sls_ret_schd_abort_flg() || (!r.sls_ret_schd_abort_flg() && asR != null && asR.sls_ret_schd_abort_flg())) {
						abtL.add(r.arr_schd());
					}
					else {
						updL.add(r.arr_schd());
					}
				}
			}
			if (!delL.isEmpty()) {
				dbDeleteKey("MSBEL5900_MST_ARR_SCHD_D01", delL, MCQueryApiBuilder.create(MST_ARR_SCHD_R.create("T")));
			}
			if (!insL.isEmpty()) {
				dbInsert("MSBEL5900_MST_ARR_SCHD_I01", insL, MCQueryApiBuilder.create(MST_ARR_SCHD_R.create("T")));
			}
			if (!updL.isEmpty()) {
				dbUpdateKey("MSBEL5900_MST_ARR_SCHD_U01", updL, MCQueryApiBuilder.create(MST_ARR_SCHD_R.create("T")));
			}
			if (!abtL.isEmpty()) {
				MST_ARR_SCHD_R abtL_t = MST_ARR_SCHD_R.create("T");
				MCQueryApiBuilder abtL_bldr = MCQueryApiBuilder.create(abtL_t);
				abtL_bldr.setSet(
						abtL_t.abort_qty,
						abtL_t.abort_flg,
						abtL_t.cmpl_flg,
						abtL_t.sls_ret_schd_abort_qty,
						abtL_t.sls_ret_schd_abort_flg,
						abtL_t.sls_ret_schd_cmpl_flg,
						abtL_t.wms_flg);
				// 受領インボイス登録サービスからの呼出しの場合、呼出元で数量計算されているため項目追加
				if (!up1().isEmpty() && up1().get(0).is_src_rcptivreg_srv_flg()) {
					abtL_bldr.addSet(abtL_t.trd_unit_qty);
					abtL_bldr.addSet(abtL_t.base_unit_qty);
				}
				dbUpdateKey("MSBEL5900_MST_ARR_SCHD_U02", abtL, abtL_bldr);
			}

			// キャッシュを取り直す
			initArrSchdCache(up1());

			// 検査予定サービス.検査着手・終了予定日取得（up1、仕入・経費購買のみ）
			callInspSchdSrch03(_inspL);
		}

		protected String getArrSchdNo() {
			return getStrSeq(MSC_NUM_SYS_TYP.ARRSCHD);
		}

		
		/**
		 * 受払予定サービス呼び出し
		 */
		protected void callIoSchd() {
			MCList<ArrSchd_DtlR>
					del01L = MCList.create(ArrSchd_DtlR.class),
					Ins01SlsL = MCList.create(ArrSchd_DtlR.class),// 売上返品
					Ins01ShipRetKL = MCList.create(ArrSchd_DtlR.class),// 出荷返品（貸出返品）
					Ins01ShipRetOL = MCList.create(ArrSchd_DtlR.class),// 出荷返品（乙仲返品）
					Ins01ShipL = MCList.create(ArrSchd_DtlR.class),// 移動・移送、支給関連（出荷済）
					Ins01ExL = MCList.create(ArrSchd_DtlR.class),// 移動・移送、支給関連（輸出済）
					Ins01OthL = MCList.create(ArrSchd_DtlR.class);// その他

			for (ArrSchd_DtlR r : up1()) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					// 事前に削除済み
					continue;
				}
				else if (r.abort_flg() || r.sls_ret_schd_abort_flg()) {
					del01L.add(r);
				}
				else {
					if (!r.getBoolean(IS_NOT_STK_COL) && !r.cmpl_flg()) {
						if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())) {
							Ins01SlsL.add(r);
						}
						else if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
							ArrPr_DtlR up0R = up0().getFirst(_idx0, r.peg_no());
							if (up0R == null || isNull(up0R.ret_dlv_slip_d_no())) {
								Ins01ShipRetKL.add(r);
							}
							else {
								r.addStringColumn("ret_dlv_slip_d_no", up0R.ret_dlv_slip_d_no());
								Ins01ShipRetOL.add(r);
							}
						}
						else if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
								|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
								|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
								|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
							
							MST_ARR_PR_R apR = getArrPrR(r.arr_pr_no());

							// 輸出後
							if (!isNull(apR.iv_d_no())) {
								Ins01ExL.add(r);
							}
							// 出荷後
							else {
								Ins01ShipL.add(r);
							}
						}
						else {
							Ins01OthL.add(r);
						}
					}
				}
			}
			
			callIoSchdDel01(del01L);
			callIoSchdIns01(Ins01SlsL, Ins01ShipRetKL, Ins01ShipRetOL, Ins01ShipL, Ins01ExL, Ins01OthL);
		}
		protected void callIoSchdForDel() {
			MCList<ArrSchd_DtlR>
					del01L = MCList.create(ArrSchd_DtlR.class);

			// 更新、または削除分をキャッシュから削除される前に実行する
			for (ArrSchd_DtlR r : up1()) {
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					del01L.add(r);
				}
			}

			callIoSchdDel01(del01L);
		}

		/**
		 * 支給予定サービス呼び出し
		 */
		protected void callProvSchd() {
			callProvSchdUpd01();
		}
		/**
		 * 支給予定サービス.登録
		 */
		protected void callProvSchdUpd01() {
			MCList<ArrSchd_DtlR>
				bindL = MCList.create(ArrSchd_DtlR.class),
				provL = MCList.create(ArrSchd_DtlR.class);

			// 支給の納品伝票のデータを取得
			up1().forEach(r -> {
				if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
					MST_ARR_PR_R apR = getArrPrR(r.arr_pr_no());
					r.dlv_slip_d_no(apR.dlv_slip_d_no());
					bindL.add(r);
				}
			});
			_dlvSlipDL = getDlvSlipDL(bindL);
			_dlvSlipDKey = _dlvSlipDL.createIndex(MST_DLV_SLIP_D_R.$dlv_slip_d_no);

			// 支給予定のデータを取得
			MCList<MST_PROV_SCHD_R>
				orgProvL = getProvSchdL(up1().subList(r -> MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())));
			MCIndexKey idx = orgProvL.createIndex(MST_PROV_SCHD_R.$prov_src_schd_no2);

			for (ArrSchd_DtlR r : up1()) {
				MAM_LOC_R locR = getLocR(r.arr_loc_cd());

				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					MST_PROV_SCHD_R provR = orgProvL.getFirst(idx, r.arr_schd_no());
					if (!isNull(provR)) {
						provL.add(r);
					}
				}
				// 打切は対象外
				else if (r.abort_flg()) {
					continue;
				}
				// 支給
				else if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
					MST_ARR_PR_R apR = getArrPrR(r.arr_pr_no());
					MST_DLV_SLIP_D_R dlvSlipDR = _dlvSlipDL.getFirst(_dlvSlipDKey, apR.dlv_slip_d_no());
					MAM_LOC_R frLocR = getLocR(dlvSlipDR.getString("ship_loc_cd"));

					// 着荷登録要、使用基準以外、かつ同一発注先でない
					if (!MAC_PROV_RCV_TYP.isNOT_ARR(locR.getString("prov_rcv_typ"))
						&& !MAC_PROV_BASIS_TYP.isINPT(dlvSlipDR.prov_basis_typ())
						&& !isSame(locR.sppl_cd(), frLocR.sppl_cd())) {
						provL.add(r);
					}
				}
				// 直送支給
				else if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
					if (!isNull(locR.sppl_cd())) {
						locR = getLocR(r.getString(ORG_LOC_CD));
						if (isNull(locR.sppl_cd())) {
							// 新規、または社内⇒社外に変更された
							ArrSchd_DtlR rr = r.clone();
							rr.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
							provL.add(rr);
						}
						else {
							provL.add(r);
						}
					}
					else {
						locR = getLocR(r.getString(ORG_LOC_CD));
						// 入荷場所が社外⇒社内に変更された場合
						if (!isNull(locR.sppl_cd())) {
							// 変更前の支給予定は削除する
							ArrSchd_DtlR rr = r.clone();
							rr.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							provL.add(rr);
						}
					}
				}
			}
			if (provL.isEmpty())	return;

			MSBEL_ProvSchdService.ProvSchd_Upd01 o = MSBEL_ProvSchdService.crtProvSchd_Upd01();
			setAll(o.up0(), provL, createMap_ProvSchd_DtlR_ArrSchd_DtlR());
			o.exec();
			// キャッシュを取り直す（支給予定の更新を反映する）
			initArrSchdCache(up1());
		}
		protected Map_ProvSchd_DtlR_ArrSchd_DtlR<ProvSchd_DtlR,ArrSchd_DtlR> createMap_ProvSchd_DtlR_ArrSchd_DtlR() {
			return new Map_ProvSchd_DtlR_ArrSchd_DtlR<ProvSchd_DtlR, ArrSchd_DtlR>();
		}
		public class Map_ProvSchd_DtlR_ArrSchd_DtlR<D extends ProvSchd_DtlR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ProvSchd_DtlR.$peg_no, ArrSchd_DtlR.$peg_d_no);
				addColumnPathMap(ProvSchd_DtlR.$data_crud_typ, ArrSchd_DtlR.$data_crud_typ);
				addColumnPathMap(ProvSchd_DtlR.$prov_src_schd_no2, ArrSchd_DtlR.$arr_schd_no);
				addColumnPathMap(ProvSchd_DtlR.$trd_ptn_typ, ArrSchd_DtlR.$trd_ptn_typ);
				addColumnPathMap(ProvSchd_DtlR.$itm_cd, ArrSchd_DtlR.$itm_cd);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub1, ArrSchd_DtlR.$itm_sub1);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub2, ArrSchd_DtlR.$itm_sub2);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub3, ArrSchd_DtlR.$itm_sub3);
				addColumnPathMap(ProvSchd_DtlR.$stk_id_typ, ArrSchd_DtlR.$stk_id_typ);
				addColumnPathMap(ProvSchd_DtlR.$base_unit_cd, ArrSchd_DtlR.$base_unit_cd);
				addColumnPathMap(ProvSchd_DtlR.$base_unit_qty, ArrSchd_DtlR.$base_unit_qty);
				addColumnPathMap(ProvSchd_DtlR.$wg_cd, ArrSchd_DtlR.$wg_cd);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				MST_ARR_PR_R apR = getArrPrR(src.arr_pr_no());
				MAM_LOC_R locR = getLocR(src.arr_loc_cd());

				dest.prov_schd_no(null);
				dest.prov_src_schd_no1(null);
				dest.trd_cd(apR.trd_cd());
				dest.prov_basis_typ(null);
				dest.xrate_inpt_flg(false);
				dest.ptax_xrate_inpt_flg(false);
				dest.tax_fix_flg(false);
				dest.prsppl_cd(locR.sppl_cd());

				dest.accpt_schd_dt(src.arr_schd_tm());
				if (!isNull(src.accpt_schd_dt())) {
					if (src.accpt_schd_dt().gt(src.arr_schd_tm())) {
						dest.accpt_schd_dt(src.accpt_schd_dt());
					}
				}
				if (!isNull(dest.accpt_schd_dt())) {
					dest.accpt_schd_dt(dest.accpt_schd_dt().trunc(MCDateFieldType.DAY));
				}
	
				if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
					dest.prov_src_schd_typ(MSC_PROV_SRC_SCHD_TYP.SHIP.value());

					MST_DLV_SLIP_D_R dlvSlipDR = _dlvSlipDL.getFirst(_dlvSlipDKey, apR.dlv_slip_d_no());
					if (dlvSlipDR != null) {
						dest.prov_typ(dlvSlipDR.prov_typ());
						dest.prov_basis_typ(dlvSlipDR.prov_basis_typ());
						dest.xfr_rsn_cd(dlvSlipDR.rsn_cd());
						dest.xrate(dlvSlipDR.getNumber("xrate"));
						dest.ptax_xrate(dlvSlipDR.getNumber("ptax_xrate"));
						if (isNull(dlvSlipDR.getString("iv_no"))) {
							dest.xrate_inpt_flg(dlvSlipDR.getBoolean("ps_xrate_inpt_flg"));
							dest.ptax_xrate_inpt_flg(dlvSlipDR.getBoolean("ps_ptax_xrate_inpt_flg"));
							dest.tax_fix_flg(dlvSlipDR.getBoolean("ps_tax_fix_flg"));
						}
						else {
							dest.xrate_inpt_flg(dlvSlipDR.getBoolean("xrate_inpt_flg"));
							dest.ptax_xrate_inpt_flg(dlvSlipDR.getBoolean("ptax_xrate_inpt_flg"));
						}
						dest.trd_cur_cd(dlvSlipDR.getString("trd_cur_cd"));
						dest.tax_cd(dlvSlipDR.tax_cd());
						dest.trd_cur_upri(dlvSlipDR.trd_cur_upri());
						dest.wtax_rate(dlvSlipDR.wtax_rate());
						dest.wtax_amt(dlvSlipDR.wtax_amt());
					}
					MST_IV_D_R idR = getIvDR(apR.iv_d_no());
					if (!isNull(idR) && !isNull(idR.iv_d_no())) {
						dest.xrate(idR.getNumber("xrate"));
						dest.xrate_inpt_flg(idR.getBoolean("xrate_inpt_flg"));
						dest.ptax_xrate(idR.getNumber("ptax_xrate"));
						dest.ptax_xrate_inpt_flg(idR.getBoolean("ptax_xrate_inpt_flg"));
					}
				}
				else {
					dest.prov_src_schd_typ(MSC_PROV_SRC_SCHD_TYP.DDLV.value());
					dest.trd_cd(null);
					dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV.value());
					if (!isNull(src.accpt_schd_dt()) && src.accpt_schd_dt().gtDate(src.arr_schd_tm())) {
						dest.accpt_schd_dt(src.accpt_schd_dt());
					}
				}
				dest.intr_rmrks(null);
				dest.sub_char1(null);
				dest.sub_char2(null);
				dest.sub_char3(null);
				if (!dest.xrate_inpt_flg()) {
					dest.xrate(null);
				}
				if (!dest.ptax_xrate_inpt_flg()) {
					dest.ptax_xrate(null);
				}
				if (!dest.tax_fix_flg()) {
					dest.tax_cd(null);
				}
			}
		}
		
		MCList<MST_DLV_SLIP_D_R> _dlvSlipDL;
		MCIndexKey _dlvSlipDKey;

		/**
		 * 検査予定サービス呼び出し
		 */
		protected void callInspSchd() {
			callInspSchdUpd01(_inspL);
		}
		/**
		 * 検査予定サービス.検査関連データ登録
		 */
		protected void callInspSchdUpd01(MCList<ArrSchd_DtlR> l) {
			if (l.isEmpty()) return ;
			MSBFL_InspSchdService.InspSchd_Upd01 o = MSBFL_InspSchdService.crtInspSchd_Upd01();
			setAll(o.up0(), l, createMap_InspSchd_Upd01_CndR_ArrSchd_DtlR());
			o.exec();
		}
		protected Map_InspSchd_Upd01_CndR_ArrSchd_DtlR<InspSchd_Upd01_CndR,ArrSchd_DtlR> createMap_InspSchd_Upd01_CndR_ArrSchd_DtlR() {
			return new Map_InspSchd_Upd01_CndR_ArrSchd_DtlR<InspSchd_Upd01_CndR, ArrSchd_DtlR>();
		}
		public class Map_InspSchd_Upd01_CndR_ArrSchd_DtlR<D extends InspSchd_Upd01_CndR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Upd01_CndR.$data_crud_typ, ArrSchd_DtlR.$data_crud_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$src_no3, ArrSchd_DtlR.$arr_schd_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_cd, ArrSchd_DtlR.$itm_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_sub1, ArrSchd_DtlR.$itm_sub1);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_sub2, ArrSchd_DtlR.$itm_sub2);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_sub3, ArrSchd_DtlR.$itm_sub3);
				addColumnPathMap(InspSchd_Upd01_CndR.$loc_cd, ArrSchd_DtlR.$arr_loc_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$str_ln_cd, ArrSchd_DtlR.$str_ln_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$quality_typ, ArrSchd_DtlR.$quality_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$stk_insp_typ, ArrSchd_DtlR.$stk_insp_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$stk_id_typ, ArrSchd_DtlR.$stk_id_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$bp_cd, ArrSchd_DtlR.$stk_bp_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$gd_cd, ArrSchd_DtlR.$gd_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$lot_no, ArrSchd_DtlR.$lot_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$sublot_no, ArrSchd_DtlR.$sublot_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno1, ArrSchd_DtlR.$sno1);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno2, ArrSchd_DtlR.$sno2);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno3, ArrSchd_DtlR.$sno3);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno4, ArrSchd_DtlR.$sno4);
				addColumnPathMap(InspSchd_Upd01_CndR.$maker_cd, ArrSchd_DtlR.$maker_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$bp_lot_no, ArrSchd_DtlR.$bp_lot_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$gr_tm, ArrSchd_DtlR.$arr_schd_tm);
				addColumnPathMap(InspSchd_Upd01_CndR.$ver_no, ArrSchd_DtlR.$ver_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				if (src.cmpl_flg()) {
					// 全数打ち切り、または入荷済 -> 未入荷分の検査予定を削除
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}

				ArrPr_DtlR uo0R = up0().getFirst(_idx0, src.peg_no());
				dest.src_no1(uo0R.po_d_no());
				dest.sppl_cd(uo0R.sppl_cd());
				dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
				dest.asst_typ(src.getString(ASST_TYP_COL));

				dest.base_unit_qty(src.base_unit_qty().subtract(src.arr_qty()));
				dest.base_unit_cd(src.base_unit_cd());

				MAVM_ITM_UNIT_R itmUnitR = getItmUnitR(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3(), src.trd_unit_cd());
				if (itmUnitR != null && itmUnitR.pack_flg()) {
					MCNumber qty = getTrdUnitQty(dest.base_unit_qty(), src.base_unit_cd(), itmUnitR);
					if (isNull(qty)) {
						dest.pack_unit_qty(dest.base_unit_qty());
						dest.pack_unit_cd(src.base_unit_cd());
					}
					else {
						dest.pack_unit_qty(qty);
						dest.pack_unit_cd(src.trd_unit_cd());
					}
				}
				else {
					dest.pack_unit_qty(dest.base_unit_qty());
					dest.pack_unit_cd(src.base_unit_cd());
				}

				dest.mfg_loc_cd(MAC_STR.NULL_VAL.value());
				dest.not_stk_flg(src.getBoolean(IS_NOT_STK_COL));

				// 納品先ＣＤ
				MST_PO_D_R podR = getPoDR(dest.src_no1());
				if (!isNull(podR)) {
					dest.dlv_cd(podR.dlv_cd());
				}
			}
		}

		
		/**
		 * 仕入予定登録サービス呼び出し
		 */
		protected void callPurcSchd() {
			callPurcSchdUpd01(_inspL);
		}
		/**
		 * 仕入予定登録サービス.登録
		 */
		protected void callPurcSchdUpd01(MCList<ArrSchd_DtlR> l) {
			if (l.isEmpty()) return ;
			MSBDL_PurcSchdRegService.PurcSchd_Upd01 o = MSBDL_PurcSchdRegService.crtPurcSchd_Upd01();
			setAll(o.up0(), l, createMap_PurcSchd_DtlR_ArrSchd_DtlR());
			o.exec();
		}
		protected Map_PurcSchd_DtlR_ArrSchd_DtlR<PurcSchd_DtlR,ArrSchd_DtlR> createMap_PurcSchd_DtlR_ArrSchd_DtlR() {
			return new Map_PurcSchd_DtlR_ArrSchd_DtlR<PurcSchd_DtlR, ArrSchd_DtlR>();
		}
		public class Map_PurcSchd_DtlR_ArrSchd_DtlR<D extends PurcSchd_DtlR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcSchd_DtlR.$peg_no, UP1_PEG_NO_COL);
				addColumnPathMap(PurcSchd_DtlR.$data_crud_typ, ArrSchd_DtlR.$data_crud_typ);
				addColumnPathMap(PurcSchd_DtlR.$po_d_no, PO_D_NO_COL);
				addColumnPathMap(PurcSchd_DtlR.$arr_pr_no, ArrSchd_DtlR.$arr_pr_no);
				addColumnPathMap(PurcSchd_DtlR.$arr_schd_no, ArrSchd_DtlR.$arr_schd_no);
				addColumnPathMap(PurcSchd_DtlR.$purc_schd_no, ArrSchd_DtlR.$purc_schd_no);
				addColumnPathMap(PurcSchd_DtlR.$purc_schd_dt, ArrSchd_DtlR.$accpt_schd_dt);
				addColumnPathMap(PurcSchd_DtlR.$no_cred_upd_flg, ArrSchd_DtlR.$no_cred_upd_flg);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (!MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
					// 全数打ち切り
					if (asR != null && MSC_PR_STS_TYP.isNOT_ARR(asR.pr_sts_typ()) && src.abort_flg()) {
						dest.abort_flg(true);
					}
					else {
						dest.abort_flg(false);
					}
				}
				else {
					dest.abort_flg(false);
				}
				
				// VMI or 無償受給
				if (MAC_PURC_ID_TYP.isVMI(src.purc_id_typ()) || MAC_PURC_ID_TYP.isFFR_RCV(src.purc_id_typ())) {
					dest.trd_unit_schd_qty(0);
					dest.base_unit_schd_qty(0);
					dest.non_purc_flg(true);
				}
				else {
					dest.trd_unit_schd_qty(src.getNumberNE(TRD_UNIT_QTY));
					dest.base_unit_schd_qty(src.getNumberNE(BASE_UNIT_QTY));
					dest.non_purc_flg(false);
				}
				dest.trd_unit_cd(src.trd_unit_cd());
				dest.base_unit_purc_qty(0);
				dest.base_unit_accpt_dfct_qty(0);
				dest.base_unit_cd(src.base_unit_cd());
				dest.sub_char1(null);
				dest.sub_char2(null);
				dest.sub_char3(null);

			}
		}

		
		/**
		 * 市場出荷判定情報サービス呼び出し
		 */
		protected void callMrktJudg() {
			MCList<ArrSchd_DtlR> upd01L = MCList.create(ArrSchd_DtlR.class);
			
			for (ArrSchd_DtlR r : up1()) {
				ArrPr_DtlR up0 = up0().getFirst(_idx0, r.peg_no());
				MST_PO_D_R podR = getPoDR(up0.po_d_no());
				if (isNull(podR)) {
					continue;
				}

				if (!isNull(podR.dlv_cd())) {
					if (!isNull(r.lot_no())) {
						if (r.getBoolean(IS_ABORT_FLG_COL)) {
							ArrSchd_DtlR rr = r.clone();
							if (r.abort_flg()) {
								// 打切の場合は削除
								rr.lot_no(null);
								upd01L.add(rr);
							}
							else {
								// 打切解除の場合は新規
								rr.setString(ORG_LOT_NO, null);
								upd01L.add(rr);
							}
						}
						else {
							upd01L.add(r);
						}
					}
					else if (!isNull(r.getString(ORG_LOT_NO))) {
						// ロットがクリアされた場合も削除
						upd01L.add(r);
					}
				}
			}

			callMrktJudgUpd01(upd01L);
		}

		/**
		 * 受注状況更新サービス呼び出し
		 */
		protected void callSloSts() {
			// 入荷進捗による打切・打切解除は対象外
			callSloStsUpd01(up1().subList(IS_PR_ABORT_FLG, false));
		}

		/**
		 * オーダ登録サービス呼び出し
		 */
		protected void callOrdReg() {
			MCList<MST_ARR_PR_R> inL = MCList.create(MST_ARR_PR_R.class);
			MCList<MST_ARR_PR_R> outL = MCList.create(MST_ARR_PR_R.class);
			for (ArrPr_DtlR r : up0()) {
				if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
					if (!isNull(r.po_d_no())) {
						if (up1().getFirst(_idx1, r.peg_no()).outsrc_flg()) {
							outL.add(r.arr_pr());
						}
						else {
							inL.add(r.arr_pr());
						}
					}
				}
			}
			MSBCL_OrdRegService.Ord_Upd04 o = MSBCL_OrdRegService.crtOrd_Upd04();
			o.up0().addAll(getOrdUpd04Up0(inL, MSC_ITM_ORD_TYP.PURC.value()));
			o.up0().addAll(getOrdUpd04Up0(outL, MSC_ITM_ORD_TYP.OUTSRC.value()));
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}

		/**
		 * ＷＧ間依頼サービス呼び出し
		 */
		protected void callWgRqst() {
			MCList<MST_ARR_PR_R> bindPoL = MCList.create(MST_ARR_PR_R.class);
			MCList<MST_ARR_PR_R> bindXfrL = MCList.create(MST_ARR_PR_R.class);
			for (ArrPr_DtlR r : up0()) {
				if (!isNull(r.po_d_no())) {
					bindPoL.add(r.arr_pr());
				}
				if (!isNull(r.dlv_slip_d_no())) {
					bindXfrL.add(r.arr_pr());
				}
			}
			MSBAL_WgRqstService.WgRqst_Upd03 o = MSBAL_WgRqstService.crtWgRqst_Upd03();
			o.up0().addAll(getWgRqstUpd03Up0(bindPoL, bindXfrL));
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		/**
		 * 入荷予定送信ＩＦサービス呼び出し
		 */
		protected void  callArrSchdSendIf(boolean sendDel) {
			MCList<ArrSchd_DtlR> l = createArrSchd_DtlL();
			if (sendDel) {
				MCList<ArrSchd_DtlR> chgL = createArrSchd_DtlL();
				for (ArrSchd_DtlR r : up1()) {
					if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						l.add(r);
					}
					else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
						MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
						// 前回送信時から入荷場所が異なっている場合、送信対象の候補とする
						if (asR.wms_flg()
							 && !isSame(r.arr_loc_cd(), asR.arr_loc_cd())) {
							ArrSchd_DtlR chgR = r.clone();
							chgR.arr_loc_cd(asR.arr_loc_cd());
							chgL.add(chgR);
						}
					}
				}
				if (!chgL.isEmpty()) {
					// SCM IF制御マスタの読み出し
					initScmIfCtrl(chgL);

					MCIndexKey idx = up1().createIndex(ArrSchd_DtlR.$peg_d_no);
					for (ArrSchd_DtlR chgR : chgL) {
						ArrSchd_DtlR upR = up1().getFirst(idx, chgR.peg_d_no());
						// 変更前の場所が送信対象であり、かつ変更前とで外部システムCDが異なる場合は
						// 変更前の外部システムCDに対して「削除」の送信IFを作成する
						if (chgR.arr_schd().wms_flg()
							&& !isSame(
									chgR.arr_schd().getStringNE("ext_sys_cd"),
									upR.arr_schd().getStringNE("ext_sys_cd"))) {
							chgR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							l.add(chgR);
						}
					}
				}
			}
			else {
				for (ArrSchd_DtlR r : up1()) {
					if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
						l.add(r);
					}
					else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
						// 更新前、後ともに打切の場合は送信しない
						if ( !(r.abort_flg() && r.getBooleanNE(ORG_ABORT_FLG)) ) {
							l.add(r);
						}
					}
				}
			}
			callArrSchdSendIfUpd01(l);
		}
		/**
		 * ロット情報サービス.ロット削除
		 */
		protected void callLotDel01() {
			MCList<ArrSchd_DtlR> l = MCList.create(ArrSchd_DtlR.class);
			for (ArrSchd_DtlR r : up1()) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					if (!isNull(r.getString(ORG_LOT_NO))) {
						l.add(r);
					}
				}
			}
			if (l.isEmpty()) return;

			MSBFL_LotService.Lot_Del01 o = MSBFL_LotService.crtLot_Del01();
			setAll(o.up0(), l, createMap_Lot_Del01_CndR_ArrSchd_DtlR());
			o.exec();
		}
		protected Map_Lot_Del01_CndR_ArrSchd_DtlR<Lot_Del01_CndR, ArrSchd_DtlR> createMap_Lot_Del01_CndR_ArrSchd_DtlR() {
			return new Map_Lot_Del01_CndR_ArrSchd_DtlR<Lot_Del01_CndR, ArrSchd_DtlR>();
		}
		public class Map_Lot_Del01_CndR_ArrSchd_DtlR<D extends Lot_Del01_CndR, S extends ArrSchd_DtlR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Del01_CndR.$itm_cd, MST_ARR_SCHD_R.$itm_cd);
				addColumnPathMap(Lot_Del01_CndR.$itm_sub1, MST_ARR_SCHD_R.$itm_sub1);
				addColumnPathMap(Lot_Del01_CndR.$itm_sub2, MST_ARR_SCHD_R.$itm_sub2);
				addColumnPathMap(Lot_Del01_CndR.$itm_sub3, MST_ARR_SCHD_R.$itm_sub3);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.lot_no(src.getString(ORG_LOT_NO));
				dest.sublot_no(src.getString(ORG_SUBLOT_NO));
			}
		}

	}



	/**
	 * ArrSchd_Upd02オペレーション.<p>
	 *
	 * 更新（予定・実績）を行います。<br>
	 */
	public class ArrSchd_Upd02 extends MSBEL_ArrSchdService_MC_A.ArrSchd_Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			doCache();
			editUp();
			updArrSchd();
			updArrPr();
			callProvSchd();
			callLotDel01();
			callLotUpd01();
			callIoSchdDel();
			callIoSchd();
			callInspSchd();
			callMrktJudg();
			callSloSts();
			callOrdReg();
			callWgRqst();
			callArrSchdSendIf();
			setDown();
		}

		protected void doCache() {
			MCList<MST_ARR_SCHD_R> ivDBindL = MCList.create(MST_ARR_SCHD_R.class);
			ivDBindL.addStringColumn("iv_d_no");
			for(ArrSchd_DtlR r : up0()) {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				r.itm_cd(asR.itm_cd());
				r.itm_sub1(asR.itm_sub1());
				r.itm_sub2(asR.itm_sub2());
				r.itm_sub3(asR.itm_sub3());
				if (!isNull(asR.getString("iv_d_no"))) {
					ivDBindL.add(asR);
				}
			}
			initItmCache(up0());
			initIvDCache(ivDBindL);
			initLocCache(up0());
		}

		protected void setDown() {
			MCList<ArrSchd_DtlR> downL = up0().createInstance();
			up0().forEach(r -> {
				if (!r.is_src_outsrc_srv_flg() && !r.is_src_arract_srv_flg()) {
					if (!isSame(r.lot_no(), r.getString(ORG_LOT_NO))
						|| !isSame(r.sublot_no(), r.getString(ORG_SUBLOT_NO))) {
						downL.add(r);
					}
				}
			});
			down0().setAll(downL);
		}

		protected void editUp() {
			setPegNo(up0());

			// 打切り＆打切り解除判定用一時カラム
			up0().addBooleanColumn(IS_ABORT_FLG_COL);

			// 変更前入荷数量
			up0().addNumberColumn(ORG_ARR_QTY);

			// 入荷実績取得（入荷数量取得用）
			MCList<MST_ARR_ACT_R> arrActL = getArrActGroupBy(up0());
			MCIndexKey arrActKey = arrActL.createIndex(MST_ARR_ACT_R.$arr_schd_no);

			// Chk02で発番・キャッシュしたロットＮＯ取得
			MCList<ArrSchd_DtlR> lotL = getLotCache();
			MCIndexKey lotKey = lotL.createIndex(ArrSchd_DtlR.$arr_schd_no);
			MCList<ArrSchd_DtlR> sublotL = getSublotCache();
			MCIndexKey sublotKey = sublotL.createIndex(ArrSchd_DtlR.$arr_schd_no);

			MCList<MST_ARR_SCHD_R> errArrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			for (ArrSchd_DtlR r : up0()) {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				
				r.addStringColumn("sppl_cd", asR.getString("sppl_cd"));
				r.addStringColumn(ORG_LOT_NO, asR.lot_no());
				r.addStringColumn(ORG_SUBLOT_NO, asR.sublot_no());

				MST_ARR_PR_R apR = getArrPrR(asR.arr_pr_no());
				r.trd_ptn_typ(apR.trd_ptn_typ());

				if ((r.abort_flg() && !asR.abort_flg()) || (!r.abort_flg() && asR.abort_flg())) {
					r.setBoolean(IS_ABORT_FLG_COL, true);

					// 打切・打切解除では予定のロットを引き継ぐ
					r.lot_no(asR.lot_no());
					r.sublot_no(asR.sublot_no());
				}
				else {
					if (!r.is_src_outsrc_srv_flg() && !r.is_src_arract_srv_flg()) {
						if (r.crt_lot_flg()) {
							ArrSchd_DtlR lotR = lotL.getFirst(lotKey, r.arr_schd_no());
							if (!isNull(lotR)) {
								r.lot_no(lotR.lot_no());
							}
						}
						if (isCrtSublot(r)) {
							ArrSchd_DtlR sublotR = sublotL.getFirst(sublotKey, r.arr_schd_no());
							if (!isNull(sublotR)) {
								r.sublot_no(sublotR.sublot_no());
							}
							else {
								r.sublot_no(MAC_STR.NULL_VAL.value());
							}
						}
					}
				}
	
				r.arr_schd_tm(asR.arr_schd_tm());
				

				// 入荷数量（紐づく入荷実績の総和）
				MST_ARR_ACT_R actR = arrActL.getFirst(arrActKey, r.arr_schd_no());
				if (actR == null) {
					r.arr_qty(0);
					r.arr_schd().arr_split_flg(false);
				}
				else {
					r.arr_qty(actR.base_unit_qty());
					if (!isNull(actR.getNumber("cnt")) && actR.getNumber("cnt").intValue() > 1) {
						r.arr_schd().arr_split_flg(true);
					}
					else {
						r.arr_schd().arr_split_flg(false);
					}
				}
				// 変更前の入荷数量
				r.setNumber(ORG_ARR_QTY, asR.arr_qty());

				// 入荷進捗更新の準備
				r.arr_pr_no(asR.arr_pr_no());
				r.abort_qty(asR.abort_qty());
				if (isNull(r.arr_qty())) {
					r.arr_qty(asR.arr_qty());
				}

				if (asR.arr_qty().isPositive() && r.arr_qty().isZero() && asR.purc_qty().isZero()) {
					// 実績取消
					r.arr_ptn_typ(getDefaultArrPtnTyp(asR));
				}
				else if (isNull(r.arr_ptn_typ())) {
					r.arr_ptn_typ(asR.arr_ptn_typ());
				}

				MAM_ITM_R itmR = getItmR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				MAM_BIZ_RSN_R rsnR = getBizRsnR(apR.rsn_cd());
				r.addBooleanColumn(IS_NOT_STK_COL, isNotStk(itmR, r.trd_ptn_typ(), rsnR));

				// 入荷場所ＣＤに該当する場所が存在するかチェックする
				MAM_LOC_R locR = getLocR(asR.arr_loc_cd());
				// 場所マスタのキャッシュが取得できていない場合は空のMAM_LOC_Rが取得されるため、場所ＣＤの値がNullかどうかで識別する
				if (isNull(locR.loc_cd())) {
					// 入荷場所ＣＤに該当する場所が存在しない場合、その入荷予定情報を保持して次を処理する
					errArrSchdL.add(asR);
					continue;
				}

				// initScmIfCtrl で参照するため事前に補完する
				r.arr_loc_cd(asR.arr_loc_cd());
			}
			if (!isEmpty(errArrSchdL)) {
				if (!errArrSchdL.isEmpty()) {
					MCList<MST_ARR_SCHD_R> arrSchdDtlList = errArrSchdL.groupByNE(MST_ARR_SCHD_R.$arr_loc_cd);
					MCMessageList msgL = new MCMessageList();

					for (MST_ARR_SCHD_R r : arrSchdDtlList) {
						msgL.add(new MCMessage(r, null, MAUAL0057, r.arr_loc_cd()));
					}
					MCMessagePool.addAll(msgL);
					throwUpdErr();
				}
			}
			setPegNo(UP1_PEG_NO_COL, up0());
			initScmIfCtrl(up0());
			for (ArrSchd_DtlR r : up0()) {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				// isWms で参照するため事前に補完する
				r.arr_skip_flg(asR.arr_skip_flg());

				if (r.is_src_arract_srv_flg() || r.is_src_purcact_srv_flg()) {
					r.arr_schd().wms_flg(asR.wms_flg());
				}
				else {
					r.arr_schd().wms_flg(isWms(r));
				}
			}
		}
		
		/**
		 * ロット情報サービス.ロット削除
		 */
		protected void callLotDel01() {
			MCList<ArrSchd_DtlR> l = MCList.create(ArrSchd_DtlR.class);
			for (ArrSchd_DtlR r : up0()) {
				if (!r.is_src_outsrc_srv_flg() && !r.is_src_arract_srv_flg()) {
					if (isNull(r.getString(ORG_LOT_NO))) {
						continue;
					}
					if (!isSame(r.lot_no(), r.getString(ORG_LOT_NO))
						|| !isSame(r.sublot_no(), r.getString(ORG_SUBLOT_NO))) {
						l.add(r);
					}
				}
			}
			if (l.isEmpty()) return ;

			MSBFL_LotService.Lot_Del01 o = MSBFL_LotService.crtLot_Del01();
			setAll(o.up0(), l, createMap_Lot_Del01_CndR_ArrSchd_DtlR());
			o.exec();
		}
		protected Map_Lot_Del01_CndR_ArrSchd_DtlR<Lot_Del01_CndR,ArrSchd_DtlR> createMap_Lot_Del01_CndR_ArrSchd_DtlR() {
			return new Map_Lot_Del01_CndR_ArrSchd_DtlR<Lot_Del01_CndR, ArrSchd_DtlR>();
		}
		public class Map_Lot_Del01_CndR_ArrSchd_DtlR<D extends Lot_Del01_CndR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Del01_CndR.$itm_cd, MST_ARR_SCHD_R.$itm_cd);
				addColumnPathMap(Lot_Del01_CndR.$itm_sub1, MST_ARR_SCHD_R.$itm_sub1);
				addColumnPathMap(Lot_Del01_CndR.$itm_sub2, MST_ARR_SCHD_R.$itm_sub2);
				addColumnPathMap(Lot_Del01_CndR.$itm_sub3, MST_ARR_SCHD_R.$itm_sub3);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.lot_no(src.getString(ORG_LOT_NO));
				dest.sublot_no(src.getString(ORG_SUBLOT_NO));
				if (isNull(dest.sublot_no())) {
					dest.sublot_no(MAC_STR.NULL_VAL.value());
				}
			}
		}

		/**
		 * ロット情報サービス.ロット追加・更新
		 */
		protected void callLotUpd01() {
			MCList<ArrSchd_DtlR> l = MCList.create(ArrSchd_DtlR.class);
			for (ArrSchd_DtlR r : up0()) {
				if (!r.is_src_outsrc_srv_flg() && !r.is_src_arract_srv_flg()) {
					if (!isNull(r.lot_no())) {
						l.add(r);
					}
				}
			}
			if (l.isEmpty()) return ;

			MSBFL_LotService.Lot_Upd01 o = MSBFL_LotService.crtLot_Upd01();
			setAll(o.up0(), l, createMap_Lot_Upd01_CndR_ArrSchd_DtlR());
			o.exec();
		}
		protected Map_Lot_Upd01_CndR_ArrSchd_DtlR<Lot_Upd01_CndR,ArrSchd_DtlR> createMap_Lot_Upd01_CndR_ArrSchd_DtlR() {
			return new Map_Lot_Upd01_CndR_ArrSchd_DtlR<Lot_Upd01_CndR, ArrSchd_DtlR>();
		}
		public class Map_Lot_Upd01_CndR_ArrSchd_DtlR<D extends Lot_Upd01_CndR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Upd01_CndR.$itm_cd, ArrSchd_DtlR.$itm_cd);
				addColumnPathMap(Lot_Upd01_CndR.$itm_sub1, ArrSchd_DtlR.$itm_sub1);
				addColumnPathMap(Lot_Upd01_CndR.$itm_sub2, ArrSchd_DtlR.$itm_sub2);
				addColumnPathMap(Lot_Upd01_CndR.$itm_sub3, ArrSchd_DtlR.$itm_sub3);
				addColumnPathMap(Lot_Upd01_CndR.$lot_no, ArrSchd_DtlR.$lot_no);
				addColumnPathMap(Lot_Upd01_CndR.$sublot_no, ArrSchd_DtlR.$sublot_no);
				addColumnPathMap(Lot_Upd01_CndR.$arr_pr_no, ArrSchd_DtlR.$arr_pr_no);
				addColumnPathMap(Lot_Upd01_CndR.$maker_cd, ArrSchd_DtlR.$maker_cd);
				addColumnPathMap(Lot_Upd01_CndR.$loc_cd, ArrSchd_DtlR.$arr_loc_cd);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.base_dt(src.arr_schd_tm().trunc(MCDateFieldType.DAY));
				dest.schd_flg(true);
				if (isNull(dest.sublot_no())) {
					dest.sublot_no(MAC_STR.NULL_VAL.value());
				}
			}
		}

		/**
		 * 入荷進捗更新
		 */
		protected void updArrPr() {
			MCList<MST_ARR_PR_R> updL = MCList.create(MST_ARR_PR_R.class);
			
			for (MCList<ArrSchd_DtlR> l : up0().groupList(ArrSchd_DtlR.$arr_pr_no)) {
				MST_ARR_PR_R dbc = MST_ARR_PR_R.create();
				dbc.arr_pr_no(l.get(0).arr_pr_no());
				dbc.setBooleanNE("rem_abort_flg", l.get(0).rem_abort_flg());
				updL.add(dbc);
			}
			setArrPr(updL);

			if (!updL.isEmpty()) {
				MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				updL_bldr.setSet(
						t.arr_schd_tm,
						t.arr_tm,
						t.arr_qty,
						t.arr_schd_abort_qty,
						t.sls_ret_schd_abort_qty,
						t.std_purc_lt,
						t.act_purc_lt,
						t.abort_flg,
						t.arr_cmpl_flg);
				dbUpdateKey("MSBEL5900_MST_ARR_PR_U03", updL, updL_bldr);
			}

			// KPI関連項目を更新
			updArrPrForKPI(updL);

			// キャッシュを取り直す
			initArrPrCacheFromArrSchd(up0());
		}

		/**
		 * 入荷実績のデータを取得します。<br>
		 * （入荷予定ＮＯが一致するもの）
		 * @param bindL 「arr_schd_no」に入荷予定ＮＯを格納したリスト
		 * @return 入荷実績のデータ
		 */
		protected MCList<MST_ARR_ACT_R> getArrActGroupBy(MCList<ArrSchd_DtlR> bindL) {
			MCList<MST_ARR_ACT_R> dbc = MCList.create(MST_ARR_ACT_R.class);
			MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc.addNumberColumn("cnt");
			dbc_bldr.setGroupBy(t.arr_schd_no);
			dbc_bldr.addMax(t.arr_tm, "arr_tm");
			dbc_bldr.addSum(t.base_unit_qty, "base_unit_qty");
			dbc_bldr.addGroupFunc(count(t.arr_act_no), "cnt");
			dbc_bldr.setWhere(t.arr_schd_no.eq(bind("arr_schd_no")));
			dbc_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBEL5900_MST_ARR_ACT_S01", dbc, dbc_bldr, bindL);
			return dbc;
		}

		/**
		 * 入荷予定更新
		 */
		protected void updArrSchd() {
			MCList<MST_ARR_SCHD_R> updL = MCList.create(MST_ARR_SCHD_R.class);
			boolean bpLotUpdFlg = up0().get(0).bp_lot_upd_flg();

			for(ArrSchd_DtlR r : up0()) {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());

				MST_ARR_SCHD_R dbc = MST_ARR_SCHD_R.create();
				dbc.arr_schd_no(r.arr_schd_no());
				dbc.arr_ptn_typ(r.arr_ptn_typ());
				dbc.sync_flg(asR.sync_flg());
				if (MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ())) {
					dbc.sync_flg(false);
				}
				dbc.lot_no(r.lot_no());
				if (!isNull(r.sublot_no())) {
					dbc.sublot_no(r.sublot_no());
				}
				else {
					if (!isNull(r.lot_no())) {
						MAM_ITM_R itmR = getItmCache().get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
						if (itmR != null && MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
							// ロットＮＯが指定されているかつ、サブロット管理しない場合は、NULL文字を設定する
							r.sublot_no(MAC_STR.NULL_VAL.value());
							dbc.sublot_no(r.sublot_no());
						}
					}
				}
				
				// 入荷予定の数量（仕入済の未着の場合は仕入数量）
				MCNumber asQty = asR.base_unit_qty();
				if (MSC_ARR_PTN_TYP.isN_YET_ARR(r.arr_ptn_typ()) && asR.purc_qty().isPositive()) {
					asQty = asR.purc_qty();
				}
				
				dbc.arr_qty(r.arr_qty());
				dbc.arr_split_flg(r.arr_schd().arr_split_flg());
				if (r.abort_flg()){
					dbc.abort_qty(asQty.subtract(r.arr_qty()));
				}
				else {
					dbc.abort_qty(0);
				}
				dbc.abort_flg(r.abort_flg());
				if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())) {
					dbc.sls_ret_schd_abort_qty(dbc.abort_qty());
				}
				else {
					dbc.sls_ret_schd_abort_qty(0);
				}
				if (r.abort_flg() || r.arr_qty().gte(asQty)) {
					dbc.cmpl_flg(true);
				}
				else {
					dbc.cmpl_flg(false);
				}
				if (r.arr_qty().isZero()) {
					dbc.pr_sts_typ(MSC_PR_STS_TYP.NOT_ARR.value());
				}
				else if (r.arr_qty().gte(asQty)) {
					dbc.pr_sts_typ(MSC_PR_STS_TYP.ARR.value());
				}
				else {
					dbc.pr_sts_typ(MSC_PR_STS_TYP.PART_ARR.value());
				}
				dbc.mfg_inst_no(r.mfg_inst_no());
				dbc.pre_mfg_act_no(r.pre_mfg_act_no());
				dbc.wms_flg(r.arr_schd().wms_flg());
				if (bpLotUpdFlg) {
					dbc.bp_lot_no(r.bp_lot_no());
				}
				updL.add(dbc);
			}

			if (!updL.isEmpty()) {
				MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				if (bpLotUpdFlg) {
					updL_bldr.setSet(
							t.arr_ptn_typ,
							t.sync_flg,
							t.lot_no,
							t.sublot_no,
							t.arr_qty,
							t.abort_qty,
							t.abort_flg,
							t.sls_ret_schd_abort_qty,
							t.cmpl_flg,
							t.arr_split_flg,
							t.pr_sts_typ,
							t.mfg_inst_no,
							t.pre_mfg_act_no,
							t.wms_flg,
							t.bp_lot_no);
				}
				else {
					updL_bldr.setSet(
							t.arr_ptn_typ,
							t.sync_flg,
							t.lot_no,
							t.sublot_no,
							t.arr_qty,
							t.abort_qty,
							t.abort_flg,
							t.sls_ret_schd_abort_qty,
							t.cmpl_flg,
							t.arr_split_flg,
							t.pr_sts_typ,
							t.mfg_inst_no,
							t.pre_mfg_act_no,
							t.wms_flg);
				}
				dbUpdateKey("MSBEL5900_MST_ARR_SCHD_U03", updL, updL_bldr);
			}

			// キャッシュを取り直す
			initArrSchdCache(up0());
			
			setPegNo(UP1_PEG_NO_COL, up0());
			up0().addStringColumn(ASST_TYP_COL);
			up0().addStringColumn(INSP_PTN_CD_COL);
			up0().addStringColumn(DLV_SLIP_D_NO_COL);
			up0().addStringColumn(IV_D_NO_COL);

			for(ArrSchd_DtlR r : up0()) {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				r.arr_schd(asR);
				
				MST_ARR_PR_R apR = getArrPrR(r.arr_pr_no());
				r.setString(DLV_SLIP_D_NO_COL, apR.dlv_slip_d_no());
				r.setString(IV_D_NO_COL, apR.iv_d_no());
				
				// 資産区分
				if (!MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
					if (!isNull(r.arr_loc_cd())) {
						MAM_LOC_R locR = getLocR(r.arr_loc_cd());
						if (!isNull(locR) && MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())
								&& locR.getBooleanNE("repurc_obli_flg")) {
							r.setValue(ASST_TYP_COL, MAC_ASST_TYP.CO_PROD.value());
						}
						else {
							r.setValue(ASST_TYP_COL, MAC_ASST_TYP.OTH.value());
						}
					}
					else {
						r.setValue(ASST_TYP_COL, MAC_ASST_TYP.OTH.value());
					}
				}
				else {
					MAM_LOC_R locR = getLocR(r.arr_loc_cd());
					if (MAC_LOC_MNG_TYP.isSLS(locR.loc_mng_typ())) {
						r.setValue(ASST_TYP_COL, MAC_ASST_TYP.CO_SLS.value());
					}
					else if (MAC_LOC_MNG_TYP.isPRD(locR.loc_mng_typ())) {
						r.setValue(ASST_TYP_COL, MAC_ASST_TYP.CO_PROD.value());
					}
				}
			}

			MCList<ArrSchd_DtlR> _inspL = up0().subList(new TrdPtnTypMatcher(MAC_TRD_PTN_TYP.PURC, MAC_TRD_PTN_TYP.PURC_XPNS));

			// 検査予定サービス.検査着手・終了予定日取得（up1、仕入・経費購買のみ）
			callInspSchdSrch03(_inspL);

		}

		/**
		 * 受払予定サービス呼び出し
		 */
		protected void callIoSchd() {
			MCList<ArrSchd_DtlR>
					del01L = MCList.create(ArrSchd_DtlR.class),
					Ins01SlsL = MCList.create(ArrSchd_DtlR.class),// 売上返品
					Ins01ShipRetKL = MCList.create(ArrSchd_DtlR.class),// 出荷返品（貸出返品）
					Ins01ShipRetOL = MCList.create(ArrSchd_DtlR.class),// 出荷返品（乙仲返品）
					Ins01ShipL = MCList.create(ArrSchd_DtlR.class),// 移動・移送、支給関連（出荷済）
					Ins01ExL = MCList.create(ArrSchd_DtlR.class),// 移動・移送、支給関連（輸出済）
					Ins01OthL = MCList.create(ArrSchd_DtlR.class);// その他

			for (ArrSchd_DtlR r : up0()) {
				if (r.cmpl_flg()) {
					del01L.add(r);
				}
				// 売上返品は入荷完了でも、売上返品予定が未完了であれば受払予定を作成する
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				if (!r.cmpl_flg()
					|| MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ()) && !asR.sls_ret_schd_cmpl_flg()) {

					MST_ARR_PR_R apR = getArrPrR(r.arr_pr_no());
					MAM_ITM_R itmR = getItmR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
					MAM_BIZ_RSN_R rsnR = getBizRsnR(apR.rsn_cd());
					r.addBooleanColumn(IS_NOT_STK_COL, isNotStk(itmR, r.trd_ptn_typ(), rsnR));

					if (!r.getBoolean(IS_NOT_STK_COL)) {
						if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())) {
							Ins01SlsL.add(r);
						}
						else if (MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
							if (isNull(apR.ret_dlv_slip_d_no())) {
								Ins01ShipRetKL.add(r);
							}
							else {
								r.addStringColumn("ret_dlv_slip_d_no", apR.ret_dlv_slip_d_no());
								Ins01ShipRetOL.add(r);
							}
						}
						else if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
								|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
								|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
								|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {

							// 輸出後
							if (!isNull(apR.iv_d_no())) {
								Ins01ExL.add(r);
							}
							// 出荷後
							else {
								Ins01ShipL.add(r);
							}
						}
						else if (!r.is_src_arract_srv_flg()
								|| MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ())
								|| MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())) {
							Ins01OthL.add(r);
						}
					}
				}
			}
			
			callIoSchdDel01(del01L);
			callIoSchdIns01(Ins01SlsL, Ins01ShipRetKL, Ins01ShipRetOL, Ins01ShipL, Ins01ExL, Ins01OthL);
		}
		protected void callIoSchdDel() {
			MSBEL_IoSchdService.IoSchd_Del02 o = MSBEL_IoSchdService.crtIoSchd_Del02();
			for (ArrSchd_DtlR r : up0()) {
				MST_ARR_PR_R apR = getArrPrR(r.arr_pr_no());

				if (MAC_TRD_PTN_TYP.isSLS_RTN(apR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR(apR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(apR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV(apR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(apR.trd_ptn_typ())) {

					MSW_IO_SCHD_DEL_R delR = o.up0().add();
					delR.io_schd_sub_typ3(MSC_IO_SCHD_SUB_TYP.ARR_SCHD_NO.value());
					delR.io_schd_sub_no3(r.arr_schd_no());
				}
			}
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}

		/**
		 * 検査予定サービス呼び出し
		 */
		protected void callInspSchd() {
			MCList<ArrSchd_DtlR> upd01L = MCList.create(ArrSchd_DtlR.class);

			for (ArrSchd_DtlR r : up0()) {
				if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {

					if (r.is_src_arract_srv_flg()) {
						MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
						if (r.abort_flg()
							|| asR.base_unit_qty().subtract(asR.arr_qty().add(asR.abort_qty())).isPositive()
							|| nvl(r.getNumberNE(ORG_ARR_QTY), MCNumber.ZERO).isPositive()) {
							upd01L.add(r);
						}
					}
					else {
						upd01L.add(r);
					}
				}
			}

			callInspSchdUpd01(upd01L);
		}
		/**
		 * 検査予定サービス.検査関連データ登録
		 */
		protected void callInspSchdUpd01(MCList<ArrSchd_DtlR> l) {
			if (l.isEmpty()) return ;
			MSBFL_InspSchdService.InspSchd_Upd01 o = MSBFL_InspSchdService.crtInspSchd_Upd01();
			setAll(o.up0(), l, createMap_InspSchd_Upd01_CndR_ArrSchd_DtlR());
			o.exec();
		}
		protected Map_InspSchd_Upd01_CndR_ArrSchd_DtlR<InspSchd_Upd01_CndR,ArrSchd_DtlR> createMap_InspSchd_Upd01_CndR_ArrSchd_DtlR() {
			return new Map_InspSchd_Upd01_CndR_ArrSchd_DtlR<InspSchd_Upd01_CndR, ArrSchd_DtlR>();
		}
		public class Map_InspSchd_Upd01_CndR_ArrSchd_DtlR<D extends InspSchd_Upd01_CndR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_cd, ArrSchd_DtlR.$itm_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_sub1, ArrSchd_DtlR.$itm_sub1);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_sub2, ArrSchd_DtlR.$itm_sub2);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_sub3, ArrSchd_DtlR.$itm_sub3);
				addColumnPathMap(InspSchd_Upd01_CndR.$loc_cd, ArrSchd_DtlR.$arr_loc_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$str_ln_cd, ArrSchd_DtlR.$str_ln_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$quality_typ, ArrSchd_DtlR.$quality_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$stk_insp_typ, ArrSchd_DtlR.$stk_insp_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$stk_id_typ, ArrSchd_DtlR.$stk_id_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$bp_cd, ArrSchd_DtlR.$stk_bp_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$gd_cd, ArrSchd_DtlR.$gd_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$lot_no, ArrSchd_DtlR.$lot_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$sublot_no, ArrSchd_DtlR.$sublot_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno1, ArrSchd_DtlR.$sno1);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno2, ArrSchd_DtlR.$sno2);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno3, ArrSchd_DtlR.$sno3);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno4, ArrSchd_DtlR.$sno4);
				addColumnPathMap(InspSchd_Upd01_CndR.$maker_cd, ArrSchd_DtlR.$maker_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$bp_lot_no, ArrSchd_DtlR.$bp_lot_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$gr_tm, ArrSchd_DtlR.$arr_schd_tm);
				addColumnPathMap(InspSchd_Upd01_CndR.$base_unit_cd, ArrSchd_DtlR.$base_unit_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$ver_no, ArrSchd_DtlR.$ver_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.act_flg(false);
				dest.sts_schd_flg(false);

				MST_ARR_PR_R apR = getArrPrR(src.arr_pr_no());
				dest.src_no1(apR.po_d_no());
				dest.src_no2(null);
				dest.src_no3(src.arr_schd_no());
				dest.src_no4(null);
				dest.insp_typ(MSC_INSP_TYP.ACCPT.value());

				MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
				if (src.abort_flg() || !asR.base_unit_qty().subtract(asR.arr_qty().add(asR.abort_qty())).isPositive()) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					return;
				}
				else {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				dest.sppl_cd(apR.sppl_cd());
				dest.asst_typ(src.getString(ASST_TYP_COL));
				dest.mfg_loc_cd(MAC_STR.NULL_VAL.value());
				dest.ac_dt(null);
				dest.can_ac_dt(null);

				dest.base_unit_qty(src.base_unit_qty().subtract(src.arr_qty()));

				MAVM_ITM_UNIT_R itmUnitR = getItmUnitR(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3(), src.trd_unit_cd());
				if (itmUnitR != null && itmUnitR.pack_flg()) {
					MCNumber qty = getTrdUnitQty(dest.base_unit_qty(), src.base_unit_cd(), itmUnitR);
					if (isNull(qty)) {
						dest.pack_unit_qty(dest.base_unit_qty());
						dest.pack_unit_cd(src.base_unit_cd());
					}
					else {
						dest.pack_unit_qty(qty);
						dest.pack_unit_cd(src.trd_unit_cd());
					}
				}
				else {
					dest.pack_unit_qty(dest.base_unit_qty());
					dest.pack_unit_cd(src.base_unit_cd());
				}
				dest.to_loc_cd(null);
				dest.insp_cnt_rmrks(null);
				dest.not_stk_flg(src.getBoolean(IS_NOT_STK_COL));

				// 納品先ＣＤ
				MST_PO_D_R podR = getPoDR(dest.src_no1());
				if (!isNull(podR)) {
					dest.dlv_cd(podR.dlv_cd());
				}
			}
		}
		
		/**
		 * 市場出荷判定情報サービス呼び出し
		 */
		protected void callMrktJudg() {
			MCList<ArrSchd_DtlR> upd01L = MCList.create(ArrSchd_DtlR.class);

			for (ArrSchd_DtlR r : up0()) {
				MST_ARR_PR_R apR = getArrPrR(r.arr_pr_no());

				if (apR.purc_ddlv_flg() && !r.is_src_arract_srv_flg()) {
					if (!isNull(r.lot_no())) {
						if (r.getBoolean(IS_ABORT_FLG_COL)) {
							ArrSchd_DtlR rr = r.clone();
							if (r.abort_flg()) {
								// 打切の場合は削除
								rr.lot_no(null);
								upd01L.add(rr);
							}
							else {
								// 打切解除の場合は新規
								rr.setString(ORG_LOT_NO, null);
								upd01L.add(rr);
							}
						}
						else {
							upd01L.add(r);
						}
					}
					else if (!isNull(r.getString(ORG_LOT_NO))) {
						// ロットがクリアされた場合も削除
						upd01L.add(r);
					}
				}
			}

			callMrktJudgUpd01(upd01L);
		}

		/**
		 * 受注状況更新サービス呼び出し
		 */
		protected void callSloSts() {
			callSloStsUpd01(up0());
		}

		/**
		 * オーダ登録サービス呼び出し
		 */
		protected void callOrdReg() {
			MCList<ArrSchd_DtlR> _inspL = up0()
					.subList(
							new TrdPtnTypMatcher(MAC_TRD_PTN_TYP.PURC,
									MAC_TRD_PTN_TYP.PURC_XPNS));
			callOrdRegUpd04(_inspL.subList(ArrSchd_DtlR.$is_src_outsrc_srv_flg, false));
		}

		/**
		 * ＷＧ間依頼サービス呼び出し
		 */
		protected void callWgRqst() {
			callWgRqstUpd03(up0());
		}
		
		/**
		 * ＷＧ間依頼サービス.ＷＧ間依頼ステータス更新
		 */
		protected void callWgRqstUpd03(MCList<ArrSchd_DtlR> l) {
			MCList<MST_ARR_PR_R> bindPoL = MCList.create(MST_ARR_PR_R.class);
			MCList<MST_ARR_PR_R> bindXfrL = MCList.create(MST_ARR_PR_R.class);
			for (ArrSchd_DtlR r : l) {
				if (r.is_src_outsrc_srv_flg()) {
					continue;
				}
				MST_ARR_PR_R apR = getArrPrR(r.arr_pr_no());
				if (apR != null) {
					if (!isNull(apR.po_d_no())) {
						bindPoL.add(apR);
					}
					if (!isNull(apR.dlv_slip_d_no())) {
						bindXfrL.add(apR);
					}
				}
			}
			MSBAL_WgRqstService.WgRqst_Upd03 o = MSBAL_WgRqstService.crtWgRqst_Upd03();
			o.up0().addAll(getWgRqstUpd03Up0(bindPoL, bindXfrL));
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		/**
		 * 入荷予定送信ＩＦサービス呼び出し
		 */
		protected void  callArrSchdSendIf() {
			MCList<ArrSchd_DtlR> l = MCList.create(ArrSchd_DtlR.class);
			for (ArrSchd_DtlR r : up0()) {
				if (r.is_src_arract_srv_flg()
					|| r.is_src_purcact_srv_flg()) {
					continue;
				}
				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				l.add(r);
			}
			callArrSchdSendIfUpd01(l);
		}

		protected void callProvSchd() {
			MSBEL_ProvSchdService.ProvSchd_Upd01 o = MSBEL_ProvSchdService.crtProvSchd_Upd01();
			setProvSchdMsg4Upd02(up0(), o.up0());
			
			if (!o.up0().isEmpty()) {
				o.exec();
				
				// キャッシュを取り直す（支給予定の更新を反映する）
				initArrSchdCache(up0());
			}
		}
	}



	/**
	 * ArrSchd_Upd03オペレーション.<p>
	 *
	 * 更新（仕入・売上返品）を行います。<br>
	 */
	public class ArrSchd_Upd03 extends MSBEL_ArrSchdService_MC_A.ArrSchd_Upd03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			doCache();
			editUp();
			updArrSchd();
			updArrPr();
			callIoSchdDel();
			callIoSchd();
			callOrdReg();
		}

		protected void doCache() {
			initArrSchdCache(up0());
		}

		protected void editUp() {
			MCList<MST_ARR_ACT_R> slsActIoL = getSlsActIoGroupBy(up0());
			MCIndexKey idxkey = slsActIoL.createIndex("arr_schd_no");
			
			for (ArrSchd_DtlR r : up0()) {

				MST_ARR_ACT_R slsActIoR = slsActIoL.getFirst(idxkey, r.arr_schd_no());
				if(slsActIoR != null) {
					r.sls_ret_qty(slsActIoR.base_unit_qty());
				}
				else {
					r.sls_ret_qty(0);
				}
				
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());

				// 入荷進捗更新の準備
				r.arr_pr_no(asR.arr_pr_no());
			}

			// 入荷進捗キャッシュ
			initArrPrCacheFromArrSchd(up0());
		}
		
		/**
		 * 売上実績受払のデータを取得します。<br>
		 * 入荷予定ＮＯ->入荷実績（入荷予定ＮＯ）->売上実績受払（入荷実績ＮＯ）
		 * @param bindL 「arr_schd_no」に入荷予定ＮＯを格納したリスト
		 * @return 入荷実績のデータ
		 */
		protected MCList<MST_ARR_ACT_R> getSlsActIoGroupBy(MCList<ArrSchd_DtlR> bindL) {
			MCList<MST_ARR_ACT_R> dbc = MCList.create(MST_ARR_ACT_R.class);
			MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MST_SLS_ACT_IO_R t1 = MST_SLS_ACT_IO_R.create("T1");
			MST_SLS_ACT_D_R t2 = MST_SLS_ACT_D_R.create("T2");
			MST_SLS_ACT_R t3 = MST_SLS_ACT_R.create("T3");
			dbc_bldr.setGroupBy(t.arr_schd_no);
			dbc_bldr.addSum(t1.base_unit_qty, "base_unit_qty");
			dbc_bldr.addInnerJoin(t1, bracket( t1.arr_act_no.eq(t.arr_act_no)));
			dbc_bldr.addInnerJoin(t2, bracket( t2.sls_act_d_no.eq(t1.sls_act_d_no)
					.and(t2.sls_act_d_seq.eq(t1.sls_act_d_seq))));
			dbc_bldr.addInnerJoin(t3, bracket( t3.sls_act_no.eq(t2.sls_act_no)
					.and(t3.sls_act_seq.eq(t2.sls_act_d_seq))
					.and(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
			dbc_bldr.setWhere(t.arr_schd_no.eq(bind("arr_schd_no")));
			dbc_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBEL5900_MST_ARR_ACT_S02", dbc, dbc_bldr, bindL);
			return dbc;
		}

		// 仕入予定リスト（入荷進捗更新、入荷予定更新で使用）
		MCList<MST_PURC_SCHD_R> _purcSchdL;
		
		/**
		 * 入荷進捗更新
		 */
		protected void updArrPr() {
			MCList<MST_ARR_PR_R> updL = MCList.create(MST_ARR_PR_R.class);
			
			// 仕入予定
			MCIndexKey purcSchdKey = _purcSchdL.createIndex(MST_PURC_SCHD_R.$arr_pr_no, MST_PURC_SCHD_R.$cmpl_flg);
			
			// 仕入予定をグループバイ
			MCGroupByPolicy gp = new MCGroupByPolicy(MST_PURC_SCHD_R.$arr_pr_no);
			gp.max("purc_dt");
			MCList<MST_PURC_SCHD_R> purcSchdGL = _purcSchdL.groupBy(gp);
			MCIndexKey purcSchdGKey = purcSchdGL.createIndex(MST_PURC_SCHD_R.$arr_pr_no);

			for (MCList<ArrSchd_DtlR> l : up0().groupList(ArrSchd_DtlR.$arr_pr_no)) {
				MST_ARR_PR_R apR = getArrPrR(l.get(0).arr_pr_no());

				MST_ARR_PR_R dbc = MST_ARR_PR_R.create();
				dbc.arr_pr_no(apR.arr_pr_no());
				dbc.po_d_no(apR.po_d_no());

				MST_PURC_SCHD_R psR = purcSchdGL.getFirst(purcSchdGKey, apR.arr_pr_no());
				if (_purcSchdL.getFirst(purcSchdKey, apR.arr_pr_no(), false) == null) {
					if(psR != null) {
						dbc.purc_dt(psR.getDate("purc_dt"));
					}
				}
				else {
					dbc.purc_dt(null);
				}
				updL.add(dbc);
			}
			initPoDCache(updL);
			setArrPr(updL);
			
			if (!updL.isEmpty()) {
				MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				updL_bldr.setSet(
						t.purc_dt,
						t.purc_qty,
						t.sls_ret_qty,
						t.purc_schd_abort_qty,
						t.sls_ret_schd_abort_qty,
						t.accpt_dfct_qty,
						t.purc_cmpl_flg,
						t.sls_ret_cmpl_flg);
				dbUpdateKey("MSBEL5900_MST_ARR_PR_U04", updL, updL_bldr);
			}

			// KPI関連項目を更新
			updArrPrForKPI(updL);

			// キャッシュを取り直す
			initArrPrCacheFromArrSchd(up0());
		}
		
		/**
		 * 仕入予定のデータを取得します。<br>
		 * （入荷進捗ＮＯが一致するもの）
		 * @param bindL 「arr_pr_no」に入荷進捗ＮＯを格納したリスト
		 * @return 仕入予定のデータ
		 */
		protected MCList<MST_PURC_SCHD_R> getPurcSchd(MCList<? extends MCRow> bindL) {
			MCList<MST_PURC_SCHD_R> dbc = MCList.create(MST_PURC_SCHD_R.class);
			MST_PURC_SCHD_R t = MST_PURC_SCHD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MST_PURC_ACT_D_R t1 = MST_PURC_ACT_D_R.create("T1");
			MST_PURC_ACT_R t2 = MST_PURC_ACT_R.create("T2");
			dbc.addDateColumn("purc_dt");
			dbc_bldr.setGroupBy(
					t.purc_schd_no,
					t.arr_pr_no,
					t.arr_schd_no,
					t.base_unit_purc_qty,
					t.cmpl_flg
			);
			dbc_bldr.addMax(t2.purc_dt, "purc_dt");
			dbc_bldr.addLeftOuterJoin(t1, bracket(t1.purc_schd_no.eq(t.purc_schd_no)));
			dbc_bldr.addLeftOuterJoin(t2, bracket(t2.purc_act_no.eq(t1.purc_act_no)
					.and(t2.purc_act_seq.eq(t1.purc_act_seq))
					.and(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
			dbc_bldr.setWhere(t.arr_pr_no.eq(bind("arr_pr_no")));
			dbSelect("MSBEL5900_MST_PURC_SCHD_S01", dbc, dbc_bldr, bindL);
			return dbc;
		}
		/**
		 * 入荷予定のデータを取得します。<br>
		 * （入荷進捗ＮＯが一致するもの）
		 * @param bindL 「arr_pr_no」に入荷進捗ＮＯを格納したリスト
		 * @return 仕入予定のデータ
		 */
		protected MCList<MST_ARR_SCHD_R> getArrSchd(MCList<? extends MCRow> bindL) {
			MCList<MST_ARR_SCHD_R> dbc = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(
					t.arr_schd_no,
					t.arr_pr_no,
					t.sls_ret_qty,
					t.sls_ret_schd_abort_qty,
					t.sls_ret_schd_cmpl_flg);
			dbc_bldr.setWhere(t.arr_pr_no.eq(bind("arr_pr_no")));
			dbSelect("MSBEL5900_MST_ARR_SCHD_S01", dbc, dbc_bldr, bindL);
			return dbc;
		}

		/**
		 * 入荷予定更新
		 */
		protected void updArrSchd() {
			MCList<MST_ARR_SCHD_R> updL = MCList.create(MST_ARR_SCHD_R.class);

			// 仕入予定インデックスキー
			_purcSchdL = getPurcSchd(up0());
			MCIndexKey idxkey = _purcSchdL.createIndex(MST_PURC_SCHD_R.$arr_schd_no);
			
			MCList<MST_ARR_ACT_R> arrActL = getArrAct(up0());
			MCIndexKey arrActkey = arrActL.createIndex(MST_ARR_ACT_R.$arr_schd_no);
			
			for(ArrSchd_DtlR r : up0()) {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				MST_ARR_PR_R apR = getArrPrR(asR.arr_pr_no());

				MST_ARR_SCHD_R dbc = MST_ARR_SCHD_R.create();
				dbc.arr_schd_no(r.arr_schd_no());

				MST_PURC_SCHD_R psR = _purcSchdL.getFirst(idxkey, r.arr_schd_no());
				if (psR != null) {
					dbc.purc_qty(psR.base_unit_purc_qty());
				}
				else {
					dbc.purc_qty(0);
				}

				if (MAC_TRD_PTN_TYP.isSLS_RTN(apR.trd_ptn_typ())) {
					dbc.arr_ptn_typ(MSC_ARR_PTN_TYP.NRML.value());
				}
				else if (asR.arr_qty().isZero() && asR.purc_qty().isPositive() && dbc.purc_qty().isZero()) {
					// 実績取消
					dbc.arr_ptn_typ(getDefaultArrPtnTyp(asR));
				}
				else if (isDelTempAp(asR, dbc)) {
					dbc.arr_ptn_typ(getDefaultArrPtnTyp(asR));
				}
				else if (isNull(r.arr_ptn_typ())) {
					dbc.arr_ptn_typ(asR.arr_ptn_typ());
				}
				else {
					dbc.arr_ptn_typ(r.arr_ptn_typ());
				}
				dbc.sync_flg(asR.sync_flg());
				if (MSC_ARR_PTN_TYP.isN_YET_ARR(dbc.arr_ptn_typ())) {
					dbc.sync_flg(false);
				}
				else if (MSC_ARR_PTN_TYP.isN_YET_ARR(asR.arr_ptn_typ())) {
					// 入荷パタン区分が未着管理から通常管理に戻る場合、作成元の同時計上フラグを設定する
					// 通常管理かつ同時計上の入荷予定（仕入予定）を未着で仕入した場合、入荷予定の同時計上がオンからオフになる
					// その仕入を取り消した際にオフからオンに戻すことが目的
					dbc.sync_flg(asR.getBooleanNE("def_sync_flg"));
				}
				
				if (MAC_TRD_PTN_TYP.isSLS_RTN(apR.trd_ptn_typ())) {
					MCList<MST_ARR_ACT_R> l = arrActL.subList(arrActkey, r.arr_schd_no());
					MCNumber sum = nvl(l.sum("sls_ret_qty"), MCNumber.ZERO);
					dbc.sls_ret_qty(sum);
	
					if (r.sls_ret_schd_abort_flg()) {
						dbc.sls_ret_schd_abort_qty(asR.abort_qty().add(asR.arr_qty().subtract(dbc.sls_ret_qty())));
					}
					else {
						dbc.sls_ret_schd_abort_qty(asR.abort_qty());
					}
					dbc.sls_ret_schd_abort_flg(r.sls_ret_schd_abort_flg());
					// 過入荷を考慮し、「入荷実績数量と売上返品予定数量の大きいほう」と「売上返品実績数量」を比較して完了を判定
					MCNumber tgtNum = asR.arr_qty().lt(asR.base_unit_qty().subtract(dbc.sls_ret_schd_abort_qty())) ?
							asR.base_unit_qty().subtract(dbc.sls_ret_schd_abort_qty()) : asR.arr_qty();
					if (dbc.sls_ret_schd_abort_flg() || (dbc.sls_ret_qty().gte(tgtNum))) {
						dbc.sls_ret_schd_cmpl_flg(true);
					}
					else {
						dbc.sls_ret_schd_cmpl_flg(false);
					}
				}
				else {
					dbc.sls_ret_qty(0);
					dbc.sls_ret_schd_abort_qty(0);
					dbc.sls_ret_schd_abort_flg(false);
					dbc.sls_ret_schd_cmpl_flg(false);
				}
				if (r.is_src_purcact_srv_flg()) {
					dbc.wms_flg(r.wms_flg());
				}
				else {
					dbc.wms_flg(asR.wms_flg());
				}
				
				updL.add(dbc);
			}

			if (!updL.isEmpty()) {
				MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				updL_bldr.setSet(
						t.arr_ptn_typ,
						t.sync_flg,
						t.purc_qty,
						t.sls_ret_qty,
						t.sls_ret_schd_abort_qty,
						t.sls_ret_schd_abort_flg,
						t.sls_ret_schd_cmpl_flg);
				updL_bldr.addSet(t.wms_flg);
				dbUpdateKey("MSBEL5900_MST_ARR_SCHD_U04", updL, updL_bldr);
			}

			// キャッシュを取り直す
			initArrSchdCache(up0());
		}

		/**
		 * 受払予定サービス呼び出し
		 */
		protected void callIoSchd() {
			MCList<ArrSchd_DtlR>
					Ins01SlsL = MCList.create(ArrSchd_DtlR.class),// 売上返品
					Ins01ShipRetKL = MCList.create(ArrSchd_DtlR.class),// 出荷返品（貸出返品）
					Ins01ShipRetOL = MCList.create(ArrSchd_DtlR.class),// 出荷返品（乙仲返品）
					Ins01ShipL = MCList.create(ArrSchd_DtlR.class),// 移動・移送、支給関連（出荷済）
					Ins01ExL = MCList.create(ArrSchd_DtlR.class),// 移動・移送、支給関連（輸出済）
					Ins01OthL = MCList.create(ArrSchd_DtlR.class);// その他

			for (ArrSchd_DtlR r : up0()) {
				MST_ARR_PR_R apR = getArrPrR(r.arr_pr_no());
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());

				// 売上返品のみ受払予定サービス実行
				if (!MAC_TRD_PTN_TYP.isSLS_RTN(apR.trd_ptn_typ())
					|| asR.sls_ret_schd_cmpl_flg()) {
					continue;
				}

				MAM_ITM_R itmR = getItmR(asR.itm_cd(), asR.itm_sub1(), asR.itm_sub2(), asR.itm_sub3());
				MAM_BIZ_RSN_R rsnR = getBizRsnR(apR.rsn_cd());
				r.addBooleanColumn(IS_NOT_STK_COL, isNotStk(itmR, apR.trd_ptn_typ(), rsnR));

				if (!r.getBoolean(IS_NOT_STK_COL)) {
					if (MAC_TRD_PTN_TYP.isSLS_RTN(apR.trd_ptn_typ())) {
						Ins01SlsL.add(r);
					}
				}
			}
			
			callIoSchdIns01(Ins01SlsL, Ins01ShipRetKL, Ins01ShipRetOL, Ins01ShipL, Ins01ExL, Ins01OthL);
		}
		protected void callIoSchdDel() {
			MSBEL_IoSchdService.IoSchd_Del02 o = MSBEL_IoSchdService.crtIoSchd_Del02();
			for (ArrSchd_DtlR r : up0()) {
				MST_ARR_PR_R apR = getArrPrR(r.arr_pr_no());

				// 売上返品のみ
				if (MAC_TRD_PTN_TYP.isSLS_RTN(apR.trd_ptn_typ())) {
					MSW_IO_SCHD_DEL_R delR = o.up0().add();

					delR.io_schd_sub_typ3(MSC_IO_SCHD_SUB_TYP.ARR_SCHD_NO.value());
					delR.io_schd_sub_no3(r.arr_schd_no());
				}
			}
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}

		/**
		 * オーダ登録サービス呼び出し
		 */
		protected void callOrdReg() {
			MCList<ArrSchd_DtlR> _inspL = MCList.create(ArrSchd_DtlR.class);
			for (ArrSchd_DtlR r : up0()) {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				MST_ARR_PR_R apR = getArrPrR(asR.arr_pr_no());

				if (MAC_TRD_PTN_TYP.isPURC(apR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(apR.trd_ptn_typ())) {
					_inspL.add(r);
				}
			}
			callOrdRegUpd04(_inspL);
		}
	}
	


	/**
	 * ArrSchd_Chk01オペレーション.<p>
	 *
	 * 更新（入荷進捗・予定）前チェックを行います。<br>
	 */
	public class ArrSchd_Chk01 extends MSBEL_ArrSchdService_MC_A.ArrSchd_Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			doCache();
			doCheck();
			doService();
			setDown();
		}

		protected void doCache() {
			initArrSchdCache(up0());
			initArrPrCacheFromArrSchd(up0());
			initLocCache(up0());
		}

		protected void doCheck() {
			MCMessageList msgL = new MCMessageList();

			for (ArrSchd_DtlR r : up0()) {
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
					MST_ARR_PR_R apR = getArrPrR(r.arr_pr_no());
					
					if ((MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ()))
							&& asR.getBoolean("arr_flg")
							&& asR.arr_qty().gt(0)) {
						r.err_flg(true);
						msgL.add(new MCMessage(r, null, MSBEL0045, r.arr_schd_no()));
					}
					if ((MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ()))
							&& !isNull(asR.arr_qty()) && asR.arr_qty().gt(0)) {
						r.err_flg(true);
						msgL.add(new MCMessage(r, null, MSBEL0045, r.arr_schd_no()));
					}
					if (!isNull(asR.sls_ret_qty()) && asR.sls_ret_qty().gt(0)) {
						r.err_flg(true);
						msgL.add(new MCMessage(r, null, MSBEL0047, r.arr_schd_no()));
					}
					if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isSHIP_RTN(r.trd_ptn_typ())) {
						if ((asR.abort_flg() || apR.abort_flg())
								&& (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) || r.abort_flg())) {
							r.err_flg(true);
							msgL.add(new MCMessage(r, null, MSBEL0048, r.arr_schd_no()));
						}
					}
					if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())
							&& asR.outsrc_flg()
							&& isNull(r.mfg_inst_no())
							&& r.abort_flg()) {
						r.err_flg(true);
						msgL.add(new MCMessage(r, null, MSBEL0049, r.arr_schd_no()));
					}
				}
			}
			MCMessagePool.addAll(msgL);
		}

		protected void doService() {
			callOutSrcInstChk02();
			callOutSrcInstChk03();
			callProvSchdChk01();
			callRelDecChk01();
		}

		/**
		 * 外注製造指図登録サービス.更新前チェック（再入荷予定）
		 */
		protected void callOutSrcInstChk02() {
			MCList<ArrSchd_DtlR> l = MCList.create(ArrSchd_DtlR.class);
			for(ArrSchd_DtlR r : up0()) {
				if (!r.is_src_purcact_srv_flg()) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
					if (asR.outsrc_flg() && asR.re_arr_schd_flg()) {
						l.add(r);
					}
				}
				else {
					if (r.outsrc_flg() && r.re_arr_schd_flg()) {
						l.add(r);
					}
				}
			}
			if (l.isEmpty()) {
				return;
			}
			MSBCL_OutSrcInstService.OutSrcInst_Chk02 o = MSBCL_OutSrcInstService
					.crtOutSrcInst_Chk02();
			setAll(o.up0(), l, createMap_OutSrcInst_Chk02_ReArrR_ArrSchd_DtlR());
			o.exec();
			copyErrFlg(up0(), o.down0());
		}
		protected Map_OutSrcInst_Chk02_ReArrR_ArrSchd_DtlR<OutSrcInst_Chk02_ReArrR,ArrSchd_DtlR> createMap_OutSrcInst_Chk02_ReArrR_ArrSchd_DtlR() {
			return new Map_OutSrcInst_Chk02_ReArrR_ArrSchd_DtlR<OutSrcInst_Chk02_ReArrR, ArrSchd_DtlR>();
		}
		public class Map_OutSrcInst_Chk02_ReArrR_ArrSchd_DtlR<D extends OutSrcInst_Chk02_ReArrR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(OutSrcInst_Chk02_ReArrR.$peg_no, ArrSchd_DtlR.$peg_no);
				addColumnPathMap(OutSrcInst_Chk02_ReArrR.$data_crud_typ, ArrSchd_DtlR.$data_crud_typ);
				addColumnPathMap(OutSrcInst_Chk02_ReArrR.$purc_act_d_no, ArrSchd_DtlR.$purc_act_d_no);
				addColumnPathMap(OutSrcInst_Chk02_ReArrR.$base_unit_qty, ArrSchd_DtlR.$base_unit_qty);
				addColumnPathMap(OutSrcInst_Chk02_ReArrR.$dlv_rqst_tm, ArrSchd_DtlR.$arr_schd_tm);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
				dest.old_base_unit_qty(asR.base_unit_qty());
				dest.re_arr_mfg_inst_no(asR.mfg_inst_no());
			}
		}
		
		/**
		 * 外注製造指図登録サービス.打切前チェック（入荷予定）
		 */
		protected void callOutSrcInstChk03() {
			MCList<ArrSchd_DtlR> l = MCList.create(ArrSchd_DtlR.class);
			for (ArrSchd_DtlR r : up0()) {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				if (asR.outsrc_flg() && (r.abort_flg() || asR.abort_flg())) {
					l.add(r);
				}
			}
			if (l.isEmpty()) {
				return;
			}

			MSBCL_OutSrcInstService.OutSrcInst_Chk03 o = MSBCL_OutSrcInstService
			.crtOutSrcInst_Chk03();
			setAll(o.up0(), l, createMap_OutSrcInst_Chk03_ArrAbortR_ArrSchd_DtlR());
			o.exec();
			copyErrFlg(up0(), o.down0());
		}
		
		protected Map_OutSrcInst_Chk03_ArrAbortR_ArrSchd_DtlR<OutSrcInst_Chk03_ArrAbortR,ArrSchd_DtlR> createMap_OutSrcInst_Chk03_ArrAbortR_ArrSchd_DtlR() {
			return new Map_OutSrcInst_Chk03_ArrAbortR_ArrSchd_DtlR<OutSrcInst_Chk03_ArrAbortR, ArrSchd_DtlR>();
		}
		
		public class Map_OutSrcInst_Chk03_ArrAbortR_ArrSchd_DtlR<D extends OutSrcInst_Chk03_ArrAbortR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(OutSrcInst_Chk03_ArrAbortR.$peg_no, ArrSchd_DtlR.$peg_no);
				addColumnPathMap(OutSrcInst_Chk03_ArrAbortR.$arr_schd_no, ArrSchd_DtlR.$arr_schd_no);
				addColumnPathMap(OutSrcInst_Chk03_ArrAbortR.$base_unit_abort_qty, ArrSchd_DtlR.$abort_qty);
				addColumnPathMap(OutSrcInst_Chk03_ArrAbortR.$abort_flg, ArrSchd_DtlR.$abort_flg);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
				dest.mfg_inst_no(asR.mfg_inst_no());
				dest.base_unit_abort_qty(asR.base_unit_qty());
			}
		}

		/**
		 * 支給予定サービス.登録前チェック
		 */
		protected void callProvSchdChk01() {
			MCList<ArrSchd_DtlR>
				provL = MCList.create(ArrSchd_DtlR.class);
			for(ArrSchd_DtlR r : up0()) {
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					MAM_LOC_R locR = getLocR(r.arr_loc_cd());
					if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
						if (!MAC_PROV_RCV_TYP.isNOT_ARR(locR.getString("prov_rcv_typ"))) {
							provL.add(r);
						}
					}
					else if ((MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ()))
							&& !isNull(locR.sppl_cd())) {
						ArrSchd_DtlR tmpR = r.clone();
						tmpR.trd_cd(null);	// 支給予定SV内で補完する
						provL.add(tmpR);
					}
				}
			}
			if (provL.isEmpty())	return;

			MSBEL_ProvSchdService.ProvSchd_Chk01 o = MSBEL_ProvSchdService.crtProvSchd_Chk01();
			setAll(o.up0(), provL, createMap_ProvSchd_DtlR_ArrSchd_DtlR());
			o.exec();
			copyErrFlg(up0(), o.down0());
		}
		protected Map_ProvSchd_DtlR_ArrSchd_DtlR<ProvSchd_DtlR,ArrSchd_DtlR> createMap_ProvSchd_DtlR_ArrSchd_DtlR() {
			return new Map_ProvSchd_DtlR_ArrSchd_DtlR<ProvSchd_DtlR, ArrSchd_DtlR>();
		}
		public class Map_ProvSchd_DtlR_ArrSchd_DtlR<D extends ProvSchd_DtlR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ProvSchd_DtlR.$peg_no, ArrSchd_DtlR.$peg_no);
				addColumnPathMap(ProvSchd_DtlR.$data_crud_typ, ArrSchd_DtlR.$data_crud_typ);
				addColumnPathMap(ProvSchd_DtlR.$trd_cd, ArrSchd_DtlR.$trd_cd);
				addColumnPathMap(ProvSchd_DtlR.$wg_cd, ArrSchd_DtlR.$wg_cd);
				addColumnPathMap(ProvSchd_DtlR.$prov_typ, ArrSchd_DtlR.$prov_typ);
				addColumnPathMap(ProvSchd_DtlR.$prov_basis_typ, ArrSchd_DtlR.$prov_basis_typ);
				addColumnPathMap(ProvSchd_DtlR.$xrate, ArrSchd_DtlR.$xrate);
				addColumnPathMap(ProvSchd_DtlR.$ptax_xrate, ArrSchd_DtlR.$ptax_xrate);
				addColumnPathMap(ProvSchd_DtlR.$trd_cur_cd, ArrSchd_DtlR.$trd_cur_cd);
				addColumnPathMap(ProvSchd_DtlR.$tax_cd, ArrSchd_DtlR.$tax_cd);
				addColumnPathMap(ProvSchd_DtlR.$trd_cur_upri, ArrSchd_DtlR.$trd_cur_upri);
				addColumnPathMap(ProvSchd_DtlR.$itm_cd, ArrSchd_DtlR.$itm_cd);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub1, ArrSchd_DtlR.$itm_sub1);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub2, ArrSchd_DtlR.$itm_sub2);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub3, ArrSchd_DtlR.$itm_sub3);
				addColumnPathMap(ProvSchd_DtlR.$stk_id_typ, ArrSchd_DtlR.$stk_id_typ);
				addColumnPathMap(ProvSchd_DtlR.$stk_arrv_bp_cd, ArrSchd_DtlR.$stk_arrv_bp_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				MAM_LOC_R locR = getLocR(src.arr_loc_cd());
				if (locR != null) {
					dest.prsppl_cd(locR.sppl_cd());
				}

				dest.accpt_schd_dt(src.arr_schd_tm());
				if (!isNull(src.accpt_schd_dt())) {
					if (src.accpt_schd_dt().gt(src.arr_schd_tm())) {
						dest.accpt_schd_dt(src.accpt_schd_dt());
					}
				}
				if (!isNull(dest.accpt_schd_dt())) {
					dest.accpt_schd_dt(dest.accpt_schd_dt().trunc(MCDateFieldType.DAY));
				}
				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV.value());
			}
		}

		/**
		 * 市場出荷判定サービス.市場出荷判定作成前チェック
		 */
		protected void callRelDecChk01() {
			MCList<ArrSchd_DtlR> l = MCList.create(ArrSchd_DtlR.class);
			for (ArrSchd_DtlR r : up0()) {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				if (isNull(asR.arr_schd_no())) {
					continue;
				}
				// ロットがクリアされた場合も対象
				if (asR.getBoolean("purc_ddlv_flg") && (!isNull(r.lot_no())
						|| (isNull(r.lot_no()) && !isNull(asR.lot_no())))
				) {
					ArrSchd_DtlR tmpR = r.clone();
					// 打切の場合は削除
					if (r.abort_flg() && !asR.abort_flg()) {
						tmpR.lot_no(null);
					}
					// 打切解除以外は訂正
					else if (!(!r.abort_flg() && asR.abort_flg())) {
						tmpR.addStringColumn(ORG_LOT_NO, asR.lot_no());
					}
					// 打切解除の場合は新規
					else {
						tmpR.addStringColumn(ORG_LOT_NO, null);
					}
					l.add(tmpR);
				}
			}
			if (l.isEmpty())	return;

			MSBFL_MrktJudgService.MrktJudg_Chk01 o = MSBFL_MrktJudgService
					.crtMrktJudg_Chk01();
			setAll(o.up0(), l, createMap_MrktJudg_Chk01_RsltR_ArrSchd_DtlR());
			o.exec();
			copyErrFlg(up0(), o.down0());
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
	}



	/**
	 * ArrSchd_Chk02オペレーション.<p>
	 *
	 * 更新（予定・実績）前チェックを行います。<br>
	 */
	public class ArrSchd_Chk02 extends MSBEL_ArrSchdService_MC_A.ArrSchd_Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			doCache();
			editUp();
			doCheck();
			doLot();
			doService();
			setDown();
		}

		protected void doCache() {
			initArrSchdCache(up0());
			initArrPrCacheFromArrSchd(up0());

			MCList<ArrSchd_DtlR> bindL = MCList.create(ArrSchd_DtlR.class);
			for(ArrSchd_DtlR r : up0()) {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				ArrSchd_DtlR bindR = ArrSchd_DtlR.create();
				bindR.itm_cd(asR.itm_cd());
				bindR.itm_sub1(asR.itm_sub1());
				bindR.itm_sub2(asR.itm_sub2());
				bindR.itm_sub3(asR.itm_sub3());
				bindR.arr_loc_cd(asR.arr_loc_cd());
				bindL.add(bindR);
			}
			initItmCache(bindL);
			initLocCache(bindL);
		}

		protected void editUp() {
			for(ArrSchd_DtlR r : up0()) {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				r.itm_cd(asR.itm_cd());
				r.itm_sub1(asR.itm_sub1());
				r.itm_sub2(asR.itm_sub2());
				r.itm_sub3(asR.itm_sub3());

				MST_ARR_PR_R apR = getArrPrR(asR.arr_pr_no());
				r.trd_ptn_typ(apR.trd_ptn_typ());
			}
		}

		protected void doCheck() {
			MCMessageList msgL = new MCMessageList();

			for (ArrSchd_DtlR r : up0()) {
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());

					if (asR.outsrc_flg() && isNull(asR.mfg_inst_no()) && r.abort_flg()) {
						r.err_flg(true);
						msgL.add(new MCMessage(r, null, MSBEL0049, r.arr_schd_no()));
					}
				}
			}

			MCMessagePool.addAll(msgL);
		}
		
		protected void doLot() {
			MCList<ArrSchd_DtlR> listLot = MCList.create(ArrSchd_DtlR.class);
			MCList<ArrSchd_DtlR> listSublot = MCList.create(ArrSchd_DtlR.class);

			for(ArrSchd_DtlR r : up0()) {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				if (r.is_src_outsrc_srv_flg()
					|| r.is_src_arract_srv_flg()
					|| r.abort_flg()
					|| asR.abort_flg()) {
					continue;
				}
				if (r.crt_lot_flg()){
					if (isNull(r.lot_no())) {
						listLot.add(r);
					}
				}
				if (isCrtSublot(r)) {
					listSublot.add(r);
				}
			}

			// ロットＮＯ・サブロットＮＯ発番
			MCList<ElmArgsR> lotL = doSetNum(listLot, MAC_NUM_BIZ_TYP.LOT);
			for (int i = 0; i < listLot.size(); i++) {
				ArrSchd_DtlR r = listLot.get(i);
				r.lot_no(lotL.get(i).new_no());
			}
			
			MCList<ElmArgsR> sublotL = doSetNum(listSublot, MAC_NUM_BIZ_TYP.SUBLOT);
			for (int i = 0; i < listSublot.size(); i++) {
				ArrSchd_DtlR r = listSublot.get(i);
				r.sublot_no(sublotL.get(i).new_no());
			}
			

			// Upd02で使用するためキャッシュする
			setLotCache(listLot);
			setSublotCache(listSublot);
		}
		
		protected MCList<ElmArgsR> doSetNum(MCList<ArrSchd_DtlR> l, MAC_NUM_BIZ_TYP numBizTyp) {
			MCList<ElmArgsR> lotL = MCList.create(ElmArgsR.class);
			for (ArrSchd_DtlR r : l) {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				MST_ARR_PR_R apR = getArrPrR(asR.arr_pr_no());
				MAM_ITM_R itmR = getItmR(asR.itm_cd(), asR.itm_sub1(), asR.itm_sub2(), asR.itm_sub3());
				MAM_LOC_R locR = getLocR(asR.arr_loc_cd());

				ElmArgsR lotR = ElmArgsR.create();
				lotR.num_ptn_cd(itmR.lot_no_ptn_cd());
				lotR.itm_cd(asR.itm_cd());
				lotR.itm_sub1(asR.itm_sub1());
				lotR.itm_sub2(asR.itm_sub2());
				lotR.itm_sub3(asR.itm_sub3());
				lotR.loc_cd(asR.arr_loc_cd());
				lotR.dpt_cd(apR.rqst_dpt_cd());
				lotR.co_cd(getCo().co_cd());
				lotR.bp_cd(apR.sppl_cd());
				lotR.wg_cd(locR.wg_cd());
				lotR.site_cd(locR.site_cd());
				lotR.trd_cd(null);
				lotR.dt(asR.arr_schd_tm().trunc(MCDateFieldType.DAY));
				lotR.str(null);
				lotR.str2(null);
				lotR.str3(null);
				lotR.num(null);
				if (r.bp_lot_upd_flg()) {
					lotR.bp_lot_no(r.bp_lot_no());
				}
				else {
					lotR.bp_lot_no(asR.bp_lot_no());
				}
				lotR.sno1(asR.sno1());
				lotR.sno2(asR.sno2());
				lotR.sno3(asR.sno3());
				lotR.sno4(asR.sno4());
				if (MAC_NUM_BIZ_TYP.isSUBLOT(numBizTyp)) {
					lotR.num_ptn_cd(itmR.sublot_no_ptn_cd());
					lotR.lot_no(r.lot_no());
				}
				lotL.add(lotR);
			}
			setPegNo(lotL);
			setNum(numBizTyp, lotL);
			
			return lotL;
		}

		protected void doService() {
			callLotChk02();
			callLotChk03();
			callInspSchdChk01();
			callRelDecChk01();
			callProvSchdChk01();
		}

		/**
		 * ロット情報サービス.ロット重複チェック
		 */
		protected void callLotChk02() {
			MCList<ArrSchd_DtlR> l = MCList.create(ArrSchd_DtlR.class);
			for (ArrSchd_DtlR r : up0()) {
				if (r.crt_lot_flg()
					&& !r.is_src_outsrc_srv_flg()
					&& !r.is_src_arract_srv_flg()) {
					l.add(r);
				}
				else if (r.is_src_purcdlvadjst_flg()) {
					MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
					if ((!isNull(r.lot_no()) && !isSame(r.lot_no(), asR.lot_no()))
						|| (!isNull(r.sublot_no()) && !isSame(r.sublot_no(), asR.sublot_no()))) {
						l.add(r);
					}
				}
			}
			if (l.isEmpty())	return;

			MSBFL_LotService.Lot_Chk02 o = MSBFL_LotService.crtLot_Chk02();
			setAll(o.up0(), l, createMap_Lot_Chk02_CndR_ArrSchd_DtlR());
			o.exec();
			copyErrFlg(up0(), o.down0());
		}
		protected Map_Lot_Chk02_CndR_ArrSchd_DtlR<Lot_Chk02_CndR,ArrSchd_DtlR> createMap_Lot_Chk02_CndR_ArrSchd_DtlR() {
			return new Map_Lot_Chk02_CndR_ArrSchd_DtlR<Lot_Chk02_CndR, ArrSchd_DtlR>();
		}
		public class Map_Lot_Chk02_CndR_ArrSchd_DtlR<D extends Lot_Chk02_CndR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Chk02_CndR.$peg_no, ArrSchd_DtlR.$peg_no);
				addColumnPathMap(Lot_Chk02_CndR.$lot_no, ArrSchd_DtlR.$lot_no);
				addColumnPathMap(Lot_Chk02_CndR.$sublot_no, ArrSchd_DtlR.$sublot_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
				dest.itm_cd(asR.itm_cd());
				dest.itm_sub1(asR.itm_sub1());
				dest.itm_sub2(asR.itm_sub2());
				dest.itm_sub3(asR.itm_sub3());
				dest.lot_not_change_flg(setLotNotChangeFlg(src.lot_no(), asR.lot_no()));
			}
		}

		/**
		 * ロット情報サービス.ロット存在チェック
		 */
		protected void callLotChk03() {
			MCList<ArrSchd_DtlR> l = MCList.create(ArrSchd_DtlR.class);
			for (ArrSchd_DtlR r : up0()) {
				if (!r.crt_lot_flg()
					&& !r.is_src_outsrc_srv_flg()
					&& !r.is_src_arract_srv_flg()) {
					l.add(r);
				}
			}
			if (l.isEmpty())	return;

			MSBFL_LotService.Lot_Chk03 o = MSBFL_LotService.crtLot_Chk03();
			setAll(o.up0(), l, createMap_Lot_Chk03_CndR_ArrSchd_DtlR());
			o.exec();
			copyErrFlg(up0(), o.down0());
		}
		protected Map_Lot_Chk03_CndR_ArrSchd_DtlR<Lot_Chk03_CndR,ArrSchd_DtlR> createMap_Lot_Chk03_CndR_ArrSchd_DtlR() {
			return new Map_Lot_Chk03_CndR_ArrSchd_DtlR<Lot_Chk03_CndR, ArrSchd_DtlR>();
		}
		public class Map_Lot_Chk03_CndR_ArrSchd_DtlR<D extends Lot_Chk03_CndR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Chk03_CndR.$peg_no, ArrSchd_DtlR.$peg_no);
				addColumnPathMap(Lot_Chk03_CndR.$lot_no, ArrSchd_DtlR.$lot_no);
				addColumnPathMap(Lot_Chk03_CndR.$sublot_no, ArrSchd_DtlR.$sublot_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
				dest.itm_cd(asR.itm_cd());
				dest.itm_sub1(asR.itm_sub1());
				dest.itm_sub2(asR.itm_sub2());
				dest.itm_sub3(asR.itm_sub3());
				dest.ver_no(asR.ver_no());
			}
		}

		/**
		 * 検査予定サービス.更新可能チェック
		 */
		protected void callInspSchdChk01() {
			MCList<ArrSchd_DtlR> l = MCList.create(ArrSchd_DtlR.class);
			for (ArrSchd_DtlR r : up0()) {
				if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
					l.add(r);
				}
			}
			if (l.isEmpty())	return;

			MSBFL_InspSchdService.InspSchd_Chk01 o = MSBFL_InspSchdService.crtInspSchd_Chk01();
			setAll(o.up0(), l, createMap_InspSchd_Chk01_CndR_ArrSchd_DtlR());
			o.exec();
			copyErrFlg(up0(), o.down0());
		}
		protected Map_InspSchd_Chk01_CndR_ArrSchd_DtlR<InspSchd_Chk01_CndR,ArrSchd_DtlR> createMap_InspSchd_Chk01_CndR_ArrSchd_DtlR() {
			return new Map_InspSchd_Chk01_CndR_ArrSchd_DtlR<InspSchd_Chk01_CndR, ArrSchd_DtlR>();
		}
		public class Map_InspSchd_Chk01_CndR_ArrSchd_DtlR<D extends InspSchd_Chk01_CndR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Chk01_CndR.$peg_no, ArrSchd_DtlR.$peg_no);
				addColumnPathMap(InspSchd_Chk01_CndR.$data_crud_typ, ArrSchd_DtlR.$data_crud_typ);
				addColumnPathMap(InspSchd_Chk01_CndR.$src_no3, ArrSchd_DtlR.$arr_schd_no);
				addColumnPathMap(InspSchd_Chk01_CndR.$lot_no, ArrSchd_DtlR.$lot_no);
				addColumnPathMap(InspSchd_Chk01_CndR.$sublot_no, ArrSchd_DtlR.$sublot_no);

			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
				MST_ARR_PR_R apR = getArrPrR(src.arr_pr_no());

				dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
				dest.skip_chk_plnt_aprv_flg(true);

				dest.src_no1(apR.po_d_no());
				dest.itm_cd(asR.itm_cd());
				dest.itm_sub1(asR.itm_sub1());
				dest.itm_sub2(asR.itm_sub2());
				dest.itm_sub3(asR.itm_sub3());
				dest.quality_typ(asR.quality_typ());
				dest.gd_cd(asR.gd_cd());
				dest.base_unit_qty(asR.base_unit_qty());
				dest.loc_cd(asR.arr_loc_cd());
				dest.str_ln_cd(asR.str_ln_cd());
				dest.stk_arrv_bp_cd(asR.stk_arrv_bp_cd());
				dest.stk_insp_typ(asR.stk_insp_typ());
				dest.stk_id_typ(asR.stk_id_typ());
				dest.stk_bp_cd(asR.stk_bp_cd());
				dest.sno1(asR.sno1());
				dest.sno2(asR.sno2());
				dest.sno3(asR.sno3());
				dest.sno4(asR.sno4());
				dest.gr_tm(asR.arr_schd_tm());

				if (asR.getBoolean("trd_pack_flg")) {
					dest.pack_unit_cd(asR.trd_unit_cd());
					dest.pack_unit_qty(asR.trd_unit_qty());
				}
				else {
					dest.pack_unit_cd(asR.base_unit_cd());
					dest.pack_unit_qty(asR.base_unit_qty());
				}
			}
		}

		/**
		 * 市場出荷判定サービス.市場出荷判定作成前チェック
		 */
		protected void callRelDecChk01() {
			MCList<ArrSchd_DtlR> l = MCList.create(ArrSchd_DtlR.class);
			for (ArrSchd_DtlR r : up0()) {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				if (!r.is_src_arract_srv_flg()) {
					// ロットがクリアされた場合も対象
					if (asR.getBoolean("purc_ddlv_flg") && (!isNull(r.lot_no())
							|| (isNull(r.lot_no()) && !isNull(asR.lot_no())))) {
						l.add(r);
					}
				}
			}
			if (l.isEmpty())	return;

			MSBFL_MrktJudgService.MrktJudg_Chk01 o = MSBFL_MrktJudgService
					.crtMrktJudg_Chk01();
			setAll(o.up0(), l, createMap_MrktJudg_Chk01_RsltR_ArrSchd_DtlR());
			o.exec();
			copyErrFlg(up0(), o.down0());
		}
		protected Map_MrktJudg_Chk01_RsltR_ArrSchd_DtlR<MrktJudg_Chk01_RsltR,ArrSchd_DtlR> createMap_MrktJudg_Chk01_RsltR_ArrSchd_DtlR() {
			return new Map_MrktJudg_Chk01_RsltR_ArrSchd_DtlR<MrktJudg_Chk01_RsltR, ArrSchd_DtlR>();
		}
		public class Map_MrktJudg_Chk01_RsltR_ArrSchd_DtlR<D extends MrktJudg_Chk01_RsltR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MrktJudg_Chk01_RsltR.$peg_no, ArrSchd_DtlR.$peg_no);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$mrkt_judg_src_no, ArrSchd_DtlR.$arr_schd_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.mrkt_judg_src_typ(MSC_MRKT_JUDG_SRC_TYP.DDLV.value());
				if (isNull(src.lot_no())
					|| MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					dest.mrkt_judg_src_no_del(src.arr_schd_no());
				}
				else {
					MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
					dest.itm_cd(asR.itm_cd());
					dest.itm_sub1(asR.itm_sub1());
					dest.itm_sub2(asR.itm_sub2());
					dest.itm_sub3(asR.itm_sub3());
					dest.lot_no(src.lot_no());
					dest.sublot_no(src.sublot_no());
					dest.base_unit_qty(asR.base_unit_qty());
					dest.base_unit_cd(asR.base_unit_cd());
					if (!isNull(asR.lot_no())) {
						dest.mrkt_judg_src_no_del(src.arr_schd_no());
					}
				}
			}
		}
		protected void callProvSchdChk01() {
			MSBEL_ProvSchdService.ProvSchd_Chk01 o = MSBEL_ProvSchdService.crtProvSchd_Chk01();
			setProvSchdMsg4Upd02(up0(), o.up0());
			
			if (!o.up0().isEmpty()) {
				o.exec();
				copyErrFlg(up0(), o.down0());
			}
		}

		protected void setDown() {
			down0().setAll(up0());
		}
		/**
		 * ロットが一致した場合にTRUEを返却する
		 */
		protected boolean setLotNotChangeFlg(String lot, String oldlot){
			if(isNull(lot) || isNull(oldlot)) {
				return false;
			}
			if(isSame(lot, oldlot)) {
				return true;
			}
			return false;
		}
	}



	// ///////////////////////////////////////////////
	// サービス呼び出し共有（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 市場出荷判定情報サービス.市場出荷判定作成
	 */
	protected void callMrktJudgUpd01(MCList<ArrSchd_DtlR> l) {
		if (l.isEmpty()) return ;
		MSBFL_MrktJudgService.MrktJudg_Upd01 o = MSBFL_MrktJudgService.crtMrktJudg_Upd01();
		setAll(o.up0(), l, createMap_MrktJudg_Chk01_RsltR_ArrSchd_DtlR());
		o.exec();
	}
	protected Map_MrktJudg_Chk01_RsltR_ArrSchd_DtlR<MrktJudg_Chk01_RsltR,ArrSchd_DtlR> createMap_MrktJudg_Chk01_RsltR_ArrSchd_DtlR() {
		return new Map_MrktJudg_Chk01_RsltR_ArrSchd_DtlR<MrktJudg_Chk01_RsltR, ArrSchd_DtlR>();
	}
	public class Map_MrktJudg_Chk01_RsltR_ArrSchd_DtlR<D extends MrktJudg_Chk01_RsltR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.mrkt_judg_src_typ(MSC_MRKT_JUDG_SRC_TYP.DDLV.value());
			dest.peg_no(src.peg_no());
			if (isNull(src.lot_no())
				|| MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
				dest.mrkt_judg_src_no_del(src.arr_schd_no());
			}
			else {
				dest.upd_dt(src.arr_schd_tm().trunc(MCDateFieldType.DAY));
				dest.itm_cd(src.itm_cd());
				dest.itm_sub1(src.itm_sub1());
				dest.itm_sub2(src.itm_sub2());
				dest.itm_sub3(src.itm_sub3());
				dest.lot_no(src.lot_no());
				dest.sublot_no(src.sublot_no());
				dest.loc_cd(src.arr_loc_cd());
				dest.maker_cd(src.maker_cd());
				dest.sppl_cd(src.getStringNE("sppl_cd"));
				dest.base_unit_qty(src.base_unit_qty());
				dest.base_unit_cd(src.base_unit_cd());
				dest.mrkt_judg_src_no(src.arr_schd_no());
				if (!isNull(src.getString(ORG_LOT_NO))) {
					dest.mrkt_judg_src_no_del(src.arr_schd_no());
				}
			}
		}
	}

	/**
	 * 受払予定サービス.受払予定削除サービス
	 */
	protected void callIoSchdDel01(MCList<ArrSchd_DtlR> l) {
		if (l.isEmpty()) return ;
		MSBEL_IoSchdService.IoSchd_Del01 o = MSBEL_IoSchdService.crtIoSchd_Del01();
		MCList<ArrSchd_DtlR>
			Ins01ShipL = MCList.create(ArrSchd_DtlR.class),	// 移動・移送、支給関連のリスト（出荷済）
			Ins01ExL = MCList.create(ArrSchd_DtlR.class);		// 移動・移送、支給関連のリスト（輸出済）

		for (ArrSchd_DtlR r : l) {
			MSW_IO_SCHD_DEL_R delR = MSW_IO_SCHD_DEL_R.create();
			copy(delR, r, createMap_MSW_IO_SCHD_DEL_R_ArrSchd_DtlR());

			// 移動・移送、支給関連
			if (MSC_IO_SCHD_TYP.isXFR_OUT(delR.io_schd_typ())
				|| MSC_IO_SCHD_TYP.isXFR_OUT_PROV(delR.io_schd_typ())) {
				// 輸出後
				if (MSC_IO_SCHD_STS_TYP.isEX(delR.io_schd_sts_typ())) {
					Ins01ExL.add(r);
				}
				// 出荷後
				else {
					Ins01ShipL.add(r);
				}
			}
			else {
				o.up0().add(delR);
			}
		}

		// 移動・移送、支給関連のリスト （出荷済）
		if (!Ins01ShipL.isEmpty()) {
			MCList<MST_SHIP_ACT_D_R> shipActDL = getShipActD(Ins01ShipL);
			MCIndexKey shipkey = shipActDL.createIndex(MST_SHIP_ACT_D_R.$dlv_slip_d_no);
	
			for (ArrSchd_DtlR src : Ins01ShipL) {
				MSW_IO_SCHD_DEL_R base = MSW_IO_SCHD_DEL_R.create();
				copy(base, src, createMap_MSW_IO_SCHD_DEL_R_ArrSchd_DtlR());

				MCList<MST_SHIP_ACT_D_R> shipL = shipActDL.subList(shipkey, src.getString(DLV_SLIP_D_NO_COL));
				
				for (MST_SHIP_ACT_D_R shipR : shipL) {
					MSW_IO_SCHD_DEL_R dest = base.clone();
					dest.io_schd_no(shipR.ship_act_d_no());
					o.up0().add(dest);
				}
			}
		}

		// 移動・移送、支給関連のリスト （輸出済）
		if (!Ins01ExL.isEmpty()) {
			MCList<MST_IV_SHIP_ACT_D_R> ivShipActDL = getIvShipActD(Ins01ExL);
			MCIndexKey ivShipkey = ivShipActDL.createIndex(MST_IV_SHIP_ACT_D_R.$iv_d_no);
	
			for (ArrSchd_DtlR src : Ins01ExL) {
				MSW_IO_SCHD_DEL_R base = MSW_IO_SCHD_DEL_R.create();
				copy(base, src, createMap_MSW_IO_SCHD_DEL_R_ArrSchd_DtlR());
	
				MCList<MST_IV_SHIP_ACT_D_R> ivShipL = ivShipActDL.subList(ivShipkey, src.getString(IV_D_NO_COL));
				
				for (MST_IV_SHIP_ACT_D_R shipR : ivShipL) {
					MSW_IO_SCHD_DEL_R dest = base.clone();
					dest.io_schd_no(shipR.iv_ship_act_d_no());
					o.up0().add(dest);
				}
			}
		}

		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}
	protected Map_MSW_IO_SCHD_DEL_R_ArrSchd_DtlR<MSW_IO_SCHD_DEL_R,ArrSchd_DtlR> createMap_MSW_IO_SCHD_DEL_R_ArrSchd_DtlR() {
		return new Map_MSW_IO_SCHD_DEL_R_ArrSchd_DtlR<MSW_IO_SCHD_DEL_R, ArrSchd_DtlR>();
	}
	public class Map_MSW_IO_SCHD_DEL_R_ArrSchd_DtlR<D extends MSW_IO_SCHD_DEL_R, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			MST_ARR_PR_R apR = getArrPrR(src.arr_pr_no());
			MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());

			// 仕入・経費購買
			if (MAC_TRD_PTN_TYP.isPURC(apR.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isPURC_XPNS(apR.trd_ptn_typ())) {
				MAM_LOC_R locR = getLocR(asR.arr_loc_cd());
				// 無償受給、VMI
				if (MAC_PURC_ID_TYP.isFFR_RCV(src.purc_id_typ()) || MAC_PURC_ID_TYP.isVMI(src.purc_id_typ())) {
					if (!isNull(locR.sppl_cd())) {
						dest.io_schd_typ(MSC_IO_SCHD_TYP.ARR_PROV.value());
					}
					else {
						dest.io_schd_typ(MSC_IO_SCHD_TYP.ARR.value());
					}
				}
				// 無償受給、VMI以外
				else {
					if (apR.purc_ddlv_flg()) {
						dest.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR_DDLV.value());
					}
					else if (!isNull(locR.sppl_cd())) {
						dest.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR_PROV.value());
					}
					else {
						dest.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR.value());
					}
				}
				if (!isNull(asR.dlv_inst_d_no())) {
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.DLV_INST.value());
				}
				else if (!isNull(asR.prms_rcpt_d_no())) {
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.PRMS.value());
				}
				else {
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.PO.value());
				}
				dest.io_schd_no(asR.arr_schd_no());
			}
			// 売上返品
			else if (MAC_TRD_PTN_TYP.isSLS_RTN(apR.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.SLS_RTN_GR.value());
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
				dest.io_schd_no(asR.arr_schd_no());
			}
			// 出荷返品
			else if (MAC_TRD_PTN_TYP.isSHIP_RTN(apR.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.SHIP_RTN_GI.value());
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
				dest.io_schd_no(asR.arr_schd_no());
			}
			// その他
			else {
				if (MAC_TRD_PTN_TYP.isPROV(apR.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isPROV_RTN(apR.trd_ptn_typ())) {
					dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_OUT_PROV.value());
				}
				else {
					dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_OUT.value());
				}
				dest.io_schd_no(asR.arr_schd_no());
				// 輸出後
				if (!isNull(apR.iv_d_no())) {
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.EX.value());
				}
				// 出荷後
				else {
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SHIP.value());
				}
			}

			dest.io_schd_seq(null);
		}
	}

	/**
	 * 受払予定管理サービス.追加
	 * 
	 * @param Ins01SlsRetL 売上返品のリスト
	 * @param Ins01ShipRetKL 出荷返品（貸出）のリスト
	 * @param Ins01ShipRetOL 出荷返品（乙仲・未売上）のリスト
	 * @param Ins01ShipL 移動・移送、支給関連のリスト （出荷済）
	 * @param Ins01ExL 移動・移送、支給関連のリスト （輸出済）
	 * @param Ins01OthL その他のリスト
	 */
	protected void callIoSchdIns01(
			MCList<ArrSchd_DtlR> Ins01SlsRetL,
			MCList<ArrSchd_DtlR> Ins01ShipRetKL,
			MCList<ArrSchd_DtlR> Ins01ShipRetOL,
			MCList<ArrSchd_DtlR> Ins01ShipL,
			MCList<ArrSchd_DtlR> Ins01ExL,
			MCList<ArrSchd_DtlR> Ins01OthL) {

		// その他（売上返品・転出以外）
		MSBEL_IoSchdService.IoSchd_Ins01 o = MSBEL_IoSchdService.crtIoSchd_Ins01();
		MSBEL_IoSchdService.IoSchd_Del01 delOpe = MSBEL_IoSchdService.crtIoSchd_Del01();

		for (ArrSchd_DtlR src : Ins01OthL) {
			IoSchd_Ins01_DtlR base = IoSchd_Ins01_DtlR.create();
			copy(base, src, createMap_IoSchd_Ins01_DtlR_ArrSchd_DtlR());

			// 数量が０以下の場合は作成しない
			if (base.base_unit_qty().lte(MCNumber.ZERO)) {
				continue;
			}

			o.up0().add(base);
		}

		// 売上返品
		MCList<MST_ARR_ACT_R> arrActL = getArrAct(Ins01SlsRetL);
		MCIndexKey arrActkey = arrActL.createIndex(MST_ARR_ACT_R.$arr_schd_no);
		
		for (ArrSchd_DtlR src : Ins01SlsRetL) {
			MST_ARR_PR_R apR = getArrPrR(src.arr_pr_no());
			MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());

			IoSchd_Ins01_DtlR base = IoSchd_Ins01_DtlR.create();
			copy(base, src, createMap_IoSchd_Ins01_DtlR_ArrSchd_DtlR());
			
			MCList<MST_ARR_ACT_R> actL = arrActL.subList(arrActkey, src.arr_schd_no());

			// 入荷済み数
			MCNumber arredQty = MCNumber.ZERO;

			// 売上返品出庫の作成
			for (MST_ARR_ACT_R actR : actL) {
				IoSchd_Ins01_DtlR dest = base.clone();
				dest.io_schd_typ(MSC_IO_SCHD_TYP.SLS_RTN_GI.value());
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ARR.value());
				dest.io_schd_no(actR.arr_act_no());
				dest.stk_arrv_bp_cd(apR.ret_stk_arrv_bp_cd());
				if (isNull(src.accpt_schd_dt())) {
					dest.schd_dt(asR.getDate("sls_ret_schd_dt"));
				}
				else {
					dest.schd_dt(src.accpt_schd_dt());
				}
				dest.lot_no(actR.lot_no());
				dest.sublot_no(actR.sublot_no());
				dest.loc_cd(actR.arr_loc_cd());
				dest.str_ln_cd(actR.str_ln_cd());
				dest.base_unit_qty(actR.base_unit_qty().subtract(actR.getNumber("sls_ret_qty")));

				arredQty = arredQty.add(actR.base_unit_qty());
				dest.stk_id_typ(MSC_STK_ID_TYP.RTN_PRE_ACCPT.value());
				dest.stk_bp_cd(apR.cst_cd());

				// 全数売上済み（数量が０以下）の場合は削除する
				if (dest.base_unit_qty().isPositive()) {
					o.up0().add(dest);
				}
			}
			
			// 売上返品入庫の作成
			IoSchd_Ins01_DtlR dest = base.clone();
			dest.base_unit_qty(asR.base_unit_qty().subtract(arredQty));
			
			// 数量が０以下もしくは入荷完了の場合は作成しない
			if (dest.base_unit_qty().lte(MCNumber.ZERO) || asR.cmpl_flg()) {
				continue;
			}

			dest.io_schd_typ(MSC_IO_SCHD_TYP.SLS_RTN_GR.value());
			dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
			dest.io_schd_no(asR.arr_schd_no());
			dest.stk_arrv_bp_cd(null);
			if (isNull(src.accpt_schd_dt())) {
				dest.accpt_schd_dt(asR.getDate("sls_ret_schd_dt"));
			}
			else {
				dest.accpt_schd_dt(src.accpt_schd_dt());
			}
			dest.loc_cd(asR.arr_loc_cd());
			dest.str_ln_cd(asR.str_ln_cd());
			dest.stk_id_typ(asR.stk_id_typ());

			o.up0().add(dest);
		}

		// 出荷返品（貸出）
		// 現状在庫のキャッシュ
		initStkL(Ins01ShipRetKL);
		for (ArrSchd_DtlR src : Ins01ShipRetKL) {
			MST_ARR_PR_R apR = getArrPrR(src.arr_pr_no());
			MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());

			IoSchd_Ins01_DtlR base = IoSchd_Ins01_DtlR.create();
			copy(base, src, createMap_IoSchd_Ins01_DtlR_ArrSchd_DtlR());

			MCNumber orgArrQty = nvl(src.getNumberNE(ORG_ARR_QTY), MCNumber.ZERO);
			if (orgArrQty.isPositive()) {
				// 訂正前の入荷数量＞０の場合、予定数量からの差分で作成する
				// ※入荷済みの在庫を貸出在庫に戻すので、在庫を考慮する必要はない
				MCNumber arrSchdQty = asR.base_unit_qty().subtract(src.arr_qty());
				if (arrSchdQty.isPositive()) {
					IoSchd_Ins01_DtlR dest = base.clone();
					dest.base_unit_qty(arrSchdQty);
					o.up0().add(dest);
				}
			}
			else {
				// 訂正前の入荷数量≦０の場合、入荷(受払)予定を新たに作成するので
				// 予定数量分の貸出在庫があるかを考慮する必要がある
				MCNumber arrSchdQty = asR.base_unit_qty().subtract(src.arr_qty());
	
				MCList<MST_STK_R> list = getStkL(apR, asR);
				// ロットＮＯ・サブロットＮＯがnullでなければ絞り込む
				if (!isNull(asR.lot_no())) {
					list = list.subList(MST_STK_R.$lot_no, asR.lot_no());
				}
				if (!isNull(asR.sublot_no())) {
					list = list.subList(MST_STK_R.$sublot_no, asR.sublot_no());
				}
				for (MST_STK_R stkR : list) {
					if (arrSchdQty.lte(MCNumber.ZERO)) {
						break;
					}
					if(stkR.base_unit_qty().lte(MCNumber.ZERO)) {
						continue;
					}
	
					IoSchd_Ins01_DtlR dest = base.clone();
					dest.loc_cd(stkR.loc_cd());
					dest.str_ln_cd(stkR.str_ln_cd());
					dest.gd_cd(stkR.gd_cd());
					if (stkR.base_unit_qty().lte(arrSchdQty)) {
						dest.base_unit_qty(stkR.base_unit_qty());
						arrSchdQty = arrSchdQty.subtract(stkR.base_unit_qty());
						stkR.base_unit_qty(MCNumber.ZERO);
					}
					else {
						dest.base_unit_qty(arrSchdQty);
						stkR.base_unit_qty(stkR.base_unit_qty().subtract(arrSchdQty));
						arrSchdQty = MCNumber.ZERO;
					}
					o.up0().add(dest);
				}
	
				if (arrSchdQty.isPositive()) {
					throw new MCAppException(MSBEL0175);
				}
			}
		}

		// 出荷返品（未売上・乙仲）
		// 出荷実績明細のキャッシュ
		initShipActDL(Ins01ShipRetOL);
		for (ArrSchd_DtlR src : Ins01ShipRetOL) {
			MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
			MCList<MST_SHIP_ACT_D_R> list = getShipActDL(src);

			// ロット、サブロット、返品元格付による絞り込み
			if (!isNullOrNullVal(src.lot_no())) {
				list = list.subList(
					new String[]{"lot_no", "sublot_no"},
					new Comparable[]{src.lot_no(), src.sublot_no()});
			}
			if (!isNull(src.ret_gd_cd())) {
				list = list.subList("gd_cd", src.ret_gd_cd());
			}

			// ソート
			list.sort(MST_SHIP_ACT_D_R.$ship_act_d_no);

			IoSchd_Ins01_DtlR base = IoSchd_Ins01_DtlR.create();
			copy(base, src, createMap_IoSchd_Ins01_DtlR_ArrSchd_DtlR());
			
			MCNumber arrSchdQty = asR.base_unit_qty();
			MCNumber arrQty = asR.arr_qty();

			// 出荷実績明細を消し込めた分で受払予定を作成する
			for (MST_SHIP_ACT_D_R shipActDR : list) {
				if (!shipActDR.base_unit_qty().isPositive()) {
					// 消し込み済みは対象外
					continue;
				}
				if (arrSchdQty.lte(MCNumber.ZERO)) {
					break;
				}
				if (shipActDR.base_unit_qty().lte(arrQty)) {
					arrSchdQty = arrSchdQty.subtract(shipActDR.base_unit_qty());
					arrQty = arrQty.subtract(shipActDR.base_unit_qty());
					shipActDR.base_unit_qty(0);	// 消し込み済み
					continue;
				}

				IoSchd_Ins01_DtlR dest = base.clone();
				dest.loc_cd(shipActDR.ship_loc_cd());
				dest.str_ln_cd(shipActDR.ship_str_ln_cd());
				dest.gd_cd(shipActDR.gd_cd());
				if (shipActDR.base_unit_qty().lte(arrSchdQty)) {
					dest.base_unit_qty(shipActDR.base_unit_qty());
					arrSchdQty = arrSchdQty.subtract(shipActDR.base_unit_qty());
					shipActDR.base_unit_qty(0);	// 消し込み済み
				}
				else {
					dest.base_unit_qty(arrSchdQty);

					// 予定数を消し込み
					shipActDR.base_unit_qty(shipActDR.base_unit_qty().subtract(arrSchdQty));
					arrSchdQty = MCNumber.ZERO;
				}
				if (arrQty.isPositive()) {
					dest.base_unit_qty(dest.base_unit_qty().subtract(arrQty));
					arrQty = MCNumber.ZERO;
				}
				o.up0().add(dest);
			}
			if (arrSchdQty.isPositive()) {
				throw new MCAppException(MSBEL0240);
			}
		}
		
		// 移動・移送、支給関連のリスト （出荷済）
		MCList<MST_SHIP_ACT_D_R>
				shipActDL = getShipActD(Ins01ShipL).subList(r -> !r.can_flg());
		MCIndexKey shipkey = shipActDL.createIndex(MST_SHIP_ACT_D_R.$dlv_slip_d_no);

		for (ArrSchd_DtlR src : Ins01ShipL) {
			MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
			IoSchd_Ins01_DtlR base = IoSchd_Ins01_DtlR.create();
			copy(base, src, createMap_IoSchd_Ins01_DtlR_ArrSchd_DtlR());

			// 数量が０以下の場合は作成しない
			if (base.base_unit_qty().lte(MCNumber.ZERO)) {
				continue;
			}

			MCList<MST_SHIP_ACT_D_R> shipL = shipActDL.subList(shipkey, src.getString(DLV_SLIP_D_NO_COL));
			
			MCNumber arrSchdQty = base.base_unit_qty();
			for (MST_SHIP_ACT_D_R shipR : shipL) {
				IoSchd_Ins01_DtlR dest = base.clone();
				dest.io_schd_no(shipR.ship_act_d_no());
				dest.loc_cd(shipR.ship_loc_cd());
				dest.str_ln_cd(shipR.ship_str_ln_cd());

				// 支給返品または計上後のVMI品の移送・支給
				if (MAC_TRD_PTN_TYP.isPROV_RTN(shipR.trd_ptn_typ())
					|| (MSC_STK_ID_TYP.isRNT_RCV(shipR.stk_id_typ())
						&& MSC_STK_ID_TYP.isCOSTK(asR.stk_id_typ()))) {
					dest.stk_arrv_bp_cd(asR.stk_arrv_bp_cd());
					dest.stk_id_typ(asR.stk_id_typ());
					dest.stk_bp_cd(asR.stk_bp_cd());
				}
				else {
					dest.stk_arrv_bp_cd(shipR.stk_arrv_bp_cd());
					dest.stk_id_typ(shipR.stk_id_typ());
					dest.stk_bp_cd(shipR.stk_bp_cd());
				}

				if (arrSchdQty.lte(MCNumber.ZERO)) {
					continue;
				}
				else if (arrSchdQty.gte(shipR.base_unit_qty())) {
					dest.base_unit_qty(shipR.base_unit_qty());
					dest.trd_unit_qty(shipR.trd_unit_qty());
					dest.trd_unit_cd(shipR.trd_unit_cd());
					arrSchdQty = arrSchdQty.subtract(shipR.base_unit_qty());
				}
				else {
					dest.base_unit_qty(arrSchdQty);
					arrSchdQty = MCNumber.ZERO;
				}
				o.up0().add(dest);
			}
		}

		// 移動・移送、支給関連のリスト （輸出済）
		MCList<MST_IV_SHIP_ACT_D_R> ivShipActDL = getIvShipActD(Ins01ExL);
		MCIndexKey ivShipkey = ivShipActDL.createIndex(
			MST_IV_SHIP_ACT_D_R.$iv_d_no, MST_SHIP_ACT_D_R.$dlv_slip_d_no);

		for (ArrSchd_DtlR src : Ins01ExL) {
			MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
			IoSchd_Ins01_DtlR base = IoSchd_Ins01_DtlR.create();
			copy(base, src, createMap_IoSchd_Ins01_DtlR_ArrSchd_DtlR());

			// 数量が０以下の場合は作成しない
			if (base.base_unit_qty().lte(MCNumber.ZERO)) {
				continue;
			}

			MCList<MST_IV_SHIP_ACT_D_R>
				ivShipL = ivShipActDL.subList(ivShipkey, src.getString(IV_D_NO_COL), src.getString(DLV_SLIP_D_NO_COL));
			
			MCNumber arrSchdQty = base.base_unit_qty();
			for (MST_IV_SHIP_ACT_D_R shipR : ivShipL) {
				IoSchd_Ins01_DtlR dest = base.clone();
				dest.io_schd_no(shipR.iv_ship_act_d_no());
				dest.loc_cd(shipR.ship_loc_cd());
				dest.str_ln_cd(shipR.ship_str_ln_cd());
				dest.tdlv_cd(shipR.getString("tdlv_cd"));

				// 支給返品または計上後のVMI品の移送・支給
				if (MAC_TRD_PTN_TYP.isPROV_RTN(shipR.getString("trd_ptn_typ"))
					|| (MSC_STK_ID_TYP.isRNT_RCV(shipR.stk_id_typ())
						&& MSC_STK_ID_TYP.isCOSTK(asR.stk_id_typ()))) {
					dest.stk_arrv_bp_cd(asR.stk_arrv_bp_cd());
					dest.stk_id_typ(asR.stk_id_typ());
					dest.stk_bp_cd(asR.stk_bp_cd());
				}
				else {
					dest.stk_arrv_bp_cd(shipR.stk_arrv_bp_cd());
					dest.stk_id_typ(shipR.stk_id_typ());
					dest.stk_bp_cd(shipR.stk_bp_cd());
				}

				if (arrSchdQty.lte(MCNumber.ZERO)) {
					delOpe.up0().add(dest.io_schd());
					continue;
				}
				else if (arrSchdQty.gte(shipR.base_unit_qty())) {
					dest.base_unit_qty(shipR.base_unit_qty());
					dest.trd_unit_qty(shipR.trd_unit_qty());
					dest.trd_unit_cd(shipR.trd_unit_cd());
					arrSchdQty = arrSchdQty.subtract(shipR.base_unit_qty());
				}
				else {
					dest.base_unit_qty(arrSchdQty);
					arrSchdQty = MCNumber.ZERO;
				}
				o.up0().add(dest);
			}
		}

		// 追加前に削除実行
		for (IoSchd_Ins01_DtlR r: o.up0()) {
			MSW_IO_SCHD_DEL_R row = MSW_IO_SCHD_DEL_R.create();
			row = r.io_schd();
			delOpe.up0().add(row);
		}
		delOpe.exec();

		o.exec();
	}		
	protected Map_IoSchd_Ins01_DtlR_ArrSchd_DtlR<IoSchd_Ins01_DtlR,ArrSchd_DtlR> createMap_IoSchd_Ins01_DtlR_ArrSchd_DtlR() {
		return new Map_IoSchd_Ins01_DtlR_ArrSchd_DtlR<IoSchd_Ins01_DtlR, ArrSchd_DtlR>();
	}
	public class Map_IoSchd_Ins01_DtlR_ArrSchd_DtlR<D extends IoSchd_Ins01_DtlR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_pr_no, ArrSchd_DtlR.$io_schd_pr_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_cd, ArrSchd_DtlR.$itm_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub1, ArrSchd_DtlR.$itm_sub1);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub2, ArrSchd_DtlR.$itm_sub2);
			addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub3, ArrSchd_DtlR.$itm_sub3);
			addColumnPathMap(IoSchd_Ins01_DtlR.$ver_no, ArrSchd_DtlR.$ver_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$loc_cd, ArrSchd_DtlR.$arr_loc_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$str_ln_cd, ArrSchd_DtlR.$str_ln_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$stk_arrv_bp_cd, ArrSchd_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$lot_no, ArrSchd_DtlR.$lot_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sublot_no, ArrSchd_DtlR.$sublot_no);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno1, ArrSchd_DtlR.$sno1);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno2, ArrSchd_DtlR.$sno2);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno3, ArrSchd_DtlR.$sno3);
			addColumnPathMap(IoSchd_Ins01_DtlR.$sno4, ArrSchd_DtlR.$sno4);
			addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_cd, ArrSchd_DtlR.$trd_unit_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_cd, ArrSchd_DtlR.$base_unit_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$gd_cd, ArrSchd_DtlR.$gd_cd);
			addColumnPathMap(IoSchd_Ins01_DtlR.$quality_typ, ArrSchd_DtlR.$quality_typ);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			MST_ARR_PR_R apR = getArrPrR(src.arr_pr_no());
			MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
			
			dest.io_schd_pr_no(asR.io_schd_pr_no());
			dest.itm_cd(asR.itm_cd());
			dest.itm_sub1(asR.itm_sub1());
			dest.itm_sub2(asR.itm_sub2());
			dest.itm_sub3(asR.itm_sub3());
			dest.ver_no(asR.ver_no());
			dest.loc_cd(asR.arr_loc_cd());
			dest.str_ln_cd(asR.str_ln_cd());
			dest.stk_arrv_bp_cd(asR.stk_arrv_bp_cd());
			dest.lot_no(asR.lot_no());
			dest.sublot_no(asR.sublot_no());
			dest.sno1(asR.sno1());
			dest.sno2(asR.sno2());
			dest.sno3(asR.sno3());
			dest.sno4(asR.sno4());
			dest.trd_unit_cd(asR.trd_unit_cd());
			dest.base_unit_cd(asR.base_unit_cd());
			dest.gd_cd(asR.gd_cd());
			dest.quality_typ(asR.quality_typ());
			dest.schd_dt(asR.arr_schd_tm().trunc(MCDateFieldType.DAY));
			dest.rsn_cd(apR.rsn_cd());

			// 仕入・経費購買
			if (MAC_TRD_PTN_TYP.isPURC(apR.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isPURC_XPNS(apR.trd_ptn_typ())) {
				
				MST_PO_D_R pdR = getPoDR(apR.po_d_no());
				
				MAM_LOC_R locR = getLocR(asR.arr_loc_cd());
				// 無償受給、VMI
				if (MAC_PURC_ID_TYP.isFFR_RCV(src.purc_id_typ()) || MAC_PURC_ID_TYP.isVMI(src.purc_id_typ())) {
					if (!isNull(locR.sppl_cd())) {
						dest.io_schd_typ(MSC_IO_SCHD_TYP.ARR_PROV.value());
					}
					else {
						dest.io_schd_typ(MSC_IO_SCHD_TYP.ARR.value());
					}
				}
				// 無償受給、VMI以外
				else {
					if (apR.purc_ddlv_flg()) {
						dest.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR_DDLV.value());
					}
					else if (!isNull(locR.sppl_cd())) {
						if (isPurcUnFixed(asR)) {
							dest.io_schd_typ(MSC_IO_SCHD_TYP.ARR_PROV.value());
						}
						else {
							dest.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR_PROV.value());
						}
					}
					else if (isPurcUnFixed(asR)) {
						dest.io_schd_typ(MSC_IO_SCHD_TYP.ARR.value());
					}
					else {
						dest.io_schd_typ(MSC_IO_SCHD_TYP.PURC_GR.value());
					}
					if (isNull(src.accpt_schd_dt())) {
						dest.accpt_schd_dt(asR.getDate("purc_schd_dt"));
					}
					else {
						dest.accpt_schd_dt(src.accpt_schd_dt());
					}
				}

				// 受払予定状況区分
				if (isPurcUnFixed(asR)) {
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.PURC.value());
				}
				else if (!isNull(asR.dlv_inst_d_no())) {
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.DLV_INST.value());
				}
				else if (!isNull(asR.prms_rcpt_d_no())) {
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.PRMS.value());
				}
				else {
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.PO.value());
				}

				// 受払予定予備区分１：発注ＮＯ
				dest.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.PO_NO.value());
				dest.io_schd_sub_no1(pdR.po_no());
				// 受払予定予備区分２：発注明細ＮＯ
				dest.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.PO_D_NO.value());
				dest.io_schd_sub_no2(apR.po_d_no());
				// 受払予定予備区分３：製造指図ＮＯ（仕入入庫・仕入入庫（支給）のとき）
				if ((MSC_IO_SCHD_TYP.isPURC_GR_PROV(dest.io_schd_typ())
						|| MSC_IO_SCHD_TYP.isPURC_GR(dest.io_schd_typ()))
						&& src.outsrc_flg()) {
					dest.io_schd_sub_typ3(MSC_IO_SCHD_SUB_TYP.MFG_INST_NO.value());
					dest.io_schd_sub_no3(asR.mfg_inst_no());
					dest.itm_mfg_inst_no(asR.getStringNE("itm_mfg_inst_no"));
					dest.mfg_inst_unit_typ(asR.getStringNE("mfg_inst_unit_typ"));
				}

				dest.io_schd_no(asR.arr_schd_no());
				dest.insp_cmpl_schd_dt(src.getDate(INSP_END_DT_COL));
				dest.stk_id_typ(asR.stk_id_typ());
				dest.stk_bp_cd(asR.stk_bp_cd());
				dest.sppl_cd(apR.sppl_cd());
			}
			// 売上返品
			else if (MAC_TRD_PTN_TYP.isSLS_RTN(apR.trd_ptn_typ())) {
				// 受払予定予備区分１：売上返品予定明細ＮＯ
				dest.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.SLS_RET_SCHD_D_NO.value());
				dest.io_schd_sub_no1(apR.sls_ret_schd_d_no());
				// 受払予定予備区分３：入荷予定ＮＯ
				dest.io_schd_sub_typ3(MSC_IO_SCHD_SUB_TYP.ARR_SCHD_NO.value());
				dest.io_schd_sub_no3(src.arr_schd_no());
			}
			// 出荷返品
			else if (MAC_TRD_PTN_TYP.isSHIP_RTN(apR.trd_ptn_typ())) {
				dest.io_schd_typ(MSC_IO_SCHD_TYP.SHIP_RTN_GI.value());
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
				dest.io_schd_no(asR.arr_schd_no());
				dest.stk_arrv_bp_cd(apR.ret_stk_arrv_bp_cd());
				dest.stk_id_typ(asR.stk_id_typ());
				dest.gr_loc_cd(asR.arr_loc_cd());
				dest.gr_str_ln_cd(asR.str_ln_cd());
				dest.gr_gd_cd(asR.gd_cd());
				
				// 貸出返品
				if (isNull(apR.ret_dlv_slip_d_no())) {
					dest.dlv_cd(apR.ret_stk_arrv_bp_cd());
				}
				// 乙仲・未売上返品
				else {
					if (isNull(asR.getStringNE("tdlv_cd"))) {
						dest.dlv_cd(apR.ret_stk_arrv_bp_cd());
					}
				}
				// 受払予定予備区分１：売上返品予定明細ＮＯ
				dest.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.SLS_RET_SCHD_D_NO.value());
				dest.io_schd_sub_no1(apR.sls_ret_schd_d_no());
				// 受払予定予備区分３：入荷予定ＮＯ
				dest.io_schd_sub_typ3(MSC_IO_SCHD_SUB_TYP.ARR_SCHD_NO.value());
				dest.io_schd_sub_no3(src.arr_schd_no());
			}
			// その他
			else {
				if (MAC_TRD_PTN_TYP.isPROV(apR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(apR.trd_ptn_typ())) {
					dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_OUT_PROV.value());
				}
				else {
					dest.io_schd_typ(MSC_IO_SCHD_TYP.XFR_OUT.value());
				}
				dest.gr_loc_cd(asR.arr_loc_cd());
				dest.gr_str_ln_cd(asR.str_ln_cd());
				dest.gr_schd_dt(asR.arr_schd_tm());
				dest.trd_ptn_typ(apR.trd_ptn_typ());

				// 受払予定予備区分１：納品書明細ＮＯ
				dest.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.DLV_SLIP_D_NO.value());
				dest.io_schd_sub_no1(apR.dlv_slip_d_no());
				// 受払予定予備区分３：入荷予定ＮＯ
				dest.io_schd_sub_typ3(MSC_IO_SCHD_SUB_TYP.ARR_SCHD_NO.value());
				dest.io_schd_sub_no3(src.arr_schd_no());

				// 輸出済
				if (!isNull(apR.iv_d_no())) {
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.EX.value());
					MST_IV_D_R idR = getIvDR(apR.iv_d_no());
					MCDate dt = idR.getDate("eta_dt");
					dest.schd_dt(dt);
				}
				// 出荷済
				else {
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SHIP.value());
				}
			}

			dest.io_schd_seq(null);

			// 基準単位数量（仕入・経費購買以外ははこの後で再設定している）
			dest.base_unit_qty(asR.base_unit_qty().subtract(asR.arr_qty()));

			dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			dest.prov_typ(asR.getString("prov_typ"));
			dest.prov_basis_typ(asR.getString("prov_basis_typ"));

		}
	}
	
	/**
	 * 未着品か判定する。<BR>
	 * 本メソッドは、未入荷分の受払予定を作成する際に呼び出されるため、仕入数量のみで未着品かどうかを判断する。
	 * @param asR 入荷予定
	 * @return 未着品の場合はtrue
	 */
	protected boolean isPurcUnFixed(MST_ARR_SCHD_R asR) {
		return asR.purc_qty().gt(asR.arr_qty());
	}
	
	/**
	 * 入荷実績のデータを取得します。<br>
	 * （入荷予定ＮＯが一致するもの）
	 * @param bindL 「arr_schd_no」に入荷予定ＮＯを格納したリスト
	 * @return 入荷実績のデータ
	 */
	protected MCList<MST_ARR_ACT_R> getArrAct(MCList<ArrSchd_DtlR> bindL) {

		MCList<MST_ARR_ACT_R> dbc = MCList.create(MST_ARR_ACT_R.class);
		MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MSW_ARR_SCHD_KEY_R t1 = MSW_ARR_SCHD_KEY_R.create("T1");
		MCTempView t2 = createTempView("T2");
		MSW_ARR_SCHD_KEY_R S1W = MSW_ARR_SCHD_KEY_R.create("W");
		MST_ARR_ACT_R S1W1 = MST_ARR_ACT_R.create("W1");
		MST_SLS_ACT_IO_R S1W2 = MST_SLS_ACT_IO_R.create("W2");
		MST_SLS_ACT_D_R S1W3 = MST_SLS_ACT_D_R.create("W3");
		MST_SLS_ACT_R S1W4 = MST_SLS_ACT_R.create("W4");
		dbc_bldr.setSelect(t.arr_act_no, t.arr_schd_no, t.lot_no, t.sublot_no,
				t.arr_loc_cd, t.str_ln_cd, t.base_unit_qty,
				nvl(t2.pr("sls_ret_qty"), value(0)).as("sls_ret_qty"));
		dbc_bldr.addInnerJoin(t1, bracket(t1.arr_schd_no.eq(t.arr_schd_no)));
		dbc_bldr.addLeftOuterJoin(
				subQuery()
						.select(S1W1.arr_act_no,
								sum(S1W2.base_unit_qty).as("sls_ret_qty"))
						.from(S1W.innerJoin(S1W1)
								.on(bracket(S1W1.arr_schd_no.eq(S1W.arr_schd_no)
										.and(S1W1.can_flg.eq(value(false)))))
								.innerJoin(S1W2)
								.on(bracket(S1W2.arr_act_no.eq(S1W1.arr_act_no)))
								.innerJoin(S1W3)
								.on(bracket(S1W3.sls_act_d_no.eq(S1W2.sls_act_d_no)
										.and(S1W3.sls_act_d_seq.eq(S1W2.sls_act_d_seq))))
								.innerJoin(S1W4)
								.on(bracket(S1W4.sls_act_no.eq(S1W3.sls_act_no)
										.and(S1W4.sls_act_seq.eq(S1W3.sls_act_seq))
										.and(S1W4.slip_sts_typ.eq(
												value(MAC_SLIP_STS_TYP.CRT.value()))))))
						.groupBy(S1W1.arr_act_no).view(t2),
				bracket(t2.pr(S1W1.arr_act_no).eq(t.arr_act_no)));
		dbc_bldr.setWhere(t.can_flg.eq(value(false)));
		if (insArrSchdWk(bindL)) {
			dbSelect("MSBEL5900_MST_ARR_ACT_S03", dbc, dbc_bldr);
		}
		return dbc;
	}
	/**
	 * 出荷実績明細のデータを取得します。<br>
	 * （出荷実績明細ＮＯが一致するもの）
	 * @param bindL 「_dlv_slip_d_no」に出荷実績明細ＮＯを格納したリスト
	 * @return 出荷実績明細のデータ
	 */
	protected MCList<MST_SHIP_ACT_D_R> getShipActD(MCList<ArrSchd_DtlR> bindL) {
		MCList<MST_SHIP_ACT_D_R> dbc = MCList.create(MST_SHIP_ACT_D_R.class);
		MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MST_PROV_ACT_R t2 = MST_PROV_ACT_R.create("T2");
		dbc_bldr.setSelect(
				t.ship_act_d_no,
				t.dlv_slip_d_no,
				t.stk_arrv_bp_cd,
				t.ship_loc_cd,
				t.ship_str_ln_cd,
				t.stk_id_typ,
				t.stk_bp_cd,
				t.trd_unit_qty,
				t.trd_unit_cd,
				t.base_unit_qty,
				t.base_unit_cd,
				t.can_flg,
				nvl(t2.trd_ptn_typ, t.trd_ptn_typ).as("trd_ptn_typ")
		);
		dbc_bldr.addLeftOuterJoin(t2,
				bracket(t2.prov_src_act_typ
						.eq(value(MSC_PROV_SRC_ACT_TYP.RET_SHIP.value()))
						.and(t2.prov_src_act_no.eq(t.ship_act_d_no))
						.and(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
		dbc_bldr.setWhere(t.dlv_slip_d_no.eq(bind("_dlv_slip_d_no")));
		//dbc.addWhere("AND T.can_flg = '0'");	// 受払予定の削除で参照するので取消フラグは不要
		dbc_bldr.setOrderByDesc(t.ship_act_d_no);
		dbSelect("MSBEL5900_MST_SHIP_ACT_D_S01", dbc, dbc_bldr, bindL);
		return dbc;
	}
	/**
	 * インボイス出荷実績明細のデータを取得します。<br>
	 * （インボイス明細ＮＯが一致するもの）
	 * @param bindL 「_iv_d_no」にインボイス明細ＮＯを格納したリスト
	 * @return インボイス出荷実績明細のデータ
	 */
	protected MCList<MST_IV_SHIP_ACT_D_R> getIvShipActD(MCList<ArrSchd_DtlR> bindL) {
		MCList<MST_IV_SHIP_ACT_D_R> dbc = MCList.create(MST_IV_SHIP_ACT_D_R.class);
		MST_IV_SHIP_ACT_D_R t = MST_IV_SHIP_ACT_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MST_IV_R t1 = MST_IV_R.create("T1");
		MST_SHIP_ACT_D_R t2 = MST_SHIP_ACT_D_R.create("T2");
		MST_PROV_ACT_R t3 = MST_PROV_ACT_R.create("T3");
		dbc.addStringColumn("tdlv_cd");
		dbc.addStringColumn("dlv_slip_d_no");
		dbc.addStringColumn("trd_ptn_typ");
		dbc_bldr.setSelect(
				t.iv_ship_act_d_no,
				t.iv_d_no,
				t.stk_arrv_bp_cd,
				t.ship_loc_cd,
				t.ship_str_ln_cd,
				t.stk_id_typ,
				t.stk_bp_cd,
				t.trd_unit_qty,
				t.trd_unit_cd,
				t.base_unit_qty,
				t.base_unit_cd,
				t1.tdlv_cd,
				t2.dlv_slip_d_no, nvl(t3.trd_ptn_typ, t2.trd_ptn_typ).as("trd_ptn_typ")
		);
		dbc_bldr.addInnerJoin(t1, bracket(t1.iv_no.eq(t.iv_no)));
		dbc_bldr.addInnerJoin(t2, bracket(
				t2.ship_act_d_no.eq(t.ship_act_d_no)
				.and(t2.can_flg.eq(value(false)))));
		dbc_bldr.addLeftOuterJoin(t3,
				bracket(t3.prov_src_act_typ
						.eq(value(MSC_PROV_SRC_ACT_TYP.RET_SHIP.value()))
						.and(t3.prov_src_act_no.eq(t2.ship_act_d_no))
						.and(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
		dbc_bldr.setWhere(t.iv_d_no.eq(bind("_iv_d_no")));
		dbc_bldr.setOrderByDesc(t.iv_ship_act_d_no);
		dbSelect("MSBEL5900_MST_IV_SHIP_ACT_D_S01", dbc, dbc_bldr, bindL);
		return dbc;
	}

	/**
	 * 検査予定サービス.品管関連マスタ取得
	 */
	protected void callInspSchdSrch01(MCList<ArrSchd_DtlR> l) {
		if (l.isEmpty()) return ;
		MSBFL_InspSchdService.InspSchd_Srch01 o = MSBFL_InspSchdService.crtInspSchd_Srch01();
		setAll(o.up0(), l, createMap_InspSchd_Srch01_CndR_ArrSchd_DtlR());
		o.exec();
		// 検査パタンＣＤ設定
		String[] destCols = new String[]{INSP_PTN_CD_COL};
		String[] srcCols = new String[]{"insp_ptn_cd"};
		copyByPegNo(l, o.down0(), UP1_PEG_NO_COL, destCols, "peg_no", srcCols);
	}
	protected Map_InspSchd_Srch01_CndR_ArrSchd_DtlR<InspSchd_Srch01_CndR,ArrSchd_DtlR> createMap_InspSchd_Srch01_CndR_ArrSchd_DtlR() {
		return new Map_InspSchd_Srch01_CndR_ArrSchd_DtlR<InspSchd_Srch01_CndR, ArrSchd_DtlR>();
	}
	public class Map_InspSchd_Srch01_CndR_ArrSchd_DtlR<D extends InspSchd_Srch01_CndR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspSchd_Srch01_CndR.$peg_no, UP1_PEG_NO_COL);
			addColumnPathMap(InspSchd_Srch01_CndR.$itm_cd, ArrSchd_DtlR.$itm_cd);
			addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub1, ArrSchd_DtlR.$itm_sub1);
			addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub2, ArrSchd_DtlR.$itm_sub2);
			addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub3, ArrSchd_DtlR.$itm_sub3);
			addColumnPathMap(InspSchd_Srch01_CndR.$maker_cd, ArrSchd_DtlR.$maker_cd);
			addColumnPathMap(InspSchd_Srch01_CndR.$to_loc_cd, ArrSchd_DtlR.$arr_loc_cd);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
			
			if (isNull(src.itm_cd())) {
				MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
				dest.base_dt(asR.arr_schd_tm().trunc(MCDateFieldType.DAY));
				dest.itm_cd(asR.itm_cd());
				dest.itm_sub1(asR.itm_sub1());
				dest.itm_sub2(asR.itm_sub2());
				dest.itm_sub3(asR.itm_sub3());
				dest.maker_cd(asR.maker_cd());
				dest.to_loc_cd(asR.arr_loc_cd());
				
				MST_ARR_PR_R apR = getArrPrR(src.arr_pr_no());
				dest.sppl_cd(apR.sppl_cd());
			}
			else {
				dest.base_dt(src.arr_schd_tm().trunc(MCDateFieldType.DAY));
				dest.sppl_cd(src.getString("sppl_cd"));
			}
			
		}
	}
	
	/**
	 * 検査予定サービス.品管関連マスタ取得
	 */
	protected void callInspSchdSrch03(MCList<ArrSchd_DtlR> l) {
		if (l.isEmpty()) return ;
		MSBFL_InspSchdService.InspSchd_Srch03 o = MSBFL_InspSchdService.crtInspSchd_Srch03();
		setAll(o.up0(), l, createMap_InspSchd_Srch03_CndR_ArrSchd_DtlR());
		o.exec();
		// 検査終了予定日設定
		String[] destCols = new String[]{INSP_END_DT_COL};
		String[] srcCols = new String[]{"end_dt"};
		copyByPegNo(l, o.down0(), UP1_PEG_NO_COL, destCols, "peg_no", srcCols);
	}
	protected Map_InspSchd_Srch03_CndR_ArrSchd_DtlR<InspSchd_Srch03_CndR,ArrSchd_DtlR> createMap_InspSchd_Srch03_CndR_ArrSchd_DtlR() {
		return new Map_InspSchd_Srch03_CndR_ArrSchd_DtlR<InspSchd_Srch03_CndR, ArrSchd_DtlR>();
	}
	public class Map_InspSchd_Srch03_CndR_ArrSchd_DtlR<D extends InspSchd_Srch03_CndR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspSchd_Srch03_CndR.$peg_no, UP1_PEG_NO_COL);
			addColumnPathMap(InspSchd_Srch03_CndR.$itm_cd, ArrSchd_DtlR.$itm_cd);
			addColumnPathMap(InspSchd_Srch03_CndR.$itm_sub1, ArrSchd_DtlR.$itm_sub1);
			addColumnPathMap(InspSchd_Srch03_CndR.$itm_sub2, ArrSchd_DtlR.$itm_sub2);
			addColumnPathMap(InspSchd_Srch03_CndR.$itm_sub3, ArrSchd_DtlR.$itm_sub3);
			addColumnPathMap(InspSchd_Srch03_CndR.$maker_cd, ArrSchd_DtlR.$maker_cd);
			addColumnPathMap(InspSchd_Srch03_CndR.$insp_ptn_cd, INSP_PTN_CD_COL);
			addColumnPathMap(InspSchd_Srch03_CndR.$to_loc_cd, ArrSchd_DtlR.$arr_loc_cd);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.insp_typ(MSC_INSP_TYP.ACCPT.value());
			
			MST_ARR_PR_R apR = getArrPrR(src.arr_pr_no());

			if (isNull(src.itm_cd())) {
				MST_ARR_SCHD_R asR = getArrSchdR(src.arr_schd_no());
				dest.schd_gr_dt(asR.arr_schd_tm().trunc(MCDateFieldType.DAY));
				dest.itm_cd(asR.itm_cd());
				dest.itm_sub1(asR.itm_sub1());
				dest.itm_sub2(asR.itm_sub2());
				dest.itm_sub3(asR.itm_sub3());
				dest.maker_cd(asR.maker_cd());
				dest.to_loc_cd(asR.arr_loc_cd());
				
				dest.sppl_cd(apR.sppl_cd());
			}
			else {
				dest.schd_gr_dt(src.arr_schd_tm().trunc(MCDateFieldType.DAY));
				dest.sppl_cd(src.getString("sppl_cd"));
			}

			// 納品先ＣＤ
			MST_PO_D_R podR = getPoDR(apR.po_d_no());
			if (!isNull(podR)) {
				dest.dlv_cd(podR.dlv_cd());
			}
		}
	}

	/**
	 * 受注状況更新サービス.更新
	 */
	protected void callSloStsUpd01(MCList<ArrSchd_DtlR> l) {
		MCList<SloSts_DtlR> sloL = MCList.create(SloSts_DtlR.class);

		MCList<MST_ARR_PR_R> bindL = MCList.create(MST_ARR_PR_R.class);
		for (ArrSchd_DtlR r : l) {
			if (r.getBoolean(IS_ABORT_FLG_COL)) {
				r.addStringColumn("po_d_no");
				MST_ARR_PR_R bindR = getArrPrR(r.arr_pr_no());
				if (bindR != null) {
					bindL.add(bindR);
					r.setString("po_d_no", bindR.po_d_no());
				}
			}
		}
		MCList<MST_PO_D_R> poL = getPoD(bindL);
		MCIndexKey idxkey = poL.createIndex(MST_PO_D_R.$po_d_no);
		
		for (ArrSchd_DtlR r : l) {
			if (r.is_src_outsrc_srv_flg()) {
				continue;
			}
			MST_ARR_PR_R apR = getArrPrR(r.arr_pr_no());
			if (r.getBoolean(IS_ABORT_FLG_COL)) {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				MST_PO_D_R poR = poL.getFirst(idxkey, r.getString("po_d_no"));
				if (poR != null) {
					SloSts_DtlR ssR = SloSts_DtlR.create();
					if (r.abort_flg()) {
						ssR.slo_sts_typ(MSC_SLO_STS_TYP.ARR_SCHD_ABORT.value());
					}
					else {
						ssR.slo_sts_typ(MSC_SLO_STS_TYP.ARR_SCHD_ABORT_CAN.value());
					}
					ssR.slo_d_no(poR.slo_d_no());

					MAVM_ITM_UNIT_R iuR = getItmUnitR(asR.itm_cd(), asR.itm_sub1(), asR.itm_sub2(), asR.itm_sub3(), asR.trd_unit_cd());
					MCNumber abtQty = getTrdUnitQty(r.base_unit_qty().subtract(r.arr_qty()), asR.base_unit_cd(), iuR);
					if (isNull(abtQty)) {
						ssR.unit_cd(asR.base_unit_cd());
						ssR.qty(r.abort_qty());
					}
					else {
						ssR.unit_cd(asR.trd_unit_cd());
						ssR.qty(abtQty);
					}

					if (MAC_TRD_PTN_TYP.isPURC(apR.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isPURC_XPNS(apR.trd_ptn_typ())) {
						ssR.po_no(poR.po_no());
						ssR.po_d_no(poR.po_d_no());
					}
					sloL.add(ssR);
				}
			}
		}
		if (sloL.isEmpty()) return ;

		MSBBL_SloStsRegService.SloSts_Ins01 o = MSBBL_SloStsRegService.crtSloSts_Ins01();
		o.up0().setAll(sloL);
		o.exec();
	}
	/**
	 * 発注明細のデータを取得します。<br>
	 * @param bindL 「po_d_no」に発注明細ＮＯを格納したリスト
	 * @return 発注明細のデータ
	 */
	protected MCList<MST_PO_D_R> getPoD(MCList<? extends MCRow> bindL) {
		MCList<MST_PO_D_R> dbc = MCList.create(MST_PO_D_R.class);
		MST_PO_D_R t = MST_PO_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.po_no, t.po_d_no, t.slo_d_no);
		dbc_bldr.setWhere(t.po_d_no.eq(bind("po_d_no")));
		dbc_bldr.addWhereWithAnd(t.slo_d_no.isNotNull());
		dbc_bldr.addWhereWithAnd(t.rqst_can_flg.eq(value(false)));
		dbSelect("MSBEL5900_MST_PO_D_S01", dbc, dbc_bldr, bindL);
		return dbc;
	}

	/**
	 * オーダ登録サービス.品目オーダ実績項目更新
	 */
	protected void callOrdRegUpd04(MCList<ArrSchd_DtlR> l) {
		MCList<MST_ARR_PR_R> inL = MCList.create(MST_ARR_PR_R.class);
		MCList<MST_ARR_PR_R> outL = MCList.create(MST_ARR_PR_R.class);
		for (ArrSchd_DtlR r : l) {
			MST_ARR_PR_R apR = getArrPrR(r.arr_pr_no());
			if (apR != null && !isNull(apR.po_d_no())) {
				if (r.outsrc_flg()) {
					outL.add(apR);
				}
				else {
					inL.add(apR);
				}
			}
		}
		MSBCL_OrdRegService.Ord_Upd04 o = MSBCL_OrdRegService.crtOrd_Upd04();
		o.up0().addAll(getOrdUpd04Up0(inL, MSC_ITM_ORD_TYP.PURC.value()));
		o.up0().addAll(getOrdUpd04Up0(outL, MSC_ITM_ORD_TYP.OUTSRC.value()));
		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}
	protected MCList<Ord_Upd04_DtlR> getOrdUpd04Up0(MCList<MST_ARR_PR_R> bind, String ordTyp) {
		MCList<MST_PO_SCHD_R> dbc = MCList.create(MST_PO_SCHD_R.class);
		MST_PO_SCHD_R t = MST_PO_SCHD_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.pln_itm_ord_no);
		dbc_bldr.setWhere(t.po_d_no.eq(bind("po_d_no")));
		dbc_bldr.addWhereWithAnd(t.pln_itm_ord_no.isNotNull());
		dbSelect("MSBEL5900_MST_PO_SCHD_S01", dbc, dbc_bldr, bind);
		if (dbc.isEmpty()) return null;

		MCList<Ord_Upd04_DtlR> l = MCList.create(Ord_Upd04_DtlR.class);
		setAll(l, dbc, createMap_Ord_Upd04_DtlR_MST_PO_SCHD_R());
		l.setString(Ord_Upd04_DtlR.$itm_ord_typ, ordTyp);
		return l;
	}
	protected Map_Ord_Upd04_DtlR_MST_PO_SCHD_R<Ord_Upd04_DtlR,MST_PO_SCHD_R> createMap_Ord_Upd04_DtlR_MST_PO_SCHD_R() {
		return new Map_Ord_Upd04_DtlR_MST_PO_SCHD_R<Ord_Upd04_DtlR, MST_PO_SCHD_R>();
	}

	public class Map_Ord_Upd04_DtlR_MST_PO_SCHD_R<D extends Ord_Upd04_DtlR, S extends MST_PO_SCHD_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Ord_Upd04_DtlR.$itm_ord_no, MST_PO_SCHD_R.$pln_itm_ord_no);
		}
	}
	protected MCList<WgRqst_Upd03_DtlR> getWgRqstUpd03Up0(MCList<MST_ARR_PR_R> bindPoL, MCList<MST_ARR_PR_R> bindXfrL) {
		MCList<MST_PO_SCHD_R> dbcPo = MCList.create(MST_PO_SCHD_R.class);
		MST_PO_SCHD_R dbcPo_t = MST_PO_SCHD_R.create("T");
		MCQueryApiBuilder dbcPo_bldr = MCQueryApiBuilder.create(dbcPo_t);
		dbcPo_bldr.setSelect(dbcPo_t.po_schd_src_no);
		dbcPo_bldr.setWhere(dbcPo_t.po_d_no.eq(bind("po_d_no")));
		dbcPo_bldr.addWhereWithAnd(dbcPo_t.po_schd_src_typ.eq(value(MSC_PO_SCHD_SRC_TYP.RQST.value())));
		dbSelect("MSBEL5900_MST_PO_SCHD_S02", dbcPo, dbcPo_bldr, bindPoL);
		
		MCList<MST_XFR_SCHD_R> dbcXfr = MCList.create(MST_XFR_SCHD_R.class);
		MST_XFR_SCHD_R dbcXfr_t = MST_XFR_SCHD_R.create("T");
		MCQueryApiBuilder dbcXfr_bldr = MCQueryApiBuilder.create(dbcXfr_t);
		MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
		MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
		MST_SHIP_ALLOC_STS_R t3 = MST_SHIP_ALLOC_STS_R.create("T3");
		MST_SHIP_ACT_D_R t4 = MST_SHIP_ACT_D_R.create("T4");
		dbcXfr_bldr.setSelect(dbcXfr_t.xfr_src_no);
		dbcXfr_bldr.addInnerJoin(t1, bracket( t1.xfr_schd_no.eq(dbcXfr_t.xfr_schd_no)));
		dbcXfr_bldr.addInnerJoin(t2, bracket( t2.ship_pr_no.eq(t1.ship_pr_no)));
		dbcXfr_bldr.addInnerJoin(t3, bracket( t3.ship_schd_no.eq(t2.ship_schd_no)));
		dbcXfr_bldr.addInnerJoin(t4, bracket( t4.ship_alloc_sts_no.eq(t3.ship_alloc_sts_no)));
		dbcXfr_bldr.setWhere(t4.dlv_slip_d_no.eq(bind("dlv_slip_d_no")));
		dbcXfr_bldr.addWhereWithAnd(t4.can_flg.eq(value(false)));
		dbcXfr_bldr.addWhereWithAnd(dbcXfr_t.xfr_src_typ.eq(value(MSC_XFR_SRC_TYP.WG_RQST.value())));
		dbSelect("MSBEL5900_MST_XFR_SCHD_S01", dbcXfr, dbcXfr_bldr, bindXfrL);
		
		MCList<WgRqst_Upd03_DtlR> l = MCList.create(WgRqst_Upd03_DtlR.class);
		if (!dbcPo.isEmpty()) {
			setAll(l, dbcPo, createMap_WgRqst_Upd03_DtlR_MST_PO_SCHD_R());
		}
		if (!dbcXfr.isEmpty()) {
			addAll(l, dbcXfr, createMap_WgRqst_Upd03_DtlR_MST_XFR_SCHD_R());
		}
		return l;
	}
	protected Map_WgRqst_Upd03_DtlR_MST_PO_SCHD_R<WgRqst_Upd03_DtlR,MST_PO_SCHD_R> createMap_WgRqst_Upd03_DtlR_MST_PO_SCHD_R() {
		return new Map_WgRqst_Upd03_DtlR_MST_PO_SCHD_R<WgRqst_Upd03_DtlR, MST_PO_SCHD_R>();
	}
	public class Map_WgRqst_Upd03_DtlR_MST_PO_SCHD_R<D extends WgRqst_Upd03_DtlR, S extends MST_PO_SCHD_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(WgRqst_Upd03_DtlR.$wg_rqst_prms_no, MST_PO_SCHD_R.$po_schd_src_no);
		}
	}
	protected Map_WgRqst_Upd03_DtlR_MST_XFR_SCHD_R<WgRqst_Upd03_DtlR,MST_XFR_SCHD_R> createMap_WgRqst_Upd03_DtlR_MST_XFR_SCHD_R() {
		return new Map_WgRqst_Upd03_DtlR_MST_XFR_SCHD_R<WgRqst_Upd03_DtlR, MST_XFR_SCHD_R>();
	}
	public class Map_WgRqst_Upd03_DtlR_MST_XFR_SCHD_R<D extends WgRqst_Upd03_DtlR, S extends MST_XFR_SCHD_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(WgRqst_Upd03_DtlR.$wg_rqst_prms_no, MST_XFR_SCHD_R.$xfr_src_no);
		}
	}
	/**
	 * 入荷予定送信ＩＦサービスの呼び出し
	 */
	protected void callArrSchdSendIfUpd01(MCList<ArrSchd_DtlR> l) {
		MSLAL_ArrSchdSendIfService.ArrSchdSendIf_Upd01 o = MSLAL_ArrSchdSendIfService.crtArrSchdSendIf_Upd01();
		for (ArrSchd_DtlR r : l) {
			if (r.arr_schd().wms_flg()) {
				if (MSC_PR_STS_TYP.isNOT_ARR(r.pr_sts_typ())
						|| (!(MSC_PR_STS_TYP.isARR(r.pr_sts_typ()) && MSC_PR_STS_TYP.isARR(r.getStringNE(ORG_PR_STS_TYP)))
								&& (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
										|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())))) {
					copy(o.up0().add(), r, createMap_ArrSchdSendIf_Upd01_DtlR_ArrSchd_DtlR());
				}
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}
	protected Map_ArrSchdSendIf_Upd01_DtlR_ArrSchd_DtlR<ArrSchdSendIf_Upd01_DtlR,ArrSchd_DtlR> createMap_ArrSchdSendIf_Upd01_DtlR_ArrSchd_DtlR() {
		return new Map_ArrSchdSendIf_Upd01_DtlR_ArrSchd_DtlR<ArrSchdSendIf_Upd01_DtlR, ArrSchd_DtlR>();
	}
	public class Map_ArrSchdSendIf_Upd01_DtlR_ArrSchd_DtlR<D extends ArrSchdSendIf_Upd01_DtlR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrSchdSendIf_Upd01_DtlR.$arr_schd_no, ArrSchd_DtlR.$arr_schd_no);
			addColumnPathMap(ArrSchdSendIf_Upd01_DtlR.$data_crud_typ, ArrSchd_DtlR.$data_crud_typ);
	
		}
	}

	/**
	 * 納品伝票明細のデータを取得します。<br>
	 * （最新のもの）
	 * @param bindL 「dlv_slip_d_no」に納品伝票明細ＮＯを格納したリスト
	 * @return 納品伝票明細のデータ
	 */
	protected MCList<MST_DLV_SLIP_D_R> getDlvSlipDL(MCList<? extends MCRow> bindL) {
		MCList<MST_DLV_SLIP_D_R> dbc = MCList.create(MST_DLV_SLIP_D_R.class);
		MST_DLV_SLIP_D_R t = MST_DLV_SLIP_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MST_DLV_SLIP_R t1 = MST_DLV_SLIP_R.create("T1");
		MST_SHIP_ACT_R t2 = MST_SHIP_ACT_R.create("T2");
		MST_IV_R t3 = MST_IV_R.create("T3");
		MST_SHIP_ACT_D_R t4 = MST_SHIP_ACT_D_R.create("T4");
		MST_SHIP_ALLOC_STS_R t5 = MST_SHIP_ALLOC_STS_R.create("T5");
		MST_PROV_SCHD_R t6 = MST_PROV_SCHD_R.create("T6");
		dbc.addNumberColumn("xrate");
		dbc.addNumberColumn("ptax_xrate");
		dbc.addStringColumn("trd_cur_cd");
		dbc.addStringColumn("ship_loc_cd");
		dbc.addBooleanColumn("xrate_inpt_flg");
		dbc.addBooleanColumn("ptax_xrate_inpt_flg");
		dbc.addBooleanColumn("ps_xrate_inpt_flg");
		dbc.addBooleanColumn("ps_ptax_xrate_inpt_flg");
		dbc.addBooleanColumn("ps_tax_fix_flg");
		dbc_bldr.setGroupBy(t.dlv_slip_d_no, t.prov_typ, t.prov_basis_typ, t.tax_cd, t.trd_cur_upri, t.wtax_rate, t.wtax_amt, t.rsn_cd, t1.xrate, t1.ptax_xrate, t3.xrate_inpt_flg, t3.ptax_xrate_inpt_flg, t3.iv_no, t1.trd_cur_cd);
		dbc_bldr.addMax(t4.ship_loc_cd, "ship_loc_cd");
		dbc_bldr.addMax(t6.xrate_inpt_flg, "ps_xrate_inpt_flg");
		dbc_bldr.addMax(t6.ptax_xrate_inpt_flg, "ps_ptax_xrate_inpt_flg");
		dbc_bldr.addMax(t6.tax_fix_flg, "ps_tax_fix_flg");
		dbc_bldr.addInnerJoin(t1, bracket( t1.dlv_slip_no.eq(t.dlv_slip_no)
				.and(t1.dlv_slip_seq.eq(t.dlv_slip_seq))
				.and(t1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
		dbc_bldr.addLeftOuterJoin(t2, bracket( t1.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value()))
				.and(t2.ship_act_no.eq(t1.dlv_slip_act_no))
				.and(t2.can_flg.eq(value(false)))));
		dbc_bldr.addLeftOuterJoin(t3, bracket( t3.iv_no.eq(t2.iv_no)));
		dbc_bldr.addLeftOuterJoin(t4, bracket( t4.dlv_slip_d_no.eq(t.dlv_slip_d_no)
				.and(t4.can_flg.eq(value(false)))));
		dbc_bldr.addLeftOuterJoin(t5, bracket( t5.ship_alloc_sts_no.eq(t4.ship_alloc_sts_no)));
		dbc_bldr.addLeftOuterJoin(t6, bracket( bracket( t6.prov_src_schd_no1.eq(t5.ship_schd_no) )
				.and(t6.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.SHIP.value())))));
		dbc_bldr.setWhere(t.dlv_slip_d_no.eq(bind("dlv_slip_d_no")));
		dbSelect("MSBEL5900_MST_DLV_SLIP_D_S01", dbc, dbc_bldr, bindL);
		return dbc;
	}

	/**
	 * 支給予定のデータを取得します。<br>
	 * （最新のもの）
	 * @param bindL 「arr_schd_no」に入荷予定ＮＯを格納したリスト
	 * @return 支給予定のデータ
	 */
	protected MCList<MST_PROV_SCHD_R> getProvSchdL(MCList<ArrSchd_DtlR> bindL) {
		MCList<MST_PROV_SCHD_R> dbc = MCList.create(MST_PROV_SCHD_R.class);
		MST_PROV_SCHD_R t = MST_PROV_SCHD_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelectAll();
		dbc_bldr.setWhere(t.prov_src_schd_typ.in( value(MSC_PROV_SRC_SCHD_TYP.SHIP.value()), value(MSC_PROV_SRC_SCHD_TYP.DDLV.value())));
		dbc_bldr.addWhereWithAnd(t.prov_src_schd_no1.eq(value(MAC_STR.NULL_VAL.value())));
		dbc_bldr.addWhereWithAnd(t.prov_src_schd_no2.eq(bind("arr_schd_no")));
		dbSelect("MSBEL5900_MST_PROV_SCHD_S01", dbc, dbc_bldr, bindL);
		return dbc;
	}
	// ///////////////////////////////////////////////
	// サービス呼び出し共有（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// キャッシュ（ここから）
	// ///////////////////////////////////////////////

	protected static final Class<MSBEL_ArrSchdService> CLAZZ = MSBEL_ArrSchdService.class;

	/**
	 * MST_ARR_SCHDキャッシュ
	 */
	protected static void initArrSchdCache(MCList<ArrSchd_DtlR> dtlL) {
		object(CLAZZ)._initArrSchdCache(dtlL);
	}
	protected MCList<MST_ARR_SCHD_R> _arrSchdCache = null;
	protected MCIndexKey _arrSchdCacheKey = null;
	protected void _initArrSchdCache(MCList<ArrSchd_DtlR> dtlL) {
		_arrSchdCache = MCList.create(MST_ARR_SCHD_R.class);
		_arrSchdCache.addBooleanColumn("arr_flg");
		_arrSchdCache.addBooleanColumn("trd_pack_flg");
		_arrSchdCache.addBooleanColumn("itm_arr_skip_flg");
		_arrSchdCache.addStringColumn("prov_typ");
		_arrSchdCache.addStringColumn("prov_basis_typ");
		_arrSchdCache.addStringColumn("purc_schd_no");
		_arrSchdCache.addDateColumn("purc_schd_dt");
		_arrSchdCache.addStringColumn("sppl_cd");
		_arrSchdCache.addStringColumn("iv_d_no");
		_arrSchdCache.addBooleanColumn("purc_ddlv_flg");
		_arrSchdCache.addStringColumn("tdlv_cd");
		_arrSchdCache.addDateColumn("sls_ret_schd_dt");
		_arrSchdCache.addStringColumn("itm_mfg_inst_no");
		_arrSchdCache.addStringColumn("mfg_inst_unit_typ");
		
		MCQueryApiBuilder arrSchdCache_bldr = MCQueryApiBuilder.create(MST_ARR_SCHD_R.create("T"));
		editArrSchdCache_bldr(true, arrSchdCache_bldr);
		
		MCList<ArrSchd_DtlR> l =
			dtlL.groupBy(MST_ARR_SCHD_R.$arr_schd_no).subList(r -> !isNull(r.arr_schd_no()));
		if (!l.isEmpty()) {
			insArrSchdWk(l);
			dbSelectForUpdate("MSBEL5900_MST_ARR_SCHD_S02", _arrSchdCache, arrSchdCache_bldr);
			MCJoinerList<MST_ARR_SCHD_R> joinList = new MCJoinerList<>();
			joinList
			.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd()
			))
			.addSelect(m -> toArray(
					m.pack_flg
			))
			.addMap((r, m) -> {
				r.setBoolean("trd_pack_flg", m.pack_flg());
			});
			joinList.join(_arrSchdCache);
		}
		_arrSchdCacheKey = _arrSchdCache.createIndex(MST_ARR_SCHD_R.$arr_schd_no);
		
		setDefaultSyncFlg(_arrSchdCache);
	}
	
	protected static void editArrSchdCache_bldr(boolean useWK, MCQueryApiBuilder arrSchdCache_bldr) {
		object(CLAZZ)._editArrSchdCache_bldr(useWK, arrSchdCache_bldr);
	}
	
	protected void _editArrSchdCache_bldr(boolean useWK, MCQueryApiBuilder arrSchdCache_bldr) {
		MST_ARR_SCHD_R t = (MST_ARR_SCHD_R)arrSchdCache_bldr.getBaseDbc();
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");
		MAM_SITE_R m2 = MAM_SITE_R.create("M2");
		MAM_ITM_R m4 = MAM_ITM_R.create("M4");
		MST_PROV_SCHD_R t1 = MST_PROV_SCHD_R.create("T1");
		MST_PURC_SCHD_R t2 = MST_PURC_SCHD_R.create("T2");
		MST_ARR_PR_R t3 = MST_ARR_PR_R.create("T3");
		MST_SLS_RET_SCHD_D_R t4 = MST_SLS_RET_SCHD_D_R.create("T4");
		MST_SLS_RET_SCHD_R t5 = MST_SLS_RET_SCHD_R.create("T5");
		MST_MFG_INST_R t6 = MST_MFG_INST_R.create("T6");
		MSW_ARR_SCHD_KEY_R w1 = MSW_ARR_SCHD_KEY_R.create("W1");

		arrSchdCache_bldr.addSelect(m2.arr_flg,
				m4.arr_skip_flg.as("itm_arr_skip_flg"), t1.prov_typ, t1.prov_basis_typ,
				t2.purc_schd_no, t2.purc_schd_dt, t3.sppl_cd, t3.iv_d_no,
				t3.purc_ddlv_flg, t4.tdlv_cd, t5.sls_ret_schd_dt, t5.sls_ret_schd_no,
				t6.itm_mfg_inst_no, t6.mfg_inst_unit_typ);
		if (useWK) {
			arrSchdCache_bldr.addInnerJoin(w1, t.arr_schd_no.eq(w1.arr_schd_no));
		}
		arrSchdCache_bldr.addLeftOuterJoin(m1, bracket( m1.loc_cd.eq(t.arr_loc_cd)));
		arrSchdCache_bldr.addLeftOuterJoin(m2, bracket( m2.site_cd.eq(m1.site_cd)));
		arrSchdCache_bldr.addLeftOuterJoin(m4,
				bracket(m4.itm_cd.eq(t.itm_cd).and(m4.itm_sub1.eq(t.itm_sub1))
						.and(m4.itm_sub2.eq(t.itm_sub2))
						.and(m4.itm_sub3.eq(t.itm_sub3))));
		arrSchdCache_bldr.addLeftOuterJoin(t1, bracket(t1.prov_src_schd_no2
				.eq(t.arr_schd_no)
				.and(t1.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.SHIP.value()))
						.or(t1.prov_src_schd_typ
								.eq(value(MSC_PROV_SRC_SCHD_TYP.DDLV.value()))))));
		arrSchdCache_bldr.addLeftOuterJoin(t2, bracket( t2.arr_schd_no.eq(t.arr_schd_no)));
		arrSchdCache_bldr.addInnerJoin(t3, bracket( t3.arr_pr_no.eq(t.arr_pr_no)));
		arrSchdCache_bldr.addLeftOuterJoin(t4, bracket( t4.sls_ret_schd_d_no.eq(t3.sls_ret_schd_d_no)));
		arrSchdCache_bldr.addLeftOuterJoin(t5, bracket( t5.sls_ret_schd_no.eq(t4.sls_ret_schd_no)));
		arrSchdCache_bldr.addLeftOuterJoin(t6, bracket( t.mfg_inst_no.eq(t6.mfg_inst_no)));
		arrSchdCache_bldr.setLockTable(t3.arr_pr_no);
		arrSchdCache_bldr.setOrderByAsc(arrSchdCache_bldr.getBaseDbc().getKeyColumn$());
	}
	
	protected static MCList<MST_ARR_SCHD_R> getArrSchdCache() {
		return object(CLAZZ)._arrSchdCache;
	}
	public static MST_ARR_SCHD_R getArrSchdR(String arrSchdNo) {
		MCList<MST_ARR_SCHD_R> dbc = getArrSchdCache();
		if (!isNull(arrSchdNo)) {
			MST_ARR_SCHD_R r = dbc.getFirst(object(CLAZZ)._arrSchdCacheKey, arrSchdNo);
			if (!isNull(r)) {
				return r;
			}
			// キャッシュを退避
			MCList<MST_ARR_SCHD_R> lst = dbc.createInstance();
			lst.setAll(dbc);
			
			MCList<MST_ARR_SCHD_R> bindL = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R bindR = MST_ARR_SCHD_R.create();
			bindR.arr_schd_no(arrSchdNo);
			bindL.add(bindR);
			
			MCQueryApiBuilder arrSchdCache_bldr = MCQueryApiBuilder.create(MST_ARR_SCHD_R.create("T"));
			editArrSchdCache_bldr(false, arrSchdCache_bldr);
			int cnt = dbSelectKeyForUpdate("MSBEL5900_MST_ARR_SCHD_S03", dbc, arrSchdCache_bldr, bindL);
			MCJoinerList<MST_ARR_SCHD_R> joinList = new MCJoinerList<>();
			joinList
			.add(MAVM_ITM_UNIT_R.class, rr -> toCondition(
					rr.itm_cd(), rr.itm_sub1(), rr.itm_sub2(), rr.itm_sub3(), rr.trd_unit_cd()
			))
			.addSelect(m -> toArray(
					m.pack_flg
			))
			.addMap((rr, m) -> {
				rr.setBoolean("trd_pack_flg", m.pack_flg());
			});
			joinList.join(dbc);

			dbc.addAll(lst);
			object(CLAZZ)._arrSchdCacheKey
				= dbc.createIndex(MST_ARR_SCHD_R.$arr_schd_no);
			if (cnt > 0) {
				return dbc.getFirst(object(CLAZZ)._arrSchdCacheKey, arrSchdNo);
			}
		}
		return dbc.createRow();
	}
	
	protected void setDefaultSyncFlg(MCList<MST_ARR_SCHD_R> arrSchdL) {
	
		MCList<MST_ARR_SCHD_R> rsltL = getDefaultSyncFlgL(arrSchdL);
		MCIndexKey idx = rsltL.createIndex(MST_ARR_SCHD_R.$arr_schd_no);
		
		arrSchdL.addBooleanColumn("def_sync_flg");
		
		for (MST_ARR_SCHD_R arrSchdR : arrSchdL) {
			boolean syncFlg = arrSchdR.sync_flg();
			
			MST_ARR_SCHD_R r = rsltL.getFirst(idx, arrSchdR.arr_schd_no());
			if (!isNull(r)) {
				if (!isNull(r.purc_act_d_no())) {
					syncFlg = r.getBooleanNE("purc_sync_flg");
				}
				else if (!isNull(r.prms_rcpt_d_no())) {
					syncFlg = r.getBooleanNE("prms_sync_flg");
				}
				else if (!isNull(r.dlv_inst_d_no())) {
					syncFlg = r.getBooleanNE("dlv_sync_flg");
				}
				else if (!isNull(r.getStringNE("po_d_no"))) {
					syncFlg = r.getBooleanNE("po_sync_flg");
				}
			}
			
			arrSchdR.setBooleanNE("def_sync_flg", syncFlg);
		}
	}
	protected MCList<MST_ARR_SCHD_R> getDefaultSyncFlgL(MCList<MST_ARR_SCHD_R> arrSchdL) {
		MST_ARR_SCHD_R ARR_SCHD = MST_ARR_SCHD_R.create("ARR_SCHD");
		MST_ARR_PR_R ARR_PR = MST_ARR_PR_R.create("ARR_PR");
		MST_PO_D_R PO_D = MST_PO_D_R.create("POD");
		MST_DLV_INST_D_R DLV_INST_D = MST_DLV_INST_D_R.create("DLV_INST_D");
		MST_PRMS_RCPT_D_R PRMS_RCPT_D = MST_PRMS_RCPT_D_R.create("PRMS_RCPT_D");
		MST_PURC_ACT_D_R PURC_ACT_D = MST_PURC_ACT_D_R.create("PURC_ACT_D"); 
		MST_PURC_ACT_R PURC_ACT = MST_PURC_ACT_R.create("PURC_ACT");
		
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(ARR_SCHD);
		bldr.setSelect(
			ARR_SCHD.arr_schd_no,
			PO_D.po_d_no,
			PO_D.sync_flg.as("po_sync_flg"),
			DLV_INST_D.dlv_inst_d_no,
			DLV_INST_D.sync_flg.as("dlv_sync_flg"),
			PRMS_RCPT_D.prms_rcpt_d_no,
			PRMS_RCPT_D.sync_flg.as("prms_sync_flg"),
			PURC_ACT_D.purc_act_d_no,
			PURC_ACT_D.sync_flg.as("purc_sync_flg")
		);
		bldr.addInnerJoin(ARR_PR, ARR_PR.arr_pr_no.eq(ARR_SCHD.arr_pr_no));
		bldr.addLeftOuterJoin(PO_D, PO_D.po_d_no.eq(ARR_PR.po_d_no));
		bldr.addLeftOuterJoin(DLV_INST_D, DLV_INST_D.dlv_inst_d_no.eq(ARR_SCHD.dlv_inst_d_no));
		bldr.addLeftOuterJoin(PRMS_RCPT_D, PRMS_RCPT_D.prms_rcpt_d_no.eq(ARR_SCHD.prms_rcpt_d_no));
		bldr.addLeftOuterJoin(PURC_ACT_D, PURC_ACT_D.purc_act_d_no.eq(ARR_SCHD.purc_act_d_no));
		bldr.addLeftOuterJoin(PURC_ACT,
			PURC_ACT.purc_act_no.eq(PURC_ACT_D.purc_act_no)
			.and(PURC_ACT.purc_act_seq.eq(PURC_ACT_D.purc_act_seq))
			.and(PURC_ACT.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
		);
		
		MCList<MST_ARR_SCHD_R> rsltL = MCList.create(MST_ARR_SCHD_R.class);
		rsltL.addStringColumn("po_d_no");
		rsltL.addBooleanColumn("po_sync_flg");
		rsltL.addBooleanColumn("dlv_sync_flg");
		rsltL.addBooleanColumn("prms_sync_flg");
		rsltL.addBooleanColumn("purc_sync_flg");
		
		dbSelectKey("MSBEL5900_MST_ARR_SCHD_S06", rsltL, bldr, arrSchdL);
		
		return rsltL;
	}

	/**
	 * MST_ARR_PRキャッシュ
	 */
	protected static void initArrPrCache(MCList<ArrPr_DtlR> dtlL) {
		object(CLAZZ)._initArrPrCache(dtlL);
	}
	protected MCList<MST_ARR_PR_R> _arrPrCache = null;
	protected MCIndexKey _arrPrCacheKey = null;
	protected void _initArrPrCache(MCList<ArrPr_DtlR> dtlL) {
		_arrPrCache = MCList.create(MST_ARR_PR_R.class);

		MCQueryApiBuilder arrPrCache_bldr = MCQueryApiBuilder.create(MST_ARR_PR_R.create("T"));
		_editArrPrCache_bldr(arrPrCache_bldr);
		
		MCList<ArrPr_DtlR> l =
			dtlL.groupBy(MST_ARR_PR_R.$arr_pr_no).subList(r -> !isNull(r.arr_pr_no()));
		if (!l.isEmpty()) {
			dbSelectKeyForUpdate("MSBEL5900_MST_ARR_PR_S01", _arrPrCache, arrPrCache_bldr, l);
		}
		_arrPrCacheKey = _arrPrCache.createIndex(MST_ARR_PR_R.$arr_pr_no);
	}

	
	protected static void editArrPrCache_bldr(MCQueryApiBuilder arrPrCache_bldr) {
		object(CLAZZ)._editArrPrCache_bldr(arrPrCache_bldr);
	}
	
	protected void _editArrPrCache_bldr(MCQueryApiBuilder arrPrCache_bldr) {
		arrPrCache_bldr.setOrderByAsc(arrPrCache_bldr.getBaseDbc().getKeyColumn$());
	}
	
	protected static MCList<MST_ARR_PR_R> getArrPrCache() {
		if (object(CLAZZ)._arrPrCache == null) {
			object(CLAZZ)._initArrPrCache(MCList.create(ArrPr_DtlR.class));
		}
		return object(CLAZZ)._arrPrCache;
	}
	protected static MST_ARR_PR_R getArrPrR(String arrPrNo) {
		MCList<MST_ARR_PR_R> dbc = getArrPrCache();
		if (!isNull(arrPrNo)) {
			MST_ARR_PR_R r = dbc.getFirst(object(CLAZZ)._arrPrCacheKey, arrPrNo);
			if (!isNull(r)) {
				return r;
			}
			// キャッシュを退避
			MCList<MST_ARR_PR_R> lst = dbc.createInstance();
			lst.setAll(dbc);
			
			MCList<MST_ARR_PR_R> bindL = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R bindR = MST_ARR_PR_R.create();
			bindR.arr_pr_no(arrPrNo);
			bindL.add(bindR);
			
			MCQueryApiBuilder arrPrCache_bldr = MCQueryApiBuilder.create(MST_ARR_PR_R.create("T"));
			editArrPrCache_bldr(arrPrCache_bldr);
			
			int cnt = dbSelectKeyForUpdate("MSBEL5900_MST_ARR_PR_S02", dbc, arrPrCache_bldr, bindL);
			dbc.addAll(lst);
			object(CLAZZ)._arrPrCacheKey
				= dbc.createIndex(MST_ARR_PR_R.$arr_pr_no);
			if (cnt > 0) {
				return dbc.getFirst(object(CLAZZ)._arrPrCacheKey, arrPrNo);
			}
		}
		return dbc.createRow();
	}
	protected void initArrPrCacheFromArrSchd(MCList<ArrSchd_DtlR> dtlL) {
		MCList<ArrPr_DtlR> bindL = MCList.create(ArrPr_DtlR.class);
		for (ArrSchd_DtlR r : dtlL) {
			MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
			if (asR != null) {
				ArrPr_DtlR bindR = ArrPr_DtlR.create();
				bindR.arr_pr_no(asR.arr_pr_no());
				bindL.add(bindR);
			}
		}
		initArrPrCache(bindL);
	}

	/**
	 * MAM_ITMキャッシュ
	 */
	protected static void initItmCache(MCList<ArrSchd_DtlR> dtlL) {
		object(CLAZZ)._initItmCache(dtlL);
	}
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;
	protected void _initItmCache(MCList<?> dtlL) {
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.stk_mng_typ,
				t.asset_mng_typ,
				t.arr_skip_flg,
				t.lot_no_ptn_cd,
				t.lot_mng_typ,
				t.lot_no_typ,
				t.sublot_no_ptn_cd,
				t.sublot_mng_typ,
				t.sublot_no_typ
		);
		_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, dtlL, MAM_ITM_R.$itm_cd,
				MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
	}
	protected static FXUCL_MCDbcCache<MAM_ITM_R> getItmCache() {
		if (object(CLAZZ)._itmCache == null) {
			object(CLAZZ)._initItmCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._itmCache;
	}
	protected static MAM_ITM_R getItmR(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return getItmCache().get(itmCd, itmSub1, itmSub2, itmSub3);
	}

	/**
	 * MAM_LOCキャッシュ
	 */
	protected static void initLocCache(MCList<ArrSchd_DtlR> dtlL) {
		object(CLAZZ)._initLocCache(dtlL);
	}
	protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache = null;
	protected void _initLocCache(MCList<?> dtlL) {
		MCList<MAM_LOC_R> dbc = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MAM_BP_R t1 = MAM_BP_R.create("T1");
		MAM_SITE_R t2 = MAM_SITE_R.create("T2");
		dbc.addStringColumn("prov_rcv_typ");
		dbc.addStringColumn("prov_basis_typ");
		dbc.addBooleanColumn("repurc_obli_flg");
		dbc.addBooleanColumn("arr_flg");
		dbc_bldr.setSelect(
				t.loc_cd,
				t.wg_cd,
				t.site_cd,
				t.loc_mng_typ,
				t.lg_grp_cd,
				t.sppl_cd,
				t1.prov_rcv_typ,
				t1.prov_basis_typ,
				t1.repurc_obli_flg,
				t2.arr_flg
		);
		dbc_bldr.addLeftOuterJoin(t1, bracket(t1.bp_cd.eq(t.sppl_cd)));
		dbc_bldr.addLeftOuterJoin(t2, bracket(t2.site_cd.eq(t.site_cd)));
		_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbc, dbc_bldr, dtlL, ArrSchd_DtlR.$arr_loc_cd);
	}
	protected static FXUCL_MCDbcCache<MAM_LOC_R> getLocCache() {
		if (object(CLAZZ)._locCache == null) {
			object(CLAZZ)._initLocCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._locCache;
	}
	protected static MAM_LOC_R getLocR(String locCd) {
		return getLocCache().get(locCd);
	}

	/**
	 * MAM_BIZ_RSNキャッシュ
	 */
	protected static void initBizRsnCache(MCList<ArrPr_DtlR> dtlL) {
		object(CLAZZ)._initBizRsnCache(dtlL);
	}
	protected FXUCL_MCDbcCache<MAM_BIZ_RSN_R> _bizRsnCache = null;
	protected void _initBizRsnCache(MCList<?> dtlL) {
		MAM_BIZ_RSN_R t = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.biz_rsn_cd, t.xpns_purc_flg);
		_bizRsnCache = new FXUCL_MCDbcCache<MAM_BIZ_RSN_R>(dbc_bldr, dtlL, ArrPr_DtlR.$rsn_cd);
	}
	protected static FXUCL_MCDbcCache<MAM_BIZ_RSN_R> getBizRsnCache() {
		if (object(CLAZZ)._bizRsnCache == null) {
			object(CLAZZ)._initBizRsnCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._bizRsnCache;
	}
	protected static MAM_BIZ_RSN_R getBizRsnR(String bizRsnCd) {
		return getBizRsnCache().get(bizRsnCd);
	}

	/**
	 * MST_PO_Dキャッシュ
	 */
	protected static void initPoDCache(MCList<?> dtlL) {
		object(CLAZZ)._initPoDCache(dtlL);
	}
	protected FXUCL_MCDbcCache<MST_PO_D_R> _poDCache = null;
	protected void _initPoDCache(MCList<?> dtlL) {
		MCList<MST_PO_D_R> dbc = MCList.create(MST_PO_D_R.class);
		MST_PO_D_R t = MST_PO_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MST_PO_R t1 = MST_PO_R.create("T1");
		MAM_BP_R t2 = MAM_BP_R.create("T2");
		dbc.addDateColumn("po_dt");
		dbc.addStringColumn("sppl_cal_cd");
		dbc_bldr.setSelect(
				t.po_d_no,
				t.po_no,
				t.purc_lt,
				t.dlv_cd,
				t1.po_dt,
				t2.sppl_cal_cd
		);
		dbc_bldr.addLeftOuterJoin(t1, bracket(t1.po_no.eq(t.po_no)));
		dbc_bldr.addLeftOuterJoin(t2, bracket(t2.bp_cd.eq(t1.sppl_cd)));
		_poDCache = new FXUCL_MCDbcCache<MST_PO_D_R>(dbc, dbc_bldr, dtlL, MST_PO_D_R.$po_d_no);
	}
	protected static FXUCL_MCDbcCache<MST_PO_D_R> getPoDCache() {
		if (object(CLAZZ)._poDCache == null) {
			object(CLAZZ)._initPoDCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._poDCache;
	}
	protected static MST_PO_D_R getPoDR(String poDNo) {
		return getPoDCache().get(poDNo);
	}

	/**
	 * MAVM_ITM_UNITキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
	protected void _initItmUnitCache() {
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.unit_cd,
				t.pack_flg,
				t.conv_base_qty,
				t.conv_qty,
				t.dec_place,
				t.rnd_typ
		);
		_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbc_bldr);
	}
	protected static FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> getItmUnitCache() {
		if (object(CLAZZ)._itmUnitCache == null) {
			object(CLAZZ)._initItmUnitCache();
		}
		return object(CLAZZ)._itmUnitCache;
	}
	protected static MAVM_ITM_UNIT_R getItmUnitR(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
		return getItmUnitCache().get(itmCd, itmSub1, itmSub2, itmSub3, unitCd);
	}

	/**
	 * MST_IV_Dキャッシュ
	 */
	protected static void initIvDCache(MCList<? extends MCRow> dtlL) {
		object(CLAZZ)._initIvDCache(dtlL);
	}
	protected FXUCL_MCDbcCache<MST_IV_D_R> _ivDCache = null;
	protected void _initIvDCache(MCList<?> dtlL) {
		MCList<MST_IV_D_R> dbc = MCList.create(MST_IV_D_R.class);
		MST_IV_D_R t = MST_IV_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MST_IV_R t1 = MST_IV_R.create("T1");
		dbc.addDateColumn("eta_dt");
		dbc.addBooleanColumn("xrate_inpt_flg");
		dbc.addBooleanColumn("ptax_xrate_inpt_flg");
		dbc_bldr.setSelect(
				t.iv_d_no,
				t1.eta_dt,
				t1.xrate_inpt_flg,
				t1.xrate,
				t1.ptax_xrate_inpt_flg,
				t1.ptax_xrate
		);
		dbc_bldr.addLeftOuterJoin(t1, bracket(t1.iv_mng_no.eq(t.iv_mng_no)));
		_ivDCache = new FXUCL_MCDbcCache<MST_IV_D_R>(dbc, dbc_bldr, dtlL, MST_IV_D_R.$iv_d_no);
	}
	protected static FXUCL_MCDbcCache<MST_IV_D_R> getIvDCache() {
		return object(CLAZZ)._ivDCache;
	}
	protected static MST_IV_D_R getIvDR(String ivDNo) {
		return getIvDCache().get(ivDNo);
	}

	/**
	 * ロットＮＯキャッシュ
	 */
	protected MCList<ArrSchd_DtlR> _lotCache = null;
	protected static void setLotCache(MCList<ArrSchd_DtlR> dtlL) {
		object(CLAZZ)._lotCache = dtlL;
	}
	protected static MCList<ArrSchd_DtlR> getLotCache() {
		return object(CLAZZ)._lotCache;
	}

	/**
	 * サブロットＮＯキャッシュ
	 */
	protected MCList<ArrSchd_DtlR> _sublotCache = null;
	protected static void setSublotCache(MCList<ArrSchd_DtlR> dtlL) {
		object(CLAZZ)._sublotCache = dtlL;
	}
	protected static MCList<ArrSchd_DtlR> getSublotCache() {
		return object(CLAZZ)._sublotCache;
	}

	/**
	 * 現状在庫のデータを取得します。<br>
	 * @param bindL 「arr_schd_no」に入荷予定ＮＯを格納したリスト
	 * @return 現状在庫のデータ
	 */
	MCList<MST_STK_R> _stkL;
	MCIndexKey _stkKey;
	protected void initStkL(MCList<ArrSchd_DtlR> bindL) {

		MCList<MST_STK_R> dbc = MCList.create(MST_STK_R.class);
		MST_STK_R t = MST_STK_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MCTempView w1 = createTempView("W1");
		MST_ARR_SCHD_R S1W1 = MST_ARR_SCHD_R.create("W1");
		MST_ARR_PR_R S1W2 = MST_ARR_PR_R.create("W2");
		MSW_ARR_SCHD_KEY_R S1W3 = MSW_ARR_SCHD_KEY_R.create("W3");
		dbc_bldr.addInnerJoin(subQuery().selectDistinct(
				S1W1.itm_cd,
				S1W1.itm_sub1,
				S1W1.itm_sub2,
				S1W1.itm_sub3,
				S1W2.ret_stk_arrv_bp_cd,
				S1W1.lot_no,
				S1W1.sublot_no,
				S1W1.sno1,
				S1W1.sno2,
				S1W1.sno3,
				S1W1.sno4,
				S1W2.pack_unit_cd,
				S1W1.ret_loc_cd,
				S1W1.ret_str_ln_cd,
				S1W1.ret_gd_cd,
				S1W1.quality_typ,
				S1W1.stk_insp_typ,
				S1W1.stk_id_typ,
				S1W1.stk_bp_cd)
				.from(S1W1.innerJoin(S1W2).on(bracket(S1W2.arr_pr_no.eq(S1W1.arr_pr_no)))
						.innerJoin(S1W3)
						.on(bracket(S1W3.arr_schd_no.eq(S1W1.arr_schd_no))))
				.view(w1),
				bracket(w1.pr(S1W1.itm_cd).eq(t.itm_cd)
						.and(w1.pr(S1W1.itm_sub1).eq(t.itm_sub1))
						.and(w1.pr(S1W1.itm_sub2).eq(t.itm_sub2))
						.and(w1.pr(S1W1.itm_sub3).eq(t.itm_sub3))
						.and(w1.pr(S1W2.ret_stk_arrv_bp_cd).eq(t.stk_arrv_bp_cd))
						.and(w1.pr(S1W1.lot_no).isNull().or(w1.pr(S1W1.lot_no).eq(t.lot_no)))
						.and(w1.pr(S1W1.sublot_no).isNull().or(w1.pr(S1W1.sublot_no).eq(t.sublot_no)))
						.and(w1.pr(S1W1.sno1).eq(t.sno1))
						.and(w1.pr(S1W1.sno2).eq(t.sno2))
						.and(w1.pr(S1W1.sno3).eq(t.sno3))
						.and(w1.pr(S1W1.sno4).eq(t.sno4))
						.and(t.fix_no_typ.eq(value(MSC_FIX_NO_TYP.NON.value())))
						.and(t.fix_no.eq(value(MAC_STR.NULL_VAL.value())))
						.and(w1.pr(S1W2.pack_unit_cd).eq(t.pack_unit_cd))
						.and(w1.pr(S1W1.ret_loc_cd).eq(t.loc_cd))
						.and(w1.pr(S1W1.ret_str_ln_cd).eq(t.str_ln_cd))
						.and(w1.pr(S1W1.ret_gd_cd).eq(t.gd_cd))
						.and(t.in_xfr_typ.eq(value(MSC_IN_XFR_TYP.IN_LOC.value())))
						.and(w1.pr(S1W1.quality_typ).eq(t.quality_typ))
						.and(w1.pr(S1W1.stk_insp_typ).eq(t.stk_insp_typ))
						.and(w1.pr(S1W1.stk_id_typ).eq(t.stk_id_typ))
						.and(w1.pr(S1W1.stk_bp_cd).eq(t.stk_bp_cd))));

		if (insArrSchdWk(bindL)) {
			dbSelect("MSBEL5900_MST_STK_S01", dbc, dbc_bldr);
		}

		object(CLAZZ)._stkL = dbc;
		object(CLAZZ)._stkKey = object(CLAZZ)._stkL.createIndex(
				MST_STK_R.$itm_cd,
				MST_STK_R.$itm_sub1,
				MST_STK_R.$itm_sub2,
				MST_STK_R.$itm_sub3,
				MST_STK_R.$stk_arrv_bp_cd,
				MST_STK_R.$sno1,
				MST_STK_R.$sno2,
				MST_STK_R.$sno3,
				MST_STK_R.$sno4,
				MST_STK_R.$pack_unit_cd,
				MST_STK_R.$loc_cd,
				MST_STK_R.$str_ln_cd,
				MST_STK_R.$gd_cd,
				MST_STK_R.$quality_typ,
				MST_STK_R.$stk_insp_typ,
				MST_STK_R.$stk_id_typ,
				MST_STK_R.$stk_bp_cd);
	}
	protected MCList<MST_STK_R> getStkL(MST_ARR_PR_R apR, MST_ARR_SCHD_R asR) {
		return object(CLAZZ)._stkL.subList(object(CLAZZ)._stkKey, asR.itm_cd(),
				asR.itm_sub1(), asR.itm_sub2(), asR.itm_sub3(), apR.ret_stk_arrv_bp_cd(),
				asR.sno1(), asR.sno2(), asR.sno3(), asR.sno4(), apR.pack_unit_cd(), asR.ret_loc_cd(), asR.ret_str_ln_cd(),
				asR.ret_gd_cd(), asR.quality_typ(), asR.stk_insp_typ(), asR.stk_id_typ(),
				asR.stk_bp_cd());
	}

	/**
	 * 引数の入荷予定ＮＯをワークに登録する
	 * @return 登録対象があった場合true
	 */
	protected boolean insArrSchdWk(MCList<ArrSchd_DtlR> bindL) {
		MCList<MST_ARR_SCHD_R> wkL = MCList.create(MST_ARR_SCHD_R.class);
		MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
		MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(t);
		for (ArrSchd_DtlR r : bindL) {
			if (!isNull(r.arr_schd_no())) {
				wkL.add().arr_schd_no(r.arr_schd_no());
			}
		}
		wkL = wkL.groupBy(MST_ARR_SCHD_R.$arr_schd_no);
		dbWkDelete("MSBEL5900_MSW_ARR_SCHD_D01", wkL_bldr.getBaseDbc());
		dbWkInsert("MSBEL5900_MSW_ARR_SCHD_I01", wkL, wkL_bldr.getBaseDbc());
		return wkL.size() > 0;
	}

	/**
	 * 出庫実績明細のデータを取得します。<br>
	 * @param bindL 「ret_dlv_slip_d_no」に返品元納品書明細ＮＯを格納したリスト
	 * @return 出庫実績明細のデータ
	 */
	MCList<MST_SHIP_ACT_D_R> _shipActDL;
	MCIndexKey _shipActDKey;
	protected void initShipActDL(MCList<? extends MCRow> bindL) {
		MCList<MST_SHIP_ACT_D_R> dbc = MCList.create(MST_SHIP_ACT_D_R.class);
		MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setWhere(t.dlv_slip_d_no.eq(bind("ret_dlv_slip_d_no")));
		dbc_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
		dbSelect("MSBEL5900_MST_SHIP_ACT_D_S02", dbc, dbc_bldr, bindL);

		object(CLAZZ)._shipActDL = dbc;
		object(CLAZZ)._shipActDKey = object(CLAZZ)._shipActDL.createIndex(
			MST_SHIP_ACT_D_R.$dlv_slip_d_no,
			MST_SHIP_ACT_D_R.$quality_typ,
			MST_SHIP_ACT_D_R.$stk_id_typ,
			MST_SHIP_ACT_D_R.$stk_bp_cd,
			MST_SHIP_ACT_D_R.$stk_arrv_bp_cd
		);
	}
	protected MCList<MST_SHIP_ACT_D_R> getShipActDL(ArrSchd_DtlR dtlR) {
		return object(CLAZZ)._shipActDL.subList(
			object(CLAZZ)._shipActDKey,
			dtlR.getString("ret_dlv_slip_d_no"),
			dtlR.quality_typ(),
			dtlR.stk_id_typ(),
			dtlR.stk_bp_cd(),
			dtlR.stk_arrv_bp_cd());
	}
	/**
	 * WMS対象フラグを取得・設定する
	 */
	protected void initScmIfCtrl(MCList<ArrSchd_DtlR> dtlL) {
		MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();

		for (ArrSchd_DtlR dtlR : dtlL) {
			SCMLinkUtil_Srch01_CndR r = o.up0().add();
			r.peg_no(dtlR.peg_d_no());
			r.if_proc_typ(MAC_IF_PROC_TYP.WMS_ARR_SCHD_SEND.value());
			r.loc_cd(dtlR.arr_loc_cd());
			r.master_dt(getToday());
		}
		if (!o.up0().isEmpty()) {
			o.exec();

			MCIndexKey idx = o.down0().createIndex(SCMLinkUtil_Srch01_CndR.$peg_no);
			for (ArrSchd_DtlR dtlR : dtlL) {
				SCMLinkUtil_Srch01_CndR downR = o.down0().getFirst(idx, dtlR.peg_d_no());
				if (!isNull(downR)) {
					dtlR.arr_schd().wms_flg(!isNull(downR.ext_sys_cd()));
					dtlR.arr_schd().setStringNE("ext_sys_cd", downR.ext_sys_cd());
				}
			}
		}
	}
	/**
	 * WMS対象か
	 */
	protected boolean isWms(ArrSchd_DtlR r) {
		MAM_LOC_R locR = getLocR(r.arr_loc_cd());
		if (r.arr_skip_flg()
			|| (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ()))
					&& !locR.getBoolean("arr_flg")
			|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
				&& MAC_PROV_RCV_TYP.isNOT_ARR(locR.getString("prov_rcv_typ"))
			|| !r.arr_schd().wms_flg()	// SCM IF制御マスタの値が設定済
		) {
			return false;
		}
		return true;
	}

	/**
	 * MST_ARR_SCHDキャッシュ
	 */
	protected static void initArrSchdCacheByArrPrNo(MCList<? extends MCRow> dtlL) {
		object(CLAZZ)._initArrSchdCacheByArrPrNo(dtlL);
	}
	protected MCList<MST_ARR_SCHD_R> _arrSchdCacheByArrPrNo;
	protected MCIndexKey _arrSchdCacheKeyByArrPrNo;
	protected void _initArrSchdCacheByArrPrNo(MCList<?> dtlL) {
		_arrSchdCacheByArrPrNo = MCList.create(MST_ARR_SCHD_R.class);
		MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.addWhereWithAnd(t.arr_pr_no.eq(bind("arr_pr_no")));
		dbSelect("MSBDL5120_MST_ARR_SCHD_S01", _arrSchdCacheByArrPrNo, dbc_bldr, dtlL);
		_arrSchdCacheKeyByArrPrNo = _arrSchdCacheByArrPrNo.createIndex(MST_ARR_SCHD_R.$arr_pr_no);
	}
	protected static MCList<MST_ARR_SCHD_R> getArrSchdCacheByArrPrNo() {
		return object(CLAZZ)._arrSchdCacheByArrPrNo;
	}
	protected MST_ARR_SCHD_R getArrSchdRByArrPrNo(String arrPrNo) {
		return getArrSchdCacheByArrPrNo().getFirst(object(CLAZZ)._arrSchdCacheKeyByArrPrNo, arrPrNo);
	}
	// ///////////////////////////////////////////////
	// キャッシュ（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// ユーティリティ（ここから）
	// ///////////////////////////////////////////////
	/**
	 * サブロット発番するか判定する
	 */
	protected boolean isCrtSublot(ArrSchd_DtlR r) {
		MAM_ITM_R itmR = getItmR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
		if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
			return false;
		}
		else if (isNull(r.sublot_no()) && !MAC_LOT_NO_TYP.isMANUAL(itmR.sublot_no_typ())) {
			if (r.crt_lot_flg()) {
				return true;
			}
			else if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())) {
				if (MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
					if (MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())) {
						return true;
					}
					else if (!isNull(r.lot_no())) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * 非在庫チェック
	 */
	protected boolean isNotStk(MAM_ITM_R itmR, String trdPtnTyp, MAM_BIZ_RSN_R rsnR) {
		if (MAC_STK_MNG_TYP.isNOT_MNG(itmR.stk_mng_typ())) {
			return true;
		}
		if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ()) && MAC_ASSET_MNG_TYP.isMNG(itmR.asset_mng_typ())) {
			if (MAC_TRD_PTN_TYP.isPURC_XPNS(trdPtnTyp) || MAC_TRD_PTN_TYP.isPURC(trdPtnTyp)) {
				if (rsnR != null && rsnR.xpns_purc_flg()) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * 余剰なく取引単位数量に変換できる場合のみ変換します。
	 * それ以外は基準単位数量を返します。
	 * 
	 * @param baseUnitQty 基準単位数量
	 * @param baseUnitCd 基準単位ＣＤ
	 * @param iuR 取引単位ＣＤの品目単位マスタレコード
	 * @return 取引単位数量 or 基準単位数量
	 */
	protected MCNumber getTrdUnitQty(MCNumber baseUnitQty, String baseUnitCd, MAVM_ITM_UNIT_R iuR) {
		return rvrsBaseUnitConv(baseUnitQty, iuR.conv_base_qty(), iuR.conv_qty(),
				iuR.dec_place(), iuR.rnd_typ(), true);
	}

	/**
	 * 取引パタン区分ロウマッチャー
	 */
	public class TrdPtnTypMatcher implements MCRowMatcher<ArrSchd_DtlR> {

		MAC_TRD_PTN_TYP[] _trdPtnTyp;
		
		public TrdPtnTypMatcher(MAC_TRD_PTN_TYP... trdPtnTyp) {
			_trdPtnTyp = trdPtnTyp;
		}

		@Override
		public boolean match(ArrSchd_DtlR r) {
			for (MAC_TRD_PTN_TYP typ : _trdPtnTyp) {
				if (isSame(r.trd_ptn_typ(), typ.value())) {
					return true ;
				}
			}
			return false;
		}
	}

	/**
	 * 入荷パタン区分を取得する
	 */
	protected String getDefaultArrPtnTyp(MST_ARR_SCHD_R r) {
		if (!isNull(r.getDateNE("purc_schd_dt")) && r.getDateNE("purc_schd_dt").ltDate(r.arr_schd_tm())) {
			return MSC_ARR_PTN_TYP.N_YET_ARR.value();
		}
		else {
			return MSC_ARR_PTN_TYP.NRML.value();
		}
	}

	/**
	 * 入荷進捗の更新項目を設定する
	 */
	protected void setArrPr(MCList<MST_ARR_PR_R> updL) {

		MCList<MST_ARR_SCHD_R> dbc = MCList.create(MST_ARR_SCHD_R.class);
		MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MST_PURC_SCHD_R t1 = MST_PURC_SCHD_R.create("T1");
		MST_ARR_ACT_R t2 = MST_ARR_ACT_R.create("T2");
		MST_ARR_PR_R t3 = MST_ARR_PR_R.create("T3");
		dbc.addBooleanColumn("arr_cmpl_flg");
		dbc.addBooleanColumn("sls_ret_cmpl_flg");
		dbc.addBooleanColumn("purc_cmpl_flg");
		dbc_bldr.setSelect(
				t.arr_schd_no,
				t.arr_pr_no,
				t.arr_schd_tm,
				t.abort_qty.as("arr_schd_abort_qty"),
				t.arr_qty,
				t.cmpl_flg.as("arr_cmpl_flg"),
				t2.arr_act_no,
				t2.arr_tm,
				nvl(t1.base_unit_abort_qty, value(0)).as("purc_schd_abort_qty"),
				nvl(t1.base_unit_purc_qty, value(0)).as("purc_qty"),
				nvl(t1.base_unit_accpt_dfct_qty, value(0)).as("accpt_dfct_qty"),
				nvl(t1.cmpl_flg, value(false)).as("purc_cmpl_flg"),
				t.sls_ret_schd_abort_qty,
				t.sls_ret_qty,
				t.sls_ret_schd_cmpl_flg.as("sls_ret_cmpl_flg"),
				t.abort_flg,
				t3.po_d_no
		);
		dbc_bldr.addLeftOuterJoin(t1, bracket(t1.arr_schd_no.eq(t.arr_schd_no)));
		dbc_bldr.addLeftOuterJoin(t2, bracket(
				t2.arr_schd_no.eq(t.arr_schd_no)
				.and(t2.can_flg.eq(value(false)))));
		dbc_bldr.addInnerJoin(t3, bracket(t3.arr_pr_no.eq(t.arr_pr_no)));
		dbc_bldr.setWhere(t.arr_pr_no.eq(bind("arr_pr_no")));
		dbSelect("MSBEL5900_MST_ARR_SCHD_S04", dbc, dbc_bldr, updL);
		if (dbc.isEmpty())	return;

		MCIndexKey idx = dbc.createIndex(MST_ARR_SCHD_R.$arr_pr_no);
		updL.addBooleanColumn("check");
		for (MST_ARR_PR_R r : updL) {
			r.arr_schd_abort_qty(0);
			r.arr_qty(0);
			r.purc_schd_abort_qty(0);
			r.purc_qty(0);
			r.accpt_dfct_qty(0);
			r.sls_ret_schd_abort_qty(0);
			r.sls_ret_qty(0);
			r.arr_schd_tm(null);
			r.arr_tm(null);
			r.arr_cmpl_flg(false);
			r.purc_cmpl_flg(false);
			r.sls_ret_cmpl_flg(false);

			MCList<MST_ARR_SCHD_R> apL = dbc.subList(idx, r.arr_pr_no());
			for (MCList<MST_ARR_SCHD_R> asL : apL.groupList(MST_ARR_SCHD_R.$arr_schd_no)) {
				MST_ARR_SCHD_R asR = asL.get(0);

				// 入荷
				r.arr_schd_abort_qty(sum(r.arr_schd_abort_qty(), asR.getNumber("arr_schd_abort_qty")));
				r.arr_qty(sum(r.arr_qty(), asR.getNumber("arr_qty")));

				// 仕入
				r.purc_schd_abort_qty(sum(r.purc_schd_abort_qty(), asR.getNumber("purc_schd_abort_qty")));
				r.purc_qty(sum(r.purc_qty(), asR.getNumber("purc_qty")));
				r.accpt_dfct_qty(sum(r.accpt_dfct_qty(), asR.getNumber("accpt_dfct_qty")));

				// 売上返品
				r.sls_ret_schd_abort_qty(sum(r.sls_ret_schd_abort_qty(), asR.getNumber("sls_ret_schd_abort_qty")));
				r.sls_ret_qty(sum(r.sls_ret_qty(), asR.getNumber("sls_ret_qty")));
			
				r.po_d_no(asR.getString("po_d_no"));
			}
			if (!apL.isEmpty()) {
				// 打切ＦＬＧがオフのレコードだけ取得
				MCList<MST_ARR_SCHD_R> tmpL = apL.subList(MST_ARR_SCHD_R.$abort_flg, false);
				// 入荷数量が0より大きいレコードだけ取得(一部打切を考慮)
				tmpL.addAll(apL.subList(rr -> (rr.arr_qty().gt(MCNumber.ZERO))));
				// 入荷予定分割ＦＬＧ判定のために重複の削除
				tmpL = tmpL.distinctNE(MST_ARR_SCHD_R.$arr_schd_no);
				
				// 入荷予定日時の設定
				r.arr_schd_tm((MCDate)tmpL.max("arr_schd_tm"));
				
				// 打切ＦＬＧがオフのレコード、もしくは入荷数量が0より大きいレコードが2件以上あったら、入荷予定分割ＦＬＧをオンにする
				r.arr_schd_split_flg(tmpL.count(MST_ARR_SCHD_R.$arr_schd_no) >= 2 ? true : false);
				r.arr_tm((MCDate)apL.max("arr_tm"));
				r.arr_cmpl_flg((boolean)apL.min("arr_cmpl_flg"));
				r.purc_cmpl_flg((boolean)apL.min("purc_cmpl_flg"));
				r.sls_ret_cmpl_flg((boolean)apL.min("sls_ret_cmpl_flg"));
				if(r.getBooleanNE("rem_abort_flg")) {
					r.abort_flg((boolean)apL.max("abort_flg"));
				}
			}
			// 標準納入ＬＴ
			MST_PO_D_R podR = getPoDR(r.po_d_no());
			r.std_purc_lt(podR.purc_lt());
			// 入荷完了のみ設定する
			if (r.arr_cmpl_flg()) {
				if (!isNull(r.arr_tm())) {
					r.setBooleanNE("check", true);
					r.addDateColumn("dt_fr", podR.getDateNE("po_dt"));
					r.addDateColumn("dt_to", r.arr_tm().trunc(MCDateFieldType.DAY));
					r.addStringColumn("cal_cd", nvl(r.getStringNE("sppl_cal_cd"), getCo().std_cal_cd()));
				}
			}
			else {
				r.arr_tm(null);
				r.act_purc_lt(null);
			}
		}

		String[] key = new String[] {
				MST_ARR_PR_R.$arr_cmpl_flg, "check"
		};
		Comparable<?>[] val = new Comparable<?>[] {true, true};
		
		MCList<MST_ARR_PR_R> cmplL = updL.subList(key, val);
		String actPurcLtCol = "act_purc_lt";

		execCalDaysBatch(actPurcLtCol, cmplL, "dt_fr", "dt_to", "cal_cd");
		for (MST_ARR_PR_R r : cmplL) {
			MCNumber days = r.getNumberNE(actPurcLtCol);
			r.act_purc_lt(days == null || isSame(days, MCNumber.ZERO) ? null
					: days.subtract(1));
		}
	}

	/**
	 * KPI関連項目更新
	 */
	protected void updArrPrForKPI(MCList<MST_ARR_PR_R> updL) {
		MCList<MST_ARR_PR_R> poL = updL.subList(r -> !isNull(r.po_d_no()));
		if (poL.isEmpty()) {
			return;
		}

		// 回答納期遅れ
		MCList<MST_PO_D_R> pdL = MCList.create(MST_PO_D_R.class);
		poL.forEach(r -> pdL.add().po_d_no(r.po_d_no()));
		MSBDL_PurcUtil.srchPrmsRcptOverDue(pdL);
		MCIndexKey idx1 = pdL.createIndex(MST_PO_D_R.$po_d_no);
		poL.forEach(r -> {
			MST_PO_D_R pdR = pdL.getFirst(idx1, r.po_d_no());
			r.prms_dlv_dt_overdue_flg(
				pdR.getBoolean("prms_rcpt_over_flg"));
		});

		// 購買状況区分
		MSBDL_PurcUtil.PurcUtil_Srch04 o = MSBDL_PurcUtil.crtPurcUtil_Srch04();
		setAll(o.up0(), poL, createMap_Map_PurcUtil_Srch04_DtlR_MST_ARR_PR_R());
		o.exec();
		MCIndexKey idx2 = o.down0().createIndex(PurcUtil_Srch04_DtlR.$po_d_no);
		for (MST_ARR_PR_R r : poL) {
			PurcUtil_Srch04_DtlR downR = o.down0().getFirst(idx2, r.po_d_no());
			r.purc_sts_typ(downR.purc_sts_typ());
		}

		// 入荷進捗に反映
		MST_ARR_PR_R dbc = MST_ARR_PR_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		builder.setSet(dbc.purc_sts_typ);
		builder.addSet(dbc.prms_dlv_dt_overdue_flg);
		builder.addSetVL(dbc.dlv_rqst_dt_overdue_flg,
				cases().when(dbc.arr_cmpl_flg.eq(value(true))
						.and(dbc.purc_cmpl_flg.eq(value(true)))
						.and(dbc.arr_tm.gt(dbc.dlv_rqst_tm))).then(value(true))
						.otherwise(value(false)));
		dbUpdateKey("MSBEL5900_MST_ARR_PR_U05", poL, builder);
	}
	protected Map_PurcUtil_Srch04_DtlR_MST_ARR_PR_R<PurcUtil_Srch04_DtlR, MST_ARR_PR_R> createMap_Map_PurcUtil_Srch04_DtlR_MST_ARR_PR_R() {
		return new Map_PurcUtil_Srch04_DtlR_MST_ARR_PR_R<PurcUtil_Srch04_DtlR, MST_ARR_PR_R>();
	}
	public class Map_PurcUtil_Srch04_DtlR_MST_ARR_PR_R<D extends PurcUtil_Srch04_DtlR, S extends MST_ARR_PR_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcUtil_Srch04_DtlR.$po_d_no, MST_ARR_PR_R.$po_d_no);
			addColumnPathMap(PurcUtil_Srch04_DtlR.$purc_sts_typ, MST_ARR_PR_R.$purc_sts_typ);
		}
	}
	// ///////////////////////////////////////////////
	// ユーティリティ（ここまで）
	// ///////////////////////////////////////////////
	/**
	 * ChkUpd2オペレーション.<p>
	 *
	 * 更新（予定・実績）前チェックを行います。<br>
	 */
	public class ChkUpd2 extends MSBEL_ArrSchdService_MC_A.ChkUpd2 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			MSBEL_ArrSchdService.ArrSchd_Chk02 chkOpe = MSBEL_ArrSchdService.crtArrSchd_Chk02();
			chkOpe.up0().setAll(up0());
			chkOpe.exec();
			down0().setAll(chkOpe.down0());

			MSBEL_ArrSchdService.ArrSchd_Upd02 updOpe = MSBEL_ArrSchdService.crtArrSchd_Upd02();
			updOpe.up0().setAll(up1());
			updOpe.exec();
			down1().setAll(updOpe.down0());
		}
	}
	/**
	 * ChkUpd1オペレーション.<p>
	 *
	 * 更新（予定・実績）前チェックを行います。<br>
	 */
	public class ChkUpd1 extends MSBEL_ArrSchdService_MC_A.ChkUpd1 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			MSBEL_ArrSchdService.ArrSchd_Chk01 chkOpe = MSBEL_ArrSchdService.crtArrSchd_Chk01();
			chkOpe.up0().setAll(up0());
			chkOpe.exec();
			down0().setAll(chkOpe.down0());

			MSBEL_ArrSchdService.ArrSchd_Upd01 updOpe = MSBEL_ArrSchdService.crtArrSchd_Upd01();
			updOpe.up0().setAll(up1());
			updOpe.up1().setAll(up2());
			updOpe.exec();
			down1().setAll(updOpe.down0());
		}
	}
	/**
	 * ArrSchd_Upd04オペレーション.<p>
	 *
	 * 入荷予定の納品書ＮＯを更新します。<br>
	 */
	public class ArrSchd_Upd04 extends MSBEL_ArrSchdService_MC_A.ArrSchd_Upd04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			updArrSchd();
			callArrSchdSendIf();
		}
		/**
		 * 入荷予定.納品書ＮＯの更新
		 */
		protected void updArrSchd() {
			MCList<MST_ARR_SCHD_R> dbc = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			for(ArrSchd_DtlR r : up0()) {
				dbc.add(r.arr_schd());
			}
			dbc_bldr.setSet(t.dlv_slip_no);
			dbc_bldr.addSet(t.wms_flg);
			dbUpdateKey("MSBEL5900_MST_ARR_SCHD_U05", dbc, dbc_bldr);
		}
		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			MCList<MST_ARR_SCHD_R> l = MCList.create(MST_ARR_SCHD_R.class);
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(MST_ARR_SCHD_R.create("T"));
			dbSelectKey("MSBEL5900_MST_ARR_SCHD_S05", l, l_bldr, up0());
			MCIndexKey idx = l.createIndex(MST_ARR_SCHD_R.$arr_schd_no);

			for (ArrSchd_DtlR r : up0()) {
				MST_ARR_SCHD_R asR = l.getFirst(idx, r.arr_schd_no());
				// 上り電文の値で上書き
				asR.dlv_slip_no(r.dlv_slip_no());

				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				r.arr_schd(asR);

				MST_ARR_PR_R apR = getArrPrR(asR.arr_pr_no());
				r.trd_ptn_typ(apR.trd_ptn_typ());
			}

			// WMSフラグの設定
			setPegNo(UP1_PEG_NO_COL, up0());
			initScmIfCtrl(up0());
			for (ArrSchd_DtlR r : up0()) {
				if (MSC_PR_STS_TYP.isNOT_ARR(r.pr_sts_typ())) {
					r.arr_schd().wms_flg(isWms(r));
				}
				else {
					MST_ARR_SCHD_R asR = l.getFirst(idx, r.arr_schd_no());
					r.arr_schd().wms_flg(asR.wms_flg());
				}
			}
		}

		/**
		 * 入荷予定送信ＩＦサービス呼び出し
		 */
		protected void  callArrSchdSendIf() {
			callArrSchdSendIfUpd01(up0());
		}
	}

	protected void setProvSchdMsg4Upd02(MCList<ArrSchd_DtlR> up0L, MCList<ProvSchd_DtlR> psUp0L) {
		
		MCList<ArrSchd_DtlR> tgtL = MCList.create(ArrSchd_DtlR.class);
		for (ArrSchd_DtlR up0R : up0L) {
			// 実績更新と同時に実行される場合は更新対象としない
			if (up0R.is_src_arract_srv_flg()
				|| up0R.is_src_purcact_srv_flg()) {
				continue;
			}
			
			MST_ARR_SCHD_R asR = getArrSchdR(up0R.arr_schd_no());
			MST_ARR_PR_R apR = getArrPrR(asR.arr_pr_no());
			
			if ( !(MAC_TRD_PTN_TYP.isPURC(apR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(apR.trd_ptn_typ())) ) {
				continue;
			}
			else if(hasArrPurcAct(asR)) {
				continue;
			}
			else if(!isOutSrcLoc(asR)) {
				continue;
			}
			
			tgtL.add(up0R);
		}
		if (tgtL.isEmpty()) {
			return;
		}
		
		for (ArrSchd_DtlR tgtR : tgtL) {
			MST_ARR_SCHD_R asR = getArrSchdR(tgtR.arr_schd_no());
			MAM_LOC_R locR = getLocR(asR.arr_loc_cd());
			
			ProvSchd_DtlR psUp0R = psUp0L.add();
			psUp0R.peg_no(tgtR.peg_no());
			psUp0R.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			psUp0R.prov_src_schd_typ(MSC_PROV_SRC_SCHD_TYP.DDLV.value());
			psUp0R.prov_src_schd_no2(asR.arr_schd_no());
			psUp0R.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV.value());
			psUp0R.base_unit_cd(asR.base_unit_cd());
			psUp0R.base_unit_qty(asR.base_unit_qty());
			if (!isNull(asR.getDateNE("purc_schd_dt")) && asR.getDateNE("purc_schd_dt").gtDate(asR.arr_schd_tm())) {
				psUp0R.accpt_schd_dt(asR.getDateNE("purc_schd_dt"));
			}
			else {
				psUp0R.accpt_schd_dt(asR.arr_schd_tm().trunc(MCDateFieldType.DAY));
			}
			psUp0R.wg_cd(asR.wg_cd());
			psUp0R.prsppl_cd(locR.sppl_cd());
			psUp0R.itm_cd(asR.itm_cd());
			psUp0R.itm_sub1(asR.itm_sub1());
			psUp0R.itm_sub2(asR.itm_sub2());
			psUp0R.itm_sub3(asR.itm_sub3());
			psUp0R.stk_id_typ(asR.stk_id_typ());
		}
	}
	
	protected boolean hasArrPurcAct(MST_ARR_SCHD_R asR) {
		return asR.arr_qty().isPositive() || asR.purc_qty().isPositive();
	}
	
	protected boolean isOutSrcLoc(MST_ARR_SCHD_R asR) {
		MAM_LOC_R locR = getLocR(asR.arr_loc_cd());
		return !isNull(locR) && !isNull(locR.sppl_cd());
	}
	
	protected boolean isDelTempAp(MST_ARR_SCHD_R bfAsR, MST_ARR_SCHD_R afAsR) {
		return isNullOrZero(bfAsR.arr_qty()) && isNullOrZero(bfAsR.purc_qty())
				&& isNullOrZero(afAsR.arr_qty()) && isNullOrZero(afAsR.purc_qty());
	}
	
	protected boolean isNullOrZero(MCNumber num) {
		return isNull(num) || num.isZero();
	}

	//FMCB CUSTOM END
}