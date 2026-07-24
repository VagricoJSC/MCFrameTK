package mcframe.serverMSBH.MSBHL5030;

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
import mcframe.serverMA.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBH.MSBHL5030.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.commonCore.notice.Core_Msg.*;
import mcframe.serverMSBE.MSBEL5010.IoAct_Ins01_DtlR;
import mcframe.serverMSBE.MSBEL5010.MSBEL_IoActService;
import mcframe.serverMSBG.MSBGL5080.Cred_Upd02_CndR;
import mcframe.serverMSBG.MSBGL5080.MSBGL_CredService;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.BiConsumer;

import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.commonFXUC.FXUCC0030.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheCW;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCFuncCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeTodayValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil;
import mcframe.serverMBBA.MBBAL5010.*;
import mcframe.serverMSBH.MSBHL5010.MSBHL_ApUtil;
import mcframe.serverMSBH.MSBHL5020.*;
import mcframe.serverMSBH.MSBHL5040.*;
import mcframe.serverMSBH.MSBHL5060.*;
import mcframe.serverMSBI.MSBIL5010.*;

import static mcframe.serverMSBH.MSBHL5030.Query.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.queryapi.IFMCSQL.*;

import mcframe.serverMSUC.MSUCL0130.MSUCL_AmtUtil;
import mcframe.serverMBBC.MBBCL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_PaySchdRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_PaySchdRegService_MC extends MSBHL_PaySchdRegService_MC_A{
	//FMCB CUSTOM START
	/**
	 * このクラス（スレッドセーフ対応用）
	 */
	protected static final Class<MSBHL_PaySchdRegService> CLAZZ = MSBHL_PaySchdRegService.class;

	/**
	 * PaySchd_Srch01オペレーション.<p>
	 *
	 * 支払予定制御マスタに従い金額を案分する。<br>
	 */
	public class PaySchd_Srch01 extends MSBHL_PaySchdRegService_MC_A.PaySchd_Srch01 {

		/**
		 * 本オペレーションで作成する支払予定のリスト
		 */
		protected MCList<PaySchd_Srch01_RsltR> _paySchdL;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();

			crtPaySchd();
			editPaySchd();
			groupByPaySchd();
			editPaySchdZero();

			sort();
			setDown();
		}

		@Override
		protected boolean isDelFlgCtl() {
			return true;
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
			MCList<MAM_BP_R> bpCndL = MCList.create(MAM_BP_R.class);
			for (PaySchd_Srch01_CndR r : up0()) {

				// 取引先マスタのキャッシュ対象
				for (String s : new String[]{
						PaySchd_Srch01_CndR.$sppl_cd,
						PaySchd_Srch01_CndR.$asppl_cd,
						PaySchd_Srch01_CndR.$bsppl_cd}) {
					bpCndL.add().bp_cd(r.getString(s));
				}

				// 取引通貨金額から源泉税分を減算する（源泉税分は別で支払予定を作成するので）
				r.trd_cur_amt(r.trd_cur_amt().subtract(nvl(r.wtax_amt(), MCNumber.ZERO)));

				// 都度支払の時は締年月日が設定されないので、支払起算日（もしくは計上日）で代用する
				r.bsppl_cl_dt(nvl(r.bsppl_cl_dt(), nvl(r.pay_basis_dt(), r.ac_dt())));
				r.base_dt(nvl(r.base_dt(), getToday()));
			}

			// 取引先情報をキャッシュする
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(MAM_BP_R.create("T"));
			dbSelectKey("MSBHL5030_MAM_BP_S01", bpL, bpL_bldr, bpCndL.groupBy(MAM_BP_R.$bp_cd));
			MSBHL_PaySchdRegService.setBp(bpL);

			// 品目情報をキャッシュする
			MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));
			dbSelectKey("MSBHL5030_MAM_ITM_S01", itmL, itmL_bldr, up0().groupBy( PaySchd_Srch01_CndR.$itm_cd, PaySchd_Srch01_CndR.$itm_sub1, PaySchd_Srch01_CndR.$itm_sub2, PaySchd_Srch01_CndR.$itm_sub3 ));
			MSBHL_PaySchdRegService.setItm(itmL);
			MCList<PaySchd_Srch01_CndR> itmErrL = MCList.create(PaySchd_Srch01_CndR.class);
			MCList<PaySchd_Srch01_CndR> aspplErrL = MCList.create(PaySchd_Srch01_CndR.class);
			
			for (PaySchd_Srch01_CndR r : up0()) {
				MAM_BP_R aspplR = MSBHL_PaySchdRegService.getBp(r.asppl_cd());
				if (isNull(aspplR) || aspplR.isEmpty()) {
					aspplErrL.add(r);
				}
				
				// 金額符号の調整
				MAM_ITM_R itmR = MSBHL_PaySchdRegService.getItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (isNull(itmR) || itmR.isEmpty()) {
					itmErrL.add(r);
					continue;
				}
				MCNumber pm = getAmtDispPm(r.trd_ptn_typ(), itmR.dscnt_itm_flg());
				if (!isNull(r.trd_cur_amt())) {
					r.trd_cur_amt(r.trd_cur_amt().multiply(pm));
				}
				if (!isNull(r.trd_cur_tax_amt())) {
					r.trd_cur_tax_amt(r.trd_cur_tax_amt().multiply(pm));
				}
				if (!isNull(r.wtax_amt())) {
					r.wtax_amt(r.wtax_amt().multiply(pm));
				}
			}
			// hdr_peg_no単位で、エラーメッセージをセットする
			if (!itmErrL.isEmpty()) {
				for (MCList<PaySchd_Srch01_CndR> grpL : itmErrL.groupList(PaySchd_Srch01_CndR.$hdr_peg_no)) {
					PaySchd_Srch01_CndR causerow = grpL.get(0);
					for (PaySchd_Srch01_CndR r : grpL.distinctNE("itm_cd", "itm_sub1", "itm_sub2", "itm_sub3")) {
						MCMessagePool.add(causerow, null, MAUAL0189,
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
								toDispGUIIndex(MCRow.create()));
						causerow.err_flg(true);
					}
				}
			}
			if (!aspplErrL.isEmpty()) {
				for (MCList<PaySchd_Srch01_CndR> grpL : aspplErrL.groupList(PaySchd_Srch01_CndR.$hdr_peg_no)) {
					PaySchd_Srch01_CndR causerow = grpL.get(0);
					for (PaySchd_Srch01_CndR r : grpL.distinctNE("asppl_cd")) {
						MCMessagePool.add(causerow, null, MAUAL0117, r.asppl_cd());
						causerow.err_flg(true);
					}
				}
			}
			// 初期化
			_paySchdL = MCList.create(PaySchd_Srch01_RsltR.class);
		}

		/**
		 * 支払予定を作成する
		 */
		protected void crtPaySchd() {

			for (MCList<PaySchd_Srch01_CndR> grpL : up0().groupList(PaySchd_Srch01_CndR.$hdr_peg_no)) {
				// hdr_peg_no単位で全件をエラーにする
				if (!isNull(grpL.getFirst(PaySchd_Srch01_CndR.$err_flg, true))) {
					grpL.forEach(r->r.err_flg(true));
					continue;
				}
				// 締めごとの金額（をもとに支払予定制御マスタを参照する）
				MCNumber sumAmt = sum(
					grpL.sum(PaySchd_Srch01_CndR.$trd_cur_amt),
					grpL.sum(PaySchd_Srch01_CndR.$trd_cur_tax_amt)
				);
				
				// 上り電文の買掛明細をまとめて支払予定を取得
				String[] key = {
					PaySchd_Srch01_CndR.$asppl_cd,
					PaySchd_Srch01_CndR.$bsppl_cd,
					PaySchd_Srch01_CndR.$bsppl_dpt_cd,
					PaySchd_Srch01_CndR.$ap_dpt_cd,
					PaySchd_Srch01_CndR.$trd_cur_cd,
					PaySchd_Srch01_CndR.$pay_schd_dt,
					PaySchd_Srch01_CndR.$bsppl_cl_dt,
					PaySchd_Srch01_CndR.$ap_typ,
					PaySchd_Srch01_CndR.$is_ref_xrate,
					PaySchd_Srch01_CndR.$base_dt
				};
				for (MCList<PaySchd_Srch01_CndR> upL : grpL.groupList(key)) {
					PaySchd_Srch01_CndR upR = upL.get(0).clone();
					upR.trd_cur_amt(upL.sum(PaySchd_Srch01_CndR.$trd_cur_amt));
					upR.trd_cur_tax_amt(upL.sum(PaySchd_Srch01_CndR.$trd_cur_tax_amt));
					upR.wtax_amt(upL.sum(PaySchd_Srch01_CndR.$wtax_amt));

					try {
						_paySchdL.addAll(crtPaySchd(upR, sumAmt));
					}
					catch (MCAppException ex) {
						// マスタ不備（支払予定制御マスタが未登録、決済方法マスタに源泉税がない）
						upL.forEach(r->r.err_flg(true));
						MCMessagePool.add(
							new MCMessage(upR, ex.getCauseColumn(), ex.getID(), (Object[])ex.getBindArray())
						);
						break;
					}
				}
			}
		}
		protected MCList<PaySchd_Srch01_RsltR> crtPaySchd(PaySchd_Srch01_CndR upR, MCNumber sumAmt) {
			MCList<PaySchd_Srch01_RsltR> paySchdL = MCList.create(PaySchd_Srch01_RsltR.class);

			MCList<MST_PAY_SCHD_R> paySchdBaseL = MCList.create(MST_PAY_SCHD_R.class);
			paySchdBaseL.addAll(getPaySchd(upR, sumAmt));
			paySchdBaseL.addAll(getPaySchdWtax(upR));

			for (MST_PAY_SCHD_R psR : paySchdBaseL) {
				PaySchd_Srch01_RsltR r = paySchdL.add();
				r.hdr_peg_no(upR.hdr_peg_no());
				r.setNumberNE(MAM_PAY_SCHD_CTL_R.$min_amt, psR.getNumber(MAM_PAY_SCHD_CTL_R.$min_amt));	// 支払予定日取得で使用
				r.pay_schd(psR);

				MAM_BP_R bspplR = MSBHL_PaySchdRegService.getBp(upR.bsppl_cd());
				r.ap_d_no(upR.ap_d_no());
				r.asppl_cd(upR.asppl_cd());
				r.asppl_nm(MSBHL_PaySchdRegService.getBp(upR.asppl_cd()).bp_nm());
				r.ap_dpt_cd(upR.ap_dpt_cd());
				r.ap_typ(upR.ap_typ());

				MAM_STTL_R sttlR = MSBHL_PaySchdRegService.getApSttl(r.ap_sttl_cd());
				r.ap_sttl_nm(sttlR.sttl_nm());
				r.ap_sttl_typ(sttlR.ap_sttl_typ());
				r.ap_setoff_act_flg(sttlR.ap_setoff_act_flg());
				if (upR.is_ref_xrate()) {
					r.xrate(MSBHL_PaySchdRegService.getPurcXrate(upR.trd_cur_cd(), upR.base_dt()));
					r.base_cur_amt(convToBaseCur(r.trd_cur_amt(), r.xrate(),
							getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
				}

				if (MAC_AP_STTL_TYP.isACNT(r.ap_sttl_typ())
					|| MAC_AP_STTL_TYP.isACNT_COM_PAID(r.ap_sttl_typ())
					|| MAC_AP_STTL_TYP.isCASH(r.ap_sttl_typ())
					|| MAC_AP_STTL_TYP.isCASH_COM_PAID(r.ap_sttl_typ())) {
					r.pay_bank_ac_cd(bspplR.pay_bank_ac_cd());
					r.pay_bank_ac_nm(MSBHL_PaySchdRegService.getBankAc(r.pay_bank_ac_cd()).bank_ac_nm());
				}
				if (MAC_AP_STTL_TYP.is_com_paid(r.ap_sttl_typ())) {
					r.trd_cur_amt(null);
				}
				r.pay_xrate(MAUCL_AmtUtil.getDefXrate(upR.trd_cur_cd(), getBaseCur().cur_cd(), getCo().pay_xrate_cd(), nvl(upR.bsppl_cl_dt(), upR.pay_schd_dt())));
				if (MAC_AP_STTL_TYP.is_req_bank_ac(r.ap_sttl_typ())) {
					MAM_DPT_R dptR = MSBHL_PaySchdRegService.getDpt(upR.bsppl_dpt_cd(), upR.base_dt());
					r.bank_ac_cd(dptR.pay_bank_ac_cd());
					r.bank_ac_nm(MSBHL_PaySchdRegService.getBankAc(r.bank_ac_cd()).bank_ac_nm());
				}
				if (MAC_AP_SETOFF_TYP.isBSPPL(r.ap_setoff_typ())) {
					r.setoff_cd(upR.bsppl_cd());
					r.setoff_nm(MSBHL_PaySchdRegService.getBp(upR.bsppl_cd()).bp_nm());
					r.so_dpt_cd(upR.ap_dpt_cd());
				}
				else if (MAC_AP_SETOFF_TYP.isPRSPPL(r.ap_setoff_typ())) {
					r.setoff_cd(upR.asppl_cd());
					r.setoff_nm(MSBHL_PaySchdRegService.getBp(upR.asppl_cd()).bp_nm());
				}
			}

			return paySchdL;
		}

		/**
		 * 支払予定を編集する
		 */
		protected void editPaySchd() {

			// 支払予定日設定
			setPaySchdDt();

			MCIndexKey idx = up0().createIndex(PaySchd_Srch01_CndR.$hdr_peg_no);
			for (PaySchd_Srch01_RsltR r : _paySchdL) {
				PaySchd_Srch01_CndR upR = up0().getFirst(idx, r.hdr_peg_no());

				// 支払予定日を必要とする項目を設定する
				editPaySchd(upR, r);
			}
		}
		protected void editPaySchd(PaySchd_Srch01_CndR upR, PaySchd_Srch01_RsltR r) {

			// 支払予定管理先
			MAM_BP_R bspplR = MSBHL_PaySchdRegService.getBp(upR.bsppl_cd());

			// 相殺部門名
			MAM_DPT_R dptR = MSBHL_PaySchdRegService.getDpt(r.so_dpt_cd(), upR.base_dt());
			if (!isNull(dptR)) {
				r.so_dpt_nm(dptR.dpt_nm());
			}

			// 債務部門
			dptR = MSBHL_PaySchdRegService.getDpt(r.ap_dpt_cd(), upR.base_dt());
			if (!isNull(dptR)) {
				r.ap_dpt_nm(dptR.dpt_nm());
			}

			// 支払部門
			String payDptCd = MSBHL_PaySchdRegService.getPayDptCd(bspplR.psppl_cd(), r.pay_schd_dt());
			if (!isNull(payDptCd)) {
				r.pay_dpt_cd(payDptCd);
				r.pay_dpt_nm(MSBHL_PaySchdRegService.getDpt(r.pay_dpt_cd(), r.pay_schd_dt()).dpt_nm());
			}

			// 手数料税
			if (isTaxCdComplementTarget(r.ap_sttl_typ(), r.ap_setoff_typ())) {
				r.trd_cur_com_paid_tax_cd(MSBHL_ApUtil.getComPaidAndSetoffTaxCd(r.pay_schd_dt()));
				if (!isNull(r.trd_cur_com_paid_tax_cd())) {
					r.trd_cur_com_paid_tax_nm(MSBHL_ApUtil.getTax(r.trd_cur_com_paid_tax_cd()).tax_nm());
					r.trd_cur_com_paid_tax_rate(MSBHL_ApUtil.getTax(r.trd_cur_com_paid_tax_cd()).tax_rate());
					r.trd_cur_com_paid_tax_typ(MSBHL_ApUtil.getTax(r.trd_cur_com_paid_tax_cd()).tax_typ());
				}
			}
		}

		protected boolean isTaxCdComplementTarget(String apSttlTyp, String apSetoffTyp) {
			if (MAC_AP_STTL_TYP.is_com_paid(apSttlTyp)) {
				return true;
			}
			else if (MAC_AP_STTL_TYP.isSETOFF(apSttlTyp)) {
				if (MAC_AP_SETOFF_TYP.isBSPPL(apSetoffTyp)
						|| MAC_AP_SETOFF_TYP.isFLEX(apSetoffTyp)) {
					return true;
				}
				else {
					return false;
				}
			}
			return false;
		}

		/**
		 * 支払予定日を設定する
		 * 
		 * @param upR 上り電文
		 * @param r 支払予定情報
		 */
		protected void setPaySchdDt() {
			MSBHL_PaySchdRegService.PaySchd_Srch04 o = MSBHL_PaySchdRegService.crtPaySchd_Srch04();

			MCIndexKey idx = up0().createIndex(PaySchd_Srch01_CndR.$hdr_peg_no);
			Map<MCNumber, PaySchd_Srch01_RsltR> map = new HashMap<>();
			for (int i=0; i<_paySchdL.size(); i++) {
				PaySchd_Srch01_RsltR r = _paySchdL.get(i);
				PaySchd_Srch01_CndR upR = up0().getFirst(idx, r.hdr_peg_no());
				if (upR.err_flg()) {
					continue;
				}

				// 以下のいずれかに該当する場合、それらの支払予定日を設定する
				// ・予定作成時に相殺の支払実績を作成する場合は、基準日（＝運用日付）を設定
				// （支払実績の計上日には支払予定日が設定されるので）
				// ・上り電文の支払予定がNULL以外の場合、上り電文の支払予定日を設定
				r.pay_schd_dt(isSchdActFlg(r) ? upR.base_dt() : upR.pay_schd_dt());
				if (!isNull(r.pay_schd_dt())) {
					continue;
				}

				PaySchd_Srch04_CndR cndR = o.up0().add();
				cndR.peg_no(i);
				cndR.bsppl_cd(upR.bsppl_cd());
				cndR.cur_cd(upR.trd_cur_cd());
				cndR.sttl_cd(r.ap_sttl_cd());
				cndR.min_amt(r.getNumber(MAM_PAY_SCHD_CTL_R.$min_amt));
				cndR.bsppl_dpt_cd(upR.bsppl_dpt_cd());
				cndR.bsppl_cl_dt(upR.bsppl_cl_dt());
				cndR.bank_ac_cd(r.bank_ac_cd());
				cndR.base_dt(nvl(upR.bsppl_cl_dt(), upR.base_dt()));

				map.put(cndR.peg_no(), r);
			}
			if (!o.up0().isEmpty()) {
				o.exec();

				for (PaySchd_Srch04_CndR r : o.down0()) {
					PaySchd_Srch01_RsltR downR = map.get(r.peg_no());
					downR.pay_schd_dt(r.pay_schd_dt());
				}
			}
		}

		/**
		 * 予定時に相殺の支払実績を作成するか
		 */
		protected boolean isSchdActFlg(PaySchd_Srch01_RsltR paySchdR) {
			PaySchd_DtlSchdR r = PaySchd_DtlSchdR.create();
			r.ap_sttl_cd(paySchdR.ap_sttl_cd());
			r.ap_sttl_typ(paySchdR.ap_sttl_typ());
			r.ap_setoff_typ(paySchdR.ap_setoff_typ());
			r.adv_pay_act_no(null);
			return isApSetOffActFlg(r);
		}

		/**
		 * 買掛明細ごとに作成した支払予定をまとめる
		 */
		protected void groupByPaySchd() {

			MCList<PaySchd_Srch01_RsltR> work = MCList.create(PaySchd_Srch01_RsltR.class);
			work.setAll(_paySchdL);

			MCGroupByPolicy policy = new MCGroupByPolicy(getGroupByPaySchdKey());
			policy.sum(
				PaySchd_Srch01_RsltR.$trd_cur_amt, PaySchd_Srch01_RsltR.$base_cur_amt
			);

			_paySchdL.setAll(work.groupBy(policy));
		}

		/**
		 * 支払予定をまとめる項目
		 */
		protected String[] _groupByPaySchdKey;
		protected String[] getGroupByPaySchdKey() {
			if (_groupByPaySchdKey == null) {
				_groupByPaySchdKey = new String[]{
					PaySchd_Srch01_RsltR.$hdr_peg_no,
					PaySchd_Srch01_RsltR.$asppl_cd,
					PaySchd_Srch01_RsltR.$ap_dpt_cd,
					PaySchd_Srch01_RsltR.$pay_dpt_cd,
					PaySchd_Srch01_RsltR.$ap_typ,
					PaySchd_Srch01_RsltR.$ap_sttl_cd,
					PaySchd_Srch01_RsltR.$ap_sttl_typ,
					PaySchd_Srch01_RsltR.$pay_schd_dt,
					PaySchd_Srch01_RsltR.$pay_bank_ac_cd,
					PaySchd_Srch01_RsltR.$bank_ac_cd,
					PaySchd_Srch01_RsltR.$ap_setoff_typ,
					PaySchd_Srch01_RsltR.$xrate,
					PaySchd_Srch01_RsltR.$setoff_cd,
					PaySchd_Srch01_RsltR.$setoff_nm,
					PaySchd_Srch01_RsltR.$so_dpt_cd,
					PaySchd_Srch01_RsltR.$trd_cur_com_paid_tax_cd,
					PaySchd_Srch01_RsltR.$trd_cur_com_paid_tax_rate,
					PaySchd_Srch01_RsltR.$ap_sttl_nm,
					PaySchd_Srch01_RsltR.$ap_sttl_typ_nm,
					PaySchd_Srch01_RsltR.$pay_bank_ac_nm,
					PaySchd_Srch01_RsltR.$bank_ac_nm,
					PaySchd_Srch01_RsltR.$trd_cur_com_paid_tax_nm,
					PaySchd_Srch01_RsltR.$trd_cur_com_paid_tax_typ,
					PaySchd_Srch01_RsltR.$ap_setoff_typ_nm,
					PaySchd_Srch01_RsltR.$so_dpt_nm,
					PaySchd_Srch01_RsltR.$asppl_nm,
					PaySchd_Srch01_RsltR.$ap_dpt_nm,
					PaySchd_Srch01_RsltR.$pay_dpt_nm,
					PaySchd_Srch01_RsltR.$ap_typ_nm,
					PaySchd_Srch01_RsltR.$ap_setoff_act_flg
				};
			}
			return _groupByPaySchdKey;
		}

		/**
		 * 支払予定情報を取得する。
		 * 
		 * @param upR 上り電文
		 * @param sumAmt 合計金額
		 * @return 支払予定情報
		 */
		protected MCList<MST_PAY_SCHD_R> getPaySchd(PaySchd_Srch01_CndR upR, MCNumber sumAmt) {

			MCList<MST_PAY_SCHD_R> paySchdL = MCList.create(MST_PAY_SCHD_R.class);

			// 支払予定制御マスタ情報取得
			// マスタを参照するときは、支払対象の合計金額で参照する
			MCList<MAM_PAY_SCHD_CTL_R> paySchdCtlL =
				getPaySchdCtl(upR.bsppl_cd(), upR.bsppl_dpt_cd(), upR.trd_cur_cd(), null, sumAmt, upR.bsppl_cl_dt());

			if (!paySchdCtlL.isEmpty()) {
				MCNumber rate = paySchdCtlL.sum(MAM_PAY_SCHD_CTL_R.$rate);
				if (!isNull(rate) && !rate.isZero()) {
					// 支払金額を比率で按分
					MAM_CUR_R curR = MSBHL_PaySchdRegService.getCur(upR.trd_cur_cd());
					FXUCC_Divide.prop(
						paySchdCtlL, upR.trd_cur_amt().add(upR.trd_cur_tax_amt()),
						curR.amt_dec_place().intValue(), MAM_PAY_SCHD_CTL_R.$rate, "pay_schd_amt");
				}
				for (MAM_PAY_SCHD_CTL_R paySchdCtlR: paySchdCtlL){
	
					MST_PAY_SCHD_R paySchdR = paySchdL.add();
					paySchdR.trd_cur_amt(paySchdCtlR.getNumberNE("pay_schd_amt"));
					paySchdR.ap_sttl_cd(paySchdCtlR.sttl_cd());
	
					MAM_STTL_R sttlR = getApSttl(paySchdCtlR.sttl_cd());
					paySchdR.ap_sttl_typ(sttlR.ap_sttl_typ());
					paySchdR.ap_setoff_typ(sttlR.ap_setoff_typ());
					paySchdR.setNumberNE(MAM_PAY_SCHD_CTL_R.$min_amt, paySchdCtlR.min_amt());
				}
			}

			return paySchdL;
		}

		/**
		 * 支払予定情報（源泉税のみ）を取得する。
		 * 
		 * @param upR 上り電文
		 * @return 支払予定情報
		 */
		protected MCList<MST_PAY_SCHD_R> getPaySchdWtax(PaySchd_Srch01_CndR upR) {

			MCList<MST_PAY_SCHD_R> paySchdL = MCList.create(MST_PAY_SCHD_R.class);

			// 源泉税が設定されている場合、源泉税分の支払予定を追加
			if (isNullOr(upR.wtax_amt()) || upR.wtax_amt().isZero()) {
				// 源泉税なしは対象外
			}
			else {
				MCList<MAM_STTL_R> sttlL = MSBHL_PaySchdRegService.getApSttlCd(MAC_AP_STTL_TYP.WTAX.value());
				if (isNull(sttlL)) {
					throw new MCAppException(MSBHL0025);
				}
				MAM_STTL_R sttlR = sttlL.get(0);
				MST_PAY_SCHD_R paySchdR = paySchdL.add();
				paySchdR.trd_cur_amt(upR.wtax_amt());
				paySchdR.ap_sttl_cd(sttlR.sttl_cd());
				paySchdR.ap_sttl_typ(sttlR.ap_sttl_typ());
				paySchdR.ap_setoff_typ(sttlR.ap_setoff_typ());
				paySchdR.setNumberNE(MAM_PAY_SCHD_CTL_R.$min_amt, null);
			}

			return paySchdL;
		}

		/**
		 * 金額ゼロの支払予定の決済方法を設定する
		 */
		protected void editPaySchdZero() {
			
			MCList<PaySchd_Srch01_RsltR>
				notZeroL = MCList.create(PaySchd_Srch01_RsltR.class),
				zeroL = MCList.create(PaySchd_Srch01_RsltR.class),
				comPaidL = MCList.create(PaySchd_Srch01_RsltR.class);
			
			String[] key = {
				PaySchd_Srch01_RsltR.$hdr_peg_no, PaySchd_Srch01_RsltR.$asppl_cd, PaySchd_Srch01_RsltR.$ap_dpt_cd, PaySchd_Srch01_RsltR.$ap_typ
			};
			for (MCList<PaySchd_Srch01_RsltR> subL : _paySchdL.groupList(key)) {
				subL.sort(PaySchd_Srch01_RsltR.$ap_sttl_cd);
				
				boolean zeroFlg = false;
				comPaidL.clear();
				
				for (PaySchd_Srch01_RsltR r : subL) {
					if (MAC_AP_STTL_TYP.is_com_paid(r.ap_sttl_typ())) {
						comPaidL.add(r);
					}
					else if (isNull(r.trd_cur_amt()) || !r.trd_cur_amt().isZero()) {
						notZeroL.add(r);
					}
					else if (!zeroFlg) {
						zeroL.add(r);
						zeroFlg = true;	// 金額ゼロは1レコードのみ
					}
				}
				if (!zeroFlg) {
					// 金額ゼロは手数料を提案しない
					notZeroL.addAll(comPaidL);
				}
			}
			
			_paySchdL.setAll(notZeroL);
			if (zeroL.isEmpty()) {
				return;
			}
			
			// 金額ゼロは債務決済区分「相殺」、債務相殺先区分「支払予定管理先」、債務相殺実績計上「オフ」の支払予定を提案する
			// 上記に該当するレコードがない場合、債務決済区分が「相殺」のレコードを「支払予定管理先」として提案する（債務相殺実績計上「オフ」）
			// 決済方法マスタに相殺の決済方法が設定されていない場合は支払予定制御マスタに従う
			MCList<MAM_STTL_R> sttlL = MSBHL_PaySchdRegService.getApSttlCd(
					MAC_AP_STTL_TYP.SETOFF.value()).subList(MAM_STTL_R.$ap_setoff_act_flg, false);
			if (isNull(sttlL)) {
				_paySchdL.addAll(zeroL);
				return;
			}
			sttlL.sort(MAM_STTL_R.$sttl_cd);
			MAM_STTL_R sttlR = sttlL.get(0);
			for (MAM_STTL_R r : sttlL) {
				if (MAC_AP_SETOFF_TYP.isBSPPL(r.ap_setoff_typ())) {
					sttlR = r;
					break;
				}
			}
			
			MCIndexKey idx = up0().createIndex(PaySchd_Srch01_CndR.$hdr_peg_no);
			
			for (MCList<PaySchd_Srch01_RsltR> subL : zeroL.groupList(key)) {
				PaySchd_Srch01_RsltR zeroR = subL.get(0);
				PaySchd_Srch01_CndR upR = up0().getFirst(idx, zeroR.hdr_peg_no());
				
				zeroR.ap_sttl_cd(sttlR.sttl_cd());
				zeroR.ap_sttl_nm(sttlR.sttl_nm());
				zeroR.ap_sttl_typ(sttlR.ap_sttl_typ());
				zeroR.ap_setoff_typ(MAC_AP_SETOFF_TYP.BSPPL.value());		// 「支払予定管理先」固定
				zeroR.ap_setoff_act_flg(sttlR.ap_setoff_act_flg());
				
				zeroR.pay_schd_dt(upR.base_dt());
				zeroR.pay_bank_ac_cd(null);
				zeroR.bank_ac_cd(null);
				zeroR.setoff_cd(upR.bsppl_cd());
				zeroR.setoff_nm(MSBHL_PaySchdRegService.getBp(upR.bsppl_cd()).bp_nm());
				zeroR.so_dpt_cd(zeroR.ap_dpt_cd());
				MAM_TAX_R taxR = MSBHL_ApUtil.getTax(MSBHL_ApUtil.getComPaidAndSetoffTaxCd(upR.base_dt()));
				zeroR.trd_cur_com_paid_tax_cd(taxR.tax_cd());
				zeroR.trd_cur_com_paid_tax_rate(taxR.tax_rate());
				zeroR.pay_bank_ac_nm(null);
				zeroR.bank_ac_nm(null);
				zeroR.trd_cur_com_paid_tax_nm(null);
				zeroR.trd_cur_com_paid_tax_typ(null);
				editPaySchd(upR, zeroR);
				
				_paySchdL.add(zeroR);
			}
		}

		/**
		 * 下り電文をソートする
		 */
		protected void sort() {
			_paySchdL.sort(
				PaySchd_Srch01_RsltR.$ap_sttl_typ,
				PaySchd_Srch01_RsltR.$ap_sttl_cd,
				PaySchd_Srch01_RsltR.$pay_schd_dt
			);
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
			
			MCIndexKey idx = up0().createIndex(PaySchd_Srch01_CndR.$hdr_peg_no);
			for (PaySchd_Srch01_RsltR r : _paySchdL) {
				PaySchd_Srch01_CndR upR = up0().getFirst(idx, r.hdr_peg_no());
				if (upR.zero_flg()
					|| isNull(r.trd_cur_amt())
					|| !r.trd_cur_amt().isZero()) {
					down1().add(r);
				}
			}
		}
	}

	/**
	 * PaySchd_Srch02オペレーション.<p>
	 *
	 * 同一の支払照合ヘッダとして登録可能な買掛明細をまとめる。<br>
	 */
	public class PaySchd_Srch02 extends MSBHL_PaySchdRegService_MC_A.PaySchd_Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			setHdr();
			setHdrCo();
			setDown();
		}

		public void editUp() {
			MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class)
					, bpCndL = MCList.create(MAM_BP_R.class);
			for (PaySchd_Srch02_CndR r : up0().distinctNE(PaySchd_Srch02_CndR.$sppl_cd)) {
				bpCndL.add().bp_cd(r.sppl_cd());
			}
			for (PaySchd_Srch02_CndR r : up0().distinctNE(PaySchd_Srch02_CndR.$bsppl_cd)) {
				bpCndL.add().bp_cd(r.bsppl_cd());
			}

			// 取引先情報をキャッシュする
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(MAM_BP_R.create("T"));
			dbSelectKey("MSBHL5030_MAM_BP_S02", bpL, bpL_bldr, bpCndL.groupBy(MAM_BP_R.$bp_cd));
			MSBHL_PaySchdRegService.setBp(bpL);

			// 品目情報をキャッシュする
			MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));
			dbSelectKey("MSBHL5030_MAM_ITM_S02", itmL, itmL_bldr,
					up0().groupBy(
							PaySchd_Srch01_CndR.$itm_cd,
							PaySchd_Srch01_CndR.$itm_sub1,
							PaySchd_Srch01_CndR.$itm_sub2,
							PaySchd_Srch01_CndR.$itm_sub3
					)
			);
			MSBHL_PaySchdRegService.setItm(itmL);

			MCList<MST_AP_D_R> apDL = getApDL();
			MCIndexKey idxApDL = apDL.createIndex(MST_AP_D_R.$ap_d_no);
			for (PaySchd_Srch02_CndR r : up0()) {
				MAM_BP_R bpR = MSBHL_PaySchdRegService.getBp(r.bsppl_cd());
				if (isNull(bpR)) {
					r.err_flg(true);
					MCMessagePool.add(r, null, MSBHL0026, r.bsppl_cd());
					continue;
				}
				r.pay_spot_flg(bpR.pay_spot_flg());
				MST_AP_D_R apdR = apDL.getFirst(idxApDL, r.ap_d().ap_d_no());
				setPurcActNo(r, apdR);
				setRcptIvNo(r, apdR);
				setApWrkNo(r);
			}
		}

		/**
		 * 支払照合ヘッダのキーによるまとめが不要か判定する
		 */
		protected Boolean _isNotGroup;
		protected boolean isNotGroup() {
			if (_isNotGroup == null) {
				// 処理中にget(0)のhdr_peg_noに値が設定されるため、初回に値を退避
				_isNotGroup = !up0().isEmpty() && !isNull(up0().get(0).hdr_peg_no());
			}
			return _isNotGroup.booleanValue();
		}

		/**
		 * 支払照合ヘッダのキーに締日を含めないを判定する
		 * 
		 * return 締日を無視してまとめる場合は true を返す
		 */
		protected boolean isClDtGrpFlg()  {
			if (!up0().isEmpty() && up0().get(0).cl_dt_grp_flg()) {
				return true;
			}
			return false;
		}

		/**
		 * 仕入実績ＮＯを設定する
		 * @param upR
		 * @param apdR
		 */
		protected void setPurcActNo(PaySchd_Srch02_CndR upR, MST_AP_D_R apdR) {
			if (!upR.pay_spot_flg()
					|| isIv(upR.sppl_cd(), upR.rcpt_iv_no())
					|| (isSw(apdR) && !isNullOrNullVal(apdR.rcpt_iv_no()))) {
				// 都度支払、かつインボイス取引対象でない場合のみ使用する
				upR.purc_act_no(null);
			}
			upR.purc_act_no(nvl(upR.purc_act_no(), MAC_STR.NULL_VAL.value()));
		}

		/**
		 * 受領インボイスＮＯを設定する
		 * @param upR
		 * @param apdR
		 */
		protected void setRcptIvNo(PaySchd_Srch02_CndR upR, MST_AP_D_R apdR) {
			if (!upR.pay_spot_flg() 
					|| (!isIv(upR.sppl_cd(), upR.rcpt_iv_no()) && !isSw(apdR))) {
				// 都度支払、かつインボイス取引対象の場合のみ使用する。ただし振替先の買掛明細である場合は買掛明細の値を引き継ぐ。
				upR.rcpt_iv_mng_no(null);
				upR.rcpt_iv_no(null);
			}
			upR.rcpt_iv_mng_no(nvl(upR.rcpt_iv_mng_no(), MAC_STR.NULL_VAL.value()));
			upR.rcpt_iv_no(nvl(upR.rcpt_iv_no(), MAC_STR.NULL_VAL.value()));
		}

		/**
		 * 案件別債務管理を設定する
		 */
		protected void setApWrkNo(PaySchd_Srch02_CndR upR) {
			// 上り電文の案件NO（＝買掛明細.案件NO）はマスタ考慮済み
			upR.wrk_no(nvl(upR.wrk_no(), MAC_STR.NULL_VAL.value()));
		}

		/**
		 * まとめ単位に従ってヘッダを作成する
		 */
		protected void setHdr() {

			// まとめ不要の場合、ヘッダ紐付けＮＯによってまとめ済みなので、その単位でまとめる
			String[] hdrCols = isNotGroup() ? new String[]{PaySchd_Srch02_CndR.$hdr_peg_no} : getHdrCols();

			int peg = 0;
			for (MCList<PaySchd_Srch02_CndR> paySchdL : up0().subList(r -> !r.err_flg()).groupList(hdrCols)) {
				if (isClDtGrpFlg()) {
					// 締日でまとめる場合、締日には最遅日を設定する
					paySchdL.sort(SortType.DESC, PaySchd_Srch02_CndR.$bsppl_cl_dt);
				}
				PaySchd_Srch02_CndR cndR = paySchdL.get(0);
				PaySchd_Srch02_RsltR hdrR = getHdr(cndR);
				if (!isNotGroup()) {
					hdrR.hdr_peg_no(peg++);
				}
				hdrR.amt(0);
				paySchdL.forEach(r -> {
					r.hdr_peg_no(hdrR.hdr_peg_no());
					MAM_ITM_R itmR = MSBHL_PaySchdRegService.getItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
					hdrR.amt(
						hdrR.amt().add(
							r.trd_cur_amt().add(r.trd_cur_tax_amt())
								.multiply(getAmtDispPm(r.trd_ptn_typ(), itmR.dscnt_itm_flg()))
						)
					);
				});
				hdrR.pay_xrate(MAUCL_AmtUtil.getDefXrate(hdrR.trd_cur_cd(), getBaseCur().cur_cd(), getCo().pay_xrate_cd(), nvl(hdrR.bsppl_cl_dt(), cndR.reg_dt())));
				down1().add(hdrR);
			}
		}

		/**
		 * まとめ単位
		 */
		protected String[] _hdrCols;
		protected String[] getHdrCols() {
			if (_hdrCols == null) {
				List<String> arr = new ArrayList<>();
				arr.add(PaySchd_Srch02_CndR.$bsppl_cd);
				arr.add(PaySchd_Srch02_CndR.$bsppl_dpt_cd);
				arr.add(PaySchd_Srch02_CndR.$purc_act_no);
				arr.add(PaySchd_Srch02_CndR.$rcpt_iv_mng_no);
				arr.add(PaySchd_Srch02_CndR.$rcpt_iv_no);
				arr.add(PaySchd_Srch02_CndR.$trd_cur_cd);
				arr.add(PaySchd_Srch02_CndR.$wrk_no);
				if (!isClDtGrpFlg()) {
					arr.add(PaySchd_Srch02_CndR.$bsppl_cl_dt);
					arr.add(PaySchd_Srch02_CndR.$bsppl_cl_day);
				}
				_hdrCols = arr.toArray(new String[arr.size()]);
			}
			return _hdrCols;
		}
		protected PaySchd_Srch02_RsltR getHdr(PaySchd_Srch02_CndR upR) {
			PaySchd_Srch02_RsltR hdrR = PaySchd_Srch02_RsltR.create();

			hdrR.hdr_peg_no(upR.hdr_peg_no());
			hdrR.bsppl_cd(upR.bsppl_cd());
			hdrR.bsppl_dpt_cd(upR.bsppl_dpt_cd());
			hdrR.purc_act_no(upR.purc_act_no());
			hdrR.rcpt_iv_mng_no(upR.rcpt_iv_mng_no());
			hdrR.rcpt_iv_no(upR.rcpt_iv_no());
			hdrR.wrk_no(upR.wrk_no());
			hdrR.bsppl_cl_dt(upR.bsppl_cl_dt());
			hdrR.bsppl_cl_day(upR.bsppl_cl_day());
			hdrR.trd_cur_cd(upR.trd_cur_cd());
			hdrR.pay_spot_flg(upR.pay_spot_flg());
			hdrR.amt(0);
			hdrR.last_pay_schd_amt(0);
			hdrR.bfw_amt(0);
			hdrR.purc_amt(0);
			hdrR.purc_ret_amt(0);
			hdrR.purc_dscnt_amt(0);
			hdrR.pay_chk().sw_to_amt(0);
			hdrR.tax_amt(0);
			hdrR.account_amt(0);
			hdrR.cash_amt(0);
			hdrR.note_amt(0);
			hdrR.setoff_amt(0);
			hdrR.pay_chk().sw_amt(0);
			hdrR.schd_pay_amt(0);
			hdrR.pay_chk_mng_no(upR.pay_chk_mng_no());

			return hdrR;
		}

		/**
		 * 締年月日を除いたキーで支払照合ヘッダを取得する
		 */
		protected MCList<PaySchd_Srch02_RsltR>[] getHdrArray(MCList<PaySchd_Srch02_RsltR> hdrL) {
			String[] grpKey = {
				PaySchd_Srch02_RsltR.$bsppl_cd,
				PaySchd_Srch02_RsltR.$bsppl_dpt_cd,
				PaySchd_Srch02_RsltR.$purc_act_no,
				PaySchd_Srch02_RsltR.$rcpt_iv_mng_no,
				PaySchd_Srch02_RsltR.$rcpt_iv_no,
				PaySchd_Srch02_RsltR.$trd_cur_cd,
				PaySchd_Srch02_RsltR.$wrk_no
			};
			// 締年月日を除いたキーで支払照合ヘッダを取得＆並び替え
			MCList<PaySchd_Srch02_RsltR>[] arr = hdrL.groupList(grpKey);
			Arrays.sort(arr, new Comparator<MCList<PaySchd_Srch02_RsltR>>() {
				public int compare(MCList<PaySchd_Srch02_RsltR> o1, MCList<PaySchd_Srch02_RsltR> o2) {
					int cmp = 0;
					for (String s : grpKey) {
						cmp = o1.get(0).getString(s).compareTo(o2.get(0).getString(s));
						if (cmp != 0) {
							break;
						}
					}
					return cmp;
				}
			});
			for (int i=0; i<arr.length; i++) {
				arr[i].sort(PaySchd_Srch02_RsltR.$bsppl_cl_dt);
			}
			return arr;
		}

		/**
		 * 繰越情報を設定する
		 */
		protected void setHdrCo() {

			// 今回仕入情報、今回支払情報を取得
			initApDL(up0().subList(r -> !r.err_flg()));

			// 支払照合ヘッダごと（締年月日は除く）
			MCList<PaySchd_Srch02_RsltR>[] hdrArray = getHdrArray(down1());
			for (MCList<PaySchd_Srch02_RsltR> hdrL : hdrArray) {

				// 前回繰越分を取得
				PaySchd_Srch02_RsltR bfrR = getBfrPayChkR(hdrL.get(0), hdrArray);

				// 締年月日ごとに繰越情報を設定
				for (PaySchd_Srch02_RsltR hdrR : hdrL) {

					// 買掛明細なしの支払照合を含め、繰越情報の計算対象を設定
					setHdrCo(hdrR, bfrR);
					bfrR = hdrR;
				}
			}
		}

		/**
		 * 繰越情報を設定する<br>
		 * 今回xx支払額は PaySchd_Srch06 を使用して設定する
		 */
		protected void setHdrCo(PaySchd_Srch02_RsltR hdrR, PaySchd_Srch02_RsltR bfrR) {

			// 前回締年月日
			hdrR.bfr_cl_dt(isNull(bfrR) ?  null : bfrR.bsppl_cl_dt());

			// 今回仕入情報、今回支払情報を取得
			MCList<MST_AP_D_R> apdL = getApDL(hdrR);

			// 前回支払予定額
			hdrR.last_pay_schd_amt(isNull(bfrR) ? MCNumber.ZERO : bfrR.schd_pay_amt());

			// 今回仕入額
			MCNumber[] purcAmt = getPurcAmt(apdL);
			hdrR.purc_amt(purcAmt[0]);
			hdrR.purc_ret_amt(purcAmt[1]);
			hdrR.purc_dscnt_amt(purcAmt[2]);
			hdrR.sw_to_amt(purcAmt[4]);

			// 今回税額
			hdrR.tax_amt(getTaxAmt(apdL));
		}

		/**
		 * 引数の支払照合ヘッダを今回締め分としたときの、前回締め分の支払照合ヘッダを取得する<br>
		 * 前回締めが存在しない場合は null を返す
		 */
		protected MCList<MST_PAY_CHK_R> _bfrPayChkL;
		protected MCIndexKey _bfrPayChkIdx;
		protected PaySchd_Srch02_RsltR getBfrPayChkR(PaySchd_Srch02_RsltR hdrR, MCList<PaySchd_Srch02_RsltR>[] hdrArray) {

			if (_bfrPayChkL == null) {
				// 前回締分を取得するための条件となるヘッダをまとめる（get(0)は一番古い締日）
				Map<Boolean, MCList<PaySchd_Srch02_RsltR>> cndMap = new HashMap<>();
				for (int i=0; i<hdrArray.length; i++) {
					PaySchd_Srch02_RsltR cndR = hdrArray[i].get(0);
					if (!cndMap.containsKey(cndR.pay_spot_flg())) {
						cndMap.put(cndR.pay_spot_flg(), MCList.create(PaySchd_Srch02_RsltR.class));
					}
					cndMap.get(cndR.pay_spot_flg()).add(cndR);
				}
				
				_bfrPayChkL = MCList.create(MST_PAY_CHK_R.class);
				for (Boolean paySpotFlg : cndMap.keySet()) {
					MCList<MST_PAY_CHK_R> dbc = MCList.create(MST_PAY_CHK_R.class);
					MST_PAY_CHK_R t = MST_PAY_CHK_R.create("T");
					MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
					if (paySpotFlg) {
						// 都度支払
						MST_PAY_CHK_R S1W = MST_PAY_CHK_R.create("W");

						dbc_bldr.setWhere(t.pay_chk_mng_no.in(subQuery()
								.select(max(S1W.pay_chk_mng_no).as("pay_chk_mng_no"))
								.from(S1W)
								.where(value(0).eq(value(0))
										.and(S1W.bsppl_cd.eq(bind("bsppl_cd")))
										.and(S1W.bsppl_dpt_cd.eq(bind("bsppl_dpt_cd")))
										.and(S1W.purc_act_no.eq(bind("purc_act_no")))
										.and(S1W.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")))
										.and(S1W.rcpt_iv_no.eq(bind("rcpt_iv_no")))
										.and(S1W.wrk_no.eq(bind("wrk_no")))
										.and(S1W.trd_cur_cd.eq(bind("trd_cur_cd")))
										.cutoff$and(S1W.pay_chk_mng_no.neq(bind("pay_chk_mng_no"))))));
					}
					else {
						// 締め支払
						MCTempView S1V = createTempView("V");
						MST_PAY_CHK_R S2W = MST_PAY_CHK_R.create("W");

						dbc_bldr.setWhere(exists(subQuery()
								.select(value("X"))
								.from(subQuery()
										.select(S2W.bsppl_cd,
												S2W.bsppl_dpt_cd,
												S2W.purc_act_no,
												S2W.rcpt_iv_mng_no,
												S2W.rcpt_iv_no,
												S2W.wrk_no,
												S2W.trd_cur_cd,
												max(S2W.bsppl_cl_dt).as("bsppl_cl_dt"))
										.from(S2W)
										.where(value(0).eq(value(0))
												.and(S2W.bsppl_cd.eq(bind("bsppl_cd")))
												.and(S2W.bsppl_dpt_cd.eq(bind("bsppl_dpt_cd")))
												.and(S2W.purc_act_no.eq(bind("purc_act_no")))
												.and(S2W.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")))
												.and(S2W.rcpt_iv_no.eq(bind("rcpt_iv_no")))
												.and(S2W.wrk_no.eq(bind("wrk_no")))
												.and(S2W.trd_cur_cd.eq(bind("trd_cur_cd")))
												.and(S2W.bsppl_cl_dt.lte(bind("bsppl_cl_dt")))
												.cutoff$and(S2W.pay_chk_mng_no.neq(bind("pay_chk_mng_no"))))
										.groupBy(S2W.bsppl_cd,
												S2W.bsppl_dpt_cd,
												S2W.purc_act_no,
												S2W.rcpt_iv_mng_no,
												S2W.rcpt_iv_no,
												S2W.wrk_no,
												S2W.trd_cur_cd)
										.view(S1V))
								.where(S1V.pr(S2W.bsppl_cd).eq(t.bsppl_cd)
										.and(S1V.pr(S2W.bsppl_dpt_cd).eq(t.bsppl_dpt_cd))
										.and(S1V.pr(S2W.purc_act_no).eq(t.purc_act_no))
										.and(S1V.pr(S2W.rcpt_iv_mng_no).eq(t.rcpt_iv_mng_no))
										.and(S1V.pr(S2W.rcpt_iv_no).eq(t.rcpt_iv_no))
										.and(S1V.pr(S2W.wrk_no).eq(t.wrk_no))
										.and(S1V.pr(S2W.trd_cur_cd).eq(t.trd_cur_cd))
										.and(S1V.pr("bsppl_cl_dt").eq(t.bsppl_cl_dt))))
										.cutoff$and(t.pay_chk_mng_no.neq(bind("pay_chk_mng_no"))));
					}
					dbSelect("MSBHL5030_MST_PAY_CHK_S01", dbc, dbc_bldr, cndMap.get(paySpotFlg));
					_bfrPayChkL.addAll(dbc);
				}
				_bfrPayChkL.sort(SortType.DESC, MST_PAY_CHK_R.$pay_chk_mng_no);
				_bfrPayChkIdx = _bfrPayChkL.createIndex(
					MST_PAY_CHK_R.$bsppl_cd,
					MST_PAY_CHK_R.$bsppl_dpt_cd,
					MST_PAY_CHK_R.$purc_act_no,
					MST_PAY_CHK_R.$rcpt_iv_mng_no,
					MST_PAY_CHK_R.$rcpt_iv_no,
					MST_PAY_CHK_R.$wrk_no,
					MST_PAY_CHK_R.$trd_cur_cd
				);
			}
			
			MST_PAY_CHK_R bfrPayChkR =
				_bfrPayChkL.getFirst(_bfrPayChkIdx, hdrR.pay_chk().toArray(_bfrPayChkIdx.getKeys()));

			PaySchd_Srch02_RsltR bfrR = null;
			if (!isNull(bfrPayChkR)) {
				bfrR = PaySchd_Srch02_RsltR.create();
				bfrR.pay_chk(bfrPayChkR);
			}
			return bfrR;
		}

		/**
		 * 引数の支払照合ヘッダに対応する今回仕入情報を取得する
		 */
		protected Map<MCNumber, MCList<MST_AP_D_R>> _apdL;
		protected void initApDL(MCList<PaySchd_Srch02_CndR> upL) {
			_apdL = new HashMap<>();

			MCList<MST_AP_D_R> dbc = getApDL();

			MCIndexKey idx = dbc.createIndex(MST_AP_D_R.$ap_d_no);
			for (PaySchd_Srch02_CndR r : upL) {
				if (!_apdL.containsKey(r.hdr_peg_no())) {
					_apdL.put(r.hdr_peg_no(), MCList.create(MST_AP_D_R.class));
				}
				_apdL.get(r.hdr_peg_no()).add(dbc.getFirst(idx, r.ap_d().ap_d_no()));
			}
		}
		protected MCList<MST_AP_D_R> getApDL(PaySchd_Srch02_RsltR hdrR) {
			MCList<MST_AP_D_R> apdL = _apdL.get(hdrR.hdr_peg_no());
			return apdL == null ? MCList.create(MST_AP_D_R.class) : apdL;
		}

		protected MCList<MST_AP_D_R> _apdOrgL;
		/**
		 * 上り電文に対応する買掛明細を取得する
		 * @return
		 */
		protected MCList<MST_AP_D_R> getApDL() {
			if (_apdOrgL != null) {
				return _apdOrgL;
			}
			MCList<MST_AP_D_R> work = MCList.create(MST_AP_D_R.class);
			up0().forEach(r -> work.add().ap_d_no(r.ap_d_no()));
			MCQueryApiBuilder work_bldr = MCQueryApiBuilder.create(MST_AP_D_R.create("T"));
			dbWkDelete("MSBHL5030_MSW_AP_D_D03", work_bldr.getBaseDbc());
			dbWkInsert("MSBHL5030_MSW_AP_D_I02", work.groupBy(work.createRow().getKeyColumn()), work_bldr.getBaseDbc());

			_apdOrgL = MCList.create(MST_AP_D_R.class);
			MST_AP_D_R t2 = MST_AP_D_R.create("T");
			MSW_AP_D_KEY_R w = MSW_AP_D_KEY_R.create("W");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t2);
			dbc_bldr.addInnerJoin(w, bracket(w.ap_d_no.eq(t2.ap_d_no)));
			dbSelect("MSBHL5030_MST_AP_D_S02", _apdOrgL, dbc_bldr);
			dbWkDelete("MSBHL5030_MSW_AP_D_D12", work_bldr.getBaseDbc());
			return _apdOrgL;
		}

		/**
		 * 引数の買掛明細から仕入金額を取得する
		 */
		protected MCNumber[] getPurcAmt(MCList<MST_AP_D_R> apdL) {
			MCNumber[] amt = new MCNumber[]{
				MCNumber.ZERO,	// 0 仕入
				MCNumber.ZERO,	// 1 仕入返品
				MCNumber.ZERO,	// 2 仕入値引(値増)
				MCNumber.ZERO,	// 3 取引通貨金額
				MCNumber.ZERO,	// 4 振替額（先）
			};
			
			for (MST_AP_D_R r : apdL) {
				MAM_ITM_R itmR = MSBHL_PaySchdRegService.getItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				amt[3] = r.trd_cur_amt()
					.multiply(getAmtDispPm(r.trd_ptn_typ(), itmR.dscnt_itm_flg()));

				if (MAC_TRD_PTN_TYP.isPURC(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XPNS(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_VMI(r.trd_ptn_typ())) {
					amt[0] = amt[0].add(amt[3]);
				}
				else if (MAC_TRD_PTN_TYP.isPURC_RTN(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(r.trd_ptn_typ())) {
					amt[1] = amt[1].add(amt[3]);
				}
				else if (MAC_TRD_PTN_TYP.isPURC_DSCNT(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XTRA(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_DSCNT_XPNS(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XTRA_XPNS(r.trd_ptn_typ())) {
					amt[2] = amt[2].add(amt[3]);
				}
				else if (MAC_TRD_PTN_TYP.isAPSW_IN_CHK(r.trd_ptn_typ())) {
					amt[4] = amt[4].add(amt[3]);
				}
			}
			return amt;
		}

		/**
		 * 引数の買掛明細から税額を取得する
		 */
		protected MCNumber getTaxAmt(MCList<MST_AP_D_R> apdL) {
			MCNumber amt = MCNumber.ZERO;
			for (MST_AP_D_R r : apdL) {
				MAM_ITM_R itmR = MSBHL_PaySchdRegService.getItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				amt = amt.add(
					r.trd_cur_tax_amt()
						.multiply(getAmtDispPm(r.trd_ptn_typ(), itmR.dscnt_itm_flg()))
				);
			}
			return amt;
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
			// down1 は setHdr で設定済み
		}
	}

	/**
	 * PaySchd_Srch06オペレーション.<p>
	 *
	 * 同一の支払照合ヘッダとして登録可能な買掛明細をまとめた結果に対して、今回支払金額を設定する<br>
	 */
	public class PaySchd_Srch06 extends MSBHL_PaySchdRegService_MC_A.PaySchd_Srch06 {

		/**
		 * 買掛明細まとめオペレーション
		 */
		protected MSBHL_PaySchdRegService.PaySchd_Srch02 _srch02;

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			initCache();
			editUp();
			setHdrCo();
			setDown();
		}

		public void editUp() {
			_srch02 = MSBHL_PaySchdRegService.crtPaySchd_Srch02();
		}

		/**
		 * 締年月日を除いたキーで支払照合ヘッダを取得する
		 */
		protected MCList<PaySchd_Srch02_RsltR>[] getHdrArray(MCList<PaySchd_Srch02_RsltR> hdrL) {
			return _srch02.getHdrArray(hdrL);
		}
		
		/**
		 * 繰越情報を設定する<br>
		 * 今回xx仕入額は paySchd_Srch02 で設定される
		 */
		protected void setHdrCo() {

			MCIndexKey idx = up1().createIndex(PaySchd_Srch02_PayActR.$hdr_peg_no);
			MCIndexKey idx2 = up2().createIndex(PaySchd_Srch02_AdvPayActR.$hdr_peg_no);

			// 支払照合ヘッダごと（締年月日は除く）
			MCList<PaySchd_Srch02_RsltR>[] hdrArray = getHdrArray(up0());
			MCList<PaySchd_Srch02_RsltR> clDtL = up0().subList(r -> !r.pay_spot_flg());
			initPayActL(hdrArray[0].get(0).not_lock_flg(), clDtL, up1());
			initAdvPayActL(clDtL, up2());

			for (MCList<PaySchd_Srch02_RsltR> hdrL : hdrArray) {
				PaySchd_Srch02_RsltR hdrR = hdrL.get(0);

				// 前回繰越分を取得
				PaySchd_Srch02_RsltR bfrR = hdrR.pay_spot_flg() ? null : getBfrPayChkR(hdrR, hdrArray);

				// 前渡金残高を設定
				setAdvPayBal(hdrL);
				hdrL.sort();
				// 締年月日ごとに繰越情報を設定
				for (int i=0; i<hdrL.size(); i++) {
					PaySchd_Srch02_RsltR r = hdrL.get(i);

					// 買掛明細なしの支払照合を含め、繰越情報の計算対象を設定
					setHdrCo(r, bfrR, i==0, up1().subList(idx, r.hdr_peg_no()), up2().subList(idx2, r.hdr_peg_no()));
					bfrR = r;

					down0().add(r);
				}
			}
		}

		/**
		 * 繰越情報を設定する
		 */
		protected void setHdrCo(
			PaySchd_Srch02_RsltR hdrR, PaySchd_Srch02_RsltR bfrR, boolean isFrst, MCList<PaySchd_Srch02_PayActR> up1L, MCList<PaySchd_Srch02_AdvPayActR> up2L) {

			if (hdrR.pay_spot_flg()) {
				// 前回締年月日
				hdrR.bfr_cl_dt(null);

				// 前回支払予定額
				hdrR.last_pay_schd_amt(null);
	
				// 今回支払額
				hdrR.account_amt(null);
				hdrR.cash_amt(null);
				hdrR.note_amt(null);
				hdrR.setoff_amt(null);
				hdrR.sw_amt(null);
	
				// 今回繰越額
				hdrR.bfw_amt(null);
	
				// 今回支払予定額
				hdrR.schd_pay_amt(
						sum(hdrR.purc_amt(), hdrR.purc_ret_amt(), hdrR.purc_dscnt_amt(), hdrR.tax_amt(), hdrR.sw_to_amt())
					);
			}
			else {

				// 前回締年月日
				hdrR.bfr_cl_dt(isNull(bfrR) ?  null : bfrR.bsppl_cl_dt());
	
				// 今回仕入情報、今回支払情報を取得
				PaySchd_Srch02_RsltR wkHdrR = hdrR.clone();
				MCList<MST_PAY_ACT_D_R> payActL = getPayActL(wkHdrR, up1L);
				
				// 照合対象の前渡金実績を取得
				MCList<MST_ADV_PAY_ACT_R> advPayActL = getAdvPayActL(wkHdrR, up2L);
	
				// 前回支払予定額
				hdrR.last_pay_schd_amt(isNull(bfrR) ? MCNumber.ZERO : bfrR.schd_pay_amt());
	
				// 今回支払額
				MCNumber[] payActAmt = getPayActAmt(payActL);
				hdrR.account_amt(payActAmt[0]);
				hdrR.cash_amt(payActAmt[1]);
				hdrR.note_amt(payActAmt[2]);
				hdrR.setoff_amt(payActAmt[3]);
				hdrR.sw_amt(payActAmt[4]);
				hdrR.setoff_tax_amt(payActAmt[5]);
				// 前渡金額
				MCNumber[] advPayAmt = getAdvPayAmt(advPayActL);
				hdrR.adv_pay_amt(advPayAmt[0]);
				hdrR.adv_pay_setoff_amt(advPayAmt[1]);
				hdrR.adv_pay_setoff_tax_amt(advPayAmt[2]);
	
				hdrR.bfw_amt(
						hdrR.last_pay_schd_amt().subtract(
							sum(hdrR.account_amt(), hdrR.cash_amt(), hdrR.note_amt(), hdrR.sw_amt())
						)
					);

				// 今回支払予定額
				hdrR.schd_pay_amt(
					hdrR.last_pay_schd_amt().add(
						sum(hdrR.purc_amt(), hdrR.purc_ret_amt(), hdrR.purc_dscnt_amt(), hdrR.sw_to_amt(), hdrR.tax_amt())
					).subtract(
						sum(hdrR.account_amt(), hdrR.cash_amt(), hdrR.note_amt(), hdrR.sw_amt(), hdrR.setoff_amt(), hdrR.setoff_tax_amt())
					)
				);

				// 今回xx支払額に算入した支払実績を下り電文に設定する
				for (MST_PAY_ACT_D_R actR : payActL) {
					PaySchd_Srch02_PayActR r = down1().add();
					r.hdr_peg_no(hdrR.hdr_peg_no());
					r.pay_act_d_no(actR.pay_act_d_no());
					r.pay_act_d_seq(actR.pay_act_d_seq());
					r.pay_chk_mng_no(actR.pay_chk_mng_no());
					r.upd_cntr(actR.getNumberNE("pay_chk_upd_cntr"));	// 支払照合ヘッダの更新カウンタ
					r.setAttributes(hdrR);
				}
				// 今回前渡金額に算入した前渡金実績を下り電文に設定する
				for (MST_ADV_PAY_ACT_R advPayActR : advPayActL) {
					PaySchd_Srch02_AdvPayActR r= down2().add();
					r.hdr_peg_no(hdrR.hdr_peg_no());
					r.adv_pay_act_no(advPayActR.adv_pay_act_no());
					r.adv_pay_act_seq(advPayActR.adv_pay_act_seq());
				}
			}
		}

		/**
		 * 支払照合ヘッダを管理するキーを作成する
		 * @param r
		 * @return
		 */
		protected List<Comparable<?>> crtPayChkKey(MST_PAY_CHK_R r) {
			List<Comparable<?>> key = new ArrayList<>();
			key.add(r.bsppl_cd());
			key.add(r.bsppl_dpt_cd());
			key.add(r.purc_act_no());
			key.add(r.rcpt_iv_mng_no());
			key.add(r.rcpt_iv_no());
			key.add(r.trd_cur_cd());
			key.add(r.wrk_no());
			return key;
		}

		/**
		 * 引数の支払照合ヘッダを今回締め分としたときの、前回締め分の支払照合ヘッダを取得する<br>
		 * 前回締めが存在しない場合は null を返す
		 */
		protected PaySchd_Srch02_RsltR getBfrPayChkR(PaySchd_Srch02_RsltR hdrR, MCList<PaySchd_Srch02_RsltR>[] hdrArray) {
			return _srch02.getBfrPayChkR(hdrR, hdrArray);
		}
		/**
		 * 前渡金残高を設定する。<br>
		 */
		protected void setAdvPayBal(MCList<PaySchd_Srch02_RsltR> cndChkL) {
			MCList<MST_ADV_PAY_ACT_R> dbc = MCList.create(MST_ADV_PAY_ACT_R.class);
			MST_ADV_PAY_ACT_R t = MST_ADV_PAY_ACT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			
			dbc.addNumberColumn("adv_pay_bal");
			dbc_bldr.setSelect(t.bsppl_cd);
			dbc_bldr.addSelect(t.bsppl_dpt_cd);
			dbc_bldr.addSelect(t.trd_cur_cd);
			dbc_bldr.setWhere(t.bsppl_cd.eq(bind("bsppl_cd")).and(t.bsppl_dpt_cd.eq(bind("bsppl_dpt_cd"))).and(t.trd_cur_cd.eq(bind("trd_cur_cd"))));
			dbc_bldr.setGroupBy(t.bsppl_cd, t.bsppl_dpt_cd, t.trd_cur_cd);
			dbc_bldr.addGroupFunc(sum(t.trd_cur_not_proc_bal), "adv_pay_bal");

			
			dbSelect("MSBHL5030_MST_ADV_PAY_ACT_S04", dbc, dbc_bldr, cndChkL.groupBy(PaySchd_Srch02_RsltR.$bsppl_cd, PaySchd_Srch02_RsltR.$bsppl_dpt_cd, PaySchd_Srch02_RsltR.$trd_cur_cd));
			
			MCIndexKey idxKey = dbc.createIndex(MST_ADV_PAY_ACT_R.$bsppl_cd, MST_ADV_PAY_ACT_R.$bsppl_dpt_cd, MST_ADV_PAY_ACT_R.$trd_cur_cd);
			for (PaySchd_Srch02_RsltR r : cndChkL) {
				MST_ADV_PAY_ACT_R advPayActR = dbc.getFirst(idxKey, r.bsppl_cd(), r.bsppl_dpt_cd(), r.trd_cur_cd());
				if (!isNull(advPayActR) && !advPayActR.isEmpty()) {
					r.adv_pay_bal(advPayActR.getNumberNE("adv_pay_bal"));
				}
				else {
					r.adv_pay_bal(0);
				}
			}
		}
		

		/**
		 * 引数の支払照合ヘッダに対応する今回支払情報を取得する
		 */
		protected Map<List<Comparable<?>>, MCList<MST_PAY_ACT_D_R>> _payActL;
		protected void initPayActL(boolean notLockFlg, MCList<PaySchd_Srch02_RsltR>hdrL, MCList<PaySchd_Srch02_PayActR> up1L) {
			_payActL = new HashMap<>();

			if (up1L.isEmpty() || isNull(up1L)) {
				return;
			}
			MCIndexKey up1Idx = up1L.createIndex(PaySchd_Srch02_PayActR.$hdr_peg_no);
			MST_PAY_ACT_R t2 = MST_PAY_ACT_R.create("T2");
			MST_PAY_CHK_R t3 = MST_PAY_CHK_R.create("T3");
			MSW_PAY_ACT_D_KEY_R w = MSW_PAY_ACT_D_KEY_R.create("W");

			MCList<MST_PAY_ACT_D_R> dbc = MCList.create(MST_PAY_ACT_D_R.class);
			MST_PAY_ACT_D_R t = MST_PAY_ACT_D_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc.addNumberColumn("pay_chk_upd_cntr");
			dbc_bldr.addSelect(t3.upd_cntr.as("pay_chk_upd_cntr"));
			dbc_bldr.addInnerJoin(t2, bracket(t2.pay_act_no.eq(t.pay_act_no)
					.and(t2.pay_act_seq.eq(t.pay_act_seq))));
			dbc_bldr.addInnerJoin(t3, bracket(t3.pay_chk_mng_no.eq(t.pay_chk_mng_no)));
			
			MCList<MST_PAY_ACT_D_R> workL = MCList.create(MST_PAY_ACT_D_R.class);
			up1L.forEach(r -> workL.add(r.pay_act_d()));
			MCQueryApiBuilder workL_bldr = MCQueryApiBuilder.create(t);
			dbWkDelete("MSBHL5030_MSW_PAY_ACT_D_D01", workL_bldr.getBaseDbc());
			dbWkInsert("MSBHL5030_MSW_PAY_ACT_D_I01", workL.groupBy(workL.createRow().getKeyColumn()), workL_bldr.getBaseDbc());

			dbc_bldr.addConstWhereWithAnd(exists(
				subQuery()
				.select(value("X"))
				.from(w)
				.where(w.pay_act_d_no.eq(t.pay_act_d_no)
						.and(w.pay_act_d_seq.eq(t.pay_act_d_seq))
				)
			));
			dbSelect("MSBHL5030_MST_PAY_ACT_D_S01", dbc, dbc_bldr);
			dbWkDelete("MSBHL5030_MSW_PAY_ACT_D_D02", dbc_bldr.getBaseDbc());

			if (!notLockFlg) {
				dbc.sort(dbc.createRow().getKeyColumn());
				
				MCQueryApiBuilder lockL_bldr = MCQueryApiBuilder.create(t);
				lockL_bldr.setOrderByAsc(lockL_bldr.getBaseDbc().getKeyColumn$());
				dbSelectKeyForUpdateNoFetch("MSBHL5030_MST_PAY_ACT_D_S02", lockL_bldr, dbc);
			}
			MCIndexKey dbcIdx = dbc.createIndex(MST_PAY_ACT_D_R.$pay_act_d_no, MST_PAY_ACT_D_R.$pay_act_d_seq);
			for (PaySchd_Srch02_RsltR r : hdrL) {
				MCList<PaySchd_Srch02_PayActR> upActL = up1L.subList(up1Idx, r.hdr_peg_no());
				if (isNull(upActL) || upActL.isEmpty()) {
					continue;
				}
				MCList<MST_PAY_ACT_D_R> wkL = dbc.createInstance();
				for (PaySchd_Srch02_PayActR upActR : upActL) {
					wkL.addAll(dbc.subList(dbcIdx, upActR.pay_act_d_no(), upActR.pay_act_d_seq()));
				}
				if (!isNull(wkL)) {
					setBillTaxDispFlg(wkL);
				}
				_payActL.put(crtPayChkKey(r.pay_chk()), wkL);
			}
		}
		/**
		 * 引数の支払照合ヘッダに対応する前渡金実績を取得する
		 */
		protected Map<List<Comparable<?>>, MCList<MST_ADV_PAY_ACT_R>> _advPayActL;
		protected void initAdvPayActL(MCList<PaySchd_Srch02_RsltR>hdrL, MCList<PaySchd_Srch02_AdvPayActR> up2L) {
			_advPayActL = new HashMap<>();
			if (up2L.isEmpty() || isNull(up2L)) {
				return;
			}
			MCIndexKey up2Idx = up2L.createIndex(PaySchd_Srch02_AdvPayActR.$hdr_peg_no);
			MCList<MST_ADV_PAY_ACT_R> dbc = MCList.create(MST_ADV_PAY_ACT_R.class);
			MST_ADV_PAY_ACT_R t = MST_ADV_PAY_ACT_R.create("T");
			MSW_ADV_PAY_ACT_KEY_R w = MSW_ADV_PAY_ACT_KEY_R.create("W");

			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.addInnerJoin(w, t.adv_pay_act_no.eq(w.adv_pay_act_no).and(t.adv_pay_act_seq.eq(w.adv_pay_act_seq)));
			
			MCList<MST_ADV_PAY_ACT_R> workL = MCList.create(MST_ADV_PAY_ACT_R.class);
			up2L.forEach(r -> workL.add(r.adv_pay_act()));
			MCQueryApiBuilder workL_bldr = MCQueryApiBuilder.create(t);
			dbWkDelete("MSBHL5030_MSW_ADV_PAY_ACT_D03", workL_bldr.getBaseDbc());
			dbWkInsert("MSBHL5030_MSW_ADV_PAY_ACT_I02", workL.groupBy(workL.createRow().getKeyColumn()), workL_bldr.getBaseDbc());
			
			dbSelect("MSBHL5030_MST_ADV_PAY_ACT_S05", dbc, dbc_bldr);
			
			MCIndexKey dbcIdx = dbc.createIndex(MST_ADV_PAY_ACT_R.$adv_pay_act_no, MST_ADV_PAY_ACT_R.$adv_pay_act_seq);
			for (PaySchd_Srch02_RsltR r : hdrL) {
				MCList<PaySchd_Srch02_AdvPayActR> upAdvPayActL = up2L.subList(up2Idx, r.hdr_peg_no());
				if (isNull(upAdvPayActL) || upAdvPayActL.isEmpty()) {
					continue;
				}
				MCList<MST_ADV_PAY_ACT_R> wkL = dbc.createInstance();
				for (PaySchd_Srch02_AdvPayActR upAdvPayActR : upAdvPayActL) {
					wkL.addAll(dbc.subList(dbcIdx, upAdvPayActR.adv_pay_act_no(), upAdvPayActR.adv_pay_act_seq()));
				}
				if (!isNull(wkL)) {
					setBillTaxDispFlg(wkL);
				}
				_advPayActL.put(crtPayChkKey(r.pay_chk()), wkL);
			}
		}
		protected MCList<MST_PAY_ACT_D_R> getPayActL(PaySchd_Srch02_RsltR hdrR, MCList<PaySchd_Srch02_PayActR> up1L) {
			if (_payActL == null || _payActL.isEmpty()) {
				return MCList.create(MST_PAY_ACT_D_R.class);
			}
			MCList<MST_PAY_ACT_D_R> actL = _payActL.get(crtPayChkKey(hdrR.pay_chk())), vldL = MCList.create(MST_PAY_ACT_D_R.class);
			if (isNull(actL) || actL.isEmpty()) {
				return MCList.create(MST_PAY_ACT_D_R.class);
			}
			MCIndexKey up1LKey = up1L.createIndex(MST_PAY_ACT_D_R.$pay_act_d_no, MST_PAY_ACT_D_R.$pay_act_d_seq);
			for (MST_PAY_ACT_D_R actR : actL.subList(r -> !r.getBooleanNE("done"))) {
				if (!up1L.isEmpty()) {
					if (!isNull(up1L.getFirst(up1LKey, actR.pay_act_d_no(), actR.pay_act_d_seq()))) {
						vldL.add(actR);
						actR.setBooleanNE("done", true);
					}
				}
			}
			return vldL;
		}
		protected MCList<MST_ADV_PAY_ACT_R> getAdvPayActL(PaySchd_Srch02_RsltR hdrR, MCList<PaySchd_Srch02_AdvPayActR> up2L) {
			if (_advPayActL == null || _advPayActL.isEmpty()) {
				return MCList.create(MST_ADV_PAY_ACT_R.class);
			}
			MCList<MST_ADV_PAY_ACT_R> advPayActL = _advPayActL.get(crtPayChkKey(hdrR.pay_chk())), vldL = MCList.create(MST_ADV_PAY_ACT_R.class);
			MCIndexKey up2LKey = up2L.createIndex(MST_ADV_PAY_ACT_R.$adv_pay_act_no, MST_ADV_PAY_ACT_R.$adv_pay_act_seq);
			for (MST_ADV_PAY_ACT_R advPayActR : advPayActL.subList(r -> !r.getBooleanNE("done"))) {
				if (!up2L.isEmpty()) {
					if (!isNull(up2L.getFirst(up2LKey, advPayActR.adv_pay_act_no(), advPayActR.adv_pay_act_seq()))) {
						vldL.add(advPayActR);
						advPayActR.setBooleanNE("done", true);
					}
				}
			}
			return vldL;
		}
		

		/**
		 * 引数の支払実績から預金の支払実績を取得する
		 */
		protected MCNumber[] getPayActAmt(MCList<MST_PAY_ACT_D_R> payActL) {
			MCNumber amt[] = new MCNumber[]{
				MCNumber.ZERO,	// 0 預金
				MCNumber.ZERO,	// 1 現金
				MCNumber.ZERO,	// 2 手形
				MCNumber.ZERO,	// 3 相殺
				MCNumber.ZERO,	// 4 振替
				MCNumber.ZERO	// 5 相殺税
				
			};
			for (MST_PAY_ACT_D_R r : payActL) {
				if (MAC_AP_STTL_TYP.isACNT(r.ap_sttl_typ())) {
					amt[0] = amt[0].add(r.trd_cur_amt());
				}
				else if (MAC_AP_STTL_TYP.isCASH(r.ap_sttl_typ())) {
					amt[1] = amt[1].add(r.trd_cur_amt());
				}
				else if (MAC_AP_STTL_TYP.isNOTE(r.ap_sttl_typ())) {
					amt[2] = amt[2].add(r.trd_cur_amt());
				}
				else if (MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())) {
					if (r.getBooleanNE(MAM_STTL_R.$bill_tax_disp_flg)) {
						amt[3] = amt[3].add(r.trd_cur_amt().subtract(nvl(r.trd_cur_com_paid_tax_amt(), MCNumber.ZERO)));
						amt[5] = amt[5].add(nvl(r.trd_cur_com_paid_tax_amt(), MCNumber.ZERO));
					}
					else {
						amt[3] = amt[3].add(r.trd_cur_amt());
					}
				}
				else if (MAC_AP_STTL_TYP.isWTAX(r.ap_sttl_typ())) {
					amt[3] = amt[3].add(r.trd_cur_amt().subtract(nvl(r.trd_cur_com_paid_tax_amt(), MCNumber.ZERO)));
					amt[5] = amt[5].add(nvl(r.trd_cur_com_paid_tax_amt(), MCNumber.ZERO));
				}
				else if (MAC_AP_STTL_TYP.isAPSW_OUT_CHK(r.ap_sttl_typ())
						|| MAC_AP_STTL_TYP.isAPSW_OUT_NOT_CHK(r.ap_sttl_typ())) {
					amt[4] = amt[4].add(r.trd_cur_amt());
				}
			}
			return amt;
		}
		/**
		 * 引数の前渡金実績から支払照合ヘッダに設定する金額を取得する
		 */
		protected MCNumber[] getAdvPayAmt(MCList<MST_ADV_PAY_ACT_R> advPayActL) {
			MCNumber amt[] = new MCNumber[]{
					MCNumber.ZERO,	// 0 前渡金支払額
					MCNumber.ZERO,	// 1 前渡金相殺額
					MCNumber.ZERO	// 2 前渡金相殺税額
			};
			for (MST_ADV_PAY_ACT_R r : advPayActL) {
				amt[0] = amt[0].add(r.trd_cur_amt());
				if (MAC_AP_STTL_TYP.isSETOFF(r.com_paid_ap_sttl_typ())) {
					if (r.getBooleanNE(MAM_STTL_R.$bill_tax_disp_flg)) {
						amt[1] = amt[1].add(r.trd_cur_com_paid().subtract(nvl(r.trd_cur_com_paid_tax_amt(), MCNumber.ZERO)));
						amt[2] = amt[2].add(nvl(r.trd_cur_com_paid_tax_amt(), MCNumber.ZERO));
					}
					else {
						amt[1] = amt[1].add(r.trd_cur_com_paid());
					}
				}
			}
			return amt;
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			// down0 は setHdr で設定済み
			// down1 は setHdrCo で設定済み
			// down2 は setHdrCo で設定済み
		}
	}

	/**
	 * PaySchd_Srch03オペレーション.<p>
	 *
	 * 支払予定作成可能な買掛明細を検索する。<br>
	 */
	public class PaySchd_Srch03 extends MSBHL_PaySchdRegService_MC_A.PaySchd_Srch03 {
		protected MCList<PaySchd_Srch03_RsltR> _rsltL;
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			editUp();
			srch();
			selectAuthorizedData();
			adjustTax();
			srchAfter();
			sort();
			setDown();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			if (up0().pay_spot_flg()) {
				if (isNullOrNullVal(up0().rcpt_iv_mng_no())) {
					up0().rcpt_iv_mng_no(null);
					up0().rcpt_iv_no(null);
				} else {
					up0().purc_act_no(null);
				}
			}
			else if (up0().upd_mode_flg()) {
				up0().purc_act_no(nullValToNull(up0().purc_act_no()));
				up0().rcpt_iv_mng_no(nullValToNull(up0().rcpt_iv_mng_no()));
				up0().rcpt_iv_no(nullValToNull(up0().rcpt_iv_no()));
			}
		}

		/**
		 * 買掛明細を検索する
		 */
		protected void srch() {
			_rsltL = MCList.create(PaySchd_Srch03_RsltR.class);
			MCQueryPlan sql = !up0().upd_mode_flg() ? MSBHL5030_MST_AP_D_S01() : MSBHL5030_MST_AP_D_S02();
			executeQuery(_rsltL, sql, up0());
		}

		/**
		 * ユーザが参照権限を持つデータのみ抽出する。
		 */
		protected void selectAuthorizedData() {
			_rsltL.setAll(
				_rsltL.subList(r -> readableDptCdDac(r.bsppl_dpt_cd()))
			);
		}
		
		/**
		 * 検索後処理
		 */
		protected void srchAfter() {
			_rsltL.forEach(r -> {
				r.base_cur_cd(getBaseCur().cur_cd());
				r.base_cur_nm(getBaseCur().cur_nm());
				r.pay_xrate(up0().pay_xrate());
			});

			setValuesDbc(up0(), _rsltL);

			for (PaySchd_Srch03_RsltR r : _rsltL) {
				MAM_ITM_R itmR = _cacheItm.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				r.amt_disp_pm(getAmtDispPm(r.trd_ptn_typ(), itmR.dscnt_itm_flg()));
				if (!r.sundry_itm_flg()) {
					r.itm_nm(itmR.itm_nm());
				}
				if (!isNull(r.trd_cur_upri())) {
					r.trd_cur_upri(r.trd_cur_upri().multiply(getUpriDispPm(r.trd_ptn_typ(), itmR.dscnt_itm_flg())));
				}
				if (!isNull(r.trd_cur_amt())) {
					r.trd_cur_amt(r.trd_cur_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.trd_cur_tax_amt())) {
					r.trd_cur_tax_amt(r.trd_cur_tax_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.trd_cur_dscnt_amt())) {
					r.trd_cur_dscnt_amt(r.trd_cur_dscnt_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.base_cur_upri())) {
					r.base_cur_upri(r.base_cur_upri().multiply(getUpriDispPm(r.trd_ptn_typ(), itmR.dscnt_itm_flg())));
				}
				if (!isNull(r.base_cur_amt())) {
					r.base_cur_amt(r.base_cur_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.base_cur_tax_amt())) {
					r.base_cur_tax_amt(r.base_cur_tax_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.base_cur_dscnt_amt())) {
					r.base_cur_dscnt_amt(r.base_cur_dscnt_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.trd_unit_qty())) {
					r.trd_unit_qty(r.trd_unit_qty().multiply(MAC_TRD_PTN_TYP.qty_disp_pm(r.trd_ptn_typ())));
				}
				if (!isNull(r.base_unit_qty())) {
					r.base_unit_qty(r.base_unit_qty().multiply(MAC_TRD_PTN_TYP.qty_disp_pm(r.trd_ptn_typ())));
				}
				if (!isNull(r.wtax_amt())) {
					r.wtax_amt(r.wtax_amt().multiply(r.amt_disp_pm()));
				}

				// 税込金額
				r.trd_cur_inc_tax_amt(
					r.trd_cur_amt().add(r.trd_cur_tax_amt())
				);
				r.base_cur_inc_tax_amt(
					r.base_cur_amt().add(r.base_cur_tax_amt())
				);
				if (!isNull(r.trd_cur_proc_upri())) {
					r.trd_cur_proc_upri(r.trd_cur_proc_upri().multiply(getUpriDispPm(r.trd_ptn_typ(), itmR.dscnt_itm_flg())));
				}
				if (!isNull(r.trd_cur_proc_amt())) {
					r.trd_cur_proc_amt(r.trd_cur_proc_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.trd_cur_onr_prov_upri())) {
					r.trd_cur_onr_prov_upri(r.trd_cur_onr_prov_upri().multiply(getUpriDispPm(r.trd_ptn_typ(), itmR.dscnt_itm_flg())));
				}
				if (!isNull(r.trd_cur_onr_prov_amt())) {
					r.trd_cur_onr_prov_amt(r.trd_cur_onr_prov_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.base_cur_proc_upri())) {
					r.base_cur_proc_upri(r.base_cur_proc_upri().multiply(getUpriDispPm(r.trd_ptn_typ(), itmR.dscnt_itm_flg())));
				}
				if (!isNull(r.base_cur_proc_amt())) {
					r.base_cur_proc_amt(r.base_cur_proc_amt().multiply(r.amt_disp_pm()));
				}
				if (!isNull(r.base_cur_onr_prov_upri())) {
					r.base_cur_onr_prov_upri(r.base_cur_onr_prov_upri().multiply(getUpriDispPm(r.trd_ptn_typ(), itmR.dscnt_itm_flg())));
				}
				if (!isNull(r.base_cur_onr_prov_amt())) {
					r.base_cur_onr_prov_amt(r.base_cur_onr_prov_amt().multiply(r.amt_disp_pm()));
				}
			}
		}

		/**
		 * 消費税差額調整を行う
		 */
		protected void adjustTax() {
			if (!up0().srch_tax_diff_flg()) {
				return;
			}
			
			// srch_tax_diff_flg=オンの場合（支払予定登録から呼ばれた場合）、from, to には同じ日付が設定されている
			MCDate xrateBaseDt = nvl(up0().bsppl_cl_dt_fr(), up0().reg_dt());
			
			MSBHL_PaySchdRegService.PaySchd_Srch05 o = MSBHL_PaySchdRegService.crtPaySchd_Srch05();
			setAll(o.up0(), _rsltL, createMap_PaySchd_Srch05_CndR_PaySchd_Srch03_RsltR());
			o.up0().forEach(r -> {
				r.hdr_peg_no(0);
				r.pay_xrate(up0().pay_xrate());
				r.xrate_base_dt(xrateBaseDt);
			});
			o.up1().setAll(up2());
			o.up1().forEach(r -> {
				r.hdr_peg_no(0);
				r.pay_xrate(up0().pay_xrate());
				r.xrate_base_dt(xrateBaseDt);
			});
			o.up2().setAll(up3());
			o.up2().forEach(r -> {
				r.hdr_peg_no(0);
				r.pay_xrate(up0().pay_xrate());
				r.xrate_base_dt(xrateBaseDt);
			});
			o.exec();
			if (!o.down0().isEmpty()) {
				for (PaySchd_Srch05_RsltR downR : o.down0()) {
					PaySchd_Srch03_RsltR r = _rsltL.add();
					r.setValuesByName(downR.ap_d(), MST_AP_D_R.colnames());
					r.ref_ap_d_no(downR.ref_ap_d_no());
				}
			}
		}
		protected Map_PaySchd_Srch05_CndR_PaySchd_Srch03_RsltR<PaySchd_Srch05_CndR,PaySchd_Srch03_RsltR> createMap_PaySchd_Srch05_CndR_PaySchd_Srch03_RsltR() {
			return new Map_PaySchd_Srch05_CndR_PaySchd_Srch03_RsltR<PaySchd_Srch05_CndR, PaySchd_Srch03_RsltR>();
		}
		public class Map_PaySchd_Srch05_CndR_PaySchd_Srch03_RsltR<D extends PaySchd_Srch05_CndR, S extends PaySchd_Srch03_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PaySchd_Srch05_CndR.$ap_d_no, PaySchd_Srch03_RsltR.$ap_d_no);
				addColumnPathMap(PaySchd_Srch05_CndR.$trd_cur_tax_amt, PaySchd_Srch03_RsltR.$trd_cur_tax_amt);
			}
			@Override
			public void copy(D dest, S src) {
				super.copy(dest, src);
				if (src.repurc_obli_flg()) {
					dest.trd_cur_amt(src.trd_cur_proc_amt());
				}
				else {
					dest.trd_cur_amt(src.trd_cur_amt());
				}
				dest.xrate_base_dt(nvl(src.bsppl_cl_dt(), up0().reg_dt()));
			}
		}

		/**
		 * 下り電文をソートする
		 */
		protected void sort() {
			_rsltL.sort(
				PaySchd_Srch03_RsltR.$trd_ptn_typ,
				PaySchd_Srch03_RsltR.$trd_cd,
				PaySchd_Srch03_RsltR.$purc_act_no,
				PaySchd_Srch03_RsltR.$purc_act_d_no,
				PaySchd_Srch03_RsltR.$trd_ptn_typ
			);
		}

		/**
		 * 下り電文を設定する<br>
		 * ただし PaySchd_Srch03_RqstNoCnd として上ってきたリストは除く
		 */
		protected void setDown() {
			if (up1().isEmpty()) {
				down0().setAll(_rsltL);
			}
			else {
				MCIndexKey idxKey = up1().createIndex(PaySchd_Srch03_RqstNoCndR.$ap_d_no);
				for (PaySchd_Srch03_RsltR r : _rsltL) {
					PaySchd_Srch03_RqstNoCndR tmp = up1().getFirst(idxKey,r.ap_d_no());
					if (isNull(tmp)) {
						down0().add(r);
					}
				}
			}
		}


	}
	
	protected void setValuesDbc(MCRow upR, MCList<? extends MCConstRow> down) {
		setValuesDbc(MSBHL5030_PaySchd_Srch03_RsltR_J01(), upR, down);

		initDbcDbcCache(upR, down);
	}
	
	protected void initDbcDbcCache(MCRow upR, MCList<? extends MCConstRow> down) {
		initDbcCacheItm(down);
	}
	protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm;
	protected void initDbcCacheItm(MCList<? extends MCConstRow> down) {
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder itm_bldr = MCQueryApiBuilder.create(t);
		
		itm_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3);
		itm_bldr.addSelect(t.dscnt_itm_flg);
		itm_bldr.addSelect(t.itm_nm);
		
		_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(itm_bldr, down,
				PaySchd_Srch03_RsltR.$itm_cd, PaySchd_Srch03_RsltR.$itm_sub1,
				PaySchd_Srch03_RsltR.$itm_sub2, PaySchd_Srch03_RsltR.$itm_sub3);
	}	

	/**
	 * PaySchd_Srch04オペレーション.<p>
	 *
	 * 金額に応じた支払予定日を取得する<br>
	 */
	public class PaySchd_Srch04 extends MSBHL_PaySchdRegService_MC_A.PaySchd_Srch04 {
		@Override
		protected boolean isDelFlgCtl() {
			return true;
		}
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			setPaySchdDt();
			setDown();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {

			// 支払予定管理先情報を取得する
			MCList<MAM_BP_R> bspplL = MCList.create(MAM_BP_R.class);
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bspplL_bldr = MCQueryApiBuilder.create(t);
			bspplL_bldr.setWhere(t.bp_cd.eq(bind("bsppl_cd")));
			dbSelect("MSBHL5030_MAM_BP_S03", bspplL, bspplL_bldr, up0().groupBy(PaySchd_Srch04_CndR.$bsppl_cd));

			// 支払予定管理先情報をキャッシュする
			MSBHL_PaySchdRegService.setBp(bspplL);

			for (PaySchd_Srch04_CndR r : up0()) {
				r.base_dt(nvl(r.base_dt(), getToday()));
			}
		}

		/**
		 * 支払予定日を設定する
		 */
		protected void setPaySchdDt() {
			for (PaySchd_Srch04_CndR r : up0()) {
				r.pay_schd_dt(getPaySchdDt(r));
			}
		}

		/**
		 * 支払予定日取得<br /> 
		 * 
		 * 基準日と支払予定制御マスタ情報から支払予定日を取得する。
		 * 
		 * @param upR 上り電文
	 	 * 
		 * @return 支払予定日
		 */
		protected MCDate getPaySchdDt(PaySchd_Srch04_CndR upR) {	
			// 支払予定管理先締年月日がnullの場合は支払予定日をnullとする
			if (isNull(upR.bsppl_cl_dt())) {
				return null;
			}

			// 支払予定制御マスタ情報取得
			MAM_PAY_SCHD_CTL_R paySchdCtlR = MSBHL_PaySchdRegService.getPaySchdCtl(
				upR.bsppl_cd(), upR.bsppl_dpt_cd(), upR.cur_cd(), upR.sttl_cd(), upR.min_amt(), upR.bsppl_cl_dt()).get(0);

			// 支払日、支払サイトの取得
			MCNumber[] payInfo = getPayDay(paySchdCtlR, upR.bsppl_cd(), upR.bsppl_cl_dt());

			// 支払予定日の算出
			MCDate paySchdDt = getPaySchdDt(paySchdCtlR, upR.bsppl_cl_dt(), payInfo[0], payInfo[1]);

			// 休日を考慮
			paySchdDt = adjustPaySchdDt(paySchdDt, upR);

			return paySchdDt;
		}

		/**
		 * 支払予定日算出<br />
		 * 
		 * 支払予定日を算出する。
		 * 
	 	 * @param paySchdCtlR 支払予定制御マスタ情報
		 * @param bspplClDt 支払予定管理先締年月日
		 * @param payDay 指定の日付(0:締日なし《締日算出の場合のみ》/99:末日)
		 * @param payCrryovrMons 支払サイト
		 * 
		 * @return 算出した日付
		 */
		protected MCDate getPaySchdDt(MAM_PAY_SCHD_CTL_R paySchdCtlR, MCDate bspplClDt, MCNumber payDay, MCNumber payCrryovrMons) {

			MCDate ret = bspplClDt;

			// サイト区分が「月」の時
			if (MAC_CRRYOVR_MONS_TYP.isMM(paySchdCtlR.crryovr_mons_typ())) {

				// 支払予定日、又は支払サイトがNULLの時は NULL を返す
				if (isNull(payDay) || isNull(payCrryovrMons)) {
					return null;
				}
				// 支払予定管理先締年月日に対して支払サイトを加算する
				ret = ret.addMonth(payCrryovrMons);

				// 支払予定管理先締年月日 > 支払予定日の場合は、支払予定管理先締年月日に対して支払サイト１を加算
				if (bspplClDt.getDay() > payDay.intValue()) {
					ret = ret.addMonth(MCNumber.ONE);
				}
				// 支払日の設定
				// 月の最大日が実支払予定日より大きい場合
				if (ret.endOfMonth().getDay() > payDay.intValue()) {
					// (例) ret = 2002/05/01 + (15 - 1) = 2002/05/15
					ret = toYM(ret).addDay(payDay.subtract(MCNumber.ONE));
				}
				// 月の最大日が実支払予定日以下の場合
				else {
					ret = ret.endOfMonth();
				}
			}
			// サイト区分が「日」の時
			else {
				// 支払サイトがNULLの時は　NULL を返す
				if (isNull(payCrryovrMons)) {
					return null;
				}
				// 支払予定管理先締年月日に対して支払サイトを加算した結果を支払予定日として設定する。
				ret = ret.addDay(payCrryovrMons);
			}
			return ret;
		}

		/**
		 * 支払日取得<br />
		 * 
		 * 支払予定日取得で採用する支払日を返す。
		 * 
		 * @param paySchdCtlR 支払予定制御マスタ情報
		 * @param bspplCd 支払予定管理先ＣＤ
		 * @param bspplYmd 支払予定管理先締年月日
		 * 
		 * @return MCNumber[]{支払予定日取得で採用する支払日、支払サイト}
		 */
		protected MCNumber[] getPayDay(MAM_PAY_SCHD_CTL_R paySchdCtlR, String bspplCd, MCDate bspplYmd) {
			// 支払予定管理先情報取得
			MAM_BP_R bpR = MSBHL_PaySchdRegService.getBp(bspplCd);

			// 締日のリストを取得
			List<MCNumber> clDayL = getClDayL(bpR);

			// 締日の指定が無い場合は固定で支払日１を採用する
			if (clDayL.isEmpty()) {
				return new MCNumber[] {paySchdCtlR.pay_day1(), paySchdCtlR.pay_crryovr_mons1()};
			}

			// 締日の指定がある場合は、最も近い支払予定管理先締日に対応した支払日を採用する
			else {
				MCNumber bspplClDay = null;
				for (MCNumber clDay : clDayL) {
					//  支払締日が月末の場合、無条件で月末が支払日
					if (bspplYmd.endOfMonth().getDay() <= clDay.intValue()) {
						bspplClDay = clDay;
						break;
					}
					// 基準日が締まっていない場合、基準日の月の支払締日が支払日
					else if (bspplYmd.getDay() <= clDay.intValue()) {
						bspplClDay = clDay;
						break;
					}
					bspplClDay = clDay;
				}

				// 対応する支払日、支払サイトを返す
				if (isSame(bpR.psppl_cl_day1(), bspplClDay)) {
					return new MCNumber[] {paySchdCtlR.pay_day1(), paySchdCtlR.pay_crryovr_mons1()};
				}
				else if (isSame(bpR.psppl_cl_day2(), bspplClDay)) {
					return new MCNumber[] {paySchdCtlR.pay_day2(), paySchdCtlR.pay_crryovr_mons2()};
				}
				else if (isSame(bpR.psppl_cl_day3(), bspplClDay)) {
					return new MCNumber[] {paySchdCtlR.pay_day3(), paySchdCtlR.pay_crryovr_mons3()};
				}
				else if (isSame(bpR.psppl_cl_day4(), bspplClDay)) {
					return new MCNumber[] {paySchdCtlR.pay_day4(), paySchdCtlR.pay_crryovr_mons4()};
				}
				else {
					return new MCNumber[] {paySchdCtlR.pay_day5(), paySchdCtlR.pay_crryovr_mons5()};
				}
			}
		}

		/**
		 * 締日リスト取得<br />
		 * 
		 * 引数の取引先（支払予定管理先）より締日を抽出して返す
		 * 
		 * @param bpR 取引先
		 * 
		 * @return 取引先の締日のリスト
		 */
		protected List<MCNumber> getClDayL(MAM_BP_R bpR) {
			List<MCNumber> l = new ArrayList<MCNumber>();

			if (!isNull(bpR.psppl_cl_day1())) {
				l.add(bpR.psppl_cl_day1());
			}
			if (!isNull(bpR.psppl_cl_day2())) {
				l.add(bpR.psppl_cl_day2());
			}
			if (!isNull(bpR.psppl_cl_day3())) {
				l.add(bpR.psppl_cl_day3());
			}
			if (!isNull(bpR.psppl_cl_day4())) {
				l.add(bpR.psppl_cl_day4());
			}
			if (!isNull(bpR.psppl_cl_day5())) {
				l.add(bpR.psppl_cl_day5());
			}

			Collections.sort(l);

			return l;
		}
	
		/**
		 * 休日を考慮して引数の支払予定日（paySchdDt）を調整する。
		 * 
		 * @param paySchdDt 支払予定日
		 * @param upR 上り電文
		 * @return 休日を考慮して支払予定日を調整した結果の日付
		 */
		protected MCDate adjustPaySchdDt(MCDate paySchdDt, PaySchd_Srch04_CndR upR) {
			if (isNull(paySchdDt)) {
				return null;
			}

			MAM_BP_R bpR = MSBHL_PaySchdRegService.getBp(upR.bsppl_cd());
	
			// 決済方法別に日付を調整
			// 「預金」or「預金（手数料）」の場合
			if (MAC_AP_STTL_TYP.is_req_bank_ac(MSBHL_PaySchdRegService.getApSttl(upR.sttl_cd()).ap_sttl_typ())) {

				// 口座に対応する銀行カレンダ取得
				String dptBankCalCd = null;
				if (!isNull(bpR.pay_bank_ac_cd())) {
					MAM_BANK_AC_R bankAcR = MSBHL_PaySchdRegService.getBankAc(bpR.pay_bank_ac_cd());
					dptBankCalCd = bankAcR.getStringNE("bank_cal_cd");
				}

				// 銀行カレンダが営業日の日付
				MCDate dt = MAUCL_DateUtil.getBusinessDay(paySchdDt, bpR.pay_schd_ba_typ(), dptBankCalCd, null);
				return dt;
			}
			else {
				// 支払予定管理先部門のカレンダで営業日の日付
				MAM_DPT_R dptR = MSBHL_PaySchdRegService.getDpt(upR.bsppl_dpt_cd(), upR.base_dt());
				MCDate dt = MAUCL_DateUtil.getBusinessDay(paySchdDt, bpR.pay_schd_ba_typ(), null, dptR.cal_cd());
				return dt;
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
	 * PaySchd_Srch05オペレーション.<p>
	 *
	 * 支払予定鑑の単位に消費税差額を算出し、差額分の買掛明細を取得する<br>
	 */
	public class PaySchd_Srch05 extends MSBHL_PaySchdRegService_MC_A.PaySchd_Srch05 {
		/**
		 * 処理対象のリスト
		 */
		protected MCList<PaySchd_Srch05_CndR> _procL = MCList.create(PaySchd_Srch05_CndR.class);
		/**
		 * 差額分の買掛明細
		 */
		protected Map<MCNumber, MCList<PaySchd_Srch05_RsltR>> _regMap = new HashMap<>();

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 前提：支払照合ヘッダごとに上り電文のヘッダ紐付けＮＯが設定されていること
			initCache();
			editUp();
			adjustTax();
			setDown();
		}

		@Override
		protected boolean isDelFlgCtl() {
			return true;
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			// 上り電文の買掛明細・支払予定・支払実績のいずれも未設定なら、処理対象行を設定しない。
			// （前渡金実績のみでは処理不可）
			if ((isNull(up0()) || up0().isEmpty()) &&
				(isNull(up1()) || up1().isEmpty()) &&
				(isNull(up2()) || up2().isEmpty())
			) {
				return;
			}
			editUpApd();
			editUpPayAct();
			editUpAdvPayAct();
		}
		protected void editUpApd() {
		 	// 上り電文に対応する買掛明細を取得する
			MCList<MST_AP_D_R> work = MCList.create(MST_AP_D_R.class);
			up0().forEach(r -> {
				work.add().ap_d_no(nvl(r.ap_d_no(), r.ref_ap_d_no()));
			});
			MCQueryApiBuilder work_bldr = MCQueryApiBuilder.create(MST_AP_D_R.create("T"));
			dbWkDelete("MSBHL5030_MSW_AP_D_D04", work_bldr.getBaseDbc());
			dbWkInsert("MSBHL5030_MSW_AP_D_I03", work.groupBy(work.createRow().getKeyColumn()), work_bldr.getBaseDbc());

			MCList<MST_AP_D_R> dbc = MCList.create(MST_AP_D_R.class);
			dbc.addNumberColumn(MAM_TAX_R.$tax_rate);
			dbc.addBooleanColumn(MAM_TAX_R.$inc_tax_flg);
			MST_AP_D_R t1 = MST_AP_D_R.create("T");
			MSW_AP_D_KEY_R w = MSW_AP_D_KEY_R.create("W");
			MAM_TAX_R m1 = MAM_TAX_R.create("M1");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t1);
			dbc_bldr.addSelect(m1.tax_rate, m1.inc_tax_flg);
			dbc_bldr.addInnerJoin(w, bracket(w.ap_d_no.eq(t1.ap_d_no)));
			dbc_bldr.addLeftOuterJoin(m1, m1.tax_cd.eq(t1.tax_cd));
			dbSelect("MSBHL5030_MST_AP_D_S03", dbc, dbc_bldr);
			if (isNull(dbc) || dbc.isEmpty()) {
				return;
			}

			MCIndexKey idx = dbc.createIndex(MST_AP_D_R.$ap_d_no);
			for (PaySchd_Srch05_CndR r : up0()) {
				MST_AP_D_R apDR = dbc.getFirst(idx, nvl(r.ap_d_no(), r.ref_ap_d_no()));
				r.ap_d(apDR);
				r.tax_rate(apDR.getNumberNE(MAM_TAX_R.$tax_rate));
				if (isSame(apDR.trd_cur_cd(), getCo().base_cur_cd())) {
					r.base_cur_tax_amt(r.trd_cur_tax_amt());
				}
				else if (isSame(r.trd_cur_tax_amt(), apDR.trd_cur_tax_amt())) {
					// 全額支払
					r.base_cur_tax_amt(apDR.base_cur_tax_amt());
				}
				else {
					// 一部支払
					r.base_cur_tax_amt(
						convToBaseCur(
							r.trd_cur_tax_amt(), apDR.xrate(), getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
				}
			}
			dbWkDelete("MSBHL5030_MSW_AP_D_D05", work_bldr.getBaseDbc());

			// 支払予定管理先ＣＤを取得する
			MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
			MAM_BP_R t2 = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(t2);
			bpL_bldr.setWhere(t2.bp_cd.eq(bind("bsppl_cd")));
			dbSelect("MSBHL5030_MAM_BP_S04", bpL, bpL_bldr, up0().groupBy(PaySchd_Srch05_CndR.$bsppl_cd));
			MSBHL_PaySchdRegService.setBp(bpL);

			// 品目情報をキャッシュする
			MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));
			dbSelectKey("MSBHL5030_MAM_ITM_S03", itmL, itmL_bldr, up0().innerRowList("ap_d"));
			MSBHL_PaySchdRegService.setItm(itmL);
			MCList<MST_AP_D_R> itmErrL = MCList.create(MST_AP_D_R.class);
			
			for (PaySchd_Srch05_CndR r : up0()) {
				MST_AP_D_R apdR = r.ap_d();
				// 金額符号の調整
				MAM_ITM_R itmR = MSBHL_PaySchdRegService.getItm(apdR.itm_cd(), apdR.itm_sub1(), apdR.itm_sub2(), apdR.itm_sub3());
				if (isNull(itmR) || itmR.isEmpty()) {
					itmErrL.add(apdR);
					continue;
				}
				MCNumber pm = getAmtDispPm(apdR.trd_ptn_typ(), itmR.dscnt_itm_flg());
				if (!isNull(r.trd_cur_amt())) {
					r.trd_cur_amt(r.trd_cur_amt().multiply(pm));
				}
				if (!isNull(r.trd_cur_tax_amt())) {
					r.trd_cur_tax_amt(r.trd_cur_tax_amt().multiply(pm));
				}
				if (!isNull(r.base_cur_tax_amt())) {
					r.base_cur_tax_amt(r.base_cur_tax_amt().multiply(pm));
				}
			}
			if (!itmErrL.isEmpty()) {
				itmErrL.setAll(itmErrL.distinctNE("itm_cd", "itm_sub1", "itm_sub2", "itm_sub3"));
				MCMessageList msgL = new MCMessageList();
				for (MST_AP_D_R errR :itmErrL) {
					msgL.add(new MCMessage(MAUAL0189,
							toDispItm(errR.itm_cd(), errR.itm_sub1(), errR.itm_sub2(), errR.itm_sub3()),
							toDispGUIIndex(MCRow.create())));
				}
				int i = 0;
				MCAppException ex = new MCAppException(msgL.get(0));
				for (MCMessage aMsg : msgL) {
					if (i > 0) {
						ex.addCauseMessage(aMsg);
					}
					i++;
				}
				throw ex;
			}
			_procL.addAll(up0());
		}
		protected void editUpPayAct() {
		 	// 上り電文に対応する支払実績を取得する
			if (up1().isEmpty() || isNull(up1())) {
				return;
			}
			MCIndexKey idx = up1().createIndex(PaySchd_Srch03_CndPayActR.$pay_act_d_no, PaySchd_Srch03_CndPayActR.$pay_act_d_seq);
			MCList<MST_PAY_ACT_D_R> work = MCList.create(MST_PAY_ACT_D_R.class);
			up1().forEach(r -> {
				MST_PAY_ACT_D_R insR = MST_PAY_ACT_D_R.create();
				insR.pay_act_d_no(r.pay_act_d_no());
				insR.pay_act_d_seq(r.pay_act_d_seq());
				work.add(insR);
			});
			MCQueryApiBuilder work_bldr = MCQueryApiBuilder.create(MST_PAY_ACT_D_R.create("T"));
			dbWkDelete("MSBHL5030_MSW_PAY_ACT_D_D03", work_bldr.getBaseDbc());
			dbWkInsert("MSBHL5030_MSW_PAY_ACT_D_I02", work, work_bldr.getBaseDbc());
			
			MCList<MST_PAY_ACT_D_R> dbc = MCList.create(MST_PAY_ACT_D_R.class);
			dbc.addStringColumn(MST_PAY_ACT_R.$trd_cur_cd);
			dbc.addNumberColumn(MAM_TAX_R.$tax_rate);
			dbc.addBooleanColumn(MAM_TAX_R.$inc_tax_flg);
			dbc.addNumberColumn("hdr_peg_no");
			MST_PAY_ACT_D_R t1 = MST_PAY_ACT_D_R.create("T1");
			MST_PAY_ACT_R t2 = MST_PAY_ACT_R.create("T2");
			
			MSW_PAY_ACT_D_KEY_R w = MSW_PAY_ACT_D_KEY_R.create("W");
			MAM_TAX_R m1 = MAM_TAX_R.create("M1");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t1);
			dbc_bldr.addSelect(t2.trd_cur_cd);
			dbc_bldr.addSelect(m1.tax_rate);
			dbc_bldr.addSelect(m1.inc_tax_flg);
			dbc_bldr.addInnerJoin(w, bracket(w.pay_act_d_no.eq(t1.pay_act_d_no).and(w.pay_act_d_seq.eq(t1.pay_act_d_seq))));
			dbc_bldr.addInnerJoin(m1, m1.tax_cd.eq(t1.trd_cur_com_paid_tax_cd));
			dbc_bldr.addInnerJoin(t2, t1.pay_act_no.eq(t2.pay_act_no).and(t1.pay_act_seq.eq(t2.pay_act_seq)));
			// 相殺のみ対象にする
			dbc_bldr.addWhereWithAnd(t1.ap_sttl_typ.eq(value(MAC_AP_STTL_TYP.SETOFF.value())));
			dbSelect("MSBHL5030_MST_PAY_ACT_D_S08", dbc, dbc_bldr);
			dbWkDelete("MSBHL5030_MSW_PAY_ACT_D_D04", work_bldr.getBaseDbc());
			
			dbc.forEach(r -> {
				PaySchd_Srch03_CndPayActR up1R = up1().getFirst(idx, r.pay_act_d_no(), r.pay_act_d_seq());
				r.setNumberNE("hdr_peg_no", up1R.hdr_peg_no());
				r.setNumberNE("pay_xrate", up1R.pay_xrate());
				r.setDateNE("xrate_base_dt", up1R.xrate_base_dt());
			});
			
			MCList<MST_PAY_ACT_D_R> srchTgtL = MCList.create(MST_PAY_ACT_D_R.class);
			if (dbc.size() > 0) {
				// 支払予定管理先ＣＤを取得する
				MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
				MAM_BP_R bpR = MAM_BP_R.create("BP");
				MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(bpR);
				bpL_bldr.setWhere(bpR.bp_cd.eq(bind("bsppl_cd")));
				dbSelect("MSBHL5030_MAM_BP_S06", bpL, bpL_bldr, dbc.groupBy(MST_PAY_ACT_D_R.$bsppl_cd));
				MSBHL_PaySchdRegService.setBp(bpL);
				
				MCList<PaySchd_Srch05_CndR> l = MCList.create(PaySchd_Srch05_CndR.class);
				for (MST_PAY_ACT_D_R r: dbc) {
					MAM_STTL_R sttlR = getSttlCache(r.ap_sttl_cd());
					if (!isNull(sttlR) && !sttlR.bill_tax_disp_flg()) {
						continue;
					}
					// 金額符号を反転する
					r.trd_cur_amt(r.trd_cur_amt().multiply(-1));
					r.trd_cur_com_paid_tax_amt(r.trd_cur_com_paid_tax_amt().multiply(-1));
					r.base_cur_com_paid_tax_amt(r.base_cur_com_paid_tax_amt().multiply(-1));
					PaySchd_Srch05_CndR cndR = getCopyBaseApd(r.getNumberNE("hdr_peg_no"));
					if (isNull(cndR)) {
						srchTgtL.add(r);
					}
					else {
						copy(cndR, r, createMap_PaySchd_Srch05_CndR_MST_PAY_ACT_D_R());
						l.add(cndR);
					}
				}
				getApDLByPayAct(srchTgtL, l);
				_procL.addAll(l);
			}
		}
		protected void getApDLByPayAct(MCList<MST_PAY_ACT_D_R> payActDL, MCList<PaySchd_Srch05_CndR> l) {
			if (payActDL.isEmpty() || isNull(payActDL)) {
				return;
			}
			String[] keys = {
					MST_AP_D_R.$bsppl_cd,
					MST_AP_D_R.$bsppl_dpt_cd,
					MST_AP_D_R.$trd_cur_cd
			};
			MCList<MST_AP_D_R> dbc = MCList.create(MST_AP_D_R.class);
			dbc.addStringColumn("tax_rate");
			MST_AP_D_R t1 = MST_AP_D_R.create("T1");
			MAM_TAX_R m1 = MAM_TAX_R.create("M1");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t1);
			
			dbc_bldr.addSelect(m1.tax_rate);
			dbc_bldr.addInnerJoin(m1, t1.tax_cd.eq(m1.tax_cd));
			dbc_bldr.setWhere(t1.bsppl_cd.eq(bind("bsppl_cd"))
										.and(t1.bsppl_dpt_cd.eq(bind("bsppl_dpt_cd")))
										.and(t1.trd_cur_cd.eq(bind("trd_cur_cd"))));
			dbc_bldr.addWhereWithAnd(t1.trd_ptn_typ.neq(value(MAC_TRD_PTN_TYP.TAX_DIFF_PAY_SCHD_CL.value())));
			dbc_bldr.setOrderByDesc(t1.ap_d_no);
			dbSelect("MSBHL5030_MST_AP_D_S13", dbc, dbc_bldr, payActDL.groupByNE(keys));
			MCIndexKey idx = dbc.createIndex(keys);
			
			for (MST_PAY_ACT_D_R payActDR : payActDL) {
				PaySchd_Srch05_CndR cndR = PaySchd_Srch05_CndR.create();
				MST_AP_D_R apDR = dbc.getFirst(idx, payActDR.toArray(keys));
				cndR.ap_d(apDR);
				cndR.ap_d_no(apDR.ap_d_no());
				cndR.trd_cur_cd(apDR.trd_cur_cd());
				copy(cndR, payActDR, createMap_PaySchd_Srch05_CndR_MST_PAY_ACT_D_R());
				l.add(cndR);
			}
		}
		protected void editUpAdvPayAct() {
		 	// 上り電文に対応する前渡金実績を取得する
			if (up2().isEmpty() || isNull(up2())) {
				return;
			}
			MCIndexKey idx = up2().createIndex(PaySchd_Srch03_CndAdvPayActR.$adv_pay_act_no, PaySchd_Srch03_CndAdvPayActR.$adv_pay_act_seq);
			MCList<MST_ADV_PAY_ACT_R> work = MCList.create(MST_ADV_PAY_ACT_R.class);
			up2().forEach(r -> {
				MST_ADV_PAY_ACT_R insR = MST_ADV_PAY_ACT_R.create();
				insR.adv_pay_act_no(r.adv_pay_act_no());
				insR.adv_pay_act_seq(r.adv_pay_act_seq());
				work.add(insR);
			});
			MCQueryApiBuilder work_bldr = MCQueryApiBuilder.create(MST_ADV_PAY_ACT_R.create("T"));
			dbWkDelete("MSBHL5030_MSW_ADV_PAY_ACT_D01", work_bldr.getBaseDbc());
			dbWkInsert("MSBHL5030_MSW_ADV_PAY_ACT_I01", work, work_bldr.getBaseDbc());
			
			MCList<MST_ADV_PAY_ACT_R> dbc = MCList.create(MST_ADV_PAY_ACT_R.class);
			dbc.addNumberColumn(MAM_TAX_R.$tax_rate);
			dbc.addBooleanColumn(MAM_TAX_R.$inc_tax_flg);
			dbc.addNumberColumn("hdr_peg_no");
			dbc.addStringColumn("ap_typ");
			MST_ADV_PAY_ACT_R t1 = MST_ADV_PAY_ACT_R.create("T1");
			MSW_ADV_PAY_ACT_KEY_R w = MSW_ADV_PAY_ACT_KEY_R.create("W");
			MAM_TAX_R m1 = MAM_TAX_R.create("M1");
			MAM_STTL_R m2 = MAM_STTL_R.create("M2");
			MAM_AC_RSN_R m3 = MAM_AC_RSN_R.create("M3");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t1);
			dbc_bldr.addSelect(m1.tax_rate);
			dbc_bldr.addSelect(m1.inc_tax_flg);
			dbc_bldr.addSelect(nvl(m3.ap_typ, value(MAC_AP_TYP.AP.value())).as("ap_typ"));
			dbc_bldr.addInnerJoin(w, bracket(w.adv_pay_act_no.eq(t1.adv_pay_act_no)).and(w.adv_pay_act_seq.eq(t1.adv_pay_act_seq)));
			dbc_bldr.addInnerJoin(m1, m1.tax_cd.eq(t1.trd_cur_com_paid_tax_cd));
			dbc_bldr.addInnerJoin(m2, m2.sttl_cd.eq(t1.com_paid_ap_sttl_cd));
			dbc_bldr.addInnerJoin(m3, m2.ac_rsn_cd.eq(m3.ac_rsn_cd));
			// 手数料債務決済区分：相殺のみ対象にする
			dbc_bldr.addWhereWithAnd(t1.com_paid_ap_sttl_typ.eq(value(MAC_AP_STTL_TYP.SETOFF.value())));
			dbSelect("MSBHL5030_MST_ADV_PAY_ACT_S03", dbc, dbc_bldr);
			dbWkDelete("MSBHL5030_MSW_ADV_PAY_ACT_D02", work_bldr.getBaseDbc());
			
			if (dbc.size() > 0) {
				MCList<PaySchd_Srch05_CndR> l = MCList.create(PaySchd_Srch05_CndR.class);
				// 支払予定管理先ＣＤを取得する
				MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
				MAM_BP_R t2 = MAM_BP_R.create("T");
				MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(t2);
				bpL_bldr.setWhere(t2.bp_cd.eq(bind("bsppl_cd")));
				dbSelect("MSBHL5030_MAM_BP_S07", bpL, bpL_bldr, dbc.groupBy(MST_PAY_ACT_D_R.$bsppl_cd));
				MSBHL_PaySchdRegService.setBp(bpL);
				
				// 金額符号を反転する
				for (MST_ADV_PAY_ACT_R r: dbc) {
					MAM_STTL_R sttlR = getSttlCache(r.com_paid_ap_sttl_cd());
					if (!isNull(sttlR) && !sttlR.bill_tax_disp_flg()) {
						continue;
					}
					PaySchd_Srch03_CndAdvPayActR up2R = up2().getFirst(idx, r.adv_pay_act_no(), r.adv_pay_act_seq());
					r.setNumberNE("hdr_peg_no", up2R.hdr_peg_no());
					r.setNumberNE(PaySchd_Srch05_CndR.$pay_xrate, up2R.pay_xrate());
					r.setDateNE(PaySchd_Srch05_CndR.$xrate_base_dt, up2R.xrate_base_dt());
					r.trd_cur_com_paid(r.trd_cur_com_paid().multiply(-1));
					r.trd_cur_com_paid_tax_amt(r.trd_cur_com_paid_tax_amt().multiply(-1));
					r.base_cur_com_paid_tax_amt(r.base_cur_com_paid_tax_amt().multiply(-1));
					PaySchd_Srch05_CndR cndR = PaySchd_Srch05_CndR.create();
					cndR = getCopyBaseApd(up2R.hdr_peg_no());
					copy(cndR, r, createMap_PaySchd_Srch05_CndR_MST_ADV_PAY_ACT_R());
					l.add(cndR);
				}
				_procL.addAll(l);
			}
		}
		protected PaySchd_Srch05_CndR getCopyBaseApd(MCNumber hdr_peg_no) {
			MCList<PaySchd_Srch05_CndR> baseL = MCList.create(PaySchd_Srch05_CndR.class);
			_procL.forEach(r -> {
				if (!isAdjustApd(r.ap_d())) {
					baseL.add(r);	// 税差額以外
				}
			});
			MCIndexKey idx = baseL.createIndex(PaySchd_Srch05_CndR.$hdr_peg_no);
			if (isNull(baseL) && baseL.isEmpty()) {
				return null;
			}
			PaySchd_Srch05_CndR baseR = baseL.getFirst(idx, hdr_peg_no);
			return baseR.clone();
		}

		/**
		 * 消費税差額調整を行う単位
		 */
		protected String[] _adjustTaxKey;
		protected String[] getAdjustTaxKey() {
			if (_adjustTaxKey == null) {
				_adjustTaxKey = new String[]{
					PaySchd_Srch05_CndR.$ap_typ,
					PaySchd_Srch05_CndR.$asppl_cd,
					PaySchd_Srch05_CndR.$ap_dpt_cd,
					PaySchd_Srch05_CndR.$tax_rate
				};
			}
			return _adjustTaxKey;
		}

		/**
		 * 消費税差額調整を行う
		 */
		protected void adjustTax() {

			// ヘッダ紐付けＮＯと税率ごとに処理する
			for (MCList<PaySchd_Srch05_CndR> apdL : _procL.groupList(PaySchd_Srch05_CndR.$hdr_peg_no, PaySchd_Srch05_CndR.$tax_rate)) {
				
				MCList<PaySchd_Srch05_CndR>
					taxDiffL = MCList.create(PaySchd_Srch05_CndR.class),
					notTaxDiffL = MCList.create(PaySchd_Srch05_CndR.class);
				apdL.forEach(r -> {
					if (isAdjustApd(r.ap_d())) {
						taxDiffL.add(r);	// 税差額のみ
					}
					else {
						notTaxDiffL.add(r);	// 税差額以外
					}
				});
				notTaxDiffL.sort(PaySchd_Srch05_CndR.$ap_d_no);

				PaySchd_Srch05_CndR apdR = apdL.get(0);
				MAM_BP_R bpR = MSBHL_PaySchdRegService.getBp(apdR.bsppl_cd());
				MAM_CUR_R curR = MSBHL_PaySchdRegService.getCur(apdR.trd_cur_cd());

				// 差額分は計算から除外する
				MCList<PaySchd_Srch05_CndR> taxL = makeTaxL(notTaxDiffL);

				// 税率が未設定
				if (isNull(apdR.tax_rate())) {
					continue;
				}

				if (!_regMap.containsKey(apdR.hdr_peg_no())) {
					_regMap.put(apdR.hdr_peg_no(), MCList.create(PaySchd_Srch05_RsltR.class));
				}
				MCList<PaySchd_Srch05_RsltR> regL = _regMap.get(apdR.hdr_peg_no());

				if (!taxDiffL.isEmpty() && taxL.isEmpty()) {
					// 税差額の行しかない場合、税差額を取り消す
					setDelAjst(regL, taxDiffL);
					continue;
				}

				// 消費税差額を取得
				MCNumber totalAmt = taxL.getNumber(0, "total_amt");
				MCNumber totalTaxAmt = taxL.getNumber(0, "total_tax_amt");
				MCNumber totalBaseCurTaxAmt = taxL.getNumber(0, "total_base_cur_tax_amt");

				MCList<PaySchd_Srch05_CndR> taxDiffAmtL = crtGetTaxDiffAmtL(notTaxDiffL);
				//  支払税計算フラグがオフの場合は0を設定する。それ以外の場合、税差額計算を実行する。
				MCNumber taxDiff = !bpR.tax_on_pay_flg() ?
					MCNumber.ZERO :
					MSUCL_AmtUtil.getTaxDiff(
						taxDiffAmtL, bpR.pay_tax_rnd_typ(), curR.amt_dec_place(), apdR.tax_rate(), null, totalTaxAmt);
				MCNumber baseCurTaxDiff = taxDiff;
				MCNumber payLateTaxDiff = null;
				if (!isSame(getBaseCur().cur_cd(), apdR.trd_cur_cd())) {
					baseCurTaxDiff = !bpR.tax_on_pay_flg() ?
						MCNumber.ZERO :
						MSUCL_AmtUtil.getTaxDiff(
							taxDiffAmtL, getCo().xrate_rnd_typ(), getBaseCur().amt_dec_place(), apdR.tax_rate(),
							MAUCL_AmtUtil.getDefXrate(
								apdR.trd_cur_cd(),
								getCo().base_cur_cd(),
								getCo().purc_xrate_cd(),
								apdR.xrate_base_dt()),
							totalBaseCurTaxAmt);
					// レート差額の取得
					if (!isNull(apdR.pay_xrate())) {
						totalBaseCurTaxAmt = totalBaseCurTaxAmt.add(baseCurTaxDiff);
						payLateTaxDiff = MSUCL_AmtUtil.getTaxDiff(taxDiffAmtL, getCo().xrate_rnd_typ(), getBaseCur().amt_dec_place(), apdR.tax_rate(), apdR.pay_xrate(), totalBaseCurTaxAmt);
						baseCurTaxDiff = baseCurTaxDiff.add(payLateTaxDiff);
					}
				}

				taxL.addNumberColumn("alloc_amt");
				taxL.addNumberColumn("base_cur_alloc_amt");
				if (!taxDiff.isZero()) {

					// 支払金額が全て0の場合、明細単位税金額の合計値による割振りを行う
					if (totalAmt.isZero()) {
						FXUCC_Divide.prop(taxL, taxDiff,
							curR.amt_dec_place().intValue(), PaySchd_Srch05_CndR.$trd_cur_tax_amt, "alloc_amt");
					}
					// 支払金額が0以外の値が含まれる場合、支払金額による割振りを行う
					else {
						FXUCC_Divide.prop(taxL, taxDiff,
							curR.amt_dec_place().intValue(), PaySchd_Srch05_CndR.$trd_cur_amt, "alloc_amt");
					}
				}
				if (!baseCurTaxDiff.isZero()) {
					// 支払金額が全て0の場合、明細単位税金額の合計値による割振りを行う
					if (totalAmt.isZero()) {
						FXUCC_Divide.prop(taxL, baseCurTaxDiff,
							getBaseCur().amt_dec_place().intValue(), PaySchd_Srch05_CndR.$base_cur_tax_amt, "base_cur_alloc_amt");
					}
					// 支払金額が0以外の値が含まれる場合、支払金額による割振りを行う
					else {
						FXUCC_Divide.prop(taxL, baseCurTaxDiff,
							getBaseCur().amt_dec_place().intValue(), PaySchd_Srch05_CndR.$trd_cur_amt, "base_cur_alloc_amt");
					}
				}
				// 税ＣＤごとに計算した調整額をまとめる
				setTotalAjst(taxL, regL, taxDiffL, notTaxDiffL);

				// 算出された差額分と、登録済みの差額分に対する赤伝とで差額がある分のみ対象にする
				// ※リストには登録済みの差額分を無効にした分が含まれているので除外して比較する）
				MCList<PaySchd_Srch05_RsltR> removeL = MCList.create(PaySchd_Srch05_RsltR.class);
				for (MCList<PaySchd_Srch05_RsltR> list : regL.groupList(getAdjustTaxKey())) {
					MCNumber trdCurTaxAmtSum = list
							.subList(r -> !MAC_SLIP_STS_TYP.isDIS(r.slip_sts_typ()))
							.sum(PaySchd_Srch05_RsltR.$trd_cur_tax_amt);
					MCNumber baseCurTaxAmtSum = list
							.subList(r -> !MAC_SLIP_STS_TYP.isDIS(r.slip_sts_typ()))
							.sum(PaySchd_Srch05_RsltR.$base_cur_tax_amt);
					if (trdCurTaxAmtSum.isZero() && baseCurTaxAmtSum.isZero()) {
						removeL.addAll(list);
					}
				}
				if (!removeL.isEmpty()) {
					regL.removeAll(removeL);
				}
			}
		}

		/**
		 * 債務区分、買掛先、債務部門ごとに金額、税額を集計する
		 */
		protected MCList<PaySchd_Srch05_CndR> makeTaxL(MCList<PaySchd_Srch05_CndR> taxL) {
			MCGroupByPolicy policy = new MCGroupByPolicy(getAdjustTaxKey());
			policy.sum(PaySchd_Srch05_CndR.$trd_cur_amt, PaySchd_Srch05_CndR.$trd_cur_tax_amt, PaySchd_Srch05_CndR.$base_cur_tax_amt);
			MCList<PaySchd_Srch05_CndR> l = taxL.groupBy(policy);

			MCSortPolicy sp = new MCSortPolicy();
			sp.add(SortType.DESC, PaySchd_Srch05_CndR.$trd_cur_amt);
			sp.add(SortType.ASC, PaySchd_Srch05_CndR.$trd_cur_tax_amt);
			l.sort(sp);

			// 税率ごとの合計金額、税額を設定
			l.addNumberColumn("total_amt", l.sum(PaySchd_Srch05_CndR.$trd_cur_amt));
			l.addNumberColumn("total_tax_amt", l.sum(PaySchd_Srch05_CndR.$trd_cur_tax_amt));
			l.addNumberColumn("total_base_cur_tax_amt", l.sum(PaySchd_Srch05_CndR.$base_cur_tax_amt));

			return l;
		}
		/**
		 * 税差額取得用の上り電文を作成する
		 */
		protected MCList<PaySchd_Srch05_CndR> crtGetTaxDiffAmtL(MCList<PaySchd_Srch05_CndR> taxL) {
			MCList<PaySchd_Srch05_CndR> l = taxL.clone();
			for (PaySchd_Srch05_CndR r : l) {
				r.addNumberColumn("amt", r.trd_cur_amt());
			}
			return l;
		}

		/**
		 * 消費税調整額登録情報作成する
		 * 
		 * @param taxL 消費税調整額リスト
		 * @param regL 消費税調整額登録情報
		 * @param taxDiffL 買掛明細リスト（税差額のみ）
		 * @param notTaxDiffL 買掛明細リスト（税差額以外）
		 */
		protected void setTotalAjst(
				MCList<PaySchd_Srch05_CndR> taxL, MCList<PaySchd_Srch05_RsltR> regL,
				MCList<PaySchd_Srch05_CndR> taxDiffL, MCList<PaySchd_Srch05_CndR> notTaxDiffL) {

			String[] keys = getAdjustTaxKey();
			MCIndexKey idx = notTaxDiffL.createIndex(keys);

			// 既にある差額分の買掛明細を取り消す買掛明細を作成する
			for (MCList<PaySchd_Srch05_CndR> subTaxDiffL : taxDiffL.groupList(keys)) {
				subTaxDiffL.sort(PaySchd_Srch05_CndR.$ap_d_no);

				MCNumber amt = subTaxDiffL.sum(PaySchd_Srch05_CndR.$trd_cur_tax_amt);
				MCNumber baseCurAmt = subTaxDiffL.sum(PaySchd_Srch05_CndR.$base_cur_tax_amt);
				if (!amt.isZero()|| !baseCurAmt.isZero()) {
					PaySchd_Srch05_CndR subTaxDiffR = subTaxDiffL.get(0);
					regL.add(crtAdjustR(amt, baseCurAmt, subTaxDiffR, MAC_SLIP_STS_TYP.DIS));
					
					PaySchd_Srch05_CndR refApDR = notTaxDiffL.getFirst(idx, subTaxDiffR.toArray(idx.getKeys()));
					if (!isNull(refApDR)) {
						refApDR.ap_d().ac_dt(subTaxDiffR.ap_d().ac_dt());
					}
					regL.add(crtAdjustR(amt, baseCurAmt, isNull(refApDR) ? subTaxDiffR : refApDR, MAC_SLIP_STS_TYP.CAN));
				}
			}

			// 買掛先、債務部門、債務区分ごとに差額分の買掛明細を作成する
			for (PaySchd_Srch05_CndR taxR : taxL) {
				MCNumber allocAmt = nvl(taxR.getNumber("alloc_amt"), MCNumber.ZERO);
				MCNumber baseCurAllocAmt = nvl(taxR.getNumber("base_cur_alloc_amt"), MCNumber.ZERO);
				if (allocAmt.isZero() && baseCurAllocAmt.isZero()) {
					continue;
				}

				PaySchd_Srch05_RsltR r = regL
					.subList(keys, taxR.toArray(keys))
					.getFirst("ap_d.slip_sts_typ", MAC_SLIP_STS_TYP.CRT.value());
				if (isNull(r)) {
					PaySchd_Srch05_CndR refApDR = notTaxDiffL.getFirst(idx, taxR.toArray(idx.getKeys()));
					regL.add(crtAdjustR(allocAmt, baseCurAllocAmt, refApDR, MAC_SLIP_STS_TYP.CRT));
				}
				else {
					r.trd_cur_tax_amt(r.trd_cur_tax_amt().add(allocAmt));
					r.base_cur_tax_amt(r.base_cur_tax_amt().add(baseCurAllocAmt));
				}
			}
		}

		/**
		 * 差額分の買掛明細を作成する
		 */
		protected PaySchd_Srch05_RsltR crtAdjustR(MCNumber amt, MCNumber baseCurAmt, PaySchd_Srch05_CndR apdR, MAC_SLIP_STS_TYP slipStsTyp) {
			PaySchd_Srch05_RsltR r = PaySchd_Srch05_RsltR.create();
			r.addNumberColumn(PaySchd_Srch05_CndR.$tax_rate);
			r.hdr_peg_no(apdR.hdr_peg_no());
			r.ap_d(apdR.ap_d());
			r.ap_d_no(MAC_SLIP_STS_TYP.isDIS(slipStsTyp) ? apdR.ap_d().ap_d_no() : null);
			// 仕入実績ＮＯは参照買掛明細を引き継ぐ。仕入実績明細ＮＯは引き継がない
			// が、この時点で消してしまうと受払実績を作成するときに困るので、買掛明細を登録するときにクリアする
			//r.purc_act_no();
			//r.purc_act_seq();
			//r.purc_act_rev();
			//r.purc_act_d_no(MAC_STR.NULL_VAL.value());
			//r.purc_act_d_seq(1);
			r.trd_ptn_typ(MAC_TRD_PTN_TYP.TAX_DIFF_PAY_SCHD_CL.value());
			r.trd_cd(getDefaultTrdCd(r.trd_ptn_typ()));
			r.slip_sts_typ(slipStsTyp.value());
			r.trd_unit_qty(0);
			r.base_unit_qty(0);
			r.interim_flg(false);
			r.trd_cur_upri(0);
			r.trd_cur_amt(0);
			r.trd_cur_tax_amt(MAC_SLIP_STS_TYP.isCAN(slipStsTyp) ? amt.negate() : amt);
			r.trd_cur_dscnt_amt(null);
			r.base_cur_upri(0);
			r.base_cur_amt(0);
			r.base_cur_tax_amt(MAC_SLIP_STS_TYP.isCAN(slipStsTyp) ? baseCurAmt.negate() : baseCurAmt);
			r.base_cur_dscnt_amt(null);
			r.wtax_rate(null);
			r.wtax_amt(null);
			r.pay_mtd_typ(MSC_PAY_MTD_TYP.ALL_PAY.value());
			r.crryovr_ap_d_no(null);
			r.crryovr_src_ap_d_no(null);
			r.pay_schd_d_print_rmrks(null);
			r.pay_ntc_d_print_rmrks(null);
			r.intr_rmrks(null);
			r.pay_chk_no(null);
			r.pay_chk_mng_no(null);
			r.crryovr_flg(false);
			r.valid_flg(MAC_SLIP_STS_TYP.isCRT(slipStsTyp) ? true : false);
			r.sub_char1(null);
			r.sub_char2(null);
			r.sub_char3(null);
			r.trd_cur_proc_upri(null);
			r.trd_cur_proc_amt(null);
			r.trd_cur_onr_prov_upri(null);
			r.trd_cur_onr_prov_amt(null);
			r.base_cur_proc_upri(null);
			r.base_cur_proc_amt(null);
			r.base_cur_onr_prov_upri(null);
			r.base_cur_onr_prov_amt(null);
			r.repurc_obli_flg(false);
			r.outsrc_flg(false);
			r.ref_ap_d_no(apdR.ap_d_no());
			r.setNumberNE(PaySchd_Srch05_CndR.$tax_rate, apdR.tax_rate());
			if (_cacheItm == null) {
				MCList<PaySchd_Srch05_RsltR> tmpL = MCList.create(PaySchd_Srch05_RsltR.class);
				tmpL.add(r);
				initDbcCacheItm(tmpL);
			}
			MAM_ITM_R itmR = _cacheItm.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			r.amt_disp_pm(getAmtDispPm(r.trd_ptn_typ(), itmR.dscnt_itm_flg()));

			return r;
		}

		/**
		 * 下り電文を設定する
		 */
		public void setDown() {
			down0().clear();
			_regMap.values().forEach(o -> down0().addAll(o));
		}
		
		/**
		 * 既にある差額分の買掛明細を取り消す買掛明細を作成する
		 * 
		 * @param regL 消費税調整額登録情報
		 * @param taxDiffL 買掛明細リスト（税差額のみ）
		 */
		protected void setDelAjst(MCList<PaySchd_Srch05_RsltR> regL, MCList<PaySchd_Srch05_CndR> taxDiffL) {
			String[] keys = getAdjustTaxKey();
			// 支払為替レート差額は除外する（別行として計上）
			MCList<PaySchd_Srch05_CndR> wkTaxDiffL = taxDiffL.subList(new MCRowMatcher<PaySchd_Srch05_CndR>() {
				@Override
				public boolean match(PaySchd_Srch05_CndR row) {
					if (isNull(row.trd_cur_tax_amt()) || row.trd_cur_tax_amt().isZero()) {
						return false;
					}
					return true;
				}
			});
			for (MCList<PaySchd_Srch05_CndR> subTaxDiffL : wkTaxDiffL.groupList(keys)) {
				subTaxDiffL.sort(PaySchd_Srch05_CndR.$ap_d_no);
				MCNumber amt = subTaxDiffL.sum(PaySchd_Srch05_CndR.$trd_cur_tax_amt);
				MCNumber baseCurAmt = subTaxDiffL.sum(PaySchd_Srch05_CndR.$base_cur_tax_amt);
				if (!amt.isZero()) {
					PaySchd_Srch05_CndR subTaxDiffR = subTaxDiffL.get(0);
					regL.add(crtAdjustR(amt, baseCurAmt, subTaxDiffR, MAC_SLIP_STS_TYP.DIS));
					regL.add(crtAdjustR(amt, baseCurAmt, subTaxDiffR, MAC_SLIP_STS_TYP.CAN));
				}
			}
			// 支払為替レート差額の無効・取消行の作成
			MCList<PaySchd_Srch05_CndR> lateDiffL = taxDiffL.clone();
			lateDiffL.removeAll(wkTaxDiffL);
			for (MCList<PaySchd_Srch05_CndR> subTaxDiffL : lateDiffL.groupList(keys)) {
				subTaxDiffL.sort(PaySchd_Srch05_CndR.$ap_d_no);
				MCNumber baseCurAmt = subTaxDiffL.sum(PaySchd_Srch05_CndR.$base_cur_tax_amt);
				if (!baseCurAmt.isZero()) {
					PaySchd_Srch05_CndR subTaxDiffR = subTaxDiffL.get(0);
					regL.add(crtAdjustR(MCNumber.ZERO, baseCurAmt, subTaxDiffR, MAC_SLIP_STS_TYP.DIS));
					regL.add(crtAdjustR(MCNumber.ZERO, baseCurAmt, subTaxDiffR, MAC_SLIP_STS_TYP.CAN));
				}
			}
		}
		protected Map_PaySchd_Srch05_CndR_MST_PAY_ACT_D_R<PaySchd_Srch05_CndR,MST_PAY_ACT_D_R> createMap_PaySchd_Srch05_CndR_MST_PAY_ACT_D_R() {
			return new Map_PaySchd_Srch05_CndR_MST_PAY_ACT_D_R<PaySchd_Srch05_CndR, MST_PAY_ACT_D_R>();
		}

		public class Map_PaySchd_Srch05_CndR_MST_PAY_ACT_D_R<D extends PaySchd_Srch05_CndR, S extends MST_PAY_ACT_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PaySchd_Srch05_CndR.$trd_cur_amt, MST_PAY_ACT_D_R.$trd_cur_amt);
				addColumnPathMap(PaySchd_Srch05_CndR.$bsppl_cd, MST_PAY_ACT_D_R.$bsppl_cd);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.hdr_peg_no(src.getNumberNE("hdr_peg_no"));
				dest.pay_xrate(src.getNumberNE("pay_xrate"));
				dest.xrate_base_dt(src.getDateNE("xrate_base_dt"));
				dest.trd_cur_amt(src.trd_cur_amt().subtract(src.trd_cur_com_paid_tax_amt()));
				dest.trd_cur_tax_amt(src.trd_cur_com_paid_tax_amt());
				dest.tax_cd(src.trd_cur_com_paid_tax_cd());
				dest.tax_rate(src.getNumberNE("tax_rate"));
				dest.base_cur_tax_amt(src.base_cur_com_paid_tax_amt());
				dest.ap_typ(src.ap_typ());
			}
		}
		protected Map_PaySchd_Srch05_CndR_MST_ADV_PAY_ACT_R<PaySchd_Srch05_CndR,MST_ADV_PAY_ACT_R> createMap_PaySchd_Srch05_CndR_MST_ADV_PAY_ACT_R() {
			return new Map_PaySchd_Srch05_CndR_MST_ADV_PAY_ACT_R<PaySchd_Srch05_CndR, MST_ADV_PAY_ACT_R>();
		}

		public class Map_PaySchd_Srch05_CndR_MST_ADV_PAY_ACT_R<D extends PaySchd_Srch05_CndR, S extends MST_ADV_PAY_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PaySchd_Srch05_CndR.$bsppl_cd, MST_ADV_PAY_ACT_R.$bsppl_cd);
				addColumnPathMap(PaySchd_Srch05_CndR.$trd_cur_cd, MST_ADV_PAY_ACT_R.$trd_cur_cd);
				addColumnPathMap(PaySchd_Srch05_CndR.$trd_cur_amt, MST_ADV_PAY_ACT_R.$trd_cur_amt);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.hdr_peg_no(src.getNumberNE("hdr_peg_no"));
				dest.pay_xrate(src.getNumberNE("pay_xrate"));
				dest.xrate_base_dt(src.getDateNE("xrate_base_dt"));
				dest.trd_cur_amt(src.trd_cur_com_paid().subtract(src.trd_cur_com_paid_tax_amt()));
				dest.trd_cur_tax_amt(src.trd_cur_com_paid_tax_amt());
				dest.tax_cd(src.trd_cur_com_paid_tax_cd());
				dest.tax_rate(src.getNumberNE("tax_rate"));
				dest.trd_cur_cd(src.trd_cur_cd());
				dest.base_cur_tax_amt(src.base_cur_com_paid_tax_amt());
				dest.ap_typ(src.getStringNE("ap_typ"));
			}
		}
	}

	/**
	 * PaySchd_Ins01オペレーション.<p>
	 *
	 * 支払照合、支払予定を登録する。<br>
	 */
	public class PaySchd_Ins01 extends MSBHL_PaySchdRegService_MC_A.PaySchd_Ins01 {
		
		/**
		 * 上り電文の買掛明細のインデックス
		 */
		protected MCIndexKey _apDIdxkey = null;
		
		/**
		 * 上り電文の支払予定のインデックス
		 */
		protected MCIndexKey _paySchdIdxkey = null;
		
		/**
		 * 上り電文の支払実績のインデックス
		 */
		protected MCIndexKey _payActIdxkey = null;
		
		/**
		 * 上り電文の前渡金実績のインデックス
		 */
		protected MCIndexKey _advPayActIdxkey = null;
		/**
		 * 支払時税差額の買掛明細リスト
		 */
		protected MCList<MST_AP_D_R> _taxDiffPayClApDL = null;
		
		/**
		 * 支払照合ヘッダリスト
		 */
		protected MCList<MST_PAY_CHK_R> _payChkL = null;
		
		/**
		 * 買掛明細リスト
		 */
		protected MCList<MST_AP_D_R> _apDL = null;
		
		/**
		 * 支払予定リスト
		 */
		protected MCList<MST_PAY_SCHD_R> _paySchdL = null;
		
		/**
		 * 買掛消込予定リスト
		 */
		protected MCList<MST_AP_APPL_SCHD_R> _apApplSchdL = null;
		
		/**
		 * 支払通知書ヘッダ履歴登録リスト
		 */
		protected MCList<MST_PAY_CHK_R> _insPayNtcHisL = null;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			initCache();
			
			createIndex();
			
			getApDL();
			
			doNoSeqCache();
			
			setNo();
			
			crtTaxDiffPayCl();
			
			crtCoApD();
			
			calcPayChkAmt();
			
			doAprv();
			
			crtIoAct();
			
			insPayChk();
			
			insPaySchd();
			
			updApD();
			
			insApApplSchd();
			
			doPaySchdSendIf();
			
			doSetoffApAmtIns();
			
			updPayActD();
			
			updAdvPayAct();
			
			insPayNtcHis(_insPayNtcHisL);
			
			setDown();
		}
		
		/**
		 * 発番するＮＯのキャッシュを作成する。
		 */
		protected void doNoSeqCache() {
			
			doSeqCache(MSC_NUM_SYS_TYP.PAYCHKMNG, up0().size());
			doSeqCache(MSC_NUM_SYS_TYP.PAYSCHD, up1().size());
		}
		
		/**
		 * 支払照合ＮＯと支払照合管理ＮＯを発番し、支払予定と買掛明細に反映する。
		 */
		protected void setNo() {
			
			for (PaySchd_HdrR payChkR : up0()) {
				
				payChkR.pay_chk().pay_chk_mng_no(getStrSeq(MSC_NUM_SYS_TYP.PAYCHKMNG));
				payChkR.pay_chk().pay_chk_no(getPayChkNo(payChkR));
				
				MCList<PaySchd_DtlApdR> apDL = getUpApDL(payChkR);
				
				// 発番した支払照合管理ＮＯ、支払照合ＮＯを買掛明細に反映する
				apDL.setValueNE(PaySchd_DtlApdR.$pay_chk_mng_no, payChkR.pay_chk_mng_no());
				apDL.setValueNE(PaySchd_DtlApdR.$pay_chk_no, payChkR.pay_chk_no());
				
				MCList<PaySchd_DtlSchdR> paySchdL = getUpPaySchdL(payChkR);
				// 発番した支払照合管理ＮＯを支払予定に反映する
				paySchdL.setValueNE(PaySchd_DtlSchdR.$pay_chk_mng_no, payChkR.pay_chk_mng_no());
				
				MCList<PaySchd_DtlActR> payActL = getUpPayActL(payChkR);
				if (!payActL.isEmpty()) {
					// 発番した支払照合管理ＮＯを支払実績に反映する
					payActL.setValueNE(PaySchd_DtlActR.$calc_tgt_pay_chk_mng_no, payChkR.pay_chk_mng_no());
				}
			}
		}
		
		/**
		 * 買掛明細を取得する。
		 */
		protected void getApDL() {
			
			_apDL = MCList.create(MST_AP_D_R.class);
			MST_AP_D_R t = MST_AP_D_R.create("T");
			MCQueryApiBuilder apDL_bldr = MCQueryApiBuilder.create(t);
			apDL_bldr.setWhere(t.valid_flg.eq(value(true)));
			dbSelectKey("MSBHL5030_MST_AP_D_S04", _apDL, apDL_bldr, up1());
			
			setApDL(up1(), _apDL);
		}
		
		/**
		 * 支払時税差額調整を行う。
		 */
		protected void crtTaxDiffPayCl() {
			
			_taxDiffPayClApDL = crtTaxDiffPayClCommon(up0(), up1(), _apDIdxkey);
		}
		
		/**
		 * 繰越処理を行う
		 */
		protected void crtCoApD() {
			setCrryovrTgtFlg(up1(), null);
			
			callApDtlRegServiceUpd(up0(), up1(), null);
		}
		
		/**
		 * 支払照合ヘッダの金額を計算する。
		 */
		protected void calcPayChkAmt() {
			
			calcPayChkAmtCommon(up0(), up1(), _apDIdxkey, up2(), _paySchdIdxkey, up3(), up4(), _apDL);
			
			// up3,up4 の中身が変わるのでインデックスを作り直す
			createIndex();
		}
		
		/**
		 * 承認提供サービスの承認情報作成を実行する。
		 */
		protected void doAprv() {
			
			callAprvServiceUpd(up0(), up2(), _paySchdIdxkey);
		}
		
		/**
		 * 受払実績を登録する。
		 */
		protected void crtIoAct() {
			
			crtIoActCommon(_taxDiffPayClApDL, up0());
		}
		
		/**
		 * 支払照合ヘッダを登録する。
		 */
		protected void insPayChk() {
			
			_payChkL = MCList.create(MST_PAY_CHK_R.class);
			_insPayNtcHisL = MCList.create(MST_PAY_CHK_R.class);
			
			for (PaySchd_HdrR payChkR : up0()) {
				
				payChkR.pay_chk().pay_sts_typ(getPayChkStsTyp(payChkR, up2()));
				
				if (payChkR.aprv_flg()) {
					payChkR.aprv_sts_typ(MAC_APRV_STS_TYP.OPN.value());
				}
				if (isSame(payChkR.trd_cur_cd(), getCo().base_cur_cd())) {
					payChkR.pay_xrate(null);
				}
				payChkR.pay_chk().pay_ntc_rev(1);
				
				_payChkL.add(payChkR.pay_chk());
				
				MST_PAY_CHK_R payNtcHisR = MST_PAY_CHK_R.create();
				payNtcHisR.pay_chk_mng_no(payChkR.pay_chk_mng_no());
				_insPayNtcHisL.add(payNtcHisR);
			}

			MCQueryApiBuilder payChkL_bldr = MCQueryApiBuilder.create(MST_PAY_CHK_R.create("T"));
			dbInsertEx("MSBHL5030_MST_PAY_CHK_I01", _payChkL, payChkL_bldr);
		}
		
		/**
		 * 支払予定を登録する。
		 */
		protected void insPaySchd() {

			_paySchdL = MCList.create(MST_PAY_SCHD_R.class);
			
			for (PaySchd_DtlSchdR paySchdR : up2()) {
				
				paySchdR.pay_schd().pay_schd_no(getStrSeq(MSC_NUM_SYS_TYP.PAYSCHD));
				paySchdR.pay_schd().pay_sts_typ(MSC_PAY_STS_TYP.NOT_PAY.value());
				paySchdR.pay_schd().trd_cur_appl_amt(0);
				if (!isNull(paySchdR.adv_pay_act_no())) {
					for (String col : getNoteCols()) {
						paySchdR.pay_schd().setValue(col, null);
					}
				}
				_paySchdL.add(paySchdR.pay_schd());
			}

			MCQueryApiBuilder paySchdL_bldr = MCQueryApiBuilder.create(MST_PAY_SCHD_R.create("T"));
			dbInsertEx("MSBHL5030_MST_PAY_SCHD_I01", _paySchdL, paySchdL_bldr);
		}
		
		/**
		 * 買掛明細を更新する。
		 */
		protected void updApD() {
			
			updApDCommon(up1());
		}
		
		/**
		 * 買掛消込予定を登録する。
		 */
		protected void insApApplSchd() {
			_apApplSchdL = MCList.create(MST_AP_APPL_SCHD_R.class);
			crtApApplSchdCommon(_payChkL, _paySchdL, _apApplSchdL, false);
		}
		
		/**
		 * 相殺分の支払実績を作成する
		 */
		protected void doSetoffApAmtIns() {
			MCList<PaySchd_HdrR> subPayChkL = MCList.create(PaySchd_HdrR.class);
			MCList<PaySchd_DtlSchdR> subPaySchdL = MCList.create(PaySchd_DtlSchdR.class);
			for (PaySchd_HdrR upPayChkR : up0()) {
				// 承認対象は対象から除外する
				if (upPayChkR.aprv_flg()) {
					continue;
				}
				subPayChkL.add(upPayChkR);
				subPaySchdL.addAll(up2().subList(_paySchdIdxkey, upPayChkR.hdr_peg_no()));
			}
			// 買掛消込予定は呼び出し先で支払予定ごとに処理されるので絞り込む必要なし
			setPayActChk01InsUpd(subPayChkL, subPaySchdL, _apApplSchdL);
			callPayActServiceInsUpd();
			
			// 支払照合の支払状況を取得
			MST_PAY_CHK_R t =MST_PAY_CHK_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.pay_sts_typ);
			FXUCL_MCDbcCache<MST_PAY_CHK_R> cachePayChk = new FXUCL_MCDbcCache<MST_PAY_CHK_R>(dbc_bldr, subPayChkL, MST_PAY_CHK_R.$pay_chk_mng_no);
			subPayChkL.forEach(r -> {
				r.pay_sts_typ(cachePayChk.get(r.pay_chk_mng_no()).pay_sts_typ());
			});
		}
		
		/**
		 * 支払予定を送信する
		 */
		protected void doPaySchdSendIf() {
			
			callPaySchdSendIfCommon(up0(), MAC_DATA_CRUD_TYP.CRT);
		}
		
		/**
		 * 前渡金実績を更新する
		 */
		protected void updAdvPayAct() {
			updAdvPayActAmt(up0(), up2(), _paySchdIdxkey);
			updAdvPayActPayChk(up0(), up4(), _advPayActIdxkey);
		}
		
		/**
		 * 支払実績明細を更新する。
		 */
		protected void updPayActD() {
			
			updPayActDCommon(up0(), up3(), _payActIdxkey);
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			down0().setAll(up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
		
		/**
		 * 上り電文の支払予定と買掛明細のインデックスを作成する。
		 */
		protected void createIndex() {
			
			_apDIdxkey = up1().createIndex(PaySchd_DtlApdR.$hdr_peg_no);
			_paySchdIdxkey = up2().createIndex(PaySchd_DtlSchdR.$hdr_peg_no);
			_payActIdxkey = up3().createIndex(PaySchd_DtlActR.$hdr_peg_no);
			_advPayActIdxkey = up4().createIndex(PaySchd_AdvPayActR.$hdr_peg_no);
		}
		
		/**
		 * 支払照合ヘッダに紐付く買掛明細を取得する。
		 * @param payChkR 支払照合ヘッダ
		 * @return 買掛明細
		 */
		protected MCList<PaySchd_DtlApdR> getUpApDL(PaySchd_HdrR payChkR) {

			return up1().subList(_apDIdxkey, payChkR.hdr_peg_no());
		}
		
		/**
		 * 支払照合ヘッダに紐付く支払予定を取得する。
		 * @param payChkR 支払照合ヘッダ
		 * @return 支払予定
		 */
		protected MCList<PaySchd_DtlSchdR> getUpPaySchdL(PaySchd_HdrR payChkR) {
			
			return up2().subList(_paySchdIdxkey, payChkR.hdr_peg_no());
		}
		
		/**
		 * 支払照合ヘッダに紐付く支払実績を取得する。
		 * @param payChkR 支払照合ヘッダ
		 * @return 支払実績
		 */
		protected MCList<PaySchd_DtlActR> getUpPayActL(PaySchd_HdrR payChkR) {
			
			return up3().subList(_payActIdxkey, payChkR.hdr_peg_no());
		}
	}

	/**
	 * PaySchd_Upd01オペレーション.<p>
	 *
	 * 支払照合、支払予定を更新する。<br>
	 */
	public class PaySchd_Upd01 extends MSBHL_PaySchdRegService_MC_A.PaySchd_Upd01 {
		
		/**
		 * 買掛明細のインデックス
		 */
		protected MCIndexKey _apDIdxkey = null;
		
		/**
		 * 支払予定のインデックス
		 */
		protected MCIndexKey _paySchdIdxkey = null;
		
		/**
		 * 上り電文の支払実績のインデックス
		 */
		protected MCIndexKey _payActIdxkey = null;
		
		/**
		 * 上り電文の前渡金実績のインデックス
		 */
		protected MCIndexKey _advPayActIdxkey = null;
		
		/**
		 * 支払照合ヘッダリスト
		 */
		protected MCList<MST_PAY_CHK_R> _payChkL = null;
		
		/**
		 * 支払予定リスト（新規行と更新行のみ格納する）
		 */
		protected MCList<MST_PAY_SCHD_R> _insUpdpaySchdL = null;
		
		/**
		 * 支払予定リスト（新規行と更新行と削除行を格納する。ただし支払実績による実績ありの支払予定を除く）
		 */
		protected MCList<MST_PAY_SCHD_R> _delpaySchdL = null;
		
		/**
		 * 買掛消込予定リスト
		 */
		protected MCList<MST_AP_APPL_SCHD_R> _apApplSchdL = null;
		
		/**
		 * 買掛明細リスト
		 */
		protected MCList<MST_AP_D_R> _apDL = null;
		
		/**
		 * 支払時税差額の買掛明細リスト
		 */
		protected MCList<MST_AP_D_R> _taxDiffPayClApDL = null;
		
		/**
		 * 支払通知書ヘッダ履歴更新リスト
		 */
		protected MCList<MST_PAY_CHK_R> _updPayNtcHisL = null;
		
		/**
		 * 支払通知書ヘッダ履歴削除リスト
		 */
		protected MCList<MST_PAY_CHK_R> _delPayNtcHisL = null;
		
		/**
		 * 支払通知書ヘッダ履歴登録リスト
		 */
		protected MCList<MST_PAY_CHK_R> _insPayNtcHisL = null;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			initCache();
			
			createIndex();
			
			doNoSeqCache();
			
			setNo();
			
			getPayChkL();
			
			getApDL();
			
			updPayActDClear();
			
			delCrtTaxDiffPayCl();
			
			delCrtCoApD();
			
			doAprv();
			
			doSetoffApAmtDel();
			
			doPaySchdSendIfDel();
			
			calcPayChkAmt();
			
			crtIoAct();
			
			updPayChk();
			
			updPaySchd();
			
			updApD();
			
			delCrtApApplSchd();
			
			doPaySchdSendIfIns();
			
			doSetoffApAmtIns();
			
			updPayActD();
			
			updAdvPayAct();
			
			updPayNtcHis();
			
			delPayNtcHis();
			
			insPayNtcHis(_insPayNtcHisL);
			
			setDown();
		}
		
		/**
		 * 支払照合ＮＯと支払照合管理ＮＯを支払予定と買掛明細に反映する。
		 */
		protected void setNo() {
			
			for (PaySchd_HdrR payChkR : up0()) {
				
				MCList<PaySchd_DtlApdR> apDL = getUpApDL(payChkR);
				// 支払照合管理ＮＯ、支払照合ＮＯを買掛明細に反映する
				apDL.setValueNE(PaySchd_DtlApdR.$pay_chk_mng_no, payChkR.pay_chk_mng_no());
				apDL.setValueNE(PaySchd_DtlApdR.$pay_chk_no, payChkR.pay_chk_no());
				
				MCList<PaySchd_DtlSchdR> paySchdL = getUpPaySchdL(payChkR);
				// 支払照合管理ＮＯを支払予定に反映する
				paySchdL.setValueNE(PaySchd_DtlSchdR.$pay_chk_mng_no, payChkR.pay_chk_mng_no());
				
				MCList<PaySchd_DtlActR> payActL = getUpPayActL(payChkR);
				if (!payActL.isEmpty()) {
					// 発番した支払照合管理ＮＯを支払実績に反映する
					payActL.setValueNE(PaySchd_DtlActR.$calc_tgt_pay_chk_mng_no, payChkR.pay_chk_mng_no());
				}
			}
		}
		
		/**
		 * キャッシュから支払照合ヘッダを取得する。
		 */
		protected void getPayChkL() {
			
			_payChkL = MCList.create(MST_PAY_CHK_R.class);
			
			for (PaySchd_HdrR hdrR: up0()) {
				_payChkL.add(getCachePayChkR(hdrR.pay_chk_mng_no()));
			}
		}
		
		/**
		 * 買掛明細を取得する。
		 */
		protected void getApDL() {
			
			_apDL = getApDL4Upd(up0(), up1());
			
			setApDL(up1(), _apDL);
		}
		
		/**
		 * 発番するＮＯのキャッシュを作成する。（新規分のみ）
		 */
		protected void doNoSeqCache() {
			
			doSeqCache(MSC_NUM_SYS_TYP.PAYSCHD,
					up1().subList(r->MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())).size());
		}
		
		/**
		 * 既存の消費税差額調整の買掛明細を取消して、新規登録する。
		 */
		protected void delCrtTaxDiffPayCl() {
			MCList<PaySchd_HdrR> upPayChkL = MCList.create(PaySchd_HdrR.class);
			for (PaySchd_HdrR r : up0()) {
				upPayChkL.add(r);
			}
			_taxDiffPayClApDL = crtTaxDiffPayClCommon(upPayChkL, up1(), _apDIdxkey);
		}
		
		/**
		 * 既存の買掛明細繰越を取消して、新規登録する。
		 */
		protected void delCrtCoApD() {
			setCrryovrTgtFlg(up1(), _apDL);
			
			callApDtlRegServiceDel(up1(), _apDL);
			
			setApDNo();
			
			callApDtlRegServiceUpd(up0(), up1(), _apDL);
		}
		
		/**
		 * 買掛明細ＮＯを置き換える。
		 */
		protected void setApDNo() {
			for (PaySchd_DtlApdR apDR : up1().subList(r -> isUpd(r))) {
				//更新行で、一部支払・全額繰越削除処理を実行した場合、画面から渡された買掛明細ＮＯは削除される
				//為、「繰越元買掛明細ＮＯ」を「買掛明細ＮＯ」とみなす
				if (apDR.co_del_tgt_flg()) {
					apDR.ap_d_no(
						isNull(apDR.co_src_ap_d_no()) ? apDR.ap_d_no() : apDR.co_src_ap_d_no()
					);
				}
			}
		}
		
		/**
		 * 支払照合ヘッダの金額を計算する。
		 */
		protected void calcPayChkAmt() {
			
			calcPayChkAmtCommon(up0(), up1(), _apDIdxkey, up2(), _paySchdIdxkey, up3(), up4(), _apDL);

			// up3,up4 の中身が変わるのでインデックスを作り直す
			createIndex();
		}
		
		/**
		 * 承認提供サービスの承認情報作成を実行する。
		 */
		protected void doAprv() {
			
			callAprvServiceUpd(up0(), up2(), _paySchdIdxkey);
		}
		
		/**
		 * 受払実績を登録する
		 */
		protected void crtIoAct() {
			
			crtIoActCommon(_taxDiffPayClApDL, up0());
		}
		
		
		/**
		 * 買掛金を相殺する。
		 */
		protected void doSetoffApAmtDel() {
			// 買掛金相殺のため、支払実績サービスを実行する
			callPayActServiceDel();
			delUnapprovedPayAct();
		}
		protected void delUnapprovedPayAct() {
			MCList<PaySchd_HdrR> payChkL = MCList.create(PaySchd_HdrR.class);
			MCList<PaySchd_DtlSchdR> paySchdL = MCList.create(PaySchd_DtlSchdR.class);
			for (PaySchd_HdrR payChkR : up0()) {
				if (MSBHL_PaySchdRegService.justUpdRmrks(payChkR.pay_chk_mng_no())) {
					MST_PAY_CHK_R dbPayChkR = getCachePayChkR(payChkR.pay_chk_mng_no());
					if (isUnaprvToAprv(dbPayChkR, payChkR)) {
						// callPayActServiceDelで削除されない分を削除する
						// ※callPayActServiceDelはチェック処理で削除する対象を特定しているが、
						// 　このケースは承認情報を更新した後でないと判断できないため
						payChkL.add(payChkR.clone());
						paySchdL.addAll(getUpPaySchdL(payChkR).clone());
					}
				}
				else {
					MST_PAY_CHK_R dbPayChkR = getCachePayChkR(payChkR.pay_chk_mng_no());
					if (isUnaprvToAprv(dbPayChkR, payChkR)) {
						MCList<PaySchd_DtlSchdR> upPaySchdL = getUpPaySchdL(payChkR);
						for (PaySchd_DtlSchdR upPaySchdR : upPaySchdL) {
							if (skipPayAct(upPaySchdR.pay_schd_no())) {
								putSkipPayActCache(upPaySchdR.pay_schd_no(), false);
								payChkL.add(payChkR.clone());
								paySchdL.add(upPaySchdR.clone());
							}
						}
					}
				}
			}
			if (!payChkL.isEmpty()) {
				payChkL.forEach(r -> r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value()));
				paySchdL.forEach(r -> r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value()));
				
				setPayActChk01Common(payChkL, paySchdL, MCList.create(MST_AP_APPL_SCHD_R.class));
				callPayActServiceInsUpd();
			}
		}
		protected boolean isUnaprvToAprv(MST_PAY_CHK_R befPayChkInfoR, PaySchd_HdrR aftPayChkInfoR) {
			return !befPayChkInfoR.aprv_flg() && aftPayChkInfoR.aprv_flg();
		}
		protected boolean isAprvToUnAprv(MST_PAY_CHK_R befPayChkInfoR, PaySchd_HdrR aftPayChkInfoR) {
			return befPayChkInfoR.aprv_flg() && !aftPayChkInfoR.aprv_flg();
		}
		
		/**
		 * 相殺分の支払実績を作成する
		 */
		protected void doSetoffApAmtIns() {
			MCList<PaySchd_HdrR> subPayChkL = MCList.create(PaySchd_HdrR.class);
			MCList<PaySchd_DtlSchdR> subPaySchdL = MCList.create(PaySchd_DtlSchdR.class);
			for (PaySchd_HdrR upPayChkR : up0()) {
				if (upPayChkR.aprv_flg()) {
					continue;
				}
				else if (isUpd(upPayChkR) && justUpdRmrks(upPayChkR.pay_chk_mng_no())) {
					MST_PAY_CHK_R payChkR = getCachePayChkR(upPayChkR.pay_chk_mng_no());
					if (!payChkR.aprv_flg()) {
						continue;
					}
				}
				subPayChkL.add(upPayChkR);
				subPaySchdL.addAll(up2().subList(_paySchdIdxkey, upPayChkR.hdr_peg_no()));
			}
			// 買掛消込予定は呼び出し先で支払予定ごとに処理されるので絞り込む必要なし
			setPayActChk01InsUpd(subPayChkL, subPaySchdL, _apApplSchdL);
			callPayActServiceInsUpd();
			
		}
	
		/**
		 * 支払予定を送信する（削除分）
		 */
		protected void doPaySchdSendIfDel() {
			
			callPaySchdSendIfCommon(up0(), MAC_DATA_CRUD_TYP.DEL);
		}
		
		/**
		 * 支払予定を送信する（新規分）
		 */
		protected void doPaySchdSendIfIns() {
			
			callPaySchdSendIfCommon(up0(), MAC_DATA_CRUD_TYP.CRT);
		}
		
		/**
		 * 前渡金実績を更新する
		 */
		protected void updAdvPayAct() {
			updAdvPayActAmt(up0(), up2(), _paySchdIdxkey);
			updAdvPayActPayChk(up0(), up4(), _advPayActIdxkey);
		}
		
		/**
		 * 支払照合ヘッダを更新する。
		 */
		protected void updPayChk() {
			
			MCList<MST_PAY_CHK_R> updPayChkL = MCList.create(MST_PAY_CHK_R.class);
			_updPayNtcHisL = MCList.create(MST_PAY_CHK_R.class);
			_delPayNtcHisL = MCList.create(MST_PAY_CHK_R.class);
			_insPayNtcHisL = MCList.create(MST_PAY_CHK_R.class);
			
			for (PaySchd_HdrR payChkR : up0()) {
				
				if (payChkR.aprv_flg()) {
					payChkR.aprv_sts_typ(nvl(payChkR.aprv_sts_typ(), MAC_APRV_STS_TYP.OPN.value()));
				}
				payChkR.pay_chk().pay_sts_typ(
					getPayChkStsTyp(payChkR, up2().subList(_paySchdIdxkey, payChkR.hdr_peg_no())));
				
				// 発行済み、かつ支払通知書の項目に変更がある場合に
				// 通知書改訂番号を更新する。
				MST_PAY_CHK_R lastPayChkR = getCachePayChkR(payChkR.pay_chk_mng_no());
				MST_PAY_CHK_R payNtcHisR = MST_PAY_CHK_R.create();
				payNtcHisR.pay_chk_mng_no(lastPayChkR.pay_chk_mng_no());
				payNtcHisR.pay_chk_no(lastPayChkR.pay_chk_no());
				payNtcHisR.pay_ntc_rev(lastPayChkR.pay_ntc_rev());
				if (lastPayChkR.prnt_flg() && !isSamePayNtcCol(payChkR)) {
					payChkR.pay_chk().pay_ntc_rev(lastPayChkR.pay_ntc_rev().add(1));
					payChkR.pay_chk().prnt_flg(false);
					
					_updPayNtcHisL.add(payNtcHisR);
				}
				else {
					payChkR.pay_chk().pay_ntc_rev(lastPayChkR.pay_ntc_rev());
					payChkR.pay_chk().prnt_flg(lastPayChkR.prnt_flg());
					
					_delPayNtcHisL.add(payNtcHisR);
				}
				
				_insPayNtcHisL.add(payNtcHisR);
				updPayChkL.add(payChkR.pay_chk());
			}

			MCQueryApiBuilder updPayChkL_bldr = MCQueryApiBuilder.create(MST_PAY_CHK_R.create("T"));
			dbUpdateKey("MSBHL5030_MST_PAY_CHK_U03", updPayChkL, updPayChkL_bldr);
		}
		
		/**
		 * 支払通知書の項目に変更があるか判定する
		 * @return 変更がない場合はtrue
		 */
		protected boolean isSamePayNtcCol(PaySchd_HdrR payChkR) {
			
			// 支払照合ヘッダのチェック
			if (!isColSame(payChkR.pay_chk(), getCachePayChkR(payChkR.pay_chk_mng_no()), getPayNtcPayChkCols())) {
				return false;
			}
			
			// 買掛明細のチェック
			MCList<MST_AP_D_R> apDL = getCacheApDL(payChkR.pay_chk_mng_no());
			if (!isSame(isNull(apDL), isNull(up1().subList(_apDIdxkey, payChkR.hdr_peg_no())))) return false;
			if (!isNull(apDL)) {
				if (apDL.size() != up1().subList(_apDIdxkey, payChkR.hdr_peg_no()).size()) return false;
				MCIndexKey apDIdxKey = apDL.createIndex(MST_AP_D_R.$ap_d_no);
				for (PaySchd_DtlApdR r : up1().subList(_apDIdxkey, payChkR.hdr_peg_no())) {
					if (!isColSame(r.ap_d(), apDL.getFirst(apDIdxKey, r.ap_d_no()), getPayNtcApDCols()) || isDel(r)) {
						return false;
					}
				}
			}
			
			// 支払予定のチェック
			MCList<MST_PAY_SCHD_R> paySchdL = getCachePaySchdL(payChkR.pay_chk_mng_no());
			if (!isSame(isNull(paySchdL), isNull(up2().subList(_paySchdIdxkey, payChkR.hdr_peg_no())))) return false;
			if (!isNull(paySchdL)) {
				if (paySchdL.size() != up2().subList(_paySchdIdxkey, payChkR.hdr_peg_no()).size()) return false;
				MCIndexKey paySchdIdxKey = paySchdL.createIndex(MST_PAY_SCHD_R.$pay_schd_no);
				for (PaySchd_DtlSchdR r : up2().subList(_paySchdIdxkey, payChkR.hdr_peg_no())) {
					if (!isColSame(r.pay_schd(), paySchdL.getFirst(paySchdIdxKey, r.pay_schd_no()), getPayNtcPaySchdCols()) || isDel(r)) {
						return false;
					}
				}
			}
			
			// 支払実績明細のチェック
			MCList<MST_PAY_ACT_D_R> payActDL = getCachePayActLByPayChkMngNo(payChkR.pay_chk_mng_no());
			if (!isSame(isNull(payActDL), isNull(up3().subList(_payActIdxkey, payChkR.hdr_peg_no())))) return false;
			if (!isNull(payActDL)) {
				if (payActDL.size() != up3().subList(_payActIdxkey, payChkR.hdr_peg_no()).size()) return false;
				MCIndexKey payActDIdxKey = payActDL.createIndex(MST_PAY_ACT_D_R.$pay_act_d_no, MST_PAY_ACT_D_R.$pay_act_d_seq);
				for (PaySchd_DtlActR r : up3().subList(_payActIdxkey, payChkR.hdr_peg_no())) {
					MST_PAY_ACT_D_R payActDR = payActDL.getFirst(payActDIdxKey, r.pay_act_d_no(), r.pay_act_d_seq());
					if (isNull(payActDR) || !isSame(payActDR.calc_tgt_pay_chk_mng_no(), payChkR.pay_chk_mng_no())) {
						return false;
					}
				}
			}
			
			// 前渡金のチェック
			MCList<MST_ADV_PAY_ACT_R> advPayActL = getCacheAdvPayActLByPayChkMngNo(payChkR.pay_chk_mng_no());
			if (!isSame(isNull(advPayActL), isNull(up4().subList(_advPayActIdxkey, payChkR.hdr_peg_no())))) return false;
			if (!isNull(advPayActL)) {
				if (advPayActL.size() != up4().subList(_advPayActIdxkey, payChkR.hdr_peg_no()).size()) return false;
				MCIndexKey advPayActIdxKey = advPayActL.createIndex(MST_ADV_PAY_ACT_R.$adv_pay_act_no, MST_ADV_PAY_ACT_R.$adv_pay_act_seq);
				for (PaySchd_AdvPayActR r : up4().subList(_advPayActIdxkey, payChkR.hdr_peg_no())) {
					MST_ADV_PAY_ACT_R advPayActR = advPayActL.getFirst(advPayActIdxKey, r.adv_pay_act_no(), r.adv_pay_act_seq());
					if (isNull(advPayActR) || !isSame(advPayActR.pay_chk_mng_no(), payChkR.pay_chk_mng_no())) {
						return false;
					}
				}
			}
			
			return true;
		}
		
		// 支払通知書の変更チェック用のカラム（支払照合ヘッダ）
		protected String[] _payNtcPayChkCols;
		protected String[] getPayNtcPayChkCols() {
			if (_payNtcPayChkCols == null) {
				_payNtcPayChkCols = new String[] {
					MST_PAY_CHK_R.$bsppl_cd,
					MST_PAY_CHK_R.$bsppl_dpt_cd,
					MST_PAY_CHK_R.$wrk_no,
					MST_PAY_CHK_R.$pay_spot_flg,
					MST_PAY_CHK_R.$bsppl_cl_day,
					MST_PAY_CHK_R.$bsppl_cl_dt,
					MST_PAY_CHK_R.$trd_cur_cd,
					MST_PAY_CHK_R.$pay_xrate
				};
			}
			return _payNtcPayChkCols;
		}
		
		// 支払通知書の変更チェック用のカラム（買掛明細）
		protected String[] _payNtcApDCols;
		protected String[] getPayNtcApDCols() {
			if (_payNtcApDCols == null) {
				_payNtcApDCols = new String[] {
					MST_AP_D_R.$pay_ntc_d_print_rmrks,
					MST_AP_D_R.$base_purc_ac_dt
				};
			}
			return _payNtcApDCols;
		}
		
		// 支払通知書の変更チェック用のカラム（支払予定）
		protected String[] _payNtcPaySchdCols;
		protected String[] getPayNtcPaySchdCols() {
			if (_payNtcPaySchdCols == null) {
				_payNtcPaySchdCols = new String[] {
					MST_PAY_SCHD_R.$ap_sttl_cd,
					MST_PAY_SCHD_R.$ap_sttl_typ,
					MST_PAY_SCHD_R.$pay_schd_dt,
					MST_PAY_SCHD_R.$pay_bank_ac_cd,
					MST_PAY_SCHD_R.$trd_cur_amt
				};
			}
			return _payNtcPaySchdCols;
		}
		
		/**
		 * 支払予定を更新する。
		 */
		protected void updPaySchd() {
			
			_insUpdpaySchdL = MCList.create(MST_PAY_SCHD_R.class);
			_delpaySchdL = MCList.create(MST_PAY_SCHD_R.class);
			
			MCList<MST_PAY_SCHD_R> insPaySchdL = MCList.create(MST_PAY_SCHD_R.class);
			MCList<MST_PAY_SCHD_R> updPaySchdL = MCList.create(MST_PAY_SCHD_R.class);
			MCList<MST_PAY_SCHD_R> delPaySchdL = MCList.create(MST_PAY_SCHD_R.class);
			
			for (PaySchd_DtlSchdR upPaySchdR : up2()) {
				
				if (MAC_DATA_CRUD_TYP.isCRT(upPaySchdR.data_crud_typ())) {
					upPaySchdR.pay_schd().pay_schd_no(getStrSeq(MSC_NUM_SYS_TYP.PAYSCHD));
					upPaySchdR.pay_schd().pay_sts_typ(MSC_PAY_STS_TYP.NOT_PAY.value());
					upPaySchdR.pay_schd().trd_cur_appl_amt(0);
					insPaySchdL.add(upPaySchdR.pay_schd());
					_insUpdpaySchdL.add(upPaySchdR.pay_schd());
					_delpaySchdL.add(upPaySchdR.pay_schd());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(upPaySchdR.data_crud_typ())) {
					// 支払実績による実績ありは更新しない
					// ※買掛消込予定も更新しないが、計算の対象には含める
					if (!existsPayActD(upPaySchdR.pay_schd_no())) {
						updPaySchdL.add(upPaySchdR.pay_schd());
						if (!skipPayAct(upPaySchdR.pay_schd_no())) {
							_delpaySchdL.add(upPaySchdR.pay_schd());
						}
					}
					_insUpdpaySchdL.add(upPaySchdR.pay_schd());
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(upPaySchdR.data_crud_typ())) {
					upPaySchdR.pay_schd().setStatus(MCRow.DELETE);
					delPaySchdL.add(upPaySchdR.pay_schd());
					_delpaySchdL.add(upPaySchdR.pay_schd());
				}
				if (!isNull(upPaySchdR.adv_pay_act_no())) {
					for (String col : getNoteCols()) {
						upPaySchdR.pay_schd().setValue(col, null);
					}
				}
			}
			
			if (!insPaySchdL.isEmpty()) {
				MCQueryApiBuilder insPaySchdL_bldr = MCQueryApiBuilder.create(MST_PAY_SCHD_R.create("T"));
				dbInsertEx("MSBHL5030_MST_PAY_SCHD_I02", insPaySchdL, insPaySchdL_bldr);
			}
			
			if (!updPaySchdL.isEmpty()) {
				MST_PAY_SCHD_R t = MST_PAY_SCHD_R.create("T");
				MCQueryApiBuilder updPaySchdL_bldr = MCQueryApiBuilder.create(t);
				updPaySchdL_bldr.removeSet(MST_PAY_SCHD_R.$pay_sts_typ, MST_PAY_SCHD_R.$trd_cur_appl_amt);
				dbUpdateKey("MSBHL5030_MST_PAY_SCHD_U01", updPaySchdL, updPaySchdL_bldr);
			}
			
			if (!delPaySchdL.isEmpty()) {
				MCQueryApiBuilder delPaySchdL_bldr = MCQueryApiBuilder.create(MST_PAY_SCHD_R.create("T"));
				dbDeleteKey("MSBHL5030_MST_PAY_SCHD_D01", delPaySchdL, delPaySchdL_bldr);
			}
		}
		
		/**
		 * 買掛明細を更新する。
		 */
		protected void updApD() {
			
			updApDCommon(up1());
		}
		
		/**
		 * 既存の買掛消込予定削除して、新規登録する。
		 */
		protected void delCrtApApplSchd() {
			// 以下の条件を満たす場合、強制的に作り直す
			// ・空更新もしくは備考のみ更新
			// ・承認対象から承認対象外に変わった
			//　※削除された支払予定ＩＦは同じＮＯだと作成されないため、買掛消込予定を作り直すことで作成されるようにする
			MCIndexKey idx = up0().createIndex(PaySchd_HdrR.$pay_chk_mng_no);
			Function<String, Boolean> force = (payChkMngNo) -> {
				if (justUpdRmrks(payChkMngNo)) {
					PaySchd_HdrR aftPayChkR = up0().getFirst(idx, payChkMngNo);
					MST_PAY_CHK_R befPayChkR = getCachePayChkR(aftPayChkR.pay_chk_mng_no());
					if (isAprvToUnAprv(befPayChkR,  aftPayChkR)) {
						return true;
					}
				}
				return false;
			};
			_delpaySchdL.forEach(r -> r.setBooleanNE("force", force.apply(r.pay_chk_mng_no())));
			_insUpdpaySchdL.forEach(r -> r.setBooleanNE("force", force.apply(r.pay_chk_mng_no())));
			delApApplSchdCommon(_delpaySchdL, true);
			
			_apApplSchdL = MCList.create(MST_AP_APPL_SCHD_R.class);
			crtApApplSchdCommon(_payChkL, _insUpdpaySchdL, _apApplSchdL, true);
		}
		
		/**
		 * 支払実績明細を更新する。
		 */
		protected void updPayActDClear() {
			
			// 更新前にいったんクリアする
			MST_PAY_ACT_D_R t = MST_PAY_ACT_D_R.create("T");

			execDbUpdate("MSBHL5030_MST_PAY_ACT_D_U01", t, _payChkL,
					t.calc_tgt_pay_chk_mng_no.eq(bindEx("pay_chk_mng_no")),
					t.calc_tgt_pay_chk_mng_no);
		}
		
		/**
		 * 支払実績明細を更新する。
		 */
		protected void updPayActD() {
			
			updPayActDCommon(up0(), up3(), _payActIdxkey);
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {

			down0().setAll(up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
		
		/**
		 * 上り電文の支払予定と買掛明細のインデックスを作成する。
		 */
		protected void createIndex() {
			
			_apDIdxkey = up1().createIndex(PaySchd_DtlApdR.$hdr_peg_no);
			_paySchdIdxkey = up2().createIndex(PaySchd_DtlSchdR.$hdr_peg_no);
			_payActIdxkey = up3().createIndex(PaySchd_DtlActR.$hdr_peg_no);
			_advPayActIdxkey = up4().createIndex(PaySchd_DtlActR.$hdr_peg_no);
		}
		
		/**
		 * 支払照合ヘッダに紐付く買掛明細を取得する。
		 * @param payChkR 支払照合ヘッダ
		 * @return 買掛明細
		 */
		protected MCList<PaySchd_DtlApdR> getUpApDL(PaySchd_HdrR payChkR) {

			return up1().subList(_apDIdxkey, payChkR.hdr_peg_no());
		}
		
		/**
		 * 支払照合ヘッダに紐付く支払予定を取得する。
		 * @param payChkR 支払照合ヘッダ
		 * @return 支払予定
		 */
		protected MCList<PaySchd_DtlSchdR> getUpPaySchdL(PaySchd_HdrR payChkR) {
			
			return up2().subList(_paySchdIdxkey, payChkR.hdr_peg_no());
		}
		
		/**
		 * 支払照合ヘッダに紐付く支払実績を取得する。
		 * @param payChkR 支払照合ヘッダ
		 * @return 支払実績
		 */
		protected MCList<PaySchd_DtlActR> getUpPayActL(PaySchd_HdrR payChkR) {
			
			return up3().subList(_payActIdxkey, payChkR.hdr_peg_no());
		}
		
		/**
		 * 買掛明細を設定する（PaySchd_Upd01用）
		 * @param up1L 上り電文の買掛明細リスト
		 * @param apDL 買掛明細リスト
		 */
		protected void setApDL(MCList<PaySchd_DtlApdR> up1L, MCList<MST_AP_D_R> apDL) {
			MCIndexKey idx = apDL.createIndex(MST_AP_D_R.$ap_d_no);
			
			String[] upCols = {
				MST_AP_D_R.$pay_schd_d_print_rmrks,
				MST_AP_D_R.$pay_ntc_d_print_rmrks,
				MST_AP_D_R.$intr_rmrks,
				MST_AP_D_R.$sub_char1,
				MST_AP_D_R.$sub_char2,
				MST_AP_D_R.$sub_char3,
				MST_AP_D_R.$pay_chk_no,			// PaySchd_Upd01ではコピーする
				MST_AP_D_R.$pay_chk_mng_no		// PaySchd_Upd01ではコピーする
			};
			for (PaySchd_DtlApdR r : up1L) {
				MST_AP_D_R apdR = apDL.getFirst(idx, r.ap_d_no());
				if (!isNull(apdR)) {		// 消費税差額分でnullあり
					apdR.setValuesByName(r.ap_d(), upCols);
					r.ap_d(apdR);
				}
			}
		}
		
		/**
		 * 支払通知書ヘッダ履歴の最新ＦＬＧを更新する。
		 */
		protected void updPayNtcHis() {
			
			if (_updPayNtcHisL.isEmpty()) {
				return;
			}
			
			// 支払通知書ヘッダ履歴の更新
			MST_PAY_NTC_HIS_R t = MST_PAY_NTC_HIS_R.create("T");
			MCQueryApiBuilder payNtcHisL_bldr = MCQueryApiBuilder.create(t);
			payNtcHisL_bldr.setSetVL(t.latest_flg, value(false));
			payNtcHisL_bldr.setWhere(t.pay_chk_no.eq(bindEx("pay_chk_no")));
			payNtcHisL_bldr.addWhereWithAnd(t.pay_ntc_rev.eq(bindEx("pay_ntc_rev")));
			dbUpdate("MSBHL5030_MST_PAY_NTC_HIS_U01", _updPayNtcHisL, payNtcHisL_bldr);
		}
		
		/**
		 * 支払通知書ヘッダ履歴と支払通知書明細履歴を削除する。
		 */
		protected void delPayNtcHis() {
			
			if (_delPayNtcHisL.isEmpty()) {
				return;
			}
			
			// 支払通知書ヘッダ履歴の取得
			MCList<MST_PAY_NTC_HIS_R> payNtcHisL = getPayNtcHis();
			
			// 支払通知書ヘッダ履歴の削除
			MCQueryApiBuilder payNtcHisL_bldr = MCQueryApiBuilder.create(MST_PAY_NTC_HIS_R.create("T"));
			dbDeleteKey("MSBHL5030_MST_PAY_NTC_HIS_D01", payNtcHisL, payNtcHisL_bldr);
			
			// 支払通知書明細履歴の削除
			MST_PAY_NTC_D_HIS_R payNtcDHis_dbc = MST_PAY_NTC_D_HIS_R.create("T");
			execDbDelete("MSBHL5030_MST_PAY_NTC_D_HIS_D01", payNtcDHis_dbc,
					payNtcDHis_dbc.pay_ntc_his_no.eq(bind("pay_ntc_his_no")), payNtcHisL);
		}
		
		/**
		 * 支払通知書ヘッダ履歴を取得する。
		 * @return 支払通知書ヘッダ履歴
		 */
		protected MCList<MST_PAY_NTC_HIS_R> getPayNtcHis() {
			
			MCList<MST_PAY_NTC_HIS_R> payNtcHisL = MCList.create(MST_PAY_NTC_HIS_R.class);
			MST_PAY_NTC_HIS_R t = MST_PAY_NTC_HIS_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.pay_ntc_his_no);
			dbc_bldr.setWhere(t.pay_chk_no.eq(bind("pay_chk_no")));
			dbc_bldr.addWhereWithAnd(t.pay_ntc_rev.eq(bind("pay_ntc_rev")));
			dbSelect("MSBHL5030_MST_PAY_NTC_HIS_S01", payNtcHisL, dbc_bldr, _delPayNtcHisL);
			return payNtcHisL;
		}
	}

	/**
	 * PaySchd_Upd02オペレーション.<p>
	 *
	 * 相殺分の支払実績を更新する。（債務承認後実行処理用）<br>
	 */
	public class PaySchd_Upd02 extends MSBHL_PaySchdRegService_MC_A.PaySchd_Upd02 {
		protected MCList<PaySchd_HdrR> _payChkL;
		protected MCList<PaySchd_DtlActR> _payActL;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			initPayCache(up0());
			updPayActD(true);
			doSetoffApAmt();
			calcPayChkAmt();
			updPayActD(false);
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setPegNo(PaySchd_HdrR.$hdr_peg_no, up0());
		}

		/**
		 * 相殺分の支払実績を作成する
		 */
		protected void doSetoffApAmt() {
			setPayActChk01Common(crtPayChkL(), crtPaySchdL(), getApApplSchdL());
			_payActL = callPayActServiceInsUpd();
		}

		/**
		 * 上り電文の支払照合管理ＮＯから支払照合ヘッダリストを生成する
		 */
		protected MCList<PaySchd_HdrR> crtPayChkL() {
			_payChkL = MCList.create(PaySchd_HdrR.class);
			for (PaySchd_HdrR upPayChkR : up0()) {
				PaySchd_HdrR payChkR = _payChkL.add();
				payChkR.pay_chk(getCachePayChkR(upPayChkR.pay_chk_mng_no()));
				payChkR.hdr_peg_no(upPayChkR.hdr_peg_no());
				payChkR.data_crud_typ(upPayChkR.data_crud_typ());
			}
			return _payChkL;
		}

		/**
		 * 上り電文の支払照合管理ＮＯから支払予定リストを生成する
		 */
		protected MCList<PaySchd_DtlSchdR> crtPaySchdL() {
			MCList<PaySchd_DtlSchdR> paySchdL = MCList.create(PaySchd_DtlSchdR.class);
			for (PaySchd_HdrR upPayChkR : up0()) {
				MCList<MST_PAY_SCHD_R> cachePaySchdL = getCachePaySchdL(upPayChkR.pay_chk_mng_no());
				if (isNull(cachePaySchdL)) {
					continue;
				}
				for (MST_PAY_SCHD_R r : cachePaySchdL) {
					PaySchd_DtlSchdR paySchdR = paySchdL.add();
					paySchdR.pay_schd(r);
					paySchdR.hdr_peg_no(upPayChkR.hdr_peg_no());
					paySchdR.data_crud_typ(upPayChkR.data_crud_typ());
				}
			}
			return paySchdL;
		}

		/**
		 * 上り電文の支払照合管理ＮＯから買掛消込予定を取得する
		 */
		protected MCList<MST_AP_APPL_SCHD_R> getApApplSchdL() {
			MCList<MST_PAY_CHK_R> bind = MCList.create(MST_PAY_CHK_R.class);
			for (PaySchd_HdrR payChkR : up0()) {
				bind.add().pay_chk_mng_no(payChkR.pay_chk_mng_no());
			}
			MCQueryApiBuilder bind_bldr = MCQueryApiBuilder.create(MST_PAY_CHK_R.create("T"));
			dbWkDelete("MSBHL5030_MSW_PAY_CHK_D01", bind_bldr.getBaseDbc());
			dbWkInsert("MSBHL5030_MSW_PAY_CHK_I01", bind, bind_bldr.getBaseDbc());

			MCList<MST_AP_APPL_SCHD_R> dbc = MCList.create(MST_AP_APPL_SCHD_R.class);
			MST_AP_APPL_SCHD_R t1 = MST_AP_APPL_SCHD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t1);
			MST_PAY_SCHD_R t2 = MST_PAY_SCHD_R.create("T2");
			MSW_PAY_CHK_KEY_R w1 = MSW_PAY_CHK_KEY_R.create("W1");
			dbc_bldr.addInnerJoin(t2, bracket(t2.pay_schd_no.eq(t1.pay_schd_no)));
			dbc_bldr.addInnerJoin(w1, bracket(w1.pay_chk_mng_no.eq(t2.pay_chk_mng_no)));
			dbSelect("MSBHL5030_MST_AP_APPL_SCHD_S01", dbc, dbc_bldr);

			dbWkDelete("MSBHL5030_MSW_PAY_CHK_D02", bind_bldr.getBaseDbc());

			return dbc;
		}
		
		/**
		 * 繰越情報の参入対象となる支払実績を更新する
		 */
		protected void updPayActD(boolean isDel) {
			if (isDel) {
				MCList<PaySchd_HdrR> delPayChkL = up0().subList(r -> isDel(r));
				if (!delPayChkL.isEmpty()) {
					// 計算対象支払照合管理ＮＯをクリア
					MST_PAY_ACT_D_R dbc = MST_PAY_ACT_D_R.create("T");
					MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
					
					builder.setWhere(dbc.pay_chk_mng_no.eq(bindEx("pay_chk_mng_no")));
					builder.addWhereWithAnd(dbc.calc_tgt_pay_chk_mng_no.isNotNull());
					builder.setSetVL(dbc.calc_tgt_pay_chk_mng_no, nullValue());
					
					dbUpdate("MSBHL5030_MST_PAY_ACT_D_U02", delPayChkL, builder);
				}
			}
			else {
				if (!_payActL.isEmpty()) {
					// 計算対象支払照合管理ＮＯを設定
					MST_PAY_ACT_D_R dbc = MST_PAY_ACT_D_R.create("T");
					MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
					
					builder.setWhere(dbc.pay_act_d_no.eq(bindEx("pay_act_d_no")));
					builder.addWhereWithAnd(dbc.pay_act_d_seq.eq(bindEx("pay_act_d_seq")));
					builder.addWhereWithAnd(dbc.calc_tgt_pay_chk_mng_no.isNull());
					builder.setSetVL(dbc.calc_tgt_pay_chk_mng_no, bindEx(MST_PAY_ACT_D_R.$pay_chk_mng_no));

					dbUpdate("MSBHL5030_MST_PAY_ACT_D_U03", _payActL, builder);
				}
			}
		}
		
		/**
		 * 相殺の支払実績を繰越情報に反映する
		 */
		protected void calcPayChkAmt() {
		
			// 算入済みの支払実績を取得
			MCList<MST_PAY_ACT_D_R> dbc = MCList.create(MST_PAY_ACT_D_R.class);
			MST_PAY_ACT_D_R t = MST_PAY_ACT_D_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setDistinct();
			dbc_bldr.setSelect(t.pay_act_d_no, t.pay_act_d_seq, t.calc_tgt_pay_chk_mng_no);
			dbc_bldr.setWhere(t.calc_tgt_pay_chk_mng_no.eq(bind("pay_chk_mng_no")));
			dbSelect("MSBHL5030_MST_PAY_ACT_D_S04", dbc, dbc_bldr, _payChkL);
			
			// 算入対象の支払実績
			MCList<PaySchd_DtlActR> payActL = MCList.create(PaySchd_DtlActR.class);
			MCIndexKey
				idx1 = dbc.createIndex(MST_PAY_ACT_D_R.$calc_tgt_pay_chk_mng_no),
				idx2 = _payActL.createIndex(PaySchd_DtlActR.$hdr_peg_no);
			for (PaySchd_HdrR hdrR : _payChkL) {
				// 算入済み分
				for (MST_PAY_ACT_D_R r : dbc.subList(idx1, hdrR.pay_chk_mng_no())) {
					PaySchd_DtlActR payActR = payActL.add();
					payActR.hdr_peg_no(hdrR.hdr_peg_no());
					payActR.pay_act_d_no(r.pay_act_d_no());
					payActR.pay_act_d_seq(r.pay_act_d_seq());
				}
				// 今回算入する分（承認取消分は対象外）
				if (isUpd(hdrR)) {
					for (PaySchd_DtlActR r : _payActL.subList(idx2, hdrR.hdr_peg_no())) {
						PaySchd_DtlActR payActR = payActL.add();
						payActR.hdr_peg_no(hdrR.hdr_peg_no());
						payActR.pay_act_d_no(r.pay_act_d_no());
						payActR.pay_act_d_seq(r.pay_act_d_seq());
					}
				}
			}
			_payActL.setAll(payActL);
			
			BiFunction<PaySchd_Srch02_RsltR, String, MCNumber> amt = (r, col) -> {
				MCNumber ret = null;
				if (!isNull(r)) {
					ret = r.getNumber(col);
				}
				if (isSame(col, PaySchd_Srch02_RsltR.$schd_pay_amt)) {
					ret = nvl(ret, MCNumber.ZERO);
				}
				return ret;
			};
			
			MCList<PaySchd_Srch02_RsltR> srch06L = callPaySchdRegServiceSrch06(_payChkL, _payActL, MCList.create(PaySchd_AdvPayActR.class));
			MCIndexKey srch06Idx = srch06L.createIndex(PaySchd_Srch02_RsltR.$hdr_peg_no);
			
			for (PaySchd_HdrR payChkR : _payChkL) {
				PaySchd_Srch02_RsltR srch06R = srch06L.getFirst(srch06Idx, payChkR.hdr_peg_no());
				payChkR.pay_chk().bfw_amt(amt.apply(srch06R, PaySchd_Srch02_RsltR.$bfw_amt));
				payChkR.pay_chk().account_amt(amt.apply(srch06R, PaySchd_Srch02_RsltR.$account_amt));
				payChkR.pay_chk().cash_amt(amt.apply(srch06R, PaySchd_Srch02_RsltR.$cash_amt));
				payChkR.pay_chk().note_amt(amt.apply(srch06R, PaySchd_Srch02_RsltR.$note_amt));
				payChkR.pay_chk().setoff_amt(amt.apply(srch06R, PaySchd_Srch02_RsltR.$setoff_amt));
				payChkR.pay_chk().setoff_tax_amt(amt.apply(srch06R, PaySchd_Srch02_RsltR.$setoff_tax_amt));
				payChkR.pay_chk().schd_pay_amt(amt.apply(srch06R, PaySchd_Srch02_RsltR.$schd_pay_amt));
			}
			
			// 支払照合に反映
			MST_PAY_CHK_R t2 = MST_PAY_CHK_R.create("T");

			execDbUpdateKey("MSBHL5030_MST_PAY_CHK_U04", t2, _payChkL.innerRowList("pay_chk"),
					t2.bfw_amt, t2.account_amt, t2.cash_amt, t2.note_amt, t2.setoff_amt,
					t2.setoff_tax_amt, t2.schd_pay_amt);
		}
	}

	/**
	 * PaySchd_Del01オペレーション.<p>
	 *
	 * 支払照合、支払予定を削除する。<br>
	 */
	public class PaySchd_Del01 extends MSBHL_PaySchdRegService_MC_A.PaySchd_Del01 {
		
		/**
		 * 支払照合ヘッダリスト
		 */
		protected MCList<MST_PAY_CHK_R> _payChkL = null;
		
		/**
		 * 支払予定リスト
		 */
		protected MCList<MST_PAY_SCHD_R> _paySchdL = null;
		
		/**
		 * 買掛明細リスト
		 */
		protected MCList<MST_AP_D_R> _apDL = null;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			
			getPayChkL();
			
			getPaySchdL();
			
			getApDL();
			
			doSetoffApAmtDel();
			
			doPaySchdSendIf();
			
			delAprv();
			
			delTaxDiffPayCl();
			
			delCoApD();
			
			updApd();
			
			delPayChk();
			
			delPaySchd();
			
			delApApplSchd();
			
			updPayActD();
			
			updAdvPayAct();
			updAdvPayActPayChk(up0(), null, null);
			
			updPayNtcHis();

			delAttach();
		}
		
		/**
		 * 支払照合ヘッダを取得する。
		 */
		protected void getPayChkL() {
			
			_payChkL = MCList.create(MST_PAY_CHK_R.class);
			MCQueryApiBuilder payChkL_bldr = MCQueryApiBuilder.create(MST_PAY_CHK_R.create("T"));
			dbSelectColumn("MSBHL5030_MST_PAY_CHK_S02", _payChkL, payChkL_bldr, MST_PAY_CHK_R.$pay_chk_mng_no, up0(), PaySchd_HdrR.$pay_chk_mng_no);
		}
		
		/**
		 * 支払予定を取得する。
		 */
		protected void getPaySchdL() {
			
			_paySchdL = MCList.create(MST_PAY_SCHD_R.class);
			MCQueryApiBuilder paySchdL_bldr = MCQueryApiBuilder.create(MST_PAY_SCHD_R.create("T"));
			dbSelectColumn("MSBHL5030_MST_PAY_SCHD_S01", _paySchdL, paySchdL_bldr, MST_PAY_SCHD_R.$pay_chk_mng_no, up0(), PaySchd_HdrR.$pay_chk_mng_no);
		}
		
		/**
		 * 買掛明細を取得する。
		 */
		protected void getApDL() {
			
			_apDL = MCList.create(MST_AP_D_R.class);
			MCQueryApiBuilder apDL_bldr = MCQueryApiBuilder.create(MST_AP_D_R.create("T"));
			dbSelectColumn("MSBHL5030_MST_AP_D_S06", _apDL, apDL_bldr, MST_AP_D_R.$pay_chk_mng_no, _payChkL, MST_PAY_CHK_R.$pay_chk_mng_no);
			
			// 繰越分も取得

			MCList<MST_AP_D_R> dbc = MCList.create(MST_AP_D_R.class);
			String[] cols = new String[]{
				MST_AP_D_R.$org_ap_d_no, MST_AP_D_R.$crryovr_ap_d_no, MST_AP_D_R.$crryovr_src_ap_d_no
			};
			_apDL.forEach(r -> {
				for (String col : cols) {
					String val = r.getString(col);
					if (!isNull(val)) {
						dbc.add().ap_d_no(val);
					}
				}
			});
			MST_AP_D_R t = MST_AP_D_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbWkDelete("MSBHL5030_MSW_AP_D_D08", dbc_bldr.getBaseDbc());
			dbWkInsert("MSBHL5030_MSW_AP_D_I05", dbc.groupBy(dbc.createRow().getKeyColumn()), dbc_bldr.getBaseDbc());
			
			dbc.init();
			dbc_bldr = MCQueryApiBuilder.create(t);
			MSW_AP_D_KEY_R w = MSW_AP_D_KEY_R.create("W");
			dbc_bldr.addInnerJoin(w, bracket(w.ap_d_no.eq(t.ap_d_no)));
			dbSelect("MSBHL5030_MST_AP_D_S07", dbc, dbc_bldr);
			dbWkDelete("MSBHL5030_MSW_AP_D_D09", dbc_bldr.getBaseDbc());
			
			_apDL.merge(dbc, dbc.createRow().getKeyColumn());
			
			setApDL(up1(), _apDL);
		}
		
		/**
		 * 承認処理の取消を行う。
		 */
		protected void delAprv() {
			
			callAprvServiceDel(up0(), _payChkL);
		}
		
		/**
		 * 買掛金を相殺する。
		 */
		protected void doSetoffApAmtDel() {
			// 買掛金相殺のため、支払実績サービスを実行する
			callPayActServiceDel();
		}
		
		/**
		 * 支払予定を送信する
		 */
		protected void doPaySchdSendIf() {
			
			callPaySchdSendIfCommon(up0(), MAC_DATA_CRUD_TYP.DEL);
		}
		
		/**
		 * 前渡金実績を更新する
		 */
		protected void updAdvPayAct() {
			MST_ADV_PAY_ACT_R dbc = MST_ADV_PAY_ACT_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			MST_ADV_PAY_ACT_R pa = MST_ADV_PAY_ACT_R.create("PA");
			
			builder.setWhere(dbc.adv_pay_act_no.eq(bindEx("adv_pay_act_no")));
			builder.addWhereWithAnd(exists(subQuery()
					.select(value("X"))
					.from(pa)
					.where(dbc.adv_pay_act_no.eq(pa.adv_pay_act_no)
							.and(dbc.adv_pay_act_seq.eq(pa.adv_pay_act_seq)
							.and(pa.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))))));
			builder.setSet("trd_cur_setoff_schd_amt", dbc.trd_cur_setoff_schd_amt,
					dbc.trd_cur_setoff_schd_amt.subtract(bindEx("trd_cur_amt")));
			builder.addSet("trd_cur_not_proc_bal", dbc.trd_cur_not_proc_bal,
					dbc.trd_cur_not_proc_bal.add(bindEx("trd_cur_amt")));
			
			dbUpdate("MSBHL5030_MST_ADV_PAY_ACT_U01", _paySchdL.subList(r -> !isNull(r.adv_pay_act_no())), builder);
		}
		
		/**
		 * 消費税差額調整(取消)を行う。
		 */
		protected void delTaxDiffPayCl() {
			
			delTaxDiffPayClCommon(_apDL);
		}
		
		/**
		 * 一部支払・全額繰越の買掛明細を削除する。
		 */
		protected void delCoApD() {
			
			setCrryovrTgtFlg(up1(), _apDL);
			
			callApDtlRegServiceDel(up1(), _apDL);
		}
		
		/**
		 * 買掛明細を更新する。
		 */
		protected void updApd() {
			
			MST_AP_D_R t = MST_AP_D_R.create("T");
			MCQueryApiBuilder apDL_bldr = MCQueryApiBuilder.create(t);

			apDL_bldr.setSet(t.pay_chk_no,
					t.pay_chk_mng_no,
					t.chk_flg,
					t.pay_schd_d_print_rmrks,
					t.pay_ntc_d_print_rmrks,
					t.intr_rmrks,
					t.sub_char1,
					t.sub_char2,
					t.sub_char3);
			
			_apDL.clear(MST_AP_D_R.$pay_chk_no,
					MST_AP_D_R.$pay_chk_mng_no,
					MST_AP_D_R.$chk_flg,
					MST_AP_D_R.$pay_schd_d_print_rmrks,
					MST_AP_D_R.$pay_ntc_d_print_rmrks,
					MST_AP_D_R.$intr_rmrks,
					MST_AP_D_R.$sub_char1,
					MST_AP_D_R.$sub_char2,
					MST_AP_D_R.$sub_char3);
			
			dbUpdateKey("MSBHL5030_MST_AP_D_U01", _apDL, apDL_bldr);
		}
		
		/**
		 * 支払照合ヘッダを削除する。
		 */
		protected void delPayChk() {
			
			MCQueryApiBuilder payChkL_bldr = MCQueryApiBuilder.create(MST_PAY_CHK_R.create("T"));
			dbDeleteKey("MSBHL5030_MST_PAY_CHK_D01", _payChkL, payChkL_bldr);
		}
		
		/**
		 * 支払予定を削除する。
		 */
		protected void delPaySchd() {
			
			MCQueryApiBuilder paySchdL_bldr = MCQueryApiBuilder.create(MST_PAY_SCHD_R.create("T"));
			dbDeleteKey("MSBHL5030_MST_PAY_SCHD_D02", _paySchdL, paySchdL_bldr);
		}
		
		/**
		 * 買掛消込予定を削除する。
		 */
		protected void delApApplSchd() {
			
			delApApplSchdCommon(_paySchdL, false);
		}
		
		/**
		 * 支払実績明細を更新する。
		 */
		protected void updPayActD() {
			
			// 更新カウンタを進めるために空更新
			MST_PAY_CHK_R dbc = MST_PAY_CHK_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			MST_PAY_ACT_D_R w = MST_PAY_ACT_D_R.create("W");

			builder.setWhere(exists(subQuery()
					.select(value("X"))
					.from(w)
					.where(w.pay_chk_mng_no.eq(dbc.pay_chk_mng_no)
							.and(w.calc_tgt_pay_chk_mng_no.eq(bindEx("pay_chk_mng_no"))))));
			builder.setSetVL(dbc.pay_chk_mng_no, dbc.pay_chk_mng_no);
			dbUpdate("MSBHL5030_MST_PAY_CHK_U05", _payChkL, builder);

			MST_PAY_ACT_D_R t = MST_PAY_ACT_D_R.create("T");

			execDbUpdate("MSBHL5030_MST_PAY_ACT_D_U04", t, _payChkL,
					t.calc_tgt_pay_chk_mng_no.eq(bindEx("pay_chk_mng_no")),
					t.calc_tgt_pay_chk_mng_no);
		}
		
		/**
		 * 支払通知書ヘッダ履歴の取消ＦＬＧを更新する。
		 */
		protected void updPayNtcHis() {
			// 支払通知書ヘッダ履歴の更新
			MST_PAY_NTC_HIS_R t = MST_PAY_NTC_HIS_R.create("T");
			MCQueryApiBuilder payNtcHisL_bldr = MCQueryApiBuilder.create(t);
			payNtcHisL_bldr.setSetVL(t.can_flg, value(true));
			payNtcHisL_bldr.setWhere(t.pay_chk_no.eq(bindEx("pay_chk_no")));
			payNtcHisL_bldr.addWhereWithAnd(t.pay_ntc_rev.eq(bindEx("pay_ntc_rev")));
			dbUpdate("MSBHL5030_MST_PAY_NTC_HIS_U02", _payChkL, payNtcHisL_bldr);
		}
		/**
		 * 添付ファイル情報の更新を行う。
		 */
		protected void delAttach() {
			callAttachServiceDel01(up0(), _payChkL);
		}
		/**
		 * 添付帳票登録サービスの削除オペレーションを呼び出す。
		 */
		protected void callAttachServiceDel01(MCList<PaySchd_HdrR> upPayChkL, MCList<MST_PAY_CHK_R> payChkL) {
			MBBCL_AttachService.Attach_Del01 ope = MBBCL_AttachService.crtAttach_Del01();
			Attach_Chk02_DtlR upR = null;
			for(PaySchd_HdrR upPayChkR : upPayChkL) {
				MST_PAY_CHK_R payChkR = payChkL.getFirst(MST_PAY_CHK_R.$pay_chk_mng_no, upPayChkR.pay_chk_mng_no());
				if(!isNull(payChkR)) {
					upR = Attach_Chk02_DtlR.create();
					editUpAttachSrv(upR,payChkR);
					ope.up0().add(upR);
				}
			}
			if(!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		protected void editUpAttachSrv(Attach_Chk02_DtlR r,MST_PAY_CHK_R payChkR) {
			r.biz_typ(MAC_BIZ_TYP.PAY_NTC.value());
			r.report_id("MSBHR0040");
			r.biz_key1(payChkR.pay_chk_no());
			r.biz_key2(payChkR.pay_ntc_rev().toString());
		}
	}

	/**
	 * PaySchd_Chk01オペレーション.<p>
	 *
	 * 支払予定の登録が可能かチェックをする。<br>
	 */
	public class PaySchd_Chk01 extends MSBHL_PaySchdRegService_MC_A.PaySchd_Chk01 {
		
		/**
		 * 支払照合のインデックス
		 */
		protected MCIndexKey _payChkIdxkey = null;
		
		/**
		 * 買掛明細のインデックス
		 */
		protected MCIndexKey _apDIdxkey = null;
		
		/**
		 * 支払予定のインデックス
		 */
		protected MCIndexKey _paySchdIdxkey = null;
		/**
		 * 支払実績のインデックス
		 */
		protected MCIndexKey _payActIdxkey = null;
		/**
		 * 前渡金実績のインデックス
		 */
		protected MCIndexKey _advPayActIdxkey = null;
		
		/**
		 * 金額を反転させるクラスのインスタンス
		 */
		protected InverNum<PaySchd_DtlApdR> _invertNum = new InverNum<>();
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			createIndex();
			
			inverNum(true);
			
			super.doIt();
			
			setPayChkErrFlg();
			
			callAprvServiceChk(getChkList(up0()));
			
			callPayActServiceChk(getChkList(up0()), up2());
			
			chkAfter();
			
			inverNum(false);
			
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {

			initPayCache(up0());
			initAdvPayActCache(up0());
			initPayActDCacheByPayChkCache(up0());
			
			MCMessageList msgL = new MCMessageList();
			
			msgL.addAll(chkUpdCntrPayChk());
			
			msgL.addAll(chkUpdCntrAdvPayAct());
			
			msgL.addAll(super.doServerCheckBase());

			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = new MCMessageList();
			
			msgL.addAll(chkReq());
			
			msgL.addAll(super.doServerCheck());
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			setPayChkErrFlg();
			
			MCList<PaySchd_HdrR> chkL = getChkList(up0());
			
			if (!isNull(chkL)) {
				
				msgL.addAll(checkAmtDecPlace(chkL));
				
				msgL.addAll(checkDt(chkL));
				
				msgL.addAll(chkInterimFlg(chkL));
				
				msgL.addAll(chkPayWtaxAmt(chkL));
				
				msgL.addAll(chkTaxDiffPayCl(chkL));
				
				msgL.addAll(chkCoPayDptChk(chkL));
				
				msgL.addAll(chkCl(chkL));
				
				msgL.addAll(chkPayChk(chkL));
				
				msgL.addAll(chkPayAmtSum(chkL));
				
				msgL.addAll(chkPaySchdAmt(chkL));
				
				msgL.addAll(chkComPaid(chkL));
				
				msgL.addAll(chkPaySchdAdvPayAmt(chkL));
				
				msgL.addAll(chkOnlyAdvPayAct(chkL));
				
				msgL.addAll(chkAdvPayAct(chkL));
				
				msgL.addAll(chkCoApDSw(chkL));
			}
			
			return msgL;
		}
		@Override
		protected <E extends MCConstRow> MCMessageList doSvrChkListLogicMain(
				MCNumber paramIndex,
				MCList<E> chkTarL,
				String chkTarCol, String listLogicId,
				String listIn, String listInBase,
				String listOut, String listOutBase) {
			
			// 相殺先リストロジック対象外
			if (isSame(chkTarCol, PaySchd_DtlSchdR.$setoff_cd)) {
				MCList<PaySchd_DtlSchdR> notDtlTgtL = MCList.create(PaySchd_DtlSchdR.class); 
				for (MCConstRow chkRow : chkTarL) {
					PaySchd_DtlSchdR dtlR = (PaySchd_DtlSchdR)chkRow;
					
					if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
						continue;
					}
					
					if (!isNull(dtlR.setoff_cd()) && !isNull(dtlR.ap_setoff_typ())) {
						// 相殺先区分＝'9'：任意 はチェック対象から除外
						if (MAC_AP_SETOFF_TYP.isFLEX(dtlR.ap_setoff_typ())) {
							notDtlTgtL.add(dtlR);
						}
					}
				}
				
				if (!notDtlTgtL.isEmpty()) {
					// チェック対象から除外する
					chkTarL.removeAll(notDtlTgtL);
				}
			}
			
			if (isNull(chkTarL)) {
				return new MCMessageList();
			}
			
 			return super.doSvrChkListLogicMain(paramIndex, chkTarL, chkTarCol, listLogicId, listIn,
					listInBase, listOut, listOutBase);
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			MCIndexKey idx = up0().createIndex(PaySchd_HdrR.$hdr_peg_no);
			for (PaySchd_DtlSchdR r : up2()) {
				PaySchd_HdrR hdrR = up0().getFirst(idx, r.hdr_peg_no());
				r.reg_dt(hdrR.reg_dt());
			}
		}

		@Override
		protected void customListLogicCnd(String column, MCNumber paramIndex, MCConstRow data, Map<String, Comparable<?>> cnd) {
			super.customListLogicCnd(column, paramIndex, data, cnd);
			if (data instanceof PaySchd_HdrR) {
				PaySchd_HdrR r = (PaySchd_HdrR)data;
				if (isSame(column, PaySchd_HdrR.$bsppl_dpt_cd)) {
					cnd.put(BpCols.$i_dt, r.pay_spot_flg() ? r.reg_dt() : r.bsppl_cl_dt());
				}
			}
			else if (data instanceof PaySchd_DtlSchdR) {
				PaySchd_DtlSchdR r = (PaySchd_DtlSchdR)data;
				// 相殺先
				if (isSame(column, PaySchd_DtlSchdR.$setoff_cd)) {
					// ここでは取引先マスタに対する存在チェックのみ行う
					// ちなみに以下の指定をしても意図したチェックは行われない（取引先マスタに存在しない場合に出力されるメッセージが変わるだけ）
					if (MAC_AP_SETOFF_TYP.isBSPPL(r.ap_setoff_typ())) {
						cnd.put(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.BSPPL.value());
					}
					else if (MAC_AP_SETOFF_TYP.isACST(r.ap_setoff_typ())) {
						cnd.put(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.AP_SETOFF.value());
					}
					else if (MAC_AP_SETOFF_TYP.isPRSPPL(r.ap_setoff_typ())) {
						cnd.put(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.ASPPL.value());
					}
					else {
						// 9：任意 はチェックしない
					}
				}
				// 相殺部門
				if (isSame(column, PaySchd_DtlSchdR.$so_dpt_cd)) {
					// ここでは部門マスタに対する存在チェックのみ行う
					// ちなみに以下の指定をしても意図したチェックは行われない（取引先マスタに存在しない場合に出力されるメッセージが変わるだけ）
					if (MAC_AP_SETOFF_TYP.isBSPPL(r.ap_setoff_typ())
						|| MAC_AP_SETOFF_TYP.isPRSPPL(r.ap_setoff_typ())) {
						cnd.put(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.AP.value());
					}
					else if (MAC_AP_SETOFF_TYP.isACST(r.ap_setoff_typ())) {
						cnd.put(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.AR.value());
					}
					else {
						cnd.put(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.COMM.value());
					}
				}
			}
		}
		
		@Override
		@SuppressWarnings("unchecked")
		protected <R extends MCRow> MCList<R> getChkList(MCContainer container) {
			MCList<R> list = super.getChkList(container);
			
			// 対応するヘッダがエラーのロウはチェック対象から除外する
			if (container == up1() || container == up2()) {
				MCList<R> removeL = ((MCList<R>)container).createInstance();
				for (R r : (MCList<R>)container) {
					PaySchd_HdrR payChkR = getUpPayChkR(r.getNumberNE("hdr_peg_no"));
					if (payChkR.err_flg()) {
						removeL.add(r);
					}
				}
				if (!removeL.isEmpty()) {
					list.removeAll(removeL);
				}
			}
			return list;
		}
		
		/**
		 * チェック後処理
		 */
		protected void chkAfter() {

			String[] key = {
				PaySchd_HdrR.$bsppl_cd,
				PaySchd_HdrR.$bsppl_dpt_cd,
				PaySchd_HdrR.$purc_act_no,
				PaySchd_HdrR.$rcpt_iv_mng_no,
				PaySchd_HdrR.$rcpt_iv_no,
				PaySchd_HdrR.$trd_cur_cd,
				PaySchd_HdrR.$wrk_no
			};
			
			for (MCList<PaySchd_HdrR> list : up0().groupList(key)) {
				
				list.sort(SortType.ASC, PaySchd_HdrR.$bsppl_cl_dt, PaySchd_HdrR.$pay_chk_mng_no);
				
				boolean errFlg = false;
				for (PaySchd_HdrR r : list) {
					
					if (r.err_flg()) {
						errFlg = true;
					}
					else if (errFlg) {
						MCMessagePool.add(new MCMessage(r, null, MSBHL0053,
							r.bsppl_cd(), r.bsppl_dpt_cd(),
							r.purc_act_no(), r.rcpt_iv_mng_no(), r.rcpt_iv_no(),
							r.trd_cur_cd(), r.wrk_no(), toYMDString(r.bsppl_cl_dt())));
						r.err_flg(true);
					}
				}
			}
		}

		/**
		 * 買掛明細の金額の符号を反転させる
		 */
		protected void inverNum(boolean boo) {
			if (boo) {
				_invertNum.setPm(up1());
				_invertNum.invert(
					up1(),
					PaySchd_DtlApdR.$pay_amt, PaySchd_DtlApdR.$pay_tax_amt, PaySchd_DtlApdR.$pay_wtax_amt);
			}
			else {
				_invertNum.invert();
			}
		}
		
		/**
		 * 支払照合に対する更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntrPayChk() {
		
			MCList<PaySchd_HdrR> chkL = MCList.create(PaySchd_HdrR.class);
			
			// 更新対象の支払照合ヘッダ
			chkL.addAll(up0().subList(r -> !isCrt(r)));
			
			// 登録時に支払照合の今回支払xx額に算入する支払実績に対応する支払照合ヘッダ
			MSBHL_PaySchdRegService.PaySchd_Srch06 srch06 = MSBHL_PaySchdRegService.crtPaySchd_Srch06();
			up0().forEach(r -> {
				PaySchd_Srch02_RsltR cndR = srch06.up0().add();
				cndR.hdr_peg_no(r.hdr_peg_no());
				cndR.bsppl_cd(r.bsppl_cd());
				cndR.bsppl_dpt_cd(r.bsppl_dpt_cd());
				cndR.purc_act_no(r.purc_act_no());
				cndR.rcpt_iv_mng_no(r.rcpt_iv_mng_no());
				cndR.rcpt_iv_no(r.rcpt_iv_no());
				cndR.trd_cur_cd(r.trd_cur_cd());
				cndR.bsppl_cl_dt(r.bsppl_cl_dt());
				cndR.bsppl_cl_day(r.bsppl_cl_day());
				cndR.wrk_no(r.wrk_no());
				cndR.pay_spot_flg(r.pay_spot_flg());
				cndR.last_pay_schd_amt(0);
				cndR.bfw_amt(0);
				cndR.purc_amt(0);
				cndR.purc_ret_amt(0);
				cndR.purc_dscnt_amt(0);
				cndR.tax_amt(0);
				cndR.pay_chk_mng_no(!isCrt(r) ? r.pay_chk_mng_no() : null);
			});
			up3().forEach(r -> {
				PaySchd_Srch02_PayActR cndR = srch06.up1().add();
				cndR.hdr_peg_no(r.hdr_peg_no());
				cndR.pay_act_d(r.pay_act_d());
				cndR.pay_chk(r.pay_chk());
			});
			up4().forEach(r -> {
				PaySchd_Srch02_AdvPayActR cndR = srch06.up2().add();
				cndR.hdr_peg_no(r.hdr_peg_no());
				cndR.adv_pay_act(r.adv_pay_act());
			});
			srch06.exec();
			srch06.down1().forEach(r -> {
				chkL.add().pay_chk_mng_no(r.pay_chk_mng_no());
			});
		
			// 支払照合の今回xx支払額に算入している支払実績に対応する支払照合ヘッダ
			MCList<MST_PAY_ACT_D_R> payActL = MCList.create(MST_PAY_ACT_D_R.class);
			MST_PAY_ACT_D_R t = MST_PAY_ACT_D_R.create("T");
			MCQueryApiBuilder payActL_bldr = MCQueryApiBuilder.create(t);
			payActL_bldr.setDistinct();
			payActL_bldr.setSelect(t.pay_chk_mng_no);
			payActL_bldr.setWhere(t.calc_tgt_pay_chk_mng_no.eq(bind("pay_chk_mng_no")));
			dbSelect("MSBHL5030_MST_PAY_ACT_D_S05", payActL, payActL_bldr, up0().subList(r -> !isCrt(r)));
			payActL.forEach(r -> { chkL.add().pay_chk_mng_no(r.pay_chk_mng_no()); });
			
			// 支払一覧予定登録で対象となった支払照合ヘッダ
			MCList<PaySchd_HdrR> upPayActL = MCList.create(PaySchd_HdrR.class);
			up3().forEach(r -> {
				PaySchd_HdrR chkR = upPayActL.add();
				chkR.hdr_peg_no(r.hdr_peg_no());
				chkR.pay_chk_mng_no(r.pay_chk_mng_no());
				chkR.upd_cntr(r.upd_cntr());
				chkR.setAttributes(r);
			});
			chkL.addAll(upPayActL);
			
			
			MCMessageList msgL = new MCMessageList();
			
			// ロックおよび更新カウンタチェック
			msgL.addAll(chkUpdCntrPayChkCmm(chkL, isUpdCntrChk(up0())));
			
			// 支払実績に対応する支払照合でエラーになった分を反映する
			copyErrFlg(up0(), upPayActL, PaySchd_HdrR.$hdr_peg_no, PaySchd_HdrR.$hdr_peg_no);
			
			return msgL;
		}
		/**
		 * 前渡金実績に対する更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntrAdvPayAct() {
			MCMessageList msgL = new MCMessageList();
			for (PaySchd_AdvPayActR r : up4()) {
				MST_ADV_PAY_ACT_R advPayActR = getCacheAdvPayActR(r.adv_pay_act_no(), r.adv_pay_act_seq());
				msgL.addAll(checkUpdCntrNE(r, PaySchd_AdvPayActR.$adv_pay_upd_cntr, advPayActR));
				setErrFlgCmm(r, msgL);
			}
			return msgL;
		}
		
		/**
		 * 条件付き必須チェックを行う。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkReq() {
			
			MCMessageList msgL = new MCMessageList();
			
			for (PaySchd_HdrR chkHdrR : up0()) {
				
				if ((isCrt(chkHdrR) || isUpd(chkHdrR))) {
					
					msgL.addAll(check(chkHdrR, PaySchd_HdrR.$reg_dt, new FXUCL_RequiredValidater()));
					
					if (!chkHdrR.pay_spot_flg()) {
						msgL.addAll(check(chkHdrR, PaySchd_HdrR.$bsppl_cl_dt, new FXUCL_RequiredValidater()));
						msgL.addAll(check(chkHdrR, PaySchd_HdrR.$bsppl_cl_day, new FXUCL_RequiredValidater()));
					}
				}
				
				MCList<PaySchd_DtlApdR> apDL = getUpApDL(chkHdrR);
				MCList<PaySchd_DtlSchdR> paySchdL = getUpPaySchdL(chkHdrR);
				
				for (PaySchd_DtlApdR chkApDR : apDL) {
					
					if ((isCrt(chkApDR) || isUpd(chkApDR))) {
						
						msgL.addAll(check(chkApDR, PaySchd_DtlApdR.$pay_mtd_typ, new FXUCL_RequiredValidater()));
						
						if (!chkHdrR.pay_spot_flg()
							&& !(MSC_PAY_MTD_TYP.isPART_PAY(chkApDR.pay_mtd_typ()) || MSC_PAY_MTD_TYP.isALL_PAY(chkApDR.pay_mtd_typ()))) {
							msgL.addAll(check(chkApDR, PaySchd_DtlApdR.$pay_crryovr_times, new FXUCL_RequiredValidater()));
						}
						if (!isNull(chkApDR.pay_crryovr_times()) && chkApDR.pay_crryovr_times().isPositive()) {
							msgL.addAll(check(chkApDR, PaySchd_DtlApdR.$co_psppl_cl_day, new FXUCL_RequiredValidater()));
							msgL.addAll(check(chkApDR, PaySchd_DtlApdR.$co_psppl_cl_dt, new FXUCL_RequiredValidater()));
						}
						
						msgL.addAll(check(chkApDR, PaySchd_DtlApdR.$pay_amt, new FXUCL_RequiredValidater()));
					}
				}
				
				for (PaySchd_DtlSchdR chkDtlR : paySchdL) {
					
					if ((isCrt(chkDtlR) || isUpd(chkDtlR))) {
						
						msgL.addAll(check(chkDtlR, PaySchd_DtlSchdR.$ap_sttl_typ, new FXUCL_RequiredValidater()));
						msgL.addAll(check(chkDtlR, PaySchd_DtlSchdR.$pay_schd_dt, new FXUCL_RequiredValidater()));
						
						if (!MAC_AP_STTL_TYP.is_com_paid(chkDtlR.ap_sttl_typ())) {
							msgL.addAll(check(chkDtlR, PaySchd_DtlSchdR.$trd_cur_amt, new FXUCL_RequiredValidater()));
						}
						if (MAC_AP_STTL_TYP.isSETOFF(chkDtlR.ap_sttl_typ())) {
							msgL.addAll(check(chkDtlR, PaySchd_DtlSchdR.$ap_setoff_typ, new FXUCL_RequiredValidater()));

							if (MAC_AP_SETOFF_TYP.isBSPPL(chkDtlR.ap_setoff_typ()) || isApSetOffActFlg(chkDtlR)) {
								msgL.addAll(check(chkDtlR, PaySchd_DtlSchdR.$setoff_cd, new FXUCL_RequiredValidater()));
							}
							if (MAC_AP_SETOFF_TYP.isFLEX(chkDtlR.ap_setoff_typ()) && isApSetOffActFlg(chkDtlR)) {
								msgL.addAll(check(chkDtlR, PaySchd_DtlSchdR.$setoff_nm, new FXUCL_RequiredValidater()));
							}
							if (isApSetOffActFlg(chkDtlR)) {
								msgL.addAll(check(chkDtlR, PaySchd_DtlSchdR.$so_dpt_cd, new FXUCL_RequiredValidater()));
							}
						}
						msgL.addAll(check(chkDtlR, PaySchd_DtlSchdR.$asppl_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(chkDtlR, PaySchd_DtlSchdR.$ap_dpt_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(chkDtlR, PaySchd_DtlSchdR.$pay_dpt_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(chkDtlR, PaySchd_DtlSchdR.$ap_typ, new FXUCL_RequiredValidater()));
					}
					// 未設定の場合、支払実績の計上日を補完するので必須チェックはしない
					//if (isUpd(chkDtlR) || isDel(chkDtlR)) {
					//	if (existsSchdActFlg(getCachePayActDL(chkDtlR.pay_schd_no()))) {
					//		msgL.addAll(check(chkDtlR, PaySchd_DtlSchdR.$can_ac_dt, new FXUCL_RequiredValidater()));
					//	}
					//}
				}
			}
			setErrFlg(msgL);
			
			return msgL;
		}
		
		/**
		 * 支払予定がチェックエラーになった場合、支払照合ヘッダもエラーに設定する。
		 */
		protected void setPayChkErrFlg() {
			
			for (PaySchd_HdrR chkR : up0()) {
				
				MCList<PaySchd_DtlApdR> apDL = getUpApDL(chkR);
				MCList<PaySchd_DtlSchdR> paySchdL = getUpPaySchdL(chkR);
				
				if (hasErrFlgOn(paySchdL) || hasErrFlgOn(apDL)) {
					chkR.err_flg(true);
				}
			}
		}
		
		/**
		 * 小数部有効桁数チェックを行う。
		 * @param chkL 支払照合ヘッダリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkAmtDecPlace(MCList<PaySchd_HdrR> chkL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (PaySchd_HdrR chkR : chkL) {
				
				MAM_CUR_R curR = getCur(chkR.trd_cur_cd());
				
				MCList<PaySchd_DtlApdR> apDL = getUpApDL(chkR).subList(r->isCrt(r) || isUpd(r));
				MCList<PaySchd_DtlSchdR> paySchdL = getUpPaySchdL(chkR).subList(r->isCrt(r) || isUpd(r));
				
				for (PaySchd_DtlApdR apDR : apDL) {
					
					msgL.addAll(checkDecPlace(apDR, curR.amt_dec_place().intValue(), PaySchd_DtlApdR.$pay_amt));
					msgL.addAll(checkDecPlace(apDR, curR.amt_dec_place().intValue(), PaySchd_DtlApdR.$pay_tax_amt));
					msgL.addAll(checkDecPlace(apDR, curR.amt_dec_place().intValue(), PaySchd_DtlApdR.$pay_wtax_amt));
				}
				
				for (PaySchd_DtlSchdR paySchdR : paySchdL) {
					
					msgL.addAll(checkDecPlace(paySchdR, curR.amt_dec_place().intValue(), PaySchd_DtlSchdR.$trd_cur_amt));
					msgL.addAll(checkDecPlace(paySchdR, curR.amt_dec_place().intValue(), PaySchd_DtlSchdR.$trd_cur_com_paid_tax_amt));
					msgL.addAll(checkDecPlace(paySchdR, curR.amt_dec_place().intValue(), PaySchd_DtlSchdR.$trd_cur_exc_com_paid));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 日付チェックを行う。
		 * @param chkL 支払照合ヘッダリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkDt(MCList<PaySchd_HdrR> chkL) {
			
			MCMessageList msgL = new MCMessageList();

			for (PaySchd_HdrR chkR : chkL) {

				MCList<PaySchd_DtlSchdR> paySchdL = getUpPaySchdL(chkR).subList(r->isCrt(r) || isUpd(r));
				
				for (PaySchd_DtlSchdR paySchdR : paySchdL) {
					if (isApSetOffActFlg(paySchdR)) {
						if (isCrt(paySchdR) || isUpd(paySchdR)) {
							if (getToday().ltDate(paySchdR.pay_schd_dt())) {
								msgL.add(new MCMessage(paySchdR, PaySchd_DtlSchdR.$pay_schd_dt, MSBHL0007,
									toYMDString(paySchdR.pay_schd_dt()), toDispGUIIndex(paySchdR)));
							}
						}
						if (isUpd(paySchdR) || isDel(paySchdR)) {
							msgL.addAll(check(paySchdR, PaySchd_DtlSchdR.$can_ac_dt, new FXUCL_BeforeTodayValidater()));
						}
						// 未設定の場合、支払実績の計上日を補完するので必須チェックはしない
						//if (isUpd(paySchdR) || isDel(paySchdR)) {
						//	if (existsSchdActFlg(getCachePayActDL(paySchdR.pay_schd_no()))) {
						//		msgL.addAll(check(paySchdR, PaySchd_DtlSchdR.$can_ac_dt, new FXUCL_BeforeTodayValidater()));
						//	}
						//}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 仕入仮単価締チェックを行う。
		 * @param chkL 支払照合ヘッダリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkInterimFlg(MCList<PaySchd_HdrR> chkL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (PaySchd_HdrR chkR : chkL) {
				
				if (!chkR.purc_interim_cl_flg()) {
					
					for (PaySchd_DtlApdR apDR : getUpApDL(chkR).subList(r-> (isCrt(r) || isUpd(r)) && r.ap_d().interim_flg())) {
						msgL.add(new MCMessage(chkR, null, MSBHL0004,
							apDR.ap_d().purc_act_d_no(), apDR.ap_d_no(), toDispGUIIndex(chkR)));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 買掛明細の源泉税と支払予定の源泉税が一致するかチェックする。
		 * @param chkL 支払照合ヘッダリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkPayWtaxAmt(MCList<PaySchd_HdrR> chkL) {
			
			MCMessageList msgL = new MCMessageList();

			for (PaySchd_HdrR chkR : chkL) {
				
				MCList<PaySchd_DtlApdR> apDL = getUpApDL(chkR).subList(r->isCrt(r) || isUpd(r));
				MCList<PaySchd_DtlSchdR> paySchdL = getUpPaySchdL(chkR).subList(
						r->(isCrt(r) || isUpd(r)) && MAC_AP_STTL_TYP.isWTAX(r.ap_sttl_typ()));
				
				MCNumber apDSum = nvl(apDL.sum(PaySchd_DtlApdR.$pay_wtax_amt), MCNumber.ZERO);
				MCNumber paySchdSum = nvl(paySchdL.sum(PaySchd_DtlSchdR.$trd_cur_amt), MCNumber.ZERO);
				if (!apDSum.eq(paySchdSum)) {
					
					msgL.add(new MCMessage(chkR, null, MSBHL0006, chkR.bsppl_cd(), apDSum, paySchdSum));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 消費税差額チェックを行う。
		 * @param chkL 支払照合ヘッダリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkTaxDiffPayCl(MCList<PaySchd_HdrR> chkL) {
			
			MCMessageList msgL = new MCMessageList();
			
			MSBHL_PaySchdRegService.PaySchd_Srch05 ope = crtPaySchdSrch05();
			PaySchd_Srch05_CndR cndR = null;
			
			MCList<PaySchd_DtlApdR> taxDiffL = MCList.create(PaySchd_DtlApdR.class);
			
			// 符号を戻す（この時点では反転済みであるが、Srch05には上り電文の状態で設定する必要がある）
			InverNum<PaySchd_DtlApdR> invertNum = new InverNum<>();
			invertNum.invert(up1(), PaySchd_DtlApdR.$pay_amt, PaySchd_DtlApdR.$pay_tax_amt);
			
			for (PaySchd_HdrR chkR : chkL) {
				
				MCList<PaySchd_DtlApdR> apDL = getUpApDL(chkR)
					.subList(r->!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
				MCList<PaySchd_DtlActR> actL = getUpPayActL(chkR);
				MCList<PaySchd_AdvPayActR> advPayActL = getUpAdvPayActL(chkR);
				
				MCDate xrateBaseDt = nvl(chkR.bsppl_cl_dt(), chkR.reg_dt());
				for (PaySchd_DtlApdR apDR : apDL) {
					if (isNull(apDR.ap_d_no())) {
						// 未登録は対象外
						taxDiffL.add(apDR);
						continue;
					}
					else if (MAC_TRD_PTN_TYP.isTAX_DIFF_PAY_SCHD_CL(apDR.trd_ptn_typ())
								&& MAC_SLIP_STS_TYP.isDIS(apDR.slip_sts_typ())) {
						// 無効（元は新規）は対象。ただし差額がある場合は無効で下ってくるのでチェック対象とする
						taxDiffL.add(apDR);
					}
					cndR = PaySchd_Srch05_CndR.create();
					cndR.hdr_peg_no(apDR.hdr_peg_no());
					cndR.ap_d_no(apDR.ap_d_no());
					cndR.ref_ap_d_no(apDR.ref_ap_d_no());
					if (apDR.repurc_obli_flg()) {
						cndR.trd_cur_amt(apDR.pay_proc_amt());
					}
					else {
						cndR.trd_cur_amt(apDR.pay_amt());
					}
					cndR.trd_cur_tax_amt(apDR.pay_tax_amt());
					cndR.pay_xrate(chkR.pay_xrate());
					cndR.xrate_base_dt(xrateBaseDt);
					
					ope.up0().add(cndR);
				}
				actL.forEach(r -> {
					PaySchd_Srch03_CndPayActR cndActR = ope.up1().add();
					cndActR.hdr_peg_no(r.hdr_peg_no());
					cndActR.pay_act_d_no(r.pay_act_d_no());
					cndActR.pay_act_d_seq(r.pay_act_d_seq());
					cndActR.pay_xrate(chkR.pay_xrate());
					cndActR.xrate_base_dt(xrateBaseDt);
				});
				advPayActL.forEach(r -> {
					PaySchd_Srch03_CndAdvPayActR cndActR = ope.up2().add();
					cndActR.hdr_peg_no(r.hdr_peg_no());
					cndActR.adv_pay_act_no(r.adv_pay_act_no());
					cndActR.adv_pay_act_seq(r.adv_pay_act_seq());
					cndActR.pay_xrate(chkR.pay_xrate());
					cndActR.xrate_base_dt(xrateBaseDt);
				});
			}
			
			// 符号を戻す
			invertNum.invert();
			
			if (!ope.up0().isEmpty() || !ope.up1().isEmpty()) {
				ope.exec();
			}

			MCIndexKey idxkey1 = ope.down0().createIndex(PaySchd_Srch05_RsltR.$hdr_peg_no);
			MCIndexKey idxkey2 = ope.down0().createIndex(
				PaySchd_Srch05_RsltR.$hdr_peg_no, PaySchd_Srch05_RsltR.$asppl_cd,
				PaySchd_Srch05_RsltR.$ap_dpt_cd, PaySchd_Srch05_RsltR.$ap_typ
			);
			MCIndexKey indexkey3 = taxDiffL.createIndex(PaySchd_DtlApdR.$hdr_peg_no);
			
			for (PaySchd_HdrR chkR : chkL) {
			
				MCList<PaySchd_DtlApdR> apDL = taxDiffL.subList(indexkey3, chkR.hdr_peg_no());
				MCList<PaySchd_Srch05_RsltR> downL = ope.down0().subList(idxkey1, chkR.hdr_peg_no());
				
				if (apDL.size() != downL.size()) {
					msgL.add(new MCMessage(chkR, null, MSBHL0008, chkR.bsppl_cd()));
					continue;
				}
				
				for (MCList<PaySchd_DtlApdR> subApDL : apDL.groupList(
						PaySchd_DtlApdR.$asppl_cd, PaySchd_DtlApdR.$ap_dpt_cd, PaySchd_DtlApdR.$ap_typ)) {
					PaySchd_DtlApdR apDR = subApDL.get(0);
					
					MCList<PaySchd_Srch05_RsltR> subDownL =
						ope.down0().subList(idxkey2, apDR.hdr_peg_no(), apDR.asppl_cd(), apDR.ap_dpt_cd(), apDR.ap_typ());
					
					if (subApDL.size() != subDownL.size()) {
						msgL.add(new MCMessage(chkR, null, MSBHL0008, chkR.bsppl_cd()));
						break;
					}

					subApDL.sort(
						PaySchd_DtlApdR.$ap_d_no, PaySchd_DtlApdR.$slip_sts_typ, PaySchd_DtlApdR.$pay_tax_amt);
					subDownL.sort(
						PaySchd_Srch05_RsltR.$ap_d_no, PaySchd_Srch05_RsltR.$slip_sts_typ, PaySchd_Srch05_RsltR.$trd_cur_tax_amt);
				
					for (int i=0; i<subApDL.size(); i++) {
						PaySchd_DtlApdR subApDR = subApDL.get(i);
						PaySchd_Srch05_RsltR subDownR = subDownL.get(i);
						
						// 税額を比較
						if (!isSame(subApDR.pay_tax_amt(), subDownR.trd_cur_tax_amt())) {
							msgL.add(new MCMessage(chkR, null, MSBHL0008, chkR.bsppl_cd()));
							break;
						}
						
						// 計上日が締まってないか
						if (MAC_SLIP_STS_TYP.isCRT(subDownR.slip_sts_typ()) || MAC_SLIP_STS_TYP.isCAN(subDownR.slip_sts_typ())) {
							MCDate acDt = getAcDt(
								MAC_SLIP_STS_TYP.isCRT(subDownR.slip_sts_typ()) ? chkR.bsppl_cl_dt() : subDownR.ac_dt(), true);
							if (isNull(getAcDt(acDt, false))) {
								msgL.add(new MCMessage(subApDR, null, MSBHL0050, toYMDString(acDt), toDispGUIIndex(subApDR)));
								chkR.err_flg(true);
								break;
							}
						}
						// 上り電文とSrch05の結果を紐付ける（買掛明細を登録する際に使用する）
						subDownR.peg_no(subApDR.peg_no());
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 支払予定管理先締年月日以降で締済の支払照合ヘッダが存在するかチェックする。
		 * @param chkL 支払照合ヘッダリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkCl(MCList<PaySchd_HdrR> chkL) {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<PaySchd_HdrR> insUpdChkL = chkL.subList(r->isCrt(r) || isUpd(r));
			
			if (!insUpdChkL.isEmpty()) {
				
				MCList<MST_PAY_CHK_R> sameClPayChkL = getSameClPayChkL(insUpdChkL);
				
				MCIndexKey idxkey = 
					sameClPayChkL.createIndex(
						MST_PAY_CHK_R.$bsppl_cd, MST_PAY_CHK_R.$bsppl_dpt_cd,
						MST_PAY_CHK_R.$purc_act_no, MST_PAY_CHK_R.$rcpt_iv_mng_no, MST_PAY_CHK_R.$trd_cur_cd,
						MST_PAY_CHK_R.$wrk_no);
				
				BiFunction<MST_PAY_CHK_R, PaySchd_HdrR, Boolean> chkFunc = (r, chkR) -> {
					if (r.bsppl_cl_dt().gt(chkR.bsppl_cl_dt())) {
						return true;
					}
					else if (isUpd(chkR)
						&& isSame(r.bsppl_cl_dt(), chkR.bsppl_cl_dt())
						&& r.pay_chk_mng_no().compareTo(chkR.pay_chk_mng_no()) > 0) {
						return true;
					}
					return false;
				};
				Function<PaySchd_HdrR, Boolean> clPayChk = (chkR) -> {
					return 
						!sameClPayChkL
						 .subList(idxkey, chkR.toArray(idxkey.getKeys()))
						 .subList(r-> !isSame(r.pay_chk_mng_no(), chkR.pay_chk_mng_no()))
						 .subList(r -> chkFunc.apply(r, chkR)).isEmpty();
				};
				
				for (PaySchd_HdrR insUpdChkR : insUpdChkL) {
					
					if (isUpd(insUpdChkR)) {
						
						MCList<PaySchd_DtlApdR> upApDL = getUpApDL(insUpdChkR);
						MCList<PaySchd_DtlSchdR> upPaySchdL = getUpPaySchdL(insUpdChkR);
						
						if (justUpdRmrks(insUpdChkR, upApDL, upPaySchdL)) {
							putJustUpdRmrksCache(insUpdChkR.pay_chk_mng_no(), true);
						}
					}
					
					if (insUpdChkR.pay_spot_flg()) {
						continue;
					}
					if (clPayChk.apply(insUpdChkR)) {
						msgL.add(new MCMessage(insUpdChkR, null, MSBHL0003,
								insUpdChkR.bsppl_cd(), insUpdChkR.bsppl_dpt_cd(), insUpdChkR.trd_cur_cd(),
								insUpdChkR.wrk_no(), toYMDString(insUpdChkR.bsppl_cl_dt()), insUpdChkR.pay_chk_no()));
					}
					if (isUpd(insUpdChkR)) {
						MST_PAY_CHK_R payChkR = getCachePayChkR(insUpdChkR.pay_chk_mng_no());
						if (!isSame(insUpdChkR.bsppl_dpt_cd(), payChkR.bsppl_dpt_cd())
						 || !isSame(insUpdChkR.bsppl_cl_dt(), payChkR.bsppl_cl_dt())) {
						
							// 変更前の支払予定管理先部門、締日に対してチェック
							PaySchd_HdrR chkR = insUpdChkR.clone();
							chkR.bsppl_dpt_cd(payChkR.bsppl_dpt_cd());
							chkR.bsppl_cl_dt(payChkR.bsppl_cl_dt());
							
							if (clPayChk.apply(chkR)) {
								msgL.add(new MCMessage(chkR, null, MSBHL0005,
										chkR.bsppl_cd(), chkR.bsppl_dpt_cd(), chkR.trd_cur_cd(),
										chkR.wrk_no(), toYMDString(chkR.bsppl_cl_dt()), chkR.pay_chk_no()));
							}
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 同一まとめ単位の支払照合ヘッダの締情報を取得する。
		 * @param chkL チェック対象の支払照合ヘッダリスト
		 * @return 同一まとめ単位の支払照合ヘッダの締情報
		 */
		protected MCList<MST_PAY_CHK_R> getSameClPayChkL(MCList<PaySchd_HdrR> chkL) {

			MCList<MST_PAY_CHK_R> payChkL = MCList.create(MST_PAY_CHK_R.class);
			MST_PAY_CHK_R t = MST_PAY_CHK_R.create("T");
			MCQueryApiBuilder payChkL_bldr = MCQueryApiBuilder.create(t);
			
			payChkL_bldr.setSelect(t.pay_chk_mng_no, t.bsppl_cd, t.bsppl_dpt_cd,
					t.purc_act_no, t.rcpt_iv_mng_no, t.trd_cur_cd, t.wrk_no,
					t.bsppl_cl_dt);
			
			payChkL_bldr.setWhere(
					createWhere(t, MST_PAY_CHK_R.$bsppl_cd, MST_PAY_CHK_R.$bsppl_dpt_cd,
							MST_PAY_CHK_R.$purc_act_no, MST_PAY_CHK_R.$rcpt_iv_mng_no,
							MST_PAY_CHK_R.$trd_cur_cd, MST_PAY_CHK_R.$wrk_no));
			
			MCList<MST_PAY_CHK_R> l = chkL.innerRowList("pay_chk", MST_PAY_CHK_R.class);
			if (!isCrt(chkL.get(0))) {
				// 変更前の状態を含める
				chkL.forEach(r -> l.add(getCachePayChkR(r.pay_chk_mng_no())));
			}
			MST_PAY_CHK_R cndR = MST_PAY_CHK_R.create();
			cndR.bsppl_cl_dt((MCDate)chkL.min(MST_PAY_CHK_R.$bsppl_cl_dt));
			payChkL_bldr.addConstWhereWithCutOffAnd(
					bracket(t.bsppl_cl_dt.gte(bind("bsppl_cl_dt"))
							.or(t.bsppl_cl_dt.isNull())));
			dbSelect("MSBHL5030_MST_PAY_CHK_S03", payChkL, payChkL_bldr, chkL, cndR);
			
			return payChkL;
		}
		
		/**
		 * 繰越後の締年月日に対応する支払予定管理先部門が存在するかチェックを行う
		 * @param chkL
		 * @return
		 */
		protected MCMessageList chkCoPayDptChk(MCList<PaySchd_HdrR> chkL) {
			MCMessageList msgL = new MCMessageList();
			
			for (PaySchd_HdrR chkR : chkL) {
				
				MCList<PaySchd_DtlApdR> apDL =
					getUpApDL(chkR).subList(r->!isNull(r.pay_crryovr_times()) && r.pay_crryovr_times().isPositive());
				
				for (PaySchd_DtlApdR apDR : apDL) {
					if (!chkR.pay_spot_flg()) {
						String payDptCd = getBspplDptCd(chkR.bsppl_cd(), apDR.co_psppl_cl_dt());
						if (isNull(payDptCd)) {
							msgL.add(new MCMessage(
								apDR, null, MSBHL0001,
								chkR.bsppl_cd(), toYMDString(apDR.co_psppl_cl_dt()), toDispGUIIndex(apDR)));
						}
					}
				}
			}
			
			return msgL;
			
		}
		
		/**
		 * 新規かつ照合済の買掛明細が存在するチェックを行う。
		 * @param chkL 支払照合ヘッダリスト
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkPayChk(MCList<PaySchd_HdrR> chkL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (PaySchd_HdrR chkR : chkL) {
				
				MCList<PaySchd_DtlApdR> apDL = getUpApDL(chkR).subList(r->isCrt(r) && !isNull(r.ap_d_no()) && r.ap_d().chk_flg());
				
				for (PaySchd_DtlApdR apDR : apDL) {
					
					msgL.add(new MCMessage(apDR, null, MSBHL0010, chkR.bsppl_cd(), apDR.ap_d_no(), toDispGUIIndex(apDR)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 買掛明細の今回支払金額と今回支払税額の合計が0であるかチェックする。
		 * @param chkL 支払照合ヘッダリスト
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkPayAmtSum(MCList<PaySchd_HdrR> chkL) {
			
			MCMessageList msgL = new MCMessageList();

			for (PaySchd_HdrR chkR : chkL) {
				
				MCList<PaySchd_DtlApdR> apDL = getUpApDL(chkR).subList(r-> isCrt(r) || isUpd(r));
				
				for (PaySchd_DtlApdR apDR : apDL) {
					
					if (MSC_PAY_MTD_TYP.isPART_PAY(apDR.pay_mtd_typ()) && sum(apDR.pay_amt(), apDR.pay_tax_amt()).eq(0)) {
						msgL.add(new MCMessage(apDR, null, MSBHL0015, apDR.ap_d_no(), apDR.pay_mtd_typ()));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 支払予定の金額と買掛明細の金額が一致するかチェックする。
		 * @param chkL 支払照合ヘッダリスト
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkPaySchdAmt(MCList<PaySchd_HdrR> chkL) {
			
			MCMessageList msgL = new MCMessageList();
			String[] apdKey = {
					PaySchd_DtlApdR.$asppl_cd,
					PaySchd_DtlApdR.$ap_dpt_cd,
					PaySchd_DtlApdR.$ap_typ
			};
			String[] paySchdKey = {
					PaySchd_DtlSchdR.$asppl_cd,
					PaySchd_DtlSchdR.$ap_dpt_cd,
					PaySchd_DtlSchdR.$ap_typ
			};

			for (PaySchd_HdrR chkR : chkL) {
				
				MCList<PaySchd_DtlSchdR> paySchdL =
					getUpPaySchdL(chkR)
						.subList(r ->isCrt(r) || isUpd(r))
						.subList(r -> !MAC_AP_STTL_TYP.is_com_paid(r.ap_sttl_typ()));
				MCGroupByPolicy paySchdPolicy = new MCGroupByPolicy(paySchdKey);
				paySchdPolicy.sum(PaySchd_DtlSchdR.$trd_cur_amt);
				MCList<PaySchd_DtlSchdR> paySchdGrpL = paySchdL.groupBy(paySchdPolicy);
				
				MCList<PaySchd_DtlApdR> apDL =
					getUpApDL(chkR)
						.subList(r->isCrt(r) || isUpd(r))
						.subList(r->!(isAdjustApd(r.ap_d())
							&& (MAC_SLIP_STS_TYP.isDIS(r.slip_sts_typ()) || MAC_SLIP_STS_TYP.isCAN(r.slip_sts_typ()))));
				MCGroupByPolicy apDPolicy = new MCGroupByPolicy(apdKey);
				apDPolicy.sum(PaySchd_DtlApdR.$pay_amt, PaySchd_DtlApdR.$pay_tax_amt);
				MCList<PaySchd_DtlApdR> apDGrpL = apDL.groupBy(apDPolicy);
				
				MCIndexKey
					idxkey = apDL.createIndex(apdKey),
					apdIdxKey = apDGrpL.createIndex(apdKey),
					paySchdIdxKey = paySchdGrpL.createIndex(paySchdKey);
				
				// 買掛明細に対応する支払予定が設定されているかチェック
				for (PaySchd_DtlApdR apDR : apDGrpL) {
					MCNumber payAmt = sum(apDR.pay_amt(), apDR.pay_tax_amt());
					PaySchd_DtlSchdR paySchdR = paySchdGrpL.getFirst(paySchdIdxKey, apDR.toArray(apdKey));
					
					if (isNull(paySchdR)) {
						MCList<PaySchd_DtlApdR> l = apDL
							.subList(idxkey, apDR.toArray(apdKey))
							.subList(r -> !MAC_TRD_PTN_TYP.isTAX_DIFF_PAY_SCHD_CL(r.trd_ptn_typ()))
							.groupBy(PaySchd_DtlApdR.$pay_mtd_typ);
						if ((l.size() == 1 && MSC_PAY_MTD_TYP.isALL_CO(l.get(0).pay_mtd_typ())) ||
							(isNull(l) && l.isEmpty())) {
							// 次のいずれかに該当する場合は支払予定がなくても登録可
							// 買掛明細すべて全額繰越
							// 買掛明細すべて税差額
						}
						else {
							msgL.add(new MCMessage(chkR, null, MSBHL0110, apDR.asppl_cd(), apDR.ap_dpt_cd(), apDR.ap_typ(), payAmt));
						}
					}
					else if (!isSame(payAmt, paySchdR.trd_cur_amt())) {
						msgL.add(new MCMessage(chkR, null, MSBHL0016,
							apDR.asppl_cd(), apDR.ap_dpt_cd(), apDR.ap_typ(), payAmt, isNull(paySchdR) ? 0 : paySchdR.trd_cur_amt()));
					}
				}
				
				// 買掛明細にない不要な支払予定が設定されていないかチェック
				for (PaySchd_DtlSchdR paySchdR : paySchdGrpL) {
					PaySchd_DtlApdR apDR = apDGrpL.getFirst(apdIdxKey, paySchdR.toArray(paySchdKey));

					if (isNull(apDR)) {
						msgL.add(new MCMessage(chkR, null, MSBHL0054,
							paySchdR.asppl_cd(), paySchdR.ap_dpt_cd(), paySchdR.ap_typ(), paySchdR.trd_cur_amt()));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 前渡金支払実績ＮＯが指定されている場合、、取引通貨金額に対してチェックする。
		 * @param chkL 支払照合ヘッダリスト
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkPaySchdAdvPayAmt(MCList<PaySchd_HdrR> chkL) {
			
			MCMessageList msgL = new MCMessageList();

			for (PaySchd_HdrR chkR : chkL) {
				
				MCList<PaySchd_DtlSchdR> paySchdL = getUpPaySchdL(chkR).subList(r->(isCrt(r) || isUpd(r)));
				MCList<MST_PAY_SCHD_R> orgPaySchdL = getCachePaySchdL(chkR.pay_chk_mng_no());
				
				for (MCList<PaySchd_DtlSchdR> subPaySchdL :
						paySchdL.subList(r -> !isNull(r.adv_pay_act_no())).groupList(PaySchd_DtlSchdR.$adv_pay_act_no)) {
					
					int msgCnt = msgL.size();
					for (PaySchd_DtlSchdR paySchdR : subPaySchdL) {
						msgL.addAll(chkAdvPayDpt(chkR, paySchdR)); 
						if (isNull(paySchdR.trd_cur_amt())) {
							continue;
						}
						if (!paySchdR.trd_cur_amt().isPositive()) {
							msgL.add(new MCMessage(paySchdR, null, MSBHL0017, paySchdR.adv_pay_act_no(), paySchdR.trd_cur_amt(), toDispGUIIndex(paySchdR)));
						}
					}
					// （相殺予定額＋支払予定額＋相殺実績額）＞相殺対象額となっているかチェックする
					PaySchd_DtlSchdR paySchdR = subPaySchdL.get(0);
					MCList<MST_ADV_PAY_ACT_R> advActL = getCacheAdvPayActL(paySchdR.adv_pay_act_no()).subList(r -> MAC_SLIP_STS_TYP.isCRT(r.slip_sts_typ()));
					MST_ADV_PAY_ACT_R advActR = null;
					boolean isExists = !isNull(advActL) && !advActL.isEmpty();
					if (!isExists) {
						msgL.add(new MCMessage(paySchdR, null, MSBHL0043, paySchdR.adv_pay_act_no(), toDispGUIIndex(paySchdR)));
						continue;
					}
					else {
						advActR = advActL.get(0);
					}

					if (msgL.size() == msgCnt) {
						advActR = advActR.clone();
						
						if (!isNull(orgPaySchdL)) {
							// 訂正前の支払予定に前渡金実績が存在する場合は、減算してから今回の支払予定額を加算する
							for (MST_PAY_SCHD_R orgPaySchdR : orgPaySchdL.subList(MST_PAY_SCHD_R.$adv_pay_act_no, paySchdR.adv_pay_act_no())) {
								// 前渡金相殺は常に予定時に実績を作成するので、予定額だけでなく実績額からも減算する
								advActR.trd_cur_setoff_schd_amt(advActR.trd_cur_setoff_schd_amt().subtract(orgPaySchdR.trd_cur_amt()));
								advActR.trd_cur_setoff_act_amt(advActR.trd_cur_setoff_act_amt().subtract(orgPaySchdR.trd_cur_amt()));
							}
						}
						advActR.trd_cur_setoff_schd_amt(
							advActR.trd_cur_setoff_schd_amt().add(subPaySchdL.sum(PaySchd_DtlSchdR.$trd_cur_amt))
						);

						if (advActR.trd_cur_setoff_schd_amt().gt(advActR.trd_cur_setoff_tgt_amt())) {
							msgL.add(new MCMessage(paySchdR, null, MSBHL0045,
								advActR.trd_cur_setoff_schd_amt(),
								advActR.trd_cur_setoff_tgt_amt(), advActR.adv_pay_act_no(), toDispGUIIndex(paySchdR)));
						}
					}
					
				}
			}
			
			return msgL;
		}
		/**
		 * 前渡金実績が、他の支払照合ヘッダに紐づかないか確認する
		 * @param chkL 支払照合ヘッダリスト
		 * @param advPayActL 前渡金実績リスト
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkAdvPayAct(MCList<PaySchd_HdrR> chkL) {
			MCMessageList msgL = new MCMessageList();
			for (PaySchd_HdrR chkR : chkL) {
				MCList<PaySchd_AdvPayActR> tgtAdvPayActL = getUpAdvPayActL(chkR);
				for (PaySchd_AdvPayActR r : tgtAdvPayActL) {
					MST_ADV_PAY_ACT_R advActR =  getCacheAdvPayActR(r.adv_pay_act_no(), r.adv_pay_act_seq());
					if (!isNull(advActR.pay_chk_mng_no()) && !isSame(advActR.pay_chk_mng_no(), chkR.pay_chk_mng_no())) {
						msgL.add(new MCMessage(r, null, MSBHL0251, r.adv_pay_act_no(), toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}
		/**
		 * ヘッダに紐づく上り電文が前渡金実績のみか
		 * @param chkL 支払照合ヘッダリスト
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkOnlyAdvPayAct(MCList<PaySchd_HdrR> chkL) {
			MCMessageList msgL = new MCMessageList();
			for (PaySchd_HdrR chkR : chkL) {
				MCList<PaySchd_DtlApdR> apdL = getUpApDL(chkR).subList(r -> !isInvalidApd(r));
				MCList<PaySchd_DtlSchdR> schdL = getUpPaySchdL(chkR).subList(r -> !isDel(r));
				MCList<PaySchd_AdvPayActR> advPayActL = getUpAdvPayActL(chkR);
				MCList<PaySchd_DtlActR> actL = getUpPayActL(chkR);
				if ((isNull(apdL) || apdL.isEmpty()) &&
						(isNull(schdL) || schdL.isEmpty()) &&
						(isNull(actL) || actL.isEmpty()) &&
						(!isNull(advPayActL) && !advPayActL.isEmpty())) {
					msgL.add(new MCMessage(chkR, null, MSBHL0252, chkR.bsppl_cd(), chkR.bsppl_dpt_cd(), chkR.trd_cur_cd(), chkR.rcpt_iv_no(), chkR.purc_act_no(), chkR.wrk_no(), toYMString(chkR.bsppl_cl_dt())));
				}
			}
			return msgL;
		}
		
		protected MCMessageList chkAdvPayDpt(PaySchd_HdrR chkR, PaySchd_DtlSchdR paySchdR) {
			MCMessageList msgL = new MCMessageList();
			MCList<MST_ADV_PAY_ACT_R> advActL = getCacheAdvPayActL(paySchdR.adv_pay_act_no());
			MST_ADV_PAY_ACT_R advActR = null;
			boolean isExists = !isNull(advActL) && !advActL.isEmpty();
			if (!isExists) {
				return msgL;
			}
			else {
				advActR = advActL.get(0);
			}
			if (!isSame(paySchdR.so_dpt_cd(), paySchdR.ap_dpt_cd()) || 
					!isSame(paySchdR.so_dpt_cd(), advActR.bd_dpt_cd())) {
				msgL.add(new MCMessage(paySchdR, null, MSBHL0042, paySchdR.so_dpt_cd(), paySchdR.ap_dpt_cd(),
						advActR.bd_dpt_cd(), toDispGUIIndex(paySchdR)));
			}
			return msgL;
		}
		
		/**
		 * 手数料関連のチェックをする。
		 * @param chkL 支払照合ヘッダリスト
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkComPaid(MCList<PaySchd_HdrR> chkL) {
			
			MCMessageList msgL = new MCMessageList();

			String[] apDKey = {PaySchd_DtlApdR.$asppl_cd, PaySchd_DtlApdR.$ap_dpt_cd, PaySchd_DtlApdR.$ap_typ};

			for (PaySchd_HdrR chkR : chkL) {
				
				MCList<PaySchd_DtlApdR> apDL = getUpApDL(chkR).subList(r->(isCrt(r) || isUpd(r)));
				MCList<PaySchd_DtlSchdR> paySchdL = getUpPaySchdL(chkR).subList(r->(isCrt(r) || isUpd(r)));
				
				MCList<PaySchd_DtlSchdR> comPaidPaySchdL = paySchdL.subList(r->MAC_AP_STTL_TYP.is_com_paid(r.ap_sttl_typ()));
				MCList<PaySchd_DtlSchdR> exceptComPaidPaySchdL = paySchdL.subList(r->!MAC_AP_STTL_TYP.is_com_paid(r.ap_sttl_typ()));
				
				if (!comPaidPaySchdL.isEmpty() && exceptComPaidPaySchdL.isEmpty()) {
					msgL.add(new MCMessage(chkR, null, MSBHL0018, chkR.bsppl_cd()));
				}
				
				for (PaySchd_DtlSchdR paySchdR : comPaidPaySchdL) {
					String[] vals = {paySchdR.asppl_cd(), paySchdR.ap_dpt_cd(), paySchdR.ap_typ()};
					if (isNull(apDL.getFirst(apDKey, vals))) {
						msgL.add(new MCMessage(paySchdR, null, MSBHL0049,
							paySchdR.asppl_cd(), paySchdR.ap_dpt_cd(), paySchdR.ap_typ(), toDispGUIIndex(paySchdR)));
						chkR.err_flg(true);
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 繰越分が振替済みかチェックを行う。
		 * @param chkL チェック対象リスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkCoApDSw(MCList<PaySchd_HdrR> chkL) {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<MST_AP_D_R> apDL = getApDL4Upd(chkL, up1());
			
			MCIndexKey apDIdx = apDL.createIndex(MST_AP_D_R.$ap_d_no);
			MCIndexKey coSrcApDIdx = apDL.createIndex(MST_AP_D_R.$crryovr_src_ap_d_no);
			
			for (PaySchd_HdrR chkR : chkL) {
				MCList<PaySchd_DtlApdR> up1L = getUpApDL(chkR).subList(r-> isUpd(r) || isDel(r));
				
				for (PaySchd_DtlApdR upApDR : up1L) {
					
					MST_AP_D_R srcApDR = isNull(upApDR.co_src_ap_d_no()) ? null : getScrApDR(apDL, apDIdx, upApDR);
					MST_AP_D_R coApDR = isNull(upApDR.co_src_ap_d_no()) ? null : getCoApDR(apDL, coSrcApDIdx, upApDR);
					MST_AP_D_R payApdR = apDL.getFirst(apDIdx, upApDR.ap_d_no());
					
					if (isNull(coApDR) || !coApDR.sw_flg()) {
						continue;
					}
					
					if (isCrryovrTgt(upApDR, srcApDR, coApDR, payApdR)
						|| isCrryovrDelTgt(upApDR, srcApDR, coApDR, payApdR)) {
						
						msgL.add(new MCMessage(upApDR, null, MSBHL0111, chkR.pay_chk_no(), upApDR.ap_d_no()));
						chkR.err_flg(true);
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			down0().setAll(up0());
		}
		
		/**
		 * 備考のみの更新かどうか。
		 * @param upPayChkR 上り電文の支払照合ヘッダ
		 * @param upApDL 上り電文の買掛明細リスト
		 * @param upPaySchdL 上り電文の支払予定リスト
		 * @return 備考のみ更新の場合はtrue
		 */
		protected boolean justUpdRmrks(PaySchd_HdrR upPayChkR, MCList<PaySchd_DtlApdR> upApDL, MCList<PaySchd_DtlSchdR> upPaySchdL) {
			
			// 行スステータスが更新以外の場合は、備考のみ更新ではないとする（支払照合ヘッダ）
			if (!isUpd(upPayChkR)) {
				return false;
			}
			
			MST_PAY_CHK_R payChkR = getCachePayChkR(upPayChkR.pay_chk_mng_no());
			boolean isChanged = !isColSame(upPayChkR, payChkR, getPayChkCompareCols());
			if (isChanged) {
				return false;
			}
			
			MCList<MST_AP_D_R> apDL = getCacheApDL(upPayChkR.pay_chk_mng_no());
			for (PaySchd_DtlApdR upApDR : upApDL) {
				
				// 行スステータスが更新以外の場合は、備考のみ更新ではないとする（買掛明細）
				if (!isUpd(upApDR)) {
					return false;
				}
				
				MST_AP_D_R apDR = apDL.getFirst(MST_AP_D_R.$ap_d_no, upApDR.ap_d_no());
				isChanged =  !isColSame(upApDR, apDR, getApDCompareCols());
				
				if (isChanged) {
					return false;
				}
			}
			
			MCList<MST_PAY_SCHD_R> paySchdL = getCachePaySchdL(upPayChkR.pay_chk_mng_no());
			for (PaySchd_DtlSchdR upPaySchdR : upPaySchdL) {
				
				// 行スステータスが更新以外の場合は、備考のみ更新ではないとする（支払予定）
				if (!isUpd(upPaySchdR)) {
					return false;
				}
				
				MST_PAY_SCHD_R paySchdR = paySchdL.getFirst(MST_PAY_SCHD_R.$pay_schd_no, upPaySchdR.pay_schd_no());
				isChanged =  !isColSame(upPaySchdR, paySchdR, getPaySchdCompareCols());
				
				if (isChanged) {
					return false;
				}
				
				MCList<MST_PAY_ACT_D_R> payActDL = getCachePayActDL(upPaySchdR.pay_schd_no());
				if (!isNull(payActDL)) {
					MST_PAY_ACT_D_R actDR = payActDL.getFirst(MST_PAY_ACT_R.$schd_act_flg, true);	// 予定時実績作成
					if (!isNull(actDR)
					 && !isSame(upPaySchdR.can_ac_dt(), actDR.getDateNE("ac_dt"))) {
						return false;
					}
				}
			}
			
			return true;
		}
		
		protected void setSkipPayActCache(PaySchd_HdrR hdrR) {
			
			if (!isUpd(hdrR)) {
				return;
			}
			
			MCList<PaySchd_DtlApdR> upApDL = getUpApDL(hdrR);
			MCList<PaySchd_DtlSchdR> upPaySchdL = getUpPaySchdL(hdrR);
			
			MST_PAY_CHK_R payChkR = getCachePayChkR(hdrR.pay_chk_mng_no());
			if (!isColSame(hdrR, payChkR, getPayChkCompareCols())) {
				return;
			}
			
			MCList<MST_AP_D_R> apDL = getCacheApDL(hdrR.pay_chk_mng_no());
			for (PaySchd_DtlApdR upApDR : upApDL) {
				
				if (!isUpd(upApDR)) {
					return;
				}
				
				MST_AP_D_R apDR = apDL.getFirst(MST_AP_D_R.$ap_d_no, upApDR.ap_d_no());
				if (isChanged(getApDCompareColsForSkipPayAct(upApDR, apDR))) {
					return ;
				}
			}
			
			MCList<MST_PAY_SCHD_R> paySchdL = getCachePaySchdL(hdrR.pay_chk_mng_no());
			for (PaySchd_DtlSchdR upPaySchdR : upPaySchdL) {
				
				if (!isUpd(upPaySchdR)) {
					continue;
				}
				
				MCList<MST_PAY_ACT_D_R> payActDL = getCachePayActDL(upPaySchdR.pay_schd_no());
				if (!isNull(payActDL)) {
					MST_PAY_ACT_D_R actDR = payActDL.getFirst(MST_PAY_ACT_R.$schd_act_flg, true);
					MST_PAY_SCHD_R paySchdR = paySchdL.getFirst(MST_PAY_SCHD_R.$pay_schd_no, upPaySchdR.pay_schd_no());
					if (doSkipPayAct(hdrR, actDR, paySchdR, upPaySchdR)) {
						putSkipPayActCache(upPaySchdR.pay_schd_no(), true);
					}
				}
			}
		}
		
		protected boolean doSkipPayAct(PaySchd_HdrR hdrR, MST_PAY_ACT_D_R actDR, MST_PAY_SCHD_R paySchdR, PaySchd_DtlSchdR upPaySchdR) {
			
			if (isNull(actDR) 
					|| !isColSame(upPaySchdR, paySchdR, getPaySchdCompareCols())
					|| !isSame(upPaySchdR.can_ac_dt(), actDR.getDateNE("ac_dt"))
					|| isAprvRvrs(hdrR)) {
				return false;
			}
			return true;
		}
		
		protected boolean isChanged(Comparable<?>[][] cmp) {
			
			for (Comparable<?>[] c : cmp) {
				if (!isSame(c[0], c[1])) {
					return true;
				}
			}
			return false;
		}
		
		/**
		 * 支払照合ヘッダの比較対象項目配列を返す。
		 * @return 支払照合ヘッダの比較対象項目配列
		 */
		protected String[] getPayChkCompareCols() {
			
			return new String [] {
					MST_PAY_CHK_R.$reg_dt,
					MST_PAY_CHK_R.$bsppl_cd,
					MST_PAY_CHK_R.$bsppl_usr_cd,
					MST_PAY_CHK_R.$bsppl_dpt_cd,
					MST_PAY_CHK_R.$purc_act_no,
					MST_PAY_CHK_R.$rcpt_iv_mng_no,
					MST_PAY_CHK_R.$rcpt_iv_no,
					MST_PAY_CHK_R.$wrk_no,
					MST_PAY_CHK_R.$pay_spot_flg,
					MST_PAY_CHK_R.$bsppl_cl_day,
					MST_PAY_CHK_R.$bsppl_cl_dt,
					MST_PAY_CHK_R.$trd_cur_cd,
					MST_PAY_CHK_R.$batch_pay_schd_cl_flg,
					MST_PAY_CHK_R.$man_reg_flg };
		}
		
		protected Comparable<?>[][] getApDCompareColsForSkipPayAct(PaySchd_DtlApdR upApDR, MST_AP_D_R apDR) {
			
			Comparable<?>[][] cmp = new Comparable[][] {
				
				{ upApDR.pay_mtd_typ(), apDR.pay_mtd_typ() },
				{ upApDR.pay_amt(), apDR.trd_cur_amt() },
				{ upApDR.pay_tax_amt(), apDR.trd_cur_tax_amt() },
			};
			
			return cmp;
		}
		
		/**
		 * 買掛明細の比較対象項目配列を返す。
		 * @return 買掛明細の比較対象項目配列
		 */
		protected String[] getApDCompareCols() {
			
			return new String [] {
					MST_AP_D_R.$asppl_cd,
					MST_AP_D_R.$ap_dpt_cd,
					MST_AP_D_R.$ap_typ,
					MST_AP_D_R.$interim_flg };
		}
		
		/**
		 * 支払予定の比較対象項目配列を返す。
		 * @return 支払予定の比較対象項目配列
		 */
		protected String[] getPaySchdCompareCols() {
			
			return new String [] {
					MST_PAY_SCHD_R.$asppl_cd,
					MST_PAY_SCHD_R.$ap_dpt_cd,
					MST_PAY_SCHD_R.$pay_dpt_cd,
					MST_PAY_SCHD_R.$ap_typ,
					MST_PAY_SCHD_R.$ap_sttl_cd,
					MST_PAY_SCHD_R.$ap_sttl_typ,
					MST_PAY_SCHD_R.$pay_schd_dt,
					MST_PAY_SCHD_R.$pay_bank_ac_cd,
					MST_PAY_SCHD_R.$bank_ac_cd,
					MST_PAY_SCHD_R.$ap_setoff_typ,
					MST_PAY_SCHD_R.$setoff_cd,
					MST_PAY_SCHD_R.$setoff_nm,
					MST_PAY_SCHD_R.$so_dpt_cd,
					MST_PAY_SCHD_R.$adv_pay_act_no,
					MST_PAY_SCHD_R.$trd_cur_amt,
					MST_PAY_SCHD_R.$xrate,
					MST_PAY_SCHD_R.$trd_cur_com_paid_tax_cd,
					MST_PAY_SCHD_R.$trd_cur_com_paid_tax_amt,
					MST_PAY_SCHD_R.$trd_cur_exc_com_paid,
					MST_PAY_SCHD_R.$rcv_bill_no,
					MST_PAY_SCHD_R.$note_no,
					MST_PAY_SCHD_R.$note_typ,
					MST_PAY_SCHD_R.$note_rsn_cd,
					MST_PAY_SCHD_R.$draw_dt,
					MST_PAY_SCHD_R.$due_dt,
					MST_PAY_SCHD_R.$note_days,
					MST_PAY_SCHD_R.$drawer_nm,
					MST_PAY_SCHD_R.$draw_bank_cd,
					MST_PAY_SCHD_R.$draw_branch_cd,
					MST_PAY_SCHD_R.$endrsr,
					MST_PAY_SCHD_R.$accptr,
					MST_PAY_SCHD_R.$trd_d_rmrks};
		}
		
		/**
		 * 上り電文の支払予定と買掛明細のインデックスを作成する。
		 */
		protected void createIndex() {
			
			_payChkIdxkey = up0().createIndex(PaySchd_DtlApdR.$hdr_peg_no);
			_apDIdxkey = up1().createIndex(PaySchd_DtlApdR.$hdr_peg_no);
			_paySchdIdxkey = up2().createIndex(PaySchd_DtlSchdR.$hdr_peg_no);
			_payActIdxkey = up3().createIndex(PaySchd_DtlActR.$hdr_peg_no);
			_advPayActIdxkey = up4().createIndex(PaySchd_AdvPayActR.$hdr_peg_no);
		}
		
		/**
		 * 支払照合ヘッダを取得する。
		 * @param payChkR 支払照合ヘッダ
		 * @return 買掛明細
		 */
		protected PaySchd_HdrR getUpPayChkR(MCNumber hdrPegNo) {

			return up0().getFirst(_payChkIdxkey, hdrPegNo);
		}
		
		/**
		 * 支払照合ヘッダに紐付く買掛明細を取得する。
		 * @param payChkR 支払照合ヘッダ
		 * @return 買掛明細
		 */
		protected MCList<PaySchd_DtlApdR> getUpApDL(PaySchd_HdrR payChkR) {

			return up1().subList(_apDIdxkey, payChkR.hdr_peg_no());
		}
		
		/**
		 * 支払照合ヘッダに紐付く支払予定を取得する。
		 * @param payChkR 支払照合ヘッダ
		 * @return 支払予定
		 */
		protected MCList<PaySchd_DtlSchdR> getUpPaySchdL(PaySchd_HdrR payChkR) {
			
			return up2().subList(_paySchdIdxkey, payChkR.hdr_peg_no());
		}
		/**
		 * 支払照合ヘッダに紐付く支払実績明細を取得する。
		 * @param payChkR 支払照合ヘッダ
		 * @return 支払実績明細
		 */
		protected MCList<PaySchd_DtlActR> getUpPayActL(PaySchd_HdrR payChkR) {
			
			return up3().subList(_payActIdxkey, payChkR.hdr_peg_no());
		}
		/**
		 * 支払照合ヘッダに紐付く前渡金実績を取得する。
		 * @param payChkR 支払照合ヘッダ
		 * @return 前渡金実績
		 */
		protected MCList<PaySchd_AdvPayActR> getUpAdvPayActL(PaySchd_HdrR payChkR) {
			
			return up4().subList(_advPayActIdxkey, payChkR.hdr_peg_no());
		}
		
		/**
		 * 承認提供サービスの承認情報作成前チェックを実行する。
		 */
		protected void callAprvServiceChk(MCList<PaySchd_HdrR> upPayChkL) {
			
			MBBAL_AprvService.Aprv_Chk01 ope = MBBAL_AprvService.crtAprv_Chk01();
			Aprv_Chk01_Rslt1R upR = null;
			
			for (PaySchd_HdrR upPayChkR : upPayChkL) {
				MCList<PaySchd_DtlSchdR> paySchdL =
					up2()
					 .subList(_paySchdIdxkey, upPayChkR.hdr_peg_no())
					 .subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
					
				if (!isUpd(upPayChkR)) {
					continue;
				}
				upR = Aprv_Chk01_Rslt1R.create();
				
				upR.peg_no(upPayChkR.hdr_peg_no());
				upR.biz_usr_cd(upPayChkR.bsppl_usr_cd());
				upR.master_dt(upPayChkR.reg_dt());
				upR.aprv_func_typ(MAC_APRV_FUNC_TYP.PAY_SCHD.value());
				upR.src_dpt_cd(upPayChkR.bsppl_dpt_cd());
				upR.src_bp_cd(upPayChkR.bsppl_cd());
				upR.src_cur_cd1(upPayChkR.trd_cur_cd());
				upR.src_amt1(getAprvAmt(paySchdL));
				upR.aprv_src_no1(upPayChkR.pay_chk_no());
				upR.aprv_no(getCachePayChkR(upPayChkR.pay_chk_mng_no()).aprv_no());
				
				upR.setAttributes(upPayChkR);
				ope.up0().add(upR);
			}
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
				
				copyByPegNo(
						upPayChkL,
						ope.down0(),
						PaySchd_HdrR.$hdr_peg_no,
						new String[] {PaySchd_HdrR.$err_flg},
						Aprv_Upd01_Dtl1R.$peg_no,
						new String[] {Aprv_Chk01_Rslt1R.$err_flg});
			}
		}
		
		/**
		 * 支払実績サービスの支払実績更新前チェックを実行する。
		 * @param chkL チェッ対象クリスト
		 */
		protected void callPayActServiceChk(MCList<PaySchd_HdrR> chkPayChkL, MCList<PaySchd_DtlSchdR> chkPaySchdL) {

			// データ更新区分を変更するので上り電文のロウをコピーする
			MCList<PaySchd_HdrR> wkPayChkL = MCList.create(PaySchd_HdrR.class);
			MCList<PaySchd_DtlSchdR> wkPaySchdL = MCList.create(PaySchd_DtlSchdR.class);

			// 支払予定ＮＯによるINDEX作成のため支払予定リストを生成する
			MCList<MST_PAY_SCHD_R> paySchdL = MCList.create(MST_PAY_SCHD_R.class);
			for (PaySchd_HdrR payChkR : chkPayChkL) {
				if (isCrt(payChkR)
					|| isUpd(payChkR) && MSBHL_PaySchdRegService.justUpdRmrks(payChkR.pay_chk_mng_no()) && !isAprvRvrs(payChkR)) {
					continue;
				}
				setSkipPayActCache(payChkR);
				MST_PAY_CHK_R dbPayChkR = getCachePayChkR(payChkR.pay_chk_mng_no());
				if (!dbPayChkR.aprv_flg() || isAprvRvrs(payChkR)) {
					wkPayChkL.add(payChkR.clone());
					paySchdL.addAll(getCachePaySchdL(payChkR.pay_chk_mng_no()));
				}
			}

			MCIndexKey idx = paySchdL.createIndex(MST_PAY_SCHD_R.$pay_schd_no);
			for (PaySchd_DtlSchdR r : chkPaySchdL) {
				MST_PAY_SCHD_R paySchdR = paySchdL.getFirst(idx, r.pay_schd_no());
				if (!isNull(paySchdR)) {
					PaySchd_DtlSchdR rr = r.clone();
					// 更新前の状態を格納
					rr.pay_schd(paySchdR);
					wkPaySchdL.add(rr);
				}
			}
			
			// チェック削除のみ
			wkPayChkL.forEach(r -> r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value()));
			wkPaySchdL.forEach(r -> r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value()));

			// 支払実績サービスチェック処理用電文設定
			setPayActChk01Del(wkPayChkL, wkPaySchdL);

	 		MSBHL_PayActRegService.PayAct_Chk01 chk = getPayActChk01();
			if (chk.up0().isEmpty()) {
				return;
			}

			chk.exec();
			MCIndexKey payChkIdx = chkPayChkL.createIndex(PaySchd_HdrR.$hdr_peg_no);
			for (PayAct_Chk01_HdrR downR : chk.down0()) {
				PaySchd_HdrR r = chkPayChkL.getFirst(payChkIdx, _payActHdrPegNoMap.get(downR.hdr_peg_no()));
				if (!isNull(r)) {
					r.err_flg(downR.err_flg());
				}
			}
		}
	}

	/**
	 * PaySchd_Chk02オペレーション.<p>
	 *
	 * 支払予定の削除が可能かチェックをする。<br>
	 */
	public class PaySchd_Chk02 extends MSBHL_PaySchdRegService_MC_A.PaySchd_Chk02 {
		
		/**
		 * 支払照合ヘッダリスト
		 */
		protected MCList<MST_PAY_CHK_R> _payChkL = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			callAprvServiceChk(getChkList(up0()));
			
			callPayActServiceChk(getChkList(up0()), up1());
			
			chkAfter();
			
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {

			initPayCache(up0());
			initAdvPayActCache(up0());
			
			MCMessageList msgL = super.doServerCheckSub();
			
			msgL.addAll(chkUpdCntrPayChk());
			
			msgL.addAll(super.doServerCheckBase());

			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			getPayChkL(up0());
			
			MCList<PaySchd_HdrR> chkL = getChkList(up0());
			
			msgL.addAll(chkDt(chkL));
			
			msgL.addAll(chkAprv(chkL));
			
			msgL.addAll(chkPaySchd(chkL));
			
			msgL.addAll(chkCoApD(chkL));
			
			msgL.addAll(chkCoApDSw(chkL));
			
			msgL.addAll(chkCl(chkL));
			
			return msgL;
		}

		@Override
		protected boolean skipListLogicCheck(MCContainer container, String column) {
			// 取消ではリストロジックチェックは行わない
			return true;
		}

		/**
		 * チェック後処理
		 */
		protected void chkAfter() {

			String[] key = {
				MST_PAY_CHK_R.$bsppl_cd,
				MST_PAY_CHK_R.$bsppl_dpt_cd,
				MST_PAY_CHK_R.$purc_act_no,
				MST_PAY_CHK_R.$rcpt_iv_mng_no,
				MST_PAY_CHK_R.$rcpt_iv_no,
				MST_PAY_CHK_R.$trd_cur_cd,
				MST_PAY_CHK_R.$wrk_no
			};
			
			MCIndexKey idx = up0().createIndex(PaySchd_HdrR.$pay_chk_mng_no);
			for (MCList<MST_PAY_CHK_R> list : _payChkL.groupList(key)) {
			
				list.sort(SortType.DESC, MST_PAY_CHK_R.$bsppl_cl_dt, MST_PAY_CHK_R.$pay_chk_mng_no);
				
				boolean errFlg = false;
				for (MST_PAY_CHK_R r : list) {
					PaySchd_HdrR upPayChkR = up0().getFirst(idx, r.pay_chk_mng_no());
					
					if (upPayChkR.err_flg()) {
						errFlg = true;
					}
					else if (errFlg) {
						MCMessagePool.add(new MCMessage(upPayChkR, null, MSBHL0053,
							r.bsppl_cd(), r.bsppl_dpt_cd(),
							r.purc_act_no(), r.rcpt_iv_mng_no(), r.rcpt_iv_no(),
							r.trd_cur_cd(), r.wrk_no(), toYMDString(r.bsppl_cl_dt())));
						upPayChkR.err_flg(true);
					}
				}
			}
		}
		
		/**
		 * 支払照合に対する更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntrPayChk() {
		
			MCList<PaySchd_HdrR> chkL = MCList.create(PaySchd_HdrR.class);
			
			// 更新対象の支払照合ヘッダ
			chkL.addAll(up0());
		
			// 支払照合の今回xx支払額に算入している支払実績に対応する支払照合ヘッダ
			MCList<MST_PAY_ACT_D_R> payActL = MCList.create(MST_PAY_ACT_D_R.class);
			MST_PAY_ACT_D_R t = MST_PAY_ACT_D_R.create("T");
			MCQueryApiBuilder payActL_bldr = MCQueryApiBuilder.create(t);
			payActL_bldr.setDistinct();
			payActL_bldr.setSelect(t.pay_chk_mng_no);
			payActL_bldr.setWhere(t.calc_tgt_pay_chk_mng_no.eq(bind("pay_chk_mng_no")));
			dbSelect("MSBHL5030_MST_PAY_ACT_D_S06", payActL, payActL_bldr, chkL);
			payActL.forEach(r -> { chkL.add().pay_chk_mng_no(r.pay_chk_mng_no()); });
			
			// ロックおよび更新カウンタチェック
			return chkUpdCntrPayChkCmm(chkL, isUpdCntrChk(up0()));
		}

		/**
		 * 支払照合ヘッダを取得する。
		 */
		protected void getPayChkL(MCList<PaySchd_HdrR> chkL) {
			
			_payChkL = MCList.create(MST_PAY_CHK_R.class);
			MCQueryApiBuilder payChkL_bldr = MCQueryApiBuilder.create(MST_PAY_CHK_R.create("T"));
			dbSelectColumn("MSBHL5030_MST_PAY_CHK_S04", _payChkL, payChkL_bldr, MST_PAY_CHK_R.$pay_chk_mng_no, chkL, PaySchd_HdrR.$pay_chk_mng_no);
		}
		
		/**
		 * 日付チェックを行う。
		 * @param chkL 支払照合ヘッダリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkDt(MCList<PaySchd_HdrR> chkL) {
			
			MCMessageList msgL = new MCMessageList();
			
			MCIndexKey idx = up1().createIndex(PaySchd_DtlSchdR.$hdr_peg_no);
			
			for (PaySchd_HdrR chkR : chkL) {
				int msgCnt = msgL.size();
				
				for (PaySchd_DtlSchdR paySchdR : up1().subList(idx, chkR.hdr_peg_no())) {
					msgL.addAll(check(paySchdR, PaySchd_DtlSchdR.$can_ac_dt, new FXUCL_BeforeTodayValidater()));
				}
				
				if (msgL.size() > msgCnt) {
					chkR.err_flg(true);
				}
			}
			
			return msgL;
		}
		
		/**
		 * 承認済みかチェックする。
		 * @param chkL チェック対象リスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkAprv(MCList<PaySchd_HdrR> chkL) {
		
			MCMessageList msgL = new MCMessageList();
			
			MCIndexKey idxkey = _payChkL.createIndex(MST_PAY_CHK_R.$pay_chk_mng_no);
			
			for (PaySchd_HdrR chkR : chkL) {
				
				MST_PAY_CHK_R payChkR = _payChkL.getFirst(idxkey, chkR.pay_chk_mng_no());
				if (payChkR.aprv_flg()) {
					if ( !(MAC_APRV_STS_TYP.isACPT(payChkR.aprv_sts_typ())
						|| MAC_APRV_STS_TYP.isFIX(payChkR.aprv_sts_typ())) ) {
						// 一次承認済み、最終承認済みのいずれか以外はチェック対象外
					}
					else if (!isAprvRvrs(chkR)) {
						msgL.add(new MCMessage(chkR, null, MSBHL0011, payChkR.pay_chk_no()));
					}
				}
			}
			
			return msgL;
		
		}
		
		/**
		 * 一部支払または支払済の支払予定が存在するかチェックする。
		 * @param chkL チェック対象リスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkPaySchd(MCList<PaySchd_HdrR> chkL) {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<MST_PAY_SCHD_R> paySchdL = getPaySchd(chkL);
			
			MCIndexKey idxkey = paySchdL.createIndex(MST_PAY_SCHD_R.$pay_chk_mng_no);
			
			for (PaySchd_HdrR chkR : chkL) {
				
				if (!isNull(paySchdL.subList(idxkey, chkR.pay_chk_mng_no()))) {
					MST_PAY_CHK_R payChkR = getCachePayChkR(chkR.pay_chk_mng_no());
					msgL.add(new MCMessage(chkR, null, MSBHL0013,  payChkR.pay_chk_no()));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 引数で指定された支払照合管理ＮＯで支払済の支払予定を取得する。
		 * @param chkL チェック対象リスト
		 * @return 支払予定リスト
		 */
		protected MCList<MST_PAY_SCHD_R> getPaySchd(MCList<PaySchd_HdrR> chkL) {
			
			MST_PAY_ACT_D_R t2 = MST_PAY_ACT_D_R.create("T2");
			MST_PAY_ACT_R t3 = MST_PAY_ACT_R.create("T3");

			MCList<MST_PAY_SCHD_R> paySchdL = MCList.create(MST_PAY_SCHD_R.class);
			MST_PAY_SCHD_R t = MST_PAY_SCHD_R.create("T");
			MCQueryApiBuilder paySchdL_bldr = MCQueryApiBuilder.create(t);
			paySchdL_bldr.addInnerJoin(t2, bracket(t2.pay_schd_no.eq(t.pay_schd_no)));
			paySchdL_bldr.addInnerJoin(t3, bracket(t3.pay_act_no.eq(t2.pay_act_no)
					.and(t3.pay_act_seq.eq(t2.pay_act_seq))
					.and(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
			paySchdL_bldr.addConstWhereWithAnd(t.pay_sts_typ.neq(value(MSC_PAY_STS_TYP.NOT_PAY.value())));
			paySchdL_bldr.addConstWhereWithAnd(t3.schd_act_flg.eq(value(false)));
			dbSelectColumn("MSBHL5030_MST_PAY_SCHD_S02", paySchdL, paySchdL_bldr, MST_PAY_SCHD_R.$pay_chk_mng_no, chkL, PaySchd_HdrR.$pay_chk_mng_no);
			
			return paySchdL;
		}
		
		/**
		 * 繰越分が照合済チェックを行う。
		 * @param chkL チェック対象リスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkCoApD(MCList<PaySchd_HdrR> chkL) {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<MST_AP_D_R> coApDL = getCoApL(chkL);
			
			MCIndexKey idxkey = coApDL.createIndex(MST_AP_D_R.$pay_chk_mng_no);
			
			for (PaySchd_HdrR chkR : chkL) {
				
				MST_AP_D_R coApDR = coApDL.getFirst(idxkey, chkR.pay_chk_mng_no());
				if (!isNull(coApDR)) {
					msgL.add(new MCMessage(chkR, null, MSBHL0014, coApDR.pay_chk_no()));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 引数で指定された支払照合管理ＮＯで繰越分が照合済の買掛明細を取得する。
		 * @param chkL チェック対象リスト
		 * @return 買掛明細リスト
		 */
		protected MCList<MST_AP_D_R> getCoApL(MCList<PaySchd_HdrR> chkL) {
			
			MST_AP_D_R S1ST = MST_AP_D_R.create("ST");

			MCList<MST_AP_D_R> coApDL = MCList.create(MST_AP_D_R.class);
			MST_AP_D_R t = MST_AP_D_R.create("T");
			MCQueryApiBuilder coApDL_bldr = MCQueryApiBuilder.create(t);
			coApDL_bldr.addConstWhereWithAnd(exists(subQuery()
					.select(value("X"))
					.from(S1ST)
					.where(t.crryovr_ap_d_no.eq(S1ST.ap_d_no)
							.and(S1ST.chk_flg.eq(value(true)))
							.and(S1ST.crryovr_flg.eq(value(true))))));
			dbSelectColumn("MSBHL5030_MST_AP_D_S08", coApDL, coApDL_bldr, MST_AP_D_R.$pay_chk_mng_no, chkL, PaySchd_HdrR.$pay_chk_mng_no);
			
			return coApDL;
		}
		
		/**
		 * 繰越分が振替済みかチェックを行う。
		 * @param chkL チェック対象リスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkCoApDSw(MCList<PaySchd_HdrR> chkL) {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<MST_AP_D_R> coApDL = getCoApSwL(chkL);
			
			MCIndexKey idxkey = coApDL.createIndex(MST_AP_D_R.$pay_chk_mng_no);
			
			for (PaySchd_HdrR chkR : chkL) {
				
				for (MST_AP_D_R coApDR : coApDL.subList(idxkey, chkR.pay_chk_mng_no())) {
					msgL.add(new MCMessage(chkR, null, MSBHL0111, coApDR.pay_chk_no(), coApDR.ap_d_no()));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 引数で指定された支払照合管理ＮＯで繰越分が振替済の買掛明細を取得する。
		 * @param chkL チェック対象リスト
		 * @return 買掛明細リスト
		 */
		protected MCList<MST_AP_D_R> getCoApSwL(MCList<PaySchd_HdrR> chkL) {
			
			MST_AP_D_R apdwR = MST_AP_D_R.create("APD_W");

			MCList<MST_AP_D_R> coApDL = MCList.create(MST_AP_D_R.class);
			MST_AP_D_R apdR = MST_AP_D_R.create("APD");
			MCQueryApiBuilder coApDL_bldr = MCQueryApiBuilder.create(apdR);
			coApDL_bldr.addConstWhereWithAnd(exists(subQuery()
					.select(value("X"))
					.from(apdwR)
					.where(apdR.crryovr_ap_d_no.eq(apdwR.ap_d_no)
							.and(apdwR.sw_flg.eq(value(true)))
							.and(apdwR.crryovr_flg.eq(value(true))))));
			dbSelectColumn("MSBHL5030_MST_AP_D_S13", coApDL, coApDL_bldr, MST_AP_D_R.$pay_chk_mng_no, chkL, PaySchd_HdrR.$pay_chk_mng_no);
			
			return coApDL;
		}
		
		/**
		 * 支払予定管理先締年月日以降で同一まとめの締済の支払照合ヘッダが存在するかチェックする。<br>
		 * 締日が同一の場合、支払照合管理ＮＯで比較する。
		 * @param chkL 支払照合ヘッダリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkCl(MCList<PaySchd_HdrR> chkL) {
			
			MCMessageList msgL = new MCMessageList();
			
			_payChkL.sort(SortType.DESC, MST_PAY_CHK_R.$bsppl_cl_dt, MST_PAY_CHK_R.$pay_chk_mng_no);
			
			MCList<MST_PAY_CHK_R> sameClPayChkL = getSameClPayChkL(_payChkL);
			sameClPayChkL.addBooleanColumn("can_flg", false);
			
			MCIndexKey[] idxkey = {
				sameClPayChkL.createIndex(
					MST_PAY_CHK_R.$bsppl_cd,
					MST_PAY_CHK_R.$bsppl_dpt_cd,
					MST_PAY_CHK_R.$purc_act_no,
					MST_PAY_CHK_R.$rcpt_iv_mng_no,
					MST_PAY_CHK_R.$trd_cur_cd,
					MST_PAY_CHK_R.$wrk_no),
				sameClPayChkL.createIndex(
					MST_PAY_CHK_R.$pay_chk_mng_no)
			};

			for (MST_PAY_CHK_R payChkR : _payChkL) {
				if (payChkR.pay_spot_flg()) {
					continue;
				}
				if (!sameClPayChkL
						.subList(idxkey[0], payChkR.toArray(idxkey[0].getKeys()))
						.subList(r -> !r.getBoolean("can_flg"))
						.subList(r -> existsNextCl(r, payChkR)).isEmpty()) {

					PaySchd_HdrR chkR = chkL.getFirst(PaySchd_HdrR.$pay_chk_mng_no, payChkR.pay_chk_mng_no());
					msgL.add(new MCMessage(chkR, null, MSBHL0003, 
							payChkR.bsppl_cd(), payChkR.bsppl_dpt_cd(), payChkR.trd_cur_cd(),
							payChkR.wrk_no(), toYMDString(payChkR.bsppl_cl_dt()), payChkR.pay_chk_no()));
					chkR.err_flg(true);
				}
				
				// 取消済み（とみなす）
				MST_PAY_CHK_R sameClPayChkR = sameClPayChkL.getFirst(idxkey[1], payChkR.pay_chk_mng_no());
				sameClPayChkR.setBoolean("can_flg", true);
			}
			
			return msgL;
		}
		
		/**
		 * 支払予定管理先締年月日以降で同一まとめの締済の支払照合ヘッダが存在するかチェックする。<br>
		 * 締日が同一の場合、支払照合管理ＮＯで比較する。<br>
		 * 比較対象も取消する場合、存在しないと扱う。
		 * @param nextClR 比較対象
		 * @param payChkR チェック対象
		 * @return 締済の支払照合ヘッダが存在する場合はtrue
		 */
		protected boolean existsNextCl(MST_PAY_CHK_R nextClR, MST_PAY_CHK_R payChkR) {
			return !payChkR.pay_spot_flg() && nextClR.bsppl_cl_dt().gt(payChkR.bsppl_cl_dt()) 
					|| (isSame(nextClR.bsppl_cl_dt(), payChkR.bsppl_cl_dt()) && nextClR.pay_chk_mng_no().compareTo(payChkR.pay_chk_mng_no()) > 0);
		}
		
		/**
		 * 同一まとめ単位の支払照合ヘッダの締情報を取得する。
		 * @param payChkL チェック対象の支払照合ヘッダリスト
		 * @return 同一まとめ単位の支払照合ヘッダの締情報
		 */
		protected MCList<MST_PAY_CHK_R> getSameClPayChkL(MCList<MST_PAY_CHK_R> payChkL) {

			MCList<MST_PAY_CHK_R> clPayChkL = MCList.create(MST_PAY_CHK_R.class);
			MST_PAY_CHK_R t1 = MST_PAY_CHK_R.create("T");
			MCQueryApiBuilder clPayChkL_bldr = MCQueryApiBuilder.create(t1);
			
			clPayChkL_bldr.setDistinct();
			clPayChkL_bldr.setSelect(t1.pay_chk_mng_no, t1.bsppl_cd, t1.bsppl_dpt_cd,
					t1.purc_act_no, t1.rcpt_iv_mng_no, t1.trd_cur_cd, t1.wrk_no,
					t1.bsppl_cl_dt);
			
			clPayChkL_bldr.setWhere(
					createWhere(t1, MST_PAY_CHK_R.$bsppl_cd, MST_PAY_CHK_R.$bsppl_dpt_cd,
							MST_PAY_CHK_R.$purc_act_no, MST_PAY_CHK_R.$rcpt_iv_mng_no,
							MST_PAY_CHK_R.$trd_cur_cd, MST_PAY_CHK_R.$wrk_no));
			
			MST_PAY_CHK_R cndR = MST_PAY_CHK_R.create();
			MST_PAY_CHK_R t2 = MST_PAY_CHK_R.create("T");
			cndR.bsppl_cl_dt((MCDate)payChkL.min(MST_PAY_CHK_R.$bsppl_cl_dt));
			clPayChkL_bldr.addConstWhereWithCutOffAnd(
					bracket(t2.bsppl_cl_dt.gte(bind("bsppl_cl_dt"))
							.or(t2.bsppl_cl_dt.isNull())));
			dbSelect("MSBHL5030_MST_PAY_CHK_S05", clPayChkL, clPayChkL_bldr, payChkL, cndR);
			
			return clPayChkL;
		}
		
		/**
		 * 承認提供サービスの承認情報削除前チェックを実行する。
		 * @param chkL チェッ対象クリスト
		 */
		protected void callAprvServiceChk(MCList<PaySchd_HdrR> chkL) {
			
			MCList<MST_PAY_CHK_R> aprvPayChkL = getAprvPayChkL(chkL);
			MCIndexKey idxkey = aprvPayChkL.createIndex(MST_PAY_CHK_R.$pay_chk_mng_no);
			
			if (!isNull(aprvPayChkL)) {
				
				MBBAL_AprvService.Aprv_Chk04 ope = MBBAL_AprvService.crtAprv_Chk04();
				Aprv_Chk04_Rslt1R cndR = null;
				
				for (PaySchd_HdrR chkR : chkL) {
					
					MST_PAY_CHK_R payChkR = aprvPayChkL.getFirst(idxkey, chkR.pay_chk_mng_no());
					
					if (!isNull(payChkR)) {
						
						cndR = Aprv_Chk04_Rslt1R.create();
						
						cndR.peg_no(chkR.hdr_peg_no());
						cndR.aprv_no(payChkR.aprv_no());
						cndR.setAttributes(chkR);
						ope.up0().add(cndR);
					}
				}
				
				ope.exec();
				
				copyByPegNo(
						chkL,
						ope.down0(),
						PaySchd_HdrR.$hdr_peg_no,
						new String[] {PaySchd_HdrR.$err_flg},
						Aprv_Chk04_Rslt1R.$peg_no,
						new String[] {Aprv_Chk04_Rslt1R.$err_flg});
			}
		}
		
		/**
		 * 引数で指定された支払照合管理ＮＯで承認対象の支払照合ヘッダを取得する。
		 * @param chkL チェッ対象クリスト
		 * @return 支払照合ヘッダリスト
		 */
		protected MCList<MST_PAY_CHK_R> getAprvPayChkL(MCList<PaySchd_HdrR> chkL) {
			
			MCList<MST_PAY_CHK_R> aprvPayChkL = MCList.create(MST_PAY_CHK_R.class);
			MST_PAY_CHK_R t = MST_PAY_CHK_R.create("T");
			MCQueryApiBuilder aprvPayChkL_bldr = MCQueryApiBuilder.create(t);
			aprvPayChkL_bldr.addConstWhereWithAnd(t.aprv_flg.eq(value(true)));
			dbSelectColumn("MSBHL5030_MST_PAY_CHK_S06", aprvPayChkL, aprvPayChkL_bldr, MST_PAY_CHK_R.$pay_chk_mng_no, chkL, PaySchd_HdrR.$pay_chk_mng_no);
			
			return aprvPayChkL;
		}
		
		/**
		 * 支払実績サービスの支払実績更新前チェックを実行する。
		 * @param chkL チェッ対象クリスト
		 */
		protected void callPayActServiceChk(MCList<PaySchd_HdrR> chkPayChkL, MCList<PaySchd_DtlSchdR> chkPaySchdL) {

			// 支払予定ＮＯによるINDEX作成のため支払予定リストを生成する
			MCList<MST_PAY_SCHD_R> paySchdL = MCList.create(MST_PAY_SCHD_R.class);
			for (PaySchd_HdrR payChkR : chkPayChkL) {
				paySchdL.addAll(getCachePaySchdL(payChkR.pay_chk_mng_no()));
			}

			MCIndexKey idx = paySchdL.createIndex(MST_PAY_SCHD_R.$pay_schd_no);
			for (PaySchd_DtlSchdR r : chkPaySchdL) {
				r.pay_schd(paySchdL.getFirst(idx, r.pay_schd_no()));
			}

			// 支払実績サービスチェック処理用電文設定
			setPayActChk01Del(chkPayChkL, chkPaySchdL);

	 		MSBHL_PayActRegService.PayAct_Chk01 chk = getPayActChk01();
			if (chk.up0().isEmpty()) {
				return;
			}

			chk.exec();
			MCIndexKey payChkIdx = chkPayChkL.createIndex(PaySchd_HdrR.$hdr_peg_no);
			for (PayAct_Chk01_HdrR downR : chk.down0()) {
				PaySchd_HdrR r = chkPayChkL.getFirst(payChkIdx, _payActHdrPegNoMap.get(downR.hdr_peg_no()));
				if (!isNull(r)) {
					r.err_flg(downR.err_flg());
				}
			}
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	/**
	 * PaySchd_Lock_Upd01オペレーション.<p>
	 *
	 * 支払予定鑑の単位にロックする。<br>
	 */
	public class PaySchd_Lock_Upd01 extends MSBHL_PaySchdRegService_MC_A.PaySchd_Lock_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			editUp();
			lock();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			for (MST_PAY_SCHD_LOCK_R r : up0()) {
				r.purc_act_no(nvl(r.purc_act_no(), MAC_STR.NULL_VAL.value()));
				r.rcpt_iv_mng_no(nvl(r.rcpt_iv_mng_no(), MAC_STR.NULL_VAL.value()));
				r.rcpt_iv_no(nvl(r.rcpt_iv_no(), MAC_STR.NULL_VAL.value()));
				r.wrk_no(nvl(r.wrk_no(), MAC_STR.NULL_VAL.value()));
			}
		}

		/**
		 * 支払予定ロックテーブルをロックする
		 */
		protected void lock() {
			MCList<MST_PAY_SCHD_LOCK_R> lockTgtL = up0().groupBy(up0().createRow().getKeyColumn());
			MCQueryApiBuilder lockTgtL_bldr = MCQueryApiBuilder.create(MST_PAY_SCHD_LOCK_R.create("T"));
			dbWkDelete("MSBHL5030_MSW_PAY_SCHD_LOCK_D01", lockTgtL_bldr.getBaseDbc());
			dbWkInsert("MSBHL5030_MSW_PAY_SCHD_LOCK_I01", lockTgtL, lockTgtL_bldr.getBaseDbc());

			MST_PAY_SCHD_LOCK_R t = MST_PAY_SCHD_LOCK_R.create("T");
			MSW_PAY_SCHD_LOCK_KEY_R w = MSW_PAY_SCHD_LOCK_KEY_R.create("W");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.addInnerJoin(w,
					bracket(w.bsppl_cd.eq(t.bsppl_cd)
							.and(w.bsppl_dpt_cd.eq(t.bsppl_dpt_cd))
							.and(w.purc_act_no.eq(t.purc_act_no))
							.and(w.rcpt_iv_mng_no.eq(t.rcpt_iv_mng_no))
							.and(w.rcpt_iv_no.eq(t.rcpt_iv_no))
							.and(w.wrk_no.eq(t.wrk_no))
							.and(w.trd_cur_cd.eq(t.trd_cur_cd))));
			dbc_bldr.setOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());

			while (tryLock(dbc_bldr) != lockTgtL.size()) {
				try {
					executeUpdate(MSBHL5030_MST_PAY_SCHD_LOCK_I01());
				}
				catch (MCException e) {
					// 一意制約エラーは何もしない
					if (!isSame(e.getID(), FCBCC0136)) {
						throw e;
					}
				}
			}

			dbWkDelete("MSBHL5030_MSW_PAY_SCHD_LOCK_D02", lockTgtL_bldr.getBaseDbc());
		}
		
		protected int tryLock(MCQueryApiBuilder dbc_bldr) {
			dbSelectForUpdateNoFetch("MSBHL5030_MST_PAY_SCHD_LOCK_S01", dbc_bldr);	// orderByあり
			
			MST_PAY_SCHD_LOCK_R t2 = MST_PAY_SCHD_LOCK_R.create("T");
			MSW_PAY_SCHD_LOCK_KEY_R w2 = MSW_PAY_SCHD_LOCK_KEY_R.create("W");
			MCQueryApiBuilder dbc_bldr2 = MCQueryApiBuilder.create(t2);
			dbc_bldr2.setSelect(count(value(1)).as("cnt"));
			dbc_bldr2.addInnerJoin(w2,
					bracket(w2.bsppl_cd.eq(t2.bsppl_cd)
							.and(w2.bsppl_dpt_cd.eq(t2.bsppl_dpt_cd))
							.and(w2.purc_act_no.eq(t2.purc_act_no))
							.and(w2.rcpt_iv_mng_no.eq(t2.rcpt_iv_mng_no))
							.and(w2.rcpt_iv_no.eq(t2.rcpt_iv_no))
							.and(w2.wrk_no.eq(t2.wrk_no))
							.and(w2.trd_cur_cd.eq(t2.trd_cur_cd))));

			MCRow result = MCRow.create();
			result.addNumberColumn("cnt");
			dbc_bldr2.buildSelect("MSBHL5030_MST_PAY_SCHD_LOCK_S02").executeQuery(result);
			return result.getNumberNE("cnt").intValue(); // OrderByなし
		}
	}
	


	/**
	 * 支払照合に対する更新カウンタチェック
	 */
	protected MCMessageList chkUpdCntrPayChkCmm(MCList<PaySchd_HdrR> payChkL, boolean updCntrChkflg) {

		MCMessageList msgL = new MCMessageList();
		payChkL.sort(PaySchd_HdrR.$pay_chk_mng_no);

		// 支払照合ヘッダをロック
		MCList<MST_PAY_CHK_R> dbc = MCList.create(MST_PAY_CHK_R.class);
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_PAY_CHK_R.create("T"));
		dbc_bldr.setOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
		dbSelectKeyForUpdateNoWait("MSBHL5030_MST_PAY_CHK_S07", dbc, dbc_bldr, payChkL);

		if (updCntrChkflg) {
			MCIndexKey idx = dbc.createIndex(MST_PAY_CHK_R.$pay_chk_mng_no);
			for (PaySchd_HdrR r : payChkL.subList(r -> !isNull(r.upd_cntr()))) {
				msgL.addAll(checkUpdCntrNE(r, PaySchd_HdrR.$upd_cntr, dbc.getFirst(idx, r.pay_chk_mng_no())));
				setErrFlgCmm(r, msgL);
			}
		}
		
		return msgL;
	}

	/**
	 * 手形関連の項目を取得する
	 */
	protected String[] _noteCols;
	protected String[] getNoteCols() {
		if (_noteCols == null) {
			_noteCols = new String[]{
				MST_PAY_SCHD_R.$note_no,
				MST_PAY_SCHD_R.$note_typ,
				MST_PAY_SCHD_R.$note_rsn_cd,
				MST_PAY_SCHD_R.$draw_dt,
				MST_PAY_SCHD_R.$due_dt,
				MST_PAY_SCHD_R.$note_days,
				MST_PAY_SCHD_R.$drawer_nm,
				MST_PAY_SCHD_R.$draw_bank_cd,
				MST_PAY_SCHD_R.$draw_branch_cd,
				MST_PAY_SCHD_R.$endrsr,
				MST_PAY_SCHD_R.$accptr
			};
		}
		return _noteCols;
	}

	/**
	 * 本サービスの消費税差額調整オペレーションを生成する<br>
	 */
	protected MSBHL_PaySchdRegService.PaySchd_Srch05 _paySchdSrch05;
	protected static MSBHL_PaySchdRegService.PaySchd_Srch05 crtPaySchdSrch05() {
		object(CLAZZ)._paySchdSrch05 = MSBHL_PaySchdRegService.crtPaySchd_Srch05();
		return object(CLAZZ)._paySchdSrch05;
	}

	/**
	 * 本サービスの消費税差額調整オペレーションを取得する<br>
	 */
	protected static MSBHL_PaySchdRegService.PaySchd_Srch05 getPaySchdSrch05() {
		return object(CLAZZ)._paySchdSrch05;
	}

	/**
	 * 支払時税差額調整を行う。
	 * @param upPayChkL 上り電文の支払照合ヘッダ
	 * @param upApDL 上り電文の買掛明細
	 * @param apDIdxkey 買掛明細のインデックス
	 * @return 支払時税差額の買掛明細
	 */
	protected MCList<MST_AP_D_R> crtTaxDiffPayClCommon(
			MCList<PaySchd_HdrR> upPayChkL, MCList<PaySchd_DtlApdR> upApDL, MCIndexKey apDIdxkey) {
		
		MCList<PaySchd_DtlApdR> taxDiffPayClUpApDL = getTaxDiffPayClUpApDL(upPayChkL, upApDL, apDIdxkey);
		
		if (isNull(taxDiffPayClUpApDL)) {
			return null;
		}
		
		doApDNoSeqCache(taxDiffPayClUpApDL);
		
		MCList<MST_AP_D_R> taxDiffPayClApDL = crtTaxDiffPayClApD(taxDiffPayClUpApDL);
		
		callCredServiceUpd(taxDiffPayClApDL);
		
		return taxDiffPayClApDL;
	}
	
	/**
	 * 支払時税差額の参照元買掛明細を取得する。
	 * @param upPayChkL 上り電文の支払照合
	 * @param upApDL 上り電文の買掛明細
	 * @return 支払時税差額の参照元買掛明細
	 */
	protected MCList<PaySchd_DtlApdR> getTaxDiffPayClUpApDL(
			MCList<PaySchd_HdrR> upPayChkL, MCList<PaySchd_DtlApdR> upApDL, MCIndexKey apDIdxkey) {

		MCList<PaySchd_DtlApdR> list = MCList.create(PaySchd_DtlApdR.class);
		for (PaySchd_HdrR upPayChkR : upPayChkL) {
			
			if (isUpd(upPayChkR) && justUpdRmrks(upPayChkR.pay_chk_mng_no())) {
				continue;
			}
			
			list.addAll(
				upApDL
					.subList(apDIdxkey, upPayChkR.hdr_peg_no())
					.subList(r->isNull(r.ap_d_no()) || isAdjustApd(r.ap_d()))
			);
			list.setDateNE(PaySchd_DtlApdR.$hdr_bsppl_cl_dt, upPayChkR.bsppl_cl_dt());
		}
		
		return list;
	}
	
	/**
	 * 支払時税差額の買掛明細を登録する。
	 * @param taxDiffPayClUpApDL 買掛明細
	 * @return 支払時税差額の買掛明細
	 */
	protected MCList<MST_AP_D_R> crtTaxDiffPayClApD(MCList<PaySchd_DtlApdR> taxDiffPayClUpApDL) {
		
		MSBHL_PaySchdRegService.PaySchd_Srch05 srch05 = getPaySchdSrch05();
		if (srch05 == null || srch05.down0().isEmpty()) {
			return null;
		}
		MCList<MST_AP_D_R>
			insL = MCList.create(MST_AP_D_R.class),
			updL = MCList.create(MST_AP_D_R.class),
			taxDiffPayClApDL = MCList.create(MST_AP_D_R.class);
		
		taxDiffPayClApDL.addNumberColumn("hdr_peg_no");
		MCIndexKey u0Idx = srch05.up0().createIndex(PaySchd_Srch05_RsltR.$hdr_peg_no);
		MCIndexKey d0Idx = srch05.down0().createIndex(PaySchd_Srch05_RsltR.$hdr_peg_no, PaySchd_Srch05_RsltR.$peg_no);
		
		for (PaySchd_DtlApdR upApDR : taxDiffPayClUpApDL) {
		
			PaySchd_Srch05_RsltR srch05DownR = srch05.down0().getFirst(d0Idx, upApDR.hdr_peg_no(), upApDR.peg_no());
			if (!isNull(srch05DownR)) {
				MST_AP_D_R taxDiffR = srch05DownR.ap_d();
				
				taxDiffR.setNumberNE("hdr_peg_no", upApDR.hdr_peg_no());
				taxDiffR.pay_chk_mng_no(upApDR.pay_chk_mng_no());
				taxDiffR.pay_chk_no(upApDR.pay_chk_no());
				taxDiffR.pay_schd_d_print_rmrks(upApDR.pay_schd_d_print_rmrks());
				taxDiffR.pay_ntc_d_print_rmrks(upApDR.pay_ntc_d_print_rmrks());
				taxDiffR.intr_rmrks(upApDR.intr_rmrks());
				taxDiffR.sub_char1(upApDR.sub_char1());
				taxDiffR.sub_char2(upApDR.sub_char2());
				taxDiffR.sub_char3(upApDR.sub_char3());
				PaySchd_Srch05_CndR srch05UpR = srch05.up0().getFirst(u0Idx, upApDR.hdr_peg_no());
				if (!isNull(srch05UpR)) {
					taxDiffR.setDateNE(PaySchd_Srch05_CndR.$xrate_base_dt, srch05UpR.xrate_base_dt());
				}
				
				if (isNull(taxDiffR.ap_d_no())) {
					// 新規 or 取消
					taxDiffR.ap_d_no(getStrSeq(MSC_NUM_SYS_TYP.APD));
					taxDiffR.org_ap_d_no(taxDiffR.ap_d_no());
					if (MAC_SLIP_STS_TYP.isCRT(taxDiffR.slip_sts_typ())) {
						taxDiffR.ac_dt(getAcDt(upApDR.hdr_bsppl_cl_dt(), true));
					}
					else {
						taxDiffR.ac_dt(getAcDt(taxDiffR.ac_dt(), true));
					}
					taxDiffR.ac_ym(getAcYm(taxDiffR.ac_dt()));
					taxDiffR.purc_dpt_cd(
						isNullOrNullVal(taxDiffR.purc_dpt_cd()) ?
						MAC_STR.NULL_VAL.value() : getDptCd(taxDiffR.purc_dpt_cd(), taxDiffR.ac_dt())
					);

					// 仕入実績明細ＮＯは買掛明細には引き継がない
					MST_AP_D_R apDR = taxDiffR.clone();
					apDR.purc_act_d_no(MAC_STR.NULL_VAL.value());
					apDR.purc_act_d_seq(1);
					insL.add(apDR);
				}
				else {
					// 無効
					updL.add(taxDiffR);
				}
				
				upApDR.ap_d(taxDiffR);
				taxDiffPayClApDL.add(taxDiffR);
			}
		}
		MST_AP_D_R t = MST_AP_D_R.create("T");

		MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(t);
		dbInsertEx("MSBHL5030_MST_AP_D_I01", insL, insL_bldr);

		MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
		updL_bldr.setSet(t.slip_sts_typ, t.valid_flg);
		dbUpdateKey("MSBHL5030_MST_AP_D_U02", updL, updL_bldr);
		
		return taxDiffPayClApDL;
	}
	
	/**
	 * 支払時税差額の買掛明細に対応する受払実績を作成する。
	 * @param taxDiffPayClApDL 支払時税差額の買掛明細リスト
	 * @param upPayChkL 上り電文の支払照合ヘッダリスト
	 */
	protected void crtIoActCommon(MCList<MST_AP_D_R> taxDiffPayClApDL, MCList<PaySchd_HdrR> upPayChkL) {
		
		if (isNull(taxDiffPayClApDL)) {
			return;
		}
		
		MCIndexKey idxkey = taxDiffPayClApDL.createIndex("hdr_peg_no");
		
		MCList<MST_AP_D_R> ioApDL = MCList.create(MST_AP_D_R.class);
		
		for (PaySchd_HdrR upPayChkR : upPayChkL) {
			
			if (isUpd(upPayChkR) && justUpdRmrks(upPayChkR.pay_chk_mng_no())) {
				continue;
			}
			
			ioApDL.addAll(taxDiffPayClApDL.subList(idxkey, upPayChkR.hdr_peg_no()));
		}
		
		callIoActServiceIns01(ioApDL);
		
		callIoActServiceUpd01(ioApDL);
	}
	
	/**
	 * 消費税差額調整(取消)を行う。
	 * @param apDL 買掛明細リスト
	 */
	protected void delTaxDiffPayClCommon(MCList<MST_AP_D_R> apDL) {
		
		MCList<MST_AP_D_R> taxDiffPayClApDL = getTaxDiffPayClApDL(apDL);
		
		if (isNull(taxDiffPayClApDL)) {
			return;
		}
		
		crtCanTaxDiffPayClApD(taxDiffPayClApDL);
		
		callCredServiceUpd(taxDiffPayClApDL);
		
		callIoActServiceIns01(taxDiffPayClApDL);
		
		callIoActServiceUpd01(taxDiffPayClApDL);
	}
	
	/**
	 * 支払時税差額の買掛明細を取得する。
	 * @param apDL 買掛明細リスト
	 * @return 支払時税差額の買掛明細リスト
	 */
	protected MCList<MST_AP_D_R> getTaxDiffPayClApDL(MCList<MST_AP_D_R> apDL) {

		MCList<MST_AP_D_R> taxDiffPayClApDL = MCList.create(MST_AP_D_R.class);
		
		for (MST_AP_D_R apDR : apDL) {
			if (MAC_TRD_PTN_TYP.isTAX_DIFF_PAY_SCHD_CL(apDR.trd_ptn_typ()) && apDR.valid_flg() ) {
				taxDiffPayClApDL.add(apDR);
			}
		}
		
		return taxDiffPayClApDL;
	}
	
	/**
	 * 支払時税差額の買掛明細の伝票（取消伝票（赤伝）、無効伝票）を登録する。
	 * @param taxDiffPayClApDL 支払時税差額の買掛明細リスト
	 */
	protected void crtCanTaxDiffPayClApD(MCList<MST_AP_D_R> taxDiffPayClApDL) {
		
		MCList<MST_AP_D_R>
			canApDL = MCList.create(MST_AP_D_R.class),
			disApDL = MCList.create(MST_AP_D_R.class);

		for (MST_AP_D_R apDR : taxDiffPayClApDL) {
			
			disApDL.add(makeDisTaxDiffPayClApDR(apDR));
			canApDL.add(makeCanTaxDiffPayClApDR(apDR));
		}
		MST_AP_D_R t = MST_AP_D_R.create("T");

		MCQueryApiBuilder canApDL_bldr = MCQueryApiBuilder.create(t);
		dbInsertEx("MSBHL5030_MST_AP_D_I02", canApDL, canApDL_bldr);

		MCQueryApiBuilder disApDL_bldr = MCQueryApiBuilder.create(t);
		disApDL_bldr.setSet(t.slip_sts_typ, t.valid_flg);
		dbUpdateKey("MSBHL5030_MST_AP_D_U03", disApDL, disApDL_bldr);
		
		taxDiffPayClApDL.setAll(canApDL);
		taxDiffPayClApDL.addAll(disApDL);
	}
	
	/**
	 * 買掛明細を元に、支払時税差額の買掛明細の無効伝票を作成する。
	 * @param apDR 参照元の買掛明細
	 * @return 支払時税差額の買掛明細の無効伝票
	 */
	protected MST_AP_D_R makeDisTaxDiffPayClApDR(MST_AP_D_R apDR) {

		MST_AP_D_R disApDR = apDR.clone();
		
		disApDR.valid_flg(false);
		disApDR.slip_sts_typ(MAC_SLIP_STS_TYP.DIS.value());
		
		return disApDR;
	}
	
	/**
	 * 買掛明細を元に、支払時税差額の買掛明細の取消伝票（赤伝）を作成する。
	 * @param apDR 参照元の買掛明細
	 * @return 支払時税差額の買掛明細の取消伝票（赤伝）
	 */
	protected MST_AP_D_R makeCanTaxDiffPayClApDR(MST_AP_D_R apDR) {

		MST_AP_D_R canApDR = apDR.clone();
		
		canApDR.ap_d_no(getStrSeq(MSC_NUM_SYS_TYP.APD));
		canApDR.org_ap_d_no(canApDR.ap_d_no());
		
		// 取消時なので未照合の状態で作成する
		canApDR.chk_flg(false);
		canApDR.pay_chk_no(null);
		canApDR.pay_chk_mng_no(null);
		canApDR.valid_flg(false);
		
		canApDR.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());
		canApDR.trd_cur_tax_amt(apDR.trd_cur_tax_amt().negate());
		canApDR.base_cur_tax_amt(apDR.base_cur_tax_amt().negate());
		canApDR.ac_dt(getAcDt(canApDR.ac_dt(), true));
		canApDR.ac_ym(getAcYm(canApDR.ac_dt()));
		canApDR.purc_dpt_cd(getDptCd(canApDR.purc_dpt_cd(), canApDR.ac_dt()));
		
		return canApDR;
	}
	
	/**
	 * 発番する買掛明細ＮＯのキャッシュを作成する。
	 * @param taxDiffPayClApDL 支払時税差額の買掛明細リスト
	 */
	protected void doApDNoSeqCache(MCList<PaySchd_DtlApdR> taxDiffPayClApDL) {
		
		doSeqCache(
			MSC_NUM_SYS_TYP.APD,
			taxDiffPayClApDL.subList(r -> isNull(r.ap_d_no())).size()
		);
	}
	
	/**
	 * 発番する買掛消込予定ＮＯのキャッシュを作成する。
	 * @param apApplSchdL 買掛消込予定リスト
	 */
	protected void doApApplSchdNoSeqCache(MCList<MST_AP_APPL_SCHD_R> apApplSchdL) {
		
		doSeqCache(MSC_NUM_SYS_TYP.APAPPLSCHD, apApplSchdL.size());
	}
	
	/**
	 * 与信サービスの与信更新（買掛）を更新する。
	 * @param taxDiffPayClApDL 支払時税差額の買掛明細リスト
	 */
	protected void callCredServiceUpd(MCList<MST_AP_D_R> taxDiffPayClApDL) {
	
		if (isNull(taxDiffPayClApDL)) {
			return;
		}
		
		// 金額符号の調整
		MCList<MST_AP_D_R> list = MCList.create(MST_AP_D_R.class);
		for (MST_AP_D_R r : taxDiffPayClApDL.subList(r -> !MAC_SLIP_STS_TYP.isDIS(r.slip_sts_typ()))) {
			MST_AP_D_R row = r.clone();
			row.trd_cur_tax_amt(
				// 差額分の金額は値引品を考慮する必要なし（符号を考慮した金額から差額を計算しているので）
				row.trd_cur_tax_amt().multiply(-1)
			);
			list.add(row);
		}
		
		MCGroupByPolicy policy = new MCGroupByPolicy(
				MST_AP_D_R.$bsppl_cd,
				MST_AP_D_R.$trd_cur_cd);
		
		policy.sum(MST_AP_D_R.$trd_cur_tax_amt);
		MCList<MST_AP_D_R> apdGrpL = list.groupBy(policy);
		
		MSBGL_CredService.Cred_Upd02 ope = MSBGL_CredService.crtCred_Upd02();
		
		Cred_Upd02_CndR cndR = null;
		
		for (MST_AP_D_R apDR : apdGrpL) {
			
			cndR = Cred_Upd02_CndR.create();
			
			cndR.bsppl_cd(apDR.bsppl_cd());
			cndR.cur_cd(apDR.trd_cur_cd());
			cndR.amt(apDR.trd_cur_tax_amt());
			ope.up0().add(cndR);
		}
		
		if (!ope.up0().isEmpty()) {
			ope.exec();
		}
	}
	
	/**
	 * 受払実績サービスの受払実績WK作成を実行する。
	 * @param taxDiffPayClApDL 支払時税差額の買掛明細リスト
	 */
	protected void callIoActServiceIns01(MCList<MST_AP_D_R> taxDiffPayClApDL) {
		
		if (isNull(taxDiffPayClApDL)) {
			return;
		}
		
		MCList<MST_PURC_ACT_R> purcActL = getPurcActL(taxDiffPayClApDL);
		MCList<MST_PURC_ACT_D_R> purcActDL = getPurcActDL(taxDiffPayClApDL);
		
		MCIndexKey purcActIdxkey = purcActL.createIndex(MST_PURC_ACT_R.$purc_act_no, MST_PURC_ACT_R.$purc_act_seq);
		MCIndexKey purcActDIdxkey = purcActDL.createIndex(MST_PURC_ACT_D_R.$purc_act_d_no, MST_PURC_ACT_D_R.$purc_act_d_seq);
		
		MSBEL_IoActService.IoAct_Ins01 ope = MSBEL_IoActService.crtIoAct_Ins01();
		
		IoAct_Ins01_DtlR dtlR = null;
		
		// 受払実績の取消は無効伝票の買掛明細ＮＯを使用するので、取消伝票は除外する
		for (MST_AP_D_R apDR : taxDiffPayClApDL.subList(r -> !MAC_SLIP_STS_TYP.isCAN(r.slip_sts_typ()))) {
			MST_PURC_ACT_R purcActR = purcActL.getFirst(purcActIdxkey, apDR.purc_act_no(), apDR.purc_act_seq());
			MST_PURC_ACT_D_R purcActDR = purcActDL.getFirst(purcActDIdxkey, apDR.purc_act_d_no(), apDR.purc_act_d_seq());
			
			dtlR = IoAct_Ins01_DtlR.create();
			
			dtlR.act_no(apDR.ap_d_no());
			dtlR.act_seq(1);
			dtlR.act_rev_no(1);
			dtlR.act_d_no(MAC_STR.NULL_VAL.value());
			dtlR.act_d_seq(1);
			dtlR.trd_cd(purcActR.trd_cd());
			dtlR.trd_ptn_typ(purcActR.trd_ptn_typ());
			dtlR.trn_typ(MSC_TRN_TYP.PAY_SCHD.value());

			if (MAC_SLIP_STS_TYP.isDIS(apDR.slip_sts_typ())) {
				// 取消は無効伝票（の買掛明細ＮＯ）を使用する
				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dtlR.can_ac_dt(getAcDt(apDR.ac_dt(), true));
			}
			else if (MAC_SLIP_STS_TYP.isCRT(apDR.slip_sts_typ())) {

				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dtlR.ac_dt(apDR.ac_dt());
				dtlR.act_tm(apDR.act_dt());
				dtlR.rsn_cd(purcActDR.rsn_cd());
				dtlR.purc_dpt_cd(getDptCd(purcActR.purc_dpt_cd(), dtlR.ac_dt()));
				dtlR.ap_dpt_cd(getDptCd(purcActDR.ap_dpt_cd(), dtlR.ac_dt()));
				dtlR.bd_dpt_cd(getDptCd(purcActDR.bd_dpt_cd(), dtlR.ac_dt()));
				dtlR.purc_usr_cd(purcActR.purc_usr_cd());
				dtlR.itm_cd(purcActDR.itm_cd());
				dtlR.itm_sub1(purcActDR.itm_sub1());
				dtlR.itm_sub2(purcActDR.itm_sub2());
				dtlR.itm_sub3(purcActDR.itm_sub3());
				dtlR.itm_nm(purcActDR.itm_nm());
				dtlR.stk_mng_typ(purcActDR.stk_mng_typ());
				dtlR.sundry_itm_flg(purcActDR.sundry_itm_flg());
				dtlR.lot_no(purcActDR.lot_no());
				dtlR.sublot_no(purcActDR.sublot_no());
				dtlR.sno1(purcActDR.sno1());
				dtlR.sno2(purcActDR.sno2());
				dtlR.sno3(purcActDR.sno3());
				dtlR.sno4(purcActDR.sno4());
				dtlR.sno1_mng_typ(purcActDR.sno1_mng_typ());
				dtlR.sno2_mng_typ(purcActDR.sno2_mng_typ());
				dtlR.sno3_mng_typ(purcActDR.sno3_mng_typ());
				dtlR.sno4_mng_typ(purcActDR.sno4_mng_typ());
				dtlR.quality_typ(purcActDR.quality_typ());
				dtlR.stk_insp_typ(purcActDR.stk_insp_typ());
				dtlR.stk_id_typ(purcActDR.stk_id_typ());
				dtlR.trd_unit_qty(0);
				dtlR.trd_unit_cd(purcActDR.trd_unit_cd());
				dtlR.pack_unit_qty(0);
				dtlR.pack_unit_cd(purcActDR.base_unit_cd());
				dtlR.base_unit_qty(0);
				dtlR.base_unit_cd(purcActDR.base_unit_cd());
				dtlR.tax_cd(purcActDR.tax_cd());
				dtlR.xrate_cd(purcActR.xrate_cd());
				dtlR.xrate(purcActR.xrate());
				dtlR.ptax_xrate_cd(purcActR.xrate_cd());
				dtlR.ptax_xrate(purcActR.ptax_xrate());
				dtlR.trd_cur_cd(purcActR.trd_cur_cd());
				dtlR.base_cur_cd(purcActR.base_cur_cd());
				dtlR.ptax_cur_cd(purcActR.ptax_cur_cd());

				MAM_ITM_R itmR = MSBHL_PaySchdRegService.getItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
				MCNumber pm = getAmtDispPm(dtlR.trd_ptn_typ(), itmR.dscnt_itm_flg());
				if (!isNull(apDR.trd_cur_tax_amt())) {
					dtlR.trd_cur_tax_amt(apDR.trd_cur_tax_amt().multiply(pm));
				}
				if (!isNull(apDR.base_cur_tax_amt())) {
					dtlR.base_cur_tax_amt(apDR.base_cur_tax_amt().multiply(pm));
				}

				if (!isNull(dtlR.ptax_cur_cd()) && !isNull(dtlR.ptax_xrate())) {
					dtlR.ptax_cur_tax_amt(getPtaxCurTaxAmt(dtlR.trd_cur_tax_amt(), dtlR.ptax_xrate()));
				}
				else {
					dtlR.ptax_cur_tax_amt(null);
				}
				dtlR.slo_no(purcActDR.slo_no());
				dtlR.po_no(purcActR.po_no());
				dtlR.rcpt_iv_no(purcActR.rcpt_iv_no());
				dtlR.bd_ctg_cd(purcActDR.bd_ctg_cd());
				dtlR.bd_bp_cd(purcActDR.bd_bp_cd());
				dtlR.bd_oper_cd(purcActDR.bd_oper_cd());
				dtlR.bd_loc_cd(purcActDR.bd_loc_cd());
				dtlR.bd_slo_no(purcActDR.bd_slo_no());
				dtlR.bd_po_no(purcActDR.bd_po_no());
				dtlR.bd_iv_no(purcActDR.bd_iv_no());
				if (!isNull(dtlR.bd_dpt_cd())) {
					MAM_DPT_R dptR = getDpt(dtlR.bd_dpt_cd(), dtlR.ac_dt());
					dtlR.bd_wg_cd(dptR.wg_cd());
				}
				dtlR.asppl_cd(purcActR.asppl_cd());
				dtlR.sppl_cd(purcActR.sppl_cd());
				dtlR.sppl_itm_cd(purcActDR.sppl_itm_cd());
				dtlR.sppl_itm_nm(purcActDR.sppl_itm_nm());
				dtlR.purc_typ(purcActDR.purc_typ());
				dtlR.purc_id_typ(purcActDR.purc_id_typ());
				dtlR.accpt_dfct_flg(purcActDR.accpt_dfct_flg());
				dtlR.trd_rmrks(purcActR.trd_rmrks());
				dtlR.trd_d_rmrks(purcActDR.trd_d_rmrks());
				
				if (MAC_TRD_PTN_TYP.isPURC_RTN(dtlR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_RTN_XPNS(dtlR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_VMI(dtlR.trd_ptn_typ())) {
					dtlR.gi_wg_cd(purcActDR.in_to_loc_wg_cd());
					dtlR.gi_loc_cd(purcActDR.in_to_loc_cd());
					dtlR.gi_str_ln_cd(purcActDR.str_ln_cd());
					dtlR.gi_gd_cd(purcActDR.gd_cd());
				}
				else if (MAC_TRD_PTN_TYP.isPURC(dtlR.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPURC_XPNS(dtlR.trd_ptn_typ())) {
					dtlR.gr_wg_cd(purcActDR.in_to_loc_wg_cd());
					dtlR.gr_loc_cd(purcActDR.in_to_loc_cd());
					dtlR.gr_str_ln_cd(purcActDR.str_ln_cd());
					dtlR.gr_gd_cd(purcActDR.gd_cd());
				}
			}
			
			ope.up0().add(dtlR);
		}
		
		if (!ope.up0().isEmpty()) {
			ope.exec();
		}
	}
	
	/**
	 * 受払実績サービスの受払実績更新を実行する。
	 * @param taxDiffPayClApDL 支払時税差額の買掛明細リスト
	 */
	protected void callIoActServiceUpd01(MCList<MST_AP_D_R> taxDiffPayClApDL) {
		if (isNull(taxDiffPayClApDL)) {
			return;
		}
		
		MSBEL_IoActService.IoAct_Upd01 ope = MSBEL_IoActService.crtIoAct_Upd01();
		ope.exec();
	}

	/**
	 * 計上日を取得する
	 * 
	 * @param baseDt 基準日（計上日を設定する。nullの場合は運用日付とみなす）
	 * @param noMsg 締チェックでメッセージを取得するか（true の場合、締チェックでエラーの場合は運用日付を返す。false の場合はnullを返す）
	 */
	protected Map<MCDate, MCDate> _acDtMap = new HashMap<>();
	protected static MCDate getAcDt(MCDate baseDt, boolean noMsg) {
		return object(CLAZZ)._getAcDt(baseDt, noMsg);
	}
	protected MCDate _getAcDt(MCDate baseDt, boolean noMsg) {
	
		if (!_acDtMap.containsKey(baseDt)) {
			MCDate acDt = nvl(baseDt, getToday());
	
			// 計上日の締チェックを行い、締まっている場合、運用日付を計上日とする
			// 締まっていない場合、引数の日付を計上日とする
			// 運用日を計上日とする場合、運用日の締チェックを行い、締っている場合エラーとする
			MSBIL_ClService.Cl_Chk03 op = MSBIL_ClService.crtCl_Chk03();
			Cl_Chk03_CndR cndR = Cl_Chk03_CndR.create();
			cndR.ac_dt(acDt);
			cndR.pay_cls_chk_flg(true);
			op.up0().add(cndR);
			op.up1().no_msg_flg(true);
			op.exec();
	
			if (op.down0().get(0).err_flg()) {
				_acDtMap.put(baseDt, null);
			}
			// 締まっていない場合、引数の基準日が計上日
			else {
				// ただし基準日が運用日付よりも後の場合、運用日付を計上日とする
				if (getToday().lt(acDt)) {
					_acDtMap.put(baseDt, getToday());
				}
				else {
					_acDtMap.put(baseDt, acDt);
				}
			}
		}
		
		MCDate acDt = _acDtMap.get(baseDt);
		if (noMsg) {
			return isNull(acDt) ? getToday() : acDt;
		}
		return acDt;
	}

	/**
	 * 買掛明細を設定する
	 * @param up1L 上り電文の買掛明細リスト
	 * @param apDL 買掛明細リスト
	 */
	protected void setApDL(MCList<PaySchd_DtlApdR> up1L, MCList<MST_AP_D_R> apDL) {
		MCIndexKey idx = apDL.createIndex(MST_AP_D_R.$ap_d_no);
		
		// Ins01または Upd01 の上り電文の項目
		String[] upCols = {
			MST_AP_D_R.$pay_schd_d_print_rmrks,
			MST_AP_D_R.$pay_ntc_d_print_rmrks,
			MST_AP_D_R.$intr_rmrks,
			MST_AP_D_R.$sub_char1,
			MST_AP_D_R.$sub_char2,
			MST_AP_D_R.$sub_char3
		};
		for (PaySchd_DtlApdR r : up1L) {
			MST_AP_D_R apdR = apDL.getFirst(idx, r.ap_d_no());
			if (!isNull(apdR)) {		// 消費税差額分でnullあり
				apdR.setValuesByName(r.ap_d(), upCols);
				r.ap_d(apdR);
			}
		}
	}
	
	/**
	 * 買掛明細登録サービスを実行し、繰越取消を行う。
	 * @param upApDL 上り電文の買掛明細リスト
	 * @param apDL 買掛明細リスト
	 */
	protected void callApDtlRegServiceDel(MCList<PaySchd_DtlApdR> upApDL, MCList<MST_AP_D_R> apDL) {

		MSBHL_ApDtlRegService.ApDtl_Del01 ope = MSBHL_ApDtlRegService.crtApDtl_Del01();
		
		ApDtl_Del01_DtlR upR = null;
		
		for (PaySchd_DtlApdR apDR : upApDL) {
			
			if (isNull(apDR.co_src_ap_d_no())) {
				continue;
			}
			
			if (apDR.co_del_tgt_flg()) {
				
				upR = ApDtl_Del01_DtlR.create();
				
				upR.peg_no(apDR.peg_no());
				upR.ap_d_no(apDR.co_src_ap_d_no());
				
				ope.up0().add(upR);
			}
		}
		
		if (!ope.up0().isEmpty()) {
			ope.exec();
		}
	}
	
	/**
	 * 買掛明細登録サービスを実行し、繰越処理を行う。
	 * @param upApDL 上り電文の買掛明細リスト
	 * @param apDL 買掛明細リスト（訂正の場合のみ設定する）
	 */
	protected void callApDtlRegServiceUpd(MCList<PaySchd_HdrR> upPayChkL, MCList<PaySchd_DtlApdR> upApDL, MCList<MST_AP_D_R> apDL) {
		
		MSBHL_ApDtlRegService.ApDtl_Upd02 ope = MSBHL_ApDtlRegService.crtApDtl_Upd02();
		
		ApDtl_Upd02_DtlR upR = null;
		
		MCIndexKey idx = upPayChkL.createIndex(PaySchd_HdrR.$hdr_peg_no);
		
		for (PaySchd_DtlApdR apDR : upApDL) {
			
			if (apDR.co_tgt_flg()) {
				PaySchd_HdrR upPayChkR = upPayChkL.getFirst(idx, apDR.hdr_peg_no());
				
				upR = ApDtl_Upd02_DtlR.create();
				
				upR.peg_no(apDR.peg_no());
				
				upR.crryovr_src_ap_d_no(apDR.ap_d_no());
				upR.pay_mtd_typ(apDR.pay_mtd_typ());
				upR.pay_crryovr_times(apDR.pay_crryovr_times());
				upR.co_bsppl_cl_day(apDR.co_psppl_cl_day());
				upR.co_bsppl_cl_dt(apDR.co_psppl_cl_dt());
				if (upPayChkR.pay_spot_flg()) {
					upR.co_bsppl_dpt_cd(apDR.ap_d().bsppl_dpt_cd());
				}
				else {
					upR.co_bsppl_dpt_cd(getBspplDptCd(upPayChkR.bsppl_cd(), apDR.co_psppl_cl_dt()));
				}
				upR.pay_amt(apDR.pay_amt());
				upR.pay_tax_amt(apDR.pay_tax_amt());
				upR.pay_wtax_amt(apDR.pay_wtax_amt());
				upR.pay_chk_no(apDR.pay_chk_no());
				upR.pay_chk_mng_no(apDR.pay_chk_mng_no());
				upR.pay_proc_amt(apDR.pay_proc_amt());
				upR.pay_onr_prov_amt(apDR.pay_onr_prov_amt());
				
				ope.up0().add(upR);
			}
		}
		
		if (!ope.up0().isEmpty()) {
			ope.exec();
			
			copyByPegNo(upApDL, ope.down0(),
				PaySchd_DtlApdR.$peg_no, new String[]{PaySchd_DtlApdR.$pay_ap_d_no},
				ApDtl_Upd02_DtlR.$peg_no, new String[]{ApDtl_Upd02_DtlR.$pay_ap_d_no});
			
		}
	}
	
	/**
	 *  支払照合ヘッダの金額を計算する。
	 * @param upPayChkL 上り電文の支払照合ヘッダリスト
	 * @param upApDL 上り電文の買掛明細リスト
	 * @param apDIdxkey 買掛明細のインデックスキー
	 * @param upPaySchdL 上り電文の支払予定リスト
	 * @param paySchdIdxkey 支払予定のインデックスキー
	 * @param upPayActL 上り電文の支払実績リスト
	 * @param upAdvPayActL 上り電文の前渡金実績リスト
	 * @param apDL 買掛明細リスト
	 */
	protected void calcPayChkAmtCommon(MCList<PaySchd_HdrR> upPayChkL, 
			MCList<PaySchd_DtlApdR> upApDL, MCIndexKey apDIdxkey,
			MCList<PaySchd_DtlSchdR> upPaySchdL, MCIndexKey paySchdIdxkey,
			MCList<PaySchd_DtlActR> upPayActL, MCList<PaySchd_AdvPayActR> upAdvPayActL,
			MCList<MST_AP_D_R> apDL) {
		
		MCList<PaySchd_Srch02_RsltR> srch02L = callPaySchdRegServiceSrch02(upPayChkL, upApDL, apDL);
		MCIndexKey srch02Idx = srch02L.createIndex(PaySchd_Srch02_RsltR.$hdr_peg_no);
		
		BiFunction<PaySchd_Srch02_RsltR, String, MCNumber> amt = (r, col) -> {
			if (isNull(r)) {
				return MCNumber.ZERO;
			}
			return nvl(r.getNumber(col), MCNumber.ZERO);
		};
		
		for (PaySchd_HdrR upPayChkR : upPayChkL) {
			
			if (isUpd(upPayChkR) && justUpdRmrks(upPayChkR.pay_chk_mng_no())) {
				MST_PAY_CHK_R payChkR = getCachePayChkR(upPayChkR.pay_chk_mng_no());
				upPayChkR.pay_chk().amt(payChkR.amt());
				upPayChkR.pay_chk().com_paid(payChkR.com_paid());
				upPayChkR.pay_chk().com_paid_tax_amt(payChkR.com_paid_tax_amt());
			}
			else {
				MCList<PaySchd_DtlSchdR> insUpdPaySchdL = upPaySchdL
					.subList(paySchdIdxkey, upPayChkR.hdr_peg_no()).subList(r->!isDel(r));
				if (insUpdPaySchdL.isEmpty()) {
					upPayChkR.pay_chk().amt(0);
					upPayChkR.pay_chk().com_paid(null);
					upPayChkR.pay_chk().com_paid_tax_amt(null);
				}
				else {
					upPayChkR.pay_chk().amt(
						insUpdPaySchdL
							.subList(r->!MAC_AP_STTL_TYP.is_com_paid(r.ap_sttl_typ()))
							.sum(PaySchd_DtlSchdR.$trd_cur_amt)
					);
					upPayChkR.pay_chk().com_paid(
						insUpdPaySchdL
							.subList(r->MAC_AP_STTL_TYP.is_com_paid(r.ap_sttl_typ()))
							.sum(PaySchd_DtlSchdR.$trd_cur_amt)
					);
					upPayChkR.pay_chk().com_paid_tax_amt(insUpdPaySchdL.sum(PaySchd_DtlSchdR.$trd_cur_com_paid_tax_amt));
				}
			}
			
			PaySchd_Srch02_RsltR srch02R = srch02L.getFirst(srch02Idx, upPayChkR.hdr_peg_no());
			upPayChkR.pay_chk().last_pay_schd_amt(amt.apply(srch02R, PaySchd_Srch02_RsltR.$last_pay_schd_amt));
			upPayChkR.pay_chk().bfw_amt(0);
			upPayChkR.pay_chk().purc_amt(amt.apply(srch02R, PaySchd_Srch02_RsltR.$purc_amt));
			upPayChkR.pay_chk().purc_ret_amt(amt.apply(srch02R, PaySchd_Srch02_RsltR.$purc_ret_amt));
			upPayChkR.pay_chk().purc_dscnt_amt(amt.apply(srch02R, PaySchd_Srch02_RsltR.$purc_dscnt_amt));
			upPayChkR.pay_chk().sw_to_amt(amt.apply(srch02R, PaySchd_Srch02_RsltR.$sw_to_amt));
			upPayChkR.pay_chk().tax_amt(amt.apply(srch02R, PaySchd_Srch02_RsltR.$tax_amt));
			upPayChkR.pay_chk().account_amt(0);
			upPayChkR.pay_chk().cash_amt(0);
			upPayChkR.pay_chk().note_amt(0);
			upPayChkR.pay_chk().setoff_amt(0);
			upPayChkR.pay_chk().setoff_tax_amt(0);
			upPayChkR.pay_chk().sw_amt(upPayChkR.pay_spot_flg() ? null : MCNumber.ZERO);
			upPayChkR.pay_chk().schd_pay_amt(0);
			upPayChkR.pay_chk().adv_pay_amt(0);
			upPayChkR.pay_chk().adv_pay_setoff_amt(0);
			upPayChkR.pay_chk().adv_pay_setoff_tax_amt(0);
			upPayChkR.pay_chk().adv_pay_bal(0);
		}
		
		MCList<PaySchd_Srch02_RsltR> srch06L = callPaySchdRegServiceSrch06(upPayChkL, upPayActL, upAdvPayActL);
		MCIndexKey srch06Idx = srch06L.createIndex(PaySchd_Srch02_RsltR.$hdr_peg_no);
		
		BiFunction<PaySchd_Srch02_RsltR, String, MCNumber> amt2 = (r, col) -> {
			if (!isNull(r)) {
				return r.getNumber(col);
			}
			return null;
		};
		for (PaySchd_HdrR upPayChkR : upPayChkL) {
			PaySchd_Srch02_RsltR srch06R = srch06L.getFirst(srch06Idx, upPayChkR.hdr_peg_no());
			upPayChkR.pay_chk().last_pay_schd_amt(amt2.apply(srch06R, PaySchd_Srch02_RsltR.$last_pay_schd_amt));
			upPayChkR.pay_chk().bfw_amt(amt2.apply(srch06R, PaySchd_Srch02_RsltR.$bfw_amt));
			upPayChkR.pay_chk().account_amt(amt2.apply(srch06R, PaySchd_Srch02_RsltR.$account_amt));
			upPayChkR.pay_chk().cash_amt(amt2.apply(srch06R, PaySchd_Srch02_RsltR.$cash_amt));
			upPayChkR.pay_chk().note_amt(amt2.apply(srch06R, PaySchd_Srch02_RsltR.$note_amt));
			upPayChkR.pay_chk().setoff_amt(amt2.apply(srch06R, PaySchd_Srch02_RsltR.$setoff_amt));
			upPayChkR.pay_chk().setoff_tax_amt(amt2.apply(srch06R, PaySchd_Srch02_RsltR.$setoff_tax_amt));
			upPayChkR.pay_chk().sw_amt(amt2.apply(srch06R, PaySchd_Srch02_RsltR.$sw_amt));
			upPayChkR.pay_chk().schd_pay_amt(amt.apply(srch06R, PaySchd_Srch02_RsltR.$schd_pay_amt));
			upPayChkR.pay_chk().adv_pay_amt(amt.apply(srch06R, PaySchd_Srch02_RsltR.$adv_pay_amt));
			upPayChkR.pay_chk().adv_pay_setoff_amt(amt.apply(srch06R, PaySchd_Srch02_RsltR.$adv_pay_setoff_amt));
			upPayChkR.pay_chk().adv_pay_setoff_tax_amt(amt.apply(srch06R, PaySchd_Srch02_RsltR.$adv_pay_setoff_tax_amt));
			upPayChkR.pay_chk().adv_pay_bal(amt2.apply(srch06R, PaySchd_Srch02_RsltR.$adv_pay_bal));
		}
	}
	
	/**
	 * 支払予定登録サービスの買掛明細まとめ、および今回支払額取得を実行し、金額を算出する。
	 * 
	 * @param upPayChkL 上り電文の支払照合ヘッダ
	 * @param upApDL 上り電文の買掛明細
	 * @param apDL 買掛明細リスト
	 */
	protected MCList<PaySchd_Srch02_RsltR> callPaySchdRegServiceSrch02(
		MCList<PaySchd_HdrR> upPayChkL, MCList<PaySchd_DtlApdR> upApDL, MCList<MST_AP_D_R> apDL) {
		
		MSBHL_PaySchdRegService.PaySchd_Srch02 srch02 = MSBHL_PaySchdRegService.crtPaySchd_Srch02();
		MCIndexKey 
			payChkIdx = upPayChkL.createIndex(PaySchd_HdrR.$hdr_peg_no),
			apDIdx = apDL.createIndex(MST_AP_D_R.$ap_d_no);
		
		for (PaySchd_DtlApdR upApDR : upApDL.subList(r->!isDel(r))) {
			PaySchd_HdrR upPayChkR = upPayChkL.getFirst(payChkIdx, upApDR.hdr_peg_no());
			
			MST_AP_D_R apDR = apDL.getFirst(apDIdx, upApDR.ap_d_no());
			if (isNull(apDR) && !isNull(upApDR.ref_ap_d_no())) {
				apDR = apDL.getFirst(apDIdx, upApDR.ref_ap_d_no());
			}
			if (!isNull(apDR)) {
				PaySchd_Srch02_CndR cndR = PaySchd_Srch02_CndR.create();
				cndR.peg_no(upApDR.peg_no());
				cndR.hdr_peg_no(upApDR.hdr_peg_no());
				// 繰越によって作成された買掛明細がある場合は作成されたNOを渡す
				cndR.ap_d_no(nvl(upApDR.pay_ap_d_no(), upApDR.ap_d_no()));
				cndR.sppl_cd(apDR.sppl_cd());
				cndR.bsppl_cd(apDR.bsppl_cd());
				cndR.bsppl_dpt_cd(upPayChkR.bsppl_dpt_cd());
				cndR.purc_act_no(apDR.purc_act_no());
				cndR.rcpt_iv_mng_no(apDR.rcpt_iv_mng_no());
				cndR.rcpt_iv_no(apDR.rcpt_iv_no());
				cndR.trd_cur_cd(apDR.trd_cur_cd());
				cndR.pay_schd_dt(apDR.pay_schd_dt());
				cndR.bsppl_cl_dt(upPayChkR.bsppl_cl_dt());
				cndR.bsppl_cl_day(upPayChkR.bsppl_cl_day());
				cndR.wrk_no(apDR.wrk_no());
				cndR.trd_ptn_typ(upApDR.trd_ptn_typ());
				cndR.itm_cd(apDR.itm_cd());
				cndR.itm_sub1(apDR.itm_sub1());
				cndR.itm_sub2(apDR.itm_sub2());
				cndR.itm_sub3(apDR.itm_sub3());
				cndR.trd_cur_amt(upApDR.pay_amt());
				cndR.trd_cur_tax_amt(upApDR.pay_tax_amt());
				cndR.pay_spot_flg(upPayChkR.pay_spot_flg());
				cndR.pay_chk_mng_no(isNull(upPayChkR.pay_chk_mng_no()) ? null : upPayChkR.pay_chk_mng_no());
				cndR.reg_dt(upPayChkR.reg_dt());
				
				srch02.up0().add(cndR);
			}
		}
		
		if (!srch02.up0().isEmpty()) {
			srch02.exec();
		}
		
		return srch02.down1();
	}

	/**
	 * 支払予定登録サービスの今回支払額取得を実行し、金額を算出する。
	 * 
	 * @param upPayChkL 上り電文の支払照合ヘッダ
	 * @param upPayActL 上り電文の支払実績明細リスト
	 * @param upAdvPayActL 上り電文の前渡金実績リスト
	 */
	protected MCList<PaySchd_Srch02_RsltR> callPaySchdRegServiceSrch06(
		MCList<PaySchd_HdrR> upPayChkL, MCList<PaySchd_DtlActR> upPayActL, MCList<PaySchd_AdvPayActR> upAdvPayActL) {
		
		MCIndexKey payChkIdx = upPayChkL.createIndex(PaySchd_HdrR.$hdr_peg_no);
		MCIndexKey payActIdx = upPayActL.createIndex(PaySchd_DtlActR.$hdr_peg_no);
		MCIndexKey advPayActIdx = upAdvPayActL.createIndex(PaySchd_AdvPayActR.$hdr_peg_no);
		
		MSBHL_PaySchdRegService.PaySchd_Srch06 srch06 = MSBHL_PaySchdRegService.crtPaySchd_Srch06();
		for (PaySchd_HdrR upPayChkR : upPayChkL) {
			PaySchd_Srch02_RsltR cndR = srch06.up0().add();
			cndR.hdr_peg_no(upPayChkR.hdr_peg_no());
			cndR.bsppl_cd(upPayChkR.bsppl_cd());
			cndR.bsppl_dpt_cd(upPayChkR.bsppl_dpt_cd());
			cndR.purc_act_no(upPayChkR.purc_act_no());
			cndR.rcpt_iv_mng_no(upPayChkR.rcpt_iv_mng_no());
			cndR.rcpt_iv_no(upPayChkR.rcpt_iv_no());
			cndR.trd_cur_cd(upPayChkR.trd_cur_cd());
			cndR.bsppl_cl_dt(upPayChkR.bsppl_cl_dt());
			cndR.bsppl_cl_day(upPayChkR.bsppl_cl_day());
			cndR.wrk_no(upPayChkR.wrk_no());
			cndR.pay_spot_flg(upPayChkR.pay_spot_flg());
			cndR.amt(upPayChkR.amt());
			cndR.purc_amt(upPayChkR.pay_chk().purc_amt());
			cndR.purc_ret_amt(upPayChkR.pay_chk().purc_ret_amt());
			cndR.purc_dscnt_amt(upPayChkR.pay_chk().purc_dscnt_amt());
			cndR.sw_to_amt(upPayChkR.pay_chk().sw_to_amt());
			cndR.tax_amt(upPayChkR.pay_chk().tax_amt());
			cndR.pay_chk_mng_no(isNull(upPayChkR.pay_chk_mng_no()) ? null : upPayChkR.pay_chk_mng_no());

			if (upPayChkR.pay_act_not_ref_flg()) {
				// 再取得しない場合は、NULL文字の行を追加したリストを設定することで呼出し先のPaySchd_Srch06で空振りさせる
				PaySchd_Srch02_PayActR r = srch06.up1().add();
				r.hdr_peg_no(upPayChkR.hdr_peg_no());
				r.pay_act_d_no(MAC_STR.NULL_VAL.value());
			}
			else {
				upPayActL.subList(payActIdx, upPayChkR.hdr_peg_no()).forEach(upPayActR -> {
					PaySchd_Srch02_PayActR r = srch06.up1().add();
					r.hdr_peg_no(upPayActR.hdr_peg_no());
					r.pay_act_d_no(upPayActR.pay_act_d_no());
					r.pay_act_d_seq(upPayActR.pay_act_d_seq());
				});
			}
			upAdvPayActL.subList(advPayActIdx, upPayChkR.hdr_peg_no()).forEach(upAdvPayActR -> {
				PaySchd_Srch02_AdvPayActR r = srch06.up2().add();
				r.hdr_peg_no(upAdvPayActR.hdr_peg_no());
				r.adv_pay_act_no(upAdvPayActR.adv_pay_act_no());
				r.adv_pay_act_seq(upAdvPayActR.adv_pay_act_seq());
			});
		}
		
		if (!srch06.up0().isEmpty()) {
			srch06.exec();
		}

		// upPayActL（＝上り電文のup3）を置き換える
		upPayActL.clear();
		for (PaySchd_Srch02_PayActR r : srch06.down1()) {
			PaySchd_DtlActR payActR = upPayActL.add();
			payActR.hdr_peg_no(r.hdr_peg_no());
			payActR.pay_act_d_no(r.pay_act_d_no());
			payActR.pay_act_d_seq(r.pay_act_d_seq());
			payActR.pay_chk_mng_no(r.pay_chk_mng_no());
			payActR.upd_cntr(r.upd_cntr());
			payActR.calc_tgt_pay_chk_mng_no(
				upPayChkL.getFirst(payChkIdx, r.hdr_peg_no()).pay_chk_mng_no());
		}
		// upAdvPayActL（＝上り電文のup4）を置き換える
		upAdvPayActL.clear();
		for (PaySchd_Srch02_AdvPayActR r : srch06.down2()) {
			PaySchd_AdvPayActR advPayActR = upAdvPayActL.add();
			advPayActR.hdr_peg_no(r.hdr_peg_no());
			advPayActR.adv_pay_act_no(r.adv_pay_act_no());
			advPayActR.adv_pay_act_seq(r.adv_pay_act_seq());
		}
		
		return srch06.down0();
	}
	
	/**
	 * 繰越元の買掛明細の買掛明細を取得する。
	 * @param apDL 買掛明細リスト
	 * @param apDIdx 買掛明細ＮＯに対するインデックス
	 * @param upApDR  上り電文の買掛明細
	 * @return 繰越元の買掛明細
	 */
	protected MST_AP_D_R getScrApDR(MCList<MST_AP_D_R> apDL, MCIndexKey apDIdx, PaySchd_DtlApdR upApDR) {
		
		return apDL.getFirst(apDIdx, upApDR.co_src_ap_d_no());
	}
	
	/**
	 * 訂正前の繰越分の買掛明細を取得する。
	 * @param apDL 買掛明細リスト
	 * @param coSrcApDIdx 繰越元買掛明細ＮＯに対するインデックス
	 * @param upApDR  上り電文の買掛明細
	 * @return 訂正前の繰越分の買掛明細
	 */
	protected MST_AP_D_R getCoApDR(MCList<MST_AP_D_R> apDL, MCIndexKey coSrcApDIdx, PaySchd_DtlApdR upApDR) {
		
		MCList<MST_AP_D_R> coApDL = apDL
			.subList(coSrcApDIdx, upApDR.co_src_ap_d_no())
			.subList(r ->r.crryovr_flg() && isNull(r.crryovr_ap_d_no()));
		
		if (!coApDL.isEmpty()) {
			return coApDL.get(0);
		}
		
		return null;
	}

	/**
	 * 繰越対象かを判定するフラグを設定する
	 * @param upApDL 上り電文の買掛明細リスト
	 * @param apDL 買掛明細リスト
	 */
	protected void setCrryovrTgtFlg(MCList<PaySchd_DtlApdR> upApDL, MCList<MST_AP_D_R> apDL) {
		
		MCIndexKey apDIdx = null, coSrcApDIdx = null;
		if (!isNull(apDL)) {
			apDIdx = apDL.createIndex(MST_AP_D_R.$ap_d_no);
			coSrcApDIdx = apDL.createIndex(MST_AP_D_R.$crryovr_src_ap_d_no);
		}
		
		for (PaySchd_DtlApdR upApDR : upApDL) {
		
			if (isCrt(upApDR)) {
				upApDR.co_tgt_flg(
					isCrryovrTgt(upApDR, null, null, null)
				);
				upApDR.co_del_tgt_flg(false);
			}
			else {
				MST_AP_D_R srcApDR = isNull(upApDR.co_src_ap_d_no()) ? null : getScrApDR(apDL, apDIdx, upApDR);
				MST_AP_D_R coApDR = isNull(upApDR.co_src_ap_d_no()) ? null : getCoApDR(apDL, coSrcApDIdx, upApDR);
				MST_AP_D_R payApdR = upApDR.ap_d();

				upApDR.co_tgt_flg(
					isCrryovrTgt(upApDR, srcApDR, coApDR, payApdR)
				);
				upApDR.co_del_tgt_flg(
					isCrryovrDelTgt(upApDR, srcApDR, coApDR, payApdR)
				);
			}
		
		}
	}
	
	/**
	 * 指定された買掛明細情報を基づき、繰越の対象かを評価する。
	 * @param upApDR 上り電文の買掛明細
	 * @param srcApDR 繰越元の買掛明細（更新、削除の場合のみ設定）
	 * @param coApDR 訂正前の繰越分の買掛明細（更新、削除の場合のみ設定）
	 * @param payApdR 訂正前の支払の買掛明細（更新、削除の場合のみ設定）
	 * @return 繰越対象の場合はtrue
	 */
	protected boolean isCrryovrTgt(PaySchd_DtlApdR upApDR, MST_AP_D_R srcApDR, MST_AP_D_R coApDR, MST_AP_D_R payApdR) {
		
		if (isDel(upApDR)) {
			return false;
		}
		
		if (MSC_PAY_MTD_TYP.isPART_PAY(upApDR.pay_mtd_typ()) 
				|| MSC_PAY_MTD_TYP.isALL_CO(upApDR.pay_mtd_typ())) {
			
			if (isCrt(upApDR)) {
				return true;
			}
			
			if (isUpd(upApDR) 
					&& (!isSame(payApdR.trd_cur_amt(), upApDR.pay_amt())
						|| !isSame(payApdR.trd_cur_tax_amt(), upApDR.pay_tax_amt())
						|| !isSame(coApDR.pay_crryovr_times().subtract(nvl(srcApDR.pay_crryovr_times(), MCNumber.ZERO)), upApDR.pay_crryovr_times())
						|| !isSame(coApDR.bsppl_cl_dt(), upApDR.co_psppl_cl_dt()))) {
				// 今回支払金額、今回支払税額、今回繰越回数、繰越後締年月日のいずれかが変更された場合、繰越処理を行う
				return true;
			}
		}
		
		return false;
	}
	protected boolean isCrryovrDelTgt(PaySchd_DtlApdR upApDR, MST_AP_D_R srcApDR, MST_AP_D_R coApDR, MST_AP_D_R payApdR) {
		if (isNull(srcApDR)) {
			return false;
		}
		if (isUpd(upApDR)) {
			if (isSame(payApdR.trd_cur_amt(), upApDR.pay_amt())
				&& isSame(payApdR.trd_cur_tax_amt(), upApDR.pay_tax_amt())
				&& isSame(coApDR.pay_crryovr_times().subtract(nvl(srcApDR.pay_crryovr_times(), MCNumber.ZERO)), upApDR.pay_crryovr_times())
				&& isSame(coApDR.bsppl_cl_dt(), upApDR.co_psppl_cl_dt())) {
				// 今回支払金額、今回支払税額、今回繰越回数、繰越後締年月日のいずれかも変更されていない場合、繰越分は削除しない
				return false;
			}
		}
		return MSC_PAY_MTD_TYP.isPART_PAY(payApdR.pay_mtd_typ()) 
				|| MSC_PAY_MTD_TYP.isALL_CO(payApdR.pay_mtd_typ());
	}
	
	
	/**
	 * 承認提供サービスの承認情報削除を実行する。
	 * @param upPayChkL 上り電文の支払照合ヘッダリスト
	 * @param payChkL 支払照合ヘッダリスト
	 */
	protected void callAprvServiceDel(MCList<PaySchd_HdrR> upPayChkL, MCList<MST_PAY_CHK_R> payChkL) {
		
		MBBAL_AprvService.Aprv_Del01 ope = MBBAL_AprvService.crtAprv_Del01();
		Aprv_Chk04_Rslt1R upR = null;
		
		for (PaySchd_HdrR upPayChkR : upPayChkL) {
			
			if (isUpd(upPayChkR) && justUpdRmrks(upPayChkR.pay_chk_mng_no())) {
				continue;
			}
			
			MST_PAY_CHK_R payChkR = payChkL.getFirst(MST_PAY_CHK_R.$pay_chk_mng_no, upPayChkR.pay_chk_mng_no());
			
			if (!isNull(payChkR) && payChkR.aprv_flg()) {
				
				upR = Aprv_Chk04_Rslt1R.create();
				
				upR.peg_no(upPayChkR.hdr_peg_no());
				upR.aprv_no(payChkR.aprv_no());
				upR.setAttributes(upPayChkR);
				ope.up0().add(upR);
			}
		}
		
		if (!ope.up0().isEmpty()) {
			ope.exec();
			
			payChkL.clear(MST_PAY_CHK_R.$aprv_no, MST_PAY_CHK_R.$aprv_sts_typ, MST_PAY_CHK_R.$aprv_flg);
		}
	}
	
	/**
	 * 承認引き戻しか
	 * @param upPayChkR 上り電文の支払照合ヘッダ
	 * @return true 承認引き戻し
	 */
	protected boolean isAprvRvrs(PaySchd_HdrR upPayChkR) {
		if (isCrt(upPayChkR)) {
			return false;
		}
		MST_PAY_CHK_R payChkR = getCachePayChkR(upPayChkR.pay_chk_mng_no());
		if ( !(MAC_APRV_STS_TYP.isACPT(payChkR.aprv_sts_typ())
			|| MAC_APRV_STS_TYP.isFIX(payChkR.aprv_sts_typ())) ) {
			return false;
		}
		return upPayChkR.aprv_rvrs_flg();
	}
	
	/**
	 * 承認提供サービスの承認情報削除を実行する。
	 * @param upPayChkL 上り電文の支払照合ヘッダリスト
	 * @param upPaySchdL 上り電文の支払予定リスト
	 * @param paySchdIdxkey 支払予定のインデックスキー
	 */
	protected void callAprvServiceUpd(
		MCList<PaySchd_HdrR> upPayChkL, MCList<PaySchd_DtlSchdR> upPaySchdL, MCIndexKey paySchdIdxkey) {
		
		MBBAL_AprvService.Aprv_Upd01 ope = MBBAL_AprvService.crtAprv_Upd01();
		Aprv_Chk01_Rslt1R upR = null;
		
		for (PaySchd_HdrR upPayChkR : upPayChkL) {
			MCList<PaySchd_DtlSchdR> paySchdL =
				upPaySchdL
				 .subList(paySchdIdxkey, upPayChkR.hdr_peg_no())
				 .subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			
			if (isUpd(upPayChkR)) {
				MST_PAY_CHK_R payChkR = getCachePayChkR(upPayChkR.pay_chk_mng_no());
				// 以下のいずれかに該当する場合は、承認提供サービスを実行しない
				// ・一次承認済、最終承認済
				// ・承認済み、かつ支払実績登録による実績あり
				// ただし一次承認済、もしくは最終承認済であっても承認引き戻しの場合は実行する
				if ((MAC_APRV_STS_TYP.isACPT(payChkR.aprv_sts_typ()) || MAC_APRV_STS_TYP.isFIX(payChkR.aprv_sts_typ())) && !isAprvRvrs(upPayChkR)
				 || payChkR.aprv_flg() && existsPayActD(paySchdL)) {
					// 承認提供サービスを実行しないことで承認情報がクリアされないように補完する
					upPayChkR.aprv_flg(payChkR.aprv_flg());
					upPayChkR.aprv_no(payChkR.aprv_no());
					upPayChkR.aprv_sts_typ(payChkR.aprv_sts_typ());
					continue;
				}
			}
			upR = Aprv_Chk01_Rslt1R.create();
			
			upR.peg_no(upPayChkR.hdr_peg_no());
			upR.biz_usr_cd(upPayChkR.bsppl_usr_cd());
			upR.master_dt(upPayChkR.reg_dt());
			upR.aprv_func_typ(MAC_APRV_FUNC_TYP.PAY_SCHD.value());
			upR.src_dpt_cd(upPayChkR.bsppl_dpt_cd());
			upR.src_bp_cd(upPayChkR.bsppl_cd());
			upR.src_cur_cd1(upPayChkR.trd_cur_cd());
			upR.src_amt1(getAprvAmt(paySchdL));
			upR.aprv_src_no1(upPayChkR.pay_chk_no());
			upR.aprv_src_no2(upPayChkR.pay_chk_mng_no());
			if (isUpd(upPayChkR)) {
				upR.aprv_no(getCachePayChkR(upPayChkR.pay_chk_mng_no()).aprv_no());
			}
			
			upR.setAttributes(upPayChkR);
			ope.up0().add(upR);
		}
		
		if (!ope.up0().isEmpty()) {
			ope.exec();
			
			copyByPegNo(
					upPayChkL,
					ope.down0(),
					PaySchd_HdrR.$hdr_peg_no,
					new String[] {PaySchd_HdrR.$aprv_flg, PaySchd_HdrR.$aprv_no},
					Aprv_Upd01_Dtl1R.$peg_no,
					new String[] {Aprv_Upd01_Dtl1R.$aprv_flg, Aprv_Upd01_Dtl1R.$aprv_no});
			chkAprv(upPayChkL, upPaySchdL, paySchdIdxkey);
		}
	}
	
	/**
	 * 次処理済のものが新たに承認対象となっていないか判定する
	 * 
	 */
	protected void chkAprv(MCList<PaySchd_HdrR> upPayChkL, MCList<PaySchd_DtlSchdR> upPaySchdL, MCIndexKey paySchdIdxkey) {
		for (PaySchd_HdrR upPayChkR : upPayChkL) {
			MST_PAY_CHK_R payChkR = getCachePayChkR(upPayChkR.pay_chk_mng_no());
			if (upPayChkR.aprv_flg()
				&& !isNull(payChkR)
				&& isNull(payChkR.aprv_sts_typ())
				&& existsPayActD(upPaySchdL.subList(paySchdIdxkey, upPayChkR.hdr_peg_no()))) {
				throw new MCAppException(upPayChkR, null, MSBHL0052, upPayChkR.pay_chk_no(), toDispGUIIndex(upPayChkR));
			}
		}
	}

	/**
	 * 承認対象の金額を取得する
	 * @param upPaySchdL 上り電文の支払予定リスト
	 * @return 承認対象の金額
	 */
	protected MCNumber getAprvAmt(MCList<PaySchd_DtlSchdR> upPaySchdL) {
		Predicate<PaySchd_DtlSchdR> isAprvAmt = (r) -> {
			// 現金、現金（手数料）、預金、預金（手数料）、手形の5種が承認対象
			return
				MAC_AP_STTL_TYP.isCASH(r.ap_sttl_typ())
				 || MAC_AP_STTL_TYP.isCASH_COM_PAID(r.ap_sttl_typ())
				 || MAC_AP_STTL_TYP.isACNT(r.ap_sttl_typ())
				 || MAC_AP_STTL_TYP.isACNT_COM_PAID(r.ap_sttl_typ())
				 || MAC_AP_STTL_TYP.isNOTE(r.ap_sttl_typ());
		}; 
		
		MCList<PaySchd_DtlSchdR> list = upPaySchdL
			.subList(r -> !isDel(r))
			.subList(r -> isAprvAmt.test(r));
		return nvl(list.sum(PaySchd_DtlSchdR.$trd_cur_amt), MCNumber.ZERO);
	}

	/**
	 * 支払実績サービス（登録・更新）を実行する
	 */
	protected MCList<PaySchd_DtlActR> callPayActServiceInsUpd() {

		MCList<PaySchd_DtlActR> payActL = MCList.create(PaySchd_DtlActR.class);

		MSBHL_PayActRegService.PayAct_Chk01 chk = getPayActChk01();
		if (chk.up0().isEmpty()) {
			return payActL;
		}
		int msgCnt = MCMessagePool.getMessageList().size();

		chk.exec();
		if (MCMessagePool.getMessageList().size() > msgCnt) {
			throwUpdErr();
		}

		MSBHL_PayActRegService.PayAct_Upd01 upd = MSBHL_PayActRegService.crtPayAct_Upd01();
		upd.up0().setAll(chk.down0());
		upd.up1().setAll(chk.down1());
		upd.exec();
		
		// 登録された支払実績明細を取得する
		upd.down1().forEach(r -> {
			PaySchd_DtlActR payActR = payActL.add();
			payActR.hdr_peg_no(_payActHdrPegNoMap.get(r.hdr_peg_no()));
			payActR.pay_act_d_no(r.pay_act_d_no());
			payActR.pay_act_d_seq(r.pay_act_d_seq());
		});
		
		return payActL;
	}

	/**
	 * 支払予定のhdr_peg_noと支払実績のhdr_peg_noの紐付けを管理する
	 */
	protected Map<MCNumber, MCNumber> _payActHdrPegNoMap = new HashMap<>();

	/**
	 * 支払実績サービスの登録・更新用の電文を設定する
	 * @param upPayChkL 支払照合ヘッダリスト
	 * @param upPaySchdL 支払予定リスト
	 * @param apApplSchdL 買掛消込予定リスト
	 */
	protected void setPayActChk01InsUpd(
			MCList<PaySchd_HdrR> upPayChkL, MCList<PaySchd_DtlSchdR> upPaySchdL,
			MCList<MST_AP_APPL_SCHD_R> apApplSchdL) {
		
		setPayActChk01Common(
			upPayChkL.subList(r -> !isDel(r)),
			upPaySchdL.subList(r -> !isDel(r)),
			apApplSchdL);
	}

	/**
	 * 支払実績サービスの更新前チェックオペレーションを生成する<br>
	 */
	protected MSBHL_PayActRegService.PayAct_Chk01 _payActChk01;
	protected static MSBHL_PayActRegService.PayAct_Chk01 crtPayActChk01() {
		object(CLAZZ)._payActChk01 = MSBHL_PayActRegService.crtPayAct_Chk01();
		return object(CLAZZ)._payActChk01;
	}

	/**
	 * 支払実績サービスの更新前チェックオペレーションを取得する<br>
	 */
	protected static MSBHL_PayActRegService.PayAct_Chk01 getPayActChk01() {
		return object(CLAZZ)._payActChk01;
	}

	/**
	 * 支払実績サービス（削除）を実行する
	 */
	protected void callPayActServiceDel() {
		MSBHL_PayActRegService.PayAct_Chk01 chk = getPayActChk01();
		if (chk == null || chk.up0().isEmpty()) {
			return;
		}

		MSBHL_PayActRegService.PayAct_Upd01 upd = MSBHL_PayActRegService.crtPayAct_Upd01();
		upd.up0().setAll(getChkList(chk.down0()));
		upd.up1().setAll(getChkList(chk.down1()));
		upd.exec();
	}

	/**
	 * 支払実績サービスの取消用の電文を設定する
	 * @param upPayChkL 支払照合ヘッダリスト
	 * @param upPaySchdL 支払予定リスト
	 */
	protected void setPayActChk01Del(
			MCList<PaySchd_HdrR> upPayChkL, MCList<PaySchd_DtlSchdR> upPaySchdL) {
		
		setPayActChk01Common(
			upPayChkL.subList(r -> !isCrt(r)),
			upPaySchdL.subList(r -> isDel(r)),
			MCList.create(MST_AP_APPL_SCHD_R.class));
	}

	/**
	 * 支払実績サービスの電文を設定する
	 * @param upPayChkL 支払照合ヘッダリスト
	 * @param upPaySchdL 支払予定リスト
	 * @param apApplSchdL 買掛消込予定リスト
	 */
	protected void setPayActChk01Common(
			MCList<PaySchd_HdrR> upPayChkL, MCList<PaySchd_DtlSchdR> upPaySchdL,
			MCList<MST_AP_APPL_SCHD_R> apApplSchdL) {

		// 相殺実績作成済みの支払実績リスト
		MCList<MST_PAY_ACT_D_R> payActDL = MCList.create(MST_PAY_ACT_D_R.class);
		for (PaySchd_HdrR upPayChkR : upPayChkL) {
			MCList<MST_PAY_SCHD_R> paySchdL = getCachePaySchdL(upPayChkR.pay_chk_mng_no());
			if (!isNull(paySchdL)) {
				for (MST_PAY_SCHD_R paySchdR : paySchdL) {
					MCList<MST_PAY_ACT_D_R> l = getCachePayActDL(paySchdR.pay_schd_no());
					if (!isNull(l)) {
						payActDL.addAll(l.subList(r -> r.getBooleanNE(MST_PAY_ACT_R.$schd_act_flg)));
					}
				}
			}
		}

		_payActHdrPegNoMap.clear();
		MCList<PayAct_Chk01_HdrR> upHdrL = MCList.create(PayAct_Chk01_HdrR.class);
		MCList<PayAct_Chk01_DtlR> upDtlL = MCList.create(PayAct_Chk01_DtlR.class);

		MCIndexKey payChkIdxKey = upPayChkL.createIndex(MST_PAY_CHK_R.$pay_chk_mng_no);
		MCIndexKey paySchdIdxKey = upPaySchdL.createIndex(MST_PAY_SCHD_R.$pay_schd_no);
		MCIndexKey apApplSchdIdxKey = apApplSchdL.createIndex(MST_AP_APPL_SCHD_R.$pay_schd_no);

		Map_PayAct_Chk01_HdrR_PaySchd_DtlSchdR<PayAct_Chk01_HdrR, PaySchd_DtlSchdR>
			hdrMapper = createMap_PayAct_Chk01_HdrR_PaySchd_DtlSchdR();
		Map_PayAct_Chk01_DtlR_MST_AP_APPL_SCHD_R<PayAct_Chk01_DtlR, MST_AP_APPL_SCHD_R>
			dtlMapper = createMap_PayAct_Chk01_DtlR_MST_AP_APPL_SCHD_R();

		int hdrPegNo = 0, pegNo = 0;
		// 支払実績を削除する分
		for (MCList<MST_PAY_ACT_D_R> subPayActDL : payActDL.groupList(MST_PAY_ACT_D_R.$pay_schd_no)) {
			PaySchd_DtlSchdR upPaySchdR = upPaySchdL.getFirst(paySchdIdxKey, subPayActDL.get(0).pay_schd_no());
			if (isNull(upPaySchdR) || !isDel(upPaySchdR)) {
				continue;
			}
			if (skipPayAct(upPaySchdR.pay_schd_no())) {
				continue;
			}

			PayAct_Chk01_HdrR upHdrR = upHdrL.add();
			upHdrR.hdr_peg_no(++hdrPegNo);
			upHdrR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			hdrMapper.setWith(null, subPayActDL.get(0));
			copy(upHdrR, upPaySchdR, hdrMapper);

			_payActHdrPegNoMap.put(upHdrR.hdr_peg_no(), upPaySchdR.hdr_peg_no());

			for (MST_PAY_ACT_D_R payActDR : subPayActDL) {
				PayAct_Chk01_DtlR upDtlR = upDtlL.add();
				upDtlR.peg_no(++pegNo);
				upDtlR.hdr_peg_no(hdrPegNo);
				upDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dtlMapper.setWith(upPaySchdR, payActDR);
				copy(upDtlR, MST_AP_APPL_SCHD_R.create(), dtlMapper);
			}
		}

		// 相殺実績作成対象の支払予定リスト
		MCList<PaySchd_DtlSchdR> subPaySchdL = 
			upPaySchdL
				.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()))
				.subList(r -> isApSetOffActFlg(r));

		// 支払実績を登録する分
		for (PaySchd_DtlSchdR upPaySchdR : subPaySchdL) {
			PaySchd_HdrR payChkR = upPayChkL.getFirst(payChkIdxKey, upPaySchdR.pay_chk_mng_no());
			if (isNull(payChkR) || isDel(payChkR)) {
				continue;
			}
			if (skipPayAct(upPaySchdR.pay_schd_no())) {
				continue;
			}

			PayAct_Chk01_HdrR upHdrR = upHdrL.add();
			upHdrR.hdr_peg_no(++hdrPegNo);
			upHdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			hdrMapper.setWith(payChkR, null);
			copy(upHdrR, upPaySchdR, hdrMapper);

			_payActHdrPegNoMap.put(upHdrR.hdr_peg_no(), upPaySchdR.hdr_peg_no());

			MCList<MST_AP_APPL_SCHD_R> subApApplSchdL = apApplSchdL.subList(apApplSchdIdxKey, upPaySchdR.pay_schd_no());
			for (MST_AP_APPL_SCHD_R apApplSchdR : subApApplSchdL) {
				PayAct_Chk01_DtlR upDtlR = upDtlL.add();
				upDtlR.peg_no(++pegNo);
				upDtlR.hdr_peg_no(hdrPegNo);
				upDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dtlMapper.setWith(upPaySchdR, null);
				copy(upDtlR, apApplSchdR, dtlMapper);
			}
		}

 		MSBHL_PayActRegService.PayAct_Chk01 chk = crtPayActChk01();
 		chk.up0().setAll(upHdrL);
		chk.up1().setAll(upDtlL);
	}
	protected Map_PayAct_Chk01_HdrR_PaySchd_DtlSchdR<PayAct_Chk01_HdrR,PaySchd_DtlSchdR> createMap_PayAct_Chk01_HdrR_PaySchd_DtlSchdR() {
		return new Map_PayAct_Chk01_HdrR_PaySchd_DtlSchdR<PayAct_Chk01_HdrR, PaySchd_DtlSchdR>();
	}
	public class Map_PayAct_Chk01_HdrR_PaySchd_DtlSchdR<D extends PayAct_Chk01_HdrR, S extends PaySchd_DtlSchdR> extends MCRowMapper<D,S>{
		protected PaySchd_HdrR _payChkR;
		protected MST_PAY_ACT_D_R _payActDR;
		public void setWith(PaySchd_HdrR payChkR, MST_PAY_ACT_D_R payActDR) {
			_payChkR = payChkR;
			_payActDR = payActDR;
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (!MAC_DATA_CRUD_TYP.isCRT(dest.data_crud_typ())) {
				dest.pay_act_no(_payActDR.pay_act_no());
				dest.pay_act_seq(_payActDR.pay_act_seq());
				dest.can_ac_dt(nvl(src.can_ac_dt(), _payActDR.getDateNE("ac_dt")));
			}
			if (!MAC_DATA_CRUD_TYP.isDEL(dest.data_crud_typ())) {
				MAM_BP_R bpR = MSBHL_PaySchdRegService.getBp(_payChkR.bsppl_cd());
				dest.psppl_cd(bpR.psppl_cd());
				dest.pay_dpt_cd(src.pay_dpt_cd());
				dest.pay_act_dt(src.pay_schd_dt());
				dest.ac_dt(src.pay_schd_dt());
				dest.xrate(src.xrate());
				dest.ap_sttl_cd(src.ap_sttl_cd());
				dest.bank_ac_cd(src.bank_ac_cd());
				dest.pay_bank_ac_cd(src.pay_bank_ac_cd());
				dest.ap_setoff_typ(src.ap_setoff_typ());
				dest.setoff_cd(src.setoff_cd());
				dest.setoff_nm(src.setoff_nm());
				dest.so_dpt_cd(src.so_dpt_cd());
				dest.note_no(src.note_no());
				dest.note_typ(src.note_typ());
				dest.note_rsn_cd(src.note_rsn_cd());
				dest.draw_dt(src.draw_dt());
				dest.due_dt(src.due_dt());
				dest.note_days(src.note_days());
				dest.drawer_nm(src.drawer_nm());
				dest.draw_bank_cd(src.draw_bank_cd());
				dest.draw_branch_cd(src.draw_branch_cd());
				dest.endrsr(src.endrsr());
				dest.accptr(src.accptr());
				dest.trd_cur_cd(_payChkR.trd_cur_cd());
			}
			dest.schd_act_flg(true);
			dest.upd_cntr_not_chk_flg(true);
			dest.dac_not_chk_flg(true);
		}
	}
	protected Map_PayAct_Chk01_DtlR_MST_AP_APPL_SCHD_R<PayAct_Chk01_DtlR,MST_AP_APPL_SCHD_R> createMap_PayAct_Chk01_DtlR_MST_AP_APPL_SCHD_R() {
		return new Map_PayAct_Chk01_DtlR_MST_AP_APPL_SCHD_R<PayAct_Chk01_DtlR, MST_AP_APPL_SCHD_R>();
	}
	public class Map_PayAct_Chk01_DtlR_MST_AP_APPL_SCHD_R<D extends PayAct_Chk01_DtlR, S extends MST_AP_APPL_SCHD_R> extends MCRowMapper<D,S>{
		protected PaySchd_DtlSchdR _paySchdR;
		protected MST_PAY_ACT_D_R _payActDR;
		public void setWith(PaySchd_DtlSchdR paySchdR, MST_PAY_ACT_D_R payActDR) {
			_paySchdR = paySchdR;
			_payActDR = payActDR;
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (!MAC_DATA_CRUD_TYP.isCRT(dest.data_crud_typ())) {
				dest.pay_act_d_no(_payActDR.pay_act_d_no());
				dest.pay_act_d_seq(_payActDR.pay_act_d_seq());
			}
			dest.pay_chk_mng_no(_paySchdR.pay_chk_mng_no());
			if (!MAC_DATA_CRUD_TYP.isDEL(dest.data_crud_typ())) {
				dest.ap_appl_schd_no(src.ap_appl_schd_no());
				dest.ap_sttl_cd(_paySchdR.ap_sttl_cd());
				dest.bank_ac_cd(_paySchdR.bank_ac_cd());
				dest.pay_bank_ac_cd(_paySchdR.pay_bank_ac_cd());
				dest.trd_cur_com_paid_tax_cd(_paySchdR.trd_cur_com_paid_tax_cd());
				dest.ap_setoff_typ(_paySchdR.ap_setoff_typ());
				dest.setoff_cd(_paySchdR.setoff_cd());
				dest.setoff_nm(_paySchdR.setoff_nm());
				dest.so_dpt_cd(_paySchdR.so_dpt_cd());
				dest.trd_cur_amt(src.trd_cur_amt());
				dest.trd_cur_com_paid_tax_cd(_paySchdR.trd_cur_com_paid_tax_cd());
				dest.trd_cur_com_paid_tax_amt(_paySchdR.trd_cur_com_paid_tax_amt());
				dest.adv_pay_act_no(_paySchdR.adv_pay_act_no());
				dest.trd_d_rmrks(_paySchdR.trd_d_rmrks());
			}
		}
	}

	/**
	 * 支払予定ＩＦ作成サービスの登録処理を実行する
	 * @param upPayChkL 支払照合ヘッダリスト
	 * @param dataCrudTyp データ更新区分
	 */
	protected void callPaySchdSendIfCommon(MCList<PaySchd_HdrR> upPayChkL, MAC_DATA_CRUD_TYP dataCrudTyp) {

		MCList<MST_PAY_CHK_R> bind = MCList.create(MST_PAY_CHK_R.class);
		for (PaySchd_HdrR payChkR : upPayChkL) {
			if (MAC_DATA_CRUD_TYP.isCRT(dataCrudTyp)) {
				if (payChkR.aprv_flg()) {
					continue;
				}
				else if (isUpd(payChkR) && justUpdRmrks(payChkR.pay_chk_mng_no())) {
					MST_PAY_CHK_R befPayChkR = getCachePayChkR(payChkR.pay_chk_mng_no());
					if (!befPayChkR.aprv_flg()) {
						continue;
					}
				}
			}
			else {
				// 以下のいずれかに該当する場合、支払予定IFを削除する
				// ・更新前が承認対象外。ただし、更新後も対象外 かつ 備考のみ更新の場合は削除しない
				// ・最終承認済み かつ 承認引戻
				MST_PAY_CHK_R befPayChkR = getCachePayChkR(payChkR.pay_chk_mng_no());
				if (!befPayChkR.aprv_flg()) {
					if (isUpd(payChkR)
						 && !payChkR.aprv_flg()
						 && justUpdRmrks(payChkR.pay_chk_mng_no())) {
						continue;
					}
				}
				else if (MAC_APRV_STS_TYP.isACPT(befPayChkR.aprv_sts_typ()) && isAprvRvrs(payChkR)) {
				}
				else {
					continue;
				}
			}
			
			bind.add().pay_chk_mng_no(payChkR.pay_chk_mng_no());
		}
		if (bind.isEmpty()) {
			return;
		}

		MCQueryApiBuilder bind_bldr = MCQueryApiBuilder.create(MST_PAY_CHK_R.create("T"));
		dbWkDelete("MSBHL5030_MSW_PAY_CHK_D03", bind_bldr.getBaseDbc());
		dbWkInsert("MSBHL5030_MSW_PAY_CHK_I02", bind, bind_bldr.getBaseDbc());

		// 予定時に実績作成されていない買掛消込予定が対象
		// （予定時ではない実績計上分はチェック処理ではじかれるので、実績の有無だけで判断できる）

		MCList<MST_AP_APPL_SCHD_R> dbc = MCList.create(MST_AP_APPL_SCHD_R.class);
		MST_AP_APPL_SCHD_R t1 = MST_AP_APPL_SCHD_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t1);
		MST_PAY_SCHD_R t2 = MST_PAY_SCHD_R.create("T2");
		MSW_PAY_CHK_KEY_R w1 = MSW_PAY_CHK_KEY_R.create("W1");
		dbc_bldr.setSelect(t1.ap_appl_schd_no);
		dbc_bldr.addInnerJoin(t2, bracket(t2.pay_schd_no.eq(t1.pay_schd_no)));
		dbc_bldr.addInnerJoin(w1, bracket(w1.pay_chk_mng_no.eq(t2.pay_chk_mng_no)));
		dbc_bldr.setWhere(t2.trd_cur_appl_amt.eq(value(0)));
		dbc_bldr.addWhereWithAnd(t1.trd_cur_amt.neq(value(0)));
		dbSelect("MSBHL5030_MST_AP_APPL_SCHD_S02", dbc, dbc_bldr);


		dbWkDelete("MSBHL5030_MSW_PAY_CHK_D04", bind_bldr.getBaseDbc());

		MSBHL_PaySchdIfCrtService.PaySchdIfCrt_Ins01 o = MSBHL_PaySchdIfCrtService.crtPaySchdIfCrt_Ins01();
		for (MST_AP_APPL_SCHD_R r : dbc) {
			PaySchdIfCrt_Ins01_CndR upR = o.up0().add();
			upR.ap_appl_schd_no(r.ap_appl_schd_no());
			upR.data_crud_typ(dataCrudTyp.value());
		}
		o.exec();
	}


	/**
	 * 買掛消込予定を作成する。
	 * @param payChkL 支払照合ヘッダリスト
	 * @param paySchdL 支払予定リスト
	 * @Param apApplSchdL 買掛消込予定リスト
	 * @param updFlg 更新フラグ（更新から呼び出す場合にtrueを設定）
	 */
	protected void crtApApplSchdCommon(
			MCList<MST_PAY_CHK_R> payChkL, MCList<MST_PAY_SCHD_R> paySchdL,
			MCList<MST_AP_APPL_SCHD_R> apApplSchdL, boolean updFlg) {
		
		// 支払照合管理ＮＯが反映済の買掛明細を取得する。
		MCList<MST_AP_D_R> apDL = getApDL(paySchdL);
		apDL.addNumberColumn("divide_amt_rslt");
		apDL.addNumberColumn("divide_tax_rslt");
		
		MCIndexKey apDIdxkey = apDL.createIndex(
				MST_AP_D_R.$asppl_cd,
				MST_AP_D_R.$ap_dpt_cd,
				MST_AP_D_R.$ap_typ,
				MST_AP_D_R.$pay_chk_mng_no);
		
		MCIndexKey payChkIdxkey = payChkL.createIndex(MST_PAY_CHK_R.$pay_chk_mng_no);
		
		MCList<MST_AP_APPL_SCHD_R> subApApplSchdL = MCList.create(MST_AP_APPL_SCHD_R.class);
		MST_AP_APPL_SCHD_R apApplSchdR = null;
		MAM_CUR_R curR = null;
		
		for (MST_PAY_SCHD_R paySchdR :paySchdL) {
			
			MST_PAY_CHK_R payChkR = payChkL.getFirst(payChkIdxkey, paySchdR.pay_chk_mng_no());
			
			if (updFlg && justUpdRmrks(payChkR.pay_chk_mng_no()) && !paySchdR.getBooleanNE("force")) {
				continue;
			}
			
			curR = getCur(payChkR.trd_cur_cd());
			
			// 支払予定に紐付く買掛明細を取得する。
			MCList<MST_AP_D_R> subApDL = getApDL(paySchdR, apDL, apDIdxkey);
			String allocCol = "trd_cur_inc_tax_amt";
			subApDL.setNumberNE(allocCol, 0);
			subApDL.setNumberNE("divide_amt_rslt", null);
			subApDL.setNumberNE("divide_tax_rslt", null);
			subApDL.forEach(r -> {
				MCNumber amt = r.trd_cur_amt().add(r.trd_cur_tax_amt());
				amt = amt.multiply(getAmtDispPm(r.trd_ptn_typ(), r.getBooleanNE("dscnt_itm_flg")));
				r.setNumber(allocCol, amt);
			});
			
			// 手数料は支払予定の金額を買掛明細の金額で按分する
			if (MAC_AP_STTL_TYP.is_com_paid(paySchdR.ap_sttl_typ())) {
				// 取引通貨金額（税込み）で按分する
				if (!isNull(paySchdR.trd_cur_amt())) {
					propNE(subApDL, paySchdR.trd_cur_amt(), curR.amt_dec_place().intValue(), allocCol, "divide_amt_rslt");
				}
				// 債務決済区分が「預金（手数料）」、「現金（手数料）」の場合は、取引通貨手数料税額を買掛明細の金額で按分する
				if (!isNullOr(paySchdR.trd_cur_com_paid_tax_cd(), paySchdR.trd_cur_com_paid_tax_amt())) { 
					propNE(subApDL, paySchdR.trd_cur_com_paid_tax_amt(), curR.amt_dec_place().intValue(), allocCol, "divide_tax_rslt");
				}
			}
			
			// 支払予定と買掛明細を関連付ける
			for (MST_AP_D_R apDR : subApDL) {
				
				apApplSchdR = MST_AP_APPL_SCHD_R.create();
				
				crtApApplSchdR(apApplSchdR, payChkR, paySchdR, apDR);
				
				subApApplSchdL.add(apApplSchdR);
			}
		}
		
		// 買掛明細の金額を支払予定の金額で按分する
		MCList<MST_AP_APPL_SCHD_R> wkApApplSchdL = subApApplSchdL.subList(r -> !r.getBooleanNE("is_com_paid"));
		subApApplSchdL.removeAll(wkApApplSchdL);	// 手数料のみ退避
		
		MCList<MST_AP_APPL_SCHD_R>[] grps = wkApApplSchdL.groupList(
				MST_AP_D_R.$ap_d_no
			);

		wkApApplSchdL.clear();
		for (MCList<MST_AP_APPL_SCHD_R> list : grps) {
			// groupByなどの集計用にカラム追加
			list.addStringColumn(MST_AP_D_R.$ap_d_no);
			list.addNumberColumn("ap_d_amt");
			list.addNumberColumn("pay_schd_amt");
			
			// 買掛消込予定に割り当てる買掛明細の金額の合計
			MCNumber apDAmt = list.groupBy(MST_AP_D_R.$ap_d_no, "ap_d_amt").sum("ap_d_amt");
			
			// 割当対象の買掛消込予定のリスト（買掛明細との関連付けによって重複した分を除外する）
			MCList<MST_AP_APPL_SCHD_R> trgL = list.groupBy(
				MST_AP_APPL_SCHD_R.$pay_schd_no,
				MST_AP_APPL_SCHD_R.$purc_act_no,
				MST_AP_APPL_SCHD_R.$rcpt_iv_mng_no,
				MST_AP_APPL_SCHD_R.$rcpt_iv_no,
				"pay_schd_amt"
			);
			
			trgL.sort(
				MST_AP_APPL_SCHD_R.$pay_schd_no,
				MST_AP_APPL_SCHD_R.$purc_act_no,
				MST_AP_APPL_SCHD_R.$rcpt_iv_mng_no, 
				MST_AP_APPL_SCHD_R.$rcpt_iv_no
			);
			MAM_CUR_R payChkCurR = getCur(list.get(0).getStringNE(MST_PAY_CHK_R.$trd_cur_cd));
			propNE(
				trgL,
				apDAmt,
				payChkCurR.amt_dec_place().intValue(),
				"pay_schd_amt",
				"divide_amt_rslt");
			
			trgL.forEach(r -> {
				r.trd_cur_amt(r.getNumberNE("divide_amt_rslt"));
				r.setNumberNE("ap_d_amt", apDAmt);
				r.setStringNE(MST_PAY_CHK_R.$trd_cur_cd, payChkCurR.cur_cd());
				r.setStringNE(MST_AP_D_R.$ap_d_no, list.getString(0, MST_AP_D_R.$ap_d_no));
			});
			
			wkApApplSchdL.addAll(trgL);
		}
		
		// 金額調整
		adjApAppSchd(wkApApplSchdL);
		
		subApApplSchdL.addAll(wkApApplSchdL);
		subApApplSchdL.setAll(
			// 支払実績登録による実績なしの予定のみ対象
			subApApplSchdL.subList(r -> !existsPayActD(r.pay_schd_no()) && !skipPayAct(r.pay_schd_no()))
		);
		
		// 手数料計算
		calcComPaid(subApApplSchdL);
		
		MCGroupByPolicy policy = new MCGroupByPolicy(
			MST_AP_APPL_SCHD_R.$pay_schd_no,
			MST_AP_APPL_SCHD_R.$purc_act_no,
			MST_AP_APPL_SCHD_R.$rcpt_iv_mng_no,
			MST_AP_APPL_SCHD_R.$rcpt_iv_no
		);
		policy.sum(MST_AP_APPL_SCHD_R.$trd_cur_amt,
				MST_AP_APPL_SCHD_R.$trd_cur_exc_com_paid,
				MST_AP_APPL_SCHD_R.$trd_cur_com_paid_tax_amt,
				MST_AP_APPL_SCHD_R.$trd_cur_appl_amt);
		
		apApplSchdL.addAll(subApApplSchdL.groupBy(policy));
		
		// 初期値設定
		setApApplSchdDefVal(apApplSchdL);
		
		// 発番
		setApApplSchdNo(apApplSchdL);
		
		MCQueryApiBuilder apApplSchdL_bldr = MCQueryApiBuilder.create(MST_AP_APPL_SCHD_R.create("T"));
		dbInsert("MSBHL5030_MST_AP_APPL_SCHD_I01", apApplSchdL, apApplSchdL_bldr);
	}
	
	/**
	 * 買掛消込予定の金額を調整する。
	 * @param apAppSchdL 買掛消込予定リスト
	 */
	protected void adjApAppSchd(MCList<MST_AP_APPL_SCHD_R> apAppSchdL) {
	
		MCList<MST_AP_APPL_SCHD_R> adjL = apAppSchdL.createInstance();
		BiConsumer<MCList<MST_AP_APPL_SCHD_R>, MCNumber> adj = (trgL, diffAmt) -> {
			trgL.addNumberColumn("div_amt");
			
			// 不一致分の金額を買掛消込予定の比率で調整する
			trgL.sort(
				MST_AP_APPL_SCHD_R.$pay_schd_no,
				MST_AP_APPL_SCHD_R.$purc_act_no,
				MST_AP_APPL_SCHD_R.$rcpt_iv_mng_no, 
				MST_AP_APPL_SCHD_R.$rcpt_iv_no,
				MST_AP_D_R.$ap_d_no
			);
			MAM_CUR_R curR = getCur(trgL.get(0).getStringNE(MST_PAY_CHK_R.$trd_cur_cd));
			propNE(
				trgL,
				diffAmt,
				curR.amt_dec_place().intValue(),
				MST_AP_APPL_SCHD_R.$trd_cur_amt,
				"div_amt");
		};
		
		// 按分した金額が支払予定の金額と一致していないレコードを抽出
		for (MCList<MST_AP_APPL_SCHD_R> paySchdL : apAppSchdL.groupList(MST_AP_APPL_SCHD_R.$pay_schd_no)) {
			MST_AP_APPL_SCHD_R apAppSchdR = paySchdL.get(0);
			MCNumber
				ttlAmt = paySchdL.sum(MST_AP_APPL_SCHD_R.$trd_cur_amt),
				diffAmt = ttlAmt.subtract(apAppSchdR.getNumberNE("pay_schd_amt"));
			
			if (!diffAmt.isZero()) {
				adj.accept(paySchdL, diffAmt);
				paySchdL.forEach(r -> {
					if (!r.getNumberNE("div_amt").isZero()) {
						r.setNumberNE("diff_amt", r.getNumberNE("div_amt"));
						adjL.add(r);
					}
				});
			}
		}
		if (adjL.isEmpty())	return;
		
		// 支払予定の金額を調整（金額の多い方から少ない方へ調整する）
		for (MCList<MST_AP_APPL_SCHD_R> apDL : adjL.groupList(
				MST_AP_APPL_SCHD_R.$purc_act_no, MST_AP_APPL_SCHD_R.$rcpt_iv_mng_no, MST_AP_APPL_SCHD_R.$rcpt_iv_no)) {
			
			if (!apDL.sum("diff_amt").isZero()) {
				// 買掛明細の金額を按分しているので、不一致分の金額の合計はゼロになるはず
				// ゼロにならない場合は調整する意味がないので対象外とする
				continue;
			}
			
			// 支払予定の金額より多い買掛消込予定からは減算し、少ない買掛消込予定には加算する
			for (MCList<MST_AP_APPL_SCHD_R> paySchdL : apDL.groupList(MST_AP_APPL_SCHD_R.$pay_schd_no)) {
				adj.accept(paySchdL, paySchdL.sum("diff_amt"));
				paySchdL.forEach(r -> r.trd_cur_amt(
					r.trd_cur_amt().add(r.getNumberNE("div_amt").multiply(-1))
				));
			}
		}
	}
	
	/**
	 * 支払実績明細を更新する。
	 * @param upPayChkL 上り電文の支払照合ヘッダリスト
	 * @param upPayActL 上り電文の支払実績リスト
	 * @param payActIdxkey 支払実績のインデックスキー
	 */
	protected void updPayActDCommon(MCList<PaySchd_HdrR> upPayChkL, MCList<PaySchd_DtlActR> upPayActL, MCIndexKey payActIdxkey) {
		
		MCList<PaySchd_DtlActR> bindL = MCList.create(PaySchd_DtlActR.class);
		
		for (PaySchd_HdrR upPayChkR : upPayChkL) {
			bindL.addAll(upPayActL.subList(payActIdxkey, upPayChkR.hdr_peg_no()));
		}
		
		if (!bindL.isEmpty()) {
			
			MST_PAY_ACT_D_R t1 = MST_PAY_ACT_D_R.create("T");

			execDbUpdate("MSBHL5030_MST_PAY_ACT_D_U05", t1, bindL,
						t1.pay_act_d_no.eq(bindEx("pay_act_d_no"))
						.and(t1.pay_act_d_seq.eq(bindEx("pay_act_d_seq"))),
					t1.calc_tgt_pay_chk_mng_no);
			
			// 更新カウンタを進めるために空更新
			MCList<PaySchd_DtlActR> payChkL = bindL.groupBy(PaySchd_DtlActR.$pay_chk_mng_no);
			MST_PAY_CHK_R t2 = MST_PAY_CHK_R.create("T");
			
			execDbUpdateKey("MSBHL5030_MST_PAY_CHK_U06", t2, payChkL, t2.pay_chk_mng_no);
		}
	}
	
	/**
	 * 前渡金実績の「取引通貨相殺予定額」「取引通貨未処理残高」を更新する
	 * @param upPayChkL 上り電文の支払照合ヘッダリスト
	 * @param upPaySchdL 上り電文の支払予定リスト
	 * @param paySchdIdxkey 支払予定のインデックスキー
	 */
	protected void updAdvPayActAmt(
		MCList<PaySchd_HdrR> upPayChkL, MCList<PaySchd_DtlSchdR> upPaySchdL, MCIndexKey paySchdIdxkey) {
		Map<String, MST_ADV_PAY_ACT_R> advPayActMap = new HashMap<>();
		for (PaySchd_HdrR upPayChkR : upPayChkL) {
			MCList<PaySchd_DtlSchdR> paySchdL = MCList.create(PaySchd_DtlSchdR.class);
			if (isUpd(upPayChkR) && justUpdRmrks(upPayChkR.pay_chk_mng_no())) {
				continue;
			}
			paySchdL.addAll(
				upPaySchdL.subList(paySchdIdxkey, upPayChkR.hdr_peg_no())
			);
			java.util.function.Function<String, MST_ADV_PAY_ACT_R> getAdvR = (no) -> {
				if (!advPayActMap.containsKey(no)) {
					MCList<MST_ADV_PAY_ACT_R> advPayActL = getCacheAdvPayActL(no);
					advPayActL.forEach(r -> {
						if (MAC_SLIP_STS_TYP.isCRT(r.slip_sts_typ())) {
							advPayActMap.put(no, r);
						}
					});
				}
				return advPayActMap.get(no);
			};
			for (PaySchd_DtlSchdR r :paySchdL) {
				if (isUpd(r) || isDel(r)) {
					// 訂正前または削除前の取引通貨金額を減算する
					MST_PAY_SCHD_R orgR = getCachePaySchdL(r.pay_chk_mng_no()).getFirst(MST_PAY_SCHD_R.$pay_schd_no, r.pay_schd_no());
					if (!isNull(orgR.adv_pay_act_no())) {
						MST_ADV_PAY_ACT_R advPayActR = getAdvR.apply(orgR.adv_pay_act_no());
						advPayActR.trd_cur_setoff_schd_amt(
							advPayActR.trd_cur_setoff_schd_amt().subtract(orgR.trd_cur_amt())
						);
					}
				}
				if (isCrt(r) || isUpd(r)) {
					// 登録または訂正後の取引通貨金額を加算する
					if (!isNull(r.adv_pay_act_no())) {
						MST_ADV_PAY_ACT_R advPayActR = getAdvR.apply(r.adv_pay_act_no());
						advPayActR.trd_cur_setoff_schd_amt(
							advPayActR.trd_cur_setoff_schd_amt().add(r.trd_cur_amt())
						);
					}
				}
			}
		}

		MCList<MST_ADV_PAY_ACT_R> dbc = MCList.create(MST_ADV_PAY_ACT_R.class);
		for (MST_ADV_PAY_ACT_R r : advPayActMap.values()) {
			// 取引通貨未処理残高＝取引通貨相殺対象額－取引通貨相殺予定額
			r.trd_cur_not_proc_bal(
				r.trd_cur_setoff_tgt_amt().subtract(r.trd_cur_setoff_schd_amt())
			);
			dbc.add(r);
		}
		MST_ADV_PAY_ACT_R t = MST_ADV_PAY_ACT_R.create("T");

		execDbUpdateKey("MSBHL5030_MST_ADV_PAY_ACT_U03", t, dbc, t.trd_cur_setoff_schd_amt,
				t.trd_cur_not_proc_bal);
	}

	/**
	 * 前渡金実績を更新する。
	 * @param upPayChkL 上り電文の支払照合ヘッダリスト
	 * @param upAdvPayActL 上り電文の前渡金実績リスト
	 * @param advPayActIdxKey 上り電文の前渡金実績のインデックスキー
	 */
	protected void updAdvPayActPayChk(MCList<PaySchd_HdrR> upPayChkL, MCList<PaySchd_AdvPayActR> upAdvPayActL, MCIndexKey advPayActIdxKey) {
		MCList<MST_ADV_PAY_ACT_R> dbc = MCList.create(MST_ADV_PAY_ACT_R.class);
		MCList<MST_ADV_PAY_ACT_R> oldAdvPayActL = MCList.create(MST_ADV_PAY_ACT_R.class);
		for (PaySchd_HdrR r: upPayChkL) {
			if (isNull(r.pay_chk_mng_no())) {
				continue;
			}
			if (!isNull(upAdvPayActL)) {
				MCList<PaySchd_AdvPayActR> pegAdvPayL = upAdvPayActL.subList(advPayActIdxKey, r.hdr_peg_no());
				pegAdvPayL.setStringNE(PaySchd_AdvPayActR.$pay_chk_mng_no, r.pay_chk_mng_no());
			}
			oldAdvPayActL.addAll(getCacheAdvPayActLByPayChkMngNo(r.pay_chk_mng_no()));
		}
		oldAdvPayActL.setString(MST_ADV_PAY_ACT_R.$pay_chk_mng_no, null);
		if (!isNull(upAdvPayActL) && !upAdvPayActL.isEmpty()) {
			MCIndexKey idx = oldAdvPayActL.createIndex(MST_ADV_PAY_ACT_R.$adv_pay_act_no, MST_ADV_PAY_ACT_R.$adv_pay_act_seq);
			MCList<MST_ADV_PAY_ACT_R> excOldAdvPayActL = MCList.create(MST_ADV_PAY_ACT_R.class);
			for (PaySchd_AdvPayActR r : upAdvPayActL) {
				MST_ADV_PAY_ACT_R oldAdvPayActR = oldAdvPayActL.getFirst(idx, r.adv_pay_act_no(), r.adv_pay_act_seq());
				// 上り電文と重複する行は除外する。
				if (!isNull(oldAdvPayActR)) {
					excOldAdvPayActL.add(oldAdvPayActR);
				}
				MST_ADV_PAY_ACT_R addR = r.adv_pay_act().clone();
				addR.pay_chk_mng_no(r.pay_chk_mng_no());
				dbc.add(addR);
			}
			oldAdvPayActL.removeAll(excOldAdvPayActL);
		}
		dbc.addAll(oldAdvPayActL);
		MST_ADV_PAY_ACT_R t = MST_ADV_PAY_ACT_R.create("T");
		execDbUpdateKey("MSBHL5030_MST_ADV_PAY_ACT_U03", t, dbc, t.pay_chk_mng_no);
	}
	
	/**
	 * 引数で指定された支払予定に紐付く買掛明細を取得する。<br>
	 * メソッド内で MSBHL5030#getCacheApDL を利用しているので、事前に MSBHL5030#initPayCache が実行されていること
	 * @param up0L 支払予定ヘッダ
	 * @param up1L 支払対象の買掛明細
	 * @return 買掛明細リスト
	 */
	protected MCList<MST_AP_D_R> getApDL4Upd(MCList<PaySchd_HdrR> up0L, MCList<PaySchd_DtlApdR> up1L) {
			MCList<MST_AP_D_R> retApDL = MCList.create(MST_AP_D_R.class);
			
			for (PaySchd_HdrR hdrR: up0L) {
				retApDL.addAll(getCacheApDL(hdrR.pay_chk_mng_no()));
			}
			
			// 繰越分も取得
			MCList<MST_AP_D_R> dbc = MCList.create(MST_AP_D_R.class);
			String[] cols = new String[]{
				MST_AP_D_R.$org_ap_d_no, MST_AP_D_R.$crryovr_ap_d_no, MST_AP_D_R.$crryovr_src_ap_d_no
			};
			retApDL.forEach(r -> {
				for (String col : cols) {
					String val = r.getString(col);
					if (!isNull(val)) {
						dbc.add().ap_d_no(val);
					}
				}
			});
			MST_AP_D_R apdR = MST_AP_D_R.create("APD");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(apdR);
			dbWkDelete("MSBHL5030_MSW_AP_D_D06", dbc_bldr.getBaseDbc());
			dbWkInsert("MSBHL5030_MSW_AP_D_I04", dbc.groupBy(dbc.createRow().getKeyColumn()), dbc_bldr.getBaseDbc());

			dbc.init();
			dbc_bldr = MCQueryApiBuilder.create(apdR);
			MSW_AP_D_KEY_R apdKeyR = MSW_AP_D_KEY_R.create("APD_KEY");
			dbc_bldr.addInnerJoin(apdKeyR, bracket(apdKeyR.ap_d_no.eq(apdR.ap_d_no)));
			dbSelect("MSBHL5030_MST_AP_D_S05", dbc, dbc_bldr);
			dbWkDelete("MSBHL5030_MSW_AP_D_D07", dbc_bldr.getBaseDbc());
			
			retApDL.merge(dbc, dbc.createRow().getKeyColumn());
			
			// 新規登録分の買掛明細を取得する
			MCList<PaySchd_DtlApdR> insL = up1L.subList(r -> isCrt(r));
			MCList<MST_AP_D_R> apDL = MCList.create(MST_AP_D_R.class);
			MCQueryApiBuilder apDL_bldr = MCQueryApiBuilder.create(apdR);
			apDL_bldr.setWhere(apdR.valid_flg.eq(value(true)));
			dbSelectKey("MSBHL5030_MST_AP_D_S12", apDL, apDL_bldr, insL);
			retApDL.merge(apDL, apDL.createRow().getKeyColumn());
			
		return retApDL;
	}
	
	/**
	 * 引数で指定された支払予定に紐付く買掛明細を取得する。
	 * @param paySchdL 支払予定リスト
	 * @return 買掛明細リスト
	 */
	protected MCList<MST_AP_D_R> getApDL(MCList<MST_PAY_SCHD_R> paySchdL) {
		
		MAM_ITM_R m1 = MAM_ITM_R.create("M1");

		MCList<MST_AP_D_R> apDL = MCList.create(MST_AP_D_R.class);
		MST_AP_D_R t = MST_AP_D_R.create("T");
		MCQueryApiBuilder apDL_bldr = MCQueryApiBuilder.create(t);
		apDL.addBooleanColumn("dscnt_itm_flg");
		apDL_bldr.addSelect(m1.dscnt_itm_flg);
		apDL_bldr.addLeftOuterJoin(m1,
				bracket(m1.itm_cd.eq(t.itm_cd)
						.and(m1.itm_sub1.eq(t.itm_sub1))
						.and(m1.itm_sub2.eq(t.itm_sub2))
						.and(m1.itm_sub3.eq(t.itm_sub3))));
		apDL_bldr.addConstWhereWithAnd(t.valid_flg.eq(value(true)));
		dbSelectColumn("MSBHL5030_MST_AP_D_S09", apDL, apDL_bldr, MST_AP_D_R.$pay_chk_mng_no, paySchdL, MST_PAY_SCHD_R.$pay_chk_mng_no);
		
		return apDL;
	}
	
	/**
	 * 引数で指定された支払予定に紐付く買掛明細を引数の買掛明細リストから取得して返す。
	 * @param paySchdR 支払予定
	 * @param apDL 買掛明細リスト
	 * @param apDIdxkey 買掛明細インデックスキー
	 * @return 買掛明細リスト
	 */
	protected MCList<MST_AP_D_R> getApDL(MST_PAY_SCHD_R paySchdR, MCList<MST_AP_D_R> apDL, MCIndexKey apDIdxkey) {
		Comparable<?>[] vals1 = {paySchdR.asppl_cd(), paySchdR.ap_dpt_cd(), paySchdR.ap_typ(), paySchdR.pay_chk_mng_no()};
		return apDL.subList(apDIdxkey, vals1);
	}
	
	/**
	 * 買掛消込予定ＮＯを発番する。
	 * @param apApplSchdL 買掛消込予定リスト
	 */
	protected void setApApplSchdNo(MCList<MST_AP_APPL_SCHD_R> apApplSchdL) {

		doApApplSchdNoSeqCache(apApplSchdL);
		
		apApplSchdL.sort(MST_AP_APPL_SCHD_R.$pay_schd_no, MST_AP_APPL_SCHD_R.$purc_act_no, MST_AP_APPL_SCHD_R.$rcpt_iv_mng_no);
		
		for (MST_AP_APPL_SCHD_R apApplSchdR : apApplSchdL) {
			apApplSchdR.ap_appl_schd_no(getStrSeq(MSC_NUM_SYS_TYP.APAPPLSCHD));
		}
	}
	
	/**
	 * 手数料を算出する。
	 * @param apApplSchdL 買掛消込予定リスト
	 */
	protected void calcComPaid(MCList<MST_AP_APPL_SCHD_R> apApplSchdL) {
		
		// 債務決済区分が「預金（手数料）」、「現金（手数料）」「相殺」の場合は手数料金額
		for (MST_AP_APPL_SCHD_R apApplSchdR : apApplSchdL) {
			if (apApplSchdR.getBooleanNE("is_com_paid") && !isNull(apApplSchdR.trd_cur_amt())) {
				apApplSchdR.trd_cur_exc_com_paid(
					apApplSchdR.trd_cur_amt().subtract(apApplSchdR.trd_cur_com_paid_tax_amt())
				);
			}
		}
	}
	
	/**
	 * 買掛消込予定を作成する。
	 * @param apApplSchdR 買掛消込予定
	 * @oparam payChkR 支払照合
	 * @param paySchdR 支払予定
	 * @param apDR 買掛明細
	 */
	protected void crtApApplSchdR(MST_AP_APPL_SCHD_R apApplSchdR, MST_PAY_CHK_R payChkR, MST_PAY_SCHD_R paySchdR, MST_AP_D_R apDR) {
		
		apApplSchdR.pay_schd_no(paySchdR.pay_schd_no());
		apApplSchdR.setNumberNE("pay_schd_amt", paySchdR.trd_cur_amt());	// 按分前の金額
		
		if (MAC_TRD_PTN_TYP.isAPSW_IN_CHK(apDR.trd_ptn_typ())) {
			apApplSchdR.purc_act_no(apDR.purc_act_no());
			apApplSchdR.rcpt_iv_mng_no(apDR.rcpt_iv_mng_no());
			apApplSchdR.rcpt_iv_no(apDR.rcpt_iv_no());
		}
		else if (isIv(apDR.sppl_cd(), apDR.rcpt_iv_no())) {
			apApplSchdR.purc_act_no(MAC_STR.NULL_VAL.value());
			apApplSchdR.rcpt_iv_mng_no(apDR.rcpt_iv_mng_no());
			apApplSchdR.rcpt_iv_no(apDR.rcpt_iv_no());
		}
		else if (!isSame(payChkR.trd_cur_cd(), getBaseCur().cur_cd())) {
			apApplSchdR.purc_act_no(apDR.purc_act_no());
			apApplSchdR.rcpt_iv_mng_no(MAC_STR.NULL_VAL.value());
			apApplSchdR.rcpt_iv_no(MAC_STR.NULL_VAL.value());
		}
		else {
			apApplSchdR.purc_act_no(MAC_STR.NULL_VAL.value());
			apApplSchdR.rcpt_iv_mng_no(MAC_STR.NULL_VAL.value());
			apApplSchdR.rcpt_iv_no(MAC_STR.NULL_VAL.value());
		}
		if (MAC_AP_STTL_TYP.is_com_paid(paySchdR.ap_sttl_typ())) {
			apApplSchdR.trd_cur_amt(apDR.getNumberNE("divide_amt_rslt"));
			apApplSchdR.trd_cur_com_paid_tax_amt(apDR.getNumberNE("divide_tax_rslt"));
		}
		apApplSchdR.setBooleanNE("is_com_paid", MAC_AP_STTL_TYP.is_com_paid(paySchdR.ap_sttl_typ()));
		
		apApplSchdR.setStringNE(MST_AP_D_R.$ap_d_no, apDR.ap_d_no());
		apApplSchdR.setNumberNE("ap_d_amt", apDR.getNumberNE("trd_cur_inc_tax_amt"));
		apApplSchdR.setStringNE(MST_AP_D_R.$pay_chk_mng_no, apDR.pay_chk_mng_no());
		apApplSchdR.setStringNE(MST_PAY_CHK_R.$trd_cur_cd, payChkR.trd_cur_cd());
	}
	
	/**
	 * 買掛消込予定の初期値を設定する。
	 * @param apApplSchdL 買掛消込予定リスト
	 */
	protected void setApApplSchdDefVal(MCList<MST_AP_APPL_SCHD_R> apApplSchdL) {
		
		apApplSchdL.setValueNE(MST_AP_APPL_SCHD_R.$trd_cur_appl_amt, MCNumber.ZERO);
		apApplSchdL.setValueNE(MST_AP_APPL_SCHD_R.$pay_sts_typ, MSC_PAY_STS_TYP.NOT_PAY.value());
	}
	
	/**
	 * 買掛明細を更新する。
	 * @param upApDL 上り電文の買掛明細リスト
	 */
	protected void updApDCommon(MCList<PaySchd_DtlApdR> upApDL) {
		
		MCList<MST_AP_D_R>
		apDL = MCList.create(MST_AP_D_R.class), rmrksApDL = MCList.create(MST_AP_D_R.class);
		
		for (PaySchd_DtlApdR apdR : upApDL) {
			// 全額支払（一部または全額の照合済みの買掛明細は繰越処理で作成する）
			if (MSC_PAY_MTD_TYP.isALL_PAY(apdR.pay_mtd_typ())) {
				if (isInvalidApd(apdR)) {
					apdR.ap_d().chk_flg(false);
					apdR.ap_d().pay_chk_no(null);
					apdR.ap_d().pay_chk_mng_no(null);
					apdR.ap_d().pay_schd_d_print_rmrks(null);
					apdR.ap_d().pay_ntc_d_print_rmrks(null);
					apdR.ap_d().intr_rmrks(null);
					apdR.ap_d().sub_char1(null);
					apdR.ap_d().sub_char2(null);
					apdR.ap_d().sub_char3(null);
				}
				else {
					apdR.ap_d().chk_flg(true);
				}
				apDL.add(apdR.ap_d());
			}
			else if (!isDel(apdR)) {
				// 一部支払、または全額支払は繰越処理で作成されるが、備考はここで更新する
				// （備考のみ更新の場合、繰越処理が実行されないため）
				MST_AP_D_R r = apdR.ap_d();
				if (!isNull(apdR.pay_ap_d_no())) {
					// 繰越処理が行われていると、支払済みの買掛明細NOが変わるので更新対象を置き換える
					r = r.clone();
					r.ap_d_no(apdR.pay_ap_d_no());
				}
				rmrksApDL.add(r);
			}
		}
		MST_AP_D_R t = MST_AP_D_R.create("T");

		MCQueryApiBuilder apDL_bldr = MCQueryApiBuilder.create(t);
		apDL_bldr.setSet(t.pay_chk_no,
				t.pay_chk_mng_no,
				t.chk_flg,
				t.pay_schd_d_print_rmrks,
				t.pay_ntc_d_print_rmrks,
				t.intr_rmrks,
				t.sub_char1,
				t.sub_char2,
				t.sub_char3);
		dbUpdateKey("MSBHL5030_MST_AP_D_U04", apDL, apDL_bldr);
		
		MCQueryApiBuilder rmrksApDL_bldr = MCQueryApiBuilder.create(t);
		rmrksApDL_bldr.setSet(t.pay_schd_d_print_rmrks,
				t.pay_ntc_d_print_rmrks,
				t.intr_rmrks,
				t.sub_char1,
				t.sub_char2,
				t.sub_char3);
		dbUpdateKey("MSBHL5030_MST_AP_D_U05", rmrksApDL, rmrksApDL_bldr);
	}
	
	/**
	 * 引数で指定された支払予定に紐付く買掛消込予定を削除する。
	 * @param paySchdL 支払予定リスト
	 * @param updFlg 更新フラグ（更新から呼び出す場合にtrueを設定）
	 */
	protected void delApApplSchdCommon(MCList<MST_PAY_SCHD_R> paySchdL, boolean updFlg) {
		
		MCList<MST_PAY_SCHD_R> bindL = MCList.create(MST_PAY_SCHD_R.class);
		
		for (MST_PAY_SCHD_R paySchdR : paySchdL) {
			
			if (updFlg && justUpdRmrks(paySchdR.pay_chk_mng_no()) && !paySchdR.getBooleanNE("force")) {
				continue;
			}
			
			bindL.add(paySchdR);
		}
		
		MST_AP_APPL_SCHD_R dbc = MST_AP_APPL_SCHD_R.create("T");
		execDbDelete("MSBHL5030_MST_AP_APPL_SCHD_D01", dbc, dbc.pay_schd_no.eq(bind("pay_schd_no")), bindL);
	}
	
	/**
	 * 支払時税差額の買掛明細に紐付く仕入実績を取得する。
	 * @param taxDiffPayClApDL 支払時税差額の買掛明細リスト
	 * @return 仕入実績 リスト
	 */
	protected MCList<MST_PURC_ACT_R> getPurcActL(MCList<MST_AP_D_R> taxDiffPayClApDL) {
		
		MCList<MST_AP_D_R> bindL = taxDiffPayClApDL.distinctNE(MST_AP_D_R.$purc_act_no, MST_AP_D_R.$purc_act_seq);
		
		MCList<MST_PURC_ACT_R> purcActL = MCList.create(MST_PURC_ACT_R.class);
		MCQueryApiBuilder purcActL_bldr = MCQueryApiBuilder.create(MST_PURC_ACT_R.create("T"));
		dbSelectKey("MSBHL5030_MST_PURC_ACT_S01", purcActL, purcActL_bldr, bindL);
		MCIndexKey idx = purcActL.createIndex(MST_PURC_ACT_R.$purc_act_no, MST_PURC_ACT_R.$purc_act_seq);
		
		MCList<MST_PURC_ACT_R> tmpPurcActL = MCList.create(MST_PURC_ACT_R.class);
		for (MST_AP_D_R apDR : bindL) {
			MST_PURC_ACT_R purcActR = purcActL.getFirst(idx, apDR.purc_act_no(), apDR.purc_act_seq());
			if (!isNull(purcActR)) {
				continue;
			}
			
			// 仕入実績が存在しない分を生成する
			purcActR = tmpPurcActL.add();
			purcActR.purc_act_no(apDR.purc_act_no());
			purcActR.purc_act_seq(apDR.purc_act_seq());
			purcActR.trd_ptn_typ(MAC_TRD_PTN_TYP.PURC.value());
			purcActR.xrate_cd(getCo().purc_xrate_cd());
			purcActR.trd_cur_cd(apDR.trd_cur_cd());
			purcActR.base_cur_cd(getCo().base_cur_cd());
			purcActR.ptax_cur_cd(getCo().ptax_cur_cd());
			purcActR.asppl_cd(apDR.asppl_cd());
			
			purcActR.xrate(
				MAUCL_AmtUtil.getDefXrate(
					purcActR.trd_cur_cd(),
					purcActR.base_cur_cd(),
					purcActR.xrate_cd(),
					apDR.getDateNE("xrate_base_dt")));
			if (!isNull(getCo().ptax_cur_cd())) {
				purcActR.ptax_xrate(
					MAUCL_AmtUtil.getDefXrate(
						purcActR.trd_cur_cd(),
						getCo().ptax_cur_cd(),
						purcActR.xrate_cd(),
						apDR.getDateNE("xrate_base_dt")));
			}
		}
		purcActL.addAll(tmpPurcActL);
		
		return purcActL;
	}
	
	/**
	 * 支払時税差額の買掛明細に紐付く仕入実績明細を取得する。
	 * @param taxDiffPayClApDL 支払時税差額の買掛明細リスト
	 * @return 仕入実績明細
	 */
	protected MCList<MST_PURC_ACT_D_R> getPurcActDL(MCList<MST_AP_D_R> taxDiffPayClApDL) {
		
		MCList<MST_AP_D_R> bindL = taxDiffPayClApDL.distinctNE(MST_AP_D_R.$purc_act_d_no, MST_AP_D_R.$purc_act_d_seq);
		
		MCList<MST_PURC_ACT_D_R> purcActDL = MCList.create(MST_PURC_ACT_D_R.class);
		MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
		MST_PURC_ACT_IO_R t2 = MST_PURC_ACT_IO_R.create("T2");
		MCQueryApiBuilder purcActDL_bldr = MCQueryApiBuilder.create(t);
		purcActDL_bldr.removeSelect(MST_PURC_ACT_D_R.$lot_no);
		purcActDL_bldr.addSelect(t2.lot_no);
		purcActDL_bldr.removeSelect(MST_PURC_ACT_D_R.$sublot_no);
		purcActDL_bldr.addSelect(t2.sublot_no);
		purcActDL_bldr.removeSelect(MST_PURC_ACT_D_R.$gd_cd);
		purcActDL_bldr.addSelect(t2.gd_cd);
		purcActDL_bldr.removeSelect(MST_PURC_ACT_D_R.$in_to_loc_wg_cd);
		purcActDL_bldr.addSelect(t2.in_to_loc_wg_cd);
		purcActDL_bldr.removeSelect(MST_PURC_ACT_D_R.$in_to_loc_cd);
		purcActDL_bldr.addSelect(t2.in_to_loc_cd);
		purcActDL_bldr.removeSelect(MST_PURC_ACT_D_R.$str_ln_cd);
		purcActDL_bldr.addSelect(t2.str_ln_cd);
		purcActDL_bldr.removeSelect(MST_PURC_ACT_D_R.$quality_typ);
		purcActDL_bldr.addSelect(t2.quality_typ);
		purcActDL_bldr.removeSelect(MST_PURC_ACT_D_R.$stk_insp_typ);
		purcActDL_bldr.addSelect(t2.stk_insp_typ);
		purcActDL_bldr.removeSelect(MST_PURC_ACT_D_R.$stk_id_typ);
		purcActDL_bldr.addSelect(t2.stk_id_typ);
		purcActDL_bldr.addInnerJoin(t2,
				bracket(t.purc_act_d_no.eq(t2.purc_act_d_no)
						.and(t.purc_act_d_seq.eq(t2.purc_act_d_seq))));
		purcActDL_bldr.setOrderByAsc(
				t.purc_act_d_no, t.purc_act_d_seq,
				t2.purc_act_io_no,
				t2.purc_act_io_seq);
		dbSelectKey("MSBHL5030_MST_PURC_ACT_D_S01", purcActDL, purcActDL_bldr, bindL);
		MCIndexKey idx = purcActDL.createIndex(MST_PURC_ACT_D_R.$purc_act_d_no, MST_PURC_ACT_D_R.$purc_act_d_seq);
		
		MCList<MST_PURC_ACT_D_R> tmpPurcActDL = MCList.create(MST_PURC_ACT_D_R.class);
		for (MST_AP_D_R apDR : bindL) {
			MST_PURC_ACT_D_R purcActDR = purcActDL.getFirst(idx, apDR.purc_act_d_no(), apDR.purc_act_d_seq());
			if (!isNull(purcActDR)) {
				continue;
			}
			
			// 仕入実績が存在しない分を生成する
			purcActDR = tmpPurcActDL.add();
			purcActDR.purc_act_d_no(apDR.purc_act_d_no());
			purcActDR.purc_act_d_seq(apDR.purc_act_d_seq());
			purcActDR.ap_dpt_cd(apDR.ap_dpt_cd());
			purcActDR.bd_dpt_cd(apDR.ap_dpt_cd());
			purcActDR.itm_cd(MAC_STR.NULL_VAL.value());
			purcActDR.itm_sub1(MAC_STR.NULL_VAL.value());
			purcActDR.itm_sub2(MAC_STR.NULL_VAL.value());
			purcActDR.itm_sub3(MAC_STR.NULL_VAL.value());
			purcActDR.stk_mng_typ(MAC_STR.NULL_VAL.value());
			purcActDR.lot_no(MAC_STR.NULL_VAL.value());
			purcActDR.sublot_no(MAC_STR.NULL_VAL.value());
			purcActDR.sno1(MAC_STR.NULL_VAL.value());
			purcActDR.sno2(MAC_STR.NULL_VAL.value());
			purcActDR.sno3(MAC_STR.NULL_VAL.value());
			purcActDR.sno4(MAC_STR.NULL_VAL.value());
			purcActDR.quality_typ(MAC_QUALITY_TYP.GOOD.value());
			purcActDR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			purcActDR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
			purcActDR.trd_unit_cd(MAC_STR.NULL_VAL.value());
			purcActDR.base_unit_cd(MAC_STR.NULL_VAL.value());
			purcActDR.tax_cd(apDR.tax_cd());
		}
		purcActDL.addAll(tmpPurcActDL);
		
		return purcActDL;
	}
	
	/**
	 * 支払照合ＮＯを発番する。
	 * @param payChkR 支払照合ヘッダ
	 * @return 支払照合ＮＯ
	 */
	protected String getPayChkNo(PaySchd_HdrR upPayChkR) {
		
		ElmArgsR argsR = ElmArgsR.create();
		
		argsR.dpt_cd(upPayChkR.bsppl_dpt_cd());
		argsR.co_cd(getCo().co_cd());
		argsR.bp_cd(upPayChkR.bsppl_cd());
		MCDate dt = nvl(upPayChkR.bsppl_cl_dt(), upPayChkR.reg_dt());
		MAM_DPT_R dptR = MSBHL_PaySchdRegService.getDpt(upPayChkR.bsppl_dpt_cd(), dt);
		argsR.wg_cd(dptR.wg_cd());
		argsR.dt(upPayChkR.reg_dt());
		
		return getNum(MAC_NUM_BIZ_TYP.PAYCHK, argsR);
	}
	
	/**
	 * 割当比率に従って割り当てる<p>
	 * 
	 * 割当比率がゼロの場合、割当数もゼロになる<br>
	 * ただし、割当対象リストの比率がすべてゼロの場合は、割当対象リストに均等に割り当てる
	 */
	protected void propNE(
		MCList<?> trgt, MCNumber ttl, int scale, String propCol, String allocCol) {

		MCList<?> workL = trgt.shallowClone();
		String baseCol = "_base_amt_";
		workL.forEach(r -> {
			r.setNumberNE(baseCol, r.getNumber(propCol));
			r.setNumberNE(allocCol, 0);
		});
		if (ttl.isZero())	return;
		
		if (workL.subList(r -> r.getNumber(baseCol).isZero()).size() == trgt.size()) {
			// 全行金額＝０⇒均等に割り当てる
			workL.forEach(r -> r.setNumberNE(baseCol, 1));
		}
		else {
			workL = workL.subList(r -> !r.getNumber(baseCol).isZero());
		}
		
		FXUCC_Divide.propNE(workL, ttl, scale, baseCol, allocCol);
	}

///// キャッシュ関連
	/**
	 * 更新対象の支払照合ヘッダのキャッシュ
	 */
	protected FXUCL_Cache<MCList<MST_PAY_CHK_R>> _payChkCache = null;
	
	/**
	 * 更新対象の買掛明細のキャッシュ
	 */
	protected FXUCL_Cache<MCList<MST_AP_D_R>> _apDCache = null;
	
	/**
	 * 更新対象の支払予定のキャッシュ
	 */
	protected FXUCL_Cache<MCList<MST_PAY_SCHD_R>> _paySchdCache = null;
	
	/**
	 * 更新対象の支払実績のキャッシュ
	 */
	protected FXUCL_Cache<MCList<MST_PAY_ACT_D_R>> _payActDCache = null;
	
	/**
	 * 照合対象の支払実績のキャッシュ
	 */
	protected MCList<MST_PAY_ACT_D_R> _payActDCacheByPayChkCache = null;
	MCIndexKey _idxPayActDCacheByPayChk = null;
	
	/**
	 * 更新対象の前渡金実績のキャッシュ
	 */
	protected MCList<MST_ADV_PAY_ACT_R> _advPayActDCache = null;
	MCIndexKey _idxAdvPayActCache = null;
	MCIndexKey _idxAdvPayActCacheByAdvPayActNo = null;
	MCIndexKey _idxAdvPayActCacheByAdvPayChkMngNo = null;
	MCIndexKey _idxAdvPayActCacheByAdvPayActNoSeq = null;
	
	/**
	 * 更新対象の支払照合ヘッダ・買掛明細・支払予定のキャッシュを作成する。
	 * @param upPayChkL 上り電文の支払照合ヘッダリスト
	 */
	protected static void initPayCache(MCList<PaySchd_HdrR> upPayChkL) {
		object(CLAZZ)._initPayCache(upPayChkL);
	}
	
	protected void _initPayCache(MCList<PaySchd_HdrR> upPayChkL) {
		
		MCList<PaySchd_HdrR> payChkBindL = upPayChkL.subList(r->!isCrt(r));
		
		// 支払照合ヘッダ
		MCList<MST_PAY_CHK_R> payChkL = MCList.create(MST_PAY_CHK_R.class);
		MCQueryApiBuilder payChkL_bldr = MCQueryApiBuilder.create(MST_PAY_CHK_R.create("T"));
		dbSelectColumn("MSBHL5030_MST_PAY_CHK_S08", payChkL, payChkL_bldr, MST_PAY_CHK_R.$pay_chk_mng_no, payChkBindL, PaySchd_HdrR.$pay_chk_mng_no);
		
		if (_payChkCache == null) {
			_payChkCache = new FXUCL_Cache<MCList<MST_PAY_CHK_R>>();
			_payChkCache.setFixMaxCacheSize(-1);
		}
		
		for (MCList<MST_PAY_CHK_R> l : payChkL.groupList(MST_PAY_CHK_R.$pay_chk_mng_no)) {
			Comparable<?>[] key = l.get(0).toArray(MST_PAY_CHK_R.$pay_chk_mng_no);
			_payChkCache.putCache(key, l);
		}
		
		// 買掛明細
		MCList<MST_AP_D_R> apDL = MCList.create(MST_AP_D_R.class);
		MST_AP_D_R t1 = MST_AP_D_R.create("T");
		MCQueryApiBuilder apDL_bldr = MCQueryApiBuilder.create(t1);
		apDL_bldr.addConstWhereWithAnd(t1.valid_flg.eq(value(true)));
		dbSelectColumn("MSBHL5030_MST_AP_D_S10", apDL, apDL_bldr, MST_AP_D_R.$pay_chk_mng_no, payChkL, MST_PAY_CHK_R.$pay_chk_mng_no);
		if (_apDCache == null) {
			_apDCache = new FXUCL_Cache<MCList<MST_AP_D_R>>();
			_apDCache.setFixMaxCacheSize(-1);
		}
		
		for (MCList<MST_AP_D_R> l : apDL.groupList(MST_AP_D_R.$pay_chk_mng_no)) {
			Comparable<?>[] key = l.get(0).toArray(MST_AP_D_R.$pay_chk_mng_no);
			_apDCache.putCache(key, l);
		}
		
		// 支払予定
		MCList<MST_PAY_SCHD_R> paySchdL = MCList.create(MST_PAY_SCHD_R.class);
		MCQueryApiBuilder paySchdL_bldr = MCQueryApiBuilder.create(MST_PAY_SCHD_R.create("T"));
		dbSelectColumn("MSBHL5030_MST_PAY_SCHD_S03", paySchdL, paySchdL_bldr, MST_PAY_SCHD_R.$pay_chk_mng_no, payChkL, MST_PAY_CHK_R.$pay_chk_mng_no);
		if (_paySchdCache == null) {
			_paySchdCache = new FXUCL_Cache<MCList<MST_PAY_SCHD_R>>();
			_paySchdCache.setFixMaxCacheSize(-1);
		}
		
		for (MCList<MST_PAY_SCHD_R> l : paySchdL.groupList(MST_PAY_SCHD_R.$pay_chk_mng_no)) {
			Comparable<?>[] key = l.get(0).toArray(MST_PAY_SCHD_R.$pay_chk_mng_no);
			_paySchdCache.putCache(key, l);
		}
		
		// 支払実績
		MST_PAY_ACT_R t2 = MST_PAY_ACT_R.create("T2");

		MCList<MST_PAY_ACT_D_R> payActL = MCList.create(MST_PAY_ACT_D_R.class);
		MST_PAY_ACT_D_R t3 = MST_PAY_ACT_D_R.create("T");
		MCQueryApiBuilder payActL_bldr = MCQueryApiBuilder.create(t3);
		payActL.addDateColumn("ac_dt");
		payActL.addBooleanColumn(MST_PAY_ACT_R.$schd_act_flg);
		payActL_bldr.addSelect(t2.ac_dt, t2.schd_act_flg);
		payActL_bldr.addInnerJoin(t2,
				bracket(t2.pay_act_no.eq(t3.pay_act_no)
						.and(t2.pay_act_seq.eq(t3.pay_act_seq))
						.and(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
		dbSelectColumn("MSBHL5030_MST_PAY_ACT_D_S07", payActL, payActL_bldr, MST_PAY_ACT_D_R.$pay_chk_mng_no, payChkL, MST_PAY_CHK_R.$pay_chk_mng_no);
		if (_payActDCache == null) {
			_payActDCache = new FXUCL_Cache<MCList<MST_PAY_ACT_D_R>>();
			_payActDCache.setFixMaxCacheSize(-1);
		}
		
		for (MCList<MST_PAY_ACT_D_R> l : payActL.groupList(MST_PAY_SCHD_R.$pay_schd_no)) {
			Comparable<?>[] key = l.get(0).toArray(MST_PAY_ACT_D_R.$pay_schd_no);
			_payActDCache.putCache(key, l);
		}
	}
	
	/**
	 * 指定された支払照合管理ＮＯに対応する支払照合ヘッダを取得する。
	 * @param payChkMngNo 支払照合管理ＮＯ
	 * @return 支払照合ヘッダ
	 */
	protected static MST_PAY_CHK_R getCachePayChkR(String payChkMngNo) {
		return object(CLAZZ)._getPayChkR(payChkMngNo);
	}
	
	protected MST_PAY_CHK_R _getPayChkR(String payChkMngNo) {
		
		MCList<MST_PAY_CHK_R> lst = _getPayChkL(payChkMngNo);
		
		if (lst != null && !lst.isEmpty()) {
			
			return lst.get(0);
		}
		
		return null;
	}
	
	protected MCList<MST_PAY_CHK_R> _getPayChkL(String payChkMngNo) {
		
		return _payChkCache.getCache(payChkMngNo);
	}
	
	/**
	 * 指定された支払照合管理ＮＯに対応する支払予定を取得する。
	 * @param payChkMngNo 支払照合管理ＮＯ
	 * @return 支払予定リスト
	 */
	protected static MCList<MST_PAY_SCHD_R> getCachePaySchdL(String payChkMngNo) {
		return object(CLAZZ)._getPaySchdL(payChkMngNo);
	}
	
	protected MCList<MST_PAY_SCHD_R> _getPaySchdL(String payChkMngNo) {
		
		return _paySchdCache.getCache(payChkMngNo);
	}
	
	/**
	 * 指定された支払照合管理ＮＯに対応する買掛明細を取得する。
	 * @param payChkMngNo 支払照合管理ＮＯ
	 * @return 買掛明細リスト
	 */
	protected static MCList<MST_AP_D_R> getCacheApDL(String payChkMngNo) {
		return object(CLAZZ)._getApDL(payChkMngNo);
	}
	
	protected MCList<MST_AP_D_R> _getApDL(String payChkMngNo) {
		
		return _apDCache.getCache(payChkMngNo);
	}
	
	/**
	 * 指定された支払予定ＮＯに対応する支払実績を取得する。
	 * @param paySchdNo 支払予定ＮＯ
	 * @return 支払実績リスト
	 */
	protected static MCList<MST_PAY_ACT_D_R> getCachePayActDL(String paySchdNo) {
		return object(CLAZZ)._getPayActDL(paySchdNo);
	}
	
	protected MCList<MST_PAY_ACT_D_R> _getPayActDL(String paySchdNo) {
		
		return _payActDCache.getCache(paySchdNo);
	}
	
	/**
	 * 指定された支払照合管理ＮＯに対応する支払実績明細を取得する。
	 * @param pay_chk_mng_no 支払照合管理ＮＯ
	 * @return 支払実績明細リスト
	 */
	protected MCList<MST_PAY_ACT_D_R> getCachePayActLByPayChkMngNo(String pay_chk_mng_no){
		return object(CLAZZ)._getCachePayActLByPayChkMngNo(pay_chk_mng_no);
	}
	protected MCList<MST_PAY_ACT_D_R> _getCachePayActLByPayChkMngNo(String pay_chk_mng_no){
		MCList<MST_PAY_ACT_D_R> l = _payActDCacheByPayChkCache.subList(_idxPayActDCacheByPayChk, pay_chk_mng_no);
		return l;
	}
	
	protected static void initPayActDCacheByPayChkCache(MCList<PaySchd_HdrR> hdrL) {
		object(CLAZZ)._initPayActDCacheByPayChkCache(hdrL);
	}
	protected void _initPayActDCacheByPayChkCache(MCList<PaySchd_HdrR> hdrL) {
		_payActDCacheByPayChkCache = MCList.create(MST_PAY_ACT_D_R.class);
		MST_PAY_ACT_D_R t = MST_PAY_ACT_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(
				t.pay_act_d_no,
				t.pay_act_d_seq,
				t.calc_tgt_pay_chk_mng_no);
		dbc_bldr.setWhere(t.calc_tgt_pay_chk_mng_no.eq(bind("pay_chk_mng_no")));
		dbSelect("MSBHL5030_MST_PAY_ACT_D_S03", _payActDCacheByPayChkCache, dbc_bldr, hdrL);
		_idxPayActDCacheByPayChk = _payActDCacheByPayChkCache.createIndex(MST_PAY_ACT_D_R.$calc_tgt_pay_chk_mng_no);
	}
	

	/**
	 * 指定された支払予定管理先、支払予定管理先部門、取引通貨に対応する前渡金実績を取得する。
	 * @param bsppl_cd 支払予定管理先ＣＤ
	 * @param bsppl_dpt_cd 支払予定管理先部門ＣＤ
	 * @param trd_cur_cd 取引通貨ＣＤ
	 * @return 前渡金実績リスト
	 */
	protected MCList<MST_ADV_PAY_ACT_R> getCacheAdvPayActL(String bsppl_cd, String bsppl_dpt_cd, String trd_cur_cd){
		return object(CLAZZ)._getCacheAdvPayActL(bsppl_cd, bsppl_dpt_cd, trd_cur_cd);
	}
	protected MCList<MST_ADV_PAY_ACT_R> _getCacheAdvPayActL(String bsppl_cd, String bsppl_dpt_cd, String trd_cur_cd){
		MCList<MST_ADV_PAY_ACT_R> l = _advPayActDCache.subList(_idxAdvPayActCache, bsppl_cd, bsppl_dpt_cd, trd_cur_cd);
		return l;
	}
	/**
	 * 指定された支払照合管理ＮＯに対応する前渡金実績を取得する。
	 * @param pay_chk_mng_no 支払照合管理ＮＯ
	 * @return 前渡金実績リスト
	 */
	protected MCList<MST_ADV_PAY_ACT_R> getCacheAdvPayActLByPayChkMngNo(String pay_chk_mng_no){
		return object(CLAZZ)._getCacheAdvPayActLByPayChkMngNo(pay_chk_mng_no);
	}
	protected MCList<MST_ADV_PAY_ACT_R> _getCacheAdvPayActLByPayChkMngNo(String pay_chk_mng_no){
		MCList<MST_ADV_PAY_ACT_R> l = _advPayActDCache.subList(_idxAdvPayActCacheByAdvPayChkMngNo, pay_chk_mng_no);
		return l;
	}
	/**
	 * 指定された前渡金実績ＮＯに対応する前渡金実績を取得する。
	 * @param advPayActNo 前渡金実績ＮＯ
	 * @return 前渡金実績
	 */
	protected static MCList<MST_ADV_PAY_ACT_R> getCacheAdvPayActL(String advPayActNo) {
		return object(CLAZZ)._getCacheAdvPayActL(advPayActNo);
	}
	
	protected MCList<MST_ADV_PAY_ACT_R> _getCacheAdvPayActL(String advPayActNo) {
		MCList<MST_ADV_PAY_ACT_R> l = _advPayActDCache.subList(_idxAdvPayActCacheByAdvPayActNo, advPayActNo);
		return l;
	}
	/**
	 * 指定された前渡金実績ＮＯに対応する前渡金実績を取得する。
	 * @param advPayActNo 前渡金実績ＮＯ
	 * @param advPayActSeq 前渡金実績連番
	 * @return 前渡金実績
	 */
	protected static MST_ADV_PAY_ACT_R getCacheAdvPayActR(String advPayActNo, MCNumber advPayActSeq) {
		return object(CLAZZ)._getCacheAdvPayActR(advPayActNo, advPayActSeq);
	}
	
	protected MST_ADV_PAY_ACT_R _getCacheAdvPayActR(String advPayActNo, MCNumber advPayActSeq) {
		MST_ADV_PAY_ACT_R r = _advPayActDCache.getFirst(_idxAdvPayActCacheByAdvPayActNoSeq, advPayActNo, advPayActSeq);
		return r;
	}
	protected static void initAdvPayActCache(MCList<PaySchd_HdrR> hdrL) {
		object(CLAZZ)._initAdvPayActCache(hdrL);
	}
	protected void _initAdvPayActCache(MCList<PaySchd_HdrR> hdrL) {
		MST_ADV_PAY_ACT_R t2 = MST_ADV_PAY_ACT_R.create("T2");

		_advPayActDCache = MCList.create(MST_ADV_PAY_ACT_R.class);
		MST_ADV_PAY_ACT_R t = MST_ADV_PAY_ACT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(
				t.adv_pay_act_no,
				t.adv_pay_act_seq,
				t.bd_dpt_cd,
				t.trd_cur_setoff_tgt_amt,
				t.trd_cur_setoff_schd_amt,
				t.trd_cur_setoff_act_amt,
				t.pay_chk_mng_no,
				t.slip_sts_typ,
				t.upd_cntr);
		dbc_bldr.addInnerJoin(t2,
				bracket(t2.adv_pay_act_no.eq(t.adv_pay_act_no)
						.and(t2.adv_pay_act_seq.eq(t.adv_pay_act_seq))));
		dbc_bldr.setWhere(t.bsppl_cd.eq(bind("bsppl_cd")));
		dbc_bldr.addWhereWithAnd(t.bsppl_dpt_cd.eq(bind("bsppl_dpt_cd")));
		dbc_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("trd_cur_cd")));
		dbc_bldr.addLockTable(t2.adv_pay_act_no);
		dbSelectForUpdateNoWait("MSBHL5030_MST_ADV_PAY_ACT_S02", _advPayActDCache, dbc_bldr, hdrL.groupBy(MST_ADV_PAY_ACT_R.$bsppl_cd, MST_ADV_PAY_ACT_R.$bsppl_dpt_cd, MST_ADV_PAY_ACT_R.$trd_cur_cd));
		_idxAdvPayActCache = _advPayActDCache.createIndex(MST_ADV_PAY_ACT_R.$bsppl_cd, MST_ADV_PAY_ACT_R.$bsppl_dpt_cd, MST_ADV_PAY_ACT_R.$trd_cur_cd);
		_idxAdvPayActCacheByAdvPayChkMngNo = _advPayActDCache.createIndex(MST_ADV_PAY_ACT_R.$pay_chk_mng_no);
		_idxAdvPayActCacheByAdvPayActNo = _advPayActDCache.createIndex(MST_ADV_PAY_ACT_R.$adv_pay_act_no);
		_idxAdvPayActCacheByAdvPayActNoSeq = _advPayActDCache.createIndex(MST_ADV_PAY_ACT_R.$adv_pay_act_no, MST_ADV_PAY_ACT_R.$adv_pay_act_seq);
	}
	
	/**
	 * 備考のみ更新のキャッシュ<br>
	 * PaySchd_Chk01で判定した結果をキャッシュに格納し、PaySchd_Upd01では判定を行わずに、キャッシュから取得する）
	 */
	protected FXUCL_Cache<Boolean> _justUpdRmrksCache = null;
	
	/**
	 * 備考のみ更新のキャッシュを作成する。
	 * @param payChkMngNo 支払照合管理ＮＯ
	 * @param justUpdRmrks 備考のみ更新
	 */
	protected static void putJustUpdRmrksCache(String payChkMngNo , boolean justUpdRmrks) {
		object(CLAZZ)._putJustUpdRmrksCache(payChkMngNo , justUpdRmrks);
	}
	
	/**
	 * キャッシュから備考のみ更新を取得し返す。
	 * @param payChkMngNo 支払照合管理ＮＯ
	 * @return 備考のみ更新の場合はtrue
	 */
	protected static boolean justUpdRmrks(String payChkMngNo) {
		return object(CLAZZ)._justUpdRmrks(payChkMngNo);
	}
	
	protected void _putJustUpdRmrksCache(String payChkMngNo , boolean justUpdRmrks) {
	
		if (_justUpdRmrksCache == null) {
			_justUpdRmrksCache = new FXUCL_Cache<Boolean>();
			_justUpdRmrksCache.setFixMaxCacheSize(-1);
		}
		
		Comparable<?>[] key = {payChkMngNo};
		_justUpdRmrksCache.putCache(key, justUpdRmrks);
	}
	
	protected boolean _justUpdRmrks(String payChkMngNo) {
	
		if (_justUpdRmrksCache == null) {
			return false;
		}
		Comparable<?>[] key = {payChkMngNo};
		return _justUpdRmrksCache.getCache(key);
	}
	
	protected FXUCL_Cache<Boolean> _skipPayActCache = null;
	
	protected static void putSkipPayActCache(String paySchdNo , boolean skipPayAct) {
		object(CLAZZ)._putSkipPayActCache(paySchdNo , skipPayAct);
	}
	
	protected static boolean skipPayAct(String paySchdNo) {
		return object(CLAZZ)._skipPayAct(paySchdNo);
	}
	
	protected void _putSkipPayActCache(String paySchdNo , boolean skipPayAct) {
	
		if (_skipPayActCache == null) {
			_skipPayActCache = new FXUCL_Cache<Boolean>();
			_skipPayActCache.setFixMaxCacheSize(-1);
		}
		
		Comparable<?>[] key = {paySchdNo};
		_skipPayActCache.putCache(key, skipPayAct);
	}
	
	protected boolean _skipPayAct(String paySchdNo) {
	
		if (_skipPayActCache == null) {
			return false;
		}
		Comparable<?>[] key = {paySchdNo};
		if (isNull(_skipPayActCache.getCache(key))) {
			return false;
		}
		return _skipPayActCache.getCache(key);
	}

	/** 取引先マスタ取得 */
	protected FXUCL_Cache<MAM_BP_R> _bp;
	/**
	 * 取引先ＣＤから取引先マスタ情報を取得する。
	 * 
	 * @param bpCd
	 */
	public static MAM_BP_R getBp(String bpCd) {
		return object(CLAZZ)._getBp(bpCd);
	}

	protected MAM_BP_R _getBp(String bpCd) {
		if (_bp == null) {
			_bp = new FXUCL_Cache<MAM_BP_R>();
			_bp.setFixMaxCacheSize(-1);
		}
		if (isNull(_bp.getCache(bpCd))) {
			MAM_BP_R dbc = MAM_BP_R.create();
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MAM_BP_R.create("T"));
			dbSelectKey("MSBHL5030_MAM_BP_S05", dbc, dbc_bldr, bpCd);
			_setBp(dbc);
		}
		return _bp.getCache(bpCd);
	}

	/**
	 * 取引先マスタのＤＢコンテナをキャッシュに設定する
	 * 
	 * @param dbcL DBコンテナ
	 */
	public static void setBp(MCList<MAM_BP_R> dbcL) {
		for (MAM_BP_R dbc : dbcL) {
			object(CLAZZ)._setBp(dbc);
		}
	}

	/**
	 * 取引先マスタのＤＢコンテナをキャッシュに設定する
	 * 
	 * @param dbc DBコンテナ
	 */
	public static void setBp(MAM_BP_R dbc) {
		object(CLAZZ)._setBp(dbc);
	}

	protected void _setBp(MAM_BP_R dbc) {
		if (_bp == null) {
			_initBp();
		}
		_bp.putCache(new String [] {dbc.bp_cd()}, dbc);
	}

	/**
	 * 取引先マスタのキャッシュを初期化する
	 */
	public static void initBp() {
		object(CLAZZ)._initBp();
	}

	protected void _initBp() {
		_bp = new FXUCL_Cache<MAM_BP_R>();
		_bp.setFixMaxCacheSize(-1);
	}

	/** 品目マスタ取得 */
	protected FXUCL_Cache<MAM_ITM_R> _itm = null;
	
	protected static MAM_ITM_R getItm(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return object(CLAZZ)._getItm(itmCd, itmSub1, itmSub2, itmSub3);
	}

	protected MAM_ITM_R _getItm(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		if (_itm == null) {
			_itm = new FXUCL_Cache<MAM_ITM_R>();
			_itm.setFixMaxCacheSize(-1);
		}
		if (isNull(_itm.getCache(itmCd, itmSub1, itmSub2, itmSub3))) {
			MAM_ITM_R dbc = MAM_ITM_R.create();
			
			if (MAC_STR.isNULL_VAL(itmCd) && MAC_STR.isNULL_VAL(itmSub1) && MAC_STR.isNULL_VAL(itmSub2) && MAC_STR.isNULL_VAL(itmSub3)) {
				// 照合済残高振替で作成された買掛明細の品目は*になるが、エラーにしない
				dbc.itm_cd(itmCd);
				dbc.itm_sub1(itmSub1);
				dbc.itm_sub2(itmSub2);
				dbc.itm_sub3(itmSub3);
			} else {
				// 値引品目ＦＬＧ以外を検索する場合はSELECT句を追加する
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));
				dbSelectKey("MSBHL5030_MAM_ITM_S04", dbc, dbc_bldr, itmCd, itmSub1, itmSub2, itmSub3);
			}
			_setItm(dbc);
		}
		return _itm.getCache(itmCd, itmSub1, itmSub2, itmSub3);
	}

	/**
	 * 品目マスタのＤＢコンテナをキャッシュに設定する
	 * 
	 * @param dbcL DBコンテナ
	 */
	public static void setItm(MCList<MAM_ITM_R> dbcL) {
		for (MAM_ITM_R dbc : dbcL) {
			object(CLAZZ)._setItm(dbc);
		}
	}

	/**
	 * 品目マスタのＤＢコンテナをキャッシュに設定する
	 * 
	 * @param dbc DBコンテナ
	 */
	public static void setItm(MAM_ITM_R dbc) {
		object(CLAZZ)._setItm(dbc);
	}

	protected void _setItm(MAM_ITM_R dbc) {
		if (_itm == null) {
			_initItm();
		}
		String[] keys = new String[] {
				dbc.itm_cd(), 
				dbc.itm_sub1(),
				dbc.itm_sub2(),
				dbc.itm_sub3()
				};
		_itm.putCache(keys, dbc);
	}

	/**
	 * 品目マスタのキャッシュを初期化する
	 */
	public static void initItm() {
		object(CLAZZ)._initItm();
	}

	protected void _initItm() {
		_itm = new FXUCL_Cache<MAM_ITM_R>();
		_itm.setFixMaxCacheSize(-1);
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

	protected FXUCL_MCDbcCacheCW<MAM_DPT_R> _latestDpt;
	protected FXUCL_MCDbcCacheCW<MAM_DPT_R> _maxEndDt;

	/**
	 * 引数のMCRowに設定されている部門ＣＤをもとに適用終了日が最大の部門マスタから、
	 * 部門名、ＷＧ、ＷＧ名取得し、引数のMCRowに設定する
	 * 
	 * @param r 処理対象MCRow
	 * @param dptCdCol 部門ＣＤカラム名
	 * @param dptNmCol 部門名カラム名
	 */
	public static <R extends MCRow> R setLastDpt(R r, String dptCdCol, String dptNmCol) {
		return object(CLAZZ)._setLastDpt(r, dptCdCol, dptNmCol);
	}

	protected <R extends MCRow> R _setLastDpt(R r, String dptCdCol, String dptNmCol) {
		MAM_WG_R wg = MAM_WG_R.create("WG");
		MAM_DPT_R dptR = MAM_DPT_R.create();
		if (_latestDpt == null) {
			MAM_DPT_R t = MAM_DPT_R.create("T");
			MCQueryApiBuilder dptR_bldr = MCQueryApiBuilder.create(t);
			dptR_bldr.addSelect(wg.wg_nm);
			dptR_bldr.setWhere(t.dpt_cd.eq(bind("b1")));
			dptR_bldr.addWhereWithAnd(t.end_dt.eq(bind("b2")));
			dptR_bldr.addLeftOuterJoin(wg, bracket(t.wg_cd.eq(wg.wg_cd)));
			_latestDpt = new FXUCL_MCDbcCacheCW<MAM_DPT_R>(dptR_bldr);
		}
		dptR = _latestDpt.get(r.getStringNE(dptCdCol), getMaxEndDt(r, dptCdCol));

		r.setStringNE(dptCdCol, dptR.dpt_cd());
		if (!isNull(dptNmCol)) {
			r.setStringNE(dptNmCol, dptR.dpt_nm());
		}
		r.setStringNE(MAM_DPT_R.$wg_cd, dptR.wg_cd());
		r.setStringNE(MAM_WG_R.$wg_nm, dptR.getStringNE(MAM_WG_R.$wg_nm));
		return r;
	}

	protected MCDate getMaxEndDt(MCRow r, String dptCdCol) {
		if (_maxEndDt == null) {
			MAM_DPT_R t = MAM_DPT_R.create("T");
			MCQueryApiBuilder dptR_bldr = MCQueryApiBuilder.create(t);
			dptR_bldr.addMax(t.end_dt, MAM_DPT_R.$end_dt);
			dptR_bldr.setWhere(t.dpt_cd.eq(bind("b1")));
			_maxEndDt = new FXUCL_MCDbcCacheCW<MAM_DPT_R>(dptR_bldr);
		}
		return _maxEndDt.get(r.getStringNE(dptCdCol)).end_dt();
	}

	/** 通貨マスタ取得 */
	protected FXUCL_MCDbcCache<MAM_CUR_R> _cur;
	/**
	 * 通貨ＣＤから通貨マスタ情報を取得する。
	 * 
	 * @param curCd
	 */
	public static MAM_CUR_R getCur(String curCd) {
		return object(CLAZZ)._getCur(curCd);
	}
	protected MAM_CUR_R _getCur(String curCd) {
		if (_cur == null) {
			_cur = new FXUCL_MCDbcCache<MAM_CUR_R>(MCQueryApiBuilder.create(MAM_CUR_R.create("T")));
		}
		return _cur.get(curCd);
	}

	/** 決済方法マスタのキャッシュ */
	protected FXUCL_MCDbcCache<MAM_STTL_R> _sttlTyp;
	
	/**
	 * 債務決済方法に対応した債務決済区分を取得する。<BR>
	 * 引数の債務決済方法がNULL以外で債務決済方法マスタが取得できない場合はエラー。
	 * 
	 * @param apSttlCd 決済方法ＣＤ
	 * @return 債務決済区分
	 */
	public static MAM_STTL_R getApSttl(String apSttlCd) {
		return object(CLAZZ)._getApSttl(apSttlCd);
	}

	protected MAM_STTL_R _getApSttl(String sttlCd) {
		if (_sttlTyp == null){
			_sttlTyp = new FXUCL_MCDbcCache<MAM_STTL_R>(MCQueryApiBuilder.create(MAM_STTL_R.create("T")));
		}
		return _sttlTyp.get(sttlCd);
	}

	/** 決済方法マスタのキャッシュ */
	protected FXUCL_Cache<MCList<MAM_STTL_R>> _sttlCd;
	
	/**
	 * 債務決済方法取得<br />
	 * 
	 * 引数の債務決済区分より決済方法マスタのレコードを取得する
	 * 
	 * @param apSttlTyp 債務決済区分
	 * @return 決済方法ＣＤ
	 */
	public static MCList<MAM_STTL_R> getApSttlCd(String apSttlTyp) {
		return object(CLAZZ)._getApSttlCd(apSttlTyp);
	}

	protected MCList<MAM_STTL_R> _getApSttlCd(String apSttlTyp) {
		if (_sttlCd == null) {
			_sttlCd = new FXUCL_Cache<MCList<MAM_STTL_R>>();
			_sttlCd.setFixMaxCacheSize(-1);
		}
		if (isNull(_sttlCd.getCache(apSttlTyp))) {
			MCList<MAM_STTL_R> dbc = MCList.create(MAM_STTL_R.class);
			MAM_STTL_R t = MAM_STTL_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.addWhereWithAnd(t.ap_sttl_typ.eq(bind("1")), apSttlTyp);
			dbc_bldr.setOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbSelect("MSBHL5030_MAM_STTL_S01", dbc, dbc_bldr);
			_sttlCd.putCache(new Comparable[]{apSttlTyp}, dbc);
		}
		return _sttlCd.getCache(apSttlTyp);
	}

	/** 口座マスタ取得 */
	protected FXUCL_MCDbcCache<MAM_BANK_AC_R> _bankAc;
	/**
	 * 口座ＣＤから口座マスタ情報を取得する。
	 * 
	 * @param taxCd
	 */
	public static MAM_BANK_AC_R getBankAc(String bankAcCd) {
		return object(CLAZZ)._getBankAc(bankAcCd);
	}
	protected MAM_BANK_AC_R _getBankAc(String bankAcCd) {
		if (_bankAc == null) {
			MAM_BANK_R bank1 = MAM_BANK_R.create("BANK1");
			MAM_BANK_BRANCH_R branch1 = MAM_BANK_BRANCH_R.create("BRANCH1");

			MAM_BANK_AC_R t = MAM_BANK_AC_R.create("T");
			MCQueryApiBuilder bankAcR_bldr = MCQueryApiBuilder.create(t);
			bankAcR_bldr.addSelect(nvl(branch1.cal_cd, bank1.cal_cd).as("bank_cal_cd"));
			bankAcR_bldr.addLeftOuterJoin(bank1, t.bank_cd.eq(bank1.bank_cd));
			bankAcR_bldr.addLeftOuterJoin(branch1, t.bank_cd.eq(branch1.bank_cd)
					.and(t.branch_cd.eq(branch1.branch_cd)));
			_bankAc = new FXUCL_MCDbcCache<MAM_BANK_AC_R>(bankAcR_bldr);
		}
		return _bankAc.get(bankAcCd);
	}

	/** 部門に対応した銀行のカレンダＣＤキャッシュ */
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _dptCal;

	public static String getDptBankCal(MCDate stDt, String dptCd) {
		return object(CLAZZ)._getDptBankCal(stDt, dptCd);
	}
	protected String _getDptBankCal(MCDate stDt, String dptCd) {

		if (_dptCal == null){
			MAM_BANK_R bank1 = MAM_BANK_R.create("BANK1");
			MAM_BANK_AC_R bank_ac2 = MAM_BANK_AC_R.create("BANK_AC2");
			MAM_BANK_BRANCH_R branch1 = MAM_BANK_BRANCH_R.create("BRANCH1");

			MCList<MCRow> bindL = MCList.create(MCRow.class);
			MAM_DPT_R t = MAM_DPT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.addSelect(nvl(branch1.cal_cd, bank1.cal_cd).as("bank_cal_cd"));
			dbc_bldr.activeForeign(MAM_DPT_R.$BANK_AC2);
			dbc_bldr.addLeftOuterJoin(bank1, bank_ac2.bank_cd.eq(bank1.bank_cd));
			dbc_bldr.addLeftOuterJoin(branch1, bank_ac2.bank_cd.eq(branch1.bank_cd)
					.and(bank_ac2.branch_cd.eq(branch1.branch_cd)));
			_dptCal = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(dbc_bldr, bindL, MAM_DPT_R.$dpt_cd);
		}

		return _dptCal.get(stDt, dptCd).getStringNE("bank_cal_cd");
	}

	/** 為替レート取得キャッシュ */
	protected FXUCL_MCFuncCache<MCNumber> _xrateCache;

	/**
	 * 為替レート取得<br />
	 * 為替レートを取得する。
	 * 
	 * @param curCd 通貨ＣＤ
	 * @return 為替レート
	 */
	public static MCNumber getPurcXrate(String trdCurCd, MCDate stDt) {
		return object(CLAZZ)._getPurcXrate(trdCurCd, stDt);
	}
	protected MCNumber _getPurcXrate(String trdCurCd, MCDate stDt) {
		if (_xrateCache == null) {
			_xrateCache = new FXUCL_MCFuncCache<>(in -> {
				return MAPA_XCHNG$F_GET_PURC_XRATE(value((String) in[0]), value((MCDate) in[1]));
			});
		}
		return _xrateCache.get(trdCurCd, stDt);
	}

	/**
	 * 支払予定制御マスタ取得<br />
	 * 
	 * 支払予定制御マスタを取得する。
	 * 
	 * @param bspplCd 支払予定管理先ＣＤ
	 * @param bspplDptCd 支払予定管理先部門ＣＤ
	 * @param curCd 通貨ＣＤ
	 * @param apSttlCd 債務決済方法ＣＤ
	 * @param amt 金額
	 * @param baseDt 基準日
	 * 
	 * @return 支払予定制御マスタ情報
	 */
	public static MCList<MAM_PAY_SCHD_CTL_R> getPaySchdCtl(
			String bspplCd, String bspplDptCd ,String curCd, String apSttlCd, MCNumber amt, MCDate baseDt) {
		return object(CLAZZ)._getPaySchdCtl(bspplCd, bspplDptCd , curCd, apSttlCd, amt, baseDt);
	}

	protected MCList<MAM_PAY_SCHD_CTL_R> _getPaySchdCtl(
			String bspplCd, String bspplDptCd ,String curCd, String apSttlCd, MCNumber amt, MCDate baseDt) {

		// 支払予定管理先部門に対応するＷＧＣＤを取得
		String wgCd = getDpt(bspplDptCd, baseDt).wg_cd();
		if (isNull(wgCd)) {
			MCRow bindR = MCRow.create();
			bindR.setStringNE(MAM_DPT_R.$dpt_cd, bspplDptCd);
			setLastDpt(bindR, MAM_DPT_R.$dpt_cd, null);
			wgCd = bindR.getStringNE(MAM_WG_R.$wg_cd);
		}

		// 支払予定制御マスタを取得
		MCList<MAM_PAY_SCHD_CTL_R> l = srchRcvSchdCtl(bspplCd, wgCd, curCd, apSttlCd, amt);

		if (l.isEmpty()) {
			l = srchRcvSchdCtl(MAC_STR.NULL_VAL.value(), wgCd, curCd, apSttlCd, amt);
		}

		if (l.isEmpty()) {
			throw new MCAppException(MSBHL0022, bspplCd, wgCd, curCd);
		}
		return l;
	}

	protected FXUCL_Cache<MCList<MAM_PAY_SCHD_CTL_R>> _rcvSchdCtl;

	protected MCList<MAM_PAY_SCHD_CTL_R> srchRcvSchdCtl(
			String bspplCd, String wgCd, String curCd, String apSttlCd, MCNumber amt) {

		if (_rcvSchdCtl == null) {
			_rcvSchdCtl = new FXUCL_Cache<MCList<MAM_PAY_SCHD_CTL_R>>();
			_rcvSchdCtl.setFixMaxCacheSize(-1);
		}

		if (isNull(_rcvSchdCtl.getCache(bspplCd, wgCd, curCd, apSttlCd, amt))) {
			MAM_PAY_SCHD_CTL_R S1T2 = MAM_PAY_SCHD_CTL_R.create("T2");

			MCList<MAM_PAY_SCHD_CTL_R> dbcL = MCList.create(MAM_PAY_SCHD_CTL_R.class);
			MAM_PAY_SCHD_CTL_R t = MAM_PAY_SCHD_CTL_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.addWhereWithAnd(t.bsppl_cd.eq(bind("1")), bspplCd);
			dbcL_bldr.addWhereWithAnd(t.cur_cd.eq(bind("1")), curCd);
			dbcL_bldr.addWhereWithCutOffAnd(t.sttl_cd.eq(bind("1")), apSttlCd);
			dbcL_bldr.addWhereWithAnd(t.wg_cd.eq(bind("1")), wgCd);
			dbcL_bldr.addWhereWithAnd(t.del_flg.eq(value(false)));
			// 金額がnull、またはマイナスの時は下限金額が一番小さいレコードを取得する。
			if (isNull(amt) || amt.lt(MCNumber.ZERO)) {
				dbcL_bldr.addWhereWithAnd(
						t.min_amt.eq(subQuery()
								.select(min(S1T2.min_amt))
								.from(S1T2)
								.where(S1T2.bsppl_cd.eq(bind("1"))
										.and(S1T2.cur_cd.eq(bind("2")))
										.cutoff$and(S1T2.sttl_cd.eq(bind("3")))
										.and(S1T2.wg_cd.eq(bind("4"))))),
						bspplCd, curCd, apSttlCd, wgCd);
			}
			else {
				dbcL_bldr.addWhereWithAnd(
						t.min_amt.eq(subQuery()
								.select(max(S1T2.min_amt))
								.from(S1T2)
								.where(S1T2.bsppl_cd.eq(bind("1"))
										.and(S1T2.cur_cd.eq(bind("2")))
										.cutoff$and(S1T2.sttl_cd.eq(bind("3")))
										.and(S1T2.wg_cd.eq(bind("4")))
										.and(S1T2.min_amt.lte(bind("5"))))),
						bspplCd, curCd, apSttlCd, wgCd, amt);
			}
			dbcL_bldr.setOrderByAsc(t.sttl_cd);
			dbSelect("MSBHL5030_MAM_PAY_SCHD_CTL_S01", dbcL, dbcL_bldr);
			_setRcvSchdCtl(dbcL, bspplCd, wgCd, curCd, apSttlCd, amt);
		}
		return _rcvSchdCtl.getCache(bspplCd, wgCd, curCd, apSttlCd, amt);
	}

	protected void _setRcvSchdCtl(MCList<MAM_PAY_SCHD_CTL_R> dbcL,
			String bspplCd, String wgCd, String curCd, String apSttlCd, MCNumber amt) {
		Comparable<?>[] keys = new Comparable<?>[] {
			bspplCd, wgCd, curCd, apSttlCd, amt
		};
		_rcvSchdCtl.putCache(keys, dbcL);
	}

	/** 支払予定管理先部門ＣＤ取得キャッシュ */
	protected FXUCL_MCFuncCache<String> _bspplDptCdCache;

	/**
	 * 支払予定管理先部門ＣＤ取得<br />
	 * 支払予定管理先部門を取得する。
	 */
	public static String getBspplDptCd(String bspplCd, MCDate baseDt) {
		return object(CLAZZ)._getBspplDptCd(bspplCd, baseDt);
	}
	protected String _getBspplDptCd(String bspplCd, MCDate baseDt) {
		if (_bspplDptCdCache == null) {
			_bspplDptCdCache = new FXUCL_MCFuncCache<>(in -> {
				return MAPA_BP$F_GET_BSPPL_DPT_CD_NE(value((String) in[0]), value((MCDate) in[1]), value(false));
			});
		}
		return _bspplDptCdCache.get(bspplCd, baseDt);
	}

	/** 支払部門ＣＤ取得キャッシュ */
	protected FXUCL_MCFuncCache<String> _payDptCdCache;

	/**
	 * 支払部門ＣＤ取得<br />
	 * 支払部門を取得する。
	 */
	public static String getPayDptCd(String pspplCd, MCDate baseDt) {
		return object(CLAZZ)._getPayDptCd(pspplCd, baseDt);
	}
	protected String _getPayDptCd(String pspplCd, MCDate baseDt) {
		if (_payDptCdCache == null) {
			_payDptCdCache = new FXUCL_MCFuncCache<>(in -> {
				return MAPA_BP$F_GET_PAY_DPT_CD_NE(value((String) in[0]), value((MCDate) in[1]), value(false));
			});
		}
		return _payDptCdCache.get(pspplCd, baseDt);
	}

	/** 日付に対して有効な部門ＣＤをキャッシュ */
	protected FXUCL_MCFuncCache<String> _dptCdCache;

	protected static String getDptCd(String dptCd, MCDate acDt) {
		return object(CLAZZ)._getDptCd(dptCd, acDt);
	}
	protected String _getDptCd(String dptCd, MCDate acDt) {
		if (_dptCdCache == null) {
			_dptCdCache = new FXUCL_MCFuncCache<>(in -> {
				return MAPA_DPT$F_GET_DPT_CD(value((String) in[0]), value((MCDate) in[1]));
			});
		}
		return _dptCdCache.get(dptCd, acDt);
	}

	/**
	 * 納税通貨税額の取得
	 * 取引通貨税額を納税為替レートで換算する
	 * 
	 * @param trdCurTaxAmt 取引通貨税額
	 * @param ptaxXrate 納税為替レート
	 * @return 納税通貨税額
	 */
	protected MCNumber getPtaxCurTaxAmt(MCNumber trdCurTaxAmt, MCNumber ptaxXrate) {
		MCRow inRow = MCRow.create();
		MCRow outRow = MCRow.create();
		String ptaxCurCd = "O_PTAX_CUR_CD";
		String upriDecPlace = "O_UPRI_DEC_PLACE";
		String amtDecPlace = "O_AMT_DEC_PLACE";
		outRow.addStringColumn(ptaxCurCd);
		outRow.addNumberColumn(upriDecPlace);
		outRow.addNumberColumn(amtDecPlace);
		
		String procId = "MAPA_XCHNG$P_GET_PTAX_CUR_INFO";
		execProc(createSqlId(LOGIC_ID, procId, "01"),
				procId,
				inRow,
				outRow,
				":" + ptaxCurCd + ", " + ":" + upriDecPlace + ", " + ":" + amtDecPlace,
				ptaxCurCd, upriDecPlace, amtDecPlace
				);
		
		return convCur(trdCurTaxAmt, ptaxXrate,
				outRow.getNumber(amtDecPlace), getCo().xrate_rnd_typ());
	}

	/**
	 * 支払照合ヘッダの支払状況を取得する
	 * 
	 * @param upPayChkR 上り電文の支払照合リスト
	 * @param upPaySchdL 上り電文の支払予定リスト
	 * @return
	 */
	protected String getPayChkStsTyp(PaySchd_HdrR upPayChkR, MCList<PaySchd_DtlSchdR> upPaySchdL) {
		MCList<PaySchd_DtlSchdR> list = upPaySchdL.subList(r -> !isDel(r));
		if (list.isEmpty()) {
			return MSC_PAY_STS_TYP.PAY.value();
		}

		if (isUpd(upPayChkR)) {
			if (justUpdRmrks(upPayChkR.pay_chk_mng_no())) {
				MST_PAY_CHK_R payChkR = getCachePayChkR(upPayChkR.pay_chk_mng_no());
				return payChkR.pay_sts_typ();
			}
			
			java.util.Set<String> set = new java.util.HashSet<>();
			MCList<MST_PAY_SCHD_R> paySchdL = getCachePaySchdL(upPayChkR.pay_chk_mng_no());
			upPaySchdL.forEach(r -> {
				// 予定時実績の場合は後で更新されるので、初期値として未払を設定しておく
				String typ = MSC_PAY_STS_TYP.NOT_PAY.value();
				if (existsPayActD(r.pay_schd_no()) || skipPayAct(r.pay_schd_no())) {
					MST_PAY_SCHD_R paySchdR = paySchdL.getFirst(MST_PAY_SCHD_R.$pay_schd_no, r.pay_schd_no());
					if (!isNull(paySchdR)) {
						typ = paySchdR.pay_sts_typ();
					}
				}
				set.add(typ);
			});
			return set.size() == 1 ?
				set.toArray(new String[set.size()])[0] : MSC_PAY_STS_TYP.PART_PAY.value();
		}
		return MSC_PAY_STS_TYP.NOT_PAY.value();
	}

	/**
	 * 外貨か判定する
	 * 
	 * @param curCd	通貨ＣＤ
	 * @return 外貨の場合trueを返却する
	 */
	protected boolean isForeignCurCd(String curCd) {
		return !isSame(curCd, getCo().base_cur_cd());
		
	}

	/**
	 * インボイス取引対象の発注先か判定する
	 * 
	 * @param spplCd 発注先ＣＤ
	 * @param rcptIvNo 受領インボイスＮＯ
	 * @return インボイス取引対象の場合trueを返却する
	 */
	protected boolean isIv(String spplCd, String rcptIvNo) {
		MAM_BP_R bpR = getBp(spplCd);
		return !isNull(bpR) && bpR.sppl_iv_flg() && !isNullOrNullVal(rcptIvNo);
	}

	/**
	 * 残高振替後の買掛明細であるか判定する
	 * 
	 * @param param apdR 買掛明細
	 * @return 残高振替後の買掛明細の場合trueを返却する
	 */
	protected boolean isSw(MST_AP_D_R apdR) {
		return !isNull(apdR) && (!isNullAnd(apdR.sw_src_ap_d_no(), apdR.sw_src_pay_schd_no())) ;
	}

	/**
	 * 消費税差額によって作成された買掛明細か判定する
	 * @param apdR 買掛明細
	 * @return 差額分の場合trueを返却する
	 */
	protected boolean isAdjustApd(MST_AP_D_R apdR) {
		return MAC_TRD_PTN_TYP.isTAX_DIFF_PAY_SCHD_CL(apdR.trd_ptn_typ());
	}
	
	/**
	 * 無効な買掛明細か判定する
	 * @param apDR 上り電文の買掛明細
	 * @return 無効な買掛明細の場合trueを返却する
	 */
	protected boolean isInvalidApd(PaySchd_DtlApdR apDR) {
		return isDel(apDR) || (isAdjustApd(apDR.ap_d())
				&& (MAC_SLIP_STS_TYP.isDIS(apDR.slip_sts_typ())
						|| MAC_SLIP_STS_TYP.isCAN(apDR.slip_sts_typ())));
	}

	/**
	 * 予定登録時に相殺分の支払実績を作成するか判定する
	 */
	protected boolean isApSetOffActFlg(PaySchd_DtlSchdR r) {
		boolean setoffActFlg = false;
		MAM_STTL_R sttlR = getApSttl(r.ap_sttl_cd());

		// true の場合、登録と同時に相殺の支払実績を作成する
		if (MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())) {
			if (MAC_AP_SETOFF_TYP.isACST(r.ap_setoff_typ())
				|| MAC_AP_SETOFF_TYP.isPRSPPL(r.ap_setoff_typ())
				|| !isNull(r.adv_pay_act_no())
				|| !sttlR.ap_setoff_act_flg()) {
				setoffActFlg = true;
			}
		}
		else if (MAC_AP_STTL_TYP.isWTAX(r.ap_sttl_typ())) {
			setoffActFlg = true;
		}

		return setoffActFlg;
	}

	/**
	 * 予定時に作成した相殺分の支払実績が存在するか判定する
	 */
	protected boolean existsSchdActFlg(MCList<MST_PAY_ACT_D_R> payActDL) {
		if (isNull(payActDL)) {
			return false;
		}
		return !isNull(payActDL.getFirst(MST_PAY_ACT_R.$schd_act_flg, true));
	}

	/**
	 * 支払実績登録による実績が存在するか判定する
	 */
	protected boolean existsPayActD(MCList<PaySchd_DtlSchdR> list) {
		for (PaySchd_DtlSchdR r : list) {
			if (existsPayActD(r.pay_schd_no())) {
				return true;
			}
		}
		return false;
	}
	protected boolean existsPayActD(String paySchdNo) {
		MCList<MST_PAY_ACT_D_R> actDL = getCachePayActDL(paySchdNo);
		if (!isNull(actDL)) {
			MST_PAY_ACT_D_R actDR = actDL.getFirst(MST_PAY_ACT_R.$schd_act_flg, false);
			if (!isNull(actDR)) {
				// 支払実績登録による実績あり
				return true;
			}
		}
		return false;
	}


	/**
	 * 支払照合に対する更新カウンタチェックを行うか
	 * @param up0 上り電文の支払照合
	 * @return true：行う、false：行わない
	 */
	protected boolean isUpdCntrChk(MCList<PaySchd_HdrR> up0) {
		if (!isNull(up0) && up0.get(0).upd_cntr_chk_flg()) {
			return true;
		}
		return false;
	}

	/**
	 * 指定された買掛明細が新規かどうか。
	 * @param apDR 上り電文の買掛明細
	 * @return 新規の場合はtrue
	 */
	protected boolean isCrt(PaySchd_DtlApdR apDR) {
		
		return MAC_DATA_CRUD_TYP.isCRT(apDR.data_crud_typ());
	}
	
	/**
	 * 指定された買掛明細が更新かどうか。
	 * @param apDR 上り電文の買掛明細
	 * @return 新規の場合はtrue
	 */
	protected boolean isUpd(PaySchd_DtlApdR apDR) {
		
		return MAC_DATA_CRUD_TYP.isUPD(apDR.data_crud_typ());
	}
	
	/**
	 * 指定された買掛明細が削除かどうか。
	 * @param apDR 上り電文の買掛明細
	 * @return 削除の場合はtrue
	 */
	protected boolean isDel(PaySchd_DtlApdR apDR) {
		
		return MAC_DATA_CRUD_TYP.isDEL(apDR.data_crud_typ());
	}
	
	/**
	 * 指定された支払予定が新規かどうか。
	 * @param paySchdR 上り電文の買掛明細
	 * @return 新規の場合はtrue
	 */
	protected boolean isCrt(PaySchd_DtlSchdR paySchdR) {
		
		return MAC_DATA_CRUD_TYP.isCRT(paySchdR.data_crud_typ());
	}
	
	/**
	 * 指定された支払予定が更新かどうか。
	 * @param paySchdR 上り電文の買掛明細
	 * @return 新規の場合はtrue
	 */
	protected boolean isUpd(PaySchd_DtlSchdR paySchdR) {
		
		return MAC_DATA_CRUD_TYP.isUPD(paySchdR.data_crud_typ());
	}
	
	/**
	 * 指定された支払予定が削除かどうか。
	 * @param paySchdR 上り電文の買掛明細
	 * @return 削除の場合はtrue
	 */
	protected boolean isDel(PaySchd_DtlSchdR paySchdR) {
		
		return MAC_DATA_CRUD_TYP.isDEL(paySchdR.data_crud_typ());
	}
	
	/**
	 * 指定された支払照合ヘッダが新規かどうか。
	 * @param payChkR 上り電文の買掛明細
	 * @return 新規の場合はtrue
	 */
	protected boolean isCrt(PaySchd_HdrR payChkR) {
		
		return MAC_DATA_CRUD_TYP.isCRT(payChkR.data_crud_typ());
	}
	
	/**
	 * 指定された支払照合ヘッダが更新かどうか。
	 * @param payChkR 上り電文の買掛明細
	 * @return 新規の場合はtrue
	 */
	protected boolean isUpd(PaySchd_HdrR payChkR) {
		
		return MAC_DATA_CRUD_TYP.isUPD(payChkR.data_crud_typ());
	}
	
	/**
	 * 指定された支払照合ヘッダが削除かどうか。
	 * @param payChkR 上り電文の買掛明細
	 * @return 削除の場合はtrue
	 */
	protected boolean isDel(PaySchd_HdrR payChkR) {
		
		return MAC_DATA_CRUD_TYP.isDEL(payChkR.data_crud_typ());
	}

	/**
	 * 支払通知書ヘッダ履歴と支払通知書明細履歴を登録する。
	 * @param insPayNtcHisL 支払通知書ヘッダ履歴登録リスト
	 */
	protected void insPayNtcHis(MCList<MST_PAY_CHK_R> insPayNtcHisL) {
		
		if (insPayNtcHisL.isEmpty()) {
			return;
		}
		
		MCList<MST_PAY_NTC_HIS_R> payNtcHisL = MCList.create(MST_PAY_NTC_HIS_R.class);
		MCList<MST_PAY_NTC_D_HIS_R> payNtcDHisL = MCList.create(MST_PAY_NTC_D_HIS_R.class);
		
		// 最新データの取得
		insPayChkWk(insPayNtcHisL);
		MCList<MST_PAY_CHK_R> payChkL = getPayChk();
		MCList<MST_AP_D_R> apDL = getApD();
		MCList<MST_PAY_ACT_D_R> payActDL = getPayActD();
		MCList<MST_ADV_PAY_ACT_R> advPayActL = getAdvPayAct();
		
		// インデックスキーの作成
		MCIndexKey idxApD = apDL.createIndex(MST_AP_D_R.$pay_chk_mng_no);
		MCIndexKey idxPayActD = payActDL.createIndex(MST_PAY_ACT_D_R.$calc_tgt_pay_chk_mng_no);
		MCIndexKey idxAdvPayAct = advPayActL.createIndex(MST_ADV_PAY_ACT_R.$pay_chk_mng_no);
		
		// 履歴ＮＯをキャッシュする
		doSeqCache(MSC_NUM_SYS_TYP.PAYNTCHISNO, payChkL.size());
		doSeqCache(MSC_NUM_SYS_TYP.PAYNTCDHISNO,
				apDL.size() + payActDL.size() + advPayActL.size() + advPayActL.subList(r -> !isNull(r.com_paid_ap_sttl_cd())).size());
		
		for (MST_PAY_CHK_R payChkR : payChkL) {
			
			// 支払照合ヘッダに紐づくデータを取得
			MCList<MST_AP_D_R> apDSubL = apDL.subList(idxApD, payChkR.pay_chk_mng_no());
			MCList<MST_PAY_ACT_D_R> payActDSubL = payActDL.subList(idxPayActD, payChkR.pay_chk_mng_no());
			MCList<MST_ADV_PAY_ACT_R> advPayActSubL = advPayActL.subList(idxAdvPayAct, payChkR.pay_chk_mng_no());
			
			// 支払通知書ヘッダ履歴を設定
			MST_PAY_NTC_HIS_R payNtcHisR = MST_PAY_NTC_HIS_R.create();
			MST_AP_D_R apDR = MST_AP_D_R.create();
			if (!apDSubL.isEmpty()) {
				apDR = apDSubL.get(0);
			}
			copy(payNtcHisR, payChkR, apDR, createMap_MST_PAY_NTC_HIS_R_MST_PAY_CHK_R());
			payNtcHisL.add(payNtcHisR);
			
			// 支払通知書明細履歴を設定
			addAll(payNtcDHisL, apDSubL, payNtcHisR, createMap_MST_PAY_NTC_D_HIS_R_MST_AP_D_R());
			addAll(payNtcDHisL, payActDSubL, payNtcHisR, createMap_MST_PAY_NTC_D_HIS_R_MST_PAY_ACT_D_R());
			addAllAdvPayAct(payNtcDHisL, advPayActSubL, payNtcHisR);
		}
		
		// 支払通知書ヘッダ履歴の登録
		MCQueryApiBuilder payNtcHisL_bldr = MCQueryApiBuilder.create(MST_PAY_NTC_HIS_R.create("T"));
		dbInsertEx("MSBHL5030_MST_PAY_NTC_HIS_I01", payNtcHisL, payNtcHisL_bldr);
		
		// 支払通知書明細履歴の登録
		MCQueryApiBuilder payNtcDHisL_bldr = MCQueryApiBuilder.create(MST_PAY_NTC_D_HIS_R.create("T"));
		dbInsertEx("MSBHL5030_MST_PAY_NTC_D_HIS_I01", payNtcDHisL, payNtcDHisL_bldr);
	}

	/**
	 * 支払照合ヘッダワークテーブルを登録する。
	 * @param payChkWkL 支払照合ヘッダワークリスト
	 */
	protected void insPayChkWk(MCList<MST_PAY_CHK_R> payChkWkL) {
		
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_PAY_CHK_R.create("T"));
		dbWkDelete("MSBHL5030_MSW_PAY_CHK_D05", dbc_bldr.getBaseDbc());
		dbWkInsert("MSBHL5030_MSW_PAY_CHK_I03", payChkWkL.groupBy(payChkWkL.createRow().getKeyColumn()), dbc_bldr.getBaseDbc());
	}

	/**
	 * 支払照合ヘッダを取得する。
	 * @return 支払照合ヘッダ
	 */
	protected MCList<MST_PAY_CHK_R> getPayChk() {
		
		MCList<MST_PAY_CHK_R> payChkL = MCList.create(MST_PAY_CHK_R.create());
		MST_PAY_CHK_R t = MST_PAY_CHK_R.create("T");
		MSW_PAY_CHK_KEY_R w1 = MSW_PAY_CHK_KEY_R.create("W1");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.addInnerJoin(w1, bracket(w1.pay_chk_mng_no.eq(t.pay_chk_mng_no)));
		dbSelect("MSBHL5030_MST_PAY_CHK_S09", payChkL, dbc_bldr);
		return payChkL;
	}

	/**
	 * 買掛明細を取得する。
	 * @return 買掛明細
	 */
	protected MCList<MST_AP_D_R> getApD() {
		
		MCList<MST_AP_D_R> apDL = MCList.create(MST_AP_D_R.class);
		MST_AP_D_R t = MST_AP_D_R.create("T");
		MSW_PAY_CHK_KEY_R w1 = MSW_PAY_CHK_KEY_R.create("W1");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.addInnerJoin(w1, bracket(w1.pay_chk_mng_no.eq(t.pay_chk_mng_no)));
		dbSelect("MSBHL5030_MST_AP_D_S14", apDL, dbc_bldr);
		return apDL;
	}

	/**
	 * 支払実績明細を取得する。
	 * @return 支払実績明細
	 */
	private MCList<MST_PAY_ACT_D_R> getPayActD() {
		
		MCList<MST_PAY_ACT_D_R> payActDL = MCList.create(MST_PAY_ACT_D_R.class);
		payActDL.addDateColumn(MST_PAY_ACT_R.$ac_dt);
		
		MST_PAY_ACT_D_R t = MST_PAY_ACT_D_R.create("T");
		MSW_PAY_CHK_KEY_R w1 = MSW_PAY_CHK_KEY_R.create("W1");
		MST_PAY_ACT_R t2 = MST_PAY_ACT_R.create("T2");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.addSelect(t2.slip_sts_typ);
		dbc_bldr.addSelect(t2.pay_act_dt);
		dbc_bldr.addInnerJoin(w1, bracket(w1.pay_chk_mng_no.eq(t.calc_tgt_pay_chk_mng_no)));
		dbc_bldr.addInnerJoin(t2,
				bracket(t2.pay_act_no.eq(t.pay_act_no)
						.and(t2.pay_act_seq.eq(t.pay_act_seq))));
		dbSelect("MSBHL5030_MST_PAY_ACT_D_S09", payActDL, dbc_bldr);
		if (!isNull(payActDL)) {
			setBillTaxDispFlg(payActDL);
		}
		return payActDL;
	}

	/**
	 * 前渡金実績を取得する。
	 * @return 前渡金実績
	 */
	private MCList<MST_ADV_PAY_ACT_R> getAdvPayAct() {
		
		MCList<MST_ADV_PAY_ACT_R> advPayActL = MCList.create(MST_ADV_PAY_ACT_R.class);
		MST_ADV_PAY_ACT_R t = MST_ADV_PAY_ACT_R.create("T");
		MSW_PAY_CHK_KEY_R w1 = MSW_PAY_CHK_KEY_R.create("W1");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.addInnerJoin(w1, bracket(w1.pay_chk_mng_no.eq(t.pay_chk_mng_no)));
		dbSelect("MSBHL5030_MST_ADV_PAY_ACT_S06", advPayActL, dbc_bldr);
		if (!isNull(advPayActL)) {
			setBillTaxDispFlg(advPayActL);
		}
		return advPayActL;
	}

	/**
	 * 支払通知書明細履歴（前渡金実績）を設定する。
	 * @param payNtcDHisL 支払通知書明細履歴
	 * @param advPayActSubL 前渡金実績
	 * @param payNtcHisR 支払通知書ヘッダ履歴
	 */
	protected void addAllAdvPayAct(MCList<MST_PAY_NTC_D_HIS_R> payNtcDHisL,
			MCList<MST_ADV_PAY_ACT_R> advPayActSubL, MST_PAY_NTC_HIS_R payNtcHisR) {
		
		for (MST_ADV_PAY_ACT_R advPayActR : advPayActSubL) {
			MST_PAY_NTC_D_HIS_R payNtcDHisR = MST_PAY_NTC_D_HIS_R.create();
			
			// 手数料以外のデータを設定する
			payNtcDHisR.pay_ntc_d_his_no(getStrSeq(MSC_NUM_SYS_TYP.PAYNTCDHISNO));
			payNtcDHisR.pay_ntc_his_no(payNtcHisR.pay_ntc_his_no());
			payNtcDHisR.adv_pay_act_no(advPayActR.adv_pay_act_no());
			payNtcDHisR.adv_pay_act_seq(advPayActR.adv_pay_act_seq());
			payNtcDHisR.pay_ntc_d_his_typ(MAC_PAY_NTC_D_HIS_TYP.ADV_PAY_ACT.value());
			payNtcDHisR.slip_sts_typ(advPayActR.slip_sts_typ());
			payNtcDHisR.pay_act_dt(advPayActR.pay_act_dt());
			payNtcDHisR.trd_cur_amt(advPayActR.trd_cur_amt());
			payNtcDHisR.base_cur_amt(advPayActR.base_cur_amt());
			payNtcDHisR.ap_sttl_cd(advPayActR.ap_sttl_cd());
			payNtcDHisR.adv_pay_act_sub_char1(advPayActR.sub_char1());
			payNtcDHisR.adv_pay_act_sub_char2(advPayActR.sub_char2());
			payNtcDHisR.adv_pay_act_sub_char3(advPayActR.sub_char3());
			payNtcDHisL.add(payNtcDHisR);
			
			// 手数料のデータを設定する
			if (!isNull(advPayActR.com_paid_ap_sttl_cd())) {
				MST_PAY_NTC_D_HIS_R comPaidR = payNtcDHisR.clone();
				comPaidR.pay_ntc_d_his_no(getStrSeq(MSC_NUM_SYS_TYP.PAYNTCDHISNO));
				comPaidR.tax_cd(advPayActR.trd_cur_com_paid_tax_cd());
				if (advPayActR.getBooleanNE(MAM_STTL_R.$bill_tax_disp_flg)) {
					comPaidR.trd_cur_amt(getTrdCurSetoffAmtExcludingTax(advPayActR));
					comPaidR.trd_cur_tax_amt(advPayActR.trd_cur_com_paid_tax_amt());
					comPaidR.base_cur_amt(getBaseSetoffCurAmtExcludingTax(advPayActR));
					comPaidR.base_cur_tax_amt(advPayActR.base_cur_com_paid_tax_amt());
				}
				else {
					comPaidR.trd_cur_amt(advPayActR.trd_cur_com_paid());
					comPaidR.base_cur_amt(advPayActR.base_cur_com_paid());
				}
				comPaidR.ap_sttl_cd(advPayActR.com_paid_ap_sttl_cd());
				payNtcDHisL.add(comPaidR);
			}
		}
	}
	
	protected MCNumber getTrdCurSetoffAmtExcludingTax(MST_ADV_PAY_ACT_R advPayActR) {
		return nvl(advPayActR.trd_cur_exc_com_paid(), nvl(advPayActR.trd_cur_com_paid(), MCNumber.ZERO));
	}
	
	protected MCNumber getBaseSetoffCurAmtExcludingTax(MST_ADV_PAY_ACT_R advPayActR) {
		return nvl(advPayActR.base_cur_exc_com_paid(), nvl(advPayActR.base_cur_com_paid(), MCNumber.ZERO));
	}

	// 支払通知書ヘッダ履歴設定用Mapper
	protected Map_MST_PAY_NTC_HIS_R_MST_PAY_CHK_R<MST_PAY_NTC_HIS_R,MST_PAY_CHK_R, MST_AP_D_R> createMap_MST_PAY_NTC_HIS_R_MST_PAY_CHK_R() {
		return new Map_MST_PAY_NTC_HIS_R_MST_PAY_CHK_R<MST_PAY_NTC_HIS_R, MST_PAY_CHK_R, MST_AP_D_R>();
	}
	public class Map_MST_PAY_NTC_HIS_R_MST_PAY_CHK_R<D extends MST_PAY_NTC_HIS_R, S extends MST_PAY_CHK_R, W extends MST_AP_D_R> extends MAUCC_RowMapperWith<D,S,W>{
		
		protected W _apD;
		
		@Override
		public void setWith(W _apD) {
			this._apD = _apD;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_PAY_NTC_HIS_R.$pay_chk_no, MST_PAY_CHK_R.$pay_chk_no);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$pay_ntc_rev, MST_PAY_CHK_R.$pay_ntc_rev);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$pay_spot_flg, MST_PAY_CHK_R.$pay_spot_flg);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$rcpt_iv_no, MST_PAY_CHK_R.$rcpt_iv_no);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$reg_dt, MST_PAY_CHK_R.$reg_dt);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$wrk_no, MST_PAY_CHK_R.$wrk_no);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$bsppl_cd, MST_PAY_CHK_R.$bsppl_cd);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$bsppl_dpt_cd, MST_PAY_CHK_R.$bsppl_dpt_cd);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$pay_xrate, MST_PAY_CHK_R.$pay_xrate);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$trd_cur_cd, MST_PAY_CHK_R.$trd_cur_cd);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$last_pay_schd_amt, MST_PAY_CHK_R.$last_pay_schd_amt);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$bfw_amt, MST_PAY_CHK_R.$bfw_amt);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$purc_amt, MST_PAY_CHK_R.$purc_amt);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$purc_dscnt_amt, MST_PAY_CHK_R.$purc_dscnt_amt);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$purc_ret_amt, MST_PAY_CHK_R.$purc_ret_amt);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$sw_to_amt, MST_PAY_CHK_R.$sw_to_amt);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$sw_amt, MST_PAY_CHK_R.$sw_amt);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$schd_pay_amt, MST_PAY_CHK_R.$schd_pay_amt);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$adv_pay_bal, MST_PAY_CHK_R.$adv_pay_bal);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$adv_pay_amt, MST_PAY_CHK_R.$adv_pay_amt);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$adv_pay_setoff_amt, MST_PAY_CHK_R.$adv_pay_setoff_amt);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$adv_pay_setoff_tax_amt, MST_PAY_CHK_R.$adv_pay_setoff_tax_amt);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$sub_char1, MST_PAY_CHK_R.$sub_char1);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$sub_char2, MST_PAY_CHK_R.$sub_char2);
			addColumnPathMap(MST_PAY_NTC_HIS_R.$sub_char3, MST_PAY_CHK_R.$sub_char3);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.pay_ntc_his_no(getStrSeq(MSC_NUM_SYS_TYP.PAYNTCHISNO));
			dest.pay_amt(sum(src.account_amt(), src.cash_amt(), src.note_amt()));
			dest.setoff_amt(nvl(src.setoff_amt(), MCNumber.ZERO).negate());
			dest.tax_amt(src.tax_amt().subtract(nvl(src.setoff_tax_amt(), MCNumber.ZERO)));
			dest.latest_flg(true);
			if (!src.pay_spot_flg()) {
				dest.bsppl_cl_dt(src.bsppl_cl_dt());
			}
			else {
				dest.bsppl_cl_dt(_apD.pay_basis_dt());
			}
		}
	}

	// 支払通知書明細履歴（買掛明細）設定用Mapper
	protected Map_MST_PAY_NTC_D_HIS_R_MST_AP_D_R<MST_PAY_NTC_D_HIS_R,MST_AP_D_R, MST_PAY_NTC_HIS_R> createMap_MST_PAY_NTC_D_HIS_R_MST_AP_D_R() {
		return new Map_MST_PAY_NTC_D_HIS_R_MST_AP_D_R<MST_PAY_NTC_D_HIS_R, MST_AP_D_R, MST_PAY_NTC_HIS_R>();
	}
	public class Map_MST_PAY_NTC_D_HIS_R_MST_AP_D_R<D extends MST_PAY_NTC_D_HIS_R, S extends MST_AP_D_R, W extends MST_PAY_NTC_HIS_R> extends MAUCC_RowMapperWith<D,S,W>{
		
		protected W _payNtcHis;
		
		@Override
		public void setWith(W _payNtcHis) {
			this._payNtcHis = _payNtcHis;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$ap_d_no, MST_AP_D_R.$ap_d_no);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$po_no, MST_AP_D_R.$po_no);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$po_d_no, MST_AP_D_R.$po_d_no);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$purc_act_no, MST_AP_D_R.$purc_act_no);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$purc_act_rev, MST_AP_D_R.$purc_act_rev);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$purc_act_d_no, MST_AP_D_R.$purc_act_d_no);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$bp_dlv_slip_no, MST_AP_D_R.$bp_dlv_slip_no);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$bp_dlv_slip_d_no, MST_AP_D_R.$bp_dlv_slip_d_no);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$trd_cd, MST_AP_D_R.$trd_cd);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$slip_sts_typ, MST_AP_D_R.$slip_sts_typ);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$sppl_cd, MST_AP_D_R.$sppl_cd);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$asppl_cd, MST_AP_D_R.$asppl_cd);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$act_dt, MST_AP_D_R.$act_dt);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$itm_cd, MST_AP_D_R.$itm_cd);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$itm_sub1, MST_AP_D_R.$itm_sub1);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$itm_sub2, MST_AP_D_R.$itm_sub2);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$itm_sub3, MST_AP_D_R.$itm_sub3);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$itm_nm, MST_AP_D_R.$itm_nm);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$sundry_itm_flg, MST_AP_D_R.$sundry_itm_flg);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$sppl_itm_cd, MST_AP_D_R.$sppl_itm_cd);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$sppl_itm_nm, MST_AP_D_R.$sppl_itm_nm);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$trd_unit_cd, MST_AP_D_R.$trd_unit_cd);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$trd_unit_qty, MST_AP_D_R.$trd_unit_qty);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$tax_cd, MST_AP_D_R.$tax_cd);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$interim_flg, MST_AP_D_R.$interim_flg);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$trd_cur_upri, MST_AP_D_R.$trd_cur_upri);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$trd_cur_amt, MST_AP_D_R.$trd_cur_amt);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$trd_cur_tax_amt, MST_AP_D_R.$trd_cur_tax_amt);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$trd_cur_dscnt_amt, MST_AP_D_R.$trd_cur_dscnt_amt);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$base_cur_upri, MST_AP_D_R.$base_cur_upri);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$base_cur_amt, MST_AP_D_R.$base_cur_amt);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$base_cur_tax_amt, MST_AP_D_R.$base_cur_tax_amt);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$base_cur_dscnt_amt, MST_AP_D_R.$base_cur_dscnt_amt);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$pay_mtd_typ, MST_AP_D_R.$pay_mtd_typ);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$base_purc_ac_dt, MST_AP_D_R.$base_purc_ac_dt);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$pay_ntc_d_print_rmrks, MST_AP_D_R.$pay_ntc_d_print_rmrks);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$ap_d_sub_char1, MST_AP_D_R.$sub_char1);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$ap_d_sub_char2, MST_AP_D_R.$sub_char2);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$ap_d_sub_char3, MST_AP_D_R.$sub_char3);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.pay_ntc_d_his_no(getStrSeq(MSC_NUM_SYS_TYP.PAYNTCDHISNO));
			dest.pay_ntc_his_no(_payNtcHis.pay_ntc_his_no());
			dest.pay_ntc_d_his_typ(MAC_PAY_NTC_D_HIS_TYP.AP_D.value());
		}
	}
	
	// 支払通知書明細履歴（支払実績明細）設定用Mapper
	protected Map_MST_PAY_NTC_D_HIS_R_MST_PAY_ACT_D_R<MST_PAY_NTC_D_HIS_R,MST_PAY_ACT_D_R, MST_PAY_NTC_HIS_R> createMap_MST_PAY_NTC_D_HIS_R_MST_PAY_ACT_D_R() {
		return new Map_MST_PAY_NTC_D_HIS_R_MST_PAY_ACT_D_R<MST_PAY_NTC_D_HIS_R, MST_PAY_ACT_D_R, MST_PAY_NTC_HIS_R>();
	}
	public class Map_MST_PAY_NTC_D_HIS_R_MST_PAY_ACT_D_R<D extends MST_PAY_NTC_D_HIS_R, S extends MST_PAY_ACT_D_R, W extends MST_PAY_NTC_HIS_R> extends MAUCC_RowMapperWith<D,S,W>{
		
		protected W _payNtcHis;
		
		@Override
		public void setWith(W _payNtcHis) {
			this._payNtcHis = _payNtcHis;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$pay_act_no, MST_PAY_ACT_D_R.$pay_act_no);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$pay_act_seq, MST_PAY_ACT_D_R.$pay_act_seq);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$pay_act_d_no, MST_PAY_ACT_D_R.$pay_act_d_no);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$pay_act_d_seq, MST_PAY_ACT_D_R.$pay_act_d_seq);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$slip_sts_typ, MST_PAY_ACT_R.$slip_sts_typ);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$pay_act_dt, MST_PAY_ACT_R.$pay_act_dt);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$pay_ntc_d_print_rmrks, MST_PAY_ACT_D_R.$pay_ntc_d_print_rmrks);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$ap_sttl_cd, MST_PAY_ACT_D_R.$ap_sttl_cd);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$pay_act_d_sub_char1, MST_PAY_ACT_D_R.$sub_char1);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$pay_act_d_sub_char2, MST_PAY_ACT_D_R.$sub_char2);
			addColumnPathMap(MST_PAY_NTC_D_HIS_R.$pay_act_d_sub_char3, MST_PAY_ACT_D_R.$sub_char3);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.pay_ntc_d_his_no(getStrSeq(MSC_NUM_SYS_TYP.PAYNTCDHISNO));
			dest.pay_ntc_his_no(_payNtcHis.pay_ntc_his_no());
			dest.pay_ntc_d_his_typ(MAC_PAY_NTC_D_HIS_TYP.PAY_ACT_D.value());
			if (MAC_AP_STTL_TYP.isSETOFF(src.ap_sttl_typ())) {
				if (src.getBooleanNE(MAM_STTL_R.$bill_tax_disp_flg)) {
					dest.tax_cd(src.trd_cur_com_paid_tax_cd());
					dest.trd_cur_amt(getTrdCurSetoffAmtExcludingTax(src));
					dest.trd_cur_tax_amt(src.trd_cur_com_paid_tax_amt());
					dest.base_cur_amt(getBaseSetoffCurAmtExcludingTax(src));
					dest.base_cur_tax_amt(src.base_cur_com_paid_tax_amt());
				}
				else {
					dest.trd_cur_amt(getTrdCurSetoffAmtExcludingTax(src).add(nvl(src.trd_cur_com_paid_tax_amt(), MCNumber.ZERO)));
					dest.base_cur_amt(getBaseSetoffCurAmtExcludingTax(src).add(nvl(src.base_cur_com_paid_tax_amt(), MCNumber.ZERO)));
				}
			}
			else if (MAC_AP_STTL_TYP.isACNT_COM_PAID(src.ap_sttl_typ())
					|| MAC_AP_STTL_TYP.isCASH_COM_PAID(src.ap_sttl_typ())) {
				dest.tax_cd(src.trd_cur_com_paid_tax_cd());
				dest.trd_cur_amt(src.trd_cur_exc_com_paid());
				dest.trd_cur_tax_amt(src.trd_cur_com_paid_tax_amt());
				dest.base_cur_amt(src.base_cur_exc_com_paid());
				dest.base_cur_tax_amt(src.base_cur_com_paid_tax_amt());
			}
			else {
				dest.trd_cur_amt(src.trd_cur_amt());
				dest.base_cur_amt(src.base_cur_amt());
			}
		}
	}
	
	protected MCNumber getTrdCurSetoffAmtExcludingTax(MST_PAY_ACT_D_R payActDR) {
		return nvl(payActDR.trd_cur_exc_com_paid(), nvl(payActDR.trd_cur_amt(), MCNumber.ZERO));
	}

	protected MCNumber getBaseSetoffCurAmtExcludingTax(MST_PAY_ACT_D_R payActDR) {
		return nvl(payActDR.base_cur_exc_com_paid(), nvl(payActDR.base_cur_amt(), MCNumber.ZERO));
	}


	/**
	 * 金額を反転させる
	 * ※チェック時は反転させる
	 * ※チェック終了時に上り電文の状態に戻す
	 */
	/**
	 * 金額の符号を反転させるクラス
	 * ※買掛明細の金額はチェック時は反転させる
	 * ※またチェック終了時に上り電文の状態に戻す
	 */
	public class InverNum<E extends PaySchd_DtlApdR> {
		protected final String COL = "col";
		protected final String NUM = "num";
		protected MCList<E> _saveList;
		protected Map<MCNumber, MCList<MCRow>> _saveNum = new HashMap<>();
		/**
		 * 金額を反転させる
		 */
		protected void invert(MCList<E> list, String... cols) {
			_saveList = list.shallowClone();
			_saveNum.clear();
			list.forEach(row -> {
				for (String col : cols) {
					if (row.getMeta(col).type() != MCDataType.NUMBER) {
						continue;
					}
					MCNumber num = row.getNumber(col);
					if (!isNull(num)) {
						save(row, col, num);
						row.setNumber(col, num.multiply(row.amt_disp_pm()));
					}
				};
			});
		}
		/**
		 * 直前に反転させて項目の値を戻す
		 */
		protected void invert() {
			_saveList.forEach(row -> {
				if (_saveNum.containsKey(row.peg_no())) {
					_saveNum.get(row.peg_no()).forEach(r -> {
						row.setNumber(r.getString(COL), r.getNumber(NUM));
					});
				}
			});
			_saveList.clear();
			_saveNum.clear();
		}
		/**
		 * 反転させた項目を保存する
		 */
		protected void save(E row, String col, MCNumber num) {
			if (!_saveNum.containsKey(row.peg_no())) {
				_saveNum.put(row.peg_no(), MCList.create(MCRow.class));
			}
			MCList<MCRow> saveList = _saveNum.get(row.peg_no());
			MCRow r = saveList.add();
			r.setStringNE(COL, col);
			r.setNumberNE(NUM, num);
		}
		/**
		 * 買掛明細ＮＯをもとに金額符号を設定する
		 */
		protected void setPm(MCList<PaySchd_DtlApdR> apDL) {
			MSW_AP_D_KEY_R w = MSW_AP_D_KEY_R.create("W");
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");

			MCList<MST_AP_D_R> dbc = MCList.create(MST_AP_D_R.class);
			apDL.forEach(r -> {
				dbc.add().ap_d_no(nvl(r.ap_d_no(), r.ref_ap_d_no()));
			});
			MST_AP_D_R t = MST_AP_D_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbWkDelete("MSBHL5030_MSW_AP_D_D10", dbc_bldr.getBaseDbc());
			dbWkInsert("MSBHL5030_MSW_AP_D_I06", dbc.groupBy(dbc.createRow().getKeyColumn()), dbc_bldr.getBaseDbc());

			dbc.init();
			dbc_bldr = MCQueryApiBuilder.create(t);
			dbc.addBooleanColumn("dscnt_itm_flg");
			dbc_bldr.setSelect(
					t.ap_d_no,
					t.purc_act_d_no,
					t.rcpt_iv_mng_no,
					t.rcpt_iv_no,
					t.chk_flg,
					m1.dscnt_itm_flg);
			dbc_bldr.addInnerJoin(w, bracket(w.ap_d_no.eq(t.ap_d_no)));
			dbc_bldr.addLeftOuterJoin(m1,
					bracket(m1.itm_cd.eq(t.itm_cd)
							.and(m1.itm_sub1.eq(t.itm_sub1))
							.and(m1.itm_sub2.eq(t.itm_sub2))
							.and(m1.itm_sub3.eq(t.itm_sub3))));
			dbSelect("MSBHL5030_MST_AP_D_S11", dbc, dbc_bldr);
			dbWkDelete("MSBHL5030_MSW_AP_D_D11", dbc_bldr.getBaseDbc());
			
			MCIndexKey idx = dbc.createIndex(MST_AP_D_R.$ap_d_no);
			for (PaySchd_DtlApdR apDR : apDL) {
				MST_AP_D_R dbcR = dbc.getFirst(idx, nvl(apDR.ap_d_no(), apDR.ref_ap_d_no()));
				apDR.amt_disp_pm(
					getAmtDispPm(apDR.trd_ptn_typ(), dbcR.getBoolean("dscnt_itm_flg"))
				);
				apDR.ap_d().purc_act_d_no(dbcR.purc_act_d_no());
				apDR.ap_d().rcpt_iv_mng_no(dbcR.rcpt_iv_mng_no());
				apDR.ap_d().rcpt_iv_no(dbcR.rcpt_iv_no());
				apDR.ap_d().chk_flg(dbcR.chk_flg());
			}
		}
	}
	/**
	 * PaySchd_Srch07オペレーション.<p>
	 *
	 * 支払照合可能な支払実績明細を検索する。<br>
	 */
	public class PaySchd_Srch07 extends MSBHL_PaySchdRegService_MC_A.PaySchd_Srch07 {
		MCList<PaySchd_Srch07_CndR> _cndL = null;
		MCList<PaySchd_Srch07_RsltR> _rsltL = MCList.create(PaySchd_Srch07_RsltR.class);
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			setCnd();
			srch();
			setDown();
		}
		/**
		 * 検索条件を編集する
		 */
		protected void setCnd() {
			_cndL = MCList.create(PaySchd_Srch07_CndR.class);
			MCGroupByPolicy policy = new MCGroupByPolicy(
					PaySchd_Srch07_CndR.$pay_chk_mng_no,
					PaySchd_Srch07_CndR.$bsppl_cd,
					PaySchd_Srch07_CndR.$bsppl_dpt_cd,
					PaySchd_Srch07_CndR.$trd_cur_cd,
					PaySchd_Srch07_CndR.$reg_only_flg
				);
			// キーが重複する場合、最大の締日を検索条件にする
			policy.max(PaySchd_Srch07_CndR.$bsppl_cl_dt);
			for (PaySchd_Srch07_CndR r : up0().subList(r -> !r.pay_spot_flg()).groupBy(policy)) {
				if (r.reg_only_flg()) {
					r.bsppl_cl_dt(null);
				}
				_cndL.add(r);
			}
		}
		/**
		 * 支払実績を検索する
		 */
		protected void srch() {
			MCList<PaySchd_Srch07_RsltR> rsltL = MCList.create(PaySchd_Srch07_RsltR.class);
			executeQuery(rsltL, MSBHL5030_MST_PAY_ACT_D_S01(), _cndL);
			setPegNo(rsltL);
		}
		protected void setPegNo(MCList<PaySchd_Srch07_RsltR> rsltL) {
			MCIndexKey idx1 = rsltL.createIndex(
					PaySchd_Srch07_RsltR.$calc_tgt_pay_chk_mng_no
			);
			MCIndexKey idx2 = rsltL.createIndex(
					PaySchd_Srch07_RsltR.$bsppl_cd,
					PaySchd_Srch07_RsltR.$bsppl_dpt_cd,
					PaySchd_Srch07_RsltR.$trd_cur_cd
			);
			for (PaySchd_Srch07_CndR cndR : up0().subList(r -> !r.pay_spot_flg())) {
				MCList<PaySchd_Srch07_RsltR> wkL = MCList.create(PaySchd_Srch07_RsltR.class);
				if (cndR.reg_only_flg()) {
					wkL.addAll(rsltL.subList(idx1, cndR.pay_chk_mng_no()).clone());
				}
				else {
					MCList<PaySchd_Srch07_RsltR> keyL = rsltL.subList(idx2, cndR.bsppl_cd(), cndR.bsppl_dpt_cd(), cndR.trd_cur_cd());
					for (PaySchd_Srch07_RsltR r : keyL) {
						if (!isNull(r.calc_tgt_pay_chk_mng_no()) && !isSame(r.calc_tgt_pay_chk_mng_no(), cndR.pay_chk_mng_no())) {
							continue;
						}
						if (!isNull(cndR.bsppl_cl_dt()) && cndR.bsppl_cl_dt().lt(r.pay_basis_dt())) {
							continue;
						}
						wkL.add(r.clone());
					}
				}
				if (wkL.size() > 0) {
					wkL.setNumberNE(PaySchd_Srch07_RsltR.$hdr_peg_no, cndR.hdr_peg_no());
				}
				_rsltL.addAll(wkL);
			}
		}
		protected void setDown() {
			down0().setAll(_rsltL);
		}
	}
	/**
	 * PaySchd_Srch08オペレーション.<p>
	 *
	 * 支払照合可能な前渡金実績を検索する。<br>
	 */
	public class PaySchd_Srch08 extends MSBHL_PaySchdRegService_MC_A.PaySchd_Srch08 {
		MCList<PaySchd_Srch07_CndR> _cndL = null;
		MCList<PaySchd_Srch08_RsltR> _rsltL = MCList.create(PaySchd_Srch08_RsltR.class);
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			setCnd();
			srch();
			setDown();
		}
		/**
		 * 上り電文を編集する
		 */
		protected void setCnd() {
			_cndL = MCList.create(PaySchd_Srch07_CndR.class);
			for (PaySchd_Srch07_CndR r : up0().subList(r -> !r.pay_spot_flg())) {
				if (r.reg_only_flg()) {
					r.bsppl_cl_dt(null);
				}
				_cndL.add(r);
			}
		}
		/**
		 * 前渡金実績を検索する
		 */
		protected void srch() {
			MCList<PaySchd_Srch08_RsltR> rsltL = MCList.create(PaySchd_Srch08_RsltR.class);
			executeQuery(rsltL, MSBHL5030_MST_ADV_PAY_ACT_S01(), _cndL);
			setPegNo(rsltL);
		}
		protected void setPegNo(MCList<PaySchd_Srch08_RsltR> rsltL) {
			MCIndexKey idx1 = rsltL.createIndex(
					PaySchd_Srch08_RsltR.$pay_chk_mng_no
			);
			MCIndexKey idx2 = rsltL.createIndex(
					PaySchd_Srch08_RsltR.$bsppl_cd,
					PaySchd_Srch08_RsltR.$bsppl_dpt_cd,
					PaySchd_Srch08_RsltR.$trd_cur_cd
			);
			for (PaySchd_Srch07_CndR cndR : up0().subList(r -> !r.pay_spot_flg())) {
				MCList<PaySchd_Srch08_RsltR> wkL = MCList.create(PaySchd_Srch08_RsltR.class);
				if (cndR.reg_only_flg()) {
					wkL.addAll(rsltL.subList(idx1, cndR.pay_chk_mng_no()).clone());
				}
				else {
					MCList<PaySchd_Srch08_RsltR> keyL = rsltL.subList(idx2, cndR.bsppl_cd(), cndR.bsppl_dpt_cd(), cndR.trd_cur_cd());
					wkL.addAll(keyL.subList(r -> isNull(r.pay_chk_mng_no()) || isSame(r.pay_chk_mng_no(), cndR.pay_chk_mng_no())).clone());
				}
				if (wkL.size() > 0) {
					wkL.setNumberNE(PaySchd_Srch07_RsltR.$hdr_peg_no, cndR.hdr_peg_no());
				}
				_rsltL.addAll(wkL);
			}
		}
		protected void setDown() {
			down0().setAll(_rsltL);
		}
	}
	protected FXUCL_MCDbcCache<MAM_STTL_R> _cacheSttl = null;
	protected void initCache() {
		initSttlCache();
	}
	protected MAM_STTL_R getSttlCache(String sttlCd) {
		return _cacheSttl.get(sttlCd);
	}
	protected void initSttlCache() {
		_cacheSttl = null;
		_cacheSttl = new FXUCL_MCDbcCache<MAM_STTL_R>(MCQueryApiBuilder.create(MAM_STTL_R.create("T")));
	}
	protected void setBillTaxDispFlg(MCList<?> tgtL) {
		for (MCRow tgtR : tgtL) {
			String sttlCd = null;
			if (tgtR instanceof MST_PAY_ACT_D_R) {
				sttlCd = tgtR.getString(MST_PAY_ACT_D_R.$ap_sttl_cd);
			}
			else {
				sttlCd = tgtR.getString(MST_ADV_PAY_ACT_R.$com_paid_ap_sttl_cd);
			}
			MAM_STTL_R sttlR = getSttlCache(sttlCd);
			if (!isNull(sttlR)) {
				tgtR.addBooleanColumn(MAM_STTL_R.$bill_tax_disp_flg, sttlR.bill_tax_disp_flg());
			}
		}
	}

	//FMCB CUSTOM END
}