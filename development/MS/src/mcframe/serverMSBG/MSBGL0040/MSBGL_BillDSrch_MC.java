package mcframe.serverMSBG.MSBGL0040;

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
import mcframe.serverMSBG.MSBGL0040.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBG.MSBGL0040.Query.*;
import mcframe.serverMSBG.MSBGL5010.*;
import mcframe.serverMSBG.MSBGL5030.*;
import mcframe.serverMSBG.MSBGL5040.*;
import mcframe.serverMSBG.MSBGL5120.MSBGL_ArUtil;
import mcframe.serverMSBB.MSBBL6010.*;
import mcframe.serverMAUC.MAUCL1060.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_BillDSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_BillDSrch_MC extends MSBGL_BillDSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 請求明細情報を検索する<br>
	 */
	public class Srch01 extends MSBGL_BillDSrch_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 請求の取得
			executeQuery(down0(), MSBGL0040_MST_BILL_S01(), up0());
			nullValToNull(down0(), Srch01_HdrR.$bill_cl_ym);
			up0().bill_mng_no(down0().bill_mng_no());
			
			// 売上の請求明細の取得
			up0().setStringNE("bill_d_typ", MSC_BILL_D_TYP.SLS.value());
			executeQuery(down1(), MSBGL0040_MST_BILL_D_S01(), up0());
			
			//入金の請求明細の取得
			up0().setStringNE("bill_d_typ", MSC_BILL_D_TYP.RCV.value());
			MCQueryPlan rcvSql = MSBGL0040_MST_BILL_D_S01();
			MCList<Srch01_Dtl2R> dtlR2 = MCList.create(Srch01_Dtl2R.class);
			executeQuery(dtlR2, rcvSql, up0());
			
			for(Srch01_Dtl2R r : dtlR2){
				//消費税差額、請求残高振替(+)を売上に移動
				if(MAC_TRD_PTN_TYP.isTAX_DIFF_BILL_CL(r.trd_ptn_typ()) || 
						MAC_TRD_PTN_TYP.isARSW_IN_BILL_BAL(r.trd_ptn_typ())){
					Srch01_Dtl1R dtl1R = Srch01_Dtl1R.create();
					
					dtl1R.ac_dt(r.ac_dt());
					dtl1R.ac_ym(r.ac_ym());
					dtl1R.bill_d_typ(r.bill_d_typ());
					dtl1R.slip_sts_typ(r.slip_sts_typ());
					dtl1R.slip_sts_typ_nm(r.slip_sts_typ_nm());
					dtl1R.trd_cd(r.trd_cd());
					dtl1R.trd_nm(r.trd_nm());
					dtl1R.trd_ptn_typ(r.trd_ptn_typ());
					dtl1R.ar_typ(r.ar_typ());
					dtl1R.ar_typ_nm(r.ar_typ_nm());
					dtl1R.act_no(r.act_no());
					dtl1R.act_rev(r.act_rev());
					dtl1R.act_seq(r.act_seq());
					dtl1R.act_d_no(r.act_d_no());
					dtl1R.act_d_seq(r.act_d_seq());
					dtl1R.bill_basis_dt(r.bill_basis_dt());
					dtl1R.bill_crryovr_times(r.bill_crryovr_times());
					dtl1R.trd_unit_qty(r.trd_unit_qty());
					dtl1R.inc_tax_flg(r.inc_tax_flg());
					dtl1R.interim_flg(r.interim_flg());
					dtl1R.trd_cur_upri(r.trd_cur_upri());
					dtl1R.trd_cur_amt(r.trd_cur_amt());
					dtl1R.trd_inc_tax_amt(r.trd_inc_tax_amt());
					dtl1R.tax_cd(r.tax_cd());
					dtl1R.tax_nm(r.tax_nm());
					dtl1R.tax_rate(r.tax_rate());
					dtl1R.trd_cur_tax_amt(r.trd_cur_tax_amt());
					dtl1R.trd_cur_dscnt_amt(r.trd_cur_dscnt_amt());
					dtl1R.xrate(r.xrate());
					dtl1R.base_cur_amt(r.base_cur_amt());
					dtl1R.base_cur_dscnt_amt(r.base_cur_dscnt_amt());
					dtl1R.base_cur_tax_amt(r.base_cur_tax_amt());
					dtl1R.base_cur_upri(r.base_cur_upri());
					dtl1R.cst_cd(r.cst_cd());
					dtl1R.cst_nm(r.cst_nm());
					dtl1R.dlv_cd(r.dlv_cd());
					dtl1R.dlv_nm(r.dlv_nm());
					dtl1R.dest_cd1(r.dest_cd1());
					dtl1R.dest_nm1(r.dest_nm1());
					dtl1R.dest_cd2(r.dest_cd2());
					dtl1R.dest_nm2(r.dest_nm2());
					dtl1R.dest_cd3(r.dest_cd3());
					dtl1R.dest_nm3(r.dest_nm3());
					dtl1R.sls_dpt_cd(r.sls_dpt_cd());
					dtl1R.sls_dpt_nm(r.sls_dpt_nm());
					dtl1R.sls_usr_cd(r.sls_usr_cd());
					dtl1R.sls_usr_nm(r.sls_usr_nm());
					dtl1R.slo_no(r.slo_no());
					dtl1R.slo_d_no(r.slo_d_no());
					dtl1R.cst_po_no(r.cst_po_no());
					dtl1R.cst_po_d_no(r.cst_po_d_no());
					dtl1R.dlv_slip_no(r.dlv_slip_no());
					dtl1R.dlv_slip_d_no(r.dlv_slip_d_no());
					dtl1R.ship_dlv_slip_no(r.ship_dlv_slip_no());
					dtl1R.ship_dlv_slip_d_no(r.ship_dlv_slip_d_no());
					dtl1R.ship_dlv_slip_multi_flg(r.ship_dlv_slip_multi_flg());
					dtl1R.wrk_no(r.wrk_no());
					dtl1R.wrk_nm(r.wrk_nm());
					dtl1R.sls_wrk_no(r.sls_wrk_no());
					dtl1R.sls_wrk_nm(r.sls_wrk_nm());
					dtl1R.bill_d_no(r.bill_d_no());
					dtl1R.bill_mng_no(r.bill_mng_no());
					dtl1R.ins_usr_id(r.ins_usr_id());
					dtl1R.ins_usr_nm(r.ins_usr_nm());
					dtl1R.ins_func_id(r.ins_func_id());
					dtl1R.ins_ts(r.ins_ts());
					dtl1R.upd_usr_id(r.upd_usr_id());
					dtl1R.upd_usr_nm(r.upd_usr_nm());
					dtl1R.upd_func_id(r.upd_func_id());
					dtl1R.upd_ts(r.upd_ts());
					dtl1R.upd_srv_req_no(r.upd_srv_req_no());
					
					down1().add(dtl1R);
				}
				else{
					down2().add(r);
				}
			}
			// 売掛消込および前受金の入金実績を取得
			MCList<Srch01_Dtl3R> rcvActDL = MCList.create(Srch01_Dtl3R.class);
			executeQuery(rcvActDL, MSBGL0040_MST_RCV_ACT_D_S01(), getTgtRcvActDL());
			
			// 入金実績を下り電文に設定する
			MCIndexKey idx = down2().createIndex(Srch01_Dtl2R.$act_d_no, Srch01_Dtl2R.$act_d_seq);
			for (Srch01_Dtl3R rcvActDR : rcvActDL) {
				Srch01_Dtl2R d2R = down2().getFirst(idx, rcvActDR.rcv_act_d_no(), rcvActDR.rcv_act_d_seq());
				// 売掛消込分
				if (!isNull(d2R)) {
					d2R.trd_cur_amt(rcvActDR.trd_cur_amt());
					d2R.setoff_amt(rcvActDR.setoff_amt());
					d2R.setoff_tax_amt(rcvActDR.setoff_tax_amt());
					d2R.setoff_tax_cd(rcvActDR.setoff_tax_cd());
					d2R.setoff_tax_nm(rcvActDR.setoff_tax_nm());
					d2R.setoff_tax_rate(rcvActDR.setoff_tax_rate());
				}
				// 前受金分
				else {
					down3().add(rcvActDR);
				}
			}
		}
		protected MCList<MST_RCV_ACT_D_R> getTgtRcvActDL() {
			MCList<MST_RCV_ACT_D_R> tgtL = MCList.create(MST_RCV_ACT_D_R.class);
			// 前受金
			if (isNullOrNullVal(down0().bill_no())) {
				// 未請求。請求締対象となりうる前受金を取得する
				tgtL.addAll(
					MSBGL_ArUtil.getBillClAdvL(
						down0().bcst_cd(), down0().bill_dpt_cd(), down0().trd_cur_cd()
					)
				);
			}
			else {
				// 請求済。請求済みの前受金を取得する
				MST_RCV_ACT_D_R t1 = MST_RCV_ACT_D_R.create("T1");
				MST_RCV_ACT_R t2 = MST_RCV_ACT_R.create("T2");
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
				bldr.setSelect(t1.rcv_act_d_no, t1.rcv_act_d_seq);
				bldr.addInnerJoin(t2, 
					t2.rcv_act_no.eq(t1.rcv_act_no)
					.and(t2.rcv_act_seq.eq(t1.rcv_act_seq))
				);
				bldr.setWhere(t1.bill_mng_no.eq(bind("1")), up0().bill_mng_no());
				bldr.addConstWhereWithAnd(
					t2.trd_ptn_typ.in(
						value(MAC_TRD_PTN_TYP.RCV_ADV.value()), 
						value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value()), 
						value(MAC_TRD_PTN_TYP.SETOFF_SUSP_ADV.value())
					)
				);
				
				dbSelect("MSBGL0040_MST_RCV_ACT_D_S02", tgtL, bldr);
			}
			
			// 売掛消込
			down2().forEach(r -> {
				MST_RCV_ACT_D_R cndR = tgtL.add();
				cndR.rcv_act_d_no(r.act_d_no());
				cndR.rcv_act_d_seq(r.act_d_seq());
			});
			
			return tgtL;
		}
		
		
		
		@Override
		protected void editListMain() {
			super.editListMain();

			if (!isNull(down0().bill_no())) {
				down0().base_cur_cd(getBaseCur().cur_cd());
				down0().base_cur_nm(getBaseCur().cur_nm());
				down0().base_cur_amt_dec_place(getBaseCur().amt_dec_place());
				down0().base_cur_upri_dec_place(getBaseCur().upri_dec_place());
				if (!isNull(down0().setoff_amt())) {
					down0().setoff_amt(down0().setoff_amt().multiply(-1));
				}
			}
			int rowNum = 1;
			for (Srch01_Dtl1R r : down1()) {
				// 売上の請求明細に行番号を設定
				r.row_num(rowNum);
				rowNum++;
				// 返品・値引金額符号反転がオンの場合、符号を反転
				if (up0().sign_rivrs_flg()) {
					r.trd_cur_upri(r.trd_cur_upri().multiply(MAUCL_TrdUtil.getUpriDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
					r.trd_unit_qty(r.trd_unit_qty().multiply(MAC_TRD_PTN_TYP.qty_disp_pm(r.trd_ptn_typ())));
					r.trd_cur_amt(r.trd_cur_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
					r.trd_cur_tax_amt(r.trd_cur_tax_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
					r.trd_inc_tax_amt(r.trd_inc_tax_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
					if (!isNull(r.trd_cur_dscnt_amt())) {
						r.setNumberNE(Srch01_Dtl1R.$trd_cur_dscnt_amt, r.trd_cur_dscnt_amt().multiply(MAC_TRD_PTN_TYP.SLS_DSCNT.amt_disp_pm()));
					}
					if (!isNull(r.base_cur_amt())) {
						r.base_cur_amt(r.base_cur_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
					}
					if (!isNull(r.base_cur_tax_amt())) {
						r.base_cur_tax_amt(r.base_cur_tax_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
					}
					if (!isNull(r.base_cur_upri())) {
						r.base_cur_upri(r.base_cur_upri().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
					}
					if (!isNull(r.base_cur_dscnt_amt())) {
						r.setNumberNE(Srch01_Dtl1R.$base_cur_dscnt_amt, r.base_cur_dscnt_amt().multiply(MAC_TRD_PTN_TYP.SLS_DSCNT.amt_disp_pm()));
					}
				}
				if (!isNull(r.base_cur_amt()) && !isNull(r.base_cur_tax_amt())) {
					r.base_cur_inc_tax_amt(r.base_cur_amt().add(r.base_cur_tax_amt()));
				}
				
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 請求明細の請求繰越回数を訂正する前のチェックをする<br>
	 */
	public class Chk01 extends MSBGL_BillDSrch_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 請求管理ＮＯをもとに請求ヘッダを検索してＤＡＣチェック
			// 全て同じ請求管理ＮＯが設定されているため明細の１件目の請求管理ＮＯを利用する
			MST_BILL_R billR = MST_BILL_R.create();
			MCQueryApiBuilder billR_bldr = MCQueryApiBuilder.create(MST_BILL_R.create("T"));
			dbSelectKey("MSBGL0040_MST_BILL_S01", billR, billR_bldr, up0().get(0));
			msgL.addAll(checkWritableDptCdDac(billR, MST_BILL_R.$bill_dpt_cd));

			// 請求明細を検索してロックする。
			// 検索結果を対象に請求明細の更新カウンタチェックを実施する。
			MCList<Chk01_RsltR> notErrL = getChkList(up0(), MCRow.Status.MODIFY);

			MCList<MST_BILL_D_R> billDLockL = MCList.create(MST_BILL_D_R.class);
			MST_BILL_D_R t2 = MST_BILL_D_R.create("T");
			MCQueryApiBuilder billDLockL_bldr = MCQueryApiBuilder.create(t2);
			billDLockL_bldr.setSelect(t2.bill_d_no, t2.upd_cntr);
			billDLockL_bldr.setWhere(t2.bill_d_no.eq(bind("bill_d_no")));
			dbSelectForUpdateNoWait("MSBGL0040_MST_BILL_D_S01", billDLockL, billDLockL_bldr, notErrL);

			MCIndexKey idxkey = billDLockL.createIndex(MST_BILL_D_R.$bill_d_no);
			for (Chk01_RsltR r : notErrL) {
				MST_BILL_D_R billDLockR = billDLockL.getFirst(idxkey, r.bill_d_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, billDLockR));
			}

			notErrL = getChkList(up0(), MCRow.Status.MODIFY);
			MCList<ArCmn_Upd01_DtlR> arInL = MCList.create(ArCmn_Upd01_DtlR.class);
			for (Chk01_RsltR r : notErrL) {
				arInL.add(getArRegFrInfo(r));
			}
			down1().addAll(arInL);
			return msgL;
		}

		protected ArCmn_Upd01_DtlR getArRegFrInfo(Chk01_RsltR cndR) {
			ArCmn_Upd01_DtlR arInR = ArCmn_Upd01_DtlR.create();
			arInR.addNumberColumn("appl_amt");

			// 債権共通サービスに必要なベース情報を検索
			executeQuery(arInR, MSBGL0040_MST_BILL_D_S02(), cndR);

			// 追加設定
			arInR.inpt_ac_dt(arInR.ac_dt());
			arInR.inpt_ac_ym(arInR.ac_ym());
			arInR.addNumberColumn("to_bill_crryovr_times", cndR.bill_crryovr_times()); // ※ 1
			arInR.addNumberColumn("diffTimes", cndR.bill_crryovr_times().subtract(nvl(arInR.bill_crryovr_times(), MCNumber.ZERO)));
			arInR.bill_crryovr_times(0);
			arInR.addDateColumn("to_bill_basis_dt", arInR.bill_basis_dt()); // ※ 2
			arInR.bill_basis_dt(arInR.getDateNE("bill_cl_dt"));

			// ※1
			// 変更前の請求繰越回数は0固定として元の請求年月日と同じ日付が求まるようにする
			// 指定した請求繰越回数は一時カラムに保持し、変更先の処理で置き換える
			
			// ※2
			// 請求繰越回数変更前の請求年月日の請求ヘッダから各種金額を減額したいため、
			// 振替元の請求起算日は請求明細に紐付く請求ヘッダの請求年月日を設定する
			// 元の起算日は一時カラムに退避し、変更先の処理で置き換える

			cndR.appl_amt(arInR.getNumber("appl_amt"));
			return arInR;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// 上り電文の更新行（エラーがない行のみ）を抽出
			MCList<Chk01_RsltR> notErrL = getChkList(up0(), MCRow.Status.MODIFY);
			for (Chk01_RsltR r : notErrL) {
				if (r.isStatusModify() && !r.appl_amt().isZero()) {
					msgL.add(new MCMessage(r, Chk01_RsltR.$row_num, MSBGL0046, toDispGUIIndex(r)));
				}
			}
			return msgL;
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 請求明細の請求繰越回数を訂正する<br>
	 */
	public class Upd01 extends MSBGL_BillDSrch_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MCList<ArCmn_Upd01_DtlR> arInL = MCList.create(ArCmn_Upd01_DtlR.class);

			editUp();

			// チェック処理を呼び出す
			arInL = callThisChk01();

			throwUpdErr();

			for (MCList<ArCmn_Upd01_DtlR> arInGrpL : arInL.groupList("diffTimes")) {
				callArCmnService(arInGrpL);
			}

			// 売上実績登録サービスを呼び出す
			callSlsActService(arInL);
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up0());
		}

		/**
		 * チェック処理を実行する
		 * @return 
		 */
		protected MCList<ArCmn_Upd01_DtlR> callThisChk01() {
			MSBGL_BillDSrch.Chk01 ope = MSBGL_BillDSrch.crtChk01();
			MCList<ArCmn_Upd01_DtlR> arInL = MCList.create(ArCmn_Upd01_DtlR.class);

			ope.up0().setAll(up0());
			ope.exec();

			arInL.setAll(ope.down1());

			return arInL;
		}

		/**
		 * 債権共通サービスを実行する
		 * @param arInL 
		 */
		protected void callArCmnService(MCList<ArCmn_Upd01_DtlR> arInL) {

			// 請求繰越回数変更前
			execArCmnService(MSC_AR_OPE_TYP.BILL_CRRYOVR_TIMES_ORG, arInL);

			// 請求繰越回数変更後
			setArCmnToInfo(arInL);
			execArCmnService(MSC_AR_OPE_TYP.BILL_CRRYOVR_TIMES_NEW, arInL);
		}

		/**
		 * 債権共通サービスの上り電文編集
		 * 
		 * @param arInL
		 */
		protected void setArCmnToInfo(MCList<ArCmn_Upd01_DtlR> arInL) {
			for (ArCmn_Upd01_DtlR arInR : arInL) {
				arInR.bill_crryovr_times(arInR.getNumberNE("to_bill_crryovr_times"));
				arInR.bill_basis_dt(arInR.getDateNE("to_bill_basis_dt"));
			}
		}

		/**
		 * 債権共通サービス実行
		 * 
		 * @param opeTyp
		 * @param arInL
		 */
		protected void execArCmnService(MSC_AR_OPE_TYP opeTyp, MCList<ArCmn_Upd01_DtlR> arInL) {
			MSBGL_ArCmnService.ArCmn_Upd01 ope = MSBGL_ArCmnService.crtArCmn_Upd01();
			ope.up0().setAll(arInL);
			ope.up1().ar_ope_typ(opeTyp.value());
			ope.exec();
		}

		/**
		 * 売上実績登録サービスを実行する
		 * @param arInL 
		 */
		protected void callSlsActService(MCList<ArCmn_Upd01_DtlR> arInL) {
			MCList<ArCmn_Upd01_DtlR> updL = arInL.subList(Chk01_RsltR.$bill_d_typ, MSC_BILL_D_TYP.SLS.value());

			MSBBL_SlsActService.SlsAct_Upd04 ope = MSBBL_SlsActService.crtSlsAct_Upd04();

			addAll(ope.up0(), updL, createMap_SlsAct_Upd04_DtlR_ArCmn_Upd01_DtlR());
			ope.exec();
		}

		protected Map_SlsAct_Upd04_DtlR_ArCmn_Upd01_DtlR<SlsAct_Upd04_DtlR,ArCmn_Upd01_DtlR> createMap_SlsAct_Upd04_DtlR_ArCmn_Upd01_DtlR() {
			return new Map_SlsAct_Upd04_DtlR_ArCmn_Upd01_DtlR<SlsAct_Upd04_DtlR, ArCmn_Upd01_DtlR>();
		}

		public class Map_SlsAct_Upd04_DtlR_ArCmn_Upd01_DtlR<D extends SlsAct_Upd04_DtlR, S extends ArCmn_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd04_DtlR.$sls_act_d_no, ArCmn_Upd01_DtlR.$act_d_no);
				addColumnPathMap(SlsAct_Upd04_DtlR.$sls_act_d_seq, ArCmn_Upd01_DtlR.$act_d_seq);
				addColumnPathMap(SlsAct_Upd04_DtlR.$bill_crryovr_times, ArCmn_Upd01_DtlR.$bill_crryovr_times);

			}
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 請求締を取り消す前のチェックをする<br>
	 */
	public class Chk02 extends MSBGL_BillDSrch_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			MST_BILL_R billR = MST_BILL_R.create();
			MCQueryApiBuilder billR_bldr = MCQueryApiBuilder.create(MST_BILL_R.create("T"));
			dbSelectKey("MSBGL0040_MST_BILL_S02", billR, billR_bldr, up0());
			msgL.addAll(checkWritableDptCdDac(billR, MST_BILL_R.$bill_dpt_cd));

			msgL.addAll(checkUpdCntrNE(up0(), Chk01_RsltR.$upd_cntr, billR));
			return msgL;
		}

	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 請求締を解除する<br>
	 */
	public class Del01 extends MSBGL_BillDSrch_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// チェック処理を呼び出す
			callThisChk02();
			
			throwCanErr();

			// 請求締サービスを呼び出す
			callBillClDelServ();
			
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk02_HdrR.$peg_no, up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBGL_BillDSrch.Chk02 ope = MSBGL_BillDSrch.crtChk02();
			copy(ope.up0(), up0(), createMap_Chk02_HdrR_Chk02_HdrR());

			ope.exec();

		}

		/**
		 * 請求締サービスを実行する
		 */
		protected void callBillClDelServ() {
			MSBGL_BillClService.BillCl_Del01 ope = MSBGL_BillClService.crtBillCl_Del01();

			BillCl_Del01_CndR row = ope.up0().createRow();
			copy(row, up0(), createMap_BillCl_Del01_CndR_Chk02_HdrR());
			ope.up0().add(row);

			ope.exec();
		}
	}

	/**
	 * Chk03オペレーション.<p>
	 *
	 * 請求書を発行する前のチェックをする<br>
	 */
	public class Chk03 extends MSBGL_BillDSrch_MC_A.Chk03 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 請求書を発行する<br>
	 */
	public class Prnt01 extends MSBGL_BillDSrch_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// チェック処理を呼び出す
			callThisChk03();

			throwUpdErr();

			// 請求書発行サービスを呼び出す
			callPrntServ();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk03_HdrR.$peg_no, up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MSBGL_BillDSrch.Chk03 ope = MSBGL_BillDSrch.crtChk03();

			copy(ope.up0(), up0(), createMap_Chk03_HdrR_Chk03_HdrR());

			ope.exec();

		}

		/**
		 * 請求書発行サービスを実行する
		 */
		protected void callPrntServ() {
			MSBGL_BillPrntService.Bill_Prnt01 billPrnt01Serv = MSBGL_BillPrntService.crtBill_Prnt01();
			MCList<Chk03_HdrR> upList = MCList.create(Chk03_HdrR.class);
			upList.add(up0());
			addAll(billPrnt01Serv.up0(), upList, createMap_Bill_Prnt01_HdrR_Chk03_HdrR());
			billPrnt01Serv.up1().indiv_prnt_flg(true);
			billPrnt01Serv.exec();
		}
	}

	protected Map_BillCl_Del01_CndR_Chk02_HdrR<BillCl_Del01_CndR,Chk02_HdrR> createMap_BillCl_Del01_CndR_Chk02_HdrR() {
		return new Map_BillCl_Del01_CndR_Chk02_HdrR<BillCl_Del01_CndR, Chk02_HdrR>();
	}

	public class Map_BillCl_Del01_CndR_Chk02_HdrR<D extends BillCl_Del01_CndR, S extends Chk02_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(BillCl_Del01_CndR.$bill_mng_no, Chk02_HdrR.$bill_mng_no);

		}
	}

	protected Map_Chk02_HdrR_Chk02_HdrR<Chk02_HdrR,Chk02_HdrR> createMap_Chk02_HdrR_Chk02_HdrR() {
		return new Map_Chk02_HdrR_Chk02_HdrR<Chk02_HdrR, Chk02_HdrR>();
	}

	public class Map_Chk02_HdrR_Chk02_HdrR<D extends Chk02_HdrR, S extends Chk02_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Chk02_HdrR.$peg_no, Chk02_HdrR.$peg_no);
			addColumnPathMap(Chk02_HdrR.$bill_mng_no, Chk02_HdrR.$bill_mng_no);
			addColumnPathMap(Chk02_HdrR.$upd_cntr, Chk02_HdrR.$upd_cntr);
			addColumnPathMap(Chk02_HdrR.$err_flg, Chk02_HdrR.$err_flg);

		}
	}

	protected Map_Chk03_HdrR_Chk03_HdrR<Chk03_HdrR,Chk03_HdrR> createMap_Chk03_HdrR_Chk03_HdrR() {
		return new Map_Chk03_HdrR_Chk03_HdrR<Chk03_HdrR, Chk03_HdrR>();
	}

	public class Map_Chk03_HdrR_Chk03_HdrR<D extends Chk03_HdrR, S extends Chk03_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Chk03_HdrR.$peg_no, Chk03_HdrR.$peg_no);
			addColumnPathMap(Chk03_HdrR.$bill_mng_no, Chk03_HdrR.$bill_mng_no);
			addColumnPathMap(Chk03_HdrR.$bill_no, Chk03_HdrR.$bill_no);
			addColumnPathMap(Chk03_HdrR.$err_flg, Chk03_HdrR.$err_flg);

		}
	}
	protected Map_Bill_Prnt01_HdrR_Chk03_HdrR<Bill_Prnt01_HdrR,Chk03_HdrR> createMap_Bill_Prnt01_HdrR_Chk03_HdrR() {
		return new Map_Bill_Prnt01_HdrR_Chk03_HdrR<Bill_Prnt01_HdrR, Chk03_HdrR>();
	}

	public class Map_Bill_Prnt01_HdrR_Chk03_HdrR<D extends Bill_Prnt01_HdrR, S extends Chk03_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Bill_Prnt01_HdrR.$bill_mng_no, Chk03_HdrR.$bill_mng_no);
			addColumnPathMap(Bill_Prnt01_HdrR.$bill_no, Chk03_HdrR.$bill_no);

		}
	}

	//FMCB CUSTOM END
}