package mcframe.serverMSLA.MSLAL5210;

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
import static mcframe.serverMSLA.MSLAL5210.Query.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import mcframe.serverPFUD.PFUDL0030.DtlR;
import mcframe.serverMSBG.MSBGL5120.MSBGL_ArUtil;
import mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil;
import mcframe.serverMBBC.MBBCL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_BillSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_BillSendIfService_MC extends MSLAL_BillSendIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * 請求書ヘッダー＆明細ベースリスト。
	 */
	protected MCList<Bill_Send01_HdrDtlBaseR> _billHdrDtlBaseL = MCList.create(Bill_Send01_HdrDtlBaseR.class);

	/**
	 * 請求書ワーク。
	 */
	protected MCQueryApiBuilder _billWkL_bldr = MCQueryApiBuilder.create(MST_BILL_R.create("T"));
	
	/**
	 * 納品書ワーク。
	 */
	protected MCQueryApiBuilder _dlvSlipWkL_bldr = MCQueryApiBuilder.create(MST_DLV_SLIP_R.create("T"));

	/**
	 * 請求書発行サービス経由ＦＬＧ。
	 */
	protected boolean _billPrintFlg = false;
	
	/**
	 * 請求締解除ＦＬＧ。
	 */
	protected boolean _billClCanFlg = false;
	
	/**
	 * 請求書の税表示行数。
	 */
	protected final static int _TAX_MAX_ROW_COUNT = 10;
	
	/**
	 * 請求書の入金予定表示行数。
	 */
	protected final static int _RCV_SCHD_MAX_ROW_COUNT = 10;
	
	protected MCList<MST_BILL_R> _billWkL = MCList.create(MST_BILL_R.class);
	
	/**
	 * BillSendIf_Upd01オペレーション.<p>
	 *
	 * 送信対象の請求書をＩＦテーブルに書き込む<br>
	 */
	public class BillSendIf_Upd01 extends MSLAL_BillSendIfService_MC_A.BillSendIf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			createBillOrDlvSlipWk();
			
			getBillOrDlvSlipWk();

			if (!_billHdrDtlBaseL.isEmpty()) {

				setDispPm();
				
				setTaxAmt();

				setBillHdrAmt();

				setBillHdrTax();

				setBillHdrRcvSchd();
				
				setOtherItm();
				
				MCList<MST_BILL_SEND_IF_R> billSndIf = createAndInsertBillSendIf();
				
				callSendRecvIfCtrl(billSndIf);
				
				delBillOrDlvSlipWk();
				
				registAttachedFormSrv(billSndIf);
			}
		}

		/**
		 * 請求書または納品書ワークテーブルを作成する。
		 */
		protected void createBillOrDlvSlipWk() {

			MCList<MST_DLV_SLIP_R> dbcDlvSlipL = MCList.create(MST_DLV_SLIP_R.class);

			for (Bill_Send01_HdrR upR : up0()) {
				if (upR.bill_print_flg()) {

					if (!upR.bill_close_cancel_flg()) {
						MST_BILL_R dbcR = MST_BILL_R.create();
						dbcR.bill_mng_no(upR.bill_mng_no());
						dbcR.bill_no(upR.bill_no());
						_billWkL.add(dbcR);
						_billPrintFlg = true;
						_billClCanFlg = false;
					}
					else {
						_billPrintFlg = true;
						_billClCanFlg = true;
					}
				}
				else if (!_billPrintFlg) {
					MST_DLV_SLIP_R dbcR = MST_DLV_SLIP_R.create();
					dbcR.dlv_slip_no(upR.dlv_slip_no());
					dbcR.dlv_slip_seq(upR.dlv_slip_seq());
					dbcDlvSlipL.add(dbcR);
				}
			}

			if (_billPrintFlg) {
				if (!_billClCanFlg) {
					crtBillWk(_billWkL);
				}
			}
			else {
				dbWkDelete("MSLAL5210_MSW_DLV_SLIP_D_D01", _dlvSlipWkL_bldr.getBaseDbc());
				dbWkInsert("MSLAL5210_MSW_DLV_SLIP_D_I01", dbcDlvSlipL,
						_dlvSlipWkL_bldr.getBaseDbc());
			}
		}

		/**
		 * 処理完了時に請求書または納品書ワークテーブルのデータを削除する。
		 */
		protected void delBillOrDlvSlipWk() {
			if (_billPrintFlg) {
				if (!_billClCanFlg) {
					dbWkDelete("MSLAL5210_MSW_BILL_D02", _billWkL_bldr.getBaseDbc());
				}
			}
			else {
				dbWkDelete("MSLAL5210_MSW_DLV_SLIP_D_I02", _billWkL_bldr.getBaseDbc());
			}
		}

		/**
		 * 請求書または納品書を取得する。
		 */
		protected void getBillOrDlvSlipWk() {
			MCRow row = MCRow.create();
			row.addDateColumn("today", getToday());

			if (_billPrintFlg) {
				if (!_billClCanFlg) {
					executeQuery(_billHdrDtlBaseL, MSLAL5210_MST_BILL_S01(), row);
					
					Boolean bill_each_sls_flg = false;
					if (_billHdrDtlBaseL.size() > 0 && _billHdrDtlBaseL.get(0).bill_each_sls_flg()) {
						bill_each_sls_flg = true;
					}

					if (!bill_each_sls_flg) {
						crtBillWk(getTgtBillHdrOnlyL());
						MCList<Bill_Send01_HdrDtlBaseR> billHdrOnlyL = MCList.create(Bill_Send01_HdrDtlBaseR.class);
						executeQuery(billHdrOnlyL, MSLAL5210_MST_BILL_S02(), row);
						if (billHdrOnlyL.size() > 0) {
							_billHdrDtlBaseL.addAll(billHdrOnlyL);
						}
						crtBillWk(_billWkL);
					}

					MCList<Bill_Send01_HdrDtlBaseR> rcvActDL = MCList.create(Bill_Send01_HdrDtlBaseR.class);
					executeQuery(rcvActDL, MSLAL5210_MST_RCV_ACT_D_S01(), row);
					if (rcvActDL.size() > 0) {
						_billHdrDtlBaseL.addAll(rcvActDL);
					}

					getIoAndArBillL();

				}
				else {
					row.addStringColumn("bill_mng_no", up0().get(0).bill_mng_no());
					executeQuery(_billHdrDtlBaseL, MSLAL5210_MST_BILL_CL_CAN_S01(), row);
				}
			}
			else {
				executeQuery(_billHdrDtlBaseL, MSLAL5210_MST_DLV_SLIP_S01(), row);
			}
		}

		protected MCList<MST_BILL_R> getTgtBillHdrOnlyL() {
			MCList<MST_BILL_R> billL = MCList.create(MST_BILL_R.class);
			MCIndexKey idxkey = _billHdrDtlBaseL.createIndex(Bill_Send01_HdrDtlBaseR.$bill_mng_no);
			for (Bill_Send01_HdrR upR : up0()) {
				Bill_Send01_HdrDtlBaseR billHdrDtlBaseR = _billHdrDtlBaseL.getFirst(idxkey, upR.bill_mng_no());
				if (isNull(billHdrDtlBaseR)) {
					MST_BILL_R billR = MST_BILL_R.create();
					billR.bill_mng_no(upR.bill_mng_no());
					billL.add(billR);
				}
			}
			return billL;
		}

		protected void crtBillWk(MCList<MST_BILL_R> billL) {
			dbWkDelete("MSLAL5210_MSW_BILL_D01", _billWkL_bldr.getBaseDbc());
			dbWkInsert("MSLAL5210_MSW_BILL_I01", billL, _billWkL_bldr.getBaseDbc());
		}

		/**
		 * 単価、数量、金額の表示用の符号を設定する。
		 */
		protected void setDispPm() {

			if (_billClCanFlg) return;

			for(Bill_Send01_HdrDtlBaseR r : _billHdrDtlBaseL) {

				if (isNull(r.trd_ptn_typ())) {
					continue;
				}
				
				r.trd_unit_qty(r.trd_unit_qty().multiply(
						MAC_TRD_PTN_TYP.qty_disp_pm(r.trd_ptn_typ())));
				
				r.trd_cur_upri(r.trd_cur_upri().multiply(
						MAUCL_TrdUtil.getUpriDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				
				r.trd_cur_amt(r.trd_cur_amt().multiply(
						MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				
				if (!isNull(r.trd_cur_dscnt_amt())) {
					r.setNumberNE(Bill_Send01_HdrDtlBaseR.$trd_cur_dscnt_amt, r.trd_cur_dscnt_amt().multiply(MAC_TRD_PTN_TYP.SLS_DSCNT.amt_disp_pm()));
				}
				
				r.trd_cur_tax_amt(r.trd_cur_tax_amt().multiply(
						MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));

				if (!isNull(r.tax_sls_amt())) {
					r.tax_sls_amt(r.tax_sls_amt().multiply(MAUCL_TrdUtil
							.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				}

				if (!isNull(r.tax_tax_amt())) {
					r.tax_tax_amt(r.tax_tax_amt().multiply(
							MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				}

				r.base_cur_tax_amt(r.base_cur_tax_amt().multiply(
						MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				
				if (!isNull(r.trd_cur_amt1())) {
					r.trd_cur_amt1(r.trd_cur_amt1().multiply(MAUCL_TrdUtil
							.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				}
				if (!isNull(r.trd_cur_amt2())) {
					r.trd_cur_amt2(r.trd_cur_amt2().multiply(MAUCL_TrdUtil
							.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				}
				if (!isNull(r.trd_cur_tax_amt1())) {
					r.trd_cur_tax_amt1(r.trd_cur_tax_amt1().multiply(MAUCL_TrdUtil
							.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				}
				if (!isNull(r.trd_cur_tax_amt2())) {
					r.trd_cur_tax_amt2(r.trd_cur_tax_amt2().multiply(MAUCL_TrdUtil
							.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				}
				if (!isNull(r.base_cur_tax_amt1())) {
					r.base_cur_tax_amt1(r.base_cur_tax_amt1().multiply(MAUCL_TrdUtil
							.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				}
				if (!isNull(r.base_cur_tax_amt2())) {
					r.base_cur_tax_amt2(r.base_cur_tax_amt2().multiply(MAUCL_TrdUtil
							.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				}
			}
		}

		/**
		 * 請求書単位で今回税額から相殺税額を減算する。
		 */
		protected void setTaxAmt() {
			
			if (_billClCanFlg || !_billPrintFlg) return;
			
			MCList<Bill_Send01_HdrDtlBaseR> billNoGrpList = _billHdrDtlBaseL
					.groupBy(new MCGroupByPolicy(Bill_Send01_HdrDtlBaseR.$bill_no));
			billNoGrpList.sort(Bill_Send01_HdrDtlBaseR.$bill_no);
			
			MCIndexKey idxkey = _billHdrDtlBaseL
					.createIndex(Bill_Send01_HdrDtlBaseR.$bill_no);
			
			for (Bill_Send01_HdrDtlBaseR billNoGrp : billNoGrpList) {
				MCList<Bill_Send01_HdrDtlBaseR> subBillHdrDtlBaseL = _billHdrDtlBaseL.subList(idxkey, billNoGrp.bill_no());
				MCList<Bill_Send01_HdrDtlBaseR> arDtlL = subBillHdrDtlBaseL.subList(r -> !isAdvTrdTyp(r.trd_ptn_typ()) && !isNull(r.trd_ptn_typ()));
				if (arDtlL.size() > 0) {
					MCNumber setoffTaxAmt = sumSetoffTaxAmt(arDtlL);
					subBillHdrDtlBaseL.setValueNE(Bill_Send01_HdrDtlBaseR.$tax_amt, subBillHdrDtlBaseL.get(0).tax_amt().subtract(setoffTaxAmt));
				}
			}
		}
		
		/**
		 * 相殺税額を集計する
		 */
		protected MCNumber sumSetoffTaxAmt(MCList<Bill_Send01_HdrDtlBaseR> billDtlBaseL) {
			MCNumber amt = MCNumber.ZERO;
			for (Bill_Send01_HdrDtlBaseR r :  billDtlBaseL) {
				MCNumber pm = MAC_TRD_PTN_TYP.ar_amt_pm(r.trd_ptn_typ());
				
				amt = amt.add(
					MSBGL_ArUtil.getSetoffTaxAmt(
						r.trd_ptn_typ(), r.ar_trd_grp_typ(),
						r.trd_cur_tax_amt1(), r.trd_cur_tax_amt2(), new MCNumber(0), getBillTaxDispFlg(r)).multiply(pm)
				);
			}
			return amt;
		}

		protected boolean getBillTaxDispFlg(Bill_Send01_HdrDtlBaseR r) {
			if (MAC_AR_STTL_TYP.isSETOFF_DR(r.ar_sttl_typ1())) {
				return r.bill_tax_disp_flg1();
			}
			if (MAC_AR_STTL_TYP.isSETOFF_DR(r.ar_sttl_typ2())) {
				return r.bill_tax_disp_flg2();
			}
			return false;
		}

		protected void setBillHdrAmt() {

			if (!isBillCl()) return;

			for (Bill_Send01_HdrDtlBaseR baseR : _billHdrDtlBaseL) {

				if (!isBfwBalDisp(baseR)) {
					baseR.setNumber(Bill_Send01_HdrDtlBaseR.$last_bill_amt, MCNumber.ZERO);
					baseR.setNumber(Bill_Send01_HdrDtlBaseR.$rcv_amt, MCNumber.ZERO);
					baseR.setNumber(Bill_Send01_HdrDtlBaseR.$setoff_amt, MCNumber.ZERO);
					baseR.setNumber(Bill_Send01_HdrDtlBaseR.$sw_amt, baseR.sw_amt());
					baseR.setNumber(Bill_Send01_HdrDtlBaseR.$bfw_amt, baseR.sw_amt().negate());
					baseR.setNumber(Bill_Send01_HdrDtlBaseR.$bill_amt,
							MCNumber.sum(baseR.sw_amt().negate(), baseR.sls_amt(),
									baseR.ret_amt(), baseR.dscnt_amt(), baseR.tax_amt(), baseR.sw_to_amt()));
					if (!isBfwBalDispHdr(baseR)) {
						baseR.setNumber(Bill_Send01_HdrDtlBaseR.$adv_amt, MCNumber.ZERO);
						baseR.setNumber(Bill_Send01_HdrDtlBaseR.$adv_setoff_amt, MCNumber.ZERO);
						baseR.setNumber(Bill_Send01_HdrDtlBaseR.$adv_setoff_tax_amt, MCNumber.ZERO);
					}
				}
			}
		}

		/**
		 * 請求書ヘッダー＆明細ベースリストの税率毎情報(1～8)を設定する。
		 */
		protected void setBillHdrTax() {

			if (_billClCanFlg) return;

			calcBillHdrTax();

			MCList<Bill_Send01_HdrDtlBaseR> billNoGrpList = _billHdrDtlBaseL
					.groupBy(new MCGroupByPolicy(Bill_Send01_HdrDtlBaseR.$bill_no));
			billNoGrpList.sort(Bill_Send01_HdrDtlBaseR.$bill_no);

			MCIndexKey idxkey = _billHdrDtlBaseL
					.createIndex(Bill_Send01_HdrDtlBaseR.$bill_no);
			for (Bill_Send01_HdrDtlBaseR billNoGrp : billNoGrpList) {
				MCList<Bill_Send01_HdrDtlBaseR> subBillHdrDtlBaseL = _billHdrDtlBaseL
						.subList(idxkey, billNoGrp.bill_no());
				subBillHdrDtlBaseL.sort(Bill_Send01_HdrDtlBaseR.$tax_cd);

				MCGroupByPolicy policy = new MCGroupByPolicy(
						Bill_Send01_HdrDtlBaseR.$tax_rate);
				policy.sum(Bill_Send01_HdrDtlBaseR.$trd_cur_amt,
						Bill_Send01_HdrDtlBaseR.$trd_cur_tax_amt,
						Bill_Send01_HdrDtlBaseR.$base_cur_tax_amt);
				MCList<Bill_Send01_HdrDtlBaseR> taxGrpL = subBillHdrDtlBaseL
						.groupBy(policy);
				taxGrpL = taxGrpL.subList(r -> !isNull(r.tax_rate()));
				taxGrpL.sort(Bill_Send01_HdrDtlBaseR.$tax_cd);

				for (int i = 0; i < taxGrpL.size(); i++) {
					if (!isNull(taxGrpL.get(i).tax_rate())) {
						int taxRowCnt = i + 1;
						if (taxRowCnt <= _TAX_MAX_ROW_COUNT
								|| (taxRowCnt == _TAX_MAX_ROW_COUNT
										&& taxGrpL.get(i).size() == _TAX_MAX_ROW_COUNT)) {

							subBillHdrDtlBaseL.setValueNE(getColumnNmByRowCnt(
									Bill_Send01_HdrDtlBaseR.$tax_rate1, taxRowCnt),
									taxGrpL.get(i).tax_rate());
							subBillHdrDtlBaseL.setValueNE(getColumnNmByRowCnt(
									Bill_Send01_HdrDtlBaseR.$tax_rate_sls_amt1,
									taxRowCnt), taxGrpL.get(i).trd_cur_amt());
							subBillHdrDtlBaseL.setValueNE(getColumnNmByRowCnt(
									Bill_Send01_HdrDtlBaseR.$tax_rate_tax_amt1,
									taxRowCnt), taxGrpL.get(i).trd_cur_tax_amt());

							if (!isNull(subBillHdrDtlBaseL.get(0).trd_cur_cd())
									&& !getCo().base_cur_cd().equals(
											subBillHdrDtlBaseL.get(0).trd_cur_cd())) {
								subBillHdrDtlBaseL.setValueNE(getColumnNmByRowCnt(
										Bill_Send01_HdrDtlBaseR.$tax_rate_base_tax_amt1,
										taxRowCnt), taxGrpL.get(i).base_cur_tax_amt());
							}
						}
						else {
							break;
						}
					}
				}
			}
		}

		/**
		 * 点在している税をまとめる
		 */
		protected void calcBillHdrTax() {
			for (Bill_Send01_HdrDtlBaseR baseR : _billHdrDtlBaseL) {
				if (isNullAnd(baseR.tax_rate(), baseR.ar_tax_rate1(), baseR.ar_tax_rate2())) {
					continue;
				}

				if (!isNull(baseR.tax_rate())) {
					if (_billPrintFlg) {
						baseR.trd_cur_amt(baseR.tax_sls_amt());
						baseR.trd_cur_tax_amt(baseR.tax_tax_amt());
					}
				}
				else if (!isNull(baseR.ar_tax_rate1())) {
					int sign = MAC_AR_STTL_TYP.isSETOFF_DR(baseR.ar_sttl_typ1()) ? -1 : 1;
					baseR.tax_rate(baseR.ar_tax_rate1());
					if (baseR.bill_tax_disp_flg1()) {
						baseR.trd_cur_amt(
								(baseR.trd_cur_amt1().subtract(baseR.trd_cur_tax_amt1()))
										.multiply(sign));
						baseR.trd_cur_tax_amt(baseR.trd_cur_tax_amt1().multiply(sign));
						baseR.base_cur_tax_amt(baseR.base_cur_tax_amt1().multiply(sign));
					}
					else {
						baseR.trd_cur_amt(0);
						baseR.trd_cur_tax_amt(0);
						baseR.base_cur_tax_amt(0);
					}
				}
				else if (!isNull(baseR.ar_tax_rate2())) {
					int sign = MAC_AR_STTL_TYP.isSETOFF_DR(baseR.ar_sttl_typ2()) ? -1 : 1;
					baseR.tax_rate(baseR.ar_tax_rate2());
					if (baseR.bill_tax_disp_flg2()) {
						baseR.trd_cur_amt(
								(baseR.trd_cur_amt2().subtract(baseR.trd_cur_tax_amt2()))
										.multiply(sign));
						baseR.trd_cur_tax_amt(baseR.trd_cur_tax_amt2().multiply(sign));
						baseR.base_cur_tax_amt(baseR.base_cur_tax_amt2().multiply(sign));
					}
					else {
						baseR.trd_cur_amt(0);
						baseR.trd_cur_tax_amt(0);
						baseR.base_cur_tax_amt(0);
					}
				}
			}
		}

		/**
		 * 請求管理番号に紐づく入金予定を取得し、請求書ヘッダー＆明細ベースリストの入金予定(1～10)を設定する。
		 * @param billHdrR 請求ヘッダー
		 */
		protected void setBillHdrRcvSchd() {

			if (!_billPrintFlg) return;
			if (_billClCanFlg) return;
			
			MCList<MST_RCV_SCHD_R> rcvSchdL = MCList.create(MST_RCV_SCHD_R.class);
			
			MST_RCV_SCHD_R t = MST_RCV_SCHD_R.create("T");
			MCQueryApiBuilder rcvSchdL_bldr = MCQueryApiBuilder.create(t);
			MAM_STTL_R m1 = MAM_STTL_R.create("M1");
			MSW_BILL_KEY_R w = MSW_BILL_KEY_R.create("W");
			rcvSchdL.addStringColumn("sttl_nm");
			rcvSchdL_bldr.setSelect(t.bill_mng_no, t.rcv_schd_dt, t.rcv_mtd_cd,
					m1.sttl_nm, t.rcv_typ, t.rcv_schd_amt);
			rcvSchdL_bldr.addSelect(m1.sttl_nm);
			rcvSchdL_bldr.addLeftOuterJoin(m1, m1.sttl_cd.eq(t.rcv_mtd_cd));
			rcvSchdL_bldr.addInnerJoin(w, w.bill_mng_no.eq(t.bill_mng_no));
			dbSelect("MSBGL5210_MST_RCV_SCHD_S01", rcvSchdL, rcvSchdL_bldr);

			MCList<Bill_Send01_HdrDtlBaseR> billHdrDtlBaseL = MCList
					.create(Bill_Send01_HdrDtlBaseR.class);
			MCIndexKey idxkey = rcvSchdL.createIndex(MST_RCV_SCHD_R.$bill_mng_no);

			MCList<Bill_Send01_HdrDtlBaseR> billNoGrpList = _billHdrDtlBaseL
					.groupBy(new MCGroupByPolicy(Bill_Send01_HdrDtlBaseR.$bill_mng_no));
			billNoGrpList.sort(Bill_Send01_HdrDtlBaseR.$bill_mng_no);

			for (Bill_Send01_HdrDtlBaseR billNoGrp : billNoGrpList) {
				MCList<Bill_Send01_HdrDtlBaseR> nowBillMngNoList = MCList
						.create(Bill_Send01_HdrDtlBaseR.class);
				for (Bill_Send01_HdrDtlBaseR r : _billHdrDtlBaseL) {
					if (billNoGrp.bill_mng_no().contentEquals(r.bill_mng_no()))
						nowBillMngNoList.add(r);
				}

				MCList<MST_RCV_SCHD_R> subRcvSchdL = MCList.create(MST_RCV_SCHD_R.class);
				subRcvSchdL.addAll(rcvSchdL.subList(idxkey, billNoGrp.bill_mng_no()));
				if (subRcvSchdL.isEmpty()) continue;
				subRcvSchdL.sort(MST_RCV_SCHD_R.$rcv_schd_dt, MST_RCV_SCHD_R.$rcv_mtd_cd);

				for (int i = 0; i < subRcvSchdL.size(); i++) {
					int rcvRowCnt = i + 1;

					if (rcvRowCnt == _RCV_SCHD_MAX_ROW_COUNT
							&& subRcvSchdL.size() > _RCV_SCHD_MAX_ROW_COUNT) {
						MCNumber samRcvSchdAmt = new MCNumber(0);
						for (int y = _RCV_SCHD_MAX_ROW_COUNT - 1; y < subRcvSchdL
								.size(); y++) {
							samRcvSchdAmt = samRcvSchdAmt
									.add(subRcvSchdL.get(y).rcv_schd_amt());
						}
						nowBillMngNoList.setValueNE(getColumnNmByRowCnt(
								Bill_Send01_HdrDtlBaseR.$rcv_schd_amt1,
								_RCV_SCHD_MAX_ROW_COUNT), samRcvSchdAmt);
						nowBillMngNoList.setValueNE(
								getColumnNmByRowCnt(Bill_Send01_HdrDtlBaseR.$rcv_mtd_nm1,
										_RCV_SCHD_MAX_ROW_COUNT),
								MSC_BILL_PRNT_STR.ELSE_RCV_SCHD.name(
										mcframe.serverCore.sys.MCSys.user.locale()));
						break;
					}
					else {
						if (rcvRowCnt < _RCV_SCHD_MAX_ROW_COUNT
								|| (rcvRowCnt == _RCV_SCHD_MAX_ROW_COUNT && subRcvSchdL
										.size() == _RCV_SCHD_MAX_ROW_COUNT)) {

							nowBillMngNoList.setValueNE(getColumnNmByRowCnt(
									Bill_Send01_HdrDtlBaseR.$rcv_schd_dt1, rcvRowCnt),
									subRcvSchdL.get(i).rcv_schd_dt());
							nowBillMngNoList.setValueNE(getColumnNmByRowCnt(
									Bill_Send01_HdrDtlBaseR.$rcv_schd_amt1, rcvRowCnt),
									subRcvSchdL.get(i).rcv_schd_amt());
							nowBillMngNoList.setValueNE(getColumnNmByRowCnt(
									Bill_Send01_HdrDtlBaseR.$rcv_mtd_cd1, rcvRowCnt),
									subRcvSchdL.get(i).rcv_mtd_cd());

							MST_RCV_SCHD_R sttl = rcvSchdL.getFirst(
									MST_RCV_SCHD_R.$rcv_mtd_cd,
									subRcvSchdL.get(i).rcv_mtd_cd());
							if (!isNull(sttl)) {
								nowBillMngNoList.setValueNE(getColumnNmByRowCnt(
										Bill_Send01_HdrDtlBaseR.$rcv_mtd_nm1, rcvRowCnt),
										sttl.getStringNE(MAM_STTL_R.$sttl_nm));
							}
						}
						else {
							break;
						}
					}
				}

				if (0 < nowBillMngNoList.size()) billHdrDtlBaseL.addAll(nowBillMngNoList);

			}
			_billHdrDtlBaseL = billHdrDtlBaseL;
		}

		/**
		 *請求送信ＩＦのその他補完項目を設定・値調整する。
		 * @param billHdrR 請求ヘッダー
		 */
		protected void setOtherItm() {

			MCList<Bill_Send01_HdrDtlBaseR> setoffL = MCList
					.create(Bill_Send01_HdrDtlBaseR.class);

			MCList<Bill_Send01_HdrDtlBaseR> billNoGrpList = _billHdrDtlBaseL
					.groupBy(new MCGroupByPolicy(Bill_Send01_HdrDtlBaseR.$bill_no));
			billNoGrpList.sort(Bill_Send01_HdrDtlBaseR.$bill_no);

			MCIndexKey idxkey = _billHdrDtlBaseL
					.createIndex(Bill_Send01_HdrDtlBaseR.$bill_no);
			for (Bill_Send01_HdrDtlBaseR billNoGrp : billNoGrpList) {
				MCList<Bill_Send01_HdrDtlBaseR> subBillHdrDtlBaseL = _billHdrDtlBaseL
						.subList(idxkey, billNoGrp.bill_no());
				if (_billPrintFlg) {
					setStartEndDate(subBillHdrDtlBaseL.get(0));
					subBillHdrDtlBaseL.setValueNE(Bill_Send01_HdrDtlBaseR.$bill_st_dt,
							subBillHdrDtlBaseL.get(0).bill_st_dt());
					subBillHdrDtlBaseL.setValueNE(Bill_Send01_HdrDtlBaseR.$bill_end_dt,
							subBillHdrDtlBaseL.get(0).bill_end_dt());
				}
				else {
					if (subBillHdrDtlBaseL.get(0).dlv_slip_seq().intValue() > 1) {
						subBillHdrDtlBaseL.setValueNE(
								Bill_Send01_HdrDtlBaseR.$pre_bill_no,
								subBillHdrDtlBaseL.get(0).bill_no());
						subBillHdrDtlBaseL.setValueNE(
								Bill_Send01_HdrDtlBaseR.$pre_bill_dt,
								subBillHdrDtlBaseL.get(0).dlv_dt());
					}
				}
			}

			for (Bill_Send01_HdrDtlBaseR r : _billHdrDtlBaseL) {
				if (_billPrintFlg) {
					splitArDtlR(r, setoffL);
				}
				else {
					if (MAC_SLIP_STS_TYP.isCAN(r.slip_sts_typ())) {
						r.sls_amt(0);
						r.dscnt_amt(0);
						r.ret_amt(0);
						r.tax_amt(0);
						r.bill_amt(0);
						r.trd_unit_qty(0);
						r.trd_cur_upri(0);
						r.trd_cur_amt(0);
						r.trd_cur_tax_amt(0);

						for (int i = 0; i < _TAX_MAX_ROW_COUNT; i++) {
							r.setValueNE(getColumnNmByRowCnt(
									Bill_Send01_HdrDtlBaseR.$tax_rate_sls_amt1, i + 1),
									null);
							r.setValueNE(getColumnNmByRowCnt(
									Bill_Send01_HdrDtlBaseR.$tax_rate_tax_amt1, i + 1),
									null);
							r.setValueNE(getColumnNmByRowCnt(
									Bill_Send01_HdrDtlBaseR.$tax_rate_base_tax_amt1,
									i + 1), null);
						}

					}
				}
			}

			if (setoffL.size() > 0) {
				_billHdrDtlBaseL.addAll(setoffL);
			}
		}

		/**
		 * 売掛金消込と前受金入金の入金・相殺分割、設定値の調整
		 */
		protected void splitArDtlR(Bill_Send01_HdrDtlBaseR billDtlBaseR, MCList<Bill_Send01_HdrDtlBaseR> addSetOffL) {
			if (_billClCanFlg) return;

			if (MAC_AR_STTL_TYP.isSETOFF_DR(billDtlBaseR.ar_sttl_typ1())) {
				billDtlBaseR.dlv_dt(billDtlBaseR.ar_rcv_dt());
				billDtlBaseR.itm_nm(billDtlBaseR.ar_sttl_nm1());
				if (billDtlBaseR.bill_tax_disp_flg1()) {
					billDtlBaseR.trd_cur_amt(billDtlBaseR.trd_cur_amt1().subtract(billDtlBaseR.trd_cur_tax_amt1()));
					billDtlBaseR.trd_cur_tax_amt(billDtlBaseR.trd_cur_tax_amt1());
					billDtlBaseR.tax_cd(billDtlBaseR.ar_tax_cd1());
					billDtlBaseR.tax_nm(billDtlBaseR.ar_tax_nm1());
					billDtlBaseR.inc_tax_flg(billDtlBaseR.inc_tax_flg1());
					billDtlBaseR.tax_rate(billDtlBaseR.ar_tax_rate1());
				}
				else {
					billDtlBaseR.trd_cur_amt(billDtlBaseR.trd_cur_amt1());
					billDtlBaseR.trd_cur_tax_amt(0);
					billDtlBaseR.tax_cd(null);
					billDtlBaseR.tax_nm(null);
					billDtlBaseR.inc_tax_flg(false);
					billDtlBaseR.tax_rate(null);
				}
			}
			else if (MAC_AR_STTL_TYP.isSETOFF_DR(billDtlBaseR.ar_sttl_typ2())) {
				billDtlBaseR.dlv_dt(billDtlBaseR.ar_rcv_dt());
				billDtlBaseR.itm_nm(billDtlBaseR.ar_sttl_nm1());
				billDtlBaseR.trd_cur_amt(billDtlBaseR.trd_cur_amt1());
				billDtlBaseR.trd_cur_tax_amt(0);
				billDtlBaseR.tax_cd(billDtlBaseR.ar_tax_cd1());
				billDtlBaseR.tax_nm(billDtlBaseR.ar_tax_nm1());
				billDtlBaseR.inc_tax_flg(billDtlBaseR.inc_tax_flg1());
				billDtlBaseR.tax_rate(billDtlBaseR.ar_tax_rate1());

				Bill_Send01_HdrDtlBaseR setoffR = billDtlBaseR.clone();
				setoffR.dlv_dt(billDtlBaseR.ar_rcv_dt());
				setoffR.itm_nm(billDtlBaseR.ar_sttl_nm2());
				if (billDtlBaseR.bill_tax_disp_flg2()) {
					setoffR.trd_cur_amt(billDtlBaseR.trd_cur_amt2().subtract(billDtlBaseR.trd_cur_tax_amt2()));
					setoffR.trd_cur_tax_amt(billDtlBaseR.trd_cur_tax_amt2());
					setoffR.tax_cd(billDtlBaseR.ar_tax_cd2());
					setoffR.tax_nm(billDtlBaseR.ar_tax_nm2());
					setoffR.inc_tax_flg(billDtlBaseR.inc_tax_flg2());
					setoffR.tax_rate(billDtlBaseR.ar_tax_rate2());
				}
				else {
					setoffR.trd_cur_amt(billDtlBaseR.trd_cur_amt2());
					setoffR.trd_cur_tax_amt(0);
					setoffR.tax_cd(null);
					setoffR.tax_nm(null);
					setoffR.inc_tax_flg(false);
					setoffR.tax_rate(null);
				}
				addSetOffL.add(setoffR);
			}
			else if (!isNull(billDtlBaseR.trd_ptn_typ()) && isAdvTrdTyp(billDtlBaseR.trd_ptn_typ())) {
				billDtlBaseR.dlv_dt(billDtlBaseR.ar_rcv_dt());
				billDtlBaseR.itm_nm(billDtlBaseR.ar_sttl_nm1());
				billDtlBaseR.trd_cur_amt(billDtlBaseR.trd_cur_amt1());
				billDtlBaseR.trd_cur_tax_amt(0);
				billDtlBaseR.inc_tax_flg(billDtlBaseR.inc_tax_flg1());
			}
			else {
				if(isNull(billDtlBaseR.itm_nm())) {
					billDtlBaseR.itm_nm(billDtlBaseR.ar_sttl_nm1());
				}
			}
		}

		/**
		 * 請求書ヘッダー＆明細ベースリストを請求送信ＩＦデータにマッピングし、請求送信ＩＦにデータを登録。
		 */
		protected MCList<MST_BILL_SEND_IF_R> createAndInsertBillSendIf() {
			MCList<MST_BILL_SEND_IF_R> billSendIfL = MCList
					.create(MST_BILL_SEND_IF_R.class);

			MCList<MST_BILL_SEND_IF_R> billSendIfL2 = MCList
					.create(MST_BILL_SEND_IF_R.class);

			addAll(billSendIfL, _billHdrDtlBaseL,
					createMap_MST_BILL_SEND_IF_R_MST_BILL_R());

			for (MST_BILL_SEND_IF_R r : billSendIfL) {
				if (!(MAC_TRD_PTN_TYP.isTAX_DIFF_BILL_CL(r.trd_ptn_typ())
						&& r.trd_cur_tax_amt().isZero())) {
					billSendIfL2.add(r);
				}
			}

			setSequenceDataNo(billSendIfL2);
			setNullValToNullConv(billSendIfL2);

			dbInsert("MSLAL5210_MST_BILL_SEND_IF_I01", billSendIfL2,
					MCQueryApiBuilder.create(MST_BILL_SEND_IF_R.create("T2")));

			return billSendIfL2;
		}

		/**
		 * 請求送信ＩＦデータに採番したデータ番号・データ行番号の付与を行う。
		 */
		protected void setSequenceDataNo(MCList<MST_BILL_SEND_IF_R> billSendIfL) {

			doSeqCache(MAC_NUM_SYS_TYP.ESB_DATA_NO,
					_billHdrDtlBaseL.groupBy(Bill_Send01_HdrDtlBaseR.$bill_no).size());
			doSeqCache(MSC_NUM_SYS_TYP.BILLSENDIF, _billHdrDtlBaseL.size());

			for (MCList<MST_BILL_SEND_IF_R> billSendIfBillNoGrpL : billSendIfL
					.groupList(MST_BILL_SEND_IF_R.$bill_no)) {
				MCNumber dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());
				billSendIfBillNoGrpL.setValueNE(MST_BILL_SEND_IF_R.$data_no, dataNo);

				for (MST_BILL_SEND_IF_R billSendIf : billSendIfBillNoGrpL) {
					MCNumber dataLNo = getSequence(MSC_NUM_SYS_TYP.BILLSENDIF.value());
					billSendIf.data_lno(dataLNo);
				}
			}
		}
		
		/**
		 * 請求送信ＩＦデータのnull代替文字をnullに変換する。
		 */
		protected void setNullValToNullConv(MCList<MST_BILL_SEND_IF_R> billSendIfL) {
			for (MST_BILL_SEND_IF_R billSendIf : billSendIfL) {
				if (!billSendIf.getBooleanNE(MAM_EXT_SYS_R.$null_val_if_flg)) {
					billSendIf.itm_sub1(nullValToNull(billSendIf.itm_sub1()));
					billSendIf.itm_sub2(nullValToNull(billSendIf.itm_sub2()));
					billSendIf.itm_sub3(nullValToNull(billSendIf.itm_sub3()));
					billSendIf.bill_d_no(nullValToNull(billSendIf.bill_d_no()));
					billSendIf.iv_no(nullValToNull(billSendIf.iv_no()));
					billSendIf.sno1(nullValToNull(billSendIf.sno1()));
					billSendIf.sno2(nullValToNull(billSendIf.sno2()));
					billSendIf.sno3(nullValToNull(billSendIf.sno3()));
					billSendIf.sno4(nullValToNull(billSendIf.sno4()));
				}
			}
		}

		protected boolean isBillCl() {
			return up0().get(0).bill_print_flg() && !up0().get(0).bill_close_cancel_flg();
		}

		/**
		 * 請求書ヘッダー＆明細ベースリストから請求送信ＩＦへの変換マッパー。
		 */
		protected Map_MST_BILL_SEND_IF_R_MST_BILL_R<MST_BILL_SEND_IF_R, Bill_Send01_HdrDtlBaseR> createMap_MST_BILL_SEND_IF_R_MST_BILL_R() {
			return new Map_MST_BILL_SEND_IF_R_MST_BILL_R<MST_BILL_SEND_IF_R, Bill_Send01_HdrDtlBaseR>();
		}

		public class Map_MST_BILL_SEND_IF_R_MST_BILL_R<D extends MST_BILL_SEND_IF_R, S extends Bill_Send01_HdrDtlBaseR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_BILL_SEND_IF_R.$ext_sys_cd,
						Bill_Send01_HdrDtlBaseR.$ext_sys_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bill_cl_dt,
						Bill_Send01_HdrDtlBaseR.$bill_cl_dt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bill_dt,
						Bill_Send01_HdrDtlBaseR.$bill_dt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bill_no,
						Bill_Send01_HdrDtlBaseR.$bill_no);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bill_d_no,
						Bill_Send01_HdrDtlBaseR.$bill_d_no);
				addColumnPathMap(MST_BILL_SEND_IF_R.$pre_bill_no,
						Bill_Send01_HdrDtlBaseR.$pre_bill_no);
				addColumnPathMap(MST_BILL_SEND_IF_R.$pre_bill_dt,
						Bill_Send01_HdrDtlBaseR.$pre_bill_dt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bill_st_dt,
						Bill_Send01_HdrDtlBaseR.$bill_st_dt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bill_end_dt,
						Bill_Send01_HdrDtlBaseR.$bill_end_dt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$iv_no,
						Bill_Send01_HdrDtlBaseR.$iv_no);
				addColumnPathMap(MST_BILL_SEND_IF_R.$wrk_no,
						Bill_Send01_HdrDtlBaseR.$wrk_no);
				addColumnPathMap(MST_BILL_SEND_IF_R.$wrk_nm,
						Bill_Send01_HdrDtlBaseR.$wrk_nm);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_co_cd,
						Bill_Send01_HdrDtlBaseR.$if_co_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$co_nm,
						Bill_Send01_HdrDtlBaseR.$co_nm);
				addColumnPathMap(MST_BILL_SEND_IF_R.$ein, Bill_Send01_HdrDtlBaseR.$ein);
				addColumnPathMap(MST_BILL_SEND_IF_R.$biz_co_no,
						Bill_Send01_HdrDtlBaseR.$biz_co_no);
				addColumnPathMap(MST_BILL_SEND_IF_R.$zip_cd,
						Bill_Send01_HdrDtlBaseR.$zip_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$addr1,
						Bill_Send01_HdrDtlBaseR.$addr1);
				addColumnPathMap(MST_BILL_SEND_IF_R.$addr2,
						Bill_Send01_HdrDtlBaseR.$addr2);
				addColumnPathMap(MST_BILL_SEND_IF_R.$addr3,
						Bill_Send01_HdrDtlBaseR.$addr3);
				addColumnPathMap(MST_BILL_SEND_IF_R.$addr4,
						Bill_Send01_HdrDtlBaseR.$addr4);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bill_dpt,
						Bill_Send01_HdrDtlBaseR.$bill_dpt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tel, Bill_Send01_HdrDtlBaseR.$tel);
				addColumnPathMap(MST_BILL_SEND_IF_R.$cntry_cd,
						Bill_Send01_HdrDtlBaseR.$cntry_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_cntry_cd,
						Bill_Send01_HdrDtlBaseR.$if_cntry_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bcst_cd,
						Bill_Send01_HdrDtlBaseR.$bcst_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_bcst_cd,
						Bill_Send01_HdrDtlBaseR.$if_bcst_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bcst_nm,
						Bill_Send01_HdrDtlBaseR.$bcst_nm);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bill_bcst_nm,
						Bill_Send01_HdrDtlBaseR.$bill_bcst_nm);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bcst_ein,
						Bill_Send01_HdrDtlBaseR.$bcst_ein);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bcst_biz_co_no,
						Bill_Send01_HdrDtlBaseR.$bcst_biz_co_no);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bcst_zip_cd,
						Bill_Send01_HdrDtlBaseR.$bcst_zip_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bcst_addr1,
						Bill_Send01_HdrDtlBaseR.$bcst_addr1);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bcst_addr2,
						Bill_Send01_HdrDtlBaseR.$bcst_addr2);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bcst_addr3,
						Bill_Send01_HdrDtlBaseR.$bcst_addr3);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bcst_addr4,
						Bill_Send01_HdrDtlBaseR.$bcst_addr4);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bill_bcst_dpt,
						Bill_Send01_HdrDtlBaseR.$bill_bcst_dpt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bill_tel,
						Bill_Send01_HdrDtlBaseR.$bill_tel);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bcst_cntry_cd,
						Bill_Send01_HdrDtlBaseR.$bcst_cntry_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_bcst_cntry_cd,
						Bill_Send01_HdrDtlBaseR.$if_bcst_cntry_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$trd_cur_cd,
						Bill_Send01_HdrDtlBaseR.$trd_cur_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_trd_cur_cd,
						Bill_Send01_HdrDtlBaseR.$if_trd_cur_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bill_xrate,
						Bill_Send01_HdrDtlBaseR.$bill_xrate);
				addColumnPathMap(MST_BILL_SEND_IF_R.$last_bill_amt,
						Bill_Send01_HdrDtlBaseR.$last_bill_amt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_amt,
						Bill_Send01_HdrDtlBaseR.$rcv_amt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$sw_amt,
						Bill_Send01_HdrDtlBaseR.$sw_amt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$setoff_amt,
						Bill_Send01_HdrDtlBaseR.$setoff_amt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bfw_amt,
						Bill_Send01_HdrDtlBaseR.$bfw_amt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$sls_amt,
						Bill_Send01_HdrDtlBaseR.$sls_amt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$dscnt_amt,
						Bill_Send01_HdrDtlBaseR.$dscnt_amt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$ret_amt,
						Bill_Send01_HdrDtlBaseR.$ret_amt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_amt,
						Bill_Send01_HdrDtlBaseR.$tax_amt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$sw_to_amt,
						Bill_Send01_HdrDtlBaseR.$sw_to_amt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bill_amt,
						Bill_Send01_HdrDtlBaseR.$bill_amt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate1,
						Bill_Send01_HdrDtlBaseR.$tax_rate1);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_sls_amt1,
						Bill_Send01_HdrDtlBaseR.$tax_rate_sls_amt1);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_tax_amt1,
						Bill_Send01_HdrDtlBaseR.$tax_rate_tax_amt1);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt1,
						Bill_Send01_HdrDtlBaseR.$tax_rate_base_tax_amt1);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate2,
						Bill_Send01_HdrDtlBaseR.$tax_rate2);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_sls_amt2,
						Bill_Send01_HdrDtlBaseR.$tax_rate_sls_amt2);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_tax_amt2,
						Bill_Send01_HdrDtlBaseR.$tax_rate_tax_amt2);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt2,
						Bill_Send01_HdrDtlBaseR.$tax_rate_base_tax_amt2);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate3,
						Bill_Send01_HdrDtlBaseR.$tax_rate3);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_sls_amt3,
						Bill_Send01_HdrDtlBaseR.$tax_rate_sls_amt3);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_tax_amt3,
						Bill_Send01_HdrDtlBaseR.$tax_rate_tax_amt3);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt3,
						Bill_Send01_HdrDtlBaseR.$tax_rate_base_tax_amt3);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate4,
						Bill_Send01_HdrDtlBaseR.$tax_rate4);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_sls_amt4,
						Bill_Send01_HdrDtlBaseR.$tax_rate_sls_amt4);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_tax_amt4,
						Bill_Send01_HdrDtlBaseR.$tax_rate_tax_amt4);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt4,
						Bill_Send01_HdrDtlBaseR.$tax_rate_base_tax_amt4);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate5,
						Bill_Send01_HdrDtlBaseR.$tax_rate5);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_sls_amt5,
						Bill_Send01_HdrDtlBaseR.$tax_rate_sls_amt5);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_tax_amt5,
						Bill_Send01_HdrDtlBaseR.$tax_rate_tax_amt5);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt5,
						Bill_Send01_HdrDtlBaseR.$tax_rate_base_tax_amt5);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate6,
						Bill_Send01_HdrDtlBaseR.$tax_rate6);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_sls_amt6,
						Bill_Send01_HdrDtlBaseR.$tax_rate_sls_amt6);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_tax_amt6,
						Bill_Send01_HdrDtlBaseR.$tax_rate_tax_amt6);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt6,
						Bill_Send01_HdrDtlBaseR.$tax_rate_base_tax_amt6);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate7,
						Bill_Send01_HdrDtlBaseR.$tax_rate7);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_sls_amt7,
						Bill_Send01_HdrDtlBaseR.$tax_rate_sls_amt7);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_tax_amt7,
						Bill_Send01_HdrDtlBaseR.$tax_rate_tax_amt7);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt7,
						Bill_Send01_HdrDtlBaseR.$tax_rate_base_tax_amt7);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate8,
						Bill_Send01_HdrDtlBaseR.$tax_rate8);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_sls_amt8,
						Bill_Send01_HdrDtlBaseR.$tax_rate_sls_amt8);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_tax_amt8,
						Bill_Send01_HdrDtlBaseR.$tax_rate_tax_amt8);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt8,
						Bill_Send01_HdrDtlBaseR.$tax_rate_base_tax_amt8);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate9,
						Bill_Send01_HdrDtlBaseR.$tax_rate9);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_sls_amt9,
						Bill_Send01_HdrDtlBaseR.$tax_rate_sls_amt9);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_tax_amt9,
						Bill_Send01_HdrDtlBaseR.$tax_rate_tax_amt9);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt9,
						Bill_Send01_HdrDtlBaseR.$tax_rate_base_tax_amt9);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate10,
						Bill_Send01_HdrDtlBaseR.$tax_rate10);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_sls_amt10,
						Bill_Send01_HdrDtlBaseR.$tax_rate_sls_amt10);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_tax_amt10,
						Bill_Send01_HdrDtlBaseR.$tax_rate_tax_amt10);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt10,
						Bill_Send01_HdrDtlBaseR.$tax_rate_base_tax_amt10);
				addColumnPathMap(MST_BILL_SEND_IF_R.$adv_amt_bal,
						Bill_Send01_HdrDtlBaseR.$adv_amt_bal);
				addColumnPathMap(MST_BILL_SEND_IF_R.$adv_amt,
						Bill_Send01_HdrDtlBaseR.$adv_amt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$adv_setoff_amt,
						Bill_Send01_HdrDtlBaseR.$adv_setoff_amt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$adv_setoff_tax_amt,
						Bill_Send01_HdrDtlBaseR.$adv_setoff_tax_amt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_schd_dt1,
						Bill_Send01_HdrDtlBaseR.$rcv_schd_dt1);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_schd_amt1,
						Bill_Send01_HdrDtlBaseR.$rcv_schd_amt1);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_mtd_cd1,
						Bill_Send01_HdrDtlBaseR.$rcv_mtd_cd1);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_rcv_mtd_cd1,
						Bill_Send01_HdrDtlBaseR.$if_rcv_mtd_cd1);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_mtd_nm1,
						Bill_Send01_HdrDtlBaseR.$rcv_mtd_nm1);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_schd_dt2,
						Bill_Send01_HdrDtlBaseR.$rcv_schd_dt2);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_schd_amt2,
						Bill_Send01_HdrDtlBaseR.$rcv_schd_amt2);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_mtd_cd2,
						Bill_Send01_HdrDtlBaseR.$rcv_mtd_cd2);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_rcv_mtd_cd2,
						Bill_Send01_HdrDtlBaseR.$if_rcv_mtd_cd2);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_mtd_nm2,
						Bill_Send01_HdrDtlBaseR.$rcv_mtd_nm2);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_schd_dt3,
						Bill_Send01_HdrDtlBaseR.$rcv_schd_dt3);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_schd_amt3,
						Bill_Send01_HdrDtlBaseR.$rcv_schd_amt3);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_mtd_cd3,
						Bill_Send01_HdrDtlBaseR.$rcv_mtd_cd3);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_rcv_mtd_cd3,
						Bill_Send01_HdrDtlBaseR.$if_rcv_mtd_cd3);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_mtd_nm3,
						Bill_Send01_HdrDtlBaseR.$rcv_mtd_nm3);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_schd_dt4,
						Bill_Send01_HdrDtlBaseR.$rcv_schd_dt4);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_schd_amt4,
						Bill_Send01_HdrDtlBaseR.$rcv_schd_amt4);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_mtd_cd4,
						Bill_Send01_HdrDtlBaseR.$rcv_mtd_cd4);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_rcv_mtd_cd4,
						Bill_Send01_HdrDtlBaseR.$if_rcv_mtd_cd4);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_mtd_nm4,
						Bill_Send01_HdrDtlBaseR.$rcv_mtd_nm4);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_schd_dt5,
						Bill_Send01_HdrDtlBaseR.$rcv_schd_dt5);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_schd_amt5,
						Bill_Send01_HdrDtlBaseR.$rcv_schd_amt5);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_mtd_cd5,
						Bill_Send01_HdrDtlBaseR.$rcv_mtd_cd5);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_rcv_mtd_cd5,
						Bill_Send01_HdrDtlBaseR.$if_rcv_mtd_cd5);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_mtd_nm5,
						Bill_Send01_HdrDtlBaseR.$rcv_mtd_nm5);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_schd_dt6,
						Bill_Send01_HdrDtlBaseR.$rcv_schd_dt6);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_schd_amt6,
						Bill_Send01_HdrDtlBaseR.$rcv_schd_amt6);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_mtd_cd6,
						Bill_Send01_HdrDtlBaseR.$rcv_mtd_cd6);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_rcv_mtd_cd6,
						Bill_Send01_HdrDtlBaseR.$if_rcv_mtd_cd6);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_mtd_nm6,
						Bill_Send01_HdrDtlBaseR.$rcv_mtd_nm6);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_schd_dt7,
						Bill_Send01_HdrDtlBaseR.$rcv_schd_dt7);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_schd_amt7,
						Bill_Send01_HdrDtlBaseR.$rcv_schd_amt7);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_mtd_cd7,
						Bill_Send01_HdrDtlBaseR.$rcv_mtd_cd7);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_rcv_mtd_cd7,
						Bill_Send01_HdrDtlBaseR.$if_rcv_mtd_cd7);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_mtd_nm7,
						Bill_Send01_HdrDtlBaseR.$rcv_mtd_nm7);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_schd_dt8,
						Bill_Send01_HdrDtlBaseR.$rcv_schd_dt8);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_schd_amt8,
						Bill_Send01_HdrDtlBaseR.$rcv_schd_amt8);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_mtd_cd8,
						Bill_Send01_HdrDtlBaseR.$rcv_mtd_cd8);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_rcv_mtd_cd8,
						Bill_Send01_HdrDtlBaseR.$if_rcv_mtd_cd8);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_mtd_nm8,
						Bill_Send01_HdrDtlBaseR.$rcv_mtd_nm8);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_schd_dt9,
						Bill_Send01_HdrDtlBaseR.$rcv_schd_dt9);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_schd_amt9,
						Bill_Send01_HdrDtlBaseR.$rcv_schd_amt9);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_mtd_cd9,
						Bill_Send01_HdrDtlBaseR.$rcv_mtd_cd9);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_rcv_mtd_cd9,
						Bill_Send01_HdrDtlBaseR.$if_rcv_mtd_cd9);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_mtd_nm9,
						Bill_Send01_HdrDtlBaseR.$rcv_mtd_nm9);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_schd_dt10,
						Bill_Send01_HdrDtlBaseR.$rcv_schd_dt10);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_schd_amt10,
						Bill_Send01_HdrDtlBaseR.$rcv_schd_amt10);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_mtd_cd10,
						Bill_Send01_HdrDtlBaseR.$rcv_mtd_cd10);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_rcv_mtd_cd10,
						Bill_Send01_HdrDtlBaseR.$if_rcv_mtd_cd10);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_mtd_nm10,
						Bill_Send01_HdrDtlBaseR.$rcv_mtd_nm10);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bank_ac_cd,
						Bill_Send01_HdrDtlBaseR.$bank_ac_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_bank_ac_cd,
						Bill_Send01_HdrDtlBaseR.$if_bank_ac_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bank_ac_typ,
						Bill_Send01_HdrDtlBaseR.$bank_ac_typ);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bank_ac_no,
						Bill_Send01_HdrDtlBaseR.$bank_ac_no);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bank_ac_holder,
						Bill_Send01_HdrDtlBaseR.$bank_ac_holder);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bank_ac_holder_sub,
						Bill_Send01_HdrDtlBaseR.$bank_ac_holder_sub);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bank_cd,
						Bill_Send01_HdrDtlBaseR.$bank_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bank_nm,
						Bill_Send01_HdrDtlBaseR.$bank_nm);
				addColumnPathMap(MST_BILL_SEND_IF_R.$branch_cd,
						Bill_Send01_HdrDtlBaseR.$branch_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$branch_nm,
						Bill_Send01_HdrDtlBaseR.$branch_nm);
				addColumnPathMap(MST_BILL_SEND_IF_R.$trd_cd,
						Bill_Send01_HdrDtlBaseR.$trd_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_trd_cd,
						Bill_Send01_HdrDtlBaseR.$if_trd_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$trd_nm,
						Bill_Send01_HdrDtlBaseR.$trd_nm);
				addColumnPathMap(MST_BILL_SEND_IF_R.$trd_ptn_typ,
						Bill_Send01_HdrDtlBaseR.$trd_ptn_typ);
				addColumnPathMap(MST_BILL_SEND_IF_R.$slip_sts_typ,
						Bill_Send01_HdrDtlBaseR.$slip_sts_typ);
				addColumnPathMap(MST_BILL_SEND_IF_R.$dlv_slip_no,
						Bill_Send01_HdrDtlBaseR.$dlv_slip_no);
				addColumnPathMap(MST_BILL_SEND_IF_R.$dlv_slip_d_no,
						Bill_Send01_HdrDtlBaseR.$dlv_slip_d_no);
				addColumnPathMap(MST_BILL_SEND_IF_R.$ship_dlv_slip_no,
						Bill_Send01_HdrDtlBaseR.$ship_dlv_slip_no);
				addColumnPathMap(MST_BILL_SEND_IF_R.$ship_dlv_slip_d_no,
						Bill_Send01_HdrDtlBaseR.$ship_dlv_slip_d_no);
				addColumnPathMap(MST_BILL_SEND_IF_R.$act_no,
						Bill_Send01_HdrDtlBaseR.$act_no);
				addColumnPathMap(MST_BILL_SEND_IF_R.$act_rev,
						Bill_Send01_HdrDtlBaseR.$act_rev);
				addColumnPathMap(MST_BILL_SEND_IF_R.$act_d_no,
						Bill_Send01_HdrDtlBaseR.$act_d_no);
				addColumnPathMap(MST_BILL_SEND_IF_R.$cst_po_no,
						Bill_Send01_HdrDtlBaseR.$cst_po_no);
				addColumnPathMap(MST_BILL_SEND_IF_R.$cst_po_d_no,
						Bill_Send01_HdrDtlBaseR.$cst_po_d_no);
				addColumnPathMap(MST_BILL_SEND_IF_R.$ac_dt,
						Bill_Send01_HdrDtlBaseR.$ac_dt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$dlv_dt,
						Bill_Send01_HdrDtlBaseR.$dlv_dt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$rcv_dt,
						Bill_Send01_HdrDtlBaseR.$rcv_dt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$bill_basis_dt,
						Bill_Send01_HdrDtlBaseR.$bill_basis_dt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$base_ac_dt,
						Bill_Send01_HdrDtlBaseR.$base_ac_dt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$itm_cd,
						Bill_Send01_HdrDtlBaseR.$itm_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$itm_sub1,
						Bill_Send01_HdrDtlBaseR.$itm_sub1);
				addColumnPathMap(MST_BILL_SEND_IF_R.$itm_sub2,
						Bill_Send01_HdrDtlBaseR.$itm_sub2);
				addColumnPathMap(MST_BILL_SEND_IF_R.$itm_sub3,
						Bill_Send01_HdrDtlBaseR.$itm_sub3);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_itm_cd,
						Bill_Send01_HdrDtlBaseR.$if_itm_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_itm_sub1,
						Bill_Send01_HdrDtlBaseR.$if_itm_sub1);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_itm_sub2,
						Bill_Send01_HdrDtlBaseR.$if_itm_sub2);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_itm_sub3,
						Bill_Send01_HdrDtlBaseR.$if_itm_sub3);
				addColumnPathMap(MST_BILL_SEND_IF_R.$itm_nm,
						Bill_Send01_HdrDtlBaseR.$itm_nm);
				addColumnPathMap(MST_BILL_SEND_IF_R.$itm_alt_nm1,
						Bill_Send01_HdrDtlBaseR.$itm_alt_nm1);
				addColumnPathMap(MST_BILL_SEND_IF_R.$itm_alt_nm2,
						Bill_Send01_HdrDtlBaseR.$itm_alt_nm2);
				addColumnPathMap(MST_BILL_SEND_IF_R.$itm_alt_nm3,
						Bill_Send01_HdrDtlBaseR.$itm_alt_nm3);
				addColumnPathMap(MST_BILL_SEND_IF_R.$itm_alt_nm4,
						Bill_Send01_HdrDtlBaseR.$itm_alt_nm4);
				addColumnPathMap(MST_BILL_SEND_IF_R.$sno1, Bill_Send01_HdrDtlBaseR.$sno1);
				addColumnPathMap(MST_BILL_SEND_IF_R.$sno2, Bill_Send01_HdrDtlBaseR.$sno2);
				addColumnPathMap(MST_BILL_SEND_IF_R.$sno3, Bill_Send01_HdrDtlBaseR.$sno3);
				addColumnPathMap(MST_BILL_SEND_IF_R.$sno4, Bill_Send01_HdrDtlBaseR.$sno4);
				addColumnPathMap(MST_BILL_SEND_IF_R.$trd_unit_cd,
						Bill_Send01_HdrDtlBaseR.$trd_unit_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_trd_unit_cd,
						Bill_Send01_HdrDtlBaseR.$if_trd_unit_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$trd_unit_nm,
						Bill_Send01_HdrDtlBaseR.$trd_unit_nm);
				addColumnPathMap(MST_BILL_SEND_IF_R.$trd_unit_qty,
						Bill_Send01_HdrDtlBaseR.$trd_unit_qty);
				addColumnPathMap(MST_BILL_SEND_IF_R.$interim_flg,
						Bill_Send01_HdrDtlBaseR.$interim_flg);
				addColumnPathMap(MST_BILL_SEND_IF_R.$trd_cur_upri,
						Bill_Send01_HdrDtlBaseR.$trd_cur_upri);
				addColumnPathMap(MST_BILL_SEND_IF_R.$trd_cur_amt,
						Bill_Send01_HdrDtlBaseR.$trd_cur_amt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$trd_cur_dscnt_amt,
						Bill_Send01_HdrDtlBaseR.$trd_cur_dscnt_amt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_cd,
						Bill_Send01_HdrDtlBaseR.$tax_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$if_tax_cd,
						Bill_Send01_HdrDtlBaseR.$if_tax_cd);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_nm,
						Bill_Send01_HdrDtlBaseR.$tax_nm);
				addColumnPathMap(MST_BILL_SEND_IF_R.$tax_rate,
						Bill_Send01_HdrDtlBaseR.$tax_rate);
				addColumnPathMap(MST_BILL_SEND_IF_R.$inc_tax_flg,
						Bill_Send01_HdrDtlBaseR.$inc_tax_flg);
				addColumnPathMap(MST_BILL_SEND_IF_R.$trd_cur_tax_amt,
						Bill_Send01_HdrDtlBaseR.$trd_cur_tax_amt);
				addColumnPathMap(MST_BILL_SEND_IF_R.$trd_d_rmrks,
						Bill_Send01_HdrDtlBaseR.$trd_d_rmrks);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.addBooleanColumn(MAM_EXT_SYS_R.$null_val_if_flg,
						src.null_val_if_flg());
			}
		}

		/**
		 * 送受信ＩＦ制御を実行する。
		 */
		protected void callSendRecvIfCtrl(MCList<MST_BILL_SEND_IF_R> billSendIfL) {
			
			if (billSendIfL.size() == 0) {
				return;
			}
			
			mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.Ins01 ope = mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl.crtIns01();
			addAll(ope.up0(), 
					billSendIfL.groupBy(MST_BILL_SEND_IF_R.$data_no, MST_BILL_SEND_IF_R.$ext_sys_cd), 
					createMap_MST_BILL_SEND_IF_R());
			
			ope.exec();
		}
		
		/**
		 * 送受信ＩＦのマッパー。
		 */
		protected Map_MST_BILL_SEND_IF_R<DtlR,MST_BILL_SEND_IF_R> createMap_MST_BILL_SEND_IF_R() {
			return new Map_MST_BILL_SEND_IF_R<DtlR, MST_BILL_SEND_IF_R>();
		}

		public class Map_MST_BILL_SEND_IF_R<D extends DtlR, S extends MST_BILL_SEND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_no, MST_BILL_SEND_IF_R.$data_no);
				addColumnPathMap(DtlR.$ext_sys_cd, MST_BILL_SEND_IF_R.$ext_sys_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.if_proc_typ(MAC_IF_PROC_TYP.BILL_SEND.value());
			}
		}
		
	}

	/**
	 * 前受金が発生する取引かどうか判断する。
	 * 
	 * @param trdTyp 取引区分
	 * @return 前受金発生の取引の場合にtrue
	 */
	protected boolean isAdvTrdTyp(String trdTyp) {
		return MAC_TRD_PTN_TYP.isRCV_ADV(trdTyp)
				|| MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(trdTyp)
				|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(trdTyp);
	}

	/**
	 * 残高振替の取引かどうかを判断する。
	 * 
	 * @param trdTyp 取引区分
	 * @return 残高振替の取引の場合にtrue
	 */
	protected boolean isArswTrdTyp(String trdTyp) {
		return MAC_TRD_PTN_TYP.isARSW_IN_BILL_BAL(trdTyp)
				|| MAC_TRD_PTN_TYP.isARSW_OUT_BILL_BAL(trdTyp);
	}

	/**
	 * 受払と債権にかかわる請求書ヘッダー＆明細ベースリストに絞り込み。
	 * (請求書ヘッダーのみで明細がない条件も含める)
	 *
	 * @return 受払に関わる請求明細
	 */
	protected void getIoAndArBillL() {

		MCList<Bill_Send01_HdrDtlBaseR> billSendHdrDtlL = MCList
				.create(Bill_Send01_HdrDtlBaseR.class);

		for (Bill_Send01_HdrDtlBaseR dtlBaseR : _billHdrDtlBaseL) {
			if (MAC_AR_TRD_GRP_TYP.isSLS(dtlBaseR.ar_trd_grp_typ())
					|| MAC_AR_TRD_GRP_TYP.isSLS_RTN(dtlBaseR.ar_trd_grp_typ())
					|| MAC_AR_TRD_GRP_TYP.isSLS_DSCNT(dtlBaseR.ar_trd_grp_typ())
					|| MAC_AR_TRD_GRP_TYP.isTAX_DIFF(dtlBaseR.ar_trd_grp_typ())) {

				billSendHdrDtlL.add(dtlBaseR);
			}
			else if (MAC_AR_TRD_GRP_TYP.isRCV(dtlBaseR.ar_trd_grp_typ())
					|| MAC_AR_TRD_GRP_TYP.isSETOFF(dtlBaseR.ar_trd_grp_typ())
					|| MAC_AR_TRD_GRP_TYP.isARSW(dtlBaseR.ar_trd_grp_typ())) {

				if (!isBfwBalDisp(dtlBaseR)) {
					if (isArswTrdTyp(dtlBaseR.trd_ptn_typ())) {
						billSendHdrDtlL.add(dtlBaseR);
					}
					else if (isAdvTrdTyp(dtlBaseR.trd_ptn_typ())
							&& isBfwBalDispHdr(dtlBaseR)) {
								billSendHdrDtlL.add(dtlBaseR);
							}
				}
				else {
					billSendHdrDtlL.add(dtlBaseR);
				}
			}
			else if (isNull(dtlBaseR.ar_trd_grp_typ()) && MAC_STR.isNULL_VAL(dtlBaseR.bill_d_no())) {
				billSendHdrDtlL.add(dtlBaseR);
			}
		}
		_billHdrDtlBaseL = billSendHdrDtlL;
	}

	/**
	 * 繰越金額を表示するかどうかを判断する。
	 * 
	 * @param dtlBaseR
	 * @return 繰越金額を表示する場合はtrue
	 */
	protected boolean isBfwBalDisp(Bill_Send01_HdrDtlBaseR dtlBaseR) {
		if (!isBfwBalDispHdr(dtlBaseR)) {
			return false;
		}
		if (dtlBaseR.last_bill_amt().isZero()) {

			MCList<Bill_Send01_HdrDtlBaseR> billMngL = _billHdrDtlBaseL.subList(
					Bill_Send01_HdrDtlBaseR.$bill_mng_no, dtlBaseR.bill_mng_no());
			MCIndexKey key = billMngL
					.createIndex(Bill_Send01_HdrDtlBaseR.$ar_trd_grp_typ);
			MCIndexKey key2 = billMngL.createIndex(Bill_Send01_HdrDtlBaseR.$trd_ptn_typ);

			MCNumber rcvAmt = sumAmt(billMngL, MAC_AR_TRD_GRP_TYP.RCV, key);
			MCNumber setoffAmt = sumAmt(billMngL, MAC_AR_TRD_GRP_TYP.SETOFF, key);
			MCNumber swAmt = sumAmt(billMngL, MAC_TRD_PTN_TYP.ARSW_OUT_BILL_BAL, key2)
					.add(sumAmt(billMngL, MAC_TRD_PTN_TYP.ARSW_OUT_NOT_BILL_BAL, key2));

			if (rcvAmt.add(setoffAmt).isZero() && swAmt.isZero()) {
				return false;
			}
		}

		return true;
	}

	/**
	 * ヘッダ情報の請求書前月残高表示ＦＬＧか都度請求ＦＬＧで繰越金額を表示するか判断する。
	 * 
	 * @param dtlBaseR
	 * @return 請求書前月残高表示ＦＬＧがオンかつ都度請求ではない場合はtrue
	 */
	protected boolean isBfwBalDispHdr(Bill_Send01_HdrDtlBaseR dtlBaseR) {
		if (!dtlBaseR.bfw_bal_disp_flg() || dtlBaseR.bill_each_sls_flg()) {
			return false;
		}
		return true;
	}

	/**
	 * 債権取引グループ区分に応じて金額を合計する。
	 * 
	 * @param billDtlL 請求明細
	 * @param grpTyp 債権取引グループ区分
	 * @param idxkey インデックスキー
	 * @return 合計金額
	 */
	protected MCNumber sumAmt(MCList<Bill_Send01_HdrDtlBaseR> billDtlBaseL,
			MAC_AR_TRD_GRP_TYP grpTyp, MCIndexKey idxkey) {
		if (billDtlBaseL.isEmpty()) {
			return MCNumber.ZERO;
		}
		MCNumber amt = billDtlBaseL.subList(idxkey, grpTyp.value())
				.sum(Bill_Send01_HdrDtlBaseR.$trd_cur_amt);
		return nvl(amt, MCNumber.ZERO);
	}

	/**
	 * 取引パタン区分に応じて金額を合計する。
	 * 
	 * @param billDtlL 請求明細
	 * @param trdPtnTyp 取引パタン区分
	 * @param idxkey インデックスキー
	 * @return 合計金額
	 */
	protected MCNumber sumAmt(MCList<Bill_Send01_HdrDtlBaseR> billDtlBaseL,
			MAC_TRD_PTN_TYP trdPtnTyp, MCIndexKey idxkey) {
		if (billDtlBaseL.isEmpty()) {
			return MCNumber.ZERO;
		}
		MCNumber amt = billDtlBaseL.subList(idxkey, trdPtnTyp.value())
				.sum(Bill_Send01_HdrDtlBaseR.$trd_cur_amt);
		return nvl(amt, MCNumber.ZERO);
	}

	/**
	 * 指定されたカラムと行番号で連番のカラム名を返す。
	 * 
	 * @param columnNm カラム名
	 * @param no 連番
	 * @return カラム名の下一桁を除いて、連番を連結して文字列
	 */
	protected String getColumnNmByRowCnt(String columnNm, int no) {
		if (columnNm != null && 0 < columnNm.length()) {
			columnNm = columnNm.substring(0, columnNm.length() - 1)
					.concat(String.valueOf(no));
		}
		return columnNm;
	}

	/**
	 * 請求締年月日を元に請求期間開始日と請求期間終了日を算出し設定する。
	 * @param billHdrR 請求ヘッダー
	 */
	protected void setStartEndDate(Bill_Send01_HdrDtlBaseR r) {
		Calendar clDateCal = Calendar.getInstance();
		clDateCal.set(r.bill_cl_dt().getYear(), r.bill_cl_dt().getMonth() - 1,
				r.bill_cl_dt().getDay(), 0, 0, 0);
		
		int maxDay = clDateCal.getActualMaximum(Calendar.DATE);

		List<Integer> clDayList = new ArrayList<>();
		if (!isNull(r.bill_cl_day1())) clDayList.add(r.bill_cl_day1().intValue());
		if (!isNull(r.bill_cl_day2())) clDayList.add(r.bill_cl_day2().intValue());
		if (!isNull(r.bill_cl_day3())) clDayList.add(r.bill_cl_day3().intValue());
		if (!isNull(r.bill_cl_day4())) clDayList.add(r.bill_cl_day4().intValue());
		if (!isNull(r.bill_cl_day5())) clDayList.add(r.bill_cl_day5().intValue());

		if (clDayList.size() > 0) {
			Collections.sort(clDayList);
			Collections.reverse(clDayList);

			Integer revDay = null;
			for (int clDay : clDayList) {
				
				if (clDay == 99) {
					clDay = maxDay;
				}
				
				if (clDay < r.bill_cl_dt().getDay()) {
					clDateCal.set(Calendar.DATE, clDay + 1);
					revDay = clDay;
					break;
				}
			}
			if (revDay == null) {
				clDateCal.add(Calendar.MONTH, -1);
				if (clDayList.get(0) == 99) {
					clDateCal.set(Calendar.DATE, clDateCal.getActualMaximum(Calendar.DATE) + 1);
				}
				else {
					
					if (clDayList.get(0) > clDateCal.getActualMaximum(Calendar.DATE)) {
						clDateCal.set(Calendar.DATE, clDateCal.getActualMaximum(Calendar.DATE) + 1);
					}
					else {
						clDateCal.set(Calendar.DATE, clDayList.get(0) + 1);
					}
				}
				
			}

			MCDate fromDate = MCDate.valueOf(clDateCal.getTime());
			r.bill_st_dt(fromDate);
		}
		else {
			r.bill_st_dt(r.bill_cl_dt());
		}

		r.bill_end_dt(r.bill_cl_dt());
	}

	/***
	 * 添付帳票登録サービスを呼び出す。
	 */
	protected void registAttachedFormSrv(MCList<MST_BILL_SEND_IF_R> billSendIfL) {

		MBBCL_AttachService.Attach_Upd01 opAttc = MBBCL_AttachService.crtAttach_Upd01();
		MBBCL_AttachService.Attach_Del01 opAttcDel = MBBCL_AttachService.crtAttach_Del01();
		opAttc.up1().upd_cntr_chk_flg(false);
		
		MCGroupByPolicy policy = new MCGroupByPolicy(Bill_Send01_HdrDtlBaseR.$bill_mng_no, Bill_Send01_HdrDtlBaseR.$bill_no);
		MCList<Bill_Send01_HdrDtlBaseR> regGrpL = _billHdrDtlBaseL.groupBy(policy);

		MCIndexKey idxkey = _billHdrDtlBaseL.createIndex(Bill_Send01_HdrDtlBaseR.$bill_mng_no, Bill_Send01_HdrDtlBaseR.$bill_no);
		MCIndexKey idxkey2 = billSendIfL.createIndex(MST_BILL_SEND_IF_R.$bill_no);
		MCIndexKey idxkey3 = billSendIfL.createIndex(MST_BILL_SEND_IF_R.$bill_no, MST_BILL_SEND_IF_R.$data_crud_typ);

		if (_billPrintFlg) {
			for (Bill_Send01_HdrDtlBaseR r : regGrpL) {
				Attach_Chk01_DtlR up = Attach_Chk01_DtlR.create();
				Bill_Send01_HdrDtlBaseR firstR = _billHdrDtlBaseL.getFirst(idxkey, r.bill_mng_no(), r.bill_no());

				if (_billClCanFlg) {

					Attach_Chk02_DtlR attcUp = Attach_Chk02_DtlR.create();
					attcUp.biz_typ(MAC_BIZ_TYP.BILL_EDI.value());
					attcUp.report_id("MSLAR2410");
					attcUp.biz_key1(firstR.bill_no());
					attcUp.biz_key2(firstR.bill_rev().toString());
					opAttcDel.up0().add(attcUp);

					up.biz_typ(MAC_BIZ_TYP.BILL_EDI.value());
					up.biz_key1(firstR.bill_no());
					up.biz_key2(firstR.bill_rev().toString());
					up.dt(firstR.bill_dt());
					up.bp_cd(firstR.bcst_cd());
					up.amt(0);
					up.cur_cd(firstR.trd_cur_cd());
					up.wg_cd(firstR.wg_cd());
					up.bill_dpt_cd(firstR.bill_dpt_cd());
					up.wrk_no(firstR.wrk_no());
					up.report_id("MSLAR2410");
					up.if_proc_typ(MAC_IF_PROC_TYP.BILL_SEND.value());
					opAttc.up0().add(up);

					MCList<MST_BILL_SEND_IF_R> datalnoL = billSendIfL.subList(idxkey2, firstR.bill_no());
					for (MST_BILL_SEND_IF_R sr : datalnoL) {
						Attach_Upd01_Dtl2R  up2 = Attach_Upd01_Dtl2R.create();
						up2.biz_typ(MAC_BIZ_TYP.BILL_EDI.value());
						up2.biz_key1(firstR.bill_no());
						up2.biz_key2(firstR.bill_rev().toString());
						up2.report_id("MSLAR2410");
						up2.data_lno(sr.data_lno());
						opAttc.up2().add(up2);
					}
				}
				else {
					up.biz_typ(MAC_BIZ_TYP.BILL_EDI.value());
					up.biz_key1(firstR.bill_no());
					up.biz_key2(firstR.bill_rev().toString());
					up.dt(firstR.bill_dt());
					up.bp_cd(firstR.bcst_cd());
					up.amt(firstR.bill_amt());
					up.cur_cd(firstR.trd_cur_cd());
					up.wg_cd(firstR.wg_cd());
					up.bill_dpt_cd(firstR.bill_dpt_cd());
					up.wrk_no(firstR.wrk_no());
					up.report_id("MSLAR2410");
					up.if_proc_typ(MAC_IF_PROC_TYP.BILL_SEND.value());
					opAttc.up0().add(up);

					MCList<MST_BILL_SEND_IF_R> datalnoL = billSendIfL.subList(idxkey2, firstR.bill_no());
					for (MST_BILL_SEND_IF_R sr : datalnoL) {
						Attach_Upd01_Dtl2R  up2 = Attach_Upd01_Dtl2R .create();
						up2.biz_typ(MAC_BIZ_TYP.BILL_EDI.value());
						up2.biz_key1(firstR.bill_no());
						up2.biz_key2(firstR.bill_rev().toString());
						up2.report_id("MSLAR2410");
						up2.data_lno(sr.data_lno());
						opAttc.up2().add(up2);
					}
				}
			}
		}
		
		if (!_billPrintFlg) {
			for (Bill_Send01_HdrDtlBaseR r : regGrpL) {

				MCList<MST_BILL_SEND_IF_R> delBefL = billSendIfL.subList(idxkey2, r.bill_no());
				MCList<MST_BILL_SEND_IF_R> delAftL = billSendIfL.subList(idxkey3, r.bill_no(), MAC_DATA_CRUD_TYP.DEL.value());

				if (delBefL.size() == delAftL.size()) {
					Attach_Chk02_DtlR attcUp = Attach_Chk02_DtlR.create();
					attcUp.biz_typ(MAC_BIZ_TYP.DLV_SLIP_SLS_EDI.value());
					attcUp.report_id("MSLAR2410");
					attcUp.biz_key1(r.bill_no());
					attcUp.biz_key2(r.dlv_slip_rev().toString());
					opAttcDel.up0().add(attcUp);
				}
			}

			for (Bill_Send01_HdrDtlBaseR r : regGrpL) {

				Bill_Send01_HdrDtlBaseR firstR = _billHdrDtlBaseL.getFirst(idxkey, r.bill_mng_no(), r.bill_no());
				MCList<MST_BILL_SEND_IF_R> datalnoL = billSendIfL.subList(idxkey2, firstR.bill_no());
				
				for (MST_BILL_SEND_IF_R sr : datalnoL) {
					Attach_Upd01_Dtl2R up2 = Attach_Upd01_Dtl2R.create();
					up2.biz_typ(MAC_BIZ_TYP.DLV_SLIP_SLS_EDI.value());
					up2.biz_key1(firstR.bill_no());
					up2.biz_key2(firstR.dlv_slip_rev().toString());
					up2.report_id("MSLAR2410");
					up2.data_lno(sr.data_lno());
					opAttc.up2().add(up2);
				}

				Attach_Chk01_DtlR up = Attach_Chk01_DtlR.create();
				up.biz_typ(MAC_BIZ_TYP.DLV_SLIP_SLS_EDI.value());
				up.biz_key1(firstR.bill_no());
				up.biz_key2(firstR.dlv_slip_rev().toString());
				up.dt(firstR.ship_tm());
				up.bp_cd(firstR.bcst_cd());
				up.amt(firstR.trd_cur_amt());
				up.cur_cd(firstR.trd_cur_cd());
				up.wg_cd(firstR.wg_cd());
				up.bill_dpt_cd(firstR.bill_dpt_cd());
				up.report_id("MSLAR2410");
				up.if_proc_typ(MAC_IF_PROC_TYP.BILL_SEND.value());
				opAttc.up0().add(up);
			}
		}

		if (opAttc.up0().size() > 0) {
			opAttc.exec();
		}
		if (opAttcDel.up0().size() > 0) {
			opAttcDel.exec();
		}
	}

	//FMCB CUSTOM END
}