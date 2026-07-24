package mcframe.serverMSBE.MSBEL5550;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5550.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrR;
import mcframe.serverMSLA.MSLAL5210.MSLAL_BillSendIfService;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCFuncCache;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
import mcframe.serverMABS.MABSL5010.*;
import mcframe.commonMSBE.MSBER0100.*;
import mcframe.commonMSBE.MSBER0110.*;
import mcframe.commonMSBE.MSBER0120.*;
import mcframe.commonMSBE.MSBER0130.*;
import mcframe.commonMSBE.MSBER0410.*;
import mcframe.commonMSBE.MSBER0500.*;
import static mcframe.serverMSBE.MSBEL5550.Query.*;
import static mcframe.commonFXUC.FXUCC0030.FXUCC_Divide.*;
import mcframe.commonCore.report.container.MCReportInfoR;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.serverCore.report.MCServerReportManager;
import static mcframe.serverCore.dbc.CoreFunction.*;
import static mcframe.commonFX.notice.FX_Msg.FXUCC0014;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.HashSet;
import java.util.LinkedHashMap;
import mcframe.serverMSUC.MSUCL0120.*;
import mcframe.serverMSUC.MSUCL0020.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverMSUC.MSUCL0130.MSUCL_AmtUtil;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.commonCore.report.MCFileWriteListener;
import mcframe.commonCore.report.MCReportFile;
import mcframe.commonCore.report.MCUCXSingleFile;
import mcframe.serverMBBC.MBBCL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ShipRprtPrntService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ShipRprtPrntService_MC extends MSBEL_ShipRprtPrntService_MC_A{
	//FMCB CUSTOM START
		public static final Class<MSBEL_ShipRprtPrntService> CLAZZ = MSBEL_ShipRprtPrntService.class;
	/**
	 * ShipRprt_Upd01オペレーション.<p> 
	 *
	 * 納品伝票・明細トランザクションの作成・更新(削除含む)と納品書発行する<br>
	 */
	public class ShipRprt_Upd01 extends MSBEL_ShipRprtPrntService_MC_A.ShipRprt_Upd01 {

		/**
		 * 納品伝票（更新用）
		 */
		protected MCList<ShipRprt_Upd01_HdrR> _updHdrL = null;

		/**
		 * 納品伝票明細（更新用）
		 */
		protected MCList<ShipRprt_Upd01_DtlR> _updDtlL = null;
		/**
		 * 納品伝票（帳票発行用）
		 */
		protected MCList<ShipRprt_Upd01_HdrR> _prntHdrL = null;
		
		/**
		 * 上り電文（up1）の納品書ＮＯに対するインデックス
		 */
		 protected MCIndexKey _up1DlvSlipNoIdx = null;

		/**
		 * サービス実行前のメッセージの状態
		 */
		protected MCMessageList _msgLPreSv = null;
		protected MCList<MST_IV_D_R> _shipInstIvDL = MCList.create(MST_IV_D_R.class);
		protected MCIndexKey _shipInstIvDIdx = null;
		
		protected MCList<MST_IV_D_R> _shipActIvDL = MCList.create(MST_IV_D_R.class);
		protected MCIndexKey _shipActIvDIdx = null;

		/**
		 * 上り電文の取引単位、数量を退避
		 */
		protected String _ORG_TRD_UNIT_CD = "__org_trd_unit_cd__";
		protected String _ORG_TRD_UNIT_QTY = "__org_trd_unit_qty__";
		/**
		 * 上り電文の為替レート、納税為替レートを退避
		 */
		protected String _ORG_XRATE = "__org_xrate__";
		protected String _ORG_PTAX_XRATE = "__org_ptax_xrate__";

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			preProc();
			editUp();
			doCache();
			bfrSplit();
			throwWhenShipRptPrntErr();

			split();
			makeDlvSlipL();
			setAmt();
			setDlvSlipNo();
			setDlvSlipDNo();
			chkNotUpdDlvSlip();
			updDlvSlipD();
			updDlvSlip();
			prntDlvSlip();
			setDown();
		}

		/**
		 * マスタ、およびトランをキャッシュする
		 */
		protected void doCache() {
			doBpCache(up0());
			doTrdCache(up0());
			doLocCache(up0());
			doSlipPrntCache(up0());
			doItmCache(up1());
			doBpItmCache(up0(), up1());
			doItmUnitCache(up1());
			doSloDCache(up1());
			doShipSchdCache(up1());
			doDlvInstRcptCache(up1());
			doProvSchdCache(up0(), up1());
			doDlvSlipCache(up0());
			doCurCache(up0());
			doBizRsnCache(up1());
			doSlsActCache(up0());
			doIvDCache(up0(), up1());
		}

		/**
		 * 前処理を実行する
		 */
		protected void preProc() {
			_updHdrL = MCList.create(ShipRprt_Upd01_HdrR.class);
			_updDtlL = MCList.create(ShipRprt_Upd01_DtlR.class);
			_prntHdrL = MCList.create(ShipRprt_Upd01_HdrR.class);
			_up1DlvSlipNoIdx = up1().createIndex(ShipRprt_Upd01_DtlR.$dlv_slip_no);
			_msgLPreSv = new MCMessageList();
			_msgLPreSv.addAll(MCMessagePool.getMessageList());
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			MCIndexKey idx = up1().createIndex(ShipRprt_Upd01_DtlR.$hdr_peg_no);
			int seq =1;
			for (ShipRprt_Upd01_HdrR hdrR : up0()) {
				hdrR.hdr_peg_seq(1);
				hdrR.setNumberNE(_ORG_XRATE, hdrR.xrate());
				hdrR.setNumberNE(_ORG_PTAX_XRATE, hdrR.ptax_xrate());
				
				MCList<ShipRprt_Upd01_DtlR> dtlL = up1().subList(idx, hdrR.hdr_peg_no());
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ()) && dtlL.isEmpty()) {
					// 指図に紐付く全明細が打ち切られた場合、明細は送られてこないので納品伝票は削除する
					hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					continue;
				}
				
				for (ShipRprt_Upd01_DtlR dtlR : dtlL) {
					dtlR.hdr_peg_seq(1);
					dtlR.dtl_uniq_seq(seq++);	// 初期値では上り電文の順番を保持

					dtlR.trn_typ(hdrR.trn_typ());
					dtlR.trd_ptn_typ(hdrR.trd_ptn_typ());
					dtlR.bp_cd(hdrR.bp_cd());

					if (!hdrR.dlv_sundry_flg()) {
						hdrR.dlv_id_nm(null);
					}

					// 売上系は、単価等、金額計算関連は出荷日時or納品日時（後で取得する）
					// 支給系は、支給予定(実績)の検収予定日（後で取得する）
					dtlR.base_dt(hdrR.dlv_tm());
					// 明細の取引通貨、WGは、支給単価マスタの取得に使用する
					dtlR.trd_cur_cd(hdrR.trd_cur_cd());
					dtlR.wg_cd(hdrR.wg_cd());
					
					// 売上系では上り電文の単位が出荷予定と異なる場合、変換するので事前に元の値を退避しておく
					dtlR.setStringNE(_ORG_TRD_UNIT_CD, dtlR.trd_unit_cd());
					dtlR.setNumberNE(_ORG_TRD_UNIT_QTY, dtlR.trd_unit_qty());
				}
			}
		}

		/**
		 * 出荷帳票発行SV内でエラーが起きた場合にエラーとする
		 */
		protected void throwWhenShipRptPrntErr() {
			if (_msgLPreSv.size() != MCMessagePool.size()) {
				MCMessageList causeMsgList = new MCMessageList();

				for (MCMessage causeMsg : MCMessagePool.getMessageList()) {
					if (!_msgLPreSv.contains(causeMsg)) {
						causeMsgList.add(causeMsg);
					}
				}

				MCMessagePool.removeAll(causeMsgList);

				MCMessageList msg = new MCMessageList();
				msg.add(msgPrintErr());
				msg.addAll(causeMsgList);
				MCAppException ex = new MCAppException(msg.get(0));
				msg.remove(0);
				ex.addCauseMessageList(msg);

				throw ex;
			}
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			// 下り電文に納品書NOを設定する
			MCIndexKey idx = up1().createIndex(
					ShipRprt_Upd01_DtlR.$hdr_peg_no,
					ShipRprt_Upd01_DtlR.$hdr_peg_seq,
					ShipRprt_Upd01_DtlR.$dtl_uniq_seq);
			for (ShipRprt_Upd01_DtlR r : _updDtlL) {
				up1().subList(idx, r.toArray(idx.getKeys()))
					.forEach(rr -> {
						rr.dlv_slip_no(r.dlv_slip_no());
						rr.dlv_slip_d_no(r.dlv_slip_d_no());
						rr.dlv_slip_seq(r.dlv_slip_seq());
						rr.upded_flg(r.upded_flg());
						rr.dlv_slip_prnted_flg(r.dlv_slip_prnted_flg());
						rr.ship_adv_prnted_flg(r.ship_adv_prnted_flg());
						rr.dlv_slip_rev(r.dlv_slip_rev());
					}
				);
			}
			down0().setAll(up1());
		}

		/**
		 * ロット明細分割区分の設定を反映する
		 */
		protected void updSlipEachLotTyp(ShipRprt_Upd01_HdrR hdrR, MCList<ShipRprt_Upd01_DtlR> dtlL) {
			if (!isSlipEachLotTypTrd(hdrR.trd_ptn_typ())) {
				return;
			}
			MAM_BP_R bpR = getBpR(hdrR.bp_cd());
			if (MAC_SLIP_EACH_LOT_TYP.isNOT_EACH(bpR.slip_each_lot_typ())) {
				// 分割しない（なのでロット、サブロットをクリア）

				if (MSC_TRN_TYP.isSLS(hdrR.trn_typ())) {
					// まとまる場合は予めクリアされて上ってくる
					for(ShipRprt_Upd01_DtlR r : dtlL) {
						if (isNull(r.lot_no())) {
							r.lot_plural_flg(true);
						}
						else {
							if (isNull(r.sublot_no())) {
								r.sublot_plural_flg(true);
							}
						}
					}
				}
				else if (MSC_TRN_TYP.isSHIP(hdrR.trn_typ())
							|| MSC_TRN_TYP.isPURC(hdrR.trn_typ())) {
					// ロット、サブロットの組で一意に定まる場合はクリアせず、まとまる場合のみクリアする
					List<String> cndArray = getDtlGrpCndArray(hdrR);
					cndArray.removeAll(Arrays.asList(ShipRprt_Upd01_DtlR.$lot_no, ShipRprt_Upd01_DtlR.$sublot_no));

					for (MCList<ShipRprt_Upd01_DtlR> sameDlvDtlL : dtlL.groupList(cndArray.toArray(new String[cndArray.size()]))) {
						if(sameDlvDtlL.groupBy(ShipRprt_Upd01_DtlR.$lot_no, ShipRprt_Upd01_DtlR.$sublot_no).size() > 1) {
							sameDlvDtlL.forEach(r -> {
								r.lot_no(null);
								r.sublot_no(null);
								r.lot_plural_flg(true);
							});
						}
					}
				}
			}
			else if (MAC_SLIP_EACH_LOT_TYP.isEACH_LOT(bpR.slip_each_lot_typ())) {
				// ロットのみ（なのでサブロットをクリア）

				if (MSC_TRN_TYP.isSLS(hdrR.trn_typ())) {
					// まとまる場合は予めクリアされて上ってくる
					for(ShipRprt_Upd01_DtlR r : dtlL) {
						if (isNull(r.lot_no())) {
							r.lot_plural_flg(true);
						}
						else {
							if (isNull(r.sublot_no())) {
								r.sublot_plural_flg(true);
							}
						}
					}
				}
				else if (MSC_TRN_TYP.isSHIP(hdrR.trn_typ())
							|| MSC_TRN_TYP.isPURC(hdrR.trn_typ())) {
					// サブロットが一意に定まる場合はクリアせず、まとまる場合のみクリアする
					List<String> cndArray = getDtlGrpCndArray(hdrR);
					cndArray.remove(ShipRprt_Upd01_DtlR.$sublot_no);
	
					for (MCList<ShipRprt_Upd01_DtlR> sameDlvDtlL : dtlL.groupList(cndArray.toArray(new String[cndArray.size()]))) {
						if(sameDlvDtlL.groupBy(ShipRprt_Upd01_DtlR.$sublot_no).size() > 1) {
							sameDlvDtlL.forEach(r -> {
								r.sublot_no(null);
								r.sublot_plural_flg(true);
							});
						}
					}
				}
			}
			else if (MAC_SLIP_EACH_LOT_TYP.isEACH_LOT_SUBLOT((bpR.slip_each_lot_typ()))) {
				for (ShipRprt_Upd01_DtlR r : dtlL) {
					if (isNull(r.lot_no())) {
						r.lot_plural_flg(true);
					}
					else {
						if (isNull(r.sublot_no())) {
							r.sublot_plural_flg(true);
						}
					}
				}
			}
		}

		/**
		 * 納品書情報を補完する
		 */
		protected void cmplDlvSlip(ShipRprt_Upd01_HdrR hdrR, MCList<ShipRprt_Upd01_DtlR> dtlL) {

			// 他勘定、振替
			if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(hdrR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSCRP(hdrR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isXFR_ITM(hdrR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isXFR_LOT_SNO(hdrR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isXFR_GRD(hdrR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isXFR_PACK(hdrR.trd_ptn_typ())) {

				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
					MCList<MST_DLV_SLIP_R> slipL = getDlvSlipL(hdrR);
					if (isNull(slipL)) {
						MCMessagePool.addAll(getRecordNotFoundMsg("MS", "MST_DLV_SLIP"
								, new String[]{MST_DLV_SLIP_R.$trn_typ, MST_DLV_SLIP_R.$dlv_slip_act_no}
								, new Comparable[]{hdrR.trn_typ(), hdrR.dlv_slip_act_no()}, hdrR));
					}
					else {
						// 他勘定、振替は納品書NOと伝票実績NOとで１対１になる
						MST_DLV_SLIP_R slipR = slipL.get(0);
						dtlL.forEach(r -> {
							// 納品書NOを引き継ぐ
							r.dlv_slip_no(slipR.dlv_slip_no());
						}); 
					}
				}
			}

			// 税計算区分を納品伝票トランから補完
			if (isCalcAmtTrd(hdrR.trd_ptn_typ())) {
				MCList<MST_DLV_SLIP_R> slipL = getDlvSlipL(hdrR);
				if (!isNull(slipL)) {
					MST_DLV_SLIP_R slipR = slipL.get(0);
					hdrR.ds().tax_calc_typ(slipR.tax_calc_typ());
				}
			}
		}

		/**
		 * 受注、受注明細情報を補完する
		 */
		protected void cmplSlo(ShipRprt_Upd01_HdrR hdrR, MCList<ShipRprt_Upd01_DtlR> dtlL) {
			// 取引パタン区分が「売上」「出荷」が対象
			if (!MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())
				&& !MAC_TRD_PTN_TYP.isSHIP(hdrR.trd_ptn_typ())) {
				return;
			}
			boolean isHdr = false;
			for (ShipRprt_Upd01_DtlR r : dtlL) {
				if (isNull(r.slo_d_no())) {
					setBaseDtForSls(hdrR, r);
					if (isCalcAmtTrd(r.trd_ptn_typ())) {
						if (isWtax(r) && isNull(r.wtax_rate())) {
							r.wtax_rate(getWtaxRate(r));
						}
					}
					continue;
				}
				MST_SLO_D_R sloDR = getSloDR(r.slo_d_no());
				if (isNull(sloDR)) {
					MCMessagePool.addAll(getRecordNotFoundMsg("MS", "MST_SLO_D"
							, new String[]{MST_SLO_D_R.$slo_d_no}
							, new Comparable[]{r.slo_d_no()}, r));
				}
				else {
					if (!isHdr) {
						if (MSC_TRN_TYP.isPURC(hdrR.trn_typ())) {
							// ShipRprt_Upd03から発行する場合は上り電文の値に従う
						}
						// 預り出荷の場合は受注の価格印字ＦＬＧを引き継がない
						else if (!hdrR.cststk_ship_flg()) {
							hdrR.pri_prnt_flg(sloDR.pri_prnt_flg());
						}
						hdrR.dpt_cd(sloDR.getStringNE("sls_dpt_cd"));
						hdrR.usr_cd(sloDR.getStringNE("sls_usr_cd"));
						hdrR.cst_po_no(sloDR.getStringNE("cst_po_no"));
						hdrR.trd_rmrks(sloDR.getStringNE("trd_rmrks"));
						hdrR.trd_cur_cd(sloDR.getStringNE("trd_cur_cd"));
						isHdr = true;
					}
					r.sno1(sloDR.sno1());
					r.sno2(sloDR.sno2());
					r.sno3(sloDR.sno3());
					r.sno4(sloDR.sno4());
					r.trd_cur_upri(sloDR.trd_cur_upri());
					// 受注時点の値引額を数量に応じて割り戻す
					if (!isNull(sloDR.trd_cur_dscnt_amt())) {
						MAM_BP_R  bpR = getBpR(hdrR.bp_cd());
						MAM_CUR_R curR = getCurR(hdrR.trd_cur_cd());
						MCNumber tmpDscntAmt = MCNumber.ZERO;
						tmpDscntAmt = sloDR.trd_cur_dscnt_amt().multiply(r.base_unit_qty())
								.divide(sloDR.base_unit_qty(),
									curR.amt_dec_place().intValue(),
									toRoundingMode(bpR.sls_amt_rnd_typ()));
						r.trd_cur_dscnt_amt(tmpDscntAmt);
					}
					r.trd_cur_cd(sloDR.getStringNE("trd_cur_cd"));
					if (isNull(hdrR.getNumberNE(_ORG_XRATE))) {
						if (sloDR.getBoolean("xrate_inpt_flg")) {
							r.xrate(sloDR.getNumberNE("xrate"));
						}
						else if (isCalcAmtTrd(r.trd_ptn_typ())) {
							r.xrate(getXRate(hdrR));
						}
					}
					if (isNull(hdrR.getNumberNE(_ORG_PTAX_XRATE))) {
						if (sloDR.getBoolean("ptax_xrate_inpt_flg")) {
							r.ptax_xrate(sloDR.getNumberNE("ptax_xrate"));
						}
						else if (isCalcAmtTrd(r.trd_ptn_typ())) {
							r.ptax_xrate(getPtaxRate(hdrR));
						}
					}
					if (sloDR.tax_fix_flg()) {
						r.tax_cd(sloDR.tax_cd());
					}
					r.wtax_rate(sloDR.wtax_rate());
					r.cst_po_d_no(sloDR.cst_po_d_no());
					r.cst_itm_cd(sloDR.cst_itm_cd());
					r.cst_itm_nm(sloDR.cst_itm_nm());
					setBaseDtForSls(hdrR, r);
					
					MST_SHIP_SCHD_R ssR = getShipSchdDR(r.ship_schd_no());
					if (!isSame(r.trd_unit_cd(), ssR.trd_unit_cd())) {
						// 出荷予定の取引単位(＝受注の単位)と異なる場合は、出荷予定の単位に変換する
						MCNumber qty = cnvBaseToTrdUnitQty(r, r.base_unit_qty(), ssR.trd_unit_cd());
						if (!isNull(qty)) {
							r.trd_unit_qty(qty);
							r.trd_unit_cd(ssR.trd_unit_cd());
						}
					}
				}
			}
		}
		/**
		 * インボイスの情報をキャッシュする。
		 * @param hdrL ヘッダリスト
		 * @param dtlL 明細リスト
		 */
		protected void doIvDCache(MCList<ShipRprt_Upd01_HdrR> hdrL, MCList<ShipRprt_Upd01_DtlR> dtlL) {
			
			MCIndexKey idx = dtlL.createIndex(ShipRprt_Upd01_DtlR.$hdr_peg_no);
			MCList<MST_SHIP_ALLOC_STS_R> ivShipInstBindL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MCList<MST_SHIP_ACT_D_R> ivShipActBindL = MCList.create(MST_SHIP_ACT_D_R.class);
			
			for(ShipRprt_Upd01_HdrR hdrR : hdrL) {
				if (!MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ())) {
					continue;
				}
				
				MCList<ShipRprt_Upd01_DtlR> sameHdrDtlL = dtlL.subList(idx, hdrR.hdr_peg_no());
				for(ShipRprt_Upd01_DtlR dtlR : sameHdrDtlL) {
					if (isNull(dtlR.dtl_uniq_no())) {
						continue;
					}
					
					if (!isNull(hdrR.dlv_slip_act_no())) {
						MST_SHIP_ACT_D_R bindR = MST_SHIP_ACT_D_R.create();
						bindR.ship_act_d_no(dtlR.dtl_uniq_no());
						ivShipActBindL.add(bindR);
					}
					else {
						MST_SHIP_ALLOC_STS_R bindR = MST_SHIP_ALLOC_STS_R.create();
						bindR.ship_alloc_sts_no(dtlR.dtl_uniq_no());
						ivShipInstBindL.add(bindR);
					}
				}
			}
			
			if (!ivShipInstBindL.isEmpty()) {
				_shipInstIvDL = MCList.create(MST_IV_D_R.class);
				_shipInstIvDL.addBooleanColumn(MST_IV_R.$iv_ship_flg);
				_shipInstIvDL.addBooleanColumn(MST_IV_SHIP_INST_MAP_R.$ship_inst_fix_flg);
				executeQuery(_shipInstIvDL, MSBEL5550_MST_IV_S01(), ivShipInstBindL);
				_shipInstIvDIdx = _shipInstIvDL.createIndex(MST_IV_SHIP_INST_MAP_R.$ship_alloc_sts_no);
			}
			
			if (!ivShipActBindL.isEmpty()) {
				_shipActIvDL = MCList.create(MST_IV_D_R.class);
				_shipActIvDL.addBooleanColumn(MST_IV_R.$iv_ship_flg);
				_shipActIvDL.addBooleanColumn(MST_IV_SHIP_ACT_MAP_R.$ship_act_fix_flg);
				executeQuery(_shipActIvDL, MSBEL5550_MST_IV_S02(), ivShipActBindL);
				 _shipActIvDIdx = _shipActIvDL.createIndex(MST_IV_SHIP_ACT_MAP_R.$ship_act_d_no);
			}
		}
		
		/**
		 * 明細に対応するインボイス明細を取得する。
		 * @param hdrR ヘッダ行
		 * @param dtlR 明細行
		 * @return インボイス明細
		 */
		protected MST_IV_D_R getIvD(ShipRprt_Upd01_HdrR hdrR, ShipRprt_Upd01_DtlR dtlR) {
			
			if (!isNull(hdrR.dlv_slip_act_no())) {
				MCList<MST_IV_D_R> ivDL = _shipActIvDL.subList(_shipActIvDIdx, dtlR.dtl_uniq_no());
				if (ivDL.size() == 1) {
					return ivDL.get(0);
				}
			}
			else {
				MCList<MST_IV_D_R> ivDL = _shipInstIvDL.subList(_shipInstIvDIdx, dtlR.dtl_uniq_no());
				if (ivDL.size() == 1) {
					return ivDL.get(0);
				}
			}
			
			return null;
		}
		
		/**
		 * インボイスの情報を補完する。
		 * @param hdrR ヘッダ行
		 * @param dtlL ヘッダ行に対応する明細リスト
		 */
		protected void cmplIv(ShipRprt_Upd01_HdrR hdrR, MCList<ShipRprt_Upd01_DtlR> dtlL) {
			// 取引パタン区分が「売上」「支給」が対象
			if (!MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ())) {
				return;
			}
			
			for (ShipRprt_Upd01_DtlR dtlR : dtlL) {
				if (isNull(dtlR.dtl_uniq_no())) {
					continue;
				}
				MST_IV_D_R ivDR = getIvD(hdrR, dtlR);
				if (!isNull(ivDR)) {
					dtlR.xrate(ivDR.getNumberNE("xrate"));
					dtlR.ptax_xrate(ivDR.getNumberNE("ptax_xrate"));
					dtlR.trd_cur_upri(ivDR.trd_cur_upri());
					if (dtlR.base_unit_qty().eq(ivDR.base_unit_qty())) {
						dtlR.trd_cur_amt(ivDR.trd_cur_amt());
						dtlR.trd_cur_tax_amt(ivDR.trd_cur_tax_amt());
					}
					if (!isNull(ivDR.trd_cur_dscnt_amt())) {
						if (dtlR.base_unit_qty().eq(ivDR.base_unit_qty())) {
							dtlR.trd_cur_dscnt_amt(ivDR.trd_cur_dscnt_amt());
						}
						else {
							// インボイス時点の値引額を数量に応じて割り戻す
							MAM_BP_R  bpR = getBpR(hdrR.bp_cd());
							MAM_CUR_R curR = getCurR(hdrR.trd_cur_cd());
							MCNumber tmpDscntAmt = MCNumber.ZERO;
							tmpDscntAmt = ivDR.trd_cur_dscnt_amt().multiply(dtlR.base_unit_qty())
									.divide(ivDR.base_unit_qty(),
									curR.amt_dec_place().intValue(),
									toRoundingMode(bpR.sls_amt_rnd_typ()));
							dtlR.trd_cur_dscnt_amt(tmpDscntAmt);
						}
					}
					dtlR.tax_cd(ivDR.tax_cd());
					if (!ivDR.getBooleanNE(MST_IV_R.$iv_ship_flg) 
							&& MAC_VIA_DLV_TYP.isNOT_VIA(ivDR.getStringNE(MST_IV_R.$via_dlv_typ))
							&& (ivDR.getBooleanNE(MST_IV_SHIP_INST_MAP_R.$ship_inst_fix_flg) 
									|| ivDR.getBooleanNE(MST_IV_SHIP_ACT_MAP_R.$ship_act_fix_flg))) {
						// 配送先経由しないかつインボイス単位出荷ではないの場合に、インボイス明細NOで納品明細NOを発行させるために設定する
						dtlR.iv_d_no(ivDR.iv_d_no());
					}
				}
			}
		}
		protected java.math.RoundingMode toRoundingMode(String rndTyp) {
			MAC_RND_TYP typ = MAC_RND_TYP.getNE(rndTyp);
			if (typ == null) {
				return null;
			}
			else {
				return typ.toMC();
			}
		}
		protected void setBaseDtForSls(ShipRprt_Upd01_HdrR hdrR, ShipRprt_Upd01_DtlR dtlR) {
			if (isSlsShipBasis(hdrR, dtlR)) {
				dtlR.base_dt(hdrR.ship_tm());
			}
			else {
				dtlR.base_dt(hdrR.dlv_tm());
			}
			dtlR.base_dt(dtlR.base_dt().trunc(MCDateFieldType.DAY));
		}
		protected boolean isSlsShipBasis(ShipRprt_Upd01_HdrR hdrR, ShipRprt_Upd01_DtlR dtlR) {
			if (isNull(dtlR.slo_d_no())) {
				return
					MAC_SLS_BASIS_TYP.isSHIP_BASIS(
						nvl(getBpR(hdrR.bp_cd()).sls_basis_typ(), getCo().sls_basis_typ()));
			}
			else {
				MST_SLO_D_R slodR = getSloDR(dtlR.slo_d_no());
				return MAC_SLS_BASIS_TYP.isSHIP_BASIS(slodR.getString("sls_basis_typ"));
			}
		}
		protected String getSlsBasisTyp(ShipRprt_Upd01_HdrR hdrR, ShipRprt_Upd01_DtlR dtlR) {
			if (isNull(dtlR.slo_d_no())) {
				if (MSC_TRN_TYP.isSLS(hdrR.trn_typ())) {
					MST_SLS_ACT_R slsActR = getSlsActR(hdrR.dlv_slip_act_no());
					return slsActR.sls_basis_typ();
				}
				else {
					return nvl(getBpR(hdrR.bp_cd()).sls_basis_typ(),
							getCo().sls_basis_typ());
				}
			}
			else {
				MST_SLO_D_R slodR = getSloDR(dtlR.slo_d_no());
				return slodR.getString("sls_basis_typ");
			}
		}

		/**
		 * 納入指示受領情報を補完する
		 */
		protected void cmplDlvInstRcpt(ShipRprt_Upd01_HdrR hdrR, MCList<ShipRprt_Upd01_DtlR> dtlL) {
			// 取引パタン区分が「売上」「出荷」が対象
			if (!MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())
				&& !MAC_TRD_PTN_TYP.isSHIP(hdrR.trd_ptn_typ())) {
				return;
			}
			for (ShipRprt_Upd01_DtlR r : dtlL) {
				if (isNull(r.dlv_inst_rcpt_no())) {
					continue;
				}
				MST_DLV_INST_RCPT_R rcptR = getDlvInstRcpt(r.dlv_inst_rcpt_no());
				if (isNull(rcptR)) {
					MCMessagePool.addAll(getRecordNotFoundMsg("MS", "MST_DLV_INST_RCPT"
							, new String[]{MST_DLV_INST_RCPT_R.$dlv_inst_rcpt_no}
							, new Comparable[]{r.dlv_inst_rcpt_no()}, r));
				}
				else {
					r.dsd().dlv_inst_unit_cd(rcptR.trd_unit_cd());
					r.dsd().dlv_inst_qty(rcptR.trd_unit_qty());
					r.dsd().dlv_inst_no(rcptR.cst_dlv_inst_no());
					r.dsd().dlv_inst_d_no(rcptR.cst_dlv_inst_d_no());
				}
			}
		}

		/**
		 * 支給予定情報を補完する
		 */
		protected void cmplProvSchd(ShipRprt_Upd01_HdrR hdrR, MCList<ShipRprt_Upd01_DtlR> dtlL) {
			// 取引パタン区分が「支給」「支給返品」が対象
			if (!MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ())
				&& !MAC_TRD_PTN_TYP.isPROV_RTN(hdrR.trd_ptn_typ())) {
				return;
			}
			String loc_cd = null;
			if (MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ())) {
				loc_cd = hdrR.dlv_id_cd();
			}
			else {
				loc_cd = hdrR.xfr_loc_cd();
			}
			MAM_LOC_R locR = getLocR(loc_cd);
			
			MST_PROV_SCHD_R provtempR = MST_PROV_SCHD_R.create();
			provtempR.prsppl_cd(locR.sppl_cd());
			
			MAM_SPPL_USR_R usrR = getSpplUsrR(hdrR, provtempR);
			hdrR.dpt_cd(usrR.outsrc_dpt_cd());
			hdrR.usr_cd(usrR.outsrc_usr_cd());
			hdrR.bp_cd(provtempR.prsppl_cd());
			
			java.util.function.Predicate<ShipRprt_Upd01_DtlR>
				isNotCalAmt = arg ->
					isNull(arg.prov_typ())
						|| MAC_PROV_TYP.isFFR_PROV(arg.prov_typ());
			for (ShipRprt_Upd01_DtlR r : dtlL) {
				MST_PROV_SCHD_R provR = getProvSchdR(hdrR, r);
				if (!isNull(provR)) {
					r.prov_typ(provR.prov_typ());
					r.prov_basis_typ(provR.prov_basis_typ());
					if (isCalcAmtTrd(hdrR.trd_ptn_typ())) {
						// 「使用基準」の場合は設定しない（使用基準でない場合、支給予定・移動移送予定から補完）
						if (isInptOnrProv(r.prov_basis_typ(), hdrR.trn_typ())) {
							r.trd_cur_cd(null);
							r.xrate(null);
							r.ptax_xrate(null);
							r.trd_cur_upri(null);
							r.tax_cd(null);
							r.wtax_rate(null);
						}
						else {
							r.trd_cur_cd(provR.trd_cur_cd());
							if (isNull(hdrR.getNumberNE(_ORG_XRATE))) {
								if (provR.xrate_inpt_flg()) {
									r.xrate(provR.xrate());
								}
								else if (!isNotCalAmt.test(r)) {
									ShipRprt_Upd01_HdrR tmpR = hdrR.clone();
									tmpR.trd_cur_cd(r.trd_cur_cd());
									r.xrate(getXRate(tmpR));
								}
							}
							if (isNull(hdrR.getNumberNE(_ORG_PTAX_XRATE))) {
								if (provR.ptax_xrate_inpt_flg()) {
									r.ptax_xrate(provR.ptax_xrate());
								}
								else if (!isNotCalAmt.test(r)) {
									ShipRprt_Upd01_HdrR tmpR = hdrR.clone();
									tmpR.trd_cur_cd(r.trd_cur_cd());
									r.ptax_xrate(getPtaxRate(tmpR));
								}
							}
							r.trd_cur_upri(provR.trd_cur_upri());
							if (provR.tax_fix_flg()) {
								r.tax_cd(provR.tax_cd());
							}
							r.wtax_rate(provR.wtax_rate());
						}
					}
					r.base_dt(provR.accpt_schd_dt());	// 支給では検収予定日(検収日)を使用する
				}
				else {
					// 支給予定がない場合は、支給と支給返品とで日付を分ける
					if (MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ())) {
						MAM_BP_R  bpR = getBpR(hdrR.bp_cd());
						if (MAC_PROV_RCV_TYP.isNOT_ARR(bpR.prov_rcv_typ())) {
							r.base_dt(hdrR.ship_tm());
						}
						else {
							r.base_dt(hdrR.dlv_tm());
						}
					}
					else {
						r.base_dt(hdrR.ship_tm());	// 支給返品は出荷日時
					}
					r.base_dt(r.base_dt().trunc(MCDateFieldType.DAY));
					if (isWtax(r) && isNull(r.wtax_rate())) {
						r.wtax_rate(getWtaxRate(r));
					}
				}
				r.base_dt(r.base_dt().trunc(MCDateFieldType.DAY));

				if (isNotCalAmt.test(r)) {
					// 無償支給または使用基準は設定しない
					r.trd_cur_cd(null);
					r.tax_cd(null);
					r.xrate(null);
					r.wtax_rate(null);
					if (isNull(r.prov_basis_typ()) && !MAC_PROV_TYP.isFFR_PROV(r.prov_typ())) {
						r.prov_typ(MAC_PROV_TYP.ONR_PROV.value());
						r.prov_basis_typ(MAC_PROV_BASIS_TYP.INPT.value());
					}
				}
			}
		}

		/**
		 * 金額計算にかかわる項目をマスタから補完する
		 * @param hdrR
		 * @param dtlL
		 */
		protected void cmplAmt(MCList<ShipRprt_Upd01_HdrR> hdrL, MCList<ShipRprt_Upd01_DtlR> dtlL) {
			MCIndexKey idx = dtlL.createIndex(ShipRprt_Upd01_DtlR.$hdr_peg_no);

			for (ShipRprt_Upd01_HdrR hdrR : hdrL) {
				if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					continue;
				}

				MAM_BP_R bpR = getBpR(hdrR.bp_cd());

				// 取引通貨CD
				hdrR.trd_cur_cd(nvl(hdrR.trd_cur_cd(), bpR.cur_cd()));
	
				// 為替レート
				if (isNull(hdrR.xrate())) {
						hdrR.xrate(getXRate(hdrR));
				}
				// 納税為替レート
				if (isNull(hdrR.ptax_xrate())) {
						hdrR.ptax_xrate(getPtaxRate(hdrR));
				}

				MCList<ShipRprt_Upd01_DtlR> subL = dtlL.subList(idx,hdrR.hdr_peg_no());

				// 税計算区分
				if (isSlsTrd(hdrR.trd_ptn_typ())) {
					hdrR.ds().tax_calc_typ(bpR.sls_tax_calc_typ());
				}
				else {
					hdrR.ds().tax_calc_typ(bpR.prov_tax_calc_typ());
				}

				for (ShipRprt_Upd01_DtlR r : subL) {
					// 税CD
					if (isNull(r.tax_cd())) {
						r.tax_cd(getTaxCd(r));
					}
					// 取引通貨（補完された値を再設定する）
					// 明細の取引通貨は支給単価マスタを取得する際に使用する
					r.trd_cur_cd(hdrR.trd_cur_cd());

					// 伝票を分割する際に使用する
					r.xrate(hdrR.xrate());
					r.ptax_xrate(hdrR.ptax_xrate());

					// 売上計上区分
					if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())) {
						hdrR.sls_basis_typ(getSlsBasisTyp(hdrR, r));
					}

				}
			}
		}

		/**
		 * 源泉税を設定するか判定する
		 */
		protected boolean isWtax(ShipRprt_Upd01_DtlR r) {
			// 源泉税額は取引通貨、基準通貨、納税通貨が全て一致する場合のみ設定する
			// 納税通貨が取得できない場合は一致しているとみなす
			if (isSame(r.trd_cur_cd(), getCo().base_cur_cd())
				&& (isNull(getCo().ptax_cur_cd()) || isSame(r.trd_cur_cd(), getCo().ptax_cur_cd()))) {
				return true;
			}
			else {
				return false;
			}
		}

		/**
		 * 伝票を分割する条件を取得する
		 */
		protected String[] getSplitCnd(ShipRprt_Upd01_HdrR hdrR) {
			ArrayList<String> arr = new ArrayList<>();

			// 支給や計画外の場合、通貨が渡ってこないのでサービス内で補完後、ヘッダを分割する
			arr.add(ShipRprt_Upd01_DtlR.$trd_cur_cd);
			arr.add(ShipRprt_Upd01_DtlR.$xrate);
			arr.add(ShipRprt_Upd01_DtlR.$ptax_xrate);

			// 無償支給と有償支給は伝票を分ける
			arr.add(ShipRprt_Upd01_DtlR.$prov_typ);

			if (!isTaxCalTypLine(hdrR)) {
				// 税計算区分が「伝票単位」の場合、税率で伝票を分割する
				arr.add(ShipRprt_Upd01_DtlR.$tax_rate);
			}
			
			return arr.toArray(new String[arr.size()]);
		}

		/**
		 * 伝票明細をまとめる条件を取得する
		 */
		protected String[] getDtlGrpCnd(ShipRprt_Upd01_HdrR hdrR) {
			ArrayList<String> arr = getDtlGrpCndArray(hdrR);
			return arr.toArray(new String[arr.size()]);
		}

		protected ArrayList<String> getDtlGrpCndArray(ShipRprt_Upd01_HdrR hdrR) {
			ArrayList<String> arr = new ArrayList<>();

			if (!hdrR.split_flg()) {
				arr.add(ShipRprt_Upd01_DtlR.$dlv_slip_no);
				arr.add(ShipRprt_Upd01_DtlR.$dtl_uniq_no);
			}
			else if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSCRP(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_ITM(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_LOT_SNO(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_GRD(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_PACK(hdrR.trd_ptn_typ())) {

				arr.add(ShipRprt_Upd01_DtlR.$dtl_uniq_no);
				arr.add(ShipRprt_Upd01_DtlR.$rsn_cd);
				arr.add(ShipRprt_Upd01_DtlR.$bd_dpt_cd);
			}
			else {
				arr.add(ShipRprt_Upd01_DtlR.$itm_cd);
				arr.add(ShipRprt_Upd01_DtlR.$itm_sub1);
				arr.add(ShipRprt_Upd01_DtlR.$itm_sub2);
				arr.add(ShipRprt_Upd01_DtlR.$itm_sub3);
				arr.add(ShipRprt_Upd01_DtlR.$itm_nm);
				arr.add(ShipRprt_Upd01_DtlR.$sno1);
				arr.add(ShipRprt_Upd01_DtlR.$sno2);
				arr.add(ShipRprt_Upd01_DtlR.$sno3);
				arr.add(ShipRprt_Upd01_DtlR.$sno4);
				arr.add(ShipRprt_Upd01_DtlR.$lot_no);
				arr.add(ShipRprt_Upd01_DtlR.$sublot_no);
				arr.add(ShipRprt_Upd01_DtlR.$trd_unit_cd);
				arr.add(ShipRprt_Upd01_DtlR.$trd_cur_upri);
				arr.add(ShipRprt_Upd01_DtlR.$tax_cd);
				arr.add(ShipRprt_Upd01_DtlR.$wtax_rate);
				arr.add(ShipRprt_Upd01_DtlR.$rsn_cd);
				arr.add(ShipRprt_Upd01_DtlR.$bd_dpt_cd);
				arr.add(ShipRprt_Upd01_DtlR.$trd_d_rmrks);

				if (MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(hdrR.trd_ptn_typ())) {
					arr.add(ShipRprt_Upd01_DtlR.$prov_typ);
					arr.add(ShipRprt_Upd01_DtlR.$prov_basis_typ);
				}
				if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_CNSGN(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_DSCNT(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_XTRA(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_RTN(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(hdrR.trd_ptn_typ())) {
					arr.add(ShipRprt_Upd01_DtlR.$cst_itm_cd);
					arr.add(ShipRprt_Upd01_DtlR.$cst_itm_nm);
					arr.add(ShipRprt_Upd01_DtlR.$cst_po_d_no);
					arr.add(ShipRprt_Upd01_DtlR.$slo_d_no);
				}
				if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(hdrR.trd_ptn_typ())) {
					arr.add(ShipRprt_Upd01_DtlR.$ship_schd_no);
					arr.add(ShipRprt_Upd01_DtlR.$iv_d_no);
				}
			}
			return arr;
		}

		/**
		 * 伝票分割前処理を実行する
		 */
		protected void bfrSplit() {
			cmplAmt();
			cmplAndEditLot();
			// 税マスタチェック
			chkTax();
		}

		/**
		 * 金額関連項目をマスタから補完
		 */
		protected void cmplAmt() {
			MCList<ShipRprt_Upd01_HdrR>
				hdrL = up0().subList(r -> isCalcAmtTrd(r.trd_ptn_typ()));
			MCList<ShipRprt_Upd01_DtlR>
				dtlL = up1().subList(r -> isCalcAmtTrd(r.trd_ptn_typ()));
			MCIndexKey idx = dtlL.createIndex(ShipRprt_Upd01_DtlR.$hdr_peg_no);
			for (ShipRprt_Upd01_HdrR hdrR : hdrL) {
				
				if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ()) || !hdrR.split_flg()) {
					continue;
				}
				
				for (ShipRprt_Upd01_DtlR dtlR : dtlL.subList(idx,hdrR.hdr_peg_no())) {
					
					if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isSHIP(hdrR.trd_ptn_typ())) {
						
						setBaseDtForSls(hdrR, dtlR);
					}
					else if (MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isPROV_RTN(hdrR.trd_ptn_typ())) {
						
						MST_PROV_SCHD_R provR = getProvSchdR(hdrR, dtlR);
						if (!isNull(provR)) {
							dtlR.base_dt(provR.accpt_schd_dt());
						}
						else {
							if (MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ())) {
								
								MAM_BP_R  bpR = getBpR(hdrR.bp_cd());
								if (MAC_PROV_RCV_TYP.isNOT_ARR(bpR.prov_rcv_typ())) {
									dtlR.base_dt(hdrR.ship_tm());
								}
								else {
									dtlR.base_dt(hdrR.dlv_tm());
								}
							}
							else {
								dtlR.base_dt(hdrR.ship_tm());
							}
						}
						dtlR.base_dt(dtlR.base_dt().trunc(MCDateFieldType.DAY));
					}
				}
			}

			doTaxCdCache(dtlL);
			doWtaxCache(dtlL);
			cmplAmt(hdrL, dtlL);

			doCurCache(hdrL);
			doTaxCache(dtlL);
			doProvUpriCache(hdrL, dtlL);
		}

		/**
		 * 補完処理とロットＮＯ、サブロットＮＯのまとめ処理を実行する
		 */
		protected void cmplAndEditLot() {
			MCIndexKey idx = up1().createIndex(ShipRprt_Upd01_DtlR.$hdr_peg_no);
			for (ShipRprt_Upd01_HdrR hdrR : up0()) {
				if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					continue;
				}

				MCList<ShipRprt_Upd01_DtlR> dtlL;
				dtlL = up1().subList(idx,hdrR.hdr_peg_no());

				cmplBpItm(hdrR, dtlL);
				if(hdrR.split_flg()) {
					chkDlvSlip(dtlL);
					// 分割に必要な情報を補完する
					cmplDlvSlip(hdrR, dtlL);
					cmplSlo(hdrR, dtlL);
					cmplIv(hdrR, dtlL);
					cmplProvSchd(hdrR, dtlL);
				}

				cmplDlvInstRcpt(hdrR, dtlL);
				updSlipEachLotTyp(hdrR, dtlL);
			}
		}

		/**
		 * 取引先品目を補完する
		 * @param hdrR
		 * @param dtlL
		 */
		protected void cmplBpItm(ShipRprt_Upd01_HdrR hdrR,
				MCList<ShipRprt_Upd01_DtlR> dtlL) {

			if(!MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ())) {
				return;
			}

			for(ShipRprt_Upd01_DtlR r : dtlL) {
				if(!isNull(r.slo_d_no())) {
					continue;
				}
				MAM_BP_ITM_R bpItmR = getBpItmR(
							nvl(hdrR.ac_dt(), hdrR.ship_tm()),
							hdrR.bp_cd(),
							r.itm_cd(),
							r.itm_sub1(),
							r.itm_sub2(),
							r.itm_sub3());
				if(!isNull(bpItmR)) {
					r.cst_itm_cd(bpItmR.bp_itm_cd());
					r.cst_itm_nm(bpItmR.bp_itm_nm());
				}
			}
		}

		/**
		 * 上り電文の納品伝票NO存在チェック
		 */
		protected void chkDlvSlip(MCList<ShipRprt_Upd01_DtlR> dtlL) {
			for (ShipRprt_Upd01_DtlR r : dtlL) {
				if (!isNull(r.dlv_slip_no())
					&& isNull(getDlvSlipR(r.dlv_slip_no()))) {
					MCMessagePool.addAll(getRecordNotFoundMsg("MS", "MST_DLV_SLIP"
							, new String[]{MST_DLV_SLIP_R.$dlv_slip_no}
							, new Comparable[]{r.dlv_slip_no()}, r));
				}
			}
		}

		/**
		 * 税マスタチェック
		 */
		protected void chkTax() {
			MCIndexKey idx = up1().createIndex(ShipRprt_Upd01_DtlR.$hdr_peg_no);
			for (ShipRprt_Upd01_HdrR hdrR : up0()) {
				if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					continue;
				}

				MCList<ShipRprt_Upd01_DtlR> dtlL = up1().subList(idx,hdrR.hdr_peg_no());
				for (ShipRprt_Upd01_DtlR r : dtlL) {
					if (isNull(r.tax_cd())) {
						if (isSlsTrd(hdrR.trd_ptn_typ()) && !isSloFixTax(hdrR, r)) {
							MCMessagePool.add(new MCMessage(r, null, MSBEL0354,
									toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
									r.bp_cd(), toYMDString(r.base_dt()),
									toDispGUIIndex(r)));
						}

						continue;
					}

					MAM_TAX_R taxR = getTaxR(r.tax_cd());
					if (isSlsTrd(hdrR.trd_ptn_typ())) {
						if (taxR.isEmpty() || !taxR.sls_flg()) {
							MCMessagePool.add(new MCMessage(r, null, MSBEL0352,
									r.tax_cd(), toDispGUIIndex(r)));
						}
					}

					if (isProvTrd(hdrR.trd_ptn_typ())) {
						if (taxR.isEmpty() || !taxR.prov_flg()) {
							MCMessagePool.add(new MCMessage(r, null, MSBEL0353,
									r.tax_cd(), toDispGUIIndex(r)));
						}
					}
					if (!taxR.isEmpty()) {
						r.tax_rate(taxR.tax_rate());
					}
				}
			}
		}

		/**
		 * 上り電文の順番を意識したグループリストを取得する
		 */
		protected MCList<ShipRprt_Upd01_DtlR>[] groupList(MCList<ShipRprt_Upd01_DtlR> lst, String[] key) {
			MCList<ShipRprt_Upd01_DtlR>[] arr = lst.groupList(key);

			// 上り電文の順番を優先に並び替える
			for (int i=0; i<arr.length; i++) {
				arr[i].sort(ShipRprt_Upd01_DtlR.$dtl_uniq_seq);
			}
			Arrays.sort(arr, new Comparator<MCList<ShipRprt_Upd01_DtlR>>() {
				public int compare(MCList<ShipRprt_Upd01_DtlR> o1, MCList<ShipRprt_Upd01_DtlR> o2) {
					return o1.get(0).dtl_uniq_seq().compareTo(o2.get(0).dtl_uniq_seq());
				}
			});

			return arr;
		}

		/**
		 * 分割条件に従って伝票を分割する<br>
		 * 分割時に受注、および支給予定からデータの補完を行う
		 */
		protected void split() {
			// 使用済みの納品書NOのリスト。訂正で伝票ヘッダのキーが変わったときに、おのおののヘッダで同じ伝票ＮＯを再利用しないように保持する
			java.util.Set<String> usedDlvSlipNo = new java.util.HashSet<String>();
			
			MCIndexKey idx = up1().createIndex(ShipRprt_Upd01_DtlR.$hdr_peg_no);
			for (ShipRprt_Upd01_HdrR hdrR : up0()) {
				if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())
					|| !hdrR.split_flg()) {
					continue;
				}
				MCList<ShipRprt_Upd01_DtlR> dtlL = up1().subList(idx,hdrR.hdr_peg_no());
				ArrayList<MCList<ShipRprt_Upd01_DtlR>> arr = new ArrayList<>();

				// 伝票を分割する条件を取得する
				// ※通常は上り電文のヘッダ単位に伝票を作成するが、税計算区分が「伝票単位」の場合、税率で伝票を分割する
				// ※また、支給や計画外出荷の場合などではヘッダの通貨や為替レートが設定されないので、サービス内で補完して分割する
				String[] hdrGrpKey = getSplitCnd(hdrR);
				for (MCList<ShipRprt_Upd01_DtlR> l : groupList(dtlL, hdrGrpKey)) {
					arr.add(l);
				}

				// 発番済みの納品書NOのリスト
				MCList<ShipRprt_Upd01_DtlR> dlvSlipNoL = dtlL.groupBy(ShipRprt_Upd01_DtlR.$dlv_slip_no);
				dlvSlipNoL = dlvSlipNoL.subList(r -> !(usedDlvSlipNo.contains(r.dlv_slip_no())));
				dlvSlipNoL.sort(ShipRprt_Upd01_DtlR.$dlv_slip_no);

				// $hdr_peg_no + $hdr_peg_seq：納品伝票を特定するキー項目
				// $hdr_peg_no + $hdr_peg_seq + dtl_uniq_seq：納品伝票明細を特定するキー項目
				String[] grpKey = getDtlGrpCnd(hdrR);
				int hSeq = 1, dSeq = 1, line = getLineMax(hdrR);
				for (MCList<ShipRprt_Upd01_DtlR> curGrpL : arr) {
					MCList<ShipRprt_Upd01_DtlR>[] grpL = groupList(curGrpL, grpKey);

					// 納品伝票明細の行数で伝票を分割
					for (int i=0; i<grpL.length; i++) {
						if (dSeq > line) {
							hSeq++;
							dSeq = 1;
						}

						// 納品書NOの設定(発番済みのNOを古い順に再利用する)
						String dlvSlipNo = null;
						if (dlvSlipNoL.size() >= hSeq) {
							dlvSlipNo = dlvSlipNoL.get(hSeq - 1).dlv_slip_no();
							usedDlvSlipNo.add(dlvSlipNo);
						}
						for (ShipRprt_Upd01_DtlR r : grpL[i]) {
							r.hdr_peg_seq(hSeq);
							r.dtl_uniq_seq(dSeq);
							if (isNull(dlvSlipNo) || !isSame(r.dlv_slip_no(), dlvSlipNo)) {
								// 新たに発番する場合や紐付きが変わる場合は、納品書明細NOを破棄する
								r.dlv_slip_d_no(null);
							}
							r.dlv_slip_no(dlvSlipNo);
						}
						dSeq++;
					}
					hSeq++;
					dSeq = 1;
				}
			}
		}

		/**
		 * 分割したリストから更新用の納品伝票リストを作成する<br>
		 * ここで作成したリストと上り電文は、ヘッダ紐付けNO、連番で対応付ける
		 */
		protected void makeDlvSlipL() {

			String[] key = {
				ShipRprt_Upd01_DtlR.$hdr_peg_no, ShipRprt_Upd01_DtlR.$hdr_peg_seq
			};
			
			MCList<MST_DLV_SLIP_R> revPrntL = revPrnted(up1());
			MCIndexKey revPrntIdx = revPrntL.createIndex(MST_DLV_SLIP_R.$dlv_slip_no);

			MCIndexKey idx = up0().createIndex(ShipRprt_Upd01_HdrR.$hdr_peg_no);
			for (MCList<ShipRprt_Upd01_DtlR> grpL : groupList(up1(), key)) {
				ShipRprt_Upd01_DtlR grpR = grpL.get(0);

				// ヘッダ
				ShipRprt_Upd01_HdrR hdrR = up0().getFirst(idx, grpR.hdr_peg_no()).clone();
				if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					// 削除は対象外(updDlvSlipで扱う）
					continue;
				}

				// 新規伝票
				hdrR.hdr_peg_seq(grpR.hdr_peg_seq());
				hdrR.dlv_slip_no(grpR.dlv_slip_no());	// split()で設定済みなのでそのまま設定する
				hdrR.ds().slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
				hdrR.trd_cur_cd(grpR.trd_cur_cd());
				if (isNull(hdrR.trd_cur_cd())) {
					hdrR.ds().trd_cur_nm(null);
					hdrR.xrate(null);
					hdrR.ptax_xrate(null);
				}
				else {
					hdrR.ds().trd_cur_nm(getCurR(hdrR.trd_cur_cd()).cur_nm());
					hdrR.xrate(grpR.xrate());
					hdrR.ptax_xrate(grpR.ptax_xrate());
				}
				MAM_BP_R bpR = getBpR(hdrR.bp_cd());
				if (!isNull(bpR)) {
					hdrR.ds().bp_nm(bpR.bp_nm());
					hdrR.ds().bp_zip_cd(bpR.getStringNE("zip_cd"));
					hdrR.ds().bp_addr1(bpR.getStringNE("addr1"));
					hdrR.ds().bp_addr2(bpR.getStringNE("addr2"));
					hdrR.ds().bp_addr3(bpR.getStringNE("addr3"));
					hdrR.ds().bp_addr4(bpR.getStringNE("addr4"));
					hdrR.ds().bp_tel(bpR.getStringNE("tel"));
					hdrR.ds().bp_fax(bpR.getStringNE("fax"));
					if (isProvTrd(hdrR.trd_ptn_typ())) {
						hdrR.ds().bp_cntct_dpt(bpR.getStringNE("sppl_cntct_dpt"));
						hdrR.ds().bp_cntct_psn(bpR.getStringNE("sppl_cntct_psn"));
					}
					else {
						hdrR.ds().bp_cntct_dpt(bpR.getStringNE("cst_cntct_dpt"));
						hdrR.ds().bp_cntct_psn(bpR.getStringNE("cst_cntct_psn"));
					}
				}
				// 新規、納品書NOがない(行追加など)場合
				if (isNull(hdrR.dlv_slip_no())
					|| MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ()) && !hdrR.split_flg()) {

					if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())
						&& !hdrR.split_flg()
						&& !isNull(grpR.dlv_slip_seq())
						&& !isNull(grpR.dlv_slip_rev())) {
						// 新規かつ伝票分割しない場合に限り、上り電文の連番、改訂番号を設定する
						hdrR.ds().dlv_slip_seq(grpR.dlv_slip_seq());
						hdrR.ds().dlv_slip_rev(grpR.dlv_slip_rev());
					}
					else {
						hdrR.ds().dlv_slip_seq(1);
						hdrR.ds().dlv_slip_rev(1);
					}
					hdrR.ds().slip_line_max(getLineMax(hdrR));
				}
				else {
					MST_DLV_SLIP_R slipR = getDlvSlipR(hdrR.dlv_slip_no());
					hdrR.ds().slip_line_max(slipR.slip_line_max());
					hdrR.ds().dlv_slip_rev(slipR.dlv_slip_rev());
							if (MSC_TRN_TYP.isSLS(hdrR.trn_typ())
								|| !isNull(revPrntL.getFirst(revPrntIdx, hdrR.dlv_slip_no()))) {
								// 売上実績と紐付く伝票の場合、常にインクリメントする(売上実績ヘッダの改訂番号と合わせる）
								// 上記以外は最新の改訂番号内に発行済の伝票がある場合にインクリメントする
								hdrR.ds().dlv_slip_rev(hdrR.ds().dlv_slip_rev().add(1));
							}
						if (MAC_SLIP_STS_TYP.isCRT(slipR.slip_sts_typ())) {
							// 直前の伝票が「新規」の場合、取消伝票(+1)を作成するので新規伝票は+2する
							hdrR.ds().dlv_slip_seq(slipR.dlv_slip_seq().add(2));
						}
						else {
							// 直前の伝票が「取消」の場合、無効伝票、取消伝票は作成しないので新規伝票は+1する
							hdrR.ds().dlv_slip_seq(slipR.dlv_slip_seq().add(1));
						}
						hdrR.ds().slip_line_max(slipR.slip_line_max());
				}
				_updHdrL.add(hdrR); 

				// 明細のまとめ条件
				String[] splitCnd = getDtlGrpCnd(hdrR);

				// 集計対象の項目
				MCGroupByPolicy p = new MCGroupByPolicy(splitCnd);
				p.sum(ShipRprt_Upd01_DtlR.$trd_unit_qty);
				p.sum(ShipRprt_Upd01_DtlR.$base_unit_qty);
				p.sum(ShipRprt_Upd01_DtlR.$trd_cur_amt);
				p.sum(ShipRprt_Upd01_DtlR.$trd_cur_dscnt_amt);
				p.sum(ShipRprt_Upd01_DtlR.$base_cur_amt);
				p.sum(ShipRprt_Upd01_DtlR.$base_cur_dscnt_amt);

				MCIndexKey updDtlIdx = _updDtlL.createIndex(ShipRprt_Upd01_DtlR.$dlv_slip_d_no);
				for (MCList<ShipRprt_Upd01_DtlR> dtlL : groupList(grpL, splitCnd)) {
					ShipRprt_Upd01_DtlR dtlR = dtlL.get(0).clone();

					if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())
						&& !hdrR.split_flg()
						&& !isNull(dtlR.dlv_slip_d_seq())) {
						// 新規かつ伝票分割しない場合に限り、上り電文の連番を使用する
					}
					else {
						dtlR.dsd().dlv_slip_d_seq(hdrR.ds().dlv_slip_seq());
						dtlR.dlv_slip_rev(hdrR.ds().dlv_slip_rev());
					}
					dtlR.dsd().dlv_slip_seq(hdrR.ds().dlv_slip_seq());
					if (!isNull(_updDtlL.getFirst(updDtlIdx, dtlR.dlv_slip_d_no()))) {
						// 同一の納品伝票明細が分割された場合、納品伝票明細NOは引き継がない
						dtlR.dlv_slip_d_no(null);
					}

					// 明細の集計対象項目を設定する
					ShipRprt_Upd01_DtlR sumR = dtlL.groupBy(p).get(0);
					dtlR.trd_unit_qty(sumR.trd_unit_qty());
					dtlR.base_unit_qty(sumR.base_unit_qty());
					dtlR.trd_cur_amt(sumR.trd_cur_amt());
					dtlR.trd_cur_dscnt_amt(sumR.trd_cur_dscnt_amt());
					dtlR.base_cur_amt(sumR.base_cur_amt());
					dtlR.base_cur_dscnt_amt(sumR.base_cur_dscnt_amt());

					if (!isNull(dtlR.slo_d_no()) && !isNull(dtlR.ship_schd_no())) {
						MST_SHIP_SCHD_R ssR = getShipSchdDR(dtlR.ship_schd_no());
						if (!isSame(dtlR.trd_unit_cd(), ssR.trd_unit_cd())) {
							// 出荷予定の取引単位(＝受注の単位)と異なり、かつ合算後の数量が出荷予定の単位に変換できる場合は変換する
							MCNumber qty = cnvBaseToTrdUnitQty(dtlR, dtlR.base_unit_qty(), ssR.trd_unit_cd());
							if (!isNull(qty)) {
								dtlR.trd_unit_qty(qty);
								dtlR.trd_unit_cd(ssR.trd_unit_cd());
							}
						}
					}
					if (!isNull(dtlR.slo_d_no())) {
						MST_SLO_D_R sloDR = getSloDR(dtlR.slo_d_no());
						// 売上実績サービスから呼ばれていない場合、インボイス明細⇒受注明細の順で仮単価を引き継ぐ
						if (!MSC_TRN_TYP.isSLS(hdrR.trn_typ())){
							MST_IV_D_R ivDR = null;
							if(MAC_TRD_PTN_TYP.isSLS(dtlR.trd_ptn_typ())) {
								ivDR = getIvD(hdrR, dtlR);
							}
							if (!isNull(ivDR)) {
								dtlR.dsd().interim_flg(ivDR.interim_flg());
							}
							else {
								dtlR.dsd().interim_flg(sloDR.interim_flg());
							}
						}
						dtlR.dsd().slo_unit_cd(sloDR.trd_unit_cd());
						dtlR.dsd().slo_qty(sloDR.trd_unit_qty());
						if(isNull(hdrR.ds().dlv_rqst_tm())) {
							if(!isNull(sloDR.dlv_rqst_tm())) {
								hdrR.ds().dlv_rqst_tm( sloDR.dlv_rqst_tm());
							}
						}
					}

					// 「取引パタン区分が売上または出荷のとき」かつ「格付ＣＤが一意に定まるとき」に限り格付ＣＤを設定する
					if((MAC_TRD_PTN_TYP.isSLS(dtlR.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSHIP(dtlR.trd_ptn_typ()))
							&& dtlL.groupBy(ShipRprt_Upd01_DtlR.$gd_cd).size() > 1) {
						dtlR.gd_cd(null);
					}

					// 補完
					dtlR.str_ln_cd(nvl(dtlR.str_ln_cd(), MAC_STR.NULL_VAL.value()));
					dtlR.dsd().stk_arrv_bp_cd(nvl(dtlR.dsd().stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()));
					dtlR.dsd().stk_bp_cd(nvl(dtlR.dsd().stk_bp_cd(), MAC_STR.NULL_VAL.value()));
					dtlR.dsd().fix_no_typ(nvl(dtlR.dsd().fix_no_typ(), MSC_FIX_NO_TYP.NON.value()));
					dtlR.dsd().fix_no(nvl(dtlR.dsd().fix_no(), MAC_STR.NULL_VAL.value()));
					dtlR.dsd().slo_qty(nvl(dtlR.dsd().slo_qty(), MCNumber.ZERO));
					dtlR.dsd().dlv_inst_qty(nvl(dtlR.dsd().dlv_inst_qty(), MCNumber.ZERO));
					dtlR.upded_flg(true);
					_updDtlL.add(dtlR);
					updDtlIdx = _updDtlL.createIndex(ShipRprt_Upd01_DtlR.$dlv_slip_d_no);
				}
			}
		}

		/**
		 * 金額および税額を算出し設定する
		 */
		protected void setAmt() {

			// 単価が設定されていない明細を対象に販売単価を取得する
			// 伝票ごとに単価取得するので、伝票分割後に取得する
			callSlsUpriSrv();

			MCIndexKey idx = _updDtlL.createIndex(
				ShipRprt_Upd01_DtlR.$hdr_peg_no, ShipRprt_Upd01_DtlR.$hdr_peg_seq); 

			String provSrcActTyp = null;

			for (ShipRprt_Upd01_HdrR hdrR : _updHdrL) {
				if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())
					|| !isCalcAmtTrd(hdrR.trd_ptn_typ())) {
					// 削除、金額計算しない取引、または分割しないは対象外
					continue;
				}

				// 取引先、通貨マスタ、税マスタ、支給元実績区分 
				MAM_BP_R bpR = getBpR(hdrR.bp_cd());
				MAM_CUR_R curR = getCurR(hdrR.trd_cur_cd());
				if (isProvTrd(hdrR.trd_ptn_typ())) {
					MST_PROV_SCHD_R provR = getProvSchdR(hdrR, _updDtlL.subList(idx, hdrR.toArray(idx.getKeys())).get(0));
					// 支給予定も支給実績も無い場合
					if (isNull(provR)) {
						provSrcActTyp = null;
					}
					else {
						// 支給予定はprov_src_act_typが無いのでNEで取得する
						provSrcActTyp = provR.getStringNE("prov_src_act_typ");
					}
				}

				MCList<ShipRprt_Upd01_DtlR> dtlL = MCList.create(ShipRprt_Upd01_DtlR.class);
				for (ShipRprt_Upd01_DtlR r : _updDtlL.subList(idx, hdrR.toArray(idx.getKeys()))) {
					if (isSlsTrd(hdrR.trd_ptn_typ())) {
						dtlL.add(r);
					}
					else if (isProvTrd(hdrR.trd_ptn_typ())) {
						if (MAC_PROV_TYP.isONR_PROV(r.prov_typ())) {
							if (MAC_PROV_BASIS_TYP.isINPT(r.prov_basis_typ())) {
								if (MSC_PROV_SRC_ACT_TYP.isINPT(provSrcActTyp)) {
									dtlL.add(r);
								}
							}
							else {
								dtlL.add(r);
							}
						}
						else {
							// 無償支給は設定しない
							hdrR.trd_cur_cd(null);
							r.tax_cd(null);
							r.trd_cur_amt(null);
							r.trd_cur_tax_amt(null);
						}
					}
				}
				if (dtlL.isEmpty()) {
					continue;
				}
				dtlL.sort(ShipRprt_Upd01_DtlR.$dtl_uniq_seq);
				
				// 伝票分割する場合は金額など計算する
				if (hdrR.split_flg()) {
					for (ShipRprt_Upd01_DtlR dtlR : dtlL) {
						// 税マスタのキャッシュ取得（後続の合計金額計算で使用する）
						MAM_TAX_R taxR = getTaxR(dtlR.tax_cd());
						
	
						if (isProvTrd(hdrR.trd_ptn_typ())) {
							// 支給、かつ単価が設定されていない場合、支給単価マスタから単価を取得する
							// 売上の単価は callSlsUpriSrv で取得・設定する
							dtlR.trd_cur_upri(nvl(dtlR.trd_cur_upri(), getProvUpriR(hdrR, dtlR).upri()));
						}
	
						// 取引通貨金額(税抜)
						if (isNull(dtlR.trd_cur_amt())) {
							MCRow amtR = getAmtAndTax(
									dtlR.trd_cur_upri(),
									isSlsTrd(hdrR.trd_ptn_typ()) ? dtlR.trd_unit_qty() : dtlR.base_unit_qty(),
									taxR.tax_rate(),
									taxR.inc_tax_flg(),
									curR.amt_dec_place(),
									isSlsTrd(hdrR.trd_ptn_typ()) ? bpR.sls_amt_rnd_typ() : bpR.prov_amt_rnd_typ(),
									isSlsTrd(hdrR.trd_ptn_typ()) ? bpR.sls_tax_rnd_typ() : bpR.prov_tax_rnd_typ(),
									dtlR.trd_cur_dscnt_amt());
							dtlR.trd_cur_amt(amtR.getNumber("amt"));
							// 取引通貨税額
							if (isTaxCalLineTgt(hdrR, dtlL)) {
								// 行単位の税計算対象の時のみ算出（行単位の税計算対象外の場合はヘッダの税額から割り戻す）
								dtlR.trd_cur_tax_amt(amtR.getNumber("tax_amt"));
							}
							if (taxR.inc_tax_flg()) {
								// 税込金額（内税の場合の金額再計算のために保持）
								dtlR.setNumberNE("inc_tax_amt", amtR.getNumber("inc_tax_amt"));
							}
						}
						// 基準通貨単価
						if (isNull(dtlR.base_cur_upri())) {
							dtlR.base_cur_upri(convToBaseCur(
									dtlR.trd_cur_upri(),
									hdrR.xrate(),
									getBaseCur().upri_dec_place(),
									getCo().xrate_rnd_typ()));
						}
						// 基準通貨金額(税抜)
						dtlR.base_cur_amt(convToBaseCur(
								dtlR.trd_cur_amt(),
								hdrR.xrate(),
								getBaseCur().amt_dec_place(),
								getCo().xrate_rnd_typ()));
						// 基準通貨税額
						if (isTaxCalLineTgt(hdrR, dtlL)) {
							// 行単位の税計算対象の時のみ算出（行単位の税計算対象外の場合はヘッダの税額から割り戻す）
							dtlR.base_cur_tax_amt(convToBaseCur(
									dtlR.trd_cur_tax_amt(),
									hdrR.xrate(),
									getBaseCur().amt_dec_place(),
									getCo().xrate_rnd_typ()));
						}
						// 基準通貨値引額
						dtlR.base_cur_dscnt_amt(convToBaseCur(
								dtlR.trd_cur_dscnt_amt(),
								hdrR.xrate(),
								getBaseCur().upri_dec_place(),
								getCo().xrate_rnd_typ()));
						// 源泉税額
						if (isWtax(dtlR) && !isNull(dtlR.wtax_rate())) {
							dtlR.wtax_amt(getTaxAmt(
									dtlR.trd_cur_amt(),
									dtlR.wtax_rate(),
									curR.amt_dec_place(),
									getCo().wtax_rnd_typ(),
									taxR.inc_tax_flg()));
						}
					}
					
					// 出荷時の単位と受注時の単位が違う場合、出荷時の単位で金額を再計算
					MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 calc = mcframe.serverMSUC.MSUCL0020.MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();
					for (ShipRprt_Upd01_DtlR dtlR : dtlL) {
						if (!isNull(dtlR.dsd().slo_unit_cd()) && !isSame(dtlR.trd_unit_cd(), dtlR.dsd().slo_unit_cd())) {
							ConvQtyAmtUtil_Calc01_HdrR calcHdrR = calc.up0().createRow();
							MAVM_ITM_UNIT_R baseUnitR = getItmUnitR(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.base_unit_cd());
							dtlR.setNumberNE("base_unit_dec_place", baseUnitR.dec_place());
							dtlR.setStringNE("base_unit_rnd_typ", baseUnitR.rnd_typ());
							MAVM_ITM_UNIT_R sloItmUnitR = getItmUnitR(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.dsd().slo_unit_cd());
							dtlR.setNumberNE("slo_trd_unit_conv_qty", sloItmUnitR.conv_qty());
							dtlR.setNumberNE("slo_trd_unit_conv_base_qty", sloItmUnitR.conv_base_qty());
							MAM_TAX_R dtlTaxR = getTaxR(dtlR.tax_cd());
							dtlR.setNumberNE("tax_rate", dtlTaxR.tax_rate());
							dtlR.setBooleanNE("inc_tax_flg", dtlTaxR.inc_tax_flg());
							dtlR.setNumberNE("amt_dec_place", curR.amt_dec_place());
							dtlR.setNumberNE("upri_dec_place", curR.upri_dec_place());
							dtlR.setStringNE("amt_rnd_typ", bpR.sls_amt_rnd_typ());
							dtlR.setStringNE("tax_rnd_typ", bpR.sls_tax_rnd_typ());
							createMap_ConvQtyAmtUtil_Calc01_HdrR_ShipRprt_Upd01_DtlR().copy(calcHdrR, dtlR);
							calc.up0().add(calcHdrR);
							
							ConvQtyAmtUtil_Calc01_Dtl1R calcDtl1R = calc.up1().createRow();
							MAVM_ITM_UNIT_R actItmUnitR = getItmUnitR(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.trd_unit_cd());
							dtlR.setNumberNE("trd_unit_conv_qty", actItmUnitR.conv_qty());
							dtlR.setNumberNE("trd_unit_conv_base_qty", actItmUnitR.conv_base_qty());
							createMap_ConvQtyAmtUtil_Calc01_Dtl1R_ShipRprt_Upd01_DtlR().copy(calcDtl1R, dtlR);
							calc.up1().add(calcDtl1R);
						}
					}
					if (!calc.up0().isEmpty()) {
						calc.exec();
						String[] destCols = {ShipRprt_Upd01_DtlR.$trd_cur_upri
								, ShipRprt_Upd01_DtlR.$trd_cur_dscnt_amt
								, ShipRprt_Upd01_DtlR.$trd_cur_amt
								, ShipRprt_Upd01_DtlR.$trd_cur_tax_amt
								, "inc_tax_amt"
								, ShipRprt_Upd01_DtlR.$wtax_amt};
						String[] srcCols = {ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri
								, ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_dscnt_amt
								, ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt
								, ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_tax_amt
								, ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_inc_tax_amt
								, ConvQtyAmtUtil_Calc01_Dtl1R.$wtax_amt};
						copyByPegNo(dtlL, calc.down0(), ShipRprt_Upd01_DtlR.$dtl_uniq_seq, destCols, ConvQtyAmtUtil_Calc01_Dtl1R.$peg_no, srcCols);
					}
				}
				// 伝票分割しない場合は、税込金額を一次カラムへ設定のみ実施（後続の合計計算で使用する）
				else {
					for (ShipRprt_Upd01_DtlR dtlR : dtlL) {
						// 税マスタのキャッシュ取得（後続の合計金額計算用）
						MAM_TAX_R taxR = getTaxR(dtlR.tax_cd());
						if (taxR.inc_tax_flg()) {
							// 税込金額（内税の場合の金額再計算のために保持）
							dtlR.setNumberNE("inc_tax_amt", getAmt(dtlR.trd_cur_upri(),
									isSlsTrd(hdrR.trd_ptn_typ()) ? dtlR.trd_unit_qty() : dtlR.base_unit_qty(),
									curR.amt_dec_place(),
									isSlsTrd(hdrR.trd_ptn_typ()) ? bpR.sls_amt_rnd_typ() : bpR.prov_amt_rnd_typ(),
									dtlR.trd_cur_dscnt_amt()));
						}
					}
				}

				// 行単位の税計算対象
				if (isTaxCalLineTgt(hdrR, dtlL)) {
					hdrR.ds().trd_cur_amt(MCNumber.ZERO);
					hdrR.ds().trd_cur_tax_amt(MCNumber.ZERO);
					hdrR.ds().base_cur_amt(MCNumber.ZERO);
					hdrR.ds().base_cur_tax_amt(MCNumber.ZERO);
					// 各項目の合計をヘッダに設定する
					for (ShipRprt_Upd01_DtlR dtlR : dtlL) {
						if (isTgtSubtract(hdrR, dtlR)) {
							hdrR.ds().trd_cur_amt(hdrR.ds().trd_cur_amt().subtract(dtlR.trd_cur_amt()));
							hdrR.ds().trd_cur_tax_amt(hdrR.ds().trd_cur_tax_amt().subtract(dtlR.trd_cur_tax_amt()));
							hdrR.ds().base_cur_amt(hdrR.ds().base_cur_amt().subtract(dtlR.base_cur_amt()));
							hdrR.ds().base_cur_tax_amt(hdrR.ds().base_cur_tax_amt().subtract(dtlR.base_cur_tax_amt()));
						}
						else {
							hdrR.ds().trd_cur_amt(hdrR.ds().trd_cur_amt().add(dtlR.trd_cur_amt()));
							hdrR.ds().trd_cur_tax_amt(hdrR.ds().trd_cur_tax_amt().add(dtlR.trd_cur_tax_amt()));
							hdrR.ds().base_cur_amt(hdrR.ds().base_cur_amt().add(dtlR.base_cur_amt()));
							hdrR.ds().base_cur_tax_amt(hdrR.ds().base_cur_tax_amt().add(dtlR.base_cur_tax_amt()));
						}
					}
					
					hdrR.ds().trd_cur_dscnt_amt(dtlL.sum(ShipRprt_Upd01_DtlR.$trd_cur_dscnt_amt));
					hdrR.ds().base_cur_dscnt_amt(dtlL.sum(ShipRprt_Upd01_DtlR.$base_cur_dscnt_amt));
				}
				// 税計算区分「伝票単位」
				else {
					MCList<ShipRprt_Upd01_DtlR> taxAmtL = crtGetTaxAmtL(hdrR, dtlL);
					hdrR.ds().trd_cur_dscnt_amt(dtlL.sum(ShipRprt_Upd01_DtlR.$trd_cur_dscnt_amt));
					// 伝票分割を行う場合
					if (hdrR.split_flg()) {
						MCNumber ttlTaxAmt = MSUCL_AmtUtil.getTaxAmtBySlip(taxAmtL,
								isSlsTrd(hdrR.trd_ptn_typ()) ? bpR.sls_tax_rnd_typ() : bpR.prov_tax_rnd_typ(),
										curR.amt_dec_place(), dtlL.get(0).tax_rate(), null);
						hdrR.ds().trd_cur_tax_amt(ttlTaxAmt);
						
						if (isSlsTrd(hdrR.trd_ptn_typ()) &&
							!(MAC_TRD_PTN_TYP.isSLS_DSCNT(hdrR.trd_ptn_typ()) ||
							MAC_TRD_PTN_TYP.isSLS_XTRA(hdrR.trd_ptn_typ()))) {
							MCList<ShipRprt_Upd01_DtlR> tmpDtlL = MCList.create(ShipRprt_Upd01_DtlR.class);
							MCNumber addHdrTaxAmt = hdrR.ds().trd_cur_tax_amt();
							
							for (ShipRprt_Upd01_DtlR dtlR : dtlL) {
								boolean dscntItmFlg = getItmR(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()).dscnt_itm_flg();
								if (dscntItmFlg) {
									MAM_TAX_R taxR = getTaxR(dtlR.tax_cd());
									MCRow amtR = getAmtAndTax(
											dtlR.trd_cur_upri(),
											isSlsTrd(hdrR.trd_ptn_typ()) ? dtlR.trd_unit_qty() : dtlR.base_unit_qty(),
											taxR.tax_rate(),
											taxR.inc_tax_flg(),
											curR.amt_dec_place(),
											isSlsTrd(hdrR.trd_ptn_typ()) ? bpR.sls_amt_rnd_typ() : bpR.prov_amt_rnd_typ(),
											isSlsTrd(hdrR.trd_ptn_typ()) ? bpR.sls_tax_rnd_typ() : bpR.prov_tax_rnd_typ(),
											dtlR.trd_cur_dscnt_amt());
									dtlR.trd_cur_amt(amtR.getNumber("amt"));
									dtlR.trd_cur_tax_amt(amtR.getNumber("tax_amt"));
									// 基準通貨換算
									dtlR.base_cur_tax_amt(convToBaseCur(
										dtlR.trd_cur_tax_amt(),
										hdrR.xrate(),
										getBaseCur().amt_dec_place(),
										getCo().xrate_rnd_typ()));
									addHdrTaxAmt = addHdrTaxAmt.add(dtlR.trd_cur_tax_amt());
								}
								else {
									tmpDtlL.add(dtlR);
								}
							}
							if (!addHdrTaxAmt.isZero()) {
								prop(tmpDtlL,
										addHdrTaxAmt,
										curR.amt_dec_place().intValue(),
										ShipRprt_Upd01_DtlR.$trd_cur_amt,
										ShipRprt_Upd01_DtlR.$trd_cur_tax_amt);
								
								for (ShipRprt_Upd01_DtlR dtlR : tmpDtlL) {
									// 基準通貨換算
									dtlR.base_cur_tax_amt(convToBaseCur(
										dtlR.trd_cur_tax_amt(),
										hdrR.xrate(),
										getBaseCur().amt_dec_place(),
										getCo().xrate_rnd_typ()));
								}
							}
							else {
								for (ShipRprt_Upd01_DtlR dtlR : tmpDtlL) {
									// 基準通貨税額
									dtlR.base_cur_tax_amt(0);
									// 取引通貨税額
									dtlR.trd_cur_tax_amt(0);
								}
							}
						}
						else {
							// 明細から積み上げた金額から求めた税額を明細に割り戻す
							try {
							prop(dtlL,
									hdrR.ds().trd_cur_tax_amt(),
									curR.amt_dec_place().intValue(),
									ShipRprt_Upd01_DtlR.$trd_cur_amt,
									ShipRprt_Upd01_DtlR.$trd_cur_tax_amt);
							}
							catch (MCAppException ex) {
								if (!isSame(ex.getID(), FXUCC0014)) {
									throw ex;
								}
								// 伝票の合計金額が0になる場合は明細の税金額も0とする
								dtlL.setValue(ShipRprt_Upd01_DtlR.$trd_cur_tax_amt, MCNumber.ZERO);
							}
							
							for (ShipRprt_Upd01_DtlR dtlR : dtlL) {
								// 基準通貨換算
								dtlR.base_cur_tax_amt(convToBaseCur(
									dtlR.trd_cur_tax_amt(),
									hdrR.xrate(),
									getBaseCur().amt_dec_place(),
									getCo().xrate_rnd_typ()));
							}
						}
						
						hdrR.ds().trd_cur_amt(MCNumber.ZERO);
						for (ShipRprt_Upd01_DtlR dtlR : dtlL) {
							MAM_TAX_R taxR = getTaxR(dtlR.tax_cd());
							if (taxR.inc_tax_flg() && !isNull(dtlR.getNumberNE("inc_tax_amt"))) {
								// 内税の場合、税込金額から割り戻した税額を引いて通貨金額を算出する
								dtlR.trd_cur_amt(dtlR.getNumberNE("inc_tax_amt").subtract(dtlR.trd_cur_tax_amt()));
								// 基準通貨換算
								dtlR.base_cur_amt(convToBaseCur(
										dtlR.trd_cur_amt(),
										hdrR.xrate(),
										getBaseCur().amt_dec_place(),
										getCo().xrate_rnd_typ()));
							}
							if (isTgtSubtract(hdrR, dtlR)) {
								hdrR.ds().trd_cur_amt(hdrR.ds().trd_cur_amt().subtract(dtlR.trd_cur_amt()));
							}
							else {
								hdrR.ds().trd_cur_amt(hdrR.ds().trd_cur_amt().add(dtlR.trd_cur_amt()));
							}
						}
					}
					else {
						hdrR.ds().trd_cur_amt(taxAmtL.sum("amt"));
						hdrR.ds().trd_cur_tax_amt(MCNumber.ZERO);
						for (ShipRprt_Upd01_DtlR dtlR : dtlL) {
							if (isTgtSubtract(hdrR, dtlR)) {
								hdrR.ds().trd_cur_tax_amt(hdrR.ds().trd_cur_tax_amt().subtract(dtlR.trd_cur_tax_amt()));
							}
							else {
								hdrR.ds().trd_cur_tax_amt(hdrR.ds().trd_cur_tax_amt().add(dtlR.trd_cur_tax_amt()));
							}
						}
					}
					
					if (isSame(hdrR.trd_cur_cd(), getCo().base_cur_cd())) {
						hdrR.ds().base_cur_amt(hdrR.ds().trd_cur_amt());
						hdrR.ds().base_cur_tax_amt(hdrR.ds().trd_cur_tax_amt());
						hdrR.ds().base_cur_dscnt_amt(hdrR.ds().trd_cur_dscnt_amt());
					}
					else {
						// 基準通貨金額(税抜)
						hdrR.ds().base_cur_amt(convToBaseCur(
								hdrR.ds().trd_cur_amt(),
								hdrR.xrate(),
								getBaseCur().upri_dec_place(),
								getCo().xrate_rnd_typ()));
						// 基準通貨税額
						hdrR.ds().base_cur_tax_amt(convToBaseCur(
								hdrR.ds().trd_cur_amt(),
								dtlL.get(0).tax_rate(),
								hdrR.xrate(),
								getBaseCur().amt_dec_place(),
								getCo().xrate_rnd_typ()));
						// 基準通貨値引金額
						hdrR.ds().base_cur_dscnt_amt(convToBaseCur(
								hdrR.ds().trd_cur_dscnt_amt(),
								hdrR.xrate(),
								getBaseCur().amt_dec_place(),
								getCo().xrate_rnd_typ()));
					}
				}
			}
		}

		/**
		 * 税金額取得用の上り電文を作成する
		 */
		protected MCList<ShipRprt_Upd01_DtlR> crtGetTaxAmtL(ShipRprt_Upd01_HdrR hdrR, MCList<ShipRprt_Upd01_DtlR> dtlL) {
			// amt は内税・外税関係なく常に税抜金額
			MCList<ShipRprt_Upd01_DtlR> l = dtlL.clone();
			for (ShipRprt_Upd01_DtlR r : l) {
				if (isTgtSubtract(hdrR, r)) {
					r.addNumberColumn("amt", r.trd_cur_amt().negate());
				}
				else {
					r.addNumberColumn("amt", r.trd_cur_amt());
				}
			}
			return l;
		}
		/**
		 * 減算対象か否かを判定する
		 */
		protected boolean isTgtSubtract(ShipRprt_Upd01_HdrR hdrR, ShipRprt_Upd01_DtlR dtlR) {
			// 値引品目の場合は減算（値引・値増は除く）
			boolean dscntItmFlg = getItmR(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3()).dscnt_itm_flg();
			return dscntItmFlg
					&& isSlsTrd(hdrR.trd_ptn_typ())
					&& !(MAC_TRD_PTN_TYP.isSLS_DSCNT(hdrR.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isSLS_XTRA(hdrR.trd_ptn_typ()));
		}

		/**
		 * 販売単価取得時のまとめ単位を設定するキー
		 */
		protected String _$grp_no = "__grp_no__";

		/**
		 * 販売単価取得時に明細を一意に特定するキー
		 */
		protected String _$peg_no = "__peg_no__";

		/**
		 * 販売単価を取得する
		 */
		protected void callSlsUpriSrv() {
			MABSL_SlsUpriService.SlsUpri_Sprt01 o = MABSL_SlsUpriService.crtSlsUpri_Sprt01();

			// 一意キーを付与
			setPegNo(_$peg_no, _updDtlL);

			MCIndexKey idx = _updDtlL.createIndex(
				ShipRprt_Upd01_DtlR.$hdr_peg_no, ShipRprt_Upd01_DtlR.$hdr_peg_seq, ShipRprt_Upd01_DtlR.$trd_cur_upri);
			Map_SlsUpri_Sprt01_DtlR_ShipRprt_Upd01_DtlR<SlsUpri_Sprt01_DtlR,ShipRprt_Upd01_DtlR, ShipRprt_Upd01_HdrR>
				mpr = createMap_SlsUpri_Sprt01_DtlR_ShipRprt_Upd01_DtlR();
			int grpNo = 1;		// ボリュームディスカウントのまとめ単位
			for (ShipRprt_Upd01_HdrR hdrR : _updHdrL) {
				if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())
					|| !isSlsTrd(hdrR.trd_ptn_typ())
					|| !hdrR.split_flg()) {
					// 削除、金額計算しない取引(売上系のみ)、または分割しないは対象外
					continue;
				}

				// 販売単価が未設定の明細を対象に、伝票分割した単位に販売単価を取得する
				MCList<ShipRprt_Upd01_DtlR>
					dtlL = _updDtlL.subList(idx, hdrR.hdr_peg_no(), hdrR.hdr_peg_seq(), null);
				if (!dtlL.isEmpty()) {
					hdrR.setNumberNE(_$grp_no, grpNo++);
					for (ShipRprt_Upd01_DtlR r : dtlL) {
						if (!isNull(r.rsn_cd())) {
							MAM_BIZ_RSN_R rsnR = getBizRsnR(r.rsn_cd());
							if (!isNull(rsnR) && rsnR.sls_acxfr_flg()) {
								// 販売他勘定の単価はゼロ
								r.trd_cur_upri(0);
								continue;
							}
						}
						copy(o.up0().add(), r, hdrR, mpr);
					}
				}
			}
			if (!o.up0().isEmpty()) {
				o.exec();
				copyByPegNo(
					_updDtlL, o.down0(),
					_$peg_no,
					new String[]{ShipRprt_Upd01_DtlR.$trd_cur_upri, "dsd.interim_flg"},
					SlsUpri_Sprt01_DtlR.$peg_no,
					new String[]{SlsUpri_Sprt01_DtlR.$sls_upri, SlsUpri_Sprt01_DtlR.$interim_flg}
				);
				
				MCIndexKey dtlUniqIdx = up1().createIndex(
						ShipRprt_Upd01_DtlR.$hdr_peg_no,
						ShipRprt_Upd01_DtlR.$hdr_peg_seq,
						ShipRprt_Upd01_DtlR.$dtl_uniq_seq);
				
				for (ShipRprt_Upd01_DtlR r : _updDtlL) {
					if (isNull(r.trd_cur_upri()) && o.down0().getFirst(SlsUpri_Sprt01_DtlR.$peg_no, r.getNumberNE(_$peg_no)) != null) {
						MCMessagePool.add(new MCMessage(r, null, MSBEL0231, toDispGUIIndex(r)));
					}
					
					if (!isNull(r.trd_cur_upri())) {
						if (r.trd_cur_upri().isZero() && isNull(r.rsn_cd()) && o.down0().getFirst(SlsUpri_Sprt01_DtlR.$peg_no, r.getNumberNE(_$peg_no)) != null) {
							MCList<ShipRprt_Upd01_DtlR> errDtlL = up1().subList(dtlUniqIdx, r.toArray(dtlUniqIdx.getKeys()));
							
							for (ShipRprt_Upd01_DtlR errDtlR : errDtlL) {
								MCMessagePool.add(new MCMessage(errDtlR, ShipRprt_Upd01_DtlR.$rsn_cd, MSBEL1303, toDispGUIIndex(errDtlR)));	
							}
						}
					}
				}
				throwErr(msgPrintErr());
			}
		}
		protected Map_SlsUpri_Sprt01_DtlR_ShipRprt_Upd01_DtlR<SlsUpri_Sprt01_DtlR,ShipRprt_Upd01_DtlR, ShipRprt_Upd01_HdrR> createMap_SlsUpri_Sprt01_DtlR_ShipRprt_Upd01_DtlR() {
			return new Map_SlsUpri_Sprt01_DtlR_ShipRprt_Upd01_DtlR<SlsUpri_Sprt01_DtlR, ShipRprt_Upd01_DtlR, ShipRprt_Upd01_HdrR>();
		}
		public class Map_SlsUpri_Sprt01_DtlR_ShipRprt_Upd01_DtlR<D extends SlsUpri_Sprt01_DtlR, S extends ShipRprt_Upd01_DtlR, W extends ShipRprt_Upd01_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
			protected ShipRprt_Upd01_HdrR _hdrR;
			@Override
			public void setWith(W hdrR) {
				_hdrR = hdrR;
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.peg_no(src.getNumber(_$peg_no));
				dest.grp_no(_hdrR.getNumber(_$grp_no).toString());
				dest.wg_cd(_hdrR.wg_cd());
				dest.sls_upri_flg(true);
				dest.itm_cd(src.itm_cd());
				dest.itm_sub1(src.itm_sub1());
				dest.itm_sub2(src.itm_sub2());
				dest.itm_sub3(src.itm_sub3());
				dest.cst_cd(_hdrR.bp_cd());
				dest.dlv_cd(_hdrR.dlv_id_cd());
				dest.unit_cd(src.trd_unit_cd());
				dest.qty(src.trd_unit_qty());
				dest.cur_cd(_hdrR.trd_cur_cd());
				if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(_hdrR.sls_basis_typ())) {
					dest.dt(_hdrR.ship_tm());
				} else if (MAC_SLS_BASIS_TYP.isIN_BASIS(_hdrR.sls_basis_typ()) ||
						MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(_hdrR.sls_basis_typ())) {
					dest.dt(_hdrR.dlv_tm());
				}
			}
		}

		/**
		 * 納品書ＮＯを設定する
		 */
		protected String _$seq_peg_no = "__seq_peg_no__";
		protected void setDlvSlipNo() {
			MCList<ShipRprt_Upd01_HdrR>
				tgtL = _updHdrL.subList(	r -> isNull(r.dlv_slip_no()));
			if (tgtL.isEmpty()) {
				return;
			}
			tgtL.addNumberColumn(_$seq_peg_no);
			MCList<ElmArgsR> argsL = MCList.create(ElmArgsR.class);
			for (int i=0; i<tgtL.size(); i++) {
				ShipRprt_Upd01_HdrR r = tgtL.get(i);
				ElmArgsR args = argsL.add();
				args.dpt_cd(r.dpt_cd());
				args.co_cd(getCo().co_cd());
				args.wg_cd(r.wg_cd());
				args.trd_cd(r.trd_cd());
				args.dt(nvl(r.ac_dt(), r.ship_tm()));
				args.peg_no(i);
				r.setNumber(_$seq_peg_no, i);
			}
			setNum(MAC_NUM_BIZ_TYP.DLVSLIP, argsL);
			copyByPegNo(tgtL, argsL,
				_$seq_peg_no, new String[]{ShipRprt_Upd01_HdrR.$dlv_slip_no},
				ElmArgsR.$peg_no, new String[]{ElmArgsR.$new_no});
			
			// 発番した納品書NOを明細に反映
			MCIndexKey idx = _updDtlL.createIndex(
				ShipRprt_Upd01_DtlR.$hdr_peg_no, ShipRprt_Upd01_DtlR.$hdr_peg_seq);
			for (ShipRprt_Upd01_HdrR hdrR : tgtL) {
				MCList<ShipRprt_Upd01_DtlR> dtlL = _updDtlL.subList(idx, hdrR.toArray(idx.getKeys()));
				dtlL.forEach(dtlR -> {
					dtlR.dlv_slip_no(hdrR.dlv_slip_no());
				});
			}
		}

		/**
		 * 納品書明細ＮＯを設定する
		 */
		protected void setDlvSlipDNo() {
			// 発番対象を取得
			MCList<ShipRprt_Upd01_DtlR> tgtL = MCList.create(ShipRprt_Upd01_DtlR.class);
			_updDtlL.forEach(r -> {
				if (isNull(r.dlv_slip_d_no())) {
					tgtL.add(r);
				}
			});
			if (!tgtL.isEmpty()) {
				// 納品書明細NOを発番
				doSeqCache(MSC_NUM_SYS_TYP.DLVSLIPD, tgtL.size());
				for (ShipRprt_Upd01_DtlR r : tgtL) {
					r.dlv_slip_d_no(getStrSeq(MSC_NUM_SYS_TYP.DLVSLIPD));
				}
			}
		}

		/**
		 * 訂正・取消対象の納品伝票を取得する
		 */
		protected MCList<MST_DLV_SLIP_R> getUpdDlvSlipL(ShipRprt_Upd01_HdrR hdrR) {
			MCList<MST_DLV_SLIP_R> slipL = null;
			if (!isNull(hdrR.dlv_slip_no())) {
				// 上り電文の納品書NOが指定されている場合は、納品書NO単位で訂正・削除する
				slipL = MCList.create(MST_DLV_SLIP_R.class);
				slipL.add(getDlvSlipR(hdrR.dlv_slip_no()));
			}
			else {
				// 実績NO＞指図NOの順で取得
				ShipRprt_Upd01_HdrR upR = ShipRprt_Upd01_HdrR.create();
				upR.trn_typ(hdrR.trn_typ());
				upR.dlv_slip_act_no(hdrR.dlv_slip_act_no());
				slipL = getDlvSlipL(upR);
				if (slipL.isEmpty()) {
					upR.dlv_slip_inst_no(hdrR.dlv_slip_inst_no());
					upR.dlv_slip_act_no(null);
					slipL = getDlvSlipL(upR);
				}
			}
			return slipL;
		}

		/**
		 * 納品伝票を更新する
		 */
		protected void updDlvSlip() {
			MCList<MST_DLV_SLIP_R>
				insL = MCList.create(MST_DLV_SLIP_R.class),
				updL = MCList.create(MST_DLV_SLIP_R.class);
			MST_DLV_SLIP_R updL_t = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
	
			updL_bldr.setSet(updL_t.slip_sts_typ);

			MCList<ShipRprt_Upd01_HdrR> upL =
				up0().distinctNE(
					ShipRprt_Upd01_HdrR.$data_crud_typ,
					ShipRprt_Upd01_HdrR.$dlv_slip_no,
					ShipRprt_Upd01_HdrR.$trn_typ,
					ShipRprt_Upd01_HdrR.$dlv_slip_act_no,
					ShipRprt_Upd01_HdrR.$dlv_slip_inst_no
					,ShipRprt_Upd01_HdrR.$can_ac_dt
				);
			for (ShipRprt_Upd01_HdrR r : upL) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					// _updHdrLを利用するのでここでは何もしない
					continue;
				}

				for (MST_DLV_SLIP_R orgR : getUpdDlvSlipL(r)) {

					MST_DLV_SLIP_R prevDlvSlipR = getDlvSlipR(orgR.dlv_slip_no());
					if (MAC_SLIP_STS_TYP.isCAN(prevDlvSlipR.slip_sts_typ()) && !prevDlvSlipR.slip_prnt_flg()) {
						ShipRprt_Upd01_HdrR canR = r.clone();
						canR.ds(prevDlvSlipR);
						_prntHdrL.add(canR);
					}

					MST_DLV_SLIP_R slipR = orgR.clone();
					if (isNotUpdDlvSlipCan(slipR, r)) {
						continue;
					}
					
					// 無効伝票
					slipR.slip_sts_typ(MAC_SLIP_STS_TYP.DIS.value());
					updL.add(slipR.clone());

					// 取消伝票
					slipR.dlv_slip_seq(slipR.dlv_slip_seq().add(1));
					slipR.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());
					slipR.slip_prnt_flg(false);
					slipR.sls_prnt_flg(false);
					slipR.ship_adv_prnt_flg(false);
					if (!isNull(r.can_ac_dt())) {
						slipR.ac_dt(r.can_ac_dt());
					}

					// 数量、金額は符号を反転させる
					slipR.trd_cur_amt(negate(slipR.trd_cur_amt()));
					slipR.trd_cur_tax_amt(negate(slipR.trd_cur_tax_amt()));
					slipR.trd_cur_dscnt_amt(negate(slipR.trd_cur_dscnt_amt()));
					slipR.base_cur_amt(negate(slipR.base_cur_amt()));
					slipR.base_cur_tax_amt(negate(slipR.base_cur_tax_amt()));
					slipR.base_cur_dscnt_amt(negate(slipR.base_cur_dscnt_amt()));
					insL.add(slipR.clone());
					ShipRprt_Upd01_HdrR canR = r.clone();
					canR.ds(slipR);
					_prntHdrL.add(canR);
				}
			}
			_updHdrL.forEach(r -> insL.add(r.ds()));
			_prntHdrL.addAll(_updHdrL);

			MCList<MST_DLV_SLIP_R> notInsL = insL.subList(r -> isNotUpdDlvSlip(r.dlv_slip_no()));
			updDlivSlip(notInsL);
			
			insL.removeAll(notInsL);
			updL.removeAll(updL.subList(r -> isNotUpdDlvSlip(r.dlv_slip_no())));
			if (!updL.isEmpty()) {
				dbUpdateKey("MSBEL5550_MST_DLV_SLIP_U01", updL, updL_bldr);
			}
			if (!insL.isEmpty()) {
				dbInsert("MSBEL5550_MST_DLV_SLIP_I01", insL, MCQueryApiBuilder.create(MST_DLV_SLIP_R.create("T")));
			}
			
			// 帳票発行のためリフレッシュ
			MCList<ShipRprt_Upd01_HdrR> lst = up0().clone();
			lst.addAll(_updHdrL);
			doDlvSlipCache(lst);
		}
		protected void updDlivSlip(MCList<MST_DLV_SLIP_R> notInsL) {
			if (notInsL.isEmpty()) {
				return;
			}
			
			MCList<MST_DLV_SLIP_R> updL = MCList.create(MST_DLV_SLIP_R.class);
			for (MST_DLV_SLIP_R notInsR : notInsL.groupBy(MST_DLV_SLIP_R.$dlv_slip_no)) {
				MST_DLV_SLIP_R crtR = _notUpdDlvSlipL.get(notInsR.dlv_slip_no());
				MST_DLV_SLIP_R disR = getDlvSlipR(notInsR.dlv_slip_no());
				MST_DLV_SLIP_R updR = MST_DLV_SLIP_R.create();
				
				// 出荷(移動)指図⇒出荷(移動)実績
				if (isInstToAct(crtR, disR)) {
					updR.dlv_slip_act_no(crtR.dlv_slip_act_no());
					updR.sls_act_no(null);
					updR.ship_dlv_slip_no(null);
					updR.ac_dt(crtR.ac_dt());
					updR.sync_flg(crtR.sync_flg());
				}
				// 出荷実績⇒売上実績
				else if (isShipActToSlsAct(crtR, disR)) {
					updR.dlv_slip_act_no(disR.dlv_slip_act_no());
					updR.sls_act_no(crtR.sls_act_no());
					updR.ship_dlv_slip_no(crtR.ship_dlv_slip_no());
					updR.ac_dt(disR.ac_dt());
					updR.sync_flg(disR.sync_flg());
				}
				// 仕入直送(予定)⇒売上実績
				else if (isDDlvToSlsAct(crtR, disR)) {
					updR.dlv_slip_act_no(null);
					updR.sls_act_no(crtR.sls_act_no());
					updR.ship_dlv_slip_no(null);
					updR.ac_dt(crtR.ac_dt());
					updR.sync_flg(crtR.sync_flg());
				}
				else {
					continue;
				}
				
				updR.dlv_slip_no(disR.dlv_slip_no());
				updR.dlv_slip_seq(disR.dlv_slip_seq());
				updL.add(updR);
			}
			
			if (!updL.isEmpty()) {
				MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
				bldr.setSet(t.dlv_slip_act_no, t.sls_act_no, t.ship_dlv_slip_no, t.ac_dt, t.sync_flg);
				dbUpdateKey("MSBEL5550_MST_DLV_SLIP_U09", updL, bldr);
			}
		}

		/**
		 * 納品伝票明細を更新する
		 */
		protected void updDlvSlipD() {
			MCList<MST_DLV_SLIP_D_R>
				insL = MCList.create(MST_DLV_SLIP_D_R.class);

			MCList<ShipRprt_Upd01_HdrR> upL =
				up0().groupBy(
					ShipRprt_Upd01_HdrR.$data_crud_typ,
					ShipRprt_Upd01_HdrR.$dlv_slip_no,
					ShipRprt_Upd01_HdrR.$trn_typ,
					ShipRprt_Upd01_HdrR.$dlv_slip_act_no,
					ShipRprt_Upd01_HdrR.$dlv_slip_inst_no
				);
			for (ShipRprt_Upd01_HdrR r : upL) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					// _updDtlLを利用するのでここでは何もしない
					continue;
				}

				for (MST_DLV_SLIP_R slipR : getUpdDlvSlipL(r)) {
					MCList<MST_DLV_SLIP_D_R> slipDL = getDlvSlipDL(slipR.dlv_slip_no());
					if (isNotUpdDlvSlipCan(slipR, r)) {
						continue;
					}
					// 無効伝票
					// 明細に対しては何もしない

					// 取消伝票
					MCNumber seq = slipR.dlv_slip_seq().add(1);

					for (MST_DLV_SLIP_D_R orgSlipDR : slipDL) {
						MST_DLV_SLIP_D_R slipDR = orgSlipDR.clone();
						slipDR.dlv_slip_d_seq(seq);
						slipDR.dlv_slip_seq(seq);
	
						// 数量、金額は符号を反転させる
						slipDR.trd_unit_qty(negate(slipDR.trd_unit_qty()));
						slipDR.base_unit_qty(negate(slipDR.base_unit_qty()));
						slipDR.slo_qty(negate(slipDR.slo_qty()));
						slipDR.dlv_inst_qty(negate(slipDR.dlv_inst_qty()));
						slipDR.trd_cur_amt(negate(slipDR.trd_cur_amt()));
						slipDR.trd_cur_tax_amt(negate(slipDR.trd_cur_tax_amt()));
						slipDR.trd_cur_dscnt_amt(negate(slipDR.trd_cur_dscnt_amt()));
						slipDR.base_cur_amt(negate(slipDR.base_cur_amt()));
						slipDR.base_cur_tax_amt(negate(slipDR.base_cur_tax_amt()));
						slipDR.base_cur_dscnt_amt(negate(slipDR.base_cur_dscnt_amt()));
						slipDR.wtax_amt(negate(slipDR.wtax_amt()));
						insL.add(slipDR);
					}
				}
			}
			_updDtlL.forEach(r -> insL.add(r.dsd()));

			insL.removeAll(insL.subList(r -> isNotUpdDlvSlip(r.dlv_slip_no())));
			if (!insL.isEmpty()) {
				dbInsert("MSBEL5550_MST_DLV_SLIP_D_I01", insL, MCQueryApiBuilder.create(MST_DLV_SLIP_D_R.create("T")));
			}
		}
		/**
		 * 出荷指図（移動指図）に対する納品伝票 ⇒ 出荷実績（移動実績）に対する納品伝票
		 */
		protected boolean isInstToAct(MST_DLV_SLIP_R crtR, MST_DLV_SLIP_R disR) {
			// 出荷指図⇒出荷実績、または移動指図⇒移動実績
			if (isSame(disR.trn_typ(), crtR.trn_typ())
				&& (MSC_TRN_TYP.isSHIP(disR.trn_typ()) || MSC_TRN_TYP.isXFR(disR.trn_typ()))
				&& isSame(disR.dlv_slip_inst_no(), crtR.dlv_slip_inst_no())
				&& !isNull(disR.dlv_slip_inst_no())
				&& isNull(disR.dlv_slip_act_no())
				&& !isNull(crtR.dlv_slip_act_no())
				) {
				return true;
			}
			return false;
		}
		/**
		 * 出荷実績に対する納品伝票 ⇒ 売上実績に対する納品伝票
		 */
		protected boolean isShipActToSlsAct(MST_DLV_SLIP_R crtR, MST_DLV_SLIP_R disR) {
			if (MSC_TRN_TYP.isSHIP(disR.trn_typ())
				&& !isNull(disR.dlv_slip_act_no())
				&& isNull(disR.sls_act_no())
				&& MSC_TRN_TYP.isSLS(crtR.trn_typ())
				&& !isNull(crtR.dlv_slip_act_no())
				&& !isNull(crtR.sls_act_no())) {
				return true;
			}
			return false;
		}
		/**
		 * 仕入直送に対する納品伝票 ⇒ 売上実績に対する納品伝票
		 */
		protected boolean isDDlvToSlsAct(MST_DLV_SLIP_R crtR, MST_DLV_SLIP_R disR) {
			if (MSC_TRN_TYP.isPURC(disR.trn_typ())
				&& !isNull(disR.dlv_slip_inst_no())
				&& isNull(disR.dlv_slip_act_no())
				&& isNull(disR.sls_act_no())
				&& MSC_TRN_TYP.isSLS(crtR.trn_typ())
				&& !isNull(crtR.dlv_slip_act_no())
				&& !isNull(crtR.sls_act_no())) {
				return true;
			}
			return false;
		}
		
		/**
		 * 指図の納品伝票か判定する
		 */
		protected boolean isInstDlvSlip(MST_DLV_SLIP_R slipR) {
			if (!isNull(slipR.dlv_slip_inst_no()) && isNull(slipR.dlv_slip_act_no())) {
				return true;
			}
			return false;
		}
		
		/**
		 * 実績の納品伝票か判定する
		 */
		protected boolean isActDlvSlip(MST_DLV_SLIP_R slipR) {
			if (!isNull(slipR.dlv_slip_act_no())) {
				return true;
			}
			return false;
		}
		
		/**
		 * 登録対象外の納品伝票があるかチェックする
		 */
		protected Map<String, MST_DLV_SLIP_R> _notUpdDlvSlipL;
		protected void chkNotUpdDlvSlip() {
			_notUpdDlvSlipL = new HashMap<>();
			
			MCIndexKey idx = _updDtlL.createIndex(
				ShipRprt_Upd01_DtlR.$hdr_peg_no, ShipRprt_Upd01_DtlR.$hdr_peg_seq);
			for (MCList<ShipRprt_Upd01_HdrR> hdrL : _updHdrL.groupList(ShipRprt_Upd01_HdrR.$dlv_slip_no)) {
				ShipRprt_Upd01_HdrR hdrR = hdrL.get(0);
				if (isNull(hdrR.dlv_slip_no())) {
					continue;
				}
				MCList<MST_DLV_SLIP_R> slipL = getUpdDlvSlipL(hdrR);
				if (slipL.isEmpty()
					|| !MAC_SLIP_STS_TYP.isCRT(slipL.get(0).slip_sts_typ())) {
					continue;
				}
				
				// 新規伝票
				MST_DLV_SLIP_R crtR = hdrR.ds();
				MCList<ShipRprt_Upd01_DtlR> dtlL = _updDtlL.subList(idx, hdrR.toArray(idx.getKeys()));
				MCList<MST_DLV_SLIP_D_R> crtDL = dtlL.innerRowList("dsd", MST_DLV_SLIP_D_R.class);
				// 無効伝票
				MST_DLV_SLIP_R disR = slipL.get(0);
				MCList<MST_DLV_SLIP_D_R> disDL = getDlvSlipDL(disR.dlv_slip_no());
				
				if ( !(isUpdDlvSlip(crtR, disR) || isUpdDlvSlipD(crtR, crtDL, disR, disDL)) ) {
					// 登録対象外に追加
					_notUpdDlvSlipL.put(crtR.dlv_slip_no(), crtR);
					
					// 下り電文で使用するため連番を戻す
					crtDL.forEach(r -> {
						r.dlv_slip_seq(disR.dlv_slip_seq());
					});
					// 未登録に戻す
					dtlL.forEach(r -> {
						r.upded_flg(false);
					});
				}
			}
		}
		
		/**
		 * 登録対象外の納品伝票か判定する
		 */
		protected boolean isNotUpdDlvSlip(String dlvSlipNo) {
			return _notUpdDlvSlipL.containsKey(dlvSlipNo);
		}
		
		protected String[] _dlvSlipCols;
		protected boolean isUpdDlvSlip(MST_DLV_SLIP_R crtR, MST_DLV_SLIP_R disR) {
			if (_dlvSlipCols == null) {
				_dlvSlipCols = new String[]{
					MST_DLV_SLIP_R.$dlv_slip_no,
					MST_DLV_SLIP_R.$slo_no,
					MST_DLV_SLIP_R.$dpt_cd,
					MST_DLV_SLIP_R.$usr_cd,
					MST_DLV_SLIP_R.$ship_tm,
					MST_DLV_SLIP_R.$dlv_tm,
					MST_DLV_SLIP_R.$dlv_rqst_tm,
					MST_DLV_SLIP_R.$ac_dt,
					MST_DLV_SLIP_R.$trd_cd,
					MST_DLV_SLIP_R.$trd_ptn_typ,
					MST_DLV_SLIP_R.$tax_calc_typ,
					MST_DLV_SLIP_R.$cst_po_no,
					MST_DLV_SLIP_R.$pri_prnt_flg,
					MST_DLV_SLIP_R.$trd_cur_cd,
					MST_DLV_SLIP_R.$trd_cur_nm,
					MST_DLV_SLIP_R.$trd_cur_amt,
					MST_DLV_SLIP_R.$trd_cur_tax_amt,
					MST_DLV_SLIP_R.$trd_cur_dscnt_amt,
					MST_DLV_SLIP_R.$base_cur_amt,
					MST_DLV_SLIP_R.$base_cur_tax_amt,
					MST_DLV_SLIP_R.$base_cur_dscnt_amt,
					MST_DLV_SLIP_R.$xrate,
					MST_DLV_SLIP_R.$ptax_xrate,
					MST_DLV_SLIP_R.$slip_line_max,
					MST_DLV_SLIP_R.$bp_cd,
					MST_DLV_SLIP_R.$bp_nm,
					MST_DLV_SLIP_R.$bp_zip_cd,
					MST_DLV_SLIP_R.$bp_addr1,
					MST_DLV_SLIP_R.$bp_addr2,
					MST_DLV_SLIP_R.$bp_addr3,
					MST_DLV_SLIP_R.$bp_addr4,
					MST_DLV_SLIP_R.$bp_cntct_dpt,
					MST_DLV_SLIP_R.$bp_cntct_psn,
					MST_DLV_SLIP_R.$bp_tel,
					MST_DLV_SLIP_R.$bp_fax,
					MST_DLV_SLIP_R.$dlv_id_typ,
					MST_DLV_SLIP_R.$dlv_id_cd,
					MST_DLV_SLIP_R.$dlv_id_nm,
					MST_DLV_SLIP_R.$dlv_sundry_flg,
					MST_DLV_SLIP_R.$dlv_zip_cd,
					MST_DLV_SLIP_R.$dlv_addr1,
					MST_DLV_SLIP_R.$dlv_addr2,
					MST_DLV_SLIP_R.$dlv_addr3,
					MST_DLV_SLIP_R.$dlv_addr4,
					MST_DLV_SLIP_R.$dlv_cntct_dpt,
					MST_DLV_SLIP_R.$dlv_cntct_psn,
					MST_DLV_SLIP_R.$dlv_tel,
					MST_DLV_SLIP_R.$dlv_fax,
					MST_DLV_SLIP_R.$xfr_loc_cd,
					MST_DLV_SLIP_R.$ship_fr_lg_grp_cd,
					MST_DLV_SLIP_R.$wg_cd,
					MST_DLV_SLIP_R.$trd_rmrks,
					MST_DLV_SLIP_R.$sync_flg,
					MST_DLV_SLIP_R.$adjst_slip_flg,
					MST_DLV_SLIP_R.$edi_flg,
					MST_DLV_SLIP_R.$sub_char1,
					MST_DLV_SLIP_R.$sub_char2,
					MST_DLV_SLIP_R.$sub_char3,
					MST_DLV_SLIP_R.$sls_basis_typ
				};
			}
			
			MST_DLV_SLIP_R wkCrtR = crtR.clone();
			MST_DLV_SLIP_R wkDisR = disR.clone();
			
			// 指図の納品伝票と、実績の納品伝票の比較
			if (isInstDlvSlip(wkCrtR) && isActDlvSlip(wkDisR)
				|| isActDlvSlip(wkCrtR) && isInstDlvSlip(wkDisR)) {
				// 計上日は比較対象外（計上日は指図の納品伝票には設定されないので）
				wkCrtR.ac_dt(null);
				wkDisR.ac_dt(null);
				
				// 同時計上フラグは比較対象外（指図の納品伝票には設定されないので）
				wkCrtR.sync_flg(false);
				wkDisR.sync_flg(false);
			}
			
			// 値が異なる項目がある場合、登録対象とする
			return !isColSame(wkCrtR, wkDisR, _dlvSlipCols);
		}
		protected String[] _dlvSlipDCols;
		protected boolean isUpdDlvSlipD(
				MST_DLV_SLIP_R crtR, MCList<MST_DLV_SLIP_D_R> crtDL,
				MST_DLV_SLIP_R disR, MCList<MST_DLV_SLIP_D_R> disDL) {
			if (_dlvSlipDCols == null) {
				_dlvSlipDCols = new String[]{
					MST_DLV_SLIP_D_R.$dlv_slip_d_no,
					MST_DLV_SLIP_D_R.$dlv_slip_no,
					MST_DLV_SLIP_D_R.$itm_cd,
					MST_DLV_SLIP_D_R.$itm_sub1,
					MST_DLV_SLIP_D_R.$itm_sub2,
					MST_DLV_SLIP_D_R.$itm_sub3,
					MST_DLV_SLIP_D_R.$itm_nm,
					MST_DLV_SLIP_D_R.$sundry_itm_flg,
					MST_DLV_SLIP_D_R.$sno1,
					MST_DLV_SLIP_D_R.$sno2,
					MST_DLV_SLIP_D_R.$sno3,
					MST_DLV_SLIP_D_R.$sno4,
					MST_DLV_SLIP_D_R.$lot_no,
					MST_DLV_SLIP_D_R.$lot_plural_flg,
					MST_DLV_SLIP_D_R.$sublot_no,
					MST_DLV_SLIP_D_R.$sublot_plural_flg,
					MST_DLV_SLIP_D_R.$str_ln_cd,
					MST_DLV_SLIP_D_R.$stk_arrv_bp_cd,
					MST_DLV_SLIP_D_R.$gd_cd,
					MST_DLV_SLIP_D_R.$quality_typ,
					MST_DLV_SLIP_D_R.$stk_insp_typ,
					MST_DLV_SLIP_D_R.$stk_id_typ,
					MST_DLV_SLIP_D_R.$stk_bp_cd,
					MST_DLV_SLIP_D_R.$fix_no_typ,
					MST_DLV_SLIP_D_R.$fix_no,
					MST_DLV_SLIP_D_R.$trd_unit_qty,
					MST_DLV_SLIP_D_R.$trd_unit_cd,
					MST_DLV_SLIP_D_R.$base_unit_qty,
					MST_DLV_SLIP_D_R.$base_unit_cd,
					MST_DLV_SLIP_D_R.$slo_qty,
					MST_DLV_SLIP_D_R.$slo_unit_cd,
					MST_DLV_SLIP_D_R.$dlv_inst_qty,
					MST_DLV_SLIP_D_R.$dlv_inst_unit_cd,
					MST_DLV_SLIP_D_R.$interim_flg,
					MST_DLV_SLIP_D_R.$trd_cur_upri,
					MST_DLV_SLIP_D_R.$trd_cur_amt,
					MST_DLV_SLIP_D_R.$trd_cur_dscnt_amt,
					MST_DLV_SLIP_D_R.$base_cur_upri,
					MST_DLV_SLIP_D_R.$base_cur_amt,
					MST_DLV_SLIP_D_R.$base_cur_tax_amt,
					MST_DLV_SLIP_D_R.$base_cur_dscnt_amt,
					MST_DLV_SLIP_D_R.$tax_cd,
					MST_DLV_SLIP_D_R.$trd_cur_tax_amt,
					MST_DLV_SLIP_D_R.$wtax_rate,
					MST_DLV_SLIP_D_R.$wtax_amt,
					MST_DLV_SLIP_D_R.$prov_typ,
					MST_DLV_SLIP_D_R.$prov_basis_typ,
					MST_DLV_SLIP_D_R.$rsn_cd,
					MST_DLV_SLIP_D_R.$bd_dpt_cd,
					MST_DLV_SLIP_D_R.$cst_po_d_no,
					MST_DLV_SLIP_D_R.$cst_itm_cd,
					MST_DLV_SLIP_D_R.$cst_itm_nm,
					MST_DLV_SLIP_D_R.$dlv_inst_no,
					MST_DLV_SLIP_D_R.$dlv_inst_d_no,
					MST_DLV_SLIP_D_R.$slo_d_no,
					MST_DLV_SLIP_D_R.$trd_d_rmrks,
					MST_DLV_SLIP_D_R.$io_typ,
					MST_DLV_SLIP_D_R.$sub_char1,
					MST_DLV_SLIP_D_R.$sub_char2,
					MST_DLV_SLIP_D_R.$sub_char3,
					MST_DLV_SLIP_D_R.$base_ac_dt
				};
			}
			
			// 件数が異なる場合、登録対象とする
			if (crtDL.size() != disDL.size()) {
				return true;
			}
			
			crtDL.sort(MST_DLV_SLIP_D_R.$dlv_slip_d_no);
			disDL.sort(MST_DLV_SLIP_D_R.$dlv_slip_d_no);
			
			MCList<MST_DLV_SLIP_D_R> wkCrtDL = crtDL.clone();
			for (MST_DLV_SLIP_D_R r : wkCrtDL) {
				r.lot_no(nvl(r.lot_no(), MAC_STR.NULL_VAL.value()));
				r.sublot_no(nvl(r.sublot_no(), MAC_STR.NULL_VAL.value()));
			}
			
			MCList<MST_DLV_SLIP_D_R> wkDisDL = disDL.clone();
			for (MST_DLV_SLIP_D_R r : wkDisDL) {
				r.lot_no(nvl(r.lot_no(), MAC_STR.NULL_VAL.value()));
				r.sublot_no(nvl(r.sublot_no(), MAC_STR.NULL_VAL.value()));
			}
			
			// 振替伝票
			if (MSC_TRN_TYP.isACXFR(crtR.trn_typ())
				|| MSC_TRN_TYP.isSTK_XFR(crtR.trn_typ())) {
				wkCrtDL.forEach(r -> {
					r.dlv_slip_d_no(null);
				});
				wkDisDL.forEach(r -> {
					r.dlv_slip_d_no(null);
				});
			}
			
			// 値が異なる項目がある場合、登録対象とする
			for (int i=0; i<wkCrtDL.size(); i++) {
				if (!isColSame(wkCrtDL.get(i), wkDisDL.get(i), _dlvSlipDCols)) {
					return true;
				}
			}
			
			return false;
		}
		/**
		 * 納品伝票を発行するか
		 */
		protected boolean isPrntDlvSlip(String dlvSlipNo, ShipRprt_Upd01_HdrR hdrR) {
			if (!hdrR.dlv_slip_prnt_flg()) {
				return false;
			}
			
			if (isNotUpdDlvSlip(dlvSlipNo)) {
				MST_DLV_SLIP_R slipR = getDlvSlipR(dlvSlipNo);
				if (slipR.slip_prnt_flg()) {
					// 振替伝票
					if (MSC_TRN_TYP.isACXFR(hdrR.trn_typ())
						|| MSC_TRN_TYP.isSTK_XFR(hdrR.trn_typ())) {
						return MCBooleanUtil.dbStringToBoolean(
								getSysParmNE("IMDT_PRNT_TRNSFR_SLIP_FLG"));
					}
					// 納品書
					else {
						return MCBooleanUtil.dbStringToBoolean(
								getSysParmNE("IMDT_PRNT_DLV_SLIP_FLG"));
					}
				}
			}
			return true;
		}
		/**
		 * 出荷案内書を発行するか
		 */
		protected boolean isPrntShipAdv(String dlvSlipNo, ShipRprt_Upd01_HdrR hdrR) {
			if (!hdrR.ship_adv_prnt_flg()) {
				return false;
			}
			
			if (isNotUpdDlvSlip(dlvSlipNo)) {
				MST_DLV_SLIP_R slipR = getDlvSlipR(dlvSlipNo);
				if (slipR.ship_adv_prnt_flg()) {
					return MCBooleanUtil.dbStringToBoolean(
							getSysParmNE("IMDT_PRNT_SHIP_ADV_FLG"));
				}
			}
			return true;
		}
		
		/**
		 * 取消対象外の納品伝票か判定する
		 */
		protected boolean isNotUpdDlvSlipCan(MST_DLV_SLIP_R slipR, ShipRprt_Upd01_HdrR upR) {
			if (!MAC_SLIP_STS_TYP.isCRT(slipR.slip_sts_typ())) {
				// 直前の伝票が新規伝票でない場合、取消と無効の伝票は作成しない
				return true;
			}
			
			ShipRprt_Upd01_DtlR up1R = up1().getFirst(_up1DlvSlipNoIdx, slipR.dlv_slip_no());
			if (isInstToAct(upR.ds(), slipR) && isNull(up1R)) {
				// 指図を引き継いで実績を登録する場合に、納品伝票が対象から除外されていた場合も作成しない
				// 指図時に納品書ａ、ｂ。実績でａのみ登録、とした場合など
				return true;
			}
			
			return false;
		}
		
		/**
		 * 納品書が発行済か
		 */
		protected boolean isPrnted(MST_DLV_SLIP_R slipR) {
			return slipR.sls_prnt_flg() || slipR.slip_prnt_flg();
		}
		
		/**
		 * 納品書を発行する
		 */
		protected void prntDlvSlip() {
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 o = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt01();
			
			MCIndexKey idx = _updDtlL.createIndex(ShipRprt_Upd01_DtlR.$dlv_slip_no);
			for (ShipRprt_Upd01_HdrR up0R : _prntHdrL) {
				if (isNull(up0R.dlv_slip_no())) {
					continue;
				}
				
				// 納品伝票のうち、最新の連番を取得（登録対象外の納品伝票の場合、prntTgtLが持つ連番とは異なる）
				MST_DLV_SLIP_R slipR = getDlvSlipR(up0R.dlv_slip_no());
				
				boolean dlvSlipPrntFlg = isPrntDlvSlip(up0R.dlv_slip_no(), up0R);
				boolean shipAdvPrntFlg = isPrntShipAdv(up0R.dlv_slip_no(), up0R);
				if (dlvSlipPrntFlg || shipAdvPrntFlg) {
					
					if (MSC_TRN_TYP.isACXFR(up0R.trn_typ())
						 || MSC_TRN_TYP.isSTK_XFR(up0R.trn_typ())) {
						if (MAC_SLIP_STS_TYP.isCAN(up0R.ds().slip_sts_typ())) {
							// 取消の場合は、発行済みの取消伝票が存在する場合のみ対象とする
							MCList<MST_DLV_SLIP_R> canL = getDlvSlipCanL(up0R);
							if (!canL.isEmpty()) {
								ShipRprt_Prnt01_HdrR prntR = o.up0().add();
								prntR.dlv_slip_prnt_flg(dlvSlipPrntFlg);
								prntR.trn_typ(up0R.trn_typ());
								prntR.dlv_slip_act_no(up0R.dlv_slip_act_no());
								prntR.setAttributes(up0R);
							}
						}
						else {
							// 他勘定と在庫振替は伝票実績ＮＯごとに発行する
							// 取消伝票、新規伝票は呼出先でまとめて出力
							ShipRprt_Prnt01_HdrR prntR = o.up0().add();
							prntR.dlv_slip_prnt_flg(dlvSlipPrntFlg);
							prntR.trn_typ(up0R.trn_typ());
							prntR.dlv_slip_act_no(up0R.dlv_slip_act_no());
							prntR.setAttributes(up0R);
						}
					}
					else {
						if (MAC_SLIP_STS_TYP.isCAN(up0R.ds().slip_sts_typ())) {
							// 取消伝票（発行済みがあれば）
							MST_DLV_SLIP_R canR = getDlvSlipCanR(up0R.dlv_slip_no());
							if (!isNull(canR)) {
								ShipRprt_Prnt01_HdrR prntR = o.up0().add();
								prntR.dlv_slip_no(canR.dlv_slip_no());
								prntR.dlv_slip_seq(canR.dlv_slip_seq());
								prntR.dlv_slip_prnt_flg(dlvSlipPrntFlg);
								prntR.setAttributes(up0R);
							}
						}
						else if (MAC_DATA_CRUD_TYP.isCRT(up0R.ds().slip_sts_typ())) {
							// 新規伝票もしくは訂正伝票
							ShipRprt_Prnt01_HdrR prntR = o.up0().add();
							prntR.dlv_slip_no(slipR.dlv_slip_no());
							prntR.dlv_slip_seq(slipR.dlv_slip_seq());
							prntR.dlv_slip_prnt_flg(dlvSlipPrntFlg);
							prntR.setAttributes(up0R);
							
							// 出荷案内書は新規伝票もしくは訂正伝票のみ
							prntR.ship_adv_prnt_flg(shipAdvPrntFlg);
						}
					}
				}
				
				_updDtlL.subList(idx, up0R.dlv_slip_no()).forEach(r -> {
					r.dlv_slip_prnted_flg(dlvSlipPrntFlg || slipR.slip_prnt_flg());
					r.ship_adv_prnted_flg(shipAdvPrntFlg || slipR.ship_adv_prnt_flg());
				});
			}
			if (!o.up0().isEmpty()) {
				o.up0().setAll(
					o.up0().distinctNE(
						ShipRprt_Prnt01_HdrR.$dlv_slip_no, ShipRprt_Prnt01_HdrR.$dlv_slip_seq,
						ShipRprt_Prnt01_HdrR.$trn_typ, ShipRprt_Prnt01_HdrR.$dlv_slip_act_no
					)
				);
				o.up1().bndl_prnt_flg(up2().bndl_prnt_flg());
				o.exec();
			}
		}
	}

	/**
	 * ShipRprt_Upd02オペレーション.<p>
	 *
	 * 納品伝票トランザクションの各種制御ＦＬＧを更新する<br>
	 */
	public class ShipRprt_Upd02 extends MSBEL_ShipRprtPrntService_MC_A.ShipRprt_Upd02 {

		/**
		 * 上り電文の振り分け（納品書NO指定、伝票実績NO指定、伝票指図NO指定のいずれか）
		 */
		protected MCList<ShipRprt_Upd02_HdrR> _upDlvSlipL = null, _upActL = null, _upInstL = null;

		/**
		 * 更新用コンテナ
		 */
		protected MCList<MST_DLV_SLIP_R> _updL = MCList.create(MST_DLV_SLIP_R.class);

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			splitUp0();
			lockDlvSlip();
			updDlvSlip();
		}

		/**
		 * 上り電文の更新対象を振り分ける
		 */
		protected void splitUp0() {
			_upDlvSlipL = MCList.create(ShipRprt_Upd02_HdrR.class);
			_upActL = MCList.create(ShipRprt_Upd02_HdrR.class);
			_upInstL = MCList.create(ShipRprt_Upd02_HdrR.class);

			up0().forEach(r -> {
				if (isUpdR(r)) {
					if (!isNull(r.dlv_slip_no())) {
						_upDlvSlipL.add(r);
					}
					else if (!isNull(r.trn_typ())) {
						if (!isNull(r.dlv_slip_act_no())
							&& !r.dlv_slip_act_no_upd_flg()) {
							_upActL.add(r);
						}
						else if (!isNull(r.dlv_slip_inst_no())) {
							_upInstL.add(r);
						}
					}
				}
			});
		}

		/**
		 * いずれかの更新フラグが立っているか
		 */
		protected boolean isUpdR(ShipRprt_Upd02_HdrR r) {
			return r.slip_prnt_upd_flg() || r.sls_prnt_upd_flg() || r.dlv_slip_act_no_upd_flg();
		}

		/**
		 * 納品伝票をロックする
		 */
		protected void lockDlvSlip() {
			if (!isNull(_upDlvSlipL)) {
				if (!isNull(_upDlvSlipL.get(0).dlv_slip_seq())) {
					lockDlvSlip(
						_upDlvSlipL,
						new String[]{ShipRprt_Upd02_HdrR.$dlv_slip_no, ShipRprt_Upd02_HdrR.$dlv_slip_seq},
						"1");
				}
				else {
					lockDlvSlip(
						_upDlvSlipL,
						new String[]{ShipRprt_Upd02_HdrR.$dlv_slip_no},
						"2");
				}
			}

			lockDlvSlip(
				_upActL,
				new String[]{ShipRprt_Upd02_HdrR.$trn_typ, ShipRprt_Upd02_HdrR.$dlv_slip_act_no},
				"3");

			lockDlvSlip(
				_upInstL,
				new String[]{ShipRprt_Upd02_HdrR.$trn_typ, ShipRprt_Upd02_HdrR.$dlv_slip_inst_no},
				"4");
		}

		/**
		 * 納品伝票をロックする
		 */
		protected void lockDlvSlip(
			MCList<ShipRprt_Upd02_HdrR> updL, String[] key, String where) {

			if (updL.isEmpty()) {
				return;
			}
			updL.sort(key);
			
			MCList<MST_DLV_SLIP_R> dbc = MCList.create(MST_DLV_SLIP_R.class);
			MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MST_DLV_SLIP_R S1W = MST_DLV_SLIP_R.create("W");
			dbc_bldr.setSelect(
					t.dlv_slip_no,
					t.dlv_slip_seq,
					t.trn_typ,
					t.dlv_slip_inst_no,
					t.dlv_slip_act_no,
					t.slip_prnt_flg,
					t.sls_prnt_flg
			);
			
			if (isSame(where, "1")) {
				dbc_bldr.setWhere(t.dlv_slip_no.eq(bind("dlv_slip_no"))
						.and(t.dlv_slip_seq.eq(bind("dlv_slip_seq"))));
			}
			else if (isSame(where, "2")) {
				dbc_bldr.setWhere(t.dlv_slip_no.eq(bind("dlv_slip_no")).and(
						bracket(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								.or(t.dlv_slip_seq.eq(subQuery()
										.select(max(S1W.dlv_slip_seq)).from(S1W)
										.where(S1W.dlv_slip_no.eq(t.dlv_slip_no)
												.and(S1W.slip_sts_typ.eq(value(
														MAC_SLIP_STS_TYP.CAN.value())))
												.and(S1W.slip_prnt_flg
														.eq(value(true))))))));
			}
			else if (isSame(where, "3")) {
				dbc_bldr.setWhere(t.trn_typ.eq(bind("trn_typ"))
						.and(t.dlv_slip_act_no.eq(bind("dlv_slip_act_no"))));
			}
			else if (isSame(where, "4")) {
				dbc_bldr.setWhere(t.trn_typ.eq(bind("trn_typ"))
						.and(t.dlv_slip_inst_no.eq(bind("dlv_slip_inst_no"))));
			}
			dbSelectForUpdate("MSBEL5550_MST_DLV_SLIP_S01", dbc, dbc_bldr, updL);

			// 更新フラグがオフの項目を対象にDBから値を補完する
			cmplPrntFlg(updL, dbc, dbc.createIndex(key));
		}

		/**
		 * 更新フラグがオフの項目にDBの値を補完する
		 */
		protected void cmplPrntFlg(
			MCList<ShipRprt_Upd02_HdrR> updL, MCList<MST_DLV_SLIP_R> dbc, MCIndexKey idx) {

			updL.forEach(r -> {
				dbc.subList(idx, r.toArray(idx.getKeys())).forEach(dbR -> {
					if (r.dlv_slip_act_no_upd_flg()) {
						dbR.dlv_slip_act_no(r.dlv_slip_act_no());
					}
					if (r.slip_prnt_upd_flg()) {
						dbR.slip_prnt_flg(r.slip_prnt_flg());
					}
					if (r.sls_prnt_upd_flg()) {
						dbR.sls_prnt_flg(r.sls_prnt_flg());
					}
					_updL.add(dbR);
				});
			});
		}

		/**
		 * 納品伝票を更新する
		 */
		protected void updDlvSlip() {
			MST_DLV_SLIP_R dbc = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.setSet(dbc.dlv_slip_act_no);
			builder.addSet(dbc.slip_prnt_flg);
			builder.addSet(dbc.sls_prnt_flg);
			dbUpdateKey("MSBEL5550_MST_DLV_SLIP_U03", _updL, builder);
		}
	}
	/**
	 * ShipRprt_Upd03オペレーション.<p>
	 *
	 * 仕入直送の納品伝票・明細トランザクションを作成する<br>
	 */
	public class ShipRprt_Upd03 extends MSBEL_ShipRprtPrntService_MC_A.ShipRprt_Upd03 {
		
		protected String DLV_SLIP_NO = MST_PURC_DLV_SLIP_D_R.$purc_ddlv_dlv_slip_no;
		protected String DLV_SLIP_D_NO = MST_PURC_DLV_SLIP_D_R.$purc_ddlv_dlv_slip_d_no;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			initCache();
			callShipRprtUpd01();
			setDown();
		}
		
		/**
		 * トランザクションをキャッシュする
		 */
		protected void initCache() {
			initArrSchdCache();
			initShipSchdCache();
			initSloCache();
			initSloDCache();
			initShipAllocStsCache();
			initDlvSlipCache();
			initSlsActCache();
		}
		
		/**
		 * 納品伝票を作成する
		 */
		protected void callShipRprtUpd01() {
			MCList<ShipRprt_Upd03_HdrR> delL = MCList.create(ShipRprt_Upd03_HdrR.class);
			MCList<ShipRprt_Upd03_HdrR> updL = MCList.create(ShipRprt_Upd03_HdrR.class);
			up0().forEach(r -> {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					delL.add(r);
				}
				else {
					updL.add(r);
				}
			});
			
			MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o = MSBEL_ShipRprtPrntService.crtShipRprt_Upd01();
			setShipRprtDel(delL, o);
			setShipRprtUpd(updL, o);
			
			if (!o.up0().isEmpty()) {
				o.up2().bndl_prnt_flg(up0().get(0).bndl_prnt_flg());
				o.exec();
				
				for (ShipRprt_Upd01_DtlR downR : o.down0()) {
					ShipRprt_Upd03_HdrR up0R = getUp0R(downR.dtl_uniq_no());
					if (!isNull(up0R)) {
						up0R.dlv_slip_no(downR.dlv_slip_no());
						up0R.dlv_slip_seq(downR.dlv_slip_seq());
						up0R.dlv_slip_d_no(downR.dlv_slip_d_no());
						if (!downR.upded_flg() && !isSame(downR.dlv_slip_rev(), MCNumber.ONE)) {
							up0R.dlv_slip_rev(downR.dlv_slip_rev().subtract(MCNumber.ONE));
						}
						else {
							up0R.dlv_slip_rev(downR.dlv_slip_rev());
						}
					}
				}
			}
		}
		protected void setShipRprtDel(MCList<ShipRprt_Upd03_HdrR> up0L, MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o) {
			int pegNo = getMaxPegNo(o);
			for (ShipRprt_Upd03_HdrR up0R : up0L) {
				for (MST_DLV_SLIP_R dlvSlipR: getBfrDlvSlipL(up0R.po_no())) {
					ShipRprt_Upd01_HdrR hdrR = o.up0().add();
					hdrR.hdr_peg_no(++pegNo);
					hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					hdrR.dlv_slip_prnt_flg(up0R.dlv_slip_prnt_flg());
					hdrR.dlv_slip_no(dlvSlipR.dlv_slip_no());
					hdrR.setAttributes(up0R);
				}
			}
		}
		protected void setShipRprtUpd(MCList<ShipRprt_Upd03_HdrR> up0L, MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o) {
			int pegNo = getMaxPegNo(o);
			// _shipSchdLに削除分は含まれていない
			for (MCList<MST_SHIP_SCHD_R> ssL : groupList(up0L)) {
				MST_SHIP_SCHD_R ssR = ssL.get(0);
				
				ShipRprt_Upd01_HdrR hdrR = ShipRprt_Upd01_HdrR.create();
				copy(hdrR, ssR, createMap_ShipRprt_Upd01_HdrR_MST_SHIP_SCHD_R());
				
				MCList<ShipRprt_Upd01_DtlR> dtlL = MCList.create(ShipRprt_Upd01_DtlR.class);
				addAll(dtlL, ssL, hdrR, createMap_ShipRprt_Upd01_DtlR_MST_SHIP_SCHD_R());
				
				hdrR.hdr_peg_no(++pegNo);
				dtlL.forEach(r -> r.hdr_peg_no(hdrR.hdr_peg_no()));
				
				o.up0().add(hdrR);
				o.up1().addAll(dtlL);
			}
		}
		protected int getMaxPegNo(MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o) {
			MCNumber n = (MCNumber)o.up0().max(ShipRprt_Upd01_HdrR.$hdr_peg_no);
			return isNull(n) ? 0 : n.intValue();
		}
		
		/**
		 * 上り電文の順番を意識したグループリストを取得する
		 */
		protected MCList<MST_SHIP_SCHD_R>[] groupList(MCList<ShipRprt_Upd03_HdrR> up0L) {
			MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			addShipSchdCols(shipSchdL);
			up0L.forEach(r -> {
				MST_SHIP_SCHD_R ssR = getShipSchdR(r.ship_schd_no());
				if (!isNull(ssR) && ssR.sls_qty().isZero()) {
					shipSchdL.add(ssR);
				}
			});
			checkDlvSlipNo(shipSchdL);
			
			MCList<MST_SHIP_SCHD_R>[] arr = shipSchdL.groupList(getGroupKey());
			
			// 上り電文の順番を優先に並び替える
			for (int i=0; i<arr.length; i++) {
				arr[i].sort(ShipRprt_Upd03_HdrR.$peg_no);
			}
			Arrays.sort(arr, new Comparator<MCList<MST_SHIP_SCHD_R>>() {
				public int compare(MCList<MST_SHIP_SCHD_R> o1, MCList<MST_SHIP_SCHD_R> o2) {
					MCNumber n1 = o1.get(0).getNumber(ShipRprt_Upd03_HdrR.$peg_no);
					MCNumber n2 = o2.get(0).getNumber(ShipRprt_Upd03_HdrR.$peg_no);
					return n1.compareTo(n2);
				}
			});
			
			return arr;
		}
		
		/**
		 * 発注ごとに紐付く予定に売上が存在するかチェックする
		 */
		protected void checkDlvSlipNo(MCList<MST_SHIP_SCHD_R> shipSchdL) {
			for (MCList<MST_SHIP_SCHD_R> gl : shipSchdL.groupList(ShipRprt_Upd03_HdrR.$po_no)) {
				// 発注ごとに売上済みの明細があるか
				if (existActInPo(gl.get(0).getStringNE(ShipRprt_Upd03_HdrR.$po_no))) {
					// ある場合は納品書ＮＯごとに出荷帳票発行サービスを実行する
					// ただし、未売上の予定に設定されている納品書ＮＯが引継済みの場合は、発注ＮＯごとに実行し、かつ発番する
					for (MST_SHIP_SCHD_R ssR : gl) {
						if (!canTrnsfrDlvSlipNo(ssR.getStringNE(DLV_SLIP_NO)))  {
							ssR.setStringNE(DLV_SLIP_NO, null);
						}
					}
				}
				else {
					// ない場合は発注ＮＯごとに実行する⇒グルーピングのキーに含めないのでクリアする
					gl.setStringNE(DLV_SLIP_NO, null);
				}
			}
		}
		/**
		 * 納品書ＮＯを引き継げるか
		 */
		protected boolean canTrnsfrDlvSlipNo(String dlvSlipNo) {
			if (isNull(dlvSlipNo)
				|| isNull(getSlsActR(dlvSlipNo))) {
				return true;
			}
			return false;
		}
		
		/**
		 * 納品伝票ヘッダのグループキー
		 */
		protected String[] getGroupKey() {
			return new String[]{
					MST_SLO_R.$slo_no,
					MST_PO_R.$po_no,
					MST_SHIP_SCHD_R.$ship_schd_tm,
					MST_SHIP_SCHD_R.$dlv_schd_tm,
					MST_SHIP_SCHD_R.$dlv_cd,
					MST_SHIP_SCHD_R.$dlv_nm,
					MST_SHIP_SCHD_R.$dlv_zip_cd,
					MST_SHIP_SCHD_R.$dlv_addr1,
					MST_SHIP_SCHD_R.$dlv_addr2,
					MST_SHIP_SCHD_R.$dlv_addr3,
					MST_SHIP_SCHD_R.$dlv_addr4,
					MST_SHIP_SCHD_R.$dlv_cntct_dpt,
					MST_SHIP_SCHD_R.$dlv_cntct_psn,
					MST_SHIP_SCHD_R.$dlv_tel,
					MST_SHIP_SCHD_R.$dlv_fax,
					MST_SHIP_SCHD_R.$dlv_sundry_flg,
					MST_SHIP_SCHD_R.$ship_fr_lg_grp_cd,
					MST_SHIP_SCHD_R.$wg_cd,
					DLV_SLIP_NO
			};
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		/**
		 * 出荷予定に対応する上り電文を取得する
		 */
		protected MCIndexKey _up0Idx;
		protected ShipRprt_Upd03_HdrR getUp0R(String shipSchdNo) {
			if (_up0Idx == null) {
				_up0Idx = up0().createIndex(ShipRprt_Upd03_HdrR.$ship_schd_no);
			}
			return up0().getFirst(_up0Idx, shipSchdNo);
		}
		
		/**
		 * 出荷予定キャッシュ
		 */
		protected MCList<MST_SHIP_SCHD_R> _shipSchdL;
		protected MCIndexKey _shipSchdIdx;
		protected MCIndexKey _shipSchdPoIdx;
		protected void initShipSchdCache() {
			MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
			MST_SHIP_PR_R t2 = MST_SHIP_PR_R.create("T2");
			MST_SLO_D_R t3 = MST_SLO_D_R.create("T3");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			editShipSchdSelect(bldr, t1, t2, t3);
			bldr.addInnerJoin(t2, t2.ship_pr_no.eq(t1.ship_pr_no));
			bldr.addInnerJoin(t3, t3.slo_d_no.eq(t2.slo_d_no));
			bldr.setWhere(t1.ship_schd_no.eq(bind("ship_schd_no")));
			bldr.addConstWhereWithAnd(t1.abort_flg.eq(value(false)));
			
			_shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			addShipSchdCols(_shipSchdL);
			
			MCList<ShipRprt_Upd03_HdrR> bindL = up0().subList(r -> !isNull(r.ship_schd_no()));
			dbSelect("MSBEL5550_MST_SHIP_SCHD_S01", _shipSchdL, bldr, bindL);
			_shipSchdIdx = _shipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
			
			for (ShipRprt_Upd03_HdrR r : bindL) {
				MST_SHIP_SCHD_R ssR = getShipSchdR(r.ship_schd_no());
				if (!isNull(ssR)) {
					ssR.setNumberNE(ShipRprt_Upd03_HdrR.$peg_no, r.peg_no());
					ssR.setStringNE(ShipRprt_Upd03_HdrR.$po_no, r.po_no());
					MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
					if (!isNull(asR)) {
						// 納品伝票ヘッダの分割用に設定
						ssR.setStringNE(DLV_SLIP_NO, asR.getStringNE(DLV_SLIP_NO));
					}
				
					r.slo_no(ssR.getString(MST_SLO_R.$slo_no));
					r.slo_d_no(ssR.getString(MST_SLO_D_R.$slo_d_no));
				}
			}
			
			_shipSchdPoIdx = _shipSchdL.createIndex(ShipRprt_Upd03_HdrR.$po_no);
		}
		protected void addShipSchdCols(MCList<MST_SHIP_SCHD_R> lst) {
			lst.addStringColumn(MST_SLO_R.$slo_no);
			lst.addStringColumn(MST_SLO_D_R.$slo_d_no);
			lst.addStringColumn(DLV_SLIP_NO);
			lst.addNumberColumn(ShipRprt_Upd03_HdrR.$peg_no);
			lst.addStringColumn(ShipRprt_Upd03_HdrR.$po_no);
		}
		protected void editShipSchdSelect(
				MCQueryApiBuilder bldr,
				MST_SHIP_SCHD_R t1, MST_SHIP_PR_R t2, MST_SLO_D_R t3) {
			bldr.removeSelect(
				t1.dlv_cd,
				t1.dlv_nm,
				t1.dlv_zip_cd,
				t1.dlv_addr1,
				t1.dlv_addr2,
				t1.dlv_addr3,
				t1.dlv_addr4,
				t1.dlv_cntct_dpt,
				t1.dlv_cntct_psn,
				t1.dlv_tel,
				t1.dlv_fax,
				t1.dlv_sundry_flg
			);
			bldr.addSelect(
				decode(t1.dlv_cd, value((String)null), t2.dlv_id_cd, t1.dlv_cd).as("dlv_cd"),
				decode(t1.dlv_cd, value((String)null), t2.dlv_id_nm, t1.dlv_nm).as("dlv_nm"),
				decode(t1.dlv_cd, value((String)null), t2.dlv_zip_cd, t1.dlv_zip_cd).as("dlv_zip_cd"),
				decode(t1.dlv_cd, value((String)null), t2.dlv_addr1, t1.dlv_addr1).as("dlv_addr1"),
				decode(t1.dlv_cd, value((String)null), t2.dlv_addr2, t1.dlv_addr2).as("dlv_addr2"),
				decode(t1.dlv_cd, value((String)null), t2.dlv_addr3, t1.dlv_addr3).as("dlv_addr3"),
				decode(t1.dlv_cd, value((String)null), t2.dlv_addr4, t1.dlv_addr4).as("dlv_addr4"),
				decode(t1.dlv_cd, value((String)null), t2.dlv_cntct_dpt, t1.dlv_cntct_dpt).as("dlv_cntct_dpt"),
				decode(t1.dlv_cd, value((String)null), t2.dlv_cntct_psn, t1.dlv_cntct_psn).as("dlv_cntct_psn"),
				decode(t1.dlv_cd, value((String)null), t2.dlv_tel, t1.dlv_tel).as("dlv_tel"),
				decode(t1.dlv_cd, value((String)null), t2.dlv_fax, t1.dlv_fax).as("dlv_fax"),
				decode(t1.dlv_cd, value((String)null), t2.dlv_sundry_flg, t1.dlv_sundry_flg).as("dlv_sundry_flg")
			);
			bldr.addSelect(t2.slo_d_no, t3.slo_no);
		}
		protected MST_SHIP_SCHD_R getShipSchdR(String shipSchdNo) {
			return _shipSchdL.getFirst(_shipSchdIdx, shipSchdNo);
		}
		protected boolean existActInPo(String poNo) {
			for (MST_SHIP_SCHD_R r : _shipSchdL.subList(_shipSchdPoIdx, poNo)) {
				if (r.sls_qty().isPositive()) {
					return true;
				}
			}
			return false;
		}
		
		/**
		 * 受注ヘッダキャッシュ
		 */
		protected FXUCL_MCDbcCache<MST_SLO_R> _sloL;
		protected void initSloCache() {
			MST_SLO_R t1 = MST_SLO_R.create("T1");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			_sloL = new FXUCL_MCDbcCache<>(
				bldr, up0().groupBy(ShipRprt_Upd03_HdrR.$slo_no), ShipRprt_Upd03_HdrR.$slo_no
			);
		}
		protected MST_SLO_R getSloR(String sloNo) {
			return _sloL.get(sloNo);
		}
		
		/**
		 * 受注明細キャッシュ
		 */
		protected FXUCL_MCDbcCache<MST_SLO_D_R> _sloDL;
		protected void initSloDCache() {
			MST_SLO_D_R t1 = MST_SLO_D_R.create("T1");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			_sloDL = new FXUCL_MCDbcCache<>(
				bldr, up0().groupBy(ShipRprt_Upd03_HdrR.$slo_d_no), ShipRprt_Upd03_HdrR.$slo_d_no
			);
		}
		protected MST_SLO_D_R getSloDR(String sloDNo) {
			return _sloDL.get(sloDNo);
		}
		
		/**
		 * 出荷引当状況キャッシュ
		 */
		protected MCList<MST_SHIP_ALLOC_STS_R> _allocStsL;
		protected MCIndexKey _stsIdx = null;
		protected void initShipAllocStsCache() {
			MST_SHIP_ALLOC_STS_R t1 = MST_SHIP_ALLOC_STS_R.create("T1");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setWhere(t1.ship_schd_no.eq(bind("ship_schd_no")));
			
			_allocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			dbSelect("MSBEL5550_MST_SHIP_ALLOC_STS_S02", _allocStsL, bldr, up0());
			
			_stsIdx = _allocStsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_schd_no);
		}
		protected MST_SHIP_ALLOC_STS_R getShipAllocStsR(String shipSchdNo) {
			return _allocStsL.getFirst(_stsIdx, shipSchdNo);
		}
		
		/**
		 * 入荷予定キャッシュ
		 */
		protected FXUCL_MCDbcCache<MST_ARR_SCHD_R> _arrSchdL;
		protected void initArrSchdCache() {
			MST_ARR_SCHD_R t1 = MST_ARR_SCHD_R.create("T1");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			MCList<MST_ARR_SCHD_R> rsltL = MCList.create(MST_ARR_SCHD_R.class);
			rsltL.addStringColumn(MST_PURC_DLV_SLIP_D_R.$purc_ddlv_dlv_slip_no);
			rsltL.addStringColumn(MST_PURC_DLV_SLIP_D_R.$purc_ddlv_dlv_slip_d_no);
			_arrSchdL = new FXUCL_MCDbcCache<>(rsltL, bldr, up0(), ShipRprt_Upd03_HdrR.$arr_schd_no);
			
			// 入荷予定に対応する仕入直送の納品書ＮＯを取得・設定する
			setDlvSlip();
		}
		protected MST_ARR_SCHD_R getArrSchdR(String arrSchdNo) {
			return _arrSchdL.get(arrSchdNo);
		}
		protected void setDlvSlip() {
			MST_ARR_SCHD_R t1 = MST_ARR_SCHD_R.create("T1");
			MST_PURC_DLV_SLIP_D_R t2 = MST_PURC_DLV_SLIP_D_R.create("T2");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setSelect(
				t1.arr_schd_no, t1.lot_no, t1.sublot_no,
				t2.dlv_slip_mng_d_seq, t2.purc_ddlv_dlv_slip_no, t2.purc_ddlv_dlv_slip_d_no
			);
			// 入荷予定には常に最新の連番が設定される
			// 仕入直送の納品書を作成する時点では、最新の連番に対応する購買納品伝票明細には仕入直送の納品書ＮＯは設定されていない
			// そのため、連番は結合条件に含めていない
			bldr.addLeftOuterJoin(t2, t2.dlv_slip_mng_d_no.eq(t1.dlv_slip_mng_d_no));
			
			MCList<MST_PURC_DLV_SLIP_D_R> rsltL = MCList.create(MST_PURC_DLV_SLIP_D_R.class);
			rsltL.addStringColumn(MST_ARR_SCHD_R.$arr_schd_no);
			dbSelectKey("MSBEL5550_MST_ARR_SCHD_S01", rsltL, bldr, up0());
			
			MCIndexKey idx = rsltL.createIndex(MST_ARR_SCHD_R.$arr_schd_no);
			for (ShipRprt_Upd03_HdrR up0R : up0()) {
				MST_ARR_SCHD_R asR = getArrSchdR(up0R.arr_schd_no());
				if (!isNull(asR)) {
					MCList<MST_PURC_DLV_SLIP_D_R> dlvSlipL =
						rsltL.subList(idx, asR.arr_schd_no())
								.subList(r -> !isNull(r.purc_ddlv_dlv_slip_no()));
					if (!dlvSlipL.isEmpty()) {
						dlvSlipL.sort(SortType.DESC, MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_d_seq);
						MST_PURC_DLV_SLIP_D_R dlvSlipR = dlvSlipL.get(0);
						asR.setStringNE(DLV_SLIP_NO, dlvSlipR.purc_ddlv_dlv_slip_no());
						asR.setStringNE(DLV_SLIP_D_NO, dlvSlipR.purc_ddlv_dlv_slip_d_no());
					}
				}
			}
		}
		
		/**
		 * 納品伝票キャッシュ<br>
		 * （更新前の状態を取得）
		 */
		protected MCList<MST_DLV_SLIP_R> _bfrUpdDlvSlipL;
		protected MCIndexKey _bfrDlvSlipIdx = null;
		protected void initDlvSlipCache() {
			MCList<ShipRprt_Upd01_HdrR> bindL = MCList.create(ShipRprt_Upd01_HdrR.class);
			up0().groupBy(ShipRprt_Upd03_HdrR.$po_no).forEach(r -> {
				ShipRprt_Upd01_HdrR bindR = bindL.add();
				bindR.trn_typ(MSC_TRN_TYP.PURC.value());
				bindR.dlv_slip_inst_no(r.po_no());
			});
			doDlvSlipCache(bindL);
			
			_bfrUpdDlvSlipL = MCList.create(MST_DLV_SLIP_R.class);
			bindL.forEach(r -> {
				_bfrUpdDlvSlipL.addAll(getDlvSlipL(r));
			});
			
			_bfrDlvSlipIdx = _bfrUpdDlvSlipL.createIndex(MST_DLV_SLIP_R.$dlv_slip_inst_no);
		}
		protected MCList<MST_DLV_SLIP_R> getBfrDlvSlipL(String poNo) {
			return _bfrUpdDlvSlipL.subList(_bfrDlvSlipIdx, poNo);
		}
		
		/**
		 * 売上実績キャッシュ
		 */
		protected MCList<MST_SLS_ACT_R> _slsActL;
		protected MCIndexKey _slsActIdx = null;
		protected void initSlsActCache() {
			MST_SLS_ACT_R t1 = MST_SLS_ACT_R.create("T1");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setWhere(t1.dlv_slip_no.eq(bind("purc_ddlv_dlv_slip_no")));
			bldr.addConstWhereWithAnd(t1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			
			MCList<MST_ARR_SCHD_R> bindL = MCList.create(MST_ARR_SCHD_R.class);
			bindL.addStringColumn(DLV_SLIP_NO);
			up0().forEach(r -> {
				bindL.add(getArrSchdR(r.arr_schd_no()));
			});
			
			_slsActL = MCList.create(MST_SLS_ACT_R.class);
			dbSelect("MSBEL5550_MST_SLS_ACT_S02", _slsActL, bldr, bindL.groupBy(DLV_SLIP_NO));
			
			_slsActIdx = _slsActL.createIndex(MST_SLS_ACT_R.$dlv_slip_no);
		}
		protected MST_SLS_ACT_R getSlsActR(String dlvSlipNo) {
			return _slsActL.getFirst(_slsActIdx, dlvSlipNo);
		}
		
		
		protected Map_ShipRprt_Upd01_HdrR_MST_SHIP_SCHD_R
				<ShipRprt_Upd01_HdrR,MST_SHIP_SCHD_R> createMap_ShipRprt_Upd01_HdrR_MST_SHIP_SCHD_R() {
			return new Map_ShipRprt_Upd01_HdrR_MST_SHIP_SCHD_R<ShipRprt_Upd01_HdrR, MST_SHIP_SCHD_R>();
		}
		public class Map_ShipRprt_Upd01_HdrR_MST_SHIP_SCHD_R
				<D extends ShipRprt_Upd01_HdrR, S extends MST_SHIP_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipRprt_Upd01_HdrR.$ship_tm, MST_SHIP_SCHD_R.$ship_schd_tm);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_tm, MST_SHIP_SCHD_R.$dlv_schd_tm);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_id_cd, MST_SHIP_SCHD_R.$dlv_cd);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_id_nm, MST_SHIP_SCHD_R.$dlv_nm);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_zip_cd, MST_SHIP_SCHD_R.$dlv_zip_cd);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_addr1, MST_SHIP_SCHD_R.$dlv_addr1);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_addr2, MST_SHIP_SCHD_R.$dlv_addr2);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_addr3, MST_SHIP_SCHD_R.$dlv_addr3);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_addr4, MST_SHIP_SCHD_R.$dlv_addr4);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_cntct_dpt, MST_SHIP_SCHD_R.$dlv_cntct_dpt);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_cntct_psn, MST_SHIP_SCHD_R.$dlv_cntct_psn);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_tel, MST_SHIP_SCHD_R.$dlv_tel);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_fax, MST_SHIP_SCHD_R.$dlv_fax);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_sundry_flg, MST_SHIP_SCHD_R.$dlv_sundry_flg);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$ship_fr_lg_grp_cd, MST_SHIP_SCHD_R.$ship_fr_lg_grp_cd);
				addColumnPathMap(ShipRprt_Upd01_HdrR.$wg_cd, MST_SHIP_SCHD_R.$wg_cd);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				ShipRprt_Upd03_HdrR up0R = getUp0R(src.ship_schd_no());
				MST_SLO_R sloR = getSloR(src.getStringNE(MST_SLO_R.$slo_no));
				
				dest.split_flg(true);
				if (existActInPo(up0R.po_no())) {
					String dlvSlipNo = src.getStringNE(DLV_SLIP_NO);
					if (isNull(dlvSlipNo)) {
						dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					}
					else {
						dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						dest.dlv_slip_no(dlvSlipNo);
					}
				}
				else {
					dest.data_crud_typ(up0R.data_crud_typ());
				}
				dest.dlv_slip_prnt_flg(up0R.dlv_slip_prnt_flg());
				dest.slo_no(sloR.slo_no());
				dest.trn_typ(MSC_TRN_TYP.PURC.value());
				dest.dlv_slip_inst_no(up0R.po_no());
				dest.dlv_slip_act_no(null);
				dest.dpt_cd(sloR.sls_dpt_cd());
				dest.usr_cd(sloR.sls_usr_cd());
				dest.trd_cd(sloR.trd_cd());
				dest.trd_ptn_typ(sloR.trd_ptn_typ());
				dest.cst_po_no(sloR.cst_po_no());
				dest.pri_prnt_flg(false);		// 受注に関係なく仕入直送の納品書は価格印字なし
				dest.trd_cur_cd(sloR.trd_cur_cd());
				dest.xrate(sloR.xrate());
				dest.ptax_xrate(sloR.ptax_xrate());
				dest.bp_cd(sloR.cst_cd());
				dest.dlv_id_typ(MSC_DLV_ID_TYP.DLV.value());
				dest.trd_rmrks(sloR.trd_rmrks());
				dest.sls_basis_typ(sloR.sls_basis_typ());
			}
		}
		
		protected Map_ShipRprt_Upd01_DtlR_MST_SHIP_SCHD_R
				<ShipRprt_Upd01_DtlR,MST_SHIP_SCHD_R, ShipRprt_Upd01_HdrR>
				createMap_ShipRprt_Upd01_DtlR_MST_SHIP_SCHD_R() {
			return new Map_ShipRprt_Upd01_DtlR_MST_SHIP_SCHD_R
					<ShipRprt_Upd01_DtlR, MST_SHIP_SCHD_R, ShipRprt_Upd01_HdrR>();
		}
		public class Map_ShipRprt_Upd01_DtlR_MST_SHIP_SCHD_R
				<D extends ShipRprt_Upd01_DtlR, S extends MST_SHIP_SCHD_R, W extends ShipRprt_Upd01_HdrR>
				extends MAUCC_RowMapperWith<D,S,W>{
			protected ShipRprt_Upd01_HdrR _hdrR;
			@Override
			public void setWith(W hdrR) {
				_hdrR = hdrR;
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_inst_rcpt_no, MST_SHIP_SCHD_R.$dlv_inst_rcpt_no);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$ship_schd_no, MST_SHIP_SCHD_R.$ship_schd_no);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_cd, MST_SHIP_SCHD_R.$itm_cd);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub1, MST_SHIP_SCHD_R.$itm_sub1);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub2, MST_SHIP_SCHD_R.$itm_sub2);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub3, MST_SHIP_SCHD_R.$itm_sub3);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_nm, MST_SHIP_SCHD_R.$itm_nm);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$sundry_itm_flg, MST_SHIP_SCHD_R.$sundry_itm_flg);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$sno1, MST_SHIP_SCHD_R.$sno1);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$sno2, MST_SHIP_SCHD_R.$sno2);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$sno3, MST_SHIP_SCHD_R.$sno3);
				addColumnPathMap(ShipRprt_Upd01_DtlR.$sno4, MST_SHIP_SCHD_R.$sno4);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				ShipRprt_Upd03_HdrR up0R = getUp0R(src.ship_schd_no());
				MST_SLO_D_R sloDR = getSloDR(src.getStringNE(MST_SLO_D_R.$slo_d_no));
				MST_SHIP_ALLOC_STS_R stsR = getShipAllocStsR(src.ship_schd_no());
				MST_ARR_SCHD_R asR = getArrSchdR(up0R.arr_schd_no());
				
				dest.dtl_uniq_no(src.ship_schd_no());	// 仕入直送の場合、出荷予定と出荷引当状況は1対1
				if (MAC_DATA_CRUD_TYP.isCRT(_hdrR.data_crud_typ())) {
					dest.dlv_slip_no(null);
					dest.dlv_slip_d_no(null);
				}
				else if (canTrnsfrDlvSlipNo(asR.getStringNE(DLV_SLIP_NO))) {
					dest.dlv_slip_no(asR.getStringNE(DLV_SLIP_NO));
					dest.dlv_slip_d_no(asR.getStringNE(DLV_SLIP_D_NO));
				}
				dest.lot_no(asR.lot_no());
				dest.sublot_no(asR.sublot_no());
				dest.trd_unit_cd(stsR.pack_unit_cd());
				dest.trd_unit_qty(stsR.pack_unit_qty());
				dest.base_unit_cd(stsR.base_unit_cd());
				dest.base_unit_qty(stsR.base_unit_qty());
				dest.rsn_cd(sloDR.sls_rsn_cd());
				dest.bd_dpt_cd(sloDR.bd_dpt_cd());
				dest.cst_po_d_no(sloDR.cst_po_d_no());
				dest.cst_itm_cd(sloDR.cst_itm_cd());
				dest.cst_itm_nm(sloDR.cst_itm_nm());
				dest.slo_d_no(sloDR.slo_d_no());
				dest.trd_d_rmrks(sloDR.trd_d_rmrks());
			}
		}
	}
	/**
	 * ShipRprt_Del01オペレーション.<p>
	 *
	 * 納品伝票・明細トランザクションを削除する<br>
	 */
	public class ShipRprt_Del01 extends MSBEL_ShipRprtPrntService_MC_A.ShipRprt_Del01 {
		/**
		 * 削除対象の納品伝票
		 */
		protected MCList<MST_DLV_SLIP_R> _dlvSlipL = null;

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			lockDlvSlip();
			delDlvSlip();
			delDlvSlipD();
		}

		/**
		 * 納品伝票をロックする
		 */
		protected void lockDlvSlip() {
			up0().sort(ShipRprt_Del01_HdrR.$dlv_slip_no);

			_dlvSlipL = MCList.create(MST_DLV_SLIP_R.class);
			MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder dlvSlipL_bldr = MCQueryApiBuilder.create(t);
			dlvSlipL_bldr.setSelect(t.dlv_slip_no, t.dlv_slip_seq);
			dlvSlipL_bldr.setWhere(t.dlv_slip_no.eq(bind("dlv_slip_no")));
			dbSelectForUpdate("MSBEL5550_MST_DLV_SLIP_S02", _dlvSlipL, dlvSlipL_bldr, up0());
		}

		/**
		 * 納品伝票を削除(物理削除)する
		 */
		protected void delDlvSlip() {
			MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
			execDbDeleteKey("MSBEL5550_MST_DLV_SLIP_D02", t, _dlvSlipL);
		}

		/**
		 * 納品伝票明細を削除(物理削除)する
		 */
		protected void delDlvSlipD() {
			MST_DLV_SLIP_D_R t = MST_DLV_SLIP_D_R.create("T");
			execDbDelete("MSBEL5550_MST_DLV_SLIP_D_D02", t, t.dlv_slip_no.eq(bind("dlv_slip_no"))
					.and(t.dlv_slip_seq.eq(bind("dlv_slip_seq"))), _dlvSlipL);
		}
	}

	/**
	 * ShipRprt_Prnt01オペレーション.<p>
	 *
	 * 納品書を発行する<br>
	 */
	public class ShipRprt_Prnt01 extends MSBEL_ShipRprtPrntService_MC_A.ShipRprt_Prnt01 {

		/**
		 * 発行条件
		 */
		protected MCList<ShipRprt_Prnt01_HdrR> _slipL = null, _stkxfrslipL = null, _slipCanL = null;

		/**
		 * 納品書（納品伝票NOごと）
		 */
		protected DlvSlipBySlip _slipSlip = null;
		/**
		 * 在庫振替伝票
		 */
		protected StkXfrSlip _stkxfrSlip = null;
		/**
		 * 出荷案内書（納品伝票NOごと）
		 */
		protected ShipAdvBySlip _slipAdv = null;
		protected MCList<BpUtil_Sprt01_DtlR> _bpUtil = MCList.create(BpUtil_Sprt01_DtlR.class);
		protected MCIndexKey _bpUtilkey;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			preProc();
			editUp();
			splitCnd();
			initPrnt();
			execPrntByStkxfrslip();
			execPrntBySlip();
			updPrntFlg();
			setDown();
		}

		/**
		 * 前処理を実行する
		 */
		protected void preProc() {
			_slipL = MCList.create(ShipRprt_Prnt01_HdrR.class);
			_slipCanL = MCList.create(ShipRprt_Prnt01_HdrR.class);
			_stkxfrslipL = MCList.create(ShipRprt_Prnt01_HdrR.class);
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			// 未設定なら採番する
			if (!up0().isEmpty() && isNull(up0().get(0).peg_no())) {
				setPegNo(up0());
			}
			up0().forEach(r -> {
				if (r.sls_prnt_flg()) {
					r.dlv_slip_prnt_flg(true);
				}
			});
		}

		/**
		 * 上り電文を発行条件ごとに分割する
		 */
		protected void splitCnd() {
			up0().forEach(r -> {
				if ((MSC_TRN_TYP.isACXFR(r.trn_typ())
						 || MSC_TRN_TYP.isSTK_XFR(r.trn_typ())) && !isNull(r.dlv_slip_act_no())) {
					_stkxfrslipL.add(r);
				}
				if (!isNull(r.dlv_slip_no()) && !isNull(r.dlv_slip_seq())) {
					_slipL.add(r);
					if (r.inc_can_flg()) {
						_slipCanL.add(r);
					}
				}
			});
		}

		/**
		 * 帳票発行処理処理
		 */
		protected void initPrnt() {
			// 実績NOごと
			if(!_stkxfrslipL.isEmpty()) {
				// 在庫振替伝票
				_stkxfrSlip = new StkXfrSlip(_stkxfrslipL.subList(r -> r.dlv_slip_prnt_flg()));
			}
			// 納品伝票ごと
			if (!_slipL.isEmpty()) {
				// 出荷案内書
				_slipAdv = new ShipAdvBySlip(_slipL.subList(r -> r.ship_adv_prnt_flg()));
				
				// 納品伝票
				MCList<ShipRprt_Prnt01_HdrR> slipL = MCList.create(ShipRprt_Prnt01_HdrR.class);
				slipL.addAll(selectDlvSlipCanL(_slipCanL.subList(r -> r.dlv_slip_prnt_flg())));
				slipL.addAll(_slipL.subList(r -> r.dlv_slip_prnt_flg()));
				_slipSlip = new DlvSlipBySlip(slipL);
			}
		}
		protected MCList<ShipRprt_Prnt01_HdrR> selectDlvSlipL(MCList<ShipRprt_Prnt01_HdrR> up0L) {
			
			MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.dlv_slip_no, t.dlv_slip_seq, t.slip_sts_typ);
			FXUCL_MCDbcCache<MST_DLV_SLIP_R> cache =
				new FXUCL_MCDbcCache<>(	
				bldr, up0L,
				ShipRprt_Prnt01_HdrR.$dlv_slip_no, ShipRprt_Prnt01_HdrR.$dlv_slip_seq
			);
			
			MCList<ShipRprt_Prnt01_HdrR> rsltL = MCList.create(ShipRprt_Prnt01_HdrR.class);
			for (ShipRprt_Prnt01_HdrR up0R : up0L) {
				MST_DLV_SLIP_R slipR = cache.get(up0R.dlv_slip_no(), up0R.dlv_slip_seq());
				if (up0R.inc_can_flg()
					&& MAC_SLIP_STS_TYP.isCAN(slipR.slip_sts_typ())) {
					// 取消分はselectDlvSlipCanLで取得するのでここでは対象外にする
				}
				else {
					rsltL.add(up0R);
				}
			}
			return rsltL;
		}
		protected MCList<ShipRprt_Prnt01_HdrR> selectDlvSlipCanL(MCList<ShipRprt_Prnt01_HdrR> up0L) {
			return selectDlvSlipCanL(up0L, true);
		}
		public MCList<ShipRprt_Prnt01_HdrR> selectDlvSlipCanL(MCList<ShipRprt_Prnt01_HdrR> up0L, boolean neqCan) {
			if (up0L.isEmpty()) {
				return null;
			}
			
			// キーワークに登録した納品書NO＋連番をもとに対応した取消分を取得
			// 取消分を取得するのは「新規」の伝票のみ
			MSW_DLV_SLIP_KEY_R w = MSW_DLV_SLIP_KEY_R.create("W");
			MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
			execDbWkDelete("MSBEL5550_MSW_DLV_SLIP_KEY_D04", w);
			MCInsert q = sql("MSBEL5550_MSW_DLV_SLIP_KEY_I09")
				.insert(w)
				.columns(w.dlv_slip_no, w.dlv_slip_seq)
				.query(subQuery()
					.select(t.dlv_slip_no, t.dlv_slip_seq)
					.from(t)
					.where(t.dlv_slip_no.eq(bind("dlv_slip_no"))
						.and(t.dlv_slip_seq.eq(bind("dlv_slip_seq")))
						// NULL文字以外を指定することで「新規」「更新」「削除」すべて対象にする
						.and(t.slip_sts_typ.neq(value(neqCan ? MAC_SLIP_STS_TYP.CAN.value() : MAC_STR.NULL_VAL.value())))));
			q.executeBatchUpdate(up0L);
			
			MCList<MST_DLV_SLIP_R> rsltL = (new DlvSlipCache()).selectDlvSlip4();
			
			execDbWkDelete("MSBEL5550_MSW_DLV_SLIP_KEY_D05", w);
			
			MCList<ShipRprt_Prnt01_HdrR> slipCanL = MCList.create(ShipRprt_Prnt01_HdrR.class);
			for (MST_DLV_SLIP_R canR : rsltL) {
				ShipRprt_Prnt01_HdrR slipR = slipCanL.add();
				slipR.dlv_slip_no(canR.dlv_slip_no());
				slipR.dlv_slip_seq(canR.dlv_slip_seq());
				slipR.dlv_slip_prnt_flg(true);
				slipR.dlv_slip_act_no(canR.dlv_slip_act_no());	// まとめ発行に使用
			}
			return slipCanL;
		}

		/**
		 * 在庫振替伝票を発行する
		 */
		protected void execPrntByStkxfrslip() {
			if (_stkxfrslipL.isEmpty())	return;

			_stkxfrSlip.execPrnt(); 
		}
		
		/**
		 * 納品伝票に対応する各種帳票を発行する
		 */
		protected void execPrntBySlip() {
			if (_slipL.isEmpty())	return;

			if (!_slipAdv.getDtlL().isEmpty()) {
				_slipAdv.setAdvIndivPrnt(up1().bndl_prnt_flg());
				for (MCList<ShipRprt_Prnt01_HdrR> advL : _slipAdv.groupListBp()) {
					_slipAdv.execPrnt(advL);
				}
			}
			if (!_slipSlip.getDtlL().isEmpty()) {
				_slipSlip.setSlipIndivPrnt(up1().bndl_prnt_flg());
				for (MCList<ShipRprt_Prnt01_HdrR> slipL : _slipSlip.groupListBp()) {
					_slipSlip.execPrnt(slipL);
				}
			}
		}

		/**
		 * 納品伝票の各フラグを更新する
		 */
		protected void updPrntFlg() {
			MCList<DlvSlipHdrR> slipL = MCList.create(DlvSlipHdrR.class);
			MCList<StkXfrSlipHdrR> slipL2 = MCList.create(StkXfrSlipHdrR.class);
			MCList<ShipAdvHdrR> slipAdvL = MCList.create(ShipAdvHdrR.class);
			if (_slipAdv != null) {
				slipAdvL.addAll(_slipAdv.getHdrL());
			}
			
			if (_slipSlip != null) {
				slipL.addAll(_slipSlip.getHdrL());
			}
			if (_stkxfrSlip != null) {
				slipL2.addAll(_stkxfrSlip.getHdrL());
			}
			if (!slipL.isEmpty()) {
				MST_DLV_SLIP_R dbc = MST_DLV_SLIP_R.create("T");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				builder.setSet(dbc.slip_prnt_flg);
				builder.addSet(dbc.sls_prnt_flg);
				builder.setWhere(dbc.dlv_slip_no.eq(bindEx("dlv_slip_no")));
				builder.addWhereWithAnd(dbc.dlv_slip_seq.eq(bindEx("dlv_slip_seq")));
				dbUpdate("MSBEL5550_MST_DLV_SLIP_U04", slipL, builder);
			}
			if (!slipL2.isEmpty()) {
				MST_DLV_SLIP_R dbc = MST_DLV_SLIP_R.create("T");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				builder.setSet(dbc.slip_prnt_flg);
				builder.setWhere(dbc.dlv_slip_no.eq(bindEx("dlv_slip_no")));
				builder.addWhereWithAnd(dbc.dlv_slip_seq.eq(bindEx("dlv_slip_seq")));
				dbUpdate("MSBEL5550_MST_DLV_SLIP_U05", slipL2, builder);
			}
			if (!slipAdvL.isEmpty()) {
				MST_DLV_SLIP_R dbc = MST_DLV_SLIP_R.create("T");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				builder.setSet("ship_adv_prnt_flg", dbc.ship_adv_prnt_flg, value(true));
				builder.setWhere(dbc.dlv_slip_no.eq(bindEx("dlv_slip_no")));
				builder.addWhereWithAnd(dbc.dlv_slip_seq.eq(bindEx("dlv_slip_seq")));
				dbUpdate("MSBEL5550_MST_DLV_SLIP_U06", slipAdvL, builder);
			}
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * ShipRprt_Prnt02オペレーション.<p>
	 *
	 * 指図書・ピッキングリストを発行する<br>
	 */
	public class ShipRprt_Prnt02 extends MSBEL_ShipRprtPrntService_MC_A.ShipRprt_Prnt02 {

		/**
		 * 発行条件
		 */
		protected MCList<ShipRprt_Prnt02_HdrR> _xfrL = null, _shipL = null;

		/**
		 * 移動指図書
		 */
		protected XfrInst _xfrInst = null;
		/**
		 * ピッキングリスト（移動）
		 */
		protected PickLstByXfr _xfrPick = null;

		/**
		 * 出荷指図書
		 */
		protected ShipInst _shipInst = null;
		/**
		 * ピッキングリスト（出荷）
		 */
		protected PickLstByShip _shipPick = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			preProc();
			editUp();
			splitCnd();
			initPrnt();
			execPrntByXfr();
			execPrntByShip();
			setDown();
		}

		/**
		 * 前処理を実行する
		 */
		protected void preProc() {
			_xfrL = MCList.create(ShipRprt_Prnt02_HdrR.class);
			_shipL = MCList.create(ShipRprt_Prnt02_HdrR.class);
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			// 未設定なら採番する
			if (!up0().isEmpty() && isNull(up0().get(0).peg_no())) {
				setPegNo(up0());
			}
		}

		/**
		 * 発行条件を分割する
		 */
		protected void splitCnd() {
			up0().forEach(r -> {
				if (MSC_TRN_TYP.isXFR(r.trn_typ())
					&& !isNull(r.xfr_inst_no())) {
					_xfrL.add(r);
				}
				else if (MSC_TRN_TYP.isSHIP(r.trn_typ())
					&& !isNull(r.ship_inst_no())) {
					_shipL.add(r);
				}
			});
		}

		/**
		 * 帳票発行処理処理
		 */
		protected void initPrnt() {
			if (!_xfrL.isEmpty()) {
				// 移動指図
				_xfrInst = new XfrInst(_xfrL.subList(r -> r.inst_prnt_flg()));

				// ピッキングリスト
				_xfrPick = new PickLstByXfr(_xfrL.subList(r -> r.pick_prnt_flg()));
			}

			if (!_shipL.isEmpty()) {
				// 出荷指図書
				_shipInst = new ShipInst(_shipL.subList(r -> r.inst_prnt_flg()));

				// ピッキングリスト
				_shipPick = new PickLstByShip(_shipL.subList(r -> r.pick_prnt_flg()));
			}
		}

		/**
		 * 移動指図NOに対応する各種帳票を発行する
		 */
		protected void execPrntByXfr() {
			if (_xfrL.isEmpty())	return;

			if (up1().bndl_inst_prnt_flg()) {
				// まとめて帳票を発行する
				if (!_xfrInst.getDtlL().isEmpty()) {
					_xfrInst.execPrnt();
				}
			}
			else {
				// 移動指図NOごとに帳票を発行する
				for (ShipRprt_Prnt02_HdrR r : _xfrL) {
					if (r.inst_prnt_flg()) {
						_xfrInst.execPrnt(r);
					}
				}
			}
			_xfrPick.execPrnt(); 
		}

		/**
		 * 出荷指図NOに対応する各種帳票を発行する
		 */
		protected void execPrntByShip() {
			if (_shipL.isEmpty())	return;

			if (up1().bndl_inst_prnt_flg()) {
				// まとめて帳票を発行する
				if (!_shipInst.getDtlL().isEmpty()) {
					_shipInst.execPrnt();
				}
			}
			else {
				// 出荷指図NOごとに帳票を発行する
				for (ShipRprt_Prnt02_HdrR r : _shipL) {
					if (r.inst_prnt_flg()) {
						_shipInst.execPrnt(r);
					}
				}
			}
			_shipPick.execPrnt();
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}


///// 帳票関連
	/**
	 * 当サービスで扱う帳票の作成・発行を担うベースとなるクラス
	 */
	public abstract class RptBase
		<R extends MCReportSet, H extends MCRow, D extends MCRow, C extends MCRow> {
		/**
		 * 発行対象のヘッダ
		 */
		protected MCList<H> _hdrL = null;

		/**
		 * ヘッダを一意に特定する項目に対するインデックス<br>
		 * インデックスは _pegCols で生成する
		 */
		protected MCIndexKey _hdrIdx = null;

		/**
		 * 発行対象の明細
		 */
		protected MCList<D> _dtlL = null;

		/**
		 * ヘッダと明細を紐付ける項目に対するインデックス
		 * インデックスは _pegCols で生成する
		 */
		protected MCIndexKey _dtlIdx = null;

		/**
		 * 発行条件
		 */
		protected MCList<C> _cndL = null;

		/**
		 * ヘッダと明細を紐付ける項目<br>
		 * 帳票を指図NO単位に発行するなど、帳票の最小発行単位として扱う
		 */
		protected String[] _pegCols = null;
		// 納品書の宛先が自社か取引先かを識別する定数。納品書をPDFにする際のまとまりを識別するために使用する。
		// DLV_DEST_TYP_BP：納品先、DLV_DEST_TYP_PROV：支給先、DLV_DEST_TYP_CO：自社（社内の移動）
		protected static final String DLV_DEST_TYP_BP = "1";
		protected static final String DLV_DEST_TYP_PROV = "2";
		protected static final String DLV_DEST_TYP_CO = "3";
		protected static final String DLV_DEST_TYP = "dlv_dest_typ";
		protected static final String DLV_DEST_CD = "dlv_dest_cd";

		/**
		 * EDI IF制御マスタリスト
		 */
		MCList<MAM_EDI_IF_CTL_R> _ediIfCtrL = MCList.create(MAM_EDI_IF_CTL_R.class);
		
		/**
		 * コンストラクタ	
		 */
		protected RptBase(MCList<C> cndL, String[] pegCols) {
			_cndL = cndL;
			_pegCols = pegCols;
		}

		/**
		 * 初期処理
		 */
		protected void init() {
			insWk();
			srchHdr();
			srchDtl();
			crtIdx();
			chk();
			getEdiIf();
		}
		
		/**
		 * ＥＤＩ ＩＦ制御マスタを取得する。
		 */
		protected void getEdiIf() {
			MAM_EDI_IF_CTL_R t = MAM_EDI_IF_CTL_R.create("T");
			MCQueryApiBuilder ediifctrL_bldr = MCQueryApiBuilder.create(t);
			ediifctrL_bldr.setSelect(t.if_proc_typ, t.bp_cd);
			ediifctrL_bldr.setWhere(t.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value()))
					.and(value(getToday()).between(t.st_dt, t.end_dt))
					.and(t.not_onr_prov_flg.eq(value(false))));
			dbSelect("MSBGL5040_MAM_EDI_IF_CTL_S01", _ediIfCtrL, ediifctrL_bldr);
		}

		/**
		 * ワークに登録する
		 */
		protected abstract void insWk();

		/**
		 * 上り電文に対して納品伝票の存在チェックする
		 */
		protected void chk() {
		}

		/**
		 * 発行対象のヘッダを取得する
		 */
		protected void srchHdr() {
		}
	
		/**
		 * 発行対象の明細を取得する
		 */
		protected void srchDtl() {
		}

		/**
		 * ヘッダ、明細に対してインデックスを生成する
		 */
		protected void crtIdx() {
			_hdrIdx = _hdrL.createIndex(_pegCols);
			_dtlIdx = _dtlL.createIndex(_pegCols);
		}

		protected MCIndexKey _slipHdrIdx = null;
		protected String[] _slipPegCols = null;
		protected List<R> toRptSet(MCList<C> cndL) {
			List<R> arr = new ArrayList<>();
			for (C r : cndL) {
				R rptSet = toRptSet(r);
				if (rptSet != null) {
					arr.add(rptSet);
				}
			}
			return arr;
		}
		protected void execPrnt(MCList<C> cndL) {
			List<R> arr = toRptSet(cndL);
			if (arr.size() > 0) {
				R rptSet = crtRptSet();
				rptSet.setReportInfo(arr.get(0).getReportInfo());
				rptSet.setAppReportNo1(null);
				rptSet.setAppReportNo2(null);
				rptSet.setAppReportNo3(null);
				rptSet.setAppReportNo4(null);
				arr.forEach(r -> rptSet.addAll(r.getAll()));
				MCServerReportManager.request(rptSet);
			} 
		}
		
		/**
		 * 請求送信IF対象は送信処理、それ以外は印刷データの発行<br>
		 */
		protected void execPrntEx(MCList<C> cndL) {
			List<R> arr = toRptSet(cndL);

			MCIndexKey ik = _ediIfCtrL.createIndex(MAM_EDI_IF_CTL_R.$bp_cd);
			MCList<?>[] dlvSlipNoL =  cndL.groupList(Bill_Send01_HdrR.$dlv_slip_no);
			
			MCList<MST_DLV_SLIP_R> updL = MCList.create(MST_DLV_SLIP_R.class);
			MSLAL_BillSendIfService.BillSendIf_Upd01 ope = MSLAL_BillSendIfService.crtBillSendIf_Upd01();

			for (MCList<?> dlvL : dlvSlipNoL) {
				
				Boolean isEdi = false;
				
				// 有償支給かつEDI 請求IF送信対象の場合は個別発行の有無にかかわらず納品書ＮＯ単位に分割し直し送信する
				// (連番は最大値のものを採用)
				if (dlvL.get(0).getBooleanNE(ShipRprt_Prnt01_HdrR.$onr_prov_flg) && isEdiTarget(ik, arr)){
					dlvL.sort(SortType.DESC, Bill_Send01_HdrR.$dlv_slip_seq);

					Bill_Send01_HdrR billSendHdr = Bill_Send01_HdrR.create();
					billSendHdr.dlv_slip_no(dlvL.get(0).getStringNE(ShipRprt_Prnt01_HdrR.$dlv_slip_no));
					billSendHdr.dlv_slip_seq(dlvL.get(0).getNumberNE(ShipRprt_Prnt01_HdrR.$dlv_slip_seq));
					billSendHdr.bill_print_flg(false);
					ope.up0().add(billSendHdr);
					isEdi = true;
				} else {
					isEdi = false;
				}

				MST_DLV_SLIP_R updR = MST_DLV_SLIP_R.create();
				updR.dlv_slip_no(dlvL.get(0).getStringNE(Bill_Send01_HdrR.$dlv_slip_no));
				updR.dlv_slip_seq(dlvL.get(0).getNumberNE(Bill_Send01_HdrR.$dlv_slip_seq));
				updR.edi_flg(isEdi);
				updL.add(updR);
				
			}
			
			// 請求IF送信実施
			if (ope.up0().size() > 0) {
				ope.exec();
			}

			// EDIフラグ更新実施
			if (updL.size() > 0) {
				MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
				MCQueryApiBuilder updR_bldr = MCQueryApiBuilder.create(t);
				updR_bldr.setSet(t.edi_flg);
				updR_bldr.setWhere(t.dlv_slip_no.eq(bindEx("dlv_slip_no")));
				updR_bldr.addWhereWithAnd(t.dlv_slip_seq.eq(bindEx("dlv_slip_seq")));
				dbUpdate("MSBEL5550_MST_DLV_SLIP_U10", updL, updR_bldr);
			}

			execPrntExSub(arr, cndL);
		}
		protected boolean isEdiTarget(MCIndexKey ik, List<R> arr) {
			if (arr.size() <= 0) {
				return false;
			}
			if (!isNull(_ediIfCtrL.getFirst(ik, getBpCd(arr)))) {
				return true;
			}
			return false;

		}

		protected String getBpCd(List<R> arr) {
			if (arr.size() <= 0) {
				return null;
			}
			MCReportInfoR bpCd = arr.get(0).getReportInfo();
			@SuppressWarnings("unchecked")
			MCList<MCRow> rptList = arr.get(0).getAll();
			for (MCRow rptRow : rptList) {
				if (rptRow instanceof DlvSlipHdrR) {
					DlvSlipHdrR hdrR = (DlvSlipHdrR) rptRow;
					if (MAC_TRD_PTN_TYP.isPROV_RTN(hdrR.trd_ptn_typ())) {
						return bpCd.app_to_cd2();
					}
					else {
						return bpCd.app_to_cd1();
					}
				}
			}
			return null;
		}
		/**
		 * 出力単位毎に帳票を出力する
		 * @param arr 出力単位でまとめられた帳票の情報
		 * @param cndL 
		 */
		protected void execPrntExSub(List<R> arr, MCList<C> cndL) {
			//デフォルトではcndLは使用しない
			if (arr.size() > 0) {
				R rptSet = crtRptSet();
				rptSet.setReportInfo(arr.get(0).getReportInfo());
				rptSet.setAppReportNo1(null);
				rptSet.setAppReportNo2(null);
				rptSet.setAppReportNo3(null);
				rptSet.setAppReportNo4(null);
				arr.forEach(r -> rptSet.addAll(r.getAll()));

				MCServerReportManager.request(rptSet);
			} 
		}
		
		/**
		 * 印刷データを生成しReportSetを返す<br>
		 * 印刷データの発行は呼び出し側で行う
		 */
		protected List<R> toRptSet() {
			List<R> arr = new ArrayList<>();
			for (C r : getNoErrCndL()) {
				R rptSet = toRptSet(r);
				if (rptSet != null) {
					arr.add(rptSet);
				}
			}
			return arr;
		}

		/**
		 * ヘッダを一意にする項目の単位に印刷データを生成しReportSetを返す<br>
		 * 印刷データの発行は呼び出し側で行う
		 */
		protected R toRptSet(C cndR) {
			if (isErr(cndR))	return null;
			H hdrR = _hdrL.getFirst(_hdrIdx, cndR.toArray(_pegCols)); 
			return toRptSet(
						hdrR,
						_dtlL.subList(_dtlIdx, hdrR.toArray(_dtlIdx.getKeys())));
		}

		/**
		 * 印刷データを生成しReportSetを返す<br>
		 */
		protected R toRptSet(H hdrR, MCList<D> dtlL) {
			if (isNull(hdrR) || isNull(dtlL)) {
				return null;
			}
			R rptSet = crtRptSet(hdrR);
			if (isRegist() && isPrnted(hdrR) && isReprnt()) {
				// 印刷データから再発行
				rePrnt(rptSet);
			}
			else {
				// DBからデータを加工して発行
				prnt(rptSet, hdrR, dtlL);
			}
			return rptSet;
		}

		/**
		 * 帳票を発行する
		 */
		protected void execPrnt() {
			List<R> arr = toRptSet();
			if (arr.size() > 0) {
				R rptSet = crtRptSet();
				rptSet.setReportInfo(arr.get(0).getReportInfo());
				rptSet.setAppReportNo1(null);
				rptSet.setAppReportNo2(null);
				rptSet.setAppReportNo3(null);
				rptSet.setAppReportNo4(null);
				arr.forEach(r -> rptSet.addAll(r.getAll()));
				MCServerReportManager.request(rptSet);
			} 
		}

		/**
		 * ヘッダを一意にする項目の単位に帳票を発行する
		 * 引数の項目が getPegCols と一致しない場合は帳票発行されない<br>
		 */
		protected void execPrnt(C cndR) {
			R rptSet = toRptSet(cndR);
			if (rptSet != null) {
				MCServerReportManager.request(rptSet);
			}
		}

		/**
		 * 発行対象のレポートセットを生成する
		 */
		protected abstract R crtRptSet();

		/**
		 * 印刷情報を設定する
		 */
		protected R crtRptSet(H hdrR) {
			R rptSet = crtRptSet();
			rptSet.setReportID(rptSet.getReportID());
			if (!isRegist()) {
				rptSet.setPersistent(false);
			}
			return rptSet;
		}
		
		/**
		 * 再発行用のレポートセットを生成する
		 */
		protected R crtRptSet4rePrnt(R rptSet) {
			MCReportInfoR orgInfoR = rptSet.getReportInfo();
			
			R rpt = crtRptSet();
			MCReportInfoR infoR = rpt.getReportInfo();
			infoR.report_id(orgInfoR.report_id());
			infoR.app_report_no1(orgInfoR.app_report_no1());
			infoR.app_report_no2(orgInfoR.app_report_no2());
			infoR.app_report_no3(orgInfoR.app_report_no3());
			infoR.app_report_no4(orgInfoR.app_report_no4());
			
			return rpt;
		}

		/**
		 * ヘッダを編集する
		 */
		protected void editHdr(H hdrR, MCList<D> dtlL, R rptSet) {
		}

		/**
		 * 明細を編集する
		 */
		protected void editDtl(H hdrR, MCList<D> dtlL, R rptSet) {
		}

		/**
		 * 帳票を再発行する
		 */
		protected void rePrnt(R rptSet) {
			MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(crtRptSet4rePrnt(rptSet), false);
			if (infoL == null || infoL.isEmpty()) {
				return;
			}
			// 複数ある場合、最新のデータで印刷する
			infoL.sort(SortType.DESC, MCReportInfoR.$print_seq);
			rptSet.addAll(MCServerReportManager.toReportSet(infoL.get(0)).getAll());
			rptSet.setRegister(false);	// 再発行分は登録しない
		}

		/**
		 * 納品伝票を発行する
		 */
		protected void prnt(R rptSet, H hdrR, MCList<D> dtlL) {
			editHdr(hdrR, dtlL, rptSet);
			editDtl(hdrR, dtlL, rptSet);
			rptSet.addRow(hdrR);
			rptSet.addAll(dtlL);
			rptSet.setRegister(isRegist());
			if (isRegist()) {
				// 印刷データの登録
				MCServerReportManager.request(rptSet, false);
			}
		}

		/**
		 * 発行済みか<br>
		 * 「true」の場合、発行済みとみなす<br>
		 */
		protected abstract boolean isPrnted(H hdrR);

		/**
		 * 発行済みの場合に再印刷を行うか<br>
		 * 「true」の場合、印刷データから再発行を行う<br>
		 * ただし、印刷データを登録しない場合は、常に「false」として扱う
		 */
		protected boolean isReprnt() {
			return true;
		}

		/**
		 * 印刷データを登録するか<br>
		 * 「true」の場合、印刷データを登録する
		 */
		protected boolean isRegist() {
			return true;
		}
		
		/**
		 * データ生成時にエラーが発生しているか
		 */
		protected abstract boolean isErr(C cndR);

		/**
		 * 発行条件を取得する
		 */
		protected MCList<C> getCndL() {
			return _cndL;
		}
		protected MCList<C> getNoErrCndL() {
			return _cndL.subList(r -> !isErr(r));
		}

		/**
		 * 出力対象のヘッダを取得する
		 * @return
		 */
		protected MCList<H> getHdrL() {
			return _hdrL;
		}

		/**
		 * 出力対象の明細を取得する
		 * @return
		 */
		protected MCList<D> getDtlL() {
			return _dtlL;
		}

		/**
		 * 出力帳票のロケールを取得する
		 */
		protected Locale getPrntLocal(R rptSet) {
			Locale lcl = rptSet.getLocale();
			if (lcl == null) {
				lcl = getUsrLocale();
			}
			return lcl;
		}

		protected static final String IS_INDIV_PRNT_STR = "indiv_prnt_flg";
		protected String[] getIndivPrntCols() {
			return new String[] {};
		}
		protected String[] getGroupPrntCols() {
			return new String[] {};
		}

		protected List<MCList<C>> groupListBp() {

			MCList<H> indivPrntL = getHdrL().createInstance();
			MCList<H> notInvidPrntL = getHdrL().createInstance();

			for (H hdrR : getHdrL()) {
				if (hdrR.getBooleanNE(IS_INDIV_PRNT_STR)) {
					indivPrntL.add(hdrR);
				}
				else {
					notInvidPrntL.add(hdrR);
				}
			}

			MCList<H>[] indivPrntGrpAry = indivPrntL.groupList(getIndivPrntCols());
			MCList<H>[] notIndivPrntGrpAry = notInvidPrntL.groupList(getGroupPrntCols());
			int len = indivPrntGrpAry.length + notIndivPrntGrpAry.length;
			MCIndexKey idx = getCndL().createIndex(ShipRprt_Prnt01_HdrR.$dlv_slip_no, ShipRprt_Prnt01_HdrR.$dlv_slip_seq);

			if (len == 1) {
				return new ArrayList<MCList<C>>(Arrays.asList(getCndL()));

			}

			Arrays.sort(indivPrntGrpAry, new Comparator<MCList<H>>() {
				public int compare(MCList<H> o1, MCList<H> o2) {
					int cmp = 0;
					for (String s : getIndivPrntCols()) {
						cmp = o1.get(0).getString(s).compareTo(o2.get(0).getString(s));
						if (cmp != 0) {
							break;
						}
					}
					return cmp;
				}
			});
			Arrays.sort(notIndivPrntGrpAry, new Comparator<MCList<H>>() {
				public int compare(MCList<H> o1, MCList<H> o2) {
					int cmp = 0;
					for (String s : getGroupPrntCols()) {
						cmp = o1.get(0).getString(s).compareTo(o2.get(0).getString(s));
						if (cmp != 0) {
							break;
						}
					}
					return cmp;
				}
			});

			List<MCList<H>> allPrntL = Stream.concat(Arrays.asList(indivPrntGrpAry).stream(), Arrays.asList(notIndivPrntGrpAry).stream()).collect(Collectors.toList());
			List<MCList<C>> retL = new ArrayList<MCList<C>>();

			for (MCList<H> allPrntGrp : allPrntL) {
				MCList<C> slipL = MCList.create(getCndL().createRow());
				for (H allPrntR : allPrntGrp) {
					slipL.addAll(getCndL().subList(idx, allPrntR.toArray(idx.getKeys())));
				}
				retL.add(slipL);
			}
			return retL;

		}

		protected  MCList<BpUtil_Sprt01_DtlR> getIndivPrnt(MCList<?> slipL, String bpTyp) {

			if (slipL.isEmpty()) {
				return MCList.create(BpUtil_Sprt01_DtlR.class);
			}

			MSUCL_BpUtil.BpUtil_Sprt01 ope = MSUCL_BpUtil.crtBpUtil_Sprt01();
			ope.up0().bp_typ(bpTyp);
			for (MCRow r : slipL.groupBy(DLV_DEST_CD)) {
				BpUtil_Sprt01_DtlR dtlR = BpUtil_Sprt01_DtlR.create();
				dtlR.bp_cd(r.getStringNE(DLV_DEST_CD));
				ope.up1().add(dtlR);
			}
			ope.exec();

			return  ope.down0();
		}

		protected void setIndivPrntCst(MCList<H> cstL) {
			MCList<BpUtil_Sprt01_DtlR> indivInfoCstL = getIndivPrnt(cstL, MAC_BP_IS_SRCH_TYP.CST.value());
			MCIndexKey indivInfoCstLKey = indivInfoCstL.createIndex(BpUtil_Sprt01_DtlR.$bp_cd);
			for (H cstR : cstL) {
				cstR.setBooleanNE(IS_INDIV_PRNT_STR, indivInfoCstL.getFirst(indivInfoCstLKey, cstR.getStringNE(DLV_DEST_CD)).indiv_prnt_flg());
			}
		}

		protected void setIndivPrntSppl(MCList<H> spplL) {
			MCList<BpUtil_Sprt01_DtlR> indivInfoSpplL = getIndivPrnt(spplL, MAC_BP_IS_SRCH_TYP.SPPL.value());
			MCIndexKey indivInfoSpplLKey = indivInfoSpplL.createIndex(BpUtil_Sprt01_DtlR.$bp_cd);
			for (H spplR : spplL) {
				spplR.setBooleanNE(IS_INDIV_PRNT_STR, indivInfoSpplL.getFirst(indivInfoSpplLKey, spplR.getStringNE(DLV_DEST_CD)).indiv_prnt_flg());
			}
		}

		protected void setIndivPrntCo(MCList<H> coL) {
			for (H coR : coL) {
				coR.setBooleanNE(IS_INDIV_PRNT_STR, MAC_PRNT_TYP.isINDIV_PRNT(getCo().dlv_prnt_typ()));
			}
		}

		protected void setIndivPrntDlv(MCList<H> dlvL) {
			MCList<BpUtil_Sprt01_DtlR> indivInfoDlvL = getIndivPrnt(dlvL, MAC_BP_IS_SRCH_TYP.DLV.value());
			MCIndexKey indivInfoDlvLKey = indivInfoDlvL.createIndex(BpUtil_Sprt01_DtlR.$bp_cd);
			for (H dlvR : dlvL) {
				dlvR.setBooleanNE(IS_INDIV_PRNT_STR, indivInfoDlvL.getFirst(indivInfoDlvLKey, dlvR.getStringNE(DLV_DEST_CD)).indiv_prnt_flg());
			}
		}

		protected MCList<H> addIndivTempCol(MCList<H> tgtL) {
			tgtL.addBooleanColumn(IS_INDIV_PRNT_STR);
			tgtL.addStringColumn(DLV_DEST_CD);
			tgtL.addStringColumn(DLV_DEST_TYP);
			return tgtL;
		}
	}
//// ピッキングリスト
	/**
	 * ピッキングリストを作成・発行するクラス<br>
	 * 当クラスでは移動指図NO単位にピッキングリストを扱う
	 */
	public class PickLstByXfr extends PickLstBase {
		protected PickLstByXfr(MCList<ShipRprt_Prnt02_HdrR> cndL) {
			super(cndL, new String[]{"xfr_inst_no"});
			init();
		}
		@Override
		protected void insWk() {
			MSW_XFR_INST_KEY_R S0 = MSW_XFR_INST_KEY_R.create();
			execDbWkDelete("MSBEL5550_MSW_XFR_INST_KEY_D01", S0);
			MCInsert q2 = sql("MSBEL5550_MSW_XFR_INST_KEY_I01")
				.insert(S0)
				.columns(S0.xfr_inst_no)
				.values(bind("xfr_inst_no"));
			q2.executeBatchUpdate(getNoErrCndL());
		}
		@Override
		protected void chk() {
			// 指図明細に対する存在チェック（ヘッダは明細から生成するためチェック不要）
			// _dtlL は集計した結果なので指図NOを保持できない
			MCIndexKey idx = _orgDtlL.createIndex("xfr_inst_no");
			for (ShipRprt_Prnt02_HdrR r : getNoErrCndL()) {
				if (isNull(_orgDtlL.getFirst(idx, r.toArray(idx.getKeys())))) {
					MCMessagePool.addAll(
						getRecordNotFoundMsg("MS", "MST_XFR_INST_D", idx.getKeys(), r.toArray(idx.getKeys()), r));
					r.err_flg(true);
				}
			}
		}
		@Override
		protected void srchDtl() {
			executeQuery(_dtlL, MSBEL5550_MST_XFR_INST_D_S01());

			// 出荷と移動で帳票コンテナを共有するので、名称の差異を補完する
			_dtlL.addStringColumn("ship_inst_no");
			_dtlL.addStringColumn("ship_inst_d_no");
			_dtlL.addDateColumn("ship_inst_dt");
			_dtlL.addDateColumn("ship_schd_tm");
			_dtlL.addStringColumn("ship_loc_nm");
			_dtlL.addStringColumn("ship_loc_cd");
			_dtlL.addStringColumn("ship_str_ln_nm");
			_dtlL.addStringColumn("ship_str_ln_cd");
			_dtlL.addNumberColumn("pack_unit_dec_place");
			_dtlL.forEach(r -> {
				r.setString("ship_inst_no", r.getString("xfr_inst_no"));
				r.setString("ship_inst_d_no", r.getString("xfr_inst_d_no"));
				r.setDate("ship_inst_dt", r.getDate("xfr_inst_dt"));
				r.setDate("ship_schd_tm", r.getDate("xfr_schd_dt"));
				r.setString("ship_loc_nm", r.getString("gi_loc_nm"));
				r.setString("ship_loc_cd", r.getString("gi_loc_cd"));
				r.setString("ship_str_ln_nm", r.getString("gi_str_ln_nm"));
				r.setString("ship_str_ln_cd", r.getString("gi_str_ln_cd"));
				r.pack_unit_qty(r.getNumber("trd_unit_qty"));
				r.pack_unit_nm(r.getString("trd_unit_nm"));
				r.pack_unit_cd(r.getString("trd_unit_cd"));
				r.setNumber("pack_unit_dec_place", r.getNumber("trd_unit_dec_place"));
			});
			super.srchDtl();
		}
	}
	/**
	 * ピッキングリストを作成・発行するクラス<br>
	 * 当クラスでは出荷指図NO単位にピッキングリストを扱う
	 */
	public class PickLstByShip extends PickLstBase {
		protected PickLstByShip(MCList<ShipRprt_Prnt02_HdrR> cndL) {
			super(cndL, new String[]{"ship_inst_no"});
			init();
		}
		@Override
		protected void insWk() {
			MSW_SHIP_INST_KEY_R S0 = MSW_SHIP_INST_KEY_R.create();
			execDbWkDelete("MSBEL5550_MSW_SHIP_INST_KEY_D01", S0);
			MCInsert q2 = sql("MSBEL5550_MSW_SHIP_INST_KEY_I01")
				.insert(S0)
				.columns(S0.ship_inst_no)
				.values(bind("ship_inst_no"));
			q2.executeBatchUpdate(getNoErrCndL());
		}
		@Override
		protected void chk() {
			// 指図明細に対する存在チェック（ヘッダは明細から生成するためチェック不要）
			// _dtlL は集計した結果なので指図NOを保持できない
			MCIndexKey idx = _orgDtlL.createIndex("ship_inst_no");
			for (ShipRprt_Prnt02_HdrR r : getNoErrCndL()) {
				if (isNull(_orgDtlL.getFirst(idx, r.toArray(idx.getKeys())))) {
					MCMessagePool.addAll(
						getRecordNotFoundMsg("MS", "MST_SHIP_INST_D", idx.getKeys(), r.toArray(idx.getKeys()), r));
					r.err_flg(true);
				}
			}
		}
		@Override
		protected void srchDtl() {
			executeQuery(_dtlL, MSBEL5550_MST_SHIP_INST_D_S01());
			super.srchDtl();
		}
	}
	/**
	 * ピッキングリストを作成・発行するクラス
	 */
	public abstract class PickLstBase extends RptBase<MSBER_PickLst, PickLstHdrR, PickLstDtlR, ShipRprt_Prnt02_HdrR> {

		/**
		 * 集計前の明細リスト<br>
		 * チェック処理で使用する
		 */
		protected MCList<PickLstDtlR> _orgDtlL = null;

		/**
		 * ヘッダと明細を紐付ける項目
		 */
		protected String _$peg_no = "__peg_no__";

		/**
		 * ヘッダのキー項目
		 */
		protected String[] _grpKey = {
			"lg_grp_cd", "ship_loc_cd", "ship_inst_dt", "ship_schd_tm"
		};

		/**
		 * 明細の集計キー<br>
		 * キーが同一の明細は集約して出力する
		 */
		protected String[] _dtlKey = {
			"lg_grp_cd", "lg_grp_nm", "ship_loc_cd", "ship_loc_nm",
			"ship_inst_dt", "ship_schd_tm", "pick_prnt_flg",
			"sno1_mng_typ", "sno2_mng_typ", "sno3_mng_typ", "sno4_mng_typ",
			"inst_dpt_cd", "inst_dpt_nm", "inst_usr_cd", "inst_usr_nm",
			PickLstDtlR.$itm_cd,
			PickLstDtlR.$itm_sub1_data,
			PickLstDtlR.$itm_sub2_data,
			PickLstDtlR.$itm_sub3_data,
			PickLstDtlR.$itm_nm,
			PickLstDtlR.$itm_alt_nm1,
			PickLstDtlR.$itm_alt_nm2,
			PickLstDtlR.$itm_alt_nm3,
			PickLstDtlR.$itm_alt_nm4,
			PickLstDtlR.$str_ln_nm,
			PickLstDtlR.$str_ln_cd,
			PickLstDtlR.$gd_nm,
			PickLstDtlR.$gd_cd,
			PickLstDtlR.$lot_no_data,
			PickLstDtlR.$sublot_no_data,
			PickLstDtlR.$ver_no_lbl,
			PickLstDtlR.$ver_no,
			PickLstDtlR.$sno1_data,
			PickLstDtlR.$sno2_data,
			PickLstDtlR.$sno3_data,
			PickLstDtlR.$sno4_data,
			PickLstDtlR.$quality_typ_nm,
			PickLstDtlR.$quality_typ,
			PickLstDtlR.$stk_insp_typ_nm,
			PickLstDtlR.$stk_insp_typ,
			PickLstDtlR.$stk_id_typ_nm,
			PickLstDtlR.$stk_id_typ,
			PickLstDtlR.$stk_bp_nm,
			PickLstDtlR.$stk_bp_alt_nm1,
			PickLstDtlR.$stk_bp_alt_nm2,
			PickLstDtlR.$stk_bp_alt_nm3,
			PickLstDtlR.$stk_bp_alt_nm4,
			PickLstDtlR.$stk_bp_cd,
			PickLstDtlR.$pack_unit_nm,
			PickLstDtlR.$pack_unit_cd,
			PickLstDtlR.$base_unit_nm,
			PickLstDtlR.$base_unit_cd,
			PickLstDtlR.$alloc_flg
		};

 		/**
		 * コンストラクタ	
		 */
		protected PickLstBase(MCList<ShipRprt_Prnt02_HdrR> cndL, String[] pegCols) {
			super(cndL, pegCols);
		}

		@Override
		protected void init() {
			// ピッキングリストは _pegCols 単位に出力しないので、内部的に使用する _$peg_no を設定する
			_pegCols = new String[]{_$peg_no};
			super.init();
		}

		@Override
		protected void srchHdr() {
			// 明細で取得・設定する為、ここでは処理しない
			_dtlL = MCList.create(PickLstDtlR.class);
			_dtlL.addBooleanColumn("pick_prnt_flg");
			_dtlL.addNumberColumn(_$peg_no);
		}

		@Override
		protected void srchDtl() {
			// データの取得はサブクラスで行う
			// ここにはデータの取得以降の加工を実装する
			// 加工前の明細リストを退避
			_orgDtlL = _dtlL.clone();

			// 未引当は場所、ロット、サブロットをクリアする
			_dtlL.forEach(r -> {
				r.str_ln_cd(r.getString("ship_str_ln_cd"));
				r.str_ln_nm(r.getString("ship_str_ln_nm"));
			});

			// 同一の品目、棚、ロットなどは集計して出力する
			MCGroupByPolicy policy = new MCGroupByPolicy(_dtlKey);
			policy.sum(PickLstDtlR.$pack_unit_qty);
			policy.sum(PickLstDtlR.$base_unit_qty);
			_dtlL = _dtlL.groupBy(policy);

			_dtlL.sort(
				"ship_schd_tm",
				"ship_loc_cd",
				PickLstDtlR.$str_ln_cd,
				PickLstDtlR.$itm_cd,
				PickLstDtlR.$itm_sub1_data, PickLstDtlR.$itm_sub2_data, PickLstDtlR.$itm_sub3_data,
				PickLstDtlR.$pack_unit_cd,
				PickLstDtlR.$sno1_data, PickLstDtlR.$sno2_data, PickLstDtlR.$sno3_data, PickLstDtlR.$sno4_data,
				PickLstDtlR.$lot_no_data, PickLstDtlR.$sublot_no_data);

			// ヘッダを生成する
			_hdrL = MCList.create(PickLstHdrR.class);
			_hdrL.addBooleanColumn("pick_prnt_flg");
			_hdrL.addNumberColumn(_$peg_no);
			PickLstDtlR bkR = null;
			int pegNo = 0;
			for (PickLstDtlR r : _dtlL) {
				if (!isSameGrpKey(r, bkR)) {
					PickLstHdrR hdrR = _hdrL.add();
					hdrR.lg_grp_nm(r.getString("lg_grp_nm"));
					hdrR.lg_grp_cd(r.getString("lg_grp_cd"));
					hdrR.ship_loc_nm(r.getString("ship_loc_nm"));
					hdrR.ship_loc_cd(r.getString("ship_loc_cd"));
					hdrR.ship_inst_dt(r.getDate("ship_inst_dt"));
					hdrR.ship_schd_tm(r.getDate("ship_schd_tm"));
					hdrR.inst_dpt_cd(r.getString("inst_dpt_cd"));
					hdrR.inst_dpt_nm(r.getString("inst_dpt_nm"));
					hdrR.inst_usr_cd(r.getString("inst_usr_cd"));
					hdrR.inst_usr_nm(r.getString("inst_usr_nm"));
					hdrR.setBoolean("pick_prnt_flg", r.getBoolean("pick_prnt_flg"));
					hdrR.setNumber(_$peg_no, ++pegNo);
				}
				r.setNumber(_$peg_no, pegNo);
				bkR = r;
			}
		}

		/**
		 * ヘッダのキー項目を比較する
		 */
		protected boolean isSameGrpKey(PickLstDtlR r1, PickLstDtlR r2) {
			if (!isNull(r1) && !isNull(r2)) {
				for (String col : _grpKey) {
					if (!isSame(r1.getValue(col), r2.getValue(col))) {
						return false;
					}
				}
				return true;
			}
			return false;
		}

		@Override
		protected List<MSBER_PickLst> toRptSet() {
			// ピッキングリストは他の帳票と異なり _cndR ごとに出力しない
			List<MSBER_PickLst> arr = new ArrayList<>();
			for (PickLstHdrR hdrR : _hdrL) {
				MSBER_PickLst rpt = super.toRptSet(hdrR, _dtlL.subList(_dtlIdx, hdrR.toArray(_dtlIdx.getKeys())));
				if (rpt != null) {
					arr.add(rpt);
				}
			}
			return arr;
		}

		@Override
		protected MSBER_PickLst crtRptSet() {
			return MSBER_PickLst.create();
		}

		@Override
		protected MSBER_PickLst crtRptSet(PickLstHdrR hdrR) {
			MSBER_PickLst rptSet = super.crtRptSet(hdrR);
			return rptSet;
		}

		@Override
		protected void editHdr(PickLstHdrR hdrR, MCList<PickLstDtlR> dtlL, MSBER_PickLst rptSet) {
			hdrR.prnt_tm(MCDate.now());
		}

		@Override
		protected void editDtl(PickLstHdrR hdrR, MCList<PickLstDtlR> dtlL, MSBER_PickLst rptSet) {
			putPrntItmSub1(dtlL, PickLstDtlR.$itm_sub1_view, PickLstDtlR.$itm_sub1_data);
			putPrntItmSub2(dtlL, PickLstDtlR.$itm_sub2_view, PickLstDtlR.$itm_sub2_data);
			putPrntItmSub3(dtlL, PickLstDtlR.$itm_sub3_view, PickLstDtlR.$itm_sub3_data);

			dtlL.forEach(r -> {
				if (!isNull(r.ver_no())) {
					r.ver_no_lbl(MSC_PICK_LIST_STR.VER_NO.name(getUsrLocale()));
				}
				r.quality_typ_nm(MAC_QUALITY_TYP.get(r.quality_typ()).name(getUsrLocale()));
				r.stk_insp_typ_lbl(MSC_PICK_LIST_STR.STK_INSP_TYP.name(getUsrLocale()));
				r.stk_insp_typ_nm(MSC_STK_INSP_TYP.get(r.stk_insp_typ()).name(getUsrLocale()));
				r.stk_id_typ_nm(MSC_STK_ID_TYP.get(r.stk_id_typ()).name(getUsrLocale()));
				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.getString("sno1_mng_typ"))) {
					r.sno1_data(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.getString("sno2_mng_typ"))) {
					r.sno2_data(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.getString("sno3_mng_typ"))) {
					r.sno3_data(MAC_STR.NULL_VAL.value());
				}
				if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.getString("sno4_mng_typ"))) {
					r.sno4_data(MAC_STR.NULL_VAL.value());
				}
			});

			putPrntStr(dtlL, PickLstDtlR.$lot_no_view, PickLstDtlR.$lot_no_data);
			putPrntStr(dtlL, PickLstDtlR.$sublot_no_view, PickLstDtlR.$sublot_no_data);

			putPrntSnoLabel1(dtlL, PickLstDtlR.$sno1_lbl);
			putPrntSnoLabel2(dtlL, PickLstDtlR.$sno2_lbl);
			putPrntSnoLabel3(dtlL, PickLstDtlR.$sno3_lbl);
			putPrntSnoLabel4(dtlL, PickLstDtlR.$sno4_lbl);
			putPrntSno1(dtlL, PickLstDtlR.$sno1_view, PickLstDtlR.$sno1_data);
			putPrntSno2(dtlL, PickLstDtlR.$sno2_view, PickLstDtlR.$sno2_data);
			putPrntSno3(dtlL, PickLstDtlR.$sno3_view, PickLstDtlR.$sno3_data);
			putPrntSno4(dtlL, PickLstDtlR.$sno4_view, PickLstDtlR.$sno4_data);

			putNumStr(rptSet, dtlL, PickLstDtlR.$s_pack_unit_qty, PickLstDtlR.$pack_unit_qty, "pack_unit_dec_place");
			putNumStr(rptSet, dtlL, PickLstDtlR.$s_base_unit_qty, PickLstDtlR.$base_unit_qty, "base_unit_dec_place");
			putNumStr(rptSet, dtlL, PickLstDtlR.$s_int_pack_unit_qty, PickLstDtlR.$s_dec_pack_unit_qty, PickLstDtlR.$pack_unit_qty, "pack_unit_dec_place");
			putNumStr(rptSet, dtlL, PickLstDtlR.$s_int_base_unit_qty, PickLstDtlR.$s_dec_base_unit_qty, PickLstDtlR.$base_unit_qty, "base_unit_dec_place");
		}

		@Override
		protected boolean isPrnted(PickLstHdrR hdrR) {
			return hdrR.getBoolean("pick_prnt_flg");
		}
		@Override
		protected boolean isReprnt() {
			// 印刷データから再印刷しないので、常にfalseを返す
			return false;
		}
		@Override
		protected boolean isRegist() {
			// 印刷データは登録する
			return true;
		}
		@Override
		protected boolean isErr(ShipRprt_Prnt02_HdrR cndR) {
			return cndR.err_flg();
		}
	}

//// 出荷指図書
	/**
	 * 出荷指図書を作成・発行するクラス<br>
	 * 当クラスでは出荷指図NO単位に出荷指図書を扱う
	 */
	public class ShipInst extends RptBase<MSBER_ShipInst, ShipInstHdrR, ShipInstDtlR, ShipRprt_Prnt02_HdrR> {
		protected ShipInst(MCList<ShipRprt_Prnt02_HdrR> cndL) {
			super(cndL, new String[]{"ship_inst_no"});
			init();
		}
		@Override
		protected void insWk() {
			MSW_SHIP_INST_KEY_R S0 = MSW_SHIP_INST_KEY_R.create();
			execDbWkDelete("MSBEL5550_MSW_SHIP_INST_KEY_D02", S0);
			MSW_SHIP_INST_P_KEY_R S1 = MSW_SHIP_INST_P_KEY_R.create();
			MST_SHIP_INST_R S2 = MST_SHIP_INST_R.create();
			execDbWkDelete("MSBEL5550_MSW_SHIP_INST_P_KEY_D02", S1);
			MCList<ShipRprt_Prnt02_HdrR> cndL = getNoErrCndL();
			if (!cndL.isEmpty()) {
				MCInsert q2 = sql("MSBEL5550_MSW_SHIP_INST_KEY_I02")
					.insert(S0)
					.columns(S0.ship_inst_no)
					.values(bind("ship_inst_no"));
				q2.executeBatchUpdate(cndL);
				MCInsert q3 = sql("MSBEL5550_MSW_SHIP_INST_P_KEY_I02")
					.insert(S1)
					.columns(S1.ship_inst_no, S1.ship_inst_rev)
					.query(subQuery()
						.select(S2.ship_inst_no, S2.ship_inst_rev)
						.from(S2)
						.where(S2.ship_inst_no.eq(bind("ship_inst_no")))
					);
				q3.executeBatchUpdate(cndL);
			}
		}

		@Override
		protected void chk() {
			MCIndexKey
				hdrIdx = _hdrL.createIndex("ship_inst_no"),
				dtlIdx = _dtlL.createIndex("ship_inst_no");
			// 出荷指図、出荷指図明細に対する存在チェック
			for (ShipRprt_Prnt02_HdrR r : getNoErrCndL()) {
				if (isNull(_hdrL.getFirst(hdrIdx, r.ship_inst_no()))
					|| isNull(_dtlL.getFirst(dtlIdx, r.ship_inst_no()))) {
					MCMessagePool.addAll(getRecordNotFoundMsg("MS", "MST_SHIP_INST"
							, new String[]{MST_SHIP_INST_R.$ship_inst_no}
							, new Comparable[]{r.ship_inst_no()}, r));
					r.err_flg(true);
				}
			}
		}

		@Override
		protected void srchHdr() {
			_hdrL = MCList.create(ShipInstHdrR.class);
			_hdrL.addBooleanColumn("ship_inst_prnt_flg");
			executeQuery(_hdrL, MSBEL5550_MST_SHIP_INST_S01());
		}

		@Override
		protected void srchDtl() {
			_dtlL = MCList.create(ShipInstDtlR.class);
			executeQuery(_dtlL, MSBEL5550_MST_SHIP_INST_D_S01());

			// ピッキングリストとSQLを共有しているので、名称の差異を補完
			_dtlL.addNumberColumn("ent_unit_dec_place");
			_dtlL.addNumberColumn("inst_base_unit_dec_place");
			_dtlL.forEach(r ->{
				r.setNumber("ent_unit_dec_place", r.getNumber("ent_unit_dec_place"));
				r.setNumber("inst_base_unit_qty", r.getNumber("base_unit_qty"));
				r.setString("inst_base_unit_nm", r.getString("base_unit_nm"));
				r.setNumber("inst_base_unit_dec_place", r.getNumber("base_unit_dec_place"));
				r.setString("inst_base_unit_cd", r.getString("base_unit_cd"));
			});
		}

		@Override
		protected MSBER_ShipInst crtRptSet() {
			return MSBER_ShipInst.create();
		}

		@Override
		protected MSBER_ShipInst crtRptSet(ShipInstHdrR hdrR) {
			MSBER_ShipInst rptSet = super.crtRptSet(hdrR);

			rptSet.setAppReportNo1(hdrR.ship_inst_no());
			rptSet.setAppReportNo2(hdrR.getNumber("ship_inst_rev").toSimpleString());
			rptSet.setAppReportNo3(null);
			rptSet.setAppUsrCd1(hdrR.getString("inst_dpt_cd"));
			rptSet.setAppUsrNm1(hdrR.getString("inst_dpt_nm"));
			rptSet.setAppUsrCd2(hdrR.getString("inst_usr_cd"));
			rptSet.setAppUsrNm2(hdrR.getString("inst_usr_nm"));
			rptSet.setAppToCd1(hdrR.ship_to_id_cd());
			rptSet.setAppToNm1(hdrR.ship_to_id_nm());
			return rptSet;
		}

		@Override
		protected void editHdr(ShipInstHdrR hdrR, MCList<ShipInstDtlR> dtlL, MSBER_ShipInst rptSet) {
			hdrR.prnt_tm(MCDate.now());
			hdrR.iv_no_lbl(MSC_SHIP_INST_STR.IV_NO.name(getUsrLocale()));
			hdrR.ship_to_addr(concatAddress(hdrR.ship_to_addr1(), hdrR.ship_to_addr2(), hdrR.ship_to_addr3(), hdrR.ship_to_addr4()));

			hdrR.sum_ship_wt(dtlL.sum(ShipInstDtlR.$ship_wt));
			hdrR.sum_ship_dim(dtlL.sum(ShipInstDtlR.$ship_dim));
			putNumStr(rptSet, hdrR, ShipInstHdrR.$s_sum_ship_wt, ShipInstHdrR.$sum_ship_wt, MSC_PRNT_NUM.WT_DEC_PLACE.value());
			putNumStr(rptSet, hdrR, ShipInstHdrR.$s_sum_ship_dim, ShipInstHdrR.$sum_ship_dim, MSC_PRNT_NUM.DIM_DEC_PLACE.value());
			putNumStr(rptSet, hdrR, ShipInstHdrR.$s_dlv_slip_num, ShipInstHdrR.$dlv_slip_num, hdrR.getMeta(ShipInstHdrR.$dlv_slip_num));
		}

		@Override
		protected void editDtl(ShipInstHdrR hdrR, MCList<ShipInstDtlR> dtlL, MSBER_ShipInst rptSet) {
			putPrntItmSub1(dtlL, ShipInstDtlR.$itm_sub1_view, ShipInstDtlR.$itm_sub1_data);
			putPrntItmSub2(dtlL, ShipInstDtlR.$itm_sub2_view, ShipInstDtlR.$itm_sub2_data);
			putPrntItmSub3(dtlL, ShipInstDtlR.$itm_sub3_view, ShipInstDtlR.$itm_sub3_data);

			dtlL.forEach(r -> {
				if (!isNull(r.ver_no())) {
					r.ver_no_lbl(MSC_SHIP_INST_STR.VER_NO.name(getUsrLocale()));
				}
				r.quality_typ_nm(MAC_QUALITY_TYP.get(r.quality_typ()).name(getUsrLocale()));
				r.stk_insp_typ_lbl(MSC_SHIP_INST_STR.STK_INSP_TYP.name(getUsrLocale()));
				r.stk_insp_typ_nm(MSC_STK_INSP_TYP.get(r.stk_insp_typ()).name(getUsrLocale()));
				r.stk_id_typ_nm(MSC_STK_ID_TYP.get(r.stk_id_typ()).name(getUsrLocale()));
			});

			putPrntStr(dtlL, ShipInstDtlR.$lot_no_view, ShipInstDtlR.$lot_no_data);
			putPrntStr(dtlL, ShipInstDtlR.$sublot_no_view, ShipInstDtlR.$sublot_no_data);

			putPrntSnoLabel1(dtlL, ShipInstDtlR.$sno1_lbl);
			putPrntSnoLabel2(dtlL, ShipInstDtlR.$sno2_lbl);
			putPrntSnoLabel3(dtlL, ShipInstDtlR.$sno3_lbl);
			putPrntSnoLabel4(dtlL, ShipInstDtlR.$sno4_lbl);
			putPrntSno1(dtlL, ShipInstDtlR.$sno1_view, ShipInstDtlR.$sno1_data);
			putPrntSno2(dtlL, ShipInstDtlR.$sno2_view, ShipInstDtlR.$sno2_data);
			putPrntSno3(dtlL, ShipInstDtlR.$sno3_view, ShipInstDtlR.$sno3_data);
			putPrntSno4(dtlL, ShipInstDtlR.$sno4_view, ShipInstDtlR.$sno4_data);

			putNumStr(rptSet, dtlL, ShipInstDtlR.$s_ent_unit_qty, ShipInstDtlR.$ent_unit_qty, "ent_unit_dec_place");
			putNumStr(rptSet, dtlL, ShipInstDtlR.$s_inst_base_unit_qty, ShipInstDtlR.$inst_base_unit_qty, "inst_base_unit_dec_place");
			putNumStr(rptSet, dtlL, ShipInstDtlR.$s_int_ent_qty, ShipInstDtlR.$s_dec_ent_qty, ShipInstDtlR.$ent_unit_qty, "ent_unit_dec_place");
			putNumStr(rptSet, dtlL, ShipInstDtlR.$s_int_inst_base_unit_qty, ShipInstDtlR.$s_dec_inst_base_unit_qty, ShipInstDtlR.$inst_base_unit_qty, "inst_base_unit_dec_place");

			putNumStr(rptSet, ShipInstDtlR.$s_ship_wt, ShipInstDtlR.$ship_wt, MSC_PRNT_NUM.WT_DEC_PLACE.value());
			putNumStr(rptSet, ShipInstDtlR.$s_ship_dim, ShipInstDtlR.$ship_dim, MSC_PRNT_NUM.DIM_DEC_PLACE.value());
		}

		@Override
		protected boolean isPrnted(ShipInstHdrR hdrR) {
			return hdrR.getBoolean("ship_inst_prnt_flg");
		}
		@Override
		protected boolean isReprnt() {
			// 印刷データから再印刷しないので、常にfalseを返す
			return false;
		}
		@Override
		protected boolean isRegist() {
			// 印刷データは登録する
			return true;
		}
		@Override
		protected boolean isErr(ShipRprt_Prnt02_HdrR cndR) {
			return cndR.err_flg();
		}
	}


//// 移動指図書
	/**
	 * 移動指図書を作成・発行するクラス<br>
	 * 当クラスでは移動指図NO単位に移動指図書を扱う
	 */
	public class XfrInst extends RptBase<MSBER_XfrInst, XfrInstHdrR, XfrInstDtlR, ShipRprt_Prnt02_HdrR> {
		protected XfrInst(MCList<ShipRprt_Prnt02_HdrR> cndL) {
			super(cndL, new String[]{"xfr_inst_no"});
			init();
		}
		@Override
		protected void insWk() {
			MSW_XFR_INST_KEY_R S0 = MSW_XFR_INST_KEY_R.create();
			execDbWkDelete("MSBEL5550_MSW_XFR_INST_KEY_D02", S0);
			MCList<ShipRprt_Prnt02_HdrR> cndL = getNoErrCndL();
			if (!cndL.isEmpty()) {
				MCInsert q2 = sql("MSBEL5550_MSW_XFR_INST_KEY_I02")
					.insert(S0)
					.columns(S0.xfr_inst_no)
					.values(bind("xfr_inst_no"));
				q2.executeBatchUpdate(cndL);
			}
		}

		@Override
		protected void chk() {
			MCIndexKey
				hdrIdx = _hdrL.createIndex("xfr_inst_no"),
				dtlIdx = _dtlL.createIndex("xfr_inst_no");
			// 移動指図、移動指図明細に対する存在チェック
			for (ShipRprt_Prnt02_HdrR r : getNoErrCndL()) {
				if (isNull(_hdrL.getFirst(hdrIdx, r.xfr_inst_no()))
					|| isNull(_dtlL.getFirst(dtlIdx, r.xfr_inst_no()))) {
					MCMessagePool.addAll(getRecordNotFoundMsg("MS", "MST_XFR_INST"
							, new String[]{MST_XFR_INST_R.$xfr_inst_no}
							, new Comparable[]{r.xfr_inst_no()}, r));
					r.err_flg(true);
				}
			}
		}

		@Override
		protected void srchHdr() {
			_hdrL = MCList.create(XfrInstHdrR.class);
			_hdrL.addBooleanColumn("xfr_inst_prnt_flg");
			executeQuery(_hdrL, MSBEL5550_MST_XFR_INST_S01());
		}

		@Override
		protected void srchDtl() {
			_dtlL = MCList.create(XfrInstDtlR.class);
			executeQuery(_dtlL, MSBEL5550_MST_XFR_INST_D_S01());
		}

		@Override
		protected MSBER_XfrInst crtRptSet() {
			return MSBER_XfrInst.create();
		}

		@Override
		protected MSBER_XfrInst crtRptSet(XfrInstHdrR hdrR) {
			MSBER_XfrInst rptSet = super.crtRptSet(hdrR);

			rptSet.setAppReportNo1(hdrR.xfr_inst_no());
			rptSet.setAppReportNo2(null);
			rptSet.setAppReportNo3(null);
			rptSet.setAppUsrCd1(hdrR.inst_dpt_cd());
			rptSet.setAppUsrNm1(hdrR.inst_dpt_nm());
			rptSet.setAppUsrCd2(hdrR.inst_usr_cd());
			rptSet.setAppUsrNm2(hdrR.inst_usr_nm());
			rptSet.setAppToCd1(hdrR.gr_loc_cd());
			rptSet.setAppToNm1(hdrR.gr_loc_nm());
			return rptSet;
		}

		@Override
		protected void editHdr(XfrInstHdrR hdrR, MCList<XfrInstDtlR> dtlL, MSBER_XfrInst rptSet) {
			hdrR.prnt_tm(MCDate.now());
			hdrR.addr(concatAddress(hdrR.addr1(), hdrR.addr2(), hdrR.addr3(), hdrR.addr4()));
		}

		@Override
		protected void editDtl(XfrInstHdrR hdrR, MCList<XfrInstDtlR> dtlL, MSBER_XfrInst rptSet) {
			putPrntItmSub1(dtlL, XfrInstDtlR.$itm_sub1_view, XfrInstDtlR.$itm_sub1_data);
			putPrntItmSub2(dtlL, XfrInstDtlR.$itm_sub2_view, XfrInstDtlR.$itm_sub2_data);
			putPrntItmSub3(dtlL, XfrInstDtlR.$itm_sub3_view, XfrInstDtlR.$itm_sub3_data);

			dtlL.forEach(r -> {
				if (!isNull(r.ver_no())) {
					r.ver_no_lbl(MSC_XFR_INST_STR.VER_NO.name(getUsrLocale()));
				}
				r.quality_typ_nm(MAC_QUALITY_TYP.get(r.quality_typ()).name(getUsrLocale()));
				r.stk_insp_typ_lbl(MSC_XFR_INST_STR.STK_INSP_TYP.name(getUsrLocale()));
				r.stk_insp_typ_nm(MSC_STK_INSP_TYP.get(r.stk_insp_typ()).name(getUsrLocale()));
				r.stk_id_typ_nm(MSC_STK_ID_TYP.get(r.stk_id_typ()).name(getUsrLocale()));
			});

			putPrntStr(dtlL, XfrInstDtlR.$lot_no_view, XfrInstDtlR.$lot_no_data);
			putPrntStr(dtlL, XfrInstDtlR.$sublot_no_view, XfrInstDtlR.$sublot_no_data);

			putPrntSnoLabel1(dtlL, XfrInstDtlR.$sno1_lbl);
			putPrntSnoLabel2(dtlL, XfrInstDtlR.$sno2_lbl);
			putPrntSnoLabel3(dtlL, XfrInstDtlR.$sno3_lbl);
			putPrntSnoLabel4(dtlL, XfrInstDtlR.$sno4_lbl);
			putPrntSno1(dtlL, XfrInstDtlR.$sno1_view, XfrInstDtlR.$sno1_data);
			putPrntSno2(dtlL, XfrInstDtlR.$sno2_view, XfrInstDtlR.$sno2_data);
			putPrntSno3(dtlL, XfrInstDtlR.$sno3_view, XfrInstDtlR.$sno3_data);
			putPrntSno4(dtlL, XfrInstDtlR.$sno4_view, XfrInstDtlR.$sno4_data);

			putNumStr(rptSet, dtlL, XfrInstDtlR.$s_trd_unit_qty, XfrInstDtlR.$trd_unit_qty, "trd_unit_dec_place");
			putNumStr(rptSet, dtlL, XfrInstDtlR.$s_int_trd_unit_qty, XfrInstDtlR.$s_dec_trd_unit_qty, XfrInstDtlR.$trd_unit_qty, "trd_unit_dec_place");
		}

		@Override
		protected boolean isPrnted(XfrInstHdrR hdrR) {
			return hdrR.getBoolean("xfr_inst_prnt_flg");
		}
		@Override
		protected boolean isReprnt() {
			// 印刷データから再印刷しないので、常にfalseを返す
			return false;
		}
		@Override
		protected boolean isRegist() {
			// 印刷データは登録する
			return true;
		}
		@Override
		protected boolean isErr(ShipRprt_Prnt02_HdrR cndR) {
			return cndR.err_flg();
		}
	}

	/**
	 * 出荷案内書を作成・発行するクラス<br>
	 * 当クラスでは納品伝票NO、納品伝票連番単位に出荷案内書を扱う
	 */
	public class ShipAdvBySlip extends ShipAdvBase {
		/**
		 * ヘッダに出力する出荷指図、出荷実績
		 */
		protected MCList<ShipAdvHdrR> _shipHdrL = null;
		/**
		 * ヘッダと出荷実績のJOINキー
		 */
		protected MCJoinKey<MCList<ShipAdvHdrR>> _jk = null;
		
		/**
		 * 出荷実績に対する出荷案内書の場合「true」
		 */
		protected boolean _isAct = false;
		
		protected ShipAdvBySlip(MCList<ShipRprt_Prnt01_HdrR> cndL) {
			super(cndL, new String[]{"dlv_slip_no", "dlv_slip_seq"});
			init();
		}
		@Override
		protected void insWk() {
			super.insWk();
			MSW_DLV_SLIP_KEY_R S0 = MSW_DLV_SLIP_KEY_R.create();
			MCInsert q = sql("MSBEL5550_MSW_DLV_SLIP_KEY_I03")
				.insert(S0)
				.columns(
					S0.dlv_slip_no,
					S0.dlv_slip_seq
				)
				.values(
					bind("dlv_slip_no"),
					bind("dlv_slip_seq")
				);
			q.executeBatchUpdate(getNoErrCndL());
			
			MSW_DLV_SLIP_KEY_R w1 = MSW_DLV_SLIP_KEY_R.create("W1");
			MST_DLV_SLIP_R w2 = MST_DLV_SLIP_R.create("W2");
			MCTempView v = createTempView("V");
			MST_DLV_SLIP_R t1 = MST_DLV_SLIP_R.create("T1");
			MST_SHIP_INST_R t2 = MST_SHIP_INST_R.create("T2");
			MST_SHIP_ACT_R t3 = MST_SHIP_ACT_R.create("T3");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setSelect(
				t1.dlv_slip_no, t1.dlv_slip_seq,
				t2.ship_inst_no, t2.ship_inst_rev, t3.ship_act_no, t3.ship_act_rev
			);
			bldr.addInnerJoin(
				// 納品書ＮＯ、連番に対応する最新の「出荷」を取得する（出荷基準の売上明細訂正を考慮）
				subQuery()
				.select(
					w2.dlv_slip_no,
					max(w2.dlv_slip_seq).as("dlv_slip_seq")
				)
				.from(
					w1
					.innerJoin(w2).on(
						w2.dlv_slip_no.eq(w1.dlv_slip_no)
						.and(w2.dlv_slip_seq.lte(w1.dlv_slip_seq))
						.and(w2.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
					)
				)
				.groupBy(w2.dlv_slip_no)
				.view(v),
				v.pr("dlv_slip_no").eq(t1.dlv_slip_no).and(v.pr("dlv_slip_seq").eq(t1.dlv_slip_seq))
			);
			bldr.addLeftOuterJoin(t2, t2.ship_inst_no.eq(t1.dlv_slip_inst_no));
			bldr.addLeftOuterJoin(t3, t3.ship_act_no.eq(t1.dlv_slip_act_no));
			
			MCList<MST_DLV_SLIP_R> rsltL = MCList.create(MST_DLV_SLIP_R.class);
			dbSelect("MSBEL5550_MST_DLV_SLIP_S11", rsltL, bldr);
			
			MCList<MST_DLV_SLIP_R> actL = rsltL.distinctNE(MST_SHIP_ACT_R.$ship_act_no, MST_SHIP_ACT_R.$ship_act_rev);
			MCList<MST_DLV_SLIP_R> instL = rsltL.distinctNE(MST_SHIP_INST_R.$ship_inst_no, MST_SHIP_INST_R.$ship_inst_rev);
			if (!actL.isEmpty()) {
				MSW_SHIP_ACT_P_KEY_R S1 = MSW_SHIP_ACT_P_KEY_R.create();
				execDbWkDelete("MSBEL5550_MSW_SHIP_ACT_P_KEY_D01", S1);
				MCInsert q2 = sql("MSBEL5550_MSW_SHIP_ACT_P_KEY_I01")
					.insert(S1)
					.columns(S1.ship_act_no, S1.ship_act_rev)
					.values(
						bind("ship_act_no"),
						bind("ship_act_rev")
					);
				q2.executeBatchUpdate(actL);
			}
			if (!instL.isEmpty()) {
				MSW_SHIP_INST_P_KEY_R S1 = MSW_SHIP_INST_P_KEY_R.create();
				execDbWkDelete("MSBEL5550_MSW_SHIP_INST_P_KEY_D01", S1);
				MCInsert q2 = sql("MSBEL5550_MSW_SHIP_INST_P_KEY_I01")
					.insert(S1)
					.columns(S1.ship_inst_no, S1.ship_inst_rev)
					.values(
						bind("ship_inst_no"),
						bind("ship_inst_rev")
					);
				q2.executeBatchUpdate(instL);
			}
		}
		@Override
		protected void init() {
			super.init();
			_slipPegCols = _pegCols;
		}
		@Override
		protected void crtIdx() {
			super.crtIdx();
			_slipHdrIdx = _hdrIdx;
		}

		@Override
		protected void srchHdr() {
			super.srchHdr();
			// 出荷実績から必要情報を取得する
			_shipHdrL = MCList.create(ShipAdvHdrR.class);
			_shipHdrL.addBooleanColumn("ship_adv_prnt_flg");
			_shipHdrL.addBooleanColumn("cst_iv_flg");
			_shipHdrL.addStringColumn("via_dlv_typ");
			
			MCList<ShipAdvHdrR>
				tmpActL = _shipHdrL.clone(), tmpInstL = _shipHdrL.clone();
			executeQuery(tmpActL, MSBEL5550_MST_SHIP_ACT_S01());
			executeQuery(tmpInstL, MSBEL5550_MST_SHIP_INST_S01());
			_shipHdrL.addAll(tmpActL);
			_shipHdrL.addAll(tmpInstL);
			
			_shipHdrL.addStringColumn("join_key");
			_shipHdrL.forEach(r -> {
				if (!isNull(r.getStringNE("ship_act_no"))) {
					r.setStringNE("join_key", r.getStringNE("ship_act_no") + "_sa");
				}
				else {
					r.setStringNE("join_key", r.getStringNE("ship_inst_no") + "_si");
				}
			});
			
			_hdrL.addStringColumn("join_key");
			_hdrL.forEach(r -> {
				if (!isNull(r.getStringNE("dlv_slip_act_no"))) {
					r.setStringNE("join_key", r.getStringNE("dlv_slip_act_no") + "_sa");
				}
				else {
					r.setStringNE("join_key", r.getStringNE("dlv_slip_inst_no") + "_si");
				}
			});
			
			_jk = _hdrL.join("join_key", _shipHdrL, "join_key");
		}

		@Override
		protected MCJoinKey<MCList<ShipAdvHdrR>> getShipJoinKey() {
			return _jk;
		}

		@Override
		protected String[] getIndivPrntCols() {
			return new String[] { "dlv_slip_no" };
		}

		@Override
		protected String[] getGroupPrntCols() {
			return new String[] { DLV_DEST_TYP, DLV_DEST_CD };
		}

		protected boolean isXfrTrd(ShipAdvHdrR slipAdvHdrR) {
			return isNull(slipAdvHdrR.getStringNE("bp_cd"));
		}

		protected void setAdvIndivPrnt( boolean isBndlPrnt) {

			MCList<ShipAdvHdrR> slipAdvHdrL=getHdrL();
			addIndivTempCol(slipAdvHdrL);

			if (!isBndlPrnt) {
				slipAdvHdrL.setBooleanNE(IS_INDIV_PRNT_STR, true);
			}
			else {
				MCList<ShipAdvHdrR> dlvL = createShipAdvHdrR();
				MCList<ShipAdvHdrR> spplL = createShipAdvHdrR();
				MCList<ShipAdvHdrR> coL = createShipAdvHdrR();

				for (ShipAdvHdrR slipAdvHdrR : slipAdvHdrL) {
					if (isProvTrd(slipAdvHdrR.trd_ptn_typ())) {
						slipAdvHdrR.setStringNE(DLV_DEST_CD, slipAdvHdrR.getString("bp_cd"));
						slipAdvHdrR.setStringNE(DLV_DEST_TYP, DLV_DEST_TYP_PROV);
						spplL.add(slipAdvHdrR);
					}
					else if (isXfrTrd(slipAdvHdrR)) {
						slipAdvHdrR.setStringNE(DLV_DEST_CD, slipAdvHdrR.getString("dlv_id_cd"));
						slipAdvHdrR.setStringNE(DLV_DEST_TYP, DLV_DEST_TYP_CO);
						coL.add(slipAdvHdrR);
					}
					else {
						slipAdvHdrR.setStringNE(DLV_DEST_CD, slipAdvHdrR.getString("dlv_id_cd"));
						slipAdvHdrR.setStringNE(DLV_DEST_TYP, DLV_DEST_TYP_BP);
						dlvL.add(slipAdvHdrR);
					}
				}

				setIndivPrntDlv(dlvL);
				setIndivPrntSppl(spplL);
				setIndivPrntCo(coL);

			}
		}

		protected MCList<ShipAdvHdrR> createShipAdvHdrR() {
			MCList<ShipAdvHdrR> l = MCList.create(ShipAdvHdrR.class);
			addIndivTempCol(l);
			return l;
		}
	}
	/**
	 * 出荷案内書を作成・発行するベースクラス
	 */
	public abstract class ShipAdvBase extends RptBase<MSBER_ShipAdv, ShipAdvHdrR, ShipAdvDtlR, ShipRprt_Prnt01_HdrR> {

		protected ShipAdvBase(MCList<ShipRprt_Prnt01_HdrR> cndL, String[] pegCols) {
			super(cndL, pegCols);
		}

		@Override
		protected MSBER_ShipAdv toRptSet(ShipRprt_Prnt01_HdrR cndR) {
			if (isErr(cndR))	return null;

			// 納品書NOごとに出力
			MCList<ShipAdvHdrR> hdrL = _hdrL.subList(_hdrIdx, cndR.toArray(_hdrIdx.getKeys()));
			MCSortPolicy p = new MCSortPolicy();
			p.add(SortType.ASC, "dlv_slip_no");
			p.add(SortType.DESC, "ship_to_id_typ");
			hdrL.sort(p);

			MCIndexKey idx = _dtlL.createIndex("dlv_slip_no");
			MSBER_ShipAdv rptSet = null;
			for (ShipAdvHdrR hdrR : hdrL) {
				MSBER_ShipAdv rpt = super.toRptSet(hdrR, _dtlL.subList(idx, hdrR.toArray(idx.getKeys())));
				if (rpt != null) {
					if (rptSet == null) {
						rptSet = crtRptSet();
						rptSet.setReportInfo(rpt.getReportInfo());
						rptSet.setAppReportNo1(null);
						rptSet.setAppReportNo2(null);
						rptSet.setAppReportNo3(null);
						rptSet.setAppReportNo4(null);
						rptSet.setPersistent(false);	// まとめ分は永続データとしない
						rptSet.addAll(rpt.getAll());
					}
					else {
						rptSet.addAll(rpt.getAll());
					}
				}
			}
			return rptSet;
		}
		@Override
		protected void init() {
			super.init();
			initCache();
		}
		
		protected void initCache() {
			// 送付先の帳票出力ロケールに対応したマスタをキャッシュする
			
			MCList<ShipAdvHdrR>hdrL = _hdrL.createInstance();
			MCList<ShipAdvDtlR> dtlL = _dtlL.createInstance();
			
			hdrL.addStringColumn(MAM_LG_GRP_R.$lg_grp_cd);
			hdrL.addStringColumn(MAM_BP_R.$prnt_lcl_cd);
			dtlL.addStringColumn(MAM_BP_R.$prnt_lcl_cd);
			
			for (ShipAdvHdrR hdrR : _hdrL) {
				ShipAdvHdrR shipR = hdrR.getJoinedRow(getShipJoinKey());
				
				ShipAdvHdrR hdrWkR = hdrR.clone();
				hdrWkR.ship_to_id_cd(shipR.ship_to_id_cd());
				hdrWkR.inst_dpt_cd(shipR.inst_dpt_cd());
				hdrWkR.inst_usr_cd(shipR.inst_usr_cd());
				hdrWkR.ship_dpt_cd(shipR.ship_dpt_cd());
				hdrWkR.ship_usr_cd(shipR.ship_usr_cd());
				hdrWkR.setStringNE(MAM_BP_R.$prnt_lcl_cd, shipR.getString(MAM_BP_R.$prnt_lcl_cd));
				hdrL.add(hdrWkR);
				
				for (ShipAdvDtlR dtlR : _dtlL.subList(_dtlIdx, hdrR.toArray(_dtlIdx.getKeys()))) {
					ShipAdvDtlR dtlWkR = dtlR.clone();
					dtlWkR.itm_cd(dtlR.getString("dlv_slip_itm_cd"));
					dtlWkR.setStringNE(MAM_BP_R.$prnt_lcl_cd, shipR.getString(MAM_BP_R.$prnt_lcl_cd));
					dtlL.add(dtlWkR);
				}
			}
			
			initDbcCacheTrd(hdrL);
			initDbcCacheLgGrp(hdrL);
			initDbcCacheBp(hdrL);
			initDbcCacheDpt(hdrL);
			initDbcCacheUsr(hdrL);
			initDbcCacheItm(dtlL);
			initDbcCacheUnit(dtlL);
		}
		
		protected FXUCL_MCDbcCache<MAM_TRD_R> _cacheTrd;
		protected FXUCL_MCDbcCache<MAM_TRD_LCL_R> _cacheTrdLcl;
		protected void initDbcCacheTrd(MCList<ShipAdvHdrR> hdrL) {
			MAM_TRD_R t1 = MAM_TRD_R.create("T");
			MCQueryApiBuilder t1Bldr = MCQueryApiBuilder.create(t1);
			t1Bldr.setSelect(
				t1.trd_cd,
				t1.trd_nm
			);
			_cacheTrd = new FXUCL_MCDbcCache<MAM_TRD_R>(t1Bldr, hdrL, ShipAdvHdrR.$trd_cd);
			
			MAM_TRD_LCL_R t2 = MAM_TRD_LCL_R.create("T");
			MCQueryApiBuilder t2Bldr = MCQueryApiBuilder.create(t2);
			t2Bldr.setSelect(
				t2.trd_cd,
				t2.trd_nm,
				t2.lcl_cd
			);
			_cacheTrdLcl = new FXUCL_MCDbcCache<MAM_TRD_LCL_R>(t2Bldr, hdrL, ShipAdvHdrR.$trd_cd, MAM_BP_R.$prnt_lcl_cd);
		}
		protected MAM_TRD_R getCacheTrd(String trdCd, String lclCd) {
			MAM_TRD_LCL_R dbc = _cacheTrdLcl.get(trdCd, lclCd);
			if ( !(isNull(dbc) || dbc.isEmpty()) ) {
				MAM_TRD_R r = MAM_TRD_R.create();
				r.setValuesByName(dbc);
				return r;
			}
			return _cacheTrd.get(trdCd);
		}
		
		protected FXUCL_MCDbcCache<MAM_LG_GRP_R> _cacheLgGrp;
		protected FXUCL_MCDbcCache<MAM_LG_GRP_LCL_R> _cacheLgGrpLcl;
		protected void initDbcCacheLgGrp(MCList<ShipAdvHdrR> hdrL) {
			MAM_LG_GRP_R t1 = MAM_LG_GRP_R.create("T");
			MCQueryApiBuilder t1Bldr = MCQueryApiBuilder.create(t1);
			t1Bldr.setSelect(
				t1.lg_grp_cd,
				t1.lg_grp_nm
			);
			_cacheLgGrp = new FXUCL_MCDbcCache<MAM_LG_GRP_R>(t1Bldr, hdrL, MAM_LG_GRP_R.$lg_grp_cd);
			
			MAM_LG_GRP_LCL_R t2 = MAM_LG_GRP_LCL_R.create("T");
			MCQueryApiBuilder t2Bldr = MCQueryApiBuilder.create(t2);
			t2Bldr.setSelect(
				t2.lg_grp_cd,
				t2.lg_grp_nm,
				t2.lcl_cd
			);
			_cacheLgGrpLcl = new FXUCL_MCDbcCache<MAM_LG_GRP_LCL_R>(t2Bldr, hdrL, MAM_LG_GRP_R.$lg_grp_cd, MAM_BP_R.$prnt_lcl_cd);
		}
		protected MAM_LG_GRP_R getCacheLgGrp(String lgGrpCd, String lclCd) {
			MAM_LG_GRP_LCL_R dbc = _cacheLgGrpLcl.get(lgGrpCd, lclCd);
			if ( !(isNull(dbc) || dbc.isEmpty()) ) {
				MAM_LG_GRP_R r = MAM_LG_GRP_R.create();
				r.setValuesByName(dbc);
				return r;
			}
			return _cacheLgGrp.get(lgGrpCd);
		}
		
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
		protected FXUCL_MCDbcCache<MAM_BP_LCL_R> _cacheBpLcl;
		protected void initDbcCacheBp(MCList<ShipAdvHdrR> hdrL) {
			MAM_BP_R t1 = MAM_BP_R.create("T");
			MCQueryApiBuilder t1Bldr = MCQueryApiBuilder.create(t1);
			t1Bldr.setSelect(
				t1.bp_cd,
				t1.bp_nm,
				t1.bp_alt_nm1,
				t1.bp_alt_nm2,
				t1.bp_alt_nm3,
				t1.bp_alt_nm4,
				t1.prnt_lcl_cd
			);
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(t1Bldr, hdrL, ShipAdvHdrR.$ship_to_id_cd);
			
			MAM_BP_LCL_R t2 = MAM_BP_LCL_R.create("T");
			MCQueryApiBuilder t2Bldr = MCQueryApiBuilder.create(t2);
			t2Bldr.setSelect(
				t2.bp_cd,
				t2.bp_nm,
				t2.bp_alt_nm1,
				t2.bp_alt_nm2,
				t2.bp_alt_nm3,
				t2.bp_alt_nm4,
				t2.lcl_cd
			);
			_cacheBpLcl = new FXUCL_MCDbcCache<MAM_BP_LCL_R>(t2Bldr, hdrL, ShipAdvHdrR.$ship_to_id_cd, MAM_BP_R.$prnt_lcl_cd);
		}
		protected MAM_BP_R getCacheBp(String bpCd, String lclCd) {
			MAM_BP_LCL_R dbc = _cacheBpLcl.get(bpCd, lclCd);
			if ( !(isNull(dbc) || dbc.isEmpty()) ) {
				MAM_BP_R r = MAM_BP_R.create();
				r.setValuesByName(dbc);
				return r;
			}
			return _cacheBp.get(bpCd);
		}
		
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheDpt;
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_LCL_R> _cacheDptLcl;
		protected void initDbcCacheDpt(MCList<ShipAdvHdrR> hdrL) {
			MCList<MAM_DPT_LCL_R> bindL = MCList.create(MAM_DPT_LCL_R.class);
			for (ShipAdvHdrR r : hdrL) {
				String lclCd = r.getString(MAM_BP_R.$prnt_lcl_cd);
				
				MAM_DPT_LCL_R bindR = bindL.add();
				bindR.dpt_cd(r.dpt_cd());
				bindR.lcl_cd(lclCd);
				
				bindR = bindL.add();
				bindR.dpt_cd(r.inst_dpt_cd());
				bindR.lcl_cd(lclCd);
				
				bindR = bindL.add();
				bindR.dpt_cd(r.ship_dpt_cd());
				bindR.lcl_cd(lclCd);
			}
			
			MAM_DPT_R t1 = MAM_DPT_R.create("T");
			MCQueryApiBuilder t1Bldr  = MCQueryApiBuilder.create(t1);
			t1Bldr.setSelect(
				t1.dpt_cd,
				t1.st_dt,
				t1.dpt_nm
			);
			_cacheDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(t1Bldr, bindL, MAM_DPT_R.$dpt_cd);
			
			MAM_DPT_LCL_R t2 = MAM_DPT_LCL_R.create("T");
			MCQueryApiBuilder t2Bldr = MCQueryApiBuilder.create(t2);
			t2Bldr.setSelect(
				t2.dpt_cd,
				t2.st_dt,
				t2.dpt_nm,
				t2.lcl_cd
			);
			_cacheDptLcl = new FXUCL_MCDbcCacheStEnd<MAM_DPT_LCL_R>(t2Bldr, bindL, MAM_DPT_LCL_R.$dpt_cd, MAM_DPT_LCL_R.$lcl_cd);
		}
		protected MAM_DPT_R getCacheDpt(String dptCd, MCDate dt, String lclCd) {
			MAM_DPT_LCL_R dbc = _cacheDptLcl.get(dt, dptCd, lclCd);
			if ( !(isNull(dbc) || dbc.isEmpty()) ) {
				MAM_DPT_R r = MAM_DPT_R.create();
				r.setValuesByName(dbc);
				return r;
			}
			return _cacheDpt.get(dt, dptCd);
		}
		
		protected FXUCL_MCDbcCache<MAM_USR_R> _cacheUsr;
		protected FXUCL_MCDbcCache<MAM_USR_LCL_R> _cacheUsrLcl;
		protected void initDbcCacheUsr(MCList<ShipAdvHdrR> hdrL) {
			MCList<MAM_USR_LCL_R> bindL = MCList.create(MAM_USR_LCL_R.class);
			for (ShipAdvHdrR r : hdrL) {
				String lclCd = r.getString(MAM_BP_R.$prnt_lcl_cd);
				
				MAM_USR_LCL_R bindR = bindL.add();
				bindR.usr_cd(r.usr_cd());
				bindR.lcl_cd(lclCd);
				
				bindR = bindL.add();
				bindR.usr_cd(r.inst_usr_cd());
				bindR.lcl_cd(lclCd);
				
				bindR = bindL.add();
				bindR.usr_cd(r.ship_usr_cd());
				bindR.lcl_cd(lclCd);
			}
			
			MAM_USR_R t1 = MAM_USR_R.create("T");
			MCQueryApiBuilder t1Bldr = MCQueryApiBuilder.create(t1);
			t1Bldr.setSelect(
				t1.usr_cd,
				t1.usr_nm
			);
			_cacheUsr = new FXUCL_MCDbcCache<MAM_USR_R>(t1Bldr, bindL, MAM_USR_R.$usr_cd);
			
			MAM_USR_LCL_R t2 = MAM_USR_LCL_R.create("T");
			MCQueryApiBuilder t2Bldr = MCQueryApiBuilder.create(t2);
			t2Bldr.setSelect(
				t2.usr_cd,
				t2.usr_nm,
				t2.lcl_cd
			);
			_cacheUsrLcl = new FXUCL_MCDbcCache<MAM_USR_LCL_R>(t2Bldr, bindL, MAM_USR_LCL_R.$usr_cd, MAM_USR_LCL_R.$lcl_cd);
		}
		protected MAM_USR_R getCacheUsr(String usrCd, String lclCd) {
			MAM_USR_LCL_R dbc = _cacheUsrLcl.get(usrCd, lclCd);
			if ( !(isNull(dbc) || dbc.isEmpty()) ) {
				MAM_USR_R r = MAM_USR_R.create();
				r.setValuesByName(dbc);
				return r;
			}
			return _cacheUsr.get(usrCd);
		}
		
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm;
		protected FXUCL_MCDbcCache<MAM_ITM_LCL_R> _cacheItmLcl;
		protected void initDbcCacheItm(MCList<ShipAdvDtlR> dtlL) {
			MAM_ITM_R t1 = MAM_ITM_R.create("T");
			MCQueryApiBuilder t1Bldr = MCQueryApiBuilder.create(t1);
			t1Bldr.setSelect(
				t1.itm_cd,
				t1.itm_sub1,
				t1.itm_sub2,
				t1.itm_sub3,
				t1.itm_nm,
				t1.itm_alt_nm1,
				t1.itm_alt_nm2,
				t1.itm_alt_nm3,
				t1.itm_alt_nm4
			);
			_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(t1Bldr, dtlL,
				ShipAdvDtlR.$itm_cd, ShipAdvDtlR.$itm_sub1_data, ShipAdvDtlR.$itm_sub2_data, ShipAdvDtlR.$itm_sub3_data);
			
			MAM_ITM_LCL_R t2 = MAM_ITM_LCL_R.create("T");
			MCQueryApiBuilder t2Bldr = MCQueryApiBuilder.create(t2);
			t2Bldr.setSelect(
				t2.itm_cd,
				t2.itm_sub1,
				t2.itm_sub2,
				t2.itm_sub3,
				t2.itm_nm,
				t2.itm_alt_nm1,
				t2.itm_alt_nm2,
				t2.itm_alt_nm3,
				t2.itm_alt_nm4,
				t2.lcl_cd
			);
			_cacheItmLcl = new FXUCL_MCDbcCache<MAM_ITM_LCL_R>(t2Bldr, dtlL,
				ShipAdvDtlR.$itm_cd, ShipAdvDtlR.$itm_sub1_data, ShipAdvDtlR.$itm_sub2_data, ShipAdvDtlR.$itm_sub3_data, MAM_BP_R.$prnt_lcl_cd);
		}
		protected MAM_ITM_R getCacheItm(String itmCd, String itmSub1, String itmSub2, String itmSub3, String lclCd) {
			MAM_ITM_LCL_R dbc = _cacheItmLcl.get(itmCd, itmSub1, itmSub2, itmSub3, lclCd);
			if ( !(isNull(dbc) || dbc.isEmpty()) ) {
				MAM_ITM_R r = MAM_ITM_R.create();
				r.setValuesByName(dbc);
				return r;
			}
			return _cacheItm.get(itmCd, itmSub1, itmSub2, itmSub3);
		}
		
		protected FXUCL_MCDbcCache<MAM_UNIT_R> _cacheUnit;
		protected FXUCL_MCDbcCache<MAM_UNIT_LCL_R> _cacheUnitLcl;
		protected void initDbcCacheUnit(MCList<ShipAdvDtlR> dtlL) {
			MCList<MAM_UNIT_LCL_R> bindL = MCList.create(MAM_UNIT_LCL_R.class);
			for (ShipAdvDtlR r : dtlL) {
				String lclCd = r.getString(MAM_BP_R.$prnt_lcl_cd);
				
				MAM_UNIT_LCL_R bindR = bindL.add();
				bindR.unit_cd(r.trd_unit_cd());
				bindR.lcl_cd(lclCd);
				
				bindR = bindL.add();
				bindR.unit_cd(r.base_unit_cd());
				bindR.lcl_cd(lclCd);
			}
			
			MAM_UNIT_R t1 = MAM_UNIT_R.create("T");
			MCQueryApiBuilder t1Bldr = MCQueryApiBuilder.create(t1);
			t1Bldr.setSelect(
				t1.unit_cd,
				t1.unit_nm
			);
			_cacheUnit = new FXUCL_MCDbcCache<MAM_UNIT_R>(t1Bldr, bindL, MAM_UNIT_R.$unit_cd);
			
			MAM_UNIT_LCL_R t2 = MAM_UNIT_LCL_R.create("T");
			MCQueryApiBuilder t2Bldr = MCQueryApiBuilder.create(t2);
			t2Bldr.setSelect(
				t2.unit_cd,
				t2.unit_nm,
				t2.lcl_cd
			);
			_cacheUnitLcl = new FXUCL_MCDbcCache<MAM_UNIT_LCL_R>(t2Bldr, bindL, MAM_UNIT_LCL_R.$unit_cd, MAM_UNIT_LCL_R.$lcl_cd);
		}
		protected MAM_UNIT_R getCacheUnit(String unitCd, String lclCd) {
			MAM_UNIT_LCL_R dbc = _cacheUnitLcl.get(unitCd, lclCd);
			if ( !(isNull(dbc) || dbc.isEmpty()) ) {
				MAM_UNIT_R r = MAM_UNIT_R.create();
				r.setValuesByName(dbc);
				return r;
			}
			return _cacheUnit.get(unitCd);
		}
		/**
		 * ワークに登録する
		 */
		@Override
		protected void insWk() {
			MSW_DLV_SLIP_KEY_R S0 = MSW_DLV_SLIP_KEY_R.create();
			execDbWkDelete("MSBEL5550_MSW_DLV_SLIP_KEY_D01", S0);
		}

		@Override
		protected void chk() {
			// 納品伝票、納品伝票明細に対して存在チェックを行う
			for (ShipRprt_Prnt01_HdrR r : getNoErrCndL()) {
				if (isNull(_hdrL.getFirst(_hdrIdx, r.toArray(_pegCols)))) {
					MCMessagePool.addAll(
						getRecordNotFoundMsg("MS", "MST_DLV_SLIP", _pegCols, r.toArray(_pegCols), r));
					r.err_flg(true);
				}
				if (isNull(_dtlL.getFirst(_dtlIdx, r.toArray(_dtlIdx.getKeys())))) {
					MCMessagePool.addAll(
						getRecordNotFoundMsg("MS", "MST_DLV_SLIP_D", _pegCols, r.toArray(_pegCols), r));
					r.err_flg(true);
				}
			}
		}

		@Override
		protected void srchHdr() {
			_hdrL = MCList.create(ShipAdvHdrR.class);
			_hdrL.addBooleanColumn("ship_adv_prnt_flg");
			_hdrL.addBooleanColumn("cst_iv_flg");
			_hdrL.addStringColumn("via_dlv_typ");
			// 添付ファイル情報に設定するための通貨CD。無償支給の場合に「納品伝票ヘッダ.取引通貨」の替わりとして、支給先（取引先マスタ）の通貨を取得する。
			_hdrL.addStringColumn("cur_cd_for_attach");
			_hdrL.addDateColumn("dpt_base_dt");
			executeQuery(_hdrL, MSBEL5550_MST_DLV_SLIP_S01());
		}

		@Override
		protected void srchDtl() {
			_dtlL = MCList.create(ShipAdvDtlR.class);
			MCRow row = MCRow.create();
			row.addStringColumn("not_exists_no_pick", toTrueStr(true));	// ピッキングなしは対象外
			executeQuery(_dtlL, MSBEL5550_MST_DLV_SLIP_D_S01(), row);
		}

		@Override
		protected MSBER_ShipAdv crtRptSet() {
			return MSBER_ShipAdv.create();
		}

		@Override
		protected MSBER_ShipAdv crtRptSet(ShipAdvHdrR hdrR) {
			MSBER_ShipAdv rptSet = super.crtRptSet(hdrR);
			// 標準では指定しない（フォームを提供していないので）
			//rptSet.setLocale(toLocaleFromLclCd(hdrR.getStringNE("prnt_lcl_cd")));

			rptSet.setAppReportNo1(hdrR.dlv_slip_no());
			rptSet.setAppReportNo2(hdrR.dlv_slip_rev().toSimpleString());
			rptSet.setAppReportNo3(hdrR.getNumber("dlv_slip_seq").toSimpleString());
			rptSet.setAppUsrCd1(hdrR.dpt_cd());
			rptSet.setAppUsrNm1(hdrR.dpt_nm());
			rptSet.setAppUsrCd2(hdrR.usr_cd());
			rptSet.setAppUsrNm2(hdrR.usr_nm());
			rptSet.setAppToCd1(hdrR.getString("dlv_id_cd"));
			rptSet.setAppToNm1(hdrR.getString("dlv_id_nm"));
			rptSet.setAppToCd2(hdrR.getString("bp_cd"));
			rptSet.setAppToNm2(hdrR.getString("bp_nm"));
			return rptSet;
		}

		/**
		 * ヘッダと出荷指図または出荷実績とのJOINキーを取得する
		 */
		protected abstract MCJoinKey<MCList<ShipAdvHdrR>> getShipJoinKey();

		@Override
		protected void editHdr(ShipAdvHdrR hdrR, MCList<ShipAdvDtlR> dtlL, MSBER_ShipAdv rptSet) {
			Locale locale = getPrntLocal(rptSet);

			// 納品書とSQLを共有しているので項目名の差異を補完
			hdrR.cst_po_no(hdrR.getString("dlv_slip_po_no"));

			hdrR.prnt_tm(MCDate.now());
			hdrR.co_nm(nvl(hdrR.getString("slo_co_nm"), getCo().co_nm()));
			hdrR.zip_cd(hdrR.getString("slo_co_zip_cd"));
			hdrR.addr1(hdrR.getString("slo_co_addr1"));
			hdrR.addr2(hdrR.getString("slo_co_addr2"));
			hdrR.addr3(hdrR.getString("slo_co_addr3"));
			hdrR.addr4(hdrR.getString("slo_co_addr4"));
			hdrR.addr(concatAddress(hdrR.addr1(), hdrR.addr2(), hdrR.addr3(), hdrR.addr4()));
			hdrR.tel(hdrR.getString("slo_co_tel"));
			hdrR.fax(hdrR.getString("slo_co_fax"));
			hdrR.sub_char1(hdrR.getString("dlv_slip_sub_char1"));
			hdrR.sub_char2(hdrR.getString("dlv_slip_sub_char2"));
			hdrR.sub_char3(hdrR.getString("dlv_slip_sub_char3"));

			ShipAdvHdrR shipR = hdrR.getJoinedRow(getShipJoinKey());
			if (!isNull(shipR)) {
				hdrR.inst_dpt_cd(shipR.inst_dpt_cd());
				hdrR.inst_dpt_nm(shipR.inst_dpt_nm());
				hdrR.inst_usr_cd(shipR.inst_usr_cd());
				hdrR.inst_usr_nm(shipR.inst_usr_nm());
				hdrR.ship_dpt_cd(shipR.ship_dpt_cd());
				hdrR.ship_dpt_nm(shipR.ship_dpt_nm());
				hdrR.ship_usr_cd(shipR.ship_usr_cd());
				hdrR.ship_usr_nm(shipR.ship_usr_nm());
				hdrR.ship_to_id_nm(shipR.ship_to_id_nm());
				hdrR.ship_to_id_alt_nm1(shipR.ship_to_id_alt_nm1());
				hdrR.ship_to_id_alt_nm2(shipR.ship_to_id_alt_nm2());
				hdrR.ship_to_id_alt_nm3(shipR.ship_to_id_alt_nm3());
				hdrR.ship_to_id_alt_nm4(shipR.ship_to_id_alt_nm4());
				hdrR.ship_to_id_cd(shipR.ship_to_id_cd());
				hdrR.ship_to_zip_cd(shipR.ship_to_zip_cd());
				hdrR.ship_to_addr1(shipR.ship_to_addr1());
				hdrR.ship_to_addr2(shipR.ship_to_addr2());
				hdrR.ship_to_addr3(shipR.ship_to_addr3());
				hdrR.ship_to_addr4(shipR.ship_to_addr4());
				hdrR.ship_to_tel(shipR.ship_to_tel());
				hdrR.ship_to_fax(shipR.ship_to_fax());
				hdrR.ship_to_cntct_dpt(shipR.ship_to_cntct_dpt());
				hdrR.ship_to_cntct_psn(shipR.ship_to_cntct_psn());
				hdrR.ship_to_cntct_psn_title(shipR.ship_to_cntct_psn_title());
				hdrR.ship_to_addr(concatAddress(hdrR.ship_to_addr1(), hdrR.ship_to_addr2(), hdrR.ship_to_addr3(), hdrR.ship_to_addr4()));
				hdrR.ship_to_id_typ(shipR.getString("ship_to_id_typ"));
				hdrR.ship_to_cntry_nm(shipR.ship_to_cntry_nm());
				hdrR.cntry_nm(shipR.cntry_nm());
				hdrR.setString("via_dlv_typ", shipR.getString("via_dlv_typ"));
				hdrR.setStringNE("org_ship_to_id_nm", shipR.getString("org_ship_to_id_nm"));
				hdrR.setDateNE(MST_SHIP_INST_R.$ship_inst_tm, shipR.getDateNE(MST_SHIP_INST_R.$ship_inst_tm));

				if (!MSC_DLV_ID_TYP.isLOC(shipR.getString("ship_to_id_typ")) || isProvTrd(hdrR.trd_ptn_typ())) { 
					if (isNull(hdrR.ship_to_cntct_psn_title())) {
						hdrR.ship_to_cntct_psn_title(
							isNull(hdrR.ship_to_cntct_psn()) ? MSC_DLV_SLIP_STR.DEAR1.name() : MSC_DLV_SLIP_STR.DEAR2.name());
					}
				}
			}
			if (!isNull(hdrR.cst_po_no())
				&& (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(hdrR.trd_ptn_typ()))) {
					hdrR.cst_po_no_lbl(MSC_DLV_SLIP_STR.CST_PO_NO.name(locale));
			}
		}

		@Override
		protected void editDtl(ShipAdvHdrR hdrR, MCList<ShipAdvDtlR> dtlL, MSBER_ShipAdv rptSet) {
			// 納品書とSQLを共有しているので項目名の差異を補完
			dtlL.forEach(r -> {
				r.itm_cd(r.getString("dlv_slip_itm_cd"));
				r.itm_nm(r.getString("dlv_slip_itm_nm"));
				r.itm_alt_nm1(r.getString("dlv_slip_itm_alt_nm1"));
				r.itm_alt_nm2(r.getString("dlv_slip_itm_alt_nm2"));
				r.itm_alt_nm3(r.getString("dlv_slip_itm_alt_nm3"));
				r.itm_alt_nm4(r.getString("dlv_slip_itm_alt_nm4"));
				r.cst_po_d_no(r.getString("dlv_slip_po_d_no"));
				r.d_sub_char1(r.getString("dlt_slip_d_sub_char1"));
				r.d_sub_char2(r.getString("dlt_slip_d_sub_char2"));
				r.d_sub_char3(r.getString("dlt_slip_d_sub_char3"));
				if (r.lot_plural_flg()) {
					r.s_lot_plural_flg(MSC_DLV_SLIP_STR.PLURAL.name());
				}
				else if(r.sublot_plural_flg()) {
					r.s_sublot_plural_flg(MSC_DLV_SLIP_STR.PLURAL.name());
				}
			});
			putPrntItmSub1(dtlL, ShipAdvDtlR.$itm_sub1_view, ShipAdvDtlR.$itm_sub1_data);
			putPrntItmSub2(dtlL, ShipAdvDtlR.$itm_sub2_view, ShipAdvDtlR.$itm_sub2_data);
			putPrntItmSub3(dtlL, ShipAdvDtlR.$itm_sub3_view, ShipAdvDtlR.$itm_sub3_data);

			putPrntStr(dtlL, ShipAdvDtlR.$lot_no_view, ShipAdvDtlR.$lot_no_data);
			putPrntStr(dtlL, ShipAdvDtlR.$sublot_no_view, ShipAdvDtlR.$sublot_no_data);

			putNumStr(rptSet, dtlL, ShipAdvDtlR.$s_trd_unit_qty, ShipAdvDtlR.$trd_unit_qty, "trd_unit_dec_place");
			putNumStr(rptSet, dtlL, ShipAdvDtlR.$s_base_unit_qty, ShipAdvDtlR.$base_unit_qty, "base_unit_dec_place");
			putNumStr(rptSet, dtlL, ShipAdvDtlR.$s_int_trd_unit_qty, ShipAdvDtlR.$s_dec_trd_unit_qty, ShipAdvDtlR.$trd_unit_qty, "trd_unit_dec_place");
			putNumStr(rptSet, dtlL, ShipAdvDtlR.$s_int_base_unit_qty, ShipAdvDtlR.$s_dec_base_unit_qty, ShipAdvDtlR.$base_unit_qty, "base_unit_dec_place");
		}

		@Override
		protected boolean isPrnted(ShipAdvHdrR hdrR) {
			return hdrR.getBoolean("ship_adv_prnt_flg");
		}
		@Override
		protected boolean isReprnt() {
			// 発行済の場合、印刷データから再印刷する
			return true;
		}
		@Override
		protected boolean isRegist() {
			// 印刷データは登録する
			return true;
		}
		@Override
		protected boolean isErr(ShipRprt_Prnt01_HdrR cndR) {
			return cndR.err_flg();
		}
		
		@Override
		protected void prnt(MSBER_ShipAdv rptSet, ShipAdvHdrR hdrR, MCList<ShipAdvDtlR> dtlL) {
			editHdr(hdrR, dtlL, rptSet);
			editDtl(hdrR, dtlL, rptSet);
			ShipAdvHdrR shipR = hdrR.getJoinedRow(getShipJoinKey());
			ShipAdvHdrR hdrWkR = hdrR.clone();
			MCList<ShipAdvDtlR> dtlWkL = dtlL.clone();
			setName(hdrWkR, dtlWkL, shipR.getString(MAM_BP_R.$prnt_lcl_cd));
			rptSet.addRow(hdrWkR);
			rptSet.addAll(dtlWkL);
			
			if (MSC_SHIP_TO_ID_TYP.isTDLV(hdrR.ship_to_id_typ())
					&& !hdrR.getBoolean("cst_iv_flg")
					&& MAC_VIA_DLV_TYP.isNOT_VIA(hdrR.getString("via_dlv_typ"))) {
				ShipAdvHdrR dlvR = getDlv(hdrR, dtlL, rptSet);
				rptSet.addRow(dlvR);
				dtlWkL = dtlL.clone();
				setName(dlvR, dtlWkL, dlvR.getString(MAM_BP_R.$prnt_lcl_cd));
				rptSet.addAll(dtlWkL);
			}

			rptSet.setRegister(isRegist());
			if (isRegist()) {
				// 印刷データの登録
				MCServerReportManager.request(rptSet, false);
			}
		}

		protected ShipAdvHdrR getDlv(ShipAdvHdrR hdrR, MCList<ShipAdvDtlR> dtlL, MSBER_ShipAdv rptSet) {
			ShipAdvHdrR dlvR = hdrR.clone();
			
			dlvR.ship_to_id_typ(dlvR.getString("dlv_id_typ"));
			dlvR.ship_to_id_nm(dlvR.getString("dlv_id_nm"));
			dlvR.ship_to_id_cd(dlvR.getString("dlv_id_cd"));
			dlvR.ship_to_zip_cd(dlvR.getString("dlv_zip_cd"));
			dlvR.ship_to_addr1(dlvR.getString("dlv_addr1"));
			dlvR.ship_to_addr2(dlvR.getString("dlv_addr2"));
			dlvR.ship_to_addr3(dlvR.getString("dlv_addr3"));
			dlvR.ship_to_addr4(dlvR.getString("dlv_addr4"));
			dlvR.ship_to_tel(dlvR.getString("dlv_tel"));
			dlvR.ship_to_fax(dlvR.getString("dlv_fax"));
			dlvR.ship_to_cntct_dpt(dlvR.getString("dlv_cntct_dpt"));
			dlvR.ship_to_cntct_psn(dlvR.getString("dlv_cntct_psn"));
			dlvR.ship_to_cntct_psn_title(dlvR.getString("dlv_cntct_psn_title"));
			dlvR.ship_to_addr(concatAddress(dlvR.getString("dlv_addr1"), dlvR.getString("dlv_addr2"), dlvR.getString("dlv_addr3"), dlvR.getString("dlv_addr4")));
			dlvR.setStringNE("org_ship_to_id_nm", dlvR.getString("org_dlv_id_nm"));
			if (MSC_DLV_ID_TYP.isDLV(dlvR.getString("dlv_id_typ"))) {
				MAM_BP_R bpR = _cacheBp.get(dlvR.getString("dlv_id_cd"));
				dlvR.setStringNE(MAM_BP_R.$prnt_lcl_cd, bpR.prnt_lcl_cd());
			}
			else {
				dlvR.setStringNE(MAM_BP_R.$prnt_lcl_cd, null);
			}
			
			if (isNull(dlvR.ship_to_cntct_psn_title())) {
				dlvR.ship_to_cntct_psn_title(
					isNull(dlvR.ship_to_cntct_psn()) ? MSC_DLV_SLIP_STR.DEAR1.name() : MSC_DLV_SLIP_STR.DEAR2.name());
			}
			
			return dlvR;
		}
		protected void setName(ShipAdvHdrR hdrR, MCList<ShipAdvDtlR> dtlL, String lclCd) {
			hdrR.trd_nm(getCacheTrd(hdrR.trd_cd(), lclCd).trd_nm());
			hdrR.inst_dpt_nm(getCacheDpt(hdrR.inst_dpt_cd(), hdrR.getDateNE(MST_SHIP_INST_R.$ship_inst_tm), lclCd).dpt_nm());
			hdrR.inst_usr_nm(getCacheUsr(hdrR.inst_usr_cd(), lclCd).usr_nm());
			hdrR.ship_dpt_nm(getCacheDpt(hdrR.ship_dpt_cd(), hdrR.ship_dt(), lclCd).dpt_nm());
			hdrR.ship_usr_nm(getCacheUsr(hdrR.ship_usr_cd(), lclCd).usr_nm());
			hdrR.lg_grp_nm(getCacheLgGrp(hdrR.getString(MAM_LG_GRP_R.$lg_grp_cd), lclCd).lg_grp_nm());
			if (isNull(hdrR.getString("org_ship_to_id_nm"))) {
				if (!MSC_SHIP_TO_ID_TYP.isLOC(hdrR.getString("ship_to_id_typ"))) {
					MAM_BP_R bpR = getCacheBp(hdrR.ship_to_id_cd(), lclCd);
					hdrR.ship_to_id_nm(bpR.bp_nm());
					hdrR.ship_to_id_alt_nm1(bpR.bp_alt_nm1());
					hdrR.ship_to_id_alt_nm2(bpR.bp_alt_nm2());
					hdrR.ship_to_id_alt_nm3(bpR.bp_alt_nm3());
					hdrR.ship_to_id_alt_nm4(bpR.bp_alt_nm4());
				}
			}
			hdrR.co_nm(nvl(getCoNm(lclCd), getCo().co_nm()));
			hdrR.dpt_nm(getCacheDpt(hdrR.dpt_cd(), hdrR.getDateNE("dpt_base_dt"), lclCd).dpt_nm());
			hdrR.usr_nm(getCacheUsr(hdrR.usr_cd(), lclCd).usr_nm());
			
			for (ShipAdvDtlR r : dtlL) {
				if (isNull(r.getString("org_itm_nm"))) {
					MAM_ITM_R itmR = getCacheItm(r.itm_cd(), r.itm_sub1_data(), r.itm_sub2_data(), r.itm_sub3_data(), lclCd);
					r.itm_nm(itmR.itm_nm());
					r.itm_alt_nm1(itmR.itm_alt_nm1());
					r.itm_alt_nm2(itmR.itm_alt_nm2());
					r.itm_alt_nm3(itmR.itm_alt_nm3());
					r.itm_alt_nm4(itmR.itm_alt_nm4());
				}
				r.trd_unit_nm(getCacheUnit(r.trd_unit_cd(), lclCd).unit_nm());
				r.base_unit_nm(getCacheUnit(r.base_unit_cd(), lclCd).unit_nm());
			}
		}
	}


//// 納品伝票
	/**
	 * 納品伝票を作成・発行するクラス<br>
	 * 当クラスでは納品伝票NO、納品伝票連番単位に納品伝票を扱う
	 */
	public class DlvSlipBySlip extends DlvSlipBase {
		protected DlvSlipBySlip(MCList<ShipRprt_Prnt01_HdrR> cndL) {
			super(cndL, new String[]{"dlv_slip_no", "dlv_slip_seq"});
			init();
		}
		@Override
		protected void insWk() {
			super.insWk();
			MSW_DLV_SLIP_KEY_R S0 = MSW_DLV_SLIP_KEY_R.create();
			MCInsert q = sql("MSBEL5550_MSW_DLV_SLIP_KEY_I03")
				.insert(S0)
				.columns(
					S0.dlv_slip_no,
					S0.dlv_slip_seq
				)
				.values(
					bind("dlv_slip_no"),
					bind("dlv_slip_seq")
				);
			q.executeBatchUpdate(getNoErrCndL());
		}
		@Override
		protected void init() {
			super.init();
			_slipPegCols = _pegCols;
		}
		@Override
		protected void crtIdx() {
			super.crtIdx();
			_slipHdrIdx = _hdrIdx;
		}

		@Override
		protected String[] getIndivPrntCols() {
			return new String[] { "dlv_slip_no" };
		}

		@Override
		protected String[] getGroupPrntCols() {
			return new String[] { DLV_DEST_TYP, DLV_DEST_CD };
		}

		protected boolean isXfrTrd(DlvSlipHdrR slipHdrR) {
			return isNull(slipHdrR.getStringNE("bp_cd"));
		}

		protected void setSlipIndivPrnt(boolean isBndlPrnt) {

			MCList<DlvSlipHdrR> slipHdrL=getHdrL();
			addIndivTempCol(slipHdrL);

			if (!isBndlPrnt) {
				slipHdrL.setBooleanNE(IS_INDIV_PRNT_STR, true);
			}
			else {
				MCList<DlvSlipHdrR> cstL = createDlvSlipHdrR();
				MCList<DlvSlipHdrR> spplL = createDlvSlipHdrR();
				MCList<DlvSlipHdrR> coL = createDlvSlipHdrR();

				for (DlvSlipHdrR slipHdrR : slipHdrL) {
					if (isProvTrd(slipHdrR.trd_ptn_typ())) {
						slipHdrR.setStringNE(DLV_DEST_CD, slipHdrR.getString("bp_cd"));
						slipHdrR.setStringNE(DLV_DEST_TYP, DLV_DEST_TYP_PROV);
						spplL.add(slipHdrR);
					}
					else if (isXfrTrd(slipHdrR)) {
						slipHdrR.setStringNE(DLV_DEST_CD, slipHdrR.getString("dlv_id_cd"));
						slipHdrR.setStringNE(DLV_DEST_TYP, DLV_DEST_TYP_CO);
						coL.add(slipHdrR);
					}
					else {
						slipHdrR.setStringNE(DLV_DEST_CD, slipHdrR.getString("bp_cd"));
						slipHdrR.setStringNE(DLV_DEST_TYP, DLV_DEST_TYP_BP);
						cstL.add(slipHdrR);
					}
				}

				setIndivPrntCst(cstL);
				setIndivPrntSppl(spplL);
				setIndivPrntCo(coL);

			}
		}

		protected MCList<DlvSlipHdrR> createDlvSlipHdrR() {
			MCList<DlvSlipHdrR> l = MCList.create(DlvSlipHdrR.class);
			addIndivTempCol(l);
			return l;
		}
	}

	/**
	 * 納品伝票を作成・発行するベースクラス
	 */
	public abstract class DlvSlipBase extends RptBase<MSBER_DlvSlip, DlvSlipHdrR, DlvSlipDtlR, ShipRprt_Prnt01_HdrR> {

		/** EIAJ納品書バーコード用半角スペース */
		String _SP = " ";

		protected MCDate _prntHm = MCDate.now();
		protected MCIndexKey _cndIdx = null;
		
		protected DlvSlipBase(MCList<ShipRprt_Prnt01_HdrR> cndL, String[] pegCols) {
			super(cndL, pegCols);
			_cndIdx = cndL.createIndex(ShipRprt_Prnt01_HdrR.$dlv_slip_no, ShipRprt_Prnt01_HdrR.$dlv_slip_seq);
		}

		/**
		 * 控えの帳票を発行するか
		 */
		protected boolean _isPrntSubForm = false;
		protected void setPrntSubForm(boolean boo) {
			_isPrntSubForm = boo;
		}
		
		/**
		 * 再発行の帳票情報を保持する
		 */
		protected Set<List<String>> _rePrntDlvSlipSet = new HashSet<List<String>>();

		@Override
		protected void execPrnt() {

			MCIndexKey idx = _cndL.createIndex(_slipPegCols);

			// 帳票フォームが同じ納品伝票をまとめて発行する
			for (MCList<DlvSlipHdrR> hdrL :groupList(_hdrL)) {
				MCList<ShipRprt_Prnt01_HdrR> cndL = MCList.create(ShipRprt_Prnt01_HdrR.class);
				for (DlvSlipHdrR hdrR :hdrL) {
					ShipRprt_Prnt01_HdrR dlvCndR = _cndL.getFirst(idx, hdrR.toArray(_slipPegCols)).clone();
					dlvCndR.dlv_slip_no(hdrR.dlv_slip_no());
					dlvCndR.dlv_slip_seq(hdrR.dlv_slip_seq());
					dlvCndR.trn_typ(null);
					dlvCndR.dlv_slip_act_no(null);
					dlvCndR.dlv_slip_inst_no(null);
					cndL.add(dlvCndR);
				}
				// 主帳票を発行
				setPrntSubForm(false);
				super.execPrnt(cndL);

				// 控えの帳票を発行
				setPrntSubForm(true);
				super.execPrnt(cndL);
			}
		}
		@Override
		protected void execPrnt(MCList<ShipRprt_Prnt01_HdrR> cndL) {
			MCList<DlvSlipHdrR> slipL = MCList.create(DlvSlipHdrR.class);
			cndL.forEach(r -> {
				slipL.addAll(_hdrL.subList(_slipHdrIdx, r.toArray(_slipPegCols)));
			});
			MCIndexKey idx = _cndL.createIndex(_slipPegCols);
		
			// 帳票フォームが同じ納品伝票をまとめて発行する
			for (MCList<DlvSlipHdrR> hdrL : groupList(slipL)) {
				MCList<ShipRprt_Prnt01_HdrR> wkCndL = MCList.create(ShipRprt_Prnt01_HdrR.class);
				for (DlvSlipHdrR hdrR :hdrL) {
					ShipRprt_Prnt01_HdrR dlvCndR = _cndL.getFirst(idx, hdrR.toArray(_slipPegCols)).clone();
					dlvCndR.dlv_slip_no(hdrR.dlv_slip_no());
					dlvCndR.dlv_slip_seq(hdrR.dlv_slip_seq());
					dlvCndR.trn_typ(null);
					dlvCndR.dlv_slip_act_no(null);
					dlvCndR.dlv_slip_inst_no(null);
					dlvCndR.onr_prov_flg(MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isPROV_RTN(hdrR.trd_ptn_typ()) ? true : false);
					dlvCndR.addBooleanColumn("indiv_prnt_flg");
					dlvCndR.setBooleanNE("indiv_prnt_flg", hdrR.getBooleanNE("indiv_prnt_flg"));
					wkCndL.add(dlvCndR);
				}
				// 主帳票を発行
				setPrntSubForm(false);
				super.execPrntEx(wkCndL);
				// 控えの帳票を発行
				setPrntSubForm(true);
				super.execPrnt(wkCndL);
			}
		}

		@Override
		protected void execPrnt(ShipRprt_Prnt01_HdrR cndR) {
			// 帳票フォームが同じ納品伝票をまとめて発行する
			for (MCList<DlvSlipHdrR> hdrL :groupList(_hdrL.subList(_slipHdrIdx, cndR.toArray(_slipPegCols)))) {
				MCList<ShipRprt_Prnt01_HdrR> cndL = MCList.create(ShipRprt_Prnt01_HdrR.class);
				for (DlvSlipHdrR hdrR :hdrL) {
					ShipRprt_Prnt01_HdrR dlvCndR = cndR.clone();
					dlvCndR.dlv_slip_no(hdrR.dlv_slip_no());
					dlvCndR.dlv_slip_seq(hdrR.dlv_slip_seq());
					dlvCndR.trn_typ(null);
					dlvCndR.dlv_slip_act_no(null);
					dlvCndR.dlv_slip_inst_no(null);
					cndL.add(dlvCndR);
				}
				// 主帳票を発行
				setPrntSubForm(false);
				super.execPrnt(cndL);

				// 控えの帳票を発行
				setPrntSubForm(true);
				super.execPrnt(cndL);
			}
		}

		@Override
		protected void execPrntExSub(List<MSBER_DlvSlip> arr, MCList<ShipRprt_Prnt01_HdrR> cndL) {
			
			List<MCReportSet> rptSetList = new ArrayList();
			if(cndL.get(0).getBooleanNE("indiv_prnt_flg")){
				for(MSBER_DlvSlip r : arr) {
					MSBER_DlvSlip rptSet = crtRptSet();
					rptSet.setReportInfo(r.getReportInfo());
					rptSet.setAppReportNo1(null);
					rptSet.setAppReportNo2(null);
					rptSet.setAppReportNo3(null);
					rptSet.setAppReportNo4(null);
					rptSet.addAll(r.getAll());
					
					rptSet.addWriteListener(new FileWriteListener(rptSetList));
					MCServerReportManager.requestImmediate(rptSet);
				}
			}else{
				super.execPrntExSub(arr,cndL);
			}
			
			//添付帳票登録サービス（更新）の呼び出し
			if(!rptSetList.isEmpty()) {
				callDlvSlipAttachSrv(rptSetList);
			}
		}

		protected MCList<DlvSlipHdrR>[] groupList(MCList<DlvSlipHdrR> lst) {
			MCList<DlvSlipHdrR>[] arr = lst.groupList("slip_form_id", "copy_slip_form_id");

			for (int i=0; i<arr.length; i++) {
				arr[i].sort(DlvSlipHdrR.$dlv_slip_no);
			}
			Arrays.sort(arr, new Comparator<MCList<DlvSlipHdrR>>() {
				public int compare(MCList<DlvSlipHdrR> o1, MCList<DlvSlipHdrR> o2) {
					return o1.get(0).dlv_slip_no().compareTo(o2.get(0).dlv_slip_no());
				}
			});

			return arr;
		}

		@Override
		protected MSBER_DlvSlip toRptSet(ShipRprt_Prnt01_HdrR cndR) {
			if (isErr(cndR))	return null;

			// 納品書NO、伝票状況区分ごとに出力（取消、新規の順）
			MCList<DlvSlipHdrR> hdrL = _hdrL.subList(_hdrIdx, cndR.toArray(_hdrIdx.getKeys()));
			MCSortPolicy p = new MCSortPolicy();
			p.add(SortType.ASC, "dlv_slip_no");
			p.add(SortType.ASC, "dlv_slip_seq");
			hdrL.sort(p);

			MCIndexKey idx = _dtlL.createIndex("dlv_slip_no", "dlv_slip_seq");
			MSBER_DlvSlip rptSet = null;
			for (DlvSlipHdrR hdrR : hdrL) {
				if (_isPrntSubForm && isNull(hdrR.getStringNE("copy_slip_form_id"))) {
					// 控えの帳票が設定されてない場合は無視
					continue;
				}
				//super.toRptSetから呼出される後続処理で発行済みフラグが更新される場合があるため
				//呼出前に発行済みかどうかのフラグを保持しておく
				Boolean isRptPrnted = isPrnted(hdrR);
				MSBER_DlvSlip rpt = super.toRptSet(hdrR, _dtlL.subList(idx, hdrR.toArray(idx.getKeys())));
				if (rpt != null) {
					if(isRptPrnted) {
						addReprntSetKey(_rePrntDlvSlipSet, rpt);
					}
					if (rptSet == null) {
						rptSet = crtRptSet();
						rptSet.setReportInfo(rpt.getReportInfo());
						rptSet.setAppReportNo1(null);
						rptSet.setAppReportNo2(null);
						rptSet.setAppReportNo3(null);
						rptSet.setAppReportNo4(null);
						rptSet.setPersistent(false);	// まとめ分は永続データとしない
						rptSet.addAll(rpt.getAll());
					}
					else {
						rptSet.addAll(rpt.getAll());
					}
				}
			}
			return rptSet;
		}

		@Override
		protected void insWk() {
			MSW_DLV_SLIP_KEY_R S0 = MSW_DLV_SLIP_KEY_R.create();
			execDbWkDelete("MSBEL5550_MSW_DLV_SLIP_KEY_D02", S0);
		}

		@Override
		protected void chk() {
			// 納品伝票、納品伝票明細に対して存在チェックを行う
			// チェック時のキーが伝票発行時と異なるので個別に実装する（伝票状況区分はチェックでは不要）
			MCIndexKey
				hdrIdx = _hdrL.createIndex(_pegCols[0], _pegCols[1]),
				dtlIdx = _dtlL.createIndex(_pegCols[0], _pegCols[1]);
			for (ShipRprt_Prnt01_HdrR r : getNoErrCndL()) {
				DlvSlipHdrR hdrR = _hdrL.getFirst(hdrIdx, r.toArray(hdrIdx.getKeys()));
				if (isNull(hdrR)) {
					MCMessagePool.addAll(
						getRecordNotFoundMsg(
							"MS", "MST_DLV_SLIP", hdrIdx.getKeys(), r.toArray(hdrIdx.getKeys()), r));
					r.err_flg(true);
				}
				else if (isNull(hdrR.getString("slip_form_id"))) {
					MCMessagePool.add(
						new MCMessage(r, null, MSBEL0198, hdrR.getString("bp_cd"), hdrR.trd_cd()));
					r.err_flg(true);
				}
				if (isNull(_dtlL.getFirst(dtlIdx, r.toArray(dtlIdx.getKeys())))) {
					MCMessagePool.addAll(
						getRecordNotFoundMsg(
							"MS", "MST_DLV_SLIP_D", dtlIdx.getKeys(), r.toArray(dtlIdx.getKeys()), r));
					r.err_flg(true);
				}
			}
		}

		/**
		 * 発行対象の納品伝票ヘッダを取得する
		 */
		@Override
		protected void srchHdr() {
			_hdrL = MCList.create(DlvSlipHdrR.class);
			_hdrL.addBooleanColumn("slip_prnt_flg");
			_hdrL.addBooleanColumn("sls_prnt_flg");
			_hdrL.addBooleanColumn("pri_prnt_flg");
			_hdrL.addBooleanColumn("slip_prnted_flg");

			executeQuery(_hdrL, MSBEL5550_MST_DLV_SLIP_S01());
		}

		/**
		 * 発行対象の納品伝票明細を取得する
		 */
		@Override
		protected void srchDtl() {
			_dtlL = MCList.create(DlvSlipDtlR.class);
			_dtlL.addStringColumn("proc_typ");
			_dtlL.addBooleanColumn("sls_cststk_flg");
			executeQuery(_dtlL, MSBEL5550_MST_DLV_SLIP_D_S01());
		}

		@Override
		protected MSBER_DlvSlip crtRptSet() {
			return MSBER_DlvSlip.create();
		}

		/**
		 * 印刷情報(納品伝票)を設定する
		 */
		@Override
		protected MSBER_DlvSlip crtRptSet(DlvSlipHdrR hdrR) {
			MSBER_DlvSlip rptSet = super.crtRptSet(hdrR);
			rptSet.setReportID(_isPrntSubForm ? hdrR.getString("copy_slip_form_id") : hdrR.getString("slip_form_id"));
			// 標準では指定しない（フォームを提供していないので）
			//rptSet.setLocale(toLocaleFromLclCd(hdrR.getStringNE("prnt_lcl_cd")));
			rptSet.setAppReportNo1(hdrR.dlv_slip_no());
			rptSet.setAppReportNo2(hdrR.dlv_slip_rev().toSimpleString());
			rptSet.setAppReportNo3(hdrR.dlv_slip_seq().toSimpleString());
			ShipRprt_Prnt01_HdrR cndR = _cndL.getFirst(_cndIdx, hdrR.dlv_slip_no(), hdrR.dlv_slip_seq());
			if (cndR != null && cndR.enf_pri_prnt_flg()) {
				rptSet.setAppReportNo4(MCBooleanUtil.booleanToDBString(true));
			}
			else {
				rptSet.setAppReportNo4(MCBooleanUtil.booleanToDBString(hdrR.getBoolean("pri_prnt_flg")));
			}
			rptSet.setAppUsrCd1(hdrR.dpt_cd());
			rptSet.setAppUsrNm1(hdrR.dpt_nm());
			rptSet.setAppUsrCd2(hdrR.usr_cd());
			rptSet.setAppUsrNm2(hdrR.usr_nm());
			rptSet.setAppToCd1(hdrR.dlv_id_cd());
			rptSet.setAppToNm1(hdrR.dlv_id_nm());
			rptSet.setAppToCd2(hdrR.getString("bp_cd"));
			rptSet.setAppToNm2(hdrR.getString("bp_nm"));
	
			return rptSet;
		}
	
		/**
		 * 納品伝票ヘッダを編集する
		 */
		@Override
		protected void editHdr(DlvSlipHdrR hdrR, MCList<DlvSlipDtlR> dtlL, MSBER_DlvSlip rptSet) {
			Locale locale = getPrntLocal(rptSet);

			hdrR.print_hm(_prntHm);
	
			String title = MAC_TRD_PTN_TYP.slip_title_typ(hdrR.trd_ptn_typ());
			hdrR.formtitle(MAC_SLIP_TITLE_TYP.get(title).name(locale));
			hdrR.slo_co_cd(getCo().co_cd());
			hdrR.slo_std_co_cd(getCo().std_co_cd());
			hdrR.slo_co_nm(nvl(hdrR.slo_co_nm(), getCo().co_nm()));
			hdrR.slo_co_addr(concatAddress(hdrR.slo_co_addr1(), hdrR.slo_co_addr2(), hdrR.slo_co_addr3(), hdrR.slo_co_addr4()));
			hdrR.po_co_addr(concatAddress(hdrR.po_co_addr1(), hdrR.po_co_addr2(), hdrR.po_co_addr3(), hdrR.po_co_addr4()));
			hdrR.eiaj_dlv_slip_po_no(hdrR.dlv_slip_po_no());
			hdrR.biz_co_no(getCo().biz_co_no());

			//出荷時納品書NOラベル
			if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())
				&& !isPurcDdlv(hdrR, dtlL) && !isCststk(hdrR, dtlL)) {
				hdrR.ship_dlv_slip_no_lbl(MSC_DLV_SLIP_STR.SHIP_DLV_SLIP_NO.name(locale));
			}
			if (!isNull(hdrR.dlv_slip_po_no())
				&& (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_DSCNT(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_XTRA(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_RTN(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_CNSGN(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(hdrR.trd_ptn_typ()))) {
					hdrR.dlv_slip_po_no_lbl(MSC_DLV_SLIP_STR.CST_PO_NO.name(locale));
			}
			if (!isNull(hdrR.slip_sts_typ())) {
				// 未発行の新規は表示せず、既に発行済みの伝票がある新規は「訂正」、取消は「取消」と表示、無効は「無効」と表示
				if (MAC_SLIP_STS_TYP.isCRT(hdrR.slip_sts_typ())) {
					if (hdrR.getBooleanNE("slip_prnted_flg")) {
						hdrR.slip_sts_typ_nm(MSC_DLV_SLIP_STR.UPD.name(locale));
					}
				}
				else if (MAC_SLIP_STS_TYP.isCAN(hdrR.slip_sts_typ())) {
					hdrR.slip_sts_typ_nm(MSC_DLV_SLIP_STR.CAN.name(locale));
				}
				else if (MAC_SLIP_STS_TYP.isDIS(hdrR.slip_sts_typ())) {
					hdrR.slip_sts_typ_nm(MSC_DLV_SLIP_STR.DIS.name(locale));
				}
			}

			hdrR.ttl_trd_cur_tax_amt(hdrR.getNumber("trd_cur_tax_amt"));
			hdrR.ttl_trd_cur_amt(hdrR.getNumber("trd_cur_amt"));
			hdrR.ttl_trd_cur_tax_in_amt(hdrR.getNumber("trd_cur_tax_in_amt"));
			hdrR.ttl_trd_cur_dscnt_amt(hdrR.getNumber("trd_cur_dscnt_amt"));
			putNumStr(rptSet, hdrR, DlvSlipHdrR.$s_ttl_trd_cur_tax_amt, DlvSlipHdrR.$ttl_trd_cur_tax_amt, hdrR.getNumber("amt_dec_place"));
			putNumStr(rptSet, hdrR, DlvSlipHdrR.$s_ttl_trd_cur_amt, DlvSlipHdrR.$ttl_trd_cur_amt, hdrR.getNumber("amt_dec_place"));
			putNumStr(rptSet, hdrR, DlvSlipHdrR.$s_ttl_trd_cur_tax_in_amt, DlvSlipHdrR.$ttl_trd_cur_tax_in_amt, hdrR.getNumber("amt_dec_place"));
			putNumStr(rptSet, hdrR, DlvSlipHdrR.$s_ttl_trd_cur_dscnt_amt, DlvSlipHdrR.$ttl_trd_cur_dscnt_amt, hdrR.getNumber("amt_dec_place"));

			// 出荷日・出荷元の編集
			if(MAC_TRD_PTN_TYP.isSLS_DSCNT(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_XTRA(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_CNSGN(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_RTN(hdrR.trd_ptn_typ())) {
				// 返品・値引き・値増しは出荷日でなく計上日を表示
				hdrR.ship_dt_lbl(MSC_DLV_SLIP_STR.AC_DT.name(locale));
				hdrR.ship_dt(hdrR.ac_dt());
				
				// 返品・値引き・値増しは出荷元を表示しない
				hdrR.lg_grp_nm(null);
			}
			else {
				hdrR.ship_dt_lbl(MSC_DLV_SLIP_STR.SHIP_DT.name(locale));
				if (isPurcDdlv(hdrR, dtlL)) {
					// 仕入直送は出荷元を表示しない
					hdrR.lg_grp_lbl(null);
					hdrR.lg_grp_nm(null);
				}
				else {
					hdrR.lg_grp_lbl(MSC_DLV_SLIP_STR.LG_GRP.name(locale));
				}
			}
			// 納品日の編集
			if(MAC_TRD_PTN_TYP.isSLS_DSCNT(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_XTRA(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_RTN(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_CNSGN(hdrR.trd_ptn_typ())) {
				// 貸出売上・返品・値引き・値増しは納品日を表示しない
				hdrR.dlv_dt(null);
			}
			else {
				hdrR.dlv_dt_lbl(MSC_DLV_SLIP_STR.DLV_DT.name(locale));
			}

			// 納品先の編集
			if(MAC_TRD_PTN_TYP.isSLS_DSCNT(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_XTRA(hdrR.trd_ptn_typ())) {
				// 値引き・値増しは納品先を得意先にし、得意先の住所を納品書に表示する
				hdrR.dlv_id_typ(MSC_DLV_ID_TYP.DLV.value());
				hdrR.dlv_id_cd(hdrR.getString("bp_cd"));
				hdrR.dlv_id_nm(hdrR.getString("bp_nm"));
				hdrR.dlv_zip_cd(hdrR.getString("bp_zip_cd"));
				hdrR.dlv_addr1(hdrR.getString("bp_addr1"));
				hdrR.dlv_addr2(hdrR.getString("bp_addr2"));
				hdrR.dlv_addr3(hdrR.getString("bp_addr3"));
				hdrR.dlv_addr4(hdrR.getString("bp_addr4"));
				hdrR.dlv_tel(hdrR.getString("bp_tel"));
				hdrR.dlv_fax(hdrR.getString("bp_fax"));
				hdrR.dlv_cntct_dpt(hdrR.getString("bp_cntct_dpt"));
				hdrR.dlv_cntct_psn(hdrR.getString("bp_cntct_psn"));
				hdrR.dlv_cntct_psn_title(hdrR.getString("bp_cntct_psn_title"));
				hdrR.dlv_lbl(MSC_DLV_SLIP_STR.CST.name(locale));
			}
			else if (MAC_TRD_PTN_TYP.isPROV_RTN(hdrR.trd_ptn_typ())) {
				hdrR.dlv_lbl(MSC_DLV_SLIP_STR.DLV.name(locale));
				// 支給返品の場合は納品先に出荷場所を出力する
				hdrR.dlv_zip_cd(hdrR.getString("ship_loc_zip_cd"));
				hdrR.dlv_addr1(hdrR.getString("ship_loc_addr1"));
				hdrR.dlv_addr2(hdrR.getString("ship_loc_addr2"));
				hdrR.dlv_addr3(hdrR.getString("ship_loc_addr3"));
				hdrR.dlv_addr4(hdrR.getString("ship_loc_addr4"));
				hdrR.dlv_tel(hdrR.getString("ship_loc_tel"));
				hdrR.dlv_fax(hdrR.getString("ship_loc_fax"));
				// 納品先部署、担当者、敬称はSQLで取得したdlv_xxxを使用する
			}
			else {
				hdrR.dlv_lbl(MSC_DLV_SLIP_STR.DLV.name(locale));
			}
			hdrR.dlv_addr(concatAddress(hdrR.dlv_addr1(), hdrR.dlv_addr2(), hdrR.dlv_addr3(), hdrR.dlv_addr4()));

			if (!MSC_DLV_ID_TYP.isLOC(hdrR.dlv_id_typ()) || isProvTrd(hdrR.trd_ptn_typ())) { 
				if (isNull(hdrR.dlv_cntct_psn_title())) {
					hdrR.dlv_cntct_psn_title(
						isNull(hdrR.dlv_cntct_psn()) ? MSC_DLV_SLIP_STR.DEAR1.name() : MSC_DLV_SLIP_STR.DEAR2.name());
				}
			}
			
			// 発注者担当者敬称
			hdrR.po_co_cntct_psn_title(hdrR.getString("bp_cntct_psn_title"));
			if (isNull(hdrR.po_co_cntct_psn_title())) {
				hdrR.po_co_cntct_psn_title(
						isNull(hdrR.po_co_cntct_psn()) ? MSC_DLV_SLIP_STR.DEAR1.name() : MSC_DLV_SLIP_STR.DEAR2.name());
			}

			// 得意先ラベル
			if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_CNSGN(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_RTN(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(hdrR.trd_ptn_typ())) {
				hdrR.cst_lbl(MSC_DLV_SLIP_STR.CST.name(locale));
			}
			else {
				hdrR.cst_lbl(hdrR.dlv_lbl());
			}

			if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_CNSGN(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS_RTN(hdrR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(hdrR.trd_ptn_typ())) {
				hdrR.sls_flg(true);
			}

			// 強制的に価格印字する場合の編集
			ShipRprt_Prnt01_HdrR cndR = _cndL.getFirst(_cndIdx, hdrR.dlv_slip_no(), hdrR.dlv_slip_seq());
			if (cndR != null && cndR.enf_pri_prnt_flg()) {
				hdrR.setBooleanNE("pri_prnt_flg", true);
			}

			// 納品伝票の発行済みフラグ更新用
			if (isNull(hdrR.getStringNE("copy_slip_form_id")) || _isPrntSubForm) {	// 控えのタイミングで設定する
				hdrR.setBooleanNE(MST_DLV_SLIP_R.$slip_prnt_flg, true);
				if (cndR != null && cndR.sls_prnt_flg()) {
					hdrR.setBooleanNE(MST_DLV_SLIP_R.$sls_prnt_flg, true);
				}
			}

			if (isProvTrd(hdrR.trd_ptn_typ())) {
				hdrR.prov_flg(true);
				hdrR.dlv_id_typ(MSC_DLV_ID_TYP.DLV.value());
				hdrR.dlv_id_cd(hdrR.getString("bp_cd"));
				hdrR.dlv_id_nm(hdrR.getString("bp_nm"));
			}

			// 税計算区分＝伝票単位　且つ　支給、支給返品の場合
			if (MAC_TAX_CALC_TYP.isSLIP(hdrR.getStringNE("tax_calc_typ"))
					&& (MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isPROV_RTN(hdrR.trd_ptn_typ()))) {
				if (getCo().base_cur_cd().equals(hdrR.trd_cur_cd())
						|| (isNull(hdrR.trd_cur_cd()))) {
					hdrR.xrate_lbl(null);
					hdrR.xrate(null);
				}
				else {
					// 外貨の場合
					hdrR.xrate_lbl(MSC_DLV_SLIP_STR.XRATE.name(locale));
					hdrR.ttl_ex_trd_cur_tax_amt(hdrR.getNumber("base_cur_tax_amt"));
					putNumStr(rptSet, hdrR, DlvSlipHdrR.$s_ttl_ex_trd_cur_tax_amt, DlvSlipHdrR.$ttl_ex_trd_cur_tax_amt, hdrR.getNumber("amt_dec_place"));
					hdrR.base_cur_nm(getBaseCur().cur_nm());
				}

				DlvSlipDtlR taxR = dtlL.get(0);
				if (!isNull(taxR.tax_rate())) {
					hdrR.tax_rate_lbl(taxR.tax_rate() + MSC_DLV_SLIP_STR.TAX_TGT.name(locale));
				}
				else {
					hdrR.tax_rate_lbl(null);
				}
				hdrR.trd_cur_nm2(hdrR.trd_cur_nm());

				// 金額非表示の場合
				if (isNull(hdrR.ttl_trd_cur_amt())) {
					hdrR.formtitle(MAC_SLIP_TITLE_TYP.get(MAC_SLIP_TITLE_TYP.DLV_SLIP.value()).name(locale));
					hdrR.xrate_lbl(null);
					hdrR.xrate(null);
					hdrR.tax_rate_lbl(null);
					hdrR.trd_cur_nm(null);
					hdrR.trd_cur_nm2(null);
					hdrR.base_cur_nm(null);
				}

				putNumStr(rptSet, hdrR, DlvSlipHdrR.$s_ttl_trd_cur_tax_amt2, DlvSlipHdrR.$ttl_trd_cur_tax_amt, hdrR.getNumber("amt_dec_place"));
				putNumStr(rptSet, hdrR, DlvSlipHdrR.$s_ttl_trd_cur_amt2, DlvSlipHdrR.$ttl_trd_cur_amt, hdrR.getNumber("amt_dec_place"));
				putNumStr(rptSet, hdrR, DlvSlipHdrR.$s_ttl_trd_cur_dscnt_amt2, DlvSlipHdrR.$ttl_trd_cur_dscnt_amt, hdrR.getNumber("amt_dec_place"));
			}
			else {
				hdrR.xrate(null);
			}
		}

		/**
		 * 納品伝票明細を編集する
		 */
		@Override
		protected void editDtl(DlvSlipHdrR hdrR, MCList<DlvSlipDtlR> dtlL, MSBER_DlvSlip rptSet) {
			
			Locale locale = getPrntLocal(rptSet);

			if (!_isPrntSubForm) {
				// 控えの時点では金額は反転済み
				for (DlvSlipDtlR dtlR :dtlL) {
					setUpirAmtSignRvrs(hdrR, dtlR);
					if (dtlR.inc_tax_flg()) {
						dtlR.t_inc_tax("1");
					}
				}
			}

			for (DlvSlipDtlR dtlR : dtlL) {
				if (dtlR.lot_plural_flg()) {
					dtlR.s_lot_plural_flg(MSC_DLV_SLIP_STR.PLURAL.name());
				}
				else if(dtlR.sublot_plural_flg()) {
					dtlR.s_sublot_plural_flg(MSC_DLV_SLIP_STR.PLURAL.name());
				}
				if (dtlR.inc_tax_flg()) {
					dtlR.s_inc_tax_flg(MAC_STR.PRNT_INC_TAX.name(rptSet.getLocale()));
				}
				if (dtlR.interim_flg()) {
					dtlR.s_interim_flg(MAC_STR.PRNT_INTERIM.name(rptSet.getLocale()));
				}
				hdrR.b_eiaj1(
						MSC_EIAJ_DLV_SLIP_STR.BAR_ST_END_BIT.name()
						+ MSC_EIAJ_DLV_SLIP_STR.BAR_ID_Z.name()
						+ hdrR.dlv_slip_no()
						+ MSC_EIAJ_DLV_SLIP_STR.BAR_ST_END_BIT.name());
				
				String qty = "";
				MCNumber decPlace = MCNumber.ZERO;
				hdrR.eiaj_b_slo_po_qty(dtlR.trd_unit_qty());
				decPlace = dtlR.getNumber("trd_unit_dec_place");
				putNumStr(rptSet, hdrR, DlvSlipHdrR.$s_eiaj_b_slo_po_qty, DlvSlipHdrR.$eiaj_b_slo_po_qty, decPlace);
				qty = hdrR.s_eiaj_b_slo_po_qty().length() > 13 ? hdrR.s_eiaj_b_slo_po_qty().substring(0, 13) : hdrR.s_eiaj_b_slo_po_qty();
				
				hdrR.b_eiaj2(
						MSC_EIAJ_DLV_SLIP_STR.BAR_ST_END_BIT.name()
						+ MSC_EIAJ_DLV_SLIP_STR.BAR_ID_3N.name()
						+ MSC_EIAJ_DLV_SLIP_STR.BAR_LINE_TYP3.name()
						+ hdrR.dlv_slip_no()
						+ _SP
						+ qty
						+ _SP
						+ MSC_EIAJ_DLV_SLIP_STR.BAR_ST_END_BIT.name());
				
				String itmCd = dtlR.dlv_slip_itm_cd().length() > 25 ? dtlR.dlv_slip_itm_cd().substring(0, 13) : dtlR.dlv_slip_itm_cd();
				hdrR.b_eiaj3(
						MSC_EIAJ_DLV_SLIP_STR.BAR_ST_END_BIT.name()
						+ MSC_EIAJ_DLV_SLIP_STR.BAR_ID_3N.name()
						+ MSC_EIAJ_DLV_SLIP_STR.BAR_LINE_TYP4.name()
						+ itmCd
						+ _SP
						+ _SP
						+ MSC_EIAJ_DLV_SLIP_STR.BAR_ST_END_BIT.name());
				
				
				MCDate dt = nvl(hdrR.dlv_rqst_tm(), hdrR.dlv_tm());
				if (isNull(dt)) {
					hdrR.b_eiaj4(null);
				}
				else {
					String strDt = dt.toString("yyyyMMddHHmm");
					hdrR.b_eiaj4(
							MSC_EIAJ_DLV_SLIP_STR.BAR_ST_END_BIT.name()
							+ MSC_EIAJ_DLV_SLIP_STR.BAR_ID_3N.name()
							+ MSC_EIAJ_DLV_SLIP_STR.BAR_LINE_TYP5.name()
							+ _SP
							+ strDt
							+ MSC_EIAJ_DLV_SLIP_STR.BAR_ST_END_BIT.name());
				}
				if (isNull(dtlR.base_ac_dt())) {
					dtlR.base_ac_dt_lbl(null);
				} else {
					dtlR.base_ac_dt_lbl(MSC_DLV_SLIP_STR.BASE_AC_DT.name(locale));
				}
				if (MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isPROV_RTN(hdrR.trd_ptn_typ())) {
					// 金額非表示の場合
					if (isNull(hdrR.ttl_trd_cur_amt())) {
						dtlR.trd_cur_upri(null);
						dtlR.trd_cur_amt(null);
						dtlR.trd_cur_tax_in_amt(null);
						dtlR.trd_cur_tax_amt(null);
						dtlR.trd_cur_dscnt_amt(null);
						dtlR.tax_nm(null);
					}
				}
			}

			putPrntItmSub1(dtlL, DlvSlipDtlR.$itm_sub1_view, DlvSlipDtlR.$itm_sub1_data);
			putPrntItmSub2(dtlL, DlvSlipDtlR.$itm_sub2_view, DlvSlipDtlR.$itm_sub2_data);
			putPrntItmSub3(dtlL, DlvSlipDtlR.$itm_sub3_view, DlvSlipDtlR.$itm_sub3_data);

			putPrntStr(dtlL, DlvSlipDtlR.$lot_no_view, DlvSlipDtlR.$lot_no_data);
			putPrntStr(dtlL, DlvSlipDtlR.$sublot_no_view, DlvSlipDtlR.$sublot_no_data);

			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_trd_unit_qty, DlvSlipDtlR.$trd_unit_qty, "trd_unit_dec_place");
			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_base_unit_qty, DlvSlipDtlR.$base_unit_qty, "base_unit_dec_place");
			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_dlv_inst_qty, DlvSlipDtlR.$dlv_inst_qty, "dlv_inst_dec_place");
			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_slo_po_qty, DlvSlipDtlR.$slo_po_qty, "slo_po_dec_place");
			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_trd_cur_upri, DlvSlipDtlR.$trd_cur_upri, "upri_dec_place");
			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_trd_cur_amt, DlvSlipDtlR.$trd_cur_amt, "amt_dec_place");
			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_trd_cur_tax_in_amt, DlvSlipDtlR.$trd_cur_tax_in_amt, "amt_dec_place");
			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_trd_cur_tax_amt, DlvSlipDtlR.$trd_cur_tax_amt, "amt_dec_place");
			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_trd_cur_dscnt_amt, DlvSlipDtlR.$trd_cur_dscnt_amt, "amt_dec_place");

			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_int_trd_unit_qty, DlvSlipDtlR.$s_dec_trd_unit_qty, DlvSlipDtlR.$trd_unit_qty, "trd_unit_dec_place");
			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_int_base_unit_qty, DlvSlipDtlR.$s_dec_base_unit_qty, DlvSlipDtlR.$base_unit_qty, "base_unit_dec_place");
			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_int_dlv_inst_qty, DlvSlipDtlR.$s_dec_dlv_inst_qty, DlvSlipDtlR.$dlv_inst_qty, "dlv_inst_dec_place");
			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_int_slo_po_qty, DlvSlipDtlR.$s_dec_slo_po_qty, DlvSlipDtlR.$slo_po_qty, "slo_po_dec_place");
			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_int_trd_cur_upri, DlvSlipDtlR.$s_dec_trd_cur_upri, DlvSlipDtlR.$trd_cur_upri, "upri_dec_place");
			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_int_trd_cur_amt, DlvSlipDtlR.$s_dec_trd_cur_amt, DlvSlipDtlR.$trd_cur_amt, "amt_dec_place");
			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_int_trd_cur_tax_in_amt, DlvSlipDtlR.$s_dec_trd_cur_tax_in_amt, DlvSlipDtlR.$trd_cur_tax_in_amt, "amt_dec_place");
			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_int_trd_cur_tax_amt, DlvSlipDtlR.$s_dec_trd_cur_tax_amt, DlvSlipDtlR.$trd_cur_tax_amt, "amt_dec_place");
			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_int_trd_cur_dscnt_amt, DlvSlipDtlR.$s_dec_trd_cur_dscnt_amt, DlvSlipDtlR.$trd_cur_dscnt_amt, "amt_dec_place");

			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_tax_rate, DlvSlipDtlR.$tax_rate, dtlL.getMeta(DlvSlipDtlR.$tax_rate));
			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_ship_wt, DlvSlipDtlR.$ship_wt, MSC_PRNT_NUM.WT_DEC_PLACE.value());
			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_ship_dim, DlvSlipDtlR.$ship_dim, MSC_PRNT_NUM.DIM_DEC_PLACE.value());
			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_pack_qty, DlvSlipDtlR.$pack_qty, dtlL.getMeta(DlvSlipDtlR.$pack_qty));
			putNumStr(rptSet, dtlL, DlvSlipDtlR.$s_ttl_pack_qty, DlvSlipDtlR.$ttl_pack_qty, dtlL.getMeta(DlvSlipDtlR.$ttl_pack_qty));
			
		}
		
		/**
		 * 仕入直送の取引か判定する
		 */
		protected boolean isPurcDdlv(DlvSlipHdrR hdrR, MCList<DlvSlipDtlR> dtlL) {
			if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())) {
				// 仕入直送登録では受注明細に紐付かない明細を追加できるので、
				// 手配区分＝「仕入直送」が１件でもあれば仕入直送の取引とみなす
				DlvSlipDtlR r = dtlL.getFirst("proc_typ", MAC_SLO_PROC_TYP.PURC_DDLV.value());
				if (!isNull(r)) {
					return true;
				}
			}
			return false;
		}
		
		/**
		 * 預りの取引か判定する
		 */
		protected boolean isCststk(DlvSlipHdrR hdrR, MCList<DlvSlipDtlR> dtlL) {
			if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())) {
				DlvSlipDtlR r = dtlL.getFirst("sls_cststk_flg", true);
				if (!isNull(r)) {
					return true;
				}
			}
			return false;
		}
		
		/**
		 * 単価・金額の符号を反転する
		 * 
		 * @param hdrR
		 * @param dtlR
		 */
		protected void setUpirAmtSignRvrs(DlvSlipHdrR hdrR, DlvSlipDtlR dtlR) {
			
			if (isDscntItmUpriAmtSignRvrsTrd(hdrR.trd_ptn_typ()) && dtlR.dscnt_itm_flg()) {
				if (!isNull(dtlR.trd_cur_upri())) {
					dtlR.trd_cur_upri(dtlR.trd_cur_upri().negate());
				}
				if (!isNull(dtlR.trd_cur_amt())) {
					dtlR.trd_cur_amt(dtlR.trd_cur_amt().negate());
				}
				if (!isNull(dtlR.trd_cur_tax_in_amt())) {
					dtlR.trd_cur_tax_in_amt(dtlR.trd_cur_tax_in_amt().negate());
				}
				if (!isNull(dtlR.trd_cur_tax_amt())) {
					dtlR.trd_cur_tax_amt(dtlR.trd_cur_tax_amt().negate());
				}
			}
		}
		
		/**
		 * 値引品目の単価・金額の符号を反転する取引か
		 * 
		 * @param trdPtnTyp
		 * @return
		 */
		protected boolean isDscntItmUpriAmtSignRvrsTrd(String trdPtnTyp) {
			
			// 出荷・売上・返品系が対象。値引系取引画面は、画面で入力した符号で表示するため対象外。
			if (MAC_TRD_PTN_TYP.isSLS(trdPtnTyp) 
				 || MAC_TRD_PTN_TYP.isSLS_CNSGN(trdPtnTyp) 
				 || MAC_TRD_PTN_TYP.isSLS_RTN(trdPtnTyp) 
				 || MAC_TRD_PTN_TYP.isSHIP(trdPtnTyp) 
				 || MAC_TRD_PTN_TYP.isSHIP_RTN(trdPtnTyp) 
				 || MAC_TRD_PTN_TYP.isPROV(trdPtnTyp) 
				 || MAC_TRD_PTN_TYP.isPROV_RTN(trdPtnTyp) 
			) {
				return true;
			}
			else {
				return false;
			}
		}

		@Override
		protected boolean isPrnted(DlvSlipHdrR hdrR) {
			return hdrR.getBoolean("slip_prnt_flg") || hdrR.getBoolean("sls_prnt_flg");
		}
		@Override
		protected boolean isReprnt() {
			// 発行済の場合、印刷データから再印刷する
			return true;
		}
		@Override
		protected boolean isRegist() {
			// 印刷データは登録する
			return true;
		}
		@Override
		protected boolean isErr(ShipRprt_Prnt01_HdrR cndR) {
			return cndR.err_flg();
		}


		@Override
		protected void prnt(MSBER_DlvSlip rptSet, DlvSlipHdrR hdrR, MCList<DlvSlipDtlR> dtlL) {
			editHdr(hdrR, dtlL, rptSet);
			editDtl(hdrR, dtlL, rptSet);
			rptSet.addRow(hdrR.clone());
			rptSet.addAll(dtlL.clone());
			if (isRegist()) {
				// 価格印字なしの場合は、売上伝票帳票発行画面用の帳票データと共有できないため、価格つきと価格なしのデータを二つ出力
				// 価格ありのほうはAppReportNo4を設定し、帳票出力されないようにパラメータを設定する
				if (!hdrR.getBoolean("pri_prnt_flg")) {
					MSBER_DlvSlip rptSetUpri = (MSBER_DlvSlip)rptSet.clone();
					rptSetUpri.setAppReportNo4(MCBooleanUtil.booleanToDBString(true));
					MCServerReportManager.request(rptSetUpri, false);
					
					// 価格を消し、パラメータを設定し、再度リクエスト
					for (Object o :rptSet.getAll()) {
						if (o instanceof DlvSlipHdrR) {
							DlvSlipHdrR r = (DlvSlipHdrR)o;
							r.trd_cur_cd(null);
							r.trd_cur_nm(null);
							r.ttl_trd_cur_tax_amt(null);
							r.s_ttl_trd_cur_tax_amt(null);
							r.ttl_trd_cur_tax_in_amt(null);
							r.s_ttl_trd_cur_tax_in_amt(null);
							r.ttl_trd_cur_amt(null);
							r.s_ttl_trd_cur_amt(null);
							r.ttl_trd_cur_dscnt_amt(null);
							r.s_ttl_trd_cur_dscnt_amt(null);
							
						}
						else {
							DlvSlipDtlR r = (DlvSlipDtlR)o;
							r.trd_cur_upri(null);
							r.s_trd_cur_upri(null);
							r.s_int_trd_cur_upri(null);
							r.s_dec_trd_cur_upri(null);
							r.trd_cur_amt(null);
							r.s_trd_cur_amt(null);
							r.s_int_trd_cur_amt(null);
							r.s_dec_trd_cur_amt(null);
							r.tax_cd(null);
							r.tax_nm(null);
							r.tax_rate(null);
							r.s_tax_rate(null);
							r.tax_typ(null);
							r.trd_cur_tax_in_amt(null);
							r.s_trd_cur_tax_in_amt(null);
							r.s_int_trd_cur_tax_in_amt(null);
							r.s_dec_trd_cur_tax_in_amt(null);
							r.trd_cur_tax_amt(null);
							r.s_trd_cur_tax_amt(null);
							r.s_int_trd_cur_tax_amt(null);
							r.s_dec_trd_cur_tax_amt(null);
							r.trd_cur_dscnt_amt(null);
							r.s_trd_cur_dscnt_amt(null);
							r.s_int_trd_cur_dscnt_amt(null);
							r.s_dec_trd_cur_dscnt_amt(null);
							r.t_inc_tax(null);
							r.s_inc_tax_flg(null);
							r.s_interim_flg(null);
						}
					}
				}
				MCServerReportManager.request(rptSet, false);
			}
		}
		protected void callDlvSlipAttachSrv(List<MCReportSet> rsList) {
			Map<String, List<Attach_Chk01_DtlR>> up0Map = new LinkedHashMap<String, List<Attach_Chk01_DtlR>>();
			createDlvSlipAttachMap(rsList,up0Map);
			
			if(up0Map.isEmpty()) {
				return;
			}
			
			//取消とそれ以外に分けてサービスを呼び出す
			for (Map.Entry<String, List<Attach_Chk01_DtlR>> en : up0Map.entrySet()) {
				MBBCL_AttachService.Attach_Upd01 ope = MBBCL_AttachService.crtAttach_Upd01();
				setDlvSlipAttachUp(ope,en);
				ope.exec();
			}
		}
		protected void createDlvSlipAttachMap(List<MCReportSet> rsList, Map<String, List<Attach_Chk01_DtlR>> map) {
			for(MCReportSet rs: rsList) {
				//reportSetから、ヘッダを取得する
				String bt = rs.getBlockType(DlvSlipHdrR.create());
				
				@SuppressWarnings("unchecked")
				MCList<MCRow> hdrL = rs.getAll(bt);

				if (hdrL == null || hdrL.isEmpty()) {
					continue;
				}
				
				DlvSlipHdrR hdrR = (DlvSlipHdrR) hdrL.get(0);

				if (isXfr(hdrR)) {
					continue;
				}
				//再発行は登録サービス呼び出し対象外
				if(isRePrntDlvSlip(hdrR)) {
					continue;
				}
				editDlvSlipAttachMap(rs,hdrR,map);
			}
		}
		
		protected boolean isXfr(DlvSlipHdrR hdrR ) {
			DlvSlipHdrR dlvSlipR = _hdrL.getFirst(_hdrIdx, hdrR.toArray(_pegCols));
			return isNull(dlvSlipR.getStringNE("bp_cd"));
		}
		
		protected void editDlvSlipAttachMap(MCReportSet rs, DlvSlipHdrR hdrR,Map<String, List<Attach_Chk01_DtlR>> map) {
			Attach_Chk01_DtlR up0 = Attach_Chk01_DtlR.create();
			copy(up0, hdrR, createMap_Attach_Chk01_DtlR_DlvSlipHdrR());
			
			if (isNull(up0.cur_cd())) {
				DlvSlipHdrR dlvSlipHdrR = _hdrL.getFirst(_hdrIdx, hdrR.toArray(_pegCols));
				if (!isNull(dlvSlipHdrR)) {
					up0.cur_cd(nvl(dlvSlipHdrR.trd_cur_cd(), dlvSlipHdrR.getStringNE("cur_cd_for_attach")));
				}
			}
			
			//WG
			up0.wg_cd(getWgCd(hdrR.dpt_cd(), hdrR.ship_dt()));
			//帳票ID
			up0.report_id(rs.getReportInfo().report_id());
			//添付元ファイル(バイナリ）
			up0.file_bin(rs.getReportInfo().save_file_bin());
			
			List<Attach_Chk01_DtlR> l = map.get(MAC_SLIP_STS_TYP.isCAN(hdrR.slip_sts_typ()) ? "CAN": "OTHER"); 
			if(null == l) {
				l = new ArrayList<Attach_Chk01_DtlR>(Arrays.asList(new Attach_Chk01_DtlR[]{up0}));
			}else {
				l.add(up0);
			}
			if(MAC_RPT_STS_TYP.isCAN(hdrR.slip_sts_typ())) {
				map.put("CAN",l);
			}else {
				map.put("OTHER", l);
			}
		}
		protected void setDlvSlipAttachUp(MBBCL_AttachService.Attach_Upd01 ope,Map.Entry<String, List<Attach_Chk01_DtlR>> en) {
			ope.up0().addAll(en.getValue());
			ope.up1().upd_cntr_chk_flg(false);
			ope.up1().del_flg(isSame(en.getKey(),"CAN") ? true : false);
		}
		
		protected Boolean isRePrntDlvSlip(DlvSlipHdrR hdrR) {
			List<String> list = new ArrayList<>();
			list.add(hdrR.dlv_slip_no());//no
			list.add(hdrR.dlv_slip_rev().toString());//rev
			list.add(hdrR.slip_sts_typ());//区分
			
			if(_rePrntDlvSlipSet.contains(list)) {
				return true;
			}
			return false;
		}
		protected void addReprntSetKey(Set<List<String>> tgtSet,MCReportSet rs) {
			List<String> keyLst = createReprntSetKey(rs);
			if(keyLst == null) {
				return;
			}
			if(!tgtSet.contains(keyLst)) {
				tgtSet.add(keyLst);
			}
		}
		protected List<String> createReprntSetKey(MCReportSet rs){
			String bt = rs.getBlockType(DlvSlipHdrR.create());
			@SuppressWarnings("unchecked")
			MCList<MCRow> hdrL = rs.getAll(bt);
			
			if (hdrL == null || hdrL.isEmpty()) {
				return null;
			}
			
			DlvSlipHdrR hdrR = (DlvSlipHdrR) hdrL.get(0);
			
			List<String> list = new ArrayList<>();		
			if (!isNull(hdrR)) {
				list.add(hdrR.dlv_slip_no());//no
				list.add(hdrR.dlv_slip_rev().toString());//rev
				list.add(hdrR.slip_sts_typ());//区分
			}
			return list;
		}
	}
		protected Map_Attach_Chk01_DtlR_DlvSlipHdrR<Attach_Chk01_DtlR, DlvSlipHdrR> createMap_Attach_Chk01_DtlR_DlvSlipHdrR() {
			return new Map_Attach_Chk01_DtlR_DlvSlipHdrR<Attach_Chk01_DtlR, DlvSlipHdrR>();
		}
		
		public class Map_Attach_Chk01_DtlR_DlvSlipHdrR<D extends Attach_Chk01_DtlR, S extends DlvSlipHdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Attach_Chk01_DtlR.$biz_key1, DlvSlipHdrR.$dlv_slip_no);//納品書ＮＯ
				addColumnPathMap(Attach_Chk01_DtlR.$dt, DlvSlipHdrR.$ship_dt);//出荷日
				addColumnPathMap(Attach_Chk01_DtlR.$bp_cd, DlvSlipHdrR.$po_co_cd);//発注者ＣＤ
				addColumnPathMap(Attach_Chk01_DtlR.$cur_cd, DlvSlipHdrR.$trd_cur_cd);//取引通貨ＣＤ
				addColumnPathMap(Attach_Chk01_DtlR.$sls_dpt_cd, DlvSlipHdrR.$dpt_cd);//売上部門ＣＤ
				addColumnPathMap(Attach_Chk01_DtlR.$dlv_cd, DlvSlipHdrR.$dlv_id_cd);//納品先ＣＤ
				addColumnPathMap(Attach_Chk01_DtlR.$cst_cd, DlvSlipHdrR.$po_co_cd);//得意先ＣＤ
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.biz_typ(MAC_BIZ_TYP.DLV_SLIP_SLS .value());//業務区分：納品書（販売）
				dest.biz_key2(src.dlv_slip_rev().toString());//発注改定番号はNum→Str変換してセット
				dest.amt(nvl(src.ttl_trd_cur_amt(), MCNumber.ZERO).add(nvl(src.ttl_trd_cur_tax_amt(), MCNumber.ZERO)));//税込金額合計
				dest.attach_file_flg(true);//ファイル添付フラグ
			}
		}
	/**
	 * 在庫振替伝票を作成・発行するベースクラス
	 */
	public class StkXfrSlip extends RptBase<MSBER_StkXfrSlip, StkXfrSlipHdrR, StkXfrSlipDtlR, ShipRprt_Prnt01_HdrR> {
		protected StkXfrSlip(MCList<ShipRprt_Prnt01_HdrR> cndL) {
			super(cndL, new String[]{"trn_typ", "dlv_slip_act_no"});
			init();
		}

		@Override
		protected MSBER_StkXfrSlip toRptSet(ShipRprt_Prnt01_HdrR cndR) {
			if (isErr(cndR))	return null;

			// 納品書NO、伝票状況区分ごとに出力（取消、新規の順）
			MCList<StkXfrSlipHdrR> hdrL = _hdrL.subList(_hdrIdx, cndR.toArray(_hdrIdx.getKeys()));
			MCSortPolicy p = new MCSortPolicy();
			p.add(SortType.ASC, "dlv_slip_no");
			p.add(SortType.DESC, "slip_sts_typ");
			hdrL.sort(p);

			MCIndexKey idx = _dtlL.createIndex("dlv_slip_no", "slip_sts_typ");
			MSBER_StkXfrSlip rptSet = null;
			for (StkXfrSlipHdrR hdrR : hdrL) {
				MSBER_StkXfrSlip rpt = super.toRptSet(hdrR, _dtlL.subList(idx, hdrR.toArray(idx.getKeys())));
				if (rpt != null) {
					if (rptSet == null) {
						rptSet = crtRptSet();
						rptSet.setReportInfo(rpt.getReportInfo());
						rptSet.setAppReportNo1(null);
						rptSet.setAppReportNo2(null);
						rptSet.setAppReportNo3(null);
						rptSet.setAppReportNo4(null);
						rptSet.setPersistent(false);	// まとめ分は永続データとしない
						rptSet.addAll(rpt.getAll());
					}
					else {
						rptSet.addAll(rpt.getAll());
					}
				}
			}
			return rptSet;
		}

		@Override
		protected void insWk() {
			MSW_DLV_SLIP_KEY_R S0 = MSW_DLV_SLIP_KEY_R.create();
			MST_DLV_SLIP_R S1W = MST_DLV_SLIP_R.create("W");
			MST_DLV_SLIP_R S1T = MST_DLV_SLIP_R.create("T");
			MST_DLV_SLIP_R S2 = MST_DLV_SLIP_R.create();
			MCTempView SW = createTempView("SW");
			execDbWkDelete("MSBEL5550_MSW_DLV_SLIP_KEY_D03", S0);
			// 最新のデータを取得
			MCInsert q2 = sql("MSBEL5550_MSW_DLV_SLIP_KEY_I07")
				.insert(S0)
				.columns(
					S0.dlv_slip_no,
					S0.dlv_slip_seq
				)
				.query(
					subQuery()
					.select(
						S1W.dlv_slip_no,
						S1W.dlv_slip_seq
					)
					.from(S1W)
					.where(
						S1W.trn_typ.eq(bind("trn_typ"))
						.and(S1W.dlv_slip_act_no.eq(bind("dlv_slip_act_no")))
						.and(S1W.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
					)
				);
			q2.executeBatchUpdate(getNoErrCndL());
			
			// 最新が黒なら発行済みの前リビジョンの最新（つまり取消）のデータを取得
			// 発行済みのリビジョンがなければ取得されない
			MCInsert q3 = sql("MSBEL5550_MSW_DLV_SLIP_KEY_I08")
				.insert(S0)
				.columns(
					S0.dlv_slip_no,
					S0.dlv_slip_seq
				)
				.query(
					subQuery()
					.select(
						S1T.dlv_slip_no,
						max(S1T.dlv_slip_seq).as("dlv_slip_seq")
					)
					.from(S1T
						.innerJoin(
							subQuery()
							.select(S2.dlv_slip_no,
									max(S2.dlv_slip_rev).as("dlv_slip_rev"))
							.from(S2)
							.where(
								S2.trn_typ.eq(bind("trn_typ"))
								.and(S2.dlv_slip_act_no.eq(bind("dlv_slip_act_no")))
								.and(S2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value())))
								.and(S2.slip_prnt_flg.eq(value(true)))
							)
							.groupBy(S2.dlv_slip_no).view(SW)
						)
						.on(
							bracket(
									S1T.dlv_slip_no.eq(SW.pr(S2.dlv_slip_no))
								.and(S1T.dlv_slip_rev.eq(SW.pr("dlv_slip_rev")))
							)
						)
					)
					.groupBy(S1T.dlv_slip_no)
				);
			q3.executeBatchUpdate(getNoErrCndL());
		}

		@Override
		protected void chk() {
			// 納品伝票、納品伝票明細に対して存在チェックを行う
			// チェック時のキーが伝票発行時と異なるので個別に実装する（伝票状況区分はチェックでは不要）
			MCIndexKey
				hdrIdx = _hdrL.createIndex(_pegCols[0], _pegCols[1]),
				dtlIdx = _dtlL.createIndex(_pegCols[0], _pegCols[1]);
			for (ShipRprt_Prnt01_HdrR r : getNoErrCndL()) {
				StkXfrSlipHdrR hdrR = _hdrL.getFirst(hdrIdx, r.toArray(hdrIdx.getKeys()));
				if (isNull(hdrR)) {
					MCMessagePool.addAll(
						getRecordNotFoundMsg(
							"MS", "MST_DLV_SLIP", hdrIdx.getKeys(), r.toArray(hdrIdx.getKeys()), r));
					r.err_flg(true);
				}
				else if (isNull(hdrR.getString("slip_form_id"))) {
					MCMessagePool.add(
						new MCMessage(r, null, MSBEL0198, hdrR.getStringNE("bp_cd"), hdrR.trd_cd()));
					r.err_flg(true);
				}
				if (isNull(_dtlL.getFirst(dtlIdx, r.toArray(dtlIdx.getKeys())))) {
					MCMessagePool.addAll(
						getRecordNotFoundMsg(
							"MS", "MST_DLV_SLIP_D", dtlIdx.getKeys(), r.toArray(dtlIdx.getKeys()), r));
					r.err_flg(true);
				}
			}
		}

		/**
		 * 発行対象の納品伝票ヘッダを取得する
		 */
		@Override
		protected void srchHdr() {
			_hdrL = MCList.create(StkXfrSlipHdrR.class);
			_hdrL.addBooleanColumn("slip_prnt_flg");

			executeQuery(_hdrL, MSBEL5550_MST_DLV_SLIP_S02());
		}

		/**
		 * 発行対象の納品伝票明細を取得する
		 */
		@Override
		protected void srchDtl() {
			_dtlL = MCList.create(StkXfrSlipDtlR.class);
			executeQuery(_dtlL, MSBEL5550_MST_DLV_SLIP_D_S02());
		}

		@Override
		protected MSBER_StkXfrSlip crtRptSet() {
			return MSBER_StkXfrSlip.create();
		}

		/**
		 * 印刷情報(納品伝票)を設定する
		 */
		@Override
		protected MSBER_StkXfrSlip crtRptSet(StkXfrSlipHdrR hdrR) {
			MSBER_StkXfrSlip rptSet = super.crtRptSet(hdrR);
			rptSet.setReportID(hdrR.getString("slip_form_id"));

			rptSet.setAppReportNo1(hdrR.dlv_slip_no());
			rptSet.setAppReportNo2(hdrR.dlv_slip_rev().toSimpleString());
			rptSet.setAppReportNo3(hdrR.getNumber("dlv_slip_seq").toSimpleString());
			rptSet.setAppUsrCd1(hdrR.dpt_cd());
			rptSet.setAppUsrNm1(hdrR.dpt_nm());
			rptSet.setAppUsrCd2(hdrR.usr_cd());
			rptSet.setAppUsrNm2(hdrR.usr_nm());
	
			return rptSet;
		}
	
		/**
		 * 納品伝票ヘッダを編集する
		 */
		@Override
		protected void editHdr(StkXfrSlipHdrR hdrR, MCList<StkXfrSlipDtlR> dtlL, MSBER_StkXfrSlip rptSet) {
			hdrR.prnt_tm(MCDate.now());
	
			String title = MAC_TRD_PTN_TYP.slip_title_typ(hdrR.trd_ptn_typ());
			if (isNull(title)) {
				hdrR.formtitle(MAC_SLIP_TITLE_TYP.DLV_SLIP.name(getUsrLocale()));
			}
			else {
				hdrR.formtitle(MAC_SLIP_TITLE_TYP.get(title).name(getUsrLocale()));
			}

			if (!isNull(hdrR.slip_sts_typ())) {
				hdrR.slip_sts_typ_nm(MAC_SLIP_STS_TYP.get(hdrR.slip_sts_typ()).name(getUsrLocale()));
			}
			
		// 納品伝票の発行済みフラグ更新用
			hdrR.setBooleanNE(MST_DLV_SLIP_R.$slip_prnt_flg, true);
			hdrR.setBooleanNE(MST_DLV_SLIP_R.$sls_prnt_flg, false);
		}
		/**
		 * 納品伝票明細を編集する
		 */
		@Override
		protected void editDtl(StkXfrSlipHdrR hdrR, MCList<StkXfrSlipDtlR> dtlL, MSBER_StkXfrSlip rptSet) {
			
			for (StkXfrSlipDtlR dtlR : dtlL) {
					if (!isNull(dtlR.io_typ())) {
						dtlR.io_typ_nm((MSC_IO_TYP.get(dtlR.io_typ()).name(getUsrLocale())));
					}
					if (!isNull(dtlR.quality_typ())) {
						dtlR.quality_typ_nm(MAC_QUALITY_TYP.get(dtlR.quality_typ()).name(getUsrLocale()));
					}
					if (!isNull(dtlR.stk_id_typ())) {
						dtlR.stk_id_typ_nm(MSC_STK_ID_TYP.get(dtlR.stk_id_typ()).name(getUsrLocale()));
					}
					if (!isNull(dtlR.fix_no_typ())) {
						dtlR.fix_no_typ_nm(MSC_FIX_NO_TYP.get(dtlR.fix_no_typ()).name(getUsrLocale()));
					}
			}
			
			putPrntItmSub1(dtlL, StkXfrSlipDtlR.$itm_sub1_view, StkXfrSlipDtlR.$itm_sub1_data);
			putPrntItmSub2(dtlL, StkXfrSlipDtlR.$itm_sub2_view, StkXfrSlipDtlR.$itm_sub2_data);
			putPrntItmSub3(dtlL, StkXfrSlipDtlR.$itm_sub3_view, StkXfrSlipDtlR.$itm_sub3_data);

			putPrntStr(dtlL, StkXfrSlipDtlR.$lot_no_view, StkXfrSlipDtlR.$lot_no_data);
			putPrntStr(dtlL, StkXfrSlipDtlR.$sublot_no_view, StkXfrSlipDtlR.$sublot_no_data);

			putPrntSnoLabel1(dtlL, StkXfrSlipDtlR.$sno1_lbl);
			putPrntSnoLabel2(dtlL, StkXfrSlipDtlR.$sno2_lbl);
			putPrntSnoLabel3(dtlL, StkXfrSlipDtlR.$sno3_lbl);
			putPrntSnoLabel4(dtlL, StkXfrSlipDtlR.$sno4_lbl);
			putPrntSno1(dtlL, StkXfrSlipDtlR.$sno1_view, StkXfrSlipDtlR.$sno1_data);
			putPrntSno2(dtlL, StkXfrSlipDtlR.$sno2_view, StkXfrSlipDtlR.$sno2_data);
			putPrntSno3(dtlL, StkXfrSlipDtlR.$sno3_view, StkXfrSlipDtlR.$sno3_data);
			putPrntSno4(dtlL, StkXfrSlipDtlR.$sno4_view, StkXfrSlipDtlR.$sno4_data);
			
			putNumStr(rptSet, dtlL, StkXfrSlipDtlR.$s_trd_unit_qty, StkXfrSlipDtlR.$trd_unit_qty, "trd_unit_dec_place");
			putNumStr(rptSet, dtlL, StkXfrSlipDtlR.$s_base_unit_qty, StkXfrSlipDtlR.$base_unit_qty, "base_unit_dec_place");
			
			putNumStr(rptSet, dtlL, StkXfrSlipDtlR.$s_int_trd_unit_qty, StkXfrSlipDtlR.$s_dec_trd_unit_qty, StkXfrSlipDtlR.$trd_unit_qty, "trd_unit_dec_place");
			putNumStr(rptSet, dtlL, StkXfrSlipDtlR.$s_int_base_unit_qty, StkXfrSlipDtlR.$s_dec_base_unit_qty, StkXfrSlipDtlR.$base_unit_qty, "base_unit_dec_place");			

		}

		@Override
		protected boolean isPrnted(StkXfrSlipHdrR hdrR) {
			return false;
		}
		@Override
		protected boolean isReprnt() {
			// 発行済の場合、印刷データから再印刷する
			return true;
		}
		@Override
		protected boolean isRegist() {
			// 印刷データは登録する
			return true;
		}
		@Override
		protected boolean isErr(ShipRprt_Prnt01_HdrR cndR) {
			return cndR.err_flg();
		}
	}


//// ユーティリティ
	/**
	 * 税計算区分が「行単位」か判定する
	 */
	protected boolean isTaxCalTypLine(ShipRprt_Upd01_HdrR hdrR) {
		return MAC_TAX_CALC_TYP.isLINE(hdrR.ds().tax_calc_typ());
	}
	/**
	 * 「行単位」で税計算する対象か判定する
	 */
	protected boolean isTaxCalLineTgt(ShipRprt_Upd01_HdrR hdrR, MCList<ShipRprt_Upd01_DtlR> dtlL) {
		boolean isProvIvFlg = false;
		if (MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ())) {
			MST_PROV_SCHD_R provR = getProvSchdR(hdrR, dtlL.get(0));
			if (isNull(provR)) {
				// 支給明細訂正から呼ばれる場合はiv_trd_flgで判断
				isProvIvFlg = dtlL.get(0).getBooleanNE("iv_trd_flg");
			}
			else {
				MAM_LG_CTL_R lgCtlR = getLgCtlR(provR.getStringNE("gi_lg_grp_cd"), provR.getStringNE("gr_lg_grp_cd"));
				if (!isNull(lgCtlR)) {
					isProvIvFlg = lgCtlR.iv_trd_flg();
				}
			}
		}
		return isTaxCalTypLine(hdrR)
					|| (isSlsTrd(hdrR.trd_ptn_typ()) && getBpR(hdrR.bp_cd()).cst_iv_flg())
					|| isProvIvFlg;
	}
	/**
	 * 売上関連の取引か判定する
	 */
	protected boolean isSlsTrd(String trdPtnTyp) {
		return MAC_TRD_PTN_TYP.isSLS(trdPtnTyp)
					|| MAC_TRD_PTN_TYP.isSLS_CNSGN(trdPtnTyp)
					|| MAC_TRD_PTN_TYP.isSLS_DSCNT(trdPtnTyp)
					|| MAC_TRD_PTN_TYP.isSLS_XTRA(trdPtnTyp)
					|| MAC_TRD_PTN_TYP.isSLS_RTN(trdPtnTyp);
	}

	/**
	 * 支給関連の取引か判定する
	 */
	protected boolean isProvTrd(String trdPtnTyp) {
		return MAC_TRD_PTN_TYP.isPROV(trdPtnTyp)
					|| MAC_TRD_PTN_TYP.isPROV_RTN(trdPtnTyp);
	}

	/**
	 * ロット明細分割対象区分を考慮する取引か判定する
	 */
	protected boolean isSlipEachLotTypTrd(String trdPtnTyp) {
		// 売上または出荷が対象
		return isSlsTrd(trdPtnTyp)
			|| MAC_TRD_PTN_TYP.isSHIP(trdPtnTyp);
	}

	/**
	 * 金額計算を行う取引か判定する
	 */
	protected boolean isCalcAmtTrd(String trdPtnTyp) {
		return isSlsTrd(trdPtnTyp) || isProvTrd(trdPtnTyp);
	}

	/**
	 * 売上税指定か判定する
	 */
	protected boolean isSloFixTax(ShipRprt_Upd01_HdrR hdrR, ShipRprt_Upd01_DtlR dtlR) {
		MST_SLO_D_R sloDR = MST_SLO_D_R.create();
		if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ()) && !isNull(dtlR.slo_d_no())) {
			sloDR = getSloDR(dtlR.slo_d_no());
		}
		return !isNull(sloDR) && sloDR.tax_fix_flg();
	}

	/**
	 * マスタから伝票行数を取得する
	 */
	protected MCNumber _maxLine = MCNumber.valueOf(Math.pow(10, MST_DLV_SLIP_R.slip_line_max_META.length()) - 1);
	protected int getLineMax(ShipRprt_Upd01_HdrR hdrR) {
		MCNumber line = _maxLine;
		MAM_SLIP_FORM_R frmR = getSlipFormR(hdrR.slip_form_cd());
		if (!isNull(frmR) && !isNull(frmR.line_num())) {
			line = frmR.line_num();
		}
		return line.intValue();
	}

	/**
	 * 符号を反転させた値を返す<br>
	 * 値がnullの場合は、nullを返す
	 */
	protected MCNumber negate(MCNumber num) {
		if (!isNull(num)) {
			num = num.negate();
		}
		return num;
	}

	/**
	 * 基準単位数量から取引単位数量に換算する<br>
	 * 換算時に余りが出る場合はnullを返却する
	 */
	protected MCNumber cnvBaseToTrdUnitQty(
			ShipRprt_Upd01_DtlR dtlR, MCNumber baseUnitQty, String unitCd) {
		MAVM_ITM_UNIT_R unitR = getItmUnitR(
			dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), unitCd);
		MAM_ITM_R baseUnitR = getItmR(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
		
		MCNumber entQty = rvrsBaseUnitConv(
				baseUnitQty, unitR.conv_base_qty(), unitR.conv_qty(),
				unitR.dec_place(), unitR.rnd_typ());
		
		MCNumber reEntQty = convToBaseUnit(
				entQty, unitR.conv_base_qty(), unitR.conv_qty(),
				baseUnitR.dec_place(), baseUnitR.rnd_typ());
		
		if (!isSame(reEntQty, baseUnitQty)) {
			return null;
		}
		else {
			return entQty;
		}
	}
	
	/**
	 * 使用基準の有償支給か判定する
	 */
	protected boolean isInptOnrProv(String prov_basis_typ, String trn_typ) {
		return MAC_PROV_BASIS_TYP.isINPT(prov_basis_typ) && !MSC_TRN_TYP.isPROV(trn_typ);
	}


///// キャッシュ関連
	/**
	 * 取引先マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBpL = null;
	protected void doBpCache(MCList<ShipRprt_Upd01_HdrR> hdrL) {
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(
				t.slip_each_lot_typ,
				t.cst_ship_form_cd,
				t.sls_tax_calc_typ,
				t.sls_amt_rnd_typ,
				t.sls_tax_rnd_typ,
				t.sls_basis_typ,
				t.prov_tax_calc_typ,
				t.prov_amt_rnd_typ,
				t.prov_tax_rnd_typ,
				t.bp_nm,
				t.prov_rcv_typ,
				t.cur_cd,
				t.cst_iv_flg
		);
		dbc_bldr.addSelect(
				MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("ship_tm"),
						value(MAC_BP_ADDR_TYP.ZIP_CD.value())).as("zip_cd"),
				MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("ship_tm"),
						value(MAC_BP_ADDR_TYP.ADDR1.value())).as("addr1"),
				MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("ship_tm"),
						value(MAC_BP_ADDR_TYP.ADDR2.value())).as("addr2"),
				MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("ship_tm"),
						value(MAC_BP_ADDR_TYP.ADDR3.value())).as("addr3"),
				MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("ship_tm"),
						value(MAC_BP_ADDR_TYP.ADDR4.value())).as("addr4"),
				MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("ship_tm"),
						value(MAC_BP_ADDR_TYP.TEL.value())).as("tel"),
				MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("ship_tm"),
						value(MAC_BP_ADDR_TYP.FAX.value())).as("fax"),
				MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("ship_tm"),
						value(MAC_BP_ADDR_TYP.CST_CNTCT_DPT.value())).as("cst_cntct_dpt"),
				MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("ship_tm"),
						value(MAC_BP_ADDR_TYP.CST_CNTCT_PSN.value())).as("cst_cntct_psn"),
				MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("ship_tm"),
						value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())).as("sppl_cntct_dpt"),
				MAPA_BP$F_GET_BP_ADDR(t.bp_cd, bind("ship_tm"),
						value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())).as("sppl_cntct_psn")
		);
		_cacheBpL = new FXUCL_MCDbcCache<MAM_BP_R>(dbc_bldr, hdrL, ShipRprt_Upd01_HdrR.$bp_cd);
	}
	protected MAM_BP_R getBpR(String bpCd) {
		return _cacheBpL.get(bpCd);
	}


	/**
	 * 税CDのキャッシュ
	 */
	protected TaxCdCache _taxCdCache = null;
	protected void doTaxCdCache(MCList<ShipRprt_Upd01_DtlR> dtlL) {
		_taxCdCache = new TaxCdCache(dtlL);
	}
	public class TaxCdCache {
		protected MCIndexKey _slsIdx = null, _provIdx = null;
		protected MCList<ShipRprt_Upd01_DtlR> _slsTax = null, _provTax = null;
		protected TaxCdCache(MCList<ShipRprt_Upd01_DtlR> dtlL) {
			String[] key = new String[]{
					ShipRprt_Upd01_DtlR.$itm_cd,
					ShipRprt_Upd01_DtlR.$itm_sub1,
					ShipRprt_Upd01_DtlR.$itm_sub2,
					ShipRprt_Upd01_DtlR.$itm_sub3,
					ShipRprt_Upd01_DtlR.$bp_cd,
					ShipRprt_Upd01_DtlR.$base_dt};
			MCList<ShipRprt_Upd01_DtlR>
				slsL = dtlL.subList(r -> isSlsTrd(r.trd_ptn_typ()) && isNull(r.tax_cd())).groupBy(key),
				provL = dtlL.subList(r -> isProvTrd(r.trd_ptn_typ()) && isNull(r.tax_cd())).groupBy(key);

			_slsTax = MCList.create(ShipRprt_Upd01_DtlR.class);
			_provTax = MCList.create(ShipRprt_Upd01_DtlR.class);
			if (!slsL.isEmpty()) {
				execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_SLS_TAX_CD", "01"),
						MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_SLS_TAX_CD"),
						ShipRprt_Upd01_DtlR.$tax_cd, slsL, key);
				_slsTax.addAll(slsL);
				_slsIdx = _slsTax.createIndex(key);
			}
			if (!provL.isEmpty()) {
				execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_PROV_TAX_CD", "01"),
						MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_PROV_TAX_CD"),
						ShipRprt_Upd01_DtlR.$tax_cd, provL, key);
				_provTax.addAll(provL);
				_provIdx = _provTax.createIndex(key);
			}
		}
		public ShipRprt_Upd01_DtlR get(ShipRprt_Upd01_DtlR dtlR) {
			return isSlsTrd(dtlR.trd_ptn_typ()) ?
				_slsTax.getFirst(_slsIdx, dtlR.toArray(_slsIdx.getKeys())) :
				_provTax.getFirst(_provIdx, dtlR.toArray(_provIdx.getKeys()));
		}
	}
	protected String getTaxCd(ShipRprt_Upd01_DtlR dtlR) {
		ShipRprt_Upd01_DtlR r = _taxCdCache.get(dtlR);
		return isNull(r) ? null : r.tax_cd();
	}

	/**
	 * 取引マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_TRD_R> _cacheTrdL = null;
	protected void doTrdCache(MCList<ShipRprt_Upd01_HdrR> hdrL) {
		MAM_TRD_R t = MAM_TRD_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.trd_cd, t.slip_form_cd);
		_cacheTrdL = new FXUCL_MCDbcCache<MAM_TRD_R>(dbc_bldr, hdrL, ShipRprt_Upd01_HdrR.$trd_cd);
	}
	protected MAM_TRD_R getTrdR(String trdCd) {
		return _cacheTrdL.get(trdCd);
	}

	/**
	 * 伝票帳票マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_SLIP_FORM_R> _cacheSlipFrmL = null;
	protected void doSlipPrntCache(MCList<ShipRprt_Upd01_HdrR> hdrL) {
		hdrL.forEach(r ->
			r.slip_form_cd(
				nvl(isProvTrd(r.trd_ptn_typ()) ? null : getBpR(r.bp_cd()).cst_ship_form_cd(),
					getTrdR(r.trd_cd()).slip_form_cd())));
		MAM_SLIP_FORM_R t = MAM_SLIP_FORM_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.slip_form_cd, t.slip_form_id, t.line_num);
		_cacheSlipFrmL = new FXUCL_MCDbcCache<MAM_SLIP_FORM_R>(dbc_bldr, hdrL, ShipRprt_Upd01_HdrR.$slip_form_cd);
	}
	protected MAM_SLIP_FORM_R getSlipFormR(String slipFrmCd) {
		return _cacheSlipFrmL.get(slipFrmCd);
	}

	/**
	 * 品目マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItmL = null;
	protected void doItmCache(MCList<ShipRprt_Upd01_DtlR> dtlL) {
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.lot_mng_typ,
				t.sublot_mng_typ,
				t.dec_place,
				t.rnd_typ,
				t.dscnt_itm_flg
		);
		_cacheItmL = new FXUCL_MCDbcCache<MAM_ITM_R>(
			dbc_bldr, dtlL,
			ShipRprt_Upd01_DtlR.$itm_cd,
			ShipRprt_Upd01_DtlR.$itm_sub1,
			ShipRprt_Upd01_DtlR.$itm_sub2,
			ShipRprt_Upd01_DtlR.$itm_sub3);
	}
	protected MAM_ITM_R getItmR(String itmCd, String sub1, String sub2, String sub3) {
		return _cacheItmL.get(itmCd, sub1, sub2, sub3);
	}

	/**
	 * 取引先品目マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCacheStEnd<MAM_BP_ITM_R> _cacheBpItmL = null;
	protected void doBpItmCache(MCList<ShipRprt_Upd01_HdrR> hdrL, MCList<ShipRprt_Upd01_DtlR> dtlL) {
		MCList<MAM_BP_ITM_R> dbc = MCList.create(MAM_BP_ITM_R.class);
		MAM_BP_ITM_R t = MAM_BP_ITM_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.bp_cd, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.bp_itm_cd, t.bp_itm_nm);

		MCIndexKey idx = dtlL.createIndex(ShipRprt_Upd01_DtlR.$hdr_peg_no);
		for(ShipRprt_Upd01_HdrR hdrR : hdrL) {
			MCList<ShipRprt_Upd01_DtlR> sameHdrDtlL = dtlL.subList(idx, hdrR.hdr_peg_no());
			for(ShipRprt_Upd01_DtlR dtlR : sameHdrDtlL) {
				MAM_BP_ITM_R r = dbc.add();
				r.bp_cd(hdrR.bp_cd());
				r.itm_cd(dtlR.itm_cd());
				r.itm_sub1(dtlR.itm_sub1());
				r.itm_sub2(dtlR.itm_sub2());
				r.itm_sub3(dtlR.itm_sub3());
			}
		}
		_cacheBpItmL = new FXUCL_MCDbcCacheStEnd<MAM_BP_ITM_R>(
			dbc_bldr, dbc,
			MAM_BP_ITM_R.$bp_cd,
			MAM_BP_ITM_R.$itm_cd,
			MAM_BP_ITM_R.$itm_sub1,
			MAM_BP_ITM_R.$itm_sub2,
			MAM_BP_ITM_R.$itm_sub3);
	}
	protected MAM_BP_ITM_R getBpItmR(MCDate dt, String bpCd, String itmCd, String sub1, String sub2, String sub3) {
		return _cacheBpItmL.get(dt, bpCd, itmCd, sub1, sub2, sub3);
	}

	/**
	 * 通貨マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_CUR_R> _cacheCurL = null;
	protected void doCurCache(MCList<ShipRprt_Upd01_HdrR> hdrL) {
		MAM_CUR_R t = MAM_CUR_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(
				t.cur_cd,
				t.cur_nm,
				t.amt_dec_place,
				t.upri_dec_place
		);
		_cacheCurL = new FXUCL_MCDbcCache<MAM_CUR_R>(dbc_bldr, hdrL, ShipRprt_Upd01_HdrR.$trd_cur_cd);
	}
	protected MAM_CUR_R getCurR(String trdCurCd) {
		return _cacheCurL.get(trdCurCd);
	}
	
	/**
	 * 税マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_TAX_R> _cacheTaxL = null;
	protected void doTaxCache(MCList<ShipRprt_Upd01_DtlR> dtlL) {
		MAM_TAX_R t = MAM_TAX_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.tax_cd, t.inc_tax_flg, t.tax_rate, t.sls_flg, t.prov_flg);
		_cacheTaxL = new FXUCL_MCDbcCache<MAM_TAX_R>(dbc_bldr, dtlL, ShipRprt_Upd01_DtlR.$tax_cd);
	}
	protected MAM_TAX_R getTaxR(String trdCurCd) {
		return _cacheTaxL.get(trdCurCd);
	}

	/**
	 * 為替レートのキャッシュ
	 */
	protected FXUCL_MCFuncCache<MCNumber> _xrateCache;
	protected MCNumber getXRate(String trdCurCd, String baseCurCd, String xrateCd, MCDate baseDt) {
		if (_xrateCache == null) {
			_xrateCache = new FXUCL_MCFuncCache<>(in -> {
				return MAPA_XCHNG$F_GET_XRATE_NE(value((String) in[0]), value((String) in[1]), 
						value((String) in[2]), value((MCDate) in[3]));
			});
		}
		return _xrateCache.get(trdCurCd, baseCurCd, xrateCd, baseDt);
	}
	protected MCNumber getXRate(ShipRprt_Upd01_HdrR hdrR) {
		if (isSame(hdrR.trd_cur_cd(), getCo().base_cur_cd())) {
			return MCNumber.ONE;
		}
		return
			getXRate(
				hdrR.trd_cur_cd(),
				getCo().base_cur_cd(),
				isSlsTrd(hdrR.trd_ptn_typ()) ? getCo().sls_xrate_cd() : getCo().prov_xrate_cd(),
				hdrR.ship_tm()
			);
	}
	protected MCNumber getPtaxRate(ShipRprt_Upd01_HdrR hdrR) {
		if(isNull(getCo().ptax_cur_cd())) {
			return null;
		}
		else if (isSame(hdrR.trd_cur_cd(), getCo().ptax_cur_cd())) {
			return MCNumber.ONE;
		}
		return
			getXRate(
				hdrR.trd_cur_cd(),
				nvl(getCo().ptax_cur_cd(), getCo().base_cur_cd()),
				isSlsTrd(hdrR.trd_ptn_typ()) ? getCo().sls_xrate_cd() : getCo().prov_xrate_cd(),
				hdrR.ship_tm()
			);
	}

	/**
	 * 源泉税率のキャッシュ
	 */
	protected WtaxCache _wtaxCache = null;
	protected void doWtaxCache(MCList<ShipRprt_Upd01_DtlR> dtlL) {
		_wtaxCache = new WtaxCache(dtlL);
	}
	public class WtaxCache {
		protected MCIndexKey _wtaxIdx = null;
		protected MCList<ShipRprt_Upd01_DtlR> _wtax = null;
		protected WtaxCache(MCList<ShipRprt_Upd01_DtlR> dtlL) {
			String[] key = new String[]{
					ShipRprt_Upd01_DtlR.$itm_cd,
					ShipRprt_Upd01_DtlR.$itm_sub1,
					ShipRprt_Upd01_DtlR.$itm_sub2,
					ShipRprt_Upd01_DtlR.$itm_sub3,
					ShipRprt_Upd01_DtlR.$base_dt};
			_wtax = dtlL.subList(ShipRprt_Upd01_DtlR.$wtax_rate, null).groupBy(key);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_WTAX_RATE", "01"),
					MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_WTAX_RATE"),
					ShipRprt_Upd01_DtlR.$wtax_rate, _wtax, key);
			_wtaxIdx = _wtax.createIndex(key);
		}
		public ShipRprt_Upd01_DtlR get(ShipRprt_Upd01_DtlR dtlR) {
			return _wtax.getFirst(
				_wtaxIdx, dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.base_dt());
		}
	}
	protected MCNumber getWtaxRate(ShipRprt_Upd01_DtlR dtlR) {
		ShipRprt_Upd01_DtlR r = _wtaxCache.get(dtlR); 
		return isNull(r) ? null : r.wtax_rate();
	}

	/**
	 * 場所マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLocL = null;
	protected void doLocCache(MCList<ShipRprt_Upd01_HdrR> hdrL) {
		MCList<MAM_LOC_R> dbc = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		hdrL.forEach(r -> {
			if (MSC_DLV_ID_TYP.isLOC(r.dlv_id_typ())) {
				dbc.add().loc_cd(r.dlv_id_cd());
			}
			if (!isNull(r.xfr_loc_cd())) {
				dbc.add().loc_cd(r.xfr_loc_cd());
			}
		});
		dbc_bldr.setSelect(t.loc_cd, t.wg_cd, t.sppl_cd);
		_cacheLocL = new FXUCL_MCDbcCache<MAM_LOC_R>(dbc_bldr, dbc, MAM_LOC_R.$loc_cd);
	}
	protected MAM_LOC_R getLocR(String locCd) {
		return _cacheLocL.get(locCd);
	}

	/**
	 * 支給単価マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R> _provUpriCache;
	protected void doProvUpriCache(MCList<ShipRprt_Upd01_HdrR> hdrL, MCList<ShipRprt_Upd01_DtlR> dtlL) {
		MCIndexKey idx = hdrL.createIndex(ShipRprt_Upd01_DtlR.$hdr_peg_no);
		MCList<ShipRprt_Upd01_DtlR> lst = createShipRprt_Upd01_DtlL();
		for (ShipRprt_Upd01_DtlR dtlR : dtlL) {
			if (isProvTrd(dtlR.trd_ptn_typ())) {

				ShipRprt_Upd01_DtlR r = ShipRprt_Upd01_DtlR.create();
				MCRow.copyvalue(r, dtlR);

				if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
					ShipRprt_Upd01_HdrR hdrR = hdrL.getFirst(idx, dtlR.hdr_peg_no());
					MAM_LOC_R locR = getLocR(hdrR.dlv_id_cd());
					r.wg_cd(locR.wg_cd());
				}
				lst.add(r);
			}
		}
		MAM_PROV_UPRI_R t = MAM_PROV_UPRI_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.prov_typ, t.upri);
		_provUpriCache = new FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R>(
				dbc_bldr, lst,
				ShipRprt_Upd01_DtlR.$itm_cd,
				ShipRprt_Upd01_DtlR.$itm_sub1,
				ShipRprt_Upd01_DtlR.$itm_sub2,
				ShipRprt_Upd01_DtlR.$itm_sub3,
				ShipRprt_Upd01_DtlR.$bp_cd,
				ShipRprt_Upd01_DtlR.$trd_cur_cd,
				ShipRprt_Upd01_DtlR.$wg_cd);
	}
	protected MAM_PROV_UPRI_R getProvUpriR(ShipRprt_Upd01_HdrR hdrR, ShipRprt_Upd01_DtlR dtlR) {
		// 支給：入庫場所のワーキンググループ
		// 支給返品：出庫場所のワーキンググループ
		String wgCd = dtlR.wg_cd();
		if (MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ())) {
			MAM_LOC_R locR = getLocR(hdrR.dlv_id_cd());
			wgCd = locR.wg_cd();
		} 
		return _provUpriCache.get(
						dtlR.base_dt(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(),
						dtlR.bp_cd(), dtlR.trd_cur_cd(), wgCd);
	}
	
	/**
	 * 発注者担当マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCacheStEnd<MAM_SPPL_USR_R> _spplUsrCache;
	protected void doSpplUsrCache(MCList<MST_PROV_SCHD_R> provL) {
		MAM_SPPL_USR_R t = MAM_SPPL_USR_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.outsrc_usr_cd, t.outsrc_dpt_cd);
		_spplUsrCache = new FXUCL_MCDbcCacheStEnd<MAM_SPPL_USR_R>(
				dbc_bldr, provL, MST_PROV_SCHD_R.$prsppl_cd);
	}
	protected MAM_SPPL_USR_R getSpplUsrR(ShipRprt_Upd01_HdrR hdrR, MST_PROV_SCHD_R provR) {
		MCDate dt = nvl(hdrR.ac_dt(), hdrR.ship_tm());
		if (!isNull(dt)) {
			dt = dt.trunc(MCDateFieldType.DAY);
		}
		MAM_SPPL_USR_R r = _spplUsrCache.get(dt, provR.prsppl_cd());
		if (!isNull(r.outsrc_usr_cd()) && isNull(r.outsrc_dpt_cd())) {
			MAM_USR_ACL_R aclR =getUsrAclR(r.outsrc_usr_cd(), dt);
			r.outsrc_dpt_cd(aclR.dpt_cd());		// 外注担当者の主部門
		}
		return r;
	}
	
	/**
	 * 物流制御マスタのキャッシュ
	 */
	protected FXUCL_Cache<MAM_LG_CTL_R> _cacheLgCtlL;
	protected void doLgCtlCache(MCList<MST_PROV_SCHD_R> provL) {
		MCList<MST_PROV_SCHD_R> tgtL = MCList.create(MST_PROV_SCHD_R.class);
		provL.forEach(r -> {
			if (!isNull(r.getStringNE("gr_lg_grp_cd")) && !isNull(r.getStringNE("gi_lg_grp_cd"))) {
				tgtL.add(r);
			}
		});
		if (tgtL.isEmpty()) return;
		
		MCList<MAM_LG_CTL_R> dbc = MCList.create(MAM_LG_CTL_R.class);
		MAM_LG_CTL_R t = MAM_LG_CTL_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setWhere(t.fr_lg_grp_cd.eq(bind("gi_lg_grp_cd")));
		dbc_bldr.addWhereWithAnd(t.to_lg_grp_cd.eq(bind("gr_lg_grp_cd")));
		dbSelect("MSBEL5550_MAM_LG_CTL_S01", dbc, dbc_bldr, tgtL);
		
		if (!dbc.isEmpty()) {
			_cacheLgCtlL =new FXUCL_Cache<MAM_LG_CTL_R>();
			_cacheLgCtlL.setFixMaxCacheSize(-1);
			for (MAM_LG_CTL_R r : dbc) {
				_cacheLgCtlL.putCache(new String[]{r.fr_lg_grp_cd(), r.to_lg_grp_cd()}, r);
			}
		}
	}
	protected MAM_LG_CTL_R getLgCtlR(String shipFrLgGrpCd, String shipToLgGrpCd) {
		if (isNull(shipFrLgGrpCd) || isNull(shipToLgGrpCd)) {
			return null;
		}
		return _cacheLgCtlL.getCache(shipFrLgGrpCd, shipToLgGrpCd);
	}
	
	/**
	 * 担当権限マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCacheStEnd<MAM_USR_ACL_R> _usrAclCache;
	protected MAM_USR_ACL_R getUsrAclR(String usrCd, MCDate dt) {
		if (_usrAclCache == null) {
			MAM_USR_ACL_R t = MAM_USR_ACL_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.usr_cd, t.dpt_cd);
			_usrAclCache = new FXUCL_MCDbcCacheStEnd<MAM_USR_ACL_R>(dbc_bldr);
		}
		return _usrAclCache.get(dt, usrCd);
	}

	/**
	 * 品目単位マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _cacheItmUnitL = null;
	protected void doItmUnitCache(MCList<ShipRprt_Upd01_DtlR> dtlL) {
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.unit_cd,
				t.dec_place,
				t.rnd_typ,
				t.conv_qty,
				t.conv_base_qty
				);
		_cacheItmUnitL = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(
			dbc_bldr, dtlL,
			ShipRprt_Upd01_DtlR.$itm_cd,
			ShipRprt_Upd01_DtlR.$itm_sub1,
			ShipRprt_Upd01_DtlR.$itm_sub2,
			ShipRprt_Upd01_DtlR.$itm_sub3,
			ShipRprt_Upd01_DtlR.$trd_unit_cd
			);
	}
	protected MAVM_ITM_UNIT_R getItmUnitR(String itmCd, String sub1, String sub2, String sub3, String unitCd) {
		return _cacheItmUnitL.get(itmCd, sub1, sub2, sub3, unitCd);
	}

	/**
	 * 業務理由マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_BIZ_RSN_R> _cacheBizRsnL = null;
	protected void doBizRsnCache(MCList<ShipRprt_Upd01_DtlR> dtlL) {
		MAM_BIZ_RSN_R t = MAM_BIZ_RSN_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.biz_rsn_cd, t.sls_acxfr_flg);
		_cacheBizRsnL = new FXUCL_MCDbcCache<MAM_BIZ_RSN_R>(dbc_bldr, dtlL, ShipRprt_Upd01_DtlR.$rsn_cd);
	}
	protected MAM_BIZ_RSN_R getBizRsnR(String rsnCd) {
		return _cacheBizRsnL.get(rsnCd);
	}

	/**
	 * 受注、受注明細のキャッシュ
	 */
	protected FXUCL_MCDbcCache<MST_SLO_D_R> _cacheSloDL = null;
	protected void doSloDCache(MCList<ShipRprt_Upd01_DtlR> dtlL) {
		MCList<ShipRprt_Upd01_DtlR>
			l = dtlL.subList(r -> !isNull(r.slo_d_no()));
		if (l.isEmpty())	return;
		
		MCList<MST_SLO_D_R> dbc = MCList.create(MST_SLO_D_R.class);
		MST_SLO_D_R t = MST_SLO_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MST_SLO_R t1 = MST_SLO_R.create("T1");
		dbc.addBooleanColumn("xrate_inpt_flg");
		dbc.addBooleanColumn("ptax_xrate_inpt_flg");
		dbc_bldr.setSelect(
				t.slo_d_no,
				t.slo_no,
				t.dlv_rqst_tm,
				t.pri_prnt_flg,
				t.sno1,
				t.sno2,
				t.sno3,
				t.sno4,
				t.trd_unit_qty,
				t.base_unit_qty,
				t.trd_unit_cd,
				t.trd_cur_upri,
				t.trd_cur_dscnt_amt,
				t.tax_cd,
				t.wtax_rate,
				t.cst_po_d_no,
				t.cst_itm_cd,
				t.cst_itm_nm,
				t.tax_fix_flg,
				t.interim_flg
		);
		dbc_bldr.addSelect(
				t1.sls_dpt_cd,
				t1.sls_usr_cd,
				t1.cst_po_no,
				t1.trd_cur_cd,
				t1.xrate,
				t1.xrate_inpt_flg,
				t1.ptax_xrate,
				t1.ptax_xrate_inpt_flg,
				t1.sls_basis_typ,
				t1.trd_rmrks
		);
		dbc_bldr.addInnerJoin(t1, bracket(t1.slo_no.eq(t.slo_no)));
		_cacheSloDL = new FXUCL_MCDbcCache<MST_SLO_D_R>(dbc, dbc_bldr, l, ShipRprt_Upd01_DtlR.$slo_d_no);
	}
	protected MST_SLO_D_R getSloDR(String sloDNo) {
		return _cacheSloDL.get(sloDNo);
	}

	/**
	 * 出荷予定のキャッシュ
	 */
	protected FXUCL_MCDbcCache<MST_SHIP_SCHD_R> _cacheShipSchdL = null;
	protected void doShipSchdCache(MCList<ShipRprt_Upd01_DtlR> dtlL) {
		MCList<ShipRprt_Upd01_DtlR>
			l = dtlL.subList(r -> !isNull(r.ship_schd_no()));
		if (l.isEmpty())	return;
		
		MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.ship_schd_no, t.trd_unit_qty, t.trd_unit_cd);
		_cacheShipSchdL = new FXUCL_MCDbcCache<MST_SHIP_SCHD_R>(dbc_bldr, l, ShipRprt_Upd01_DtlR.$ship_schd_no);
	}
	protected MST_SHIP_SCHD_R getShipSchdDR(String shipSchdNo) {
		return _cacheShipSchdL.get(shipSchdNo);
	}

	/**
	 * 売上実績のキャッシュ<br>
	 */
	protected FXUCL_Cache<MST_SLS_ACT_R> _cacheSlsAct;
	protected void doSlsActCache(MCList<ShipRprt_Upd01_HdrR> hdrL) {
		MCList<ShipRprt_Upd01_HdrR> l = hdrL
				.subList(r -> MSC_TRN_TYP.isSLS(r.trn_typ()));
		if (l.isEmpty()) return;

		MST_SLS_ACT_R slsAct = MST_SLS_ACT_R.create("SLS_ACT");
		MCQueryApiBuilder slsAct_bldr = MCQueryApiBuilder.create(slsAct);
		slsAct_bldr.setSelectAll();
		slsAct_bldr.addWhereWithAnd(slsAct.sls_act_no.eq(bind("dlv_slip_act_no")));
		slsAct_bldr.addWhereWithAnd(slsAct.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
		MCList<MST_SLS_ACT_R> slsActL = MCList.create(MST_SLS_ACT_R.class);
		dbSelect("MSBEL5550_MST_SLS_ACT_S01", slsActL, slsAct_bldr, hdrL);

		if (!slsActL.isEmpty()) {
			_cacheSlsAct = new FXUCL_Cache<MST_SLS_ACT_R>();
			_cacheSlsAct.setFixMaxCacheSize(-1);
			for (MST_SLS_ACT_R r : slsActL) {
				_cacheSlsAct.putCache(new String[]{r.sls_act_no()}, r);
			}
		}
	}
	protected MST_SLS_ACT_R getSlsActR(String dlvSlipActNo) {
		return _cacheSlsAct.getCache(dlvSlipActNo);
	}

	/**
	 * 納入指示受領のキャッシュ
	 */
	protected FXUCL_MCDbcCache<MST_DLV_INST_RCPT_R> _cacheDlvInstRcptL = null;
	protected void doDlvInstRcptCache(MCList<ShipRprt_Upd01_DtlR> dtlL) {
		MCList<ShipRprt_Upd01_DtlR>
			l = dtlL.subList(r -> !isNull(r.dlv_inst_rcpt_no()));
		if (l.isEmpty())	return;

		MST_DLV_INST_RCPT_R t = MST_DLV_INST_RCPT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.dlv_inst_rcpt_no, t.dlv_rqst_tm, t.trd_unit_cd, t.trd_unit_qty, t.cst_dlv_inst_no, t.cst_dlv_inst_d_no);
		_cacheDlvInstRcptL = new FXUCL_MCDbcCache<MST_DLV_INST_RCPT_R>(dbc_bldr, l, ShipRprt_Upd01_DtlR.$dlv_inst_rcpt_no);
	}
	protected MST_DLV_INST_RCPT_R getDlvInstRcpt(String dlvInstRcptNo) {
		return _cacheDlvInstRcptL.get(dlvInstRcptNo);
	}

	/**
	 * 支給予定のキャッシュ
	 */
	protected ProvSchdCache _provSchdCache = null;
	protected void doProvSchdCache(
		MCList<ShipRprt_Upd01_HdrR> hdrL, MCList<ShipRprt_Upd01_DtlR> dtlL) {
		_provSchdCache = new ProvSchdCache(hdrL, dtlL);
	}
	protected MST_PROV_SCHD_R getProvSchdR(
		ShipRprt_Upd01_HdrR hdrR, ShipRprt_Upd01_DtlR dtlR) {
		return _provSchdCache.get(hdrR, dtlR);
	}
	public class ProvSchdCache {
		protected MCList<MST_PROV_SCHD_R> _provSchdL = null, _provAct1L = null, _provAct2L = null;
		protected MCIndexKey _idx = null, _idx1 = null, _idx2 = null;
		protected ProvSchdCache(
			MCList<ShipRprt_Upd01_HdrR> hdrL, MCList<ShipRprt_Upd01_DtlR> dtlL) {
			MCList<ShipRprt_Upd01_DtlR>
				schdL = MCList.create(ShipRprt_Upd01_DtlR.class),
				actL = MCList.create(ShipRprt_Upd01_DtlR.class);

			// 初期設定（支給元予定区分の設定、予定、実績の振り分け）
			MCIndexKey idx = dtlL.createIndex(ShipRprt_Upd01_DtlR.$hdr_peg_no);
			hdrL.forEach(r -> {
				if (isProvTrd(r.trd_ptn_typ())) {
					MCList<ShipRprt_Upd01_DtlR> l = dtlL.subList(idx, r.hdr_peg_no());
					if (!isNull(r.dlv_slip_act_no())) {
						actL.addAll(l);
					}
					else {
						schdL.addAll(l);
					}
				}
			});
			if (!schdL.isEmpty() || !actL.isEmpty()) {
				selProvSchd(schdL, actL);
			}
			if (!actL.isEmpty()) {
				selProvAct(actL);
			}

			// 発注担当者マスタのキャッシュ
			MCList<MST_PROV_SCHD_R> provL = MCList.create(MST_PROV_SCHD_R.class);
			provL.addAll(_provSchdL);
			provL.addAll(_provAct1L);
			provL.addAll(_provAct2L);
			doSpplUsrCache(provL);
			
			// 物流制御マスタのキャッシュ
			doLgCtlCache(provL);
		}

		/**
		 * 支給実績を検索する
		 */
		protected void selProvAct(MCList<ShipRprt_Upd01_DtlR> actL) {
			_provAct1L = MCList.create(MST_PROV_SCHD_R.class);
			MST_PROV_SCHD_R provAct1L_t = MST_PROV_SCHD_R.create("T");
			MCQueryApiBuilder provAct1L_bldr = MCQueryApiBuilder.create(provAct1L_t);
			MST_PROV_ACT_R t1 = MST_PROV_ACT_R.create("T1");
			provAct1L_bldr.setSelect(
					t1.prov_act_no,
					t1.prov_src_act_typ,
					t1.prov_src_act_no,
					t1.accpt_dt.as("accpt_schd_dt"),
					t1.trd_cur_cd,
					t1.tax_cd,
					t1.xrate,
					value(true).as("xrate_inpt_flg"),
					t1.xrate,
					t1.ptax_xrate,
					value(true).as("ptax_xrate_inpt_flg"),
					t1.trd_cur_upri,
					t1.wtax_rate,
					t1.prov_typ,
					t1.prov_basis_typ,
					t1.prsppl_cd,
					t1.prov_act_no.as("dtl_uniq_no"),
					value(true).as("tax_fix_flg")
			);
			provAct1L_bldr.addRightOuterJoin(t1,
					bracket(t1.prov_schd_no.eq(provAct1L_t.prov_schd_no)));
			provAct1L_bldr.setWhere(t1.prov_act_no.eq(bind("dtl_uniq_no")));
			provAct1L_bldr.addOrderByDesc(t1.prov_act_seq);
			dbSelect("MSBEL5550_MST_PROV_SCHD_S01", _provAct1L, provAct1L_bldr, actL);
			_idx1 = _provAct1L.createIndex("prov_act_no");

			_provAct2L = MCList.create(MST_PROV_SCHD_R.class);
			MST_PROV_SCHD_R provAct2L_t = MST_PROV_SCHD_R.create("T");
			MCQueryApiBuilder provAct2L_bldr = MCQueryApiBuilder.create(provAct2L_t);
			provAct2L_bldr.setSelect(
					t1.prov_act_no,
					t1.prov_src_act_typ,
					t1.prov_src_act_no,
					t1.accpt_dt.as("accpt_schd_dt"),
					t1.trd_cur_cd,
					t1.tax_cd,
					t1.xrate,
					value(true).as("xrate_inpt_flg"),
					t1.xrate,
					t1.ptax_xrate,
					value(true).as("ptax_xrate_inpt_flg"),
					t1.trd_cur_upri,
					t1.wtax_rate,
					t1.prov_typ,
					t1.prov_basis_typ,
					t1.prsppl_cd,
					t1.prov_src_act_no.as("dtl_uniq_no"),
					value(true).as("tax_fix_flg"),
					t1.trd_ptn_typ
			);
			provAct2L_bldr.addRightOuterJoin(t1,
					bracket(t1.prov_schd_no.eq(provAct2L_t.prov_schd_no)));
			provAct2L_bldr.setWhere(
					t1.prov_src_act_typ.in(value(MSC_PROV_SRC_ACT_TYP.RET_SHIP.value()),
							value(MSC_PROV_SRC_ACT_TYP.XFR.value())));
			provAct2L_bldr.addWhereWithAnd(t1.prov_src_act_no.eq(bind("dtl_uniq_no")));
			provAct2L_bldr.addWhereWithAnd(
					t1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbSelect("MSBEL5550_MST_PROV_SCHD_S02", _provAct2L, provAct2L_bldr, actL);
			_idx2 = _provAct2L.createIndex("prov_src_act_no");
		}

		/**
		 * 支給予定を検索する
		 */
		protected void selProvSchd(
			MCList<ShipRprt_Upd01_DtlR> schdL, MCList<ShipRprt_Upd01_DtlR> actL) {
			_provSchdL = MCList.create(MST_PROV_SCHD_R.class);

			// 予定 or 実績、支給元予定区分別に支給予定を取得
			if (!schdL.isEmpty()) {
				_provSchdL.addAll(getShipFromSchd(schdL));
				_provSchdL.addAll(getXfrFromSchd(schdL));
				_provSchdL.addAll(getArrFromSchd(schdL));
			}
			if (!actL.isEmpty()) {
				_provSchdL.addAll(getShipFromAct(actL));
				//_provSchdL.addAll(getXfrFromAct(actL));	// 移動実績は支給実績から取得する
				_provSchdL.addAll(getArrFromAct(actL));
			}
			_idx = _provSchdL.createIndex(MST_PROV_SCHD_R.$prov_src_schd_typ, ShipRprt_Upd01_DtlR.$dtl_uniq_no);
		}

		/**
		 * 支給元予定区分「出荷」、出荷引当状況NOから支給予定を取得する
		 */
		protected MCList<MST_PROV_SCHD_R> getShipFromSchd(MCList<ShipRprt_Upd01_DtlR> dtlL) {
			MCList<ShipRprt_Upd01_DtlR> cndL = dtlL.subList(r -> MSC_TRN_TYP.isSHIP(r.trn_typ()));
			if (cndL.isEmpty()) {
				return null;
			}
			MCList<MST_PROV_SCHD_R> dbc = MCList.create(MST_PROV_SCHD_R.class);
			MST_PROV_SCHD_R t = MST_PROV_SCHD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
			MST_SHIP_ALLOC_STS_R t2 = MST_SHIP_ALLOC_STS_R.create("T2");
			MST_SHIP_INST_D_R t3 = MST_SHIP_INST_D_R.create("T3");
			MST_SHIP_INST_R t4 = MST_SHIP_INST_R.create("T4");
			MST_SHIP_PR_R t5 = MST_SHIP_PR_R.create("T5");
			MST_XFR_SCHD_R t6 = MST_XFR_SCHD_R.create("T6");
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MAM_LOC_R m2 = MAM_LOC_R.create("M2");
			MAM_BP_R m3 = MAM_BP_R.create("M3");
			dbc_bldr.setSelect(
					value(MSC_PROV_SRC_SCHD_TYP.SHIP.value()).as("prov_src_schd_typ"),
					t1.ship_schd_no.as("prov_src_schd_no1"),
					t6.gi_lg_grp_cd,
					t6.gr_lg_grp_cd,
					decode(t.prov_schd_no, nullValue(),
							trunc(decode(m3.prov_rcv_typ,
									value(MAC_PROV_RCV_TYP.NOT_ARR.value()),
									t4.ship_schd_tm, t4.dlv_schd_tm), MCDateFmt.DD),
							t.accpt_schd_dt).as("accpt_schd_dt"),
					decode(t.prov_schd_no, nullValue(), t6.trd_cur_cd, t.trd_cur_cd)
							.as("trd_cur_cd"),
					decode(t.prov_schd_no, nullValue(), t6.tax_cd, t.tax_cd).as("tax_cd"),
					decode(t.prov_schd_no, nullValue(), t6.xrate, t.xrate).as("xrate"),
					decode(t.prov_schd_no, nullValue(), t6.xrate_inpt_flg,
							t.xrate_inpt_flg).as("xrate_inpt_flg"),
					decode(t.prov_schd_no, nullValue(), t6.ptax_xrate, t.ptax_xrate)
							.as("ptax_xrate"),
					decode(t.prov_schd_no, nullValue(), t6.ptax_xrate_inpt_flg,
							t.ptax_xrate_inpt_flg).as("ptax_xrate_inpt_flg"),
					decode(t.prov_schd_no, nullValue(), t6.trd_cur_upri, t.trd_cur_upri)
							.as("trd_cur_upri"),
					decode(t.prov_schd_no, nullValue(), t6.wtax_rate, t.wtax_rate)
							.as("wtax_rate"),
					decode(t.prov_schd_no, nullValue(), t6.prov_typ, t.prov_typ)
							.as("prov_typ"),
					decode(t.prov_schd_no, nullValue(), t6.prov_basis_typ,
							t.prov_basis_typ).as("prov_basis_typ"),
					decode(t.prov_schd_no, nullValue(),
							decode(t5.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.PROV_RTN.value()), m2.sppl_cd,
									m1.sppl_cd),
							t.prsppl_cd).as("prsppl_cd"),
					t2.ship_alloc_sts_no.as("dtl_uniq_no"),
					decode(t.prov_schd_no, nullValue(), t6.tax_fix_flg, t.tax_fix_flg)
							.as("tax_fix_flg"));
			dbc_bldr.addRightOuterJoin(t1,
					bracket(t1.ship_schd_no.eq(t.prov_src_schd_no1)
							.and(t.prov_src_schd_typ
									.eq(value(MSC_PROV_SRC_SCHD_TYP.SHIP.value())))));
			dbc_bldr.addInnerJoin(t2, bracket(t2.ship_inst_d_no.eq(t1.ship_inst_d_no)));
			dbc_bldr.addInnerJoin(t3, bracket(t3.ship_inst_d_no.eq(t2.ship_inst_d_no)));
			dbc_bldr.addInnerJoin(t4, bracket(t4.ship_inst_no.eq(t3.ship_inst_no)));
			dbc_bldr.addInnerJoin(t5, bracket(t5.ship_pr_no.eq(t1.ship_pr_no)));
			dbc_bldr.addInnerJoin(t6, bracket(t6.xfr_schd_no.eq(t5.xfr_schd_no)));
			dbc_bldr.addLeftOuterJoin(m1, bracket(m1.loc_cd.eq(t6.gr_loc_cd)));
			dbc_bldr.addLeftOuterJoin(m2, bracket(m2.loc_cd.eq(t6.gi_loc_cd)));
			dbc_bldr.addLeftOuterJoin(m3, bracket(m3.bp_cd.eq(m1.sppl_cd)));
			dbc_bldr.setWhere(t2.ship_alloc_sts_no.eq(bind("dtl_uniq_no")));
			dbSelect("MSBEL5550_MST_PROV_SCHD_S03", dbc, dbc_bldr, cndL);
			return dbc;
		}

		/**
		 * 取引パタン区分が「支給」の場合、支給元予定区分「出荷」、出荷実績明細NOから支給予定を取得する
		 */
		protected MCList<MST_PROV_SCHD_R> getShipFromAct(MCList<ShipRprt_Upd01_DtlR> dtlL) {
			MCList<ShipRprt_Upd01_DtlR> cndL = dtlL.subList(r -> MSC_TRN_TYP.isSHIP(r.trn_typ()));
			if (cndL.isEmpty()) {
				return null;
			}
			MCList<MST_PROV_SCHD_R> dbc = MCList.create(MST_PROV_SCHD_R.class);
			MST_PROV_SCHD_R t = MST_PROV_SCHD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
			MST_SHIP_ALLOC_STS_R t2 = MST_SHIP_ALLOC_STS_R.create("T2");
			MST_SHIP_ACT_D_R t3 = MST_SHIP_ACT_D_R.create("T3");
			MST_SHIP_INST_D_R t4 = MST_SHIP_INST_D_R.create("T4");
			MST_SHIP_INST_R t5 = MST_SHIP_INST_R.create("T5");
			MST_SHIP_PR_R t6 = MST_SHIP_PR_R.create("T6");
			MST_XFR_SCHD_R t7 = MST_XFR_SCHD_R.create("T7");
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MAM_LOC_R m2 = MAM_LOC_R.create("M2");
			MAM_BP_R m3 = MAM_BP_R.create("M3");
			dbc_bldr.setSelect(
					value(MSC_PROV_SRC_SCHD_TYP.SHIP.value()).as("prov_src_schd_typ"),
					t1.ship_schd_no.as("prov_src_schd_no1"),
					t7.gi_lg_grp_cd,
					t7.gr_lg_grp_cd,
					decode(t.prov_schd_no, nullValue(),
							trunc(decode(m3.prov_rcv_typ,
									value(MAC_PROV_RCV_TYP.NOT_ARR.value()),
									nvl(t5.ship_schd_tm, t1.ship_schd_tm),
									nvl(t5.dlv_schd_tm, t1.dlv_schd_tm)), MCDateFmt.DD),
							t.accpt_schd_dt).as("accpt_schd_dt"),
					decode(t.prov_schd_no, nullValue(), t7.trd_cur_cd, t.trd_cur_cd)
							.as("trd_cur_cd"),
					decode(t.prov_schd_no, nullValue(), t7.tax_cd, t.tax_cd).as("tax_cd"),
					decode(t.prov_schd_no, nullValue(), t7.xrate, t.xrate).as("xrate"),
					decode(t.prov_schd_no, nullValue(), t7.xrate_inpt_flg,
							t.xrate_inpt_flg).as("xrate_inpt_flg"),
					decode(t.prov_schd_no, nullValue(), t7.ptax_xrate, t.ptax_xrate)
							.as("ptax_xrate"),
					decode(t.prov_schd_no, nullValue(), t7.ptax_xrate_inpt_flg,
							t.ptax_xrate_inpt_flg).as("ptax_xrate_inpt_flg"),
					decode(t.prov_schd_no, nullValue(), t7.trd_cur_upri, t.trd_cur_upri)
							.as("trd_cur_upri"),
					decode(t.prov_schd_no, nullValue(), t7.wtax_rate, t.wtax_rate)
							.as("wtax_rate"),
					decode(t.prov_schd_no, nullValue(), t7.prov_typ, t.prov_typ)
							.as("prov_typ"),
					decode(t.prov_schd_no, nullValue(), t7.prov_basis_typ,
							t.prov_basis_typ).as("prov_basis_typ"),
					decode(t.prov_schd_no, nullValue(),
							decode(t6.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.PROV_RTN.value()), m2.sppl_cd,
									m1.sppl_cd),
							t.prsppl_cd).as("prsppl_cd"),
					t3.ship_act_d_no.as("dtl_uniq_no"),
					decode(t.prov_schd_no, nullValue(), t7.tax_fix_flg, t.tax_fix_flg)
							.as("tax_fix_flg"));
			dbc_bldr.addRightOuterJoin(t1,
					bracket(t1.ship_schd_no.eq(t.prov_src_schd_no1)
							.and(t.prov_src_schd_typ
									.eq(value(MSC_PROV_SRC_SCHD_TYP.SHIP.value())))));
			dbc_bldr.addInnerJoin(t2, bracket(t2.ship_inst_d_no.eq(t1.ship_inst_d_no).or(t2.ship_schd_no.eq(t1.ship_schd_no))));
			dbc_bldr.addInnerJoin(t3, bracket(t3.ship_alloc_sts_no.eq(t2.ship_alloc_sts_no)));
			dbc_bldr.addLeftOuterJoin(t4, bracket(t4.ship_inst_d_no.eq(t2.ship_inst_d_no)));
			dbc_bldr.addLeftOuterJoin(t5, bracket(t5.ship_inst_no.eq(t4.ship_inst_no)));
			dbc_bldr.addInnerJoin(t6, bracket(t6.ship_pr_no.eq(t1.ship_pr_no)));
			dbc_bldr.addInnerJoin(t7, bracket(t7.xfr_schd_no.eq(t6.xfr_schd_no)));
			dbc_bldr.addLeftOuterJoin(m1, bracket(m1.loc_cd.eq(t7.gr_loc_cd)));
			dbc_bldr.addLeftOuterJoin(m2, bracket(m2.loc_cd.eq(t7.gi_loc_cd)));
			dbc_bldr.addLeftOuterJoin(m3, bracket(m3.bp_cd.eq(m1.sppl_cd)));
			dbc_bldr.setWhere(t3.ship_act_d_no.eq(bind("dtl_uniq_no")));
			dbSelect("MSBEL5550_MST_PROV_SCHD_S04", dbc, dbc_bldr, cndL);
			return dbc;
		}

		/**
		 * 支給元予定区分「移動」、移動引当状況NOから支給予定を取得する
		 */
		protected MCList<MST_PROV_SCHD_R> getXfrFromSchd(MCList<ShipRprt_Upd01_DtlR> dtlL) {
			MCList<ShipRprt_Upd01_DtlR> cndL = dtlL.subList(r -> MSC_TRN_TYP.isXFR(r.trn_typ()));
			if (cndL.isEmpty()) {
				return null;
			}
			MCList<MST_PROV_SCHD_R> dbc = MCList.create(MST_PROV_SCHD_R.class);
			MST_PROV_SCHD_R t = MST_PROV_SCHD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MST_XFR_ALLOC_STS_R t1 = MST_XFR_ALLOC_STS_R.create("T1");
			MST_XFR_INST_D_R t2 = MST_XFR_INST_D_R.create("T2");
			MST_XFR_INST_R t3 = MST_XFR_INST_R.create("T3");
			MST_XFR_SCHD_R t4 = MST_XFR_SCHD_R.create("T4");
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MAM_LOC_R m2 = MAM_LOC_R.create("M2");
			dbc_bldr.setSelect(
					value(MSC_PROV_SRC_SCHD_TYP.XFR.value()).as("prov_src_schd_typ"),
					t1.xfr_alloc_sts_no.as("prov_src_schd_no1"),
					decode(t.prov_schd_no, nullValue(), t3.xfr_schd_dt, t.accpt_schd_dt)
							.as("accpt_schd_dt"),
					decode(t.prov_schd_no, nullValue(), t4.trd_cur_cd, t.trd_cur_cd)
							.as("trd_cur_cd"),
					decode(t.prov_schd_no, nullValue(), t4.tax_cd, t.tax_cd).as("tax_cd"),
					decode(t.prov_schd_no, nullValue(), t4.xrate, t.xrate).as("xrate"),
					decode(t.prov_schd_no, nullValue(), t4.xrate_inpt_flg,
							t.xrate_inpt_flg).as("xrate_inpt_flg"),
					decode(t.prov_schd_no, nullValue(), t4.ptax_xrate, t.ptax_xrate)
							.as("ptax_xrate"),
					decode(t.prov_schd_no, nullValue(), t4.ptax_xrate_inpt_flg,
							t.ptax_xrate_inpt_flg).as("ptax_xrate_inpt_flg"),
					decode(t.prov_schd_no, nullValue(), t4.trd_cur_upri, t.trd_cur_upri)
							.as("trd_cur_upri"),
					decode(t.prov_schd_no, nullValue(), t4.wtax_rate, t.wtax_rate)
							.as("wtax_rate"),
					decode(t.prov_schd_no, nullValue(),
							decode(t4.xfr_schd_no, nullValue(), t1.prov_typ, t4.prov_typ),
							t.prov_typ).as("prov_typ"),
					decode(t.prov_schd_no, nullValue(),
							decode(t4.xfr_schd_no, nullValue(), t1.prov_basis_typ,
									t4.prov_basis_typ),
							t.prov_basis_typ).as("prov_basis_typ"),
					decode(t.prov_schd_no, nullValue(),
							decode(t1.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.PROV_RTN.value()), m2.sppl_cd,
									m1.sppl_cd),
							t.prsppl_cd).as("prsppl_cd"),
					t1.xfr_alloc_sts_no.as("dtl_uniq_no"),
					decode(t.prov_schd_no, nullValue(), t4.tax_fix_flg, t.tax_fix_flg)
							.as("tax_fix_flg"));
			dbc_bldr.addRightOuterJoin(t1,
					bracket(t1.xfr_alloc_sts_no.eq(t.prov_src_schd_no1)
							.and(t.prov_src_schd_typ
									.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))));
			dbc_bldr.addInnerJoin(t2, bracket(t2.xfr_inst_d_no.eq(t1.xfr_inst_d_no)));
			dbc_bldr.addInnerJoin(t3, bracket(t3.xfr_inst_no.eq(t2.xfr_inst_no)));
			dbc_bldr.addLeftOuterJoin(t4, bracket(t4.xfr_schd_no.eq(t1.xfr_schd_no)));
			dbc_bldr.addLeftOuterJoin(m1, bracket(m1.loc_cd.eq(t1.gr_loc_cd)));
			dbc_bldr.addLeftOuterJoin(m2, bracket(m2.loc_cd.eq(t1.gi_loc_cd)));
			dbc_bldr.setWhere(t1.xfr_alloc_sts_no.eq(bind("dtl_uniq_no")));
			dbSelect("MSBEL5550_MST_PROV_SCHD_S05", dbc, dbc_bldr, cndL);
			return dbc;
		}

		/**
		 * 支給元予定区分「移動」、移動実績明細NOから支給予定を取得する
		 */
		protected MCList<MST_PROV_SCHD_R> getXfrFromAct(MCList<ShipRprt_Upd01_DtlR> dtlL) {
			MCList<ShipRprt_Upd01_DtlR> cndL = dtlL.subList(r -> MSC_TRN_TYP.isXFR(r.trn_typ()));
			if (cndL.isEmpty()) {
				return null;
			}
			MCList<MST_PROV_SCHD_R> dbc = MCList.create(MST_PROV_SCHD_R.class);
			MST_PROV_SCHD_R t = MST_PROV_SCHD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MST_XFR_ALLOC_STS_R t1 = MST_XFR_ALLOC_STS_R.create("T1");
			MST_XFR_ACT_D_R t2 = MST_XFR_ACT_D_R.create("T2");
			MST_XFR_INST_D_R t3 = MST_XFR_INST_D_R.create("T3");
			MST_XFR_INST_R t4 = MST_XFR_INST_R.create("T4");
			MST_XFR_SCHD_R t5 = MST_XFR_SCHD_R.create("T5");
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MAM_LOC_R m2 = MAM_LOC_R.create("M2");
			dbc_bldr.setSelect(
					value(MSC_PROV_SRC_SCHD_TYP.XFR.value()).as("prov_src_schd_typ"),
					t1.xfr_alloc_sts_no.as("prov_src_schd_no1"),
					decode(t.prov_schd_no, nullValue(),
							nvl(t4.xfr_schd_dt, t1.xfr_schd_dt), t.accpt_schd_dt)
									.as("accpt_schd_dt"),
					decode(t.prov_schd_no, nullValue(), t5.trd_cur_cd, t.trd_cur_cd)
							.as("trd_cur_cd"),
					decode(t.prov_schd_no, nullValue(), t5.tax_cd, t.tax_cd).as("tax_cd"),
					decode(t.prov_schd_no, nullValue(), t5.xrate, t.xrate).as("xrate"),
					decode(t.prov_schd_no, nullValue(), t5.xrate_inpt_flg,
							t.xrate_inpt_flg).as("xrate_inpt_flg"),
					decode(t.prov_schd_no, nullValue(), t5.ptax_xrate, t.ptax_xrate)
							.as("ptax_xrate"),
					decode(t.prov_schd_no, nullValue(), t5.ptax_xrate_inpt_flg,
							t.ptax_xrate_inpt_flg).as("ptax_xrate_inpt_flg"),
					decode(t.prov_schd_no, nullValue(), t5.trd_cur_upri, t.trd_cur_upri)
							.as("trd_cur_upri"),
					decode(t.prov_schd_no, nullValue(), t5.wtax_rate, t.wtax_rate)
							.as("wtax_rate"),
					decode(t.prov_schd_no, nullValue(),
							decode(t5.xfr_schd_no, nullValue(), t1.prov_typ, t5.prov_typ),
							t.prov_typ).as("prov_typ"),
					decode(t.prov_schd_no, nullValue(),
							decode(t5.xfr_schd_no, nullValue(), t1.prov_basis_typ,
									t5.prov_basis_typ),
							t.prov_basis_typ).as("prov_basis_typ"),
					decode(t.prov_schd_no, nullValue(),
							decode(t1.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.PROV_RTN.value()), m2.sppl_cd,
									m1.sppl_cd),
							t.prsppl_cd).as("prsppl_cd"),
					t2.xfr_act_d_no.as("dtl_uniq_no"),
					decode(t.prov_schd_no, nullValue(), t5.tax_fix_flg, t.tax_fix_flg)
							.as("tax_fix_flg"));
			dbc_bldr.addRightOuterJoin(t1,
					bracket(t1.xfr_alloc_sts_no.eq(t.prov_src_schd_no1)
							.and(t.prov_src_schd_typ
									.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))));
			dbc_bldr.addInnerJoin(t2, bracket(t2.xfr_alloc_sts_no.eq(t1.xfr_alloc_sts_no)));
			dbc_bldr.addLeftOuterJoin(t3, bracket(t3.xfr_inst_d_no.eq(t1.xfr_inst_d_no)));
			dbc_bldr.addLeftOuterJoin(t4, bracket(t4.xfr_inst_no.eq(t3.xfr_inst_no)));
			dbc_bldr.addLeftOuterJoin(t5, bracket(t5.xfr_schd_no.eq(t1.xfr_schd_no)));
			dbc_bldr.addLeftOuterJoin(m1, bracket(m1.loc_cd.eq(t1.gr_loc_cd)));
			dbc_bldr.addLeftOuterJoin(m2, bracket(m2.loc_cd.eq(t1.gi_loc_cd)));
			dbc_bldr.setWhere(t2.xfr_act_d_no.eq(bind("dtl_uniq_no")));
			dbSelect("MSBEL5550_MST_PROV_SCHD_S06", dbc, dbc_bldr, cndL);
			return dbc;
		}

		/**
		 * 支給元予定区分「出荷」or「直送」、入荷予定NOから支給予定を取得する
		 */
		protected MCList<MST_PROV_SCHD_R> getArrFromSchd(MCList<ShipRprt_Upd01_DtlR> dtlL) {
			MCList<ShipRprt_Upd01_DtlR> cndL = dtlL.subList(r -> MSC_TRN_TYP.isPROV(r.trn_typ()));
			if (cndL.isEmpty()) {
				return null;
			}
			MCList<MST_PROV_SCHD_R> dbc = MCList.create(MST_PROV_SCHD_R.class);
			MST_PROV_SCHD_R t = MST_PROV_SCHD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(
					t.prov_src_schd_typ,
					t.prov_src_schd_no2,
					t.accpt_schd_dt,
					t.trd_cur_cd,
					t.tax_cd, t.xrate,
					t.xrate_inpt_flg,
					t.ptax_xrate,
					t.ptax_xrate_inpt_flg,
					t.trd_cur_upri,
					t.wtax_rate,
					t.prov_typ,
					t.prov_basis_typ,
					t.prsppl_cd,
					t.tax_fix_flg
			);
			dbc_bldr.addSelect(t.prov_src_schd_no2.as("dtl_uniq_no"));
			dbc_bldr.setWhere(
					t.prov_src_schd_typ.in(value(MSC_PROV_SRC_SCHD_TYP.SHIP.value()),
							value(MSC_PROV_SRC_SCHD_TYP.DDLV.value())));
			dbc_bldr.addWhereWithAnd(t.prov_src_schd_no2.eq(bind("dtl_uniq_no")));
			dbSelect("MSBEL5550_MST_PROV_SCHD_S07", dbc, dbc_bldr, cndL);
			return dbc;
		}

		/**
		 * 支給元予定区分「出荷」or「直送」、入荷実績NOから支給予定を取得する
		 */
		protected MCList<MST_PROV_SCHD_R> getArrFromAct(MCList<ShipRprt_Upd01_DtlR> dtlL) {
			MCList<ShipRprt_Upd01_DtlR> cndL = dtlL.subList(r -> MSC_TRN_TYP.isPROV(r.trn_typ()));
			if (cndL.isEmpty()) {
				return null;
			}
			MCList<MST_PROV_SCHD_R> dbc = MCList.create(MST_PROV_SCHD_R.class);
			MST_PROV_SCHD_R t = MST_PROV_SCHD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MST_ARR_ACT_R t1 = MST_ARR_ACT_R.create("T1");
			dbc_bldr.setSelect(
					t.prov_src_schd_typ,
					t.prov_src_schd_no2,
					t.accpt_schd_dt,
					t.trd_cur_cd,
					t.tax_cd,
					t.xrate,
					t.xrate_inpt_flg,
					t.ptax_xrate,
					t.ptax_xrate_inpt_flg,
					t.trd_cur_upri,
					t.wtax_rate,
					t.prov_typ,
					t.prov_basis_typ,
					t.prsppl_cd,
					t.tax_fix_flg
			);
			dbc_bldr.addSelect(t1.arr_act_no.as("dtl_uniq_no"));
			dbc_bldr.addInnerJoin(t1, bracket(t1.arr_act_no.eq(t.prov_src_schd_no2)));
			dbc_bldr.setWhere(
					t.prov_src_schd_typ.in(value(MSC_PROV_SRC_SCHD_TYP.SHIP.value()),
							value(MSC_PROV_SRC_SCHD_TYP.DDLV.value())));
			dbc_bldr.addWhereWithAnd(t1.arr_act_no.eq(bind("dtl_uniq_no")));
			dbSelect("MSBEL5550_MST_PROV_SCHD_S08", dbc, dbc_bldr, cndL);
			return dbc;
		}

		protected MST_PROV_SCHD_R get(ShipRprt_Upd01_HdrR hdrR, ShipRprt_Upd01_DtlR dtlR) {
			if (MSC_TRN_TYP.isPROV(hdrR.trn_typ())) {
				// 下記の場合、それぞれの明細特定NOを元に支給実績を取得する
				// トランザクション区分「支給」：支給実績NO
				return _provAct1L.getFirst(_idx1, dtlR.dtl_uniq_no());
			}
			else if (!isNull(hdrR.dlv_slip_act_no())
						&& (MAC_TRD_PTN_TYP.isPROV_RTN(hdrR.trd_ptn_typ()) || MSC_TRN_TYP.isXFR(hdrR.trn_typ()))) {
				// 下記の場合、それぞれの明細特定NOを元に支給実績を取得する
				// 取引パタン区分「支給返品」：出荷実績明細NO
				// トランザクション区分「移動」：移動実績明細ＮＯ
				MCList<MST_PROV_SCHD_R> list = _provAct2L.subList(_idx2, dtlR.dtl_uniq_no());
				if (!list.isEmpty()) {
					if (list.size() > 1) {
						// 1件以上になるのは外注間の場合のみ。その場合は「支給」を採用する
						return list.getFirst(MST_PROV_SCHD_R.$trd_ptn_typ, MAC_TRD_PTN_TYP.PROV.value());
					}
					return list.get(0);
				}
			}
			else {
				String[] arr = getProvSrcSchdTyp(hdrR, dtlR);
				if (arr != null && arr.length > 0) {
					for (String s :arr) {
						MST_PROV_SCHD_R r = _provSchdL.getFirst(_idx, s, dtlR.dtl_uniq_no());
						if (!isNull(r)) {
							return r;
						}
					}
				}
			}
			return null;
		}
		protected String[] getProvSrcSchdTyp(ShipRprt_Upd01_HdrR hdrR, ShipRprt_Upd01_DtlR dtlR) {
			String[] arr = null;
			// トランザクション区分が「出荷」
			if (MSC_TRN_TYP.isSHIP(hdrR.trn_typ())) {
				// 出荷引当状況NO or 出荷実績明細NOを元に支給予定を検索する
				arr = new String[]{MSC_PROV_SRC_SCHD_TYP.SHIP.value()};
			}
			// トランザクション区分が「移動」
			else if (MSC_TRN_TYP.isXFR(hdrR.trn_typ())) {
				// 移動引当状況NO or 移動実績明細NOを元に支給予定を検索する
				arr = new String[]{MSC_PROV_SRC_SCHD_TYP.XFR.value()};
			}
			// トランザクション区分が「入荷」
			else if (MSC_TRN_TYP.isARR(hdrR.trn_typ())) {
				// 支給品着荷一覧からの場合は、「出荷」「直送」のいずれかに一致する
				// 入荷予定NO or 入荷実績NOを元に支給予定を検索する
				arr = new String[]{
					MSC_PROV_SRC_SCHD_TYP.SHIP.value(),
					MSC_PROV_SRC_SCHD_TYP.DDLV.value()
				};
			}
			// トランザクション区分が「支給」
			else if (MSC_TRN_TYP.isPROV(hdrR.trn_typ())) {
				// 支給実績NOを元に支給実績を検索する
				// よって支給元予定区分は不要
			}
			return arr;
		}
	}

	/**
	 * 納品伝票のキャッシュ
	 */
	protected DlvSlipCache _dlvSlipCache = null;
	protected void doDlvSlipCache(MCList<ShipRprt_Upd01_HdrR> hdrL) {
		_dlvSlipCache = new DlvSlipCache(hdrL);
	}
	protected MST_DLV_SLIP_R getDlvSlipR(String dlvSlipNo) {
		return _dlvSlipCache.get(dlvSlipNo);
	}
	protected MCList<MST_DLV_SLIP_R> getDlvSlipL(ShipRprt_Upd01_HdrR hdrR) {
		MCList<MST_DLV_SLIP_R> retL = MCList.create(MST_DLV_SLIP_R.class);
		if (!isNull(hdrR.trn_typ())) {
			if (!isNull(hdrR.dlv_slip_act_no())) {
				retL.setAll(_dlvSlipCache.getActL(hdrR.trn_typ(), hdrR.dlv_slip_act_no()));
			}
			else if (!isNull(hdrR.dlv_slip_inst_no())) {
				retL.setAll(_dlvSlipCache.getInstL(hdrR.trn_typ(), hdrR.dlv_slip_inst_no()));
			}
		}
		return retL;
	}
	protected MST_DLV_SLIP_R getDlvSlipCanR(String dlvSlipNo) {
		// 発行済みの取消伝票のみ取得
		return _dlvSlipCache.getCanR(dlvSlipNo);
	}
	protected MCList<MST_DLV_SLIP_R> getDlvSlipCanL(ShipRprt_Upd01_HdrR hdrR) {
		// 発行済みの取消伝票のみ取得（実績のみ、指図では取消伝票は扱わない）
		MCList<MST_DLV_SLIP_R> retL = MCList.create(MST_DLV_SLIP_R.class);
		MCIndexKey idx = retL.createIndex(MST_DLV_SLIP_R.$dlv_slip_no);
		for (MST_DLV_SLIP_R r : getDlvSlipL(hdrR)) {
			if (!isNull(r.dlv_slip_act_no())) {
				if (isNull(retL.getFirst(idx, r.dlv_slip_no()))) {
					retL.add(getDlvSlipCanR(r.dlv_slip_no()));
					idx = retL.createIndex(MST_DLV_SLIP_R.$dlv_slip_no);
				}
			}
		}
		return retL;
	}
	public class DlvSlipCache {
		protected MCList<MST_DLV_SLIP_R>
			_dlvSlipL1 = null,	// 伝票NO内で最新の連番を持つ伝票を格納
			_dlvSlipL2 = null,	// 伝票指図NO内で最新の連番を持つ伝票を格納
			_dlvSlipL3 = null,	// 伝票実績NO内で最新の連番を持つ伝票を格納
			_dlvSlipL4 = null;	// 発行済みのリビジョンを持つ最新の伝票(取消伝票の発行に使用)
		protected MCIndexKey _idx1 = null, _idx2 = null, _idx3 = null, _idx4 = null;
		protected DlvSlipCache() {
		}
		protected DlvSlipCache(MCList<ShipRprt_Upd01_HdrR> hdrL) {

			// 上り電文の納品伝票NOに対応する伝票(最新の連番を持つ伝票)を取得
			_dlvSlipL1 = selectDlvSlip1(hdrL);
			// 上り電文のトランザクション区分、伝票指図NOの組み合わせで最新の伝票を取得
			_dlvSlipL2 = selectDlvSlip2(hdrL);
			// 上り電文のトランザクション区分、伝票実績NOの組み合わせで最新の伝票を取得
			_dlvSlipL3 = selectDlvSlip3(hdrL);
			
			// _dlvSlipL1～3で取得した伝票NOをワークに格納（_dlvSlip1と4の取得で使用する）
			insertDlvSlipWk();
			
			// _dlvSlipL1～3で取得した伝票NO内で最新の連番を持つ伝票を取得
			_dlvSlipL1 = selectDlvSlip1();
			
			// 発行済みのリビジョンを持つ最新の伝票(取消伝票の発行に使用)を取得
			_dlvSlipL4 = _dlvSlipL1.isEmpty() ?
				MCList.create(MST_DLV_SLIP_R.class) : selectDlvSlip4();

			_idx1 = _dlvSlipL1.createIndex(MST_DLV_SLIP_R.$dlv_slip_no);
			_idx2 = _dlvSlipL2.createIndex(MST_DLV_SLIP_R.$trn_typ, MST_DLV_SLIP_R.$dlv_slip_inst_no);
			_idx3 = _dlvSlipL3.createIndex(MST_DLV_SLIP_R.$trn_typ, MST_DLV_SLIP_R.$dlv_slip_act_no);
			_idx4 = _dlvSlipL4.createIndex(MST_DLV_SLIP_R.$dlv_slip_no);
			
			// 納品伝票明細をキャッシュ
			doDlvSlipDCache(_dlvSlipL1);
		}

		protected MCList<MST_DLV_SLIP_R> selectDlvSlip1(MCList<ShipRprt_Upd01_HdrR> hdrL) {
			// 上り電文の納品伝票NOに対応する伝票(最新の連番を持つ伝票)を取得
			MCList<ShipRprt_Upd01_HdrR>
				cndL = hdrL.subList(r -> !isNull(r.dlv_slip_no())).groupBy("dlv_slip_no");
			if (cndL.isEmpty()) {
				return MCList.create(MST_DLV_SLIP_R.class);
			}
				
			MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.dlv_slip_no);
			bldr.setWhere(t.dlv_slip_no.eq(bind("dlv_slip_no")));
			bldr.setGroupBy(t.dlv_slip_no);
			bldr.addMax(t.dlv_slip_seq, "dlv_slip_seq");
			bldr.setOrderByAsc(t.dlv_slip_no);
			
			MCList<MST_DLV_SLIP_R> rsltL = MCList.create(MST_DLV_SLIP_R.class);
			dbSelect("MSBEL5550_MST_DLV_SLIP_S07", rsltL, bldr, cndL);
			
			return selectForUpdDlvSlip(rsltL);
		}
		protected MCList<MST_DLV_SLIP_R> selectDlvSlip1() {
			// _dlvSlipL1～3で取得した伝票NO内で最新の連番を持つ伝票を取得
			MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			MCTempView w = createTempView("W");
			MSW_DLV_SLIP_KEY_R S1W1 = MSW_DLV_SLIP_KEY_R.create("W1");
			MST_DLV_SLIP_R S1W2 = MST_DLV_SLIP_R.create("W2");
			bldr
					.addInnerJoin(
							subQuery()
									.select(S1W2.dlv_slip_no,
											max(S1W2.dlv_slip_seq).as("dlv_slip_seq"))
									.from(S1W1.innerJoin(S1W2)
											.on(bracket(S1W2.dlv_slip_no
													.eq(S1W1.dlv_slip_no))))
									.groupBy(S1W2.dlv_slip_no).view(w),
							bracket(t.dlv_slip_no.eq(w.pr(S1W2.dlv_slip_no))
									.and(t.dlv_slip_seq.eq(w.pr("dlv_slip_seq")))));
									
			MCList<MST_DLV_SLIP_R> rsltL = MCList.create(MST_DLV_SLIP_R.class);
			dbSelect("MSBEL5550_MST_DLV_SLIP_S09", rsltL, bldr);
			
			return rsltL;
		}
		protected MCList<MST_DLV_SLIP_R> selectDlvSlip2(MCList<ShipRprt_Upd01_HdrR> hdrL) {
			// 上り電文のトランザクション区分、伝票指図NOの組み合わせで最新の伝票を取得
			// 指図で有効な納品伝票は、納品伝票実績ＮＯがNULL、もしくは取消済み（実績登録後、取り消された納品伝票）
			MCList<ShipRprt_Upd01_HdrR>
				cndL = hdrL
					.subList(r -> !isNull(r.trn_typ()) && !isNullOrNullVal(r.dlv_slip_inst_no()))
					.groupBy("trn_typ", "dlv_slip_inst_no");
			if (cndL.isEmpty()) {
				return MCList.create(MST_DLV_SLIP_R.class);
			}
			
			MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.dlv_slip_no, t.dlv_slip_seq, t.dlv_slip_act_no, t.slip_sts_typ);
			bldr.setWhere(t.dlv_slip_inst_no.eq(bind("dlv_slip_inst_no")));
			bldr.addWhereWithAnd(t.trn_typ.eq(bind("trn_typ")));
			
			MCList<MST_DLV_SLIP_R> rsltL = MCList.create(MST_DLV_SLIP_R.class);
			dbSelect("MSBEL5550_MST_DLV_SLIP_S03", rsltL, bldr, cndL);
			
			MCList<MST_DLV_SLIP_R> dlvL = MCList.create(MST_DLV_SLIP_R.class);
			for (MCList<MST_DLV_SLIP_R> gp : rsltL.groupList(MST_DLV_SLIP_R.$dlv_slip_no)) {
				gp.sort(SortType.DESC, MST_DLV_SLIP_R.$dlv_slip_seq);
				
				MST_DLV_SLIP_R dlvR = gp.get(0);
				if (isNull(dlvR.dlv_slip_act_no())
					|| MAC_SLIP_STS_TYP.isCAN(dlvR.slip_sts_typ())) {
					dlvL.add(dlvR);
				}
			}
			
			return selectForUpdDlvSlip(dlvL);
		}
		protected MCList<MST_DLV_SLIP_R> selectDlvSlip3(MCList<ShipRprt_Upd01_HdrR> hdrL) {
			// 上り電文のトランザクション区分、伝票実績NOの組み合わせで最新の伝票を取得
			MCList<ShipRprt_Upd01_HdrR>
				cndL = hdrL
					.subList(r -> !isNull(r.trn_typ()) && !isNull(r.dlv_slip_act_no()))
					.groupBy("trn_typ", "dlv_slip_act_no");
			if (cndL.isEmpty()) {
				return MCList.create(MST_DLV_SLIP_R.class);
			}
			
			MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.dlv_slip_no);
			bldr.setWhere(t.dlv_slip_act_no.eq(bind("dlv_slip_act_no")));
			bldr.addWhereWithAnd(t.trn_typ.eq(bind("trn_typ")));
			bldr.setGroupBy(t.dlv_slip_no);
			bldr.addMax(t.dlv_slip_seq, "dlv_slip_seq");
			bldr.setOrderByAsc(t.dlv_slip_no);
			
			MCList<MST_DLV_SLIP_R> rsltL = MCList.create(MST_DLV_SLIP_R.class);
			dbSelect("MSBEL5550_MST_DLV_SLIP_S05", rsltL, bldr, cndL);
			
			return selectForUpdDlvSlip(rsltL);
		}
		protected MCList<MST_DLV_SLIP_R> selectForUpdDlvSlip(MCList<MST_DLV_SLIP_R> dlvSlipL) {
			MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setOrderByAsc(t.dlv_slip_no);
			bldr.setLockTable(t.dlv_slip_no);
			
			MCList<MST_DLV_SLIP_R> rsltL = MCList.create(MST_DLV_SLIP_R.class);
			dbSelectKeyForUpdate("MSBEL5550_MST_DLV_SLIP_S04", rsltL, bldr, dlvSlipL);
			
			return rsltL;
		}
		protected void insertDlvSlipWk() {
			MCList<MST_DLV_SLIP_R> dlvSlipL = MCList.create(MST_DLV_SLIP_R.class);
			dlvSlipL.merge(_dlvSlipL1, MST_DLV_SLIP_R.$dlv_slip_no, MST_DLV_SLIP_R.$dlv_slip_seq);
			dlvSlipL.merge(_dlvSlipL2, MST_DLV_SLIP_R.$dlv_slip_no, MST_DLV_SLIP_R.$dlv_slip_seq);
			dlvSlipL.merge(_dlvSlipL3, MST_DLV_SLIP_R.$dlv_slip_no, MST_DLV_SLIP_R.$dlv_slip_seq);
			
			MST_DLV_SLIP_R dbc = MST_DLV_SLIP_R.create("T");
			dbWkDelete("MSBEL5550_MSW_DLV_SLIP_D01", dbc);
			dbWkInsert("MSBEL5550_MSW_DLV_SLIP_I01", dlvSlipL, dbc);
		}

		protected MCList<MST_DLV_SLIP_R> selectDlvSlip4() {
			// 各トランザクションの状況ごとに取消対象となる納品書の改訂番号を取得する
			MCList<MST_DLV_SLIP_R> cndL = MCList.create(MST_DLV_SLIP_R.class);
			cndL.addAll(selectDlvSlip4Inst());
			cndL.addAll(selectDlvSlip4InstAct());
			cndL.addAll(selectDlvSlip4Act());
			cndL.addAll(selectDlvSlip4SlsAct());
			cndL.addAll(selectDlvSlip4PurcDdlv());
			
			// 納品書ごとに最新の改訂番号を対象にする
			MCGroupByPolicy gp = new MCGroupByPolicy(MST_DLV_SLIP_R.$dlv_slip_no);
			gp.max(MST_DLV_SLIP_R.$dlv_slip_rev);
			
			MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
			MCQueryApiBuilder dlvSlipL4_bldr = MCQueryApiBuilder.create(t);
			dlvSlipL4_bldr.setSelect(t.dlv_slip_no, t.dlv_slip_seq);
			dlvSlipL4_bldr.setWhere(
				t.dlv_slip_no.eq(bind("dlv_slip_no"))
				.and(t.dlv_slip_rev.eq(bind("dlv_slip_rev")))
			);
			MCList<MST_DLV_SLIP_R> rsltL = MCList.create(MST_DLV_SLIP_R.class);
			dbSelect("MSBEL5550_MST_DLV_SLIP_S10", rsltL, dlvSlipL4_bldr, cndL.groupBy(gp));
			
			// 改訂番号内の最新の連番を取消分とする
			gp = new MCGroupByPolicy(MST_DLV_SLIP_R.$dlv_slip_no);
			gp.max(MST_DLV_SLIP_R.$dlv_slip_seq);
			dlvSlipL4_bldr = MCQueryApiBuilder.create(t);
			
			MCList<MST_DLV_SLIP_R> bindList = rsltL.groupBy(gp);
			rsltL = MCList.create(MST_DLV_SLIP_R.class);
			dbSelectKey("MSBEL5550_MST_DLV_SLIP_S11", rsltL, dlvSlipL4_bldr, bindList);
			
			return rsltL;
		}
		protected MCList<MST_DLV_SLIP_R> selectDlvSlip4Inst() {
			// 指図を、訂正または取消した時に発行する、納品書の取消分
			MSW_DLV_SLIP_KEY_R S2W1 = MSW_DLV_SLIP_KEY_R.create("W1");
			MST_DLV_SLIP_R S2W2 = MST_DLV_SLIP_R.create("W2");
			MST_DLV_SLIP_R S2W3 = MST_DLV_SLIP_R.create("W3");
			MST_DLV_SLIP_R S2W4 = MST_DLV_SLIP_R.create("W4");
			MCQueryApiBuilder bldr = crtQryApiDlvSlip4(S2W1, S2W2, S2W3);
			bldr.addInnerJoin(S2W3,
				S2W3.dlv_slip_no.eq(S2W2.dlv_slip_no)
				.and(S2W3.dlv_slip_rev.eq(
					subQuery()
					.select(max(S2W4.dlv_slip_rev))
					.from(S2W4)
					.where(S2W4.dlv_slip_no.eq(S2W2.dlv_slip_no)
					.and(S2W4.dlv_slip_rev.lte(S2W2.dlv_slip_rev))
					.and(S2W4.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value())))
					.and(S2W4.slip_prnt_flg.eq(value(true))))
				))
			);
			bldr.addWhereWithAnd(S2W2.dlv_slip_inst_no.neq(value(MAC_STR.NULL_VAL.value())));
			bldr.addWhereWithAnd(S2W2.dlv_slip_act_no.isNull());
			MCList<MST_DLV_SLIP_R> rsltL = MCList.create(MST_DLV_SLIP_R.class);
			dbSelect("MSBEL5550_MST_DLV_SLIP_S12", rsltL, bldr);
			return rsltL;
		}
		protected MCList<MST_DLV_SLIP_R> selectDlvSlip4InstAct() {
			// 実績を、指図時に発行した納品書と差異ありで登録した時に発行する、指図の取消分
			MSW_DLV_SLIP_KEY_R S2W1 = MSW_DLV_SLIP_KEY_R.create("W1");
			MST_DLV_SLIP_R S2W2 = MST_DLV_SLIP_R.create("W2");
			MST_DLV_SLIP_R S2W3 = MST_DLV_SLIP_R.create("W3");
			MCQueryApiBuilder bldr = crtQryApiDlvSlip4(S2W1, S2W2, S2W3);
			bldr.addInnerJoin(S2W3,
				S2W3.dlv_slip_no.eq(S2W2.dlv_slip_no)
				.and(S2W3.dlv_slip_rev.eq(S2W2.dlv_slip_rev.subtract(value(1))))
				.and(S2W3.trn_typ.eq(S2W2.trn_typ))
				.and(S2W3.dlv_slip_inst_no.eq(S2W2.dlv_slip_inst_no))
				.and(S2W3.dlv_slip_act_no.isNull())
				.and(S2W2.dlv_slip_act_no.isNotNull())
			);
			MCList<MST_DLV_SLIP_R> rsltL = MCList.create(MST_DLV_SLIP_R.class);
			dbSelect("MSBEL5550_MST_DLV_SLIP_S12", rsltL, bldr);
			return rsltL;
		}
		protected MCList<MST_DLV_SLIP_R> selectDlvSlip4Act() {
			// 売上・出荷実績を訂正または取消した時に発行する、納品書の取消分
			MSW_DLV_SLIP_KEY_R S2W1 = MSW_DLV_SLIP_KEY_R.create("W1");
			MST_DLV_SLIP_R S2W2 = MST_DLV_SLIP_R.create("W2");
			MST_DLV_SLIP_R S2W3 = MST_DLV_SLIP_R.create("W3");
			MST_DLV_SLIP_R S2W4 = MST_DLV_SLIP_R.create("W4");
			MCQueryApiBuilder bldr = crtQryApiDlvSlip4(S2W1, S2W2, S2W3);
			bldr.addInnerJoin(S2W3,
				S2W3.dlv_slip_no.eq(S2W2.dlv_slip_no)
				.and(S2W3.dlv_slip_rev.eq(
					subQuery()
					.select(max(S2W4.dlv_slip_rev))
					.from(S2W4)
					.where(S2W4.dlv_slip_no.eq(S2W2.dlv_slip_no)
					.and(S2W4.dlv_slip_rev.lte(S2W2.dlv_slip_rev))
					.and(S2W4.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value())))
					.and(S2W4.slip_prnt_flg.eq(value(true))))
				))
			);
			bldr.addWhereWithAnd(S2W2.dlv_slip_act_no.neq(value(MAC_STR.NULL_VAL.value())));
			MCList<MST_DLV_SLIP_R> rsltL = MCList.create(MST_DLV_SLIP_R.class);
			dbSelect("MSBEL5550_MST_DLV_SLIP_S13", rsltL, bldr);
			return rsltL;
		}
		protected MCList<MST_DLV_SLIP_R> selectDlvSlip4SlsAct() {
			// 出荷基準の売上を売上明細訂正で訂正
			// その後、出荷実績で訂正または取消した時に発行する、売上実績の取消分
			MSW_DLV_SLIP_KEY_R S2W1 = MSW_DLV_SLIP_KEY_R.create("W1");
			MST_DLV_SLIP_R S2W2 = MST_DLV_SLIP_R.create("W2");
			MST_DLV_SLIP_R S2W3 = MST_DLV_SLIP_R.create("W3");
			MST_DLV_SLIP_R S2W4 = MST_DLV_SLIP_R.create("W4");
			MST_SLS_ACT_R S3T2 = MST_SLS_ACT_R.create("T2");
			MCQueryApiBuilder bldr = crtQryApiDlvSlip4(S2W1, S2W2, S2W3);
			bldr.addInnerJoin(S2W3,
				S2W3.dlv_slip_no.eq(S2W2.dlv_slip_no)
				.and(S2W3.dlv_slip_rev.eq(
					subQuery()
					.select(max(S2W4.dlv_slip_rev))
					.from(S2W4)
					.where(S2W4.dlv_slip_no.eq(S2W2.dlv_slip_no)
					.and(S2W4.dlv_slip_rev.lte(S2W2.dlv_slip_rev))
					.and(S2W4.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value())))
					.and(S2W4.slip_prnt_flg.eq(value(true))))
				))
				.and(S2W3.trn_typ.eq(value(MSC_TRN_TYP.SLS.value())))
			);
			bldr.addWhereWithAnd(S2W2.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())));
			bldr.addWhereWithAnd(
				exists(subQuery()
					.select(value("x"))
					.from(S3T2)
					.where(
						S3T2.ship_act_no.eq(S2W2.dlv_slip_act_no)
						.and(S3T2.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.SHIP_BASIS.value())))
						.and(S3T2.iv_no.eq(value(MAC_STR.NULL_VAL.value())))
						.and(S3T2.sls_act_no.eq(S2W3.dlv_slip_act_no))
					)
				)
			);
			MCList<MST_DLV_SLIP_R> rsltL = MCList.create(MST_DLV_SLIP_R.class);
			dbSelect("MSBEL5550_MST_DLV_SLIP_S14", rsltL, bldr);
			return rsltL;
		}
		protected MCList<MST_DLV_SLIP_R> selectDlvSlip4PurcDdlv() {
			// 仕入直送の売上を、発注・納入指示・納期回答受領時に発行した納品書と差異ありで登録した時に発行する、納品書の取消分
			MSW_DLV_SLIP_KEY_R S2W1 = MSW_DLV_SLIP_KEY_R.create("W1");
			MST_DLV_SLIP_R S2W2 = MST_DLV_SLIP_R.create("W2");
			MST_DLV_SLIP_R S2W3 = MST_DLV_SLIP_R.create("W3");
			MST_DLV_SLIP_R S2W4 = MST_DLV_SLIP_R.create("W4");
			MCQueryApiBuilder bldr = crtQryApiDlvSlip4(S2W1, S2W2, S2W3);
			bldr.addInnerJoin(S2W3,
				S2W3.dlv_slip_no.eq(S2W2.dlv_slip_no)
				.and(S2W3.dlv_slip_rev.eq(
					subQuery()
					.select(max(S2W4.dlv_slip_rev))
					.from(S2W4)
					.where(S2W4.dlv_slip_no.eq(S2W2.dlv_slip_no)
					.and(S2W4.dlv_slip_rev.lte(S2W2.dlv_slip_rev))
					.and(S2W4.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value())))
					.and(S2W4.slip_prnt_flg.eq(value(true))))
				))
				.and(S2W3.trn_typ.eq(value(MSC_TRN_TYP.PURC.value())))
				.and(S2W3.slo_no.eq(S2W2.slo_no))
			);
			bldr.addWhereWithAnd(S2W2.trn_typ.eq(value(MSC_TRN_TYP.SLS.value())));
			MCList<MST_DLV_SLIP_R> rsltL = MCList.create(MST_DLV_SLIP_R.class);
			dbSelect("MSBEL5550_MST_DLV_SLIP_S16", rsltL, bldr);
			return rsltL;
		}
		protected MCQueryApiBuilder crtQryApiDlvSlip4(
			MSW_DLV_SLIP_KEY_R S2W1, MST_DLV_SLIP_R S2W2, MST_DLV_SLIP_R S2W3) {
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(S2W1);
			bldr.setSelect(S2W3.dlv_slip_no, S2W3.dlv_slip_rev);
			bldr.addInnerJoin(S2W2,
				S2W2.dlv_slip_no.eq(S2W1.dlv_slip_no)
				.and(S2W2.dlv_slip_seq.eq(S2W1.dlv_slip_seq))
			);
			bldr.setWhere(S2W3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value())));
			bldr.addWhereWithAnd(S2W3.slip_prnt_flg.eq(value(true)));
			bldr.addWhereWithAnd((S2W3.dlv_slip_seq.lt(S2W2.dlv_slip_seq)));
			
			return bldr;
		}
		protected MST_DLV_SLIP_R get(String dlvSlipNo) {
			return _dlvSlipL1.getFirst(_idx1, dlvSlipNo);
		}
		protected MCList<MST_DLV_SLIP_R> getInstL(String trnTyp, String instNo) {
			return _dlvSlipL2.subList(_idx2, trnTyp, instNo);
		}
		protected MCList<MST_DLV_SLIP_R> getActL(String trnTyp, String actNo) {
			return _dlvSlipL3.subList(_idx3, trnTyp, actNo);
		}
		protected MST_DLV_SLIP_R getCanR(String dlvSlipNo) {
			return _dlvSlipL4.getFirst(_idx4, dlvSlipNo);
		}
	}
	
	protected MCList<MST_DLV_SLIP_R> revPrnted(MCList<ShipRprt_Upd01_DtlR> up1) {
		MCList<MST_DLV_SLIP_R> prevL = MCList.create(MST_DLV_SLIP_R.class);
		for(ShipRprt_Upd01_DtlR r : up1) {
			MST_DLV_SLIP_R prevR = getDlvSlipR(r.dlv_slip_no());
			prevL.add(prevR);
		}
		
		MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
		bldr.setWhere(t.dlv_slip_no.eq(bind("dlv_slip_no"))
			.and(t.dlv_slip_rev.eq(bind("dlv_slip_rev")))
			.and(t.slip_prnt_flg.eq(value(true))
				.or(t.sls_prnt_flg.eq(value(true)))));
		
		MCList<MST_DLV_SLIP_R> rsltL = MCList.create(MST_DLV_SLIP_R.class);
		dbSelect("MSBEL5550_MST_DLV_SLIP_S17", rsltL, bldr, prevL);
		
		return rsltL;
	}

	/**
	 * 納品伝票明細のキャッシュ
	 */
	protected DlvSlipDCache _dlvSlipDCache = null;
	protected void doDlvSlipDCache(MCList<MST_DLV_SLIP_R> dlvSlipL) {
		_dlvSlipDCache = new DlvSlipDCache(dlvSlipL);
	}
	protected MST_DLV_SLIP_D_R getDlvSlipDR(String dlvSlipDNo) {
		return _dlvSlipDCache.get(dlvSlipDNo);
	}
	protected MCList<MST_DLV_SLIP_D_R> getDlvSlipDL(String dlvSlipNo) {
		return _dlvSlipDCache.getL(dlvSlipNo);
	}
	public class DlvSlipDCache {
		protected MCList<MST_DLV_SLIP_D_R> _dlvSlipDL = null;
		protected MCIndexKey _idx1= null, _idx2 = null;
		protected DlvSlipDCache(MCList<MST_DLV_SLIP_R> dlvSlipL) {
			_dlvSlipDL = MCList.create(MST_DLV_SLIP_D_R.class);
			MST_DLV_SLIP_D_R t = MST_DLV_SLIP_D_R.create("T");
			MCQueryApiBuilder dlvSlipDL_bldr = MCQueryApiBuilder.create(t);
			dlvSlipDL_bldr.setSelectAll();
			dlvSlipDL_bldr.setWhere(t.dlv_slip_no.eq(bind("dlv_slip_no")));
			dlvSlipDL_bldr.addWhereWithAnd(t.dlv_slip_seq.eq(bind("dlv_slip_seq")));
			dbSelect("MSBEL5550_MST_DLV_SLIP_D_S01", _dlvSlipDL, dlvSlipDL_bldr, dlvSlipL.groupBy("dlv_slip_no", "dlv_slip_seq"));
			_idx1 = _dlvSlipDL.createIndex(MST_DLV_SLIP_D_R.$dlv_slip_d_no);
			_idx2 = _dlvSlipDL.createIndex(MST_DLV_SLIP_D_R.$dlv_slip_no);
		}
		protected MST_DLV_SLIP_D_R get(String dlvSlipDNo) {
			return _dlvSlipDL.getFirst(_idx1, dlvSlipDNo);
		}
		protected MCList<MST_DLV_SLIP_D_R> getL(String dlvSlipNo) {
			return _dlvSlipDL.subList(_idx2, dlvSlipNo);
		}
	}
	protected Map_ConvQtyAmtUtil_Calc01_HdrR_ShipRprt_Upd01_DtlR<ConvQtyAmtUtil_Calc01_HdrR,ShipRprt_Upd01_DtlR> createMap_ConvQtyAmtUtil_Calc01_HdrR_ShipRprt_Upd01_DtlR() {
		return new Map_ConvQtyAmtUtil_Calc01_HdrR_ShipRprt_Upd01_DtlR<ConvQtyAmtUtil_Calc01_HdrR, ShipRprt_Upd01_DtlR>();
	}

	public class Map_ConvQtyAmtUtil_Calc01_HdrR_ShipRprt_Upd01_DtlR<D extends ConvQtyAmtUtil_Calc01_HdrR, S extends ShipRprt_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$peg_no, ShipRprt_Upd01_DtlR.$dtl_uniq_seq);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_cd, "dsd.slo_unit_cd");
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_qty, "dsd.slo_qty");
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_upri, ShipRprt_Upd01_DtlR.$trd_cur_upri);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_dscnt_amt, ShipRprt_Upd01_DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_amt, ShipRprt_Upd01_DtlR.$trd_cur_amt);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_tax_amt, ShipRprt_Upd01_DtlR.$trd_cur_tax_amt);
			// 予定の単位と実績の単位が違う場合は税込み金額は設定不要（ユーティリティの中で計算する想定）
			// addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_inc_tax_amt, );
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$wtax_amt, ShipRprt_Upd01_DtlR.$wtax_amt);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_dec_place, "base_unit_dec_place");
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_rnd_typ, "base_unit_rnd_typ");
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_qty, "slo_trd_unit_conv_qty");
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_base_qty, "slo_trd_unit_conv_base_qty");
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_cd, ShipRprt_Upd01_DtlR.$trd_cur_cd);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$tax_rate, "tax_rate");
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$wtax_rate, ShipRprt_Upd01_DtlR.$wtax_rate);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$inc_tax_flg, "inc_tax_flg");
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$amt_dec_place, "amt_dec_place");
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$upri_dec_place, "upri_dec_place");
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$amt_rnd_typ, "amt_rnd_typ");
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$tax_rnd_typ, "tax_rnd_typ");

		}
	}

	protected Map_ConvQtyAmtUtil_Calc01_Dtl1R_ShipRprt_Upd01_DtlR<ConvQtyAmtUtil_Calc01_Dtl1R,ShipRprt_Upd01_DtlR> createMap_ConvQtyAmtUtil_Calc01_Dtl1R_ShipRprt_Upd01_DtlR() {
		return new Map_ConvQtyAmtUtil_Calc01_Dtl1R_ShipRprt_Upd01_DtlR<ConvQtyAmtUtil_Calc01_Dtl1R, ShipRprt_Upd01_DtlR>();
	}

	public class Map_ConvQtyAmtUtil_Calc01_Dtl1R_ShipRprt_Upd01_DtlR<D extends ConvQtyAmtUtil_Calc01_Dtl1R, S extends ShipRprt_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$peg_no, ShipRprt_Upd01_DtlR.$dtl_uniq_seq);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$hdr_peg_no, ShipRprt_Upd01_DtlR.$dtl_uniq_seq);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_qty, ShipRprt_Upd01_DtlR.$trd_unit_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_cd, ShipRprt_Upd01_DtlR.$trd_unit_cd);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_qty, "trd_unit_conv_qty");
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_base_qty, "trd_unit_conv_base_qty");

		}
	}
	
	protected FXUCL_MCFuncCache<String> _CoNmCache;
	protected String getCoNm(String lclCd) {
		if (_CoNmCache == null) {
				_CoNmCache = new FXUCL_MCFuncCache<>(in -> {
				return FCPA_CO$F_GET_CO_NM1(value((String) in[0]));
			});
		}
		return _CoNmCache.get(lclCd);
	}

	/**
	 * 帳票ファイル情報取得用のリスナー
	 */
	public class FileWriteListener extends MCFileWriteListener {
		List<MCReportSet> list;
		
		FileWriteListener(List<MCReportSet> list) {
			this.list = list;
		}
		
		@Override
		public void initWrite(MCReportFile rf) {
			if (rf instanceof MCUCXSingleFile) {
				list.add(rf.getReportSet());
			}
			super.initWrite(rf);
		}
	}
	/**
	 * ワーキンググループＣＤ取得<br />
	 * 部門ＣＤと適用開始日をもとに部門マスタからワーキンググループＣＤを取得する
	 * 
	 * @param dptCd 部門ＣＤ
	 * @param dt 適用開始日
	 * 
	 * @return ワーキンググループＣＤ
	 */
	public static String getWgCd(String dptCd, MCDate dt) {
		return object(CLAZZ)._getWgCd(dptCd, dt);
	}
	
	protected String _getWgCd(String dptCd, MCDate dt) {
		return getDpt(dptCd, dt).wg_cd();
	}
	/** 部門マスタのキャッシュ */
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _dpt;
	
	/**
	 * 部門ＣＤと適用日に対応した部門マスタを取得する。<br>
	 * キャッシュに存在する場合、キャッシュから取得して返却する。
	 * 
	 * @param dptCd 部門ＣＤ
	 * @param stDt 適用開始日
	 * 
	 * @return 部門マスタ情報
	 */
	public static MAM_DPT_R getDpt(String dptCd, MCDate stDt) {
		return object(CLAZZ)._getDptCache().get(stDt, dptCd);
	}
	
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _getDptCache() {
		MCList<MCRow> bindL = MCList.create(MCRow.class);
		if (_dpt == null){
			_dpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(MCQueryApiBuilder.create(MAM_DPT_R.create("T")), bindL, MAM_DPT_R.$dpt_cd);
		}
		return _dpt;
	}

	//FMCB CUSTOM END
}