package mcframe.serverMSBH.MSBHL5070;

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
import static mcframe.serverMSBH.MSBHL5070.Query.*;
import mcframe.serverMSBH.MSBHL5010.MSBHL_ApUtil;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_PayActIfCrtService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_PayActIfCrtService_MC extends MSBHL_PayActIfCrtService_MC_A{
	//FMCB CUSTOM START

	/**
	 * PayActIfCrt_Ins01オペレーション.<p>
	 *
	 * 支払実績、支払実績明細、為替差損益の情報をもとに支払実績ＩＦを作成する。<br>
	 */
	public class PayActIfCrt_Ins01
			extends MSBHL_PayActIfCrtService_MC_A.PayActIfCrt_Ins01 {
		
		protected MCList<PayActIfCrt_Ins01_PayActR> _payActL;
		protected MCList<PayActIfCrt_Ins01_PayActR> _payAdvActL;
		protected MCList<PayActIfCrt_Ins01_XrateRevHisR> _apXrateRevHisL;
		protected MCList<PayActIfCrt_Ins01_PayActR> _payActSwToL;
		
		protected MCIndexKey _payActLIdx;
		protected MCIndexKey _payAdvActLIdx;
		protected MCIndexKey _apXrateRevHisLIdx;
		protected MCIndexKey _payActSwToLIdx;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			write();

		}

		/**
		 * 支払実績ＩＦ書込みメイン処理
		 */
		protected void write() {

			MCList<MST_PAY_ACT_IF_R> insL = MCList.create(MST_PAY_ACT_IF_R.class);
			
			getPayActData();

			for (PayActIfCrt_Ins01_CndR r : up0()) {
				// 支払実績IFデータ作成
				if (!isNull(r.pay_act_d_no())) {
					insL.addAll(getIfDataForPayAct(r));
				}
				// 前渡金支払実績IFデータ作成
				if (!isNull(r.adv_pay_act_no())) {
					insL.addAll(getIfDataForAdvPayAct(r));
				}
				if (!isNull(r.ap_xrate_rev_his_no())) {
					insL.add(getIfDataForXrateRevHis(r));
				}
			}
			// 支払実績ＩＦに登録
			MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_PAY_ACT_IF_R.create("T"));
			dbInsert("MSBHL5070_MST_PAY_ACT_IF_I01", insL, insL_bldr);
		}
		
		/**
		 * ワークを作成し、対象の支払実績データ、前渡金支払実績データを取得する。
		 * 
		 */
		protected void getPayActData() {
			// 変数の初期化
			//　支払実績
			MCList<MST_PAY_ACT_D_R> bind = MCList.create(MST_PAY_ACT_D_R.class);
			// 前渡金支払実績
			MCList<MST_ADV_PAY_ACT_R> bindAdv = MCList.create(MST_ADV_PAY_ACT_R.class);
			// 為替レート評価替
			MCList<MST_AP_XRATE_REV_HIS_R> bindXrate = MCList.create(MST_AP_XRATE_REV_HIS_R.class);
			
			_payActL = MCList.create(PayActIfCrt_Ins01_PayActR.class);
			_payAdvActL = MCList.create(PayActIfCrt_Ins01_PayActR.class);
			_apXrateRevHisL = MCList.create(PayActIfCrt_Ins01_XrateRevHisR.class);
			_payActSwToL = MCList.create(PayActIfCrt_Ins01_PayActR.class);
			
			// ワークを作成する。
			for (PayActIfCrt_Ins01_CndR r : up0()) {
				if (!isNull(r.pay_act_d_no())) {
					MST_PAY_ACT_D_R bindR = bind.add();
					bindR.pay_act_d_no(r.pay_act_d_no());
					bindR.pay_act_d_seq(r.pay_act_d_seq());
				}
				// 前渡金支払実績IFデータ作成
				if (!isNull(r.adv_pay_act_no())) {
					MST_ADV_PAY_ACT_R bindAdvR = bindAdv.add();
					bindAdvR.adv_pay_act_no(r.adv_pay_act_no());
					bindAdvR.adv_pay_act_seq(r.adv_pay_act_seq());
				}
				if (!isNull(r.ap_xrate_rev_his_no())) {
					MST_AP_XRATE_REV_HIS_R bindR = bindXrate.add();
					bindR.ap_xrate_rev_his_no(r.ap_xrate_rev_his_no());
				}
			}
			MCQueryApiBuilder bind_bldr = MCQueryApiBuilder.create(MST_PAY_ACT_D_R.create("T"));
			dbWkDelete("MSBHL5070_MSW_PAY_ACT_D_D01", bind_bldr.getBaseDbc());
			dbWkInsert("MSBHL5070_MSW_PAY_ACT_D_I01", bind, bind_bldr.getBaseDbc());
			
			MCQueryApiBuilder bindAdv_bldr = MCQueryApiBuilder.create(MST_ADV_PAY_ACT_R.create("T"));
			dbWkDelete("MSBHL5070_MSW_ADV_PAY_ACT_D01", bindAdv_bldr.getBaseDbc());
			dbWkInsert("MSBHL5070_MSW_ADV_PAY_ACT_I01", bindAdv, bindAdv_bldr.getBaseDbc());
			
			MCQueryApiBuilder bindXrate_bldr = MCQueryApiBuilder.create(MST_AP_XRATE_REV_HIS_R.create("T"));
			dbWkDelete("MSBHL5070_MSW_AP_XRATE_REV_HIS_D01", bindXrate_bldr.getBaseDbc());
			dbWkInsert("MSBHL5070_MSW_AP_XRATE_REV_HIS_I01", bindXrate, bindXrate_bldr.getBaseDbc());
			// 対象の支払実績情報を検索
			executeQuery(_payActL, MSBHL5070_MST_PAY_ACT_D_S01());
			// 対象の前渡金支払実績情報を検索
			executeQuery(_payAdvActL, MSBHL5070_MST_ADV_PAY_ACT_S01());
			// 対象の為替レート評価替情報を検索
			executeQuery(_apXrateRevHisL, MSBHL5070_MST_AP_XRATE_REV_HIS_S01());
			// 振替元(払出)の支払実績に対応する振替先(受入)の支払実績を検索
			executeQuery(_payActSwToL, MSBHL5070_MST_PAY_ACT_D_S02());
			
			// ワーク削除
			dbWkDelete("MSBHL5070_MSW_PAY_ACT_D_D02", bind_bldr.getBaseDbc());
			dbWkDelete("MSBHL5070_MSW_ADV_PAY_ACT_D02", bindAdv_bldr.getBaseDbc());
			dbWkDelete("MSBHL5070_MSW_AP_XRATE_REV_HIS_D02", bindXrate_bldr.getBaseDbc());
			
			_payActLIdx = _payActL.createIndex(PayActIfCrt_Ins01_PayActR.$pay_act_d_no,PayActIfCrt_Ins01_PayActR.$pay_act_d_seq);
			_payAdvActLIdx = _payAdvActL.createIndex(PayActIfCrt_Ins01_PayActR.$pay_act_no,PayActIfCrt_Ins01_PayActR.$pay_act_seq);
			_apXrateRevHisLIdx = _apXrateRevHisL.createIndex(MST_AP_XRATE_REV_HIS_R.$ap_xrate_rev_his_no);
			_payActSwToLIdx = _payActSwToL.createIndex(PayActIfCrt_Ins01_PayActR.$pay_act_d_no,PayActIfCrt_Ins01_PayActR.$pay_act_d_seq);
			
		}

		/**
		 * 支払実績ＩＦ情報取得(支払)<br />
		 * 
		 * 上り電文の支払実績明細ＮＯ、支払実績明細連番をもとに<br>
		 * 支払実績ＩＦを作成して、支払実績ＩＦリストを返却する<br>
		 * 支払実績には支払、相殺、手数料がそれぞれ別レコードとして登録されるため、<br>
		 * 為替差損益を除き、支払実績明細1件に対し、支払実績ＩＦデータ1件作成する。<br>
		 * 
		 * @param r 上り電文
		 * @return 登録対象の支払実績ＩＦ
		 */
		protected MCList<MST_PAY_ACT_IF_R> getIfDataForPayAct(
				PayActIfCrt_Ins01_CndR r) {
			MCList<MST_PAY_ACT_IF_R> payActIfL = MCList
					.create(MST_PAY_ACT_IF_R.class);
			
			// 支払実績、為替差損益を取得する
			PayActIfCrt_Ins01_PayActR payActR = _payActL.getFirst(_payActLIdx, r.pay_act_d_no(), r.pay_act_d_seq());

			if (isNull(r.ref_ap_xrate_rev_his_no())) {
				if (payActR.trd_cur_amt().isZero() && payActR.base_cur_amt().isZero()) {
					// 作成しない
				}
				else if (MAC_AP_STTL_TYP.is_com_paid(payActR.ap_sttl_typ())) {
					// 手数料
					// 債務決済区分が現金(手数料)または預金(手数料)の場合に手数料のデータを作成する。
					payActIfL.add(writePayAcntComPaid(payActR, r));
				}
				else if (MAC_AP_STTL_TYP.isSETOFF(payActR.ap_sttl_typ())) {
					// 相殺
					// 債務決済区分が相殺の場合に相殺のデータを作成する。
					payActIfL.add(writePaySetoff(payActR, r));
				}
				else if (MAC_AP_STTL_TYP.isAPSW_OUT_CHK(payActR.ap_sttl_typ())
							|| MAC_AP_STTL_TYP.isAPSW_OUT_NOT_CHK(payActR.ap_sttl_typ())) {
					// 残高振替払出
					// 債務決済区分が照合済残高振替払出、未照合残高振替払出の場合にデータを作成する
					payActIfL.add(writePayApSwOut(payActR, r));
				}
				else if (MAC_AP_STTL_TYP.isAPSW_IN_CHK(payActR.ap_sttl_typ())
							|| MAC_AP_STTL_TYP.isAPSW_IN_NOT_CHK(payActR.ap_sttl_typ())) {
					// 残高振替受入
					// 作成しない
				}
				else {
					// 支払
					// 債務決済区分が現金(手数料)、預金(手数料)、相殺以外の場合にデータを作成する。
					payActIfL.add(writePay(payActR, r));
				}
			}

			// 為替差損益データ追加
			// 為替差損益のデータの作成の判断は差損益の値が0以外で判断する。
			// 0の場合は作成対象としない。
			for (PayActIfCrt_Ins01_PayActR paR : getPayActL(r)) {
				if (!paR.exc_gain_loss().isZero()) {
					payActIfL.add(writePayExcGainLoss(paR, r));
				}
			}
			return payActIfL;
		}
		protected MCList<PayActIfCrt_Ins01_PayActR> getPayActL(PayActIfCrt_Ins01_CndR r) {
			
			MCList<PayActIfCrt_Ins01_PayActR> payActL =
				_payActL.subList(_payActLIdx, r.pay_act_d_no(), r.pay_act_d_seq());
			
			if (!isNull(r.ref_ap_xrate_rev_his_no())) {
				payActL = payActL.subList(
					PayActIfCrt_Ins01_CndR.$ref_ap_xrate_rev_his_no, r.ref_ap_xrate_rev_his_no());
			}
			
			return payActL;
		}

		/**
		 * 支払実績ＩＦ情報取得(前渡金)<br />
		 * 
		 * 上り電文の前渡金支払実績ＮＯ、前渡金支払実績連番をもとに<br>
		 * 支払実績ＩＦを作成して、支払実績ＩＦリストを返却する
		 * 前渡金支払実績には、支払と手数料が1レコードで登録されるため、
		 * 前渡金支払実績1件に対し、支払実績ＩＦデータが最大2件作成する。
		 * 
		 * @param r 上り電文
		 * @return 登録対象の支払実績ＩＦ
		 */
		protected MCList<MST_PAY_ACT_IF_R> getIfDataForAdvPayAct(
				PayActIfCrt_Ins01_CndR r) {
			MCList<MST_PAY_ACT_IF_R> payActIfL = MCList
					.create(MST_PAY_ACT_IF_R.class);
			// 前渡金支払実績を取得
			PayActIfCrt_Ins01_PayActR payActR = _payAdvActL.getFirst(_payAdvActLIdx, r.adv_pay_act_no(), r.adv_pay_act_seq());

			// 前渡金支払
			payActIfL.add(writeAdvPay(payActR, r));

			if (MAC_AP_STTL_TYP.is_com_paid(payActR.com_paid_ap_sttl_typ())) {
				// 前渡金手数料
				// 手数料債務決済区分が現金(手数料)または預金(手数料)の場合に手数料のデータを作成する。
				payActIfL.add(writeAdvPayAcntComPaid(payActR, r));
			}
			else if (MAC_AP_STTL_TYP.isSETOFF(payActR.com_paid_ap_sttl_typ())) {
				// 前渡金相殺
				// 手数料債務決済区分が相殺の場合に前渡金相殺のデータを作成する。
				payActIfL.add(writeAdvPaySetoff(payActR, r));
			}
			return payActIfL;
		}

		/**
		 * 支払実績ＩＦ取得<br />
		 * 
		 * 為替レート評価替履歴、為替差損益をもとに<br>
		 * 支払実績ＩＦ情報を作成して返却する
		 * 
		 * @param r 上り電文
		 * @return 支払実績ＩＦ
		 */
		protected MST_PAY_ACT_IF_R getIfDataForXrateRevHis(PayActIfCrt_Ins01_CndR r) {
			PayActIfCrt_Ins01_XrateRevHisR xrateR = _apXrateRevHisL.getFirst(_apXrateRevHisLIdx, r.ap_xrate_rev_his_no());
			if (!xrateR.exc_gain_loss().isZero()) {
				return createWriteExcGainLossForXrateRevHis(xrateR, r);
			}
			return null;
		}

		/**
		 * 支払実績ＩＦデータ(支払)の設定<br />
		 * 
		 * @param src 設定元の支払実績情報
		 * @return 支払実績ＩＦデータ
		 */
		protected MST_PAY_ACT_IF_R writePay(PayActIfCrt_Ins01_PayActR src,
				PayActIfCrt_Ins01_CndR r) {

			// 共通処理
			MST_PAY_ACT_IF_R dest = MST_PAY_ACT_IF_R.create();
			copy(dest, src, createWritePayMapper());
			// 支払実績ＩＦデータ(支払)の設定固有処理
			if (MAC_AP_TYP.isAP(src.ap_typ())) {
				// 債務区分が買掛金の場合、会計伝票区分に支払を設定
				dest.ac_slip_typ(MAC_AC_SLIP_TYP.PAY.value());
			}
			else {
				//　債務区分が未払金の場合、会計伝票区分に支払(未払金)を設定
				dest.ac_slip_typ(MAC_AC_SLIP_TYP.XPNS_PAY.value());
			}
			//相殺関連項目をNULLにする
			dest.so_dpt_cd(null);
			dest.setoff_cd(null);
			dest.setoff_nm(null);

			// 手数料関連項目をNULL(0)にする。
			dest.base_cur_tax_amt(0);
			dest.trd_cur_tax_amt(0);
			dest.tax_cd(null);
			
			if (!MAC_AP_STTL_TYP.isNOTE(src.ap_sttl_typ())) {
				dest.note_no(null);
			}

			return dest;
		}

		/**
		 * 支払実績ＩＦデータ(手数料)の設定<br />
		 * 
		 * @param src 設定元の支払実績情報
		 * @return 支払実績ＩＦデータ
		 */
		protected MST_PAY_ACT_IF_R writePayAcntComPaid(PayActIfCrt_Ins01_PayActR src,
				PayActIfCrt_Ins01_CndR r) {

			// 共通処理
			MST_PAY_ACT_IF_R dest = MST_PAY_ACT_IF_R.create();
			copy(dest, src, createWritePayMapper());
			// 支払実績ＩＦデータ(手数料)の設定固有処理
			// 会計伝票区分に振込手数料を設定
			dest.ac_slip_typ(MAC_AC_SLIP_TYP.PAY_COM_PAID.value());

			//相殺関連項目をNULLにする
			dest.so_dpt_cd(null);
			dest.setoff_cd(null);
			dest.setoff_nm(null);
			
			// 金額関連項目を設定
			dest.base_cur_amt(src.base_cur_exc_com_paid());
			dest.base_cur_tax_amt(src.base_cur_tax_amt());
			
			dest.trd_cur_amt(src.trd_cur_exc_com_paid());
			dest.trd_cur_tax_amt(src.trd_cur_tax_amt());

			// 手形項目をNULLにする。
			dest.note_no(null);
			
			return dest;
		}

		/**
		 * 支払実績ＩＦデータ(相殺)の設定<br />
		 * 
		 * @param src 設定元の支払実績情報
		 * @return 支払実績ＩＦデータ
		 */
		protected MST_PAY_ACT_IF_R writePaySetoff(PayActIfCrt_Ins01_PayActR src,
				PayActIfCrt_Ins01_CndR r) {

			// 共通処理
			MST_PAY_ACT_IF_R dest = MST_PAY_ACT_IF_R.create();
			copy(dest, src, createWritePayMapper());
			// 支払実績ＩＦデータ(相殺)の設定固有処理
			if (MAC_AP_TYP.isAP(src.ap_typ())) {
				// 債務区分が買掛金の場合、会計伝票区分に支払を設定
				dest.ac_slip_typ(MAC_AC_SLIP_TYP.PAY.value());
			}
			else {
				//　債務区分が未払金の場合、会計伝票区分に支払(未払金)を設定
				dest.ac_slip_typ(MAC_AC_SLIP_TYP.XPNS_PAY.value());
			}
			// 手数料関連項目を設定
			if (isNull(src.tax_cd())) {
				dest.base_cur_tax_amt(0);
				dest.trd_cur_tax_amt(0);
			}
			else {
				dest.base_cur_amt(src.base_cur_exc_com_paid());
				dest.base_cur_tax_amt(src.base_cur_tax_amt());

				dest.trd_cur_amt(src.trd_cur_exc_com_paid());
				dest.trd_cur_tax_amt(src.trd_cur_tax_amt());
			}
			
			// 手形項目をNULLにする。
			dest.note_no(null);

			return dest;
		}

		/**
		 * 支払実績ＩＦデータ(為替差損益)の設定<br />
		 * 
		 * @param src 設定元の支払実績情報
		 * @return 支払実績ＩＦデータ
		 */
		protected MST_PAY_ACT_IF_R writePayExcGainLoss(PayActIfCrt_Ins01_PayActR src,
				PayActIfCrt_Ins01_CndR r) {

			// 共通処理
			MST_PAY_ACT_IF_R dest = MST_PAY_ACT_IF_R.create();
			copy(dest, src, createWritePayMapper());
			// 支払実績ＩＦデータ(為替差損益)の設定固有処理
			if (src.exc_gain_loss().isPositive()) {
				// 為替差損益で益
				if (MAC_AP_TYP.isAP(src.ap_typ())) {
					// 債務区分が買掛金
					if (MAC_SLIP_STS_TYP.isCAN(src.slip_sts_typ())) {
						// 会計伝票区分に為替差損(債務消込)
						dest.ac_slip_typ(MAC_AC_SLIP_TYP.AP_EX_LOSS_APPL.value());
					}
					else {
						// 会計伝票区分に為替差益(債務消込)
						dest.ac_slip_typ(MAC_AC_SLIP_TYP.AP_EX_GAIN_APPL.value());
					}
				}
				else {
					// 債務区分が未払金
					if (MAC_SLIP_STS_TYP.isCAN(src.slip_sts_typ())) {
						// 会計伝票区分に為替差損(未払金消込)
						dest.ac_slip_typ(MAC_AC_SLIP_TYP.AE_EX_LOSS_APPL.value());
					}
					else {
						// 会計伝票区分に為替差益(未払金消込)
						dest.ac_slip_typ(MAC_AC_SLIP_TYP.AE_EX_GAIN_APPL.value());
					}
				}

			}
			else {
				// 為替差損益で損
				if (MAC_AP_TYP.isAP(src.ap_typ())) {
					// 債務区分が買掛金
					if (MAC_SLIP_STS_TYP.isCAN(src.slip_sts_typ())) {
						// 会計伝票区分に為替差益(債務消込)
						dest.ac_slip_typ(MAC_AC_SLIP_TYP.AP_EX_GAIN_APPL.value());
					}
					else {
						// 会計伝票区分に為替差損(債務消込)
						dest.ac_slip_typ(MAC_AC_SLIP_TYP.AP_EX_LOSS_APPL.value());
					}
				}
				else {
					// 債務区分が未払金
					if (MAC_SLIP_STS_TYP.isCAN(src.slip_sts_typ())) {
						// 会計伝票区分に為替差益(未払金消込)
						dest.ac_slip_typ(MAC_AC_SLIP_TYP.AE_EX_GAIN_APPL.value());
					}
					else {
						// 会計伝票区分に為替差損(未払金消込)
						dest.ac_slip_typ(MAC_AC_SLIP_TYP.AE_EX_LOSS_APPL.value());
					}
				}

			}
			// 金額関連項目を設定
			dest.base_cur_amt(src.exc_gain_loss());
			dest.trd_cur_amt(0);

			//相殺関連項目をNULLにする
			dest.so_dpt_cd(null);
			dest.setoff_cd(null);
			dest.setoff_nm(null);

			// 手数料関連項目をNULL(0)にする。
			dest.base_cur_tax_amt(0);
			dest.trd_cur_tax_amt(0);
			dest.tax_cd(null);

			return dest;
		}

		/**
		 * 支払実績ＩＦデータ(為替差損益 評価替)の設定<br />
		 * 
		 * @param src 設定元の支払実績情報
		 * @return 支払実績ＩＦデータ
		 */
		protected MST_PAY_ACT_IF_R createWriteExcGainLossForXrateRevHis(PayActIfCrt_Ins01_XrateRevHisR src,
				PayActIfCrt_Ins01_CndR r) {
			
			MST_PAY_ACT_IF_R dest = MST_PAY_ACT_IF_R.create();
			dest.pay_act_if_no(getStrSeq(MSC_NUM_SYS_TYP.PAYACTIF));
			dest.wg_cd(src.wg_cd());
			dest.ac_ym(src.ac_ym());
			dest.ac_dt(src.ac_dt());
			dest.pay_act_no(MAC_STR.NULL_VAL.value());
			dest.pay_act_seq(1);
			dest.pay_act_rev(1);
			dest.pay_act_d_no(src.ap_xrate_rev_his_no());
			dest.can_flg(false);
			
			if (src.exc_gain_loss().isPositive()) {
				if (MAC_AP_TYP.isAP(src.ap_typ())) {
					dest.ac_slip_typ(MAC_AC_SLIP_TYP.AP_EX_GAIN_REV.value());
				}
				else {
					dest.ac_slip_typ(MAC_AC_SLIP_TYP.AE_EX_GAIN_REV.value());
				}
			}
			else {
				if (MAC_AP_TYP.isAP(src.ap_typ())) {
					dest.ac_slip_typ(MAC_AC_SLIP_TYP.AP_EX_LOSS_REV.value());
				}
				else {
					dest.ac_slip_typ(MAC_AC_SLIP_TYP.AE_EX_LOSS_REV.value());
				}
			}
			dest.ap_dpt_cd(src.ap_dpt_cd());
			dest.asppl_cd(src.asppl_cd());
			dest.foreign_flg(MSBHL_ApUtil.isForeign(src.asppl_cd()));
			
			dest.base_cur_cd(src.base_cur_cd());
			dest.base_cur_amt(src.exc_gain_loss());
			dest.base_cur_tax_amt(0);
			dest.trd_cur_cd(src.trd_cur_cd());
			dest.trd_cur_amt(0);
			dest.trd_cur_tax_amt(0);

			dest.xrate_cd(src.xrate_cd());
			dest.xrate(src.xrate());

			dest.wrk_no(src.wrk_no());
			dest.a_imp_flg(false);

			return dest;
		}

		/**
		 * 支払実績ＩＦデータ(前渡金支払)の設定<br />
		 * 
		 * @param src 設定元の支払実績情報
		 * @return 支払実績ＩＦデータ
		 */
		protected MST_PAY_ACT_IF_R writeAdvPay(PayActIfCrt_Ins01_PayActR src,
				PayActIfCrt_Ins01_CndR r) {

			// 共通処理
			MST_PAY_ACT_IF_R dest = MST_PAY_ACT_IF_R.create();
			copy(dest, src, createWritePayMapper());
			// 支払実績ＩＦデータ(前渡登録)の設定固有処理
			// 会計伝票区分を前渡金に設定
			dest.ac_slip_typ(MAC_AC_SLIP_TYP.ADV_PAY.value());

			// 買掛先をNULLにする
			dest.asppl_cd(null);

			//　明細が無いので明細NO関連項目をNULLにする
			dest.pay_act_d_no(null);
			dest.pay_act_d_seq(null);

			//相殺関連項目をNULLにする
			dest.so_dpt_cd(null);
			dest.setoff_cd(null);
			dest.setoff_nm(null);

			// 手数料関連項目をNULL(0)にする。
			dest.base_cur_tax_amt(0);
			dest.trd_cur_tax_amt(0);
			dest.tax_cd(null);

			return dest;
		}

		/**
		 * 支払実績ＩＦデータ(前渡金相殺)の設定<br />
		 * （相手負担手数料）
		 * 
		 * @param src 設定元の支払実績情報
		 * @return 支払実績ＩＦデータ
		 */
		protected MST_PAY_ACT_IF_R writeAdvPaySetoff(PayActIfCrt_Ins01_PayActR src,
				PayActIfCrt_Ins01_CndR r) {

			// 共通処理
			MST_PAY_ACT_IF_R dest = MST_PAY_ACT_IF_R.create();
			copy(dest, src, createWritePayMapper());
			// 支払実績ＩＦデータ(前渡登録)の設定固有処理
			// 会計伝票区分を前渡金に設定
			dest.ac_slip_typ(MAC_AC_SLIP_TYP.ADV_PAY.value());

			// IFテーブルの会計理由コードに手数料会計理由コードにする。
			dest.ac_rsn_cd(src.com_paid_ac_rsn_cd());

			// 買掛先をNULLにする
			dest.asppl_cd(null);

			//　明細が無いので明細NO関連項目をNULLにする
			dest.pay_act_d_no(null);
			dest.pay_act_d_seq(null);

			//相殺関連項目をNULLにする
			dest.so_dpt_cd(null);
			dest.setoff_cd(null);
			dest.setoff_nm(null);
		
			// 金額関連項目を設定
			dest.base_cur_amt(src.base_cur_com_paid());
			dest.trd_cur_amt(src.trd_cur_com_paid());
			dest.base_cur_tax_amt(0);
			dest.trd_cur_tax_amt(0);
			dest.tax_cd(null);
			
			// 手形項目をNULLにする。
			dest.note_no(null);

			return dest;
		}

		/**
		 * 支払実績ＩＦデータ(前渡金手数料)の設定<br />
		 * （自社負担手数料）
		 * 
		 * @param src 設定元の支払実績情報
		 * @return 支払実績ＩＦデータ
		 */
		protected MST_PAY_ACT_IF_R writeAdvPayAcntComPaid(PayActIfCrt_Ins01_PayActR src,
				PayActIfCrt_Ins01_CndR r) {

			// 共通処理
			MST_PAY_ACT_IF_R dest = MST_PAY_ACT_IF_R.create();
			copy(dest, src, createWritePayMapper());
			// 支払実績ＩＦデータ(前渡金手数料)の設定固有処理
			// 会計伝票区分を振込手数料に設定
			dest.ac_slip_typ(MAC_AC_SLIP_TYP.PAY_COM_PAID.value());

			// IFテーブルの会計理由コードに手数料会計理由コードにする。
			dest.ac_rsn_cd(src.com_paid_ac_rsn_cd());

			// 買掛先をNULLにする
			dest.asppl_cd(null);

			//　明細が無いので明細NO関連項目をNULLにする
			dest.pay_act_d_no(null);
			dest.pay_act_d_seq(null);

			//相殺関連項目をNULLにする
			dest.so_dpt_cd(null);
			dest.setoff_cd(null);
			dest.setoff_nm(null);
			
			// 金額関連項目を設定
			dest.base_cur_amt(src.base_cur_exc_com_paid());
			dest.trd_cur_amt(src.trd_cur_exc_com_paid());
			
			// 手形項目をNULLにする。
			dest.note_no(null);

			return dest;
		}

		/**
		 * 支払実績ＩＦデータ(残高振替払出)の設定<br />
		 * 
		 * @param src 設定元の支払実績情報
		 * @return 支払実績ＩＦデータ
		 */
		protected MST_PAY_ACT_IF_R writePayApSwOut(PayActIfCrt_Ins01_PayActR src,
				PayActIfCrt_Ins01_CndR r) {

			// ベースは支払データ
			MST_PAY_ACT_IF_R dest = writePay(src, r);
			
			// 支払実績ＩＦデータ(残高振替払出)の設定固有処理
			dest.can_flg(false);
			
			// 債務決済方法に対応する会計理由を設定
			dest.ac_rsn_cd(getAcRsnCdForApSwOut(src.ap_sttl_cd()));
			
			// 相殺関連には振替先を設定
			PayActIfCrt_Ins01_PayActR swToR =
				_payActSwToL.getFirst(_payActSwToLIdx, dest.pay_act_d_no(), dest.pay_act_d_seq());
			dest.so_dpt_cd(swToR.so_dpt_cd());
			dest.setoff_cd(swToR.setoff_cd());
			dest.setoff_nm(swToR.setoff_nm());

			return dest;
		}

		/**
		 * 債務決済方法CDに対応する会計理由ＣＤを取得する	
		 */
		protected FXUCL_MCDbcCache<MAM_STTL_R> _sttlCache = null;
		protected String getAcRsnCdForApSwOut(String sttlCd) {
			if (_sttlCache == null) {
				MAM_STTL_R t = MAM_STTL_R.create();
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
				_sttlCache = new FXUCL_MCDbcCache<MAM_STTL_R>(builder);
			}
			return _sttlCache.get(sttlCd).ac_rsn_cd();
		}

		/**
		 * 支払実績ＩＦデータ設定用マッパー<br />
		 * 
		 * このマッパーはMST_PAY_ACT_IF_R（テーブル）とPayActIfCrt_Ins01_PayActR(検索結果)のマッパーのため
		 * 検索結果の項目名=テーブルの項目名を想定している。（そのためsetupColumnPathMapは定義しない）
		 * 
		 */
		protected MapWritePay<MST_PAY_ACT_IF_R, PayActIfCrt_Ins01_PayActR> createWritePayMapper() {
			return new MapWritePay<MST_PAY_ACT_IF_R, PayActIfCrt_Ins01_PayActR>();
		}

		public class MapWritePay<D extends MST_PAY_ACT_IF_R, S extends PayActIfCrt_Ins01_PayActR>
				extends MCRowMapper<D, S> {

			@Override
			protected void setupColumnPathMap() {
				for (String col : MST_PAY_ACT_IF_R.colnames()) {
					addColumnPathMap(col, col);
				}
			}

			@Override
			public void valueCopy(D dest, S src) {
				// 全処理共通の以下の項目のみ先に設定処理を行う(他は検索結果のコピー)
				// 支払実績IFNO、取消フラグ、国外取引フラグ、会計IF取込済フラグ

				dest.pay_act_if_no(getStrSeq(MSC_NUM_SYS_TYP.PAYACTIF));
				//　赤伝ＦＬＧを設定
				dest.can_flg(MAC_SLIP_STS_TYP.isCAN(src.slip_sts_typ()));
				// 国外取引フラグ
				dest.foreign_flg(MSBHL_ApUtil.isForeign(src.psppl_cd()));
				// 会計IF取込済ＦＬＧを設定
				dest.a_imp_flg(false);

				// 以下は標準では連携対象としないため、NULLを設定
				dest.sub_dpt_cd1(null);
				dest.sub_dpt_cd2(null);
				dest.sub_dpt_cd3(null);
				dest.sub_char1(null);
				dest.sub_char2(null);
				dest.sub_char3(null);
				dest.sub_char4(null);
				dest.sub_char5(null);
				dest.sub_char6(null);
				dest.sub_char7(null);
				dest.sub_char8(null);
				dest.sub_char9(null);
				dest.sub_char10(null);
				dest.sub_num1(null);
				dest.sub_num2(null);
				dest.sub_num3(null);
				dest.sub_dt1(null);
				dest.sub_dt2(null);
				dest.sub_dt3(null);

			}
		}
	}

	//FMCB CUSTOM END
}